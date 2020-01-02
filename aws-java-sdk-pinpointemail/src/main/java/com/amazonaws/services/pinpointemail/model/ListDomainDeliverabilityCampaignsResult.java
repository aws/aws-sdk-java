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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An array of objects that provide deliverability data for all the campaigns that used a specific domain to send email
 * during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (
 * <code>PutDeliverabilityDashboardOption</code> operation) for the domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/ListDomainDeliverabilityCampaigns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainDeliverabilityCampaignsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of responses, one for each campaign that used the domain to send email during the specified time range.
     * </p>
     */
    private java.util.List<DomainDeliverabilityCampaign> domainDeliverabilityCampaigns;
    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of the campaign in the list of campaigns.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of responses, one for each campaign that used the domain to send email during the specified time range.
     * </p>
     * 
     * @return An array of responses, one for each campaign that used the domain to send email during the specified time
     *         range.
     */

    public java.util.List<DomainDeliverabilityCampaign> getDomainDeliverabilityCampaigns() {
        return domainDeliverabilityCampaigns;
    }

    /**
     * <p>
     * An array of responses, one for each campaign that used the domain to send email during the specified time range.
     * </p>
     * 
     * @param domainDeliverabilityCampaigns
     *        An array of responses, one for each campaign that used the domain to send email during the specified time
     *        range.
     */

    public void setDomainDeliverabilityCampaigns(java.util.Collection<DomainDeliverabilityCampaign> domainDeliverabilityCampaigns) {
        if (domainDeliverabilityCampaigns == null) {
            this.domainDeliverabilityCampaigns = null;
            return;
        }

        this.domainDeliverabilityCampaigns = new java.util.ArrayList<DomainDeliverabilityCampaign>(domainDeliverabilityCampaigns);
    }

    /**
     * <p>
     * An array of responses, one for each campaign that used the domain to send email during the specified time range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainDeliverabilityCampaigns(java.util.Collection)} or
     * {@link #withDomainDeliverabilityCampaigns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainDeliverabilityCampaigns
     *        An array of responses, one for each campaign that used the domain to send email during the specified time
     *        range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsResult withDomainDeliverabilityCampaigns(DomainDeliverabilityCampaign... domainDeliverabilityCampaigns) {
        if (this.domainDeliverabilityCampaigns == null) {
            setDomainDeliverabilityCampaigns(new java.util.ArrayList<DomainDeliverabilityCampaign>(domainDeliverabilityCampaigns.length));
        }
        for (DomainDeliverabilityCampaign ele : domainDeliverabilityCampaigns) {
            this.domainDeliverabilityCampaigns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of responses, one for each campaign that used the domain to send email during the specified time range.
     * </p>
     * 
     * @param domainDeliverabilityCampaigns
     *        An array of responses, one for each campaign that used the domain to send email during the specified time
     *        range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsResult withDomainDeliverabilityCampaigns(
            java.util.Collection<DomainDeliverabilityCampaign> domainDeliverabilityCampaigns) {
        setDomainDeliverabilityCampaigns(domainDeliverabilityCampaigns);
        return this;
    }

    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of the campaign in the list of campaigns.
     * </p>
     * 
     * @param nextToken
     *        A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code>
     *        operation. This token indicates the position of the campaign in the list of campaigns.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of the campaign in the list of campaigns.
     * </p>
     * 
     * @return A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code>
     *         operation. This token indicates the position of the campaign in the list of campaigns.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code> operation.
     * This token indicates the position of the campaign in the list of campaigns.
     * </p>
     * 
     * @param nextToken
     *        A token that’s returned from a previous call to the <code>ListDomainDeliverabilityCampaigns</code>
     *        operation. This token indicates the position of the campaign in the list of campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainDeliverabilityCampaignsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDomainDeliverabilityCampaigns() != null)
            sb.append("DomainDeliverabilityCampaigns: ").append(getDomainDeliverabilityCampaigns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainDeliverabilityCampaignsResult == false)
            return false;
        ListDomainDeliverabilityCampaignsResult other = (ListDomainDeliverabilityCampaignsResult) obj;
        if (other.getDomainDeliverabilityCampaigns() == null ^ this.getDomainDeliverabilityCampaigns() == null)
            return false;
        if (other.getDomainDeliverabilityCampaigns() != null
                && other.getDomainDeliverabilityCampaigns().equals(this.getDomainDeliverabilityCampaigns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainDeliverabilityCampaigns() == null) ? 0 : getDomainDeliverabilityCampaigns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainDeliverabilityCampaignsResult clone() {
        try {
            return (ListDomainDeliverabilityCampaignsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
