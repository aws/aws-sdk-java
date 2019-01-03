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
package com.amazonaws.services.marketplaceentitlement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The GetEntitlementsRequest contains parameters for the GetEntitlements operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/GetEntitlements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntitlementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS
     * Marketplace when the product listing is created.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described
     * as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the value list, and
     * then <i>intersected</i> for each filter key.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filter;
    /**
     * <p>
     * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken
     * field in subsequent calls to GetEntitlements.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS
     * Marketplace when the product listing is created.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided
     *        by AWS Marketplace when the product listing is created.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS
     * Marketplace when the product listing is created.
     * </p>
     * 
     * @return Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided
     *         by AWS Marketplace when the product listing is created.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS
     * Marketplace when the product listing is created.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided
     *        by AWS Marketplace when the product listing is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsRequest withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described
     * as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the value list, and
     * then <i>intersected</i> for each filter key.
     * </p>
     * 
     * @return Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are
     *         described as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the
     *         value list, and then <i>intersected</i> for each filter key.
     */

    public java.util.Map<String, java.util.List<String>> getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described
     * as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the value list, and
     * then <i>intersected</i> for each filter key.
     * </p>
     * 
     * @param filter
     *        Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are
     *        described as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the
     *        value list, and then <i>intersected</i> for each filter key.
     */

    public void setFilter(java.util.Map<String, java.util.List<String>> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described
     * as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the value list, and
     * then <i>intersected</i> for each filter key.
     * </p>
     * 
     * @param filter
     *        Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are
     *        described as keys mapped to a lists of values. Filtered requests are <i>unioned</i> for each value in the
     *        value list, and then <i>intersected</i> for each filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsRequest withFilter(java.util.Map<String, java.util.List<String>> filter) {
        setFilter(filter);
        return this;
    }

    public GetEntitlementsRequest addFilterEntry(String key, java.util.List<String> value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsRequest clearFilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     * </p>
     * 
     * @param nextToken
     *        For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     * </p>
     * 
     * @return For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     * </p>
     * 
     * @param nextToken
     *        For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken
     * field in subsequent calls to GetEntitlements.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the
     *        NextToken field in subsequent calls to GetEntitlements.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken
     * field in subsequent calls to GetEntitlements.
     * </p>
     * 
     * @return The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the
     *         NextToken field in subsequent calls to GetEntitlements.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken
     * field in subsequent calls to GetEntitlements.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the
     *        NextToken field in subsequent calls to GetEntitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitlementsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEntitlementsRequest == false)
            return false;
        GetEntitlementsRequest other = (GetEntitlementsRequest) obj;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetEntitlementsRequest clone() {
        return (GetEntitlementsRequest) super.clone();
    }

}
