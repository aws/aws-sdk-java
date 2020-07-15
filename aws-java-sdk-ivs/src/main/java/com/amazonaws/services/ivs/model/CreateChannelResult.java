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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Channel channel;

    private StreamKey streamKey;

    /**
     * @param channel
     */

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * @return
     */

    public Channel getChannel() {
        return this.channel;
    }

    /**
     * @param channel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withChannel(Channel channel) {
        setChannel(channel);
        return this;
    }

    /**
     * @param streamKey
     */

    public void setStreamKey(StreamKey streamKey) {
        this.streamKey = streamKey;
    }

    /**
     * @return
     */

    public StreamKey getStreamKey() {
        return this.streamKey;
    }

    /**
     * @param streamKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChannelResult withStreamKey(StreamKey streamKey) {
        setStreamKey(streamKey);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getStreamKey() != null)
            sb.append("StreamKey: ").append(getStreamKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChannelResult == false)
            return false;
        CreateChannelResult other = (CreateChannelResult) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getStreamKey() == null ^ this.getStreamKey() == null)
            return false;
        if (other.getStreamKey() != null && other.getStreamKey().equals(this.getStreamKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getStreamKey() == null) ? 0 : getStreamKey().hashCode());
        return hashCode;
    }

    @Override
    public CreateChannelResult clone() {
        try {
            return (CreateChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
