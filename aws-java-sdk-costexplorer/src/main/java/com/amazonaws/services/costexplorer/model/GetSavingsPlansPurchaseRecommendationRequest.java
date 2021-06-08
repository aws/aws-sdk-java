/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansPurchaseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansPurchaseRecommendationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     */
    private String savingsPlansType;
    /**
     * <p>
     * The savings plan recommendation term used to generate these recommendations.
     * </p>
     */
    private String termInYears;
    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     */
    private String paymentOption;
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
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     */
    private String lookbackPeriodInDays;
    /**
     * <p>
     * You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To filter your
     * recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and <code>Value</code> as
     * the comma-separated Acount ID(s) for which you want to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include <code>CostCategories</code>
     * or <code>Tags</code>. It only includes <code>Dimensions</code>. With <code>Dimensions</code>, <code>Key</code>
     * must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase Recommendations. <code>AND</code> and
     * <code>OR</code> operators are not supported.
     * </p>
     */
    private Expression filter;

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * 
     * @param savingsPlansType
     *        The Savings Plans recommendation type requested.
     * @see SupportedSavingsPlansType
     */

    public void setSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * 
     * @return The Savings Plans recommendation type requested.
     * @see SupportedSavingsPlansType
     */

    public String getSavingsPlansType() {
        return this.savingsPlansType;
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * 
     * @param savingsPlansType
     *        The Savings Plans recommendation type requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedSavingsPlansType
     */

    public GetSavingsPlansPurchaseRecommendationRequest withSavingsPlansType(String savingsPlansType) {
        setSavingsPlansType(savingsPlansType);
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * 
     * @param savingsPlansType
     *        The Savings Plans recommendation type requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedSavingsPlansType
     */

    public GetSavingsPlansPurchaseRecommendationRequest withSavingsPlansType(SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
        return this;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generate these recommendations.
     * </p>
     * 
     * @param termInYears
     *        The savings plan recommendation term used to generate these recommendations.
     * @see TermInYears
     */

    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generate these recommendations.
     * </p>
     * 
     * @return The savings plan recommendation term used to generate these recommendations.
     * @see TermInYears
     */

    public String getTermInYears() {
        return this.termInYears;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generate these recommendations.
     * </p>
     * 
     * @param termInYears
     *        The savings plan recommendation term used to generate these recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public GetSavingsPlansPurchaseRecommendationRequest withTermInYears(String termInYears) {
        setTermInYears(termInYears);
        return this;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generate these recommendations.
     * </p>
     * 
     * @param termInYears
     *        The savings plan recommendation term used to generate these recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public GetSavingsPlansPurchaseRecommendationRequest withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * 
     * @param paymentOption
     *        The payment option used to generate these recommendations.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * 
     * @return The payment option used to generate these recommendations.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * 
     * @param paymentOption
     *        The payment option used to generate these recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public GetSavingsPlansPurchaseRecommendationRequest withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * 
     * @param paymentOption
     *        The payment option used to generate these recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public GetSavingsPlansPurchaseRecommendationRequest withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
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
     * @see AccountScope
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
     * @see AccountScope
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
     * @see AccountScope
     */

    public GetSavingsPlansPurchaseRecommendationRequest withAccountScope(String accountScope) {
        setAccountScope(accountScope);
        return this;
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
     * @see AccountScope
     */

    public GetSavingsPlansPurchaseRecommendationRequest withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansPurchaseRecommendationRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     * 
     * @param pageSize
     *        The number of recommendations that you want returned in a single response object.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     * 
     * @return The number of recommendations that you want returned in a single response object.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     * 
     * @param pageSize
     *        The number of recommendations that you want returned in a single response object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansPurchaseRecommendationRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The lookback period used to generate the recommendation.
     * @see LookbackPeriodInDays
     */

    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * 
     * @return The lookback period used to generate the recommendation.
     * @see LookbackPeriodInDays
     */

    public String getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The lookback period used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public GetSavingsPlansPurchaseRecommendationRequest withLookbackPeriodInDays(String lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The lookback period used to generate the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public GetSavingsPlansPurchaseRecommendationRequest withLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To filter your
     * recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and <code>Value</code> as
     * the comma-separated Acount ID(s) for which you want to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include <code>CostCategories</code>
     * or <code>Tags</code>. It only includes <code>Dimensions</code>. With <code>Dimensions</code>, <code>Key</code>
     * must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase Recommendations. <code>AND</code> and
     * <code>OR</code> operators are not supported.
     * </p>
     * 
     * @param filter
     *        You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To
     *        filter your recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     *        <code>Value</code> as the comma-separated Acount ID(s) for which you want to see Savings Plans purchase
     *        recommendations.</p>
     *        <p>
     *        For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include
     *        <code>CostCategories</code> or <code>Tags</code>. It only includes <code>Dimensions</code>. With
     *        <code>Dimensions</code>, <code>Key</code> must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can
     *        be a single Account ID or multiple comma-separated Account IDs for which you want to see Savings Plans
     *        Purchase Recommendations. <code>AND</code> and <code>OR</code> operators are not supported.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To filter your
     * recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and <code>Value</code> as
     * the comma-separated Acount ID(s) for which you want to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include <code>CostCategories</code>
     * or <code>Tags</code>. It only includes <code>Dimensions</code>. With <code>Dimensions</code>, <code>Key</code>
     * must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase Recommendations. <code>AND</code> and
     * <code>OR</code> operators are not supported.
     * </p>
     * 
     * @return You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To
     *         filter your recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     *         <code>Value</code> as the comma-separated Acount ID(s) for which you want to see Savings Plans purchase
     *         recommendations.</p>
     *         <p>
     *         For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include
     *         <code>CostCategories</code> or <code>Tags</code>. It only includes <code>Dimensions</code>. With
     *         <code>Dimensions</code>, <code>Key</code> must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can
     *         be a single Account ID or multiple comma-separated Account IDs for which you want to see Savings Plans
     *         Purchase Recommendations. <code>AND</code> and <code>OR</code> operators are not supported.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To filter your
     * recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and <code>Value</code> as
     * the comma-separated Acount ID(s) for which you want to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include <code>CostCategories</code>
     * or <code>Tags</code>. It only includes <code>Dimensions</code>. With <code>Dimensions</code>, <code>Key</code>
     * must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase Recommendations. <code>AND</code> and
     * <code>OR</code> operators are not supported.
     * </p>
     * 
     * @param filter
     *        You can filter your recommendations by Account ID with the <code>LINKED_ACCOUNT</code> dimension. To
     *        filter your recommendations by Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     *        <code>Value</code> as the comma-separated Acount ID(s) for which you want to see Savings Plans purchase
     *        recommendations.</p>
     *        <p>
     *        For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does not include
     *        <code>CostCategories</code> or <code>Tags</code>. It only includes <code>Dimensions</code>. With
     *        <code>Dimensions</code>, <code>Key</code> must be <code>LINKED_ACCOUNT</code> and <code>Value</code> can
     *        be a single Account ID or multiple comma-separated Account IDs for which you want to see Savings Plans
     *        Purchase Recommendations. <code>AND</code> and <code>OR</code> operators are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansPurchaseRecommendationRequest withFilter(Expression filter) {
        setFilter(filter);
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
        if (getAccountScope() != null)
            sb.append("AccountScope: ").append(getAccountScope()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansPurchaseRecommendationRequest == false)
            return false;
        GetSavingsPlansPurchaseRecommendationRequest other = (GetSavingsPlansPurchaseRecommendationRequest) obj;
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
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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
        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansPurchaseRecommendationRequest clone() {
        return (GetSavingsPlansPurchaseRecommendationRequest) super.clone();
    }

}
