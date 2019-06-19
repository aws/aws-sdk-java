/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a reserved node. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved
 * node offerings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ReservedNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNode implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedNodeId;
    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     */
    private String reservedNodeOfferingId;
    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of
     * that duration.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     */
    private Integer nodeCount;
    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has
     * not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved node.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;
    /** <p/> */
    private String reservedNodeOfferingType;

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedNodeId
     *        The unique identifier for the reservation.
     */

    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @return The unique identifier for the reservation.
     */

    public String getReservedNodeId() {
        return this.reservedNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedNodeId
     *        The unique identifier for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withReservedNodeId(String reservedNodeId) {
        setReservedNodeId(reservedNodeId);
        return this;
    }

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     * 
     * @param reservedNodeOfferingId
     *        The identifier for the reserved node offering.
     */

    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     * 
     * @return The identifier for the reserved node offering.
     */

    public String getReservedNodeOfferingId() {
        return this.reservedNodeOfferingId;
    }

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     * 
     * @param reservedNodeOfferingId
     *        The identifier for the reserved node offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withReservedNodeOfferingId(String reservedNodeOfferingId) {
        setReservedNodeOfferingId(reservedNodeOfferingId);
        return this;
    }

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     * 
     * @param nodeType
     *        The node type of the reserved node.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     * 
     * @return The node type of the reserved node.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     * 
     * @param nodeType
     *        The node type of the reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of
     * that duration.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started. You purchase a reserved node offering for a duration. This is the start
     *        time of that duration.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of
     * that duration.
     * </p>
     * 
     * @return The time the reservation started. You purchase a reserved node offering for a duration. This is the start
     *         time of that duration.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of
     * that duration.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started. You purchase a reserved node offering for a duration. This is the start
     *        time of that duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the node reservation in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     * 
     * @return The duration of the node reservation in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the node reservation in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed cost Amazon Redshift charges you for this reserved node.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     * 
     * @return The fixed cost Amazon Redshift charges you for this reserved node.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed cost Amazon Redshift charges you for this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     * 
     * @param usagePrice
     *        The hourly rate Amazon Redshift charges you for this reserved node.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     * 
     * @return The hourly rate Amazon Redshift charges you for this reserved node.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     * 
     * @param usagePrice
     *        The hourly rate Amazon Redshift charges you for this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved cluster.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     * 
     * @return The currency code for the reserved cluster.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     * 
     * @param currencyCode
     *        The currency code for the reserved cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     * 
     * @param nodeCount
     *        The number of reserved compute nodes.
     */

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     * 
     * @return The number of reserved compute nodes.
     */

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     * 
     * @param nodeCount
     *        The number of reserved compute nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withNodeCount(Integer nodeCount) {
        setNodeCount(nodeCount);
        return this;
    }

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has
     * not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved node.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the reserved compute node.</p>
     *        <p>
     *        Possible Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pending-payment-This reserved node has recently been purchased, and the sale has been approved, but
     *        payment has not yet been confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        active-This reserved node is owned by the caller and is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        payment-failed-Payment failed for the purchase attempt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        retired-The reserved node is no longer available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        exchanging-The owner is exchanging the reserved node for another reserved node.
     *        </p>
     *        </li>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has
     * not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved node.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the reserved compute node.</p>
     *         <p>
     *         Possible Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         pending-payment-This reserved node has recently been purchased, and the sale has been approved, but
     *         payment has not yet been confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         active-This reserved node is owned by the caller and is available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         payment-failed-Payment failed for the purchase attempt.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         retired-The reserved node is no longer available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         exchanging-The owner is exchanging the reserved node for another reserved node.
     *         </p>
     *         </li>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has
     * not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved node.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the reserved compute node.</p>
     *        <p>
     *        Possible Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        pending-payment-This reserved node has recently been purchased, and the sale has been approved, but
     *        payment has not yet been confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        active-This reserved node is owned by the caller and is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        payment-failed-Payment failed for the purchase attempt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        retired-The reserved node is no longer available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        exchanging-The owner is exchanging the reserved node for another reserved node.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     * 
     * @param offeringType
     *        The anticipated utilization of the reserved node, as defined in the reserved node offering.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     * 
     * @return The anticipated utilization of the reserved node, as defined in the reserved node offering.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * </p>
     * 
     * @param offeringType
     *        The anticipated utilization of the reserved node, as defined in the reserved node offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     * 
     * @return The recurring charges for the reserved node.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
            recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>();
        }
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charges for the reserved node.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charges for the reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charges for the reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p/>
     * 
     * @param reservedNodeOfferingType
     * @see ReservedNodeOfferingType
     */

    public void setReservedNodeOfferingType(String reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ReservedNodeOfferingType
     */

    public String getReservedNodeOfferingType() {
        return this.reservedNodeOfferingType;
    }

    /**
     * <p/>
     * 
     * @param reservedNodeOfferingType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeOfferingType
     */

    public ReservedNode withReservedNodeOfferingType(String reservedNodeOfferingType) {
        setReservedNodeOfferingType(reservedNodeOfferingType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param reservedNodeOfferingType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservedNodeOfferingType
     */

    public ReservedNode withReservedNodeOfferingType(ReservedNodeOfferingType reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType.toString();
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
        if (getReservedNodeId() != null)
            sb.append("ReservedNodeId: ").append(getReservedNodeId()).append(",");
        if (getReservedNodeOfferingId() != null)
            sb.append("ReservedNodeOfferingId: ").append(getReservedNodeOfferingId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getNodeCount() != null)
            sb.append("NodeCount: ").append(getNodeCount()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges()).append(",");
        if (getReservedNodeOfferingType() != null)
            sb.append("ReservedNodeOfferingType: ").append(getReservedNodeOfferingType());
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
        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null)
            return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false)
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
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getReservedNodeOfferingType() == null ^ this.getReservedNodeOfferingType() == null)
            return false;
        if (other.getReservedNodeOfferingType() != null && other.getReservedNodeOfferingType().equals(this.getReservedNodeOfferingType()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getReservedNodeOfferingType() == null) ? 0 : getReservedNodeOfferingType().hashCode());
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

}
