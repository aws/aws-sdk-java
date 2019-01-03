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
 * Describes overrides for a launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateOverrides" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateOverrides implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The Availability Zone in which to launch the instances.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The number of units provided by the specified instance type.
     * </p>
     */
    private Double weightedCapacity;
    /**
     * <p>
     * The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     * <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use first in
     * fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at
     * <code>0</code>. The lower the number, the higher the priority. If no number is set, the launch template override
     * has the lowest priority.
     * </p>
     */
    private Double priority;

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public LaunchTemplateOverrides withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public LaunchTemplateOverrides withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @return The maximum price per unit hour that you are willing to pay for a Spot Instance.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * </p>
     * 
     * @param spotPrice
     *        The maximum price per unit hour that you are willing to pay for a Spot Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instances.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * 
     * @return The ID of the subnet in which to launch the instances.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to launch the instances.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to launch the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to launch the instances.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to launch the instances.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to launch the instances.
     * </p>
     * 
     * @return The Availability Zone in which to launch the instances.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to launch the instances.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to launch the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The number of units provided by the specified instance type.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units provided by the specified instance type.
     */

    public void setWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of units provided by the specified instance type.
     * </p>
     * 
     * @return The number of units provided by the specified instance type.
     */

    public Double getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of units provided by the specified instance type.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units provided by the specified instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withWeightedCapacity(Double weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
        return this;
    }

    /**
     * <p>
     * The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     * <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use first in
     * fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at
     * <code>0</code>. The lower the number, the higher the priority. If no number is set, the launch template override
     * has the lowest priority.
     * </p>
     * 
     * @param priority
     *        The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     *        <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use
     *        first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole
     *        numbers starting at <code>0</code>. The lower the number, the higher the priority. If no number is set,
     *        the launch template override has the lowest priority.
     */

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     * <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use first in
     * fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at
     * <code>0</code>. The lower the number, the higher the priority. If no number is set, the launch template override
     * has the lowest priority.
     * </p>
     * 
     * @return The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     *         <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use
     *         first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole
     *         numbers starting at <code>0</code>. The lower the number, the higher the priority. If no number is set,
     *         the launch template override has the lowest priority.
     */

    public Double getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     * <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use first in
     * fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole numbers starting at
     * <code>0</code>. The lower the number, the higher the priority. If no number is set, the launch template override
     * has the lowest priority.
     * </p>
     * 
     * @param priority
     *        The priority for the launch template override. If <b>OnDemandAllocationStrategy</b> is set to
     *        <code>prioritized</code>, Spot Fleet uses priority to determine which launch template override to use
     *        first in fulfilling On-Demand capacity. The highest priority is launched first. Valid values are whole
     *        numbers starting at <code>0</code>. The lower the number, the higher the priority. If no number is set,
     *        the launch template override has the lowest priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateOverrides withPriority(Double priority) {
        setPriority(priority);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: ").append(getSpotPrice()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: ").append(getWeightedCapacity()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateOverrides == false)
            return false;
        LaunchTemplateOverrides other = (LaunchTemplateOverrides) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateOverrides clone() {
        try {
            return (LaunchTemplateOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
