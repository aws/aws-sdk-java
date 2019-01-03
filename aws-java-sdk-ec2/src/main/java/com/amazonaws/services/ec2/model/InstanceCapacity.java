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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the instance type that the Dedicated Host supports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceCapacity implements Serializable, Cloneable {

    /**
     * <p>
     * The number of instances that can still be launched onto the Dedicated Host.
     * </p>
     */
    private Integer availableCapacity;
    /**
     * <p>
     * The instance type size supported by the Dedicated Host.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated Host.
     * </p>
     */
    private Integer totalCapacity;

    /**
     * <p>
     * The number of instances that can still be launched onto the Dedicated Host.
     * </p>
     * 
     * @param availableCapacity
     *        The number of instances that can still be launched onto the Dedicated Host.
     */

    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * <p>
     * The number of instances that can still be launched onto the Dedicated Host.
     * </p>
     * 
     * @return The number of instances that can still be launched onto the Dedicated Host.
     */

    public Integer getAvailableCapacity() {
        return this.availableCapacity;
    }

    /**
     * <p>
     * The number of instances that can still be launched onto the Dedicated Host.
     * </p>
     * 
     * @param availableCapacity
     *        The number of instances that can still be launched onto the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCapacity withAvailableCapacity(Integer availableCapacity) {
        setAvailableCapacity(availableCapacity);
        return this;
    }

    /**
     * <p>
     * The instance type size supported by the Dedicated Host.
     * </p>
     * 
     * @param instanceType
     *        The instance type size supported by the Dedicated Host.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type size supported by the Dedicated Host.
     * </p>
     * 
     * @return The instance type size supported by the Dedicated Host.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type size supported by the Dedicated Host.
     * </p>
     * 
     * @param instanceType
     *        The instance type size supported by the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCapacity withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated Host.
     * </p>
     * 
     * @param totalCapacity
     *        The total number of instances that can be launched onto the Dedicated Host.
     */

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated Host.
     * </p>
     * 
     * @return The total number of instances that can be launched onto the Dedicated Host.
     */

    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated Host.
     * </p>
     * 
     * @param totalCapacity
     *        The total number of instances that can be launched onto the Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceCapacity withTotalCapacity(Integer totalCapacity) {
        setTotalCapacity(totalCapacity);
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
        if (getAvailableCapacity() != null)
            sb.append("AvailableCapacity: ").append(getAvailableCapacity()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getTotalCapacity() != null)
            sb.append("TotalCapacity: ").append(getTotalCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceCapacity == false)
            return false;
        InstanceCapacity other = (InstanceCapacity) obj;
        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null)
            return false;
        if (other.getAvailableCapacity() != null && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getTotalCapacity() == null ^ this.getTotalCapacity() == null)
            return false;
        if (other.getTotalCapacity() != null && other.getTotalCapacity().equals(this.getTotalCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailableCapacity() == null) ? 0 : getAvailableCapacity().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getTotalCapacity() == null) ? 0 : getTotalCapacity().hashCode());
        return hashCode;
    }

    @Override
    public InstanceCapacity clone() {
        try {
            return (InstanceCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
