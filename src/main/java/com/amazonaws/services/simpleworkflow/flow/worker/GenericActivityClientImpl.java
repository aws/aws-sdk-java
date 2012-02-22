/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.ActivityTaskFailedException;
import com.amazonaws.services.simpleworkflow.flow.ActivityTaskTimedOutException;
import com.amazonaws.services.simpleworkflow.flow.ScheduleActivityTaskFailedException;
import com.amazonaws.services.simpleworkflow.flow.common.FlowHelpers;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTask;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCancellationHandler;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCompletionHandle;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.generic.ExecuteActivityParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskCanceledEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskCompletedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskFailedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskStartedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskTimedOutEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.HistoryEvent;
import com.amazonaws.services.simpleworkflow.model.ScheduleActivityTaskDecisionAttributes;
import com.amazonaws.services.simpleworkflow.model.ScheduleActivityTaskFailedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.TaskList;

class GenericActivityClientImpl implements GenericActivityClient {

    private final class ActivityCancellationHandler implements ExternalTaskCancellationHandler {

        private final String activityId;

        private final ExternalTaskCompletionHandle handle;

        private ActivityCancellationHandler(String activityId, ExternalTaskCompletionHandle handle) {
            this.activityId = activityId;
            this.handle = handle;
        }

        @Override
        public void handleCancellation(Throwable cause) {
            decisions.requestCancelActivityTask(activityId, new Runnable() {

                @Override
                public void run() {
                    OpenRequestInfo<String, ActivityType> scheduled = scheduledActivities.remove(activityId);
                    if (scheduled == null) {
                        throw new IllegalArgumentException("Activity \"" + activityId + "\" wasn't scheduled");
                    }
                    handle.complete();
                }
            });
        }
    }

    private final DecisionsHelper decisions;

    private final Map<String, OpenRequestInfo<String, ActivityType>> scheduledActivities = new HashMap<String, OpenRequestInfo<String, ActivityType>>();

    public GenericActivityClientImpl(DecisionsHelper decisions) {
        this.decisions = decisions;
    }

    @Override
    public Promise<String> scheduleActivityTask(final ExecuteActivityParameters parameters) {
        final OpenRequestInfo<String, ActivityType> context = new OpenRequestInfo<String, ActivityType>(
                parameters.getActivityType());
        final ScheduleActivityTaskDecisionAttributes attributes = new ScheduleActivityTaskDecisionAttributes();
        attributes.setActivityType(parameters.getActivityType());
        attributes.setInput(parameters.getInput());
        attributes.setHeartbeatTimeout(FlowHelpers.secondsToDuration(parameters.getHeartbeatTimeoutSeconds()));
        attributes.setScheduleToCloseTimeout(FlowHelpers.secondsToDuration(parameters.getScheduleToCloseTimeoutSeconds()));
        attributes.setScheduleToStartTimeout(FlowHelpers.secondsToDuration(parameters.getScheduleToStartTimeoutSeconds()));
        attributes.setStartToCloseTimeout(FlowHelpers.secondsToDuration(parameters.getStartToCloseTimeoutSeconds()));
        String activityId = parameters.getActivityId();
        if (activityId == null) {
            activityId = String.valueOf(decisions.getNextId());
        }
        attributes.setActivityId(activityId);

        String taskList = parameters.getTaskList();
        if (taskList != null && !taskList.isEmpty()) {
            attributes.setTaskList(new TaskList().withName(taskList));
        }
        String taskName = "activityId=" + activityId + ", activityType=" + attributes.getActivityType();
        new ExternalTask() {

            @Override
            protected ExternalTaskCancellationHandler doExecute(final ExternalTaskCompletionHandle handle) throws Throwable {

                decisions.scheduleActivityTask(attributes);
                context.setCompletionHandle(handle);
                scheduledActivities.put(attributes.getActivityId(), context);
                return new ActivityCancellationHandler(attributes.getActivityId(), handle);
            }
        }.setName(taskName);
        context.setResultDescription("scheduleActivityTask " + taskName);
        return context.getResult();
    }

    @Override
    public Promise<String> scheduleActivityTask(final String activity, final String version, final Promise<String> input) {
        final Settable<String> result = new Settable<String>();
        new Task(input) {

            @Override
            protected void doExecute() throws Throwable {
                result.chain(scheduleActivityTask(activity, version, input.get()));
            }
        };
        return result;
    }

