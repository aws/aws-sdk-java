/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMeteredProducts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMeteredProductsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metered products to list.
     * </p>
     */
    private java.util.List<MeteredProductSummary> meteredProducts;
    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metered products to list.
     * </p>
     * 
     * @return The metered products to list.
     */

    public java.util.List<MeteredProductSummary> getMeteredProducts() {
        return meteredProducts;
    }

    /**
     * <p>
     * The metered products to list.
     * </p>
     * 
     * @param meteredProducts
     *        The metered products to list.
     */

    public void setMeteredProducts(java.util.Collection<MeteredProductSummary> meteredProducts) {
        if (meteredProducts == null) {
            this.meteredProducts = null;
            return;
        }

        this.meteredProducts = new java.util.ArrayList<MeteredProductSummary>(meteredProducts);
    }

    /**
     * <p>
     * The metered products to list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMeteredProducts(java.util.Collection)} or {@link #withMeteredProducts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param meteredProducts
     *        The metered products to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeteredProductsResult withMeteredProducts(MeteredProductSummary... meteredProducts) {
        if (this.meteredProducts == null) {
            setMeteredProducts(new java.util.ArrayList<MeteredProductSummary>(meteredProducts.length));
        }
        for (MeteredProductSummary ele : meteredProducts) {
            this.meteredProducts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metered products to list.
     * </p>
     * 
     * @param meteredProducts
     *        The metered products to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeteredProductsResult withMeteredProducts(java.util.Collection<MeteredProductSummary> meteredProducts) {
        setMeteredProducts(meteredProducts);
        return this;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @return If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeteredProductsResult withNextToken(String nextToken) {
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
        if (getMeteredProducts() != null)
            sb.append("MeteredProducts: ").append(getMeteredProducts()).append(",");
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

        if (obj instanceof ListMeteredProductsResult == false)
            return false;
        ListMeteredProductsResult other = (ListMeteredProductsResult) obj;
        if (other.getMeteredProducts() == null ^ this.getMeteredProducts() == null)
            return false;
        if (other.getMeteredProducts() != null && other.getMeteredProducts().equals(this.getMeteredProducts()) == false)
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

        hashCode = prime * hashCode + ((getMeteredProducts() == null) ? 0 : getMeteredProducts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMeteredProductsResult clone() {
        try {
            return (ListMeteredProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
