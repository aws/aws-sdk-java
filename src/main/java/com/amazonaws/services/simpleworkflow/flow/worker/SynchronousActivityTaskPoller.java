/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContext;
import com.amazonaws.services.simpleworkflow.flow.ActivityFailureException;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;
import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementationFactory;
import com.amazonaws.services.simpleworkflow.model.ActivityTask;
import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.PollForActivityTaskRequest;
import com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest;
import com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest;
import com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest;
import com.amazonaws.services.simpleworkflow.model.TaskList;
import com.amazonaws.services.simpleworkflow.model.UnknownResourceException;

public class SynchronousActivityTaskPoller implements TaskPoller {

    private static final Log log = LogFactory.getLog(SynchronousActivityTaskPoller.class);

    private AmazonSimpleWorkflow service;

    private String domain;

    private String taskListToPoll;

    private ActivityImplementationFactory activityImplementationFactory;

    private String identity;

    private SynchronousRetrier reportCompletionRetrier;

    private SynchronousRetrier reportFailureRetrier;

    private boolean initialized;

    public SynchronousActivityTaskPoller(AmazonSimpleWorkflow service, String domain, String taskListToPoll,
            ActivityImplementationFactory activityImplementationFactory) {
        this();
        this.service = service;
        this.domain = domain;
        this.taskListToPoll = taskListToPoll;
        this.activityImplementationFactory = activityImplementationFactory;
        setReportCompletionRetryParameters(new ExponentialRetryParameters());
        setReportFailureRetryParameters(new ExponentialRetryParameters());
    }

    public SynchronousActivityTaskPoller() {
        identity = ManagementFactory.getRuntimeMXBean().getName();
        int length = Math.min(identity.length(), GenericWorker.MAX_IDENTITY_LENGTH);
        identity = identity.substring(0, length);
    }

    public AmazonSimpleWorkflow getService() {
        return service;
    }

    public void setService(AmazonSimpleWorkflow service) {
        this.service = service;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPollTaskList() {
        return taskListToPoll;
    }

    public void setTaskListToPoll(String taskList) {
        this.taskListToPoll = taskList;
    }

    public ActivityImplementationFactory getActivityImplementationFactory() {
        return activityImplementationFactory;
    }

    public void setActivityImplementationFactory(ActivityImplementationFactory activityImplementationFactory) {
        this.activityImplementationFactory = activityImplementationFactory;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public ExponentialRetryParameters getReportCompletionRetryParameters() {
        return reportCompletionRetrier.getRetryParameters();
    }

    public void setReportCompletionRetryParameters(ExponentialRetryParameters reportCompletionRetryParameters) {
        this.reportCompletionRetrier = new SynchronousRetrier(reportCompletionRetryParameters, UnknownResourceException.class);
    }

    public ExponentialRetryParameters getReportFailureRetryParameters() {
        return reportFailureRetrier.getRetryParameters();
    }

    public void setReportFailureRetryParameters(ExponentialRetryParameters reportFailureRetryParameters) {
        this.reportFailureRetrier = new SynchronousRetrier(reportFailureRetryParameters, UnknownResourceException.class);
    }

    public String getTaskListToPoll() {
        return taskListToPoll;
    }

    /**
     * Poll for a task using {@link #getPollTimeoutInSeconds()}
     * 
     * @return null if poll timed out
     */
    public ActivityTask poll() {
        if (!initialized) {
            checkRequiredProperty(service, "service");
            checkRequiredProperty(domain, "domain");
            checkRequiredProperty(taskListToPoll, "taskListToPoll");
            initialized = true;
        }

        PollForActivityTaskRequest pollRequest = new PollForActivityTaskRequest();
        pollRequest.setDomain(domain);
        pollRequest.setIdentity(identity);
        pollRequest.setTaskList(new TaskList().withName(taskListToPoll));
        if (log.isDebugEnabled()) {
            log.debug("poll request begin: " + pollRequest);
        }
        ActivityTask result = service.pollForActivityTask(pollRequest);
        if (result == null || result.getTaskToken() == null) {
            if (log.isDebugEnabled()) {
                log.debug("poll request returned no task");
            }
            return null;
        }
        if (log.isTraceEnabled()) {
            log.trace("poll request returned " + result);
        }
        return result;
    }

    /**
     * Poll for a activity task and execute correspondent implementation.
     * 
     * @return true if task was polled and decided upon, false if poll timed out
     * @throws Exception
     */
    @Override
    public boolean pollAndProcessSingleTask() throws Exception {
        ActivityTask task = poll();
        if (task == null) {
            return false;
        }
        execute(task);
        return true;
    }

    protected void execute(final ActivityTask task) throws Exception {
        String output = null;
        ActivityType activityType = task.getActivityType();
        try {
            ActivityExecutionContext context = new ActivityExecutionContextImpl(service, task);
            ActivityImplementation activityImplementation = activityImplementationFactory.getActivityImplementation(activityType);
            if (activityImplementation == null) {
                throw new ActivityFailureException("Unknown activity type: " + activityType);
            }
            output = activityImplementation.execute(context);
            if (!activityImplementation.getExecutionOptions().isManualActivityCompletion()) {
                respondActivityTaskCompletedWithRetry(task.getTaskToken(), output);
            }
        }
        catch (CancellationException e) {
            respondActivityTaskCanceledWithRetry(task.getTaskToken(), null);
            return;
        }
        catch (ActivityFailureException e) {
            if (log.isErrorEnabled()) {
                log.error("Failure processing activity task with taskId=" + task.getStartedEventId() + ", workflowGenerationId="
                        + task.getWorkflowExecution().getWorkflowId() + ", activity=" + activityType
                        + ", activityInstanceId=" + task.getActivityId(), e);
            }
            respondActivityTaskFailedWithRetry(task.getTaskToken(), e.getReason(), e.getDetails());
        }
        catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error("Failure processing activity task with taskId=" + task.getStartedEventId() + ", workflowGenerationId="
                        + task.getWorkflowExecution().getWorkflowId() + ", activity=" + activityType
                        + ", activityInstanceId=" + task.getActivityId(), e);
            }
            String reason = e.getMessage();
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String details = sw.toString();
            respondActivityTaskFailedWithRetry(task.getTaskToken(), reason, details);
        }
    }

