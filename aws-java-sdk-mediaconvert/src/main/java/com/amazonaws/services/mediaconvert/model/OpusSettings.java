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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/OpusSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpusSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through
     * 192000. The default value is 96000, which we recommend for quality and bandwidth.
     */
    private Integer bitrate;
    /**
     * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     * channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     */
    private Integer channels;
    /** Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000. */
    private Integer sampleRate;

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through
     * 192000. The default value is 96000, which we recommend for quality and bandwidth.
     * 
     * @param bitrate
     *        Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000
     *        through 192000. The default value is 96000, which we recommend for quality and bandwidth.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through
     * 192000. The default value is 96000, which we recommend for quality and bandwidth.
     * 
     * @return Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000
     *         through 192000. The default value is 96000, which we recommend for quality and bandwidth.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through
     * 192000. The default value is 96000, which we recommend for quality and bandwidth.
     * 
     * @param bitrate
     *        Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000
     *        through 192000. The default value is 96000, which we recommend for quality and bandwidth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpusSettings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     * channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     * 
     * @param channels
     *        Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     *        channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     */

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     * channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     * 
     * @return Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1
     *         output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     */

    public Integer getChannels() {
        return this.channels;
    }

    /**
     * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     * channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     * 
     * @param channels
     *        Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     *        channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpusSettings withChannels(Integer channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
     * 
     * @param sampleRate
     *        Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
     * 
     * @return Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
     * 
     * @param sampleRate
     *        Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpusSettings withSampleRate(Integer sampleRate) {
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

        if (obj instanceof OpusSettings == false)
            return false;
        OpusSettings other = (OpusSettings) obj;
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
    public OpusSettings clone() {
        try {
            return (OpusSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.OpusSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
