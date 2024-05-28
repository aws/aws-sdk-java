/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The runtime configuration settings for the Kinesis video stream source.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KinesisVideoStreamSourceRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamSourceRuntimeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The streams in the source runtime configuration of a Kinesis video stream.
     * </p>
     */
    private java.util.List<StreamConfiguration> streams;
    /**
     * <p>
     * Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     * formats, which does not include WAV)
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String mediaEncoding;
    /**
     * <p>
     * The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically around
     * 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample rate you specify
     * must match that of your audio.
     * </p>
     * <p>
     * Valid Range: Minimum value of 8000. Maximum value of 48000.
     * </p>
     */
    private Integer mediaSampleRate;

    /**
     * <p>
     * The streams in the source runtime configuration of a Kinesis video stream.
     * </p>
     * 
     * @return The streams in the source runtime configuration of a Kinesis video stream.
     */

    public java.util.List<StreamConfiguration> getStreams() {
        return streams;
    }

    /**
     * <p>
     * The streams in the source runtime configuration of a Kinesis video stream.
     * </p>
     * 
     * @param streams
     *        The streams in the source runtime configuration of a Kinesis video stream.
     */

    public void setStreams(java.util.Collection<StreamConfiguration> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<StreamConfiguration>(streams);
    }

    /**
     * <p>
     * The streams in the source runtime configuration of a Kinesis video stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreams(java.util.Collection)} or {@link #withStreams(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param streams
     *        The streams in the source runtime configuration of a Kinesis video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamSourceRuntimeConfiguration withStreams(StreamConfiguration... streams) {
        if (this.streams == null) {
            setStreams(new java.util.ArrayList<StreamConfiguration>(streams.length));
        }
        for (StreamConfiguration ele : streams) {
            this.streams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The streams in the source runtime configuration of a Kinesis video stream.
     * </p>
     * 
     * @param streams
     *        The streams in the source runtime configuration of a Kinesis video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamSourceRuntimeConfiguration withStreams(java.util.Collection<StreamConfiguration> streams) {
        setStreams(streams);
        return this;
    }

    /**
     * <p>
     * Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     * formats, which does not include WAV)
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param mediaEncoding
     *        Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     *        formats, which does not include WAV)</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a>
     *        in the <i>Amazon Transcribe Developer Guide</i>.
     * @see MediaEncoding
     */

    public void setMediaEncoding(String mediaEncoding) {
        this.mediaEncoding = mediaEncoding;
    }

    /**
     * <p>
     * Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     * formats, which does not include WAV)
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     *         formats, which does not include WAV)</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a>
     *         in the <i>Amazon Transcribe Developer Guide</i>.
     * @see MediaEncoding
     */

    public String getMediaEncoding() {
        return this.mediaEncoding;
    }

    /**
     * <p>
     * Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     * formats, which does not include WAV)
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param mediaEncoding
     *        Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     *        formats, which does not include WAV)</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a>
     *        in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaEncoding
     */

    public KinesisVideoStreamSourceRuntimeConfiguration withMediaEncoding(String mediaEncoding) {
        setMediaEncoding(mediaEncoding);
        return this;
    }

    /**
     * <p>
     * Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     * formats, which does not include WAV)
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a> in the
     * <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param mediaEncoding
     *        Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio
     *        formats, which does not include WAV)</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a>
     *        in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaEncoding
     */

    public KinesisVideoStreamSourceRuntimeConfiguration withMediaEncoding(MediaEncoding mediaEncoding) {
        this.mediaEncoding = mediaEncoding.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically around
     * 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample rate you specify
     * must match that of your audio.
     * </p>
     * <p>
     * Valid Range: Minimum value of 8000. Maximum value of 48000.
     * </p>
     * 
     * @param mediaSampleRate
     *        The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically
     *        around 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample
     *        rate you specify must match that of your audio.</p>
     *        <p>
     *        Valid Range: Minimum value of 8000. Maximum value of 48000.
     */

    public void setMediaSampleRate(Integer mediaSampleRate) {
        this.mediaSampleRate = mediaSampleRate;
    }

    /**
     * <p>
     * The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically around
     * 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample rate you specify
     * must match that of your audio.
     * </p>
     * <p>
     * Valid Range: Minimum value of 8000. Maximum value of 48000.
     * </p>
     * 
     * @return The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically
     *         around 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample
     *         rate you specify must match that of your audio.</p>
     *         <p>
     *         Valid Range: Minimum value of 8000. Maximum value of 48000.
     */

    public Integer getMediaSampleRate() {
        return this.mediaSampleRate;
    }

    /**
     * <p>
     * The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically around
     * 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample rate you specify
     * must match that of your audio.
     * </p>
     * <p>
     * Valid Range: Minimum value of 8000. Maximum value of 48000.
     * </p>
     * 
     * @param mediaSampleRate
     *        The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically
     *        around 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample
     *        rate you specify must match that of your audio.</p>
     *        <p>
     *        Valid Range: Minimum value of 8000. Maximum value of 48000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamSourceRuntimeConfiguration withMediaSampleRate(Integer mediaSampleRate) {
        setMediaSampleRate(mediaSampleRate);
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
        if (getStreams() != null)
            sb.append("Streams: ").append(getStreams()).append(",");
        if (getMediaEncoding() != null)
            sb.append("MediaEncoding: ").append(getMediaEncoding()).append(",");
        if (getMediaSampleRate() != null)
            sb.append("MediaSampleRate: ").append(getMediaSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamSourceRuntimeConfiguration == false)
            return false;
        KinesisVideoStreamSourceRuntimeConfiguration other = (KinesisVideoStreamSourceRuntimeConfiguration) obj;
        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
            return false;
        if (other.getMediaEncoding() == null ^ this.getMediaEncoding() == null)
            return false;
        if (other.getMediaEncoding() != null && other.getMediaEncoding().equals(this.getMediaEncoding()) == false)
            return false;
        if (other.getMediaSampleRate() == null ^ this.getMediaSampleRate() == null)
            return false;
        if (other.getMediaSampleRate() != null && other.getMediaSampleRate().equals(this.getMediaSampleRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        hashCode = prime * hashCode + ((getMediaEncoding() == null) ? 0 : getMediaEncoding().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRate() == null) ? 0 : getMediaSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamSourceRuntimeConfiguration clone() {
        try {
            return (KinesisVideoStreamSourceRuntimeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KinesisVideoStreamSourceRuntimeConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
