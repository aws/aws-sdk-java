/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a target tracking configuration to use with AWS Auto Scaling. Used with <a>ScalingInstruction</a> and
 * <a>ScalingPolicy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/TargetTrackingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     */
    private PredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     */
    private CustomizedScalingMetricSpecification customizedScalingMetricSpecification;
    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     * </p>
     */
    private Double targetValue;
    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * resource.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean disableScaleIn;
    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is not
     * used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale out.
     * After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the
     * cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is
     * triggered or the cooldown period ends.
     * </p>
     */
    private Integer scaleOutCooldown;
    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * This property is not used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     * application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if
     * another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling scales out the
     * target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     * </p>
     */
    private Integer scaleInCooldown;
    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This
     * value is used only if the resource is an Auto Scaling group.
     * </p>
     */
    private Integer estimatedInstanceWarmup;

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param predefinedScalingMetricSpecification
     *        A predefined metric. You can specify either a predefined metric or a customized metric.
     */

    public void setPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @return A predefined metric. You can specify either a predefined metric or a customized metric.
     */

    public PredefinedScalingMetricSpecification getPredefinedScalingMetricSpecification() {
        return this.predefinedScalingMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param predefinedScalingMetricSpecification
     *        A predefined metric. You can specify either a predefined metric or a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withPredefinedScalingMetricSpecification(PredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
        setPredefinedScalingMetricSpecification(predefinedScalingMetricSpecification);
        return this;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param customizedScalingMetricSpecification
     *        A customized metric. You can specify either a predefined metric or a customized metric.
     */

    public void setCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @return A customized metric. You can specify either a predefined metric or a customized metric.
     */

    public CustomizedScalingMetricSpecification getCustomizedScalingMetricSpecification() {
        return this.customizedScalingMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param customizedScalingMetricSpecification
     *        A customized metric. You can specify either a predefined metric or a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withCustomizedScalingMetricSpecification(CustomizedScalingMetricSpecification customizedScalingMetricSpecification) {
        setCustomizedScalingMetricSpecification(customizedScalingMetricSpecification);
        return this;
    }

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     * </p>
     * 
     * @param targetValue
     *        The target value for the metric. Although this property accepts numbers of type Double, it won't accept
     *        values that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     * </p>
     * 
     * @return The target value for the metric. Although this property accepts numbers of type Double, it won't accept
     *         values that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     * </p>
     * 
     * @param targetValue
     *        The target value for the metric. Although this property accepts numbers of type Double, it won't accept
     *        values that are either too small or too large. Values must be in the range of -2^360 to 2^360.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
        return this;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * resource.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *        <code>true</code>, scale in is disabled and the target tracking scaling policy doesn't remove capacity
     *        from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can
     *        remove capacity from the scalable resource. </p>
     *        <p>
     *        The default value is <code>false</code>.
     */

    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * resource.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *         <code>true</code>, scale in is disabled and the target tracking scaling policy doesn't remove capacity
     *         from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can
     *         remove capacity from the scalable resource. </p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * resource.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *        <code>true</code>, scale in is disabled and the target tracking scaling policy doesn't remove capacity
     *        from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can
     *        remove capacity from the scalable resource. </p>
     *        <p>
     *        The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        setDisableScaleIn(disableScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * resource.
     * </p>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *         <code>true</code>, scale in is disabled and the target tracking scaling policy doesn't remove capacity
     *         from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can
     *         remove capacity from the scalable resource. </p>
     *         <p>
     *         The default value is <code>false</code>.
     */

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is not
     * used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale out.
     * After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the
     * cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is
     * triggered or the cooldown period ends.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is
     *        not used if the scalable resource is an Auto Scaling group.</p>
     *        <p>
     *        With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale
     *        out. After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to
     *        calculate the cooldown time. The scaling policy won't increase the desired capacity again unless either a
     *        larger scale out is triggered or the cooldown period ends.
     */

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is not
     * used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale out.
     * After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the
     * cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is
     * triggered or the cooldown period ends.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property
     *         is not used if the scalable resource is an Auto Scaling group.</p>
     *         <p>
     *         With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale
     *         out. After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to
     *         calculate the cooldown time. The scaling policy won't increase the desired capacity again unless either a
     *         larger scale out is triggered or the cooldown period ends.
     */

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is not
     * used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale out.
     * After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the
     * cooldown time. The scaling policy won't increase the desired capacity again unless either a larger scale out is
     * triggered or the cooldown period ends.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The amount of time, in seconds, to wait for a previous scale-out activity to take effect. This property is
     *        not used if the scalable resource is an Auto Scaling group.</p>
     *        <p>
     *        With the <i>scale-out cooldown period</i>, the intention is to continuously (but not excessively) scale
     *        out. After Auto Scaling successfully scales out using a target tracking scaling policy, it starts to
     *        calculate the cooldown time. The scaling policy won't increase the desired capacity again unless either a
     *        larger scale out is triggered or the cooldown period ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        setScaleOutCooldown(scaleOutCooldown);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * This property is not used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     * application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if
     * another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling scales out the
     * target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     * </p>
     * 
     * @param scaleInCooldown
     *        The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can
     *        start. This property is not used if the scalable resource is an Auto Scaling group.</p>
     *        <p>
     *        With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     *        application’s availability, so scale-in activities are blocked until the cooldown period has expired.
     *        However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling
     *        scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     */

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * This property is not used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     * application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if
     * another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling scales out the
     * target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can
     *         start. This property is not used if the scalable resource is an Auto Scaling group.</p>
     *         <p>
     *         With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     *         application’s availability, so scale-in activities are blocked until the cooldown period has expired.
     *         However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling
     *         scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     */

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * This property is not used if the scalable resource is an Auto Scaling group.
     * </p>
     * <p>
     * With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     * application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if
     * another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling scales out the
     * target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     * </p>
     * 
     * @param scaleInCooldown
     *        The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can
     *        start. This property is not used if the scalable resource is an Auto Scaling group.</p>
     *        <p>
     *        With the <i>scale-in cooldown period</i>, the intention is to scale in conservatively to protect your
     *        application’s availability, so scale-in activities are blocked until the cooldown period has expired.
     *        However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Auto Scaling
     *        scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        setScaleInCooldown(scaleInCooldown);
        return this;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This
     * value is used only if the resource is an Auto Scaling group.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     *        This value is used only if the resource is an Auto Scaling group.
     */

    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This
     * value is used only if the resource is an Auto Scaling group.
     * </p>
     * 
     * @return The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     *         This value is used only if the resource is an Auto Scaling group.
     */

    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This
     * value is used only if the resource is an Auto Scaling group.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     *        This value is used only if the resource is an Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingConfiguration withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        setEstimatedInstanceWarmup(estimatedInstanceWarmup);
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
        if (getPredefinedScalingMetricSpecification() != null)
            sb.append("PredefinedScalingMetricSpecification: ").append(getPredefinedScalingMetricSpecification()).append(",");
        if (getCustomizedScalingMetricSpecification() != null)
            sb.append("CustomizedScalingMetricSpecification: ").append(getCustomizedScalingMetricSpecification()).append(",");
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue()).append(",");
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: ").append(getDisableScaleIn()).append(",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: ").append(getScaleOutCooldown()).append(",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: ").append(getScaleInCooldown()).append(",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: ").append(getEstimatedInstanceWarmup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingConfiguration == false)
            return false;
        TargetTrackingConfiguration other = (TargetTrackingConfiguration) obj;
        if (other.getPredefinedScalingMetricSpecification() == null ^ this.getPredefinedScalingMetricSpecification() == null)
            return false;
        if (other.getPredefinedScalingMetricSpecification() != null
                && other.getPredefinedScalingMetricSpecification().equals(this.getPredefinedScalingMetricSpecification()) == false)
            return false;
        if (other.getCustomizedScalingMetricSpecification() == null ^ this.getCustomizedScalingMetricSpecification() == null)
            return false;
        if (other.getCustomizedScalingMetricSpecification() != null
                && other.getCustomizedScalingMetricSpecification().equals(this.getCustomizedScalingMetricSpecification()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedScalingMetricSpecification() == null) ? 0 : getPredefinedScalingMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getCustomizedScalingMetricSpecification() == null) ? 0 : getCustomizedScalingMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime * hashCode + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        hashCode = prime * hashCode + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingConfiguration clone() {
        try {
            return (TargetTrackingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.TargetTrackingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
