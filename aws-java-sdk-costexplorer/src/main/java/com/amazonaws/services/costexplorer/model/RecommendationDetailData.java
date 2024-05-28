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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details and metrics for the given recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RecommendationDetailData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationDetailData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     * recommendations are calculated for individual member accounts only.
     * </p>
     */
    private String accountScope;
    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     */
    private String lookbackPeriodInDays;
    /**
     * <p>
     * The requested Savings Plan recommendation type.
     * </p>
     */
    private String savingsPlansType;
    /**
     * <p>
     * The term of the commitment in years.
     * </p>
     */
    private String termInYears;
    /**
     * <p>
     * The payment option for the commitment (for example, All Upfront or No Upfront).
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The AccountID that the recommendation is generated for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The currency code that Amazon Web Services used to generate the recommendation and present potential savings.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The instance family of the recommended Savings Plan.
     * </p>
     */
    private String instanceFamily;
    /**
     * <p>
     * The region the recommendation is generated for.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The unique ID that's used to distinguish Savings Plans from one another.
     * </p>
     */
    private String offeringId;

    private String generationTimestamp;

    private String latestUsageTimestamp;
    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     */
    private String currentAverageHourlyOnDemandSpend;
    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     */
    private String currentMaximumHourlyOnDemandSpend;
    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of the applicable usage type.
     * </p>
     */
    private String currentMinimumHourlyOnDemandSpend;
    /**
     * <p>
     * The estimated utilization of the recommended Savings Plan.
     * </p>
     */
    private String estimatedAverageUtilization;
    /**
     * <p>
     * The estimated monthly savings amount based on the recommended Savings Plan.
     * </p>
     */
    private String estimatedMonthlySavingsAmount;
    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     */
    private String estimatedOnDemandCost;
    /**
     * <p>
     * The estimated On-Demand costs you expect with no additional commitment, based on your usage of the selected time
     * period and the Savings Plan you own.
     * </p>
     */
    private String estimatedOnDemandCostWithCurrentCommitment;
    /**
     * <p>
     * The estimated return on investment that's based on the recommended Savings Plan that you purchased. This is
     * calculated as estimatedSavingsAmount/estimatedSPCost*100.
     * </p>
     */
    private String estimatedROI;
    /**
     * <p>
     * The cost of the recommended Savings Plan over the length of the lookback period.
     * </p>
     */
    private String estimatedSPCost;
    /**
     * <p>
     * The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback period.
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
     * The existing hourly commitment for the Savings Plan type.
     * </p>
     */
    private String existingHourlyCommitment;
    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plan type and the configuration that's based on the usage
     * during the lookback period.
     * </p>
     */
    private String hourlyCommitmentToPurchase;
    /**
     * <p>
     * The upfront cost of the recommended Savings Plan, based on the selected payment option.
     * </p>
     */
    private String upfrontCost;
    /**
     * <p>
     * The average value of hourly coverage over the lookback period.
     * </p>
     */
    private String currentAverageCoverage;
    /**
     * <p>
     * The estimated coverage of the recommended Savings Plan.
     * </p>
     */
    private String estimatedAverageCoverage;
    /**
     * <p>
     * The related hourly cost, coverage, and utilization metrics over the lookback period.
     * </p>
     */
    private java.util.List<RecommendationDetailHourlyMetrics> metricsOverLookbackPeriod;

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     * recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *        including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     *        recommendations are calculated for individual member accounts only.
     * @see AccountScope
     */

    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     * recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @return The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *         including the management account and member accounts if the value is set to PAYER. If the value is
     *         LINKED, recommendations are calculated for individual member accounts only.
     * @see AccountScope
     */

    public String getAccountScope() {
        return this.accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     * recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *        including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     *        recommendations are calculated for individual member accounts only.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountScope
     */

    public RecommendationDetailData withAccountScope(String accountScope) {
        setAccountScope(accountScope);
        return this;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     * including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     * recommendations are calculated for individual member accounts only.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want your recommendations for. Amazon Web Services calculates recommendations
     *        including the management account and member accounts if the value is set to PAYER. If the value is LINKED,
     *        recommendations are calculated for individual member accounts only.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountScope
     */

    public RecommendationDetailData withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @see LookbackPeriodInDays
     */

    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @return How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @see LookbackPeriodInDays
     */

    public String getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public RecommendationDetailData withLookbackPeriodInDays(String lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        How many days of previous usage that Amazon Web Services considers when making this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public RecommendationDetailData withLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * The requested Savings Plan recommendation type.
     * </p>
     * 
     * @param savingsPlansType
     *        The requested Savings Plan recommendation type.
     * @see SupportedSavingsPlansType
     */

    public void setSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
    }

    /**
     * <p>
     * The requested Savings Plan recommendation type.
     * </p>
     * 
     * @return The requested Savings Plan recommendation type.
     * @see SupportedSavingsPlansType
     */

    public String getSavingsPlansType() {
        return this.savingsPlansType;
    }

    /**
     * <p>
     * The requested Savings Plan recommendation type.
     * </p>
     * 
     * @param savingsPlansType
     *        The requested Savings Plan recommendation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedSavingsPlansType
     */

    public RecommendationDetailData withSavingsPlansType(String savingsPlansType) {
        setSavingsPlansType(savingsPlansType);
        return this;
    }

    /**
     * <p>
     * The requested Savings Plan recommendation type.
     * </p>
     * 
     * @param savingsPlansType
     *        The requested Savings Plan recommendation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedSavingsPlansType
     */

    public RecommendationDetailData withSavingsPlansType(SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
        return this;
    }

    /**
     * <p>
     * The term of the commitment in years.
     * </p>
     * 
     * @param termInYears
     *        The term of the commitment in years.
     * @see TermInYears
     */

    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The term of the commitment in years.
     * </p>
     * 
     * @return The term of the commitment in years.
     * @see TermInYears
     */

    public String getTermInYears() {
        return this.termInYears;
    }

    /**
     * <p>
     * The term of the commitment in years.
     * </p>
     * 
     * @param termInYears
     *        The term of the commitment in years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public RecommendationDetailData withTermInYears(String termInYears) {
        setTermInYears(termInYears);
        return this;
    }

    /**
     * <p>
     * The term of the commitment in years.
     * </p>
     * 
     * @param termInYears
     *        The term of the commitment in years.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public RecommendationDetailData withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option for the commitment (for example, All Upfront or No Upfront).
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment (for example, All Upfront or No Upfront).
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the commitment (for example, All Upfront or No Upfront).
     * </p>
     * 
     * @return The payment option for the commitment (for example, All Upfront or No Upfront).
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option for the commitment (for example, All Upfront or No Upfront).
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment (for example, All Upfront or No Upfront).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public RecommendationDetailData withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option for the commitment (for example, All Upfront or No Upfront).
     * </p>
     * 
     * @param paymentOption
     *        The payment option for the commitment (for example, All Upfront or No Upfront).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public RecommendationDetailData withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The AccountID that the recommendation is generated for.
     * </p>
     * 
     * @param accountId
     *        The AccountID that the recommendation is generated for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AccountID that the recommendation is generated for.
     * </p>
     * 
     * @return The AccountID that the recommendation is generated for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AccountID that the recommendation is generated for.
     * </p>
     * 
     * @param accountId
     *        The AccountID that the recommendation is generated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to generate the recommendation and present potential savings.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to generate the recommendation and present potential
     *        savings.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to generate the recommendation and present potential savings.
     * </p>
     * 
     * @return The currency code that Amazon Web Services used to generate the recommendation and present potential
     *         savings.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to generate the recommendation and present potential savings.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that Amazon Web Services used to generate the recommendation and present potential
     *        savings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The instance family of the recommended Savings Plan.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the recommended Savings Plan.
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family of the recommended Savings Plan.
     * </p>
     * 
     * @return The instance family of the recommended Savings Plan.
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * The instance family of the recommended Savings Plan.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family of the recommended Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The region the recommendation is generated for.
     * </p>
     * 
     * @param region
     *        The region the recommendation is generated for.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The region the recommendation is generated for.
     * </p>
     * 
     * @return The region the recommendation is generated for.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The region the recommendation is generated for.
     * </p>
     * 
     * @param region
     *        The region the recommendation is generated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The unique ID that's used to distinguish Savings Plans from one another.
     * </p>
     * 
     * @param offeringId
     *        The unique ID that's used to distinguish Savings Plans from one another.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The unique ID that's used to distinguish Savings Plans from one another.
     * </p>
     * 
     * @return The unique ID that's used to distinguish Savings Plans from one another.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The unique ID that's used to distinguish Savings Plans from one another.
     * </p>
     * 
     * @param offeringId
     *        The unique ID that's used to distinguish Savings Plans from one another.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * @param generationTimestamp
     */

    public void setGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    /**
     * @return
     */

    public String getGenerationTimestamp() {
        return this.generationTimestamp;
    }

    /**
     * @param generationTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withGenerationTimestamp(String generationTimestamp) {
        setGenerationTimestamp(generationTimestamp);
        return this;
    }

    /**
     * @param latestUsageTimestamp
     */

    public void setLatestUsageTimestamp(String latestUsageTimestamp) {
        this.latestUsageTimestamp = latestUsageTimestamp;
    }

    /**
     * @return
     */

    public String getLatestUsageTimestamp() {
        return this.latestUsageTimestamp;
    }

    /**
     * @param latestUsageTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withLatestUsageTimestamp(String latestUsageTimestamp) {
        setLatestUsageTimestamp(latestUsageTimestamp);
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

    public RecommendationDetailData withCurrentAverageHourlyOnDemandSpend(String currentAverageHourlyOnDemandSpend) {
        setCurrentAverageHourlyOnDemandSpend(currentAverageHourlyOnDemandSpend);
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

    public RecommendationDetailData withCurrentMaximumHourlyOnDemandSpend(String currentMaximumHourlyOnDemandSpend) {
        setCurrentMaximumHourlyOnDemandSpend(currentMaximumHourlyOnDemandSpend);
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

    public RecommendationDetailData withCurrentMinimumHourlyOnDemandSpend(String currentMinimumHourlyOnDemandSpend) {
        setCurrentMinimumHourlyOnDemandSpend(currentMinimumHourlyOnDemandSpend);
        return this;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedAverageUtilization
     *        The estimated utilization of the recommended Savings Plan.
     */

    public void setEstimatedAverageUtilization(String estimatedAverageUtilization) {
        this.estimatedAverageUtilization = estimatedAverageUtilization;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plan.
     * </p>
     * 
     * @return The estimated utilization of the recommended Savings Plan.
     */

    public String getEstimatedAverageUtilization() {
        return this.estimatedAverageUtilization;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedAverageUtilization
     *        The estimated utilization of the recommended Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedAverageUtilization(String estimatedAverageUtilization) {
        setEstimatedAverageUtilization(estimatedAverageUtilization);
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings amount based on the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        The estimated monthly savings amount based on the recommended Savings Plan.
     */

    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount based on the recommended Savings Plan.
     * </p>
     * 
     * @return The estimated monthly savings amount based on the recommended Savings Plan.
     */

    public String getEstimatedMonthlySavingsAmount() {
        return this.estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount based on the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        The estimated monthly savings amount based on the recommended Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        setEstimatedMonthlySavingsAmount(estimatedMonthlySavingsAmount);
        return this;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length
     *        of the lookback period.
     */

    public void setEstimatedOnDemandCost(String estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     * 
     * @return The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length
     *         of the lookback period.
     */

    public String getEstimatedOnDemandCost() {
        return this.estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length of the
     * lookback period.
     * </p>
     * 
     * @param estimatedOnDemandCost
     *        The remaining On-Demand cost estimated to not be covered by the recommended Savings Plan, over the length
     *        of the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedOnDemandCost(String estimatedOnDemandCost) {
        setEstimatedOnDemandCost(estimatedOnDemandCost);
        return this;
    }

    /**
     * <p>
     * The estimated On-Demand costs you expect with no additional commitment, based on your usage of the selected time
     * period and the Savings Plan you own.
     * </p>
     * 
     * @param estimatedOnDemandCostWithCurrentCommitment
     *        The estimated On-Demand costs you expect with no additional commitment, based on your usage of the
     *        selected time period and the Savings Plan you own.
     */

    public void setEstimatedOnDemandCostWithCurrentCommitment(String estimatedOnDemandCostWithCurrentCommitment) {
        this.estimatedOnDemandCostWithCurrentCommitment = estimatedOnDemandCostWithCurrentCommitment;
    }

    /**
     * <p>
     * The estimated On-Demand costs you expect with no additional commitment, based on your usage of the selected time
     * period and the Savings Plan you own.
     * </p>
     * 
     * @return The estimated On-Demand costs you expect with no additional commitment, based on your usage of the
     *         selected time period and the Savings Plan you own.
     */

    public String getEstimatedOnDemandCostWithCurrentCommitment() {
        return this.estimatedOnDemandCostWithCurrentCommitment;
    }

    /**
     * <p>
     * The estimated On-Demand costs you expect with no additional commitment, based on your usage of the selected time
     * period and the Savings Plan you own.
     * </p>
     * 
     * @param estimatedOnDemandCostWithCurrentCommitment
     *        The estimated On-Demand costs you expect with no additional commitment, based on your usage of the
     *        selected time period and the Savings Plan you own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedOnDemandCostWithCurrentCommitment(String estimatedOnDemandCostWithCurrentCommitment) {
        setEstimatedOnDemandCostWithCurrentCommitment(estimatedOnDemandCostWithCurrentCommitment);
        return this;
    }

    /**
     * <p>
     * The estimated return on investment that's based on the recommended Savings Plan that you purchased. This is
     * calculated as estimatedSavingsAmount/estimatedSPCost*100.
     * </p>
     * 
     * @param estimatedROI
     *        The estimated return on investment that's based on the recommended Savings Plan that you purchased. This
     *        is calculated as estimatedSavingsAmount/estimatedSPCost*100.
     */

    public void setEstimatedROI(String estimatedROI) {
        this.estimatedROI = estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment that's based on the recommended Savings Plan that you purchased. This is
     * calculated as estimatedSavingsAmount/estimatedSPCost*100.
     * </p>
     * 
     * @return The estimated return on investment that's based on the recommended Savings Plan that you purchased. This
     *         is calculated as estimatedSavingsAmount/estimatedSPCost*100.
     */

    public String getEstimatedROI() {
        return this.estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment that's based on the recommended Savings Plan that you purchased. This is
     * calculated as estimatedSavingsAmount/estimatedSPCost*100.
     * </p>
     * 
     * @param estimatedROI
     *        The estimated return on investment that's based on the recommended Savings Plan that you purchased. This
     *        is calculated as estimatedSavingsAmount/estimatedSPCost*100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedROI(String estimatedROI) {
        setEstimatedROI(estimatedROI);
        return this;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plan over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSPCost
     *        The cost of the recommended Savings Plan over the length of the lookback period.
     */

    public void setEstimatedSPCost(String estimatedSPCost) {
        this.estimatedSPCost = estimatedSPCost;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plan over the length of the lookback period.
     * </p>
     * 
     * @return The cost of the recommended Savings Plan over the length of the lookback period.
     */

    public String getEstimatedSPCost() {
        return this.estimatedSPCost;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plan over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSPCost
     *        The cost of the recommended Savings Plan over the length of the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedSPCost(String estimatedSPCost) {
        setEstimatedSPCost(estimatedSPCost);
        return this;
    }

    /**
     * <p>
     * The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSavingsAmount
     *        The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback
     *        period.
     */

    public void setEstimatedSavingsAmount(String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback period.
     * </p>
     * 
     * @return The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback
     *         period.
     */

    public String getEstimatedSavingsAmount() {
        return this.estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback period.
     * </p>
     * 
     * @param estimatedSavingsAmount
     *        The estimated savings amount that's based on the recommended Savings Plan over the length of the lookback
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedSavingsAmount(String estimatedSavingsAmount) {
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

    public RecommendationDetailData withEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        setEstimatedSavingsPercentage(estimatedSavingsPercentage);
        return this;
    }

    /**
     * <p>
     * The existing hourly commitment for the Savings Plan type.
     * </p>
     * 
     * @param existingHourlyCommitment
     *        The existing hourly commitment for the Savings Plan type.
     */

    public void setExistingHourlyCommitment(String existingHourlyCommitment) {
        this.existingHourlyCommitment = existingHourlyCommitment;
    }

    /**
     * <p>
     * The existing hourly commitment for the Savings Plan type.
     * </p>
     * 
     * @return The existing hourly commitment for the Savings Plan type.
     */

    public String getExistingHourlyCommitment() {
        return this.existingHourlyCommitment;
    }

    /**
     * <p>
     * The existing hourly commitment for the Savings Plan type.
     * </p>
     * 
     * @param existingHourlyCommitment
     *        The existing hourly commitment for the Savings Plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withExistingHourlyCommitment(String existingHourlyCommitment) {
        setExistingHourlyCommitment(existingHourlyCommitment);
        return this;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plan type and the configuration that's based on the usage
     * during the lookback period.
     * </p>
     * 
     * @param hourlyCommitmentToPurchase
     *        The recommended hourly commitment level for the Savings Plan type and the configuration that's based on
     *        the usage during the lookback period.
     */

    public void setHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plan type and the configuration that's based on the usage
     * during the lookback period.
     * </p>
     * 
     * @return The recommended hourly commitment level for the Savings Plan type and the configuration that's based on
     *         the usage during the lookback period.
     */

    public String getHourlyCommitmentToPurchase() {
        return this.hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plan type and the configuration that's based on the usage
     * during the lookback period.
     * </p>
     * 
     * @param hourlyCommitmentToPurchase
     *        The recommended hourly commitment level for the Savings Plan type and the configuration that's based on
     *        the usage during the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        setHourlyCommitmentToPurchase(hourlyCommitmentToPurchase);
        return this;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plan, based on the selected payment option.
     * </p>
     * 
     * @param upfrontCost
     *        The upfront cost of the recommended Savings Plan, based on the selected payment option.
     */

    public void setUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plan, based on the selected payment option.
     * </p>
     * 
     * @return The upfront cost of the recommended Savings Plan, based on the selected payment option.
     */

    public String getUpfrontCost() {
        return this.upfrontCost;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plan, based on the selected payment option.
     * </p>
     * 
     * @param upfrontCost
     *        The upfront cost of the recommended Savings Plan, based on the selected payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withUpfrontCost(String upfrontCost) {
        setUpfrontCost(upfrontCost);
        return this;
    }

    /**
     * <p>
     * The average value of hourly coverage over the lookback period.
     * </p>
     * 
     * @param currentAverageCoverage
     *        The average value of hourly coverage over the lookback period.
     */

    public void setCurrentAverageCoverage(String currentAverageCoverage) {
        this.currentAverageCoverage = currentAverageCoverage;
    }

    /**
     * <p>
     * The average value of hourly coverage over the lookback period.
     * </p>
     * 
     * @return The average value of hourly coverage over the lookback period.
     */

    public String getCurrentAverageCoverage() {
        return this.currentAverageCoverage;
    }

    /**
     * <p>
     * The average value of hourly coverage over the lookback period.
     * </p>
     * 
     * @param currentAverageCoverage
     *        The average value of hourly coverage over the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withCurrentAverageCoverage(String currentAverageCoverage) {
        setCurrentAverageCoverage(currentAverageCoverage);
        return this;
    }

    /**
     * <p>
     * The estimated coverage of the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedAverageCoverage
     *        The estimated coverage of the recommended Savings Plan.
     */

    public void setEstimatedAverageCoverage(String estimatedAverageCoverage) {
        this.estimatedAverageCoverage = estimatedAverageCoverage;
    }

    /**
     * <p>
     * The estimated coverage of the recommended Savings Plan.
     * </p>
     * 
     * @return The estimated coverage of the recommended Savings Plan.
     */

    public String getEstimatedAverageCoverage() {
        return this.estimatedAverageCoverage;
    }

    /**
     * <p>
     * The estimated coverage of the recommended Savings Plan.
     * </p>
     * 
     * @param estimatedAverageCoverage
     *        The estimated coverage of the recommended Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withEstimatedAverageCoverage(String estimatedAverageCoverage) {
        setEstimatedAverageCoverage(estimatedAverageCoverage);
        return this;
    }

    /**
     * <p>
     * The related hourly cost, coverage, and utilization metrics over the lookback period.
     * </p>
     * 
     * @return The related hourly cost, coverage, and utilization metrics over the lookback period.
     */

    public java.util.List<RecommendationDetailHourlyMetrics> getMetricsOverLookbackPeriod() {
        return metricsOverLookbackPeriod;
    }

    /**
     * <p>
     * The related hourly cost, coverage, and utilization metrics over the lookback period.
     * </p>
     * 
     * @param metricsOverLookbackPeriod
     *        The related hourly cost, coverage, and utilization metrics over the lookback period.
     */

    public void setMetricsOverLookbackPeriod(java.util.Collection<RecommendationDetailHourlyMetrics> metricsOverLookbackPeriod) {
        if (metricsOverLookbackPeriod == null) {
            this.metricsOverLookbackPeriod = null;
            return;
        }

        this.metricsOverLookbackPeriod = new java.util.ArrayList<RecommendationDetailHourlyMetrics>(metricsOverLookbackPeriod);
    }

    /**
     * <p>
     * The related hourly cost, coverage, and utilization metrics over the lookback period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricsOverLookbackPeriod(java.util.Collection)} or
     * {@link #withMetricsOverLookbackPeriod(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param metricsOverLookbackPeriod
     *        The related hourly cost, coverage, and utilization metrics over the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withMetricsOverLookbackPeriod(RecommendationDetailHourlyMetrics... metricsOverLookbackPeriod) {
        if (this.metricsOverLookbackPeriod == null) {
            setMetricsOverLookbackPeriod(new java.util.ArrayList<RecommendationDetailHourlyMetrics>(metricsOverLookbackPeriod.length));
        }
        for (RecommendationDetailHourlyMetrics ele : metricsOverLookbackPeriod) {
            this.metricsOverLookbackPeriod.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The related hourly cost, coverage, and utilization metrics over the lookback period.
     * </p>
     * 
     * @param metricsOverLookbackPeriod
     *        The related hourly cost, coverage, and utilization metrics over the lookback period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDetailData withMetricsOverLookbackPeriod(java.util.Collection<RecommendationDetailHourlyMetrics> metricsOverLookbackPeriod) {
        setMetricsOverLookbackPeriod(metricsOverLookbackPeriod);
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
        if (getSavingsPlansType() != null)
            sb.append("SavingsPlansType: ").append(getSavingsPlansType()).append(",");
        if (getTermInYears() != null)
            sb.append("TermInYears: ").append(getTermInYears()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getGenerationTimestamp() != null)
            sb.append("GenerationTimestamp: ").append(getGenerationTimestamp()).append(",");
        if (getLatestUsageTimestamp() != null)
            sb.append("LatestUsageTimestamp: ").append(getLatestUsageTimestamp()).append(",");
        if (getCurrentAverageHourlyOnDemandSpend() != null)
            sb.append("CurrentAverageHourlyOnDemandSpend: ").append(getCurrentAverageHourlyOnDemandSpend()).append(",");
        if (getCurrentMaximumHourlyOnDemandSpend() != null)
            sb.append("CurrentMaximumHourlyOnDemandSpend: ").append(getCurrentMaximumHourlyOnDemandSpend()).append(",");
        if (getCurrentMinimumHourlyOnDemandSpend() != null)
            sb.append("CurrentMinimumHourlyOnDemandSpend: ").append(getCurrentMinimumHourlyOnDemandSpend()).append(",");
        if (getEstimatedAverageUtilization() != null)
            sb.append("EstimatedAverageUtilization: ").append(getEstimatedAverageUtilization()).append(",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: ").append(getEstimatedMonthlySavingsAmount()).append(",");
        if (getEstimatedOnDemandCost() != null)
            sb.append("EstimatedOnDemandCost: ").append(getEstimatedOnDemandCost()).append(",");
        if (getEstimatedOnDemandCostWithCurrentCommitment() != null)
            sb.append("EstimatedOnDemandCostWithCurrentCommitment: ").append(getEstimatedOnDemandCostWithCurrentCommitment()).append(",");
        if (getEstimatedROI() != null)
            sb.append("EstimatedROI: ").append(getEstimatedROI()).append(",");
        if (getEstimatedSPCost() != null)
            sb.append("EstimatedSPCost: ").append(getEstimatedSPCost()).append(",");
        if (getEstimatedSavingsAmount() != null)
            sb.append("EstimatedSavingsAmount: ").append(getEstimatedSavingsAmount()).append(",");
        if (getEstimatedSavingsPercentage() != null)
            sb.append("EstimatedSavingsPercentage: ").append(getEstimatedSavingsPercentage()).append(",");
        if (getExistingHourlyCommitment() != null)
            sb.append("ExistingHourlyCommitment: ").append(getExistingHourlyCommitment()).append(",");
        if (getHourlyCommitmentToPurchase() != null)
            sb.append("HourlyCommitmentToPurchase: ").append(getHourlyCommitmentToPurchase()).append(",");
        if (getUpfrontCost() != null)
            sb.append("UpfrontCost: ").append(getUpfrontCost()).append(",");
        if (getCurrentAverageCoverage() != null)
            sb.append("CurrentAverageCoverage: ").append(getCurrentAverageCoverage()).append(",");
        if (getEstimatedAverageCoverage() != null)
            sb.append("EstimatedAverageCoverage: ").append(getEstimatedAverageCoverage()).append(",");
        if (getMetricsOverLookbackPeriod() != null)
            sb.append("MetricsOverLookbackPeriod: ").append(getMetricsOverLookbackPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationDetailData == false)
            return false;
        RecommendationDetailData other = (RecommendationDetailData) obj;
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
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
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getGenerationTimestamp() == null ^ this.getGenerationTimestamp() == null)
            return false;
        if (other.getGenerationTimestamp() != null && other.getGenerationTimestamp().equals(this.getGenerationTimestamp()) == false)
            return false;
        if (other.getLatestUsageTimestamp() == null ^ this.getLatestUsageTimestamp() == null)
            return false;
        if (other.getLatestUsageTimestamp() != null && other.getLatestUsageTimestamp().equals(this.getLatestUsageTimestamp()) == false)
            return false;
        if (other.getCurrentAverageHourlyOnDemandSpend() == null ^ this.getCurrentAverageHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentAverageHourlyOnDemandSpend() != null
                && other.getCurrentAverageHourlyOnDemandSpend().equals(this.getCurrentAverageHourlyOnDemandSpend()) == false)
            return false;
        if (other.getCurrentMaximumHourlyOnDemandSpend() == null ^ this.getCurrentMaximumHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentMaximumHourlyOnDemandSpend() != null
                && other.getCurrentMaximumHourlyOnDemandSpend().equals(this.getCurrentMaximumHourlyOnDemandSpend()) == false)
            return false;
        if (other.getCurrentMinimumHourlyOnDemandSpend() == null ^ this.getCurrentMinimumHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentMinimumHourlyOnDemandSpend() != null
                && other.getCurrentMinimumHourlyOnDemandSpend().equals(this.getCurrentMinimumHourlyOnDemandSpend()) == false)
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
        if (other.getEstimatedOnDemandCost() == null ^ this.getEstimatedOnDemandCost() == null)
            return false;
        if (other.getEstimatedOnDemandCost() != null && other.getEstimatedOnDemandCost().equals(this.getEstimatedOnDemandCost()) == false)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() == null ^ this.getEstimatedOnDemandCostWithCurrentCommitment() == null)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() != null
                && other.getEstimatedOnDemandCostWithCurrentCommitment().equals(this.getEstimatedOnDemandCostWithCurrentCommitment()) == false)
            return false;
        if (other.getEstimatedROI() == null ^ this.getEstimatedROI() == null)
            return false;
        if (other.getEstimatedROI() != null && other.getEstimatedROI().equals(this.getEstimatedROI()) == false)
            return false;
        if (other.getEstimatedSPCost() == null ^ this.getEstimatedSPCost() == null)
            return false;
        if (other.getEstimatedSPCost() != null && other.getEstimatedSPCost().equals(this.getEstimatedSPCost()) == false)
            return false;
        if (other.getEstimatedSavingsAmount() == null ^ this.getEstimatedSavingsAmount() == null)
            return false;
        if (other.getEstimatedSavingsAmount() != null && other.getEstimatedSavingsAmount().equals(this.getEstimatedSavingsAmount()) == false)
            return false;
        if (other.getEstimatedSavingsPercentage() == null ^ this.getEstimatedSavingsPercentage() == null)
            return false;
        if (other.getEstimatedSavingsPercentage() != null && other.getEstimatedSavingsPercentage().equals(this.getEstimatedSavingsPercentage()) == false)
            return false;
        if (other.getExistingHourlyCommitment() == null ^ this.getExistingHourlyCommitment() == null)
            return false;
        if (other.getExistingHourlyCommitment() != null && other.getExistingHourlyCommitment().equals(this.getExistingHourlyCommitment()) == false)
            return false;
        if (other.getHourlyCommitmentToPurchase() == null ^ this.getHourlyCommitmentToPurchase() == null)
            return false;
        if (other.getHourlyCommitmentToPurchase() != null && other.getHourlyCommitmentToPurchase().equals(this.getHourlyCommitmentToPurchase()) == false)
            return false;
        if (other.getUpfrontCost() == null ^ this.getUpfrontCost() == null)
            return false;
        if (other.getUpfrontCost() != null && other.getUpfrontCost().equals(this.getUpfrontCost()) == false)
            return false;
        if (other.getCurrentAverageCoverage() == null ^ this.getCurrentAverageCoverage() == null)
            return false;
        if (other.getCurrentAverageCoverage() != null && other.getCurrentAverageCoverage().equals(this.getCurrentAverageCoverage()) == false)
            return false;
        if (other.getEstimatedAverageCoverage() == null ^ this.getEstimatedAverageCoverage() == null)
            return false;
        if (other.getEstimatedAverageCoverage() != null && other.getEstimatedAverageCoverage().equals(this.getEstimatedAverageCoverage()) == false)
            return false;
        if (other.getMetricsOverLookbackPeriod() == null ^ this.getMetricsOverLookbackPeriod() == null)
            return false;
        if (other.getMetricsOverLookbackPeriod() != null && other.getMetricsOverLookbackPeriod().equals(this.getMetricsOverLookbackPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlansType() == null) ? 0 : getSavingsPlansType().hashCode());
        hashCode = prime * hashCode + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getGenerationTimestamp() == null) ? 0 : getGenerationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatestUsageTimestamp() == null) ? 0 : getLatestUsageTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCurrentAverageHourlyOnDemandSpend() == null) ? 0 : getCurrentAverageHourlyOnDemandSpend().hashCode());
        hashCode = prime * hashCode + ((getCurrentMaximumHourlyOnDemandSpend() == null) ? 0 : getCurrentMaximumHourlyOnDemandSpend().hashCode());
        hashCode = prime * hashCode + ((getCurrentMinimumHourlyOnDemandSpend() == null) ? 0 : getCurrentMinimumHourlyOnDemandSpend().hashCode());
        hashCode = prime * hashCode + ((getEstimatedAverageUtilization() == null) ? 0 : getEstimatedAverageUtilization().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavingsAmount() == null) ? 0 : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getEstimatedOnDemandCost() == null) ? 0 : getEstimatedOnDemandCost().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedOnDemandCostWithCurrentCommitment() == null) ? 0 : getEstimatedOnDemandCostWithCurrentCommitment().hashCode());
        hashCode = prime * hashCode + ((getEstimatedROI() == null) ? 0 : getEstimatedROI().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSPCost() == null) ? 0 : getEstimatedSPCost().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsAmount() == null) ? 0 : getEstimatedSavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSavingsPercentage() == null) ? 0 : getEstimatedSavingsPercentage().hashCode());
        hashCode = prime * hashCode + ((getExistingHourlyCommitment() == null) ? 0 : getExistingHourlyCommitment().hashCode());
        hashCode = prime * hashCode + ((getHourlyCommitmentToPurchase() == null) ? 0 : getHourlyCommitmentToPurchase().hashCode());
        hashCode = prime * hashCode + ((getUpfrontCost() == null) ? 0 : getUpfrontCost().hashCode());
        hashCode = prime * hashCode + ((getCurrentAverageCoverage() == null) ? 0 : getCurrentAverageCoverage().hashCode());
        hashCode = prime * hashCode + ((getEstimatedAverageCoverage() == null) ? 0 : getEstimatedAverageCoverage().hashCode());
        hashCode = prime * hashCode + ((getMetricsOverLookbackPeriod() == null) ? 0 : getMetricsOverLookbackPeriod().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationDetailData clone() {
        try {
            return (RecommendationDetailData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RecommendationDetailDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
