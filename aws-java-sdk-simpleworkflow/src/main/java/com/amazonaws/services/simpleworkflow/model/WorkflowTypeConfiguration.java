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
 * The configuration settings of a workflow type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowTypeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowTypeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default maximum duration, specified when registering the workflow type, that a decision task for executions
     * of this workflow type might take before returning completion or failure. If the task doesn'tdo close in the
     * specified time then the task is automatically timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultTaskStartToCloseTimeout;
    /**
     * <p>
     * The default maximum duration, specified when registering the workflow type, for executions of this workflow type.
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String defaultExecutionStartToCloseTimeout;
    /**
     * <p>
     * The default task list, specified when registering the workflow type, for decisions tasks scheduled for workflow
     * executions of this type. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     */
    private TaskList defaultTaskList;
    /**
     * <p>
     * The default task priority, specified when registering the workflow type, for all decision tasks of this workflow
     * type. This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     * action or the <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
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
     * The default policy to use for the child workflow executions when a workflow execution of this type is terminated,
     * by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This default can
     * be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * starting this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     */
    private String defaultLambdaRole;

    /**
     * <p>
     * The default maximum duration, specified when registering the workflow type, that a decision task for executions
     * of this workflow type might take before returning completion or failure. If the task doesn'tdo close in the
     * specified time then the task is automatically timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        The default maximum duration, specified when registering the workflow type, that a decision task for
     *        executions of this workflow type might take before returning completion or failure. If the task doesn'tdo
     *        close in the specified time then the task is automatically timed out and rescheduled. If the decider
     *        eventually reports a completion or failure, it is ignored. This default can be overridden when starting a
     *        workflow execution using the <a>StartWorkflowExecution</a> action or the
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
     * The default maximum duration, specified when registering the workflow type, that a decision task for executions
     * of this workflow type might take before returning completion or failure. If the task doesn'tdo close in the
     * specified time then the task is automatically timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return The default maximum duration, specified when registering the workflow type, that a decision task for
     *         executions of this workflow type might take before returning completion or failure. If the task doesn'tdo
     *         close in the specified time then the task is automatically timed out and rescheduled. If the decider
     *         eventually reports a completion or failure, it is ignored. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or the
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
     * The default maximum duration, specified when registering the workflow type, that a decision task for executions
     * of this workflow type might take before returning completion or failure. If the task doesn'tdo close in the
     * specified time then the task is automatically timed out and rescheduled. If the decider eventually reports a
     * completion or failure, it is ignored. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        The default maximum duration, specified when registering the workflow type, that a decision task for
     *        executions of this workflow type might take before returning completion or failure. If the task doesn'tdo
     *        close in the specified time then the task is automatically timed out and rescheduled. If the decider
     *        eventually reports a completion or failure, it is ignored. This default can be overridden when starting a
     *        workflow execution using the <a>StartWorkflowExecution</a> action or the
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeConfiguration withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        setDefaultTaskStartToCloseTimeout(defaultTaskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The default maximum duration, specified when registering the workflow type, for executions of this workflow type.
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultExecutionStartToCloseTimeout
     *        The default maximum duration, specified when registering the workflow type, for executions of this
     *        workflow type. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
    }

    /**
     * <p>
     * The default maximum duration, specified when registering the workflow type, for executions of this workflow type.
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return The default maximum duration, specified when registering the workflow type, for executions of this
     *         workflow type. This default can be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getDefaultExecutionStartToCloseTimeout() {
        return this.defaultExecutionStartToCloseTimeout;
    }

    /**
     * <p>
     * The default maximum duration, specified when registering the workflow type, for executions of this workflow type.
     * This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action
     * or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param defaultExecutionStartToCloseTimeout
     *        The default maximum duration, specified when registering the workflow type, for executions of this
     *        workflow type. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeConfiguration withDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        setDefaultExecutionStartToCloseTimeout(defaultExecutionStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The default task list, specified when registering the workflow type, for decisions tasks scheduled for workflow
     * executions of this type. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * 
     * @param defaultTaskList
     *        The default task list, specified when registering the workflow type, for decisions tasks scheduled for
     *        workflow executions of this type. This default can be overridden when starting a workflow execution using
     *        the <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */

    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }

    /**
     * <p>
     * The default task list, specified when registering the workflow type, for decisions tasks scheduled for workflow
     * executions of this type. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * 
     * @return The default task list, specified when registering the workflow type, for decisions tasks scheduled for
     *         workflow executions of this type. This default can be overridden when starting a workflow execution using
     *         the <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */

    public TaskList getDefaultTaskList() {
        return this.defaultTaskList;
    }

    /**
     * <p>
     * The default task list, specified when registering the workflow type, for decisions tasks scheduled for workflow
     * executions of this type. This default can be overridden when starting a workflow execution using the
     * <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * </p>
     * 
     * @param defaultTaskList
     *        The default task list, specified when registering the workflow type, for decisions tasks scheduled for
     *        workflow executions of this type. This default can be overridden when starting a workflow execution using
     *        the <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeConfiguration withDefaultTaskList(TaskList defaultTaskList) {
        setDefaultTaskList(defaultTaskList);
        return this;
    }

    /**
     * <p>
     * The default task priority, specified when registering the workflow type, for all decision tasks of this workflow
     * type. This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     * action or the <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority, specified when registering the workflow type, for all decision tasks of this
     *        workflow type. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
     *        <p>
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *        </p>
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
     * The default task priority, specified when registering the workflow type, for all decision tasks of this workflow
     * type. This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     * action or the <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @return The default task priority, specified when registering the workflow type, for all decision tasks of this
     *         workflow type. This default can be overridden when starting a workflow execution using the
     *         <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
     *         <p>
     *         Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *         </p>
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
     * The default task priority, specified when registering the workflow type, for all decision tasks of this workflow
     * type. This default can be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a>
     * action or the <code>StartChildWorkflowExecution</code> decision.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        The default task priority, specified when registering the workflow type, for all decision tasks of this
     *        workflow type. This default can be overridden when starting a workflow execution using the
     *        <a>StartWorkflowExecution</a> action or the <code>StartChildWorkflowExecution</code> decision.</p>
     *        <p>
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *        </p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeConfiguration withDefaultTaskPriority(String defaultTaskPriority) {
        setDefaultTaskPriority(defaultTaskPriority);
        return this;
    }

    /**
     * <p>
     * The default policy to use for the child workflow executions when a workflow execution of this type is terminated,
     * by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This default can
     * be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     *        The default policy to use for the child workflow executions when a workflow execution of this type is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This default can be overridden when starting a workflow execution using the
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
     * The default policy to use for the child workflow executions when a workflow execution of this type is terminated,
     * by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This default can
     * be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     * @return The default policy to use for the child workflow executions when a workflow execution of this type is
     *         terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *         timeout. This default can be overridden when starting a workflow execution using the
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
     * The default policy to use for the child workflow executions when a workflow execution of this type is terminated,
     * by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This default can
     * be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     *        The default policy to use for the child workflow executions when a workflow execution of this type is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This default can be overridden when starting a workflow execution using the
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

    public WorkflowTypeConfiguration withDefaultChildPolicy(String defaultChildPolicy) {
        setDefaultChildPolicy(defaultChildPolicy);
        return this;
    }

    /**
     * <p>
     * The default policy to use for the child workflow executions when a workflow execution of this type is terminated,
     * by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This default can
     * be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     *        The default policy to use for the child workflow executions when a workflow execution of this type is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This default can be overridden when starting a workflow execution using the
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
     * The default policy to use for the child workflow executions when a workflow execution of this type is terminated,
     * by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired timeout. This default can
     * be overridden when starting a workflow execution using the <a>StartWorkflowExecution</a> action or the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
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
     *        The default policy to use for the child workflow executions when a workflow execution of this type is
     *        terminated, by calling the <a>TerminateWorkflowExecution</a> action explicitly or due to an expired
     *        timeout. This default can be overridden when starting a workflow execution using the
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

    public WorkflowTypeConfiguration withDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
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
     * starting this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param defaultLambdaRole
     *        The default IAM role attached to this workflow type.</p> <note>
     *        <p>
     *        Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM
     *        role when starting this workflow type, the default Lambda role is attached to the execution. For more
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
     * starting this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The default IAM role attached to this workflow type.</p> <note>
     *         <p>
     *         Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM
     *         role when starting this workflow type, the default Lambda role is attached to the execution. For more
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
     * starting this workflow type, the default Lambda role is attached to the execution. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http://docs.aws.amazon.com/
     * amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param defaultLambdaRole
     *        The default IAM role attached to this workflow type.</p> <note>
     *        <p>
     *        Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM
     *        role when starting this workflow type, the default Lambda role is attached to the execution. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html">http
     *        ://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html</a> in the <i>Amazon SWF Developer
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowTypeConfiguration withDefaultLambdaRole(String defaultLambdaRole) {
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

        if (obj instanceof WorkflowTypeConfiguration == false)
            return false;
        WorkflowTypeConfiguration other = (WorkflowTypeConfiguration) obj;
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

        hashCode = prime * hashCode + ((getDefaultTaskStartToCloseTimeout() == null) ? 0 : getDefaultTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultExecutionStartToCloseTimeout() == null) ? 0 : getDefaultExecutionStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskList() == null) ? 0 : getDefaultTaskList().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskPriority() == null) ? 0 : getDefaultTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getDefaultChildPolicy() == null) ? 0 : getDefaultChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getDefaultLambdaRole() == null) ? 0 : getDefaultLambdaRole().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowTypeConfiguration clone() {
        try {
            return (WorkflowTypeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.WorkflowTypeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
