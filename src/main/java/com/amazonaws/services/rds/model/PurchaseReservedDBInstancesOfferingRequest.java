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
 * 
 *
 * @see com.amazonaws.services.rds.AmazonRDS#purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest)
 */
public class PurchaseReservedDBInstancesOfferingRequest extends AmazonWebServiceRequest {

    private String reservedDBInstancesOfferingId;

    private String reservedDBInstanceId;

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
     * @param reservedDBInstancesOfferingId
     */
    public PurchaseReservedDBInstancesOfferingRequest(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * Returns the value of the ReservedDBInstancesOfferingId property for
     * this object.
     *
     * @return The value of the ReservedDBInstancesOfferingId property for this
     *         object.
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferingId property for this
     * object.
     *
     * @param reservedDBInstancesOfferingId The new value for the ReservedDBInstancesOfferingId property for this
     *         object.
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferingId property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The new value for the ReservedDBInstancesOfferingId property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }
    
    
    /**
     * Returns the value of the ReservedDBInstanceId property for this
     * object.
     *
     * @return The value of the ReservedDBInstanceId property for this object.
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }
    
    /**
     * Sets the value of the ReservedDBInstanceId property for this object.
     *
     * @param reservedDBInstanceId The new value for the ReservedDBInstanceId property for this object.
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }
    
    /**
     * Sets the value of the ReservedDBInstanceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstanceId The new value for the ReservedDBInstanceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PurchaseReservedDBInstancesOfferingRequest withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }
    
    
    /**
     * Returns the value of the DBInstanceCount property for this object.
     *
     * @return The value of the DBInstanceCount property for this object.
     */
    public Integer getDBInstanceCount() {
        return dBInstanceCount;
    }
    
    /**
     * Sets the value of the DBInstanceCount property for this object.
     *
     * @param dBInstanceCount The new value for the DBInstanceCount property for this object.
     */
    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }
    
    /**
     * Sets the value of the DBInstanceCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceCount The new value for the DBInstanceCount property for this object.
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
    