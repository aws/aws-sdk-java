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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricingPlansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The billing period for which the described pricing plans are applicable.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * A list of <code>PricingPlanListElement</code> retrieved.
     * </p>
     */
    private java.util.List<PricingPlanListElement> pricingPlans;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing plans.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The billing period for which the described pricing plans are applicable.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the described pricing plans are applicable.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the described pricing plans are applicable.
     * </p>
     * 
     * @return The billing period for which the described pricing plans are applicable.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the described pricing plans are applicable.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the described pricing plans are applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansResult withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * A list of <code>PricingPlanListElement</code> retrieved.
     * </p>
     * 
     * @return A list of <code>PricingPlanListElement</code> retrieved.
     */

    public java.util.List<PricingPlanListElement> getPricingPlans() {
        return pricingPlans;
    }

    /**
     * <p>
     * A list of <code>PricingPlanListElement</code> retrieved.
     * </p>
     * 
     * @param pricingPlans
     *        A list of <code>PricingPlanListElement</code> retrieved.
     */

    public void setPricingPlans(java.util.Collection<PricingPlanListElement> pricingPlans) {
        if (pricingPlans == null) {
            this.pricingPlans = null;
            return;
        }

        this.pricingPlans = new java.util.ArrayList<PricingPlanListElement>(pricingPlans);
    }

    /**
     * <p>
     * A list of <code>PricingPlanListElement</code> retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingPlans(java.util.Collection)} or {@link #withPricingPlans(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pricingPlans
     *        A list of <code>PricingPlanListElement</code> retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansResult withPricingPlans(PricingPlanListElement... pricingPlans) {
        if (this.pricingPlans == null) {
            setPricingPlans(new java.util.ArrayList<PricingPlanListElement>(pricingPlans.length));
        }
        for (PricingPlanListElement ele : pricingPlans) {
            this.pricingPlans.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>PricingPlanListElement</code> retrieved.
     * </p>
     * 
     * @param pricingPlans
     *        A list of <code>PricingPlanListElement</code> retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansResult withPricingPlans(java.util.Collection<PricingPlanListElement> pricingPlans) {
        setPricingPlans(pricingPlans);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing plans.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get pricing plans.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing plans.
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to get pricing plans.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing plans.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get pricing plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansResult withNextToken(String nextToken) {
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
        if (getPricingPlans() != null)
            sb.append("PricingPlans: ").append(getPricingPlans()).append(",");
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

        if (obj instanceof ListPricingPlansResult == false)
            return false;
        ListPricingPlansResult other = (ListPricingPlansResult) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getPricingPlans() == null ^ this.getPricingPlans() == null)
            return false;
        if (other.getPricingPlans() != null && other.getPricingPlans().equals(this.getPricingPlans()) == false)
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
        hashCode = prime * hashCode + ((getPricingPlans() == null) ? 0 : getPricingPlans().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPricingPlansResult clone() {
        try {
            return (ListPricingPlansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
