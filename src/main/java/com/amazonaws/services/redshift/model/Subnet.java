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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a subnet.
 * </p>
 */
public class Subnet implements Serializable {

    /**
     * The identifier of the subnet.
     */
    private String subnetIdentifier;

    /**
     * Describes an availability zone.
     */
    private AvailabilityZone subnetAvailabilityZone;

    /**
     * The status of the subnet.
     */
    private String subnetStatus;

    /**
     * The identifier of the subnet.
     *
     * @return The identifier of the subnet.
     */
    public String getSubnetIdentifier() {
        return subnetIdentifier;
    }
    
    /**
     * The identifier of the subnet.
     *
     * @param subnetIdentifier The identifier of the subnet.
     */
    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }
    
    /**
     * The identifier of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIdentifier The identifier of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
        return this;
    }

    /**
     * Describes an availability zone.
     *
     * @return Describes an availability zone.
     */
    public AvailabilityZone getSubnetAvailabilityZone() {
        return subnetAvailabilityZone;
    }
    
    /**
     * Describes an availability zone.
     *
     * @param subnetAvailabilityZone Describes an availability zone.
     */
    public void setSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }
    
    /**
     * Describes an availability zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetAvailabilityZone Describes an availability zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
        return this;
    }

    /**
     * The status of the subnet.
     *
     * @return The status of the subnet.
     */
    public String getSubnetStatus() {
        return subnetStatus;
    }
    
    /**
     * The status of the subnet.
     *
     * @param subnetStatus The status of the subnet.
     */
    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }
    
    /**
     * The status of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetStatus The status of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
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
        if (getSubnetIdentifier() != null) sb.append("SubnetIdentifier: " + getSubnetIdentifier() + ",");
        if (getSubnetAvailabilityZone() != null) sb.append("SubnetAvailabilityZone: " + getSubnetAvailabilityZone() + ",");
        if (getSubnetStatus() != null) sb.append("SubnetStatus: " + getSubnetStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetIdentifier() == null) ? 0 : getSubnetIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetStatus() == null) ? 0 : getSubnetStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Subnet == false) return false;
        Subnet other = (Subnet)obj;
        
        if (other.getSubnetIdentifier() == null ^ this.getSubnetIdentifier() == null) return false;
        if (other.getSubnetIdentifier() != null && other.getSubnetIdentifier().equals(this.getSubnetIdentifier()) == false) return false; 
        if (other.getSubnetAvailabilityZone() == null ^ this.getSubnetAvailabilityZone() == null) return false;
        if (other.getSubnetAvailabilityZone() != null && other.getSubnetAvailabilityZone().equals(this.getSubnetAvailabilityZone()) == false) return false; 
        if (other.getSubnetStatus() == null ^ this.getSubnetStatus() == null) return false;
        if (other.getSubnetStatus() != null && other.getSubnetStatus().equals(this.getSubnetStatus()) == false) return false; 
        return true;
    }
    
}
    