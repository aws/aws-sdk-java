/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a stream’s audio configuration, as set up by the broadcaster (usually in an encoder). This is part
 * of the <a>IngestConfiguration</a> object and used for monitoring stream health.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/AudioConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of audio channels.
     * </p>
     */
    private Long channels;
    /**
     * <p>
     * Codec used for the audio encoding.
     * </p>
     */
    private String codec;
    /**
     * <p>
     * Number of audio samples recorded per second.
     * </p>
     */
    private Long sampleRate;
    /**
     * <p>
     * The expected ingest bitrate (bits per second). This is configured in the encoder.
     * </p>
     */
    private Long targetBitrate;

    /**
     * <p>
     * Number of audio channels.
     * </p>
     * 
     * @param channels
     *        Number of audio channels.
     */

    public void setChannels(Long channels) {
        this.channels = channels;
    }

    /**
     * <p>
     * Number of audio channels.
     * </p>
     * 
     * @return Number of audio channels.
     */

    public Long getChannels() {
        return this.channels;
    }

    /**
     * <p>
     * Number of audio channels.
     * </p>
     * 
     * @param channels
     *        Number of audio channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioConfiguration withChannels(Long channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * Codec used for the audio encoding.
     * </p>
     * 
     * @param codec
     *        Codec used for the audio encoding.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * Codec used for the audio encoding.
     * </p>
     * 
     * @return Codec used for the audio encoding.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * <p>
     * Codec used for the audio encoding.
     * </p>
     * 
     * @param codec
     *        Codec used for the audio encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioConfiguration withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * <p>
     * Number of audio samples recorded per second.
     * </p>
     * 
     * @param sampleRate
     *        Number of audio samples recorded per second.
     */

    public void setSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * Number of audio samples recorded per second.
     * </p>
     * 
     * @return Number of audio samples recorded per second.
     */

    public Long getSampleRate() {
        return this.sampleRate;
    }

    /**
     * <p>
     * Number of audio samples recorded per second.
     * </p>
     * 
     * @param sampleRate
     *        Number of audio samples recorded per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioConfiguration withSampleRate(Long sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * <p>
     * The expected ingest bitrate (bits per second). This is configured in the encoder.
     * </p>
     * 
     * @param targetBitrate
     *        The expected ingest bitrate (bits per second). This is configured in the encoder.
     */

    public void setTargetBitrate(Long targetBitrate) {
        this.targetBitrate = targetBitrate;
    }

    /**
     * <p>
     * The expected ingest bitrate (bits per second). This is configured in the encoder.
     * </p>
     * 
     * @return The expected ingest bitrate (bits per second). This is configured in the encoder.
     */

    public Long getTargetBitrate() {
        return this.targetBitrate;
    }

    /**
     * <p>
     * The expected ingest bitrate (bits per second). This is configured in the encoder.
     * </p>
     * 
     * @param targetBitrate
     *        The expected ingest bitrate (bits per second). This is configured in the encoder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioConfiguration withTargetBitrate(Long targetBitrate) {
        setTargetBitrate(targetBitrate);
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
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getTargetBitrate() != null)
            sb.append("TargetBitrate: ").append(getTargetBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioConfiguration == false)
            return false;
        AudioConfiguration other = (AudioConfiguration) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getTargetBitrate() == null ^ this.getTargetBitrate() == null)
            return false;
        if (other.getTargetBitrate() != null && other.getTargetBitrate().equals(this.getTargetBitrate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getTargetBitrate() == null) ? 0 : getTargetBitrate().hashCode());
        return hashCode;
    }

    @Override
    public AudioConfiguration clone() {
        try {
            return (AudioConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.AudioConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
