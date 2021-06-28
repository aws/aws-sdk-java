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
 * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video
 * encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each
 * codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings
 * object pairs. * AV1, Av1Settings * AVC_INTRA, AvcIntraSettings * FRAME_CAPTURE, FrameCaptureSettings * H_264,
 * H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * VC3, Vc3Settings * VP8,
 * Vp8Settings * VP9, Vp9Settings * XAVC, XavcSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoCodecSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoCodecSettings implements Serializable, Cloneable, StructuredPojo {

    /** Required when you set Codec, under VideoDescription>CodecSettings to the value AV1. */
    private Av1Settings av1Settings;
    /**
     * Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     * settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     * https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     * https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     */
    private AvcIntraSettings avcIntraSettings;
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
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3 */
    private Vc3Settings vc3Settings;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8. */
    private Vp8Settings vp8Settings;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9. */
    private Vp9Settings vp9Settings;
    /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC. */
    private XavcSettings xavcSettings;

    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
     * 
     * @param av1Settings
     *        Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
     */

    public void setAv1Settings(Av1Settings av1Settings) {
        this.av1Settings = av1Settings;
    }

    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
     * 
     * @return Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
     */

    public Av1Settings getAv1Settings() {
        return this.av1Settings;
    }

    /**
     * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
     * 
     * @param av1Settings
     *        Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withAv1Settings(Av1Settings av1Settings) {
        setAv1Settings(av1Settings);
        return this;
    }

    /**
     * Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     * settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     * https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     * https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     * 
     * @param avcIntraSettings
     *        Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     *        settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     *        https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     *        https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     */

    public void setAvcIntraSettings(AvcIntraSettings avcIntraSettings) {
        this.avcIntraSettings = avcIntraSettings;
    }

    /**
     * Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     * settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     * https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     * https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     * 
     * @return Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     *         settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     *         https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     *         https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     */

    public AvcIntraSettings getAvcIntraSettings() {
        return this.avcIntraSettings;
    }

    /**
     * Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     * settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     * https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     * https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     * 
     * @param avcIntraSettings
     *        Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra
     *        settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see
     *        https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see
     *        https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withAvcIntraSettings(AvcIntraSettings avcIntraSettings) {
        setAvcIntraSettings(avcIntraSettings);
        return this;
    }

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
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
     * 
     * @param vc3Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
     */

    public void setVc3Settings(Vc3Settings vc3Settings) {
        this.vc3Settings = vc3Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
     */

    public Vc3Settings getVc3Settings() {
        return this.vc3Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
     * 
     * @param vc3Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withVc3Settings(Vc3Settings vc3Settings) {
        setVc3Settings(vc3Settings);
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
     * 
     * @param vp8Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
     */

    public void setVp8Settings(Vp8Settings vp8Settings) {
        this.vp8Settings = vp8Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
     */

    public Vp8Settings getVp8Settings() {
        return this.vp8Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
     * 
     * @param vp8Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withVp8Settings(Vp8Settings vp8Settings) {
        setVp8Settings(vp8Settings);
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
     * 
     * @param vp9Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
     */

    public void setVp9Settings(Vp9Settings vp9Settings) {
        this.vp9Settings = vp9Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
     */

    public Vp9Settings getVp9Settings() {
        return this.vp9Settings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
     * 
     * @param vp9Settings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withVp9Settings(Vp9Settings vp9Settings) {
        setVp9Settings(vp9Settings);
        return this;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
     * 
     * @param xavcSettings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
     */

    public void setXavcSettings(XavcSettings xavcSettings) {
        this.xavcSettings = xavcSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
     * 
     * @return Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
     */

    public XavcSettings getXavcSettings() {
        return this.xavcSettings;
    }

    /**
     * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
     * 
     * @param xavcSettings
     *        Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withXavcSettings(XavcSettings xavcSettings) {
        setXavcSettings(xavcSettings);
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
        if (getAv1Settings() != null)
            sb.append("Av1Settings: ").append(getAv1Settings()).append(",");
        if (getAvcIntraSettings() != null)
            sb.append("AvcIntraSettings: ").append(getAvcIntraSettings()).append(",");
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
            sb.append("ProresSettings: ").append(getProresSettings()).append(",");
        if (getVc3Settings() != null)
            sb.append("Vc3Settings: ").append(getVc3Settings()).append(",");
        if (getVp8Settings() != null)
            sb.append("Vp8Settings: ").append(getVp8Settings()).append(",");
        if (getVp9Settings() != null)
            sb.append("Vp9Settings: ").append(getVp9Settings()).append(",");
        if (getXavcSettings() != null)
            sb.append("XavcSettings: ").append(getXavcSettings());
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
        if (other.getAv1Settings() == null ^ this.getAv1Settings() == null)
            return false;
        if (other.getAv1Settings() != null && other.getAv1Settings().equals(this.getAv1Settings()) == false)
            return false;
        if (other.getAvcIntraSettings() == null ^ this.getAvcIntraSettings() == null)
            return false;
        if (other.getAvcIntraSettings() != null && other.getAvcIntraSettings().equals(this.getAvcIntraSettings()) == false)
            return false;
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
        if (other.getVc3Settings() == null ^ this.getVc3Settings() == null)
            return false;
        if (other.getVc3Settings() != null && other.getVc3Settings().equals(this.getVc3Settings()) == false)
            return false;
        if (other.getVp8Settings() == null ^ this.getVp8Settings() == null)
            return false;
        if (other.getVp8Settings() != null && other.getVp8Settings().equals(this.getVp8Settings()) == false)
            return false;
        if (other.getVp9Settings() == null ^ this.getVp9Settings() == null)
            return false;
        if (other.getVp9Settings() != null && other.getVp9Settings().equals(this.getVp9Settings()) == false)
            return false;
        if (other.getXavcSettings() == null ^ this.getXavcSettings() == null)
            return false;
        if (other.getXavcSettings() != null && other.getXavcSettings().equals(this.getXavcSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAv1Settings() == null) ? 0 : getAv1Settings().hashCode());
        hashCode = prime * hashCode + ((getAvcIntraSettings() == null) ? 0 : getAvcIntraSettings().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getFrameCaptureSettings() == null) ? 0 : getFrameCaptureSettings().hashCode());
        hashCode = prime * hashCode + ((getH264Settings() == null) ? 0 : getH264Settings().hashCode());
        hashCode = prime * hashCode + ((getH265Settings() == null) ? 0 : getH265Settings().hashCode());
        hashCode = prime * hashCode + ((getMpeg2Settings() == null) ? 0 : getMpeg2Settings().hashCode());
        hashCode = prime * hashCode + ((getProresSettings() == null) ? 0 : getProresSettings().hashCode());
        hashCode = prime * hashCode + ((getVc3Settings() == null) ? 0 : getVc3Settings().hashCode());
        hashCode = prime * hashCode + ((getVp8Settings() == null) ? 0 : getVp8Settings().hashCode());
        hashCode = prime * hashCode + ((getVp9Settings() == null) ? 0 : getVp9Settings().hashCode());
        hashCode = prime * hashCode + ((getXavcSettings() == null) ? 0 : getXavcSettings().hashCode());
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
