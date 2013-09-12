/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.common;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.model.CloseStatus;
import com.amazonaws.services.simpleworkflow.model.Decision;
import com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest;
import com.amazonaws.services.simpleworkflow.model.EventType;
import com.amazonaws.services.simpleworkflow.model.ExecutionStatus;
import com.amazonaws.services.simpleworkflow.model.GetWorkflowExecutionHistoryRequest;
import com.amazonaws.services.simpleworkflow.model.History;
import com.amazonaws.services.simpleworkflow.model.HistoryEvent;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionCompletedEventAttributes;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionContinuedAsNewEventAttributes;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionDetail;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecutionInfo;

/**
 * Convenience methods to be used by unit tests and during development.
 * 
 * @author fateev
 */
public class WorkflowExecutionUtils {

    /**
     * Blocks until workflow instance completes and returns its result. Useful
     * for unit tests and during development. <strong>Never</strong> use in
     * production setting as polling for worklow instance status is an expensive
     * operation.
     * 
     * @param workflowExecution
     *            result of
     *            {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     * @return workflow instance result.
     * @throws InterruptedException
     *             if thread is interrupted
     * @throws RuntimeException
     *             if workflow instance ended up in any state but completed
     */
    public static WorkflowExecutionCompletedEventAttributes waitForWorkflowExecutionResult(AmazonSimpleWorkflow service,
            String domain, WorkflowExecution workflowExecution) throws InterruptedException {
        try {
            return waitForWorkflowExecutionResult(service, domain, workflowExecution, 0);
        }
        catch (TimeoutException e) {
            throw new Error("should never happen", e);
        }
    }

    /**
     * Waits up to specified timeout until workflow instance completes and
     * returns its result. Useful for unit tests and during development.
     * <strong>Never</strong> use in production setting as polling for worklow
     * instance status is an expensive operation.
     * 
     * @param workflowExecution
     *            result of
     *            {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     * @return workflow instance result.
     * @throws InterruptedException
     *             if thread is interrupted
     * @throws TimeoutException
     *             if instance is not complete after specified timeout
     * @throws RuntimeException
     *             if workflow instance ended up in any state but completed
     */
    public static WorkflowExecutionCompletedEventAttributes waitForWorkflowExecutionResult(AmazonSimpleWorkflow service,
            String domain, WorkflowExecution workflowExecution, long timeoutSeconds)
            throws InterruptedException, TimeoutException {
        if (!waitForWorkflowInstanceCompletion(service, domain, workflowExecution, timeoutSeconds).equals(
                CloseStatus.COMPLETED.toString())) {
            String historyDump = WorkflowExecutionUtils.prettyPrintHistory(service, domain, workflowExecution);
            throw new RuntimeException("Workflow instance is not in completed state:\n" + historyDump);
        }
        return getWorkflowExecutionResult(service, domain, workflowExecution);
    }

    /**
     * Returns result of workflow instance execution. result of
     * {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     * 
     * @throws IllegalStateException
     *             if workflow is still running
     * @throws RuntimeException
     *             if workflow instance ended up in any state but completed
     */
    public static WorkflowExecutionCompletedEventAttributes getWorkflowExecutionResult(AmazonSimpleWorkflow service,
            String domain, WorkflowExecution workflowExecution) {
        HistoryEvent closeEvent = getInstanceCloseEvent(service, domain, workflowExecution);
        if (closeEvent == null) {
            throw new IllegalStateException("Workflow is still running");
        }
        if (closeEvent.getEventType().equals(EventType.WorkflowExecutionCompleted.toString())) {
            return closeEvent.getWorkflowExecutionCompletedEventAttributes();
        }
        throw new RuntimeException("Workflow end state is not completed: " + prettyPrintHistoryEvent(closeEvent));
    }

    public static HistoryEvent getInstanceCloseEvent(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution) {

        WorkflowExecutionInfo executionInfo = describeWorkflowInstance(service, domain, workflowExecution);
        if (executionInfo == null || executionInfo.getExecutionStatus().equals(ExecutionStatus.OPEN.toString())) {
            return null;
        }

        List<HistoryEvent> events = getHistory(service, domain, workflowExecution);
        HistoryEvent result = null;
        for (HistoryEvent event : events) {
            if (isWorkflowExecutionCompletedEvent(event)) {
                result = event;
                break;
            }
        }
        return result;
    }

