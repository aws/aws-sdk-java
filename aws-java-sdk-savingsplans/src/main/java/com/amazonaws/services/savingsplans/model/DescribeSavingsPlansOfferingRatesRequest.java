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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferingRates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSavingsPlansOfferingRatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     */
    private java.util.List<String> savingsPlanOfferingIds;
    /**
     * <p>
     * The payment options.
     * </p>
     */
    private java.util.List<String> savingsPlanPaymentOptions;
    /**
     * <p>
     * The plan types.
     * </p>
     */
    private java.util.List<String> savingsPlanTypes;
    /**
     * <p>
     * The AWS products.
     * </p>
     */
    private java.util.List<String> products;
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
    private java.util.List<SavingsPlanOfferingRateFilterElement> filters;
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

    public java.util.List<String> getSavingsPlanOfferingIds() {
        return savingsPlanOfferingIds;
    }

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * 
     * @param savingsPlanOfferingIds
     *        The IDs of the offerings.
     */

    public void setSavingsPlanOfferingIds(java.util.Collection<String> savingsPlanOfferingIds) {
        if (savingsPlanOfferingIds == null) {
            this.savingsPlanOfferingIds = null;
            return;
        }

        this.savingsPlanOfferingIds = new java.util.ArrayList<String>(savingsPlanOfferingIds);
    }

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlanOfferingIds(java.util.Collection)} or
     * {@link #withSavingsPlanOfferingIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param savingsPlanOfferingIds
     *        The IDs of the offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanOfferingIds(String... savingsPlanOfferingIds) {
        if (this.savingsPlanOfferingIds == null) {
            setSavingsPlanOfferingIds(new java.util.ArrayList<String>(savingsPlanOfferingIds.length));
        }
        for (String ele : savingsPlanOfferingIds) {
            this.savingsPlanOfferingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the offerings.
     * </p>
     * 
     * @param savingsPlanOfferingIds
     *        The IDs of the offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanOfferingIds(java.util.Collection<String> savingsPlanOfferingIds) {
        setSavingsPlanOfferingIds(savingsPlanOfferingIds);
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

    public java.util.List<String> getSavingsPlanPaymentOptions() {
        return savingsPlanPaymentOptions;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @param savingsPlanPaymentOptions
     *        The payment options.
     * @see SavingsPlanPaymentOption
     */

    public void setSavingsPlanPaymentOptions(java.util.Collection<String> savingsPlanPaymentOptions) {
        if (savingsPlanPaymentOptions == null) {
            this.savingsPlanPaymentOptions = null;
            return;
        }

        this.savingsPlanPaymentOptions = new java.util.ArrayList<String>(savingsPlanPaymentOptions);
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlanPaymentOptions(java.util.Collection)} or
     * {@link #withSavingsPlanPaymentOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param savingsPlanPaymentOptions
     *        The payment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanPaymentOptions(String... savingsPlanPaymentOptions) {
        if (this.savingsPlanPaymentOptions == null) {
            setSavingsPlanPaymentOptions(new java.util.ArrayList<String>(savingsPlanPaymentOptions.length));
        }
        for (String ele : savingsPlanPaymentOptions) {
            this.savingsPlanPaymentOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @param savingsPlanPaymentOptions
     *        The payment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanPaymentOptions(java.util.Collection<String> savingsPlanPaymentOptions) {
        setSavingsPlanPaymentOptions(savingsPlanPaymentOptions);
        return this;
    }

    /**
     * <p>
     * The payment options.
     * </p>
     * 
     * @param savingsPlanPaymentOptions
     *        The payment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanPaymentOptions(SavingsPlanPaymentOption... savingsPlanPaymentOptions) {
        java.util.ArrayList<String> savingsPlanPaymentOptionsCopy = new java.util.ArrayList<String>(savingsPlanPaymentOptions.length);
        for (SavingsPlanPaymentOption value : savingsPlanPaymentOptions) {
            savingsPlanPaymentOptionsCopy.add(value.toString());
        }
        if (getSavingsPlanPaymentOptions() == null) {
            setSavingsPlanPaymentOptions(savingsPlanPaymentOptionsCopy);
        } else {
            getSavingsPlanPaymentOptions().addAll(savingsPlanPaymentOptionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The plan types.
     * </p>
     * 
     * @return The plan types.
     * @see SavingsPlanType
     */

    public java.util.List<String> getSavingsPlanTypes() {
        return savingsPlanTypes;
    }

    /**
     * <p>
     * The plan types.
     * </p>
     * 
     * @param savingsPlanTypes
     *        The plan types.
     * @see SavingsPlanType
     */

    public void setSavingsPlanTypes(java.util.Collection<String> savingsPlanTypes) {
        if (savingsPlanTypes == null) {
            this.savingsPlanTypes = null;
            return;
        }

        this.savingsPlanTypes = new java.util.ArrayList<String>(savingsPlanTypes);
    }

    /**
     * <p>
     * The plan types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlanTypes(java.util.Collection)} or {@link #withSavingsPlanTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param savingsPlanTypes
     *        The plan types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanTypes(String... savingsPlanTypes) {
        if (this.savingsPlanTypes == null) {
            setSavingsPlanTypes(new java.util.ArrayList<String>(savingsPlanTypes.length));
        }
        for (String ele : savingsPlanTypes) {
            this.savingsPlanTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The plan types.
     * </p>
     * 
     * @param savingsPlanTypes
     *        The plan types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanTypes(java.util.Collection<String> savingsPlanTypes) {
        setSavingsPlanTypes(savingsPlanTypes);
        return this;
    }

    /**
     * <p>
     * The plan types.
     * </p>
     * 
     * @param savingsPlanTypes
     *        The plan types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public DescribeSavingsPlansOfferingRatesRequest withSavingsPlanTypes(SavingsPlanType... savingsPlanTypes) {
        java.util.ArrayList<String> savingsPlanTypesCopy = new java.util.ArrayList<String>(savingsPlanTypes.length);
        for (SavingsPlanType value : savingsPlanTypes) {
            savingsPlanTypesCopy.add(value.toString());
        }
        if (getSavingsPlanTypes() == null) {
            setSavingsPlanTypes(savingsPlanTypesCopy);
        } else {
            getSavingsPlanTypes().addAll(savingsPlanTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The AWS products.
     * </p>
     * 
     * @return The AWS products.
     * @see SavingsPlanProductType
     */

    public java.util.List<String> getProducts() {
        return products;
    }

    /**
     * <p>
     * The AWS products.
     * </p>
     * 
     * @param products
     *        The AWS products.
     * @see SavingsPlanProductType
     */

    public void setProducts(java.util.Collection<String> products) {
        if (products == null) {
            this.products = null;
            return;
        }

        this.products = new java.util.ArrayList<String>(products);
    }

    /**
     * <p>
     * The AWS products.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProducts(java.util.Collection)} or {@link #withProducts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param products
     *        The AWS products.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public DescribeSavingsPlansOfferingRatesRequest withProducts(String... products) {
        if (this.products == null) {
            setProducts(new java.util.ArrayList<String>(products.length));
        }
        for (String ele : products) {
            this.products.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS products.
     * </p>
     * 
     * @param products
     *        The AWS products.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public DescribeSavingsPlansOfferingRatesRequest withProducts(java.util.Collection<String> products) {
        setProducts(products);
        return this;
    }

    /**
     * <p>
     * The AWS products.
     * </p>
     * 
     * @param products
     *        The AWS products.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public DescribeSavingsPlansOfferingRatesRequest withProducts(SavingsPlanProductType... products) {
        java.util.ArrayList<String> productsCopy = new java.util.ArrayList<String>(products.length);
        for (SavingsPlanProductType value : products) {
            productsCopy.add(value.toString());
        }
        if (getProducts() == null) {
            setProducts(productsCopy);
        } else {
            getProducts().addAll(productsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The services.
     * </p>
     * 
     * @return The services.
     * @see SavingsPlanRateServiceCode
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
     * @see SavingsPlanRateServiceCode
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
     * @see SavingsPlanRateServiceCode
     */

    public DescribeSavingsPlansOfferingRatesRequest withServiceCodes(String... serviceCodes) {
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
     * @see SavingsPlanRateServiceCode
     */

    public DescribeSavingsPlansOfferingRatesRequest withServiceCodes(java.util.Collection<String> serviceCodes) {
        setServiceCodes(serviceCodes);
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
     * @see SavingsPlanRateServiceCode
     */

    public DescribeSavingsPlansOfferingRatesRequest withServiceCodes(SavingsPlanRateServiceCode... serviceCodes) {
        java.util.ArrayList<String> serviceCodesCopy = new java.util.ArrayList<String>(serviceCodes.length);
        for (SavingsPlanRateServiceCode value : serviceCodes) {
            serviceCodesCopy.add(value.toString());
        }
        if (getServiceCodes() == null) {
            setServiceCodes(serviceCodesCopy);
        } else {
            getServiceCodes().addAll(serviceCodesCopy);
        }
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

    public DescribeSavingsPlansOfferingRatesRequest withUsageTypes(String... usageTypes) {
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

    public DescribeSavingsPlansOfferingRatesRequest withUsageTypes(java.util.Collection<String> usageTypes) {
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

    public DescribeSavingsPlansOfferingRatesRequest withOperations(String... operations) {
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

    public DescribeSavingsPlansOfferingRatesRequest withOperations(java.util.Collection<String> operations) {
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

    public java.util.List<SavingsPlanOfferingRateFilterElement> getFilters() {
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

    public void setFilters(java.util.Collection<SavingsPlanOfferingRateFilterElement> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SavingsPlanOfferingRateFilterElement>(filters);
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

    public DescribeSavingsPlansOfferingRatesRequest withFilters(SavingsPlanOfferingRateFilterElement... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SavingsPlanOfferingRateFilterElement>(filters.length));
        }
        for (SavingsPlanOfferingRateFilterElement ele : filters) {
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

    public DescribeSavingsPlansOfferingRatesRequest withFilters(java.util.Collection<SavingsPlanOfferingRateFilterElement> filters) {
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

    public DescribeSavingsPlansOfferingRatesRequest withNextToken(String nextToken) {
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

    public DescribeSavingsPlansOfferingRatesRequest withMaxResults(Integer maxResults) {
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
        if (getSavingsPlanOfferingIds() != null)
            sb.append("SavingsPlanOfferingIds: ").append(getSavingsPlanOfferingIds()).append(",");
        if (getSavingsPlanPaymentOptions() != null)
            sb.append("SavingsPlanPaymentOptions: ").append(getSavingsPlanPaymentOptions()).append(",");
        if (getSavingsPlanTypes() != null)
            sb.append("SavingsPlanTypes: ").append(getSavingsPlanTypes()).append(",");
        if (getProducts() != null)
            sb.append("Products: ").append(getProducts()).append(",");
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

        if (obj instanceof DescribeSavingsPlansOfferingRatesRequest == false)
            return false;
        DescribeSavingsPlansOfferingRatesRequest other = (DescribeSavingsPlansOfferingRatesRequest) obj;
        if (other.getSavingsPlanOfferingIds() == null ^ this.getSavingsPlanOfferingIds() == null)
            return false;
        if (other.getSavingsPlanOfferingIds() != null && other.getSavingsPlanOfferingIds().equals(this.getSavingsPlanOfferingIds()) == false)
            return false;
        if (other.getSavingsPlanPaymentOptions() == null ^ this.getSavingsPlanPaymentOptions() == null)
            return false;
        if (other.getSavingsPlanPaymentOptions() != null && other.getSavingsPlanPaymentOptions().equals(this.getSavingsPlanPaymentOptions()) == false)
            return false;
        if (other.getSavingsPlanTypes() == null ^ this.getSavingsPlanTypes() == null)
            return false;
        if (other.getSavingsPlanTypes() != null && other.getSavingsPlanTypes().equals(this.getSavingsPlanTypes()) == false)
            return false;
        if (other.getProducts() == null ^ this.getProducts() == null)
            return false;
        if (other.getProducts() != null && other.getProducts().equals(this.getProducts()) == false)
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

        hashCode = prime * hashCode + ((getSavingsPlanOfferingIds() == null) ? 0 : getSavingsPlanOfferingIds().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlanPaymentOptions() == null) ? 0 : getSavingsPlanPaymentOptions().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlanTypes() == null) ? 0 : getSavingsPlanTypes().hashCode());
        hashCode = prime * hashCode + ((getProducts() == null) ? 0 : getProducts().hashCode());
        hashCode = prime * hashCode + ((getServiceCodes() == null) ? 0 : getServiceCodes().hashCode());
        hashCode = prime * hashCode + ((getUsageTypes() == null) ? 0 : getUsageTypes().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSavingsPlansOfferingRatesRequest clone() {
        return (DescribeSavingsPlansOfferingRatesRequest) super.clone();
    }

}
