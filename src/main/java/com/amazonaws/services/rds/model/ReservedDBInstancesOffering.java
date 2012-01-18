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
 * DescribeReservedDBInstancesOfferings action.
 * </p>
 */
public class ReservedDBInstancesOffering {

    /**
     * The offering identifier.
     */
    private String reservedDBInstancesOfferingId;

    /**
     * The DB instance class for the reserved DB Instance.
     */
    private String dBInstanceClass;

    /**
     * The duration of the offering in seconds.
     */
    private Integer duration;

    /**
     * The fixed price charged for this offering.
     */
    private Double fixedPrice;

    /**
     * The hourly price charged for this offering.
     */
    private Double usagePrice;

    /**
     * The currency code for the reserved DB Instance offering.
     */
    private String currencyCode;

    /**
     * The database engine used by the offering.
     */
    private String productDescription;

    /**
     * Indicates if the offering applies to Multi-AZ deployments.
     */
    private Boolean multiAZ;

    /**
     * Default constructor for a new ReservedDBInstancesOffering object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ReservedDBInstancesOffering() {}
    
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
    public ReservedDBInstancesOffering withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
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
    public ReservedDBInstancesOffering withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The duration of the offering in seconds.
     *
     * @return The duration of the offering in seconds.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The duration of the offering in seconds.
     *
     * @param duration The duration of the offering in seconds.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the offering in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the offering in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstancesOffering withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * The fixed price charged for this offering.
     *
     * @return The fixed price charged for this offering.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The fixed price charged for this offering.
     *
     * @param fixedPrice The fixed price charged for this offering.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The fixed price charged for this offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The fixed price charged for this offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstancesOffering withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }
    
    
    /**
     * The hourly price charged for this offering.
     *
     * @return The hourly price charged for this offering.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The hourly price charged for this offering.
     *
     * @param usagePrice The hourly price charged for this offering.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The hourly price charged for this offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The hourly price charged for this offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstancesOffering withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }
    
    
    /**
     * The currency code for the reserved DB Instance offering.
     *
     * @return The currency code for the reserved DB Instance offering.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency code for the reserved DB Instance offering.
     *
     * @param currencyCode The currency code for the reserved DB Instance offering.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency code for the reserved DB Instance offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currencyCode The currency code for the reserved DB Instance offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstancesOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    /**
     * The database engine used by the offering.
     *
     * @return The database engine used by the offering.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The database engine used by the offering.
     *
     * @param productDescription The database engine used by the offering.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The database engine used by the offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The database engine used by the offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstancesOffering withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * Indicates if the offering applies to Multi-AZ deployments.
     *
     * @return Indicates if the offering applies to Multi-AZ deployments.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Indicates if the offering applies to Multi-AZ deployments.
     *
     * @param multiAZ Indicates if the offering applies to Multi-AZ deployments.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Indicates if the offering applies to Multi-AZ deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Indicates if the offering applies to Multi-AZ deployments.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedDBInstancesOffering withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Indicates if the offering applies to Multi-AZ deployments.
     *
     * @return Indicates if the offering applies to Multi-AZ deployments.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
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
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (duration != null) sb.append("Duration: " + duration + ", ");
        if (fixedPrice != null) sb.append("FixedPrice: " + fixedPrice + ", ");
        if (usagePrice != null) sb.append("UsagePrice: " + usagePrice + ", ");
        if (currencyCode != null) sb.append("CurrencyCode: " + currencyCode + ", ");
        if (productDescription != null) sb.append("ProductDescription: " + productDescription + ", ");
        if (multiAZ != null) sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferingId() == null) ? 0 : getReservedDBInstancesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ReservedDBInstancesOffering == false) return false;
        ReservedDBInstancesOffering other = (ReservedDBInstancesOffering)obj;
        
        if (other.getReservedDBInstancesOfferingId() == null ^ this.getReservedDBInstancesOfferingId() == null) return false;
        if (other.getReservedDBInstancesOfferingId() != null && other.getReservedDBInstancesOfferingId().equals(this.getReservedDBInstancesOfferingId()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        return true;
    }
    
}
    