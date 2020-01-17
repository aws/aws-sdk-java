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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Mp3Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mp3Settings implements Serializable, Cloneable, StructuredPojo {

    /** Specify the average bitrate in bits per second. */
    private Integer bitrate;
    /**
     * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output
     * channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
     */
    private Integer channels;
    /**
     * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate
     * (VBR).
     */
    private String rateControlMode;
    /** Sample rate in hz. */
    private Integer sampleRate;
    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output
     * from 0 (highest quality) to 9 (lowest quality).
     */
    private Integer vbrQuality;

    /**
     * Specify the average bitrate in bits per second.
     * 
     * @param bitrate
     *        Specify the average bitrate in bits per second.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second.
     * 
     * @return Specify the average bitrate in bits per second.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Specify the average bitrate in bits per second.
     * 
     * @param bitrate
     *        Specify the average bitrate in bits per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp3Settings withBitrate(Integer bitrate) {
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

    public Mp3Settings withChannels(Integer channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate
     * (VBR).
     * 
     * @param rateControlMode
     *        Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable
     *        bitrate (VBR).
     * @see Mp3RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate
     * (VBR).
     * 
     * @return Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable
     *         bitrate (VBR).
     * @see Mp3RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate
     * (VBR).
     * 
     * @param rateControlMode
     *        Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable
     *        bitrate (VBR).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp3RateControlMode
     */

    public Mp3Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate
     * (VBR).
     * 
     * @param rateControlMode
     *        Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable
     *        bitrate (VBR).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mp3RateControlMode
     */

    public Mp3Settings withRateControlMode(Mp3RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
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

    public Mp3Settings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output
     * from 0 (highest quality) to 9 (lowest quality).
     * 
     * @param vbrQuality
     *        Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3
     *        output from 0 (highest quality) to 9 (lowest quality).
     */

    public void setVbrQuality(Integer vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output
     * from 0 (highest quality) to 9 (lowest quality).
     * 
     * @return Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this
     *         MP3 output from 0 (highest quality) to 9 (lowest quality).
     */

    public Integer getVbrQuality() {
        return this.vbrQuality;
    }

    /**
     * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output
     * from 0 (highest quality) to 9 (lowest quality).
     * 
     * @param vbrQuality
     *        Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3
     *        output from 0 (highest quality) to 9 (lowest quality).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mp3Settings withVbrQuality(Integer vbrQuality) {
        setVbrQuality(vbrQuality);
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
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getVbrQuality() != null)
            sb.append("VbrQuality: ").append(getVbrQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mp3Settings == false)
            return false;
        Mp3Settings other = (Mp3Settings) obj;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getVbrQuality() == null ^ this.getVbrQuality() == null)
            return false;
        if (other.getVbrQuality() != null && other.getVbrQuality().equals(this.getVbrQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public Mp3Settings clone() {
        try {
            return (Mp3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Mp3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
