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
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AiffSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AiffSettings implements Serializable, Cloneable, StructuredPojo {

    /** Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track. */
    private Integer bitDepth;
    /**
     * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give
     * you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
     */
    private Integer channels;
    /** Sample rate in hz. */
    private Integer sampleRate;

    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
     * 
     * @param bitDepth
     *        Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
     */

    public void setBitDepth(Integer bitDepth) {
        this.bitDepth = bitDepth;
    }

    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
     * 
     * @return Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
     */

    public Integer getBitDepth() {
        return this.bitDepth;
    }

    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
     * 
     * @param bitDepth
     *        Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AiffSettings withBitDepth(Integer bitDepth) {
        setBitDepth(bitDepth);
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

    public AiffSettings withChannels(Integer channels) {
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

    public AiffSettings withSampleRate(Integer sampleRate) {
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
        if (getBitDepth() != null)
            sb.append("BitDepth: ").append(getBitDepth()).append(",");
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

        if (obj instanceof AiffSettings == false)
            return false;
        AiffSettings other = (AiffSettings) obj;
        if (other.getBitDepth() == null ^ this.getBitDepth() == null)
            return false;
        if (other.getBitDepth() != null && other.getBitDepth().equals(this.getBitDepth()) == false)
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

        hashCode = prime * hashCode + ((getBitDepth() == null) ? 0 : getBitDepth().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public AiffSettings clone() {
        try {
            return (AiffSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AiffSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
