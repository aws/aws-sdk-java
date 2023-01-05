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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Successful response of campaign state
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/SuccessfulCampaignStateResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuccessfulCampaignStateResponse implements Serializable, Cloneable, StructuredPojo {

    private String campaignId;

    private String state;

    /**
     * @param campaignId
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * @return
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @param campaignId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessfulCampaignStateResponse withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * @param state
     * @see CampaignState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see CampaignState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignState
     */

    public SuccessfulCampaignStateResponse withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CampaignState
     */

    public SuccessfulCampaignStateResponse withState(CampaignState state) {
        this.state = state.toString();
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
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuccessfulCampaignStateResponse == false)
            return false;
        SuccessfulCampaignStateResponse other = (SuccessfulCampaignStateResponse) obj;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public SuccessfulCampaignStateResponse clone() {
        try {
            return (SuccessfulCampaignStateResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.SuccessfulCampaignStateResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