    protected void respondActivityTaskFailedWithRetry(final String taskToken, final String reason, final String details) {
        if (reportFailureRetrier == null) {
            respondActivityTaskFailed(taskToken, reason, details);
        }
        else {
            reportFailureRetrier.retry(new Runnable() {

                @Override
                public void run() {
                    respondActivityTaskFailed(taskToken, reason, details);
                }
            });
        }
    }

    protected void respondActivityTaskFailed(String taskToken, String reason, String details) {
        RespondActivityTaskFailedRequest failedResponse = new RespondActivityTaskFailedRequest();
        failedResponse.setTaskToken(taskToken);
        failedResponse.setReason(reason);
        failedResponse.setDetails(details);
        service.respondActivityTaskFailed(failedResponse);
    }

    protected void respondActivityTaskCanceledWithRetry(final String taskToken, final String details) {
        if (reportFailureRetrier == null) {
            respondActivityTaskCanceled(taskToken, details);
        }
        else {
            reportFailureRetrier.retry(new Runnable() {

                @Override
                public void run() {
                    respondActivityTaskCanceled(taskToken, details);
                }
            });
        }
    }

    protected void respondActivityTaskCanceled(String taskToken, String details) {
        RespondActivityTaskCanceledRequest canceledResponse = new RespondActivityTaskCanceledRequest();
        canceledResponse.setTaskToken(taskToken);
        canceledResponse.setDetails(details);
        service.respondActivityTaskCanceled(canceledResponse);
    }

    protected void respondActivityTaskCompletedWithRetry(final String taskToken, final String output) {
        if (reportCompletionRetrier == null) {
            respondActivityTaskCompleted(taskToken, output);
        }
        else {
            reportCompletionRetrier.retry(new Runnable() {

                @Override
                public void run() {
                    respondActivityTaskCompleted(taskToken, output);
                }
            });
        }
    }

    protected void respondActivityTaskCompleted(String taskToken, String output) {
        RespondActivityTaskCompletedRequest completedReponse = new RespondActivityTaskCompletedRequest();
        completedReponse.setTaskToken(taskToken);
        completedReponse.setResult(output);
        service.respondActivityTaskCompleted(completedReponse);
    }

    protected void checkRequiredProperty(Object value, String name) {
        if (value == null) {
            throw new IllegalStateException("required property " + name + " is not set");
        }
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void shutdownNow() {
    }

    @Override
    public boolean awaitTermination(long left, TimeUnit milliseconds) throws InterruptedException {
        //TODO: Waiting for all currently running pollAndProcessSingleTask to complete 
        return true;
    }
}
