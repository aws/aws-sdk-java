/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProductsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of products, including details for each product.
     * </p>
     */
    private java.util.List<Product> products;
    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of products, including details for each product.
     * </p>
     * 
     * @return A list of products, including details for each product.
     */

    public java.util.List<Product> getProducts() {
        return products;
    }

    /**
     * <p>
     * A list of products, including details for each product.
     * </p>
     * 
     * @param products
     *        A list of products, including details for each product.
     */

    public void setProducts(java.util.Collection<Product> products) {
        if (products == null) {
            this.products = null;
            return;
        }

        this.products = new java.util.ArrayList<Product>(products);
    }

    /**
     * <p>
     * A list of products, including details for each product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProducts(java.util.Collection)} or {@link #withProducts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param products
     *        A list of products, including details for each product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductsResult withProducts(Product... products) {
        if (this.products == null) {
            setProducts(new java.util.ArrayList<Product>(products.length));
        }
        for (Product ele : products) {
            this.products.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of products, including details for each product.
     * </p>
     * 
     * @param products
     *        A list of products, including details for each product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductsResult withProducts(java.util.Collection<Product> products) {
        setProducts(products);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * 
     * @return The pagination token to use to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProductsResult withNextToken(String nextToken) {
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
        if (getProducts() != null)
            sb.append("Products: ").append(getProducts()).append(",");
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

        if (obj instanceof DescribeProductsResult == false)
            return false;
        DescribeProductsResult other = (DescribeProductsResult) obj;
        if (other.getProducts() == null ^ this.getProducts() == null)
            return false;
        if (other.getProducts() != null && other.getProducts().equals(this.getProducts()) == false)
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

        hashCode = prime * hashCode + ((getProducts() == null) ? 0 : getProducts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProductsResult clone() {
        try {
            return (DescribeProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
