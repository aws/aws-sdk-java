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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListOrders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrdersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the orders.
     * </p>
     */
    private java.util.List<Order> orders;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrdersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the orders.
     * </p>
     * 
     * @return Information about the orders.
     */

    public java.util.List<Order> getOrders() {
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

    public void setOrders(java.util.Collection<Order> orders) {
        if (orders == null) {
            this.orders = null;
            return;
        }

        this.orders = new java.util.ArrayList<Order>(orders);
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

    public ListOrdersResult withOrders(Order... orders) {
        if (this.orders == null) {
            setOrders(new java.util.ArrayList<Order>(orders.length));
        }
        for (Order ele : orders) {
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

    public ListOrdersResult withOrders(java.util.Collection<Order> orders) {
        setOrders(orders);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrders() != null)
            sb.append("Orders: ").append(getOrders());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrders() == null ^ this.getOrders() == null)
            return false;
        if (other.getOrders() != null && other.getOrders().equals(this.getOrders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrders() == null) ? 0 : getOrders().hashCode());
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
