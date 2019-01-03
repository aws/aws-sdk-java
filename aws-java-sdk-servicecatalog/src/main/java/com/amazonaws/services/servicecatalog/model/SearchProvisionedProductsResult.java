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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SearchProvisionedProducts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchProvisionedProductsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the provisioned products.
     * </p>
     */
    private java.util.List<ProvisionedProductAttribute> provisionedProducts;
    /**
     * <p>
     * The number of provisioned products found.
     * </p>
     */
    private Integer totalResultsCount;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the provisioned products.
     * </p>
     * 
     * @return Information about the provisioned products.
     */

    public java.util.List<ProvisionedProductAttribute> getProvisionedProducts() {
        return provisionedProducts;
    }

    /**
     * <p>
     * Information about the provisioned products.
     * </p>
     * 
     * @param provisionedProducts
     *        Information about the provisioned products.
     */

    public void setProvisionedProducts(java.util.Collection<ProvisionedProductAttribute> provisionedProducts) {
        if (provisionedProducts == null) {
            this.provisionedProducts = null;
            return;
        }

        this.provisionedProducts = new java.util.ArrayList<ProvisionedProductAttribute>(provisionedProducts);
    }

    /**
     * <p>
     * Information about the provisioned products.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedProducts(java.util.Collection)} or {@link #withProvisionedProducts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param provisionedProducts
     *        Information about the provisioned products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsResult withProvisionedProducts(ProvisionedProductAttribute... provisionedProducts) {
        if (this.provisionedProducts == null) {
            setProvisionedProducts(new java.util.ArrayList<ProvisionedProductAttribute>(provisionedProducts.length));
        }
        for (ProvisionedProductAttribute ele : provisionedProducts) {
            this.provisionedProducts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the provisioned products.
     * </p>
     * 
     * @param provisionedProducts
     *        Information about the provisioned products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsResult withProvisionedProducts(java.util.Collection<ProvisionedProductAttribute> provisionedProducts) {
        setProvisionedProducts(provisionedProducts);
        return this;
    }

    /**
     * <p>
     * The number of provisioned products found.
     * </p>
     * 
     * @param totalResultsCount
     *        The number of provisioned products found.
     */

    public void setTotalResultsCount(Integer totalResultsCount) {
        this.totalResultsCount = totalResultsCount;
    }

    /**
     * <p>
     * The number of provisioned products found.
     * </p>
     * 
     * @return The number of provisioned products found.
     */

    public Integer getTotalResultsCount() {
        return this.totalResultsCount;
    }

    /**
     * <p>
     * The number of provisioned products found.
     * </p>
     * 
     * @param totalResultsCount
     *        The number of provisioned products found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProvisionedProductsResult withTotalResultsCount(Integer totalResultsCount) {
        setTotalResultsCount(totalResultsCount);
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

    public SearchProvisionedProductsResult withNextPageToken(String nextPageToken) {
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
        if (getProvisionedProducts() != null)
            sb.append("ProvisionedProducts: ").append(getProvisionedProducts()).append(",");
        if (getTotalResultsCount() != null)
            sb.append("TotalResultsCount: ").append(getTotalResultsCount()).append(",");
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

        if (obj instanceof SearchProvisionedProductsResult == false)
            return false;
        SearchProvisionedProductsResult other = (SearchProvisionedProductsResult) obj;
        if (other.getProvisionedProducts() == null ^ this.getProvisionedProducts() == null)
            return false;
        if (other.getProvisionedProducts() != null && other.getProvisionedProducts().equals(this.getProvisionedProducts()) == false)
            return false;
        if (other.getTotalResultsCount() == null ^ this.getTotalResultsCount() == null)
            return false;
        if (other.getTotalResultsCount() != null && other.getTotalResultsCount().equals(this.getTotalResultsCount()) == false)
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
        hashCode = prime * hashCode + ((getTotalResultsCount() == null) ? 0 : getTotalResultsCount().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchProvisionedProductsResult clone() {
        try {
            return (SearchProvisionedProductsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
