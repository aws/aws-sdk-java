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
 * Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF in much the same way as for the regular API:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the decision to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to specify this decision.</li>
 * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>tag</code> : TBD.</li>
 * <li> <code>taskList</code> : String constraint. The key is "swf:taskList.name".</li>
 * <li> <code>workflowTypeVersion</code> : String constraint. The key is TBD.</li>
 * 
 * </ul>
 * </li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 */
public class ContinueAsNewWorkflowExecutionDecisionAttributes implements Serializable {

    /**
     * The input provided to the new workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * If set, specifies the total duration for this workflow execution. This
     * overrides the <code>defaultExecutionStartToCloseTimeout</code>
     * specified when registering the workflow type. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>An execution
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this field. If
     * neither this field is set nor a default execution start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
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
     * Specifies the maximum duration of decision tasks for the new workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration. <note>A
     * task start-to-close timeout for the new workflow execution must be
     * specified either as a default for the workflow type or through this
     * parameter. If neither this parameter is set nor a default task
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String taskStartToCloseTimeout;

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for the new workflow execution must be specified
     * either as a default registered for its workflow type or through this
     * field. If neither this field is set nor a default child policy was
     * specified at registration time then a fault will be returned. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * The list of tags to associate with the new workflow execution. A
     * maximum of 5 tags can be specified. You can list workflow executions
     * with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagList;

    private String workflowTypeVersion;

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
    public ContinueAsNewWorkflowExecutionDecisionAttributes withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * If set, specifies the total duration for this workflow execution. This
     * overrides the <code>defaultExecutionStartToCloseTimeout</code>
     * specified when registering the workflow type. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>An execution
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this field. If
     * neither this field is set nor a default execution start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the total duration for this workflow execution. This
     *         overrides the <code>defaultExecutionStartToCloseTimeout</code>
     *         specified when registering the workflow type. <p>The valid values are
     *         integers greater than or equal to <code>0</code>. An integer value can
     *         be used to specify the duration in seconds while <code>NONE</code> can
     *         be used to specify unlimited duration. <note>An execution
     *         start-to-close timeout for this workflow execution must be specified
     *         either as a default for the workflow type or through this field. If
     *         neither this field is set nor a default execution start-to-close
     *         timeout was specified at registration time then a fault will be
     *         returned.</note>
     */
    public String getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the total duration for this workflow execution. This
     * overrides the <code>defaultExecutionStartToCloseTimeout</code>
     * specified when registering the workflow type. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>An execution
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this field. If
     * neither this field is set nor a default execution start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout If set, specifies the total duration for this workflow execution. This
     *         overrides the <code>defaultExecutionStartToCloseTimeout</code>
     *         specified when registering the workflow type. <p>The valid values are
     *         integers greater than or equal to <code>0</code>. An integer value can
     *         be used to specify the duration in seconds while <code>NONE</code> can
     *         be used to specify unlimited duration. <note>An execution
     *         start-to-close timeout for this workflow execution must be specified
     *         either as a default for the workflow type or through this field. If
     *         neither this field is set nor a default execution start-to-close
     *         timeout was specified at registration time then a fault will be
     *         returned.</note>
     */
    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the total duration for this workflow execution. This
     * overrides the <code>defaultExecutionStartToCloseTimeout</code>
     * specified when registering the workflow type. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>An execution
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this field. If
     * neither this field is set nor a default execution start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout If set, specifies the total duration for this workflow execution. This
     *         overrides the <code>defaultExecutionStartToCloseTimeout</code>
     *         specified when registering the workflow type. <p>The valid values are
     *         integers greater than or equal to <code>0</code>. An integer value can
     *         be used to specify the duration in seconds while <code>NONE</code> can
     *         be used to specify unlimited duration. <note>An execution
     *         start-to-close timeout for this workflow execution must be specified
     *         either as a default for the workflow type or through this field. If
     *         neither this field is set nor a default execution start-to-close
     *         timeout was specified at registration time then a fault will be
     *         returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
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
    public ContinueAsNewWorkflowExecutionDecisionAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * Specifies the maximum duration of decision tasks for the new workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration. <note>A
     * task start-to-close timeout for the new workflow execution must be
     * specified either as a default for the workflow type or through this
     * parameter. If neither this parameter is set nor a default task
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return Specifies the maximum duration of decision tasks for the new workflow
     *         execution. This parameter overrides the
     *         <code>defaultTaskStartToCloseTimout</code> specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration. <note>A
     *         task start-to-close timeout for the new workflow execution must be
     *         specified either as a default for the workflow type or through this
     *         parameter. If neither this parameter is set nor a default task
     *         start-to-close timeout was specified at registration time then a fault
     *         will be returned.</note>
     */
    public String getTaskStartToCloseTimeout() {
        return taskStartToCloseTimeout;
    }
    
