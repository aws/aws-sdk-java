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
 * Configuration settings registered with the activity type.
 * </p>
 */
public class ActivityTypeConfiguration implements Serializable {

    /**
     * The optional default maximum duration for tasks of an activity type
     * specified when registering the activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskStartToCloseTimeout;

    /**
     * The optional default maximum time, specified when registering the
     * activity type, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     * override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskHeartbeatTimeout;

    /**
     * The optional default task list specified for this activity type at
     * registration. This default task list is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     */
    private TaskList defaultTaskList;

    /**
     * The optional default maximum duration, specified when registering the
     * activity type, that a task of an activity type can wait before being
     * assigned to a worker. You can override this default when scheduling a
     * task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskScheduleToStartTimeout;

    /**
     * The optional default maximum duration, specified when registering the
     * activity type, for tasks of this activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskScheduleToCloseTimeout;

    /**
     * The optional default maximum duration for tasks of an activity type
     * specified when registering the activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The optional default maximum duration for tasks of an activity type
     *         specified when registering the activity type. You can override this
     *         default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getDefaultTaskStartToCloseTimeout() {
        return defaultTaskStartToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration for tasks of an activity type
     * specified when registering the activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout The optional default maximum duration for tasks of an activity type
     *         specified when registering the activity type. You can override this
     *         default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration for tasks of an activity type
     * specified when registering the activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout The optional default maximum duration for tasks of an activity type
     *         specified when registering the activity type. You can override this
     *         default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
        return this;
    }

    /**
     * The optional default maximum time, specified when registering the
     * activity type, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     * override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The optional default maximum time, specified when registering the
     *         activity type, before which a worker processing a task must report
     *         progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     *         override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     *         worker subsequently attempts to record a heartbeat or returns a
     *         result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task
     *         to be valid; the activity worker should clean up the activity task.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public String getDefaultTaskHeartbeatTimeout() {
        return defaultTaskHeartbeatTimeout;
    }
    
    /**
     * The optional default maximum time, specified when registering the
     * activity type, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     * override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskHeartbeatTimeout The optional default maximum time, specified when registering the
     *         activity type, before which a worker processing a task must report
     *         progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     *         override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     *         worker subsequently attempts to record a heartbeat or returns a
     *         result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task
     *         to be valid; the activity worker should clean up the activity task.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public void setDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
    }
    
    /**
     * The optional default maximum time, specified when registering the
     * activity type, before which a worker processing a task must report
     * progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     * override this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     * worker subsequently attempts to record a heartbeat or returns a
     * result, the activity worker receives an <code>UnknownResource</code>
     * fault. In this case, Amazon SWF no longer considers the activity task
     * to be valid; the activity worker should clean up the activity task.
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
     * @param defaultTaskHeartbeatTimeout The optional default maximum time, specified when registering the
     *         activity type, before which a worker processing a task must report
     *         progress by calling <a>RecordActivityTaskHeartbeat</a>. You can
     *         override this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. If the activity
     *         worker subsequently attempts to record a heartbeat or returns a
     *         result, the activity worker receives an <code>UnknownResource</code>
     *         fault. In this case, Amazon SWF no longer considers the activity task
     *         to be valid; the activity worker should clean up the activity task.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskHeartbeatTimeout(String defaultTaskHeartbeatTimeout) {
        this.defaultTaskHeartbeatTimeout = defaultTaskHeartbeatTimeout;
        return this;
    }

    /**
     * The optional default task list specified for this activity type at
     * registration. This default task list is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     *
     * @return The optional default task list specified for this activity type at
     *         registration. This default task list is used if a task list is not
     *         provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     *         this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     */
    public TaskList getDefaultTaskList() {
        return defaultTaskList;
    }
    
