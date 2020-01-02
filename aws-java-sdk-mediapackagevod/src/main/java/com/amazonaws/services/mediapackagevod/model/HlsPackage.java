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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/HlsPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsPackage implements Serializable, Cloneable, StructuredPojo {

    private HlsEncryption encryption;
    /** A list of HLS manifest configurations. */
    private java.util.List<HlsManifest> hlsManifests;
    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     */
    private Integer segmentDurationSeconds;
    /** When enabled, audio streams will be placed in rendition groups in the output. */
    private Boolean useAudioRenditionGroup;

    /**
     * @param encryption
     */

    public void setEncryption(HlsEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public HlsEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withEncryption(HlsEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     * @return A list of HLS manifest configurations.
     */

    public java.util.List<HlsManifest> getHlsManifests() {
        return hlsManifests;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations.
     */

    public void setHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<HlsManifest>(hlsManifests);
    }

    /**
     * A list of HLS manifest configurations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHlsManifests(java.util.Collection)} or {@link #withHlsManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withHlsManifests(HlsManifest... hlsManifests) {
        if (this.hlsManifests == null) {
            setHlsManifests(new java.util.ArrayList<HlsManifest>(hlsManifests.length));
        }
        for (HlsManifest ele : hlsManifests) {
            this.hlsManifests.add(ele);
        }
        return this;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withHlsManifests(java.util.Collection<HlsManifest> hlsManifests) {
        setHlsManifests(hlsManifests);
        return this;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *        source fragment duration.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @return Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *         source fragment duration.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source
     * fragment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the
     *        source fragment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
        return this;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @param useAudioRenditionGroup
     *        When enabled, audio streams will be placed in rendition groups in the output.
     */

    public void setUseAudioRenditionGroup(Boolean useAudioRenditionGroup) {
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @return When enabled, audio streams will be placed in rendition groups in the output.
     */

    public Boolean getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @param useAudioRenditionGroup
     *        When enabled, audio streams will be placed in rendition groups in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPackage withUseAudioRenditionGroup(Boolean useAudioRenditionGroup) {
        setUseAudioRenditionGroup(useAudioRenditionGroup);
        return this;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     * @return When enabled, audio streams will be placed in rendition groups in the output.
     */

    public Boolean isUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup;
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
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getHlsManifests() != null)
            sb.append("HlsManifests: ").append(getHlsManifests()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds()).append(",");
        if (getUseAudioRenditionGroup() != null)
            sb.append("UseAudioRenditionGroup: ").append(getUseAudioRenditionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsPackage == false)
            return false;
        HlsPackage other = (HlsPackage) obj;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getHlsManifests() == null ^ this.getHlsManifests() == null)
            return false;
        if (other.getHlsManifests() != null && other.getHlsManifests().equals(this.getHlsManifests()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        if (other.getUseAudioRenditionGroup() == null ^ this.getUseAudioRenditionGroup() == null)
            return false;
        if (other.getUseAudioRenditionGroup() != null && other.getUseAudioRenditionGroup().equals(this.getUseAudioRenditionGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getUseAudioRenditionGroup() == null) ? 0 : getUseAudioRenditionGroup().hashCode());
        return hashCode;
    }

    @Override
    public HlsPackage clone() {
        try {
            return (HlsPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.HlsPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
