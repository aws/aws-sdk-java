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

/**
 * <p>
 * An object that contains all the deliverability data for a specific campaign. This data is available for a campaign
 * only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDomainDeliverabilityCampaign"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainDeliverabilityCampaignResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object that contains the deliverability data for the campaign.
     * </p>
     */
    private DomainDeliverabilityCampaign domainDeliverabilityCampaign;

    /**
     * <p>
     * An object that contains the deliverability data for the campaign.
     * </p>
     * 
     * @param domainDeliverabilityCampaign
     *        An object that contains the deliverability data for the campaign.
     */

    public void setDomainDeliverabilityCampaign(DomainDeliverabilityCampaign domainDeliverabilityCampaign) {
        this.domainDeliverabilityCampaign = domainDeliverabilityCampaign;
    }

    /**
     * <p>
     * An object that contains the deliverability data for the campaign.
     * </p>
     * 
     * @return An object that contains the deliverability data for the campaign.
     */

    public DomainDeliverabilityCampaign getDomainDeliverabilityCampaign() {
        return this.domainDeliverabilityCampaign;
    }

    /**
     * <p>
     * An object that contains the deliverability data for the campaign.
     * </p>
     * 
     * @param domainDeliverabilityCampaign
     *        An object that contains the deliverability data for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainDeliverabilityCampaignResult withDomainDeliverabilityCampaign(DomainDeliverabilityCampaign domainDeliverabilityCampaign) {
        setDomainDeliverabilityCampaign(domainDeliverabilityCampaign);
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
        if (getDomainDeliverabilityCampaign() != null)
            sb.append("DomainDeliverabilityCampaign: ").append(getDomainDeliverabilityCampaign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainDeliverabilityCampaignResult == false)
            return false;
        GetDomainDeliverabilityCampaignResult other = (GetDomainDeliverabilityCampaignResult) obj;
        if (other.getDomainDeliverabilityCampaign() == null ^ this.getDomainDeliverabilityCampaign() == null)
            return false;
        if (other.getDomainDeliverabilityCampaign() != null && other.getDomainDeliverabilityCampaign().equals(this.getDomainDeliverabilityCampaign()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainDeliverabilityCampaign() == null) ? 0 : getDomainDeliverabilityCampaign().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainDeliverabilityCampaignResult clone() {
        try {
            return (GetDomainDeliverabilityCampaignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
