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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Video Codec Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VideoCodecSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoCodecSettings implements Serializable, Cloneable, StructuredPojo {

    private FrameCaptureSettings frameCaptureSettings;

    private H264Settings h264Settings;

    private H265Settings h265Settings;

    private Mpeg2Settings mpeg2Settings;

    /**
     * @param frameCaptureSettings
     */

    public void setFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        this.frameCaptureSettings = frameCaptureSettings;
    }

    /**
     * @return
     */

    public FrameCaptureSettings getFrameCaptureSettings() {
        return this.frameCaptureSettings;
    }

    /**
     * @param frameCaptureSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withFrameCaptureSettings(FrameCaptureSettings frameCaptureSettings) {
        setFrameCaptureSettings(frameCaptureSettings);
        return this;
    }

    /**
     * @param h264Settings
     */

    public void setH264Settings(H264Settings h264Settings) {
        this.h264Settings = h264Settings;
    }

    /**
     * @return
     */

    public H264Settings getH264Settings() {
        return this.h264Settings;
    }

    /**
     * @param h264Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withH264Settings(H264Settings h264Settings) {
        setH264Settings(h264Settings);
        return this;
    }

    /**
     * @param h265Settings
     */

    public void setH265Settings(H265Settings h265Settings) {
        this.h265Settings = h265Settings;
    }

    /**
     * @return
     */

    public H265Settings getH265Settings() {
        return this.h265Settings;
    }

    /**
     * @param h265Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withH265Settings(H265Settings h265Settings) {
        setH265Settings(h265Settings);
        return this;
    }

    /**
     * @param mpeg2Settings
     */

    public void setMpeg2Settings(Mpeg2Settings mpeg2Settings) {
        this.mpeg2Settings = mpeg2Settings;
    }

    /**
     * @return
     */

    public Mpeg2Settings getMpeg2Settings() {
        return this.mpeg2Settings;
    }

    /**
     * @param mpeg2Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoCodecSettings withMpeg2Settings(Mpeg2Settings mpeg2Settings) {
        setMpeg2Settings(mpeg2Settings);
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
        if (getFrameCaptureSettings() != null)
            sb.append("FrameCaptureSettings: ").append(getFrameCaptureSettings()).append(",");
        if (getH264Settings() != null)
            sb.append("H264Settings: ").append(getH264Settings()).append(",");
        if (getH265Settings() != null)
            sb.append("H265Settings: ").append(getH265Settings()).append(",");
        if (getMpeg2Settings() != null)
            sb.append("Mpeg2Settings: ").append(getMpeg2Settings());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameCaptureSettings() == null) ? 0 : getFrameCaptureSettings().hashCode());
        hashCode = prime * hashCode + ((getH264Settings() == null) ? 0 : getH264Settings().hashCode());
        hashCode = prime * hashCode + ((getH265Settings() == null) ? 0 : getH265Settings().hashCode());
        hashCode = prime * hashCode + ((getMpeg2Settings() == null) ? 0 : getMpeg2Settings().hashCode());
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
        com.amazonaws.services.medialive.model.transform.VideoCodecSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
