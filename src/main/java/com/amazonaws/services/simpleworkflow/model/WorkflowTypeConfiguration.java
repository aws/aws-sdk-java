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
 * The configuration settings of a workflow type.
 * </p>
 */
public class WorkflowTypeConfiguration implements Serializable {

    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, that a decision task for executions of this workflow
     * type might take before returning completion or failure. If the task
     * does not close in the specified time then the task is automatically
     * timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden
     * when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskStartToCloseTimeout;

    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, for executions of this workflow type. This default can
     * be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultExecutionStartToCloseTimeout;

    /**
     * The optional default task list, specified when registering the
     * workflow type, for decisions tasks scheduled for workflow executions
     * of this type. This default can be overridden when starting a workflow
     * execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */
    private TaskList defaultTaskList;

    /**
     * The optional default policy to use for the child workflow executions
     * when a workflow execution of this type is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String defaultChildPolicy;

    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, that a decision task for executions of this workflow
     * type might take before returning completion or failure. If the task
     * does not close in the specified time then the task is automatically
     * timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden
     * when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The optional default maximum duration, specified when registering the
     *         workflow type, that a decision task for executions of this workflow
     *         type might take before returning completion or failure. If the task
     *         does not close in the specified time then the task is automatically
     *         timed out and rescheduled. If the decider eventually reports a
     *         completion or failure, it is ignored. This default can be overridden
     *         when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public String getDefaultTaskStartToCloseTimeout() {
        return defaultTaskStartToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, that a decision task for executions of this workflow
     * type might take before returning completion or failure. If the task
     * does not close in the specified time then the task is automatically
     * timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden
     * when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout The optional default maximum duration, specified when registering the
     *         workflow type, that a decision task for executions of this workflow
     *         type might take before returning completion or failure. If the task
     *         does not close in the specified time then the task is automatically
     *         timed out and rescheduled. If the decider eventually reports a
     *         completion or failure, it is ignored. This default can be overridden
     *         when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, that a decision task for executions of this workflow
     * type might take before returning completion or failure. If the task
     * does not close in the specified time then the task is automatically
     * timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden
     * when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout The optional default maximum duration, specified when registering the
     *         workflow type, that a decision task for executions of this workflow
     *         type might take before returning completion or failure. If the task
     *         does not close in the specified time then the task is automatically
     *         timed out and rescheduled. If the decider eventually reports a
     *         completion or failure, it is ignored. This default can be overridden
     *         when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeConfiguration withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
        return this;
    }

    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, for executions of this workflow type. This default can
     * be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The optional default maximum duration, specified when registering the
     *         workflow type, for executions of this workflow type. This default can
     *         be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public String getDefaultExecutionStartToCloseTimeout() {
        return defaultExecutionStartToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, for executions of this workflow type. This default can
     * be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultExecutionStartToCloseTimeout The optional default maximum duration, specified when registering the
     *         workflow type, for executions of this workflow type. This default can
     *         be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public void setDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * workflow type, for executions of this workflow type. This default can
     * be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultExecutionStartToCloseTimeout The optional default maximum duration, specified when registering the
     *         workflow type, for executions of this workflow type. This default can
     *         be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeConfiguration withDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
        return this;
    }

    /**
     * The optional default task list, specified when registering the
     * workflow type, for decisions tasks scheduled for workflow executions
     * of this type. This default can be overridden when starting a workflow
     * execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     *
     * @return The optional default task list, specified when registering the
     *         workflow type, for decisions tasks scheduled for workflow executions
     *         of this type. This default can be overridden when starting a workflow
     *         execution using the <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */
    public TaskList getDefaultTaskList() {
        return defaultTaskList;
    }
    
    /**
     * The optional default task list, specified when registering the
     * workflow type, for decisions tasks scheduled for workflow executions
     * of this type. This default can be overridden when starting a workflow
     * execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     *
     * @param defaultTaskList The optional default task list, specified when registering the
     *         workflow type, for decisions tasks scheduled for workflow executions
     *         of this type. This default can be overridden when starting a workflow
     *         execution using the <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */
    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }
    
    /**
     * The optional default task list, specified when registering the
     * workflow type, for decisions tasks scheduled for workflow executions
     * of this type. This default can be overridden when starting a workflow
     * execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultTaskList The optional default task list, specified when registering the
     *         workflow type, for decisions tasks scheduled for workflow executions
     *         of this type. This default can be overridden when starting a workflow
     *         execution using the <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeConfiguration withDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
        return this;
    }

    /**
     * The optional default policy to use for the child workflow executions
     * when a workflow execution of this type is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return The optional default policy to use for the child workflow executions
     *         when a workflow execution of this type is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public String getDefaultChildPolicy() {
        return defaultChildPolicy;
    }
    
    /**
     * The optional default policy to use for the child workflow executions
     * when a workflow execution of this type is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy The optional default policy to use for the child workflow executions
     *         when a workflow execution of this type is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setDefaultChildPolicy(String defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy;
    }
    
    /**
     * The optional default policy to use for the child workflow executions
     * when a workflow execution of this type is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy The optional default policy to use for the child workflow executions
     *         when a workflow execution of this type is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowTypeConfiguration withDefaultChildPolicy(String defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy;
        return this;
    }

    /**
     * The optional default policy to use for the child workflow executions
     * when a workflow execution of this type is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy The optional default policy to use for the child workflow executions
     *         when a workflow execution of this type is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy.toString();
    }
    
    /**
     * The optional default policy to use for the child workflow executions
     * when a workflow execution of this type is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy The optional default policy to use for the child workflow executions
     *         when a workflow execution of this type is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowTypeConfiguration withDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy.toString();
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
        if (getDefaultTaskStartToCloseTimeout() != null) sb.append("DefaultTaskStartToCloseTimeout: " + getDefaultTaskStartToCloseTimeout() + ",");
        if (getDefaultExecutionStartToCloseTimeout() != null) sb.append("DefaultExecutionStartToCloseTimeout: " + getDefaultExecutionStartToCloseTimeout() + ",");
        if (getDefaultTaskList() != null) sb.append("DefaultTaskList: " + getDefaultTaskList() + ",");
        if (getDefaultChildPolicy() != null) sb.append("DefaultChildPolicy: " + getDefaultChildPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDefaultTaskStartToCloseTimeout() == null) ? 0 : getDefaultTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultExecutionStartToCloseTimeout() == null) ? 0 : getDefaultExecutionStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultTaskList() == null) ? 0 : getDefaultTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultChildPolicy() == null) ? 0 : getDefaultChildPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowTypeConfiguration == false) return false;
        WorkflowTypeConfiguration other = (WorkflowTypeConfiguration)obj;
        
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null) return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false) return false; 
        if (other.getDefaultExecutionStartToCloseTimeout() == null ^ this.getDefaultExecutionStartToCloseTimeout() == null) return false;
        if (other.getDefaultExecutionStartToCloseTimeout() != null && other.getDefaultExecutionStartToCloseTimeout().equals(this.getDefaultExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null) return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false) return false; 
        if (other.getDefaultChildPolicy() == null ^ this.getDefaultChildPolicy() == null) return false;
        if (other.getDefaultChildPolicy() != null && other.getDefaultChildPolicy().equals(this.getDefaultChildPolicy()) == false) return false; 
        return true;
    }
    
}
    