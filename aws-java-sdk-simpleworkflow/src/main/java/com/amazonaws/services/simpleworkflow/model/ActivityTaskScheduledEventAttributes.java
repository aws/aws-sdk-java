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
 * Provides the details of the <code>ActivityTaskScheduled</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ActivityTaskScheduledEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityTaskScheduledEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the activity task.
     * </p>
     */
    private ActivityType activityType;
    /**
     * <p>
     * The unique ID of the activity task.
     * </p>
     */
    private String activityId;
    /**
     * <p>
     * The input provided to the activity task.
     * </p>
     */
    private String input;
    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to
     * the activity.
     * </p>
     */
    private String control;
    /**
     * <p>
     * The maximum amount of time the activity task can wait to be assigned to a worker.
     * </p>
     */
    private String scheduleToStartTimeout;
    /**
     * <p>
     * The maximum amount of time for this activity task.
     * </p>
     */
    private String scheduleToCloseTimeout;
    /**
     * <p>
     * The maximum amount of time a worker may take to process the activity task.
     * </p>
     */
    private String startToCloseTimeout;
    /**
     * <p>
     * The task list in which the activity task has been scheduled.
     * </p>
     */
    private TaskList taskList;
    /**
     * <p>
     * The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was
     * assigned when the activity type was registered.
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
    private String taskPriority;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;
    /**
     * <p>
     * The maximum time before which the worker processing this task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     * </p>
     */
    private String heartbeatTimeout;

    /**
     * <p>
     * The type of the activity task.
     * </p>
     * 
     * @param activityType
     *        The type of the activity task.
     */

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    /**
     * <p>
     * The type of the activity task.
     * </p>
     * 
     * @return The type of the activity task.
     */

    public ActivityType getActivityType() {
        return this.activityType;
    }

    /**
     * <p>
     * The type of the activity task.
     * </p>
     * 
     * @param activityType
     *        The type of the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withActivityType(ActivityType activityType) {
        setActivityType(activityType);
        return this;
    }

    /**
     * <p>
     * The unique ID of the activity task.
     * </p>
     * 
     * @param activityId
     *        The unique ID of the activity task.
     */

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The unique ID of the activity task.
     * </p>
     * 
     * @return The unique ID of the activity task.
     */

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * <p>
     * The unique ID of the activity task.
     * </p>
     * 
     * @param activityId
     *        The unique ID of the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withActivityId(String activityId) {
        setActivityId(activityId);
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

    public ActivityTaskScheduledEventAttributes withInput(String input) {
        setInput(input);
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

    public ActivityTaskScheduledEventAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time the activity task can wait to be assigned to a worker.
     * </p>
     * 
     * @param scheduleToStartTimeout
     *        The maximum amount of time the activity task can wait to be assigned to a worker.
     */

    public void setScheduleToStartTimeout(String scheduleToStartTimeout) {
        this.scheduleToStartTimeout = scheduleToStartTimeout;
    }

    /**
     * <p>
     * The maximum amount of time the activity task can wait to be assigned to a worker.
     * </p>
     * 
     * @return The maximum amount of time the activity task can wait to be assigned to a worker.
     */

    public String getScheduleToStartTimeout() {
        return this.scheduleToStartTimeout;
    }

    /**
     * <p>
     * The maximum amount of time the activity task can wait to be assigned to a worker.
     * </p>
     * 
     * @param scheduleToStartTimeout
     *        The maximum amount of time the activity task can wait to be assigned to a worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withScheduleToStartTimeout(String scheduleToStartTimeout) {
        setScheduleToStartTimeout(scheduleToStartTimeout);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time for this activity task.
     * </p>
     * 
     * @param scheduleToCloseTimeout
     *        The maximum amount of time for this activity task.
     */

    public void setScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        this.scheduleToCloseTimeout = scheduleToCloseTimeout;
    }

    /**
     * <p>
     * The maximum amount of time for this activity task.
     * </p>
     * 
     * @return The maximum amount of time for this activity task.
     */

    public String getScheduleToCloseTimeout() {
        return this.scheduleToCloseTimeout;
    }

    /**
     * <p>
     * The maximum amount of time for this activity task.
     * </p>
     * 
     * @param scheduleToCloseTimeout
     *        The maximum amount of time for this activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withScheduleToCloseTimeout(String scheduleToCloseTimeout) {
        setScheduleToCloseTimeout(scheduleToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time a worker may take to process the activity task.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum amount of time a worker may take to process the activity task.
     */

    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum amount of time a worker may take to process the activity task.
     * </p>
     * 
     * @return The maximum amount of time a worker may take to process the activity task.
     */

    public String getStartToCloseTimeout() {
        return this.startToCloseTimeout;
    }

    /**
     * <p>
     * The maximum amount of time a worker may take to process the activity task.
     * </p>
     * 
     * @param startToCloseTimeout
     *        The maximum amount of time a worker may take to process the activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        setStartToCloseTimeout(startToCloseTimeout);
        return this;
    }

    /**
     * <p>
     * The task list in which the activity task has been scheduled.
     * </p>
     * 
     * @param taskList
     *        The task list in which the activity task has been scheduled.
     */

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * <p>
     * The task list in which the activity task has been scheduled.
     * </p>
     * 
     * @return The task list in which the activity task has been scheduled.
     */

    public TaskList getTaskList() {
        return this.taskList;
    }

    /**
     * <p>
     * The task list in which the activity task has been scheduled.
     * </p>
     * 
     * @param taskList
     *        The task list in which the activity task has been scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withTaskList(TaskList taskList) {
        setTaskList(taskList);
        return this;
    }

    /**
     * <p>
     * The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was
     * assigned when the activity type was registered.
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
     * @param taskPriority
     *        The priority to assign to the scheduled activity task. If set, this overrides any default priority value
     *        that was assigned when the activity type was registered.</p>
     *        <p>
     *        Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *        <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *        </p>
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
     * The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was
     * assigned when the activity type was registered.
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
     * @return The priority to assign to the scheduled activity task. If set, this overrides any default priority value
     *         that was assigned when the activity type was registered.</p>
     *         <p>
     *         Valid values are integers that range from Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate higher priority.
     *         </p>
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
     * The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was
     * assigned when the activity type was registered.
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
     * @param taskPriority
     *        The priority to assign to the scheduled activity task. If set, this overrides any default priority value
     *        that was assigned when the activity type was registered.</p>
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

    public ActivityTaskScheduledEventAttributes withTaskPriority(String taskPriority) {
        setTaskPriority(taskPriority);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     *        scheduling of this activity task. This information can be useful for diagnosing problems by tracing back
     *        the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     *         scheduling of this activity task. This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     * scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision that resulted in the
     *        scheduling of this activity task. This information can be useful for diagnosing problems by tracing back
     *        the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
        return this;
    }

    /**
     * <p>
     * The maximum time before which the worker processing this task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     * </p>
     * 
     * @param heartbeatTimeout
     *        The maximum time before which the worker processing this task must report progress by calling
     *        <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     *        out. If the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     */

    public void setHeartbeatTimeout(String heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time before which the worker processing this task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     * </p>
     * 
     * @return The maximum time before which the worker processing this task must report progress by calling
     *         <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     *         out. If the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     */

    public String getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * <p>
     * The maximum time before which the worker processing this task must report progress by calling
     * <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed out. If
     * the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     * </p>
     * 
     * @param heartbeatTimeout
     *        The maximum time before which the worker processing this task must report progress by calling
     *        <a>RecordActivityTaskHeartbeat</a>. If the timeout is exceeded, the activity task is automatically timed
     *        out. If the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskScheduledEventAttributes withHeartbeatTimeout(String heartbeatTimeout) {
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl()).append(",");
        if (getScheduleToStartTimeout() != null)
            sb.append("ScheduleToStartTimeout: ").append(getScheduleToStartTimeout()).append(",");
        if (getScheduleToCloseTimeout() != null)
            sb.append("ScheduleToCloseTimeout: ").append(getScheduleToCloseTimeout()).append(",");
        if (getStartToCloseTimeout() != null)
            sb.append("StartToCloseTimeout: ").append(getStartToCloseTimeout()).append(",");
        if (getTaskList() != null)
            sb.append("TaskList: ").append(getTaskList()).append(",");
        if (getTaskPriority() != null)
            sb.append("TaskPriority: ").append(getTaskPriority()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId()).append(",");
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

        if (obj instanceof ActivityTaskScheduledEventAttributes == false)
            return false;
        ActivityTaskScheduledEventAttributes other = (ActivityTaskScheduledEventAttributes) obj;
        if (other.getActivityType() == null ^ this.getActivityType() == null)
            return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false)
            return false;
        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getScheduleToStartTimeout() == null ^ this.getScheduleToStartTimeout() == null)
            return false;
        if (other.getScheduleToStartTimeout() != null && other.getScheduleToStartTimeout().equals(this.getScheduleToStartTimeout()) == false)
            return false;
        if (other.getScheduleToCloseTimeout() == null ^ this.getScheduleToCloseTimeout() == null)
            return false;
        if (other.getScheduleToCloseTimeout() != null && other.getScheduleToCloseTimeout().equals(this.getScheduleToCloseTimeout()) == false)
            return false;
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null)
            return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false)
            return false;
        if (other.getTaskList() == null ^ this.getTaskList() == null)
            return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false)
            return false;
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null)
            return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
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
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getScheduleToStartTimeout() == null) ? 0 : getScheduleToStartTimeout().hashCode());
        hashCode = prime * hashCode + ((getScheduleToCloseTimeout() == null) ? 0 : getScheduleToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode());
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode());
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        hashCode = prime * hashCode + ((getHeartbeatTimeout() == null) ? 0 : getHeartbeatTimeout().hashCode());
        return hashCode;
    }

    @Override
    public ActivityTaskScheduledEventAttributes clone() {
        try {
            return (ActivityTaskScheduledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ActivityTaskScheduledEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
