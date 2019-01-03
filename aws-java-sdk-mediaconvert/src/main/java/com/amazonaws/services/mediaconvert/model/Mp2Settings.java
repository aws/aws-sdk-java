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
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Mp2Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mp2Settings implements Serializable, Cloneable, StructuredPojo {

    /** Average bitrate in bits/second. */
    private Integer bitrate;
    /**
     * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give
     * you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     */
    private Integer channels;
    /** Sample rate in hz. */
    private Integer sampleRate;

    /**
     * Average bitrate in bits/second.
     * 
     * @param bitrate
     *        Average bitrate in bits/second.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second.
     * 
     * @return Average bitrate in bits/second.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second.
     * 
     * @param bitrate
     *        Average bitrate in bits/second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp2Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give
     * you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * 
     * @param channels
     *        Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console
     *        will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     */

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give
     * you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * 
     * @return Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console
     *         will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     */

    public Integer getChannels() {
        return this.channels;
    }

    /**
     * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give
     * you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * 
     * @param channels
     *        Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console
     *        will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp2Settings withChannels(Integer channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Sample rate in hz.
     * 
     * @param sampleRate
     *        Sample rate in hz.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in hz.
     * 
     * @return Sample rate in hz.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Sample rate in hz.
     * 
     * @param sampleRate
     *        Sample rate in hz.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp2Settings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
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
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mp2Settings == false)
            return false;
        Mp2Settings other = (Mp2Settings) obj;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public Mp2Settings clone() {
        try {
            return (Mp2Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Mp2SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
