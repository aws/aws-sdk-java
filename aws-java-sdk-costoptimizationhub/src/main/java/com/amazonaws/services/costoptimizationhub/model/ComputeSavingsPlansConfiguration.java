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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Compute Savings Plans configuration used for recommendations.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ComputeSavingsPlansConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeSavingsPlansConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to <code>PAYER</code>. If the value is
     * <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     * </p>
     */
    private String accountScope;
    /**
     * <p>
     * The hourly commitment for the Savings Plans type.
     * </p>
     */
    private String hourlyCommitment;
    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The Savings Plans recommendation term in years.
     * </p>
     */
    private String term;

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to <code>PAYER</code>. If the value is
     * <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *        including the management account and member accounts if the value is set to <code>PAYER</code>. If the
     *        value is <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     */

    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to <code>PAYER</code>. If the value is
     * <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @return The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *         including the management account and member accounts if the value is set to <code>PAYER</code>. If the
     *         value is <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     */

    public String getAccountScope() {
        return this.accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to <code>PAYER</code>. If the value is
     * <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *        including the management account and member accounts if the value is set to <code>PAYER</code>. If the
     *        value is <code>LINKED</code>, recommendations are calculated for individual member accounts only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeSavingsPlansConfiguration withAccountScope(String accountScope) {
        setAccountScope(accountScope);
        return this;
    }

    /**
     * <p>
     * The hourly commitment for the Savings Plans type.
     * </p>
     * 
     * @param hourlyCommitment
     *        The hourly commitment for the Savings Plans type.
     */

    public void setHourlyCommitment(String hourlyCommitment) {
        this.hourlyCommitment = hourlyCommitment;
    }

    /**
     * <p>
     * The hourly commitment for the Savings Plans type.
     * </p>
     * 
     * @return The hourly commitment for the Savings Plans type.
     */

    public String getHourlyCommitment() {
        return this.hourlyCommitment;
    }

    /**
     * <p>
     * The hourly commitment for the Savings Plans type.
     * </p>
     * 
     * @param hourlyCommitment
     *        The hourly commitment for the Savings Plans type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeSavingsPlansConfiguration withHourlyCommitment(String hourlyCommitment) {
        setHourlyCommitment(hourlyCommitment);
        return this;
    }

    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment.
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     * 
     * @return The payment option for the commitment.
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option for the commitment.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeSavingsPlansConfiguration withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years.
     * </p>
     * 
     * @param term
     *        The Savings Plans recommendation term in years.
     */

    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years.
     * </p>
     * 
     * @return The Savings Plans recommendation term in years.
     */

    public String getTerm() {
        return this.term;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years.
     * </p>
     * 
     * @param term
     *        The Savings Plans recommendation term in years.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeSavingsPlansConfiguration withTerm(String term) {
        setTerm(term);
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
        if (getAccountScope() != null)
            sb.append("AccountScope: ").append(getAccountScope()).append(",");
        if (getHourlyCommitment() != null)
            sb.append("HourlyCommitment: ").append(getHourlyCommitment()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getTerm() != null)
            sb.append("Term: ").append(getTerm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeSavingsPlansConfiguration == false)
            return false;
        ComputeSavingsPlansConfiguration other = (ComputeSavingsPlansConfiguration) obj;
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getHourlyCommitment() == null ^ this.getHourlyCommitment() == null)
            return false;
        if (other.getHourlyCommitment() != null && other.getHourlyCommitment().equals(this.getHourlyCommitment()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getTerm() == null ^ this.getTerm() == null)
            return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getHourlyCommitment() == null) ? 0 : getHourlyCommitment().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode());
        return hashCode;
    }

    @Override
    public ComputeSavingsPlansConfiguration clone() {
        try {
            return (ComputeSavingsPlansConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.ComputeSavingsPlansConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
