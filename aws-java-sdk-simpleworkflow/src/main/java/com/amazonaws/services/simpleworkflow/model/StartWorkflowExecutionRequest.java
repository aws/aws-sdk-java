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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/StartWorkflowExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartWorkflowExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain in which the workflow execution is created.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The user defined identifier associated with the workflow execution. You can use this to associate a custom
     * identifier with the workflow execution. You may specify the same identifier if a workflow execution is logically
     * a <i>restart</i> of a previous execution. You cannot have two open workflow executions with the same
     * <code>workflowId</code> at the same time.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The type of the workflow to start.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The task list to use for the decision tasks generated for this workflow execution. This overrides the
     * <code>defaultTaskList</code> specified when registering the workflow type.
     * </p>
     * <note>
     * <p>
     * A task list for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default task list was specified at registration time then
     * a fault is returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * The task priority to use for this workflow execution. This overrides any default priority that was assigned when
     * the workflow type was registered. If not set, then the default task priority for the workflow type is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     */
    private String taskPriority;
    /**
     * <p>
     * The input for the workflow execution. This is a free form string which should be meaningful to the workflow you
     * are starting. This <code>input</code> is made available to the new workflow execution in the
     * <code>WorkflowExecutionStarted</code> history event.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified
     * when registering the workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this limit
     * causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon SWF, you cannot
     * specify a value of "NONE" for this timeout; there is a one-year max limit on the time that a workflow execution
     * can run.
     * </p>
     * <note>
     * <p>
     * An execution start-to-close timeout must be specified either through this parameter or as a default when the
     * workflow type is registered. If neither this parameter nor a default execution start-to-close timeout is
     * specified, a fault is returned.
     * </p>
     * </note>
     */
    private String executionStartToCloseTimeout;
    /**
     * <p>
     * The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can list
     * workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     */
    private java.util.List<String> tagList;
    /**
     * <p>
     * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow
     * type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was
     * specified at registration time then a fault is returned.
     * </p>
     * </note>
     */
    private String taskStartToCloseTimeout;
    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     * terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This
     * policy overrides the default child policy specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
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
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     */
    private String childPolicy;
    /**
     * <p>
     * The IAM role to attach to this workflow execution.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM role, any
     * attempt to schedule a Lambda task fails. This results in a <code>ScheduleLambdaFunctionFailed</code> history
     * event. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     * >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     * Guide</i>.
     * </p>
     * </note>
     */
    private String lambdaRole;

    /**
     * <p>
     * The name of the domain in which the workflow execution is created.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which the workflow execution is created.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain in which the workflow execution is created.
     * </p>
     * 
     * @return The name of the domain in which the workflow execution is created.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain in which the workflow execution is created.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which the workflow execution is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The user defined identifier associated with the workflow execution. You can use this to associate a custom
     * identifier with the workflow execution. You may specify the same identifier if a workflow execution is logically
     * a <i>restart</i> of a previous execution. You cannot have two open workflow executions with the same
     * <code>workflowId</code> at the same time.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param workflowId
     *        The user defined identifier associated with the workflow execution. You can use this to associate a custom
     *        identifier with the workflow execution. You may specify the same identifier if a workflow execution is
     *        logically a <i>restart</i> of a previous execution. You cannot have two open workflow executions with the
     *        same <code>workflowId</code> at the same time.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The user defined identifier associated with the workflow execution. You can use this to associate a custom
     * identifier with the workflow execution. You may specify the same identifier if a workflow execution is logically
     * a <i>restart</i> of a previous execution. You cannot have two open workflow executions with the same
     * <code>workflowId</code> at the same time.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The user defined identifier associated with the workflow execution. You can use this to associate a
     *         custom identifier with the workflow execution. You may specify the same identifier if a workflow
     *         execution is logically a <i>restart</i> of a previous execution. You cannot have two open workflow
     *         executions with the same <code>workflowId</code> at the same time.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The user defined identifier associated with the workflow execution. You can use this to associate a custom
     * identifier with the workflow execution. You may specify the same identifier if a workflow execution is logically
     * a <i>restart</i> of a previous execution. You cannot have two open workflow executions with the same
     * <code>workflowId</code> at the same time.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param workflowId
     *        The user defined identifier associated with the workflow execution. You can use this to associate a custom
     *        identifier with the workflow execution. You may specify the same identifier if a workflow execution is
     *        logically a <i>restart</i> of a previous execution. You cannot have two open workflow executions with the
     *        same <code>workflowId</code> at the same time.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The type of the workflow to start.
     * </p>
     * 
     * @param workflowType
     *        The type of the workflow to start.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of the workflow to start.
     * </p>
     * 
     * @return The type of the workflow to start.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of the workflow to start.
     * </p>
     * 
     * @param workflowType
     *        The type of the workflow to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The task list to use for the decision tasks generated for this workflow execution. This overrides the
     * <code>defaultTaskList</code> specified when registering the workflow type.
     * </p>
     * <note>
     * <p>
     * A task list for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default task list was specified at registration time then
     * a fault is returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param taskList
     *        The task list to use for the decision tasks generated for this workflow execution. This overrides the
     *        <code>defaultTaskList</code> specified when registering the workflow type.</p> <note>
     *        <p>
     *        A task list for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default task list was specified at
     *        registration time then a fault is returned.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The task list to use for the decision tasks generated for this workflow execution. This overrides the
     * <code>defaultTaskList</code> specified when registering the workflow type.
     * </p>
     * <note>
     * <p>
     * A task list for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default task list was specified at registration time then
     * a fault is returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The task list to use for the decision tasks generated for this workflow execution. This overrides the
     *         <code>defaultTaskList</code> specified when registering the workflow type.</p> <note>
     *         <p>
     *         A task list for this workflow execution must be specified either as a default for the workflow type or
     *         through this parameter. If neither this parameter is set nor a default task list was specified at
     *         registration time then a fault is returned.
     *         </p>
     *         </note>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The task list to use for the decision tasks generated for this workflow execution. This overrides the
     * <code>defaultTaskList</code> specified when registering the workflow type.
     * </p>
     * <note>
     * <p>
     * A task list for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default task list was specified at registration time then
     * a fault is returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param taskList
     *        The task list to use for the decision tasks generated for this workflow execution. This overrides the
     *        <code>defaultTaskList</code> specified when registering the workflow type.</p> <note>
     *        <p>
     *        A task list for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default task list was specified at
     *        registration time then a fault is returned.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * The task priority to use for this workflow execution. This overrides any default priority that was assigned when
     * the workflow type was registered. If not set, then the default task priority for the workflow type is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        The task priority to use for this workflow execution. This overrides any default priority that was
     *        assigned when the workflow type was registered. If not set, then the default task priority for the
     *        workflow type is used. Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code>
     *        (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * <p>
     * The task priority to use for this workflow execution. This overrides any default priority that was assigned when
     * the workflow type was registered. If not set, then the default task priority for the workflow type is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @return The task priority to use for this workflow execution. This overrides any default priority that was
     *         assigned when the workflow type was registered. If not set, then the default task priority for the
     *         workflow type is used. Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code>
     *         (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher
     *         priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public String getTaskPriority() {
        return this.taskPriority;
    }

    /**
     * <p>
     * The task priority to use for this workflow execution. This overrides any default priority that was assigned when
     * the workflow type was registered. If not set, then the default task priority for the workflow type is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        The task priority to use for this workflow execution. This overrides any default priority that was
     *        assigned when the workflow type was registered. If not set, then the default task priority for the
     *        workflow type is used. Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code>
     *        (-2147483648) to <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * The input for the workflow execution. This is a free form string which should be meaningful to the workflow you
     * are starting. This <code>input</code> is made available to the new workflow execution in the
     * <code>WorkflowExecutionStarted</code> history event.
     * </p>
     * 
     * @param input
     *        The input for the workflow execution. This is a free form string which should be meaningful to the
     *        workflow you are starting. This <code>input</code> is made available to the new workflow execution in the
     *        <code>WorkflowExecutionStarted</code> history event.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input for the workflow execution. This is a free form string which should be meaningful to the workflow you
     * are starting. This <code>input</code> is made available to the new workflow execution in the
     * <code>WorkflowExecutionStarted</code> history event.
     * </p>
     * 
     * @return The input for the workflow execution. This is a free form string which should be meaningful to the
     *         workflow you are starting. This <code>input</code> is made available to the new workflow execution in the
     *         <code>WorkflowExecutionStarted</code> history event.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input for the workflow execution. This is a free form string which should be meaningful to the workflow you
     * are starting. This <code>input</code> is made available to the new workflow execution in the
     * <code>WorkflowExecutionStarted</code> history event.
     * </p>
     * 
     * @param input
     *        The input for the workflow execution. This is a free form string which should be meaningful to the
     *        workflow you are starting. This <code>input</code> is made available to the new workflow execution in the
     *        <code>WorkflowExecutionStarted</code> history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified
     * when registering the workflow type.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this limit
     * causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon SWF, you cannot
     * specify a value of "NONE" for this timeout; there is a one-year max limit on the time that a workflow execution
     * can run.
     * </p>
     * <note>
     * <p>
     * An execution start-to-close timeout must be specified either through this parameter or as a default when the
     * workflow type is registered. If neither this parameter nor a default execution start-to-close timeout is
     * specified, a fault is returned.
     * </p>
     * </note>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout
     *        specified when registering the workflow type.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this
     *        limit causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon
     *        SWF, you cannot specify a value of "NONE" for this timeout; there is a one-year max limit on the time that
     *        a workflow execution can run.
     *        </p>
     *        <note>
     *        <p>
     *        An execution start-to-close timeout must be specified either through this parameter or as a default when
     *        the workflow type is registered. If neither this parameter nor a default execution start-to-close timeout
     *        is specified, a fault is returned.
     *        </p>
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
     * The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this limit
     * causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon SWF, you cannot
     * specify a value of "NONE" for this timeout; there is a one-year max limit on the time that a workflow execution
     * can run.
     * </p>
     * <note>
     * <p>
     * An execution start-to-close timeout must be specified either through this parameter or as a default when the
     * workflow type is registered. If neither this parameter nor a default execution start-to-close timeout is
     * specified, a fault is returned.
     * </p>
     * </note>
     * 
     * @return The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout
     *         specified when registering the workflow type.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this
     *         limit causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon
     *         SWF, you cannot specify a value of "NONE" for this timeout; there is a one-year max limit on the time
     *         that a workflow execution can run.
     *         </p>
     *         <note>
     *         <p>
     *         An execution start-to-close timeout must be specified either through this parameter or as a default when
     *         the workflow type is registered. If neither this parameter nor a default execution start-to-close timeout
     *         is specified, a fault is returned.
     *         </p>
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
     * The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this limit
     * causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon SWF, you cannot
     * specify a value of "NONE" for this timeout; there is a one-year max limit on the time that a workflow execution
     * can run.
     * </p>
     * <note>
     * <p>
     * An execution start-to-close timeout must be specified either through this parameter or as a default when the
     * workflow type is registered. If neither this parameter nor a default execution start-to-close timeout is
     * specified, a fault is returned.
     * </p>
     * </note>
     * 
     * @param executionStartToCloseTimeout
     *        The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout
     *        specified when registering the workflow type.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to <code>0</code>. Exceeding this
     *        limit causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon
     *        SWF, you cannot specify a value of "NONE" for this timeout; there is a one-year max limit on the time that
     *        a workflow execution can run.
     *        </p>
     *        <note>
     *        <p>
     *        An execution start-to-close timeout must be specified either through this parameter or as a default when
     *        the workflow type is registered. If neither this parameter nor a default execution start-to-close timeout
     *        is specified, a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        setExecutionStartToCloseTimeout(executionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can list
     * workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * 
     * @return The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can
     *         list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     */

    public java.util.List<String> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can list
     * workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * 
     * @param tagList
     *        The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can
     *        list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
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
     * The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can list
     * workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can
     *        list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *        <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withTagList(String... tagList) {
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
     * The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can list
     * workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * </p>
     * 
     * @param tagList
     *        The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can
     *        list workflow executions with a specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *        <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withTagList(java.util.Collection<String> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow
     * type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was
     * specified at registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param taskStartToCloseTimeout
     *        Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     *        <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A task start-to-close timeout for this workflow execution must be specified either as a default for the
     *        workflow type or through this parameter. If neither this parameter is set nor a default task
     *        start-to-close timeout was specified at registration time then a fault is returned.
     *        </p>
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
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow
     * type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was
     * specified at registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @return Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides
     *         the <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     *         </p>
     *         <note>
     *         <p>
     *         A task start-to-close timeout for this workflow execution must be specified either as a default for the
     *         workflow type or through this parameter. If neither this parameter is set nor a default task
     *         start-to-close timeout was specified at registration time then a fault is returned.
     *         </p>
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
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow
     * type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was
     * specified at registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param taskStartToCloseTimeout
     *        Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the
     *        <code>defaultTaskStartToCloseTimout</code> specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A task start-to-close timeout for this workflow execution must be specified either as a default for the
     *        workflow type or through this parameter. If neither this parameter is set nor a default task
     *        start-to-close timeout was specified at registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        setTaskStartToCloseTimeout(taskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     * terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This
     * policy overrides the default child policy specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
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
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This policy overrides the default child policy specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @see ChildPolicy
     */

    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     * terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This
     * policy overrides the default child policy specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
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
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @return If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     *         terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *         timeout. This policy overrides the default child policy specified when registering the workflow type
     *         using <a>RegisterWorkflowType</a>.</p>
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
     *         </ul>
     *         <note>
     *         <p>
     *         A child policy for this workflow execution must be specified either as a default for the workflow type or
     *         through this parameter. If neither this parameter is set nor a default child policy was specified at
     *         registration time then a fault is returned.
     *         </p>
     * @see ChildPolicy
     */

    public String getChildPolicy() {
        return this.childPolicy;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     * terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This
     * policy overrides the default child policy specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
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
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This policy overrides the default child policy specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public StartWorkflowExecutionRequest withChildPolicy(String childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     * terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This
     * policy overrides the default child policy specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
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
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This policy overrides the default child policy specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @see ChildPolicy
     */

    public void setChildPolicy(ChildPolicy childPolicy) {
        withChildPolicy(childPolicy);
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     * terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This
     * policy overrides the default child policy specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>.
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
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of this workflow execution if it is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This policy overrides the default child policy specified when registering the workflow type using
     *        <a>RegisterWorkflowType</a>.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public StartWorkflowExecutionRequest withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The IAM role to attach to this workflow execution.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM role, any
     * attempt to schedule a Lambda task fails. This results in a <code>ScheduleLambdaFunctionFailed</code> history
     * event. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     * >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param lambdaRole
     *        The IAM role to attach to this workflow execution.</p> <note>
     *        <p>
     *        Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM
     *        role, any attempt to schedule a Lambda task fails. This results in a
     *        <code>ScheduleLambdaFunctionFailed</code> history event. For more information, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     *        >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF
     *        Developer Guide</i>.
     *        </p>
     */

    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }

    /**
     * <p>
     * The IAM role to attach to this workflow execution.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM role, any
     * attempt to schedule a Lambda task fails. This results in a <code>ScheduleLambdaFunctionFailed</code> history
     * event. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     * >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @return The IAM role to attach to this workflow execution.</p> <note>
     *         <p>
     *         Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM
     *         role, any attempt to schedule a Lambda task fails. This results in a
     *         <code>ScheduleLambdaFunctionFailed</code> history event. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     *         >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF
     *         Developer Guide</i>.
     *         </p>
     */

    public String getLambdaRole() {
        return this.lambdaRole;
    }

    /**
     * <p>
     * The IAM role to attach to this workflow execution.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM role, any
     * attempt to schedule a Lambda task fails. This results in a <code>ScheduleLambdaFunctionFailed</code> history
     * event. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     * >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param lambdaRole
     *        The IAM role to attach to this workflow execution.</p> <note>
     *        <p>
     *        Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM
     *        role, any attempt to schedule a Lambda task fails. This results in a
     *        <code>ScheduleLambdaFunctionFailed</code> history event. For more information, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html"
     *        >http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF
     *        Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkflowExecutionRequest withLambdaRole(String lambdaRole) {
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getTaskList() != null)
            sb.append("TaskList: ").append(getTaskList()).append(",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: ").append(getTaskPriority()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getExecutionStartToCloseTimeout() != null)
            sb.append("ExecutionStartToCloseTimeout: ").append(getExecutionStartToCloseTimeout()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getTaskStartToCloseTimeout() != null)
            sb.append("TaskStartToCloseTimeout: ").append(getTaskStartToCloseTimeout()).append(",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: ").append(getChildPolicy()).append(",");
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

        if (obj instanceof StartWorkflowExecutionRequest == false)
            return false;
        StartWorkflowExecutionRequest other = (StartWorkflowExecutionRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null)
            return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null)
            return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null)
            return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false)
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

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public StartWorkflowExecutionRequest clone() {
        return (StartWorkflowExecutionRequest) super.clone();
    }

}
