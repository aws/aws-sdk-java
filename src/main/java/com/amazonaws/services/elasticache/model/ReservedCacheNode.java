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
 * Represents the output of a <i>PurchaseReservedCacheNodesOffering</i> operation.
 * </p>
 */
public class ReservedCacheNode implements Serializable {

    /**
     * The unique identifier for the reservation.
     */
    private String reservedCacheNodeId;

    /**
     * The offering identifier.
     */
    private String reservedCacheNodesOfferingId;

    /**
     * The cache node type for the reserved cache nodes.
     */
    private String cacheNodeType;

    /**
     * The time the reservation started.
     */
    private java.util.Date startTime;

    /**
     * The duration of the reservation in seconds.
     */
    private Integer duration;

    /**
     * The fixed price charged for this reserved cache node.
     */
    private Double fixedPrice;

    /**
     * The hourly price charged for this reserved cache node.
     */
    private Double usagePrice;

    /**
     * The number of cache nodes that have been reserved.
     */
    private Integer cacheNodeCount;

    /**
     * The description of the reserved cache node.
     */
    private String productDescription;

    /**
     * The offering type of this reserved cache node.
     */
    private String offeringType;

    /**
     * The state of the reserved cache node.
     */
    private String state;

    /**
     * The recurring price charged to run this reserved cache node.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringCharges;

    /**
     * The unique identifier for the reservation.
     *
     * @return The unique identifier for the reservation.
     */
    public String getReservedCacheNodeId() {
        return reservedCacheNodeId;
    }
    
    /**
     * The unique identifier for the reservation.
     *
     * @param reservedCacheNodeId The unique identifier for the reservation.
     */
    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }
    
    /**
     * The unique identifier for the reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodeId The unique identifier for the reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
        return this;
    }

    /**
     * The offering identifier.
     *
     * @return The offering identifier.
     */
    public String getReservedCacheNodesOfferingId() {
        return reservedCacheNodesOfferingId;
    }
    
    /**
     * The offering identifier.
     *
     * @param reservedCacheNodesOfferingId The offering identifier.
     */
    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }
    
    /**
     * The offering identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodesOfferingId The offering identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
        return this;
    }

    /**
     * The cache node type for the reserved cache nodes.
     *
     * @return The cache node type for the reserved cache nodes.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The cache node type for the reserved cache nodes.
     *
     * @param cacheNodeType The cache node type for the reserved cache nodes.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The cache node type for the reserved cache nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The cache node type for the reserved cache nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
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
    public ReservedCacheNode withStartTime(java.util.Date startTime) {
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
    public ReservedCacheNode withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The fixed price charged for this reserved cache node.
     *
     * @return The fixed price charged for this reserved cache node.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The fixed price charged for this reserved cache node.
     *
     * @param fixedPrice The fixed price charged for this reserved cache node.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The fixed price charged for this reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The fixed price charged for this reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * The hourly price charged for this reserved cache node.
     *
     * @return The hourly price charged for this reserved cache node.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The hourly price charged for this reserved cache node.
     *
     * @param usagePrice The hourly price charged for this reserved cache node.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The hourly price charged for this reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The hourly price charged for this reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * The number of cache nodes that have been reserved.
     *
     * @return The number of cache nodes that have been reserved.
     */
    public Integer getCacheNodeCount() {
        return cacheNodeCount;
    }
    
    /**
     * The number of cache nodes that have been reserved.
     *
     * @param cacheNodeCount The number of cache nodes that have been reserved.
     */
    public void setCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
    }
    
    /**
     * The number of cache nodes that have been reserved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeCount The number of cache nodes that have been reserved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
        return this;
    }

    /**
     * The description of the reserved cache node.
     *
     * @return The description of the reserved cache node.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The description of the reserved cache node.
     *
     * @param productDescription The description of the reserved cache node.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The description of the reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The description of the reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The offering type of this reserved cache node.
     *
     * @return The offering type of this reserved cache node.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The offering type of this reserved cache node.
     *
     * @param offeringType The offering type of this reserved cache node.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The offering type of this reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The offering type of this reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The state of the reserved cache node.
     *
     * @return The state of the reserved cache node.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the reserved cache node.
     *
     * @param state The state of the reserved cache node.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the reserved cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the reserved cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedCacheNode withState(String state) {
        this.state = state;
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
    public ReservedCacheNode withRecurringCharges(RecurringCharge... recurringCharges) {
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
    public ReservedCacheNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
        if (getReservedCacheNodeId() != null) sb.append("ReservedCacheNodeId: " + getReservedCacheNodeId() + ",");
        if (getReservedCacheNodesOfferingId() != null) sb.append("ReservedCacheNodesOfferingId: " + getReservedCacheNodesOfferingId() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null) sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null) sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCacheNodeCount() != null) sb.append("CacheNodeCount: " + getCacheNodeCount() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getRecurringCharges() != null) sb.append("RecurringCharges: " + getRecurringCharges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedCacheNodeId() == null) ? 0 : getReservedCacheNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedCacheNodesOfferingId() == null) ? 0 : getReservedCacheNodesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeCount() == null) ? 0 : getCacheNodeCount().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedCacheNode == false) return false;
        ReservedCacheNode other = (ReservedCacheNode)obj;
        
        if (other.getReservedCacheNodeId() == null ^ this.getReservedCacheNodeId() == null) return false;
        if (other.getReservedCacheNodeId() != null && other.getReservedCacheNodeId().equals(this.getReservedCacheNodeId()) == false) return false; 
        if (other.getReservedCacheNodesOfferingId() == null ^ this.getReservedCacheNodesOfferingId() == null) return false;
        if (other.getReservedCacheNodesOfferingId() != null && other.getReservedCacheNodesOfferingId().equals(this.getReservedCacheNodesOfferingId()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getCacheNodeCount() == null ^ this.getCacheNodeCount() == null) return false;
        if (other.getCacheNodeCount() != null && other.getCacheNodeCount().equals(this.getCacheNodeCount()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        return true;
    }
    
}
    