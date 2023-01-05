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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricingPlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The preferred billing period to get pricing plan.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to retrieve
     * pricing plans information.
     * </p>
     */
    private ListPricingPlansFilter filters;
    /**
     * <p>
     * The maximum number of pricing plans to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that's used on subsequent call to get pricing plans.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The preferred billing period to get pricing plan.
     * </p>
     * 
     * @param billingPeriod
     *        The preferred billing period to get pricing plan.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The preferred billing period to get pricing plan.
     * </p>
     * 
     * @return The preferred billing period to get pricing plan.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The preferred billing period to get pricing plan.
     * </p>
     * 
     * @param billingPeriod
     *        The preferred billing period to get pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansRequest withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to retrieve
     * pricing plans information.
     * </p>
     * 
     * @param filters
     *        A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to
     *        retrieve pricing plans information.
     */

    public void setFilters(ListPricingPlansFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to retrieve
     * pricing plans information.
     * </p>
     * 
     * @return A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to
     *         retrieve pricing plans information.
     */

    public ListPricingPlansFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to retrieve
     * pricing plans information.
     * </p>
     * 
     * @param filters
     *        A <code>ListPricingPlansFilter</code> that specifies the Amazon Resource Name (ARNs) of pricing plans to
     *        retrieve pricing plans information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansRequest withFilters(ListPricingPlansFilter filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of pricing plans to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pricing plans to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of pricing plans to retrieve.
     * </p>
     * 
     * @return The maximum number of pricing plans to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of pricing plans to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pricing plans to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent call to get pricing plans.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent call to get pricing plans.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent call to get pricing plans.
     * </p>
     * 
     * @return The pagination token that's used on subsequent call to get pricing plans.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent call to get pricing plans.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent call to get pricing plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansRequest withNextToken(String nextToken) {
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
        if (getBillingPeriod() != null)
            sb.append("BillingPeriod: ").append(getBillingPeriod()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListPricingPlansRequest == false)
            return false;
        ListPricingPlansRequest other = (ListPricingPlansRequest) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getBillingPeriod() == null) ? 0 : getBillingPeriod().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPricingPlansRequest clone() {
        return (ListPricingPlansRequest) super.clone();
    }

}
