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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a scheduled scaling action. Used in response to <a>DescribeScheduledActions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ScheduledUpdateGroupAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledUpdateGroupAction implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     */
    private String scheduledActionARN;
    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The date and time that the action is scheduled to begin.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time that the action is scheduled to end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     */
    private String recurrence;
    /**
     * <p>
     * The minimum size of the group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size of the group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @return The name of the scheduled action.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * 
     * @param scheduledActionARN
     *        The Amazon Resource Name (ARN) of the scheduled action.
     */

    public void setScheduledActionARN(String scheduledActionARN) {
        this.scheduledActionARN = scheduledActionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scheduled action.
     */

    public String getScheduledActionARN() {
        return this.scheduledActionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * 
     * @param scheduledActionARN
     *        The Amazon Resource Name (ARN) of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withScheduledActionARN(String scheduledActionARN) {
        setScheduledActionARN(scheduledActionARN);
        return this;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     * 
     * @param time
     *        This parameter is deprecated.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     * 
     * @return This parameter is deprecated.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     * 
     * @param time
     *        This parameter is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to begin.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * 
     * @param startTime
     *        The date and time that the action is scheduled to begin. </p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form
     *        the boundaries of when the recurring action starts and stops.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to begin.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * 
     * @return The date and time that the action is scheduled to begin. </p>
     *         <p>
     *         When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action starts and stops.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to begin.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form the
     * boundaries of when the recurring action starts and stops.
     * </p>
     * 
     * @param startTime
     *        The date and time that the action is scheduled to begin. </p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified with <code>Recurrence</code>, they form
     *        the boundaries of when the recurring action starts and stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to end.
     * </p>
     * 
     * @param endTime
     *        The date and time that the action is scheduled to end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to end.
     * </p>
     * 
     * @return The date and time that the action is scheduled to end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to end.
     * </p>
     * 
     * @param endTime
     *        The date and time that the action is scheduled to end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * 
     * @param recurrence
     *        The recurring schedule for the action.
     */

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * 
     * @return The recurring schedule for the action.
     */

    public String getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * 
     * @param recurrence
     *        The recurring schedule for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withRecurrence(String recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @return The minimum size of the group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @return The maximum size of the group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of instances you prefer to maintain in the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     * 
     * @return The number of instances you prefer to maintain in the group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of instances you prefer to maintain in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledUpdateGroupAction withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getScheduledActionARN() != null)
            sb.append("ScheduledActionARN: ").append(getScheduledActionARN()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledUpdateGroupAction == false)
            return false;
        ScheduledUpdateGroupAction other = (ScheduledUpdateGroupAction) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getScheduledActionARN() == null ^ this.getScheduledActionARN() == null)
            return false;
        if (other.getScheduledActionARN() != null && other.getScheduledActionARN().equals(this.getScheduledActionARN()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionARN() == null) ? 0 : getScheduledActionARN().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledUpdateGroupAction clone() {
        try {
            return (ScheduledUpdateGroupAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
