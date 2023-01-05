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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreatePricingRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePricingRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that's needed to support idempotency. Idempotency isn't currently supported, but will be implemented in
     * a future update.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The pricing rule name. The names must be unique to each pricing rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The pricing rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The type of pricing rule.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A percentage modifier that's applied on the public pricing rates.
     * </p>
     */
    private Double modifierPercentage;
    /**
     * <p>
     * If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service the
     * <code>PricingRule</code> is applicable for.
     * </p>
     */
    private String service;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling
     * services via Amazon Web Services Marketplace.
     * </p>
     */
    private String billingEntity;
    /**
     * <p>
     * The set of tiering configurations for the pricing rule.
     * </p>
     */
    private CreateTieringInput tiering;

    /**
     * <p>
     * The token that's needed to support idempotency. Idempotency isn't currently supported, but will be implemented in
     * a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that's needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token that's needed to support idempotency. Idempotency isn't currently supported, but will be implemented in
     * a future update.
     * </p>
     * 
     * @return The token that's needed to support idempotency. Idempotency isn't currently supported, but will be
     *         implemented in a future update.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token that's needed to support idempotency. Idempotency isn't currently supported, but will be implemented in
     * a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that's needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The pricing rule name. The names must be unique to each pricing rule.
     * </p>
     * 
     * @param name
     *        The pricing rule name. The names must be unique to each pricing rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The pricing rule name. The names must be unique to each pricing rule.
     * </p>
     * 
     * @return The pricing rule name. The names must be unique to each pricing rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The pricing rule name. The names must be unique to each pricing rule.
     * </p>
     * 
     * @param name
     *        The pricing rule name. The names must be unique to each pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The pricing rule description.
     * </p>
     * 
     * @param description
     *        The pricing rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The pricing rule description.
     * </p>
     * 
     * @return The pricing rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The pricing rule description.
     * </p>
     * 
     * @param description
     *        The pricing rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * </p>
     * 
     * @param scope
     *        The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * @see PricingRuleScope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * </p>
     * 
     * @return The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * @see PricingRuleScope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * </p>
     * 
     * @param scope
     *        The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingRuleScope
     */

    public CreatePricingRuleRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * </p>
     * 
     * @param scope
     *        The scope of pricing rule that indicates if it's globally applicable, or it's service-specific.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingRuleScope
     */

    public CreatePricingRuleRequest withScope(PricingRuleScope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The type of pricing rule.
     * </p>
     * 
     * @param type
     *        The type of pricing rule.
     * @see PricingRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of pricing rule.
     * </p>
     * 
     * @return The type of pricing rule.
     * @see PricingRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of pricing rule.
     * </p>
     * 
     * @param type
     *        The type of pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingRuleType
     */

    public CreatePricingRuleRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of pricing rule.
     * </p>
     * 
     * @param type
     *        The type of pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingRuleType
     */

    public CreatePricingRuleRequest withType(PricingRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A percentage modifier that's applied on the public pricing rates.
     * </p>
     * 
     * @param modifierPercentage
     *        A percentage modifier that's applied on the public pricing rates.
     */

    public void setModifierPercentage(Double modifierPercentage) {
        this.modifierPercentage = modifierPercentage;
    }

    /**
     * <p>
     * A percentage modifier that's applied on the public pricing rates.
     * </p>
     * 
     * @return A percentage modifier that's applied on the public pricing rates.
     */

    public Double getModifierPercentage() {
        return this.modifierPercentage;
    }

    /**
     * <p>
     * A percentage modifier that's applied on the public pricing rates.
     * </p>
     * 
     * @param modifierPercentage
     *        A percentage modifier that's applied on the public pricing rates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withModifierPercentage(Double modifierPercentage) {
        setModifierPercentage(modifierPercentage);
        return this;
    }

    /**
     * <p>
     * If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service the
     * <code>PricingRule</code> is applicable for.
     * </p>
     * 
     * @param service
     *        If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service
     *        the <code>PricingRule</code> is applicable for.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service the
     * <code>PricingRule</code> is applicable for.
     * </p>
     * 
     * @return If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service
     *         the <code>PricingRule</code> is applicable for.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service the
     * <code>PricingRule</code> is applicable for.
     * </p>
     * 
     * @param service
     *        If the <code>Scope</code> attribute is set to <code>SERVICE</code>, the attribute indicates which service
     *        the <code>PricingRule</code> is applicable for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to a pricing rule.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a pricing rule.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePricingRuleRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest addTagsEntry(String key, String value) {
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

    public CreatePricingRuleRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling
     * services via Amazon Web Services Marketplace.
     * </p>
     * 
     * @param billingEntity
     *        The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling
     *        services via Amazon Web Services Marketplace.
     */

    public void setBillingEntity(String billingEntity) {
        this.billingEntity = billingEntity;
    }

    /**
     * <p>
     * The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling
     * services via Amazon Web Services Marketplace.
     * </p>
     * 
     * @return The seller of services provided by Amazon Web Services, their affiliates, or third-party providers
     *         selling services via Amazon Web Services Marketplace.
     */

    public String getBillingEntity() {
        return this.billingEntity;
    }

    /**
     * <p>
     * The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling
     * services via Amazon Web Services Marketplace.
     * </p>
     * 
     * @param billingEntity
     *        The seller of services provided by Amazon Web Services, their affiliates, or third-party providers selling
     *        services via Amazon Web Services Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withBillingEntity(String billingEntity) {
        setBillingEntity(billingEntity);
        return this;
    }

    /**
     * <p>
     * The set of tiering configurations for the pricing rule.
     * </p>
     * 
     * @param tiering
     *        The set of tiering configurations for the pricing rule.
     */

    public void setTiering(CreateTieringInput tiering) {
        this.tiering = tiering;
    }

    /**
     * <p>
     * The set of tiering configurations for the pricing rule.
     * </p>
     * 
     * @return The set of tiering configurations for the pricing rule.
     */

    public CreateTieringInput getTiering() {
        return this.tiering;
    }

    /**
     * <p>
     * The set of tiering configurations for the pricing rule.
     * </p>
     * 
     * @param tiering
     *        The set of tiering configurations for the pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePricingRuleRequest withTiering(CreateTieringInput tiering) {
        setTiering(tiering);
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getModifierPercentage() != null)
            sb.append("ModifierPercentage: ").append(getModifierPercentage()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getBillingEntity() != null)
            sb.append("BillingEntity: ").append(getBillingEntity()).append(",");
        if (getTiering() != null)
            sb.append("Tiering: ").append(getTiering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePricingRuleRequest == false)
            return false;
        CreatePricingRuleRequest other = (CreatePricingRuleRequest) obj;
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
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getModifierPercentage() == null ^ this.getModifierPercentage() == null)
            return false;
        if (other.getModifierPercentage() != null && other.getModifierPercentage().equals(this.getModifierPercentage()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getBillingEntity() == null ^ this.getBillingEntity() == null)
            return false;
        if (other.getBillingEntity() != null && other.getBillingEntity().equals(this.getBillingEntity()) == false)
            return false;
        if (other.getTiering() == null ^ this.getTiering() == null)
            return false;
        if (other.getTiering() != null && other.getTiering().equals(this.getTiering()) == false)
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
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getModifierPercentage() == null) ? 0 : getModifierPercentage().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getBillingEntity() == null) ? 0 : getBillingEntity().hashCode());
        hashCode = prime * hashCode + ((getTiering() == null) ? 0 : getTiering().hashCode());
        return hashCode;
    }

    @Override
    public CreatePricingRuleRequest clone() {
        return (CreatePricingRuleRequest) super.clone();
    }

}
