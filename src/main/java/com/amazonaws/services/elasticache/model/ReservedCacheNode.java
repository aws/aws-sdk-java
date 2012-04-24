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
package com.amazonaws.services.elasticache.model;

/**
 * <p>
 * This data type is used as a response element in the
 * DescribeReservedCacheNodes and PurchaseReservedCacheNodesOffering
 * actions.
 * </p>
 */
public class ReservedCacheNode {

    /**
     * The unique identifier for the reservation.
     */
    private String reservedCacheNodeId;

    /**
     * The offering identifier.
     */
    private String reservedCacheNodesOfferingId;

    /**
     * The cache node type for the reserved Cache Node.
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
     * The fixed price charged for this reserved Cache Node.
     */
    private Double fixedPrice;

    /**
     * The hourly price charged for this reserved Cache Node.
     */
    private Double usagePrice;

    /**
     * The number of reserved Cache Nodes.
     */
    private Integer cacheNodeCount;

    /**
     * The description of the reserved Cache Node.
     */
    private String productDescription;

    /**
     * The offering type of this reserved Cache Node.
     */
    private String offeringType;

    /**
     * The state of the reserved Cache Node.
     */
    private String state;

    /**
     * The recurring price charged to run this reserved Cache Node.
     */
    private java.util.List<RecurringCharge> recurringCharges;

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
     * The cache node type for the reserved Cache Node.
     *
     * @return The cache node type for the reserved Cache Node.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * The cache node type for the reserved Cache Node.
     *
     * @param cacheNodeType The cache node type for the reserved Cache Node.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * The cache node type for the reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType The cache node type for the reserved Cache Node.
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
     * The fixed price charged for this reserved Cache Node.
     *
     * @return The fixed price charged for this reserved Cache Node.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The fixed price charged for this reserved Cache Node.
     *
     * @param fixedPrice The fixed price charged for this reserved Cache Node.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The fixed price charged for this reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The fixed price charged for this reserved Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }
    
    
    /**
     * The hourly price charged for this reserved Cache Node.
     *
     * @return The hourly price charged for this reserved Cache Node.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The hourly price charged for this reserved Cache Node.
     *
     * @param usagePrice The hourly price charged for this reserved Cache Node.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The hourly price charged for this reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The hourly price charged for this reserved Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }
    
    
    /**
     * The number of reserved Cache Nodes.
     *
     * @return The number of reserved Cache Nodes.
     */
    public Integer getCacheNodeCount() {
        return cacheNodeCount;
    }
    
    /**
     * The number of reserved Cache Nodes.
     *
     * @param cacheNodeCount The number of reserved Cache Nodes.
     */
    public void setCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
    }
    
    /**
     * The number of reserved Cache Nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeCount The number of reserved Cache Nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
        return this;
    }
    
    
    /**
     * The description of the reserved Cache Node.
     *
     * @return The description of the reserved Cache Node.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The description of the reserved Cache Node.
     *
     * @param productDescription The description of the reserved Cache Node.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The description of the reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The description of the reserved Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * The offering type of this reserved Cache Node.
     *
     * @return The offering type of this reserved Cache Node.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The offering type of this reserved Cache Node.
     *
     * @param offeringType The offering type of this reserved Cache Node.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The offering type of this reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The offering type of this reserved Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    
    
    /**
     * The state of the reserved Cache Node.
     *
     * @return The state of the reserved Cache Node.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the reserved Cache Node.
     *
     * @param state The state of the reserved Cache Node.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the reserved Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * The recurring price charged to run this reserved Cache Node.
     *
     * @return The recurring price charged to run this reserved Cache Node.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        
        if (recurringCharges == null) {
            recurringCharges = new java.util.ArrayList<RecurringCharge>();
        }
        return recurringCharges;
    }
    
    /**
     * The recurring price charged to run this reserved Cache Node.
     *
     * @param recurringCharges The recurring price charged to run this reserved Cache Node.
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
     * The recurring price charged to run this reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring price charged to run this reserved Cache Node.
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
     * The recurring price charged to run this reserved Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring price charged to run this reserved Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedCacheNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
        if (reservedCacheNodeId != null) sb.append("ReservedCacheNodeId: " + reservedCacheNodeId + ", ");
        if (reservedCacheNodesOfferingId != null) sb.append("ReservedCacheNodesOfferingId: " + reservedCacheNodesOfferingId + ", ");
        if (cacheNodeType != null) sb.append("CacheNodeType: " + cacheNodeType + ", ");
        if (startTime != null) sb.append("StartTime: " + startTime + ", ");
        if (duration != null) sb.append("Duration: " + duration + ", ");
        if (fixedPrice != null) sb.append("FixedPrice: " + fixedPrice + ", ");
        if (usagePrice != null) sb.append("UsagePrice: " + usagePrice + ", ");
        if (cacheNodeCount != null) sb.append("CacheNodeCount: " + cacheNodeCount + ", ");
        if (productDescription != null) sb.append("ProductDescription: " + productDescription + ", ");
        if (offeringType != null) sb.append("OfferingType: " + offeringType + ", ");
        if (state != null) sb.append("State: " + state + ", ");
        if (recurringCharges != null) sb.append("RecurringCharges: " + recurringCharges + ", ");
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
    