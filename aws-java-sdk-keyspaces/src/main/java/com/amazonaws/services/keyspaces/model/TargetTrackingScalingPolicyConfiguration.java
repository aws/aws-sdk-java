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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The auto scaling policy that scales a table based on the ratio of consumed to provisioned capacity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/TargetTrackingScalingPolicyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingScalingPolicyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if <code>scale-in</code> is enabled.
     * </p>
     * <p>
     * When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling policies
     * are set, they can't scale in the table lower than its minimum capacity.
     * </p>
     */
    private Boolean disableScaleIn;
    /**
     * <p>
     * Specifies a <code>scale-in</code> cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     */
    private Integer scaleInCooldown;
    /**
     * <p>
     * Specifies a scale out cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     */
    private Integer scaleOutCooldown;
    /**
     * <p>
     * Specifies the target value for the target tracking auto scaling policy.
     * </p>
     * <p>
     * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target utilization rate,
     * and then back down when it falls below the target. This ensures that the ratio of consumed capacity to
     * provisioned capacity stays at or near this value. You define <code>targetValue</code> as a percentage. A
     * <code>double</code> between 20 and 90.
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * Specifies if <code>scale-in</code> is enabled.
     * </p>
     * <p>
     * When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling policies
     * are set, they can't scale in the table lower than its minimum capacity.
     * </p>
     * 
     * @param disableScaleIn
     *        Specifies if <code>scale-in</code> is enabled.</p>
     *        <p>
     *        When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling
     *        policies are set, they can't scale in the table lower than its minimum capacity.
     */

    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Specifies if <code>scale-in</code> is enabled.
     * </p>
     * <p>
     * When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling policies
     * are set, they can't scale in the table lower than its minimum capacity.
     * </p>
     * 
     * @return Specifies if <code>scale-in</code> is enabled.</p>
     *         <p>
     *         When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling
     *         policies are set, they can't scale in the table lower than its minimum capacity.
     */

    public Boolean getDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * Specifies if <code>scale-in</code> is enabled.
     * </p>
     * <p>
     * When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling policies
     * are set, they can't scale in the table lower than its minimum capacity.
     * </p>
     * 
     * @param disableScaleIn
     *        Specifies if <code>scale-in</code> is enabled.</p>
     *        <p>
     *        When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling
     *        policies are set, they can't scale in the table lower than its minimum capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        setDisableScaleIn(disableScaleIn);
        return this;
    }

    /**
     * <p>
     * Specifies if <code>scale-in</code> is enabled.
     * </p>
     * <p>
     * When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling policies
     * are set, they can't scale in the table lower than its minimum capacity.
     * </p>
     * 
     * @return Specifies if <code>scale-in</code> is enabled.</p>
     *         <p>
     *         When auto scaling automatically decreases capacity for a table, the table <i>scales in</i>. When scaling
     *         policies are set, they can't scale in the table lower than its minimum capacity.
     */

    public Boolean isDisableScaleIn() {
        return this.disableScaleIn;
    }

    /**
     * <p>
     * Specifies a <code>scale-in</code> cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     * 
     * @param scaleInCooldown
     *        Specifies a <code>scale-in</code> cool down period.</p>
     *        <p>
     *        A cooldown period in seconds between scaling activities that lets the table stabilize before another
     *        scaling activity starts.
     */

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * Specifies a <code>scale-in</code> cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     * 
     * @return Specifies a <code>scale-in</code> cool down period.</p>
     *         <p>
     *         A cooldown period in seconds between scaling activities that lets the table stabilize before another
     *         scaling activity starts.
     */

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    /**
     * <p>
     * Specifies a <code>scale-in</code> cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     * 
     * @param scaleInCooldown
     *        Specifies a <code>scale-in</code> cool down period.</p>
     *        <p>
     *        A cooldown period in seconds between scaling activities that lets the table stabilize before another
     *        scaling activity starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        setScaleInCooldown(scaleInCooldown);
        return this;
    }

    /**
     * <p>
     * Specifies a scale out cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     * 
     * @param scaleOutCooldown
     *        Specifies a scale out cool down period.</p>
     *        <p>
     *        A cooldown period in seconds between scaling activities that lets the table stabilize before another
     *        scaling activity starts.
     */

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * Specifies a scale out cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     * 
     * @return Specifies a scale out cool down period.</p>
     *         <p>
     *         A cooldown period in seconds between scaling activities that lets the table stabilize before another
     *         scaling activity starts.
     */

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    /**
     * <p>
     * Specifies a scale out cool down period.
     * </p>
     * <p>
     * A cooldown period in seconds between scaling activities that lets the table stabilize before another scaling
     * activity starts.
     * </p>
     * 
     * @param scaleOutCooldown
     *        Specifies a scale out cool down period.</p>
     *        <p>
     *        A cooldown period in seconds between scaling activities that lets the table stabilize before another
     *        scaling activity starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        setScaleOutCooldown(scaleOutCooldown);
        return this;
    }

    /**
     * <p>
     * Specifies the target value for the target tracking auto scaling policy.
     * </p>
     * <p>
     * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target utilization rate,
     * and then back down when it falls below the target. This ensures that the ratio of consumed capacity to
     * provisioned capacity stays at or near this value. You define <code>targetValue</code> as a percentage. A
     * <code>double</code> between 20 and 90.
     * </p>
     * 
     * @param targetValue
     *        Specifies the target value for the target tracking auto scaling policy.</p>
     *        <p>
     *        Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target
     *        utilization rate, and then back down when it falls below the target. This ensures that the ratio of
     *        consumed capacity to provisioned capacity stays at or near this value. You define <code>targetValue</code>
     *        as a percentage. A <code>double</code> between 20 and 90.
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * Specifies the target value for the target tracking auto scaling policy.
     * </p>
     * <p>
     * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target utilization rate,
     * and then back down when it falls below the target. This ensures that the ratio of consumed capacity to
     * provisioned capacity stays at or near this value. You define <code>targetValue</code> as a percentage. A
     * <code>double</code> between 20 and 90.
     * </p>
     * 
     * @return Specifies the target value for the target tracking auto scaling policy.</p>
     *         <p>
     *         Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target
     *         utilization rate, and then back down when it falls below the target. This ensures that the ratio of
     *         consumed capacity to provisioned capacity stays at or near this value. You define
     *         <code>targetValue</code> as a percentage. A <code>double</code> between 20 and 90.
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * Specifies the target value for the target tracking auto scaling policy.
     * </p>
     * <p>
     * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target utilization rate,
     * and then back down when it falls below the target. This ensures that the ratio of consumed capacity to
     * provisioned capacity stays at or near this value. You define <code>targetValue</code> as a percentage. A
     * <code>double</code> between 20 and 90.
     * </p>
     * 
     * @param targetValue
     *        Specifies the target value for the target tracking auto scaling policy.</p>
     *        <p>
     *        Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this target
     *        utilization rate, and then back down when it falls below the target. This ensures that the ratio of
     *        consumed capacity to provisioned capacity stays at or near this value. You define <code>targetValue</code>
     *        as a percentage. A <code>double</code> between 20 and 90.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withTargetValue(Double targetValue) {
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

        if (obj instanceof TargetTrackingScalingPolicyConfiguration == false)
            return false;
        TargetTrackingScalingPolicyConfiguration other = (TargetTrackingScalingPolicyConfiguration) obj;
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
        com.amazonaws.services.keyspaces.model.transform.TargetTrackingScalingPolicyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
