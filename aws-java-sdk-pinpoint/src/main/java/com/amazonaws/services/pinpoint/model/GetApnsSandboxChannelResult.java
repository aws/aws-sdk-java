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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApnsSandboxChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private APNSSandboxChannelResponse aPNSSandboxChannelResponse;

    /**
     * @param aPNSSandboxChannelResponse
     */

    public void setAPNSSandboxChannelResponse(APNSSandboxChannelResponse aPNSSandboxChannelResponse) {
        this.aPNSSandboxChannelResponse = aPNSSandboxChannelResponse;
    }

    /**
     * @return
     */

    public APNSSandboxChannelResponse getAPNSSandboxChannelResponse() {
        return this.aPNSSandboxChannelResponse;
    }

    /**
     * @param aPNSSandboxChannelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApnsSandboxChannelResult withAPNSSandboxChannelResponse(APNSSandboxChannelResponse aPNSSandboxChannelResponse) {
        setAPNSSandboxChannelResponse(aPNSSandboxChannelResponse);
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
        if (getAPNSSandboxChannelResponse() != null)
            sb.append("APNSSandboxChannelResponse: ").append(getAPNSSandboxChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApnsSandboxChannelResult == false)
            return false;
        GetApnsSandboxChannelResult other = (GetApnsSandboxChannelResult) obj;
        if (other.getAPNSSandboxChannelResponse() == null ^ this.getAPNSSandboxChannelResponse() == null)
            return false;
        if (other.getAPNSSandboxChannelResponse() != null && other.getAPNSSandboxChannelResponse().equals(this.getAPNSSandboxChannelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSSandboxChannelResponse() == null) ? 0 : getAPNSSandboxChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetApnsSandboxChannelResult clone() {
        try {
            return (GetApnsSandboxChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
