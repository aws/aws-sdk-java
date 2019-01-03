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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProducts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchProductsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the product views.
     * </p>
     */
    private java.util.List<ProductViewSummary> productViewSummaries;
    /**
     * <p>
     * The product view aggregations.
     * </p>
     */
    private java.util.Map<String, java.util.List<ProductViewAggregationValue>> productViewAggregations;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the product views.
     * </p>
     * 
     * @return Information about the product views.
     */

    public java.util.List<ProductViewSummary> getProductViewSummaries() {
        return productViewSummaries;
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     * 
     * @param productViewSummaries
     *        Information about the product views.
     */

    public void setProductViewSummaries(java.util.Collection<ProductViewSummary> productViewSummaries) {
        if (productViewSummaries == null) {
            this.productViewSummaries = null;
            return;
        }

        this.productViewSummaries = new java.util.ArrayList<ProductViewSummary>(productViewSummaries);
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductViewSummaries(java.util.Collection)} or {@link #withProductViewSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param productViewSummaries
     *        Information about the product views.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsResult withProductViewSummaries(ProductViewSummary... productViewSummaries) {
        if (this.productViewSummaries == null) {
            setProductViewSummaries(new java.util.ArrayList<ProductViewSummary>(productViewSummaries.length));
        }
        for (ProductViewSummary ele : productViewSummaries) {
            this.productViewSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the product views.
     * </p>
     * 
     * @param productViewSummaries
     *        Information about the product views.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsResult withProductViewSummaries(java.util.Collection<ProductViewSummary> productViewSummaries) {
        setProductViewSummaries(productViewSummaries);
        return this;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     * 
     * @return The product view aggregations.
     */

    public java.util.Map<String, java.util.List<ProductViewAggregationValue>> getProductViewAggregations() {
        return productViewAggregations;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     * 
     * @param productViewAggregations
     *        The product view aggregations.
     */

    public void setProductViewAggregations(java.util.Map<String, java.util.List<ProductViewAggregationValue>> productViewAggregations) {
        this.productViewAggregations = productViewAggregations;
    }

    /**
     * <p>
     * The product view aggregations.
     * </p>
     * 
     * @param productViewAggregations
     *        The product view aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsResult withProductViewAggregations(java.util.Map<String, java.util.List<ProductViewAggregationValue>> productViewAggregations) {
        setProductViewAggregations(productViewAggregations);
        return this;
    }

    public SearchProductsResult addProductViewAggregationsEntry(String key, java.util.List<ProductViewAggregationValue> value) {
        if (null == this.productViewAggregations) {
            this.productViewAggregations = new java.util.HashMap<String, java.util.List<ProductViewAggregationValue>>();
        }
        if (this.productViewAggregations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.productViewAggregations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProductViewAggregations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsResult clearProductViewAggregationsEntries() {
        this.productViewAggregations = null;
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProductsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getProductViewSummaries() != null)
            sb.append("ProductViewSummaries: ").append(getProductViewSummaries()).append(",");
        if (getProductViewAggregations() != null)
            sb.append("ProductViewAggregations: ").append(getProductViewAggregations()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchProductsResult == false)
            return false;
        SearchProductsResult other = (SearchProductsResult) obj;
        if (other.getProductViewSummaries() == null ^ this.getProductViewSummaries() == null)
            return false;
        if (other.getProductViewSummaries() != null && other.getProductViewSummaries().equals(this.getProductViewSummaries()) == false)
            return false;
        if (other.getProductViewAggregations() == null ^ this.getProductViewAggregations() == null)
            return false;
        if (other.getProductViewAggregations() != null && other.getProductViewAggregations().equals(this.getProductViewAggregations()) == false)
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

        hashCode = prime * hashCode + ((getProductViewSummaries() == null) ? 0 : getProductViewSummaries().hashCode());
        hashCode = prime * hashCode + ((getProductViewAggregations() == null) ? 0 : getProductViewAggregations().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchProductsResult clone() {
        try {
            return (SearchProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
