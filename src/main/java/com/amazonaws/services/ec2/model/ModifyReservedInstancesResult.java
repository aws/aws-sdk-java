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
 * The result of modifying Reserved Instances. Contains the ID of the modification request.
 * </p>
 */
public class ModifyReservedInstancesResult implements Serializable {

    /**
     * The unique ID for the submitted modification request.
     */
    private String reservedInstancesModificationId;

    /**
     * The unique ID for the submitted modification request.
     *
     * @return The unique ID for the submitted modification request.
     */
    public String getReservedInstancesModificationId() {
        return reservedInstancesModificationId;
    }
    
    /**
     * The unique ID for the submitted modification request.
     *
     * @param reservedInstancesModificationId The unique ID for the submitted modification request.
     */
    public void setReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
    }
    
    /**
     * The unique ID for the submitted modification request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesModificationId The unique ID for the submitted modification request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyReservedInstancesResult withReservedInstancesModificationId(String reservedInstancesModificationId) {
        this.reservedInstancesModificationId = reservedInstancesModificationId;
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
        if (getReservedInstancesModificationId() != null) sb.append("ReservedInstancesModificationId: " + getReservedInstancesModificationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesModificationId() == null) ? 0 : getReservedInstancesModificationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyReservedInstancesResult == false) return false;
        ModifyReservedInstancesResult other = (ModifyReservedInstancesResult)obj;
        
        if (other.getReservedInstancesModificationId() == null ^ this.getReservedInstancesModificationId() == null) return false;
        if (other.getReservedInstancesModificationId() != null && other.getReservedInstancesModificationId().equals(this.getReservedInstancesModificationId()) == false) return false; 
        return true;
    }
    
}
    