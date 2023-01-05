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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingRulesAssociatedToPricingPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricingRulesAssociatedToPricingPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The billing period for which the pricing rule associations are listed.
     * </p>
     */
    private String billingPeriod;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     * </p>
     */
    private String pricingPlanArn;
    /**
     * <p>
     * A list containing pricing rules that are associated with the requested pricing plan.
     * </p>
     */
    private java.util.List<String> pricingRuleArns;
    /**
     * <p>
     * The pagination token to be used on subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The billing period for which the pricing rule associations are listed.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the pricing rule associations are listed.
     */

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the pricing rule associations are listed.
     * </p>
     * 
     * @return The billing period for which the pricing rule associations are listed.
     */

    public String getBillingPeriod() {
        return this.billingPeriod;
    }

    /**
     * <p>
     * The billing period for which the pricing rule associations are listed.
     * </p>
     * 
     * @param billingPeriod
     *        The billing period for which the pricing rule associations are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesAssociatedToPricingPlanResult withBillingPeriod(String billingPeriod) {
        setBillingPeriod(billingPeriod);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     * </p>
     * 
     * @param pricingPlanArn
     *        The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     */

    public void setPricingPlanArn(String pricingPlanArn) {
        this.pricingPlanArn = pricingPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     */

    public String getPricingPlanArn() {
        return this.pricingPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     * </p>
     * 
     * @param pricingPlanArn
     *        The Amazon Resource Name (ARN) of the pricing plan for which associations are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesAssociatedToPricingPlanResult withPricingPlanArn(String pricingPlanArn) {
        setPricingPlanArn(pricingPlanArn);
        return this;
    }

    /**
     * <p>
     * A list containing pricing rules that are associated with the requested pricing plan.
     * </p>
     * 
     * @return A list containing pricing rules that are associated with the requested pricing plan.
     */

    public java.util.List<String> getPricingRuleArns() {
        return pricingRuleArns;
    }

    /**
     * <p>
     * A list containing pricing rules that are associated with the requested pricing plan.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list containing pricing rules that are associated with the requested pricing plan.
     */

    public void setPricingRuleArns(java.util.Collection<String> pricingRuleArns) {
        if (pricingRuleArns == null) {
            this.pricingRuleArns = null;
            return;
        }

        this.pricingRuleArns = new java.util.ArrayList<String>(pricingRuleArns);
    }

    /**
     * <p>
     * A list containing pricing rules that are associated with the requested pricing plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingRuleArns(java.util.Collection)} or {@link #withPricingRuleArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list containing pricing rules that are associated with the requested pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesAssociatedToPricingPlanResult withPricingRuleArns(String... pricingRuleArns) {
        if (this.pricingRuleArns == null) {
            setPricingRuleArns(new java.util.ArrayList<String>(pricingRuleArns.length));
        }
        for (String ele : pricingRuleArns) {
            this.pricingRuleArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing pricing rules that are associated with the requested pricing plan.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list containing pricing rules that are associated with the requested pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingRulesAssociatedToPricingPlanResult withPricingRuleArns(java.util.Collection<String> pricingRuleArns) {
        setPricingRuleArns(pricingRuleArns);
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

    public ListPricingRulesAssociatedToPricingPlanResult withNextToken(String nextToken) {
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
        if (getPricingPlanArn() != null)
            sb.append("PricingPlanArn: ").append(getPricingPlanArn()).append(",");
        if (getPricingRuleArns() != null)
            sb.append("PricingRuleArns: ").append(getPricingRuleArns()).append(",");
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

        if (obj instanceof ListPricingRulesAssociatedToPricingPlanResult == false)
            return false;
        ListPricingRulesAssociatedToPricingPlanResult other = (ListPricingRulesAssociatedToPricingPlanResult) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getPricingPlanArn() == null ^ this.getPricingPlanArn() == null)
            return false;
        if (other.getPricingPlanArn() != null && other.getPricingPlanArn().equals(this.getPricingPlanArn()) == false)
            return false;
        if (other.getPricingRuleArns() == null ^ this.getPricingRuleArns() == null)
            return false;
        if (other.getPricingRuleArns() != null && other.getPricingRuleArns().equals(this.getPricingRuleArns()) == false)
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
        hashCode = prime * hashCode + ((getPricingPlanArn() == null) ? 0 : getPricingPlanArn().hashCode());
        hashCode = prime * hashCode + ((getPricingRuleArns() == null) ? 0 : getPricingRuleArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPricingRulesAssociatedToPricingPlanResult clone() {
        try {
            return (ListPricingRulesAssociatedToPricingPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
