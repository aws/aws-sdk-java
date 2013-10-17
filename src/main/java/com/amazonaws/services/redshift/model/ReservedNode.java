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
 * Describes a reserved node.
 * </p>
 */
public class ReservedNode implements Serializable {

    /**
     * The unique identifier for the reservation.
     */
    private String reservedNodeId;

    /**
     * The identifier for the reserved node offering.
     */
    private String reservedNodeOfferingId;

    /**
     * The node type of the reserved node.
     */
    private String nodeType;

    /**
     * The time the reservation started. You purchase a reserved node
     * offering for a duration. This is the start time of that duration.
     */
    private java.util.Date startTime;

    /**
     * The duration of the node reservation in seconds.
     */
    private Integer duration;

    /**
     * The fixed cost Amazon Redshift charged you for this reserved node.
     */
    private Double fixedPrice;

    /**
     * The hourly rate Amazon Redshift charge you for this reserved node.
     */
    private Double usagePrice;

    /**
     * The currency code for the reserved cluster.
     */
    private String currencyCode;

    /**
     * The number of reserved compute nodes.
     */
    private Integer nodeCount;

    /**
     * The state of the reserved Compute Node. <p>Possible Values: <ul>
     * <li>pending-payment-This reserved node has recently been purchased,
     * and the sale has been approved, but payment has not yet been
     * confirmed.</li> <li>active-This reserved node is owned by the caller
     * and is available for use.</li> <li>payment-failed-Payment failed for
     * the purchase attempt.</li> </ul>
     */
    private String state;

    /**
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     */
    private String offeringType;

    /**
     * The recurring charges for the reserved node.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringCharges;

    /**
     * The unique identifier for the reservation.
     *
     * @return The unique identifier for the reservation.
     */
    public String getReservedNodeId() {
        return reservedNodeId;
    }
    
