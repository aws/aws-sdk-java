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
 * Object specifying a stream’s video configuration, as set up by the broadcaster (usually in an encoder). This is part
 * of the <a>IngestConfiguration</a> object and used for monitoring stream health.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/VideoConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the degree of required decoder performance for a profile. Normally this is set automatically by the
     * encoder. For details, see the H.264 specification.
     * </p>
     */
    private String avcLevel;
    /**
     * <p>
     * Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values, see the
     * H.264 specification.
     * </p>
     */
    private String avcProfile;
    /**
     * <p>
     * Codec used for the video encoding.
     * </p>
     */
    private String codec;
    /**
     * <p>
     * Software or hardware used to encode the video.
     * </p>
     */
    private String encoder;
    /**
     * <p>
     * The expected ingest bitrate (bits per second). This is configured in the encoder.
     * </p>
     */
    private Long targetBitrate;
    /**
     * <p>
     * The expected ingest framerate. This is configured in the encoder.
     * </p>
     */
    private Long targetFramerate;
    /**
     * <p>
     * Video-resolution height in pixels.
     * </p>
     */
    private Long videoHeight;
    /**
     * <p>
     * Video-resolution width in pixels.
     * </p>
     */
    private Long videoWidth;

    /**
     * <p>
     * Indicates the degree of required decoder performance for a profile. Normally this is set automatically by the
     * encoder. For details, see the H.264 specification.
     * </p>
     * 
     * @param avcLevel
     *        Indicates the degree of required decoder performance for a profile. Normally this is set automatically by
     *        the encoder. For details, see the H.264 specification.
     */

    public void setAvcLevel(String avcLevel) {
        this.avcLevel = avcLevel;
    }

    /**
     * <p>
     * Indicates the degree of required decoder performance for a profile. Normally this is set automatically by the
     * encoder. For details, see the H.264 specification.
     * </p>
     * 
     * @return Indicates the degree of required decoder performance for a profile. Normally this is set automatically by
     *         the encoder. For details, see the H.264 specification.
     */

    public String getAvcLevel() {
        return this.avcLevel;
    }

    /**
     * <p>
     * Indicates the degree of required decoder performance for a profile. Normally this is set automatically by the
     * encoder. For details, see the H.264 specification.
     * </p>
     * 
     * @param avcLevel
     *        Indicates the degree of required decoder performance for a profile. Normally this is set automatically by
     *        the encoder. For details, see the H.264 specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withAvcLevel(String avcLevel) {
        setAvcLevel(avcLevel);
        return this;
    }

    /**
     * <p>
     * Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values, see the
     * H.264 specification.
     * </p>
     * 
     * @param avcProfile
     *        Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values,
     *        see the H.264 specification.
     */

    public void setAvcProfile(String avcProfile) {
        this.avcProfile = avcProfile;
    }

    /**
     * <p>
     * Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values, see the
     * H.264 specification.
     * </p>
     * 
     * @return Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values,
     *         see the H.264 specification.
     */

    public String getAvcProfile() {
        return this.avcProfile;
    }

    /**
     * <p>
     * Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values, see the
     * H.264 specification.
     * </p>
     * 
     * @param avcProfile
     *        Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values,
     *        see the H.264 specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withAvcProfile(String avcProfile) {
        setAvcProfile(avcProfile);
        return this;
    }

    /**
     * <p>
     * Codec used for the video encoding.
     * </p>
     * 
     * @param codec
     *        Codec used for the video encoding.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * Codec used for the video encoding.
     * </p>
     * 
     * @return Codec used for the video encoding.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * <p>
     * Codec used for the video encoding.
     * </p>
     * 
     * @param codec
     *        Codec used for the video encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * <p>
     * Software or hardware used to encode the video.
     * </p>
     * 
     * @param encoder
     *        Software or hardware used to encode the video.
     */

    public void setEncoder(String encoder) {
        this.encoder = encoder;
    }

    /**
     * <p>
     * Software or hardware used to encode the video.
     * </p>
     * 
     * @return Software or hardware used to encode the video.
     */

    public String getEncoder() {
        return this.encoder;
    }

    /**
     * <p>
     * Software or hardware used to encode the video.
     * </p>
     * 
     * @param encoder
     *        Software or hardware used to encode the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withEncoder(String encoder) {
        setEncoder(encoder);
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

    public VideoConfiguration withTargetBitrate(Long targetBitrate) {
        setTargetBitrate(targetBitrate);
        return this;
    }

    /**
     * <p>
     * The expected ingest framerate. This is configured in the encoder.
     * </p>
     * 
     * @param targetFramerate
     *        The expected ingest framerate. This is configured in the encoder.
     */

    public void setTargetFramerate(Long targetFramerate) {
        this.targetFramerate = targetFramerate;
    }

    /**
     * <p>
     * The expected ingest framerate. This is configured in the encoder.
     * </p>
     * 
     * @return The expected ingest framerate. This is configured in the encoder.
     */

    public Long getTargetFramerate() {
        return this.targetFramerate;
    }

    /**
     * <p>
     * The expected ingest framerate. This is configured in the encoder.
     * </p>
     * 
     * @param targetFramerate
     *        The expected ingest framerate. This is configured in the encoder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withTargetFramerate(Long targetFramerate) {
        setTargetFramerate(targetFramerate);
        return this;
    }

    /**
     * <p>
     * Video-resolution height in pixels.
     * </p>
     * 
     * @param videoHeight
     *        Video-resolution height in pixels.
     */

    public void setVideoHeight(Long videoHeight) {
        this.videoHeight = videoHeight;
    }

    /**
     * <p>
     * Video-resolution height in pixels.
     * </p>
     * 
     * @return Video-resolution height in pixels.
     */

    public Long getVideoHeight() {
        return this.videoHeight;
    }

    /**
     * <p>
     * Video-resolution height in pixels.
     * </p>
     * 
     * @param videoHeight
     *        Video-resolution height in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withVideoHeight(Long videoHeight) {
        setVideoHeight(videoHeight);
        return this;
    }

    /**
     * <p>
     * Video-resolution width in pixels.
     * </p>
     * 
     * @param videoWidth
     *        Video-resolution width in pixels.
     */

    public void setVideoWidth(Long videoWidth) {
        this.videoWidth = videoWidth;
    }

    /**
     * <p>
     * Video-resolution width in pixels.
     * </p>
     * 
     * @return Video-resolution width in pixels.
     */

    public Long getVideoWidth() {
        return this.videoWidth;
    }

    /**
     * <p>
     * Video-resolution width in pixels.
     * </p>
     * 
     * @param videoWidth
     *        Video-resolution width in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoConfiguration withVideoWidth(Long videoWidth) {
        setVideoWidth(videoWidth);
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
        if (getAvcLevel() != null)
            sb.append("AvcLevel: ").append(getAvcLevel()).append(",");
        if (getAvcProfile() != null)
            sb.append("AvcProfile: ").append(getAvcProfile()).append(",");
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getEncoder() != null)
            sb.append("Encoder: ").append(getEncoder()).append(",");
        if (getTargetBitrate() != null)
            sb.append("TargetBitrate: ").append(getTargetBitrate()).append(",");
        if (getTargetFramerate() != null)
            sb.append("TargetFramerate: ").append(getTargetFramerate()).append(",");
        if (getVideoHeight() != null)
            sb.append("VideoHeight: ").append(getVideoHeight()).append(",");
        if (getVideoWidth() != null)
            sb.append("VideoWidth: ").append(getVideoWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoConfiguration == false)
            return false;
        VideoConfiguration other = (VideoConfiguration) obj;
        if (other.getAvcLevel() == null ^ this.getAvcLevel() == null)
            return false;
        if (other.getAvcLevel() != null && other.getAvcLevel().equals(this.getAvcLevel()) == false)
            return false;
        if (other.getAvcProfile() == null ^ this.getAvcProfile() == null)
            return false;
        if (other.getAvcProfile() != null && other.getAvcProfile().equals(this.getAvcProfile()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getEncoder() == null ^ this.getEncoder() == null)
            return false;
        if (other.getEncoder() != null && other.getEncoder().equals(this.getEncoder()) == false)
            return false;
        if (other.getTargetBitrate() == null ^ this.getTargetBitrate() == null)
            return false;
        if (other.getTargetBitrate() != null && other.getTargetBitrate().equals(this.getTargetBitrate()) == false)
            return false;
        if (other.getTargetFramerate() == null ^ this.getTargetFramerate() == null)
            return false;
        if (other.getTargetFramerate() != null && other.getTargetFramerate().equals(this.getTargetFramerate()) == false)
            return false;
        if (other.getVideoHeight() == null ^ this.getVideoHeight() == null)
            return false;
        if (other.getVideoHeight() != null && other.getVideoHeight().equals(this.getVideoHeight()) == false)
            return false;
        if (other.getVideoWidth() == null ^ this.getVideoWidth() == null)
            return false;
        if (other.getVideoWidth() != null && other.getVideoWidth().equals(this.getVideoWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvcLevel() == null) ? 0 : getAvcLevel().hashCode());
        hashCode = prime * hashCode + ((getAvcProfile() == null) ? 0 : getAvcProfile().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getEncoder() == null) ? 0 : getEncoder().hashCode());
        hashCode = prime * hashCode + ((getTargetBitrate() == null) ? 0 : getTargetBitrate().hashCode());
        hashCode = prime * hashCode + ((getTargetFramerate() == null) ? 0 : getTargetFramerate().hashCode());
        hashCode = prime * hashCode + ((getVideoHeight() == null) ? 0 : getVideoHeight().hashCode());
        hashCode = prime * hashCode + ((getVideoWidth() == null) ? 0 : getVideoWidth().hashCode());
        return hashCode;
    }

    @Override
    public VideoConfiguration clone() {
        try {
            return (VideoConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.VideoConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
