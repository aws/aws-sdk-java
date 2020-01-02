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
 * Details for your recommended Savings Plans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/SavingsPlansPurchaseRecommendationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     */
    private SavingsPlansDetails savingsPlansDetails;
    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected payment option.
     * </p>
     */
    private String upfrontCost;
    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code>*100.
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
     * The cost of the recommended Savings Plans over the length of the lookback period.
     * </p>
     */
    private String estimatedSPCost;
    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the
     * lookback period.
     * </p>
     */
    private String estimatedOnDemandCost;
    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional commitment, based on your usage of the selected
     * time period and the Savings Plans you own.
     * </p>
     */
    private String estimatedOnDemandCostWithCurrentCommitment;
    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
     * </p>
     */
    private String estimatedSavingsAmount;
    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback
     * period.
     * </p>
     */
    private String estimatedSavingsPercentage;
    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during
     * the lookback period.
     * </p>
     */
    private String hourlyCommitmentToPurchase;
    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     */
    private String estimatedAverageUtilization;
    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans.
     * </p>
     */
    private String estimatedMonthlySavingsAmount;
    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     */
    private String currentMinimumHourlyOnDemandSpend;
    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     */
    private String currentMaximumHourlyOnDemandSpend;
    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     */
    private String currentAverageHourlyOnDemandSpend;

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     * 
     * @param savingsPlansDetails
     *        Details for your recommended Savings Plans.
     */

    public void setSavingsPlansDetails(SavingsPlansDetails savingsPlansDetails) {
        this.savingsPlansDetails = savingsPlansDetails;
    }

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     * 
     * @return Details for your recommended Savings Plans.
     */

    public SavingsPlansDetails getSavingsPlansDetails() {
        return this.savingsPlansDetails;
    }

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     * 
     * @param savingsPlansDetails
     *        Details for your recommended Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withSavingsPlansDetails(SavingsPlansDetails savingsPlansDetails) {
        setSavingsPlansDetails(savingsPlansDetails);
        return this;
    }

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountID</code> the recommendation is generated for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     * 
     * @return The <code>AccountID</code> the recommendation is generated for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountID</code> the recommendation is generated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected payment option.
     * </p>
     * 
     * @param upfrontCost
     *        The upfront cost of the recommended Savings Plans, based on the selected payment option.
     */

    public void setUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected payment option.
     * </p>
     * 
     * @return The upfront cost of the recommended Savings Plans, based on the selected payment option.
     */

    public String getUpfrontCost() {
        return this.upfrontCost;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected payment option.
     * </p>
     * 
     * @param upfrontCost
     *        The upfront cost of the recommended Savings Plans, based on the selected payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withUpfrontCost(String upfrontCost) {
        setUpfrontCost(upfrontCost);
        return this;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code>*100.
     * </p>
     * 
     * @param estimatedROI
     *        The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as
     *        <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code> 100.
     */

    public void setEstimatedROI(String estimatedROI) {
        this.estimatedROI = estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code>*100.
     * </p>
     * 
     * @return The estimated return on investment based on the recommended Savings Plans purchased. This is calculated
     *         as <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code> 100.
     */

    public String getEstimatedROI() {
        return this.estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code>*100.
     * </p>
     * 
     * @param estimatedROI
     *        The estimated return on investment based on the recommended Savings Plans purchased. This is calculated as
     *        <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code> 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedROI(String estimatedROI) {
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

    public SavingsPlansPurchaseRecommendationDetail withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSPCost
     *        The cost of the recommended Savings Plans over the length of the lookback period.
     */

    public void setEstimatedSPCost(String estimatedSPCost) {
        this.estimatedSPCost = estimatedSPCost;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback period.
     * </p>
     * 
     * @return The cost of the recommended Savings Plans over the length of the lookback period.
     */

    public String getEstimatedSPCost() {
        return this.estimatedSPCost;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSPCost
     *        The cost of the recommended Savings Plans over the length of the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedSPCost(String estimatedSPCost) {
        setEstimatedSPCost(estimatedSPCost);
        return this;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the
     * lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length
     *        of the lookback period.
     */

    public void setEstimatedOnDemandCost(String estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the
     * lookback period.
     * </p>
     * 
     * @return The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the
     *         length of the lookback period.
     */

    public String getEstimatedOnDemandCost() {
        return this.estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length of the
     * lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended Savings Plans, over the length
     *        of the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedOnDemandCost(String estimatedOnDemandCost) {
        setEstimatedOnDemandCost(estimatedOnDemandCost);
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

    public SavingsPlansPurchaseRecommendationDetail withEstimatedOnDemandCostWithCurrentCommitment(String estimatedOnDemandCostWithCurrentCommitment) {
        setEstimatedOnDemandCostWithCurrentCommitment(estimatedOnDemandCostWithCurrentCommitment);
        return this;
    }

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSavingsAmount
     *        The estimated savings amount based on the recommended Savings Plans over the length of the lookback
     *        period.
     */

    public void setEstimatedSavingsAmount(String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
     * </p>
     * 
     * @return The estimated savings amount based on the recommended Savings Plans over the length of the lookback
     *         period.
     */

    public String getEstimatedSavingsAmount() {
        return this.estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSavingsAmount
     *        The estimated savings amount based on the recommended Savings Plans over the length of the lookback
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedSavingsAmount(String estimatedSavingsAmount) {
        setEstimatedSavingsAmount(estimatedSavingsAmount);
        return this;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback
     * period.
     * </p>
     * 
     * @param estimatedSavingsPercentage
     *        The estimated savings percentage relative to the total cost of applicable On-Demand usage over the
     *        lookback period.
     */

    public void setEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback
     * period.
     * </p>
     * 
     * @return The estimated savings percentage relative to the total cost of applicable On-Demand usage over the
     *         lookback period.
     */

    public String getEstimatedSavingsPercentage() {
        return this.estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable On-Demand usage over the lookback
     * period.
     * </p>
     * 
     * @param estimatedSavingsPercentage
     *        The estimated savings percentage relative to the total cost of applicable On-Demand usage over the
     *        lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        setEstimatedSavingsPercentage(estimatedSavingsPercentage);
        return this;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during
     * the lookback period.
     * </p>
     * 
     * @param hourlyCommitmentToPurchase
     *        The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage
     *        during the lookback period.
     */

    public void setHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during
     * the lookback period.
     * </p>
     * 
     * @return The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage
     *         during the lookback period.
     */

    public String getHourlyCommitmentToPurchase() {
        return this.hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage during
     * the lookback period.
     * </p>
     * 
     * @param hourlyCommitmentToPurchase
     *        The recommended hourly commitment level for the Savings Plans type, and configuration based on the usage
     *        during the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        setHourlyCommitmentToPurchase(hourlyCommitmentToPurchase);
        return this;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * 
     * @param estimatedAverageUtilization
     *        The estimated utilization of the recommended Savings Plans.
     */

    public void setEstimatedAverageUtilization(String estimatedAverageUtilization) {
        this.estimatedAverageUtilization = estimatedAverageUtilization;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * 
     * @return The estimated utilization of the recommended Savings Plans.
     */

    public String getEstimatedAverageUtilization() {
        return this.estimatedAverageUtilization;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * 
     * @param estimatedAverageUtilization
     *        The estimated utilization of the recommended Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedAverageUtilization(String estimatedAverageUtilization) {
        setEstimatedAverageUtilization(estimatedAverageUtilization);
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        The estimated monthly savings amount, based on the recommended Savings Plans.
     */

    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans.
     * </p>
     * 
     * @return The estimated monthly savings amount, based on the recommended Savings Plans.
     */

    public String getEstimatedMonthlySavingsAmount() {
        return this.estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings Plans.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        The estimated monthly savings amount, based on the recommended Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        setEstimatedMonthlySavingsAmount(estimatedMonthlySavingsAmount);
        return this;
    }

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @param currentMinimumHourlyOnDemandSpend
     *        The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     */

    public void setCurrentMinimumHourlyOnDemandSpend(String currentMinimumHourlyOnDemandSpend) {
        this.currentMinimumHourlyOnDemandSpend = currentMinimumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @return The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     */

    public String getCurrentMinimumHourlyOnDemandSpend() {
        return this.currentMinimumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @param currentMinimumHourlyOnDemandSpend
     *        The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withCurrentMinimumHourlyOnDemandSpend(String currentMinimumHourlyOnDemandSpend) {
        setCurrentMinimumHourlyOnDemandSpend(currentMinimumHourlyOnDemandSpend);
        return this;
    }

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @param currentMaximumHourlyOnDemandSpend
     *        The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     */

    public void setCurrentMaximumHourlyOnDemandSpend(String currentMaximumHourlyOnDemandSpend) {
        this.currentMaximumHourlyOnDemandSpend = currentMaximumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @return The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     */

    public String getCurrentMaximumHourlyOnDemandSpend() {
        return this.currentMaximumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @param currentMaximumHourlyOnDemandSpend
     *        The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withCurrentMaximumHourlyOnDemandSpend(String currentMaximumHourlyOnDemandSpend) {
        setCurrentMaximumHourlyOnDemandSpend(currentMaximumHourlyOnDemandSpend);
        return this;
    }

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @param currentAverageHourlyOnDemandSpend
     *        The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     */

    public void setCurrentAverageHourlyOnDemandSpend(String currentAverageHourlyOnDemandSpend) {
        this.currentAverageHourlyOnDemandSpend = currentAverageHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @return The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     */

    public String getCurrentAverageHourlyOnDemandSpend() {
        return this.currentAverageHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     * 
     * @param currentAverageHourlyOnDemandSpend
     *        The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlansPurchaseRecommendationDetail withCurrentAverageHourlyOnDemandSpend(String currentAverageHourlyOnDemandSpend) {
        setCurrentAverageHourlyOnDemandSpend(currentAverageHourlyOnDemandSpend);
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
        if (getSavingsPlansDetails() != null)
            sb.append("SavingsPlansDetails: ").append(getSavingsPlansDetails()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getUpfrontCost() != null)
            sb.append("UpfrontCost: ").append(getUpfrontCost()).append(",");
        if (getEstimatedROI() != null)
            sb.append("EstimatedROI: ").append(getEstimatedROI()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getEstimatedSPCost() != null)
            sb.append("EstimatedSPCost: ").append(getEstimatedSPCost()).append(",");
        if (getEstimatedOnDemandCost() != null)
            sb.append("EstimatedOnDemandCost: ").append(getEstimatedOnDemandCost()).append(",");
        if (getEstimatedOnDemandCostWithCurrentCommitment() != null)
            sb.append("EstimatedOnDemandCostWithCurrentCommitment: ").append(getEstimatedOnDemandCostWithCurrentCommitment()).append(",");
        if (getEstimatedSavingsAmount() != null)
            sb.append("EstimatedSavingsAmount: ").append(getEstimatedSavingsAmount()).append(",");
        if (getEstimatedSavingsPercentage() != null)
            sb.append("EstimatedSavingsPercentage: ").append(getEstimatedSavingsPercentage()).append(",");
        if (getHourlyCommitmentToPurchase() != null)
            sb.append("HourlyCommitmentToPurchase: ").append(getHourlyCommitmentToPurchase()).append(",");
        if (getEstimatedAverageUtilization() != null)
            sb.append("EstimatedAverageUtilization: ").append(getEstimatedAverageUtilization()).append(",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: ").append(getEstimatedMonthlySavingsAmount()).append(",");
        if (getCurrentMinimumHourlyOnDemandSpend() != null)
            sb.append("CurrentMinimumHourlyOnDemandSpend: ").append(getCurrentMinimumHourlyOnDemandSpend()).append(",");
        if (getCurrentMaximumHourlyOnDemandSpend() != null)
            sb.append("CurrentMaximumHourlyOnDemandSpend: ").append(getCurrentMaximumHourlyOnDemandSpend()).append(",");
        if (getCurrentAverageHourlyOnDemandSpend() != null)
            sb.append("CurrentAverageHourlyOnDemandSpend: ").append(getCurrentAverageHourlyOnDemandSpend());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansPurchaseRecommendationDetail == false)
            return false;
        SavingsPlansPurchaseRecommendationDetail other = (SavingsPlansPurchaseRecommendationDetail) obj;
        if (other.getSavingsPlansDetails() == null ^ this.getSavingsPlansDetails() == null)
            return false;
        if (other.getSavingsPlansDetails() != null && other.getSavingsPlansDetails().equals(this.getSavingsPlansDetails()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUpfrontCost() == null ^ this.getUpfrontCost() == null)
            return false;
        if (other.getUpfrontCost() != null && other.getUpfrontCost().equals(this.getUpfrontCost()) == false)
            return false;
        if (other.getEstimatedROI() == null ^ this.getEstimatedROI() == null)
            return false;
        if (other.getEstimatedROI() != null && other.getEstimatedROI().equals(this.getEstimatedROI()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getEstimatedSPCost() == null ^ this.getEstimatedSPCost() == null)
            return false;
        if (other.getEstimatedSPCost() != null && other.getEstimatedSPCost().equals(this.getEstimatedSPCost()) == false)
            return false;
        if (other.getEstimatedOnDemandCost() == null ^ this.getEstimatedOnDemandCost() == null)
            return false;
        if (other.getEstimatedOnDemandCost() != null && other.getEstimatedOnDemandCost().equals(this.getEstimatedOnDemandCost()) == false)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() == null ^ this.getEstimatedOnDemandCostWithCurrentCommitment() == null)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() != null
                && other.getEstimatedOnDemandCostWithCurrentCommitment().equals(this.getEstimatedOnDemandCostWithCurrentCommitment()) == false)
            return false;
        if (other.getEstimatedSavingsAmount() == null ^ this.getEstimatedSavingsAmount() == null)
            return false;
        if (other.getEstimatedSavingsAmount() != null && other.getEstimatedSavingsAmount().equals(this.getEstimatedSavingsAmount()) == false)
            return false;
        if (other.getEstimatedSavingsPercentage() == null ^ this.getEstimatedSavingsPercentage() == null)
            return false;
        if (other.getEstimatedSavingsPercentage() != null && other.getEstimatedSavingsPercentage().equals(this.getEstimatedSavingsPercentage()) == false)
            return false;
        if (other.getHourlyCommitmentToPurchase() == null ^ this.getHourlyCommitmentToPurchase() == null)
            return false;
        if (other.getHourlyCommitmentToPurchase() != null && other.getHourlyCommitmentToPurchase().equals(this.getHourlyCommitmentToPurchase()) == false)
            return false;
        if (other.getEstimatedAverageUtilization() == null ^ this.getEstimatedAverageUtilization() == null)
            return false;
        if (other.getEstimatedAverageUtilization() != null && other.getEstimatedAverageUtilization().equals(this.getEstimatedAverageUtilization()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() == null ^ this.getEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() != null
                && other.getEstimatedMonthlySavingsAmount().equals(this.getEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getCurrentMinimumHourlyOnDemandSpend() == null ^ this.getCurrentMinimumHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentMinimumHourlyOnDemandSpend() != null
                && other.getCurrentMinimumHourlyOnDemandSpend().equals(this.getCurrentMinimumHourlyOnDemandSpend()) == false)
            return false;
        if (other.getCurrentMaximumHourlyOnDemandSpend() == null ^ this.getCurrentMaximumHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentMaximumHourlyOnDemandSpend() != null
                && other.getCurrentMaximumHourlyOnDemandSpend().equals(this.getCurrentMaximumHourlyOnDemandSpend()) == false)
            return false;
        if (other.getCurrentAverageHourlyOnDemandSpend() == null ^ this.getCurrentAverageHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentAverageHourlyOnDemandSpend() != null
                && other.getCurrentAverageHourlyOnDemandSpend().equals(this.getCurrentAverageHourlyOnDemandSpend()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsPlansDetails() == null) ? 0 : getSavingsPlansDetails().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUpfrontCost() == null) ? 0 : getUpfrontCost().hashCode());
        hashCode = prime * hashCode + ((getEstimatedROI() == null) ? 0 : getEstimatedROI().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSPCost() == null) ? 0 : getEstimatedSPCost().hashCode());
        hashCode = prime * hashCode + ((getEstimatedOnDemandCost() == null) ? 0 : getEstimatedOnDemandCost().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedOnDemandCostWithCurrentCommitment() == null) ? 0 : getEstimatedOnDemandCostWithCurrentCommitment().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsAmount() == null) ? 0 : getEstimatedSavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsPercentage() == null) ? 0 : getEstimatedSavingsPercentage().hashCode());
        hashCode = prime * hashCode + ((getHourlyCommitmentToPurchase() == null) ? 0 : getHourlyCommitmentToPurchase().hashCode());
        hashCode = prime * hashCode + ((getEstimatedAverageUtilization() == null) ? 0 : getEstimatedAverageUtilization().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavingsAmount() == null) ? 0 : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getCurrentMinimumHourlyOnDemandSpend() == null) ? 0 : getCurrentMinimumHourlyOnDemandSpend().hashCode());
        hashCode = prime * hashCode + ((getCurrentMaximumHourlyOnDemandSpend() == null) ? 0 : getCurrentMaximumHourlyOnDemandSpend().hashCode());
        hashCode = prime * hashCode + ((getCurrentAverageHourlyOnDemandSpend() == null) ? 0 : getCurrentAverageHourlyOnDemandSpend().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlansPurchaseRecommendationDetail clone() {
        try {
            return (SavingsPlansPurchaseRecommendationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.SavingsPlansPurchaseRecommendationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