    @Override
    public Promise<String> scheduleActivityTask(String activity, String version, String input) {
        ExecuteActivityParameters parameters = new ExecuteActivityParameters();
        parameters.setActivityType(new ActivityType().withName(activity).withVersion(version));
        parameters.setInput(input);
        return scheduleActivityTask(parameters);
    }

    void handleActivityTaskStarted(ActivityTaskStartedEventAttributes attributes) {
    }

    void handleActivityTaskCanceled(HistoryEvent event) {
        ActivityTaskCanceledEventAttributes attributes = event.getActivityTaskCanceledEventAttributes();
        String activityId = decisions.getActivityId(attributes);
        if (decisions.handleActivityTaskCanceled(event)) {
            CancellationException e = new CancellationException();
            OpenRequestInfo<String, ActivityType> scheduled = scheduledActivities.remove(activityId);
            if (scheduled != null) {
                ExternalTaskCompletionHandle completionHandle = scheduled.getCompletionHandle();
                // It is OK to fail with subclass of CancellationException when cancellation requested.
                // It allows passing information about cancellation (details in this case) to the surrounding doCatch block
                completionHandle.fail(e);
            }
        }
    }

    void handleScheduleActivityTaskFailed(HistoryEvent event) {
        ScheduleActivityTaskFailedEventAttributes attributes = event.getScheduleActivityTaskFailedEventAttributes();
        String activityId = attributes.getActivityId();
        OpenRequestInfo<String, ActivityType> scheduled = scheduledActivities.remove(activityId);
        if (decisions.handleScheduleActivityTaskFailed(event)) {
            String cause = attributes.getCause();
            ScheduleActivityTaskFailedException failure = new ScheduleActivityTaskFailedException(event.getEventId(),
                    attributes.getActivityType(), activityId, cause);
            ExternalTaskCompletionHandle completionHandle = scheduled.getCompletionHandle();
            completionHandle.fail(failure);
        }
    }

    void handleActivityTaskCompleted(HistoryEvent event) {
        ActivityTaskCompletedEventAttributes attributes = event.getActivityTaskCompletedEventAttributes();
        String activityId = decisions.getActivityId(attributes);
        if (decisions.handleActivityTaskClosed(activityId)) {
            OpenRequestInfo<String, ActivityType> scheduled = scheduledActivities.remove(activityId);
            if (scheduled != null) {
                String result = attributes.getResult();
                scheduled.getResult().set(result);
                ExternalTaskCompletionHandle completionHandle = scheduled.getCompletionHandle();
                completionHandle.complete();
            }
        }
    }

    void handleActivityTaskFailed(HistoryEvent event) {
        ActivityTaskFailedEventAttributes attributes = event.getActivityTaskFailedEventAttributes();
        String activityId = decisions.getActivityId(attributes);
        if (decisions.handleActivityTaskClosed(activityId)) {
            OpenRequestInfo<String, ActivityType> scheduled = scheduledActivities.remove(activityId);
            if (scheduled != null) {
                String reason = attributes.getReason();
                String details = attributes.getDetails();
                ActivityTaskFailedException failure = new ActivityTaskFailedException(event.getEventId(),
                        scheduled.getUserContext(), activityId, reason, details);
                ExternalTaskCompletionHandle completionHandle = scheduled.getCompletionHandle();
                completionHandle.fail(failure);
            }
        }
    }

    void handleActivityTaskTimedOut(HistoryEvent event) {
        ActivityTaskTimedOutEventAttributes attributes = event.getActivityTaskTimedOutEventAttributes();
        String activityId = decisions.getActivityId(attributes);
        if (decisions.handleActivityTaskClosed(activityId)) {
            OpenRequestInfo<String, ActivityType> scheduled = scheduledActivities.remove(activityId);
            if (scheduled != null) {
                String timeoutType = attributes.getTimeoutType();
                String details = attributes.getDetails();
                ActivityTaskTimedOutException failure = new ActivityTaskTimedOutException(event.getEventId(),
                        scheduled.getUserContext(), activityId, timeoutType, details);
                ExternalTaskCompletionHandle completionHandle = scheduled.getCompletionHandle();
                completionHandle.fail(failure);
            }
        }
    }

}
