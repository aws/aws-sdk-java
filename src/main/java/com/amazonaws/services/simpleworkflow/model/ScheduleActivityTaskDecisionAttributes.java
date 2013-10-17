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
 * Provides details of the <code>ScheduleActivityTask</code> decision.
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
 * <li> <code>activityType.name</code> : String constraint. The key is ???swf:activityType.name???.</li>
 * <li> <code>activityType.version</code> : String constraint. The key is ???swf:activityType.version???.</li>
 * <li> <code>taskList</code> : String constraint. The key is ???swf:taskList.name???.</li>
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
public class ScheduleActivityTaskDecisionAttributes implements Serializable {

    /**
     * The type of the activity task to schedule. This field is required.
     */
    private ActivityType activityType;

    /**
     * The <code>activityId</code> of the activity task. This field is
     * required. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String activityId;

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks. This data is not sent to the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The input provided to the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The maximum duration for this activity task. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>A schedule-to-close
     * timeout for this activity task must be specified either as a default
     * for the activity type or through this field. If neither this field is
     * set nor a default schedule-to-close timeout was specified at
     * registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String scheduleToCloseTimeout;

    /**
     * If set, specifies the name of the task list in which to schedule the
     * activity task. If not specified, the <code>defaultTaskList</code>
     * registered with the activity type will be used. <note>A task list for
     * this activity task must be specified either as a default for the
     * activity type or through this field. If neither this field is set nor
     * a default task list was specified at registration time then a fault
     * will be returned.</note> <p>The specified string must not start or end
     * with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     */
    private TaskList taskList;

    /**
     * If set, specifies the maximum duration the activity task can wait to
     * be assigned to a worker. This overrides the default schedule-to-start
     * timeout specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A schedule-to-start timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * schedule-to-start timeout was specified at registration time then a
     * fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String scheduleToStartTimeout;

    /**
     * If set, specifies the maximum duration a worker may take to process
     * this activity task. This overrides the default start-to-close timeout
     * specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A start-to-close timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String startToCloseTimeout;

    /**
     * If set, specifies the maximum time before which a worker processing a
     * task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. If the worker subsequently
     * attempts to record a heartbeat or returns a result, it will be
     * ignored. This overrides the default heartbeat timeout specified when
     * registering the activity type using <a>RegisterActivityType</a>.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String heartbeatTimeout;

    /**
     * The type of the activity task to schedule. This field is required.
     *
     * @return The type of the activity task to schedule. This field is required.
     */
    public ActivityType getActivityType() {
        return activityType;
    }
    
