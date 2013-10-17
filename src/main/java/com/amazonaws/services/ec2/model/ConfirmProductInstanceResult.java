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
 * The result of calling the ConfirmProductInstance operation.
 * </p>
 */
public class ConfirmProductInstanceResult implements Serializable {

    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     */
    private String ownerId;

    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     *
     * @return The instance owner's account ID. Only present if the product code is
     *         attached to the instance.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     *
     * @param ownerId The instance owner's account ID. Only present if the product code is
     *         attached to the instance.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The instance owner's account ID. Only present if the product code is
     *         attached to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfirmProductInstanceResult withOwnerId(String ownerId) {
        this.ownerId = ownerId;
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
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfirmProductInstanceResult == false) return false;
        ConfirmProductInstanceResult other = (ConfirmProductInstanceResult)obj;
        
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        return true;
    }
    
}
    