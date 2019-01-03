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
 * A summary about this recommendation, such as the currency code, the amount that AWS estimates that you could save,
 * and the total amount of reservation to purchase.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationPurchaseRecommendationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPurchaseRecommendationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month.
     * </p>
     */
    private String totalEstimatedMonthlySavingsAmount;
    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your
     * costs.
     * </p>
     */
    private String totalEstimatedMonthlySavingsPercentage;
    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month.
     * </p>
     * 
     * @param totalEstimatedMonthlySavingsAmount
     *        The total amount that AWS estimates that this recommendation could save you in a month.
     */

    public void setTotalEstimatedMonthlySavingsAmount(String totalEstimatedMonthlySavingsAmount) {
        this.totalEstimatedMonthlySavingsAmount = totalEstimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month.
     * </p>
     * 
     * @return The total amount that AWS estimates that this recommendation could save you in a month.
     */

    public String getTotalEstimatedMonthlySavingsAmount() {
        return this.totalEstimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month.
     * </p>
     * 
     * @param totalEstimatedMonthlySavingsAmount
     *        The total amount that AWS estimates that this recommendation could save you in a month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationSummary withTotalEstimatedMonthlySavingsAmount(String totalEstimatedMonthlySavingsAmount) {
        setTotalEstimatedMonthlySavingsAmount(totalEstimatedMonthlySavingsAmount);
        return this;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your
     * costs.
     * </p>
     * 
     * @param totalEstimatedMonthlySavingsPercentage
     *        The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of
     *        your costs.
     */

    public void setTotalEstimatedMonthlySavingsPercentage(String totalEstimatedMonthlySavingsPercentage) {
        this.totalEstimatedMonthlySavingsPercentage = totalEstimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your
     * costs.
     * </p>
     * 
     * @return The total amount that AWS estimates that this recommendation could save you in a month, as a percentage
     *         of your costs.
     */

    public String getTotalEstimatedMonthlySavingsPercentage() {
        return this.totalEstimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your
     * costs.
     * </p>
     * 
     * @param totalEstimatedMonthlySavingsPercentage
     *        The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of
     *        your costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationSummary withTotalEstimatedMonthlySavingsPercentage(String totalEstimatedMonthlySavingsPercentage) {
        setTotalEstimatedMonthlySavingsPercentage(totalEstimatedMonthlySavingsPercentage);
        return this;
    }

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * 
     * @param currencyCode
     *        The currency code used for this recommendation.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * 
     * @return The currency code used for this recommendation.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * 
     * @param currencyCode
     *        The currency code used for this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationSummary withCurrencyCode(String currencyCode) {
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
        if (getTotalEstimatedMonthlySavingsAmount() != null)
            sb.append("TotalEstimatedMonthlySavingsAmount: ").append(getTotalEstimatedMonthlySavingsAmount()).append(",");
        if (getTotalEstimatedMonthlySavingsPercentage() != null)
            sb.append("TotalEstimatedMonthlySavingsPercentage: ").append(getTotalEstimatedMonthlySavingsPercentage()).append(",");
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

        if (obj instanceof ReservationPurchaseRecommendationSummary == false)
            return false;
        ReservationPurchaseRecommendationSummary other = (ReservationPurchaseRecommendationSummary) obj;
        if (other.getTotalEstimatedMonthlySavingsAmount() == null ^ this.getTotalEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getTotalEstimatedMonthlySavingsAmount() != null
                && other.getTotalEstimatedMonthlySavingsAmount().equals(this.getTotalEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getTotalEstimatedMonthlySavingsPercentage() == null ^ this.getTotalEstimatedMonthlySavingsPercentage() == null)
            return false;
        if (other.getTotalEstimatedMonthlySavingsPercentage() != null
                && other.getTotalEstimatedMonthlySavingsPercentage().equals(this.getTotalEstimatedMonthlySavingsPercentage()) == false)
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

        hashCode = prime * hashCode + ((getTotalEstimatedMonthlySavingsAmount() == null) ? 0 : getTotalEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getTotalEstimatedMonthlySavingsPercentage() == null) ? 0 : getTotalEstimatedMonthlySavingsPercentage().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        return hashCode;
    }

    @Override
    public ReservationPurchaseRecommendationSummary clone() {
        try {
            return (ReservationPurchaseRecommendationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationPurchaseRecommendationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
