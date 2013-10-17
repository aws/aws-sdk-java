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
 * The result of purchasing a Reserved Instances offering. Contains the new, unique ID of the Reserved Instances purchased for your account.
 * </p>
 */
public class PurchaseReservedInstancesOfferingResult implements Serializable {

    /**
     * The unique ID of the Reserved Instances purchased for your account.
     */
    private String reservedInstancesId;

    /**
     * The unique ID of the Reserved Instances purchased for your account.
     *
     * @return The unique ID of the Reserved Instances purchased for your account.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * The unique ID of the Reserved Instances purchased for your account.
     *
     * @param reservedInstancesId The unique ID of the Reserved Instances purchased for your account.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * The unique ID of the Reserved Instances purchased for your account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The unique ID of the Reserved Instances purchased for your account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedInstancesOfferingResult withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurchaseReservedInstancesOfferingResult == false) return false;
        PurchaseReservedInstancesOfferingResult other = (PurchaseReservedInstancesOfferingResult)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        return true;
    }
    
}
    