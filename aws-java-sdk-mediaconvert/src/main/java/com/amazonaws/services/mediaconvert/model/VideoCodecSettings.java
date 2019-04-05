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
 * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video
 * encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each codec
 * enum you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs.
 * * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * FRAME_CAPTURE,
 * FrameCaptureSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoCodecSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoCodecSettings implements Serializable, Cloneable, StructuredPojo {

    /** Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec. */
    private String codec;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE. */
    private FrameCaptureSettings frameCaptureSettings;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264. */
    private H264Settings h264Settings;
    /** Settings for H265 codec */
    private H265Settings h265Settings;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2. */
    private Mpeg2Settings mpeg2Settings;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES. */
    private ProresSettings proresSettings;

    /**
     * Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * 
     * @param codec
     *        Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * @see VideoCodec
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * 
     * @return Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * @see VideoCodec
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * 
     * @param codec
     *        Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoCodec
     */

    public VideoCodecSettings withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * 
     * @param codec
     *        Specifies the video codec. This must be equal to one of the enum values defined by the object VideoCodec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoCodec
     */

    public VideoCodecSettings withCodec(VideoCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     * 
     * @param frameCaptureSettings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     */

    public void setFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        this.frameCaptureSettings = frameCaptureSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     */

    public FrameCaptureSettings getFrameCaptureSettings() {
        return this.frameCaptureSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     * 
     * @param frameCaptureSettings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        setFrameCaptureSettings(frameCaptureSettings);
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
     * 
     * @param h264Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
     */

    public void setH264Settings(H264Settings h264Settings) {
        this.h264Settings = h264Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
     */

    public H264Settings getH264Settings() {
        return this.h264Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
     * 
     * @param h264Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withH264Settings(H264Settings h264Settings) {
        setH264Settings(h264Settings);
        return this;
    }

    /**
     * Settings for H265 codec
     * 
     * @param h265Settings
     *        Settings for H265 codec
     */

    public void setH265Settings(H265Settings h265Settings) {
        this.h265Settings = h265Settings;
    }

    /**
     * Settings for H265 codec
     * 
     * @return Settings for H265 codec
     */

    public H265Settings getH265Settings() {
        return this.h265Settings;
    }

    /**
     * Settings for H265 codec
     * 
     * @param h265Settings
     *        Settings for H265 codec
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withH265Settings(H265Settings h265Settings) {
        setH265Settings(h265Settings);
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
     * 
     * @param mpeg2Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
     */

    public void setMpeg2Settings(Mpeg2Settings mpeg2Settings) {
        this.mpeg2Settings = mpeg2Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
     */

    public Mpeg2Settings getMpeg2Settings() {
        return this.mpeg2Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
     * 
     * @param mpeg2Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withMpeg2Settings(Mpeg2Settings mpeg2Settings) {
        setMpeg2Settings(mpeg2Settings);
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
     * 
     * @param proresSettings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
     */

    public void setProresSettings(ProresSettings proresSettings) {
        this.proresSettings = proresSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
     */

    public ProresSettings getProresSettings() {
        return this.proresSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
     * 
     * @param proresSettings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withProresSettings(ProresSettings proresSettings) {
        setProresSettings(proresSettings);
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
        if (getFrameCaptureSettings() != null)
            sb.append("FrameCaptureSettings: ").append(getFrameCaptureSettings()).append(",");
        if (getH264Settings() != null)
            sb.append("H264Settings: ").append(getH264Settings()).append(",");
        if (getH265Settings() != null)
            sb.append("H265Settings: ").append(getH265Settings()).append(",");
        if (getMpeg2Settings() != null)
            sb.append("Mpeg2Settings: ").append(getMpeg2Settings()).append(",");
        if (getProresSettings() != null)
            sb.append("ProresSettings: ").append(getProresSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoCodecSettings == false)
            return false;
        VideoCodecSettings other = (VideoCodecSettings) obj;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getFrameCaptureSettings() == null ^ this.getFrameCaptureSettings() == null)
            return false;
        if (other.getFrameCaptureSettings() != null && other.getFrameCaptureSettings().equals(this.getFrameCaptureSettings()) == false)
            return false;
        if (other.getH264Settings() == null ^ this.getH264Settings() == null)
            return false;
        if (other.getH264Settings() != null && other.getH264Settings().equals(this.getH264Settings()) == false)
            return false;
        if (other.getH265Settings() == null ^ this.getH265Settings() == null)
            return false;
        if (other.getH265Settings() != null && other.getH265Settings().equals(this.getH265Settings()) == false)
            return false;
        if (other.getMpeg2Settings() == null ^ this.getMpeg2Settings() == null)
            return false;
        if (other.getMpeg2Settings() != null && other.getMpeg2Settings().equals(this.getMpeg2Settings()) == false)
            return false;
        if (other.getProresSettings() == null ^ this.getProresSettings() == null)
            return false;
        if (other.getProresSettings() != null && other.getProresSettings().equals(this.getProresSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getFrameCaptureSettings() == null) ? 0 : getFrameCaptureSettings().hashCode());
        hashCode = prime * hashCode + ((getH264Settings() == null) ? 0 : getH264Settings().hashCode());
        hashCode = prime * hashCode + ((getH265Settings() == null) ? 0 : getH265Settings().hashCode());
        hashCode = prime * hashCode + ((getMpeg2Settings() == null) ? 0 : getMpeg2Settings().hashCode());
        hashCode = prime * hashCode + ((getProresSettings() == null) ? 0 : getProresSettings().hashCode());
        return hashCode;
    }

    @Override
    public VideoCodecSettings clone() {
        try {
            return (VideoCodecSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoCodecSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
