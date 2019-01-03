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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCampaignActivitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ActivitiesResponse activitiesResponse;

    /**
     * @param activitiesResponse
     */

    public void setActivitiesResponse(ActivitiesResponse activitiesResponse) {
        this.activitiesResponse = activitiesResponse;
    }

    /**
     * @return
     */

    public ActivitiesResponse getActivitiesResponse() {
        return this.activitiesResponse;
    }

    /**
     * @param activitiesResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignActivitiesResult withActivitiesResponse(ActivitiesResponse activitiesResponse) {
        setActivitiesResponse(activitiesResponse);
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
        if (getActivitiesResponse() != null)
            sb.append("ActivitiesResponse: ").append(getActivitiesResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignActivitiesResult == false)
            return false;
        GetCampaignActivitiesResult other = (GetCampaignActivitiesResult) obj;
        if (other.getActivitiesResponse() == null ^ this.getActivitiesResponse() == null)
            return false;
        if (other.getActivitiesResponse() != null && other.getActivitiesResponse().equals(this.getActivitiesResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivitiesResponse() == null) ? 0 : getActivitiesResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetCampaignActivitiesResult clone() {
        try {
            return (GetCampaignActivitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
