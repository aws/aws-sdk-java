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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesAssociatedToCustomLineItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The billing period for which the resource associations will be listed.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * The ARN of the custom line item for which the resource associations will be listed.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * (Optional) The maximum number of resource associations to be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) The pagination token that's returned by a previous request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of resources
     * that should be retrieved.
     * </p>
     */
    private ListResourcesAssociatedToCustomLineItemFilter filters;

    /**
     * <p>
     * The billing period for which the resource associations will be listed.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the resource associations will be listed.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the resource associations will be listed.
     * </p>
     * 
     * @return The billing period for which the resource associations will be listed.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the resource associations will be listed.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the resource associations will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemRequest withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * The ARN of the custom line item for which the resource associations will be listed.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom line item for which the resource associations will be listed.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the custom line item for which the resource associations will be listed.
     * </p>
     * 
     * @return The ARN of the custom line item for which the resource associations will be listed.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the custom line item for which the resource associations will be listed.
     * </p>
     * 
     * @param arn
     *        The ARN of the custom line item for which the resource associations will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource associations to be retrieved.
     * </p>
     * 
     * @param maxResults
     *        (Optional) The maximum number of resource associations to be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource associations to be retrieved.
     * </p>
     * 
     * @return (Optional) The maximum number of resource associations to be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource associations to be retrieved.
     * </p>
     * 
     * @param maxResults
     *        (Optional) The maximum number of resource associations to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) The pagination token that's returned by a previous request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) The pagination token that's returned by a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) The pagination token that's returned by a previous request.
     * </p>
     * 
     * @return (Optional) The pagination token that's returned by a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) The pagination token that's returned by a previous request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) The pagination token that's returned by a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of resources
     * that should be retrieved.
     * </p>
     * 
     * @param filters
     *        (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of
     *        resources that should be retrieved.
     */

    public void setFilters(ListResourcesAssociatedToCustomLineItemFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of resources
     * that should be retrieved.
     * </p>
     * 
     * @return (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of
     *         resources that should be retrieved.
     */

    public ListResourcesAssociatedToCustomLineItemFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of resources
     * that should be retrieved.
     * </p>
     * 
     * @param filters
     *        (Optional) A <code>ListResourcesAssociatedToCustomLineItemFilter</code> that can specify the types of
     *        resources that should be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemRequest withFilters(ListResourcesAssociatedToCustomLineItemFilter filters) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof ListResourcesAssociatedToCustomLineItemRequest == false)
            return false;
        ListResourcesAssociatedToCustomLineItemRequest other = (ListResourcesAssociatedToCustomLineItemRequest) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesAssociatedToCustomLineItemRequest clone() {
        return (ListResourcesAssociatedToCustomLineItemRequest) super.clone();
    }

}