    /**
     * The optional default task list specified for this activity type at
     * registration. This default task list is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     *
     * @param defaultTaskList The optional default task list specified for this activity type at
     *         registration. This default task list is used if a task list is not
     *         provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     *         this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     */
    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }
    
    /**
     * The optional default task list specified for this activity type at
     * registration. This default task list is used if a task list is not
     * provided when a task is scheduled through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     * this default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultTaskList The optional default task list specified for this activity type at
     *         registration. This default task list is used if a task list is not
     *         provided when a task is scheduled through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. You can override
     *         this default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeConfiguration withDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
        return this;
    }

    /**
     * The optional default maximum duration, specified when registering the
     * activity type, that a task of an activity type can wait before being
     * assigned to a worker. You can override this default when scheduling a
     * task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The optional default maximum duration, specified when registering the
     *         activity type, that a task of an activity type can wait before being
     *         assigned to a worker. You can override this default when scheduling a
     *         task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public String getDefaultTaskScheduleToStartTimeout() {
        return defaultTaskScheduleToStartTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * activity type, that a task of an activity type can wait before being
     * assigned to a worker. You can override this default when scheduling a
     * task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
     * <p>The valid values are integers greater than or equal to
     * <code>0</code>. An integer value can be used to specify the duration
     * in seconds while <code>NONE</code> can be used to specify unlimited
     * duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToStartTimeout The optional default maximum duration, specified when registering the
     *         activity type, that a task of an activity type can wait before being
     *         assigned to a worker. You can override this default when scheduling a
     *         task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
     *         duration.
     */
    public void setDefaultTaskScheduleToStartTimeout(String defaultTaskScheduleToStartTimeout) {
        this.defaultTaskScheduleToStartTimeout = defaultTaskScheduleToStartTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * activity type, that a task of an activity type can wait before being
     * assigned to a worker. You can override this default when scheduling a
     * task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
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
     * @param defaultTaskScheduleToStartTimeout The optional default maximum duration, specified when registering the
     *         activity type, that a task of an activity type can wait before being
     *         assigned to a worker. You can override this default when scheduling a
     *         task through the <code>ScheduleActivityTask</code> <a>Decision</a>.
     *         <p>The valid values are integers greater than or equal to
     *         <code>0</code>. An integer value can be used to specify the duration
     *         in seconds while <code>NONE</code> can be used to specify unlimited
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
     * The optional default maximum duration, specified when registering the
     * activity type, for tasks of this activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The optional default maximum duration, specified when registering the
     *         activity type, for tasks of this activity type. You can override this
     *         default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getDefaultTaskScheduleToCloseTimeout() {
        return defaultTaskScheduleToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * activity type, for tasks of this activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToCloseTimeout The optional default maximum duration, specified when registering the
     *         activity type, for tasks of this activity type. You can override this
     *         default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setDefaultTaskScheduleToCloseTimeout(String defaultTaskScheduleToCloseTimeout) {
        this.defaultTaskScheduleToCloseTimeout = defaultTaskScheduleToCloseTimeout;
    }
    
    /**
     * The optional default maximum duration, specified when registering the
     * activity type, for tasks of this activity type. You can override this
     * default when scheduling a task through the
     * <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskScheduleToCloseTimeout The optional default maximum duration, specified when registering the
     *         activity type, for tasks of this activity type. You can override this
     *         default when scheduling a task through the
     *         <code>ScheduleActivityTask</code> <a>Decision</a>. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
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
        if (other.getDefaultTaskScheduleToStartTimeout() == null ^ this.getDefaultTaskScheduleToStartTimeout() == null) return false;
        if (other.getDefaultTaskScheduleToStartTimeout() != null && other.getDefaultTaskScheduleToStartTimeout().equals(this.getDefaultTaskScheduleToStartTimeout()) == false) return false; 
        if (other.getDefaultTaskScheduleToCloseTimeout() == null ^ this.getDefaultTaskScheduleToCloseTimeout() == null) return false;
        if (other.getDefaultTaskScheduleToCloseTimeout() != null && other.getDefaultTaskScheduleToCloseTimeout().equals(this.getDefaultTaskScheduleToCloseTimeout()) == false) return false; 
        return true;
    }
    
}
    