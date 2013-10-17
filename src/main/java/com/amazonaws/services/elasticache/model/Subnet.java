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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents the subnet associated with a cache cluster. This parameter refers to subnets defined in Amazon Virtual Private Cloud (Amazon VPC) and used
 * with ElastiCache.
 * </p>
 */
public class Subnet implements Serializable {

    /**
     * The unique identifier for the subnet
     */
    private String subnetIdentifier;

    /**
     * The Availability Zone associated with the subnet
     */
    private AvailabilityZone subnetAvailabilityZone;

    /**
     * The unique identifier for the subnet
     *
     * @return The unique identifier for the subnet
     */
    public String getSubnetIdentifier() {
        return subnetIdentifier;
    }
    
    /**
     * The unique identifier for the subnet
     *
     * @param subnetIdentifier The unique identifier for the subnet
     */
    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }
    
    /**
     * The unique identifier for the subnet
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIdentifier The unique identifier for the subnet
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
        return this;
    }

    /**
     * The Availability Zone associated with the subnet
     *
     * @return The Availability Zone associated with the subnet
     */
    public AvailabilityZone getSubnetAvailabilityZone() {
        return subnetAvailabilityZone;
    }
    
    /**
     * The Availability Zone associated with the subnet
     *
     * @param subnetAvailabilityZone The Availability Zone associated with the subnet
     */
    public void setSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }
    
    /**
     * The Availability Zone associated with the subnet
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetAvailabilityZone The Availability Zone associated with the subnet
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
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
        if (getSubnetAvailabilityZone() != null) sb.append("SubnetAvailabilityZone: " + getSubnetAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetIdentifier() == null) ? 0 : getSubnetIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetAvailabilityZone() == null) ? 0 : getSubnetAvailabilityZone().hashCode()); 
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
        return true;
    }
    
}
    