/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class ScanProvisionedProductsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ProvisionedProduct detail objects.
     * </p>
     */
    private java.util.List<ProvisionedProductDetail> provisionedProducts;
    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * A list of ProvisionedProduct detail objects.
     * </p>
     * 
     * @return A list of ProvisionedProduct detail objects.
     */

    public java.util.List<ProvisionedProductDetail> getProvisionedProducts() {
        return provisionedProducts;
    }

    /**
     * <p>
     * A list of ProvisionedProduct detail objects.
     * </p>
     * 
     * @param provisionedProducts
     *        A list of ProvisionedProduct detail objects.
     */

    public void setProvisionedProducts(java.util.Collection<ProvisionedProductDetail> provisionedProducts) {
        if (provisionedProducts == null) {
            this.provisionedProducts = null;
            return;
        }

        this.provisionedProducts = new java.util.ArrayList<ProvisionedProductDetail>(provisionedProducts);
    }

    /**
     * <p>
     * A list of ProvisionedProduct detail objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedProducts(java.util.Collection)} or {@link #withProvisionedProducts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param provisionedProducts
     *        A list of ProvisionedProduct detail objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanProvisionedProductsResult withProvisionedProducts(ProvisionedProductDetail... provisionedProducts) {
        if (this.provisionedProducts == null) {
            setProvisionedProducts(new java.util.ArrayList<ProvisionedProductDetail>(provisionedProducts.length));
        }
        for (ProvisionedProductDetail ele : provisionedProducts) {
            this.provisionedProducts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ProvisionedProduct detail objects.
     * </p>
     * 
     * @param provisionedProducts
     *        A list of ProvisionedProduct detail objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanProvisionedProductsResult withProvisionedProducts(java.util.Collection<ProvisionedProductDetail> provisionedProducts) {
        setProvisionedProducts(provisionedProducts);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @return The page token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanProvisionedProductsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProvisionedProducts() != null)
            sb.append("ProvisionedProducts: " + getProvisionedProducts() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanProvisionedProductsResult == false)
            return false;
        ScanProvisionedProductsResult other = (ScanProvisionedProductsResult) obj;
        if (other.getProvisionedProducts() == null ^ this.getProvisionedProducts() == null)
            return false;
        if (other.getProvisionedProducts() != null && other.getProvisionedProducts().equals(this.getProvisionedProducts()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedProducts() == null) ? 0 : getProvisionedProducts().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ScanProvisionedProductsResult clone() {
        try {
            return (ScanProvisionedProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
