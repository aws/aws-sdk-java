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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlansAssociatedWithPricingRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricingPlansAssociatedWithPricingRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The pricing plan billing period for which associations will be listed.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     * </p>
     */
    private String pricingRuleArn;
    /**
     * <p>
     * The list containing pricing plans that are associated with the requested pricing rule.
     * </p>
     */
    private java.util.List<String> pricingPlanArns;
    /**
     * <p>
     * The pagination token to be used on subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The pricing plan billing period for which associations will be listed.
     * </p>
     * 
     * @param billingPeriod
     *        The pricing plan billing period for which associations will be listed.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The pricing plan billing period for which associations will be listed.
     * </p>
     * 
     * @return The pricing plan billing period for which associations will be listed.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The pricing plan billing period for which associations will be listed.
     * </p>
     * 
     * @param billingPeriod
     *        The pricing plan billing period for which associations will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleResult withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     * </p>
     * 
     * @param pricingRuleArn
     *        The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     */

    public void setPricingRuleArn(String pricingRuleArn) {
        this.pricingRuleArn = pricingRuleArn;
    }

    /**
     * <p>
     * The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     * </p>
     * 
     * @return The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     */

    public String getPricingRuleArn() {
        return this.pricingRuleArn;
    }

    /**
     * <p>
     * The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     * </p>
     * 
     * @param pricingRuleArn
     *        The pricing rule Amazon Resource Name (ARN) for which associations will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleResult withPricingRuleArn(String pricingRuleArn) {
        setPricingRuleArn(pricingRuleArn);
        return this;
    }

    /**
     * <p>
     * The list containing pricing plans that are associated with the requested pricing rule.
     * </p>
     * 
     * @return The list containing pricing plans that are associated with the requested pricing rule.
     */

    public java.util.List<String> getPricingPlanArns() {
        return pricingPlanArns;
    }

    /**
     * <p>
     * The list containing pricing plans that are associated with the requested pricing rule.
     * </p>
     * 
     * @param pricingPlanArns
     *        The list containing pricing plans that are associated with the requested pricing rule.
     */

    public void setPricingPlanArns(java.util.Collection<String> pricingPlanArns) {
        if (pricingPlanArns == null) {
            this.pricingPlanArns = null;
            return;
        }

        this.pricingPlanArns = new java.util.ArrayList<String>(pricingPlanArns);
    }

    /**
     * <p>
     * The list containing pricing plans that are associated with the requested pricing rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingPlanArns(java.util.Collection)} or {@link #withPricingPlanArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pricingPlanArns
     *        The list containing pricing plans that are associated with the requested pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleResult withPricingPlanArns(String... pricingPlanArns) {
        if (this.pricingPlanArns == null) {
            setPricingPlanArns(new java.util.ArrayList<String>(pricingPlanArns.length));
        }
        for (String ele : pricingPlanArns) {
            this.pricingPlanArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list containing pricing plans that are associated with the requested pricing rule.
     * </p>
     * 
     * @param pricingPlanArns
     *        The list containing pricing plans that are associated with the requested pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleResult withPricingPlanArns(java.util.Collection<String> pricingPlanArns) {
        setPricingPlanArns(pricingPlanArns);
        return this;
    }

    /**
     * <p>
     * The pagination token to be used on subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to be used on subsequent calls.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to be used on subsequent calls.
     * </p>
     * 
     * @return The pagination token to be used on subsequent calls.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to be used on subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to be used on subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleResult withNextToken(String nextToken) {
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
        if (getPricingRuleArn() != null)
            sb.append("PricingRuleArn: ").append(getPricingRuleArn()).append(",");
        if (getPricingPlanArns() != null)
            sb.append("PricingPlanArns: ").append(getPricingPlanArns()).append(",");
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

        if (obj instanceof ListPricingPlansAssociatedWithPricingRuleResult == false)
            return false;
        ListPricingPlansAssociatedWithPricingRuleResult other = (ListPricingPlansAssociatedWithPricingRuleResult) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getPricingRuleArn() == null ^ this.getPricingRuleArn() == null)
            return false;
        if (other.getPricingRuleArn() != null && other.getPricingRuleArn().equals(this.getPricingRuleArn()) == false)
            return false;
        if (other.getPricingPlanArns() == null ^ this.getPricingPlanArns() == null)
            return false;
        if (other.getPricingPlanArns() != null && other.getPricingPlanArns().equals(this.getPricingPlanArns()) == false)
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
        hashCode = prime * hashCode + ((getPricingRuleArn() == null) ? 0 : getPricingRuleArn().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanArns() == null) ? 0 : getPricingPlanArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPricingPlansAssociatedWithPricingRuleResult clone() {
        try {
            return (ListPricingPlansAssociatedWithPricingRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