    /**
     * The type of the activity task to schedule. This field is required.
     *
     * @param activityType The type of the activity task to schedule. This field is required.
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * The type of the activity task to schedule. This field is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityType The type of the activity task to schedule. This field is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * The <code>activityId</code> of the activity task. This field is
     * required. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The <code>activityId</code> of the activity task. This field is
     *         required. <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * The <code>activityId</code> of the activity task. This field is
     * required. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The <code>activityId</code> of the activity task. This field is
     *         required. <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * The <code>activityId</code> of the activity task. This field is
     * required. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The <code>activityId</code> of the activity task. This field is
     *         required. <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks. This data is not sent to the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks. This data is not sent to the activity.
     */
    public String getControl() {
        return control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks. This data is not sent to the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks. This data is not sent to the activity.
     */
    public void setControl(String control) {
        this.control = control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks. This data is not sent to the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks. This data is not sent to the activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withControl(String control) {
        this.control = control;
        return this;
    }

    /**
     * The input provided to the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The input provided to the activity task.
     */
    public String getInput() {
        return input;
    }
    
    /**
     * The input provided to the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input provided to the activity task.
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * The input provided to the activity task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input provided to the activity task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * The maximum duration for this activity task. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>A schedule-to-close
     * timeout for this activity task must be specified either as a default
     * for the activity type or through this field. If neither this field is
     * set nor a default schedule-to-close timeout was specified at
     * registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration for this activity task. <p>The valid values are
     *         integers greater than or equal to <code>0</code>. An integer value can
     *         be used to specify the duration in seconds while <code>NONE</code> can
     *         be used to specify unlimited duration. <note>A schedule-to-close
     *         timeout for this activity task must be specified either as a default
     *         for the activity type or through this field. If neither this field is
     *         set nor a default schedule-to-close timeout was specified at
     *         registration time then a fault will be returned.</note>
     */
    public String getScheduleToCloseTimeout() {
        return scheduleToCloseTimeout;
    }
    
    /**
     * The maximum duration for this activity task. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>A schedule-to-close
     * timeout for this activity task must be specified either as a default
     * for the activity type or through this field. If neither this field is
     * set nor a default schedule-to-close timeout was specified at
     * registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToCloseTimeout The maximum duration for this activity task. <p>The valid values are
     *         integers greater than or equal to <code>0</code>. An integer value can
     *         be used to specify the duration in seconds while <code>NONE</code> can
     *         be used to specify unlimited duration. <note>A schedule-to-close
     *         timeout for this activity task must be specified either as a default
     *         for the activity type or through this field. If neither this field is
     *         set nor a default schedule-to-close timeout was specified at
     *         registration time then a fault will be returned.</note>
     */
    public void setScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        this.scheduleToCloseTimeout = scheduleToCloseTimeout;
    }
    
    /**
     * The maximum duration for this activity task. <p>The valid values are
     * integers greater than or equal to <code>0</code>. An integer value can
     * be used to specify the duration in seconds while <code>NONE</code> can
     * be used to specify unlimited duration. <note>A schedule-to-close
     * timeout for this activity task must be specified either as a default
     * for the activity type or through this field. If neither this field is
     * set nor a default schedule-to-close timeout was specified at
     * registration time then a fault will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToCloseTimeout The maximum duration for this activity task. <p>The valid values are
     *         integers greater than or equal to <code>0</code>. An integer value can
     *         be used to specify the duration in seconds while <code>NONE</code> can
     *         be used to specify unlimited duration. <note>A schedule-to-close
     *         timeout for this activity task must be specified either as a default
     *         for the activity type or through this field. If neither this field is
     *         set nor a default schedule-to-close timeout was specified at
     *         registration time then a fault will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        this.scheduleToCloseTimeout = scheduleToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the name of the task list in which to schedule the
     * activity task. If not specified, the <code>defaultTaskList</code>
     * registered with the activity type will be used. <note>A task list for
     * this activity task must be specified either as a default for the
     * activity type or through this field. If neither this field is set nor
     * a default task list was specified at registration time then a fault
     * will be returned.</note> <p>The specified string must not start or end
     * with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     *
     * @return If set, specifies the name of the task list in which to schedule the
     *         activity task. If not specified, the <code>defaultTaskList</code>
     *         registered with the activity type will be used. <note>A task list for
     *         this activity task must be specified either as a default for the
     *         activity type or through this field. If neither this field is set nor
     *         a default task list was specified at registration time then a fault
     *         will be returned.</note> <p>The specified string must not start or end
     *         with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * If set, specifies the name of the task list in which to schedule the
     * activity task. If not specified, the <code>defaultTaskList</code>
     * registered with the activity type will be used. <note>A task list for
     * this activity task must be specified either as a default for the
     * activity type or through this field. If neither this field is set nor
     * a default task list was specified at registration time then a fault
     * will be returned.</note> <p>The specified string must not start or end
     * with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     *
     * @param taskList If set, specifies the name of the task list in which to schedule the
     *         activity task. If not specified, the <code>defaultTaskList</code>
     *         registered with the activity type will be used. <note>A task list for
     *         this activity task must be specified either as a default for the
     *         activity type or through this field. If neither this field is set nor
     *         a default task list was specified at registration time then a fault
     *         will be returned.</note> <p>The specified string must not start or end
     *         with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * If set, specifies the name of the task list in which to schedule the
     * activity task. If not specified, the <code>defaultTaskList</code>
     * registered with the activity type will be used. <note>A task list for
     * this activity task must be specified either as a default for the
     * activity type or through this field. If neither this field is set nor
     * a default task list was specified at registration time then a fault
     * will be returned.</note> <p>The specified string must not start or end
     * with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList If set, specifies the name of the task list in which to schedule the
     *         activity task. If not specified, the <code>defaultTaskList</code>
     *         registered with the activity type will be used. <note>A task list for
     *         this activity task must be specified either as a default for the
     *         activity type or through this field. If neither this field is set nor
     *         a default task list was specified at registration time then a fault
     *         will be returned.</note> <p>The specified string must not start or end
     *         with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * If set, specifies the maximum duration the activity task can wait to
     * be assigned to a worker. This overrides the default schedule-to-start
     * timeout specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A schedule-to-start timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * schedule-to-start timeout was specified at registration time then a
     * fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the maximum duration the activity task can wait to
     *         be assigned to a worker. This overrides the default schedule-to-start
     *         timeout specified when registering the activity type using
     *         <a>RegisterActivityType</a>. <p>The valid values are integers greater
     *         than or equal to <code>0</code>. An integer value can be used to
     *         specify the duration in seconds while <code>NONE</code> can be used to
     *         specify unlimited duration. <note>A schedule-to-start timeout for this
     *         activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default
     *         schedule-to-start timeout was specified at registration time then a
     *         fault will be returned.</note>
     */
    public String getScheduleToStartTimeout() {
        return scheduleToStartTimeout;
    }
    
    /**
     * If set, specifies the maximum duration the activity task can wait to
     * be assigned to a worker. This overrides the default schedule-to-start
     * timeout specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A schedule-to-start timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * schedule-to-start timeout was specified at registration time then a
     * fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToStartTimeout If set, specifies the maximum duration the activity task can wait to
     *         be assigned to a worker. This overrides the default schedule-to-start
     *         timeout specified when registering the activity type using
     *         <a>RegisterActivityType</a>. <p>The valid values are integers greater
     *         than or equal to <code>0</code>. An integer value can be used to
     *         specify the duration in seconds while <code>NONE</code> can be used to
     *         specify unlimited duration. <note>A schedule-to-start timeout for this
     *         activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default
     *         schedule-to-start timeout was specified at registration time then a
     *         fault will be returned.</note>
     */
    public void setScheduleToStartTimeout(String scheduleToStartTimeout) {
        this.scheduleToStartTimeout = scheduleToStartTimeout;
    }
    
    /**
     * If set, specifies the maximum duration the activity task can wait to
     * be assigned to a worker. This overrides the default schedule-to-start
     * timeout specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A schedule-to-start timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * schedule-to-start timeout was specified at registration time then a
     * fault will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToStartTimeout If set, specifies the maximum duration the activity task can wait to
     *         be assigned to a worker. This overrides the default schedule-to-start
     *         timeout specified when registering the activity type using
     *         <a>RegisterActivityType</a>. <p>The valid values are integers greater
     *         than or equal to <code>0</code>. An integer value can be used to
     *         specify the duration in seconds while <code>NONE</code> can be used to
     *         specify unlimited duration. <note>A schedule-to-start timeout for this
     *         activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default
     *         schedule-to-start timeout was specified at registration time then a
     *         fault will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withScheduleToStartTimeout(String scheduleToStartTimeout) {
        this.scheduleToStartTimeout = scheduleToStartTimeout;
        return this;
    }

    /**
     * If set, specifies the maximum duration a worker may take to process
     * this activity task. This overrides the default start-to-close timeout
     * specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A start-to-close timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the maximum duration a worker may take to process
     *         this activity task. This overrides the default start-to-close timeout
     *         specified when registering the activity type using
     *         <a>RegisterActivityType</a>. <p>The valid values are integers greater
     *         than or equal to <code>0</code>. An integer value can be used to
     *         specify the duration in seconds while <code>NONE</code> can be used to
     *         specify unlimited duration. <note>A start-to-close timeout for this
     *         activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default
     *         start-to-close timeout was specified at registration time then a fault
     *         will be returned.</note>
     */
    public String getStartToCloseTimeout() {
        return startToCloseTimeout;
    }
    
    /**
     * If set, specifies the maximum duration a worker may take to process
     * this activity task. This overrides the default start-to-close timeout
     * specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A start-to-close timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param startToCloseTimeout If set, specifies the maximum duration a worker may take to process
     *         this activity task. This overrides the default start-to-close timeout
     *         specified when registering the activity type using
     *         <a>RegisterActivityType</a>. <p>The valid values are integers greater
     *         than or equal to <code>0</code>. An integer value can be used to
     *         specify the duration in seconds while <code>NONE</code> can be used to
     *         specify unlimited duration. <note>A start-to-close timeout for this
     *         activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default
     *         start-to-close timeout was specified at registration time then a fault
     *         will be returned.</note>
     */
    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }
    
