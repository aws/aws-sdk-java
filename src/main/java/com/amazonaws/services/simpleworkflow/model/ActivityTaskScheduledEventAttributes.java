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
 * Provides details of the <code>ActivityTaskScheduled</code> event.
 * </p>
 */
public class ActivityTaskScheduledEventAttributes implements Serializable {

    /**
     * The type of the activity task.
     */
    private ActivityType activityType;

    /**
     * The unique id of the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String activityId;

    /**
     * The input provided to the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks. This data is not sent to the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The maximum amount of time the activity task can wait to be assigned
     * to a worker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String scheduleToStartTimeout;

    /**
     * The maximum amount of time for this activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String scheduleToCloseTimeout;

    /**
     * The maximum amount of time a worker may take to process the activity
     * task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String startToCloseTimeout;

    /**
     * The task list in which the activity task has been scheduled.
     */
    private TaskList taskList;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The maximum time before which the worker processing this task must
     * report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     * timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a
     * result, it will be ignored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String heartbeatTimeout;

    /**
     * The type of the activity task.
     *
     * @return The type of the activity task.
     */
    public ActivityType getActivityType() {
        return activityType;
    }
    
    /**
     * The type of the activity task.
     *
     * @param activityType The type of the activity task.
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * The type of the activity task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityType The type of the activity task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * The unique id of the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique id of the activity task.
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * The unique id of the activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The unique id of the activity task.
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * The unique id of the activity task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The unique id of the activity task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withActivityId(String activityId) {
        this.activityId = activityId;
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
    public ActivityTaskScheduledEventAttributes withInput(String input) {
        this.input = input;
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
    public ActivityTaskScheduledEventAttributes withControl(String control) {
        this.control = control;
        return this;
    }

    /**
     * The maximum amount of time the activity task can wait to be assigned
     * to a worker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum amount of time the activity task can wait to be assigned
     *         to a worker.
     */
    public String getScheduleToStartTimeout() {
        return scheduleToStartTimeout;
    }
    
    /**
     * The maximum amount of time the activity task can wait to be assigned
     * to a worker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToStartTimeout The maximum amount of time the activity task can wait to be assigned
     *         to a worker.
     */
    public void setScheduleToStartTimeout(String scheduleToStartTimeout) {
        this.scheduleToStartTimeout = scheduleToStartTimeout;
    }
    
    /**
     * The maximum amount of time the activity task can wait to be assigned
     * to a worker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToStartTimeout The maximum amount of time the activity task can wait to be assigned
     *         to a worker.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withScheduleToStartTimeout(String scheduleToStartTimeout) {
        this.scheduleToStartTimeout = scheduleToStartTimeout;
        return this;
    }

    /**
     * The maximum amount of time for this activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum amount of time for this activity task.
     */
    public String getScheduleToCloseTimeout() {
        return scheduleToCloseTimeout;
    }
    
    /**
     * The maximum amount of time for this activity task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToCloseTimeout The maximum amount of time for this activity task.
     */
    public void setScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        this.scheduleToCloseTimeout = scheduleToCloseTimeout;
    }
    
    /**
     * The maximum amount of time for this activity task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param scheduleToCloseTimeout The maximum amount of time for this activity task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        this.scheduleToCloseTimeout = scheduleToCloseTimeout;
        return this;
    }

    /**
     * The maximum amount of time a worker may take to process the activity
     * task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum amount of time a worker may take to process the activity
     *         task.
     */
    public String getStartToCloseTimeout() {
        return startToCloseTimeout;
    }
    
    /**
     * The maximum amount of time a worker may take to process the activity
     * task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param startToCloseTimeout The maximum amount of time a worker may take to process the activity
     *         task.
     */
    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }
    
    /**
     * The maximum amount of time a worker may take to process the activity
     * task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param startToCloseTimeout The maximum amount of time a worker may take to process the activity
     *         task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
        return this;
    }

    /**
     * The task list in which the activity task has been scheduled.
     *
     * @return The task list in which the activity task has been scheduled.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The task list in which the activity task has been scheduled.
     *
     * @param taskList The task list in which the activity task has been scheduled.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The task list in which the activity task has been scheduled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The task list in which the activity task has been scheduled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision that resulted in the scheduling of this activity task.
     *         This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision that resulted in the scheduling of this activity task.
     *         This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision that resulted in the scheduling of this activity task.
     *         This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }

    /**
     * The maximum time before which the worker processing this task must
     * report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     * timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a
     * result, it will be ignored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum time before which the worker processing this task must
     *         report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     *         timeout is exceeded, the activity task is automatically timed out. If
     *         the worker subsequently attempts to record a heartbeat or return a
     *         result, it will be ignored.
     */
    public String getHeartbeatTimeout() {
        return heartbeatTimeout;
    }
    
    /**
     * The maximum time before which the worker processing this task must
     * report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     * timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a
     * result, it will be ignored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param heartbeatTimeout The maximum time before which the worker processing this task must
     *         report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     *         timeout is exceeded, the activity task is automatically timed out. If
     *         the worker subsequently attempts to record a heartbeat or return a
     *         result, it will be ignored.
     */
    public void setHeartbeatTimeout(String heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }
    
    /**
     * The maximum time before which the worker processing this task must
     * report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     * timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a
     * result, it will be ignored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param heartbeatTimeout The maximum time before which the worker processing this task must
     *         report progress by calling <a>RecordActivityTaskHeartbeat</a>. If the
     *         timeout is exceeded, the activity task is automatically timed out. If
     *         the worker subsequently attempts to record a heartbeat or return a
     *         result, it will be ignored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskScheduledEventAttributes withHeartbeatTimeout(String heartbeatTimeout) {
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
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getControl() != null) sb.append("Control: " + getControl() + ",");
        if (getScheduleToStartTimeout() != null) sb.append("ScheduleToStartTimeout: " + getScheduleToStartTimeout() + ",");
        if (getScheduleToCloseTimeout() != null) sb.append("ScheduleToCloseTimeout: " + getScheduleToCloseTimeout() + ",");
        if (getStartToCloseTimeout() != null) sb.append("StartToCloseTimeout: " + getStartToCloseTimeout() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
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
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode()); 
        hashCode = prime * hashCode + ((getScheduleToStartTimeout() == null) ? 0 : getScheduleToStartTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getScheduleToCloseTimeout() == null) ? 0 : getScheduleToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTaskScheduledEventAttributes == false) return false;
        ActivityTaskScheduledEventAttributes other = (ActivityTaskScheduledEventAttributes)obj;
        
        if (other.getActivityType() == null ^ this.getActivityType() == null) return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false) return false; 
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        if (other.getScheduleToStartTimeout() == null ^ this.getScheduleToStartTimeout() == null) return false;
        if (other.getScheduleToStartTimeout() != null && other.getScheduleToStartTimeout().equals(this.getScheduleToStartTimeout()) == false) return false; 
        if (other.getScheduleToCloseTimeout() == null ^ this.getScheduleToCloseTimeout() == null) return false;
        if (other.getScheduleToCloseTimeout() != null && other.getScheduleToCloseTimeout().equals(this.getScheduleToCloseTimeout()) == false) return false; 
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null) return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getHeartbeatTimeout() == null ^ this.getHeartbeatTimeout() == null) return false;
        if (other.getHeartbeatTimeout() != null && other.getHeartbeatTimeout().equals(this.getHeartbeatTimeout()) == false) return false; 
        return true;
    }
    
}
    