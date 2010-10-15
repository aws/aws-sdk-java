/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The ID of the Reserved DB Instance offering to purchase.
     */
    private String reservedDBInstancesOfferingId;

    /**
     * Customer-specified identifier to track this reservation.
     */
    private String reservedDBInstanceId;

    /**
     * The number of instances to reserve.
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
     * Instance offering to purchase.
     */
    public PurchaseReservedDBInstancesOfferingRequest(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB Instance offering to purchase.
     *
     * @return The ID of the Reserved DB Instance offering to purchase.
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB Instance offering to purchase.
     *
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB Instance offering to purchase.
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved DB Instance offering to purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The ID of the Reserved DB Instance offering to purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }
    
    
    /**
     * Customer-specified identifier to track this reservation.
     *
     * @return Customer-specified identifier to track this reservation.
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }
    
    /**
     * Customer-specified identifier to track this reservation.
     *
     * @param reservedDBInstanceId Customer-specified identifier to track this reservation.
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }
    
    /**
     * Customer-specified identifier to track this reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstanceId Customer-specified identifier to track this reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }
    
    
    /**
     * The number of instances to reserve.
     *
     * @return The number of instances to reserve.
     */
    public Integer getDBInstanceCount() {
        return dBInstanceCount;
    }
    
    /**
     * The number of instances to reserve.
     *
     * @param dBInstanceCount The number of instances to reserve.
     */
    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }
    
    /**
     * The number of instances to reserve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceCount The number of instances to reserve.
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
        sb.append("ReservedDBInstancesOfferingId: " + reservedDBInstancesOfferingId + ", ");
        sb.append("ReservedDBInstanceId: " + reservedDBInstanceId + ", ");
        sb.append("DBInstanceCount: " + dBInstanceCount + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    