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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVoiceChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private VoiceChannelResponse voiceChannelResponse;

    /**
     * @param voiceChannelResponse
     */

    public void setVoiceChannelResponse(VoiceChannelResponse voiceChannelResponse) {
        this.voiceChannelResponse = voiceChannelResponse;
    }

    /**
     * @return
     */

    public VoiceChannelResponse getVoiceChannelResponse() {
        return this.voiceChannelResponse;
    }

    /**
     * @param voiceChannelResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVoiceChannelResult withVoiceChannelResponse(VoiceChannelResponse voiceChannelResponse) {
        setVoiceChannelResponse(voiceChannelResponse);
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
        if (getVoiceChannelResponse() != null)
            sb.append("VoiceChannelResponse: ").append(getVoiceChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVoiceChannelResult == false)
            return false;
        DeleteVoiceChannelResult other = (DeleteVoiceChannelResult) obj;
        if (other.getVoiceChannelResponse() == null ^ this.getVoiceChannelResponse() == null)
            return false;
        if (other.getVoiceChannelResponse() != null && other.getVoiceChannelResponse().equals(this.getVoiceChannelResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceChannelResponse() == null) ? 0 : getVoiceChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVoiceChannelResult clone() {
        try {
            return (DeleteVoiceChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
