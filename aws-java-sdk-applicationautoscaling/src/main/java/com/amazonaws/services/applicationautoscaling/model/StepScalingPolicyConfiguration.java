/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a step scaling policy configuration to use with Application Auto Scaling.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
 * >Step scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/StepScalingPolicyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepScalingPolicyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how the <code>ScalingAdjustment</code> value in a <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     * >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * </p>
     */
    private String adjustmentType;
    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * </p>
     */
    private java.util.List<StepAdjustment> stepAdjustments;
    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto
     * Scaling scales out the service by 2 tasks.
     * </p>
     */
    private Integer minAdjustmentMagnitude;
    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified, the
     * default value is 300. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     * >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer cooldown;
    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and
     * <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     */
    private String metricAggregationType;

    /**
     * <p>
     * Specifies how the <code>ScalingAdjustment</code> value in a <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     * >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the <code>ScalingAdjustment</code> value in a <a
     *        href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     *        >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     *        <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>. </p>
     *        <p>
     *        <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * @see AdjustmentType
     */

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * Specifies how the <code>ScalingAdjustment</code> value in a <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     * >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @return Specifies how the <code>ScalingAdjustment</code> value in a <a
     *         href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     *         >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values
     *         are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     *         </p>
     *         <p>
     *         <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * @see AdjustmentType
     */

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * <p>
     * Specifies how the <code>ScalingAdjustment</code> value in a <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     * >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the <code>ScalingAdjustment</code> value in a <a
     *        href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     *        >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     *        <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>. </p>
     *        <p>
     *        <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdjustmentType
     */

    public StepScalingPolicyConfiguration withAdjustmentType(String adjustmentType) {
        setAdjustmentType(adjustmentType);
        return this;
    }

    /**
     * <p>
     * Specifies how the <code>ScalingAdjustment</code> value in a <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     * >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the <code>ScalingAdjustment</code> value in a <a
     *        href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     *        >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     *        <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>. </p>
     *        <p>
     *        <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * @see AdjustmentType
     */

    public void setAdjustmentType(AdjustmentType adjustmentType) {
        withAdjustmentType(adjustmentType);
    }

    /**
     * <p>
     * Specifies how the <code>ScalingAdjustment</code> value in a <a
     * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     * >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the <code>ScalingAdjustment</code> value in a <a
     *        href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html"
     *        >StepAdjustment</a> is interpreted (for example, an absolute number or a percentage). The valid values are
     *        <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>. </p>
     *        <p>
     *        <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdjustmentType
     */

    public StepScalingPolicyConfiguration withAdjustmentType(AdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType.toString();
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @return A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *         <p>
     *         At least one step adjustment is required if you are adding a new step scaling policy configuration.
     */

    public java.util.List<StepAdjustment> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *        <p>
     *        At least one step adjustment is required if you are adding a new step scaling policy configuration.
     */

    public void setStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }

        this.stepAdjustments = new java.util.ArrayList<StepAdjustment>(stepAdjustments);
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepAdjustments(java.util.Collection)} or {@link #withStepAdjustments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *        <p>
     *        At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepScalingPolicyConfiguration withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (this.stepAdjustments == null) {
            setStepAdjustments(new java.util.ArrayList<StepAdjustment>(stepAdjustments.length));
        }
        for (StepAdjustment ele : stepAdjustments) {
            this.stepAdjustments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *        <p>
     *        At least one step adjustment is required if you are adding a new step scaling policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepScalingPolicyConfiguration withStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto
     * Scaling scales out the service by 2 tasks.
     * </p>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For
     *        example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent
     *        and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling
     *        policy is performed, 25 percent of 4 is 1. However, because you specified a
     *        <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.
     */

    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto
     * Scaling scales out the service by 2 tasks.
     * </p>
     * 
     * @return The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For
     *         example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent
     *         and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling
     *         policy is performed, 25 percent of 4 is 1. However, because you specified a
     *         <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.
     */

    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto
     * Scaling scales out the service by 2 tasks.
     * </p>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For
     *        example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent
     *        and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling
     *        policy is performed, 25 percent of 4 is 1. However, because you specified a
     *        <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepScalingPolicyConfiguration withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        setMinAdjustmentMagnitude(minAdjustmentMagnitude);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified, the
     * default value is 300. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     * >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param cooldown
     *        The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified,
     *        the default value is 300. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     *        >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified, the
     * default value is 300. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     * >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified,
     *         the default value is 300. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     *         >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public Integer getCooldown() {
        return this.cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified, the
     * default value is 300. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     * >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param cooldown
     *        The amount of time, in seconds, to wait for a previous scaling activity to take effect. If not specified,
     *        the default value is 300. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown"
     *        >Cooldown period</a> in the <i>Application Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepScalingPolicyConfiguration withCooldown(Integer cooldown) {
        setCooldown(cooldown);
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and
     * <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *        <code>Average</code>.
     * @see MetricAggregationType
     */

    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and
     * <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * 
     * @return The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>,
     *         <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *         <code>Average</code>.
     * @see MetricAggregationType
     */

    public String getMetricAggregationType() {
        return this.metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and
     * <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *        <code>Average</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricAggregationType
     */

    public StepScalingPolicyConfiguration withMetricAggregationType(String metricAggregationType) {
        setMetricAggregationType(metricAggregationType);
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and
     * <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *        <code>Average</code>.
     * @see MetricAggregationType
     */

    public void setMetricAggregationType(MetricAggregationType metricAggregationType) {
        withMetricAggregationType(metricAggregationType);
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and
     * <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *        <code>Average</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricAggregationType
     */

    public StepScalingPolicyConfiguration withMetricAggregationType(MetricAggregationType metricAggregationType) {
        this.metricAggregationType = metricAggregationType.toString();
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
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: ").append(getAdjustmentType()).append(",");
        if (getStepAdjustments() != null)
            sb.append("StepAdjustments: ").append(getStepAdjustments()).append(",");
        if (getMinAdjustmentMagnitude() != null)
            sb.append("MinAdjustmentMagnitude: ").append(getMinAdjustmentMagnitude()).append(",");
        if (getCooldown() != null)
            sb.append("Cooldown: ").append(getCooldown()).append(",");
        if (getMetricAggregationType() != null)
            sb.append("MetricAggregationType: ").append(getMetricAggregationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepScalingPolicyConfiguration == false)
            return false;
        StepScalingPolicyConfiguration other = (StepScalingPolicyConfiguration) obj;
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null)
            return false;
        if (other.getStepAdjustments() != null && other.getStepAdjustments().equals(this.getStepAdjustments()) == false)
            return false;
        if (other.getMinAdjustmentMagnitude() == null ^ this.getMinAdjustmentMagnitude() == null)
            return false;
        if (other.getMinAdjustmentMagnitude() != null && other.getMinAdjustmentMagnitude().equals(this.getMinAdjustmentMagnitude()) == false)
            return false;
        if (other.getCooldown() == null ^ this.getCooldown() == null)
            return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false)
            return false;
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null)
            return false;
        if (other.getMetricAggregationType() != null && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getStepAdjustments() == null) ? 0 : getStepAdjustments().hashCode());
        hashCode = prime * hashCode + ((getMinAdjustmentMagnitude() == null) ? 0 : getMinAdjustmentMagnitude().hashCode());
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode());
        hashCode = prime * hashCode + ((getMetricAggregationType() == null) ? 0 : getMetricAggregationType().hashCode());
        return hashCode;
    }

    @Override
    public StepScalingPolicyConfiguration clone() {
        try {
            return (StepScalingPolicyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.StepScalingPolicyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
