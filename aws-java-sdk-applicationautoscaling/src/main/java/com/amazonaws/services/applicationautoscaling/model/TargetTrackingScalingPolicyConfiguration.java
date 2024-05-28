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
 * Represents a target tracking scaling policy configuration to use with Application Auto Scaling.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
 * >Target tracking scaling policies</a> in the <i>Application Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/TargetTrackingScalingPolicyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingScalingPolicyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a valid
     * number based on the choice of metric. For example, if the metric is CPU utilization, then the target value is a
     * percent value that represents how much of the CPU can be used before scaling out.
     * </p>
     * <note>
     * <p>
     * If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the target
     * utilization as the optimal average request count per target during any one-minute interval.
     * </p>
     * </note>
     */
    private Double targetValue;
    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     */
    private PredefinedMetricSpecification predefinedMetricSpecification;
    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     */
    private CustomizedMetricSpecification customizedMetricSpecification;
    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more information
     * and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer scaleOutCooldown;
    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * For more information and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer scaleInCooldown;
    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * target. The default value is <code>false</code>.
     * </p>
     */
    private Boolean disableScaleIn;

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a valid
     * number based on the choice of metric. For example, if the metric is CPU utilization, then the target value is a
     * percent value that represents how much of the CPU can be used before scaling out.
     * </p>
     * <note>
     * <p>
     * If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the target
     * utilization as the optimal average request count per target during any one-minute interval.
     * </p>
     * </note>
     * 
     * @param targetValue
     *        The target value for the metric. Although this property accepts numbers of type Double, it won't accept
     *        values that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value
     *        must be a valid number based on the choice of metric. For example, if the metric is CPU utilization, then
     *        the target value is a percent value that represents how much of the CPU can be used before scaling out.
     *        </p> <note>
     *        <p>
     *        If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the
     *        target utilization as the optimal average request count per target during any one-minute interval.
     *        </p>
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a valid
     * number based on the choice of metric. For example, if the metric is CPU utilization, then the target value is a
     * percent value that represents how much of the CPU can be used before scaling out.
     * </p>
     * <note>
     * <p>
     * If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the target
     * utilization as the optimal average request count per target during any one-minute interval.
     * </p>
     * </note>
     * 
     * @return The target value for the metric. Although this property accepts numbers of type Double, it won't accept
     *         values that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value
     *         must be a valid number based on the choice of metric. For example, if the metric is CPU utilization, then
     *         the target value is a percent value that represents how much of the CPU can be used before scaling out.
     *         </p> <note>
     *         <p>
     *         If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the
     *         target utilization as the optimal average request count per target during any one-minute interval.
     *         </p>
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The target value for the metric. Although this property accepts numbers of type Double, it won't accept values
     * that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a valid
     * number based on the choice of metric. For example, if the metric is CPU utilization, then the target value is a
     * percent value that represents how much of the CPU can be used before scaling out.
     * </p>
     * <note>
     * <p>
     * If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the target
     * utilization as the optimal average request count per target during any one-minute interval.
     * </p>
     * </note>
     * 
     * @param targetValue
     *        The target value for the metric. Although this property accepts numbers of type Double, it won't accept
     *        values that are either too small or too large. Values must be in the range of -2^360 to 2^360. The value
     *        must be a valid number based on the choice of metric. For example, if the metric is CPU utilization, then
     *        the target value is a percent value that represents how much of the CPU can be used before scaling out.
     *        </p> <note>
     *        <p>
     *        If the scaling policy specifies the <code>ALBRequestCountPerTarget</code> predefined metric, specify the
     *        target utilization as the optimal average request count per target during any one-minute interval.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
        return this;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param predefinedMetricSpecification
     *        A predefined metric. You can specify either a predefined metric or a customized metric.
     */

    public void setPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @return A predefined metric. You can specify either a predefined metric or a customized metric.
     */

    public PredefinedMetricSpecification getPredefinedMetricSpecification() {
        return this.predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param predefinedMetricSpecification
     *        A predefined metric. You can specify either a predefined metric or a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withPredefinedMetricSpecification(PredefinedMetricSpecification predefinedMetricSpecification) {
        setPredefinedMetricSpecification(predefinedMetricSpecification);
        return this;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param customizedMetricSpecification
     *        A customized metric. You can specify either a predefined metric or a customized metric.
     */

    public void setCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @return A customized metric. You can specify either a predefined metric or a customized metric.
     */

    public CustomizedMetricSpecification getCustomizedMetricSpecification() {
        return this.customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a customized metric.
     * </p>
     * 
     * @param customizedMetricSpecification
     *        A customized metric. You can specify either a predefined metric or a customized metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withCustomizedMetricSpecification(CustomizedMetricSpecification customizedMetricSpecification) {
        setCustomizedMetricSpecification(customizedMetricSpecification);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more information
     * and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more
     *        information and for default values, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     *        >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more information
     * and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more
     *         information and for default values, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     *         >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more information
     * and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The amount of time, in seconds, to wait for a previous scale-out activity to take effect. For more
     *        information and for default values, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     *        >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        setScaleOutCooldown(scaleOutCooldown);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * For more information and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param scaleInCooldown
     *        The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can
     *        start. For more information and for default values, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     *        >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * For more information and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can
     *         start. For more information and for default values, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     *         >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start.
     * For more information and for default values, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     * >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param scaleInCooldown
     *        The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can
     *        start. For more information and for default values, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown"
     *        >Define cooldown periods</a> in the <i>Application Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        setScaleInCooldown(scaleInCooldown);
        return this;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * target. The default value is <code>false</code>.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *        <code>true</code>, scale in is disabled and the target tracking scaling policy won't remove capacity from
     *        the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove
     *        capacity from the scalable target. The default value is <code>false</code>.
     */

    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * target. The default value is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *         <code>true</code>, scale in is disabled and the target tracking scaling policy won't remove capacity from
     *         the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove
     *         capacity from the scalable target. The default value is <code>false</code>.
     */

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * target. The default value is <code>false</code>.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *        <code>true</code>, scale in is disabled and the target tracking scaling policy won't remove capacity from
     *        the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove
     *        capacity from the scalable target. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        setDisableScaleIn(disableScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is <code>true</code>,
     * scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target.
     * Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable
     * target. The default value is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether scale in by the target tracking scaling policy is disabled. If the value is
     *         <code>true</code>, scale in is disabled and the target tracking scaling policy won't remove capacity from
     *         the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove
     *         capacity from the scalable target. The default value is <code>false</code>.
     */

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
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
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue()).append(",");
        if (getPredefinedMetricSpecification() != null)
            sb.append("PredefinedMetricSpecification: ").append(getPredefinedMetricSpecification()).append(",");
        if (getCustomizedMetricSpecification() != null)
            sb.append("CustomizedMetricSpecification: ").append(getCustomizedMetricSpecification()).append(",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: ").append(getScaleOutCooldown()).append(",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: ").append(getScaleInCooldown()).append(",");
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: ").append(getDisableScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingScalingPolicyConfiguration == false)
            return false;
        TargetTrackingScalingPolicyConfiguration other = (TargetTrackingScalingPolicyConfiguration) obj;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getPredefinedMetricSpecification() == null ^ this.getPredefinedMetricSpecification() == null)
            return false;
        if (other.getPredefinedMetricSpecification() != null
                && other.getPredefinedMetricSpecification().equals(this.getPredefinedMetricSpecification()) == false)
            return false;
        if (other.getCustomizedMetricSpecification() == null ^ this.getCustomizedMetricSpecification() == null)
            return false;
        if (other.getCustomizedMetricSpecification() != null
                && other.getCustomizedMetricSpecification().equals(this.getCustomizedMetricSpecification()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime * hashCode + ((getPredefinedMetricSpecification() == null) ? 0 : getPredefinedMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getCustomizedMetricSpecification() == null) ? 0 : getCustomizedMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingScalingPolicyConfiguration clone() {
        try {
            return (TargetTrackingScalingPolicyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.TargetTrackingScalingPolicyConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
