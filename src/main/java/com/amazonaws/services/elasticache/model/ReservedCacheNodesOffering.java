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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Describes all of the attributes of a reserved cache node offering.
 * </p>
 */
public class ReservedCacheNodesOffering implements Serializable {

    /**
     * A unique identifier for the reserved cache node offering.
     */
    private String reservedCacheNodesOfferingId;

    /**
     * The cache node type for the reserved cache node.
     */
    private String cacheNodeType;

    /**
     * The duration of the offering. in seconds.
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
     * The cache engine used by the offering.
     */
    private String productDescription;

    /**
     * The offering type.
     */
    private String offeringType;

    /**
     * The recurring price charged to run this reserved cache node.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringCharges;

    /**
     * A unique identifier for the reserved cache node offering.
     *
     * @return A unique identifier for the reserved cache node offering.
     */
    public String getReservedCacheNodesOfferingId() {
        return reservedCacheNodesOfferingId;
    }
    
    /**
     * A unique identifier for the reserved cache node offering.
     *
     * @param reservedCacheNodesOfferingId A unique identifier for the reserved cache node offering.
     */
    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }
    
    /**
     * A unique identifier for the reserved cache node offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodesOfferingId A unique identifier for the reserved cache node offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
        return this;
    }

    /**
     * The cache node type for the reserved cache node.
     *
     * @return The cache node type for the reserved cache node.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The cache node type for the reserved cache node.
     *
     * @param cacheNodeType The cache node type for the reserved cache node.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The cache node type for the reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The cache node type for the reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * The duration of the offering. in seconds.
     *
     * @return The duration of the offering. in seconds.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The duration of the offering. in seconds.
     *
     * @param duration The duration of the offering. in seconds.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the offering. in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the offering. in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withDuration(Integer duration) {
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
    public ReservedCacheNodesOffering withFixedPrice(Double fixedPrice) {
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
    public ReservedCacheNodesOffering withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * The cache engine used by the offering.
     *
     * @return The cache engine used by the offering.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The cache engine used by the offering.
     *
     * @param productDescription The cache engine used by the offering.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The cache engine used by the offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The cache engine used by the offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The offering type.
     *
     * @return The offering type.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The offering type.
     *
     * @param offeringType The offering type.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The recurring price charged to run this reserved cache node.
     *
     * @return The recurring price charged to run this reserved cache node.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
              recurringCharges = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>();
              recurringCharges.setAutoConstruct(true);
        }
        return recurringCharges;
    }
    
    /**
     * The recurring price charged to run this reserved cache node.
     *
     * @param recurringCharges The recurring price charged to run this reserved cache node.
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringChargesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>(recurringCharges.size());
        recurringChargesCopy.addAll(recurringCharges);
        this.recurringCharges = recurringChargesCopy;
    }
    
    /**
     * The recurring price charged to run this reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring price charged to run this reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        for (RecurringCharge value : recurringCharges) {
            getRecurringCharges().add(value);
        }
        return this;
    }
    
    /**
     * The recurring price charged to run this reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring price charged to run this reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNodesOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringChargesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>(recurringCharges.size());
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
        if (getReservedCacheNodesOfferingId() != null) sb.append("ReservedCacheNodesOfferingId: " + getReservedCacheNodesOfferingId() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null) sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null) sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null) sb.append("RecurringCharges: " + getRecurringCharges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedCacheNodesOfferingId() == null) ? 0 : getReservedCacheNodesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedCacheNodesOffering == false) return false;
        ReservedCacheNodesOffering other = (ReservedCacheNodesOffering)obj;
        
        if (other.getReservedCacheNodesOfferingId() == null ^ this.getReservedCacheNodesOfferingId() == null) return false;
        if (other.getReservedCacheNodesOfferingId() != null && other.getReservedCacheNodesOfferingId().equals(this.getReservedCacheNodesOfferingId()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        return true;
    }
    
}
    