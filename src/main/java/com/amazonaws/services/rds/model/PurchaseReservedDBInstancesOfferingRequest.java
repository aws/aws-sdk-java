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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest) PurchaseReservedDBInstancesOffering operation}.
 * <p>
 * Purchases a reserved DB instance offering.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest)
 */
public class PurchaseReservedDBInstancesOfferingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the Reserved DB instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    private String reservedDBInstancesOfferingId;

    /**
     * Customer-specified identifier to track this reservation. <p>Example:
     * myreservationID
     */
    private String reservedDBInstanceId;

    /**
     * The number of instances to reserve. <p>Default: <code>1</code>
     */
    private Integer dBInstanceCount;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Default constructor for a new PurchaseReservedDBInstancesOfferingRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PurchaseReservedDBInstancesOfferingRequest() {}
    
    /**
     * Constructs a new PurchaseReservedDBInstancesOfferingRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB
     * instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public PurchaseReservedDBInstancesOfferingRequest(String reservedDBInstancesOfferingId) {
        setReservedDBInstancesOfferingId(reservedDBInstancesOfferingId);
    }

    /**
     * The ID of the Reserved DB instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *
     * @return The ID of the Reserved DB instance offering to purchase. <p>Example:
     *         438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB instance offering to purchase. <p>Example:
     *         438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB instance offering to purchase. <p>Example:
     *         438012d3-4052-4cc7-b2e3-8d3372e0e706
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }

    /**
     * Customer-specified identifier to track this reservation. <p>Example:
     * myreservationID
     *
     * @return Customer-specified identifier to track this reservation. <p>Example:
     *         myreservationID
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }
    
    /**
     * Customer-specified identifier to track this reservation. <p>Example:
     * myreservationID
     *
     * @param reservedDBInstanceId Customer-specified identifier to track this reservation. <p>Example:
     *         myreservationID
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }
    
    /**
     * Customer-specified identifier to track this reservation. <p>Example:
     * myreservationID
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstanceId Customer-specified identifier to track this reservation. <p>Example:
     *         myreservationID
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }

    /**
     * The number of instances to reserve. <p>Default: <code>1</code>
     *
     * @return The number of instances to reserve. <p>Default: <code>1</code>
     */
    public Integer getDBInstanceCount() {
        return dBInstanceCount;
    }
    
    /**
     * The number of instances to reserve. <p>Default: <code>1</code>
     *
     * @param dBInstanceCount The number of instances to reserve. <p>Default: <code>1</code>
     */
    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }
    
    /**
     * The number of instances to reserve. <p>Default: <code>1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceCount The number of instances to reserve. <p>Default: <code>1</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedDBInstancesOfferingRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getReservedDBInstancesOfferingId() != null) sb.append("ReservedDBInstancesOfferingId: " + getReservedDBInstancesOfferingId() + ",");
        if (getReservedDBInstanceId() != null) sb.append("ReservedDBInstanceId: " + getReservedDBInstanceId() + ",");
        if (getDBInstanceCount() != null) sb.append("DBInstanceCount: " + getDBInstanceCount() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceCount() == null) ? 0 : getDBInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurchaseReservedDBInstancesOfferingRequest == false) return false;
        PurchaseReservedDBInstancesOfferingRequest other = (PurchaseReservedDBInstancesOfferingRequest)obj;
        
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null) return false;
        if (other.getReservedDBInstancesOfferingId() != null && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false) return false; 
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null) return false;
        if (other.getReservedDBInstanceId() != null && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false) return false; 
        if (other.getDBInstanceCount() == null ^ this.getDBInstanceCount() == null) return false;
        if (other.getDBInstanceCount() != null && other.getDBInstanceCount().equals(this.getDBInstanceCount()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    