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
 * Provides the details of the <code>ScheduleActivityTask</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an <code>Action</code> element to allow or deny permission to call this action.
 * </p>
 * </li>
 * <li>
 * <p>
 * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>activityType.name</code> – String constraint. The key is <code>swf:activityType.name</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>activityType.version</code> – String constraint. The key is <code>swf:activityType.version</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
 * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ScheduleActivityTaskDecisionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActivityTaskDecisionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the activity task to schedule.
     * </p>
     */
    private ActivityType activityType;
    /**
     * <p>
     * The <code>activityId</code> of the activity task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     */
    private String activityId;
    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to
     * the activity.
     * </p>
     */
    private String control;
    /**
     * <p>
     * The input provided to the activity task.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The maximum duration for this activity task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     */
    private String scheduleToCloseTimeout;
    /**
     * <p>
     * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     * <code>defaultTaskList</code> registered with the activity type is used.
     * </p>
     * <note>
     * <p>
     * A task list for this activity task must be specified either as a default for the activity type or through this
     * field. If neither this field is set nor a default task list was specified at registration time then a fault is
     * returned.
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
     * If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the
     * defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
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
     * If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the
     * default schedule-to-start timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-start timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     */
    private String scheduleToStartTimeout;
    /**
     * <p>
     * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the
     * default start-to-close timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A start-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default start-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     */
    private String startToCloseTimeout;
    /**
     * <p>
     * If set, specifies the maximum time before which a worker processing a task of this type must report progress by
     * calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     * out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides
     * the default heartbeat timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     */
    private String heartbeatTimeout;

    /**
     * <p>
     * The type of the activity task to schedule.
     * </p>
     * 
     * @param activityType
     *        The type of the activity task to schedule.
     */

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    /**
     * <p>
     * The type of the activity task to schedule.
     * </p>
     * 
     * @return The type of the activity task to schedule.
     */

    public ActivityType getActivityType() {
        return this.activityType;
    }

    /**
     * <p>
     * The type of the activity task to schedule.
     * </p>
     * 
     * @param activityType
     *        The type of the activity task to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withActivityType(ActivityType activityType) {
        setActivityType(activityType);
        return this;
    }

    /**
     * <p>
     * The <code>activityId</code> of the activity task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param activityId
     *        The <code>activityId</code> of the activity task.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     */

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The <code>activityId</code> of the activity task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return The <code>activityId</code> of the activity task.</p>
     *         <p>
     *         The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *         <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *         <code>arn</code>.
     */

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * <p>
     * The <code>activityId</code> of the activity task.
     * </p>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param activityId
     *        The <code>activityId</code> of the activity task.</p>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withActivityId(String activityId) {
        setActivityId(activityId);
        return this;
    }

    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to
     * the activity.
     * </p>
     * 
     * @param control
     *        Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't
     *        sent to the activity.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to
     * the activity.
     * </p>
     * 
     * @return Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't
     *         sent to the activity.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to
     * the activity.
     * </p>
     * 
     * @param control
     *        Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't
     *        sent to the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * The input provided to the activity task.
     * </p>
     * 
     * @param input
     *        The input provided to the activity task.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input provided to the activity task.
     * </p>
     * 
     * @return The input provided to the activity task.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input provided to the activity task.
     * </p>
     * 
     * @param input
     *        The input provided to the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The maximum duration for this activity task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param scheduleToCloseTimeout
     *        The maximum duration for this activity task.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A schedule-to-close timeout for this activity task must be specified either as a default for the activity
     *        type or through this field. If neither this field is set nor a default schedule-to-close timeout was
     *        specified at registration time then a fault is returned.
     *        </p>
     */

    public void setScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        this.scheduleToCloseTimeout = scheduleToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration for this activity task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @return The maximum duration for this activity task.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     *         </p>
     *         <note>
     *         <p>
     *         A schedule-to-close timeout for this activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default schedule-to-close timeout was
     *         specified at registration time then a fault is returned.
     *         </p>
     */

    public String getScheduleToCloseTimeout() {
        return this.scheduleToCloseTimeout;
    }

    /**
     * <p>
     * The maximum duration for this activity task.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param scheduleToCloseTimeout
     *        The maximum duration for this activity task.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A schedule-to-close timeout for this activity task must be specified either as a default for the activity
     *        type or through this field. If neither this field is set nor a default schedule-to-close timeout was
     *        specified at registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        setScheduleToCloseTimeout(scheduleToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     * <code>defaultTaskList</code> registered with the activity type is used.
     * </p>
     * <note>
     * <p>
     * A task list for this activity task must be specified either as a default for the activity type or through this
     * field. If neither this field is set nor a default task list was specified at registration time then a fault is
     * returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param taskList
     *        If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     *        <code>defaultTaskList</code> registered with the activity type is used.</p> <note>
     *        <p>
     *        A task list for this activity task must be specified either as a default for the activity type or through
     *        this field. If neither this field is set nor a default task list was specified at registration time then a
     *        fault is returned.
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
     * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     * <code>defaultTaskList</code> registered with the activity type is used.
     * </p>
     * <note>
     * <p>
     * A task list for this activity task must be specified either as a default for the activity type or through this
     * field. If neither this field is set nor a default task list was specified at registration time then a fault is
     * returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @return If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     *         <code>defaultTaskList</code> registered with the activity type is used.</p> <note>
     *         <p>
     *         A task list for this activity task must be specified either as a default for the activity type or through
     *         this field. If neither this field is set nor a default task list was specified at registration time then
     *         a fault is returned.
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
     * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     * <code>defaultTaskList</code> registered with the activity type is used.
     * </p>
     * <note>
     * <p>
     * A task list for this activity task must be specified either as a default for the activity type or through this
     * field. If neither this field is set nor a default task list was specified at registration time then a fault is
     * returned.
     * </p>
     * </note>
     * <p>
     * The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (<code>\u0000-\u001f</code> |
     * <code>\u007f-\u009f</code>). Also, it must not contain the literal string <code>arn</code>.
     * </p>
     * 
     * @param taskList
     *        If set, specifies the name of the task list in which to schedule the activity task. If not specified, the
     *        <code>defaultTaskList</code> registered with the activity type is used.</p> <note>
     *        <p>
     *        A task list for this activity task must be specified either as a default for the activity type or through
     *        this field. If neither this field is set nor a default task list was specified at registration time then a
     *        fault is returned.
     *        </p>
     *        </note>
     *        <p>
     *        The specified string must not start or end with whitespace. It must not contain a <code>:</code> (colon),
     *        <code>/</code> (slash), <code>|</code> (vertical bar), or any control characters (
     *        <code>\u0000-\u001f</code> | <code>\u007f-\u009f</code>). Also, it must not contain the literal string
     *        <code>arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the
     * defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides
     *        the defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>.
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
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
     * If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the
     * defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @return If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides
     *         the defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>.
     *         Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
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
     * If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the
     * defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>. Valid values
     * are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param taskPriority
     *        If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides
     *        the defaultTaskPriority specified when registering the activity type using <a>RegisterActivityType</a>.
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.</p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon SWF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the
     * default schedule-to-start timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-start timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param scheduleToStartTimeout
     *        If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This
     *        overrides the default schedule-to-start timeout specified when registering the activity type using
     *        <a>RegisterActivityType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A schedule-to-start timeout for this activity task must be specified either as a default for the activity
     *        type or through this field. If neither this field is set nor a default schedule-to-start timeout was
     *        specified at registration time then a fault is returned.
     *        </p>
     */

    public void setScheduleToStartTimeout(String scheduleToStartTimeout) {
        this.scheduleToStartTimeout = scheduleToStartTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the
     * default schedule-to-start timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-start timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @return If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This
     *         overrides the default schedule-to-start timeout specified when registering the activity type using
     *         <a>RegisterActivityType</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     *         </p>
     *         <note>
     *         <p>
     *         A schedule-to-start timeout for this activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default schedule-to-start timeout was
     *         specified at registration time then a fault is returned.
     *         </p>
     */

    public String getScheduleToStartTimeout() {
        return this.scheduleToStartTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the
     * default schedule-to-start timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default schedule-to-start timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param scheduleToStartTimeout
     *        If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This
     *        overrides the default schedule-to-start timeout specified when registering the activity type using
     *        <a>RegisterActivityType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A schedule-to-start timeout for this activity task must be specified either as a default for the activity
     *        type or through this field. If neither this field is set nor a default schedule-to-start timeout was
     *        specified at registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withScheduleToStartTimeout(String scheduleToStartTimeout) {
        setScheduleToStartTimeout(scheduleToStartTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the
     * default start-to-close timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A start-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default start-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param startToCloseTimeout
     *        If set, specifies the maximum duration a worker may take to process this activity task. This overrides the
     *        default start-to-close timeout specified when registering the activity type using
     *        <a>RegisterActivityType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A start-to-close timeout for this activity task must be specified either as a default for the activity
     *        type or through this field. If neither this field is set nor a default start-to-close timeout was
     *        specified at registration time then a fault is returned.
     *        </p>
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the
     * default start-to-close timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A start-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default start-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @return If set, specifies the maximum duration a worker may take to process this activity task. This overrides
     *         the default start-to-close timeout specified when registering the activity type using
     *         <a>RegisterActivityType</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     *         </p>
     *         <note>
     *         <p>
     *         A start-to-close timeout for this activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default start-to-close timeout was
     *         specified at registration time then a fault is returned.
     *         </p>
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the
     * default start-to-close timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * <note>
     * <p>
     * A start-to-close timeout for this activity task must be specified either as a default for the activity type or
     * through this field. If neither this field is set nor a default start-to-close timeout was specified at
     * registration time then a fault is returned.
     * </p>
     * </note>
     * 
     * @param startToCloseTimeout
     *        If set, specifies the maximum duration a worker may take to process this activity task. This overrides the
     *        default start-to-close timeout specified when registering the activity type using
     *        <a>RegisterActivityType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     *        </p>
     *        <note>
     *        <p>
     *        A start-to-close timeout for this activity task must be specified either as a default for the activity
     *        type or through this field. If neither this field is set nor a default start-to-close timeout was
     *        specified at registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * If set, specifies the maximum time before which a worker processing a task of this type must report progress by
     * calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     * out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides
     * the default heartbeat timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param heartbeatTimeout
     *        If set, specifies the maximum time before which a worker processing a task of this type must report
     *        progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     *        automatically timed out. If the worker subsequently attempts to record a heartbeat or returns a result, it
     *        is ignored. This overrides the default heartbeat timeout specified when registering the activity type
     *        using <a>RegisterActivityType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     */

    public void setHeartbeatTimeout(String heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum time before which a worker processing a task of this type must report progress by
     * calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     * out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides
     * the default heartbeat timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @return If set, specifies the maximum time before which a worker processing a task of this type must report
     *         progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     *         automatically timed out. If the worker subsequently attempts to record a heartbeat or returns a result,
     *         it is ignored. This overrides the default heartbeat timeout specified when registering the activity type
     *         using <a>RegisterActivityType</a>.</p>
     *         <p>
     *         The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *         <code>NONE</code> to specify unlimited duration.
     */

    public String getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * <p>
     * If set, specifies the maximum time before which a worker processing a task of this type must report progress by
     * calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     * out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides
     * the default heartbeat timeout specified when registering the activity type using <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     * <code>NONE</code> to specify unlimited duration.
     * </p>
     * 
     * @param heartbeatTimeout
     *        If set, specifies the maximum time before which a worker processing a task of this type must report
     *        progress by calling <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is
     *        automatically timed out. If the worker subsequently attempts to record a heartbeat or returns a result, it
     *        is ignored. This overrides the default heartbeat timeout specified when registering the activity type
     *        using <a>RegisterActivityType</a>.</p>
     *        <p>
     *        The duration is specified in seconds, an integer greater than or equal to <code>0</code>. You can use
     *        <code>NONE</code> to specify unlimited duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleActivityTaskDecisionAttributes withHeartbeatTimeout(String heartbeatTimeout) {
        setHeartbeatTimeout(heartbeatTimeout);
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
        if (getActivityType() != null)
            sb.append("ActivityType: ").append(getActivityType()).append(",");
        if (getActivityId() != null)
            sb.append("ActivityId: ").append(getActivityId()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getScheduleToCloseTimeout() != null)
            sb.append("ScheduleToCloseTimeout: ").append(getScheduleToCloseTimeout()).append(",");
        if (getTaskList() != null)
            sb.append("TaskList: ").append(getTaskList()).append(",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: ").append(getTaskPriority()).append(",");
        if (getScheduleToStartTimeout() != null)
            sb.append("ScheduleToStartTimeout: ").append(getScheduleToStartTimeout()).append(",");
        if (getStartToCloseTimeout() != null)
            sb.append("StartToCloseTimeout: ").append(getStartToCloseTimeout()).append(",");
        if (getHeartbeatTimeout() != null)
            sb.append("HeartbeatTimeout: ").append(getHeartbeatTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleActivityTaskDecisionAttributes == false)
            return false;
        ScheduleActivityTaskDecisionAttributes other = (ScheduleActivityTaskDecisionAttributes) obj;
        if (other.getActivityType() == null ^ this.getActivityType() == null)
            return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false)
            return false;
        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getScheduleToCloseTimeout() == null ^ this.getScheduleToCloseTimeout() == null)
            return false;
        if (other.getScheduleToCloseTimeout() != null && other.getScheduleToCloseTimeout().equals(this.getScheduleToCloseTimeout()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null)
            return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false)
            return false;
        if (other.getScheduleToStartTimeout() == null ^ this.getScheduleToStartTimeout() == null)
            return false;
        if (other.getScheduleToStartTimeout() != null && other.getScheduleToStartTimeout().equals(this.getScheduleToStartTimeout()) == false)
            return false;
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null)
            return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false)
            return false;
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null)
            return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityType() == null) ? 0 : getActivityType().hashCode());
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getScheduleToCloseTimeout() == null) ? 0 : getScheduleToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getScheduleToStartTimeout() == null) ? 0 : getScheduleToStartTimeout().hashCode());
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleActivityTaskDecisionAttributes clone() {
        try {
            return (ScheduleActivityTaskDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ScheduleActivityTaskDecisionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