    public static boolean isWorkflowExecutionCompletedEvent(HistoryEvent event) {
        return ((event != null) && (event.getEventType().equals(EventType.WorkflowExecutionCompleted.toString())
                || event.getEventType().equals(EventType.WorkflowExecutionCanceled.toString())
                || event.getEventType().equals(EventType.WorkflowExecutionFailed.toString())
                || event.getEventType().equals(EventType.WorkflowExecutionTimedOut.toString())
                || event.getEventType().equals(EventType.WorkflowExecutionContinuedAsNew.toString()) || event.getEventType().equals(
                EventType.WorkflowExecutionTerminated.toString())));
    }

    public static boolean isActivityTaskClosedEvent(HistoryEvent event) {
        return ((event != null) && (event.getEventType().equals(EventType.ActivityTaskCompleted.toString())
                || event.getEventType().equals(EventType.ActivityTaskCanceled.toString())
                || event.getEventType().equals(EventType.ActivityTaskFailed.toString()) || event.getEventType().equals(
                EventType.ActivityTaskTimedOut.toString())));
    }

    public static boolean isExternalWorkflowClosedEvent(HistoryEvent event) {
        return ((event != null) && (event.getEventType().equals(EventType.ChildWorkflowExecutionCompleted.toString())
                || event.getEventType().equals(EventType.ChildWorkflowExecutionCanceled.toString())
                || event.getEventType().equals(EventType.ChildWorkflowExecutionFailed.toString())
                || event.getEventType().equals(EventType.ChildWorkflowExecutionTerminated.toString()) || event.getEventType().equals(
                EventType.ChildWorkflowExecutionTimedOut.toString())));
    }

    public static WorkflowExecution getWorkflowIdFromExternalWorkflowCompletedEvent(HistoryEvent event) {
        if (event != null) {
            if (event.getEventType().equals(EventType.ChildWorkflowExecutionCompleted.toString())) {
                return event.getChildWorkflowExecutionCompletedEventAttributes().getWorkflowExecution();
            }
            else if (event.getEventType().equals(EventType.ChildWorkflowExecutionCanceled.toString())) {
                return event.getChildWorkflowExecutionCanceledEventAttributes().getWorkflowExecution();
            }
            else if (event.getEventType().equals(EventType.ChildWorkflowExecutionFailed.toString())) {
                return event.getChildWorkflowExecutionFailedEventAttributes().getWorkflowExecution();
            }
            else if (event.getEventType().equals(EventType.ChildWorkflowExecutionTerminated.toString())) {
                return event.getChildWorkflowExecutionTerminatedEventAttributes().getWorkflowExecution();
            }
            else if (event.getEventType().equals(EventType.ChildWorkflowExecutionTimedOut.toString())) {
                return event.getChildWorkflowExecutionTimedOutEventAttributes().getWorkflowExecution();
            }
        }

        return null;
    }
    
    public static String getId(HistoryEvent historyEvent) {
        String id = null;
        if (historyEvent != null) {
            if (historyEvent.getEventType().equals(EventType.StartChildWorkflowExecutionFailed.toString())) {
                id = historyEvent.getStartChildWorkflowExecutionFailedEventAttributes().getWorkflowId();
            } else if (historyEvent.getEventType().equals(EventType.ScheduleActivityTaskFailed.toString())) {
                id = historyEvent.getScheduleActivityTaskFailedEventAttributes().getActivityId();
            } else if (historyEvent.getEventType().equals(EventType.StartTimerFailed.toString())) {
                id = historyEvent.getStartTimerFailedEventAttributes().getTimerId();
            } 
        }
        
        return id;
    }
    
    public static String getFailureCause(HistoryEvent historyEvent) {
        String failureCause = null;
        if (historyEvent != null) {
            if (historyEvent.getEventType().equals(EventType.StartChildWorkflowExecutionFailed.toString())) {
                failureCause = historyEvent.getStartChildWorkflowExecutionFailedEventAttributes().getCause();
            } else if (historyEvent.getEventType().equals(EventType.SignalExternalWorkflowExecutionFailed.toString())) {
                failureCause = historyEvent.getSignalExternalWorkflowExecutionFailedEventAttributes().getCause();
            } else if (historyEvent.getEventType().equals(EventType.ScheduleActivityTaskFailed.toString())) {
                failureCause = historyEvent.getScheduleActivityTaskFailedEventAttributes().getCause();
            } else if (historyEvent.getEventType().equals(EventType.StartTimerFailed.toString())) {
                failureCause = historyEvent.getStartTimerFailedEventAttributes().getCause();
            } else if (historyEvent.getEventType().equals(EventType.ContinueAsNewWorkflowExecutionFailed.toString())) {
                failureCause = historyEvent.getContinueAsNewWorkflowExecutionFailedEventAttributes().getCause();
            } else if (historyEvent.getEventType().equals(EventType.RecordMarkerFailed.toString())) {
            	failureCause = historyEvent.getRecordMarkerFailedEventAttributes().getCause();
            }
        }
        
        return failureCause;
    }

