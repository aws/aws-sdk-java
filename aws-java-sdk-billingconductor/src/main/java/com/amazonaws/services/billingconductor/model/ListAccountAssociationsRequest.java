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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListAccountAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The preferred billing period to get account associations.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * The filter on the account ID of the linked account, or any of the following:
     * </p>
     * <p>
     * <code>MONITORED</code>: linked accounts that are associated to billing groups.
     * </p>
     * <p>
     * <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     * </p>
     * <p>
     * <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     * </p>
     */
    private ListAccountAssociationsFilter filters;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The preferred billing period to get account associations.
     * </p>
     * 
     * @param billingPeriod
     *        The preferred billing period to get account associations.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The preferred billing period to get account associations.
     * </p>
     * 
     * @return The preferred billing period to get account associations.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The preferred billing period to get account associations.
     * </p>
     * 
     * @param billingPeriod
     *        The preferred billing period to get account associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssociationsRequest withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * The filter on the account ID of the linked account, or any of the following:
     * </p>
     * <p>
     * <code>MONITORED</code>: linked accounts that are associated to billing groups.
     * </p>
     * <p>
     * <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     * </p>
     * <p>
     * <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     * </p>
     * 
     * @param filters
     *        The filter on the account ID of the linked account, or any of the following:</p>
     *        <p>
     *        <code>MONITORED</code>: linked accounts that are associated to billing groups.
     *        </p>
     *        <p>
     *        <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     *        </p>
     *        <p>
     *        <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     */

    public void setFilters(ListAccountAssociationsFilter filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The filter on the account ID of the linked account, or any of the following:
     * </p>
     * <p>
     * <code>MONITORED</code>: linked accounts that are associated to billing groups.
     * </p>
     * <p>
     * <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     * </p>
     * <p>
     * <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     * </p>
     * 
     * @return The filter on the account ID of the linked account, or any of the following:</p>
     *         <p>
     *         <code>MONITORED</code>: linked accounts that are associated to billing groups.
     *         </p>
     *         <p>
     *         <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     *         </p>
     *         <p>
     *         <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     */

    public ListAccountAssociationsFilter getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The filter on the account ID of the linked account, or any of the following:
     * </p>
     * <p>
     * <code>MONITORED</code>: linked accounts that are associated to billing groups.
     * </p>
     * <p>
     * <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     * </p>
     * <p>
     * <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     * </p>
     * 
     * @param filters
     *        The filter on the account ID of the linked account, or any of the following:</p>
     *        <p>
     *        <code>MONITORED</code>: linked accounts that are associated to billing groups.
     *        </p>
     *        <p>
     *        <code>UNMONITORED</code>: linked accounts that aren't associated to billing groups.
     *        </p>
     *        <p>
     *        <code>Billing Group Arn</code>: linked accounts that are associated to the provided billing group Arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssociationsRequest withFilters(ListAccountAssociationsFilter filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve accounts.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to retrieve accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve accounts.
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to retrieve accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to retrieve accounts.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to retrieve accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssociationsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListAccountAssociationsRequest == false)
            return false;
        ListAccountAssociationsRequest other = (ListAccountAssociationsRequest) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountAssociationsRequest clone() {
        return (ListAccountAssociationsRequest) super.clone();
    }

}
