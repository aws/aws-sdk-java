/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * The configuration settings for a workflow execution including timeout values, tasklist etc. These configuration settings are determined from the
 * defaults specified when registering the workflow type and those specified when starting the workflow execution.
 * </p>
 */
public class WorkflowExecutionConfiguration implements Serializable {

    /**
     * The maximum duration allowed for decision tasks for this workflow
     * execution. <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     */
    private String taskStartToCloseTimeout;

    /**
     * The total duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     */
    private String executionStartToCloseTimeout;

    /**
     * The task list used for the decision tasks generated for this workflow
     * execution.
     */
    private TaskList taskList;

    /**
     * The policy to use for the child workflow executions if this workflow
     * execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * The maximum duration allowed for decision tasks for this workflow
     * execution. <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @return The maximum duration allowed for decision tasks for this workflow
     *         execution. <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public String getTaskStartToCloseTimeout() {
        return taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration allowed for decision tasks for this workflow
     * execution. <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration allowed for decision tasks for this workflow
     *         execution. <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration allowed for decision tasks for this workflow
     * execution. <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration allowed for decision tasks for this workflow
     *         execution. <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionConfiguration withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
        return this;
    }

    /**
     * The total duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @return The total duration for this workflow execution. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeout;
    }
    
    /**
     * The total duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param executionStartToCloseTimeout The total duration for this workflow execution. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }
    
    /**
     * The total duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param executionStartToCloseTimeout The total duration for this workflow execution. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionConfiguration withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
        return this;
    }

    /**
     * The task list used for the decision tasks generated for this workflow
     * execution.
     *
     * @return The task list used for the decision tasks generated for this workflow
     *         execution.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The task list used for the decision tasks generated for this workflow
     * execution.
     *
     * @param taskList The task list used for the decision tasks generated for this workflow
     *         execution.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The task list used for the decision tasks generated for this workflow
     * execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The task list used for the decision tasks generated for this workflow
     *         execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionConfiguration withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * The policy to use for the child workflow executions if this workflow
     * execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return The policy to use for the child workflow executions if this workflow
     *         execution is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * The policy to use for the child workflow executions if this workflow
     * execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this workflow
     *         execution is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * The policy to use for the child workflow executions if this workflow
     * execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this workflow
     *         execution is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowExecutionConfiguration withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * The policy to use for the child workflow executions if this workflow
     * execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this workflow
     *         execution is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * The policy to use for the child workflow executions if this workflow
     * execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this workflow
     *         execution is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowExecutionConfiguration withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskStartToCloseTimeout() != null) sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getExecutionStartToCloseTimeout() != null) sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionConfiguration == false) return false;
        WorkflowExecutionConfiguration other = (WorkflowExecutionConfiguration)obj;
        
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null) return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false) return false; 
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null) return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        return true;
    }
    
}
    