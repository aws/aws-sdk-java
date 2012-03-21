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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.ChildWorkflowFailedException;
import com.amazonaws.services.simpleworkflow.flow.ChildWorkflowTerminatedException;
import com.amazonaws.services.simpleworkflow.flow.ChildWorkflowTimedOutException;
import com.amazonaws.services.simpleworkflow.flow.SignalExternalWorkflowException;
import com.amazonaws.services.simpleworkflow.flow.StartChildWorkflowFailedException;
import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.common.FlowHelpers;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTask;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCancellationHandler;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCompletionHandle;
import com.amazonaws.services.simpleworkflow.flow.core.Functor;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowReply;
import com.amazonaws.services.simpleworkflow.model.ChildWorkflowExecutionCanceledEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ChildWorkflowExecutionCompletedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ChildWorkflowExecutionFailedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ChildWorkflowExecutionStartedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ChildWorkflowExecutionTerminatedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ChildWorkflowExecutionTimedOutEventAttributes;
import com.amazonaws.services.simpleworkflow.model.ExternalWorkflowExecutionSignaledEventAttributes;
import com.amazonaws.services.simpleworkflow.model.HistoryEvent;
import com.amazonaws.services.simpleworkflow.model.RequestCancelExternalWorkflowExecutionDecisionAttributes;
import com.amazonaws.services.simpleworkflow.model.SignalExternalWorkflowExecutionDecisionAttributes;
import com.amazonaws.services.simpleworkflow.model.SignalExternalWorkflowExecutionFailedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.StartChildWorkflowExecutionDecisionAttributes;
import com.amazonaws.services.simpleworkflow.model.StartChildWorkflowExecutionFailedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.TaskList;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class GenericWorkflowClientImpl implements GenericWorkflowClient {

    private static class StartChildWorkflowReplyImpl implements StartChildWorkflowReply {

        private String runId;

        private final Settable<String> result = new Settable<String>();

        public StartChildWorkflowReplyImpl(String runId, String description) {
            this.runId = runId;
            result.setDescription(description);
        }

        @Override
        public String getRunId() {
            return runId;
        }

        @Override
        public Promise<String> getResult() {
            return result;
        }

        public void setResult(String value) {
            result.set(value);
        }

    }

    private final class ChildWorkflowCancellationHandler implements ExternalTaskCancellationHandler {

        private final String workflowId;

        private final ExternalTaskCompletionHandle handle;

        private ChildWorkflowCancellationHandler(String workflowId, ExternalTaskCompletionHandle handle) {
            this.workflowId = workflowId;
            this.handle = handle;
        }

        @Override
        public void handleCancellation(Throwable cause) {
            RequestCancelExternalWorkflowExecutionDecisionAttributes cancelAttributes = new RequestCancelExternalWorkflowExecutionDecisionAttributes();
            cancelAttributes.setWorkflowId(workflowId);

            decisions.requestCancelExternalWorkflowExecution(true, cancelAttributes, new Runnable() {

                @Override
                public void run() {
                    OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
                    if (scheduled == null) {
                        throw new IllegalArgumentException("Workflow \"" + workflowId + "\" wasn't scheduled");
                    }
                    handle.complete();
                }
            });
        }
    }

    private final DecisionsHelper decisions;

    private final WorkflowContext workflowContext;

    private final Map<String, OpenRequestInfo<StartChildWorkflowReply, WorkflowType>> scheduledExternalWorkflows = new HashMap<String, OpenRequestInfo<StartChildWorkflowReply, WorkflowType>>();

    private final Map<String, OpenRequestInfo<Void, Void>> scheduledSignals = new HashMap<String, OpenRequestInfo<Void, Void>>();

    GenericWorkflowClientImpl(DecisionsHelper decisions, WorkflowContext workflowContext) {
        this.decisions = decisions;
        this.workflowContext = workflowContext;
    }

    @Override
    public Promise<StartChildWorkflowReply> startChildWorkflow(final StartChildWorkflowExecutionParameters parameters) {
        final OpenRequestInfo<StartChildWorkflowReply, WorkflowType> context = new OpenRequestInfo<StartChildWorkflowReply, WorkflowType>();
        final StartChildWorkflowExecutionDecisionAttributes attributes = new StartChildWorkflowExecutionDecisionAttributes();
        attributes.setWorkflowType(parameters.getWorkflowType());
        String workflowId = parameters.getWorkflowId();
        if (workflowId == null) {
            workflowId = generateUniqueId();
        }
        attributes.setWorkflowId(workflowId);
        attributes.setInput(parameters.getInput());
        attributes.setExecutionStartToCloseTimeout(FlowHelpers.secondsToDuration(parameters.getExecutionStartToCloseTimeoutSeconds()));
        attributes.setTaskStartToCloseTimeout(FlowHelpers.secondsToDuration(parameters.getTaskStartToCloseTimeoutSeconds()));
        List<String> tagList = parameters.getTagList();
        if (tagList != null) {
            attributes.setTagList(tagList);
        }
        String taskList = parameters.getTaskList();
        if (taskList != null && !taskList.isEmpty()) {
            attributes.setTaskList(new TaskList().withName(taskList));
        }
        String taskName = "workflowId=" + workflowId + ", workflowType=" + attributes.getWorkflowType();
        new ExternalTask() {

            @Override
            protected ExternalTaskCancellationHandler doExecute(final ExternalTaskCompletionHandle handle) throws Throwable {
                decisions.startChildWorkflowExecution(attributes);
                context.setCompletionHandle(handle);
                scheduledExternalWorkflows.put(attributes.getWorkflowId(), context);
                return new ChildWorkflowCancellationHandler(attributes.getWorkflowId(), handle);
            }
        }.setName(taskName);
        context.setResultDescription("startChildWorkflow " + taskName);
        return context.getResult();
    }

    @Override
    public Promise<String> startChildWorkflow(String workflow, String version, String input) {
        StartChildWorkflowExecutionParameters parameters = new StartChildWorkflowExecutionParameters();
        parameters.setWorkflowType(new WorkflowType().withName(workflow).withVersion(version));
        parameters.setInput(input);
        final Promise<StartChildWorkflowReply> started = startChildWorkflow(parameters);
        return new Functor<String>(started) {

            @Override
            protected Promise<String> doExecute() throws Throwable {
                return started.get().getResult();
            }
        };
    }

    @Override
    public Promise<String> startChildWorkflow(final String workflow, final String version, final Promise<String> input) {
        final Settable<String> result = new Settable<String>();

        new Task(input) {

            @Override
            protected void doExecute() throws Throwable {
                result.chain(startChildWorkflow(workflow, version, input.get()));
            }
        };
        return result;
    }

    @Override
    public Promise<Void> signalWorkflowExecution(final SignalExternalWorkflowParameters parameters) {
        final OpenRequestInfo<Void, Void> context = new OpenRequestInfo<Void, Void>();
        final SignalExternalWorkflowExecutionDecisionAttributes attributes = new SignalExternalWorkflowExecutionDecisionAttributes();
        String signalId = decisions.getNextId();
        attributes.setControl(signalId);
        attributes.setSignalName(parameters.getSignalName());
        attributes.setInput(parameters.getInput());
        attributes.setRunId(parameters.getRunId());
        attributes.setWorkflowId(parameters.getWorkflowId());
        String taskName = "signalId=" + signalId + ", workflowId=" + parameters.getWorkflowId() + ", workflowRunId="
                + parameters.getRunId();
        new ExternalTask() {

            @Override
            protected ExternalTaskCancellationHandler doExecute(final ExternalTaskCompletionHandle handle) throws Throwable {

                decisions.signalExternalWorkflowExecution(attributes);
                context.setCompletionHandle(handle);
                final String finalSignalId = attributes.getControl();
                scheduledSignals.put(finalSignalId, context);
                return new ExternalTaskCancellationHandler() {

                    @Override
                    public void handleCancellation(Throwable cause) {
                        decisions.cancelSignalExternalWorkflowExecution(finalSignalId, null);
                        OpenRequestInfo<Void, Void> scheduled = scheduledSignals.remove(finalSignalId);
                        if (scheduled == null) {
                            throw new IllegalArgumentException("Signal \"" + finalSignalId + "\" wasn't scheduled");
                        }
                        handle.complete();
                    }
                };
            }
        }.setName(taskName);
        context.setResultDescription("signalWorkflowExecution " + taskName);
        return context.getResult();
    }

    @Override
    public void requestCancelWorkflowExecution(WorkflowExecution execution) {
        RequestCancelExternalWorkflowExecutionDecisionAttributes attributes = new RequestCancelExternalWorkflowExecutionDecisionAttributes();
        String workflowId = execution.getWorkflowId();
        attributes.setWorkflowId(workflowId);
        attributes.setRunId(execution.getRunId());
        boolean childWorkflow = scheduledExternalWorkflows.containsKey(workflowId);
        // TODO: See if immediate cancellation needed
        decisions.requestCancelExternalWorkflowExecution(childWorkflow, attributes, null);
    }

    @Override
    public void continueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters continueParameters) {
        // TODO: add validation to check if continueAsNew is not set 
        workflowContext.setContinueAsNewOnCompletion(continueParameters);
    }

    @Override
    public String generateUniqueId() {
        WorkflowExecution workflowExecution = workflowContext.getWorkflowExecution();
        String runId = workflowExecution.getRunId();
        return runId + ":" + decisions.getNextId();
    }

    public void handleChildWorkflowExecutionCancelRequested(HistoryEvent event) {
        decisions.handleChildWorkflowExecutionCancelRequested(event);
    }

    void handleChildWorkflowExecutionCanceled(HistoryEvent event) {
        ChildWorkflowExecutionCanceledEventAttributes attributes = event.getChildWorkflowExecutionCanceledEventAttributes();
        WorkflowExecution execution = attributes.getWorkflowExecution();
        String workflowId = execution.getWorkflowId();
        if (decisions.handleChildWorkflowExecutionCanceled(workflowId)) {
            OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
            if (scheduled != null) {
                CancellationException e = new CancellationException();
                ExternalTaskCompletionHandle completionHandle = scheduled.getCompletionHandle();
                // It is OK to fail with subclass of CancellationException when cancellation requested.
                // It allows passing information about cancellation (details in this case) to the surrounding doCatch block
                completionHandle.fail(e);
            }
        }
    }

    void handleChildWorkflowExecutionStarted(HistoryEvent event) {
        ChildWorkflowExecutionStartedEventAttributes attributes = event.getChildWorkflowExecutionStartedEventAttributes();
        WorkflowExecution execution = attributes.getWorkflowExecution();
        String workflowId = execution.getWorkflowId();
        decisions.handleChildWorkflowExecutionStarted(event);
        OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.get(workflowId);
        if (scheduled != null) {
            String runId = attributes.getWorkflowExecution().getRunId();
            Settable<StartChildWorkflowReply> result = scheduled.getResult();
            if (!result.isReady()) {
                String description = "startChildWorkflow workflowId=" + workflowId + ", runId=" + runId;
                result.set(new StartChildWorkflowReplyImpl(runId, description));
            }
        }
    }

    void handleChildWorkflowExecutionTimedOut(HistoryEvent event) {
        ChildWorkflowExecutionTimedOutEventAttributes attributes = event.getChildWorkflowExecutionTimedOutEventAttributes();
        WorkflowExecution execution = attributes.getWorkflowExecution();
        String workflowId = execution.getWorkflowId();
        if (decisions.handleChildWorkflowExecutionClosed(workflowId)) {
            OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
            if (scheduled != null) {
                Exception failure = new ChildWorkflowTimedOutException(event.getEventId(), execution,
                        attributes.getWorkflowType());
                ExternalTaskCompletionHandle context = scheduled.getCompletionHandle();
                context.fail(failure);
            }
        }
    }

    void handleChildWorkflowExecutionTerminated(HistoryEvent event) {
        ChildWorkflowExecutionTerminatedEventAttributes attributes = event.getChildWorkflowExecutionTerminatedEventAttributes();
        WorkflowExecution execution = attributes.getWorkflowExecution();
        String workflowId = execution.getWorkflowId();
        if (decisions.handleChildWorkflowExecutionClosed(workflowId)) {
            OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
            if (scheduled != null) {
                Exception failure = new ChildWorkflowTerminatedException(event.getEventId(), execution,
                        attributes.getWorkflowType());
                ExternalTaskCompletionHandle context = scheduled.getCompletionHandle();
                context.fail(failure);
            }
        }
    }

    void handleStartChildWorkflowExecutionFailed(HistoryEvent event) {
        StartChildWorkflowExecutionFailedEventAttributes attributes = event.getStartChildWorkflowExecutionFailedEventAttributes();
        String workflowId = attributes.getWorkflowId();
        if (decisions.handleStartChildWorkflowExecutionFailed(event)) {
            OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
            if (scheduled != null) {
                WorkflowExecution workflowExecution = new WorkflowExecution();
                workflowExecution.setWorkflowId(workflowId);
                WorkflowType workflowType = attributes.getWorkflowType();
                String cause = attributes.getCause();
                Exception failure = new StartChildWorkflowFailedException(event.getEventId(), workflowExecution, workflowType,
                        cause);
                ExternalTaskCompletionHandle context = scheduled.getCompletionHandle();
                context.fail(failure);
            }
        }
    }

    void handleChildWorkflowExecutionFailed(HistoryEvent event) {
        ChildWorkflowExecutionFailedEventAttributes attributes = event.getChildWorkflowExecutionFailedEventAttributes();
        WorkflowExecution execution = attributes.getWorkflowExecution();
        String workflowId = execution.getWorkflowId();
        if (decisions.handleChildWorkflowExecutionClosed(workflowId)) {
            OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
            if (scheduled != null) {
                String reason = attributes.getReason();
                String details = attributes.getDetails();
                Exception failure = new ChildWorkflowFailedException(event.getEventId(), execution, attributes.getWorkflowType(),
                        reason, details);
                ExternalTaskCompletionHandle context = scheduled.getCompletionHandle();
                context.fail(failure);
            }
        }
    }

    void handleChildWorkflowExecutionCompleted(HistoryEvent event) {
        ChildWorkflowExecutionCompletedEventAttributes attributes = event.getChildWorkflowExecutionCompletedEventAttributes();
        WorkflowExecution execution = attributes.getWorkflowExecution();
        String workflowId = execution.getWorkflowId();
        if (decisions.handleChildWorkflowExecutionClosed(workflowId)) {
            OpenRequestInfo<StartChildWorkflowReply, WorkflowType> scheduled = scheduledExternalWorkflows.remove(workflowId);
            if (scheduled != null) {
                ExternalTaskCompletionHandle context = scheduled.getCompletionHandle();
                String result = attributes.getResult();
                StartChildWorkflowReplyImpl startedReply = (StartChildWorkflowReplyImpl) scheduled.getResult().get();
                startedReply.setResult(result);
                context.complete();
            }
        }
    }

    void handleSignalExternalWorkflowExecutionFailed(HistoryEvent event) {
        SignalExternalWorkflowExecutionFailedEventAttributes attributes = event.getSignalExternalWorkflowExecutionFailedEventAttributes();
        String signalId = attributes.getControl();
        if (decisions.handleSignalExternalWorkflowExecutionFailed(signalId)) {
            OpenRequestInfo<Void, Void> signalContextAndResult = scheduledSignals.remove(signalId);
            if (signalContextAndResult != null) {
                WorkflowExecution signaledExecution = new WorkflowExecution();
                signaledExecution.setWorkflowId(attributes.getWorkflowId());
                signaledExecution.setRunId(attributes.getRunId());
                Throwable failure = new SignalExternalWorkflowException(event.getEventId(), signaledExecution,
                        attributes.getCause());
                signalContextAndResult.getCompletionHandle().fail(failure);
            }
        }
    }

    void handleExternalWorkflowExecutionSignaled(HistoryEvent event) {
        ExternalWorkflowExecutionSignaledEventAttributes attributes = event.getExternalWorkflowExecutionSignaledEventAttributes();
        String signalId = decisions.getSignalIdFromExternalWorkflowExecutionSignaled(attributes.getInitiatedEventId());
        if (decisions.handleExternalWorkflowExecutionSignaled(signalId)) {
            OpenRequestInfo<Void, Void> signalContextAndResult = scheduledSignals.remove(signalId);
            if (signalContextAndResult != null) {
                signalContextAndResult.getResult().set(null);
                signalContextAndResult.getCompletionHandle().complete();
            }
        }
    }

}
