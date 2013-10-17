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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a reserved node offering.
 * </p>
 */
public class ReservedNodeOffering implements Serializable {

    /**
     * The offering identifier.
     */
    private String reservedNodeOfferingId;

    /**
     * The node type offered by the reserved node offering.
     */
    private String nodeType;

    /**
     * The duration, in seconds, for which the offering will reserve the
     * node.
     */
    private Integer duration;

    /**
     * The upfront fixed charge you will pay to purchase the specific
     * reserved node offering.
     */
    private Double fixedPrice;

    /**
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     */
    private Double usagePrice;

    /**
     * The currency code for the compute nodes offering.
     */
    private String currencyCode;

    /**
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     */
    private String offeringType;

    /**
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringCharges;

    /**
     * The offering identifier.
     *
     * @return The offering identifier.
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }
    
    /**
     * The offering identifier.
     *
     * @param reservedNodeOfferingId The offering identifier.
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }
    
    /**
     * The offering identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodeOfferingId The offering identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * The node type offered by the reserved node offering.
     *
     * @return The node type offered by the reserved node offering.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type offered by the reserved node offering.
     *
     * @param nodeType The node type offered by the reserved node offering.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type offered by the reserved node offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type offered by the reserved node offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The duration, in seconds, for which the offering will reserve the
     * node.
     *
     * @return The duration, in seconds, for which the offering will reserve the
     *         node.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The duration, in seconds, for which the offering will reserve the
     * node.
     *
     * @param duration The duration, in seconds, for which the offering will reserve the
     *         node.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The duration, in seconds, for which the offering will reserve the
     * node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration, in seconds, for which the offering will reserve the
     *         node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The upfront fixed charge you will pay to purchase the specific
     * reserved node offering.
     *
     * @return The upfront fixed charge you will pay to purchase the specific
     *         reserved node offering.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The upfront fixed charge you will pay to purchase the specific
     * reserved node offering.
     *
     * @param fixedPrice The upfront fixed charge you will pay to purchase the specific
     *         reserved node offering.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The upfront fixed charge you will pay to purchase the specific
     * reserved node offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The upfront fixed charge you will pay to purchase the specific
     *         reserved node offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     *
     * @return The rate you are charged for each hour the cluster that is using the
     *         offering is running.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     *
     * @param usagePrice The rate you are charged for each hour the cluster that is using the
     *         offering is running.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The rate you are charged for each hour the cluster that is using the
     *         offering is running.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * The currency code for the compute nodes offering.
     *
     * @return The currency code for the compute nodes offering.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency code for the compute nodes offering.
     *
     * @param currencyCode The currency code for the compute nodes offering.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency code for the compute nodes offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currencyCode The currency code for the compute nodes offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     *
     * @return The anticipated utilization of the reserved node, as defined in the
     *         reserved node offering.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     *
     * @param offeringType The anticipated utilization of the reserved node, as defined in the
     *         reserved node offering.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The anticipated utilization of the reserved node, as defined in the
     *         reserved node offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     *
     * @return The charge to your account regardless of whether you are creating any
     *         clusters using the node offering. Recurring charges are only in effect
     *         for heavy-utilization reserved nodes.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
              recurringCharges = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>();
              recurringCharges.setAutoConstruct(true);
        }
        return recurringCharges;
    }
    
    /**
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     *
     * @param recurringCharges The charge to your account regardless of whether you are creating any
     *         clusters using the node offering. Recurring charges are only in effect
     *         for heavy-utilization reserved nodes.
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
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The charge to your account regardless of whether you are creating any
     *         clusters using the node offering. Recurring charges are only in effect
     *         for heavy-utilization reserved nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        for (RecurringCharge value : recurringCharges) {
            getRecurringCharges().add(value);
        }
        return this;
    }
    
    /**
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The charge to your account regardless of whether you are creating any
     *         clusters using the node offering. Recurring charges are only in effect
     *         for heavy-utilization reserved nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNodeOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
        if (getReservedNodeOfferingId() != null) sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null) sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null) sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null) sb.append("RecurringCharges: " + getRecurringCharges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedNodeOffering == false) return false;
        ReservedNodeOffering other = (ReservedNodeOffering)obj;
        
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null) return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        return true;
    }
    
}
    