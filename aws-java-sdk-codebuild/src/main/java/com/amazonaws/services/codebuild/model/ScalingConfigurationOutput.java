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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The scaling configuration output of a compute fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ScalingConfigurationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingConfigurationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scaling type for a compute fleet.
     * </p>
     */
    private String scalingType;
    /**
     * <p>
     * A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * </p>
     */
    private java.util.List<TargetTrackingScalingConfiguration> targetTrackingScalingConfigs;
    /**
     * <p>
     * The maximum number of instances in the ﬂeet when auto-scaling.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The desired number of instances in the ﬂeet when auto-scaling.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The scaling type for a compute fleet.
     * </p>
     * 
     * @param scalingType
     *        The scaling type for a compute fleet.
     * @see FleetScalingType
     */

    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    /**
     * <p>
     * The scaling type for a compute fleet.
     * </p>
     * 
     * @return The scaling type for a compute fleet.
     * @see FleetScalingType
     */

    public String getScalingType() {
        return this.scalingType;
    }

    /**
     * <p>
     * The scaling type for a compute fleet.
     * </p>
     * 
     * @param scalingType
     *        The scaling type for a compute fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetScalingType
     */

    public ScalingConfigurationOutput withScalingType(String scalingType) {
        setScalingType(scalingType);
        return this;
    }

    /**
     * <p>
     * The scaling type for a compute fleet.
     * </p>
     * 
     * @param scalingType
     *        The scaling type for a compute fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetScalingType
     */

    public ScalingConfigurationOutput withScalingType(FleetScalingType scalingType) {
        this.scalingType = scalingType.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * </p>
     * 
     * @return A list of <code>TargetTrackingScalingConfiguration</code> objects.
     */

    public java.util.List<TargetTrackingScalingConfiguration> getTargetTrackingScalingConfigs() {
        return targetTrackingScalingConfigs;
    }

    /**
     * <p>
     * A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * </p>
     * 
     * @param targetTrackingScalingConfigs
     *        A list of <code>TargetTrackingScalingConfiguration</code> objects.
     */

    public void setTargetTrackingScalingConfigs(java.util.Collection<TargetTrackingScalingConfiguration> targetTrackingScalingConfigs) {
        if (targetTrackingScalingConfigs == null) {
            this.targetTrackingScalingConfigs = null;
            return;
        }

        this.targetTrackingScalingConfigs = new java.util.ArrayList<TargetTrackingScalingConfiguration>(targetTrackingScalingConfigs);
    }

    /**
     * <p>
     * A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTrackingScalingConfigs(java.util.Collection)} or
     * {@link #withTargetTrackingScalingConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetTrackingScalingConfigs
     *        A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationOutput withTargetTrackingScalingConfigs(TargetTrackingScalingConfiguration... targetTrackingScalingConfigs) {
        if (this.targetTrackingScalingConfigs == null) {
            setTargetTrackingScalingConfigs(new java.util.ArrayList<TargetTrackingScalingConfiguration>(targetTrackingScalingConfigs.length));
        }
        for (TargetTrackingScalingConfiguration ele : targetTrackingScalingConfigs) {
            this.targetTrackingScalingConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * </p>
     * 
     * @param targetTrackingScalingConfigs
     *        A list of <code>TargetTrackingScalingConfiguration</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationOutput withTargetTrackingScalingConfigs(java.util.Collection<TargetTrackingScalingConfiguration> targetTrackingScalingConfigs) {
        setTargetTrackingScalingConfigs(targetTrackingScalingConfigs);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances in the ﬂeet when auto-scaling.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of instances in the ﬂeet when auto-scaling.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum number of instances in the ﬂeet when auto-scaling.
     * </p>
     * 
     * @return The maximum number of instances in the ﬂeet when auto-scaling.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum number of instances in the ﬂeet when auto-scaling.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of instances in the ﬂeet when auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationOutput withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The desired number of instances in the ﬂeet when auto-scaling.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired number of instances in the ﬂeet when auto-scaling.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired number of instances in the ﬂeet when auto-scaling.
     * </p>
     * 
     * @return The desired number of instances in the ﬂeet when auto-scaling.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The desired number of instances in the ﬂeet when auto-scaling.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired number of instances in the ﬂeet when auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingConfigurationOutput withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
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
        if (getScalingType() != null)
            sb.append("ScalingType: ").append(getScalingType()).append(",");
        if (getTargetTrackingScalingConfigs() != null)
            sb.append("TargetTrackingScalingConfigs: ").append(getTargetTrackingScalingConfigs()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConfigurationOutput == false)
            return false;
        ScalingConfigurationOutput other = (ScalingConfigurationOutput) obj;
        if (other.getScalingType() == null ^ this.getScalingType() == null)
            return false;
        if (other.getScalingType() != null && other.getScalingType().equals(this.getScalingType()) == false)
            return false;
        if (other.getTargetTrackingScalingConfigs() == null ^ this.getTargetTrackingScalingConfigs() == null)
            return false;
        if (other.getTargetTrackingScalingConfigs() != null && other.getTargetTrackingScalingConfigs().equals(this.getTargetTrackingScalingConfigs()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingType() == null) ? 0 : getScalingType().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingScalingConfigs() == null) ? 0 : getTargetTrackingScalingConfigs().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public ScalingConfigurationOutput clone() {
        try {
            return (ScalingConfigurationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ScalingConfigurationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
