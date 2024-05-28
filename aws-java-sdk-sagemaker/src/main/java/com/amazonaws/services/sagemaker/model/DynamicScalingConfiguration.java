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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object with the recommended values for you to specify when creating an autoscaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DynamicScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamicScalingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended minimum capacity to specify for your autoscaling policy.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The recommended maximum capacity to specify for your autoscaling policy.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The recommended scale in cooldown time for your autoscaling policy.
     * </p>
     */
    private Integer scaleInCooldown;
    /**
     * <p>
     * The recommended scale out cooldown time for your autoscaling policy.
     * </p>
     */
    private Integer scaleOutCooldown;
    /**
     * <p>
     * An object of the scaling policies for each metric.
     * </p>
     */
    private java.util.List<ScalingPolicy> scalingPolicies;

    /**
     * <p>
     * The recommended minimum capacity to specify for your autoscaling policy.
     * </p>
     * 
     * @param minCapacity
     *        The recommended minimum capacity to specify for your autoscaling policy.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The recommended minimum capacity to specify for your autoscaling policy.
     * </p>
     * 
     * @return The recommended minimum capacity to specify for your autoscaling policy.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The recommended minimum capacity to specify for your autoscaling policy.
     * </p>
     * 
     * @param minCapacity
     *        The recommended minimum capacity to specify for your autoscaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicScalingConfiguration withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The recommended maximum capacity to specify for your autoscaling policy.
     * </p>
     * 
     * @param maxCapacity
     *        The recommended maximum capacity to specify for your autoscaling policy.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The recommended maximum capacity to specify for your autoscaling policy.
     * </p>
     * 
     * @return The recommended maximum capacity to specify for your autoscaling policy.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The recommended maximum capacity to specify for your autoscaling policy.
     * </p>
     * 
     * @param maxCapacity
     *        The recommended maximum capacity to specify for your autoscaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicScalingConfiguration withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The recommended scale in cooldown time for your autoscaling policy.
     * </p>
     * 
     * @param scaleInCooldown
     *        The recommended scale in cooldown time for your autoscaling policy.
     */

    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * The recommended scale in cooldown time for your autoscaling policy.
     * </p>
     * 
     * @return The recommended scale in cooldown time for your autoscaling policy.
     */

    public Integer getScaleInCooldown() {
        return this.scaleInCooldown;
    }

    /**
     * <p>
     * The recommended scale in cooldown time for your autoscaling policy.
     * </p>
     * 
     * @param scaleInCooldown
     *        The recommended scale in cooldown time for your autoscaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicScalingConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        setScaleInCooldown(scaleInCooldown);
        return this;
    }

    /**
     * <p>
     * The recommended scale out cooldown time for your autoscaling policy.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The recommended scale out cooldown time for your autoscaling policy.
     */

    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * The recommended scale out cooldown time for your autoscaling policy.
     * </p>
     * 
     * @return The recommended scale out cooldown time for your autoscaling policy.
     */

    public Integer getScaleOutCooldown() {
        return this.scaleOutCooldown;
    }

    /**
     * <p>
     * The recommended scale out cooldown time for your autoscaling policy.
     * </p>
     * 
     * @param scaleOutCooldown
     *        The recommended scale out cooldown time for your autoscaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicScalingConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        setScaleOutCooldown(scaleOutCooldown);
        return this;
    }

    /**
     * <p>
     * An object of the scaling policies for each metric.
     * </p>
     * 
     * @return An object of the scaling policies for each metric.
     */

    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return scalingPolicies;
    }

    /**
     * <p>
     * An object of the scaling policies for each metric.
     * </p>
     * 
     * @param scalingPolicies
     *        An object of the scaling policies for each metric.
     */

    public void setScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        if (scalingPolicies == null) {
            this.scalingPolicies = null;
            return;
        }

        this.scalingPolicies = new java.util.ArrayList<ScalingPolicy>(scalingPolicies);
    }

    /**
     * <p>
     * An object of the scaling policies for each metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPolicies(java.util.Collection)} or {@link #withScalingPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingPolicies
     *        An object of the scaling policies for each metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicScalingConfiguration withScalingPolicies(ScalingPolicy... scalingPolicies) {
        if (this.scalingPolicies == null) {
            setScalingPolicies(new java.util.ArrayList<ScalingPolicy>(scalingPolicies.length));
        }
        for (ScalingPolicy ele : scalingPolicies) {
            this.scalingPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object of the scaling policies for each metric.
     * </p>
     * 
     * @param scalingPolicies
     *        An object of the scaling policies for each metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamicScalingConfiguration withScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        setScalingPolicies(scalingPolicies);
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: ").append(getScaleInCooldown()).append(",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: ").append(getScaleOutCooldown()).append(",");
        if (getScalingPolicies() != null)
            sb.append("ScalingPolicies: ").append(getScalingPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamicScalingConfiguration == false)
            return false;
        DynamicScalingConfiguration other = (DynamicScalingConfiguration) obj;
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getScalingPolicies() == null ^ this.getScalingPolicies() == null)
            return false;
        if (other.getScalingPolicies() != null && other.getScalingPolicies().equals(this.getScalingPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode + ((getScalingPolicies() == null) ? 0 : getScalingPolicies().hashCode());
        return hashCode;
    }

    @Override
    public DynamicScalingConfiguration clone() {
        try {
            return (DynamicScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DynamicScalingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
