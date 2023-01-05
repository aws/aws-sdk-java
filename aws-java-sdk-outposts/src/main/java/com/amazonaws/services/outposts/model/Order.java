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
 * Information about an order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/Order" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Order implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Outpost in the order.
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
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see the line
     * item status.
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
     * The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * The line items for the order
     * </p>
     */
    private java.util.List<LineItem> lineItems;
    /**
     * <p>
     * The payment option for the order.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The submission date for the order.
     * </p>
     */
    private java.util.Date orderSubmissionDate;
    /**
     * <p>
     * The fulfillment date of the order.
     * </p>
     */
    private java.util.Date orderFulfilledDate;

    /**
     * <p>
     * The ID of the Outpost in the order.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Outpost in the order.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the Outpost in the order.
     * </p>
     * 
     * @return The ID of the Outpost in the order.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the Outpost in the order.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Outpost in the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withOutpostId(String outpostId) {
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

    public Order withOrderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    /**
     * <p>
     * The status of the order.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREPARING</code> - Order is received and being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see the line
     * item status.
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
     * The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the order.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREPARING</code> - Order is received and being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see
     *        the line item status.
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
     *        The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     *        <code>INSTALLING</code>, and <code>FULFILLED</code>.
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
     * <code>PREPARING</code> - Order is received and being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see the line
     * item status.
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
     * The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @return The status of the order.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PREPARING</code> - Order is received and being prepared.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see
     *         the line item status.
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
     *         The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>, <code>INSTALLING</code>, and <code>FULFILLED</code>.
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
     * <code>PREPARING</code> - Order is received and being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see the line
     * item status.
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
     * The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the order.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREPARING</code> - Order is received and being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see
     *        the line item status.
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
     *        The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     *        <code>INSTALLING</code>, and <code>FULFILLED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderStatus
     */

    public Order withStatus(String status) {
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
     * <code>PREPARING</code> - Order is received and being prepared.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see the line
     * item status.
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
     * The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     * <code>INSTALLING</code>, and <code>FULFILLED</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the order.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREPARING</code> - Order is received and being prepared.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Order is either being built, shipped, or installed. To get more details, see
     *        the line item status.
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
     *        The following status are deprecated: <code>RECEIVED</code>, <code>PENDING</code>, <code>PROCESSING</code>,
     *        <code>INSTALLING</code>, and <code>FULFILLED</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderStatus
     */

    public Order withStatus(OrderStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The line items for the order
     * </p>
     * 
     * @return The line items for the order
     */

    public java.util.List<LineItem> getLineItems() {
        return lineItems;
    }

    /**
     * <p>
     * The line items for the order
     * </p>
     * 
     * @param lineItems
     *        The line items for the order
     */

    public void setLineItems(java.util.Collection<LineItem> lineItems) {
        if (lineItems == null) {
            this.lineItems = null;
            return;
        }

        this.lineItems = new java.util.ArrayList<LineItem>(lineItems);
    }

    /**
     * <p>
     * The line items for the order
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineItems(java.util.Collection)} or {@link #withLineItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineItems
     *        The line items for the order
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withLineItems(LineItem... lineItems) {
        if (this.lineItems == null) {
            setLineItems(new java.util.ArrayList<LineItem>(lineItems.length));
        }
        for (LineItem ele : lineItems) {
            this.lineItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The line items for the order
     * </p>
     * 
     * @param lineItems
     *        The line items for the order
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withLineItems(java.util.Collection<LineItem> lineItems) {
        setLineItems(lineItems);
        return this;
    }

    /**
     * <p>
     * The payment option for the order.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the order.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the order.
     * </p>
     * 
     * @return The payment option for the order.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option for the order.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public Order withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option for the order.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public Order withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
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

    public Order withOrderSubmissionDate(java.util.Date orderSubmissionDate) {
        setOrderSubmissionDate(orderSubmissionDate);
        return this;
    }

    /**
     * <p>
     * The fulfillment date of the order.
     * </p>
     * 
     * @param orderFulfilledDate
     *        The fulfillment date of the order.
     */

    public void setOrderFulfilledDate(java.util.Date orderFulfilledDate) {
        this.orderFulfilledDate = orderFulfilledDate;
    }

    /**
     * <p>
     * The fulfillment date of the order.
     * </p>
     * 
     * @return The fulfillment date of the order.
     */

    public java.util.Date getOrderFulfilledDate() {
        return this.orderFulfilledDate;
    }

    /**
     * <p>
     * The fulfillment date of the order.
     * </p>
     * 
     * @param orderFulfilledDate
     *        The fulfillment date of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withOrderFulfilledDate(java.util.Date orderFulfilledDate) {
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLineItems() != null)
            sb.append("LineItems: ").append(getLineItems()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
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

        if (obj instanceof Order == false)
            return false;
        Order other = (Order) obj;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        if (other.getOrderId() == null ^ this.getOrderId() == null)
            return false;
        if (other.getOrderId() != null && other.getOrderId().equals(this.getOrderId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLineItems() == null ^ this.getLineItems() == null)
            return false;
        if (other.getLineItems() != null && other.getLineItems().equals(this.getLineItems()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLineItems() == null) ? 0 : getLineItems().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getOrderSubmissionDate() == null) ? 0 : getOrderSubmissionDate().hashCode());
        hashCode = prime * hashCode + ((getOrderFulfilledDate() == null) ? 0 : getOrderFulfilledDate().hashCode());
        return hashCode;
    }

    @Override
    public Order clone() {
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.OrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
