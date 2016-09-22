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
 * Configuration settings registered with the activity type.
 * </p>
 */
public class ActivityTypeConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String defaultTaskStartToCloseTimeout;
    /**
     * <p>
     * <i>Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>.
     * </p>
     * <p>
     * You can specify this value only when <i>registering</i> an activity type. The registered default value can be
     * overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the activity
     * worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an
     * <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity task to be valid;
     * the activity worker should clean up the activity task.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String defaultTaskHeartbeatTimeout;
    /**
     * <p>
     * <i>Optional.</i> The default task list specified for this activity type at registration. This default is used if
     * a task list is not provided when a task is scheduled through the <code>ScheduleActivityTask</code> decision. You
     * can override the default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     * </p>
     */
    private TaskList defaultTaskList;
    /**
     * <p>
     * <i>Optional.</i> The default task priority for tasks of this activity type, specified at registration. If not
     * set, then "0" will be used as the default priority. This default can be overridden when scheduling an activity
     * task.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
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
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, that a task of an
     * activity type can wait before being assigned to a worker. You can override this default when scheduling a task
     * through the <code>ScheduleActivityTask</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String defaultTaskScheduleToStartTimeout;
    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of this
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     */
    private String defaultTaskScheduleToCloseTimeout;

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     *        activity type. You can override this default when scheduling a task through the
     *        <code>ScheduleActivityTask</code> decision.</p>
     */

    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     *         activity type. You can override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision.</p>
     */

    public String getDefaultTaskStartToCloseTimeout() {
        return this.defaultTaskStartToCloseTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskStartToCloseTimeout
     *        Optional.</i> The default maximum duration for tasks of an activity type specified when registering the
     *        activity type. You can override this default when scheduling a task through the
     *        <code>ScheduleActivityTask</code> decision.</p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeConfiguration withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        setDefaultTaskStartToCloseTimeout(defaultTaskStartToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>.
     * </p>
     * <p>
     * You can specify this value only when <i>registering</i> an activity type. The registered default value can be
     * overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the activity
     * worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an
     * <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity task to be valid;
     * the activity worker should clean up the activity task.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskHeartbeatTimeout
     *        Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     *        progress by calling <a>RecordActivityTaskHeartbeat</a>.</p>
     *        <p>
     *        You can specify this value only when <i>registering</i> an activity type. The registered default value can
     *        be overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the
     *        activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker
     *        receives an <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity
     *        task to be valid; the activity worker should clean up the activity task.
     *        </p>
     */

    public void setDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>.
     * </p>
     * <p>
     * You can specify this value only when <i>registering</i> an activity type. The registered default value can be
     * overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the activity
     * worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an
     * <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity task to be valid;
     * the activity worker should clean up the activity task.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     *         progress by calling <a>RecordActivityTaskHeartbeat</a>.</p>
     *         <p>
     *         You can specify this value only when <i>registering</i> an activity type. The registered default value
     *         can be overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the
     *         activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker
     *         receives an <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity
     *         task to be valid; the activity worker should clean up the activity task.
     *         </p>
     */

    public String getDefaultTaskHeartbeatTimeout() {
        return this.defaultTaskHeartbeatTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>.
     * </p>
     * <p>
     * You can specify this value only when <i>registering</i> an activity type. The registered default value can be
     * overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the activity
     * worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an
     * <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity task to be valid;
     * the activity worker should clean up the activity task.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskHeartbeatTimeout
     *        Optional.</i> The default maximum time, in seconds, before which a worker processing a task must report
     *        progress by calling <a>RecordActivityTaskHeartbeat</a>.</p>
     *        <p>
     *        You can specify this value only when <i>registering</i> an activity type. The registered default value can
     *        be overridden when you schedule a task through the <code>ScheduleActivityTask</code> decision. If the
     *        activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker
     *        receives an <code>UnknownResource</code> fault. In this case, Amazon SWF no longer considers the activity
     *        task to be valid; the activity worker should clean up the activity task.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeConfiguration withDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        setDefaultTaskHeartbeatTimeout(defaultTaskHeartbeatTimeout);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> The default task list specified for this activity type at registration. This default is used if
     * a task list is not provided when a task is scheduled through the <code>ScheduleActivityTask</code> decision. You
     * can override the default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     * </p>
     * 
     * @param defaultTaskList
     *        Optional.</i> The default task list specified for this activity type at registration. This default is used
     *        if a task list is not provided when a task is scheduled through the <code>ScheduleActivityTask</code>
     *        decision. You can override the default registered task list when scheduling a task through the
     *        <code>ScheduleActivityTask
     */

    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }

    /**
     * <p>
     * <i>Optional.</i> The default task list specified for this activity type at registration. This default is used if
     * a task list is not provided when a task is scheduled through the <code>ScheduleActivityTask</code> decision. You
     * can override the default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     * </p>
     * 
     * @return Optional.</i> The default task list specified for this activity type at registration. This default is
     *         used if a task list is not provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> decision. You can override the default registered task list when
     *         scheduling a task through the <code>ScheduleActivityTask
     */

    public TaskList getDefaultTaskList() {
        return this.defaultTaskList;
    }

    /**
     * <p>
     * <i>Optional.</i> The default task list specified for this activity type at registration. This default is used if
     * a task list is not provided when a task is scheduled through the <code>ScheduleActivityTask</code> decision. You
     * can override the default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     * </p>
     * 
     * @param defaultTaskList
     *        Optional.</i> The default task list specified for this activity type at registration. This default is used
     *        if a task list is not provided when a task is scheduled through the <code>ScheduleActivityTask</code>
     *        decision. You can override the default registered task list when scheduling a task through the
     *        <code>ScheduleActivityTask
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeConfiguration withDefaultTaskList(TaskList defaultTaskList) {
        setDefaultTaskList(defaultTaskList);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> The default task priority for tasks of this activity type, specified at registration. If not
     * set, then "0" will be used as the default priority. This default can be overridden when scheduling an activity
     * task.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        Optional.</i> The default task priority for tasks of this activity type, specified at registration. If not
     *        set, then "0" will be used as the default priority. This default can be overridden when scheduling an
     *        activity task.</p>
     *        <p>
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *        </p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide
     */

    public void setDefaultTaskPriority(String defaultTaskPriority) {
        this.defaultTaskPriority = defaultTaskPriority;
    }

    /**
     * <p>
     * <i>Optional.</i> The default task priority for tasks of this activity type, specified at registration. If not
     * set, then "0" will be used as the default priority. This default can be overridden when scheduling an activity
     * task.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @return Optional.</i> The default task priority for tasks of this activity type, specified at registration. If
     *         not set, then "0" will be used as the default priority. This default can be overridden when scheduling an
     *         activity task.</p>
     *         <p>
     *         Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *         </p>
     *         <p>
     *         For more information about setting task priority, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *         Priority</a> in the <i>Amazon Simple Workflow Developer Guide
     */

    public String getDefaultTaskPriority() {
        return this.defaultTaskPriority;
    }

    /**
     * <p>
     * <i>Optional.</i> The default task priority for tasks of this activity type, specified at registration. If not
     * set, then "0" will be used as the default priority. This default can be overridden when scheduling an activity
     * task.
     * </p>
     * <p>
     * Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     * </p>
     * <p>
     * For more information about setting task priority, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     * Priority</a> in the <i>Amazon Simple Workflow Developer Guide</i>.
     * </p>
     * 
     * @param defaultTaskPriority
     *        Optional.</i> The default task priority for tasks of this activity type, specified at registration. If not
     *        set, then "0" will be used as the default priority. This default can be overridden when scheduling an
     *        activity task.</p>
     *        <p>
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *        </p>
     *        <p>
     *        For more information about setting task priority, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting Task
     *        Priority</a> in the <i>Amazon Simple Workflow Developer Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeConfiguration withDefaultTaskPriority(String defaultTaskPriority) {
        setDefaultTaskPriority(defaultTaskPriority);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, that a task of an
     * activity type can wait before being assigned to a worker. You can override this default when scheduling a task
     * through the <code>ScheduleActivityTask</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToStartTimeout
     *        Optional.</i> The default maximum duration, specified when registering the activity type, that a task of
     *        an activity type can wait before being assigned to a worker. You can override this default when scheduling
     *        a task through the <code>ScheduleActivityTask</code> decision.</p>
     */

    public void setDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, that a task of an
     * activity type can wait before being assigned to a worker. You can override this default when scheduling a task
     * through the <code>ScheduleActivityTask</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return Optional.</i> The default maximum duration, specified when registering the activity type, that a task of
     *         an activity type can wait before being assigned to a worker. You can override this default when
     *         scheduling a task through the <code>ScheduleActivityTask</code> decision.</p>
     */

    public String getDefaultTaskScheduleToStartTimeout() {
        return this.defaultTaskScheduleToStartTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, that a task of an
     * activity type can wait before being assigned to a worker. You can override this default when scheduling a task
     * through the <code>ScheduleActivityTask</code> decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToStartTimeout
     *        Optional.</i> The default maximum duration, specified when registering the activity type, that a task of
     *        an activity type can wait before being assigned to a worker. You can override this default when scheduling
     *        a task through the <code>ScheduleActivityTask</code> decision.</p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeConfiguration withDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        setDefaultTaskScheduleToStartTimeout(defaultTaskScheduleToStartTimeout);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of this
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToCloseTimeout
     *        Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of
     *        this activity type. You can override this default when scheduling a task through the
     *        <code>ScheduleActivityTask</code> decision.</p>
     */

    public void setDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of this
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @return Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of
     *         this activity type. You can override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision.</p>
     */

    public String getDefaultTaskScheduleToCloseTimeout() {
        return this.defaultTaskScheduleToCloseTimeout;
    }

    /**
     * <p>
     * <i>Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of this
     * activity type. You can override this default when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0. The value "NONE" can be used to
     * specify unlimited duration.
     * </p>
     * 
     * @param defaultTaskScheduleToCloseTimeout
     *        Optional.</i> The default maximum duration, specified when registering the activity type, for tasks of
     *        this activity type. You can override this default when scheduling a task through the
     *        <code>ScheduleActivityTask</code> decision.</p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeConfiguration withDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        setDefaultTaskScheduleToCloseTimeout(defaultTaskScheduleToCloseTimeout);
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
        if (getDefaultTaskStartToCloseTimeout() != null)
            sb.append("DefaultTaskStartToCloseTimeout: " + getDefaultTaskStartToCloseTimeout() + ",");
        if (getDefaultTaskHeartbeatTimeout() != null)
            sb.append("DefaultTaskHeartbeatTimeout: " + getDefaultTaskHeartbeatTimeout() + ",");
        if (getDefaultTaskList() != null)
            sb.append("DefaultTaskList: " + getDefaultTaskList() + ",");
        if (getDefaultTaskPriority() != null)
            sb.append("DefaultTaskPriority: " + getDefaultTaskPriority() + ",");
        if (getDefaultTaskScheduleToStartTimeout() != null)
            sb.append("DefaultTaskScheduleToStartTimeout: " + getDefaultTaskScheduleToStartTimeout() + ",");
        if (getDefaultTaskScheduleToCloseTimeout() != null)
            sb.append("DefaultTaskScheduleToCloseTimeout: " + getDefaultTaskScheduleToCloseTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTypeConfiguration == false)
            return false;
        ActivityTypeConfiguration other = (ActivityTypeConfiguration) obj;
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null)
            return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null
                && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false)
            return false;
        if (other.getDefaultTaskHeartbeatTimeout() == null ^ this.getDefaultTaskHeartbeatTimeout() == null)
            return false;
        if (other.getDefaultTaskHeartbeatTimeout() != null && other.getDefaultTaskHeartbeatTimeout().equals(this.getDefaultTaskHeartbeatTimeout()) == false)
            return false;
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null)
            return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false)
            return false;
        if (other.getDefaultTaskPriority() == null ^ this.getDefaultTaskPriority() == null)
            return false;
        if (other.getDefaultTaskPriority() != null && other.getDefaultTaskPriority().equals(this.getDefaultTaskPriority()) == false)
            return false;
        if (other.getDefaultTaskScheduleToStartTimeout() == null ^ this.getDefaultTaskScheduleToStartTimeout() == null)
            return false;
        if (other.getDefaultTaskScheduleToStartTimeout() != null
                && other.getDefaultTaskScheduleToStartTimeout().equals(this.getDefaultTaskScheduleToStartTimeout()) == false)
            return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() == null ^ this.getDefaultTaskScheduleToCloseTimeout() == null)
            return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() != null
                && other.getDefaultTaskScheduleToCloseTimeout().equals(this.getDefaultTaskScheduleToCloseTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultTaskStartToCloseTimeout() == null) ? 0 : getDefaultTaskStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskHeartbeatTimeout() == null) ? 0 : getDefaultTaskHeartbeatTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskList() == null) ? 0 : getDefaultTaskList().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskPriority() == null) ? 0 : getDefaultTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskScheduleToStartTimeout() == null) ? 0 : getDefaultTaskScheduleToStartTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultTaskScheduleToCloseTimeout() == null) ? 0 : getDefaultTaskScheduleToCloseTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ActivityTypeConfiguration clone() {
        try {
            return (ActivityTypeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
