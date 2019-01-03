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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterWorkflowType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterWorkflowTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain in which to register the workflow type.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the workflow type.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>
     * <p>
     * The workflow type consists of the name and version, the combination of which must be unique within the domain. To
     * get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Textual description of the workflow type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be
     * overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultTaskStartToCloseTimeout;
    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit always causes the workflow execution to time out.
     * </p>
     */
    private String defaultExecutionStartToCloseTimeout;
    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list isn't provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     */
    private TaskList defaultTaskList;
    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     */
    private String defaultTaskPriority;
    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
    private String defaultChildPolicy;
    /**
     * <p>
     * The default IAM role attached to this workflow type.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when
     * you start this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     */
    private String defaultLambdaRole;

    /**
     * <p>
     * The name of the domain in which to register the workflow type.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which to register the workflow type.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain in which to register the workflow type.
     * </p>
     * 
     * @return The name of the domain in which to register the workflow type.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain in which to register the workflow type.
     * </p>
     * 
     * @param domain
     *        The name of the domain in which to register the workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the workflow type.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param name
     *        The name of the workflow type.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow type.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The name of the workflow type.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow type.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param name
     *        The name of the workflow type.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>
     * <p>
     * The workflow type consists of the name and version, the combination of which must be unique within the domain. To
     * get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param version
     *        The version of the workflow type.</p> <note>
     *        <p>
     *        The workflow type consists of the name and version, the combination of which must be unique within the
     *        domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>
     * <p>
     * The workflow type consists of the name and version, the combination of which must be unique within the domain. To
     * get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The version of the workflow type.</p> <note>
     *         <p>
     *         The workflow type consists of the name and version, the combination of which must be unique within the
     *         domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a>
     *         action.
     *         </p>
     *         </note>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>
     * <p>
     * The workflow type consists of the name and version, the combination of which must be unique within the domain. To
     * get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param version
     *        The version of the workflow type.</p> <note>
     *        <p>
     *        The workflow type consists of the name and version, the combination of which must be unique within the
     *        domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Textual description of the workflow type.
     * </p>
     * 
     * @param description
     *        Textual description of the workflow type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Textual description of the workflow type.
     * </p>
     * 
     * @return Textual description of the workflow type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Textual description of the workflow type.
     * </p>
     * 
     * @param description
     *        Textual description of the workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be
     * overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        If set, specifies the default maximum duration of decision tasks for this workflow type. This default can
     *        be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be
     * overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the default maximum duration of decision tasks for this workflow type. This default can
     *         be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getDefaultTaskStartToCloseTimeout() {
        return this.defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be
     * overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        If set, specifies the default maximum duration of decision tasks for this workflow type. This default can
     *        be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        setDefaultTaskStartToCloseTimeout(defaultTaskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit always causes the workflow execution to time out.
     * </p>
     * 
     * @param defaultExecutionStartToCloseTimeout
     *        If set, specifies the default maximum duration for executions of this workflow type. You can override this
     *        default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other
     *        timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *        <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a
     *        workflow execution can run. Exceeding this limit always causes the workflow execution to time out.
     */

    public void setDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit always causes the workflow execution to time out.
     * </p>
     * 
     * @return If set, specifies the default maximum duration for executions of this workflow type. You can override
     *         this default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other
     *         timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a
     *         workflow execution can run. Exceeding this limit always causes the workflow execution to time out.
     */

    public String getDefaultExecutionStartToCloseTimeout() {
        return this.defaultExecutionStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit always causes the workflow execution to time out.
     * </p>
     * 
     * @param defaultExecutionStartToCloseTimeout
     *        If set, specifies the default maximum duration for executions of this workflow type. You can override this
     *        default when starting an execution through the <a>StartWorkflowExecution</a> Action or
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other
     *        timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *        <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a
     *        workflow execution can run. Exceeding this limit always causes the workflow execution to time out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        setDefaultExecutionStartToCloseTimeout(defaultExecutionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list isn't provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * 
     * @param defaultTaskList
     *        If set, specifies the default task list to use for scheduling decision tasks for executions of this
     *        workflow type. This default is used only if a task list isn't provided when starting the execution through
     *        the <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */

    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list isn't provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * 
     * @return If set, specifies the default task list to use for scheduling decision tasks for executions of this
     *         workflow type. This default is used only if a task list isn't provided when starting the execution
     *         through the <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a>.
     */

    public TaskList getDefaultTaskList() {
        return this.defaultTaskList;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list isn't provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * 
     * @param defaultTaskList
     *        If set, specifies the default task list to use for scheduling decision tasks for executions of this
     *        workflow type. This default is used only if a task list isn't provided when starting the execution through
     *        the <a>StartWorkflowExecution</a> Action or <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultTaskList(TaskList defaultTaskList) {
        setDefaultTaskList(defaultTaskList);
        return this;
    }

    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used.
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public void setDefaultTaskPriority(String defaultTaskPriority) {
        this.defaultTaskPriority = defaultTaskPriority;
    }

    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @return The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used.
     *         Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     */

    public String getDefaultTaskPriority() {
        return this.defaultTaskPriority;
    }

    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used. Valid
     * values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority to assign to the workflow type. If not assigned, then <code>0</code> is used.
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultTaskPriority(String defaultTaskPriority) {
        setDefaultTaskPriority(defaultTaskPriority);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
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

    public void setDefaultChildPolicy(String defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * @return If set, specifies the default policy to use for the child workflow executions when a workflow execution
     *         of this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to
     *         an expired timeout. This default can be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
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

    public String getDefaultChildPolicy() {
        return this.defaultChildPolicy;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
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

    public RegisterWorkflowTypeRequest withDefaultChildPolicy(String defaultChildPolicy) {
        setDefaultChildPolicy(defaultChildPolicy);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
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

    public void setDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        withDefaultChildPolicy(defaultChildPolicy);
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
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

    public RegisterWorkflowTypeRequest withDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The default IAM role attached to this workflow type.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when
     * you start this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param defaultLambdaRole
     *        The default IAM role attached to this workflow type.</p> <note>
     *        <p>
     *        Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM
     *        role when you start this workflow type, the default Lambda role is attached to the execution. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http
     *        ://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     *        Guide</i>.
     *        </p>
     */

    public void setDefaultLambdaRole(String defaultLambdaRole) {
        this.defaultLambdaRole = defaultLambdaRole;
    }

    /**
     * <p>
     * The default IAM role attached to this workflow type.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when
     * you start this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The default IAM role attached to this workflow type.</p> <note>
     *         <p>
     *         Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM
     *         role when you start this workflow type, the default Lambda role is attached to the execution. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http
     *         ://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF
     *         Developer Guide</i>.
     *         </p>
     */

    public String getDefaultLambdaRole() {
        return this.defaultLambdaRole;
    }

    /**
     * <p>
     * The default IAM role attached to this workflow type.
     * </p>
     * <note>
     * <p>
     * Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when
     * you start this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param defaultLambdaRole
     *        The default IAM role attached to this workflow type.</p> <note>
     *        <p>
     *        Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM
     *        role when you start this workflow type, the default Lambda role is attached to the execution. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http
     *        ://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultLambdaRole(String defaultLambdaRole) {
        setDefaultLambdaRole(defaultLambdaRole);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultTaskStartToCloseTimeout() != null)
            sb.append("DefaultTaskStartToCloseTimeout: ").append(getDefaultTaskStartToCloseTimeout()).append(",");
        if (getDefaultExecutionStartToCloseTimeout() != null)
            sb.append("DefaultExecutionStartToCloseTimeout: ").append(getDefaultExecutionStartToCloseTimeout()).append(",");
        if (getDefaultTaskList() != null)
            sb.append("DefaultTaskList: ").append(getDefaultTaskList()).append(",");
        if (getDefaultTaskPriority() != null)
            sb.append("DefaultTaskPriority: ").append(getDefaultTaskPriority()).append(",");
        if (getDefaultChildPolicy() != null)
            sb.append("DefaultChildPolicy: ").append(getDefaultChildPolicy()).append(",");
        if (getDefaultLambdaRole() != null)
            sb.append("DefaultLambdaRole: ").append(getDefaultLambdaRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterWorkflowTypeRequest == false)
            return false;
        RegisterWorkflowTypeRequest other = (RegisterWorkflowTypeRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null)
            return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null
                && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false)
            return false;
        if (other.getDefaultExecutionStartToCloseTimeout() == null ^ this.getDefaultExecutionStartToCloseTimeout() == null)
            return false;
        if (other.getDefaultExecutionStartToCloseTimeout() != null
                && other.getDefaultExecutionStartToCloseTimeout().equals(this.getDefaultExecutionStartToCloseTimeout()) == false)
            return false;
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null)
            return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false)
            return false;
        if (other.getDefaultTaskPriority() == null ^ this.getDefaultTaskPriority() == null)
            return false;
        if (other.getDefaultTaskPriority() != null && other.getDefaultTaskPriority().equals(this.getDefaultTaskPriority()) == false)
            return false;
        if (other.getDefaultChildPolicy() == null ^ this.getDefaultChildPolicy() == null)
            return false;
        if (other.getDefaultChildPolicy() != null && other.getDefaultChildPolicy().equals(this.getDefaultChildPolicy()) == false)
            return false;
        if (other.getDefaultLambdaRole() == null ^ this.getDefaultLambdaRole() == null)
            return false;
        if (other.getDefaultLambdaRole() != null && other.getDefaultLambdaRole().equals(this.getDefaultLambdaRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskStartToCloseTimeout() == null) ? 0 : getDefaultTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultExecutionStartToCloseTimeout() == null) ? 0 : getDefaultExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskList() == null) ? 0 : getDefaultTaskList().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskPriority() == null) ? 0 : getDefaultTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getDefaultChildPolicy() == null) ? 0 : getDefaultChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getDefaultLambdaRole() == null) ? 0 : getDefaultLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public RegisterWorkflowTypeRequest clone() {
        return (RegisterWorkflowTypeRequest) super.clone();
    }

}
