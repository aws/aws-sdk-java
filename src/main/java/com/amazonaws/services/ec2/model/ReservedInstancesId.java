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
 * Reserved Instances Id
 */
public class ReservedInstancesId implements Serializable {

    private String reservedInstancesId;

    /**
     * Returns the value of the ReservedInstancesId property for this object.
     *
     * @return The value of the ReservedInstancesId property for this object.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * Sets the value of the ReservedInstancesId property for this object.
     *
     * @param reservedInstancesId The new value for the ReservedInstancesId property for this object.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * Sets the value of the ReservedInstancesId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The new value for the ReservedInstancesId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesId withReservedInstancesId(String reservedInstancesId) {
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

        if (obj instanceof ReservedInstancesId == false) return false;
        ReservedInstancesId other = (ReservedInstancesId)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        return true;
    }
    
}
    