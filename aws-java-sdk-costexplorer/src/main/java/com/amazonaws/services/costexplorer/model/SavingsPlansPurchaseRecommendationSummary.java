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
 * Summary metrics for your Savings Plans Purchase Recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansPurchaseRecommendationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans and estimated savings.
     * </p>
     */
    private String estimatedROI;
    /**
     * <p>
     * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost
     * of Savings Plans during this term, and the remaining On-Demand usage.
     * </p>
     */
    private String estimatedTotalCost;
    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the lookback period.
     * </p>
     */
    private String currentOnDemandSpend;
    /**
     * <p>
     * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
     * </p>
     */
    private String estimatedSavingsAmount;
    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your account.
     * </p>
     */
    private String totalRecommendationCount;
    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     */
    private String dailyCommitmentToPurchase;
    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     */
    private String hourlyCommitmentToPurchase;
    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated
     * as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>*100.
     * </p>
     */
    private String estimatedSavingsPercentage;
    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     * </p>
     */
    private String estimatedMonthlySavingsAmount;
    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected
     * time period and the Savings Plans you own.
     * </p>
     */
    private String estimatedOnDemandCostWithCurrentCommitment;

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans and estimated savings.
     * </p>
     * 
     * @param estimatedROI
     *        The estimated return on investment based on the recommended Savings Plans and estimated savings.
     */

    public void setEstimatedROI(String estimatedROI) {
        this.estimatedROI = estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans and estimated savings.
     * </p>
     * 
     * @return The estimated return on investment based on the recommended Savings Plans and estimated savings.
     */

    public String getEstimatedROI() {
        return this.estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans and estimated savings.
     * </p>
     * 
     * @param estimatedROI
     *        The estimated return on investment based on the recommended Savings Plans and estimated savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withEstimatedROI(String estimatedROI) {
        setEstimatedROI(estimatedROI);
        return this;
    }

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     * </p>
     * 
     * @param currencyCode
     *        The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     * </p>
     * 
     * @return The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     * </p>
     * 
     * @param currencyCode
     *        The currency code Amazon Web Services used to generate the recommendations and present potential savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost
     * of Savings Plans during this term, and the remaining On-Demand usage.
     * </p>
     * 
     * @param estimatedTotalCost
     *        The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the
     *        cost of Savings Plans during this term, and the remaining On-Demand usage.
     */

    public void setEstimatedTotalCost(String estimatedTotalCost) {
        this.estimatedTotalCost = estimatedTotalCost;
    }

    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost
     * of Savings Plans during this term, and the remaining On-Demand usage.
     * </p>
     * 
     * @return The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of
     *         the cost of Savings Plans during this term, and the remaining On-Demand usage.
     */

    public String getEstimatedTotalCost() {
        return this.estimatedTotalCost;
    }

    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the cost
     * of Savings Plans during this term, and the remaining On-Demand usage.
     * </p>
     * 
     * @param estimatedTotalCost
     *        The estimated total cost of the usage after purchasing the recommended Savings Plans. This is a sum of the
     *        cost of Savings Plans during this term, and the remaining On-Demand usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withEstimatedTotalCost(String estimatedTotalCost) {
        setEstimatedTotalCost(estimatedTotalCost);
        return this;
    }

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the lookback period.
     * </p>
     * 
     * @param currentOnDemandSpend
     *        The current total on demand spend of the applicable usage types over the lookback period.
     */

    public void setCurrentOnDemandSpend(String currentOnDemandSpend) {
        this.currentOnDemandSpend = currentOnDemandSpend;
    }

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the lookback period.
     * </p>
     * 
     * @return The current total on demand spend of the applicable usage types over the lookback period.
     */

    public String getCurrentOnDemandSpend() {
        return this.currentOnDemandSpend;
    }

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the lookback period.
     * </p>
     * 
     * @param currentOnDemandSpend
     *        The current total on demand spend of the applicable usage types over the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withCurrentOnDemandSpend(String currentOnDemandSpend) {
        setCurrentOnDemandSpend(currentOnDemandSpend);
        return this;
    }

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
     * </p>
     * 
     * @param estimatedSavingsAmount
     *        The estimated total savings over the lookback period, based on the purchase of the recommended Savings
     *        Plans.
     */

    public void setEstimatedSavingsAmount(String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
     * </p>
     * 
     * @return The estimated total savings over the lookback period, based on the purchase of the recommended Savings
     *         Plans.
     */

    public String getEstimatedSavingsAmount() {
        return this.estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the purchase of the recommended Savings Plans.
     * </p>
     * 
     * @param estimatedSavingsAmount
     *        The estimated total savings over the lookback period, based on the purchase of the recommended Savings
     *        Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withEstimatedSavingsAmount(String estimatedSavingsAmount) {
        setEstimatedSavingsAmount(estimatedSavingsAmount);
        return this;
    }

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your account.
     * </p>
     * 
     * @param totalRecommendationCount
     *        The aggregate number of Savings Plans recommendations that exist for your account.
     */

    public void setTotalRecommendationCount(String totalRecommendationCount) {
        this.totalRecommendationCount = totalRecommendationCount;
    }

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your account.
     * </p>
     * 
     * @return The aggregate number of Savings Plans recommendations that exist for your account.
     */

    public String getTotalRecommendationCount() {
        return this.totalRecommendationCount;
    }

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your account.
     * </p>
     * 
     * @param totalRecommendationCount
     *        The aggregate number of Savings Plans recommendations that exist for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withTotalRecommendationCount(String totalRecommendationCount) {
        setTotalRecommendationCount(totalRecommendationCount);
        return this;
    }

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * 
     * @param dailyCommitmentToPurchase
     *        The recommended Savings Plans cost on a daily (24 hourly) basis.
     */

    public void setDailyCommitmentToPurchase(String dailyCommitmentToPurchase) {
        this.dailyCommitmentToPurchase = dailyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * 
     * @return The recommended Savings Plans cost on a daily (24 hourly) basis.
     */

    public String getDailyCommitmentToPurchase() {
        return this.dailyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * 
     * @param dailyCommitmentToPurchase
     *        The recommended Savings Plans cost on a daily (24 hourly) basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withDailyCommitmentToPurchase(String dailyCommitmentToPurchase) {
        setDailyCommitmentToPurchase(dailyCommitmentToPurchase);
        return this;
    }

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     * 
     * @param hourlyCommitmentToPurchase
     *        The recommended hourly commitment based on the recommendation parameters.
     */

    public void setHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     * 
     * @return The recommended hourly commitment based on the recommendation parameters.
     */

    public String getHourlyCommitmentToPurchase() {
        return this.hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     * 
     * @param hourlyCommitmentToPurchase
     *        The recommended hourly commitment based on the recommendation parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        setHourlyCommitmentToPurchase(hourlyCommitmentToPurchase);
        return this;
    }

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated
     * as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>*100.
     * </p>
     * 
     * @param estimatedSavingsPercentage
     *        The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is
     *        calculated as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code> 100.
     */

    public void setEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated
     * as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>*100.
     * </p>
     * 
     * @return The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is
     *         calculated as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code> 100.
     */

    public String getEstimatedSavingsPercentage() {
        return this.estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is calculated
     * as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>*100.
     * </p>
     * 
     * @param estimatedSavingsPercentage
     *        The estimated savings relative to the total cost of On-Demand usage, over the lookback period. This is
     *        calculated as <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code> 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        setEstimatedSavingsPercentage(estimatedSavingsPercentage);
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     */

    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     * </p>
     * 
     * @return The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     */

    public String getEstimatedMonthlySavingsAmount() {
        return this.estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        The estimated monthly savings amount, based on the recommended Savings Plans purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        setEstimatedMonthlySavingsAmount(estimatedMonthlySavingsAmount);
        return this;
    }

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected
     * time period and the Savings Plans you own.
     * </p>
     * 
     * @param estimatedOnDemandCostWithCurrentCommitment
     *        The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the
     *        selected time period and the Savings Plans you own.
     */

    public void setEstimatedOnDemandCostWithCurrentCommitment(String estimatedOnDemandCostWithCurrentCommitment) {
        this.estimatedOnDemandCostWithCurrentCommitment = estimatedOnDemandCostWithCurrentCommitment;
    }

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected
     * time period and the Savings Plans you own.
     * </p>
     * 
     * @return The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the
     *         selected time period and the Savings Plans you own.
     */

    public String getEstimatedOnDemandCostWithCurrentCommitment() {
        return this.estimatedOnDemandCostWithCurrentCommitment;
    }

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected
     * time period and the Savings Plans you own.
     * </p>
     * 
     * @param estimatedOnDemandCostWithCurrentCommitment
     *        The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the
     *        selected time period and the Savings Plans you own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationSummary withEstimatedOnDemandCostWithCurrentCommitment(String estimatedOnDemandCostWithCurrentCommitment) {
        setEstimatedOnDemandCostWithCurrentCommitment(estimatedOnDemandCostWithCurrentCommitment);
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
        if (getEstimatedROI() != null)
            sb.append("EstimatedROI: ").append(getEstimatedROI()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getEstimatedTotalCost() != null)
            sb.append("EstimatedTotalCost: ").append(getEstimatedTotalCost()).append(",");
        if (getCurrentOnDemandSpend() != null)
            sb.append("CurrentOnDemandSpend: ").append(getCurrentOnDemandSpend()).append(",");
        if (getEstimatedSavingsAmount() != null)
            sb.append("EstimatedSavingsAmount: ").append(getEstimatedSavingsAmount()).append(",");
        if (getTotalRecommendationCount() != null)
            sb.append("TotalRecommendationCount: ").append(getTotalRecommendationCount()).append(",");
        if (getDailyCommitmentToPurchase() != null)
            sb.append("DailyCommitmentToPurchase: ").append(getDailyCommitmentToPurchase()).append(",");
        if (getHourlyCommitmentToPurchase() != null)
            sb.append("HourlyCommitmentToPurchase: ").append(getHourlyCommitmentToPurchase()).append(",");
        if (getEstimatedSavingsPercentage() != null)
            sb.append("EstimatedSavingsPercentage: ").append(getEstimatedSavingsPercentage()).append(",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: ").append(getEstimatedMonthlySavingsAmount()).append(",");
        if (getEstimatedOnDemandCostWithCurrentCommitment() != null)
            sb.append("EstimatedOnDemandCostWithCurrentCommitment: ").append(getEstimatedOnDemandCostWithCurrentCommitment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansPurchaseRecommendationSummary == false)
            return false;
        SavingsPlansPurchaseRecommendationSummary other = (SavingsPlansPurchaseRecommendationSummary) obj;
        if (other.getEstimatedROI() == null ^ this.getEstimatedROI() == null)
            return false;
        if (other.getEstimatedROI() != null && other.getEstimatedROI().equals(this.getEstimatedROI()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getEstimatedTotalCost() == null ^ this.getEstimatedTotalCost() == null)
            return false;
        if (other.getEstimatedTotalCost() != null && other.getEstimatedTotalCost().equals(this.getEstimatedTotalCost()) == false)
            return false;
        if (other.getCurrentOnDemandSpend() == null ^ this.getCurrentOnDemandSpend() == null)
            return false;
        if (other.getCurrentOnDemandSpend() != null && other.getCurrentOnDemandSpend().equals(this.getCurrentOnDemandSpend()) == false)
            return false;
        if (other.getEstimatedSavingsAmount() == null ^ this.getEstimatedSavingsAmount() == null)
            return false;
        if (other.getEstimatedSavingsAmount() != null && other.getEstimatedSavingsAmount().equals(this.getEstimatedSavingsAmount()) == false)
            return false;
        if (other.getTotalRecommendationCount() == null ^ this.getTotalRecommendationCount() == null)
            return false;
        if (other.getTotalRecommendationCount() != null && other.getTotalRecommendationCount().equals(this.getTotalRecommendationCount()) == false)
            return false;
        if (other.getDailyCommitmentToPurchase() == null ^ this.getDailyCommitmentToPurchase() == null)
            return false;
        if (other.getDailyCommitmentToPurchase() != null && other.getDailyCommitmentToPurchase().equals(this.getDailyCommitmentToPurchase()) == false)
            return false;
        if (other.getHourlyCommitmentToPurchase() == null ^ this.getHourlyCommitmentToPurchase() == null)
            return false;
        if (other.getHourlyCommitmentToPurchase() != null && other.getHourlyCommitmentToPurchase().equals(this.getHourlyCommitmentToPurchase()) == false)
            return false;
        if (other.getEstimatedSavingsPercentage() == null ^ this.getEstimatedSavingsPercentage() == null)
            return false;
        if (other.getEstimatedSavingsPercentage() != null && other.getEstimatedSavingsPercentage().equals(this.getEstimatedSavingsPercentage()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() == null ^ this.getEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() != null
                && other.getEstimatedMonthlySavingsAmount().equals(this.getEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() == null ^ this.getEstimatedOnDemandCostWithCurrentCommitment() == null)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() != null
                && other.getEstimatedOnDemandCostWithCurrentCommitment().equals(this.getEstimatedOnDemandCostWithCurrentCommitment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedROI() == null) ? 0 : getEstimatedROI().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTotalCost() == null) ? 0 : getEstimatedTotalCost().hashCode());
        hashCode = prime * hashCode + ((getCurrentOnDemandSpend() == null) ? 0 : getCurrentOnDemandSpend().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsAmount() == null) ? 0 : getEstimatedSavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getTotalRecommendationCount() == null) ? 0 : getTotalRecommendationCount().hashCode());
        hashCode = prime * hashCode + ((getDailyCommitmentToPurchase() == null) ? 0 : getDailyCommitmentToPurchase().hashCode());
        hashCode = prime * hashCode + ((getHourlyCommitmentToPurchase() == null) ? 0 : getHourlyCommitmentToPurchase().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsPercentage() == null) ? 0 : getEstimatedSavingsPercentage().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavingsAmount() == null) ? 0 : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedOnDemandCostWithCurrentCommitment() == null) ? 0 : getEstimatedOnDemandCostWithCurrentCommitment().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansPurchaseRecommendationSummary clone() {
        try {
            return (SavingsPlansPurchaseRecommendationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansPurchaseRecommendationSummaryMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
