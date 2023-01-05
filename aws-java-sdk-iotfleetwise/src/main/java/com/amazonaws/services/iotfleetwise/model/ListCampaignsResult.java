/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListCampaigns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCampaignsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of information about each campaign.
     * </p>
     */
    private java.util.List<CampaignSummary> campaignSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of information about each campaign.
     * </p>
     * 
     * @return A summary of information about each campaign.
     */

    public java.util.List<CampaignSummary> getCampaignSummaries() {
        return campaignSummaries;
    }

    /**
     * <p>
     * A summary of information about each campaign.
     * </p>
     * 
     * @param campaignSummaries
     *        A summary of information about each campaign.
     */

    public void setCampaignSummaries(java.util.Collection<CampaignSummary> campaignSummaries) {
        if (campaignSummaries == null) {
            this.campaignSummaries = null;
            return;
        }

        this.campaignSummaries = new java.util.ArrayList<CampaignSummary>(campaignSummaries);
    }

    /**
     * <p>
     * A summary of information about each campaign.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCampaignSummaries(java.util.Collection)} or {@link #withCampaignSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param campaignSummaries
     *        A summary of information about each campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsResult withCampaignSummaries(CampaignSummary... campaignSummaries) {
        if (this.campaignSummaries == null) {
            setCampaignSummaries(new java.util.ArrayList<CampaignSummary>(campaignSummaries.length));
        }
        for (CampaignSummary ele : campaignSummaries) {
            this.campaignSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of information about each campaign.
     * </p>
     * 
     * @param campaignSummaries
     *        A summary of information about each campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsResult withCampaignSummaries(java.util.Collection<CampaignSummary> campaignSummaries) {
        setCampaignSummaries(campaignSummaries);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsResult withNextToken(String nextToken) {
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
        if (getCampaignSummaries() != null)
            sb.append("CampaignSummaries: ").append(getCampaignSummaries()).append(",");
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

        if (obj instanceof ListCampaignsResult == false)
            return false;
        ListCampaignsResult other = (ListCampaignsResult) obj;
        if (other.getCampaignSummaries() == null ^ this.getCampaignSummaries() == null)
            return false;
        if (other.getCampaignSummaries() != null && other.getCampaignSummaries().equals(this.getCampaignSummaries()) == false)
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

        hashCode = prime * hashCode + ((getCampaignSummaries() == null) ? 0 : getCampaignSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCampaignsResult clone() {
        try {
            return (ListCampaignsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
