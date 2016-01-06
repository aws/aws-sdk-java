/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Configuration settings registered with the activity type.
 * </p>
 */
public class ActivityTypeConfiguration implements Serializable, Cloneable {

    /**
     * <i>Optional.</i> The default maximum duration for tasks of an activity
     * type specified when registering the activity type. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskStartToCloseTimeout;

    /**
     * <i>Optional.</i> The default maximum time, in seconds, before which a
     * worker processing a task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     * when <i>registering</i> an activity type. The registered default value
     * can be overridden when you schedule a task through the
     * <code>ScheduleActivityTask</code> decision. If the activity worker
     * subsequently attempts to record a heartbeat or returns a result, the
     * activity worker receives an <code>UnknownResource</code> fault. In
     * this case, Amazon SWF no longer considers the activity task to be
     * valid; the activity worker should clean up the activity task. <p>The
     * duration is specified in seconds; an integer greater than or equal to
     * 0. The value "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskHeartbeatTimeout;

    /**
     * <i>Optional.</i> The default task list specified for this activity
     * type at registration. This default is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> decision. You can override the
     * default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     */
    private TaskList defaultTaskList;

    /**
     * <i>Optional.</i> The default task priority for tasks of this activity
     * type, specified at registration. If not set, then "0" will be used as
     * the default priority. This default can be overridden when scheduling
     * an activity task. <p>Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     */
    private String defaultTaskPriority;

    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, that a task of an activity type can
     * wait before being assigned to a worker. You can override this default
     * when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskScheduleToStartTimeout;

    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, for tasks of this activity type. You
     * can override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskScheduleToCloseTimeout;

    /**
     * <i>Optional.</i> The default maximum duration for tasks of an activity
     * type specified when registering the activity type. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return <i>Optional.</i> The default maximum duration for tasks of an activity
     *         type specified when registering the activity type. You can override
     *         this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision. <p>The duration is
     *         specified in seconds; an integer greater than or equal to 0. The value
     *         "NONE" can be used to specify unlimited duration.
     */
    public String getDefaultTaskStartToCloseTimeout() {
        return defaultTaskStartToCloseTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum duration for tasks of an activity
     * type specified when registering the activity type. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout <i>Optional.</i> The default maximum duration for tasks of an activity
     *         type specified when registering the activity type. You can override
     *         this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision. <p>The duration is
     *         specified in seconds; an integer greater than or equal to 0. The value
     *         "NONE" can be used to specify unlimited duration.
     */
    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum duration for tasks of an activity
     * type specified when registering the activity type. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout <i>Optional.</i> The default maximum duration for tasks of an activity
     *         type specified when registering the activity type. You can override
     *         this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision. <p>The duration is
     *         specified in seconds; an integer greater than or equal to 0. The value
     *         "NONE" can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
        return this;
    }

    /**
     * <i>Optional.</i> The default maximum time, in seconds, before which a
     * worker processing a task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     * when <i>registering</i> an activity type. The registered default value
     * can be overridden when you schedule a task through the
     * <code>ScheduleActivityTask</code> decision. If the activity worker
     * subsequently attempts to record a heartbeat or returns a result, the
     * activity worker receives an <code>UnknownResource</code> fault. In
     * this case, Amazon SWF no longer considers the activity task to be
     * valid; the activity worker should clean up the activity task. <p>The
     * duration is specified in seconds; an integer greater than or equal to
     * 0. The value "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return <i>Optional.</i> The default maximum time, in seconds, before which a
     *         worker processing a task must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     *         when <i>registering</i> an activity type. The registered default value
     *         can be overridden when you schedule a task through the
     *         <code>ScheduleActivityTask</code> decision. If the activity worker
     *         subsequently attempts to record a heartbeat or returns a result, the
     *         activity worker receives an <code>UnknownResource</code> fault. In
     *         this case, Amazon SWF no longer considers the activity task to be
     *         valid; the activity worker should clean up the activity task. <p>The
     *         duration is specified in seconds; an integer greater than or equal to
     *         0. The value "NONE" can be used to specify unlimited duration.
     */
    public String getDefaultTaskHeartbeatTimeout() {
        return defaultTaskHeartbeatTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum time, in seconds, before which a
     * worker processing a task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     * when <i>registering</i> an activity type. The registered default value
     * can be overridden when you schedule a task through the
     * <code>ScheduleActivityTask</code> decision. If the activity worker
     * subsequently attempts to record a heartbeat or returns a result, the
     * activity worker receives an <code>UnknownResource</code> fault. In
     * this case, Amazon SWF no longer considers the activity task to be
     * valid; the activity worker should clean up the activity task. <p>The
     * duration is specified in seconds; an integer greater than or equal to
     * 0. The value "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskHeartbeatTimeout <i>Optional.</i> The default maximum time, in seconds, before which a
     *         worker processing a task must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     *         when <i>registering</i> an activity type. The registered default value
     *         can be overridden when you schedule a task through the
     *         <code>ScheduleActivityTask</code> decision. If the activity worker
     *         subsequently attempts to record a heartbeat or returns a result, the
     *         activity worker receives an <code>UnknownResource</code> fault. In
     *         this case, Amazon SWF no longer considers the activity task to be
     *         valid; the activity worker should clean up the activity task. <p>The
     *         duration is specified in seconds; an integer greater than or equal to
     *         0. The value "NONE" can be used to specify unlimited duration.
     */
    public void setDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum time, in seconds, before which a
     * worker processing a task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     * when <i>registering</i> an activity type. The registered default value
     * can be overridden when you schedule a task through the
     * <code>ScheduleActivityTask</code> decision. If the activity worker
     * subsequently attempts to record a heartbeat or returns a result, the
     * activity worker receives an <code>UnknownResource</code> fault. In
     * this case, Amazon SWF no longer considers the activity task to be
     * valid; the activity worker should clean up the activity task. <p>The
     * duration is specified in seconds; an integer greater than or equal to
     * 0. The value "NONE" can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskHeartbeatTimeout <i>Optional.</i> The default maximum time, in seconds, before which a
     *         worker processing a task must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. <p>You can specify this value only
     *         when <i>registering</i> an activity type. The registered default value
     *         can be overridden when you schedule a task through the
     *         <code>ScheduleActivityTask</code> decision. If the activity worker
     *         subsequently attempts to record a heartbeat or returns a result, the
     *         activity worker receives an <code>UnknownResource</code> fault. In
     *         this case, Amazon SWF no longer considers the activity task to be
     *         valid; the activity worker should clean up the activity task. <p>The
     *         duration is specified in seconds; an integer greater than or equal to
     *         0. The value "NONE" can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
        return this;
    }

