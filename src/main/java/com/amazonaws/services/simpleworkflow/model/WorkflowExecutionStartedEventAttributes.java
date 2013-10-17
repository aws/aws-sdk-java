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
 * Provides details of <code>WorkflowExecutionStarted</code> event.
 * </p>
 */
public class WorkflowExecutionStartedEventAttributes implements Serializable {

    /**
     * The input provided to the workflow execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The maximum duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String executionStartToCloseTimeout;

    /**
     * The maximum duration of decision tasks for this workflow type. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String taskStartToCloseTimeout;

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
     * The name of the task list for scheduling the decision tasks for this
     * workflow execution.
     */
    private TaskList taskList;

    /**
     * The workflow type of this execution.
     */
    private WorkflowType workflowType;

    /**
     * The list of tags associated with this workflow execution. An execution
     * can have up to 5 tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagList;

    /**
     * If this workflow execution was started due to a
     * <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     * the <code>runId</code> of the previous workflow execution that was
     * closed and continued as this execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String continuedExecutionRunId;

    /**
     * The source workflow execution that started this workflow execution.
     * The member is not set if the workflow execution was not started by a
     * workflow.
     */
    private WorkflowExecution parentWorkflowExecution;

    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this workflow execution. The source event
     * with this Id can be found in the history of the source workflow
     * execution. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     */
    private Long parentInitiatedEventId;

    /**
     * The input provided to the workflow execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The input provided to the workflow execution (if any).
     */
    public String getInput() {
        return input;
    }
    
    /**
     * The input provided to the workflow execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input provided to the workflow execution (if any).
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * The input provided to the workflow execution (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input provided to the workflow execution (if any).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * The maximum duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration for this workflow execution. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeout;
    }
    
    /**
     * The maximum duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The maximum duration for this workflow execution. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }
    
    /**
     * The maximum duration for this workflow execution. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The maximum duration for this workflow execution. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
        return this;
    }

    /**
     * The maximum duration of decision tasks for this workflow type. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration of decision tasks for this workflow type. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public String getTaskStartToCloseTimeout() {
        return taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration of decision tasks for this workflow type. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration of decision tasks for this workflow type. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration of decision tasks for this workflow type. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration of decision tasks for this workflow type. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
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
    public WorkflowExecutionStartedEventAttributes withChildPolicy(String childPolicy) {
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
    public WorkflowExecutionStartedEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * The name of the task list for scheduling the decision tasks for this
     * workflow execution.
     *
     * @return The name of the task list for scheduling the decision tasks for this
     *         workflow execution.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The name of the task list for scheduling the decision tasks for this
     * workflow execution.
     *
     * @param taskList The name of the task list for scheduling the decision tasks for this
     *         workflow execution.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The name of the task list for scheduling the decision tasks for this
     * workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The name of the task list for scheduling the decision tasks for this
     *         workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * The workflow type of this execution.
     *
     * @return The workflow type of this execution.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The workflow type of this execution.
     *
     * @param workflowType The workflow type of this execution.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The workflow type of this execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The workflow type of this execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * The list of tags associated with this workflow execution. An execution
     * can have up to 5 tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of tags associated with this workflow execution. An execution
     *         can have up to 5 tags.
     */
    public java.util.List<String> getTagList() {
        if (tagList == null) {
              tagList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagList.setAutoConstruct(true);
        }
        return tagList;
    }
    
    /**
     * The list of tags associated with this workflow execution. An execution
     * can have up to 5 tags.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with this workflow execution. An execution
     *         can have up to 5 tags.
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
     * The list of tags associated with this workflow execution. An execution
     * can have up to 5 tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with this workflow execution. An execution
     *         can have up to 5 tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withTagList(String... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<String>(tagList.length));
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags associated with this workflow execution. An execution
     * can have up to 5 tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with this workflow execution. An execution
     *         can have up to 5 tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withTagList(java.util.Collection<String> tagList) {
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
     * If this workflow execution was started due to a
     * <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     * the <code>runId</code> of the previous workflow execution that was
     * closed and continued as this execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return If this workflow execution was started due to a
     *         <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     *         the <code>runId</code> of the previous workflow execution that was
     *         closed and continued as this execution.
     */
    public String getContinuedExecutionRunId() {
        return continuedExecutionRunId;
    }
    
    /**
     * If this workflow execution was started due to a
     * <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     * the <code>runId</code> of the previous workflow execution that was
     * closed and continued as this execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param continuedExecutionRunId If this workflow execution was started due to a
     *         <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     *         the <code>runId</code> of the previous workflow execution that was
     *         closed and continued as this execution.
     */
    public void setContinuedExecutionRunId(String continuedExecutionRunId) {
        this.continuedExecutionRunId = continuedExecutionRunId;
    }
    
