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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest) PutScheduledUpdateGroupAction operation}.
 * <p>
 * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter
 * unspecified, the corresponding value remains unchanged in the affected Auto Scaling group.
 * </p>
 * <p>
 * For information on creating or updating a scheduled action for your Auto Scaling group, see <a
 * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html"> Scale Based on a Schedule </a> .
 * </p>
 * <p>
 * <b>NOTE:</b> Auto Scaling supports the date and time expressed in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest)
 */
public class PutScheduledUpdateGroupActionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of this scaling action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String scheduledActionName;

    /**
     * <code>Time</code> is deprecated. <p>The time for this action to start.
     * <code>Time</code> is an alias for <code>StartTime</code> and can be
     * specified instead of <code>StartTime</code>, or vice versa. If both
     * <code>Time</code> and <code>StartTime</code> are specified, their
     * values should be identical. Otherwise,
     * <code>PutScheduledUpdateGroupAction</code> will return an error.
     */
    private java.util.Date time;

    /**
     * The time for this action to start, as in <code>--start-time
     * 2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     * the past, Auto Scaling returns an error message. <p>When
     * <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the
     * recurring action will start and stop.
     */
    private java.util.Date startTime;

    /**
     * The time for this action to end.
     */
    private java.util.Date endTime;

    /**
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For
     * information about cron syntax, go to <a
     * href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     * Encyclopedia</a>. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String recurrence;

    /**
     * The minimum size for the new Auto Scaling group.
     */
    private Integer minSize;

    /**
     * The maximum size for the Auto Scaling group.
     */
    private Integer maxSize;

    /**
     * The number of Amazon EC2 instances that should be running in the
     * group.
     */
    private Integer desiredCapacity;

    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name of this scaling action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of this scaling action.
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }
    
    /**
     * The name of this scaling action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param scheduledActionName The name of this scaling action.
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }
    
    /**
     * The name of this scaling action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param scheduledActionName The name of this scaling action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * <code>Time</code> is deprecated. <p>The time for this action to start.
     * <code>Time</code> is an alias for <code>StartTime</code> and can be
     * specified instead of <code>StartTime</code>, or vice versa. If both
     * <code>Time</code> and <code>StartTime</code> are specified, their
     * values should be identical. Otherwise,
     * <code>PutScheduledUpdateGroupAction</code> will return an error.
     *
     * @return <code>Time</code> is deprecated. <p>The time for this action to start.
     *         <code>Time</code> is an alias for <code>StartTime</code> and can be
     *         specified instead of <code>StartTime</code>, or vice versa. If both
     *         <code>Time</code> and <code>StartTime</code> are specified, their
     *         values should be identical. Otherwise,
     *         <code>PutScheduledUpdateGroupAction</code> will return an error.
     */
    public java.util.Date getTime() {
        return time;
    }
    
    /**
     * <code>Time</code> is deprecated. <p>The time for this action to start.
     * <code>Time</code> is an alias for <code>StartTime</code> and can be
     * specified instead of <code>StartTime</code>, or vice versa. If both
     * <code>Time</code> and <code>StartTime</code> are specified, their
     * values should be identical. Otherwise,
     * <code>PutScheduledUpdateGroupAction</code> will return an error.
     *
     * @param time <code>Time</code> is deprecated. <p>The time for this action to start.
     *         <code>Time</code> is an alias for <code>StartTime</code> and can be
     *         specified instead of <code>StartTime</code>, or vice versa. If both
     *         <code>Time</code> and <code>StartTime</code> are specified, their
     *         values should be identical. Otherwise,
     *         <code>PutScheduledUpdateGroupAction</code> will return an error.
     */
    public void setTime(java.util.Date time) {
        this.time = time;
    }
    
    /**
     * <code>Time</code> is deprecated. <p>The time for this action to start.
     * <code>Time</code> is an alias for <code>StartTime</code> and can be
     * specified instead of <code>StartTime</code>, or vice versa. If both
     * <code>Time</code> and <code>StartTime</code> are specified, their
     * values should be identical. Otherwise,
     * <code>PutScheduledUpdateGroupAction</code> will return an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param time <code>Time</code> is deprecated. <p>The time for this action to start.
     *         <code>Time</code> is an alias for <code>StartTime</code> and can be
     *         specified instead of <code>StartTime</code>, or vice versa. If both
     *         <code>Time</code> and <code>StartTime</code> are specified, their
     *         values should be identical. Otherwise,
     *         <code>PutScheduledUpdateGroupAction</code> will return an error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withTime(java.util.Date time) {
        this.time = time;
        return this;
    }

    /**
     * The time for this action to start, as in <code>--start-time
     * 2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     * the past, Auto Scaling returns an error message. <p>When
     * <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the
     * recurring action will start and stop.
     *
     * @return The time for this action to start, as in <code>--start-time
     *         2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     *         the past, Auto Scaling returns an error message. <p>When
     *         <code>StartTime</code> and <code>EndTime</code> are specified with
     *         <code>Recurrence</code>, they form the boundaries of when the
     *         recurring action will start and stop.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time for this action to start, as in <code>--start-time
     * 2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     * the past, Auto Scaling returns an error message. <p>When
     * <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the
     * recurring action will start and stop.
     *
     * @param startTime The time for this action to start, as in <code>--start-time
     *         2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     *         the past, Auto Scaling returns an error message. <p>When
     *         <code>StartTime</code> and <code>EndTime</code> are specified with
     *         <code>Recurrence</code>, they form the boundaries of when the
     *         recurring action will start and stop.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time for this action to start, as in <code>--start-time
     * 2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     * the past, Auto Scaling returns an error message. <p>When
     * <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the
     * recurring action will start and stop.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time for this action to start, as in <code>--start-time
     *         2010-06-01T00:00:00Z</code>. <p>If you try to schedule your action in
     *         the past, Auto Scaling returns an error message. <p>When
     *         <code>StartTime</code> and <code>EndTime</code> are specified with
     *         <code>Recurrence</code>, they form the boundaries of when the
     *         recurring action will start and stop.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time for this action to end.
     *
     * @return The time for this action to end.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The time for this action to end.
     *
     * @param endTime The time for this action to end.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The time for this action to end.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The time for this action to end.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For
     * information about cron syntax, go to <a
     * href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     * Encyclopedia</a>. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The time when recurring future actions will start. Start time is
     *         specified by the user following the Unix cron syntax format. For
     *         information about cron syntax, go to <a
     *         href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     *         Encyclopedia</a>. <p>When <code>StartTime</code> and
     *         <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action will start and stop.
     */
    public String getRecurrence() {
        return recurrence;
    }
    
    /**
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For
     * information about cron syntax, go to <a
     * href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     * Encyclopedia</a>. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param recurrence The time when recurring future actions will start. Start time is
     *         specified by the user following the Unix cron syntax format. For
     *         information about cron syntax, go to <a
     *         href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     *         Encyclopedia</a>. <p>When <code>StartTime</code> and
     *         <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action will start and stop.
     */
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }
    
    /**
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For
     * information about cron syntax, go to <a
     * href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     * Encyclopedia</a>. <p>When <code>StartTime</code> and
     * <code>EndTime</code> are specified with <code>Recurrence</code>, they
     * form the boundaries of when the recurring action will start and stop.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param recurrence The time when recurring future actions will start. Start time is
     *         specified by the user following the Unix cron syntax format. For
     *         information about cron syntax, go to <a
     *         href="http://en.wikipedia.org/wiki/Cron">Wikipedia, The Free
     *         Encyclopedia</a>. <p>When <code>StartTime</code> and
     *         <code>EndTime</code> are specified with <code>Recurrence</code>, they
     *         form the boundaries of when the recurring action will start and stop.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * The minimum size for the new Auto Scaling group.
     *
     * @return The minimum size for the new Auto Scaling group.
     */
    public Integer getMinSize() {
        return minSize;
    }
    
    /**
     * The minimum size for the new Auto Scaling group.
     *
     * @param minSize The minimum size for the new Auto Scaling group.
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }
    
    /**
     * The minimum size for the new Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minSize The minimum size for the new Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * The maximum size for the Auto Scaling group.
     *
     * @return The maximum size for the Auto Scaling group.
     */
    public Integer getMaxSize() {
        return maxSize;
    }
    
    /**
     * The maximum size for the Auto Scaling group.
     *
     * @param maxSize The maximum size for the Auto Scaling group.
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }
    
    /**
     * The maximum size for the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxSize The maximum size for the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * The number of Amazon EC2 instances that should be running in the
     * group.
     *
     * @return The number of Amazon EC2 instances that should be running in the
     *         group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that should be running in the
     * group.
     *
     * @param desiredCapacity The number of Amazon EC2 instances that should be running in the
     *         group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that should be running in the
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The number of Amazon EC2 instances that should be running in the
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutScheduledUpdateGroupActionRequest withDesiredCapacity(Integer desiredCapacity) {
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

        if (obj instanceof PutScheduledUpdateGroupActionRequest == false) return false;
        PutScheduledUpdateGroupActionRequest other = (PutScheduledUpdateGroupActionRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null) return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false) return false; 
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
    