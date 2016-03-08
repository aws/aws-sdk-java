/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the configuration settings for the modified Reserved Instances.
 * </p>
 */
public class ReservedInstancesConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either
     * EC2-Classic or EC2-VPC.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the modified Reserved Instances.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     * 
     * @return The Availability Zone for the modified Reserved Instances.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the modified Reserved Instances.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstancesConfiguration withAvailabilityZone(
            String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either
     * EC2-Classic or EC2-VPC.
     * </p>
     * 
     * @param platform
     *        The network platform of the modified Reserved Instances, which is
     *        either EC2-Classic or EC2-VPC.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either
     * EC2-Classic or EC2-VPC.
     * </p>
     * 
     * @return The network platform of the modified Reserved Instances, which is
     *         either EC2-Classic or EC2-VPC.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The network platform of the modified Reserved Instances, which is either
     * EC2-Classic or EC2-VPC.
     * </p>
     * 
     * @param platform
     *        The network platform of the modified Reserved Instances, which is
     *        either EC2-Classic or EC2-VPC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstancesConfiguration withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * 
     * @param instanceCount
     *        The number of modified Reserved Instances.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * 
     * @return The number of modified Reserved Instances.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of modified Reserved Instances.
     * </p>
     * 
     * @param instanceCount
     *        The number of modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstancesConfiguration withInstanceCount(
            Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @return The instance type for the modified Reserved Instances.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceType
     */

    public ReservedInstancesConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type for the modified Reserved Instances.
     * </p>
     * 
     * @param instanceType
     *        The instance type for the modified Reserved Instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceType
     */

    public ReservedInstancesConfiguration withInstanceType(
            InstanceType instanceType) {
        setInstanceType(instanceType);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesConfiguration == false)
            return false;
        ReservedInstancesConfiguration other = (ReservedInstancesConfiguration) obj;
        if (other.getAvailabilityZone() == null
                ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(
                        this.getAvailabilityZone()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null
                && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesConfiguration clone() {
        try {
            return (ReservedInstancesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
