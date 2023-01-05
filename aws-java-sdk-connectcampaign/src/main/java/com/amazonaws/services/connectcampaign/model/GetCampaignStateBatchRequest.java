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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * GetCampaignStateBatchRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignStateBatch"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCampaignStateBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private java.util.List<String> campaignIds;

    /**
     * @return
     */

    public java.util.List<String> getCampaignIds() {
        return campaignIds;
    }

    /**
     * @param campaignIds
     */

    public void setCampaignIds(java.util.Collection<String> campaignIds) {
        if (campaignIds == null) {
            this.campaignIds = null;
            return;
        }

        this.campaignIds = new java.util.ArrayList<String>(campaignIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCampaignIds(java.util.Collection)} or {@link #withCampaignIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param campaignIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignStateBatchRequest withCampaignIds(String... campaignIds) {
        if (this.campaignIds == null) {
            setCampaignIds(new java.util.ArrayList<String>(campaignIds.length));
        }
        for (String ele : campaignIds) {
            this.campaignIds.add(ele);
        }
        return this;
    }

    /**
     * @param campaignIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignStateBatchRequest withCampaignIds(java.util.Collection<String> campaignIds) {
        setCampaignIds(campaignIds);
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
        if (getCampaignIds() != null)
            sb.append("CampaignIds: ").append(getCampaignIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignStateBatchRequest == false)
            return false;
        GetCampaignStateBatchRequest other = (GetCampaignStateBatchRequest) obj;
        if (other.getCampaignIds() == null ^ this.getCampaignIds() == null)
            return false;
        if (other.getCampaignIds() != null && other.getCampaignIds().equals(this.getCampaignIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignIds() == null) ? 0 : getCampaignIds().hashCode());
        return hashCode;
    }

    @Override
    public GetCampaignStateBatchRequest clone() {
        return (GetCampaignStateBatchRequest) super.clone();
    }

}