    /**
     * The unique identifier for the reservation.
     *
     * @param reservedNodeId The unique identifier for the reservation.
     */
    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }
    
    /**
     * The unique identifier for the reservation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodeId The unique identifier for the reservation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
        return this;
    }

    /**
     * The identifier for the reserved node offering.
     *
     * @return The identifier for the reserved node offering.
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }
    
    /**
     * The identifier for the reserved node offering.
     *
     * @param reservedNodeOfferingId The identifier for the reserved node offering.
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }
    
    /**
     * The identifier for the reserved node offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodeOfferingId The identifier for the reserved node offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * The node type of the reserved node.
     *
     * @return The node type of the reserved node.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type of the reserved node.
     *
     * @param nodeType The node type of the reserved node.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type of the reserved node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type of the reserved node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The time the reservation started. You purchase a reserved node
     * offering for a duration. This is the start time of that duration.
     *
     * @return The time the reservation started. You purchase a reserved node
     *         offering for a duration. This is the start time of that duration.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The time the reservation started. You purchase a reserved node
     * offering for a duration. This is the start time of that duration.
     *
     * @param startTime The time the reservation started. You purchase a reserved node
     *         offering for a duration. This is the start time of that duration.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The time the reservation started. You purchase a reserved node
     * offering for a duration. This is the start time of that duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The time the reservation started. You purchase a reserved node
     *         offering for a duration. This is the start time of that duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The duration of the node reservation in seconds.
     *
     * @return The duration of the node reservation in seconds.
     */
    public Integer getDuration() {
        return duration;
    }
    
    /**
     * The duration of the node reservation in seconds.
     *
     * @param duration The duration of the node reservation in seconds.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the node reservation in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the node reservation in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The fixed cost Amazon Redshift charged you for this reserved node.
     *
     * @return The fixed cost Amazon Redshift charged you for this reserved node.
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The fixed cost Amazon Redshift charged you for this reserved node.
     *
     * @param fixedPrice The fixed cost Amazon Redshift charged you for this reserved node.
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The fixed cost Amazon Redshift charged you for this reserved node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The fixed cost Amazon Redshift charged you for this reserved node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * The hourly rate Amazon Redshift charge you for this reserved node.
     *
     * @return The hourly rate Amazon Redshift charge you for this reserved node.
     */
    public Double getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The hourly rate Amazon Redshift charge you for this reserved node.
     *
     * @param usagePrice The hourly rate Amazon Redshift charge you for this reserved node.
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The hourly rate Amazon Redshift charge you for this reserved node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The hourly rate Amazon Redshift charge you for this reserved node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * The currency code for the reserved cluster.
     *
     * @return The currency code for the reserved cluster.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency code for the reserved cluster.
     *
     * @param currencyCode The currency code for the reserved cluster.
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency code for the reserved cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currencyCode The currency code for the reserved cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The number of reserved compute nodes.
     *
     * @return The number of reserved compute nodes.
     */
    public Integer getNodeCount() {
        return nodeCount;
    }
    
    /**
     * The number of reserved compute nodes.
     *
     * @param nodeCount The number of reserved compute nodes.
     */
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }
    
    /**
     * The number of reserved compute nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeCount The number of reserved compute nodes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * The state of the reserved Compute Node. <p>Possible Values: <ul>
     * <li>pending-payment-This reserved node has recently been purchased,
     * and the sale has been approved, but payment has not yet been
     * confirmed.</li> <li>active-This reserved node is owned by the caller
     * and is available for use.</li> <li>payment-failed-Payment failed for
     * the purchase attempt.</li> </ul>
     *
     * @return The state of the reserved Compute Node. <p>Possible Values: <ul>
     *         <li>pending-payment-This reserved node has recently been purchased,
     *         and the sale has been approved, but payment has not yet been
     *         confirmed.</li> <li>active-This reserved node is owned by the caller
     *         and is available for use.</li> <li>payment-failed-Payment failed for
     *         the purchase attempt.</li> </ul>
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the reserved Compute Node. <p>Possible Values: <ul>
     * <li>pending-payment-This reserved node has recently been purchased,
     * and the sale has been approved, but payment has not yet been
     * confirmed.</li> <li>active-This reserved node is owned by the caller
     * and is available for use.</li> <li>payment-failed-Payment failed for
     * the purchase attempt.</li> </ul>
     *
     * @param state The state of the reserved Compute Node. <p>Possible Values: <ul>
     *         <li>pending-payment-This reserved node has recently been purchased,
     *         and the sale has been approved, but payment has not yet been
     *         confirmed.</li> <li>active-This reserved node is owned by the caller
     *         and is available for use.</li> <li>payment-failed-Payment failed for
     *         the purchase attempt.</li> </ul>
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the reserved Compute Node. <p>Possible Values: <ul>
     * <li>pending-payment-This reserved node has recently been purchased,
     * and the sale has been approved, but payment has not yet been
     * confirmed.</li> <li>active-This reserved node is owned by the caller
     * and is available for use.</li> <li>payment-failed-Payment failed for
     * the purchase attempt.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the reserved Compute Node. <p>Possible Values: <ul>
     *         <li>pending-payment-This reserved node has recently been purchased,
     *         and the sale has been approved, but payment has not yet been
     *         confirmed.</li> <li>active-This reserved node is owned by the caller
     *         and is available for use.</li> <li>payment-failed-Payment failed for
     *         the purchase attempt.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withState(String state) {
        this.state = state;
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
    public ReservedNode withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The recurring charges for the reserved node.
     *
     * @return The recurring charges for the reserved node.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
              recurringCharges = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>();
              recurringCharges.setAutoConstruct(true);
        }
        return recurringCharges;
    }
    
    /**
     * The recurring charges for the reserved node.
     *
     * @param recurringCharges The recurring charges for the reserved node.
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
     * The recurring charges for the reserved node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring charges for the reserved node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        for (RecurringCharge value : recurringCharges) {
            getRecurringCharges().add(value);
        }
        return this;
    }
    
    /**
     * The recurring charges for the reserved node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring charges for the reserved node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
        if (getReservedNodeId() != null) sb.append("ReservedNodeId: " + getReservedNodeId() + ",");
        if (getReservedNodeOfferingId() != null) sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null) sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null) sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getNodeCount() != null) sb.append("NodeCount: " + getNodeCount() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null) sb.append("RecurringCharges: " + getRecurringCharges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedNode == false) return false;
        ReservedNode other = (ReservedNode)obj;
        
        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null) return false;
        if (other.getReservedNodeId() != null && other.getReservedNodeId().equals(this.getReservedNodeId()) == false) return false; 
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null) return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
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
        if (other.getNodeCount() == null ^ this.getNodeCount() == null) return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        return true;
    }
    
}
    