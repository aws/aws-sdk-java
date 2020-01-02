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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time
 * range. This data is available for a domain only if you enabled the Deliverability dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListDomainDeliverabilityCampaigns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainDeliverabilityCampaignsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The first day, in Unix time format, that you want to obtain deliverability data for.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less
     * than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * The domain to obtain deliverability data for.
     * </p>
     */
    private String subscribedDomain;
    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of a campaign in the list of campaigns.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to include in response to a single call to the
     * <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the number that
     * you specify in this parameter, the response includes a <code>NextToken</code> element, which you can use to
     * obtain additional results.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The first day, in Unix time format, that you want to obtain deliverability data for.
     * </p>
     * 
     * @param startDate
     *        The first day, in Unix time format, that you want to obtain deliverability data for.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The first day, in Unix time format, that you want to obtain deliverability data for.
     * </p>
     * 
     * @return The first day, in Unix time format, that you want to obtain deliverability data for.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The first day, in Unix time format, that you want to obtain deliverability data for.
     * </p>
     * 
     * @param startDate
     *        The first day, in Unix time format, that you want to obtain deliverability data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsRequest withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less
     * than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     * </p>
     * 
     * @param endDate
     *        The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be
     *        less than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less
     * than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     * </p>
     * 
     * @return The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be
     *         less than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less
     * than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     * </p>
     * 
     * @param endDate
     *        The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be
     *        less than or equal to 30 days after the value of the <code>StartDate</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsRequest withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The domain to obtain deliverability data for.
     * </p>
     * 
     * @param subscribedDomain
     *        The domain to obtain deliverability data for.
     */

    public void setSubscribedDomain(String subscribedDomain) {
        this.subscribedDomain = subscribedDomain;
    }

    /**
     * <p>
     * The domain to obtain deliverability data for.
     * </p>
     * 
     * @return The domain to obtain deliverability data for.
     */

    public String getSubscribedDomain() {
        return this.subscribedDomain;
    }

    /**
     * <p>
     * The domain to obtain deliverability data for.
     * </p>
     * 
     * @param subscribedDomain
     *        The domain to obtain deliverability data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsRequest withSubscribedDomain(String subscribedDomain) {
        setSubscribedDomain(subscribedDomain);
        return this;
    }

    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of a campaign in the list of campaigns.
     * </p>
     * 
     * @param nextToken
     *        A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code>
     *        operation. This token indicates the position of a campaign in the list of campaigns.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of a campaign in the list of campaigns.
     * </p>
     * 
     * @return A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code>
     *         operation. This token indicates the position of a campaign in the list of campaigns.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of a campaign in the list of campaigns.
     * </p>
     * 
     * @param nextToken
     *        A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code>
     *        operation. This token indicates the position of a campaign in the list of campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in response to a single call to the
     * <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the number that
     * you specify in this parameter, the response includes a <code>NextToken</code> element, which you can use to
     * obtain additional results.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to include in response to a single call to the
     *        <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the
     *        number that you specify in this parameter, the response includes a <code>NextToken</code> element, which
     *        you can use to obtain additional results.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to include in response to a single call to the
     * <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the number that
     * you specify in this parameter, the response includes a <code>NextToken</code> element, which you can use to
     * obtain additional results.
     * </p>
     * 
     * @return The maximum number of results to include in response to a single call to the
     *         <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the
     *         number that you specify in this parameter, the response includes a <code>NextToken</code> element, which
     *         you can use to obtain additional results.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of results to include in response to a single call to the
     * <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the number that
     * you specify in this parameter, the response includes a <code>NextToken</code> element, which you can use to
     * obtain additional results.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to include in response to a single call to the
     *        <code>ListDomainDeliverabilityCampaigns</code> operation. If the number of results is larger than the
     *        number that you specify in this parameter, the response includes a <code>NextToken</code> element, which
     *        you can use to obtain additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getSubscribedDomain() != null)
            sb.append("SubscribedDomain: ").append(getSubscribedDomain()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainDeliverabilityCampaignsRequest == false)
            return false;
        ListDomainDeliverabilityCampaignsRequest other = (ListDomainDeliverabilityCampaignsRequest) obj;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getSubscribedDomain() == null ^ this.getSubscribedDomain() == null)
            return false;
        if (other.getSubscribedDomain() != null && other.getSubscribedDomain().equals(this.getSubscribedDomain()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getSubscribedDomain() == null) ? 0 : getSubscribedDomain().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainDeliverabilityCampaignsRequest clone() {
        return (ListDomainDeliverabilityCampaignsRequest) super.clone();
    }

}
