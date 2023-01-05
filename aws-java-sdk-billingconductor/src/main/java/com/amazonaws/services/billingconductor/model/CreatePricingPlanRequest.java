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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePricingPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the pricing plan. The names must be unique to each pricing plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * </p>
     */
    private java.util.List<String> pricingRuleArns;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @return The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *         implemented in a future update.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the pricing plan. The names must be unique to each pricing plan.
     * </p>
     * 
     * @param name
     *        The name of the pricing plan. The names must be unique to each pricing plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pricing plan. The names must be unique to each pricing plan.
     * </p>
     * 
     * @return The name of the pricing plan. The names must be unique to each pricing plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pricing plan. The names must be unique to each pricing plan.
     * </p>
     * 
     * @param name
     *        The name of the pricing plan. The names must be unique to each pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     * 
     * @param description
     *        The description of the pricing plan.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     * 
     * @return The description of the pricing plan.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the pricing plan.
     * </p>
     * 
     * @param description
     *        The description of the pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     */

    public java.util.List<String> getPricingRuleArns() {
        return pricingRuleArns;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
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
     * A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingRuleArns(java.util.Collection)} or {@link #withPricingRuleArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest withPricingRuleArns(String... pricingRuleArns) {
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
     * A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * </p>
     * 
     * @param pricingRuleArns
     *        A list of Amazon Resource Names (ARNs) that define the pricing plan parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest withPricingRuleArns(java.util.Collection<String> pricingRuleArns) {
        setPricingRuleArns(pricingRuleArns);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to a pricing plan.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a pricing plan.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePricingPlanRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingPlanRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getPricingRuleArns() != null)
            sb.append("PricingRuleArns: ").append(getPricingRuleArns()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePricingPlanRequest == false)
            return false;
        CreatePricingPlanRequest other = (CreatePricingPlanRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPricingRuleArns() == null ^ this.getPricingRuleArns() == null)
            return false;
        if (other.getPricingRuleArns() != null && other.getPricingRuleArns().equals(this.getPricingRuleArns()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPricingRuleArns() == null) ? 0 : getPricingRuleArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePricingPlanRequest clone() {
        return (CreatePricingPlanRequest) super.clone();
    }

}
