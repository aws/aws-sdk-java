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
 * The allocation strategy of On-Demand Instances in an EC2 Fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/OnDemandOptionsRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandOptionsRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch template override,
     * launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * </p>
     */
    private Boolean singleInstanceType;
    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     * </p>
     */
    private Boolean singleAvailabilityZone;
    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached,
     * the fleet launches no instances.
     * </p>
     */
    private Integer minTargetCapacity;

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch template override,
     * launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch
     *        template override, launching the highest priority first. If you do not specify a value, EC2 Fleet defaults
     *        to <code>lowest-price</code>.
     * @see FleetOnDemandAllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch template override,
     * launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * 
     * @return The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *         <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first.
     *         If you specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch
     *         template override, launching the highest priority first. If you do not specify a value, EC2 Fleet
     *         defaults to <code>lowest-price</code>.
     * @see FleetOnDemandAllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch template override,
     * launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch
     *        template override, launching the highest priority first. If you do not specify a value, EC2 Fleet defaults
     *        to <code>lowest-price</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetOnDemandAllocationStrategy
     */

    public OnDemandOptionsRequest withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     * <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first. If you
     * specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch template override,
     * launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify
     *        <code>lowest-price</code>, EC2 Fleet uses price to determine the order, launching the lowest price first.
     *        If you specify <code>prioritized</code>, EC2 Fleet uses the priority that you assigned to each launch
     *        template override, launching the highest priority first. If you do not specify a value, EC2 Fleet defaults
     *        to <code>lowest-price</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetOnDemandAllocationStrategy
     */

    public OnDemandOptionsRequest withAllocationStrategy(FleetOnDemandAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * </p>
     * 
     * @param singleInstanceType
     *        Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     */

    public void setSingleInstanceType(Boolean singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * </p>
     * 
     * @return Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     */

    public Boolean getSingleInstanceType() {
        return this.singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * </p>
     * 
     * @param singleInstanceType
     *        Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandOptionsRequest withSingleInstanceType(Boolean singleInstanceType) {
        setSingleInstanceType(singleInstanceType);
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     * </p>
     * 
     * @return Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet.
     */

    public Boolean isSingleInstanceType() {
        return this.singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     * </p>
     * 
     * @param singleAvailabilityZone
     *        Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     */

    public void setSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     * </p>
     * 
     * @return Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     */

    public Boolean getSingleAvailabilityZone() {
        return this.singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     * </p>
     * 
     * @param singleAvailabilityZone
     *        Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandOptionsRequest withSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        setSingleAvailabilityZone(singleAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     * </p>
     * 
     * @return Indicates that the fleet launches all On-Demand Instances into a single Availability Zone.
     */

    public Boolean isSingleAvailabilityZone() {
        return this.singleAvailabilityZone;
    }

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached,
     * the fleet launches no instances.
     * </p>
     * 
     * @param minTargetCapacity
     *        The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not
     *        reached, the fleet launches no instances.
     */

    public void setMinTargetCapacity(Integer minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached,
     * the fleet launches no instances.
     * </p>
     * 
     * @return The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not
     *         reached, the fleet launches no instances.
     */

    public Integer getMinTargetCapacity() {
        return this.minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached,
     * the fleet launches no instances.
     * </p>
     * 
     * @param minTargetCapacity
     *        The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not
     *        reached, the fleet launches no instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandOptionsRequest withMinTargetCapacity(Integer minTargetCapacity) {
        setMinTargetCapacity(minTargetCapacity);
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
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getSingleInstanceType() != null)
            sb.append("SingleInstanceType: ").append(getSingleInstanceType()).append(",");
        if (getSingleAvailabilityZone() != null)
            sb.append("SingleAvailabilityZone: ").append(getSingleAvailabilityZone()).append(",");
        if (getMinTargetCapacity() != null)
            sb.append("MinTargetCapacity: ").append(getMinTargetCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandOptionsRequest == false)
            return false;
        OnDemandOptionsRequest other = (OnDemandOptionsRequest) obj;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getSingleInstanceType() == null ^ this.getSingleInstanceType() == null)
            return false;
        if (other.getSingleInstanceType() != null && other.getSingleInstanceType().equals(this.getSingleInstanceType()) == false)
            return false;
        if (other.getSingleAvailabilityZone() == null ^ this.getSingleAvailabilityZone() == null)
            return false;
        if (other.getSingleAvailabilityZone() != null && other.getSingleAvailabilityZone().equals(this.getSingleAvailabilityZone()) == false)
            return false;
        if (other.getMinTargetCapacity() == null ^ this.getMinTargetCapacity() == null)
            return false;
        if (other.getMinTargetCapacity() != null && other.getMinTargetCapacity().equals(this.getMinTargetCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getSingleInstanceType() == null) ? 0 : getSingleInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSingleAvailabilityZone() == null) ? 0 : getSingleAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getMinTargetCapacity() == null) ? 0 : getMinTargetCapacity().hashCode());
        return hashCode;
    }

    @Override
    public OnDemandOptionsRequest clone() {
        try {
            return (OnDemandOptionsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
