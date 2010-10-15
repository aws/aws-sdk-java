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
 * Reserved D B Instances Offering
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
        sb.append("ReservedDBInstancesOfferingId: " + reservedDBInstancesOfferingId + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Duration: " + duration + ", ");
        sb.append("FixedPrice: " + fixedPrice + ", ");
        sb.append("UsagePrice: " + usagePrice + ", ");
        sb.append("ProductDescription: " + productDescription + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    