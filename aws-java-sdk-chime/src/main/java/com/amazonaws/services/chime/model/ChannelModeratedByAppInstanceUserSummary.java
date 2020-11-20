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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the summary data for a moderated channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelModeratedByAppInstanceUserSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelModeratedByAppInstanceUserSummary implements Serializable, Cloneable, StructuredPojo {

    private ChannelSummary channelSummary;

    /**
     * @param channelSummary
     */

    public void setChannelSummary(ChannelSummary channelSummary) {
        this.channelSummary = channelSummary;
    }

    /**
     * @return
     */

    public ChannelSummary getChannelSummary() {
        return this.channelSummary;
    }

    /**
     * @param channelSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelModeratedByAppInstanceUserSummary withChannelSummary(ChannelSummary channelSummary) {
        setChannelSummary(channelSummary);
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
        if (getChannelSummary() != null)
            sb.append("ChannelSummary: ").append(getChannelSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelModeratedByAppInstanceUserSummary == false)
            return false;
        ChannelModeratedByAppInstanceUserSummary other = (ChannelModeratedByAppInstanceUserSummary) obj;
        if (other.getChannelSummary() == null ^ this.getChannelSummary() == null)
            return false;
        if (other.getChannelSummary() != null && other.getChannelSummary().equals(this.getChannelSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelSummary() == null) ? 0 : getChannelSummary().hashCode());
        return hashCode;
    }

    @Override
    public ChannelModeratedByAppInstanceUserSummary clone() {
        try {
            return (ChannelModeratedByAppInstanceUserSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelModeratedByAppInstanceUserSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
