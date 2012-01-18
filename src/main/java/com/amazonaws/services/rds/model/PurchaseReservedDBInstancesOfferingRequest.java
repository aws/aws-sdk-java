/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest) PurchaseReservedDBInstancesOffering operation}.
 * <p>
 * Purchases a reserved DB Instance offering.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest)
 */
public class PurchaseReservedDBInstancesOfferingRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the Reserved DB Instance offering to purchase. <p>Example:
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
     * Instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public PurchaseReservedDBInstancesOfferingRequest(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    
    
    /**
     * The ID of the Reserved DB Instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *
     * @return The ID of the Reserved DB Instance offering to purchase. <p>Example:
     *         438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB Instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     *
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB Instance offering to purchase. <p>Example:
     *         438012d3-4052-4cc7-b2e3-8d3372e0e706
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB Instance offering to purchase. <p>Example:
     * 438012d3-4052-4cc7-b2e3-8d3372e0e706
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB Instance offering to purchase. <p>Example:
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
        if (reservedDBInstancesOfferingId != null) sb.append("ReservedDBInstancesOfferingId: " + reservedDBInstancesOfferingId + ", ");
        if (reservedDBInstanceId != null) sb.append("ReservedDBInstanceId: " + reservedDBInstanceId + ", ");
        if (dBInstanceCount != null) sb.append("DBInstanceCount: " + dBInstanceCount + ", ");
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
        return true;
    }
    
}
    