/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansPurchaseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     */
    private String savingsPlansType;
    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the recommendation.
     * </p>
     */
    private String termInYears;
    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     */
    private String lookbackPeriodInDays;
    /**
     * <p>
     * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
     * </p>
     */
    private java.util.List<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails;
    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     */
    private SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary;

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * 
     * @param savingsPlansType
     *        The requested Savings Plans recommendation type.
     * @see SupportedSavingsPlansType
     */

    public void setSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * 
     * @return The requested Savings Plans recommendation type.
     * @see SupportedSavingsPlansType
     */

    public String getSavingsPlansType() {
        return this.savingsPlansType;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * 
     * @param savingsPlansType
     *        The requested Savings Plans recommendation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedSavingsPlansType
     */

    public SavingsPlansPurchaseRecommendation withSavingsPlansType(String savingsPlansType) {
        setSavingsPlansType(savingsPlansType);
        return this;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * 
     * @param savingsPlansType
     *        The requested Savings Plans recommendation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedSavingsPlansType
     */

    public SavingsPlansPurchaseRecommendation withSavingsPlansType(SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the recommendation.
     * </p>
     * 
     * @param termInYears
     *        The Savings Plans recommendation term in years, used to generate the recommendation.
     * @see TermInYears
     */

    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the recommendation.
     * </p>
     * 
     * @return The Savings Plans recommendation term in years, used to generate the recommendation.
     * @see TermInYears
     */

    public String getTermInYears() {
        return this.termInYears;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the recommendation.
     * </p>
     * 
     * @param termInYears
     *        The Savings Plans recommendation term in years, used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public SavingsPlansPurchaseRecommendation withTermInYears(String termInYears) {
        setTermInYears(termInYears);
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the recommendation.
     * </p>
     * 
     * @param termInYears
     *        The Savings Plans recommendation term in years, used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public SavingsPlansPurchaseRecommendation withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option used to generate the recommendation.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * 
     * @return The payment option used to generate the recommendation.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public SavingsPlansPurchaseRecommendation withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * 
     * @param paymentOption
     *        The payment option used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public SavingsPlansPurchaseRecommendation withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The lookback period in days, used to generate the recommendation.
     * @see LookbackPeriodInDays
     */

    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * 
     * @return The lookback period in days, used to generate the recommendation.
     * @see LookbackPeriodInDays
     */

    public String getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The lookback period in days, used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public SavingsPlansPurchaseRecommendation withLookbackPeriodInDays(String lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The lookback period in days, used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public SavingsPlansPurchaseRecommendation withLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
     * </p>
     * 
     * @return Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible
     *         workloads.
     */

    public java.util.List<SavingsPlansPurchaseRecommendationDetail> getSavingsPlansPurchaseRecommendationDetails() {
        return savingsPlansPurchaseRecommendationDetails;
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendationDetails
     *        Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible
     *        workloads.
     */

    public void setSavingsPlansPurchaseRecommendationDetails(
            java.util.Collection<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails) {
        if (savingsPlansPurchaseRecommendationDetails == null) {
            this.savingsPlansPurchaseRecommendationDetails = null;
            return;
        }

        this.savingsPlansPurchaseRecommendationDetails = new java.util.ArrayList<SavingsPlansPurchaseRecommendationDetail>(
                savingsPlansPurchaseRecommendationDetails);
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlansPurchaseRecommendationDetails(java.util.Collection)} or
     * {@link #withSavingsPlansPurchaseRecommendationDetails(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendationDetails
     *        Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible
     *        workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendation withSavingsPlansPurchaseRecommendationDetails(
            SavingsPlansPurchaseRecommendationDetail... savingsPlansPurchaseRecommendationDetails) {
        if (this.savingsPlansPurchaseRecommendationDetails == null) {
            setSavingsPlansPurchaseRecommendationDetails(new java.util.ArrayList<SavingsPlansPurchaseRecommendationDetail>(
                    savingsPlansPurchaseRecommendationDetails.length));
        }
        for (SavingsPlansPurchaseRecommendationDetail ele : savingsPlansPurchaseRecommendationDetails) {
            this.savingsPlansPurchaseRecommendationDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible workloads.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendationDetails
     *        Details for the Savings Plans we recommend you to purchase to cover existing, Savings Plans eligible
     *        workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendation withSavingsPlansPurchaseRecommendationDetails(
            java.util.Collection<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails) {
        setSavingsPlansPurchaseRecommendationDetails(savingsPlansPurchaseRecommendationDetails);
        return this;
    }

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendationSummary
     *        Summary metrics for your Savings Plans Recommendations.
     */

    public void setSavingsPlansPurchaseRecommendationSummary(SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary) {
        this.savingsPlansPurchaseRecommendationSummary = savingsPlansPurchaseRecommendationSummary;
    }

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     * 
     * @return Summary metrics for your Savings Plans Recommendations.
     */

    public SavingsPlansPurchaseRecommendationSummary getSavingsPlansPurchaseRecommendationSummary() {
        return this.savingsPlansPurchaseRecommendationSummary;
    }

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendationSummary
     *        Summary metrics for your Savings Plans Recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendation withSavingsPlansPurchaseRecommendationSummary(
            SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary) {
        setSavingsPlansPurchaseRecommendationSummary(savingsPlansPurchaseRecommendationSummary);
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
        if (getSavingsPlansType() != null)
            sb.append("SavingsPlansType: ").append(getSavingsPlansType()).append(",");
        if (getTermInYears() != null)
            sb.append("TermInYears: ").append(getTermInYears()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getSavingsPlansPurchaseRecommendationDetails() != null)
            sb.append("SavingsPlansPurchaseRecommendationDetails: ").append(getSavingsPlansPurchaseRecommendationDetails()).append(",");
        if (getSavingsPlansPurchaseRecommendationSummary() != null)
            sb.append("SavingsPlansPurchaseRecommendationSummary: ").append(getSavingsPlansPurchaseRecommendationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansPurchaseRecommendation == false)
            return false;
        SavingsPlansPurchaseRecommendation other = (SavingsPlansPurchaseRecommendation) obj;
        if (other.getSavingsPlansType() == null ^ this.getSavingsPlansType() == null)
            return false;
        if (other.getSavingsPlansType() != null && other.getSavingsPlansType().equals(this.getSavingsPlansType()) == false)
            return false;
        if (other.getTermInYears() == null ^ this.getTermInYears() == null)
            return false;
        if (other.getTermInYears() != null && other.getTermInYears().equals(this.getTermInYears()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationDetails() == null ^ this.getSavingsPlansPurchaseRecommendationDetails() == null)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationDetails() != null
                && other.getSavingsPlansPurchaseRecommendationDetails().equals(this.getSavingsPlansPurchaseRecommendationDetails()) == false)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationSummary() == null ^ this.getSavingsPlansPurchaseRecommendationSummary() == null)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationSummary() != null
                && other.getSavingsPlansPurchaseRecommendationSummary().equals(this.getSavingsPlansPurchaseRecommendationSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsPlansType() == null) ? 0 : getSavingsPlansType().hashCode());
        hashCode = prime * hashCode + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode
                + ((getSavingsPlansPurchaseRecommendationDetails() == null) ? 0 : getSavingsPlansPurchaseRecommendationDetails().hashCode());
        hashCode = prime * hashCode
                + ((getSavingsPlansPurchaseRecommendationSummary() == null) ? 0 : getSavingsPlansPurchaseRecommendationSummary().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansPurchaseRecommendation clone() {
        try {
            return (SavingsPlansPurchaseRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansPurchaseRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
