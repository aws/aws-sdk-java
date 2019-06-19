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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job.
 * With audio remixing, you can output more or fewer audio channels than your input audio source provides.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/RemixSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemixSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel.
     * Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or amplification).
     */
    private ChannelMapping channelMapping;
    /**
     * Specify the number of audio channels from your input that you want to use in your output. With remixing, you
     * might combine or split the data in these channels, so the number of channels in your final output might be
     * different.
     */
    private Integer channelsIn;
    /** Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8 */
    private Integer channelsOut;

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel.
     * Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or amplification).
     * 
     * @param channelMapping
     *        Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each
     *        channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0
     *        passes the input channel unchanged to the output channel (no attenuation or amplification).
     */

    public void setChannelMapping(ChannelMapping channelMapping) {
        this.channelMapping = channelMapping;
    }

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel.
     * Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or amplification).
     * 
     * @return Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each
     *         channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of
     *         0 passes the input channel unchanged to the output channel (no attenuation or amplification).
     */

    public ChannelMapping getChannelMapping() {
        return this.channelMapping;
    }

    /**
     * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel.
     * Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the
     * input channel unchanged to the output channel (no attenuation or amplification).
     * 
     * @param channelMapping
     *        Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each
     *        channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0
     *        passes the input channel unchanged to the output channel (no attenuation or amplification).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemixSettings withChannelMapping(ChannelMapping channelMapping) {
        setChannelMapping(channelMapping);
        return this;
    }

    /**
     * Specify the number of audio channels from your input that you want to use in your output. With remixing, you
     * might combine or split the data in these channels, so the number of channels in your final output might be
     * different.
     * 
     * @param channelsIn
     *        Specify the number of audio channels from your input that you want to use in your output. With remixing,
     *        you might combine or split the data in these channels, so the number of channels in your final output
     *        might be different.
     */

    public void setChannelsIn(Integer channelsIn) {
        this.channelsIn = channelsIn;
    }

    /**
     * Specify the number of audio channels from your input that you want to use in your output. With remixing, you
     * might combine or split the data in these channels, so the number of channels in your final output might be
     * different.
     * 
     * @return Specify the number of audio channels from your input that you want to use in your output. With remixing,
     *         you might combine or split the data in these channels, so the number of channels in your final output
     *         might be different.
     */

    public Integer getChannelsIn() {
        return this.channelsIn;
    }

    /**
     * Specify the number of audio channels from your input that you want to use in your output. With remixing, you
     * might combine or split the data in these channels, so the number of channels in your final output might be
     * different.
     * 
     * @param channelsIn
     *        Specify the number of audio channels from your input that you want to use in your output. With remixing,
     *        you might combine or split the data in these channels, so the number of channels in your final output
     *        might be different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemixSettings withChannelsIn(Integer channelsIn) {
        setChannelsIn(channelsIn);
        return this;
    }

    /**
     * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
     * 
     * @param channelsOut
     *        Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
     */

    public void setChannelsOut(Integer channelsOut) {
        this.channelsOut = channelsOut;
    }

    /**
     * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
     * 
     * @return Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
     */

    public Integer getChannelsOut() {
        return this.channelsOut;
    }

    /**
     * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
     * 
     * @param channelsOut
     *        Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
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
        if (getChannelMapping() != null)
            sb.append("ChannelMapping: ").append(getChannelMapping()).append(",");
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
        if (other.getChannelMapping() == null ^ this.getChannelMapping() == null)
            return false;
        if (other.getChannelMapping() != null && other.getChannelMapping().equals(this.getChannelMapping()) == false)
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

        hashCode = prime * hashCode + ((getChannelMapping() == null) ? 0 : getChannelMapping().hashCode());
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
        com.amazonaws.services.mediaconvert.model.transform.RemixSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
