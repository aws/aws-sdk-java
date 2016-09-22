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
 * Provides details of the <code>StartChildWorkflowExecution</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>tagList.member.N</code>: The key is "swf:tagList.N" where N is the tag number from 0 to 4, inclusive.</li>
 * <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li>
 * <li><code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.</li>
 * <li><code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.</li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
 * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a>.
 * </p>
 */
public class StartChildWorkflowExecutionDecisionAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * <b>Required.</b> The type of the workflow execution to be started.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks. This
     * data is not sent to the child workflow execution.
     * </p>
     */
    private String control;
    /**
     * <p>
     * The input to be provided to the workflow execution.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified
     * when registering the workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>An execution start-to-close timeout for this workflow execution must be specified either as a default for
     * the workflow type or through this parameter. If neither this parameter is set nor a default execution
     * start-to-close timeout was specified at registration time then a fault will be returned.</note>
     */
    private String executionStartToCloseTimeout;
    /**
     * <p>
     * The name of the task list to be used for decision tasks of the child workflow execution.
     * </p>
     * <note>A task list for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default task list was specified at registration
     * time then a fault will be returned.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * <i>Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     * execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are
     * integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     * (2147483647). Higher numbers indicate higher priority.
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
     * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>A task start-to-close timeout for this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be returned.</note>
     */
    private String taskStartToCloseTimeout;
    /**
     * <p>
     * <i>Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow execution
     * being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy specified when registering the workflow type
     * using <a>RegisterWorkflowType</a>.
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
     * <note>A child policy for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default child policy was specified at registration
     * time then a fault will be returned.</note>
     */
    private String childPolicy;
    /**
     * <p>
     * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can
     * list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     */
    private java.util.List<String> tagList;
    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.
     * </p>
     * <note>In order for this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be
     * specified either as a default for the workflow type or through this field.</note>
     */
    private String lambdaRole;

    /**
     * <p>
     * <b>Required.</b> The type of the workflow execution to be started.
     * </p>
     * 
     * @param workflowType
     *        Required.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * <b>Required.</b> The type of the workflow execution to be started.
     * </p>
     * 
     * @return Required.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * <b>Required.</b> The type of the workflow execution to be started.
     * </p>
     * 
     * @param workflowType
     *        Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param workflowId
     *        Required.</b> The <code>workflowId</code> of the workflow execution.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return Required.</b> The <code>workflowId</code> of the workflow execution.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param workflowId
     *        Required.</b> The <code>workflowId</code> of the workflow execution.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks. This
     * data is not sent to the child workflow execution.
     * </p>
     * 
     * @param control
     *        Optional.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks. This
     * data is not sent to the child workflow execution.
     * </p>
     * 
     * @return Optional.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks. This
     * data is not sent to the child workflow execution.
     * </p>
     * 
     * @param control
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * The input to be provided to the workflow execution.
     * </p>
     * 
     * @param input
     *        The input to be provided to the workflow execution.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input to be provided to the workflow execution.
     * </p>
     * 
     * @return The input to be provided to the workflow execution.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input to be provided to the workflow execution.
     * </p>
     * 
     * @param input
     *        The input to be provided to the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified
     * when registering the workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>An execution start-to-close timeout for this workflow execution must be specified either as a default for
     * the workflow type or through this parameter. If neither this parameter is set nor a default execution
     * start-to-close timeout was specified at registration time then a fault will be returned.</note>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout
     *        specified when registering the workflow type.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     *        </p>
     *        <note>An execution start-to-close timeout for this workflow execution must be specified either as a
     *        default for the workflow type or through this parameter. If neither this parameter is set nor a default
     *        execution start-to-close timeout was specified at registration time then a fault will be returned.
     */

    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified
     * when registering the workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>An execution start-to-close timeout for this workflow execution must be specified either as a default for
     * the workflow type or through this parameter. If neither this parameter is set nor a default execution
     * start-to-close timeout was specified at registration time then a fault will be returned.</note>
     * 
     * @return The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout
     *         specified when registering the workflow type.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     *         </p>
     *         <note>An execution start-to-close timeout for this workflow execution must be specified either as a
     *         default for the workflow type or through this parameter. If neither this parameter is set nor a default
     *         execution start-to-close timeout was specified at registration time then a fault will be returned.
     */

    public String getExecutionStartToCloseTimeout() {
        return this.executionStartToCloseTimeout;
    }

    /**
     * <p>
     * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified
     * when registering the workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>An execution start-to-close timeout for this workflow execution must be specified either as a default for
     * the workflow type or through this parameter. If neither this parameter is set nor a default execution
     * start-to-close timeout was specified at registration time then a fault will be returned.</note>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout
     *        specified when registering the workflow type.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     *        </p>
     *        <note>An execution start-to-close timeout for this workflow execution must be specified either as a
     *        default for the workflow type or through this parameter. If neither this parameter is set nor a default
     *        execution start-to-close timeout was specified at registration time then a fault will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        setExecutionStartToCloseTimeout(executionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The name of the task list to be used for decision tasks of the child workflow execution.
     * </p>
     * <note>A task list for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default task list was specified at registration
     * time then a fault will be returned.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param taskList
     *        The name of the task list to be used for decision tasks of the child workflow execution.</p> <note>A task
     *        list for this workflow execution must be specified either as a default for the workflow type or through
     *        this parameter. If neither this parameter is set nor a default task list was specified at registration
     *        time then a fault will be returned.</note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *        \u009f). Also, it must not contain the literal string quotarnquot.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The name of the task list to be used for decision tasks of the child workflow execution.
     * </p>
     * <note>A task list for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default task list was specified at registration
     * time then a fault will be returned.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return The name of the task list to be used for decision tasks of the child workflow execution.</p> <note>A task
     *         list for this workflow execution must be specified either as a default for the workflow type or through
     *         this parameter. If neither this parameter is set nor a default task list was specified at registration
     *         time then a fault will be returned.</note>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f
     *         - \u009f). Also, it must not contain the literal string quotarnquot.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The name of the task list to be used for decision tasks of the child workflow execution.
     * </p>
     * <note>A task list for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default task list was specified at registration
     * time then a fault will be returned.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param taskList
     *        The name of the task list to be used for decision tasks of the child workflow execution.</p> <note>A task
     *        list for this workflow execution must be specified either as a default for the workflow type or through
     *        this parameter. If neither this parameter is set nor a default task list was specified at registration
     *        time then a fault will be returned.</note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *        \u009f). Also, it must not contain the literal string quotarnquot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     * execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are
     * integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     * (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     *        execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid
     *        values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide
     */

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * <p>
     * <i>Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     * execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are
     * integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     * (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @return Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     *         execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid
     *         values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon Simple Workflow Developer Guide
     */

    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * <p>
     * <i>Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     * execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are
     * integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to <code>Integer.MAX_VALUE</code>
     * (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        Optional.</i> A task priority that, if set, specifies the priority for a decision task of this workflow
     *        execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid
     *        values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>A task start-to-close timeout for this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be returned.</note>
     * 
     * @param taskStartToCloseTimeout
     *        Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     *        <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     *        </p>
     *        <note>A task start-to-close timeout for this workflow execution must be specified either as a default for
     *        the workflow type or through this parameter. If neither this parameter is set nor a default task
     *        start-to-close timeout was specified at registration time then a fault will be returned.
     */

    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }

    /**
     * <p>
     * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>A task start-to-close timeout for this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be returned.</note>
     * 
     * @return Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides
     *         the <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     *         </p>
     *         <note>A task start-to-close timeout for this workflow execution must be specified either as a default for
     *         the workflow type or through this parameter. If neither this parameter is set nor a default task
     *         start-to-close timeout was specified at registration time then a fault will be returned.
     */

    public String getTaskStartToCloseTimeout() {
        return this.taskStartToCloseTimeout;
    }

    /**
     * <p>
     * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * <note>A task start-to-close timeout for this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be returned.</note>
     * 
     * @param taskStartToCloseTimeout
     *        Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     *        <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     *        </p>
     *        <note>A task start-to-close timeout for this workflow execution must be specified either as a default for
     *        the workflow type or through this parameter. If neither this parameter is set nor a default task
     *        start-to-close timeout was specified at registration time then a fault will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        setTaskStartToCloseTimeout(taskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow execution
     * being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy specified when registering the workflow type
     * using <a>RegisterWorkflowType</a>.
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
     * <note>A child policy for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default child policy was specified at registration
     * time then a fault will be returned.</note>
     * 
     * @param childPolicy
     *        Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow
     *        execution being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly
     *        or due to an expired timeout. This policy overrides the default child policy specified when registering
     *        the workflow type using <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     *        </ul>
     * @see ChildPolicy
     */

    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }

    /**
     * <p>
     * <i>Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow execution
     * being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy specified when registering the workflow type
     * using <a>RegisterWorkflowType</a>.
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
     * <note>A child policy for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default child policy was specified at registration
     * time then a fault will be returned.</note>
     * 
     * @return Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow
     *         execution being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly
     *         or due to an expired timeout. This policy overrides the default child policy specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>.</p>
     *         <p>
     *         The supported child policies are:
     *         </p>
     *         <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *         appropriate actions when it receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     *         </ul>
     * @see ChildPolicy
     */

    public String getChildPolicy() {
        return this.childPolicy;
    }

    /**
     * <p>
     * <i>Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow execution
     * being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy specified when registering the workflow type
     * using <a>RegisterWorkflowType</a>.
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
     * <note>A child policy for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default child policy was specified at registration
     * time then a fault will be returned.</note>
     * 
     * @param childPolicy
     *        Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow
     *        execution being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly
     *        or due to an expired timeout. This policy overrides the default child policy specified when registering
     *        the workflow type using <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public StartChildWorkflowExecutionDecisionAttributes withChildPolicy(String childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow execution
     * being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy specified when registering the workflow type
     * using <a>RegisterWorkflowType</a>.
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
     * <note>A child policy for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default child policy was specified at registration
     * time then a fault will be returned.</note>
     * 
     * @param childPolicy
     *        Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow
     *        execution being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly
     *        or due to an expired timeout. This policy overrides the default child policy specified when registering
     *        the workflow type using <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     *        </ul>
     * @see ChildPolicy
     */

    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }

    /**
     * <p>
     * <i>Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow execution
     * being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy specified when registering the workflow type
     * using <a>RegisterWorkflowType</a>.
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
     * <note>A child policy for this workflow execution must be specified either as a default for the workflow type or
     * through this parameter. If neither this parameter is set nor a default child policy was specified at registration
     * time then a fault will be returned.</note>
     * 
     * @param childPolicy
     *        Optional.</i> If set, specifies the policy to use for the child workflow executions if the workflow
     *        execution being started is terminated by calling the <a>TerminateWorkflowExecution</a> action explicitly
     *        or due to an expired timeout. This policy overrides the default child policy specified when registering
     *        the workflow type using <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public StartChildWorkflowExecutionDecisionAttributes withChildPolicy(ChildPolicy childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can
     * list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * 
     * @return The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified.
     *         You can list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     */

    public java.util.List<String> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can
     * list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * 
     * @param tagList
     *        The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You
     *        can list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *        <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
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
     * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can
     * list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You
     *        can list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *        <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withTagList(String... tagList) {
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
     * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can
     * list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * 
     * @param tagList
     *        The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You
     *        can list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *        <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withTagList(java.util.Collection<String> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.
     * </p>
     * <note>In order for this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be
     * specified either as a default for the workflow type or through this field.</note>
     * 
     * @param lambdaRole
     *        The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.</p> <note>In order for
     *        this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be specified either
     *        as a default for the workflow type or through this field.
     */

    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.
     * </p>
     * <note>In order for this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be
     * specified either as a default for the workflow type or through this field.</note>
     * 
     * @return The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.</p> <note>In order for
     *         this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be specified either
     *         as a default for the workflow type or through this field.
     */

    public String getLambdaRole() {
        return this.lambdaRole;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.
     * </p>
     * <note>In order for this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be
     * specified either as a default for the workflow type or through this field.</note>
     * 
     * @param lambdaRole
     *        The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda functions.</p> <note>In order for
     *        this workflow execution to invoke AWS Lambda functions, an appropriate IAM role must be specified either
     *        as a default for the workflow type or through this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartChildWorkflowExecutionDecisionAttributes withLambdaRole(String lambdaRole) {
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
        if (getWorkflowType() != null)
            sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getControl() != null)
            sb.append("Control: " + getControl() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getExecutionStartToCloseTimeout() != null)
            sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTaskList() != null)
            sb.append("TaskList: " + getTaskList() + ",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: " + getTaskPriority() + ",");
        if (getTaskStartToCloseTimeout() != null)
            sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getTagList() != null)
            sb.append("TagList: " + getTagList() + ",");
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

        if (obj instanceof StartChildWorkflowExecutionDecisionAttributes == false)
            return false;
        StartChildWorkflowExecutionDecisionAttributes other = (StartChildWorkflowExecutionDecisionAttributes) obj;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
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

        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public StartChildWorkflowExecutionDecisionAttributes clone() {
        try {
            return (StartChildWorkflowExecutionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
