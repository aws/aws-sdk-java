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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetChannels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChannelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ChannelsResponse channelsResponse;

    /**
     * @param channelsResponse
     */

    public void setChannelsResponse(ChannelsResponse channelsResponse) {
        this.channelsResponse = channelsResponse;
    }

    /**
     * @return
     */

    public ChannelsResponse getChannelsResponse() {
        return this.channelsResponse;
    }

    /**
     * @param channelsResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelsResult withChannelsResponse(ChannelsResponse channelsResponse) {
        setChannelsResponse(channelsResponse);
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
        if (getChannelsResponse() != null)
            sb.append("ChannelsResponse: ").append(getChannelsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChannelsResult == false)
            return false;
        GetChannelsResult other = (GetChannelsResult) obj;
        if (other.getChannelsResponse() == null ^ this.getChannelsResponse() == null)
            return false;
        if (other.getChannelsResponse() != null && other.getChannelsResponse().equals(this.getChannelsResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelsResponse() == null) ? 0 : getChannelsResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetChannelsResult clone() {
        try {
            return (GetChannelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
