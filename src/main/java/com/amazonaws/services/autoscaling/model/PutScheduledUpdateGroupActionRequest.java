/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest) PutScheduledUpdateGroupAction operation}.
 * <p>
 * Creates a scheduled scaling action for a Auto Scaling group. If you
 * leave a parameter unspecified, the corresponding value remains
 * unchanged in the affected Auto Scaling group.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest)
 */
public class PutScheduledUpdateGroupActionRequest extends AmazonWebServiceRequest {

    /**
     * The name or ARN of the Auto Scaling Group.
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
     * The time for this action to start.
     */
    private java.util.Date time;

    /**
     * The minimum size for the new Auto Scaling group.
     */
    private Integer minSize;

    /**
     * The maximum size for the Auto Scaling group.
     */
    private Integer maxSize;

    /**
     * The number of EC2 instances that should be running in the group.
     */
    private Integer desiredCapacity;

    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the Auto Scaling Group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling Group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling Group.
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
     * The time for this action to start.
     *
     * @return The time for this action to start.
     */
    public java.util.Date getTime() {
        return time;
    }
    
    /**
     * The time for this action to start.
     *
     * @param time The time for this action to start.
     */
    public void setTime(java.util.Date time) {
        this.time = time;
    }
    
    /**
     * The time for this action to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param time The time for this action to start.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutScheduledUpdateGroupActionRequest withTime(java.util.Date time) {
        this.time = time;
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
     * The number of EC2 instances that should be running in the group.
     *
     * @return The number of EC2 instances that should be running in the group.
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }
    
    /**
     * The number of EC2 instances that should be running in the group.
     *
     * @param desiredCapacity The number of EC2 instances that should be running in the group.
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }
    
    /**
     * The number of EC2 instances that should be running in the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCapacity The number of EC2 instances that should be running in the group.
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("ScheduledActionName: " + scheduledActionName + ", ");
        sb.append("Time: " + time + ", ");
        sb.append("MinSize: " + minSize + ", ");
        sb.append("MaxSize: " + maxSize + ", ");
        sb.append("DesiredCapacity: " + desiredCapacity + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    