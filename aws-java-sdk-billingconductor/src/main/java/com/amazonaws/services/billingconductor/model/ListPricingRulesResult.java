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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricingRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The billing period for which the described pricing rules are applicable.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * A list containing the described pricing rules.
     * </p>
     */
    private java.util.List<PricingRuleListElement> pricingRules;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing rules.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The billing period for which the described pricing rules are applicable.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the described pricing rules are applicable.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the described pricing rules are applicable.
     * </p>
     * 
     * @return The billing period for which the described pricing rules are applicable.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the described pricing rules are applicable.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the described pricing rules are applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesResult withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * A list containing the described pricing rules.
     * </p>
     * 
     * @return A list containing the described pricing rules.
     */

    public java.util.List<PricingRuleListElement> getPricingRules() {
        return pricingRules;
    }

    /**
     * <p>
     * A list containing the described pricing rules.
     * </p>
     * 
     * @param pricingRules
     *        A list containing the described pricing rules.
     */

    public void setPricingRules(java.util.Collection<PricingRuleListElement> pricingRules) {
        if (pricingRules == null) {
            this.pricingRules = null;
            return;
        }

        this.pricingRules = new java.util.ArrayList<PricingRuleListElement>(pricingRules);
    }

    /**
     * <p>
     * A list containing the described pricing rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingRules(java.util.Collection)} or {@link #withPricingRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pricingRules
     *        A list containing the described pricing rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesResult withPricingRules(PricingRuleListElement... pricingRules) {
        if (this.pricingRules == null) {
            setPricingRules(new java.util.ArrayList<PricingRuleListElement>(pricingRules.length));
        }
        for (PricingRuleListElement ele : pricingRules) {
            this.pricingRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the described pricing rules.
     * </p>
     * 
     * @param pricingRules
     *        A list containing the described pricing rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesResult withPricingRules(java.util.Collection<PricingRuleListElement> pricingRules) {
        setPricingRules(pricingRules);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing rules.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get pricing rules.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing rules.
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to get pricing rules.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get pricing rules.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get pricing rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesResult withNextToken(String nextToken) {
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
        if (getPricingRules() != null)
            sb.append("PricingRules: ").append(getPricingRules()).append(",");
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

        if (obj instanceof ListPricingRulesResult == false)
            return false;
        ListPricingRulesResult other = (ListPricingRulesResult) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getPricingRules() == null ^ this.getPricingRules() == null)
            return false;
        if (other.getPricingRules() != null && other.getPricingRules().equals(this.getPricingRules()) == false)
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
        hashCode = prime * hashCode + ((getPricingRules() == null) ? 0 : getPricingRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPricingRulesResult clone() {
        try {
            return (ListPricingRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
