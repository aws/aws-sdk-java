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
package com.amazonaws.services.savingsplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSavingsPlansOfferingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     */
    private java.util.List<String> offeringIds;
    /**
     * <p>
     * The payment options.
     * </p>
     */
    private java.util.List<String> paymentOptions;
    /**
     * <p>
     * The product type.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * The plan type.
     * </p>
     */
    private java.util.List<String> planTypes;
    /**
     * <p>
     * The durations, in seconds.
     * </p>
     */
    private java.util.List<Long> durations;
    /**
     * <p>
     * The currencies.
     * </p>
     */
    private java.util.List<String> currencies;
    /**
     * <p>
     * The descriptions.
     * </p>
     */
    private java.util.List<String> descriptions;
    /**
     * <p>
     * The services.
     * </p>
     */
    private java.util.List<String> serviceCodes;
    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     */
    private java.util.List<String> usageTypes;
    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     */
    private java.util.List<String> operations;
    /**
     * <p>
     * The filters.
     * </p>
     */
    private java.util.List<SavingsPlanOfferingFilterElement> filters;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * 
     * @return The IDs of the offerings.
     */

    public java.util.List<String> getOfferingIds() {
        return offeringIds;
    }

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * 
     * @param offeringIds
     *        The IDs of the offerings.
     */

    public void setOfferingIds(java.util.Collection<String> offeringIds) {
        if (offeringIds == null) {
            this.offeringIds = null;
            return;
        }

        this.offeringIds = new java.util.ArrayList<String>(offeringIds);
    }

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOfferingIds(java.util.Collection)} or {@link #withOfferingIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param offeringIds
     *        The IDs of the offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withOfferingIds(String... offeringIds) {
        if (this.offeringIds == null) {
            setOfferingIds(new java.util.ArrayList<String>(offeringIds.length));
        }
        for (String ele : offeringIds) {
            this.offeringIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * 
     * @param offeringIds
     *        The IDs of the offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withOfferingIds(java.util.Collection<String> offeringIds) {
        setOfferingIds(offeringIds);
        return this;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @return The payment options.
     * @see SavingsPlanPaymentOption
     */

    public java.util.List<String> getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @param paymentOptions
     *        The payment options.
     * @see SavingsPlanPaymentOption
     */

    public void setPaymentOptions(java.util.Collection<String> paymentOptions) {
        if (paymentOptions == null) {
            this.paymentOptions = null;
            return;
        }

        this.paymentOptions = new java.util.ArrayList<String>(paymentOptions);
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPaymentOptions(java.util.Collection)} or {@link #withPaymentOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param paymentOptions
     *        The payment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public DescribeSavingsPlansOfferingsRequest withPaymentOptions(String... paymentOptions) {
        if (this.paymentOptions == null) {
            setPaymentOptions(new java.util.ArrayList<String>(paymentOptions.length));
        }
        for (String ele : paymentOptions) {
            this.paymentOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @param paymentOptions
     *        The payment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public DescribeSavingsPlansOfferingsRequest withPaymentOptions(java.util.Collection<String> paymentOptions) {
        setPaymentOptions(paymentOptions);
        return this;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @param paymentOptions
     *        The payment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public DescribeSavingsPlansOfferingsRequest withPaymentOptions(SavingsPlanPaymentOption... paymentOptions) {
        java.util.ArrayList<String> paymentOptionsCopy = new java.util.ArrayList<String>(paymentOptions.length);
        for (SavingsPlanPaymentOption value : paymentOptions) {
            paymentOptionsCopy.add(value.toString());
        }
        if (getPaymentOptions() == null) {
            setPaymentOptions(paymentOptionsCopy);
        } else {
            getPaymentOptions().addAll(paymentOptionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productType
     *        The product type.
     * @see SavingsPlanProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @return The product type.
     * @see SavingsPlanProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productType
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public DescribeSavingsPlansOfferingsRequest withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productType
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public DescribeSavingsPlansOfferingsRequest withProductType(SavingsPlanProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @return The plan type.
     * @see SavingsPlanType
     */

    public java.util.List<String> getPlanTypes() {
        return planTypes;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planTypes
     *        The plan type.
     * @see SavingsPlanType
     */

    public void setPlanTypes(java.util.Collection<String> planTypes) {
        if (planTypes == null) {
            this.planTypes = null;
            return;
        }

        this.planTypes = new java.util.ArrayList<String>(planTypes);
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlanTypes(java.util.Collection)} or {@link #withPlanTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param planTypes
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public DescribeSavingsPlansOfferingsRequest withPlanTypes(String... planTypes) {
        if (this.planTypes == null) {
            setPlanTypes(new java.util.ArrayList<String>(planTypes.length));
        }
        for (String ele : planTypes) {
            this.planTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planTypes
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public DescribeSavingsPlansOfferingsRequest withPlanTypes(java.util.Collection<String> planTypes) {
        setPlanTypes(planTypes);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planTypes
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public DescribeSavingsPlansOfferingsRequest withPlanTypes(SavingsPlanType... planTypes) {
        java.util.ArrayList<String> planTypesCopy = new java.util.ArrayList<String>(planTypes.length);
        for (SavingsPlanType value : planTypes) {
            planTypesCopy.add(value.toString());
        }
        if (getPlanTypes() == null) {
            setPlanTypes(planTypesCopy);
        } else {
            getPlanTypes().addAll(planTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The durations, in seconds.
     * </p>
     * 
     * @return The durations, in seconds.
     */

    public java.util.List<Long> getDurations() {
        return durations;
    }

    /**
     * <p>
     * The durations, in seconds.
     * </p>
     * 
     * @param durations
     *        The durations, in seconds.
     */

    public void setDurations(java.util.Collection<Long> durations) {
        if (durations == null) {
            this.durations = null;
            return;
        }

        this.durations = new java.util.ArrayList<Long>(durations);
    }

    /**
     * <p>
     * The durations, in seconds.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDurations(java.util.Collection)} or {@link #withDurations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param durations
     *        The durations, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withDurations(Long... durations) {
        if (this.durations == null) {
            setDurations(new java.util.ArrayList<Long>(durations.length));
        }
        for (Long ele : durations) {
            this.durations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The durations, in seconds.
     * </p>
     * 
     * @param durations
     *        The durations, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withDurations(java.util.Collection<Long> durations) {
        setDurations(durations);
        return this;
    }

    /**
     * <p>
     * The currencies.
     * </p>
     * 
     * @return The currencies.
     * @see CurrencyCode
     */

    public java.util.List<String> getCurrencies() {
        return currencies;
    }

    /**
     * <p>
     * The currencies.
     * </p>
     * 
     * @param currencies
     *        The currencies.
     * @see CurrencyCode
     */

    public void setCurrencies(java.util.Collection<String> currencies) {
        if (currencies == null) {
            this.currencies = null;
            return;
        }

        this.currencies = new java.util.ArrayList<String>(currencies);
    }

    /**
     * <p>
     * The currencies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCurrencies(java.util.Collection)} or {@link #withCurrencies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param currencies
     *        The currencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public DescribeSavingsPlansOfferingsRequest withCurrencies(String... currencies) {
        if (this.currencies == null) {
            setCurrencies(new java.util.ArrayList<String>(currencies.length));
        }
        for (String ele : currencies) {
            this.currencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The currencies.
     * </p>
     * 
     * @param currencies
     *        The currencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public DescribeSavingsPlansOfferingsRequest withCurrencies(java.util.Collection<String> currencies) {
        setCurrencies(currencies);
        return this;
    }

    /**
     * <p>
     * The currencies.
     * </p>
     * 
     * @param currencies
     *        The currencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public DescribeSavingsPlansOfferingsRequest withCurrencies(CurrencyCode... currencies) {
        java.util.ArrayList<String> currenciesCopy = new java.util.ArrayList<String>(currencies.length);
        for (CurrencyCode value : currencies) {
            currenciesCopy.add(value.toString());
        }
        if (getCurrencies() == null) {
            setCurrencies(currenciesCopy);
        } else {
            getCurrencies().addAll(currenciesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The descriptions.
     * </p>
     * 
     * @return The descriptions.
     */

    public java.util.List<String> getDescriptions() {
        return descriptions;
    }

    /**
     * <p>
     * The descriptions.
     * </p>
     * 
     * @param descriptions
     *        The descriptions.
     */

    public void setDescriptions(java.util.Collection<String> descriptions) {
        if (descriptions == null) {
            this.descriptions = null;
            return;
        }

        this.descriptions = new java.util.ArrayList<String>(descriptions);
    }

    /**
     * <p>
     * The descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescriptions(java.util.Collection)} or {@link #withDescriptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param descriptions
     *        The descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withDescriptions(String... descriptions) {
        if (this.descriptions == null) {
            setDescriptions(new java.util.ArrayList<String>(descriptions.length));
        }
        for (String ele : descriptions) {
            this.descriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The descriptions.
     * </p>
     * 
     * @param descriptions
     *        The descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withDescriptions(java.util.Collection<String> descriptions) {
        setDescriptions(descriptions);
        return this;
    }

    /**
     * <p>
     * The services.
     * </p>
     * 
     * @return The services.
     */

    public java.util.List<String> getServiceCodes() {
        return serviceCodes;
    }

    /**
     * <p>
     * The services.
     * </p>
     * 
     * @param serviceCodes
     *        The services.
     */

    public void setServiceCodes(java.util.Collection<String> serviceCodes) {
        if (serviceCodes == null) {
            this.serviceCodes = null;
            return;
        }

        this.serviceCodes = new java.util.ArrayList<String>(serviceCodes);
    }

    /**
     * <p>
     * The services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceCodes(java.util.Collection)} or {@link #withServiceCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceCodes
     *        The services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withServiceCodes(String... serviceCodes) {
        if (this.serviceCodes == null) {
            setServiceCodes(new java.util.ArrayList<String>(serviceCodes.length));
        }
        for (String ele : serviceCodes) {
            this.serviceCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The services.
     * </p>
     * 
     * @param serviceCodes
     *        The services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withServiceCodes(java.util.Collection<String> serviceCodes) {
        setServiceCodes(serviceCodes);
        return this;
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * 
     * @return The usage details of the line item in the billing report.
     */

    public java.util.List<String> getUsageTypes() {
        return usageTypes;
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * 
     * @param usageTypes
     *        The usage details of the line item in the billing report.
     */

    public void setUsageTypes(java.util.Collection<String> usageTypes) {
        if (usageTypes == null) {
            this.usageTypes = null;
            return;
        }

        this.usageTypes = new java.util.ArrayList<String>(usageTypes);
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageTypes(java.util.Collection)} or {@link #withUsageTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param usageTypes
     *        The usage details of the line item in the billing report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withUsageTypes(String... usageTypes) {
        if (this.usageTypes == null) {
            setUsageTypes(new java.util.ArrayList<String>(usageTypes.length));
        }
        for (String ele : usageTypes) {
            this.usageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * 
     * @param usageTypes
     *        The usage details of the line item in the billing report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withUsageTypes(java.util.Collection<String> usageTypes) {
        setUsageTypes(usageTypes);
        return this;
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * 
     * @return The specific AWS operation for the line item in the billing report.
     */

    public java.util.List<String> getOperations() {
        return operations;
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * 
     * @param operations
     *        The specific AWS operation for the line item in the billing report.
     */

    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<String>(operations);
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        The specific AWS operation for the line item in the billing report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withOperations(String... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<String>(operations.length));
        }
        for (String ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * 
     * @param operations
     *        The specific AWS operation for the line item in the billing report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withOperations(java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @return The filters.
     */

    public java.util.List<SavingsPlanOfferingFilterElement> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     */

    public void setFilters(java.util.Collection<SavingsPlanOfferingFilterElement> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SavingsPlanOfferingFilterElement>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withFilters(SavingsPlanOfferingFilterElement... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SavingsPlanOfferingFilterElement>(filters.length));
        }
        for (SavingsPlanOfferingFilterElement ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withFilters(java.util.Collection<SavingsPlanOfferingFilterElement> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve additional results, make another
     *        call with the returned token value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve additional results, make another
     *         call with the returned token value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve additional results, make another
     *        call with the returned token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getOfferingIds() != null)
            sb.append("OfferingIds: ").append(getOfferingIds()).append(",");
        if (getPaymentOptions() != null)
            sb.append("PaymentOptions: ").append(getPaymentOptions()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getPlanTypes() != null)
            sb.append("PlanTypes: ").append(getPlanTypes()).append(",");
        if (getDurations() != null)
            sb.append("Durations: ").append(getDurations()).append(",");
        if (getCurrencies() != null)
            sb.append("Currencies: ").append(getCurrencies()).append(",");
        if (getDescriptions() != null)
            sb.append("Descriptions: ").append(getDescriptions()).append(",");
        if (getServiceCodes() != null)
            sb.append("ServiceCodes: ").append(getServiceCodes()).append(",");
        if (getUsageTypes() != null)
            sb.append("UsageTypes: ").append(getUsageTypes()).append(",");
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSavingsPlansOfferingsRequest == false)
            return false;
        DescribeSavingsPlansOfferingsRequest other = (DescribeSavingsPlansOfferingsRequest) obj;
        if (other.getOfferingIds() == null ^ this.getOfferingIds() == null)
            return false;
        if (other.getOfferingIds() != null && other.getOfferingIds().equals(this.getOfferingIds()) == false)
            return false;
        if (other.getPaymentOptions() == null ^ this.getPaymentOptions() == null)
            return false;
        if (other.getPaymentOptions() != null && other.getPaymentOptions().equals(this.getPaymentOptions()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getPlanTypes() == null ^ this.getPlanTypes() == null)
            return false;
        if (other.getPlanTypes() != null && other.getPlanTypes().equals(this.getPlanTypes()) == false)
            return false;
        if (other.getDurations() == null ^ this.getDurations() == null)
            return false;
        if (other.getDurations() != null && other.getDurations().equals(this.getDurations()) == false)
            return false;
        if (other.getCurrencies() == null ^ this.getCurrencies() == null)
            return false;
        if (other.getCurrencies() != null && other.getCurrencies().equals(this.getCurrencies()) == false)
            return false;
        if (other.getDescriptions() == null ^ this.getDescriptions() == null)
            return false;
        if (other.getDescriptions() != null && other.getDescriptions().equals(this.getDescriptions()) == false)
            return false;
        if (other.getServiceCodes() == null ^ this.getServiceCodes() == null)
            return false;
        if (other.getServiceCodes() != null && other.getServiceCodes().equals(this.getServiceCodes()) == false)
            return false;
        if (other.getUsageTypes() == null ^ this.getUsageTypes() == null)
            return false;
        if (other.getUsageTypes() != null && other.getUsageTypes().equals(this.getUsageTypes()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingIds() == null) ? 0 : getOfferingIds().hashCode());
        hashCode = prime * hashCode + ((getPaymentOptions() == null) ? 0 : getPaymentOptions().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getPlanTypes() == null) ? 0 : getPlanTypes().hashCode());
        hashCode = prime * hashCode + ((getDurations() == null) ? 0 : getDurations().hashCode());
        hashCode = prime * hashCode + ((getCurrencies() == null) ? 0 : getCurrencies().hashCode());
        hashCode = prime * hashCode + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        hashCode = prime * hashCode + ((getServiceCodes() == null) ? 0 : getServiceCodes().hashCode());
        hashCode = prime * hashCode + ((getUsageTypes() == null) ? 0 : getUsageTypes().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSavingsPlansOfferingsRequest clone() {
        return (DescribeSavingsPlansOfferingsRequest) super.clone();
    }

}
