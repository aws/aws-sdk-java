/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of an Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/AutoScalingGroupConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingGroupConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired capacity, or number of instances, for the Auto Scaling group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * The minimum size, or minimum number of instances, for the Auto Scaling group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size, or maximum number of instances, for the Auto Scaling group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The instance type for the Auto Scaling group.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The desired capacity, or number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity, or number of instances, for the Auto Scaling group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity, or number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @return The desired capacity, or number of instances, for the Auto Scaling group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The desired capacity, or number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @param desiredCapacity
     *        The desired capacity, or number of instances, for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupConfiguration withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * The minimum size, or minimum number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size, or minimum number of instances, for the Auto Scaling group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size, or minimum number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @return The minimum size, or minimum number of instances, for the Auto Scaling group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size, or minimum number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size, or minimum number of instances, for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupConfiguration withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size, or maximum number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size, or maximum number of instances, for the Auto Scaling group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size, or maximum number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @return The maximum size, or maximum number of instances, for the Auto Scaling group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size, or maximum number of instances, for the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size, or maximum number of instances, for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupConfiguration withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The instance type for the Auto Scaling group.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the Auto Scaling group.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the Auto Scaling group.
     * </p>
     * 
     * @return The instance type for the Auto Scaling group.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the Auto Scaling group.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingGroupConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
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
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: ").append(getDesiredCapacity()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroupConfiguration == false)
            return false;
        AutoScalingGroupConfiguration other = (AutoScalingGroupConfiguration) obj;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingGroupConfiguration clone() {
        try {
            return (AutoScalingGroupConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.AutoScalingGroupConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