    /**
     * Specifies the maximum duration of decision tasks for the new workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration. <note>A
     * task start-to-close timeout for the new workflow execution must be
     * specified either as a default for the workflow type or through this
     * parameter. If neither this parameter is set nor a default task
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout Specifies the maximum duration of decision tasks for the new workflow
     *         execution. This parameter overrides the
     *         <code>defaultTaskStartToCloseTimout</code> specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration. <note>A
     *         task start-to-close timeout for the new workflow execution must be
     *         specified either as a default for the workflow type or through this
     *         parameter. If neither this parameter is set nor a default task
     *         start-to-close timeout was specified at registration time then a fault
     *         will be returned.</note>
     */
    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }
    
    /**
     * Specifies the maximum duration of decision tasks for the new workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration. <note>A
     * task start-to-close timeout for the new workflow execution must be
     * specified either as a default for the workflow type or through this
     * parameter. If neither this parameter is set nor a default task
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout Specifies the maximum duration of decision tasks for the new workflow
     *         execution. This parameter overrides the
     *         <code>defaultTaskStartToCloseTimout</code> specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration. <note>A
     *         task start-to-close timeout for the new workflow execution must be
     *         specified either as a default for the workflow type or through this
     *         parameter. If neither this parameter is set nor a default task
     *         start-to-close timeout was specified at registration time then a fault
     *         will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for the new workflow execution must be specified
     * either as a default registered for its workflow type or through this
     * field. If neither this field is set nor a default child policy was
     * specified at registration time then a fault will be returned. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return If set, specifies the policy to use for the child workflow executions
     *         of the new execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for the new workflow execution must be specified
     *         either as a default registered for its workflow type or through this
     *         field. If neither this field is set nor a default child policy was
     *         specified at registration time then a fault will be returned. </note>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for the new workflow execution must be specified
     * either as a default registered for its workflow type or through this
     * field. If neither this field is set nor a default child policy was
     * specified at registration time then a fault will be returned. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the new execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for the new workflow execution must be specified
     *         either as a default registered for its workflow type or through this
     *         field. If neither this field is set nor a default child policy was
     *         specified at registration time then a fault will be returned. </note>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for the new workflow execution must be specified
     * either as a default registered for its workflow type or through this
     * field. If neither this field is set nor a default child policy was
     * specified at registration time then a fault will be returned. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the new execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for the new workflow execution must be specified
     *         either as a default registered for its workflow type or through this
     *         field. If neither this field is set nor a default child policy was
     *         specified at registration time then a fault will be returned. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for the new workflow execution must be specified
     * either as a default registered for its workflow type or through this
     * field. If neither this field is set nor a default child policy was
     * specified at registration time then a fault will be returned. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the new execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for the new workflow execution must be specified
     *         either as a default registered for its workflow type or through this
     *         field. If neither this field is set nor a default child policy was
     *         specified at registration time then a fault will be returned. </note>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the new execution if it is terminated by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for the new workflow execution must be specified
     * either as a default registered for its workflow type or through this
     * field. If neither this field is set nor a default child policy was
     * specified at registration time then a fault will be returned. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the new execution if it is terminated by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for the new workflow execution must be specified
     *         either as a default registered for its workflow type or through this
     *         field. If neither this field is set nor a default child policy was
     *         specified at registration time then a fault will be returned. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * The list of tags to associate with the new workflow execution. A
     * maximum of 5 tags can be specified. You can list workflow executions
     * with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of tags to associate with the new workflow execution. A
     *         maximum of 5 tags can be specified. You can list workflow executions
     *         with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     */
    public java.util.List<String> getTagList() {
        if (tagList == null) {
              tagList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagList.setAutoConstruct(true);
        }
        return tagList;
    }
    
    /**
     * The list of tags to associate with the new workflow execution. A
     * maximum of 5 tags can be specified. You can list workflow executions
     * with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associate with the new workflow execution. A
     *         maximum of 5 tags can be specified. You can list workflow executions
     *         with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
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
     * The list of tags to associate with the new workflow execution. A
     * maximum of 5 tags can be specified. You can list workflow executions
     * with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associate with the new workflow execution. A
     *         maximum of 5 tags can be specified. You can list workflow executions
     *         with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withTagList(String... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<String>(tagList.length));
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags to associate with the new workflow execution. A
     * maximum of 5 tags can be specified. You can list workflow executions
     * with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associate with the new workflow execution. A
     *         maximum of 5 tags can be specified. You can list workflow executions
     *         with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withTagList(java.util.Collection<String> tagList) {
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
     * Returns the value of the WorkflowTypeVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The value of the WorkflowTypeVersion property for this object.
     */
    public String getWorkflowTypeVersion() {
        return workflowTypeVersion;
    }
    
    /**
     * Sets the value of the WorkflowTypeVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param workflowTypeVersion The new value for the WorkflowTypeVersion property for this object.
     */
    public void setWorkflowTypeVersion(String workflowTypeVersion) {
        this.workflowTypeVersion = workflowTypeVersion;
    }
    
    /**
     * Sets the value of the WorkflowTypeVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param workflowTypeVersion The new value for the WorkflowTypeVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes withWorkflowTypeVersion(String workflowTypeVersion) {
        this.workflowTypeVersion = workflowTypeVersion;
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
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getTaskStartToCloseTimeout() != null) sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getTagList() != null) sb.append("TagList: " + getTagList() + ",");
        if (getWorkflowTypeVersion() != null) sb.append("WorkflowTypeVersion: " + getWorkflowTypeVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowTypeVersion() == null) ? 0 : getWorkflowTypeVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContinueAsNewWorkflowExecutionDecisionAttributes == false) return false;
        ContinueAsNewWorkflowExecutionDecisionAttributes other = (ContinueAsNewWorkflowExecutionDecisionAttributes)obj;
        
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
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
        if (other.getWorkflowTypeVersion() == null ^ this.getWorkflowTypeVersion() == null) return false;
        if (other.getWorkflowTypeVersion() != null && other.getWorkflowTypeVersion().equals(this.getWorkflowTypeVersion()) == false) return false; 
        return true;
    }
    
}
    