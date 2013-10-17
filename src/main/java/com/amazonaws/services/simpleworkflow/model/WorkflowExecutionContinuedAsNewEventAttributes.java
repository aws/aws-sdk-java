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
 * Provides details of the <code>WorkflowExecutionContinuedAsNew</code> event.
 * </p>
 */
public class WorkflowExecutionContinuedAsNewEventAttributes implements Serializable {

    /**
     * The input provided to the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this
     * execution. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The <code>runId</code> of the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String newExecutionRunId;

    /**
     * The total duration allowed for the new workflow execution. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String executionStartToCloseTimeout;

    /**
     * Represents a task list.
     */
    private TaskList taskList;

    /**
     * The maximum duration of decision tasks for the new workflow execution.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String taskStartToCloseTimeout;

    /**
     * The policy to use for the child workflow executions of the new
     * execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. <p>The supported child policies are: <ul>
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
     * The list of tags associated with the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagList;

    /**
     * Represents a workflow type.
     */
    private WorkflowType workflowType;

    /**
     * The input provided to the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The input provided to the new workflow execution.
     */
    public String getInput() {
        return input;
    }
    
    /**
     * The input provided to the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input provided to the new workflow execution.
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * The input provided to the new workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input provided to the new workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this
     * execution. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>ContinueAsNewWorkflowExecution</code> decision that started this
     *         execution. This information can be useful for diagnosing problems by
     *         tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this
     * execution. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>ContinueAsNewWorkflowExecution</code> decision that started this
     *         execution. This information can be useful for diagnosing problems by
     *         tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>ContinueAsNewWorkflowExecution</code> decision that started this
     * execution. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>ContinueAsNewWorkflowExecution</code> decision that started this
     *         execution. This information can be useful for diagnosing problems by
     *         tracing back the cause of events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }

    /**
     * The <code>runId</code> of the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The <code>runId</code> of the new workflow execution.
     */
    public String getNewExecutionRunId() {
        return newExecutionRunId;
    }
    
    /**
     * The <code>runId</code> of the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param newExecutionRunId The <code>runId</code> of the new workflow execution.
     */
    public void setNewExecutionRunId(String newExecutionRunId) {
        this.newExecutionRunId = newExecutionRunId;
    }
    
    /**
     * The <code>runId</code> of the new workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param newExecutionRunId The <code>runId</code> of the new workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withNewExecutionRunId(String newExecutionRunId) {
        this.newExecutionRunId = newExecutionRunId;
        return this;
    }

    /**
     * The total duration allowed for the new workflow execution. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The total duration allowed for the new workflow execution. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public String getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeout;
    }
    
    /**
     * The total duration allowed for the new workflow execution. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The total duration allowed for the new workflow execution. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }
    
    /**
     * The total duration allowed for the new workflow execution. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The total duration allowed for the new workflow execution. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
        return this;
    }

    /**
     * Represents a task list.
     *
     * @return Represents a task list.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * Represents a task list.
     *
     * @param taskList Represents a task list.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * Represents a task list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList Represents a task list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * The maximum duration of decision tasks for the new workflow execution.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration of decision tasks for the new workflow execution.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public String getTaskStartToCloseTimeout() {
        return taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration of decision tasks for the new workflow execution.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration of decision tasks for the new workflow execution.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }
    
    /**
     * The maximum duration of decision tasks for the new workflow execution.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout The maximum duration of decision tasks for the new workflow execution.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
        return this;
    }

    /**
     * The policy to use for the child workflow executions of the new
     * execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. <p>The supported child policies are: <ul>
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
     * @return The policy to use for the child workflow executions of the new
     *         execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. <p>The supported child policies are: <ul>
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
     * The policy to use for the child workflow executions of the new
     * execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. <p>The supported child policies are: <ul>
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
     * @param childPolicy The policy to use for the child workflow executions of the new
     *         execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. <p>The supported child policies are: <ul>
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
     * The policy to use for the child workflow executions of the new
     * execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. <p>The supported child policies are: <ul>
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
     * @param childPolicy The policy to use for the child workflow executions of the new
     *         execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. <p>The supported child policies are: <ul>
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
    public WorkflowExecutionContinuedAsNewEventAttributes withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * The policy to use for the child workflow executions of the new
     * execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. <p>The supported child policies are: <ul>
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
     * @param childPolicy The policy to use for the child workflow executions of the new
     *         execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. <p>The supported child policies are: <ul>
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
     * The policy to use for the child workflow executions of the new
     * execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. <p>The supported child policies are: <ul>
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
     * @param childPolicy The policy to use for the child workflow executions of the new
     *         execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. <p>The supported child policies are: <ul>
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
    public WorkflowExecutionContinuedAsNewEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * The list of tags associated with the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of tags associated with the new workflow execution.
     */
    public java.util.List<String> getTagList() {
        if (tagList == null) {
              tagList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagList.setAutoConstruct(true);
        }
        return tagList;
    }
    
    /**
     * The list of tags associated with the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with the new workflow execution.
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
     * The list of tags associated with the new workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with the new workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withTagList(String... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<String>(tagList.length));
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags associated with the new workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags associated with the new workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withTagList(java.util.Collection<String> tagList) {
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
     * Represents a workflow type.
     *
     * @return Represents a workflow type.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * Represents a workflow type.
     *
     * @param workflowType Represents a workflow type.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * Represents a workflow type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType Represents a workflow type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
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
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
        if (getNewExecutionRunId() != null) sb.append("NewExecutionRunId: " + getNewExecutionRunId() + ",");
        if (getExecutionStartToCloseTimeout() != null) sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getTaskStartToCloseTimeout() != null) sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getTagList() != null) sb.append("TagList: " + getTagList() + ",");
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionContinuedAsNewEventAttributes == false) return false;
        WorkflowExecutionContinuedAsNewEventAttributes other = (WorkflowExecutionContinuedAsNewEventAttributes)obj;
        
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getNewExecutionRunId() == null ^ this.getNewExecutionRunId() == null) return false;
        if (other.getNewExecutionRunId() != null && other.getNewExecutionRunId().equals(this.getNewExecutionRunId()) == false) return false; 
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null) return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null) return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        if (other.getTagList() == null ^ this.getTagList() == null) return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        return true;
    }
    
}
    