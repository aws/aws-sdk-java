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

import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.common.WorkflowExecutionUtils;
import com.amazonaws.services.simpleworkflow.model.DecisionTask;
import com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest;
import com.amazonaws.services.simpleworkflow.model.RespondDecisionTaskCompletedRequest;
import com.amazonaws.services.simpleworkflow.model.TaskList;

public class DecisionTaskPoller implements TaskPoller {

    private static final Log log = LogFactory.getLog(DecisionTaskPoller.class);

    private static final Log decisionsLog = LogFactory.getLog(DecisionTaskPoller.class.getName() + ".decisions");

    private class DecisionTaskIterator implements Iterator<DecisionTask> {

        private final DecisionTask firstDecisionTask;

        private DecisionTask next;

        public DecisionTaskIterator() {
            next = firstDecisionTask = poll(null);
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public DecisionTask next() {
            if (!hasNext()) {
                throw new IllegalStateException("hasNext() == false");
            }
            DecisionTask result = next;
            if (next.getNextPageToken() == null) {
                next = null;
            }
            else {
                next = poll(next.getNextPageToken());
                // Just to not keep around the history page
                if (firstDecisionTask != result) {
                    firstDecisionTask.setEvents(null);
                }
            }
            return result;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public DecisionTask getFirstDecisionTask() {
            return firstDecisionTask;
        }

    }

    private AmazonSimpleWorkflow service;

    private String domain;

    private String taskListToPoll;

    private String identity;

    private boolean validated;

    private DecisionTaskHandler decisionTaskHandler;

    public DecisionTaskPoller() {
        identity = ManagementFactory.getRuntimeMXBean().getName();
    }

    public DecisionTaskPoller(AmazonSimpleWorkflow service, String domain, String taskListToPoll,
            DecisionTaskHandler decisionTaskHandler) {
        this.service = service;
        this.domain = domain;
        this.taskListToPoll = taskListToPoll;
        this.decisionTaskHandler = decisionTaskHandler;
        identity = ManagementFactory.getRuntimeMXBean().getName();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        validated = false;
        this.identity = identity;
    }

    public AmazonSimpleWorkflow getService() {
        return service;
    }

    public String getDomain() {
        return domain;
    }

    public DecisionTaskHandler getDecisionTaskHandler() {
        return decisionTaskHandler;
    }

    public void setDecisionTaskHandler(DecisionTaskHandler decisionTaskHandler) {
        validated = false;
        this.decisionTaskHandler = decisionTaskHandler;
    }

    public void setService(AmazonSimpleWorkflow service) {
        validated = false;
        this.service = service;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTaskListToPoll() {
        return taskListToPoll;
    }

    public void setTaskListToPoll(String pollTaskList) {
        this.taskListToPoll = pollTaskList;
    }

    /**
     * Poll for a task using {@link #getPollTimeoutInSeconds()}
     * 
     * @param nextResultToken
     * 
     * @return null if poll timed out
     * @throws DeciderExecutorConfigurationException
     */
    private DecisionTask poll(String nextResultToken) {
        validate();
        PollForDecisionTaskRequest pollRequest = new PollForDecisionTaskRequest();

        pollRequest.setDomain(domain);
        pollRequest.setIdentity(identity);
        pollRequest.setNextPageToken(nextResultToken);

        pollRequest.setTaskList(new TaskList().withName(taskListToPoll));

        if (log.isDebugEnabled()) {
            log.debug("poll request begin: " + pollRequest);
        }
        DecisionTask result = service.pollForDecisionTask(pollRequest);
        if (log.isDebugEnabled()) {
            log.debug("poll request returned decision task: workflowType=" + result.getWorkflowType() + ", workflowExecution="
                    + result.getWorkflowExecution() + ", startedEventId=" + result.getStartedEventId() + ", previousStartedEventId=" + result.getPreviousStartedEventId());
        }

        if (result == null || result.getTaskToken() == null) {
            return null;
        }
        return result;
    }

    /**
     * Poll for a workflow task and call appropriate decider. This method might
     * call the service multiple times to retrieve the whole history it it is
     * paginated.
     * 
     * @return true if task was polled and decided upon, false if poll timed out
     * @throws Exception
     * @throws DeciderConfigurationException
     */
    @Override
    public boolean pollAndProcessSingleTask() throws Exception {
        DecisionTaskIterator tasks = null;
        RespondDecisionTaskCompletedRequest taskCompletedRequest = null;
        try {
            tasks = new DecisionTaskIterator();
            if (!tasks.hasNext()) {
                return false;
            }
            taskCompletedRequest = decisionTaskHandler.handleDecisionTask(tasks);
            if (decisionsLog.isTraceEnabled()) {
                decisionsLog.trace(WorkflowExecutionUtils.prettyPrintDecisions(taskCompletedRequest.getDecisions()));
            }
            service.respondDecisionTaskCompleted(taskCompletedRequest);
        }
        catch (Exception e) {
            if (tasks != null) {
                DecisionTask firstTask = tasks.getFirstDecisionTask();
                if (firstTask != null) {
                    if (log.isWarnEnabled()) {
                        log.warn("DecisionTask failure: taskId= " + firstTask.getStartedEventId() + ", workflowExecution="
                                + firstTask.getWorkflowExecution(), e);
                    }
                    if (log.isDebugEnabled() && firstTask.getEvents() != null) {
                        log.debug("Failed taskId=" + firstTask.getStartedEventId() + " history: "
                                + WorkflowExecutionUtils.prettyPrintHistory(firstTask.getEvents(), true));
                    }
                }
                if (taskCompletedRequest != null && decisionsLog.isWarnEnabled()) {
                    decisionsLog.warn("Failed taskId=" + firstTask.getStartedEventId() + " decisions="
                            + WorkflowExecutionUtils.prettyPrintDecisions(taskCompletedRequest.getDecisions()));
                }
            }
            throw e;
        }
        return true;
    }

    /**
     * @param seconds
     * @return
     */

    private void validate() throws IllegalStateException {
        if (validated) {
            return;
        }
        checkFieldSet("decisionTaskHandler", decisionTaskHandler);
        checkFieldSet("service", service);
        checkFieldSet("identity", identity);
        validated = true;
    }

    private void checkFieldSet(String fieldName, Object fieldValue) throws IllegalStateException {
        if (fieldValue == null) {
            throw new IllegalStateException("Required field " + fieldName + " is not set");
        }
    }

    protected void checkFieldNotNegative(String fieldName, long fieldValue) throws IllegalStateException {
        if (fieldValue < 0) {
            throw new IllegalStateException("Field " + fieldName + " is negative");
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
        return false;
    }
}
