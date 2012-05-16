/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#putScalingPolicy(PutScalingPolicyRequest) PutScalingPolicy operation}.
 * <p>
 * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameter(s) you want
 * to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#putScalingPolicy(PutScalingPolicyRequest)
 */
public class PutScalingPolicyRequest extends AmazonWebServiceRequest {

    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the policy you want to create or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * The number of instances by which to scale. <code>AdjustmentType</code>
     * determines the interpretation of this number (e.g., as an absolute
     * number or as a percentage of the existing Auto Scaling group size). A
     * positive increment adds to the current capacity and a negative value
     * removes from the current capacity.
     */
    private Integer scalingAdjustment;

    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String adjustmentType;

    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     */
    private Integer cooldown;

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
    public PutScalingPolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The name of the policy you want to create or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the policy you want to create or update.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy you want to create or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the policy you want to create or update.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy you want to create or update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the policy you want to create or update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutScalingPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * The number of instances by which to scale. <code>AdjustmentType</code>
     * determines the interpretation of this number (e.g., as an absolute
     * number or as a percentage of the existing Auto Scaling group size). A
     * positive increment adds to the current capacity and a negative value
     * removes from the current capacity.
     *
     * @return The number of instances by which to scale. <code>AdjustmentType</code>
     *         determines the interpretation of this number (e.g., as an absolute
     *         number or as a percentage of the existing Auto Scaling group size). A
     *         positive increment adds to the current capacity and a negative value
     *         removes from the current capacity.
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }
    
    /**
     * The number of instances by which to scale. <code>AdjustmentType</code>
     * determines the interpretation of this number (e.g., as an absolute
     * number or as a percentage of the existing Auto Scaling group size). A
     * positive increment adds to the current capacity and a negative value
     * removes from the current capacity.
     *
     * @param scalingAdjustment The number of instances by which to scale. <code>AdjustmentType</code>
     *         determines the interpretation of this number (e.g., as an absolute
     *         number or as a percentage of the existing Auto Scaling group size). A
     *         positive increment adds to the current capacity and a negative value
     *         removes from the current capacity.
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }
    
    /**
     * The number of instances by which to scale. <code>AdjustmentType</code>
     * determines the interpretation of this number (e.g., as an absolute
     * number or as a percentage of the existing Auto Scaling group size). A
     * positive increment adds to the current capacity and a negative value
     * removes from the current capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingAdjustment The number of instances by which to scale. <code>AdjustmentType</code>
     *         determines the interpretation of this number (e.g., as an absolute
     *         number or as a percentage of the existing Auto Scaling group size). A
     *         positive increment adds to the current capacity and a negative value
     *         removes from the current capacity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutScalingPolicyRequest withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }
    
    
    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies whether the <code>ScalingAdjustment</code> is an absolute
     *         number or a percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }
    
    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType Specifies whether the <code>ScalingAdjustment</code> is an absolute
     *         number or a percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }
    
    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType Specifies whether the <code>ScalingAdjustment</code> is an absolute
     *         number or a percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutScalingPolicyRequest withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @return The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public Integer getCooldown() {
        return cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutScalingPolicyRequest withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
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
        if (autoScalingGroupName != null) sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        if (policyName != null) sb.append("PolicyName: " + policyName + ", ");
        if (scalingAdjustment != null) sb.append("ScalingAdjustment: " + scalingAdjustment + ", ");
        if (adjustmentType != null) sb.append("AdjustmentType: " + adjustmentType + ", ");
        if (cooldown != null) sb.append("Cooldown: " + cooldown + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode()); 
        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode()); 
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PutScalingPolicyRequest == false) return false;
        PutScalingPolicyRequest other = (PutScalingPolicyRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null) return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false) return false; 
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null) return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false) return false; 
        if (other.getCooldown() == null ^ this.getCooldown() == null) return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false) return false; 
        return true;
    }
    
}
    