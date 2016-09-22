/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The configuration settings for a workflow execution including timeout values, tasklist etc. These configuration
 * settings are determined from the defaults specified when registering the workflow type and those specified when
 * starting the workflow execution.
 * </p>
 */
public class WorkflowExecutionConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum duration allowed for decision tasks for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String taskStartToCloseTimeout;
    /**
     * <p>
     * The total duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String executionStartToCloseTimeout;
    /**
     * <p>
     * The task list used for the decision tasks generated for this workflow execution.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     */
    private String taskPriority;
    /**
     * <p>
     * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     */
    private String childPolicy;
    /**
     * <p>
     * The IAM role used by this workflow execution when invoking AWS Lambda functions.
     * </p>
     */
    private String lambdaRole;

    /**
     * <p>
     * The maximum duration allowed for decision tasks for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param taskStartToCloseTimeout
     *        The maximum duration allowed for decision tasks for this workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     */

    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration allowed for decision tasks for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return The maximum duration allowed for decision tasks for this workflow execution.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     */

    public String getTaskStartToCloseTimeout() {
        return this.taskStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration allowed for decision tasks for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param taskStartToCloseTimeout
     *        The maximum duration allowed for decision tasks for this workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionConfiguration withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        setTaskStartToCloseTimeout(taskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The total duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration for this workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     */

    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The total duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return The total duration for this workflow execution.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     */

    public String getExecutionStartToCloseTimeout() {
        return this.executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The total duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration for this workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionConfiguration withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        setExecutionStartToCloseTimeout(executionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The task list used for the decision tasks generated for this workflow execution.
     * </p>
     * 
     * @param taskList
     *        The task list used for the decision tasks generated for this workflow execution.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The task list used for the decision tasks generated for this workflow execution.
     * </p>
     * 
     * @return The task list used for the decision tasks generated for this workflow execution.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The task list used for the decision tasks generated for this workflow execution.
     * </p>
     * 
     * @param taskList
     *        The task list used for the decision tasks generated for this workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionConfiguration withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        The priority assigned to decision tasks for this workflow execution. Valid values are integers that range
     *        from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647).
     *        Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     */

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * <p>
     * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @return The priority assigned to decision tasks for this workflow execution. Valid values are integers that range
     *         from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647).
     *         Higher numbers indicate higher priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     */

    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * <p>
     * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher
     * numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        The priority assigned to decision tasks for this workflow execution. Valid values are integers that range
     *        from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647).
     *        Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionConfiguration withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions if this workflow execution is terminated, by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @see ChildPolicy
     */

    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @return The policy to use for the child workflow executions if this workflow execution is terminated, by calling
     *         the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *         <p>
     *         The supported child policies are:
     *         </p>
     *         <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *         appropriate actions when it receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @see ChildPolicy
     */

    public String getChildPolicy() {
        return this.childPolicy;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions if this workflow execution is terminated, by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public WorkflowExecutionConfiguration withChildPolicy(String childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions if this workflow execution is terminated, by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @see ChildPolicy
     */

    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }

    /**
     * <p>
     * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions if this workflow execution is terminated, by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public WorkflowExecutionConfiguration withChildPolicy(ChildPolicy childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * The IAM role used by this workflow execution when invoking AWS Lambda functions.
     * </p>
     * 
     * @param lambdaRole
     *        The IAM role used by this workflow execution when invoking AWS Lambda functions.
     */

    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }

    /**
     * <p>
     * The IAM role used by this workflow execution when invoking AWS Lambda functions.
     * </p>
     * 
     * @return The IAM role used by this workflow execution when invoking AWS Lambda functions.
     */

    public String getLambdaRole() {
        return this.lambdaRole;
    }

    /**
     * <p>
     * The IAM role used by this workflow execution when invoking AWS Lambda functions.
     * </p>
     * 
     * @param lambdaRole
     *        The IAM role used by this workflow execution when invoking AWS Lambda functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionConfiguration withLambdaRole(String lambdaRole) {
        setLambdaRole(lambdaRole);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskStartToCloseTimeout() != null)
            sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getExecutionStartToCloseTimeout() != null)
            sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskList() != null)
            sb.append("TaskList: " + getTaskList() + ",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: " + getTaskPriority() + ",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getLambdaRole() != null)
            sb.append("LambdaRole: " + getLambdaRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionConfiguration == false)
            return false;
        WorkflowExecutionConfiguration other = (WorkflowExecutionConfiguration) obj;
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null)
            return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false)
            return false;
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null)
            return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null)
            return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false)
            return false;
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null)
            return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false)
            return false;
        if (other.getLambdaRole() == null ^ this.getLambdaRole() == null)
            return false;
        if (other.getLambdaRole() != null && other.getLambdaRole().equals(this.getLambdaRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionConfiguration clone() {
        try {
            return (WorkflowExecutionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
