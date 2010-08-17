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

/**
 * Reserved D B Instance
 */
public class ReservedDBInstance {

    private String reservedDBInstanceId;

    private String reservedDBInstancesOfferingId;

    private String dBInstanceClass;

    private java.util.Date startTime;

    private Integer duration;

    private Double fixedPrice;

    private Double usagePrice;

    private Integer dBInstanceCount;

    private String productDescription;

    private Boolean multiAZ;

    private String state;

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
    public ReservedDBInstance withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
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
    public ReservedDBInstance withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }
    
    
    /**
     * Returns the value of the DBInstanceClass property for this object.
     *
     * @return The value of the DBInstanceClass property for this object.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Sets the value of the DBInstanceClass property for this object.
     *
     * @param dBInstanceClass The new value for the DBInstanceClass property for this object.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Sets the value of the DBInstanceClass property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The new value for the DBInstanceClass property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * Returns the value of the StartTime property for this object.
     *
     * @return The value of the StartTime property for this object.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Sets the value of the StartTime property for this object.
     *
     * @param startTime The new value for the StartTime property for this object.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Sets the value of the StartTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The new value for the StartTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }
    
    
    /**
     * Returns the value of the Duration property for this object.
     *
     * @return The value of the Duration property for this object.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * Sets the value of the Duration property for this object.
     *
     * @param duration The new value for the Duration property for this object.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * Sets the value of the Duration property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The new value for the Duration property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * Returns the value of the FixedPrice property for this object.
     *
     * @return The value of the FixedPrice property for this object.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * Sets the value of the FixedPrice property for this object.
     *
     * @param fixedPrice The new value for the FixedPrice property for this object.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * Sets the value of the FixedPrice property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The new value for the FixedPrice property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }
    
    
    /**
     * Returns the value of the UsagePrice property for this object.
     *
     * @return The value of the UsagePrice property for this object.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * Sets the value of the UsagePrice property for this object.
     *
     * @param usagePrice The new value for the UsagePrice property for this object.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * Sets the value of the UsagePrice property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The new value for the UsagePrice property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
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
    public ReservedDBInstance withDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
        return this;
    }
    
    
    /**
     * Returns the value of the ProductDescription property for this object.
     *
     * @return The value of the ProductDescription property for this object.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * Returns the value of the MultiAZ property for this object.
     *
     * @return The value of the MultiAZ property for this object.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Sets the value of the MultiAZ property for this object.
     *
     * @param multiAZ The new value for the MultiAZ property for this object.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Sets the value of the MultiAZ property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ The new value for the MultiAZ property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Returns the value of the MultiAZ property for this object.
     *
     * @return The value of the MultiAZ property for this object.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Returns the value of the State property for this object.
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withState(String state) {
        this.state = state;
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
        sb.append("ReservedDBInstanceId: " + reservedDBInstanceId + ", ");
        sb.append("ReservedDBInstancesOfferingId: " + reservedDBInstancesOfferingId + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("Duration: " + duration + ", ");
        sb.append("FixedPrice: " + fixedPrice + ", ");
        sb.append("UsagePrice: " + usagePrice + ", ");
        sb.append("DBInstanceCount: " + dBInstanceCount + ", ");
        sb.append("ProductDescription: " + productDescription + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("State: " + state + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    