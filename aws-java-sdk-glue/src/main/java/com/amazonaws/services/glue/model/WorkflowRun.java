/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow run is an execution of a workflow providing all the runtime information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/WorkflowRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the workflow that was run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     */
    private String workflowRunId;
    /**
     * <p>
     * The ID of the previous workflow run.
     * </p>
     */
    private String previousRunId;
    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     */
    private java.util.Map<String, String> workflowRunProperties;
    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The status of the workflow run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * This error message describes any error that may have occurred in starting the workflow run. Currently the only
     * error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The statistics of the run.
     * </p>
     */
    private WorkflowRunStatistics statistics;
    /**
     * <p>
     * The graph representing all the Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     */
    private WorkflowGraph graph;
    /**
     * <p>
     * The batch condition that started the workflow run.
     * </p>
     */
    private StartingEventBatchCondition startingEventBatchCondition;

    /**
     * <p>
     * Name of the workflow that was run.
     * </p>
     * 
     * @param name
     *        Name of the workflow that was run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow that was run.
     * </p>
     * 
     * @return Name of the workflow that was run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the workflow that was run.
     * </p>
     * 
     * @param name
     *        Name of the workflow that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * 
     * @param workflowRunId
     *        The ID of this workflow run.
     */

    public void setWorkflowRunId(String workflowRunId) {
        this.workflowRunId = workflowRunId;
    }

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * 
     * @return The ID of this workflow run.
     */

    public String getWorkflowRunId() {
        return this.workflowRunId;
    }

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * 
     * @param workflowRunId
     *        The ID of this workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withWorkflowRunId(String workflowRunId) {
        setWorkflowRunId(workflowRunId);
        return this;
    }

    /**
     * <p>
     * The ID of the previous workflow run.
     * </p>
     * 
     * @param previousRunId
     *        The ID of the previous workflow run.
     */

    public void setPreviousRunId(String previousRunId) {
        this.previousRunId = previousRunId;
    }

    /**
     * <p>
     * The ID of the previous workflow run.
     * </p>
     * 
     * @return The ID of the previous workflow run.
     */

    public String getPreviousRunId() {
        return this.previousRunId;
    }

    /**
     * <p>
     * The ID of the previous workflow run.
     * </p>
     * 
     * @param previousRunId
     *        The ID of the previous workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withPreviousRunId(String previousRunId) {
        setPreviousRunId(previousRunId);
        return this;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     * 
     * @return The workflow run properties which were set during the run.
     */

    public java.util.Map<String, String> getWorkflowRunProperties() {
        return workflowRunProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     * 
     * @param workflowRunProperties
     *        The workflow run properties which were set during the run.
     */

    public void setWorkflowRunProperties(java.util.Map<String, String> workflowRunProperties) {
        this.workflowRunProperties = workflowRunProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     * 
     * @param workflowRunProperties
     *        The workflow run properties which were set during the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withWorkflowRunProperties(java.util.Map<String, String> workflowRunProperties) {
        setWorkflowRunProperties(workflowRunProperties);
        return this;
    }

    /**
     * Add a single WorkflowRunProperties entry
     *
     * @see WorkflowRun#withWorkflowRunProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun addWorkflowRunPropertiesEntry(String key, String value) {
        if (null == this.workflowRunProperties) {
            this.workflowRunProperties = new java.util.HashMap<String, String>();
        }
        if (this.workflowRunProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.workflowRunProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into WorkflowRunProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun clearWorkflowRunPropertiesEntries() {
        this.workflowRunProperties = null;
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when the workflow run was started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     * 
     * @return The date and time when the workflow run was started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when the workflow run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when the workflow run completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     * 
     * @return The date and time when the workflow run completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when the workflow run completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * 
     * @param status
     *        The status of the workflow run.
     * @see WorkflowRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * 
     * @return The status of the workflow run.
     * @see WorkflowRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * 
     * @param status
     *        The status of the workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowRunStatus
     */

    public WorkflowRun withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * 
     * @param status
     *        The status of the workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowRunStatus
     */

    public WorkflowRun withStatus(WorkflowRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * This error message describes any error that may have occurred in starting the workflow run. Currently the only
     * error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     * </p>
     * 
     * @param errorMessage
     *        This error message describes any error that may have occurred in starting the workflow run. Currently the
     *        only error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * This error message describes any error that may have occurred in starting the workflow run. Currently the only
     * error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     * </p>
     * 
     * @return This error message describes any error that may have occurred in starting the workflow run. Currently the
     *         only error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * This error message describes any error that may have occurred in starting the workflow run. Currently the only
     * error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     * </p>
     * 
     * @param errorMessage
     *        This error message describes any error that may have occurred in starting the workflow run. Currently the
     *        only error message is "Concurrent runs exceeded for workflow: <code>foo</code>."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The statistics of the run.
     * </p>
     * 
     * @param statistics
     *        The statistics of the run.
     */

    public void setStatistics(WorkflowRunStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The statistics of the run.
     * </p>
     * 
     * @return The statistics of the run.
     */

    public WorkflowRunStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The statistics of the run.
     * </p>
     * 
     * @param statistics
     *        The statistics of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withStatistics(WorkflowRunStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The graph representing all the Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     * 
     * @param graph
     *        The graph representing all the Glue components that belong to the workflow as nodes and directed
     *        connections between them as edges.
     */

    public void setGraph(WorkflowGraph graph) {
        this.graph = graph;
    }

    /**
     * <p>
     * The graph representing all the Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     * 
     * @return The graph representing all the Glue components that belong to the workflow as nodes and directed
     *         connections between them as edges.
     */

    public WorkflowGraph getGraph() {
        return this.graph;
    }

    /**
     * <p>
     * The graph representing all the Glue components that belong to the workflow as nodes and directed connections
     * between them as edges.
     * </p>
     * 
     * @param graph
     *        The graph representing all the Glue components that belong to the workflow as nodes and directed
     *        connections between them as edges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withGraph(WorkflowGraph graph) {
        setGraph(graph);
        return this;
    }

    /**
     * <p>
     * The batch condition that started the workflow run.
     * </p>
     * 
     * @param startingEventBatchCondition
     *        The batch condition that started the workflow run.
     */

    public void setStartingEventBatchCondition(StartingEventBatchCondition startingEventBatchCondition) {
        this.startingEventBatchCondition = startingEventBatchCondition;
    }

    /**
     * <p>
     * The batch condition that started the workflow run.
     * </p>
     * 
     * @return The batch condition that started the workflow run.
     */

    public StartingEventBatchCondition getStartingEventBatchCondition() {
        return this.startingEventBatchCondition;
    }

    /**
     * <p>
     * The batch condition that started the workflow run.
     * </p>
     * 
     * @param startingEventBatchCondition
     *        The batch condition that started the workflow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowRun withStartingEventBatchCondition(StartingEventBatchCondition startingEventBatchCondition) {
        setStartingEventBatchCondition(startingEventBatchCondition);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWorkflowRunId() != null)
            sb.append("WorkflowRunId: ").append(getWorkflowRunId()).append(",");
        if (getPreviousRunId() != null)
            sb.append("PreviousRunId: ").append(getPreviousRunId()).append(",");
        if (getWorkflowRunProperties() != null)
            sb.append("WorkflowRunProperties: ").append(getWorkflowRunProperties()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getGraph() != null)
            sb.append("Graph: ").append(getGraph()).append(",");
        if (getStartingEventBatchCondition() != null)
            sb.append("StartingEventBatchCondition: ").append(getStartingEventBatchCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowRun == false)
            return false;
        WorkflowRun other = (WorkflowRun) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkflowRunId() == null ^ this.getWorkflowRunId() == null)
            return false;
        if (other.getWorkflowRunId() != null && other.getWorkflowRunId().equals(this.getWorkflowRunId()) == false)
            return false;
        if (other.getPreviousRunId() == null ^ this.getPreviousRunId() == null)
            return false;
        if (other.getPreviousRunId() != null && other.getPreviousRunId().equals(this.getPreviousRunId()) == false)
            return false;
        if (other.getWorkflowRunProperties() == null ^ this.getWorkflowRunProperties() == null)
            return false;
        if (other.getWorkflowRunProperties() != null && other.getWorkflowRunProperties().equals(this.getWorkflowRunProperties()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getGraph() == null ^ this.getGraph() == null)
            return false;
        if (other.getGraph() != null && other.getGraph().equals(this.getGraph()) == false)
            return false;
        if (other.getStartingEventBatchCondition() == null ^ this.getStartingEventBatchCondition() == null)
            return false;
        if (other.getStartingEventBatchCondition() != null && other.getStartingEventBatchCondition().equals(this.getStartingEventBatchCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWorkflowRunId() == null) ? 0 : getWorkflowRunId().hashCode());
        hashCode = prime * hashCode + ((getPreviousRunId() == null) ? 0 : getPreviousRunId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowRunProperties() == null) ? 0 : getWorkflowRunProperties().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getGraph() == null) ? 0 : getGraph().hashCode());
        hashCode = prime * hashCode + ((getStartingEventBatchCondition() == null) ? 0 : getStartingEventBatchCondition().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowRun clone() {
        try {
            return (WorkflowRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.WorkflowRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
