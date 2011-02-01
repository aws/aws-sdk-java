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

/**
 * <p>
 * The ScalingPolicy data type.
 * </p>
 */
public class ScalingPolicy {

    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * The number associated with the specified AdjustmentType. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     */
    private Integer scalingAdjustment;

    /**
     * Specifies whether the ScalingAdjustment is an absolute number or a
     * percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentOfCapacity</code>.
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
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String policyARN;

    /**
     * A list of CloudWatch Alarms related to the policy.
     */
    private java.util.List<Alarm> alarms;

    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group associated with this scaling
     *         policy.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group associated with this scaling
     *         policy.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group associated with this scaling
     *         policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The name of the scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the scaling policy.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the scaling policy.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * The number associated with the specified AdjustmentType. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     *
     * @return The number associated with the specified AdjustmentType. A positive
     *         value adds to the current capacity and a negative value removes from
     *         the current capacity.
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }
    
    /**
     * The number associated with the specified AdjustmentType. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     *
     * @param scalingAdjustment The number associated with the specified AdjustmentType. A positive
     *         value adds to the current capacity and a negative value removes from
     *         the current capacity.
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }
    
    /**
     * The number associated with the specified AdjustmentType. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingAdjustment The number associated with the specified AdjustmentType. A positive
     *         value adds to the current capacity and a negative value removes from
     *         the current capacity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }
    
    
    /**
     * Specifies whether the ScalingAdjustment is an absolute number or a
     * percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentOfCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies whether the ScalingAdjustment is an absolute number or a
     *         percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentOfCapacity</code>.
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }
    
    /**
     * Specifies whether the ScalingAdjustment is an absolute number or a
     * percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentOfCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType Specifies whether the ScalingAdjustment is an absolute number or a
     *         percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentOfCapacity</code>.
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }
    
    /**
     * Specifies whether the ScalingAdjustment is an absolute number or a
     * percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentOfCapacity</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType Specifies whether the ScalingAdjustment is an absolute number or a
     *         percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentOfCapacity</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withAdjustmentType(String adjustmentType) {
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
    public ScalingPolicy withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    
    
    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon Resource Name (ARN) of the policy.
     */
    public String getPolicyARN() {
        return policyARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyARN The Amazon Resource Name (ARN) of the policy.
     */
    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyARN The Amazon Resource Name (ARN) of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withPolicyARN(String policyARN) {
        this.policyARN = policyARN;
        return this;
    }
    
    
    /**
     * A list of CloudWatch Alarms related to the policy.
     *
     * @return A list of CloudWatch Alarms related to the policy.
     */
    public java.util.List<Alarm> getAlarms() {
        if (alarms == null) {
            alarms = new java.util.ArrayList<Alarm>();
        }
        return alarms;
    }
    
    /**
     * A list of CloudWatch Alarms related to the policy.
     *
     * @param alarms A list of CloudWatch Alarms related to the policy.
     */
    public void setAlarms(java.util.Collection<Alarm> alarms) {
        java.util.List<Alarm> alarmsCopy = new java.util.ArrayList<Alarm>();
        if (alarms != null) {
            alarmsCopy.addAll(alarms);
        }
        this.alarms = alarmsCopy;
    }
    
    /**
     * A list of CloudWatch Alarms related to the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarms A list of CloudWatch Alarms related to the policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withAlarms(Alarm... alarms) {
        for (Alarm value : alarms) {
            getAlarms().add(value);
        }
        return this;
    }
    
    /**
     * A list of CloudWatch Alarms related to the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarms A list of CloudWatch Alarms related to the policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScalingPolicy withAlarms(java.util.Collection<Alarm> alarms) {
        java.util.List<Alarm> alarmsCopy = new java.util.ArrayList<Alarm>();
        if (alarms != null) {
            alarmsCopy.addAll(alarms);
        }
        this.alarms = alarmsCopy;

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
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("ScalingAdjustment: " + scalingAdjustment + ", ");
        sb.append("AdjustmentType: " + adjustmentType + ", ");
        sb.append("Cooldown: " + cooldown + ", ");
        sb.append("PolicyARN: " + policyARN + ", ");
        sb.append("Alarms: " + alarms + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    