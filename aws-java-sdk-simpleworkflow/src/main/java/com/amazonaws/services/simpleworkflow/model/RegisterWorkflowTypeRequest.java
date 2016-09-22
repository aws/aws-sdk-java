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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
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
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>The workflow type consists of the name and version, the combination of which must be unique within the
     * domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
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
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String defaultTaskStartToCloseTimeout;
    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> action or
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit will always cause the workflow execution to time out.
     * </p>
     */
    private String defaultExecutionStartToCloseTimeout;
    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     * </p>
     */
    private TaskList defaultTaskList;
    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     */
    private String defaultTaskPriority;
    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.
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
    private String defaultChildPolicy;
    /**
     * <p>
     * The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda functions.
     * </p>
     * <p>
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code> decision.
     * </p>
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
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param name
     *        The name of the workflow type.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *        \u009f). Also, it must not contain the literal string quotarnquot.
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
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return The name of the workflow type.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f
     *         - \u009f). Also, it must not contain the literal string quotarnquot.
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
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param name
     *        The name of the workflow type.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *        \u009f). Also, it must not contain the literal string quotarnquot.
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
     * <note>The workflow type consists of the name and version, the combination of which must be unique within the
     * domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param version
     *        The version of the workflow type.</p> <note>The workflow type consists of the name and version, the
     *        combination of which must be unique within the domain. To get a list of all currently registered workflow
     *        types, use the <a>ListWorkflowTypes</a> action.</note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *        \u009f). Also, it must not contain the literal string quotarnquot.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>The workflow type consists of the name and version, the combination of which must be unique within the
     * domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @return The version of the workflow type.</p> <note>The workflow type consists of the name and version, the
     *         combination of which must be unique within the domain. To get a list of all currently registered workflow
     *         types, use the <a>ListWorkflowTypes</a> action.</note>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f
     *         - \u009f). Also, it must not contain the literal string quotarnquot.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the workflow type.
     * </p>
     * <note>The workflow type consists of the name and version, the combination of which must be unique within the
     * domain. To get a list of all currently registered workflow types, use the <a>ListWorkflowTypes</a> action.</note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string quotarnquot.
     * </p>
     * 
     * @param version
     *        The version of the workflow type.</p> <note>The workflow type consists of the name and version, the
     *        combination of which must be unique within the domain. To get a list of all currently registered workflow
     *        types, use the <a>ListWorkflowTypes</a> action.</note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *        \u009f). Also, it must not contain the literal string quotarnquot.
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
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        If set, specifies the default maximum duration of decision tasks for this workflow type. This default can
     *        be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     *        <code>StartChildWorkflowExecution</code> decision.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     */

    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be
     * overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the default maximum duration of decision tasks for this workflow type. This default can
     *         be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     *         <code>StartChildWorkflowExecution</code> decision.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *         to specify unlimited duration.
     */

    public String getDefaultTaskStartToCloseTimeout() {
        return this.defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be
     * overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        If set, specifies the default maximum duration of decision tasks for this workflow type. This default can
     *        be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     *        <code>StartChildWorkflowExecution</code> decision.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used
     *        to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        setDefaultTaskStartToCloseTimeout(defaultTaskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> action or
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit will always cause the workflow execution to time out.
     * </p>
     * 
     * @param defaultExecutionStartToCloseTimeout
     *        If set, specifies the default maximum duration for executions of this workflow type. You can override this
     *        default when starting an execution through the <a>StartWorkflowExecution</a> action or
     *        <code>StartChildWorkflowExecution</code> decision.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other
     *        timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *        <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a
     *        workflow execution can run. Exceeding this limit will always cause the workflow execution to time out.
     */

    public void setDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> action or
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit will always cause the workflow execution to time out.
     * </p>
     * 
     * @return If set, specifies the default maximum duration for executions of this workflow type. You can override
     *         this default when starting an execution through the <a>StartWorkflowExecution</a> action or
     *         <code>StartChildWorkflowExecution</code> decision.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other
     *         timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a
     *         workflow execution can run. Exceeding this limit will always cause the workflow execution to time out.
     */

    public String getDefaultExecutionStartToCloseTimeout() {
        return this.defaultExecutionStartToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the default maximum duration for executions of this workflow type. You can override this
     * default when starting an execution through the <a>StartWorkflowExecution</a> action or
     * <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a workflow
     * execution can run. Exceeding this limit will always cause the workflow execution to time out.
     * </p>
     * 
     * @param defaultExecutionStartToCloseTimeout
     *        If set, specifies the default maximum duration for executions of this workflow type. You can override this
     *        default when starting an execution through the <a>StartWorkflowExecution</a> action or
     *        <code>StartChildWorkflowExecution</code> decision.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other
     *        timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *        <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year max limit on the time that a
     *        workflow execution can run. Exceeding this limit will always cause the workflow execution to time out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        setDefaultExecutionStartToCloseTimeout(defaultExecutionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * 
     * @param defaultTaskList
     *        If set, specifies the default task list to use for scheduling decision tasks for executions of this
     *        workflow type. This default is used only if a task list is not provided when starting the execution
     *        through the <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     */

    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * 
     * @return If set, specifies the default task list to use for scheduling decision tasks for executions of this
     *         workflow type. This default is used only if a task list is not provided when starting the execution
     *         through the <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     */

    public TaskList getDefaultTaskList() {
        return this.defaultTaskList;
    }

    /**
     * <p>
     * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow
     * type. This default is used only if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * 
     * @param defaultTaskList
     *        If set, specifies the default task list to use for scheduling decision tasks for executions of this
     *        workflow type. This default is used only if a task list is not provided when starting the execution
     *        through the <a>StartWorkflowExecution</a> action or <code>StartChildWorkflowExecution</code> decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultTaskList(TaskList defaultTaskList) {
        setDefaultTaskList(defaultTaskList);
        return this;
    }

    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid
     *        values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     */

    public void setDefaultTaskPriority(String defaultTaskPriority) {
        this.defaultTaskPriority = defaultTaskPriority;
    }

    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @return The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid
     *         values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     */

    public String getDefaultTaskPriority() {
        return this.defaultTaskPriority;
    }

    /**
     * <p>
     * The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority to assign to the workflow type. If not assigned, then "0" will be used. Valid
     *        values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
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
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
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

    public void setDefaultChildPolicy(String defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.
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
     * @return If set, specifies the default policy to use for the child workflow executions when a workflow execution
     *         of this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to
     *         an expired timeout. This default can be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
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

    public String getDefaultChildPolicy() {
        return this.defaultChildPolicy;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
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

    public RegisterWorkflowTypeRequest withDefaultChildPolicy(String defaultChildPolicy) {
        setDefaultChildPolicy(defaultChildPolicy);
        return this;
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
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

    public void setDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy.toString();
    }

    /**
     * <p>
     * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this
     * type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     * timeout. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.
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
     * @param defaultChildPolicy
     *        If set, specifies the default policy to use for the child workflow executions when a workflow execution of
     *        this type is terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *        expired timeout. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
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

    public RegisterWorkflowTypeRequest withDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        setDefaultChildPolicy(defaultChildPolicy);
        return this;
    }

    /**
     * <p>
     * The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda functions.
     * </p>
     * <p>
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code> decision.
     * </p>
     * 
     * @param defaultLambdaRole
     *        The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda
     *        functions.</p>
     *        <p>
     *        This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     *        action or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>
     *        decision.
     */

    public void setDefaultLambdaRole(String defaultLambdaRole) {
        this.defaultLambdaRole = defaultLambdaRole;
    }

    /**
     * <p>
     * The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda functions.
     * </p>
     * <p>
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code> decision.
     * </p>
     * 
     * @return The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda
     *         functions.</p>
     *         <p>
     *         This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     *         action or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>
     *         decision.
     */

    public String getDefaultLambdaRole() {
        return this.defaultLambdaRole;
    }

    /**
     * <p>
     * The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda functions.
     * </p>
     * <p>
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code> decision.
     * </p>
     * 
     * @param defaultLambdaRole
     *        The ARN of the default IAM role to use when a workflow execution of this type invokes AWS Lambda
     *        functions.</p>
     *        <p>
     *        This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     *        action or the <code>StartChildWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>
     *        decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWorkflowTypeRequest withDefaultLambdaRole(String defaultLambdaRole) {
        setDefaultLambdaRole(defaultLambdaRole);
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefaultTaskStartToCloseTimeout() != null)
            sb.append("DefaultTaskStartToCloseTimeout: " + getDefaultTaskStartToCloseTimeout() + ",");
        if (getDefaultExecutionStartToCloseTimeout() != null)
            sb.append("DefaultExecutionStartToCloseTimeout: " + getDefaultExecutionStartToCloseTimeout() + ",");
        if (getDefaultTaskList() != null)
            sb.append("DefaultTaskList: " + getDefaultTaskList() + ",");
        if (getDefaultTaskPriority() != null)
            sb.append("DefaultTaskPriority: " + getDefaultTaskPriority() + ",");
        if (getDefaultChildPolicy() != null)
            sb.append("DefaultChildPolicy: " + getDefaultChildPolicy() + ",");
        if (getDefaultLambdaRole() != null)
            sb.append("DefaultLambdaRole: " + getDefaultLambdaRole());
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
