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
 * Output Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/OutputGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputGroupSettings implements Serializable, Cloneable, StructuredPojo {

    private ArchiveGroupSettings archiveGroupSettings;

    private FrameCaptureGroupSettings frameCaptureGroupSettings;

    private HlsGroupSettings hlsGroupSettings;

    private MediaPackageGroupSettings mediaPackageGroupSettings;

    private MsSmoothGroupSettings msSmoothGroupSettings;

    private RtmpGroupSettings rtmpGroupSettings;

    private UdpGroupSettings udpGroupSettings;

    /**
     * @param archiveGroupSettings
     */

    public void setArchiveGroupSettings(ArchiveGroupSettings archiveGroupSettings) {
        this.archiveGroupSettings = archiveGroupSettings;
    }

    /**
     * @return
     */

    public ArchiveGroupSettings getArchiveGroupSettings() {
        return this.archiveGroupSettings;
    }

    /**
     * @param archiveGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withArchiveGroupSettings(ArchiveGroupSettings archiveGroupSettings) {
        setArchiveGroupSettings(archiveGroupSettings);
        return this;
    }

    /**
     * @param frameCaptureGroupSettings
     */

    public void setFrameCaptureGroupSettings(FrameCaptureGroupSettings frameCaptureGroupSettings) {
        this.frameCaptureGroupSettings = frameCaptureGroupSettings;
    }

    /**
     * @return
     */

    public FrameCaptureGroupSettings getFrameCaptureGroupSettings() {
        return this.frameCaptureGroupSettings;
    }

    /**
     * @param frameCaptureGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withFrameCaptureGroupSettings(FrameCaptureGroupSettings frameCaptureGroupSettings) {
        setFrameCaptureGroupSettings(frameCaptureGroupSettings);
        return this;
    }

    /**
     * @param hlsGroupSettings
     */

    public void setHlsGroupSettings(HlsGroupSettings hlsGroupSettings) {
        this.hlsGroupSettings = hlsGroupSettings;
    }

    /**
     * @return
     */

    public HlsGroupSettings getHlsGroupSettings() {
        return this.hlsGroupSettings;
    }

    /**
     * @param hlsGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withHlsGroupSettings(HlsGroupSettings hlsGroupSettings) {
        setHlsGroupSettings(hlsGroupSettings);
        return this;
    }

    /**
     * @param mediaPackageGroupSettings
     */

    public void setMediaPackageGroupSettings(MediaPackageGroupSettings mediaPackageGroupSettings) {
        this.mediaPackageGroupSettings = mediaPackageGroupSettings;
    }

    /**
     * @return
     */

    public MediaPackageGroupSettings getMediaPackageGroupSettings() {
        return this.mediaPackageGroupSettings;
    }

    /**
     * @param mediaPackageGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withMediaPackageGroupSettings(MediaPackageGroupSettings mediaPackageGroupSettings) {
        setMediaPackageGroupSettings(mediaPackageGroupSettings);
        return this;
    }

    /**
     * @param msSmoothGroupSettings
     */

    public void setMsSmoothGroupSettings(MsSmoothGroupSettings msSmoothGroupSettings) {
        this.msSmoothGroupSettings = msSmoothGroupSettings;
    }

    /**
     * @return
     */

    public MsSmoothGroupSettings getMsSmoothGroupSettings() {
        return this.msSmoothGroupSettings;
    }

    /**
     * @param msSmoothGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withMsSmoothGroupSettings(MsSmoothGroupSettings msSmoothGroupSettings) {
        setMsSmoothGroupSettings(msSmoothGroupSettings);
        return this;
    }

    /**
     * @param rtmpGroupSettings
     */

    public void setRtmpGroupSettings(RtmpGroupSettings rtmpGroupSettings) {
        this.rtmpGroupSettings = rtmpGroupSettings;
    }

    /**
     * @return
     */

    public RtmpGroupSettings getRtmpGroupSettings() {
        return this.rtmpGroupSettings;
    }

    /**
     * @param rtmpGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withRtmpGroupSettings(RtmpGroupSettings rtmpGroupSettings) {
        setRtmpGroupSettings(rtmpGroupSettings);
        return this;
    }

    /**
     * @param udpGroupSettings
     */

    public void setUdpGroupSettings(UdpGroupSettings udpGroupSettings) {
        this.udpGroupSettings = udpGroupSettings;
    }

    /**
     * @return
     */

    public UdpGroupSettings getUdpGroupSettings() {
        return this.udpGroupSettings;
    }

    /**
     * @param udpGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupSettings withUdpGroupSettings(UdpGroupSettings udpGroupSettings) {
        setUdpGroupSettings(udpGroupSettings);
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
        if (getArchiveGroupSettings() != null)
            sb.append("ArchiveGroupSettings: ").append(getArchiveGroupSettings()).append(",");
        if (getFrameCaptureGroupSettings() != null)
            sb.append("FrameCaptureGroupSettings: ").append(getFrameCaptureGroupSettings()).append(",");
        if (getHlsGroupSettings() != null)
            sb.append("HlsGroupSettings: ").append(getHlsGroupSettings()).append(",");
        if (getMediaPackageGroupSettings() != null)
            sb.append("MediaPackageGroupSettings: ").append(getMediaPackageGroupSettings()).append(",");
        if (getMsSmoothGroupSettings() != null)
            sb.append("MsSmoothGroupSettings: ").append(getMsSmoothGroupSettings()).append(",");
        if (getRtmpGroupSettings() != null)
            sb.append("RtmpGroupSettings: ").append(getRtmpGroupSettings()).append(",");
        if (getUdpGroupSettings() != null)
            sb.append("UdpGroupSettings: ").append(getUdpGroupSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroupSettings == false)
            return false;
        OutputGroupSettings other = (OutputGroupSettings) obj;
        if (other.getArchiveGroupSettings() == null ^ this.getArchiveGroupSettings() == null)
            return false;
        if (other.getArchiveGroupSettings() != null && other.getArchiveGroupSettings().equals(this.getArchiveGroupSettings()) == false)
            return false;
        if (other.getFrameCaptureGroupSettings() == null ^ this.getFrameCaptureGroupSettings() == null)
            return false;
        if (other.getFrameCaptureGroupSettings() != null && other.getFrameCaptureGroupSettings().equals(this.getFrameCaptureGroupSettings()) == false)
            return false;
        if (other.getHlsGroupSettings() == null ^ this.getHlsGroupSettings() == null)
            return false;
        if (other.getHlsGroupSettings() != null && other.getHlsGroupSettings().equals(this.getHlsGroupSettings()) == false)
            return false;
        if (other.getMediaPackageGroupSettings() == null ^ this.getMediaPackageGroupSettings() == null)
            return false;
        if (other.getMediaPackageGroupSettings() != null && other.getMediaPackageGroupSettings().equals(this.getMediaPackageGroupSettings()) == false)
            return false;
        if (other.getMsSmoothGroupSettings() == null ^ this.getMsSmoothGroupSettings() == null)
            return false;
        if (other.getMsSmoothGroupSettings() != null && other.getMsSmoothGroupSettings().equals(this.getMsSmoothGroupSettings()) == false)
            return false;
        if (other.getRtmpGroupSettings() == null ^ this.getRtmpGroupSettings() == null)
            return false;
        if (other.getRtmpGroupSettings() != null && other.getRtmpGroupSettings().equals(this.getRtmpGroupSettings()) == false)
            return false;
        if (other.getUdpGroupSettings() == null ^ this.getUdpGroupSettings() == null)
            return false;
        if (other.getUdpGroupSettings() != null && other.getUdpGroupSettings().equals(this.getUdpGroupSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveGroupSettings() == null) ? 0 : getArchiveGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getFrameCaptureGroupSettings() == null) ? 0 : getFrameCaptureGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsGroupSettings() == null) ? 0 : getHlsGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getMediaPackageGroupSettings() == null) ? 0 : getMediaPackageGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getMsSmoothGroupSettings() == null) ? 0 : getMsSmoothGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getRtmpGroupSettings() == null) ? 0 : getRtmpGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getUdpGroupSettings() == null) ? 0 : getUdpGroupSettings().hashCode());
        return hashCode;
    }

    @Override
    public OutputGroupSettings clone() {
        try {
            return (OutputGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
