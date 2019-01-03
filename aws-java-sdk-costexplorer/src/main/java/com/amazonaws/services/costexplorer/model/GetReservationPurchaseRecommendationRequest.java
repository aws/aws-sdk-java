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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationPurchaseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservationPurchaseRecommendationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     * account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     * includes only member accounts when it calculates its recommendations.
     * </p>
     * <p>
     * Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * </p>
     */
    private String accountScope;
    /**
     * <p>
     * The number of previous days that you want AWS to consider when it calculates your recommendations.
     * </p>
     */
    private String lookbackPeriodInDays;
    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     */
    private String termInYears;
    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The hardware specifications for the service instances that you want recommendations for, such as standard or
     * convertible Amazon EC2 instances.
     * </p>
     */
    private ServiceSpecification serviceSpecification;
    /**
     * <p>
     * The number of recommendations that you want returned in a single response object.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * 
     * @param accountId
     *        The account ID that is associated with the recommendation.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * 
     * @return The account ID that is associated with the recommendation.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * 
     * @param accountId
     *        The account ID that is associated with the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * 
     * @param service
     *        The specific service that you want recommendations for.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * 
     * @return The specific service that you want recommendations for.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * 
     * @param service
     *        The specific service that you want recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     * account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     * includes only member accounts when it calculates its recommendations.
     * </p>
     * <p>
     * Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     *        account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     *        includes only member accounts when it calculates its recommendations.</p>
     *        <p>
     *        Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * @see AccountScope
     */

    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     * account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     * includes only member accounts when it calculates its recommendations.
     * </p>
     * <p>
     * Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * </p>
     * 
     * @return The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the
     *         master account and any member accounts when it calculates its recommendations. <code>LINKED</code> means
     *         that AWS includes only member accounts when it calculates its recommendations.</p>
     *         <p>
     *         Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * @see AccountScope
     */

    public String getAccountScope() {
        return this.accountScope;
    }

    /**
     * <p>
     * The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     * account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     * includes only member accounts when it calculates its recommendations.
     * </p>
     * <p>
     * Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     *        account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     *        includes only member accounts when it calculates its recommendations.</p>
     *        <p>
     *        Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountScope
     */

    public GetReservationPurchaseRecommendationRequest withAccountScope(String accountScope) {
        setAccountScope(accountScope);
        return this;
    }

    /**
     * <p>
     * The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     * account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     * includes only member accounts when it calculates its recommendations.
     * </p>
     * <p>
     * Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * </p>
     * 
     * @param accountScope
     *        The account scope that you want recommendations for. <code>PAYER</code> means that AWS includes the master
     *        account and any member accounts when it calculates its recommendations. <code>LINKED</code> means that AWS
     *        includes only member accounts when it calculates its recommendations.</p>
     *        <p>
     *        Valid values are <code>PAYER</code> and <code>LINKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountScope
     */

    public GetReservationPurchaseRecommendationRequest withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it calculates your recommendations.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of previous days that you want AWS to consider when it calculates your recommendations.
     * @see LookbackPeriodInDays
     */

    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it calculates your recommendations.
     * </p>
     * 
     * @return The number of previous days that you want AWS to consider when it calculates your recommendations.
     * @see LookbackPeriodInDays
     */

    public String getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it calculates your recommendations.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of previous days that you want AWS to consider when it calculates your recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public GetReservationPurchaseRecommendationRequest withLookbackPeriodInDays(String lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it calculates your recommendations.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of previous days that you want AWS to consider when it calculates your recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackPeriodInDays
     */

    public GetReservationPurchaseRecommendationRequest withLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * 
     * @param termInYears
     *        The reservation term that you want recommendations for.
     * @see TermInYears
     */

    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * 
     * @return The reservation term that you want recommendations for.
     * @see TermInYears
     */

    public String getTermInYears() {
        return this.termInYears;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * 
     * @param termInYears
     *        The reservation term that you want recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public GetReservationPurchaseRecommendationRequest withTermInYears(String termInYears) {
        setTermInYears(termInYears);
        return this;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * 
     * @param termInYears
     *        The reservation term that you want recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TermInYears
     */

    public GetReservationPurchaseRecommendationRequest withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * 
     * @param paymentOption
     *        The reservation purchase option that you want recommendations for.
     * @see PaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * 
     * @return The reservation purchase option that you want recommendations for.
     * @see PaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * 
     * @param paymentOption
     *        The reservation purchase option that you want recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public GetReservationPurchaseRecommendationRequest withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * 
     * @param paymentOption
     *        The reservation purchase option that you want recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaymentOption
     */

    public GetReservationPurchaseRecommendationRequest withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The hardware specifications for the service instances that you want recommendations for, such as standard or
     * convertible Amazon EC2 instances.
     * </p>
     * 
     * @param serviceSpecification
     *        The hardware specifications for the service instances that you want recommendations for, such as standard
     *        or convertible Amazon EC2 instances.
     */

    public void setServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }

    /**
     * <p>
     * The hardware specifications for the service instances that you want recommendations for, such as standard or
     * convertible Amazon EC2 instances.
     * </p>
     * 
     * @return The hardware specifications for the service instances that you want recommendations for, such as standard
     *         or convertible Amazon EC2 instances.
     */

    public ServiceSpecification getServiceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * <p>
     * The hardware specifications for the service instances that you want recommendations for, such as standard or
     * convertible Amazon EC2 instances.
     * </p>
     * 
     * @param serviceSpecification
     *        The hardware specifications for the service instances that you want recommendations for, such as standard
     *        or convertible Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationRequest withServiceSpecification(ServiceSpecification serviceSpecification) {
        setServiceSpecification(serviceSpecification);
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

    public GetReservationPurchaseRecommendationRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @param nextPageToken
     *        The pagination token that indicates the next set of results that you want to retrieve.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results that you want to retrieve.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want to retrieve.
     * </p>
     * 
     * @param nextPageToken
     *        The pagination token that indicates the next set of results that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservationPurchaseRecommendationRequest == false)
            return false;
        GetReservationPurchaseRecommendationRequest other = (GetReservationPurchaseRecommendationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
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
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getServiceSpecification() == null) ? 0 : getServiceSpecification().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetReservationPurchaseRecommendationRequest clone() {
        return (GetReservationPurchaseRecommendationRequest) super.clone();
    }

}
