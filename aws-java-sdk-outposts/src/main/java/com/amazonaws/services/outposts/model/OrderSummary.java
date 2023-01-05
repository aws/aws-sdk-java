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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of line items in your order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/OrderSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Outpost.
     * </p>
     */
    private String outpostId;
    /**
     * <p>
     * The ID of the order.
     * </p>
     */
    private String orderId;
    /**
     * <p>
     * The type of order.
     * </p>
     */
    private String orderType;
    /**
     * <p>
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see the
     * <code>LineItem</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Order is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - Order is cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - Customer should contact support.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * The status of all line items in the order.
     * </p>
     */
    private java.util.Map<String, Integer> lineItemCountsByStatus;
    /**
     * <p>
     * The submission date for the order.
     * </p>
     */
    private java.util.Date orderSubmissionDate;
    /**
     * <p>
     * The fulfilment date for the order.
     * </p>
     */
    private java.util.Date orderFulfilledDate;

    /**
     * <p>
     * The ID of the Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Outpost.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the Outpost.
     * </p>
     * 
     * @return The ID of the Outpost.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the Outpost.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary withOutpostId(String outpostId) {
        setOutpostId(outpostId);
        return this;
    }

    /**
     * <p>
     * The ID of the order.
     * </p>
     * 
     * @param orderId
     *        The ID of the order.
     */

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <p>
     * The ID of the order.
     * </p>
     * 
     * @return The ID of the order.
     */

    public String getOrderId() {
        return this.orderId;
    }

    /**
     * <p>
     * The ID of the order.
     * </p>
     * 
     * @param orderId
     *        The ID of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary withOrderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    /**
     * <p>
     * The type of order.
     * </p>
     * 
     * @param orderType
     *        The type of order.
     * @see OrderType
     */

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * <p>
     * The type of order.
     * </p>
     * 
     * @return The type of order.
     * @see OrderType
     */

    public String getOrderType() {
        return this.orderType;
    }

    /**
     * <p>
     * The type of order.
     * </p>
     * 
     * @param orderType
     *        The type of order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderType
     */

    public OrderSummary withOrderType(String orderType) {
        setOrderType(orderType);
        return this;
    }

    /**
     * <p>
     * The type of order.
     * </p>
     * 
     * @param orderType
     *        The type of order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderType
     */

    public OrderSummary withOrderType(OrderType orderType) {
        this.orderType = orderType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see the
     * <code>LineItem</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Order is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - Order is cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - Customer should contact support.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the order.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREPARING</code> - Order is received and is being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see
     *        the <code>LineItem</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - Order is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> - Order is cancelled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - Customer should contact support.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>,
     *        <code>PROCESSING</code>, <code>INSTALLING</code>, and <code>FULFILLED</code>.
     *        </p>
     * @see OrderStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see the
     * <code>LineItem</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Order is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - Order is cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - Customer should contact support.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @return The status of the order.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PREPARING</code> - Order is received and is being prepared.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see
     *         the <code>LineItem</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> - Order is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code> - Order is cancelled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - Customer should contact support.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>,
     *         <code>PROCESSING</code>, <code>INSTALLING</code>, and <code>FULFILLED</code>.
     *         </p>
     * @see OrderStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see the
     * <code>LineItem</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Order is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - Order is cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - Customer should contact support.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the order.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREPARING</code> - Order is received and is being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see
     *        the <code>LineItem</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - Order is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> - Order is cancelled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - Customer should contact support.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>,
     *        <code>PROCESSING</code>, <code>INSTALLING</code>, and <code>FULFILLED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderStatus
     */

    public OrderSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and is being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see the
     * <code>LineItem</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Order is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> - Order is cancelled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - Customer should contact support.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the order.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREPARING</code> - Order is received and is being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. For more information, see
     *        the <code>LineItem</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - Order is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> - Order is cancelled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ERROR</code> - Customer should contact support.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The following statuses are deprecated: <code>RECEIVED</code>, <code>PENDING</code>,
     *        <code>PROCESSING</code>, <code>INSTALLING</code>, and <code>FULFILLED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderStatus
     */

    public OrderSummary withStatus(OrderStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status of all line items in the order.
     * </p>
     * 
     * @return The status of all line items in the order.
     */

    public java.util.Map<String, Integer> getLineItemCountsByStatus() {
        return lineItemCountsByStatus;
    }

    /**
     * <p>
     * The status of all line items in the order.
     * </p>
     * 
     * @param lineItemCountsByStatus
     *        The status of all line items in the order.
     */

    public void setLineItemCountsByStatus(java.util.Map<String, Integer> lineItemCountsByStatus) {
        this.lineItemCountsByStatus = lineItemCountsByStatus;
    }

    /**
     * <p>
     * The status of all line items in the order.
     * </p>
     * 
     * @param lineItemCountsByStatus
     *        The status of all line items in the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary withLineItemCountsByStatus(java.util.Map<String, Integer> lineItemCountsByStatus) {
        setLineItemCountsByStatus(lineItemCountsByStatus);
        return this;
    }

    /**
     * Add a single LineItemCountsByStatus entry
     *
     * @see OrderSummary#withLineItemCountsByStatus
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary addLineItemCountsByStatusEntry(String key, Integer value) {
        if (null == this.lineItemCountsByStatus) {
            this.lineItemCountsByStatus = new java.util.HashMap<String, Integer>();
        }
        if (this.lineItemCountsByStatus.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.lineItemCountsByStatus.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LineItemCountsByStatus.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary clearLineItemCountsByStatusEntries() {
        this.lineItemCountsByStatus = null;
        return this;
    }

    /**
     * <p>
     * The submission date for the order.
     * </p>
     * 
     * @param orderSubmissionDate
     *        The submission date for the order.
     */

    public void setOrderSubmissionDate(java.util.Date orderSubmissionDate) {
        this.orderSubmissionDate = orderSubmissionDate;
    }

    /**
     * <p>
     * The submission date for the order.
     * </p>
     * 
     * @return The submission date for the order.
     */

    public java.util.Date getOrderSubmissionDate() {
        return this.orderSubmissionDate;
    }

    /**
     * <p>
     * The submission date for the order.
     * </p>
     * 
     * @param orderSubmissionDate
     *        The submission date for the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary withOrderSubmissionDate(java.util.Date orderSubmissionDate) {
        setOrderSubmissionDate(orderSubmissionDate);
        return this;
    }

    /**
     * <p>
     * The fulfilment date for the order.
     * </p>
     * 
     * @param orderFulfilledDate
     *        The fulfilment date for the order.
     */

    public void setOrderFulfilledDate(java.util.Date orderFulfilledDate) {
        this.orderFulfilledDate = orderFulfilledDate;
    }

    /**
     * <p>
     * The fulfilment date for the order.
     * </p>
     * 
     * @return The fulfilment date for the order.
     */

    public java.util.Date getOrderFulfilledDate() {
        return this.orderFulfilledDate;
    }

    /**
     * <p>
     * The fulfilment date for the order.
     * </p>
     * 
     * @param orderFulfilledDate
     *        The fulfilment date for the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderSummary withOrderFulfilledDate(java.util.Date orderFulfilledDate) {
        setOrderFulfilledDate(orderFulfilledDate);
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
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId()).append(",");
        if (getOrderId() != null)
            sb.append("OrderId: ").append(getOrderId()).append(",");
        if (getOrderType() != null)
            sb.append("OrderType: ").append(getOrderType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLineItemCountsByStatus() != null)
            sb.append("LineItemCountsByStatus: ").append(getLineItemCountsByStatus()).append(",");
        if (getOrderSubmissionDate() != null)
            sb.append("OrderSubmissionDate: ").append(getOrderSubmissionDate()).append(",");
        if (getOrderFulfilledDate() != null)
            sb.append("OrderFulfilledDate: ").append(getOrderFulfilledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderSummary == false)
            return false;
        OrderSummary other = (OrderSummary) obj;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        if (other.getOrderId() == null ^ this.getOrderId() == null)
            return false;
        if (other.getOrderId() != null && other.getOrderId().equals(this.getOrderId()) == false)
            return false;
        if (other.getOrderType() == null ^ this.getOrderType() == null)
            return false;
        if (other.getOrderType() != null && other.getOrderType().equals(this.getOrderType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLineItemCountsByStatus() == null ^ this.getLineItemCountsByStatus() == null)
            return false;
        if (other.getLineItemCountsByStatus() != null && other.getLineItemCountsByStatus().equals(this.getLineItemCountsByStatus()) == false)
            return false;
        if (other.getOrderSubmissionDate() == null ^ this.getOrderSubmissionDate() == null)
            return false;
        if (other.getOrderSubmissionDate() != null && other.getOrderSubmissionDate().equals(this.getOrderSubmissionDate()) == false)
            return false;
        if (other.getOrderFulfilledDate() == null ^ this.getOrderFulfilledDate() == null)
            return false;
        if (other.getOrderFulfilledDate() != null && other.getOrderFulfilledDate().equals(this.getOrderFulfilledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        hashCode = prime * hashCode + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        hashCode = prime * hashCode + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLineItemCountsByStatus() == null) ? 0 : getLineItemCountsByStatus().hashCode());
        hashCode = prime * hashCode + ((getOrderSubmissionDate() == null) ? 0 : getOrderSubmissionDate().hashCode());
        hashCode = prime * hashCode + ((getOrderFulfilledDate() == null) ? 0 : getOrderFulfilledDate().hashCode());
        return hashCode;
    }

    @Override
    public OrderSummary clone() {
        try {
            return (OrderSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.OrderSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
