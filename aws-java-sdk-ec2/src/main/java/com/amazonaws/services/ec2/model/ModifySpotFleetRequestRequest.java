/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifySpotFleetRequest(ModifySpotFleetRequestRequest) ModifySpotFleetRequest operation}.
 * <p>
 * Modifies the specified Spot fleet request.
 * </p>
 * <p>
 * While the Spot fleet request is being modified, it is in the
 * <code>modifying</code> state.
 * </p>
 * <p>
 * To scale up your Spot fleet, increase its target capacity. The Spot
 * fleet launches the additional Spot instances according to the
 * allocation strategy for the Spot fleet request. If the allocation
 * strategy is <code>lowestPrice</code> , the Spot fleet launches
 * instances using the Spot pool with the lowest price. If the allocation
 * strategy is <code>diversified</code> , the Spot fleet distributes the
 * instances across the Spot pools.
 * </p>
 * <p>
 * To scale down your Spot fleet, decrease its target capacity. First,
 * the Spot fleet cancels any open bids that exceed the new target
 * capacity. You can request that the Spot fleet terminate Spot instances
 * until the size of the fleet no longer exceeds the new target capacity.
 * If the allocation strategy is <code>lowestPrice</code> , the Spot
 * fleet terminates the instances with the highest price per unit. If the
 * allocation strategy is <code>diversified</code> , the Spot fleet
 * terminates instances across the Spot pools. Alternatively, you can
 * request that the Spot fleet keep the fleet at its current size, but
 * not replace any Spot instances that are interrupted or that you
 * terminate manually.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifySpotFleetRequest(ModifySpotFleetRequestRequest)
 */
public class ModifySpotFleetRequestRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The size of the fleet.
     */
    private Integer targetCapacity;

    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     */
    private String excessCapacityTerminationPolicy;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifySpotFleetRequestRequest withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The size of the fleet.
     *
     * @return The size of the fleet.
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }
    
    /**
     * The size of the fleet.
     *
     * @param targetCapacity The size of the fleet.
     */
    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }
    
    /**
     * The size of the fleet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetCapacity The size of the fleet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifySpotFleetRequestRequest withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @return Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }
    
    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }
    
    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public ModifySpotFleetRequestRequest withExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }
    
    /**
     * Indicates whether running Spot instances should be terminated if the
     * target capacity of the Spot fleet request is decreased below the
     * current size of the Spot fleet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy Indicates whether running Spot instances should be terminated if the
     *         target capacity of the Spot fleet request is decreased below the
     *         current size of the Spot fleet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ExcessCapacityTerminationPolicy
     */
    public ModifySpotFleetRequestRequest withExcessCapacityTerminationPolicy(ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
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
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getTargetCapacity() != null) sb.append("TargetCapacity: " + getTargetCapacity() + ",");
        if (getExcessCapacityTerminationPolicy() != null) sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getExcessCapacityTerminationPolicy() == null) ? 0 : getExcessCapacityTerminationPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifySpotFleetRequestRequest == false) return false;
        ModifySpotFleetRequestRequest other = (ModifySpotFleetRequestRequest)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null) return false;
        if (other.getTargetCapacity() != null && other.getTargetCapacity().equals(this.getTargetCapacity()) == false) return false; 
        if (other.getExcessCapacityTerminationPolicy() == null ^ this.getExcessCapacityTerminationPolicy() == null) return false;
        if (other.getExcessCapacityTerminationPolicy() != null && other.getExcessCapacityTerminationPolicy().equals(this.getExcessCapacityTerminationPolicy()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifySpotFleetRequestRequest clone() {
        
            return (ModifySpotFleetRequestRequest) super.clone();
    }

}
    