    /**
     * If set, specifies the maximum duration a worker may take to process
     * this activity task. This overrides the default start-to-close timeout
     * specified when registering the activity type using
     * <a>RegisterActivityType</a>. <p>The valid values are integers greater
     * than or equal to <code>0</code>. An integer value can be used to
     * specify the duration in seconds while <code>NONE</code> can be used to
     * specify unlimited duration. <note>A start-to-close timeout for this
     * activity task must be specified either as a default for the activity
     * type or through this field. If neither this field is set nor a default
     * start-to-close timeout was specified at registration time then a fault
     * will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param startToCloseTimeout If set, specifies the maximum duration a worker may take to process
     *         this activity task. This overrides the default start-to-close timeout
     *         specified when registering the activity type using
     *         <a>RegisterActivityType</a>. <p>The valid values are integers greater
     *         than or equal to <code>0</code>. An integer value can be used to
     *         specify the duration in seconds while <code>NONE</code> can be used to
     *         specify unlimited duration. <note>A start-to-close timeout for this
     *         activity task must be specified either as a default for the activity
     *         type or through this field. If neither this field is set nor a default
     *         start-to-close timeout was specified at registration time then a fault
     *         will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the maximum time before which a worker processing a
     * task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. If the worker subsequently
     * attempts to record a heartbeat or returns a result, it will be
     * ignored. This overrides the default heartbeat timeout specified when
     * registering the activity type using <a>RegisterActivityType</a>.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the maximum time before which a worker processing a
     *         task of this type must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     *         activity task is automatically timed out. If the worker subsequently
     *         attempts to record a heartbeat or returns a result, it will be
     *         ignored. This overrides the default heartbeat timeout specified when
     *         registering the activity type using <a>RegisterActivityType</a>.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public String getHeartbeatTimeout() {
        return heartbeatTimeout;
    }
    
    /**
     * If set, specifies the maximum time before which a worker processing a
     * task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. If the worker subsequently
     * attempts to record a heartbeat or returns a result, it will be
     * ignored. This overrides the default heartbeat timeout specified when
     * registering the activity type using <a>RegisterActivityType</a>.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param heartbeatTimeout If set, specifies the maximum time before which a worker processing a
     *         task of this type must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     *         activity task is automatically timed out. If the worker subsequently
     *         attempts to record a heartbeat or returns a result, it will be
     *         ignored. This overrides the default heartbeat timeout specified when
     *         registering the activity type using <a>RegisterActivityType</a>.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public void setHeartbeatTimeout(String heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }
    
    /**
     * If set, specifies the maximum time before which a worker processing a
     * task of this type must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     * activity task is automatically timed out. If the worker subsequently
     * attempts to record a heartbeat or returns a result, it will be
     * ignored. This overrides the default heartbeat timeout specified when
     * registering the activity type using <a>RegisterActivityType</a>.
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
     * @param heartbeatTimeout If set, specifies the maximum time before which a worker processing a
     *         task of this type must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the
     *         activity task is automatically timed out. If the worker subsequently
     *         attempts to record a heartbeat or returns a result, it will be
     *         ignored. This overrides the default heartbeat timeout specified when
     *         registering the activity type using <a>RegisterActivityType</a>.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduleActivityTaskDecisionAttributes withHeartbeatTimeout(String heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
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
        if (getActivityType() != null) sb.append("ActivityType: " + getActivityType() + ",");
        if (getActivityId() != null) sb.append("ActivityId: " + getActivityId() + ",");
        if (getControl() != null) sb.append("Control: " + getControl() + ",");
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getScheduleToCloseTimeout() != null) sb.append("ScheduleToCloseTimeout: " + getScheduleToCloseTimeout() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getScheduleToStartTimeout() != null) sb.append("ScheduleToStartTimeout: " + getScheduleToStartTimeout() + ",");
        if (getStartToCloseTimeout() != null) sb.append("StartToCloseTimeout: " + getStartToCloseTimeout() + ",");
        if (getHeartbeatTimeout() != null) sb.append("HeartbeatTimeout: " + getHeartbeatTimeout() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getScheduleToStartTimeout() == null) ? 0 : getScheduleToStartTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduleActivityTaskDecisionAttributes == false) return false;
        ScheduleActivityTaskDecisionAttributes other = (ScheduleActivityTaskDecisionAttributes)obj;
        
        if (other.getActivityType() == null ^ this.getActivityType() == null) return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false) return false; 
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getScheduleToCloseTimeout() == null ^ this.getScheduleToCloseTimeout() == null) return false;
        if (other.getScheduleToCloseTimeout() != null && other.getScheduleToCloseTimeout().equals(this.getScheduleToCloseTimeout()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getScheduleToStartTimeout() == null ^ this.getScheduleToStartTimeout() == null) return false;
        if (other.getScheduleToStartTimeout() != null && other.getScheduleToStartTimeout().equals(this.getScheduleToStartTimeout()) == false) return false; 
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null) return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false) return false; 
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null) return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false) return false; 
        return true;
    }
    
}
    