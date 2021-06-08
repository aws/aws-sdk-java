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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata information about an audio stream. An array of <code>AudioMetadata</code> objects for the audio streams
 * found in a stored video is returned by <a>GetSegmentDetection</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     */
    private String codec;
    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     */
    private Long sampleRate;
    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     */
    private Long numberOfChannels;

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     * 
     * @param codec
     *        The audio codec used to encode or decode the audio stream.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     * 
     * @return The audio codec used to encode or decode the audio stream.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     * 
     * @param codec
     *        The audio codec used to encode or decode the audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioMetadata withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the audio stream in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * 
     * @return The duration of the audio stream in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the audio stream in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioMetadata withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * 
     * @param sampleRate
     *        The sample rate for the audio stream.
     */

    public void setSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * 
     * @return The sample rate for the audio stream.
     */

    public Long getSampleRate() {
        return this.sampleRate;
    }

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * 
     * @param sampleRate
     *        The sample rate for the audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioMetadata withSampleRate(Long sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * 
     * @param numberOfChannels
     *        The number of audio channels in the segment.
     */

    public void setNumberOfChannels(Long numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * 
     * @return The number of audio channels in the segment.
     */

    public Long getNumberOfChannels() {
        return this.numberOfChannels;
    }

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * 
     * @param numberOfChannels
     *        The number of audio channels in the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioMetadata withNumberOfChannels(Long numberOfChannels) {
        setNumberOfChannels(numberOfChannels);
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
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getNumberOfChannels() != null)
            sb.append("NumberOfChannels: ").append(getNumberOfChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioMetadata == false)
            return false;
        AudioMetadata other = (AudioMetadata) obj;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getNumberOfChannels() == null ^ this.getNumberOfChannels() == null)
            return false;
        if (other.getNumberOfChannels() != null && other.getNumberOfChannels().equals(this.getNumberOfChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getNumberOfChannels() == null) ? 0 : getNumberOfChannels().hashCode());
        return hashCode;
    }

    @Override
    public AudioMetadata clone() {
        try {
            return (AudioMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.AudioMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
