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
 * Provides details of <code>WorkflowExecutionStarted</code> event.
 * </p>
 */
public class WorkflowExecutionStartedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The input provided to the workflow execution (if any).
     * </p>
     */
    private String input;
    /**
     * <p>
     * The maximum duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String executionStartToCloseTimeout;
    /**
     * <p>
     * The maximum duration of decision tasks for this workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String taskStartToCloseTimeout;
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
     * The name of the task list for scheduling the decision tasks for this workflow execution.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * The workflow type of this execution.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * </p>
     */
    private java.util.List<String> tagList;

    private String taskPriority;
    /**
     * <p>
     * If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision, then it
     * contains the <code>runId</code> of the previous workflow execution that was closed and continued as this
     * execution.
     * </p>
     */
    private String continuedExecutionRunId;
    /**
     * <p>
     * The source workflow execution that started this workflow execution. The member is not set if the workflow
     * execution was not started by a workflow.
     * </p>
     */
    private WorkflowExecution parentWorkflowExecution;
    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with this ID
     * can be found in the history of the source workflow execution. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long parentInitiatedEventId;
    /**
     * <p>
     * The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     * </p>
     */
    private String lambdaRole;

    /**
     * <p>
     * The input provided to the workflow execution (if any).
     * </p>
     * 
     * @param input
     *        The input provided to the workflow execution (if any).
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input provided to the workflow execution (if any).
     * </p>
     * 
     * @return The input provided to the workflow execution (if any).
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input provided to the workflow execution (if any).
     * </p>
     * 
     * @param input
     *        The input provided to the workflow execution (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The maximum duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param executionStartToCloseTimeout
     *        The maximum duration for this workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     */

    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return The maximum duration for this workflow execution.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     */

    public String getExecutionStartToCloseTimeout() {
        return this.executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration for this workflow execution.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param executionStartToCloseTimeout
     *        The maximum duration for this workflow execution.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        setExecutionStartToCloseTimeout(executionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The maximum duration of decision tasks for this workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param taskStartToCloseTimeout
     *        The maximum duration of decision tasks for this workflow type.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     */

    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration of decision tasks for this workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return The maximum duration of decision tasks for this workflow type.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     */

    public String getTaskStartToCloseTimeout() {
        return this.taskStartToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration of decision tasks for this workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param taskStartToCloseTimeout
     *        The maximum duration of decision tasks for this workflow type.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        setTaskStartToCloseTimeout(taskStartToCloseTimeout);
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

    public WorkflowExecutionStartedEventAttributes withChildPolicy(String childPolicy) {
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

    public WorkflowExecutionStartedEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * The name of the task list for scheduling the decision tasks for this workflow execution.
     * </p>
     * 
     * @param taskList
     *        The name of the task list for scheduling the decision tasks for this workflow execution.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The name of the task list for scheduling the decision tasks for this workflow execution.
     * </p>
     * 
     * @return The name of the task list for scheduling the decision tasks for this workflow execution.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The name of the task list for scheduling the decision tasks for this workflow execution.
     * </p>
     * 
     * @param taskList
     *        The name of the task list for scheduling the decision tasks for this workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withTaskList(TaskList taskList) {
        setTaskList(taskList);
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

    public WorkflowExecutionStartedEventAttributes withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * </p>
     * 
     * @return The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     */

    public java.util.List<String> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with this workflow execution. An execution can have up to 5 tags.
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
     * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withTagList(String... tagList) {
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
     * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * </p>
     * 
     * @param tagList
     *        The list of tags associated with this workflow execution. An execution can have up to 5 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withTagList(java.util.Collection<String> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * @param taskPriority
     */

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * @return
     */

    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * @param taskPriority
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision, then it
     * contains the <code>runId</code> of the previous workflow execution that was closed and continued as this
     * execution.
     * </p>
     * 
     * @param continuedExecutionRunId
     *        If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision, then
     *        it contains the <code>runId</code> of the previous workflow execution that was closed and continued as
     *        this execution.
     */

    public void setContinuedExecutionRunId(String continuedExecutionRunId) {
        this.continuedExecutionRunId = continuedExecutionRunId;
    }

    /**
     * <p>
     * If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision, then it
     * contains the <code>runId</code> of the previous workflow execution that was closed and continued as this
     * execution.
     * </p>
     * 
     * @return If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision,
     *         then it contains the <code>runId</code> of the previous workflow execution that was closed and continued
     *         as this execution.
     */

    public String getContinuedExecutionRunId() {
        return this.continuedExecutionRunId;
    }

    /**
     * <p>
     * If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision, then it
     * contains the <code>runId</code> of the previous workflow execution that was closed and continued as this
     * execution.
     * </p>
     * 
     * @param continuedExecutionRunId
     *        If this workflow execution was started due to a <code>ContinueAsNewWorkflowExecution</code> decision, then
     *        it contains the <code>runId</code> of the previous workflow execution that was closed and continued as
     *        this execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withContinuedExecutionRunId(String continuedExecutionRunId) {
        setContinuedExecutionRunId(continuedExecutionRunId);
        return this;
    }

    /**
     * <p>
     * The source workflow execution that started this workflow execution. The member is not set if the workflow
     * execution was not started by a workflow.
     * </p>
     * 
     * @param parentWorkflowExecution
     *        The source workflow execution that started this workflow execution. The member is not set if the workflow
     *        execution was not started by a workflow.
     */

    public void setParentWorkflowExecution(WorkflowExecution parentWorkflowExecution) {
        this.parentWorkflowExecution = parentWorkflowExecution;
    }

    /**
     * <p>
     * The source workflow execution that started this workflow execution. The member is not set if the workflow
     * execution was not started by a workflow.
     * </p>
     * 
     * @return The source workflow execution that started this workflow execution. The member is not set if the workflow
     *         execution was not started by a workflow.
     */

    public WorkflowExecution getParentWorkflowExecution() {
        return this.parentWorkflowExecution;
    }

    /**
     * <p>
     * The source workflow execution that started this workflow execution. The member is not set if the workflow
     * execution was not started by a workflow.
     * </p>
     * 
     * @param parentWorkflowExecution
     *        The source workflow execution that started this workflow execution. The member is not set if the workflow
     *        execution was not started by a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withParentWorkflowExecution(WorkflowExecution parentWorkflowExecution) {
        setParentWorkflowExecution(parentWorkflowExecution);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with this ID
     * can be found in the history of the source workflow execution. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param parentInitiatedEventId
     *        The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with
     *        this ID can be found in the history of the source workflow execution. This information can be useful for
     *        diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setParentInitiatedEventId(Long parentInitiatedEventId) {
        this.parentInitiatedEventId = parentInitiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with this ID
     * can be found in the history of the source workflow execution. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with
     *         this ID can be found in the history of the source workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getParentInitiatedEventId() {
        return this.parentInitiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with this ID
     * can be found in the history of the source workflow execution. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param parentInitiatedEventId
     *        The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>StartChildWorkflowExecution</code> decision to start this workflow execution. The source event with
     *        this ID can be found in the history of the source workflow execution. This information can be useful for
     *        diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withParentInitiatedEventId(Long parentInitiatedEventId) {
        setParentInitiatedEventId(parentInitiatedEventId);
        return this;
    }

    /**
     * <p>
     * The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     * </p>
     * 
     * @param lambdaRole
     *        The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     */

    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }

    /**
     * <p>
     * The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     * </p>
     * 
     * @return The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     */

    public String getLambdaRole() {
        return this.lambdaRole;
    }

    /**
     * <p>
     * The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     * </p>
     * 
     * @param lambdaRole
     *        The IAM role attached to this workflow execution to use when invoking AWS Lambda functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionStartedEventAttributes withLambdaRole(String lambdaRole) {
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
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getExecutionStartToCloseTimeout() != null)
            sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskStartToCloseTimeout() != null)
            sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getTaskList() != null)
            sb.append("TaskList: " + getTaskList() + ",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getTagList() != null)
            sb.append("TagList: " + getTagList() + ",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: " + getTaskPriority() + ",");
        if (getContinuedExecutionRunId() != null)
            sb.append("ContinuedExecutionRunId: " + getContinuedExecutionRunId() + ",");
        if (getParentWorkflowExecution() != null)
            sb.append("ParentWorkflowExecution: " + getParentWorkflowExecution() + ",");
        if (getParentInitiatedEventId() != null)
            sb.append("ParentInitiatedEventId: " + getParentInitiatedEventId() + ",");
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

        if (obj instanceof WorkflowExecutionStartedEventAttributes == false)
            return false;
        WorkflowExecutionStartedEventAttributes other = (WorkflowExecutionStartedEventAttributes) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null)
            return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false)
            return false;
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null)
            return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false)
            return false;
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null)
            return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null)
            return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false)
            return false;
        if (other.getContinuedExecutionRunId() == null ^ this.getContinuedExecutionRunId() == null)
            return false;
        if (other.getContinuedExecutionRunId() != null && other.getContinuedExecutionRunId().equals(this.getContinuedExecutionRunId()) == false)
            return false;
        if (other.getParentWorkflowExecution() == null ^ this.getParentWorkflowExecution() == null)
            return false;
        if (other.getParentWorkflowExecution() != null && other.getParentWorkflowExecution().equals(this.getParentWorkflowExecution()) == false)
            return false;
        if (other.getParentInitiatedEventId() == null ^ this.getParentInitiatedEventId() == null)
            return false;
        if (other.getParentInitiatedEventId() != null && other.getParentInitiatedEventId().equals(this.getParentInitiatedEventId()) == false)
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
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getContinuedExecutionRunId() == null) ? 0 : getContinuedExecutionRunId().hashCode());
        hashCode = prime * hashCode + ((getParentWorkflowExecution() == null) ? 0 : getParentWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getParentInitiatedEventId() == null) ? 0 : getParentInitiatedEventId().hashCode());
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionStartedEventAttributes clone() {
        try {
            return (WorkflowExecutionStartedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
