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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListCustomLineItems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomLineItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The preferred billing period to get custom line items (FFLIs).
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * The maximum number of billing groups to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group Amazon
     * Resource Names (ARNs) to retrieve FFLI information.
     * </p>
     */
    private ListCustomLineItemsFilter filters;

    /**
     * <p>
     * The preferred billing period to get custom line items (FFLIs).
     * </p>
     * 
     * @param billingPeriod
     *        The preferred billing period to get custom line items (FFLIs).
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The preferred billing period to get custom line items (FFLIs).
     * </p>
     * 
     * @return The preferred billing period to get custom line items (FFLIs).
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The preferred billing period to get custom line items (FFLIs).
     * </p>
     * 
     * @param billingPeriod
     *        The preferred billing period to get custom line items (FFLIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsRequest withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * The maximum number of billing groups to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of billing groups to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of billing groups to retrieve.
     * </p>
     * 
     * @return The maximum number of billing groups to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of billing groups to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of billing groups to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get custom line items (FFLIs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group Amazon
     * Resource Names (ARNs) to retrieve FFLI information.
     * </p>
     * 
     * @param filters
     *        A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group
     *        Amazon Resource Names (ARNs) to retrieve FFLI information.
     */

    public void setFilters(ListCustomLineItemsFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group Amazon
     * Resource Names (ARNs) to retrieve FFLI information.
     * </p>
     * 
     * @return A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group
     *         Amazon Resource Names (ARNs) to retrieve FFLI information.
     */

    public ListCustomLineItemsFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group Amazon
     * Resource Names (ARNs) to retrieve FFLI information.
     * </p>
     * 
     * @param filters
     *        A <code>ListCustomLineItemsFilter</code> that specifies the custom line item names and/or billing group
     *        Amazon Resource Names (ARNs) to retrieve FFLI information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomLineItemsRequest withFilters(ListCustomLineItemsFilter filters) {
        setFilters(filters);
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
        if (getBillingPeriod() != null)
            sb.append("BillingPeriod: ").append(getBillingPeriod()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomLineItemsRequest == false)
            return false;
        ListCustomLineItemsRequest other = (ListCustomLineItemsRequest) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingPeriod() == null) ? 0 : getBillingPeriod().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomLineItemsRequest clone() {
        return (ListCustomLineItemsRequest) super.clone();
    }

}
