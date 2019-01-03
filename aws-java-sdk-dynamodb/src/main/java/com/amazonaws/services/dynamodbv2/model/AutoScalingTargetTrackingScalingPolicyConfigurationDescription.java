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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the properties of a target tracking scaling policy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/AutoScalingTargetTrackingScalingPolicyConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingTargetTrackingScalingPolicyConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled
     * and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled
     * and the target tracking policy can remove capacity from the scalable resource. The default value is false.
     * </p>
     */
    private Boolean disableScaleIn;
    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in
     * conservatively to protect your application's availability. However, if another alarm triggers a scale out policy
     * during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately.
     * </p>
     */
    private Integer scaleInCooldown;
    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * While the cooldown period is in effect, the capacity that has been added by the previous scale out event that
     * initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should
     * continuously (but not excessively) scale out.
     * </p>
     */
    private Integer scaleOutCooldown;
    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     * 2).
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled
     * and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled
     * and the target tracking policy can remove capacity from the scalable resource. The default value is false.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is
     *        disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale
     *        in is enabled and the target tracking policy can remove capacity from the scalable resource. The default
     *        value is false.
     */

    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled
     * and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled
     * and the target tracking policy can remove capacity from the scalable resource. The default value is false.
     * </p>
     * 
     * @return Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is
     *         disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise,
     *         scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The
     *         default value is false.
     */

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled
     * and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled
     * and the target tracking policy can remove capacity from the scalable resource. The default value is false.
     * </p>
     * 
     * @param disableScaleIn
     *        Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is
     *        disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale
     *        in is enabled and the target tracking policy can remove capacity from the scalable resource. The default
     *        value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withDisableScaleIn(Boolean disableScaleIn) {
        setDisableScaleIn(disableScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled
     * and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled
     * and the target tracking policy can remove capacity from the scalable resource. The default value is false.
     * </p>
     * 
     * @return Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is
     *         disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise,
     *         scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The
     *         default value is false.
     */

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in
     * conservatively to protect your application's availability. However, if another alarm triggers a scale out policy
     * during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately.
     * </p>
     * 
     * @param scaleInCooldown
     *        The amount of time, in seconds, after a scale in activity completes before another scale in activity can
     *        start. The cooldown period is used to block subsequent scale in requests until it has expired. You should
     *        scale in conservatively to protect your application's availability. However, if another alarm triggers a
     *        scale out policy during the cooldown period after a scale-in, application autoscaling scales out your
     *        scalable target immediately.
     */

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in
     * conservatively to protect your application's availability. However, if another alarm triggers a scale out policy
     * during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scale in activity completes before another scale in activity can
     *         start. The cooldown period is used to block subsequent scale in requests until it has expired. You should
     *         scale in conservatively to protect your application's availability. However, if another alarm triggers a
     *         scale out policy during the cooldown period after a scale-in, application autoscaling scales out your
     *         scalable target immediately.
     */

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in
     * conservatively to protect your application's availability. However, if another alarm triggers a scale out policy
     * during the cooldown period after a scale-in, application autoscaling scales out your scalable target immediately.
     * </p>
     * 
     * @param scaleInCooldown
     *        The amount of time, in seconds, after a scale in activity completes before another scale in activity can
     *        start. The cooldown period is used to block subsequent scale in requests until it has expired. You should
     *        scale in conservatively to protect your application's availability. However, if another alarm triggers a
     *        scale out policy during the cooldown period after a scale-in, application autoscaling scales out your
     *        scalable target immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withScaleInCooldown(Integer scaleInCooldown) {
        setScaleInCooldown(scaleInCooldown);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * While the cooldown period is in effect, the capacity that has been added by the previous scale out event that
     * initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should
     * continuously (but not excessively) scale out.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The amount of time, in seconds, after a scale out activity completes before another scale out activity can
     *        start. While the cooldown period is in effect, the capacity that has been added by the previous scale out
     *        event that initiated the cooldown is calculated as part of the desired capacity for the next scale out.
     *        You should continuously (but not excessively) scale out.
     */

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * While the cooldown period is in effect, the capacity that has been added by the previous scale out event that
     * initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should
     * continuously (but not excessively) scale out.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scale out activity completes before another scale out activity
     *         can start. While the cooldown period is in effect, the capacity that has been added by the previous scale
     *         out event that initiated the cooldown is calculated as part of the desired capacity for the next scale
     *         out. You should continuously (but not excessively) scale out.
     */

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * While the cooldown period is in effect, the capacity that has been added by the previous scale out event that
     * initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should
     * continuously (but not excessively) scale out.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The amount of time, in seconds, after a scale out activity completes before another scale out activity can
     *        start. While the cooldown period is in effect, the capacity that has been added by the previous scale out
     *        event that initiated the cooldown is calculated as part of the desired capacity for the next scale out.
     *        You should continuously (but not excessively) scale out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withScaleOutCooldown(Integer scaleOutCooldown) {
        setScaleOutCooldown(scaleOutCooldown);
        return this;
    }

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     * 2).
     * </p>
     * 
     * @param targetValue
     *        The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360
     *        (Base 2).
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     * 2).
     * </p>
     * 
     * @return The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360
     *         (Base 2).
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base
     * 2).
     * </p>
     * 
     * @param targetValue
     *        The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360
     *        (Base 2).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
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
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: ").append(getDisableScaleIn()).append(",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: ").append(getScaleInCooldown()).append(",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: ").append(getScaleOutCooldown()).append(",");
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingTargetTrackingScalingPolicyConfigurationDescription == false)
            return false;
        AutoScalingTargetTrackingScalingPolicyConfigurationDescription other = (AutoScalingTargetTrackingScalingPolicyConfigurationDescription) obj;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        hashCode = prime * hashCode + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription clone() {
        try {
            return (AutoScalingTargetTrackingScalingPolicyConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
