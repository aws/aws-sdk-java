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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdatePricingRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePricingRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The new name of the pricing rule. The name must be unique to each pricing rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new description for the pricing rule.
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
     * The new pricing rule type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The new modifier to show pricing plan rates as a percentage.
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
     * The pricing plans count that this pricing rule is associated with.
     * </p>
     */
    private Long associatedPricingPlanCount;
    /**
     * <p>
     * The most recent time the pricing rule was modified.
     * </p>
     */
    private Long lastModifiedTime;
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
    private UpdateTieringInput tiering;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the successfully updated pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingRuleResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The new name of the pricing rule. The name must be unique to each pricing rule.
     * </p>
     * 
     * @param name
     *        The new name of the pricing rule. The name must be unique to each pricing rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name of the pricing rule. The name must be unique to each pricing rule.
     * </p>
     * 
     * @return The new name of the pricing rule. The name must be unique to each pricing rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name of the pricing rule. The name must be unique to each pricing rule.
     * </p>
     * 
     * @param name
     *        The new name of the pricing rule. The name must be unique to each pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingRuleResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new description for the pricing rule.
     * </p>
     * 
     * @param description
     *        The new description for the pricing rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the pricing rule.
     * </p>
     * 
     * @return The new description for the pricing rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the pricing rule.
     * </p>
     * 
     * @param description
     *        The new description for the pricing rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingRuleResult withDescription(String description) {
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

    public UpdatePricingRuleResult withScope(String scope) {
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

    public UpdatePricingRuleResult withScope(PricingRuleScope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The new pricing rule type.
     * </p>
     * 
     * @param type
     *        The new pricing rule type.
     * @see PricingRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The new pricing rule type.
     * </p>
     * 
     * @return The new pricing rule type.
     * @see PricingRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The new pricing rule type.
     * </p>
     * 
     * @param type
     *        The new pricing rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingRuleType
     */

    public UpdatePricingRuleResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The new pricing rule type.
     * </p>
     * 
     * @param type
     *        The new pricing rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingRuleType
     */

    public UpdatePricingRuleResult withType(PricingRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The new modifier to show pricing plan rates as a percentage.
     * </p>
     * 
     * @param modifierPercentage
     *        The new modifier to show pricing plan rates as a percentage.
     */

    public void setModifierPercentage(Double modifierPercentage) {
        this.modifierPercentage = modifierPercentage;
    }

    /**
     * <p>
     * The new modifier to show pricing plan rates as a percentage.
     * </p>
     * 
     * @return The new modifier to show pricing plan rates as a percentage.
     */

    public Double getModifierPercentage() {
        return this.modifierPercentage;
    }

    /**
     * <p>
     * The new modifier to show pricing plan rates as a percentage.
     * </p>
     * 
     * @param modifierPercentage
     *        The new modifier to show pricing plan rates as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingRuleResult withModifierPercentage(Double modifierPercentage) {
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

    public UpdatePricingRuleResult withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The pricing plans count that this pricing rule is associated with.
     * </p>
     * 
     * @param associatedPricingPlanCount
     *        The pricing plans count that this pricing rule is associated with.
     */

    public void setAssociatedPricingPlanCount(Long associatedPricingPlanCount) {
        this.associatedPricingPlanCount = associatedPricingPlanCount;
    }

    /**
     * <p>
     * The pricing plans count that this pricing rule is associated with.
     * </p>
     * 
     * @return The pricing plans count that this pricing rule is associated with.
     */

    public Long getAssociatedPricingPlanCount() {
        return this.associatedPricingPlanCount;
    }

    /**
     * <p>
     * The pricing plans count that this pricing rule is associated with.
     * </p>
     * 
     * @param associatedPricingPlanCount
     *        The pricing plans count that this pricing rule is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingRuleResult withAssociatedPricingPlanCount(Long associatedPricingPlanCount) {
        setAssociatedPricingPlanCount(associatedPricingPlanCount);
        return this;
    }

    /**
     * <p>
     * The most recent time the pricing rule was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time the pricing rule was modified.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time the pricing rule was modified.
     * </p>
     * 
     * @return The most recent time the pricing rule was modified.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time the pricing rule was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time the pricing rule was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePricingRuleResult withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public UpdatePricingRuleResult withBillingEntity(String billingEntity) {
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

    public void setTiering(UpdateTieringInput tiering) {
        this.tiering = tiering;
    }

    /**
     * <p>
     * The set of tiering configurations for the pricing rule.
     * </p>
     * 
     * @return The set of tiering configurations for the pricing rule.
     */

    public UpdateTieringInput getTiering() {
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

    public UpdatePricingRuleResult withTiering(UpdateTieringInput tiering) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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
        if (getAssociatedPricingPlanCount() != null)
            sb.append("AssociatedPricingPlanCount: ").append(getAssociatedPricingPlanCount()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
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

        if (obj instanceof UpdatePricingRuleResult == false)
            return false;
        UpdatePricingRuleResult other = (UpdatePricingRuleResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getAssociatedPricingPlanCount() == null ^ this.getAssociatedPricingPlanCount() == null)
            return false;
        if (other.getAssociatedPricingPlanCount() != null && other.getAssociatedPricingPlanCount().equals(this.getAssociatedPricingPlanCount()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getModifierPercentage() == null) ? 0 : getModifierPercentage().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getAssociatedPricingPlanCount() == null) ? 0 : getAssociatedPricingPlanCount().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getBillingEntity() == null) ? 0 : getBillingEntity().hashCode());
        hashCode = prime * hashCode + ((getTiering() == null) ? 0 : getTiering().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePricingRuleResult clone() {
        try {
            return (UpdatePricingRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
