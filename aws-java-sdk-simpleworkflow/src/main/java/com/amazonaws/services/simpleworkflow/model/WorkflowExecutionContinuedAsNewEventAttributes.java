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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>WorkflowExecutionContinuedAsNew</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowExecutionContinuedAsNewEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionContinuedAsNewEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input provided to the new workflow execution.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information can be useful
     * for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;
    /**
     * <p>
     * The <code>runId</code> of the new workflow execution.
     * </p>
     */
    private String newExecutionRunId;
    /**
     * <p>
     * The total duration allowed for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String executionStartToCloseTimeout;
    /**
     * <p>
     * The task list to use for the decisions of the new (continued) workflow execution.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * The priority of the task to use for the decisions of the new (continued) workflow execution.
     * </p>
     */
    private String taskPriority;
    /**
     * <p>
     * The maximum duration of decision tasks for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String taskStartToCloseTimeout;
    /**
     * <p>
     * The policy to use for the child workflow executions of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     */
    private String childPolicy;
    /**
     * <p>
     * The list of tags associated with the new workflow execution.
     * </p>
     */
    private java.util.List<String> tagList;
    /**
     * <p>
     * The workflow type of this execution.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The IAM role to attach to the new (continued) workflow execution.
     * </p>
     */
    private String lambdaRole;

    /**
     * <p>
     * The input provided to the new workflow execution.
     * </p>
     * 
     * @param input
     *        The input provided to the new workflow execution.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input provided to the new workflow execution.
     * </p>
     * 
     * @return The input provided to the new workflow execution.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input provided to the new workflow execution.
     * </p>
     * 
     * @param input
     *        The input provided to the new workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information can be useful
     * for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information can
     *        be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information can be useful
     * for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information
     *         can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information can be useful
     * for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>ContinueAsNewWorkflowExecution</code> decision that started this execution. This information can
     *        be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
        return this;
    }

    /**
     * <p>
     * The <code>runId</code> of the new workflow execution.
     * </p>
     * 
     * @param newExecutionRunId
     *        The <code>runId</code> of the new workflow execution.
     */

    public void setNewExecutionRunId(String newExecutionRunId) {
        this.newExecutionRunId = newExecutionRunId;
    }

    /**
     * <p>
     * The <code>runId</code> of the new workflow execution.
     * </p>
     * 
     * @return The <code>runId</code> of the new workflow execution.
     */

    public String getNewExecutionRunId() {
        return this.newExecutionRunId;
    }

    /**
     * <p>
     * The <code>runId</code> of the new workflow execution.
     * </p>
     * 
     * @param newExecutionRunId
     *        The <code>runId</code> of the new workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withNewExecutionRunId(String newExecutionRunId) {
        setNewExecutionRunId(newExecutionRunId);
        return this;
    }

    /**
     * <p>
     * The total duration allowed for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration allowed for the new workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The total duration allowed for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return The total duration allowed for the new workflow execution.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getExecutionStartToCloseTimeout() {
        return this.executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The total duration allowed for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration allowed for the new workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        setExecutionStartToCloseTimeout(executionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The task list to use for the decisions of the new (continued) workflow execution.
     * </p>
     * 
     * @param taskList
     *        The task list to use for the decisions of the new (continued) workflow execution.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The task list to use for the decisions of the new (continued) workflow execution.
     * </p>
     * 
     * @return The task list to use for the decisions of the new (continued) workflow execution.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The task list to use for the decisions of the new (continued) workflow execution.
     * </p>
     * 
     * @param taskList
     *        The task list to use for the decisions of the new (continued) workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * The priority of the task to use for the decisions of the new (continued) workflow execution.
     * </p>
     * 
     * @param taskPriority
     *        The priority of the task to use for the decisions of the new (continued) workflow execution.
     */

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * <p>
     * The priority of the task to use for the decisions of the new (continued) workflow execution.
     * </p>
     * 
     * @return The priority of the task to use for the decisions of the new (continued) workflow execution.
     */

    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * <p>
     * The priority of the task to use for the decisions of the new (continued) workflow execution.
     * </p>
     * 
     * @param taskPriority
     *        The priority of the task to use for the decisions of the new (continued) workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * The maximum duration of decision tasks for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param taskStartToCloseTimeout
     *        The maximum duration of decision tasks for the new workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration of decision tasks for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return The maximum duration of decision tasks for the new workflow execution.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getTaskStartToCloseTimeout() {
        return this.taskStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration of decision tasks for the new workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param taskStartToCloseTimeout
     *        The maximum duration of decision tasks for the new workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        setTaskStartToCloseTimeout(taskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions of the new execution if it is terminated by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     * @see ChildPolicy
     */

    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The policy to use for the child workflow executions of the new execution if it is terminated by calling
     *         the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *         <p>
     *         The supported child policies are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TERMINATE</code> – The child executions are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *         appropriate actions when it receives an execution history with this event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *         </p>
     *         </li>
     * @see ChildPolicy
     */

    public String getChildPolicy() {
        return this.childPolicy;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions of the new execution if it is terminated by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withChildPolicy(String childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * The policy to use for the child workflow executions of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions of the new execution if it is terminated by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     * @see ChildPolicy
     */

    public void setChildPolicy(ChildPolicy childPolicy) {
        withChildPolicy(childPolicy);
    }

    /**
     * <p>
     * The policy to use for the child workflow executions of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy to use for the child workflow executions of the new execution if it is terminated by calling
     *        the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The list of tags associated with the new workflow execution.
     * </p>
     * 
     * @return The list of tags associated with the new workflow execution.
     */

    public java.util.List<String> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The list of tags associated with the new workflow execution.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with the new workflow execution.
     */

    public void setTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<String>(tagList);
    }

    /**
     * <p>
     * The list of tags associated with the new workflow execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with the new workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withTagList(String... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<String>(tagList.length));
        }
        for (String ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags associated with the new workflow execution.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with the new workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withTagList(java.util.Collection<String> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * The workflow type of this execution.
     * </p>
     * 
     * @param workflowType
     *        The workflow type of this execution.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The workflow type of this execution.
     * </p>
     * 
     * @return The workflow type of this execution.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The workflow type of this execution.
     * </p>
     * 
     * @param workflowType
     *        The workflow type of this execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The IAM role to attach to the new (continued) workflow execution.
     * </p>
     * 
     * @param lambdaRole
     *        The IAM role to attach to the new (continued) workflow execution.
     */

    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }

    /**
     * <p>
     * The IAM role to attach to the new (continued) workflow execution.
     * </p>
     * 
     * @return The IAM role to attach to the new (continued) workflow execution.
     */

    public String getLambdaRole() {
        return this.lambdaRole;
    }

    /**
     * <p>
     * The IAM role to attach to the new (continued) workflow execution.
     * </p>
     * 
     * @param lambdaRole
     *        The IAM role to attach to the new (continued) workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes withLambdaRole(String lambdaRole) {
        setLambdaRole(lambdaRole);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId()).append(",");
        if (getNewExecutionRunId() != null)
            sb.append("NewExecutionRunId: ").append(getNewExecutionRunId()).append(",");
        if (getExecutionStartToCloseTimeout() != null)
            sb.append("ExecutionStartToCloseTimeout: ").append(getExecutionStartToCloseTimeout()).append(",");
        if (getTaskList() != null)
            sb.append("TaskList: ").append(getTaskList()).append(",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: ").append(getTaskPriority()).append(",");
        if (getTaskStartToCloseTimeout() != null)
            sb.append("TaskStartToCloseTimeout: ").append(getTaskStartToCloseTimeout()).append(",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: ").append(getChildPolicy()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getLambdaRole() != null)
            sb.append("LambdaRole: ").append(getLambdaRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionContinuedAsNewEventAttributes == false)
            return false;
        WorkflowExecutionContinuedAsNewEventAttributes other = (WorkflowExecutionContinuedAsNewEventAttributes) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        if (other.getNewExecutionRunId() == null ^ this.getNewExecutionRunId() == null)
            return false;
        if (other.getNewExecutionRunId() != null && other.getNewExecutionRunId().equals(this.getNewExecutionRunId()) == false)
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
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null)
            return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false)
            return false;
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null)
            return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
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

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        hashCode = prime * hashCode + ((getNewExecutionRunId() == null) ? 0 : getNewExecutionRunId().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionContinuedAsNewEventAttributes clone() {
        try {
            return (WorkflowExecutionContinuedAsNewEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.WorkflowExecutionContinuedAsNewEventAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
