/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies DRM settings for DASH outputs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DashIsoEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashIsoEncryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only
     * to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with
     * playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI,
     * for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
     */
    private String playbackDeviceCompatibility;
    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only
     * to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with
     * playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI,
     * for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
     * 
     * @param playbackDeviceCompatibility
     *        This setting can improve the compatibility of your output with video players on obsolete devices. It
     *        applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *        correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If
     *        you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will
     *        leave the SEI NAL units unencrypted.
     * @see DashIsoPlaybackDeviceCompatibility
     */

    public void setPlaybackDeviceCompatibility(String playbackDeviceCompatibility) {
        this.playbackDeviceCompatibility = playbackDeviceCompatibility;
    }

    /**
     * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only
     * to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with
     * playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI,
     * for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
     * 
     * @return This setting can improve the compatibility of your output with video players on obsolete devices. It
     *         applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *         correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1).
     *         If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and
     *         will leave the SEI NAL units unencrypted.
     * @see DashIsoPlaybackDeviceCompatibility
     */

    public String getPlaybackDeviceCompatibility() {
        return this.playbackDeviceCompatibility;
    }

    /**
     * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only
     * to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with
     * playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI,
     * for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
     * 
     * @param playbackDeviceCompatibility
     *        This setting can improve the compatibility of your output with video players on obsolete devices. It
     *        applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *        correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If
     *        you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will
     *        leave the SEI NAL units unencrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashIsoPlaybackDeviceCompatibility
     */

    public DashIsoEncryptionSettings withPlaybackDeviceCompatibility(String playbackDeviceCompatibility) {
        setPlaybackDeviceCompatibility(playbackDeviceCompatibility);
        return this;
    }

    /**
     * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only
     * to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with
     * playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI,
     * for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
     * 
     * @param playbackDeviceCompatibility
     *        This setting can improve the compatibility of your output with video players on obsolete devices. It
     *        applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *        correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If
     *        you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will
     *        leave the SEI NAL units unencrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashIsoPlaybackDeviceCompatibility
     */

    public DashIsoEncryptionSettings withPlaybackDeviceCompatibility(DashIsoPlaybackDeviceCompatibility playbackDeviceCompatibility) {
        this.playbackDeviceCompatibility = playbackDeviceCompatibility.toString();
        return this;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * 
     * @param spekeKeyProvider
     *        If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption
     *        with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf
     *        settings instead.
     */

    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * 
     * @return If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption
     *         with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf
     *         settings instead.
     */

    public SpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a
     * SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * 
     * @param spekeKeyProvider
     *        If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption
     *        with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf
     *        settings instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashIsoEncryptionSettings withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        setSpekeKeyProvider(spekeKeyProvider);
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
        if (getPlaybackDeviceCompatibility() != null)
            sb.append("PlaybackDeviceCompatibility: ").append(getPlaybackDeviceCompatibility()).append(",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: ").append(getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashIsoEncryptionSettings == false)
            return false;
        DashIsoEncryptionSettings other = (DashIsoEncryptionSettings) obj;
        if (other.getPlaybackDeviceCompatibility() == null ^ this.getPlaybackDeviceCompatibility() == null)
            return false;
        if (other.getPlaybackDeviceCompatibility() != null && other.getPlaybackDeviceCompatibility().equals(this.getPlaybackDeviceCompatibility()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlaybackDeviceCompatibility() == null) ? 0 : getPlaybackDeviceCompatibility().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public DashIsoEncryptionSettings clone() {
        try {
            return (DashIsoEncryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DashIsoEncryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
