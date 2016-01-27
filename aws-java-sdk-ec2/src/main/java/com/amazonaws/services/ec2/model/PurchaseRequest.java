/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a request to purchase Scheduled Instances.
 * </p>
 */
public class PurchaseRequest implements Serializable, Cloneable {

    /**
     * The purchase token.
     */
    private String purchaseToken;

    /**
     * The number of instances.
     */
    private Integer instanceCount;

    /**
     * The purchase token.
     *
     * @return The purchase token.
     */
    public String getPurchaseToken() {
        return purchaseToken;
    }
    
    /**
     * The purchase token.
     *
     * @param purchaseToken The purchase token.
     */
    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }
    
    /**
     * The purchase token.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param purchaseToken The purchase token.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseRequest withPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
        return this;
    }

    /**
     * The number of instances.
     *
     * @return The number of instances.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of instances.
     *
     * @param instanceCount The number of instances.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PurchaseRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        if (getPurchaseToken() != null) sb.append("PurchaseToken: " + getPurchaseToken() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPurchaseToken() == null) ? 0 : getPurchaseToken().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurchaseRequest == false) return false;
        PurchaseRequest other = (PurchaseRequest)obj;
        
        if (other.getPurchaseToken() == null ^ this.getPurchaseToken() == null) return false;
        if (other.getPurchaseToken() != null && other.getPurchaseToken().equals(this.getPurchaseToken()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        return true;
    }
    
    @Override
    public PurchaseRequest clone() {
        try {
            return (PurchaseRequest) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    