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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Remix Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/RemixSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemixSettings implements Serializable, Cloneable, StructuredPojo {

    /** Mapping of input channels to output channels, with appropriate gain adjustments. */
    private java.util.List<AudioChannelMapping> channelMappings;
    /** Number of input channels to be used. */
    private Integer channelsIn;
    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     */
    private Integer channelsOut;

    /**
     * Mapping of input channels to output channels, with appropriate gain adjustments.
     * 
     * @return Mapping of input channels to output channels, with appropriate gain adjustments.
     */

    public java.util.List<AudioChannelMapping> getChannelMappings() {
        return channelMappings;
    }

    /**
     * Mapping of input channels to output channels, with appropriate gain adjustments.
     * 
     * @param channelMappings
     *        Mapping of input channels to output channels, with appropriate gain adjustments.
     */

    public void setChannelMappings(java.util.Collection<AudioChannelMapping> channelMappings) {
        if (channelMappings == null) {
            this.channelMappings = null;
            return;
        }

        this.channelMappings = new java.util.ArrayList<AudioChannelMapping>(channelMappings);
    }

    /**
     * Mapping of input channels to output channels, with appropriate gain adjustments.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelMappings(java.util.Collection)} or {@link #withChannelMappings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param channelMappings
     *        Mapping of input channels to output channels, with appropriate gain adjustments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemixSettings withChannelMappings(AudioChannelMapping... channelMappings) {
        if (this.channelMappings == null) {
            setChannelMappings(new java.util.ArrayList<AudioChannelMapping>(channelMappings.length));
        }
        for (AudioChannelMapping ele : channelMappings) {
            this.channelMappings.add(ele);
        }
        return this;
    }

    /**
     * Mapping of input channels to output channels, with appropriate gain adjustments.
     * 
     * @param channelMappings
     *        Mapping of input channels to output channels, with appropriate gain adjustments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemixSettings withChannelMappings(java.util.Collection<AudioChannelMapping> channelMappings) {
        setChannelMappings(channelMappings);
        return this;
    }

    /**
     * Number of input channels to be used.
     * 
     * @param channelsIn
     *        Number of input channels to be used.
     */

    public void setChannelsIn(Integer channelsIn) {
        this.channelsIn = channelsIn;
    }

    /**
     * Number of input channels to be used.
     * 
     * @return Number of input channels to be used.
     */

    public Integer getChannelsIn() {
        return this.channelsIn;
    }

    /**
     * Number of input channels to be used.
     * 
     * @param channelsIn
     *        Number of input channels to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemixSettings withChannelsIn(Integer channelsIn) {
        setChannelsIn(channelsIn);
        return this;
    }

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * 
     * @param channelsOut
     *        Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     */

    public void setChannelsOut(Integer channelsOut) {
        this.channelsOut = channelsOut;
    }

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * 
     * @return Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     */

    public Integer getChannelsOut() {
        return this.channelsOut;
    }

    /**
     * Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * 
     * @param channelsOut
     *        Number of output channels to be produced. Valid values: 1, 2, 4, 6, 8
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemixSettings withChannelsOut(Integer channelsOut) {
        setChannelsOut(channelsOut);
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
        if (getChannelMappings() != null)
            sb.append("ChannelMappings: ").append(getChannelMappings()).append(",");
        if (getChannelsIn() != null)
            sb.append("ChannelsIn: ").append(getChannelsIn()).append(",");
        if (getChannelsOut() != null)
            sb.append("ChannelsOut: ").append(getChannelsOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemixSettings == false)
            return false;
        RemixSettings other = (RemixSettings) obj;
        if (other.getChannelMappings() == null ^ this.getChannelMappings() == null)
            return false;
        if (other.getChannelMappings() != null && other.getChannelMappings().equals(this.getChannelMappings()) == false)
            return false;
        if (other.getChannelsIn() == null ^ this.getChannelsIn() == null)
            return false;
        if (other.getChannelsIn() != null && other.getChannelsIn().equals(this.getChannelsIn()) == false)
            return false;
        if (other.getChannelsOut() == null ^ this.getChannelsOut() == null)
            return false;
        if (other.getChannelsOut() != null && other.getChannelsOut().equals(this.getChannelsOut()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelMappings() == null) ? 0 : getChannelMappings().hashCode());
        hashCode = prime * hashCode + ((getChannelsIn() == null) ? 0 : getChannelsIn().hashCode());
        hashCode = prime * hashCode + ((getChannelsOut() == null) ? 0 : getChannelsOut().hashCode());
        return hashCode;
    }

    @Override
    public RemixSettings clone() {
        try {
            return (RemixSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.RemixSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
