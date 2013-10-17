/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the capacity that a license is able to support.
 * </p>
 */
public class LicenseCapacity implements Serializable {

    /**
     * The number of licenses available.
     */
    private Integer capacity;

    /**
     * The number of Amazon EC2 instances that can be supported with the
     * license's capacity.
     */
    private Integer instanceCapacity;

    /**
     * The state of this license capacity, indicating whether the license is
     * actively being used or not.
     */
    private String state;

    /**
     * The earliest allowed time at which a license can be deactivated. Some
     * licenses have time restrictions on when they can be activated and
     * reactivated.
     */
    private java.util.Date earliestAllowedDeactivationTime;

    /**
     * The number of licenses available.
     *
     * @return The number of licenses available.
     */
    public Integer getCapacity() {
        return capacity;
    }
    
    /**
     * The number of licenses available.
     *
     * @param capacity The number of licenses available.
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    
    /**
     * The number of licenses available.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacity The number of licenses available.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LicenseCapacity withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * The number of Amazon EC2 instances that can be supported with the
     * license's capacity.
     *
     * @return The number of Amazon EC2 instances that can be supported with the
     *         license's capacity.
     */
    public Integer getInstanceCapacity() {
        return instanceCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that can be supported with the
     * license's capacity.
     *
     * @param instanceCapacity The number of Amazon EC2 instances that can be supported with the
     *         license's capacity.
     */
    public void setInstanceCapacity(Integer instanceCapacity) {
        this.instanceCapacity = instanceCapacity;
    }
    
    /**
     * The number of Amazon EC2 instances that can be supported with the
     * license's capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCapacity The number of Amazon EC2 instances that can be supported with the
     *         license's capacity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LicenseCapacity withInstanceCapacity(Integer instanceCapacity) {
        this.instanceCapacity = instanceCapacity;
        return this;
    }

    /**
     * The state of this license capacity, indicating whether the license is
     * actively being used or not.
     *
     * @return The state of this license capacity, indicating whether the license is
     *         actively being used or not.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of this license capacity, indicating whether the license is
     * actively being used or not.
     *
     * @param state The state of this license capacity, indicating whether the license is
     *         actively being used or not.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of this license capacity, indicating whether the license is
     * actively being used or not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of this license capacity, indicating whether the license is
     *         actively being used or not.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LicenseCapacity withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The earliest allowed time at which a license can be deactivated. Some
     * licenses have time restrictions on when they can be activated and
     * reactivated.
     *
     * @return The earliest allowed time at which a license can be deactivated. Some
     *         licenses have time restrictions on when they can be activated and
     *         reactivated.
     */
    public java.util.Date getEarliestAllowedDeactivationTime() {
        return earliestAllowedDeactivationTime;
    }
    
    /**
     * The earliest allowed time at which a license can be deactivated. Some
     * licenses have time restrictions on when they can be activated and
     * reactivated.
     *
     * @param earliestAllowedDeactivationTime The earliest allowed time at which a license can be deactivated. Some
     *         licenses have time restrictions on when they can be activated and
     *         reactivated.
     */
    public void setEarliestAllowedDeactivationTime(java.util.Date earliestAllowedDeactivationTime) {
        this.earliestAllowedDeactivationTime = earliestAllowedDeactivationTime;
    }
    
    /**
     * The earliest allowed time at which a license can be deactivated. Some
     * licenses have time restrictions on when they can be activated and
     * reactivated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param earliestAllowedDeactivationTime The earliest allowed time at which a license can be deactivated. Some
     *         licenses have time restrictions on when they can be activated and
     *         reactivated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LicenseCapacity withEarliestAllowedDeactivationTime(java.util.Date earliestAllowedDeactivationTime) {
        this.earliestAllowedDeactivationTime = earliestAllowedDeactivationTime;
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
        if (getCapacity() != null) sb.append("Capacity: " + getCapacity() + ",");
        if (getInstanceCapacity() != null) sb.append("InstanceCapacity: " + getInstanceCapacity() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getEarliestAllowedDeactivationTime() != null) sb.append("EarliestAllowedDeactivationTime: " + getEarliestAllowedDeactivationTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCapacity() == null) ? 0 : getInstanceCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getEarliestAllowedDeactivationTime() == null) ? 0 : getEarliestAllowedDeactivationTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LicenseCapacity == false) return false;
        LicenseCapacity other = (LicenseCapacity)obj;
        
        if (other.getCapacity() == null ^ this.getCapacity() == null) return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false) return false; 
        if (other.getInstanceCapacity() == null ^ this.getInstanceCapacity() == null) return false;
        if (other.getInstanceCapacity() != null && other.getInstanceCapacity().equals(this.getInstanceCapacity()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getEarliestAllowedDeactivationTime() == null ^ this.getEarliestAllowedDeactivationTime() == null) return false;
        if (other.getEarliestAllowedDeactivationTime() != null && other.getEarliestAllowedDeactivationTime().equals(this.getEarliestAllowedDeactivationTime()) == false) return false; 
        return true;
    }
    
}
    