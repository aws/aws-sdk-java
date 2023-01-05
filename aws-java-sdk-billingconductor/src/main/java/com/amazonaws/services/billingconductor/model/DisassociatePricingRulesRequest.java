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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/DisassociatePricingRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociatePricingRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * </p>
     */
    private java.util.List<String> pricingRuleArns;

    /**
     * <p>
     * The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     * </p>
     * 
     * @param arn
     *        The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     * </p>
     * 
     * @return The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     * </p>
     * 
     * @param arn
     *        The pricing plan Amazon Resource Name (ARN) to disassociate pricing rules from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePricingRulesRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * </p>
     * 
     * @return A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     */

    public java.util.List<String> getPricingRuleArns() {
        return pricingRuleArns;
    }

    /**
     * <p>
     * A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
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
     * A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingRuleArns(java.util.Collection)} or {@link #withPricingRuleArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePricingRulesRequest withPricingRuleArns(String... pricingRuleArns) {
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
     * A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list containing the Amazon Resource Name (ARN) of the pricing rules that will be disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociatePricingRulesRequest withPricingRuleArns(java.util.Collection<String> pricingRuleArns) {
        setPricingRuleArns(pricingRuleArns);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPricingRuleArns() != null)
            sb.append("PricingRuleArns: ").append(getPricingRuleArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociatePricingRulesRequest == false)
            return false;
        DisassociatePricingRulesRequest other = (DisassociatePricingRulesRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPricingRuleArns() == null ^ this.getPricingRuleArns() == null)
            return false;
        if (other.getPricingRuleArns() != null && other.getPricingRuleArns().equals(this.getPricingRuleArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPricingRuleArns() == null) ? 0 : getPricingRuleArns().hashCode());
        return hashCode;
    }

    @Override
    public DisassociatePricingRulesRequest clone() {
        return (DisassociatePricingRulesRequest) super.clone();
    }

}
