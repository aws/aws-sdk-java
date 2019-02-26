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
 * Describes the configuration of Spot Instances in an EC2 Fleet request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SpotOptionsRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotOptionsRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     */
    private String instanceInterruptionBehavior;
    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     */
    private Integer instancePoolsToUseCount;
    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     * </p>
     */
    private Boolean singleInstanceType;
    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     * </p>
     */
    private Boolean singleAvailabilityZone;
    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the
     * fleet launches no instances.
     * </p>
     */
    private Integer minTargetCapacity;

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @see SpotAllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @return Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *         The default is <code>lowestPrice</code>.
     * @see SpotAllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotAllocationStrategy
     */

    public SpotOptionsRequest withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The
     * default is <code>lowestPrice</code>.
     * </p>
     * 
     * @param allocationStrategy
     *        Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request.
     *        The default is <code>lowestPrice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotAllocationStrategy
     */

    public SpotOptionsRequest withAllocationStrategy(SpotAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see SpotInstanceInterruptionBehavior
     */

    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @return The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @see SpotInstanceInterruptionBehavior
     */

    public String getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceInterruptionBehavior
     */

    public SpotOptionsRequest withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        setInstanceInterruptionBehavior(instanceInterruptionBehavior);
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * </p>
     * 
     * @param instanceInterruptionBehavior
     *        The behavior when a Spot Instance is interrupted. The default is <code>terminate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpotInstanceInterruptionBehavior
     */

    public SpotOptionsRequest withInstanceInterruptionBehavior(SpotInstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     * 
     * @param instancePoolsToUseCount
     *        The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     *        <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools
     *        and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     */

    public void setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     * 
     * @return The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     *         <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools
     *         and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     */

    public Integer getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     * <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * </p>
     * 
     * @param instancePoolsToUseCount
     *        The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot
     *        <b>AllocationStrategy</b> is set to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools
     *        and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotOptionsRequest withInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        setInstancePoolsToUseCount(instancePoolsToUseCount);
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     * </p>
     * 
     * @param singleInstanceType
     *        Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     */

    public void setSingleInstanceType(Boolean singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     * </p>
     * 
     * @return Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     */

    public Boolean getSingleInstanceType() {
        return this.singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     * </p>
     * 
     * @param singleInstanceType
     *        Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotOptionsRequest withSingleInstanceType(Boolean singleInstanceType) {
        setSingleInstanceType(singleInstanceType);
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     * </p>
     * 
     * @return Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
     */

    public Boolean isSingleInstanceType() {
        return this.singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     * </p>
     * 
     * @param singleAvailabilityZone
     *        Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     */

    public void setSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     * </p>
     * 
     * @return Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     */

    public Boolean getSingleAvailabilityZone() {
        return this.singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     * </p>
     * 
     * @param singleAvailabilityZone
     *        Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotOptionsRequest withSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        setSingleAvailabilityZone(singleAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     * </p>
     * 
     * @return Indicates that the fleet launches all Spot Instances into a single Availability Zone.
     */

    public Boolean isSingleAvailabilityZone() {
        return this.singleAvailabilityZone;
    }

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the
     * fleet launches no instances.
     * </p>
     * 
     * @param minTargetCapacity
     *        The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not
     *        reached, the fleet launches no instances.
     */

    public void setMinTargetCapacity(Integer minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the
     * fleet launches no instances.
     * </p>
     * 
     * @return The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not
     *         reached, the fleet launches no instances.
     */

    public Integer getMinTargetCapacity() {
        return this.minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the
     * fleet launches no instances.
     * </p>
     * 
     * @param minTargetCapacity
     *        The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not
     *        reached, the fleet launches no instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpotOptionsRequest withMinTargetCapacity(Integer minTargetCapacity) {
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
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: ").append(getInstanceInterruptionBehavior()).append(",");
        if (getInstancePoolsToUseCount() != null)
            sb.append("InstancePoolsToUseCount: ").append(getInstancePoolsToUseCount()).append(",");
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

        if (obj instanceof SpotOptionsRequest == false)
            return false;
        SpotOptionsRequest other = (SpotOptionsRequest) obj;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getInstanceInterruptionBehavior() == null ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null && other.getInstanceInterruptionBehavior().equals(this.getInstanceInterruptionBehavior()) == false)
            return false;
        if (other.getInstancePoolsToUseCount() == null ^ this.getInstancePoolsToUseCount() == null)
            return false;
        if (other.getInstancePoolsToUseCount() != null && other.getInstancePoolsToUseCount().equals(this.getInstancePoolsToUseCount()) == false)
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
        hashCode = prime * hashCode + ((getInstanceInterruptionBehavior() == null) ? 0 : getInstanceInterruptionBehavior().hashCode());
        hashCode = prime * hashCode + ((getInstancePoolsToUseCount() == null) ? 0 : getInstancePoolsToUseCount().hashCode());
        hashCode = prime * hashCode + ((getSingleInstanceType() == null) ? 0 : getSingleInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSingleAvailabilityZone() == null) ? 0 : getSingleAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getMinTargetCapacity() == null) ? 0 : getMinTargetCapacity().hashCode());
        return hashCode;
    }

    @Override
    public SpotOptionsRequest clone() {
        try {
            return (SpotOptionsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
