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

/**
 * <p>
 * This data type is used as a response element in the
 * DescribeReservedDBInstances and PurchaseReservedDBInstancesOffering
 * actions.
 * </p>
 */
public class ReservedDBInstance {

    /**
     * The unique identifier for the reservation.
     */
    private String reservedDBInstanceId;

    /**
     * The offering identifier.
     */
    private String reservedDBInstancesOfferingId;

    /**
     * The DB instance class for the reserved DB Instance.
     */
    private String dBInstanceClass;

    /**
     * The time the reservation started.
     */
    private java.util.Date startTime;

    /**
     * The duration of the reservation in seconds.
     */
    private Integer duration;

    /**
     * The fixed price charged for this reserved DB Instance.
     */
    private Double fixedPrice;

    /**
     * The hourly price charged for this reserved DB Instance.
     */
    private Double usagePrice;

    /**
     * The currency code for the reserved DB Instance.
     */
    private String currencyCode;

    /**
     * The number of reserved DB Instances.
     */
    private Integer dBInstanceCount;

    /**
     * The description of the reserved DB Instance.
     */
    private String productDescription;

    /**
     * The offering type of this reserved DB Instance.
     */
    private String offeringType;

    /**
     * Indicates if the reservation applies to Multi-AZ deployments.
     */
    private Boolean multiAZ;

    /**
     * The state of the reserved DB Instance.
     */
    private String state;

    /**
     * The recurring price charged to run this reserved DB Instance.
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * The unique identifier for the reservation.
     *
     * @return The unique identifier for the reservation.
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }
    
    /**
     * The unique identifier for the reservation.
     *
     * @param reservedDBInstanceId The unique identifier for the reservation.
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }
    
    /**
     * The unique identifier for the reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstanceId The unique identifier for the reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }
    
    
    /**
     * The offering identifier.
     *
     * @return The offering identifier.
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }
    
    /**
     * The offering identifier.
     *
     * @param reservedDBInstancesOfferingId The offering identifier.
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }
    
    /**
     * The offering identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferingId The offering identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }
    
    
    /**
     * The DB instance class for the reserved DB Instance.
     *
     * @return The DB instance class for the reserved DB Instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The DB instance class for the reserved DB Instance.
     *
     * @param dBInstanceClass The DB instance class for the reserved DB Instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The DB instance class for the reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The DB instance class for the reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The time the reservation started.
     *
     * @return The time the reservation started.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time the reservation started.
     *
     * @param startTime The time the reservation started.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time the reservation started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time the reservation started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }
    
    
    /**
     * The duration of the reservation in seconds.
     *
     * @return The duration of the reservation in seconds.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The duration of the reservation in seconds.
     *
     * @param duration The duration of the reservation in seconds.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the reservation in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the reservation in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * The fixed price charged for this reserved DB Instance.
     *
     * @return The fixed price charged for this reserved DB Instance.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The fixed price charged for this reserved DB Instance.
     *
     * @param fixedPrice The fixed price charged for this reserved DB Instance.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The fixed price charged for this reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The fixed price charged for this reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }
    
    
    /**
     * The hourly price charged for this reserved DB Instance.
     *
     * @return The hourly price charged for this reserved DB Instance.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The hourly price charged for this reserved DB Instance.
     *
     * @param usagePrice The hourly price charged for this reserved DB Instance.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The hourly price charged for this reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The hourly price charged for this reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }
    
    
    /**
     * The currency code for the reserved DB Instance.
     *
     * @return The currency code for the reserved DB Instance.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency code for the reserved DB Instance.
     *
     * @param currencyCode The currency code for the reserved DB Instance.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency code for the reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currencyCode The currency code for the reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    /**
     * The number of reserved DB Instances.
     *
     * @return The number of reserved DB Instances.
     */
    public Integer getDBInstanceCount() {
        return dBInstanceCount;
    }
    
