/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides details of the
 * <code>StartChildWorkflowExecutionInitiated</code> event.
 * </p>
 */
public class StartChildWorkflowExecutionInitiatedEventAttributes implements Serializable, Cloneable {

    /**
     * The <code>workflowId</code> of the child workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The type of the child workflow execution.
     */
    private WorkflowType workflowType;

    /**
     * <i>Optional.</i> Data attached to the event that can be used by the
     * decider in subsequent decision tasks. This data is not sent to the
     * activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The inputs provided to the child workflow execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The maximum duration for the child workflow execution. If the workflow
     * execution is not closed within this duration, it will be timed out and
     * force terminated. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. The value "NONE" can be used to specify
     * unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String executionStartToCloseTimeout;

    /**
     * The name of the task list used for the decision tasks of the child
     * workflow execution.
     */
    private TaskList taskList;

    /**
     * <i>Optional.</i> The priority assigned for the decision tasks for this
     * workflow execution. Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     */
    private String taskPriority;

    /**
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>StartChildWorkflowExecution</code> decision to request this
     * child workflow execution. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The policy to use for the child workflow executions if this execution
     * gets terminated by explicitly calling the
     * <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     * <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     * child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * The maximum duration allowed for the decision tasks for this workflow
     * execution. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String taskStartToCloseTimeout;

    /**
     * The list of tags to associated with the child workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagList;

    /**
     * The IAM role attached to this workflow execution to use when invoking
     * AWS Lambda functions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     */
    private String lambdaRole;

    /**
     * The <code>workflowId</code> of the child workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>workflowId</code> of the child workflow execution.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the child workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the child workflow execution.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The <code>workflowId</code> of the child workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The <code>workflowId</code> of the child workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The type of the child workflow execution.
     *
     * @return The type of the child workflow execution.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The type of the child workflow execution.
     *
     * @param workflowType The type of the child workflow execution.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The type of the child workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The type of the child workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * <i>Optional.</i> Data attached to the event that can be used by the
     * decider in subsequent decision tasks. This data is not sent to the
     * activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return <i>Optional.</i> Data attached to the event that can be used by the
     *         decider in subsequent decision tasks. This data is not sent to the
     *         activity.
     */
    public String getControl() {
        return control;
    }
    
    /**
     * <i>Optional.</i> Data attached to the event that can be used by the
     * decider in subsequent decision tasks. This data is not sent to the
     * activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control <i>Optional.</i> Data attached to the event that can be used by the
     *         decider in subsequent decision tasks. This data is not sent to the
     *         activity.
     */
    public void setControl(String control) {
        this.control = control;
    }
    
    /**
     * <i>Optional.</i> Data attached to the event that can be used by the
     * decider in subsequent decision tasks. This data is not sent to the
     * activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control <i>Optional.</i> Data attached to the event that can be used by the
     *         decider in subsequent decision tasks. This data is not sent to the
     *         activity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withControl(String control) {
        this.control = control;
        return this;
    }

    /**
     * The inputs provided to the child workflow execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The inputs provided to the child workflow execution (if any).
     */
    public String getInput() {
        return input;
    }
    
