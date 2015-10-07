/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The number of AWS resources or AWS Config rules responsible for the
 * current compliance of the item, up to a maximum number.
 * </p>
 */
public class ComplianceContributorCount implements Serializable, Cloneable {

    /**
     * The number of AWS resources or AWS Config rules responsible for the
     * current compliance of the item.
     */
    private Integer cappedCount;

    /**
     * Indicates whether the maximum count is reached.
     */
    private Boolean capExceeded;

    /**
     * The number of AWS resources or AWS Config rules responsible for the
     * current compliance of the item.
     *
     * @return The number of AWS resources or AWS Config rules responsible for the
     *         current compliance of the item.
     */
    public Integer getCappedCount() {
        return cappedCount;
    }
    
    /**
     * The number of AWS resources or AWS Config rules responsible for the
     * current compliance of the item.
     *
     * @param cappedCount The number of AWS resources or AWS Config rules responsible for the
     *         current compliance of the item.
     */
    public void setCappedCount(Integer cappedCount) {
        this.cappedCount = cappedCount;
    }
    
    /**
     * The number of AWS resources or AWS Config rules responsible for the
     * current compliance of the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cappedCount The number of AWS resources or AWS Config rules responsible for the
     *         current compliance of the item.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceContributorCount withCappedCount(Integer cappedCount) {
        this.cappedCount = cappedCount;
        return this;
    }

    /**
     * Indicates whether the maximum count is reached.
     *
     * @return Indicates whether the maximum count is reached.
     */
    public Boolean isCapExceeded() {
        return capExceeded;
    }
    
    /**
     * Indicates whether the maximum count is reached.
     *
     * @param capExceeded Indicates whether the maximum count is reached.
     */
    public void setCapExceeded(Boolean capExceeded) {
        this.capExceeded = capExceeded;
    }
    
    /**
     * Indicates whether the maximum count is reached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capExceeded Indicates whether the maximum count is reached.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceContributorCount withCapExceeded(Boolean capExceeded) {
        this.capExceeded = capExceeded;
        return this;
    }

    /**
     * Indicates whether the maximum count is reached.
     *
     * @return Indicates whether the maximum count is reached.
     */
    public Boolean getCapExceeded() {
        return capExceeded;
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
        if (getCappedCount() != null) sb.append("CappedCount: " + getCappedCount() + ",");
        if (isCapExceeded() != null) sb.append("CapExceeded: " + isCapExceeded() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCappedCount() == null) ? 0 : getCappedCount().hashCode()); 
        hashCode = prime * hashCode + ((isCapExceeded() == null) ? 0 : isCapExceeded().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ComplianceContributorCount == false) return false;
        ComplianceContributorCount other = (ComplianceContributorCount)obj;
        
        if (other.getCappedCount() == null ^ this.getCappedCount() == null) return false;
        if (other.getCappedCount() != null && other.getCappedCount().equals(this.getCappedCount()) == false) return false; 
        if (other.isCapExceeded() == null ^ this.isCapExceeded() == null) return false;
        if (other.isCapExceeded() != null && other.isCapExceeded().equals(this.isCapExceeded()) == false) return false; 
        return true;
    }
    
    @Override
    public ComplianceContributorCount clone() {
        try {
            return (ComplianceContributorCount) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    