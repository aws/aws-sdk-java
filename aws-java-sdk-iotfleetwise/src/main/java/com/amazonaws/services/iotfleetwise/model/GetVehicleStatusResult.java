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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicleStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVehicleStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists information about the state of the vehicle with deployed campaigns.
     * </p>
     */
    private java.util.List<VehicleStatus> campaigns;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists information about the state of the vehicle with deployed campaigns.
     * </p>
     * 
     * @return Lists information about the state of the vehicle with deployed campaigns.
     */

    public java.util.List<VehicleStatus> getCampaigns() {
        return campaigns;
    }

    /**
     * <p>
     * Lists information about the state of the vehicle with deployed campaigns.
     * </p>
     * 
     * @param campaigns
     *        Lists information about the state of the vehicle with deployed campaigns.
     */

    public void setCampaigns(java.util.Collection<VehicleStatus> campaigns) {
        if (campaigns == null) {
            this.campaigns = null;
            return;
        }

        this.campaigns = new java.util.ArrayList<VehicleStatus>(campaigns);
    }

    /**
     * <p>
     * Lists information about the state of the vehicle with deployed campaigns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCampaigns(java.util.Collection)} or {@link #withCampaigns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param campaigns
     *        Lists information about the state of the vehicle with deployed campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleStatusResult withCampaigns(VehicleStatus... campaigns) {
        if (this.campaigns == null) {
            setCampaigns(new java.util.ArrayList<VehicleStatus>(campaigns.length));
        }
        for (VehicleStatus ele : campaigns) {
            this.campaigns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists information about the state of the vehicle with deployed campaigns.
     * </p>
     * 
     * @param campaigns
     *        Lists information about the state of the vehicle with deployed campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleStatusResult withCampaigns(java.util.Collection<VehicleStatus> campaigns) {
        setCampaigns(campaigns);
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

    public GetVehicleStatusResult withNextToken(String nextToken) {
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
        if (getCampaigns() != null)
            sb.append("Campaigns: ").append(getCampaigns()).append(",");
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

        if (obj instanceof GetVehicleStatusResult == false)
            return false;
        GetVehicleStatusResult other = (GetVehicleStatusResult) obj;
        if (other.getCampaigns() == null ^ this.getCampaigns() == null)
            return false;
        if (other.getCampaigns() != null && other.getCampaigns().equals(this.getCampaigns()) == false)
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

        hashCode = prime * hashCode + ((getCampaigns() == null) ? 0 : getCampaigns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetVehicleStatusResult clone() {
        try {
            return (GetVehicleStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
