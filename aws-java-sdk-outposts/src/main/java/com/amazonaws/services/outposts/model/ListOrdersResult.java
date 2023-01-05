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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOrders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrdersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the orders.
     * </p>
     */
    private java.util.List<OrderSummary> orders;

    private String nextToken;

    /**
     * <p>
     * Information about the orders.
     * </p>
     * 
     * @return Information about the orders.
     */

    public java.util.List<OrderSummary> getOrders() {
        return orders;
    }

    /**
     * <p>
     * Information about the orders.
     * </p>
     * 
     * @param orders
     *        Information about the orders.
     */

    public void setOrders(java.util.Collection<OrderSummary> orders) {
        if (orders == null) {
            this.orders = null;
            return;
        }

        this.orders = new java.util.ArrayList<OrderSummary>(orders);
    }

    /**
     * <p>
     * Information about the orders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrders(java.util.Collection)} or {@link #withOrders(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param orders
     *        Information about the orders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrdersResult withOrders(OrderSummary... orders) {
        if (this.orders == null) {
            setOrders(new java.util.ArrayList<OrderSummary>(orders.length));
        }
        for (OrderSummary ele : orders) {
            this.orders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the orders.
     * </p>
     * 
     * @param orders
     *        Information about the orders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrdersResult withOrders(java.util.Collection<OrderSummary> orders) {
        setOrders(orders);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrdersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getOrders() != null)
            sb.append("Orders: ").append(getOrders()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrdersResult == false)
            return false;
        ListOrdersResult other = (ListOrdersResult) obj;
        if (other.getOrders() == null ^ this.getOrders() == null)
            return false;
        if (other.getOrders() != null && other.getOrders().equals(this.getOrders()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrders() == null) ? 0 : getOrders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOrdersResult clone() {
        try {
            return (ListOrdersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
