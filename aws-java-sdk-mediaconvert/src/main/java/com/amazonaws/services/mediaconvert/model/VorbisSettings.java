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
 * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VorbisSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VorbisSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1
     * output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value is 2.
     */
    private Integer channels;
    /**
     * Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The default value
     * is 48000.
     */
    private Integer sampleRate;
    /**
     * Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to 10
     * (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately 160 and
     * 192 kbit/s, respectively.
     */
    private Integer vbrQuality;

    /**
     * Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1
     * output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value is 2.
     * 
     * @param channels
     *        Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives
     *        you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value
     *        is 2.
     */

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1
     * output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value is 2.
     * 
     * @return Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives
     *         you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default
     *         value is 2.
     */

    public Integer getChannels() {
        return this.channels;
    }

    /**
     * Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1
     * output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value is 2.
     * 
     * @param channels
     *        Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives
     *        you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value
     *        is 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VorbisSettings withChannels(Integer channels) {
        setChannels(channels);
        return this;
    }

    /**
     * Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The default value
     * is 48000.
     * 
     * @param sampleRate
     *        Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The
     *        default value is 48000.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The default value
     * is 48000.
     * 
     * @return Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The
     *         default value is 48000.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The default value
     * is 48000.
     * 
     * @param sampleRate
     *        Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The
     *        default value is 48000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VorbisSettings withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to 10
     * (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately 160 and
     * 192 kbit/s, respectively.
     * 
     * @param vbrQuality
     *        Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to
     *        10 (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately
     *        160 and 192 kbit/s, respectively.
     */

    public void setVbrQuality(Integer vbrQuality) {
        this.vbrQuality = vbrQuality;
    }

    /**
     * Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to 10
     * (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately 160 and
     * 192 kbit/s, respectively.
     * 
     * @return Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s)
     *         to 10 (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are
     *         approximately 160 and 192 kbit/s, respectively.
     */

    public Integer getVbrQuality() {
        return this.vbrQuality;
    }

    /**
     * Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to 10
     * (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately 160 and
     * 192 kbit/s, respectively.
     * 
     * @param vbrQuality
     *        Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to
     *        10 (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately
     *        160 and 192 kbit/s, respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VorbisSettings withVbrQuality(Integer vbrQuality) {
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
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
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

        if (obj instanceof VorbisSettings == false)
            return false;
        VorbisSettings other = (VorbisSettings) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
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

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getVbrQuality() == null) ? 0 : getVbrQuality().hashCode());
        return hashCode;
    }

    @Override
    public VorbisSettings clone() {
        try {
            return (VorbisSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VorbisSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
