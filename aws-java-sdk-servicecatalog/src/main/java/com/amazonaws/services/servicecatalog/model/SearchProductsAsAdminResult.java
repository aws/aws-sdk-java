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
public class SearchProductsAsAdminResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of detailed product view information objects.
     * </p>
     */
    private java.util.List<ProductViewDetail> productViewDetails;
    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * List of detailed product view information objects.
     * </p>
     * 
     * @return List of detailed product view information objects.
     */

    public java.util.List<ProductViewDetail> getProductViewDetails() {
        return productViewDetails;
    }

    /**
     * <p>
     * List of detailed product view information objects.
     * </p>
     * 
     * @param productViewDetails
     *        List of detailed product view information objects.
     */

    public void setProductViewDetails(java.util.Collection<ProductViewDetail> productViewDetails) {
        if (productViewDetails == null) {
            this.productViewDetails = null;
            return;
        }

        this.productViewDetails = new java.util.ArrayList<ProductViewDetail>(productViewDetails);
    }

    /**
     * <p>
     * List of detailed product view information objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductViewDetails(java.util.Collection)} or {@link #withProductViewDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productViewDetails
     *        List of detailed product view information objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminResult withProductViewDetails(ProductViewDetail... productViewDetails) {
        if (this.productViewDetails == null) {
            setProductViewDetails(new java.util.ArrayList<ProductViewDetail>(productViewDetails.length));
        }
        for (ProductViewDetail ele : productViewDetails) {
            this.productViewDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of detailed product view information objects.
     * </p>
     * 
     * @param productViewDetails
     *        List of detailed product view information objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsAsAdminResult withProductViewDetails(java.util.Collection<ProductViewDetail> productViewDetails) {
        setProductViewDetails(productViewDetails);
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

    public SearchProductsAsAdminResult withNextPageToken(String nextPageToken) {
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
        if (getProductViewDetails() != null)
            sb.append("ProductViewDetails: " + getProductViewDetails() + ",");
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

        if (obj instanceof SearchProductsAsAdminResult == false)
            return false;
        SearchProductsAsAdminResult other = (SearchProductsAsAdminResult) obj;
        if (other.getProductViewDetails() == null ^ this.getProductViewDetails() == null)
            return false;
        if (other.getProductViewDetails() != null && other.getProductViewDetails().equals(this.getProductViewDetails()) == false)
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

        hashCode = prime * hashCode + ((getProductViewDetails() == null) ? 0 : getProductViewDetails().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchProductsAsAdminResult clone() {
        try {
            return (SearchProductsAsAdminResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
