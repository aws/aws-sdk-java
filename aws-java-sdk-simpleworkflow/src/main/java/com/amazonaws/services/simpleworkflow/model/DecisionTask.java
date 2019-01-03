/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure that represents a decision task. Decision tasks are sent to deciders in order for them to make decisions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DecisionTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecisionTask extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     */
    private String taskToken;
    /**
     * <p>
     * The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     * </p>
     */
    private Long startedEventId;
    /**
     * <p>
     * The workflow execution for which this decision task was created.
     * </p>
     */
    private WorkflowExecution workflowExecution;
    /**
     * <p>
     * The type of the workflow execution for which this decision task was created.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * A paginated list of history events of the workflow execution. The decider uses this during the processing of the
     * decision task.
     * </p>
     */
    private java.util.List<HistoryEvent> events;
    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     * processed by the decider. This can be used to determine the events in the history new since the last decision
     * task received by the decider.
     * </p>
     */
    private Long previousStartedEventId;

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     * 
     * @param taskToken
     *        The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     *        response information back to the system about the task.
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     * 
     * @return The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     *         response information back to the system about the task.
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     * 
     * @param taskToken
     *        The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     *        response information back to the system about the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>DecisionTaskStarted</code> event recorded in the history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * <p>
     * The workflow execution for which this decision task was created.
     * </p>
     * 
     * @param workflowExecution
     *        The workflow execution for which this decision task was created.
     */

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    /**
     * <p>
     * The workflow execution for which this decision task was created.
     * </p>
     * 
     * @return The workflow execution for which this decision task was created.
     */

    public WorkflowExecution getWorkflowExecution() {
        return this.workflowExecution;
    }

    /**
     * <p>
     * The workflow execution for which this decision task was created.
     * </p>
     * 
     * @param workflowExecution
     *        The workflow execution for which this decision task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withWorkflowExecution(WorkflowExecution workflowExecution) {
        setWorkflowExecution(workflowExecution);
        return this;
    }

    /**
     * <p>
     * The type of the workflow execution for which this decision task was created.
     * </p>
     * 
     * @param workflowType
     *        The type of the workflow execution for which this decision task was created.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of the workflow execution for which this decision task was created.
     * </p>
     * 
     * @return The type of the workflow execution for which this decision task was created.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of the workflow execution for which this decision task was created.
     * </p>
     * 
     * @param workflowType
     *        The type of the workflow execution for which this decision task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * A paginated list of history events of the workflow execution. The decider uses this during the processing of the
     * decision task.
     * </p>
     * 
     * @return A paginated list of history events of the workflow execution. The decider uses this during the processing
     *         of the decision task.
     */

    public java.util.List<HistoryEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * A paginated list of history events of the workflow execution. The decider uses this during the processing of the
     * decision task.
     * </p>
     * 
     * @param events
     *        A paginated list of history events of the workflow execution. The decider uses this during the processing
     *        of the decision task.
     */

    public void setEvents(java.util.Collection<HistoryEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<HistoryEvent>(events);
    }

    /**
     * <p>
     * A paginated list of history events of the workflow execution. The decider uses this during the processing of the
     * decision task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A paginated list of history events of the workflow execution. The decider uses this during the processing
     *        of the decision task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withEvents(HistoryEvent... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<HistoryEvent>(events.length));
        }
        for (HistoryEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A paginated list of history events of the workflow execution. The decider uses this during the processing of the
     * decision task.
     * </p>
     * 
     * @param events
     *        A paginated list of history events of the workflow execution. The decider uses this during the processing
     *        of the decision task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withEvents(java.util.Collection<HistoryEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in
     *         <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *         <p>
     *         The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To retrieve
     * the next page of results, make the call again using the returned token in <code>nextPageToken</code>. Keep all
     * other arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextPageToken
     *        If a <code>NextPageToken</code> was returned by a previous call, there are more results available. To
     *        retrieve the next page of results, make the call again using the returned token in
     *        <code>nextPageToken</code>. Keep all other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maximumPageSize</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     * processed by the decider. This can be used to determine the events in the history new since the last decision
     * task received by the decider.
     * </p>
     * 
     * @param previousStartedEventId
     *        The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     *        processed by the decider. This can be used to determine the events in the history new since the last
     *        decision task received by the decider.
     */

    public void setPreviousStartedEventId(Long previousStartedEventId) {
        this.previousStartedEventId = previousStartedEventId;
    }

    /**
     * <p>
     * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     * processed by the decider. This can be used to determine the events in the history new since the last decision
     * task received by the decider.
     * </p>
     * 
     * @return The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     *         processed by the decider. This can be used to determine the events in the history new since the last
     *         decision task received by the decider.
     */

    public Long getPreviousStartedEventId() {
        return this.previousStartedEventId;
    }

    /**
     * <p>
     * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     * processed by the decider. This can be used to determine the events in the history new since the last decision
     * task received by the decider.
     * </p>
     * 
     * @param previousStartedEventId
     *        The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was
     *        processed by the decider. This can be used to determine the events in the history new since the last
     *        decision task received by the decider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecisionTask withPreviousStartedEventId(Long previousStartedEventId) {
        setPreviousStartedEventId(previousStartedEventId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId()).append(",");
        if (getWorkflowExecution() != null)
            sb.append("WorkflowExecution: ").append(getWorkflowExecution()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getPreviousStartedEventId() != null)
            sb.append("PreviousStartedEventId: ").append(getPreviousStartedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecisionTask == false)
            return false;
        DecisionTask other = (DecisionTask) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null)
            return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getPreviousStartedEventId() == null ^ this.getPreviousStartedEventId() == null)
            return false;
        if (other.getPreviousStartedEventId() != null && other.getPreviousStartedEventId().equals(this.getPreviousStartedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecution() == null) ? 0 : getWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getPreviousStartedEventId() == null) ? 0 : getPreviousStartedEventId().hashCode());
        return hashCode;
    }

    @Override
    public DecisionTask clone() {
        try {
            return (DecisionTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
