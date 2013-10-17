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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * This data type is used as a response element in the DescribeDBSubnetGroups action.
 * </p>
 */
public class Subnet implements Serializable {

    /**
     * Specifies the identifier of the subnet.
     */
    private String subnetIdentifier;

    /**
     * Contains Availability Zone information. <p> This data type is used as
     * an element in the following data type: <ul>
     * <li><a>OrderableDBInstanceOption</a></li> </ul>
     */
    private AvailabilityZone subnetAvailabilityZone;

    /**
     * Specifies the status of the subnet.
     */
    private String subnetStatus;

    /**
     * Specifies the identifier of the subnet.
     *
     * @return Specifies the identifier of the subnet.
     */
    public String getSubnetIdentifier() {
        return subnetIdentifier;
    }
    
    /**
     * Specifies the identifier of the subnet.
     *
     * @param subnetIdentifier Specifies the identifier of the subnet.
     */
    public void setSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
    }
    
    /**
     * Specifies the identifier of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIdentifier Specifies the identifier of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetIdentifier(String subnetIdentifier) {
        this.subnetIdentifier = subnetIdentifier;
        return this;
    }

    /**
     * Contains Availability Zone information. <p> This data type is used as
     * an element in the following data type: <ul>
     * <li><a>OrderableDBInstanceOption</a></li> </ul>
     *
     * @return Contains Availability Zone information. <p> This data type is used as
     *         an element in the following data type: <ul>
     *         <li><a>OrderableDBInstanceOption</a></li> </ul>
     */
    public AvailabilityZone getSubnetAvailabilityZone() {
        return subnetAvailabilityZone;
    }
    
    /**
     * Contains Availability Zone information. <p> This data type is used as
     * an element in the following data type: <ul>
     * <li><a>OrderableDBInstanceOption</a></li> </ul>
     *
     * @param subnetAvailabilityZone Contains Availability Zone information. <p> This data type is used as
     *         an element in the following data type: <ul>
     *         <li><a>OrderableDBInstanceOption</a></li> </ul>
     */
    public void setSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
    }
    
    /**
     * Contains Availability Zone information. <p> This data type is used as
     * an element in the following data type: <ul>
     * <li><a>OrderableDBInstanceOption</a></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetAvailabilityZone Contains Availability Zone information. <p> This data type is used as
     *         an element in the following data type: <ul>
     *         <li><a>OrderableDBInstanceOption</a></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetAvailabilityZone(AvailabilityZone subnetAvailabilityZone) {
        this.subnetAvailabilityZone = subnetAvailabilityZone;
        return this;
    }

    /**
     * Specifies the status of the subnet.
     *
     * @return Specifies the status of the subnet.
     */
    public String getSubnetStatus() {
        return subnetStatus;
    }
    
    /**
     * Specifies the status of the subnet.
     *
     * @param subnetStatus Specifies the status of the subnet.
     */
    public void setSubnetStatus(String subnetStatus) {
        this.subnetStatus = subnetStatus;
    }
    
    /**
     * Specifies the status of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetStatus Specifies the status of the subnet.
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
    