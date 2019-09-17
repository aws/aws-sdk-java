/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A specific reservation that AWS recommends for purchase.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationPurchaseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPurchaseRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this
     * reservation for an entire organization in AWS Organizations.
     * </p>
     */
    private String accountScope;
    /**
     * <p>
     * How many days of previous usage that AWS considers when making this recommendation.
     * </p>
     */
    private String lookbackPeriodInDays;
    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     */
    private String termInYears;
    /**
     * <p>
     * The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * Hardware specifications for the service that you want recommendations for.
     * </p>
     */
    private ServiceSpecification serviceSpecification;
    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     */
    private java.util.List<ReservationPurchaseRecommendationDetail> recommendationDetails;
    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     */
    private ReservationPurchaseRecommendationSummary recommendationSummary;

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this
     * reservation for an entire organization in AWS Organizations.
     * </p>
     * 
     * @param accountScope
     *        The account scope that AWS recommends that you purchase this instance for. For example, you can purchase
     *        this reservation for an entire organization in AWS Organizations.
     * @see AccountScope
     */

    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this
     * reservation for an entire organization in AWS Organizations.
     * </p>
     * 
     * @return The account scope that AWS recommends that you purchase this instance for. For example, you can purchase
     *         this reservation for an entire organization in AWS Organizations.
     * @see AccountScope
     */

    public String getAccountScope() {
        return this.accountScope;
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this
     * reservation for an entire organization in AWS Organizations.
     * </p>
     * 
     * @param accountScope
     *        The account scope that AWS recommends that you purchase this instance for. For example, you can purchase
     *        this reservation for an entire organization in AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountScope
     */

    public ReservationPurchaseRecommendation withAccountScope(String accountScope) {
        setAccountScope(accountScope);
        return this;
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this
     * reservation for an entire organization in AWS Organizations.
     * </p>
     * 
     * @param accountScope
     *        The account scope that AWS recommends that you purchase this instance for. For example, you can purchase
     *        this reservation for an entire organization in AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountScope
     */

    public ReservationPurchaseRecommendation withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that AWS considers when making this recommendation.
     * @see LookbackPeriodInDays
     */

    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this recommendation.
     * </p>
     * 
     * @return How many days of previous usage that AWS considers when making this recommendation.
     * @see LookbackPeriodInDays
     */

    public String getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that AWS considers when making this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public ReservationPurchaseRecommendation withLookbackPeriodInDays(String lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that AWS considers when making this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public ReservationPurchaseRecommendation withLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * 
     * @param termInYears
     *        The term of the reservation that you want recommendations for, in years.
     * @see TermInYears
     */

    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * 
     * @return The term of the reservation that you want recommendations for, in years.
     * @see TermInYears
     */

    public String getTermInYears() {
        return this.termInYears;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * 
     * @param termInYears
     *        The term of the reservation that you want recommendations for, in years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public ReservationPurchaseRecommendation withTermInYears(String termInYears) {
        setTermInYears(termInYears);
        return this;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * 
     * @param termInYears
     *        The term of the reservation that you want recommendations for, in years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public ReservationPurchaseRecommendation withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * 
     * @return The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public ReservationPurchaseRecommendation withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the reservation. For example, <code>AllUpfront</code> or <code>NoUpfront</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public ReservationPurchaseRecommendation withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations for.
     * </p>
     * 
     * @param serviceSpecification
     *        Hardware specifications for the service that you want recommendations for.
     */

    public void setServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations for.
     * </p>
     * 
     * @return Hardware specifications for the service that you want recommendations for.
     */

    public ServiceSpecification getServiceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations for.
     * </p>
     * 
     * @param serviceSpecification
     *        Hardware specifications for the service that you want recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendation withServiceSpecification(ServiceSpecification serviceSpecification) {
        setServiceSpecification(serviceSpecification);
        return this;
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     * 
     * @return Details about the recommended purchases.
     */

    public java.util.List<ReservationPurchaseRecommendationDetail> getRecommendationDetails() {
        return recommendationDetails;
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     * 
     * @param recommendationDetails
     *        Details about the recommended purchases.
     */

    public void setRecommendationDetails(java.util.Collection<ReservationPurchaseRecommendationDetail> recommendationDetails) {
        if (recommendationDetails == null) {
            this.recommendationDetails = null;
            return;
        }

        this.recommendationDetails = new java.util.ArrayList<ReservationPurchaseRecommendationDetail>(recommendationDetails);
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationDetails(java.util.Collection)} or
     * {@link #withRecommendationDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationDetails
     *        Details about the recommended purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendation withRecommendationDetails(ReservationPurchaseRecommendationDetail... recommendationDetails) {
        if (this.recommendationDetails == null) {
            setRecommendationDetails(new java.util.ArrayList<ReservationPurchaseRecommendationDetail>(recommendationDetails.length));
        }
        for (ReservationPurchaseRecommendationDetail ele : recommendationDetails) {
            this.recommendationDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     * 
     * @param recommendationDetails
     *        Details about the recommended purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendation withRecommendationDetails(java.util.Collection<ReservationPurchaseRecommendationDetail> recommendationDetails) {
        setRecommendationDetails(recommendationDetails);
        return this;
    }

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     * 
     * @param recommendationSummary
     *        A summary about the recommended purchase.
     */

    public void setRecommendationSummary(ReservationPurchaseRecommendationSummary recommendationSummary) {
        this.recommendationSummary = recommendationSummary;
    }

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     * 
     * @return A summary about the recommended purchase.
     */

    public ReservationPurchaseRecommendationSummary getRecommendationSummary() {
        return this.recommendationSummary;
    }

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     * 
     * @param recommendationSummary
     *        A summary about the recommended purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendation withRecommendationSummary(ReservationPurchaseRecommendationSummary recommendationSummary) {
        setRecommendationSummary(recommendationSummary);
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
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getTermInYears() != null)
            sb.append("TermInYears: ").append(getTermInYears()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getServiceSpecification() != null)
            sb.append("ServiceSpecification: ").append(getServiceSpecification()).append(",");
        if (getRecommendationDetails() != null)
            sb.append("RecommendationDetails: ").append(getRecommendationDetails()).append(",");
        if (getRecommendationSummary() != null)
            sb.append("RecommendationSummary: ").append(getRecommendationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendation == false)
            return false;
        ReservationPurchaseRecommendation other = (ReservationPurchaseRecommendation) obj;
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getTermInYears() == null ^ this.getTermInYears() == null)
            return false;
        if (other.getTermInYears() != null && other.getTermInYears().equals(this.getTermInYears()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getServiceSpecification() == null ^ this.getServiceSpecification() == null)
            return false;
        if (other.getServiceSpecification() != null && other.getServiceSpecification().equals(this.getServiceSpecification()) == false)
            return false;
        if (other.getRecommendationDetails() == null ^ this.getRecommendationDetails() == null)
            return false;
        if (other.getRecommendationDetails() != null && other.getRecommendationDetails().equals(this.getRecommendationDetails()) == false)
            return false;
        if (other.getRecommendationSummary() == null ^ this.getRecommendationSummary() == null)
            return false;
        if (other.getRecommendationSummary() != null && other.getRecommendationSummary().equals(this.getRecommendationSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getServiceSpecification() == null) ? 0 : getServiceSpecification().hashCode());
        hashCode = prime * hashCode + ((getRecommendationDetails() == null) ? 0 : getRecommendationDetails().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSummary() == null) ? 0 : getRecommendationSummary().hashCode());
        return hashCode;
    }

    @Override
    public ReservationPurchaseRecommendation clone() {
        try {
            return (ReservationPurchaseRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationPurchaseRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
