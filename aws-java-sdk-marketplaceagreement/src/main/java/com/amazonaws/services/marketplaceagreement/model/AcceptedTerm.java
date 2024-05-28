/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A subset of terms proposed by the proposer, which have been accepted by the acceptor as part of agreement creation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/AcceptedTerm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptedTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be charged
     * for product usage in AWS Marketplace because they already paid for the product outside of AWS Marketplace.
     * </p>
     */
    private ByolPricingTerm byolPricingTerm;
    /**
     * <p>
     * Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and the
     * duration.
     * </p>
     */
    private ConfigurableUpfrontPricingTerm configurableUpfrontPricingTerm;
    /**
     * <p>
     * Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     * </p>
     */
    private FixedUpfrontPricingTerm fixedUpfrontPricingTerm;
    /**
     * <p>
     * Defines a short-term free pricing model where the buyers aren’t charged anything within a specified limit.
     * </p>
     */
    private FreeTrialPricingTerm freeTrialPricingTerm;
    /**
     * <p>
     * Defines the list of text agreements proposed to the acceptors. An example is the end user license agreement
     * (EULA).
     * </p>
     */
    private LegalTerm legalTerm;
    /**
     * <p>
     * Defines an installment-based pricing model where customers are charged a fixed price on different dates during
     * the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     * </p>
     */
    private PaymentScheduleTerm paymentScheduleTerm;
    /**
     * <p>
     * Defines a pricing model where customers are charged a fixed recurring price at the end of each billing period.
     * </p>
     */
    private RecurringPaymentTerm recurringPaymentTerm;
    /**
     * <p>
     * Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end date), a new
     * agreement will be created using the accepted terms on the existing agreement. In other words, the agreement will
     * be renewed. Presence of <code>RenewalTerm</code> in the offer document means that auto-renewal is allowed. Buyers
     * will have the option to accept or decline auto-renewal at the offer acceptance/agreement creation. Buyers can
     * also change this flag from <code>True</code> to <code>False</code> or <code>False</code> to <code>True</code> at
     * anytime during the agreement's lifecycle.
     * </p>
     */
    private RenewalTerm renewalTerm;
    /**
     * <p>
     * Defines the customer support available for the acceptors when they purchase the software.
     * </p>
     */
    private SupportTerm supportTerm;
    /**
     * <p>
     * Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged based on
     * product usage.
     * </p>
     */
    private UsageBasedPricingTerm usageBasedPricingTerm;
    /**
     * <p>
     * Defines the conditions that will keep an agreement created from this offer valid.
     * </p>
     */
    private ValidityTerm validityTerm;

    /**
     * <p>
     * Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be charged
     * for product usage in AWS Marketplace because they already paid for the product outside of AWS Marketplace.
     * </p>
     * 
     * @param byolPricingTerm
     *        Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be
     *        charged for product usage in AWS Marketplace because they already paid for the product outside of AWS
     *        Marketplace.
     */

    public void setByolPricingTerm(ByolPricingTerm byolPricingTerm) {
        this.byolPricingTerm = byolPricingTerm;
    }

    /**
     * <p>
     * Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be charged
     * for product usage in AWS Marketplace because they already paid for the product outside of AWS Marketplace.
     * </p>
     * 
     * @return Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be
     *         charged for product usage in AWS Marketplace because they already paid for the product outside of AWS
     *         Marketplace.
     */

    public ByolPricingTerm getByolPricingTerm() {
        return this.byolPricingTerm;
    }

    /**
     * <p>
     * Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be charged
     * for product usage in AWS Marketplace because they already paid for the product outside of AWS Marketplace.
     * </p>
     * 
     * @param byolPricingTerm
     *        Enables you and your customers to move your existing agreements to AWS Marketplace. The customer won't be
     *        charged for product usage in AWS Marketplace because they already paid for the product outside of AWS
     *        Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withByolPricingTerm(ByolPricingTerm byolPricingTerm) {
        setByolPricingTerm(byolPricingTerm);
        return this;
    }

    /**
     * <p>
     * Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and the
     * duration.
     * </p>
     * 
     * @param configurableUpfrontPricingTerm
     *        Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and
     *        the duration.
     */

    public void setConfigurableUpfrontPricingTerm(ConfigurableUpfrontPricingTerm configurableUpfrontPricingTerm) {
        this.configurableUpfrontPricingTerm = configurableUpfrontPricingTerm;
    }

    /**
     * <p>
     * Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and the
     * duration.
     * </p>
     * 
     * @return Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase
     *         and the duration.
     */

    public ConfigurableUpfrontPricingTerm getConfigurableUpfrontPricingTerm() {
        return this.configurableUpfrontPricingTerm;
    }

    /**
     * <p>
     * Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and the
     * duration.
     * </p>
     * 
     * @param configurableUpfrontPricingTerm
     *        Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and
     *        the duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withConfigurableUpfrontPricingTerm(ConfigurableUpfrontPricingTerm configurableUpfrontPricingTerm) {
        setConfigurableUpfrontPricingTerm(configurableUpfrontPricingTerm);
        return this;
    }

    /**
     * <p>
     * Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     * </p>
     * 
     * @param fixedUpfrontPricingTerm
     *        Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     */

    public void setFixedUpfrontPricingTerm(FixedUpfrontPricingTerm fixedUpfrontPricingTerm) {
        this.fixedUpfrontPricingTerm = fixedUpfrontPricingTerm;
    }

    /**
     * <p>
     * Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     * </p>
     * 
     * @return Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     */

    public FixedUpfrontPricingTerm getFixedUpfrontPricingTerm() {
        return this.fixedUpfrontPricingTerm;
    }

    /**
     * <p>
     * Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     * </p>
     * 
     * @param fixedUpfrontPricingTerm
     *        Defines a pre-paid pricing model where the customers are charged a fixed upfront amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withFixedUpfrontPricingTerm(FixedUpfrontPricingTerm fixedUpfrontPricingTerm) {
        setFixedUpfrontPricingTerm(fixedUpfrontPricingTerm);
        return this;
    }

    /**
     * <p>
     * Defines a short-term free pricing model where the buyers aren’t charged anything within a specified limit.
     * </p>
     * 
     * @param freeTrialPricingTerm
     *        Defines a short-term free pricing model where the buyers aren’t charged anything within a specified limit.
     */

    public void setFreeTrialPricingTerm(FreeTrialPricingTerm freeTrialPricingTerm) {
        this.freeTrialPricingTerm = freeTrialPricingTerm;
    }

    /**
     * <p>
     * Defines a short-term free pricing model where the buyers aren’t charged anything within a specified limit.
     * </p>
     * 
     * @return Defines a short-term free pricing model where the buyers aren’t charged anything within a specified
     *         limit.
     */

    public FreeTrialPricingTerm getFreeTrialPricingTerm() {
        return this.freeTrialPricingTerm;
    }

    /**
     * <p>
     * Defines a short-term free pricing model where the buyers aren’t charged anything within a specified limit.
     * </p>
     * 
     * @param freeTrialPricingTerm
     *        Defines a short-term free pricing model where the buyers aren’t charged anything within a specified limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withFreeTrialPricingTerm(FreeTrialPricingTerm freeTrialPricingTerm) {
        setFreeTrialPricingTerm(freeTrialPricingTerm);
        return this;
    }

    /**
     * <p>
     * Defines the list of text agreements proposed to the acceptors. An example is the end user license agreement
     * (EULA).
     * </p>
     * 
     * @param legalTerm
     *        Defines the list of text agreements proposed to the acceptors. An example is the end user license
     *        agreement (EULA).
     */

    public void setLegalTerm(LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    /**
     * <p>
     * Defines the list of text agreements proposed to the acceptors. An example is the end user license agreement
     * (EULA).
     * </p>
     * 
     * @return Defines the list of text agreements proposed to the acceptors. An example is the end user license
     *         agreement (EULA).
     */

    public LegalTerm getLegalTerm() {
        return this.legalTerm;
    }

    /**
     * <p>
     * Defines the list of text agreements proposed to the acceptors. An example is the end user license agreement
     * (EULA).
     * </p>
     * 
     * @param legalTerm
     *        Defines the list of text agreements proposed to the acceptors. An example is the end user license
     *        agreement (EULA).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withLegalTerm(LegalTerm legalTerm) {
        setLegalTerm(legalTerm);
        return this;
    }

    /**
     * <p>
     * Defines an installment-based pricing model where customers are charged a fixed price on different dates during
     * the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     * </p>
     * 
     * @param paymentScheduleTerm
     *        Defines an installment-based pricing model where customers are charged a fixed price on different dates
     *        during the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     */

    public void setPaymentScheduleTerm(PaymentScheduleTerm paymentScheduleTerm) {
        this.paymentScheduleTerm = paymentScheduleTerm;
    }

    /**
     * <p>
     * Defines an installment-based pricing model where customers are charged a fixed price on different dates during
     * the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     * </p>
     * 
     * @return Defines an installment-based pricing model where customers are charged a fixed price on different dates
     *         during the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     */

    public PaymentScheduleTerm getPaymentScheduleTerm() {
        return this.paymentScheduleTerm;
    }

    /**
     * <p>
     * Defines an installment-based pricing model where customers are charged a fixed price on different dates during
     * the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     * </p>
     * 
     * @param paymentScheduleTerm
     *        Defines an installment-based pricing model where customers are charged a fixed price on different dates
     *        during the agreement validity period. This is used most commonly for flexible payment schedule pricing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withPaymentScheduleTerm(PaymentScheduleTerm paymentScheduleTerm) {
        setPaymentScheduleTerm(paymentScheduleTerm);
        return this;
    }

    /**
     * <p>
     * Defines a pricing model where customers are charged a fixed recurring price at the end of each billing period.
     * </p>
     * 
     * @param recurringPaymentTerm
     *        Defines a pricing model where customers are charged a fixed recurring price at the end of each billing
     *        period.
     */

    public void setRecurringPaymentTerm(RecurringPaymentTerm recurringPaymentTerm) {
        this.recurringPaymentTerm = recurringPaymentTerm;
    }

    /**
     * <p>
     * Defines a pricing model where customers are charged a fixed recurring price at the end of each billing period.
     * </p>
     * 
     * @return Defines a pricing model where customers are charged a fixed recurring price at the end of each billing
     *         period.
     */

    public RecurringPaymentTerm getRecurringPaymentTerm() {
        return this.recurringPaymentTerm;
    }

    /**
     * <p>
     * Defines a pricing model where customers are charged a fixed recurring price at the end of each billing period.
     * </p>
     * 
     * @param recurringPaymentTerm
     *        Defines a pricing model where customers are charged a fixed recurring price at the end of each billing
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withRecurringPaymentTerm(RecurringPaymentTerm recurringPaymentTerm) {
        setRecurringPaymentTerm(recurringPaymentTerm);
        return this;
    }

    /**
     * <p>
     * Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end date), a new
     * agreement will be created using the accepted terms on the existing agreement. In other words, the agreement will
     * be renewed. Presence of <code>RenewalTerm</code> in the offer document means that auto-renewal is allowed. Buyers
     * will have the option to accept or decline auto-renewal at the offer acceptance/agreement creation. Buyers can
     * also change this flag from <code>True</code> to <code>False</code> or <code>False</code> to <code>True</code> at
     * anytime during the agreement's lifecycle.
     * </p>
     * 
     * @param renewalTerm
     *        Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end
     *        date), a new agreement will be created using the accepted terms on the existing agreement. In other words,
     *        the agreement will be renewed. Presence of <code>RenewalTerm</code> in the offer document means that
     *        auto-renewal is allowed. Buyers will have the option to accept or decline auto-renewal at the offer
     *        acceptance/agreement creation. Buyers can also change this flag from <code>True</code> to
     *        <code>False</code> or <code>False</code> to <code>True</code> at anytime during the agreement's lifecycle.
     */

    public void setRenewalTerm(RenewalTerm renewalTerm) {
        this.renewalTerm = renewalTerm;
    }

    /**
     * <p>
     * Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end date), a new
     * agreement will be created using the accepted terms on the existing agreement. In other words, the agreement will
     * be renewed. Presence of <code>RenewalTerm</code> in the offer document means that auto-renewal is allowed. Buyers
     * will have the option to accept or decline auto-renewal at the offer acceptance/agreement creation. Buyers can
     * also change this flag from <code>True</code> to <code>False</code> or <code>False</code> to <code>True</code> at
     * anytime during the agreement's lifecycle.
     * </p>
     * 
     * @return Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end
     *         date), a new agreement will be created using the accepted terms on the existing agreement. In other
     *         words, the agreement will be renewed. Presence of <code>RenewalTerm</code> in the offer document means
     *         that auto-renewal is allowed. Buyers will have the option to accept or decline auto-renewal at the offer
     *         acceptance/agreement creation. Buyers can also change this flag from <code>True</code> to
     *         <code>False</code> or <code>False</code> to <code>True</code> at anytime during the agreement's
     *         lifecycle.
     */

    public RenewalTerm getRenewalTerm() {
        return this.renewalTerm;
    }

    /**
     * <p>
     * Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end date), a new
     * agreement will be created using the accepted terms on the existing agreement. In other words, the agreement will
     * be renewed. Presence of <code>RenewalTerm</code> in the offer document means that auto-renewal is allowed. Buyers
     * will have the option to accept or decline auto-renewal at the offer acceptance/agreement creation. Buyers can
     * also change this flag from <code>True</code> to <code>False</code> or <code>False</code> to <code>True</code> at
     * anytime during the agreement's lifecycle.
     * </p>
     * 
     * @param renewalTerm
     *        Defines that on graceful expiration of the agreement (when the agreement ends on its pre-defined end
     *        date), a new agreement will be created using the accepted terms on the existing agreement. In other words,
     *        the agreement will be renewed. Presence of <code>RenewalTerm</code> in the offer document means that
     *        auto-renewal is allowed. Buyers will have the option to accept or decline auto-renewal at the offer
     *        acceptance/agreement creation. Buyers can also change this flag from <code>True</code> to
     *        <code>False</code> or <code>False</code> to <code>True</code> at anytime during the agreement's lifecycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withRenewalTerm(RenewalTerm renewalTerm) {
        setRenewalTerm(renewalTerm);
        return this;
    }

    /**
     * <p>
     * Defines the customer support available for the acceptors when they purchase the software.
     * </p>
     * 
     * @param supportTerm
     *        Defines the customer support available for the acceptors when they purchase the software.
     */

    public void setSupportTerm(SupportTerm supportTerm) {
        this.supportTerm = supportTerm;
    }

    /**
     * <p>
     * Defines the customer support available for the acceptors when they purchase the software.
     * </p>
     * 
     * @return Defines the customer support available for the acceptors when they purchase the software.
     */

    public SupportTerm getSupportTerm() {
        return this.supportTerm;
    }

    /**
     * <p>
     * Defines the customer support available for the acceptors when they purchase the software.
     * </p>
     * 
     * @param supportTerm
     *        Defines the customer support available for the acceptors when they purchase the software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withSupportTerm(SupportTerm supportTerm) {
        setSupportTerm(supportTerm);
        return this;
    }

    /**
     * <p>
     * Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged based on
     * product usage.
     * </p>
     * 
     * @param usageBasedPricingTerm
     *        Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged
     *        based on product usage.
     */

    public void setUsageBasedPricingTerm(UsageBasedPricingTerm usageBasedPricingTerm) {
        this.usageBasedPricingTerm = usageBasedPricingTerm;
    }

    /**
     * <p>
     * Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged based on
     * product usage.
     * </p>
     * 
     * @return Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged
     *         based on product usage.
     */

    public UsageBasedPricingTerm getUsageBasedPricingTerm() {
        return this.usageBasedPricingTerm;
    }

    /**
     * <p>
     * Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged based on
     * product usage.
     * </p>
     * 
     * @param usageBasedPricingTerm
     *        Defines a usage-based pricing model (typically, pay-as-you-go pricing), where the customers are charged
     *        based on product usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withUsageBasedPricingTerm(UsageBasedPricingTerm usageBasedPricingTerm) {
        setUsageBasedPricingTerm(usageBasedPricingTerm);
        return this;
    }

    /**
     * <p>
     * Defines the conditions that will keep an agreement created from this offer valid.
     * </p>
     * 
     * @param validityTerm
     *        Defines the conditions that will keep an agreement created from this offer valid.
     */

    public void setValidityTerm(ValidityTerm validityTerm) {
        this.validityTerm = validityTerm;
    }

    /**
     * <p>
     * Defines the conditions that will keep an agreement created from this offer valid.
     * </p>
     * 
     * @return Defines the conditions that will keep an agreement created from this offer valid.
     */

    public ValidityTerm getValidityTerm() {
        return this.validityTerm;
    }

    /**
     * <p>
     * Defines the conditions that will keep an agreement created from this offer valid.
     * </p>
     * 
     * @param validityTerm
     *        Defines the conditions that will keep an agreement created from this offer valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptedTerm withValidityTerm(ValidityTerm validityTerm) {
        setValidityTerm(validityTerm);
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
        if (getByolPricingTerm() != null)
            sb.append("ByolPricingTerm: ").append(getByolPricingTerm()).append(",");
        if (getConfigurableUpfrontPricingTerm() != null)
            sb.append("ConfigurableUpfrontPricingTerm: ").append(getConfigurableUpfrontPricingTerm()).append(",");
        if (getFixedUpfrontPricingTerm() != null)
            sb.append("FixedUpfrontPricingTerm: ").append(getFixedUpfrontPricingTerm()).append(",");
        if (getFreeTrialPricingTerm() != null)
            sb.append("FreeTrialPricingTerm: ").append(getFreeTrialPricingTerm()).append(",");
        if (getLegalTerm() != null)
            sb.append("LegalTerm: ").append(getLegalTerm()).append(",");
        if (getPaymentScheduleTerm() != null)
            sb.append("PaymentScheduleTerm: ").append(getPaymentScheduleTerm()).append(",");
        if (getRecurringPaymentTerm() != null)
            sb.append("RecurringPaymentTerm: ").append(getRecurringPaymentTerm()).append(",");
        if (getRenewalTerm() != null)
            sb.append("RenewalTerm: ").append(getRenewalTerm()).append(",");
        if (getSupportTerm() != null)
            sb.append("SupportTerm: ").append(getSupportTerm()).append(",");
        if (getUsageBasedPricingTerm() != null)
            sb.append("UsageBasedPricingTerm: ").append(getUsageBasedPricingTerm()).append(",");
        if (getValidityTerm() != null)
            sb.append("ValidityTerm: ").append(getValidityTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptedTerm == false)
            return false;
        AcceptedTerm other = (AcceptedTerm) obj;
        if (other.getByolPricingTerm() == null ^ this.getByolPricingTerm() == null)
            return false;
        if (other.getByolPricingTerm() != null && other.getByolPricingTerm().equals(this.getByolPricingTerm()) == false)
            return false;
        if (other.getConfigurableUpfrontPricingTerm() == null ^ this.getConfigurableUpfrontPricingTerm() == null)
            return false;
        if (other.getConfigurableUpfrontPricingTerm() != null
                && other.getConfigurableUpfrontPricingTerm().equals(this.getConfigurableUpfrontPricingTerm()) == false)
            return false;
        if (other.getFixedUpfrontPricingTerm() == null ^ this.getFixedUpfrontPricingTerm() == null)
            return false;
        if (other.getFixedUpfrontPricingTerm() != null && other.getFixedUpfrontPricingTerm().equals(this.getFixedUpfrontPricingTerm()) == false)
            return false;
        if (other.getFreeTrialPricingTerm() == null ^ this.getFreeTrialPricingTerm() == null)
            return false;
        if (other.getFreeTrialPricingTerm() != null && other.getFreeTrialPricingTerm().equals(this.getFreeTrialPricingTerm()) == false)
            return false;
        if (other.getLegalTerm() == null ^ this.getLegalTerm() == null)
            return false;
        if (other.getLegalTerm() != null && other.getLegalTerm().equals(this.getLegalTerm()) == false)
            return false;
        if (other.getPaymentScheduleTerm() == null ^ this.getPaymentScheduleTerm() == null)
            return false;
        if (other.getPaymentScheduleTerm() != null && other.getPaymentScheduleTerm().equals(this.getPaymentScheduleTerm()) == false)
            return false;
        if (other.getRecurringPaymentTerm() == null ^ this.getRecurringPaymentTerm() == null)
            return false;
        if (other.getRecurringPaymentTerm() != null && other.getRecurringPaymentTerm().equals(this.getRecurringPaymentTerm()) == false)
            return false;
        if (other.getRenewalTerm() == null ^ this.getRenewalTerm() == null)
            return false;
        if (other.getRenewalTerm() != null && other.getRenewalTerm().equals(this.getRenewalTerm()) == false)
            return false;
        if (other.getSupportTerm() == null ^ this.getSupportTerm() == null)
            return false;
        if (other.getSupportTerm() != null && other.getSupportTerm().equals(this.getSupportTerm()) == false)
            return false;
        if (other.getUsageBasedPricingTerm() == null ^ this.getUsageBasedPricingTerm() == null)
            return false;
        if (other.getUsageBasedPricingTerm() != null && other.getUsageBasedPricingTerm().equals(this.getUsageBasedPricingTerm()) == false)
            return false;
        if (other.getValidityTerm() == null ^ this.getValidityTerm() == null)
            return false;
        if (other.getValidityTerm() != null && other.getValidityTerm().equals(this.getValidityTerm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByolPricingTerm() == null) ? 0 : getByolPricingTerm().hashCode());
        hashCode = prime * hashCode + ((getConfigurableUpfrontPricingTerm() == null) ? 0 : getConfigurableUpfrontPricingTerm().hashCode());
        hashCode = prime * hashCode + ((getFixedUpfrontPricingTerm() == null) ? 0 : getFixedUpfrontPricingTerm().hashCode());
        hashCode = prime * hashCode + ((getFreeTrialPricingTerm() == null) ? 0 : getFreeTrialPricingTerm().hashCode());
        hashCode = prime * hashCode + ((getLegalTerm() == null) ? 0 : getLegalTerm().hashCode());
        hashCode = prime * hashCode + ((getPaymentScheduleTerm() == null) ? 0 : getPaymentScheduleTerm().hashCode());
        hashCode = prime * hashCode + ((getRecurringPaymentTerm() == null) ? 0 : getRecurringPaymentTerm().hashCode());
        hashCode = prime * hashCode + ((getRenewalTerm() == null) ? 0 : getRenewalTerm().hashCode());
        hashCode = prime * hashCode + ((getSupportTerm() == null) ? 0 : getSupportTerm().hashCode());
        hashCode = prime * hashCode + ((getUsageBasedPricingTerm() == null) ? 0 : getUsageBasedPricingTerm().hashCode());
        hashCode = prime * hashCode + ((getValidityTerm() == null) ? 0 : getValidityTerm().hashCode());
        return hashCode;
    }

    @Override
    public AcceptedTerm clone() {
        try {
            return (AcceptedTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.AcceptedTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