    /**
     * If this workflow execution was started due to a
     * <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     * the <code>runId</code> of the previous workflow execution that was
     * closed and continued as this execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param continuedExecutionRunId If this workflow execution was started due to a
     *         <code>ContinueAsNewWorkflowExecution</code> decision, then it contains
     *         the <code>runId</code> of the previous workflow execution that was
     *         closed and continued as this execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withContinuedExecutionRunId(String continuedExecutionRunId) {
        this.continuedExecutionRunId = continuedExecutionRunId;
        return this;
    }

    /**
     * The source workflow execution that started this workflow execution.
     * The member is not set if the workflow execution was not started by a
     * workflow.
     *
     * @return The source workflow execution that started this workflow execution.
     *         The member is not set if the workflow execution was not started by a
     *         workflow.
     */
    public WorkflowExecution getParentWorkflowExecution() {
        return parentWorkflowExecution;
    }
    
    /**
     * The source workflow execution that started this workflow execution.
     * The member is not set if the workflow execution was not started by a
     * workflow.
     *
     * @param parentWorkflowExecution The source workflow execution that started this workflow execution.
     *         The member is not set if the workflow execution was not started by a
     *         workflow.
     */
    public void setParentWorkflowExecution(WorkflowExecution parentWorkflowExecution) {
        this.parentWorkflowExecution = parentWorkflowExecution;
    }
    
    /**
     * The source workflow execution that started this workflow execution.
     * The member is not set if the workflow execution was not started by a
     * workflow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parentWorkflowExecution The source workflow execution that started this workflow execution.
     *         The member is not set if the workflow execution was not started by a
     *         workflow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withParentWorkflowExecution(WorkflowExecution parentWorkflowExecution) {
        this.parentWorkflowExecution = parentWorkflowExecution;
        return this;
    }

    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this workflow execution. The source event
     * with this Id can be found in the history of the source workflow
     * execution. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     *
     * @return The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     *         corresponding to the <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a> to start this workflow execution. The source event
     *         with this Id can be found in the history of the source workflow
     *         execution. This information can be useful for diagnosing problems by
     *         tracing back the chain of events leading up to this event.
     */
    public Long getParentInitiatedEventId() {
        return parentInitiatedEventId;
    }
    
    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this workflow execution. The source event
     * with this Id can be found in the history of the source workflow
     * execution. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     *
     * @param parentInitiatedEventId The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     *         corresponding to the <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a> to start this workflow execution. The source event
     *         with this Id can be found in the history of the source workflow
     *         execution. This information can be useful for diagnosing problems by
     *         tracing back the chain of events leading up to this event.
     */
    public void setParentInitiatedEventId(Long parentInitiatedEventId) {
        this.parentInitiatedEventId = parentInitiatedEventId;
    }
    
    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this workflow execution. The source event
     * with this Id can be found in the history of the source workflow
     * execution. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parentInitiatedEventId The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     *         corresponding to the <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a> to start this workflow execution. The source event
     *         with this Id can be found in the history of the source workflow
     *         execution. This information can be useful for diagnosing problems by
     *         tracing back the chain of events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionStartedEventAttributes withParentInitiatedEventId(Long parentInitiatedEventId) {
        this.parentInitiatedEventId = parentInitiatedEventId;
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
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getExecutionStartToCloseTimeout() != null) sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskStartToCloseTimeout() != null) sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getTagList() != null) sb.append("TagList: " + getTagList() + ",");
        if (getContinuedExecutionRunId() != null) sb.append("ContinuedExecutionRunId: " + getContinuedExecutionRunId() + ",");
        if (getParentWorkflowExecution() != null) sb.append("ParentWorkflowExecution: " + getParentWorkflowExecution() + ",");
        if (getParentInitiatedEventId() != null) sb.append("ParentInitiatedEventId: " + getParentInitiatedEventId() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getContinuedExecutionRunId() == null) ? 0 : getContinuedExecutionRunId().hashCode()); 
        hashCode = prime * hashCode + ((getParentWorkflowExecution() == null) ? 0 : getParentWorkflowExecution().hashCode()); 
        hashCode = prime * hashCode + ((getParentInitiatedEventId() == null) ? 0 : getParentInitiatedEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionStartedEventAttributes == false) return false;
        WorkflowExecutionStartedEventAttributes other = (WorkflowExecutionStartedEventAttributes)obj;
        
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null) return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null) return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        if (other.getTagList() == null ^ this.getTagList() == null) return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false) return false; 
        if (other.getContinuedExecutionRunId() == null ^ this.getContinuedExecutionRunId() == null) return false;
        if (other.getContinuedExecutionRunId() != null && other.getContinuedExecutionRunId().equals(this.getContinuedExecutionRunId()) == false) return false; 
        if (other.getParentWorkflowExecution() == null ^ this.getParentWorkflowExecution() == null) return false;
        if (other.getParentWorkflowExecution() != null && other.getParentWorkflowExecution().equals(this.getParentWorkflowExecution()) == false) return false; 
        if (other.getParentInitiatedEventId() == null ^ this.getParentInitiatedEventId() == null) return false;
        if (other.getParentInitiatedEventId() != null && other.getParentInitiatedEventId().equals(this.getParentInitiatedEventId()) == false) return false; 
        return true;
    }
    
}
    