/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The capacity information for instances launched onto the Dedicated
 * host.
 * </p>
 */
public class AvailableCapacity implements Serializable, Cloneable {

    /**
     * The total number of instances that the Dedicated host supports.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCapacity> availableInstanceCapacity;

    /**
     * The number of vCPUs available on the Dedicated host.
     */
    private Integer availableVCpus;

    /**
     * The total number of instances that the Dedicated host supports.
     *
     * @return The total number of instances that the Dedicated host supports.
     */
    public java.util.List<InstanceCapacity> getAvailableInstanceCapacity() {
        if (availableInstanceCapacity == null) {
              availableInstanceCapacity = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCapacity>();
              availableInstanceCapacity.setAutoConstruct(true);
        }
        return availableInstanceCapacity;
    }
    
    /**
     * The total number of instances that the Dedicated host supports.
     *
     * @param availableInstanceCapacity The total number of instances that the Dedicated host supports.
     */
    public void setAvailableInstanceCapacity(java.util.Collection<InstanceCapacity> availableInstanceCapacity) {
        if (availableInstanceCapacity == null) {
            this.availableInstanceCapacity = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCapacity> availableInstanceCapacityCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCapacity>(availableInstanceCapacity.size());
        availableInstanceCapacityCopy.addAll(availableInstanceCapacity);
        this.availableInstanceCapacity = availableInstanceCapacityCopy;
    }
    
    /**
     * The total number of instances that the Dedicated host supports.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailableInstanceCapacity(java.util.Collection)}
     * or {@link #withAvailableInstanceCapacity(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableInstanceCapacity The total number of instances that the Dedicated host supports.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AvailableCapacity withAvailableInstanceCapacity(InstanceCapacity... availableInstanceCapacity) {
        if (getAvailableInstanceCapacity() == null) setAvailableInstanceCapacity(new java.util.ArrayList<InstanceCapacity>(availableInstanceCapacity.length));
        for (InstanceCapacity value : availableInstanceCapacity) {
            getAvailableInstanceCapacity().add(value);
        }
        return this;
    }
    
    /**
     * The total number of instances that the Dedicated host supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableInstanceCapacity The total number of instances that the Dedicated host supports.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AvailableCapacity withAvailableInstanceCapacity(java.util.Collection<InstanceCapacity> availableInstanceCapacity) {
        if (availableInstanceCapacity == null) {
            this.availableInstanceCapacity = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCapacity> availableInstanceCapacityCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceCapacity>(availableInstanceCapacity.size());
            availableInstanceCapacityCopy.addAll(availableInstanceCapacity);
            this.availableInstanceCapacity = availableInstanceCapacityCopy;
        }

        return this;
    }

    /**
     * The number of vCPUs available on the Dedicated host.
     *
     * @return The number of vCPUs available on the Dedicated host.
     */
    public Integer getAvailableVCpus() {
        return availableVCpus;
    }
    
    /**
     * The number of vCPUs available on the Dedicated host.
     *
     * @param availableVCpus The number of vCPUs available on the Dedicated host.
     */
    public void setAvailableVCpus(Integer availableVCpus) {
        this.availableVCpus = availableVCpus;
    }
    
    /**
     * The number of vCPUs available on the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableVCpus The number of vCPUs available on the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AvailableCapacity withAvailableVCpus(Integer availableVCpus) {
        this.availableVCpus = availableVCpus;
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
        if (getAvailableInstanceCapacity() != null) sb.append("AvailableInstanceCapacity: " + getAvailableInstanceCapacity() + ",");
        if (getAvailableVCpus() != null) sb.append("AvailableVCpus: " + getAvailableVCpus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailableInstanceCapacity() == null) ? 0 : getAvailableInstanceCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getAvailableVCpus() == null) ? 0 : getAvailableVCpus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AvailableCapacity == false) return false;
        AvailableCapacity other = (AvailableCapacity)obj;
        
        if (other.getAvailableInstanceCapacity() == null ^ this.getAvailableInstanceCapacity() == null) return false;
        if (other.getAvailableInstanceCapacity() != null && other.getAvailableInstanceCapacity().equals(this.getAvailableInstanceCapacity()) == false) return false; 
        if (other.getAvailableVCpus() == null ^ this.getAvailableVCpus() == null) return false;
        if (other.getAvailableVCpus() != null && other.getAvailableVCpus().equals(this.getAvailableVCpus()) == false) return false; 
        return true;
    }
    
    @Override
    public AvailableCapacity clone() {
        try {
            return (AvailableCapacity) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    