    /**
     * Blocks until workflow instance completes. <strong>Never</strong> use in
     * production setting as polling for worklow instance status is an expensive
     * operation.
     * 
     * @param workflowExecution
     *            result of
     *            {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     * @return instance close status
     */
    public static String waitForWorkflowInstanceCompletion(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution) throws InterruptedException {
        try {
            return waitForWorkflowInstanceCompletion(service, domain, workflowExecution, 0);
        }
        catch (TimeoutException e) {
            throw new Error("should never happen", e);
        }
    }

    /**
     * Waits up to specified timeout for workflow instance completion.
     * <strong>Never</strong> use in production setting as polling for worklow
     * instance status is an expensive operation.
     * 
     * @param workflowExecution
     *            result of
     *            {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     * @param timeoutSeconds
     *            maximum time to wait for completion. 0 means wait forever.
     * @return instance close status
     * @throws TimeoutException
     */
    public static String waitForWorkflowInstanceCompletion(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution, long timeoutSeconds) 
                throws InterruptedException, TimeoutException {
        long start = System.currentTimeMillis();
        WorkflowExecutionInfo executionInfo = null;
        do {
            if (timeoutSeconds > 0 && System.currentTimeMillis() - start >= timeoutSeconds * 1000) {
                String historyDump = WorkflowExecutionUtils.prettyPrintHistory(service, domain, workflowExecution);
                throw new TimeoutException("Workflow instance is not complete after " + timeoutSeconds + " seconds: \n"
                        + historyDump);
            }
            if (executionInfo != null) {
                Thread.sleep(1000);
            }
            executionInfo = describeWorkflowInstance(service, domain, workflowExecution);
        }
        while (executionInfo.getExecutionStatus().equals(ExecutionStatus.OPEN.toString()));
        return executionInfo.getCloseStatus();
    }

    /**
     * Like
     * {@link #waitForWorkflowInstanceCompletion(AmazonSimpleWorkflow, String, WorkflowExecution, long)}
     * , except will wait for continued generations of the original workflow
     * execution too.
     * 
     * @param service
     * @param domain
     * @param workflowExecution
     * @param timeoutSeconds
     * @return
     * @throws InterruptedException
     * @throws TimeoutException
     * 
     * @see #waitForWorkflowInstanceCompletion(AmazonSimpleWorkflow, String,
     *      WorkflowExecution, long)
     */
    public static String waitForWorkflowInstanceCompletionAcrossGenerations(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution, long timeoutSeconds) throws InterruptedException, TimeoutException {

        WorkflowExecution lastExecutionToRun = workflowExecution;
        long millisecondsAtFirstWait = System.currentTimeMillis();
        String lastExecutionToRunCloseStatus = waitForWorkflowInstanceCompletion(service, domain, lastExecutionToRun,
                timeoutSeconds);

        // keep waiting if the instance continued as new
        while (lastExecutionToRunCloseStatus.equals(CloseStatus.CONTINUED_AS_NEW.toString())) {
            // get the new execution's information
            HistoryEvent closeEvent = getInstanceCloseEvent(service, domain, lastExecutionToRun);
            WorkflowExecutionContinuedAsNewEventAttributes continuedAsNewAttributes = closeEvent.getWorkflowExecutionContinuedAsNewEventAttributes();

            WorkflowExecution newGenerationExecution = new WorkflowExecution().withWorkflowId(lastExecutionToRun.getWorkflowId()).withRunId(
                    continuedAsNewAttributes.getNewExecutionRunId());
            
            // and wait for it
            long currentTime = System.currentTimeMillis();
            long millisecondsSinceFirstWait = currentTime - millisecondsAtFirstWait;
            long timeoutInSecondsForNextWait = timeoutSeconds - (millisecondsSinceFirstWait / 1000L);
            
            lastExecutionToRunCloseStatus = waitForWorkflowInstanceCompletion(service, domain, newGenerationExecution, timeoutInSecondsForNextWait);
            lastExecutionToRun = newGenerationExecution;
        }

        return lastExecutionToRunCloseStatus;
    }