    /**
     * <i>Optional.</i> The default task list specified for this activity
     * type at registration. This default is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> decision. You can override the
     * default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     *
     * @return <i>Optional.</i> The default task list specified for this activity
     *         type at registration. This default is used if a task list is not
     *         provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> decision. You can override the
     *         default registered task list when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision.
     */
    public TaskList getDefaultTaskList() {
        return defaultTaskList;
    }
    
    /**
     * <i>Optional.</i> The default task list specified for this activity
     * type at registration. This default is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> decision. You can override the
     * default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     *
     * @param defaultTaskList <i>Optional.</i> The default task list specified for this activity
     *         type at registration. This default is used if a task list is not
     *         provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> decision. You can override the
     *         default registered task list when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision.
     */
    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }
    
    /**
     * <i>Optional.</i> The default task list specified for this activity
     * type at registration. This default is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> decision. You can override the
     * default registered task list when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultTaskList <i>Optional.</i> The default task list specified for this activity
     *         type at registration. This default is used if a task list is not
     *         provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> decision. You can override the
     *         default registered task list when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
        return this;
    }

    /**
     * <i>Optional.</i> The default task priority for tasks of this activity
     * type, specified at registration. If not set, then "0" will be used as
     * the default priority. This default can be overridden when scheduling
     * an activity task. <p>Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @return <i>Optional.</i> The default task priority for tasks of this activity
     *         type, specified at registration. If not set, then "0" will be used as
     *         the default priority. This default can be overridden when scheduling
     *         an activity task. <p>Valid values are integers that range from Java's
     *         <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     */
    public String getDefaultTaskPriority() {
        return defaultTaskPriority;
    }
    
    /**
     * <i>Optional.</i> The default task priority for tasks of this activity
     * type, specified at registration. If not set, then "0" will be used as
     * the default priority. This default can be overridden when scheduling
     * an activity task. <p>Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @param defaultTaskPriority <i>Optional.</i> The default task priority for tasks of this activity
     *         type, specified at registration. If not set, then "0" will be used as
     *         the default priority. This default can be overridden when scheduling
     *         an activity task. <p>Valid values are integers that range from Java's
     *         <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     */
    public void setDefaultTaskPriority(String defaultTaskPriority) {
        this.defaultTaskPriority = defaultTaskPriority;
    }
    
    /**
     * <i>Optional.</i> The default task priority for tasks of this activity
     * type, specified at registration. If not set, then "0" will be used as
     * the default priority. This default can be overridden when scheduling
     * an activity task. <p>Valid values are integers that range from Java's
     * <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @param defaultTaskPriority <i>Optional.</i> The default task priority for tasks of this activity
     *         type, specified at registration. If not set, then "0" will be used as
     *         the default priority. This default can be overridden when scheduling
     *         an activity task. <p>Valid values are integers that range from Java's
     *         <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskPriority(String defaultTaskPriority) {
        this.defaultTaskPriority = defaultTaskPriority;
        return this;
    }

    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, that a task of an activity type can
     * wait before being assigned to a worker. You can override this default
     * when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return <i>Optional.</i> The default maximum duration, specified when
     *         registering the activity type, that a task of an activity type can
     *         wait before being assigned to a worker. You can override this default
     *         when scheduling a task through the <code>ScheduleActivityTask</code>
     *         decision. <p>The duration is specified in seconds; an integer greater
     *         than or equal to 0. The value "NONE" can be used to specify unlimited
     *         duration.
     */
    public String getDefaultTaskScheduleToStartTimeout() {
        return defaultTaskScheduleToStartTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, that a task of an activity type can
     * wait before being assigned to a worker. You can override this default
     * when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToStartTimeout <i>Optional.</i> The default maximum duration, specified when
     *         registering the activity type, that a task of an activity type can
     *         wait before being assigned to a worker. You can override this default
     *         when scheduling a task through the <code>ScheduleActivityTask</code>
     *         decision. <p>The duration is specified in seconds; an integer greater
     *         than or equal to 0. The value "NONE" can be used to specify unlimited
     *         duration.
     */
    public void setDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, that a task of an activity type can
     * wait before being assigned to a worker. You can override this default
     * when scheduling a task through the <code>ScheduleActivityTask</code>
     * decision. <p>The duration is specified in seconds; an integer greater
     * than or equal to 0. The value "NONE" can be used to specify unlimited
     * duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToStartTimeout <i>Optional.</i> The default maximum duration, specified when
     *         registering the activity type, that a task of an activity type can
     *         wait before being assigned to a worker. You can override this default
     *         when scheduling a task through the <code>ScheduleActivityTask</code>
     *         decision. <p>The duration is specified in seconds; an integer greater
     *         than or equal to 0. The value "NONE" can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
        return this;
    }

    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, for tasks of this activity type. You
     * can override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return <i>Optional.</i> The default maximum duration, specified when
     *         registering the activity type, for tasks of this activity type. You
     *         can override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision. <p>The duration is
     *         specified in seconds; an integer greater than or equal to 0. The value
     *         "NONE" can be used to specify unlimited duration.
     */
    public String getDefaultTaskScheduleToCloseTimeout() {
        return defaultTaskScheduleToCloseTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, for tasks of this activity type. You
     * can override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToCloseTimeout <i>Optional.</i> The default maximum duration, specified when
     *         registering the activity type, for tasks of this activity type. You
     *         can override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision. <p>The duration is
     *         specified in seconds; an integer greater than or equal to 0. The value
     *         "NONE" can be used to specify unlimited duration.
     */
    public void setDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
    }
    
    /**
     * <i>Optional.</i> The default maximum duration, specified when
     * registering the activity type, for tasks of this activity type. You
     * can override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> decision. <p>The duration is
     * specified in seconds; an integer greater than or equal to 0. The value
     * "NONE" can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToCloseTimeout <i>Optional.</i> The default maximum duration, specified when
     *         registering the activity type, for tasks of this activity type. You
     *         can override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> decision. <p>The duration is
     *         specified in seconds; an integer greater than or equal to 0. The value
     *         "NONE" can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
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
        if (getDefaultTaskHeartbeatTimeout() != null) sb.append("DefaultTaskHeartbeatTimeout: " + getDefaultTaskHeartbeatTimeout() + ",");
        if (getDefaultTaskList() != null) sb.append("DefaultTaskList: " + getDefaultTaskList() + ",");
        if (getDefaultTaskPriority() != null) sb.append("DefaultTaskPriority: " + getDefaultTaskPriority() + ",");
        if (getDefaultTaskScheduleToStartTimeout() != null) sb.append("DefaultTaskScheduleToStartTimeout: " + getDefaultTaskScheduleToStartTimeout() + ",");
        if (getDefaultTaskScheduleToCloseTimeout() != null) sb.append("DefaultTaskScheduleToCloseTimeout: " + getDefaultTaskScheduleToCloseTimeout() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTypeConfiguration == false) return false;
        ActivityTypeConfiguration other = (ActivityTypeConfiguration)obj;
        
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null) return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false) return false; 
        if (other.getDefaultTaskHeartbeatTimeout() == null ^ this.getDefaultTaskHeartbeatTimeout() == null) return false;
        if (other.getDefaultTaskHeartbeatTimeout() != null && other.getDefaultTaskHeartbeatTimeout().equals(this.getDefaultTaskHeartbeatTimeout()) == false) return false; 
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null) return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false) return false; 
        if (other.getDefaultTaskPriority() == null ^ this.getDefaultTaskPriority() == null) return false;
        if (other.getDefaultTaskPriority() != null && other.getDefaultTaskPriority().equals(this.getDefaultTaskPriority()) == false) return false; 
        if (other.getDefaultTaskScheduleToStartTimeout() == null ^ this.getDefaultTaskScheduleToStartTimeout() == null) return false;
        if (other.getDefaultTaskScheduleToStartTimeout() != null && other.getDefaultTaskScheduleToStartTimeout().equals(this.getDefaultTaskScheduleToStartTimeout()) == false) return false; 
        if (other.getDefaultTaskScheduleToCloseTimeout() == null ^ this.getDefaultTaskScheduleToCloseTimeout() == null) return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() != null && other.getDefaultTaskScheduleToCloseTimeout().equals(this.getDefaultTaskScheduleToCloseTimeout()) == false) return false; 
        return true;
    }
    
    @Override
    public ActivityTypeConfiguration clone() {
        try {
            return (ActivityTypeConfiguration) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    