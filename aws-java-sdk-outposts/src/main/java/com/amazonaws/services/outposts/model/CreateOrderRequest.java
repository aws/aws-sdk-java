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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOrderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostIdentifier;
    /**
     * <p>
     * The line items that make up the order.
     * </p>
     */
    private java.util.List<LineItemRequest> lineItems;
    /**
     * <p>
     * The payment option.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The payment terms.
     * </p>
     */
    private String paymentTerm;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostIdentifier(String outpostIdentifier) {
        this.outpostIdentifier = outpostIdentifier;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostIdentifier() {
        return this.outpostIdentifier;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrderRequest withOutpostIdentifier(String outpostIdentifier) {
        setOutpostIdentifier(outpostIdentifier);
        return this;
    }

    /**
     * <p>
     * The line items that make up the order.
     * </p>
     * 
     * @return The line items that make up the order.
     */

    public java.util.List<LineItemRequest> getLineItems() {
        return lineItems;
    }

    /**
     * <p>
     * The line items that make up the order.
     * </p>
     * 
     * @param lineItems
     *        The line items that make up the order.
     */

    public void setLineItems(java.util.Collection<LineItemRequest> lineItems) {
        if (lineItems == null) {
            this.lineItems = null;
            return;
        }

        this.lineItems = new java.util.ArrayList<LineItemRequest>(lineItems);
    }

    /**
     * <p>
     * The line items that make up the order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineItems(java.util.Collection)} or {@link #withLineItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineItems
     *        The line items that make up the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrderRequest withLineItems(LineItemRequest... lineItems) {
        if (this.lineItems == null) {
            setLineItems(new java.util.ArrayList<LineItemRequest>(lineItems.length));
        }
        for (LineItemRequest ele : lineItems) {
            this.lineItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The line items that make up the order.
     * </p>
     * 
     * @param lineItems
     *        The line items that make up the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrderRequest withLineItems(java.util.Collection<LineItemRequest> lineItems) {
        setLineItems(lineItems);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @return The payment option.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public CreateOrderRequest withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public CreateOrderRequest withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The payment terms.
     * </p>
     * 
     * @param paymentTerm
     *        The payment terms.
     * @see PaymentTerm
     */

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    /**
     * <p>
     * The payment terms.
     * </p>
     * 
     * @return The payment terms.
     * @see PaymentTerm
     */

    public String getPaymentTerm() {
        return this.paymentTerm;
    }

    /**
     * <p>
     * The payment terms.
     * </p>
     * 
     * @param paymentTerm
     *        The payment terms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentTerm
     */

    public CreateOrderRequest withPaymentTerm(String paymentTerm) {
        setPaymentTerm(paymentTerm);
        return this;
    }

    /**
     * <p>
     * The payment terms.
     * </p>
     * 
     * @param paymentTerm
     *        The payment terms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentTerm
     */

    public CreateOrderRequest withPaymentTerm(PaymentTerm paymentTerm) {
        this.paymentTerm = paymentTerm.toString();
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
        if (getOutpostIdentifier() != null)
            sb.append("OutpostIdentifier: ").append(getOutpostIdentifier()).append(",");
        if (getLineItems() != null)
            sb.append("LineItems: ").append(getLineItems()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getPaymentTerm() != null)
            sb.append("PaymentTerm: ").append(getPaymentTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrderRequest == false)
            return false;
        CreateOrderRequest other = (CreateOrderRequest) obj;
        if (other.getOutpostIdentifier() == null ^ this.getOutpostIdentifier() == null)
            return false;
        if (other.getOutpostIdentifier() != null && other.getOutpostIdentifier().equals(this.getOutpostIdentifier()) == false)
            return false;
        if (other.getLineItems() == null ^ this.getLineItems() == null)
            return false;
        if (other.getLineItems() != null && other.getLineItems().equals(this.getLineItems()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getPaymentTerm() == null ^ this.getPaymentTerm() == null)
            return false;
        if (other.getPaymentTerm() != null && other.getPaymentTerm().equals(this.getPaymentTerm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostIdentifier() == null) ? 0 : getOutpostIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLineItems() == null) ? 0 : getLineItems().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getPaymentTerm() == null) ? 0 : getPaymentTerm().hashCode());
        return hashCode;
    }

    @Override
    public CreateOrderRequest clone() {
        return (CreateOrderRequest) super.clone();
    }

}