    /**
     * Like
     * {@link #waitForWorkflowInstanceCompletionAcrossGenerations(AmazonSimpleWorkflow, String, WorkflowExecution, long)}
     * , but with no timeout.
     * 
     * @param service
     * @param domain
     * @param workflowExecution
     * @return
     * @throws InterruptedException
     */
    public static String waitForWorkflowInstanceCompletionAcrossGenerations(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution) throws InterruptedException {
        try {
            return waitForWorkflowInstanceCompletionAcrossGenerations(service, domain, workflowExecution, 0L);
        }
        catch (TimeoutException e) {
            throw new Error("should never happen", e);
        }
    }

    public static WorkflowExecutionInfo describeWorkflowInstance(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution) {
        DescribeWorkflowExecutionRequest describeRequest = new DescribeWorkflowExecutionRequest();
        describeRequest.setDomain(domain);
        describeRequest.setExecution(workflowExecution);
        WorkflowExecutionDetail executionDetail = service.describeWorkflowExecution(describeRequest);
        WorkflowExecutionInfo instanceMetadata = executionDetail.getExecutionInfo();
        return instanceMetadata;
    }

    /**
     * Returns workflow instance history in a human readable format.
     * 
     * @param workflowExecution
     *            result of
     *            {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     */
    public static String prettyPrintHistory(AmazonSimpleWorkflow service, String domain, WorkflowExecution workflowExecution) {
        return prettyPrintHistory(service, domain, workflowExecution, true);
    }

    /**
     * Returns workflow instance history in a human readable format.
     * 
     * @param workflowExecution
     *            result of
     *            {@link AmazonSimpleWorkflow#startWorkflowInstance(com.amazonaws.services.simpleworkflow.model.StartWorkflowInstanceRequest)}
     * @param showWorkflowTasks
     *            when set to false workflow task events (decider events) are
     *            not included
     */
    public static String prettyPrintHistory(AmazonSimpleWorkflow service, String domain, WorkflowExecution workflowExecution,
            boolean showWorkflowTasks) {
        List<HistoryEvent> events = getHistory(service, domain, workflowExecution);
        return prettyPrintHistory(events, showWorkflowTasks);
    }

    public static List<HistoryEvent> getHistory(AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution) {
        List<HistoryEvent> events = new ArrayList<HistoryEvent>();
        String nextPageToken = null;
        do {
            History history = getHistoryPage(nextPageToken, service, domain, workflowExecution);
            events.addAll(history.getEvents());
            nextPageToken = history.getNextPageToken();
        }
        while (nextPageToken != null);
        return events;
    }

    public static History getHistoryPage(String nextPageToken, AmazonSimpleWorkflow service, String domain,
            WorkflowExecution workflowExecution) {

        GetWorkflowExecutionHistoryRequest getHistoryRequest = new GetWorkflowExecutionHistoryRequest();
        getHistoryRequest.setDomain(domain);
        getHistoryRequest.setExecution(workflowExecution);
        getHistoryRequest.setNextPageToken(nextPageToken);

        History history = service.getWorkflowExecutionHistory(getHistoryRequest);
        if (history == null) {
            throw new IllegalArgumentException("unknown workflow execution: " + workflowExecution);
        }
        return history;
    }

    /**
     * Returns workflow instance history in a human readable format.
     * 
     * @history Workflow instance history
     * @param showWorkflowTasks
     *            when set to false workflow task events (decider events) are
     *            not included
     */
    public static String prettyPrintHistory(History history, boolean showWorkflowTasks) {
        return prettyPrintHistory(history.getEvents(), showWorkflowTasks);
    }

    public static String prettyPrintHistory(Iterable<HistoryEvent> events, boolean showWorkflowTasks) {
        StringBuffer result = new StringBuffer();
        result.append("{");
        boolean first = true;
        for (HistoryEvent event : events) {
            if (!showWorkflowTasks && event.getEventType().startsWith("WorkflowTask")) {
                continue;
            }
            if (first) {
                first = false;
            }
            else {
                result.append(",");
            }
            result.append("\n    ");
            result.append(prettyPrintHistoryEvent(event));
        }
        result.append("\n}");
        return result.toString();
    }

    public static String prettyPrintDecisions(Iterable<Decision> decisions) {
        StringBuffer result = new StringBuffer();
        result.append("{");
        boolean first = true;
        for (Decision decision : decisions) {
            if (first) {
                first = false;
            }
            else {
                result.append(",");
            }
            result.append("\n    ");
            result.append(prettyPrintDecision(decision));
        }
        result.append("\n}");
        return result.toString();
    }