    /**
     * The inputs provided to the child workflow execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The inputs provided to the child workflow execution (if any).
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * The inputs provided to the child workflow execution (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The inputs provided to the child workflow execution (if any).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * The maximum duration for the child workflow execution. If the workflow
     * execution is not closed within this duration, it will be timed out and
     * force terminated. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. The value "NONE" can be used to specify
     * unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration for the child workflow execution. If the workflow
     *         execution is not closed within this duration, it will be timed out and
     *         force terminated. <p>The duration is specified in seconds; an integer
     *         greater than or equal to 0. The value "NONE" can be used to specify
     *         unlimited duration.
     */
    public String getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeout;
    }
    
    /**
     * The maximum duration for the child workflow execution. If the workflow
     * execution is not closed within this duration, it will be timed out and
     * force terminated. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. The value "NONE" can be used to specify
     * unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The maximum duration for the child workflow execution. If the workflow
     *         execution is not closed within this duration, it will be timed out and
     *         force terminated. <p>The duration is specified in seconds; an integer
     *         greater than or equal to 0. The value "NONE" can be used to specify
     *         unlimited duration.
     */
    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }
    
    /**
     * The maximum duration for the child workflow execution. If the workflow
     * execution is not closed within this duration, it will be timed out and
     * force terminated. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. The value "NONE" can be used to specify
     * unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The maximum duration for the child workflow execution. If the workflow
     *         execution is not closed within this duration, it will be timed out and
     *         force terminated. <p>The duration is specified in seconds; an integer
     *         greater than or equal to 0. The value "NONE" can be used to specify
     *         unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
        return this;
    }

    /**
     * The name of the task list used for the decision tasks of the child
     * workflow execution.
     *
     * @return The name of the task list used for the decision tasks of the child
     *         workflow execution.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The name of the task list used for the decision tasks of the child
     * workflow execution.
     *
     * @param taskList The name of the task list used for the decision tasks of the child
     *         workflow execution.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The name of the task list used for the decision tasks of the child
     * workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The name of the task list used for the decision tasks of the child
     *         workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * <i>Optional.</i> The priority assigned for the decision tasks for this
     * workflow execution. Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @return <i>Optional.</i> The priority assigned for the decision tasks for this
     *         workflow execution. Valid values are integers that range from Java's
     *         <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     */
    public String getTaskPriority() {
        return taskPriority;
    }
    
    /**
     * <i>Optional.</i> The priority assigned for the decision tasks for this
     * workflow execution. Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @param taskPriority <i>Optional.</i> The priority assigned for the decision tasks for this
     *         workflow execution. Valid values are integers that range from Java's
     *         <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     */
    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }
    
    /**
     * <i>Optional.</i> The priority assigned for the decision tasks for this
     * workflow execution. Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @param taskPriority <i>Optional.</i> The priority assigned for the decision tasks for this
     *         workflow execution. Valid values are integers that range from Java's
     *         <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
        return this;
    }

    /**
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>StartChildWorkflowExecution</code> decision to request this
     * child workflow execution. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     *
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>StartChildWorkflowExecution</code> decision to request this
     *         child workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>StartChildWorkflowExecution</code> decision to request this
     * child workflow execution. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The ID of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>StartChildWorkflowExecution</code> decision to request this
     *         child workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>StartChildWorkflowExecution</code> decision to request this
     * child workflow execution. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The ID of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>StartChildWorkflowExecution</code> decision to request this
     *         child workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }

    /**
     * The policy to use for the child workflow executions if this execution
     * gets terminated by explicitly calling the
     * <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     * <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     * child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return The policy to use for the child workflow executions if this execution
     *         gets terminated by explicitly calling the
     *         <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     *         <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     *         child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * The policy to use for the child workflow executions if this execution
     * gets terminated by explicitly calling the
     * <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     * <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     * child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this execution
     *         gets terminated by explicitly calling the
     *         <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     *         <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     *         child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * The policy to use for the child workflow executions if this execution
     * gets terminated by explicitly calling the
     * <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     * <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     * child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this execution
     *         gets terminated by explicitly calling the
     *         <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     *         <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     *         child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChildPolicy
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * The policy to use for the child workflow executions if this execution
     * gets terminated by explicitly calling the
     * <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     * <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     * child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this execution
     *         gets terminated by explicitly calling the
     *         <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     *         <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     *         child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * The policy to use for the child workflow executions if this execution
     * gets terminated by explicitly calling the
     * <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     * <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     * child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy to use for the child workflow executions if this execution
     *         gets terminated by explicitly calling the
     *         <a>TerminateWorkflowExecution</a> action or due to an expired timeout.
     *         <p>The supported child policies are: <ul> <li><b>TERMINATE:</b> the
     *         child executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChildPolicy
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * The maximum duration allowed for the decision tasks for this workflow
     * execution. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration allowed for the decision tasks for this workflow
     *         execution. <p>The duration is specified in seconds; an integer greater
     *         than or equal to 0. The value "NONE" can be used to specify unlimited
     *         duration.
     */
    public String getTaskStartToCloseTimeout() {
        return taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration allowed for the decision tasks for this workflow
     * execution. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration allowed for the decision tasks for this workflow
     *         execution. <p>The duration is specified in seconds; an integer greater
     *         than or equal to 0. The value "NONE" can be used to specify unlimited
     *         duration.
     */
    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration allowed for the decision tasks for this workflow
     * execution. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration allowed for the decision tasks for this workflow
     *         execution. <p>The duration is specified in seconds; an integer greater
     *         than or equal to 0. The value "NONE" can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
        return this;
    }

    /**
     * The list of tags to associated with the child workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of tags to associated with the child workflow execution.
     */
    public java.util.List<String> getTagList() {
        return tagList;
    }
    
    /**
     * The list of tags to associated with the child workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associated with the child workflow execution.
     */
    public void setTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagList.size());
        tagListCopy.addAll(tagList);
        this.tagList = tagListCopy;
    }
    
    /**
     * The list of tags to associated with the child workflow execution.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagList(java.util.Collection)} or {@link
     * #withTagList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associated with the child workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withTagList(String... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<String>(tagList.length));
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags to associated with the child workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associated with the child workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagList.size());
            tagListCopy.addAll(tagList);
            this.tagList = tagListCopy;
        }

        return this;
    }

    /**
     * The IAM role attached to this workflow execution to use when invoking
     * AWS Lambda functions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     *
     * @return The IAM role attached to this workflow execution to use when invoking
     *         AWS Lambda functions.
     */
    public String getLambdaRole() {
        return lambdaRole;
    }
    
    /**
     * The IAM role attached to this workflow execution to use when invoking
     * AWS Lambda functions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     *
     * @param lambdaRole The IAM role attached to this workflow execution to use when invoking
     *         AWS Lambda functions.
     */
    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }
    
    /**
     * The IAM role attached to this workflow execution to use when invoking
     * AWS Lambda functions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     *
     * @param lambdaRole The IAM role attached to this workflow execution to use when invoking
     *         AWS Lambda functions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes withLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
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
        if (getWorkflowId() != null) sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getControl() != null) sb.append("Control: " + getControl() + ",");
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getExecutionStartToCloseTimeout() != null) sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getTaskPriority() != null) sb.append("TaskPriority: " + getTaskPriority() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getTaskStartToCloseTimeout() != null) sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getTagList() != null) sb.append("TagList: " + getTagList() + ",");
        if (getLambdaRole() != null) sb.append("LambdaRole: " + getLambdaRole() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode()); 
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode()); 
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode()); 
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartChildWorkflowExecutionInitiatedEventAttributes == false) return false;
        StartChildWorkflowExecutionInitiatedEventAttributes other = (StartChildWorkflowExecutionInitiatedEventAttributes)obj;
        
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null) return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null) return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null) return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false) return false; 
        if (other.getTagList() == null ^ this.getTagList() == null) return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false) return false; 
        if (other.getLambdaRole() == null ^ this.getLambdaRole() == null) return false;
        if (other.getLambdaRole() != null && other.getLambdaRole().equals(this.getLambdaRole()) == false) return false; 
        return true;
    }
    
    @Override
    public StartChildWorkflowExecutionInitiatedEventAttributes clone() {
        try {
            return (StartChildWorkflowExecutionInitiatedEventAttributes) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    