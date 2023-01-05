/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ReservedNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     */
    private String reservationId;
    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     */
    private String reservedNodesOfferingId;
    /**
     * <p>
     * The node type for the reserved nodes.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The time the reservation started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The number of nodes that have been reserved.
     * </p>
     */
    private Integer nodeCount;
    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The state of the reserved node.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved node.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationId
     *        A customer-specified identifier to track this reservation.
     */

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @return A customer-specified identifier to track this reservation.
     */

    public String getReservationId() {
        return this.reservationId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationId
     *        A customer-specified identifier to track this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withReservationId(String reservationId) {
        setReservationId(reservationId);
        return this;
    }

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The ID of the reserved node offering to purchase.
     */

    public void setReservedNodesOfferingId(String reservedNodesOfferingId) {
        this.reservedNodesOfferingId = reservedNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     * 
     * @return The ID of the reserved node offering to purchase.
     */

    public String getReservedNodesOfferingId() {
        return this.reservedNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The ID of the reserved node offering to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withReservedNodesOfferingId(String reservedNodesOfferingId) {
        setReservedNodesOfferingId(reservedNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * The node type for the reserved nodes.
     * </p>
     * 
     * @param nodeType
     *        The node type for the reserved nodes.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the reserved nodes.
     * </p>
     * 
     * @return The node type for the reserved nodes.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type for the reserved nodes.
     * </p>
     * 
     * @param nodeType
     *        The node type for the reserved nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @return The time the reservation started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @return The duration of the reservation in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved node.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     * 
     * @return The fixed price charged for this reserved node.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The number of nodes that have been reserved.
     * </p>
     * 
     * @param nodeCount
     *        The number of nodes that have been reserved.
     */

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of nodes that have been reserved.
     * </p>
     * 
     * @return The number of nodes that have been reserved.
     */

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * <p>
     * The number of nodes that have been reserved.
     * </p>
     * 
     * @param nodeCount
     *        The number of nodes that have been reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withNodeCount(Integer nodeCount) {
        setNodeCount(nodeCount);
        return this;
    }

    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved node.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     * 
     * @return The offering type of this reserved node.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The state of the reserved node.
     * </p>
     * 
     * @param state
     *        The state of the reserved node.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved node.
     * </p>
     * 
     * @return The state of the reserved node.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the reserved node.
     * </p>
     * 
     * @param state
     *        The state of the reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * 
     * @return The recurring price charged to run this reserved node.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved node.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved node.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the reserved node.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved node.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the reserved node.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the reserved node.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservationId() != null)
            sb.append("ReservationId: ").append(getReservationId()).append(",");
        if (getReservedNodesOfferingId() != null)
            sb.append("ReservedNodesOfferingId: ").append(getReservedNodesOfferingId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getNodeCount() != null)
            sb.append("NodeCount: ").append(getNodeCount()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedNode == false)
            return false;
        ReservedNode other = (ReservedNode) obj;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        if (other.getReservedNodesOfferingId() == null ^ this.getReservedNodesOfferingId() == null)
            return false;
        if (other.getReservedNodesOfferingId() != null && other.getReservedNodesOfferingId().equals(this.getReservedNodesOfferingId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        hashCode = prime * hashCode + ((getReservedNodesOfferingId() == null) ? 0 : getReservedNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public ReservedNode clone() {
        try {
            return (ReservedNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ReservedNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
