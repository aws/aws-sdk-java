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
 * Details about your recommended reservation purchase.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ReservationPurchaseRecommendationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPurchaseRecommendationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     */
    private InstanceDetails instanceDetails;
    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     */
    private String recommendedNumberOfInstancesToPurchase;
    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     */
    private String recommendedNormalizedUnitsToPurchase;
    /**
     * <p>
     * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     */
    private String minimumNumberOfInstancesUsedPerHour;
    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     */
    private String minimumNormalizedUnitsUsedPerHour;
    /**
     * <p>
     * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     */
    private String maximumNumberOfInstancesUsedPerHour;
    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     */
    private String maximumNormalizedUnitsUsedPerHour;
    /**
     * <p>
     * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     */
    private String averageNumberOfInstancesUsedPerHour;
    /**
     * <p>
     * The average number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     */
    private String averageNormalizedUnitsUsedPerHour;
    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
     * </p>
     */
    private String averageUtilization;
    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving you money, in months.
     * </p>
     */
    private String estimatedBreakEvenInMonths;
    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month.
     * </p>
     */
    private String estimatedMonthlySavingsAmount;
    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your
     * overall costs.
     * </p>
     */
    private String estimatedMonthlySavingsPercentage;
    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     */
    private String estimatedMonthlyOnDemandCost;
    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the specified historical period if you had
     * had a reservation.
     * </p>
     */
    private String estimatedReservationCostForLookbackPeriod;
    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     */
    private String upfrontCost;
    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     */
    private String recurringStandardMonthlyCost;

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * 
     * @param accountId
     *        The account that this RI recommendation is for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * 
     * @return The account that this RI recommendation is for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * 
     * @param accountId
     *        The account that this RI recommendation is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param instanceDetails
     *        Details about the instances that AWS recommends that you purchase.
     */

    public void setInstanceDetails(InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
    }

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return Details about the instances that AWS recommends that you purchase.
     */

    public InstanceDetails getInstanceDetails() {
        return this.instanceDetails;
    }

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param instanceDetails
     *        Details about the instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withInstanceDetails(InstanceDetails instanceDetails) {
        setInstanceDetails(instanceDetails);
        return this;
    }

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param recommendedNumberOfInstancesToPurchase
     *        The number of instances that AWS recommends that you purchase.
     */

    public void setRecommendedNumberOfInstancesToPurchase(String recommendedNumberOfInstancesToPurchase) {
        this.recommendedNumberOfInstancesToPurchase = recommendedNumberOfInstancesToPurchase;
    }

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * 
     * @return The number of instances that AWS recommends that you purchase.
     */

    public String getRecommendedNumberOfInstancesToPurchase() {
        return this.recommendedNumberOfInstancesToPurchase;
    }

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * 
     * @param recommendedNumberOfInstancesToPurchase
     *        The number of instances that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withRecommendedNumberOfInstancesToPurchase(String recommendedNumberOfInstancesToPurchase) {
        setRecommendedNumberOfInstancesToPurchase(recommendedNumberOfInstancesToPurchase);
        return this;
    }

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * 
     * @param recommendedNormalizedUnitsToPurchase
     *        The number of normalized units that AWS recommends that you purchase.
     */

    public void setRecommendedNormalizedUnitsToPurchase(String recommendedNormalizedUnitsToPurchase) {
        this.recommendedNormalizedUnitsToPurchase = recommendedNormalizedUnitsToPurchase;
    }

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * 
     * @return The number of normalized units that AWS recommends that you purchase.
     */

    public String getRecommendedNormalizedUnitsToPurchase() {
        return this.recommendedNormalizedUnitsToPurchase;
    }

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * 
     * @param recommendedNormalizedUnitsToPurchase
     *        The number of normalized units that AWS recommends that you purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withRecommendedNormalizedUnitsToPurchase(String recommendedNormalizedUnitsToPurchase) {
        setRecommendedNormalizedUnitsToPurchase(recommendedNormalizedUnitsToPurchase);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @param minimumNumberOfInstancesUsedPerHour
     *        The minimum number of instances that you used in an hour during the historical period. AWS uses this to
     *        calculate your recommended reservation purchases.
     */

    public void setMinimumNumberOfInstancesUsedPerHour(String minimumNumberOfInstancesUsedPerHour) {
        this.minimumNumberOfInstancesUsedPerHour = minimumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @return The minimum number of instances that you used in an hour during the historical period. AWS uses this to
     *         calculate your recommended reservation purchases.
     */

    public String getMinimumNumberOfInstancesUsedPerHour() {
        return this.minimumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @param minimumNumberOfInstancesUsedPerHour
     *        The minimum number of instances that you used in an hour during the historical period. AWS uses this to
     *        calculate your recommended reservation purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withMinimumNumberOfInstancesUsedPerHour(String minimumNumberOfInstancesUsedPerHour) {
        setMinimumNumberOfInstancesUsedPerHour(minimumNumberOfInstancesUsedPerHour);
        return this;
    }

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @param minimumNormalizedUnitsUsedPerHour
     *        The minimum number of normalized units that you used in an hour during the historical period. AWS uses
     *        this to calculate your recommended reservation purchases.
     */

    public void setMinimumNormalizedUnitsUsedPerHour(String minimumNormalizedUnitsUsedPerHour) {
        this.minimumNormalizedUnitsUsedPerHour = minimumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @return The minimum number of normalized units that you used in an hour during the historical period. AWS uses
     *         this to calculate your recommended reservation purchases.
     */

    public String getMinimumNormalizedUnitsUsedPerHour() {
        return this.minimumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @param minimumNormalizedUnitsUsedPerHour
     *        The minimum number of normalized units that you used in an hour during the historical period. AWS uses
     *        this to calculate your recommended reservation purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withMinimumNormalizedUnitsUsedPerHour(String minimumNormalizedUnitsUsedPerHour) {
        setMinimumNormalizedUnitsUsedPerHour(minimumNormalizedUnitsUsedPerHour);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @param maximumNumberOfInstancesUsedPerHour
     *        The maximum number of instances that you used in an hour during the historical period. AWS uses this to
     *        calculate your recommended reservation purchases.
     */

    public void setMaximumNumberOfInstancesUsedPerHour(String maximumNumberOfInstancesUsedPerHour) {
        this.maximumNumberOfInstancesUsedPerHour = maximumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @return The maximum number of instances that you used in an hour during the historical period. AWS uses this to
     *         calculate your recommended reservation purchases.
     */

    public String getMaximumNumberOfInstancesUsedPerHour() {
        return this.maximumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @param maximumNumberOfInstancesUsedPerHour
     *        The maximum number of instances that you used in an hour during the historical period. AWS uses this to
     *        calculate your recommended reservation purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withMaximumNumberOfInstancesUsedPerHour(String maximumNumberOfInstancesUsedPerHour) {
        setMaximumNumberOfInstancesUsedPerHour(maximumNumberOfInstancesUsedPerHour);
        return this;
    }

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @param maximumNormalizedUnitsUsedPerHour
     *        The maximum number of normalized units that you used in an hour during the historical period. AWS uses
     *        this to calculate your recommended reservation purchases.
     */

    public void setMaximumNormalizedUnitsUsedPerHour(String maximumNormalizedUnitsUsedPerHour) {
        this.maximumNormalizedUnitsUsedPerHour = maximumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @return The maximum number of normalized units that you used in an hour during the historical period. AWS uses
     *         this to calculate your recommended reservation purchases.
     */

    public String getMaximumNormalizedUnitsUsedPerHour() {
        return this.maximumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @param maximumNormalizedUnitsUsedPerHour
     *        The maximum number of normalized units that you used in an hour during the historical period. AWS uses
     *        this to calculate your recommended reservation purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withMaximumNormalizedUnitsUsedPerHour(String maximumNormalizedUnitsUsedPerHour) {
        setMaximumNormalizedUnitsUsedPerHour(maximumNormalizedUnitsUsedPerHour);
        return this;
    }

    /**
     * <p>
     * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @param averageNumberOfInstancesUsedPerHour
     *        The average number of instances that you used in an hour during the historical period. AWS uses this to
     *        calculate your recommended reservation purchases.
     */

    public void setAverageNumberOfInstancesUsedPerHour(String averageNumberOfInstancesUsedPerHour) {
        this.averageNumberOfInstancesUsedPerHour = averageNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @return The average number of instances that you used in an hour during the historical period. AWS uses this to
     *         calculate your recommended reservation purchases.
     */

    public String getAverageNumberOfInstancesUsedPerHour() {
        return this.averageNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * 
     * @param averageNumberOfInstancesUsedPerHour
     *        The average number of instances that you used in an hour during the historical period. AWS uses this to
     *        calculate your recommended reservation purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withAverageNumberOfInstancesUsedPerHour(String averageNumberOfInstancesUsedPerHour) {
        setAverageNumberOfInstancesUsedPerHour(averageNumberOfInstancesUsedPerHour);
        return this;
    }

    /**
     * <p>
     * The average number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @param averageNormalizedUnitsUsedPerHour
     *        The average number of normalized units that you used in an hour during the historical period. AWS uses
     *        this to calculate your recommended reservation purchases.
     */

    public void setAverageNormalizedUnitsUsedPerHour(String averageNormalizedUnitsUsedPerHour) {
        this.averageNormalizedUnitsUsedPerHour = averageNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The average number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @return The average number of normalized units that you used in an hour during the historical period. AWS uses
     *         this to calculate your recommended reservation purchases.
     */

    public String getAverageNormalizedUnitsUsedPerHour() {
        return this.averageNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The average number of normalized units that you used in an hour during the historical period. AWS uses this to
     * calculate your recommended reservation purchases.
     * </p>
     * 
     * @param averageNormalizedUnitsUsedPerHour
     *        The average number of normalized units that you used in an hour during the historical period. AWS uses
     *        this to calculate your recommended reservation purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withAverageNormalizedUnitsUsedPerHour(String averageNormalizedUnitsUsedPerHour) {
        setAverageNormalizedUnitsUsedPerHour(averageNormalizedUnitsUsedPerHour);
        return this;
    }

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
     * </p>
     * 
     * @param averageUtilization
     *        The average utilization of your instances. AWS uses this to calculate your recommended reservation
     *        purchases.
     */

    public void setAverageUtilization(String averageUtilization) {
        this.averageUtilization = averageUtilization;
    }

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
     * </p>
     * 
     * @return The average utilization of your instances. AWS uses this to calculate your recommended reservation
     *         purchases.
     */

    public String getAverageUtilization() {
        return this.averageUtilization;
    }

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
     * </p>
     * 
     * @param averageUtilization
     *        The average utilization of your instances. AWS uses this to calculate your recommended reservation
     *        purchases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withAverageUtilization(String averageUtilization) {
        setAverageUtilization(averageUtilization);
        return this;
    }

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving you money, in months.
     * </p>
     * 
     * @param estimatedBreakEvenInMonths
     *        How long AWS estimates that it takes for this instance to start saving you money, in months.
     */

    public void setEstimatedBreakEvenInMonths(String estimatedBreakEvenInMonths) {
        this.estimatedBreakEvenInMonths = estimatedBreakEvenInMonths;
    }

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving you money, in months.
     * </p>
     * 
     * @return How long AWS estimates that it takes for this instance to start saving you money, in months.
     */

    public String getEstimatedBreakEvenInMonths() {
        return this.estimatedBreakEvenInMonths;
    }

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving you money, in months.
     * </p>
     * 
     * @param estimatedBreakEvenInMonths
     *        How long AWS estimates that it takes for this instance to start saving you money, in months.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withEstimatedBreakEvenInMonths(String estimatedBreakEvenInMonths) {
        setEstimatedBreakEvenInMonths(estimatedBreakEvenInMonths);
        return this;
    }

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that AWS used to calculate the costs for this instance.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     * 
     * @return The currency code that AWS used to calculate the costs for this instance.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     * 
     * @param currencyCode
     *        The currency code that AWS used to calculate the costs for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        How much AWS estimates that this specific recommendation could save you in a month.
     */

    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month.
     * </p>
     * 
     * @return How much AWS estimates that this specific recommendation could save you in a month.
     */

    public String getEstimatedMonthlySavingsAmount() {
        return this.estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month.
     * </p>
     * 
     * @param estimatedMonthlySavingsAmount
     *        How much AWS estimates that this specific recommendation could save you in a month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        setEstimatedMonthlySavingsAmount(estimatedMonthlySavingsAmount);
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your
     * overall costs.
     * </p>
     * 
     * @param estimatedMonthlySavingsPercentage
     *        How much AWS estimates that this specific recommendation could save you in a month, as a percentage of
     *        your overall costs.
     */

    public void setEstimatedMonthlySavingsPercentage(String estimatedMonthlySavingsPercentage) {
        this.estimatedMonthlySavingsPercentage = estimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your
     * overall costs.
     * </p>
     * 
     * @return How much AWS estimates that this specific recommendation could save you in a month, as a percentage of
     *         your overall costs.
     */

    public String getEstimatedMonthlySavingsPercentage() {
        return this.estimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your
     * overall costs.
     * </p>
     * 
     * @param estimatedMonthlySavingsPercentage
     *        How much AWS estimates that this specific recommendation could save you in a month, as a percentage of
     *        your overall costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withEstimatedMonthlySavingsPercentage(String estimatedMonthlySavingsPercentage) {
        setEstimatedMonthlySavingsPercentage(estimatedMonthlySavingsPercentage);
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * 
     * @param estimatedMonthlyOnDemandCost
     *        How much AWS estimates that you spend on On-Demand Instances in a month.
     */

    public void setEstimatedMonthlyOnDemandCost(String estimatedMonthlyOnDemandCost) {
        this.estimatedMonthlyOnDemandCost = estimatedMonthlyOnDemandCost;
    }

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * 
     * @return How much AWS estimates that you spend on On-Demand Instances in a month.
     */

    public String getEstimatedMonthlyOnDemandCost() {
        return this.estimatedMonthlyOnDemandCost;
    }

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * 
     * @param estimatedMonthlyOnDemandCost
     *        How much AWS estimates that you spend on On-Demand Instances in a month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withEstimatedMonthlyOnDemandCost(String estimatedMonthlyOnDemandCost) {
        setEstimatedMonthlyOnDemandCost(estimatedMonthlyOnDemandCost);
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the specified historical period if you had
     * had a reservation.
     * </p>
     * 
     * @param estimatedReservationCostForLookbackPeriod
     *        How much AWS estimates that you would have spent for all usage during the specified historical period if
     *        you had had a reservation.
     */

    public void setEstimatedReservationCostForLookbackPeriod(String estimatedReservationCostForLookbackPeriod) {
        this.estimatedReservationCostForLookbackPeriod = estimatedReservationCostForLookbackPeriod;
    }

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the specified historical period if you had
     * had a reservation.
     * </p>
     * 
     * @return How much AWS estimates that you would have spent for all usage during the specified historical period if
     *         you had had a reservation.
     */

    public String getEstimatedReservationCostForLookbackPeriod() {
        return this.estimatedReservationCostForLookbackPeriod;
    }

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the specified historical period if you had
     * had a reservation.
     * </p>
     * 
     * @param estimatedReservationCostForLookbackPeriod
     *        How much AWS estimates that you would have spent for all usage during the specified historical period if
     *        you had had a reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withEstimatedReservationCostForLookbackPeriod(String estimatedReservationCostForLookbackPeriod) {
        setEstimatedReservationCostForLookbackPeriod(estimatedReservationCostForLookbackPeriod);
        return this;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * 
     * @param upfrontCost
     *        How much purchasing this instance costs you upfront.
     */

    public void setUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * 
     * @return How much purchasing this instance costs you upfront.
     */

    public String getUpfrontCost() {
        return this.upfrontCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * 
     * @param upfrontCost
     *        How much purchasing this instance costs you upfront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withUpfrontCost(String upfrontCost) {
        setUpfrontCost(upfrontCost);
        return this;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * 
     * @param recurringStandardMonthlyCost
     *        How much purchasing this instance costs you on a monthly basis.
     */

    public void setRecurringStandardMonthlyCost(String recurringStandardMonthlyCost) {
        this.recurringStandardMonthlyCost = recurringStandardMonthlyCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * 
     * @return How much purchasing this instance costs you on a monthly basis.
     */

    public String getRecurringStandardMonthlyCost() {
        return this.recurringStandardMonthlyCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * 
     * @param recurringStandardMonthlyCost
     *        How much purchasing this instance costs you on a monthly basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPurchaseRecommendationDetail withRecurringStandardMonthlyCost(String recurringStandardMonthlyCost) {
        setRecurringStandardMonthlyCost(recurringStandardMonthlyCost);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getInstanceDetails() != null)
            sb.append("InstanceDetails: ").append(getInstanceDetails()).append(",");
        if (getRecommendedNumberOfInstancesToPurchase() != null)
            sb.append("RecommendedNumberOfInstancesToPurchase: ").append(getRecommendedNumberOfInstancesToPurchase()).append(",");
        if (getRecommendedNormalizedUnitsToPurchase() != null)
            sb.append("RecommendedNormalizedUnitsToPurchase: ").append(getRecommendedNormalizedUnitsToPurchase()).append(",");
        if (getMinimumNumberOfInstancesUsedPerHour() != null)
            sb.append("MinimumNumberOfInstancesUsedPerHour: ").append(getMinimumNumberOfInstancesUsedPerHour()).append(",");
        if (getMinimumNormalizedUnitsUsedPerHour() != null)
            sb.append("MinimumNormalizedUnitsUsedPerHour: ").append(getMinimumNormalizedUnitsUsedPerHour()).append(",");
        if (getMaximumNumberOfInstancesUsedPerHour() != null)
            sb.append("MaximumNumberOfInstancesUsedPerHour: ").append(getMaximumNumberOfInstancesUsedPerHour()).append(",");
        if (getMaximumNormalizedUnitsUsedPerHour() != null)
            sb.append("MaximumNormalizedUnitsUsedPerHour: ").append(getMaximumNormalizedUnitsUsedPerHour()).append(",");
        if (getAverageNumberOfInstancesUsedPerHour() != null)
            sb.append("AverageNumberOfInstancesUsedPerHour: ").append(getAverageNumberOfInstancesUsedPerHour()).append(",");
        if (getAverageNormalizedUnitsUsedPerHour() != null)
            sb.append("AverageNormalizedUnitsUsedPerHour: ").append(getAverageNormalizedUnitsUsedPerHour()).append(",");
        if (getAverageUtilization() != null)
            sb.append("AverageUtilization: ").append(getAverageUtilization()).append(",");
        if (getEstimatedBreakEvenInMonths() != null)
            sb.append("EstimatedBreakEvenInMonths: ").append(getEstimatedBreakEvenInMonths()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: ").append(getEstimatedMonthlySavingsAmount()).append(",");
        if (getEstimatedMonthlySavingsPercentage() != null)
            sb.append("EstimatedMonthlySavingsPercentage: ").append(getEstimatedMonthlySavingsPercentage()).append(",");
        if (getEstimatedMonthlyOnDemandCost() != null)
            sb.append("EstimatedMonthlyOnDemandCost: ").append(getEstimatedMonthlyOnDemandCost()).append(",");
        if (getEstimatedReservationCostForLookbackPeriod() != null)
            sb.append("EstimatedReservationCostForLookbackPeriod: ").append(getEstimatedReservationCostForLookbackPeriod()).append(",");
        if (getUpfrontCost() != null)
            sb.append("UpfrontCost: ").append(getUpfrontCost()).append(",");
        if (getRecurringStandardMonthlyCost() != null)
            sb.append("RecurringStandardMonthlyCost: ").append(getRecurringStandardMonthlyCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendationDetail == false)
            return false;
        ReservationPurchaseRecommendationDetail other = (ReservationPurchaseRecommendationDetail) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInstanceDetails() == null ^ this.getInstanceDetails() == null)
            return false;
        if (other.getInstanceDetails() != null && other.getInstanceDetails().equals(this.getInstanceDetails()) == false)
            return false;
        if (other.getRecommendedNumberOfInstancesToPurchase() == null ^ this.getRecommendedNumberOfInstancesToPurchase() == null)
            return false;
        if (other.getRecommendedNumberOfInstancesToPurchase() != null
                && other.getRecommendedNumberOfInstancesToPurchase().equals(this.getRecommendedNumberOfInstancesToPurchase()) == false)
            return false;
        if (other.getRecommendedNormalizedUnitsToPurchase() == null ^ this.getRecommendedNormalizedUnitsToPurchase() == null)
            return false;
        if (other.getRecommendedNormalizedUnitsToPurchase() != null
                && other.getRecommendedNormalizedUnitsToPurchase().equals(this.getRecommendedNormalizedUnitsToPurchase()) == false)
            return false;
        if (other.getMinimumNumberOfInstancesUsedPerHour() == null ^ this.getMinimumNumberOfInstancesUsedPerHour() == null)
            return false;
        if (other.getMinimumNumberOfInstancesUsedPerHour() != null
                && other.getMinimumNumberOfInstancesUsedPerHour().equals(this.getMinimumNumberOfInstancesUsedPerHour()) == false)
            return false;
        if (other.getMinimumNormalizedUnitsUsedPerHour() == null ^ this.getMinimumNormalizedUnitsUsedPerHour() == null)
            return false;
        if (other.getMinimumNormalizedUnitsUsedPerHour() != null
                && other.getMinimumNormalizedUnitsUsedPerHour().equals(this.getMinimumNormalizedUnitsUsedPerHour()) == false)
            return false;
        if (other.getMaximumNumberOfInstancesUsedPerHour() == null ^ this.getMaximumNumberOfInstancesUsedPerHour() == null)
            return false;
        if (other.getMaximumNumberOfInstancesUsedPerHour() != null
                && other.getMaximumNumberOfInstancesUsedPerHour().equals(this.getMaximumNumberOfInstancesUsedPerHour()) == false)
            return false;
        if (other.getMaximumNormalizedUnitsUsedPerHour() == null ^ this.getMaximumNormalizedUnitsUsedPerHour() == null)
            return false;
        if (other.getMaximumNormalizedUnitsUsedPerHour() != null
                && other.getMaximumNormalizedUnitsUsedPerHour().equals(this.getMaximumNormalizedUnitsUsedPerHour()) == false)
            return false;
        if (other.getAverageNumberOfInstancesUsedPerHour() == null ^ this.getAverageNumberOfInstancesUsedPerHour() == null)
            return false;
        if (other.getAverageNumberOfInstancesUsedPerHour() != null
                && other.getAverageNumberOfInstancesUsedPerHour().equals(this.getAverageNumberOfInstancesUsedPerHour()) == false)
            return false;
        if (other.getAverageNormalizedUnitsUsedPerHour() == null ^ this.getAverageNormalizedUnitsUsedPerHour() == null)
            return false;
        if (other.getAverageNormalizedUnitsUsedPerHour() != null
                && other.getAverageNormalizedUnitsUsedPerHour().equals(this.getAverageNormalizedUnitsUsedPerHour()) == false)
            return false;
        if (other.getAverageUtilization() == null ^ this.getAverageUtilization() == null)
            return false;
        if (other.getAverageUtilization() != null && other.getAverageUtilization().equals(this.getAverageUtilization()) == false)
            return false;
        if (other.getEstimatedBreakEvenInMonths() == null ^ this.getEstimatedBreakEvenInMonths() == null)
            return false;
        if (other.getEstimatedBreakEvenInMonths() != null && other.getEstimatedBreakEvenInMonths().equals(this.getEstimatedBreakEvenInMonths()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() == null ^ this.getEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() != null
                && other.getEstimatedMonthlySavingsAmount().equals(this.getEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsPercentage() == null ^ this.getEstimatedMonthlySavingsPercentage() == null)
            return false;
        if (other.getEstimatedMonthlySavingsPercentage() != null
                && other.getEstimatedMonthlySavingsPercentage().equals(this.getEstimatedMonthlySavingsPercentage()) == false)
            return false;
        if (other.getEstimatedMonthlyOnDemandCost() == null ^ this.getEstimatedMonthlyOnDemandCost() == null)
            return false;
        if (other.getEstimatedMonthlyOnDemandCost() != null && other.getEstimatedMonthlyOnDemandCost().equals(this.getEstimatedMonthlyOnDemandCost()) == false)
            return false;
        if (other.getEstimatedReservationCostForLookbackPeriod() == null ^ this.getEstimatedReservationCostForLookbackPeriod() == null)
            return false;
        if (other.getEstimatedReservationCostForLookbackPeriod() != null
                && other.getEstimatedReservationCostForLookbackPeriod().equals(this.getEstimatedReservationCostForLookbackPeriod()) == false)
            return false;
        if (other.getUpfrontCost() == null ^ this.getUpfrontCost() == null)
            return false;
        if (other.getUpfrontCost() != null && other.getUpfrontCost().equals(this.getUpfrontCost()) == false)
            return false;
        if (other.getRecurringStandardMonthlyCost() == null ^ this.getRecurringStandardMonthlyCost() == null)
            return false;
        if (other.getRecurringStandardMonthlyCost() != null && other.getRecurringStandardMonthlyCost().equals(this.getRecurringStandardMonthlyCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getInstanceDetails() == null) ? 0 : getInstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getRecommendedNumberOfInstancesToPurchase() == null) ? 0 : getRecommendedNumberOfInstancesToPurchase().hashCode());
        hashCode = prime * hashCode + ((getRecommendedNormalizedUnitsToPurchase() == null) ? 0 : getRecommendedNormalizedUnitsToPurchase().hashCode());
        hashCode = prime * hashCode + ((getMinimumNumberOfInstancesUsedPerHour() == null) ? 0 : getMinimumNumberOfInstancesUsedPerHour().hashCode());
        hashCode = prime * hashCode + ((getMinimumNormalizedUnitsUsedPerHour() == null) ? 0 : getMinimumNormalizedUnitsUsedPerHour().hashCode());
        hashCode = prime * hashCode + ((getMaximumNumberOfInstancesUsedPerHour() == null) ? 0 : getMaximumNumberOfInstancesUsedPerHour().hashCode());
        hashCode = prime * hashCode + ((getMaximumNormalizedUnitsUsedPerHour() == null) ? 0 : getMaximumNormalizedUnitsUsedPerHour().hashCode());
        hashCode = prime * hashCode + ((getAverageNumberOfInstancesUsedPerHour() == null) ? 0 : getAverageNumberOfInstancesUsedPerHour().hashCode());
        hashCode = prime * hashCode + ((getAverageNormalizedUnitsUsedPerHour() == null) ? 0 : getAverageNormalizedUnitsUsedPerHour().hashCode());
        hashCode = prime * hashCode + ((getAverageUtilization() == null) ? 0 : getAverageUtilization().hashCode());
        hashCode = prime * hashCode + ((getEstimatedBreakEvenInMonths() == null) ? 0 : getEstimatedBreakEvenInMonths().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavingsAmount() == null) ? 0 : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlySavingsPercentage() == null) ? 0 : getEstimatedMonthlySavingsPercentage().hashCode());
        hashCode = prime * hashCode + ((getEstimatedMonthlyOnDemandCost() == null) ? 0 : getEstimatedMonthlyOnDemandCost().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedReservationCostForLookbackPeriod() == null) ? 0 : getEstimatedReservationCostForLookbackPeriod().hashCode());
        hashCode = prime * hashCode + ((getUpfrontCost() == null) ? 0 : getUpfrontCost().hashCode());
        hashCode = prime * hashCode + ((getRecurringStandardMonthlyCost() == null) ? 0 : getRecurringStandardMonthlyCost().hashCode());
        return hashCode;
    }

    @Override
    public ReservationPurchaseRecommendationDetail clone() {
        try {
            return (ReservationPurchaseRecommendationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ReservationPurchaseRecommendationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
