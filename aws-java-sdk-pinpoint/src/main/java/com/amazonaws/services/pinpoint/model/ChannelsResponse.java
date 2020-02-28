/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the general settings and status of all channels for an application, including channels
 * that aren't enabled for the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ChannelsResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the
     * key and the Channel is the value.
     * </p>
     */
    private java.util.Map<String, ChannelResponse> channels;

    /**
     * <p>
     * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the
     * key and the Channel is the value.
     * </p>
     * 
     * @return A map that contains a multipart response for each channel. For each item in this object, the ChannelType
     *         is the key and the Channel is the value.
     */

    public java.util.Map<String, ChannelResponse> getChannels() {
        return channels;
    }

    /**
     * <p>
     * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the
     * key and the Channel is the value.
     * </p>
     * 
     * @param channels
     *        A map that contains a multipart response for each channel. For each item in this object, the ChannelType
     *        is the key and the Channel is the value.
     */

    public void setChannels(java.util.Map<String, ChannelResponse> channels) {
        this.channels = channels;
    }

    /**
     * <p>
     * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the
     * key and the Channel is the value.
     * </p>
     * 
     * @param channels
     *        A map that contains a multipart response for each channel. For each item in this object, the ChannelType
     *        is the key and the Channel is the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelsResponse withChannels(java.util.Map<String, ChannelResponse> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Add a single Channels entry
     *
     * @see ChannelsResponse#withChannels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ChannelsResponse addChannelsEntry(String key, ChannelResponse value) {
        if (null == this.channels) {
            this.channels = new java.util.HashMap<String, ChannelResponse>();
        }
        if (this.channels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.channels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Channels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelsResponse clearChannelsEntries() {
        this.channels = null;
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
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelsResponse == false)
            return false;
        ChannelsResponse other = (ChannelsResponse) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        return hashCode;
    }

    @Override
    public ChannelsResponse clone() {
        try {
            return (ChannelsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ChannelsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
