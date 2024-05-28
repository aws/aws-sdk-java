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
 * Estimated cost of the agreement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/EstimatedCharges"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EstimatedCharges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total known amount customer has to pay across the lifecycle of the agreement.
     * </p>
     * <note>
     * <p>
     * This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     * <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value of the
     * contract. In the case of contracts with consumption pricing, this will only include the committed value and not
     * include any overages that occur.
     * </p>
     * <p>
     * If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule amount.
     * This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the payment
     * schedule.
     * </p>
     * <p>
     * In case a customer has amended an agreement, by purchasing more units of any dimension, this will include both
     * the original cost as well as the added cost incurred due to addition of new units.
     * </p>
     * <p>
     * This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     * <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for usage-based
     * pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is not known upfront.
     * </p>
     * </note>
     */
    private String agreementValue;
    /**
     * <p>
     * Defines the currency code for the charge.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The total known amount customer has to pay across the lifecycle of the agreement.
     * </p>
     * <note>
     * <p>
     * This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     * <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value of the
     * contract. In the case of contracts with consumption pricing, this will only include the committed value and not
     * include any overages that occur.
     * </p>
     * <p>
     * If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule amount.
     * This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the payment
     * schedule.
     * </p>
     * <p>
     * In case a customer has amended an agreement, by purchasing more units of any dimension, this will include both
     * the original cost as well as the added cost incurred due to addition of new units.
     * </p>
     * <p>
     * This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     * <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for usage-based
     * pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is not known upfront.
     * </p>
     * </note>
     * 
     * @param agreementValue
     *        The total known amount customer has to pay across the lifecycle of the agreement.</p> <note>
     *        <p>
     *        This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     *        <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value
     *        of the contract. In the case of contracts with consumption pricing, this will only include the committed
     *        value and not include any overages that occur.
     *        </p>
     *        <p>
     *        If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule
     *        amount. This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the
     *        payment schedule.
     *        </p>
     *        <p>
     *        In case a customer has amended an agreement, by purchasing more units of any dimension, this will include
     *        both the original cost as well as the added cost incurred due to addition of new units.
     *        </p>
     *        <p>
     *        This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     *        <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for
     *        usage-based pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is
     *        not known upfront.
     *        </p>
     */

    public void setAgreementValue(String agreementValue) {
        this.agreementValue = agreementValue;
    }

    /**
     * <p>
     * The total known amount customer has to pay across the lifecycle of the agreement.
     * </p>
     * <note>
     * <p>
     * This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     * <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value of the
     * contract. In the case of contracts with consumption pricing, this will only include the committed value and not
     * include any overages that occur.
     * </p>
     * <p>
     * If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule amount.
     * This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the payment
     * schedule.
     * </p>
     * <p>
     * In case a customer has amended an agreement, by purchasing more units of any dimension, this will include both
     * the original cost as well as the added cost incurred due to addition of new units.
     * </p>
     * <p>
     * This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     * <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for usage-based
     * pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is not known upfront.
     * </p>
     * </note>
     * 
     * @return The total known amount customer has to pay across the lifecycle of the agreement.</p> <note>
     *         <p>
     *         This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     *         <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value
     *         of the contract. In the case of contracts with consumption pricing, this will only include the committed
     *         value and not include any overages that occur.
     *         </p>
     *         <p>
     *         If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule
     *         amount. This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the
     *         payment schedule.
     *         </p>
     *         <p>
     *         In case a customer has amended an agreement, by purchasing more units of any dimension, this will include
     *         both the original cost as well as the added cost incurred due to addition of new units.
     *         </p>
     *         <p>
     *         This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     *         <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for
     *         usage-based pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is
     *         not known upfront.
     *         </p>
     */

    public String getAgreementValue() {
        return this.agreementValue;
    }

    /**
     * <p>
     * The total known amount customer has to pay across the lifecycle of the agreement.
     * </p>
     * <note>
     * <p>
     * This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     * <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value of the
     * contract. In the case of contracts with consumption pricing, this will only include the committed value and not
     * include any overages that occur.
     * </p>
     * <p>
     * If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule amount.
     * This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the payment
     * schedule.
     * </p>
     * <p>
     * In case a customer has amended an agreement, by purchasing more units of any dimension, this will include both
     * the original cost as well as the added cost incurred due to addition of new units.
     * </p>
     * <p>
     * This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     * <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for usage-based
     * pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is not known upfront.
     * </p>
     * </note>
     * 
     * @param agreementValue
     *        The total known amount customer has to pay across the lifecycle of the agreement.</p> <note>
     *        <p>
     *        This is the total contract value if accepted terms contain <code>ConfigurableUpfrontPricingTerm</code> or
     *        <code>FixedUpfrontPricingTerm</code>. In the case of pure contract pricing, this will be the total value
     *        of the contract. In the case of contracts with consumption pricing, this will only include the committed
     *        value and not include any overages that occur.
     *        </p>
     *        <p>
     *        If the accepted terms contain <code>PaymentScheduleTerm</code>, it will be the total payment schedule
     *        amount. This occurs when flexible payment schedule is used, and is the sum of all invoice charges in the
     *        payment schedule.
     *        </p>
     *        <p>
     *        In case a customer has amended an agreement, by purchasing more units of any dimension, this will include
     *        both the original cost as well as the added cost incurred due to addition of new units.
     *        </p>
     *        <p>
     *        This is <code>0</code> if the accepted terms contain <code>UsageBasedPricingTerm</code> without
     *        <code>ConfigurableUpfrontPricingTerm</code> or <code>RecurringPaymentTerm</code>. This occurs for
     *        usage-based pricing (such as SaaS metered or AMI/container hourly or monthly), because the exact usage is
     *        not known upfront.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedCharges withAgreementValue(String agreementValue) {
        setAgreementValue(agreementValue);
        return this;
    }

    /**
     * <p>
     * Defines the currency code for the charge.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency code for the charge.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * Defines the currency code for the charge.
     * </p>
     * 
     * @return Defines the currency code for the charge.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * Defines the currency code for the charge.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency code for the charge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedCharges withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
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
        if (getAgreementValue() != null)
            sb.append("AgreementValue: ").append(getAgreementValue()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EstimatedCharges == false)
            return false;
        EstimatedCharges other = (EstimatedCharges) obj;
        if (other.getAgreementValue() == null ^ this.getAgreementValue() == null)
            return false;
        if (other.getAgreementValue() != null && other.getAgreementValue().equals(this.getAgreementValue()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreementValue() == null) ? 0 : getAgreementValue().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        return hashCode;
    }

    @Override
    public EstimatedCharges clone() {
        try {
            return (EstimatedCharges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.EstimatedChargesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
