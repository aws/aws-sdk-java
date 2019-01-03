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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApnsSandboxChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private APNSSandboxChannelRequest aPNSSandboxChannelRequest;
    /** The unique ID of your Amazon Pinpoint application. */
    private String applicationId;

    /**
     * @param aPNSSandboxChannelRequest
     */

    public void setAPNSSandboxChannelRequest(APNSSandboxChannelRequest aPNSSandboxChannelRequest) {
        this.aPNSSandboxChannelRequest = aPNSSandboxChannelRequest;
    }

    /**
     * @return
     */

    public APNSSandboxChannelRequest getAPNSSandboxChannelRequest() {
        return this.aPNSSandboxChannelRequest;
    }

    /**
     * @param aPNSSandboxChannelRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsSandboxChannelRequest withAPNSSandboxChannelRequest(APNSSandboxChannelRequest aPNSSandboxChannelRequest) {
        setAPNSSandboxChannelRequest(aPNSSandboxChannelRequest);
        return this;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * 
     * @param applicationId
     *        The unique ID of your Amazon Pinpoint application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * 
     * @return The unique ID of your Amazon Pinpoint application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * 
     * @param applicationId
     *        The unique ID of your Amazon Pinpoint application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApnsSandboxChannelRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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
        if (getAPNSSandboxChannelRequest() != null)
            sb.append("APNSSandboxChannelRequest: ").append(getAPNSSandboxChannelRequest()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApnsSandboxChannelRequest == false)
            return false;
        UpdateApnsSandboxChannelRequest other = (UpdateApnsSandboxChannelRequest) obj;
        if (other.getAPNSSandboxChannelRequest() == null ^ this.getAPNSSandboxChannelRequest() == null)
            return false;
        if (other.getAPNSSandboxChannelRequest() != null && other.getAPNSSandboxChannelRequest().equals(this.getAPNSSandboxChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSSandboxChannelRequest() == null) ? 0 : getAPNSSandboxChannelRequest().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApnsSandboxChannelRequest clone() {
        return (UpdateApnsSandboxChannelRequest) super.clone();
    }

}