    /**
     * Returns single event in a human readable format
     * 
     * @param event
     *            event to pretty print
     */
    public static String prettyPrintHistoryEvent(HistoryEvent event) {
        String eventType = event.getEventType();
        StringBuffer result = new StringBuffer();
        result.append(eventType);
        result.append(prettyPrintObject(event, "getType", true, "    ", false));
        return result.toString();
    }

    /**
     * Returns single decision in a human readable format
     * 
     * @param event
     *            event to pretty print
     */
    public static String prettyPrintDecision(Decision decision) {
        return prettyPrintObject(decision, "getType", true, "    ", true);
    }
    
    /**
     * Not really a generic method for printing random object graphs. But it
     * works for events and decisions.
     */
    private static String prettyPrintObject(Object object, String methodToSkip, boolean skipNullsAndEmptyCollections,
            String indentation, boolean skipLevel) {
        StringBuffer result = new StringBuffer();
        if (object == null) {
            return "null";
        }
        Class<? extends Object> clz = object.getClass();
        if (Number.class.isAssignableFrom(clz)) {
            return String.valueOf(object);
        }
        if (Boolean.class.isAssignableFrom(clz)) {
            return String.valueOf(object);
        }
        if (clz.equals(String.class)) {
            return (String) object;
        }
        if (clz.equals(Date.class)) {
            return String.valueOf(object);
        }
        if (Map.class.isAssignableFrom(clz)) {
            return String.valueOf(object);
        }
        if (Collection.class.isAssignableFrom(clz)) {
            return String.valueOf(object);
        }
        if (!skipLevel) {
            result.append(" {");
        }
        Method[] eventMethods = object.getClass().getMethods();
        boolean first = true;
        for (Method method : eventMethods) {
            String name = method.getName();
            if (!name.startsWith("get")) {
                continue;
            }
            if (name.equals(methodToSkip) || name.equals("getClass")) {
                continue;
            }
            if (Modifier.isStatic(method.getModifiers())) {
                continue;
            }
            Object value;
            try {
                value = method.invoke(object, (Object[]) null);
                if (value != null && value.getClass().equals(String.class) && name.equals("getDetails")) {
                    value = printDetails((String) value);
                }
            }
            catch (InvocationTargetException e) {
                throw new RuntimeException(e.getTargetException());
            }
            catch (RuntimeException e) {
                throw (RuntimeException) e;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (skipNullsAndEmptyCollections) {
                if (value == null) {
                    continue;
                }
                if (value instanceof Map && ((Map<?, ?>) value).isEmpty()) {
                    continue;
                }
                if (value instanceof Collection && ((Collection<?>) value).isEmpty()) {
                    continue;
                }
            }
            if (!skipLevel) {
                if (first) {
                    first = false;
                }
                else {
                    result.append(";");
                }
                result.append("\n");
                result.append(indentation);
                result.append("    ");
                result.append(name.substring(3));
                result.append(" = ");
                result.append(prettyPrintObject(value, methodToSkip, skipNullsAndEmptyCollections, indentation + "    ", false));
            }
            else {
                result.append(prettyPrintObject(value, methodToSkip, skipNullsAndEmptyCollections, indentation, false));
            }
        }
        if (!skipLevel) {
            result.append("\n");
            result.append(indentation);
            result.append("}");
        }
        return result.toString();
    }
    
    public static String printDetails(String details) {
        Throwable failure = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.enableDefaultTyping(DefaultTyping.NON_FINAL);
            
            failure = mapper.readValue(details, Throwable.class);
        } catch (Exception e) {
            // eat up any data converter exceptions
        }
        
        if (failure != null) {
            StringBuilder builder = new StringBuilder();
            
            // Also print callstack
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            failure.printStackTrace(pw);
            
            builder.append(sw.toString());
            
            details = builder.toString();
        }
        
        return details;
    }

    /**
     * Simple Workflow limits length of the reason field. This method truncates
     * the passed argument to the maximum length.
     * 
     * @param reason
     *            string value to truncate
     * @return truncated value
     */
    public static String truncateReason(String reason) {
        if (reason != null && reason.length() > FlowValueConstraint.FAILURE_REASON.getMaxSize()) {
            reason = reason.substring(0, FlowValueConstraint.FAILURE_REASON.getMaxSize());
        }
        return reason;
    }
    
    public static String truncateDetails(String details) {
        if (details != null && details.length() > FlowValueConstraint.FAILURE_DETAILS.getMaxSize()) {
            details = details.substring(0, FlowValueConstraint.FAILURE_DETAILS.getMaxSize());
        }
        return details;
    }
}
