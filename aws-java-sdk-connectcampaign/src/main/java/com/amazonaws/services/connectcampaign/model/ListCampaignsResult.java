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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * ListCampaignsResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListCampaigns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCampaignsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<CampaignSummary> campaignSummaryList;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<CampaignSummary> getCampaignSummaryList() {
        return campaignSummaryList;
    }

    /**
     * @param campaignSummaryList
     */

    public void setCampaignSummaryList(java.util.Collection<CampaignSummary> campaignSummaryList) {
        if (campaignSummaryList == null) {
            this.campaignSummaryList = null;
            return;
        }

        this.campaignSummaryList = new java.util.ArrayList<CampaignSummary>(campaignSummaryList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCampaignSummaryList(java.util.Collection)} or {@link #withCampaignSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param campaignSummaryList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsResult withCampaignSummaryList(CampaignSummary... campaignSummaryList) {
        if (this.campaignSummaryList == null) {
            setCampaignSummaryList(new java.util.ArrayList<CampaignSummary>(campaignSummaryList.length));
        }
        for (CampaignSummary ele : campaignSummaryList) {
            this.campaignSummaryList.add(ele);
        }
        return this;
    }

    /**
     * @param campaignSummaryList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCampaignsResult withCampaignSummaryList(java.util.Collection<CampaignSummary> campaignSummaryList) {
        setCampaignSummaryList(campaignSummaryList);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
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
        if (getCampaignSummaryList() != null)
            sb.append("CampaignSummaryList: ").append(getCampaignSummaryList()).append(",");
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
        if (other.getCampaignSummaryList() == null ^ this.getCampaignSummaryList() == null)
            return false;
        if (other.getCampaignSummaryList() != null && other.getCampaignSummaryList().equals(this.getCampaignSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getCampaignSummaryList() == null) ? 0 : getCampaignSummaryList().hashCode());
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