    /**
     * The number of reserved DB Instances.
     *
     * @param dBInstanceCount The number of reserved DB Instances.
     */
    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }
    
    /**
     * The number of reserved DB Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceCount The number of reserved DB Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
        return this;
    }
    
    
    /**
     * The description of the reserved DB Instance.
     *
     * @return The description of the reserved DB Instance.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The description of the reserved DB Instance.
     *
     * @param productDescription The description of the reserved DB Instance.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The description of the reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The description of the reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * The offering type of this reserved DB Instance.
     *
     * @return The offering type of this reserved DB Instance.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The offering type of this reserved DB Instance.
     *
     * @param offeringType The offering type of this reserved DB Instance.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The offering type of this reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The offering type of this reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    
    
    /**
     * Indicates if the reservation applies to Multi-AZ deployments.
     *
     * @return Indicates if the reservation applies to Multi-AZ deployments.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Indicates if the reservation applies to Multi-AZ deployments.
     *
     * @param multiAZ Indicates if the reservation applies to Multi-AZ deployments.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Indicates if the reservation applies to Multi-AZ deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Indicates if the reservation applies to Multi-AZ deployments.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Indicates if the reservation applies to Multi-AZ deployments.
     *
     * @return Indicates if the reservation applies to Multi-AZ deployments.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * The state of the reserved DB Instance.
     *
     * @return The state of the reserved DB Instance.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the reserved DB Instance.
     *
     * @param state The state of the reserved DB Instance.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * The recurring price charged to run this reserved DB Instance.
     *
     * @return The recurring price charged to run this reserved DB Instance.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        
        if (recurringCharges == null) {
            recurringCharges = new java.util.ArrayList<RecurringCharge>();
        }
        return recurringCharges;
    }
    
    /**
     * The recurring price charged to run this reserved DB Instance.
     *
     * @param recurringCharges The recurring price charged to run this reserved DB Instance.
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        java.util.List<RecurringCharge> recurringChargesCopy = new java.util.ArrayList<RecurringCharge>(recurringCharges.size());
        recurringChargesCopy.addAll(recurringCharges);
        this.recurringCharges = recurringChargesCopy;
    }
    
    /**
     * The recurring price charged to run this reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring price charged to run this reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        for (RecurringCharge value : recurringCharges) {
            getRecurringCharges().add(value);
        }
        return this;
    }
    
    /**
     * The recurring price charged to run this reserved DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring price charged to run this reserved DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstance withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
        } else {
            java.util.List<RecurringCharge> recurringChargesCopy = new java.util.ArrayList<RecurringCharge>(recurringCharges.size());
            recurringChargesCopy.addAll(recurringCharges);
            this.recurringCharges = recurringChargesCopy;
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
        if (reservedDBInstanceId != null) sb.append("ReservedDBInstanceId: " + reservedDBInstanceId + ", ");
        if (reservedDBInstancesOfferingId != null) sb.append("ReservedDBInstancesOfferingId: " + reservedDBInstancesOfferingId + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (startTime != null) sb.append("StartTime: " + startTime + ", ");
        if (duration != null) sb.append("Duration: " + duration + ", ");
        if (fixedPrice != null) sb.append("FixedPrice: " + fixedPrice + ", ");
        if (usagePrice != null) sb.append("UsagePrice: " + usagePrice + ", ");
        if (currencyCode != null) sb.append("CurrencyCode: " + currencyCode + ", ");
        if (dBInstanceCount != null) sb.append("DBInstanceCount: " + dBInstanceCount + ", ");
        if (productDescription != null) sb.append("ProductDescription: " + productDescription + ", ");
        if (offeringType != null) sb.append("OfferingType: " + offeringType + ", ");
        if (multiAZ != null) sb.append("MultiAZ: " + multiAZ + ", ");
        if (state != null) sb.append("State: " + state + ", ");
        if (recurringCharges != null) sb.append("RecurringCharges: " + recurringCharges + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceCount() == null) ? 0 : getDBInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ReservedDBInstance == false) return false;
        ReservedDBInstance other = (ReservedDBInstance)obj;
        
        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null) return false;
        if (other.getReservedDBInstanceId() != null && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false) return false; 
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null) return false;
        if (other.getReservedDBInstancesOfferingId() != null && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        if (other.getDBInstanceCount() == null ^ this.getDBInstanceCount() == null) return false;
        if (other.getDBInstanceCount() != null && other.getDBInstanceCount().equals(this.getDBInstanceCount()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        return true;
    }
    
}
    