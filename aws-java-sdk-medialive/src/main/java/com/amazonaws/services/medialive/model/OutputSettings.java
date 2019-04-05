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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Output Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/OutputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSettings implements Serializable, Cloneable, StructuredPojo {

    private ArchiveOutputSettings archiveOutputSettings;

    private FrameCaptureOutputSettings frameCaptureOutputSettings;

    private HlsOutputSettings hlsOutputSettings;

    private MediaPackageOutputSettings mediaPackageOutputSettings;

    private MsSmoothOutputSettings msSmoothOutputSettings;

    private RtmpOutputSettings rtmpOutputSettings;

    private UdpOutputSettings udpOutputSettings;

    /**
     * @param archiveOutputSettings
     */

    public void setArchiveOutputSettings(ArchiveOutputSettings archiveOutputSettings) {
        this.archiveOutputSettings = archiveOutputSettings;
    }

    /**
     * @return
     */

    public ArchiveOutputSettings getArchiveOutputSettings() {
        return this.archiveOutputSettings;
    }

    /**
     * @param archiveOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withArchiveOutputSettings(ArchiveOutputSettings archiveOutputSettings) {
        setArchiveOutputSettings(archiveOutputSettings);
        return this;
    }

    /**
     * @param frameCaptureOutputSettings
     */

    public void setFrameCaptureOutputSettings(FrameCaptureOutputSettings frameCaptureOutputSettings) {
        this.frameCaptureOutputSettings = frameCaptureOutputSettings;
    }

    /**
     * @return
     */

    public FrameCaptureOutputSettings getFrameCaptureOutputSettings() {
        return this.frameCaptureOutputSettings;
    }

    /**
     * @param frameCaptureOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withFrameCaptureOutputSettings(FrameCaptureOutputSettings frameCaptureOutputSettings) {
        setFrameCaptureOutputSettings(frameCaptureOutputSettings);
        return this;
    }

    /**
     * @param hlsOutputSettings
     */

    public void setHlsOutputSettings(HlsOutputSettings hlsOutputSettings) {
        this.hlsOutputSettings = hlsOutputSettings;
    }

    /**
     * @return
     */

    public HlsOutputSettings getHlsOutputSettings() {
        return this.hlsOutputSettings;
    }

    /**
     * @param hlsOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withHlsOutputSettings(HlsOutputSettings hlsOutputSettings) {
        setHlsOutputSettings(hlsOutputSettings);
        return this;
    }

    /**
     * @param mediaPackageOutputSettings
     */

    public void setMediaPackageOutputSettings(MediaPackageOutputSettings mediaPackageOutputSettings) {
        this.mediaPackageOutputSettings = mediaPackageOutputSettings;
    }

    /**
     * @return
     */

    public MediaPackageOutputSettings getMediaPackageOutputSettings() {
        return this.mediaPackageOutputSettings;
    }

    /**
     * @param mediaPackageOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withMediaPackageOutputSettings(MediaPackageOutputSettings mediaPackageOutputSettings) {
        setMediaPackageOutputSettings(mediaPackageOutputSettings);
        return this;
    }

    /**
     * @param msSmoothOutputSettings
     */

    public void setMsSmoothOutputSettings(MsSmoothOutputSettings msSmoothOutputSettings) {
        this.msSmoothOutputSettings = msSmoothOutputSettings;
    }

    /**
     * @return
     */

    public MsSmoothOutputSettings getMsSmoothOutputSettings() {
        return this.msSmoothOutputSettings;
    }

    /**
     * @param msSmoothOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withMsSmoothOutputSettings(MsSmoothOutputSettings msSmoothOutputSettings) {
        setMsSmoothOutputSettings(msSmoothOutputSettings);
        return this;
    }

    /**
     * @param rtmpOutputSettings
     */

    public void setRtmpOutputSettings(RtmpOutputSettings rtmpOutputSettings) {
        this.rtmpOutputSettings = rtmpOutputSettings;
    }

    /**
     * @return
     */

    public RtmpOutputSettings getRtmpOutputSettings() {
        return this.rtmpOutputSettings;
    }

    /**
     * @param rtmpOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withRtmpOutputSettings(RtmpOutputSettings rtmpOutputSettings) {
        setRtmpOutputSettings(rtmpOutputSettings);
        return this;
    }

    /**
     * @param udpOutputSettings
     */

    public void setUdpOutputSettings(UdpOutputSettings udpOutputSettings) {
        this.udpOutputSettings = udpOutputSettings;
    }

    /**
     * @return
     */

    public UdpOutputSettings getUdpOutputSettings() {
        return this.udpOutputSettings;
    }

    /**
     * @param udpOutputSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withUdpOutputSettings(UdpOutputSettings udpOutputSettings) {
        setUdpOutputSettings(udpOutputSettings);
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
        if (getArchiveOutputSettings() != null)
            sb.append("ArchiveOutputSettings: ").append(getArchiveOutputSettings()).append(",");
        if (getFrameCaptureOutputSettings() != null)
            sb.append("FrameCaptureOutputSettings: ").append(getFrameCaptureOutputSettings()).append(",");
        if (getHlsOutputSettings() != null)
            sb.append("HlsOutputSettings: ").append(getHlsOutputSettings()).append(",");
        if (getMediaPackageOutputSettings() != null)
            sb.append("MediaPackageOutputSettings: ").append(getMediaPackageOutputSettings()).append(",");
        if (getMsSmoothOutputSettings() != null)
            sb.append("MsSmoothOutputSettings: ").append(getMsSmoothOutputSettings()).append(",");
        if (getRtmpOutputSettings() != null)
            sb.append("RtmpOutputSettings: ").append(getRtmpOutputSettings()).append(",");
        if (getUdpOutputSettings() != null)
            sb.append("UdpOutputSettings: ").append(getUdpOutputSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSettings == false)
            return false;
        OutputSettings other = (OutputSettings) obj;
        if (other.getArchiveOutputSettings() == null ^ this.getArchiveOutputSettings() == null)
            return false;
        if (other.getArchiveOutputSettings() != null && other.getArchiveOutputSettings().equals(this.getArchiveOutputSettings()) == false)
            return false;
        if (other.getFrameCaptureOutputSettings() == null ^ this.getFrameCaptureOutputSettings() == null)
            return false;
        if (other.getFrameCaptureOutputSettings() != null && other.getFrameCaptureOutputSettings().equals(this.getFrameCaptureOutputSettings()) == false)
            return false;
        if (other.getHlsOutputSettings() == null ^ this.getHlsOutputSettings() == null)
            return false;
        if (other.getHlsOutputSettings() != null && other.getHlsOutputSettings().equals(this.getHlsOutputSettings()) == false)
            return false;
        if (other.getMediaPackageOutputSettings() == null ^ this.getMediaPackageOutputSettings() == null)
            return false;
        if (other.getMediaPackageOutputSettings() != null && other.getMediaPackageOutputSettings().equals(this.getMediaPackageOutputSettings()) == false)
            return false;
        if (other.getMsSmoothOutputSettings() == null ^ this.getMsSmoothOutputSettings() == null)
            return false;
        if (other.getMsSmoothOutputSettings() != null && other.getMsSmoothOutputSettings().equals(this.getMsSmoothOutputSettings()) == false)
            return false;
        if (other.getRtmpOutputSettings() == null ^ this.getRtmpOutputSettings() == null)
            return false;
        if (other.getRtmpOutputSettings() != null && other.getRtmpOutputSettings().equals(this.getRtmpOutputSettings()) == false)
            return false;
        if (other.getUdpOutputSettings() == null ^ this.getUdpOutputSettings() == null)
            return false;
        if (other.getUdpOutputSettings() != null && other.getUdpOutputSettings().equals(this.getUdpOutputSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveOutputSettings() == null) ? 0 : getArchiveOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getFrameCaptureOutputSettings() == null) ? 0 : getFrameCaptureOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsOutputSettings() == null) ? 0 : getHlsOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getMediaPackageOutputSettings() == null) ? 0 : getMediaPackageOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getMsSmoothOutputSettings() == null) ? 0 : getMsSmoothOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getRtmpOutputSettings() == null) ? 0 : getRtmpOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getUdpOutputSettings() == null) ? 0 : getUdpOutputSettings().hashCode());
        return hashCode;
    }

    @Override
    public OutputSettings clone() {
        try {
            return (OutputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
