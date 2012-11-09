/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * Contains Availability Zone information.
 * </p>
 * <p>
 * This data type is used as an element in the following data type:
 * <ul>
 * <li> OrderableDBInstanceOption </li>
 * 
 * </ul>
 * 
 * </p>
 */
public class AvailabilityZone {

    /**
     * The name of the availability zone.
     */
    private String name;

    private Boolean provisionedIopsCapable;

    /**
     * The name of the availability zone.
     *
     * @return The name of the availability zone.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the availability zone.
     *
     * @param name The name of the availability zone.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the availability zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the availability zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AvailabilityZone withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the ProvisionedIopsCapable property for this
     * object.
     *
     * @return The value of the ProvisionedIopsCapable property for this object.
     */
    public Boolean isProvisionedIopsCapable() {
        return provisionedIopsCapable;
    }
    
    /**
     * Sets the value of the ProvisionedIopsCapable property for this object.
     *
     * @param provisionedIopsCapable The new value for the ProvisionedIopsCapable property for this object.
     */
    public void setProvisionedIopsCapable(Boolean provisionedIopsCapable) {
        this.provisionedIopsCapable = provisionedIopsCapable;
    }
    
    /**
     * Sets the value of the ProvisionedIopsCapable property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedIopsCapable The new value for the ProvisionedIopsCapable property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AvailabilityZone withProvisionedIopsCapable(Boolean provisionedIopsCapable) {
        this.provisionedIopsCapable = provisionedIopsCapable;
        return this;
    }
    
    
    /**
     * Returns the value of the ProvisionedIopsCapable property for this
     * object.
     *
     * @return The value of the ProvisionedIopsCapable property for this object.
     */
    public Boolean getProvisionedIopsCapable() {
        return provisionedIopsCapable;
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
        if (name != null) sb.append("Name: " + name + ", ");
        if (provisionedIopsCapable != null) sb.append("ProvisionedIopsCapable: " + provisionedIopsCapable + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((isProvisionedIopsCapable() == null) ? 0 : isProvisionedIopsCapable().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof AvailabilityZone == false) return false;
        AvailabilityZone other = (AvailabilityZone)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.isProvisionedIopsCapable() == null ^ this.isProvisionedIopsCapable() == null) return false;
        if (other.isProvisionedIopsCapable() != null && other.isProvisionedIopsCapable().equals(this.isProvisionedIopsCapable()) == false) return false; 
        return true;
    }
    
}
    