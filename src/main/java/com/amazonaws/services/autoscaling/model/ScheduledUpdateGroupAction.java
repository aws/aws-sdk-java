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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * This data type stores information about a scheduled update to an Auto Scaling group.
 * </p>
 */
public class ScheduledUpdateGroupAction implements Serializable {

    /**
     * The name of the Auto Scaling group to be updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of this scheduled action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String scheduledActionName;

    /**
     * The Amazon Resource Name (ARN) of this scheduled action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String scheduledActionARN;

    /**
     * <code>Time</code> is deprecated. <p>The time that the action is
     * scheduled to begin. <code>Time</code> is an alias for
     * <code>StartTime</code>.
     */
    private java.util.Date time;

    /**
     * The time that the action is scheduled to begin. This value can be up
     * to one month in the future. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     */
    private java.util.Date startTime;

    /**
     * The time that the action is scheduled to end. This value can be up to
     * one month in the future.
     */
    private java.util.Date endTime;

    /**
     * The regular schedule that an action occurs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String recurrence;

    /**
     * The minimum size of the Auto Scaling group.
     */
    private Integer minSize;

    /**
     * The maximum size of the Auto Scaling group.
     */
    private Integer maxSize;

    /**
     * The number of instances you prefer to maintain in your Auto Scaling
     * group.
     */
    private Integer desiredCapacity;

    /**
     * The name of the Auto Scaling group to be updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group to be updated.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to be updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to be updated.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to be updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to be updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name of this scheduled action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of this scheduled action.
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }
    
    /**
     * The name of this scheduled action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param scheduledActionName The name of this scheduled action.
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }
    
    /**
     * The name of this scheduled action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param scheduledActionName The name of this scheduled action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of this scheduled action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon Resource Name (ARN) of this scheduled action.
     */
    public String getScheduledActionARN() {
        return scheduledActionARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of this scheduled action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param scheduledActionARN The Amazon Resource Name (ARN) of this scheduled action.
     */
    public void setScheduledActionARN(String scheduledActionARN) {
        this.scheduledActionARN = scheduledActionARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of this scheduled action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param scheduledActionARN The Amazon Resource Name (ARN) of this scheduled action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withScheduledActionARN(String scheduledActionARN) {
        this.scheduledActionARN = scheduledActionARN;
        return this;
    }

    /**
     * <code>Time</code> is deprecated. <p>The time that the action is
     * scheduled to begin. <code>Time</code> is an alias for
     * <code>StartTime</code>.
     *
     * @return <code>Time</code> is deprecated. <p>The time that the action is
     *         scheduled to begin. <code>Time</code> is an alias for
     *         <code>StartTime</code>.
     */
    public java.util.Date getTime() {
        return time;
    }
    
    /**
     * <code>Time</code> is deprecated. <p>The time that the action is
     * scheduled to begin. <code>Time</code> is an alias for
     * <code>StartTime</code>.
     *
     * @param time <code>Time</code> is deprecated. <p>The time that the action is
     *         scheduled to begin. <code>Time</code> is an alias for
     *         <code>StartTime</code>.
     */
    public void setTime(java.util.Date time) {
        this.time = time;
    }
    
    /**
     * <code>Time</code> is deprecated. <p>The time that the action is
     * scheduled to begin. <code>Time</code> is an alias for
     * <code>StartTime</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param time <code>Time</code> is deprecated. <p>The time that the action is
     *         scheduled to begin. <code>Time</code> is an alias for
     *         <code>StartTime</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withTime(java.util.Date time) {
        this.time = time;
        return this;
    }

    /**
     * The time that the action is scheduled to begin. This value can be up
     * to one month in the future. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     *
     * @return The time that the action is scheduled to begin. This value can be up
     *         to one month in the future. <p>When <code>StartTime</code> and
     *         <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action will start and stop.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time that the action is scheduled to begin. This value can be up
     * to one month in the future. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     *
     * @param startTime The time that the action is scheduled to begin. This value can be up
     *         to one month in the future. <p>When <code>StartTime</code> and
     *         <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action will start and stop.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time that the action is scheduled to begin. This value can be up
     * to one month in the future. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time that the action is scheduled to begin. This value can be up
     *         to one month in the future. <p>When <code>StartTime</code> and
     *         <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action will start and stop.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time that the action is scheduled to end. This value can be up to
     * one month in the future.
     *
     * @return The time that the action is scheduled to end. This value can be up to
     *         one month in the future.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The time that the action is scheduled to end. This value can be up to
     * one month in the future.
     *
     * @param endTime The time that the action is scheduled to end. This value can be up to
     *         one month in the future.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The time that the action is scheduled to end. This value can be up to
     * one month in the future.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The time that the action is scheduled to end. This value can be up to
     *         one month in the future.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The regular schedule that an action occurs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The regular schedule that an action occurs.
     */
    public String getRecurrence() {
        return recurrence;
    }
    
    /**
     * The regular schedule that an action occurs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param recurrence The regular schedule that an action occurs.
     */
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }
    
    /**
     * The regular schedule that an action occurs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param recurrence The regular schedule that an action occurs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * The minimum size of the Auto Scaling group.
     *
     * @return The minimum size of the Auto Scaling group.
     */
    public Integer getMinSize() {
        return minSize;
    }
    
    /**
     * The minimum size of the Auto Scaling group.
     *
     * @param minSize The minimum size of the Auto Scaling group.
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }
    
    /**
     * The minimum size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize The minimum size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * The maximum size of the Auto Scaling group.
     *
     * @return The maximum size of the Auto Scaling group.
     */
    public Integer getMaxSize() {
        return maxSize;
    }
    
    /**
     * The maximum size of the Auto Scaling group.
     *
     * @param maxSize The maximum size of the Auto Scaling group.
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
    
    /**
     * The maximum size of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize The maximum size of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * The number of instances you prefer to maintain in your Auto Scaling
     * group.
     *
     * @return The number of instances you prefer to maintain in your Auto Scaling
     *         group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The number of instances you prefer to maintain in your Auto Scaling
     * group.
     *
     * @param desiredCapacity The number of instances you prefer to maintain in your Auto Scaling
     *         group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The number of instances you prefer to maintain in your Auto Scaling
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The number of instances you prefer to maintain in your Auto Scaling
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ScheduledUpdateGroupAction withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getScheduledActionName() != null) sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getScheduledActionARN() != null) sb.append("ScheduledActionARN: " + getScheduledActionARN() + ",");
        if (getTime() != null) sb.append("Time: " + getTime() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getRecurrence() != null) sb.append("Recurrence: " + getRecurrence() + ",");
        if (getMinSize() != null) sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null) sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null) sb.append("DesiredCapacity: " + getDesiredCapacity() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduledUpdateGroupAction == false) return false;
        ScheduledUpdateGroupAction other = (ScheduledUpdateGroupAction)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null) return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false) return false; 
        if (other.getScheduledActionARN() == null ^ this.getScheduledActionARN() == null) return false;
        if (other.getScheduledActionARN() != null && other.getScheduledActionARN().equals(this.getScheduledActionARN()) == false) return false; 
        if (other.getTime() == null ^ this.getTime() == null) return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getRecurrence() == null ^ this.getRecurrence() == null) return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false) return false; 
        if (other.getMinSize() == null ^ this.getMinSize() == null) return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false) return false; 
        if (other.getMaxSize() == null ^ this.getMaxSize() == null) return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false) return false; 
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null) return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false) return false; 
        return true;
    }
    
}
    