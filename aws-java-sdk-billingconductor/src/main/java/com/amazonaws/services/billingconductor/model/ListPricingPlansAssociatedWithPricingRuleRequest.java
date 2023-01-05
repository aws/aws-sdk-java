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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListPricingPlansAssociatedWithPricingRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPricingPlansAssociatedWithPricingRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The optional maximum number of pricing rule associations to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The optional pagination token returned by a previous call.
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

    public ListPricingPlansAssociatedWithPricingRuleRequest withBillingPeriod(String billingPeriod) {
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

    public ListPricingPlansAssociatedWithPricingRuleRequest withPricingRuleArn(String pricingRuleArn) {
        setPricingRuleArn(pricingRuleArn);
        return this;
    }

    /**
     * <p>
     * The optional maximum number of pricing rule associations to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The optional maximum number of pricing rule associations to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The optional maximum number of pricing rule associations to retrieve.
     * </p>
     * 
     * @return The optional maximum number of pricing rule associations to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The optional maximum number of pricing rule associations to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The optional maximum number of pricing rule associations to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The optional pagination token returned by a previous call.
     * </p>
     * 
     * @param nextToken
     *        The optional pagination token returned by a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The optional pagination token returned by a previous call.
     * </p>
     * 
     * @return The optional pagination token returned by a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The optional pagination token returned by a previous call.
     * </p>
     * 
     * @param nextToken
     *        The optional pagination token returned by a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPricingPlansAssociatedWithPricingRuleRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListPricingPlansAssociatedWithPricingRuleRequest == false)
            return false;
        ListPricingPlansAssociatedWithPricingRuleRequest other = (ListPricingPlansAssociatedWithPricingRuleRequest) obj;
        if (other.getBillingPeriod() == null ^ this.getBillingPeriod() == null)
            return false;
        if (other.getBillingPeriod() != null && other.getBillingPeriod().equals(this.getBillingPeriod()) == false)
            return false;
        if (other.getPricingRuleArn() == null ^ this.getPricingRuleArn() == null)
            return false;
        if (other.getPricingRuleArn() != null && other.getPricingRuleArn().equals(this.getPricingRuleArn()) == false)
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
        hashCode = prime * hashCode + ((getPricingRuleArn() == null) ? 0 : getPricingRuleArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPricingPlansAssociatedWithPricingRuleRequest clone() {
        return (ListPricingPlansAssociatedWithPricingRuleRequest) super.clone();
    }

}
