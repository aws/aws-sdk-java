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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
 * campaign sent email by using a domain that the Deliverability dashboard is enabled for (
 * <code>PutDeliverabilityDashboardOption</code> operation).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDomainDeliverabilityCampaign"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainDeliverabilityCampaignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     */
    private String campaignId;

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     * 
     * @param campaignId
     *        The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this
     *        identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint
     *        assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint
     *        console.
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this
     *         identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint
     *         assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint
     *         console.
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     * 
     * @param campaignId
     *        The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this
     *        identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint
     *        assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDeliverabilityCampaignRequest withCampaignId(String campaignId) {
        setCampaignId(campaignId);
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
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainDeliverabilityCampaignRequest == false)
            return false;
        GetDomainDeliverabilityCampaignRequest other = (GetDomainDeliverabilityCampaignRequest) obj;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainDeliverabilityCampaignRequest clone() {
        return (GetDomainDeliverabilityCampaignRequest) super.clone();
    }

}
