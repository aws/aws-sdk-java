/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModeratedByAppInstanceUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelModeratedByAppInstanceUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The moderated channel.
     * </p>
     */
    private ChannelModeratedByAppInstanceUserSummary channel;

    /**
     * <p>
     * The moderated channel.
     * </p>
     * 
     * @param channel
     *        The moderated channel.
     */

    public void setChannel(ChannelModeratedByAppInstanceUserSummary channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The moderated channel.
     * </p>
     * 
     * @return The moderated channel.
     */

    public ChannelModeratedByAppInstanceUserSummary getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The moderated channel.
     * </p>
     * 
     * @param channel
     *        The moderated channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelModeratedByAppInstanceUserResult withChannel(ChannelModeratedByAppInstanceUserSummary channel) {
        setChannel(channel);
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
            sb.append("Channel: ").append(getChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelModeratedByAppInstanceUserResult == false)
            return false;
        DescribeChannelModeratedByAppInstanceUserResult other = (DescribeChannelModeratedByAppInstanceUserResult) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelModeratedByAppInstanceUserResult clone() {
        try {
            return (DescribeChannelModeratedByAppInstanceUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
