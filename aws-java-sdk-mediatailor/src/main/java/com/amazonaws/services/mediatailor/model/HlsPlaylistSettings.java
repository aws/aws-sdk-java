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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * HLS playlist configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/HlsPlaylistSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsPlaylistSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     * <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     * <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * </p>
     */
    private java.util.List<String> adMarkupType;
    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     * <code>3600</code> seconds.
     * </p>
     */
    private Integer manifestWindowSeconds;

    /**
     * <p>
     * Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     * <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     * <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * </p>
     * 
     * @return Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     *         <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     *         <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * @see AdMarkupType
     */

    public java.util.List<String> getAdMarkupType() {
        return adMarkupType;
    }

    /**
     * <p>
     * Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     * <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     * <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * </p>
     * 
     * @param adMarkupType
     *        Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     *        <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     *        <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * @see AdMarkupType
     */

    public void setAdMarkupType(java.util.Collection<String> adMarkupType) {
        if (adMarkupType == null) {
            this.adMarkupType = null;
            return;
        }

        this.adMarkupType = new java.util.ArrayList<String>(adMarkupType);
    }

    /**
     * <p>
     * Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     * <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     * <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdMarkupType(java.util.Collection)} or {@link #withAdMarkupType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param adMarkupType
     *        Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     *        <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     *        <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkupType
     */

    public HlsPlaylistSettings withAdMarkupType(String... adMarkupType) {
        if (this.adMarkupType == null) {
            setAdMarkupType(new java.util.ArrayList<String>(adMarkupType.length));
        }
        for (String ele : adMarkupType) {
            this.adMarkupType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     * <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     * <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * </p>
     * 
     * @param adMarkupType
     *        Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     *        <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     *        <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkupType
     */

    public HlsPlaylistSettings withAdMarkupType(java.util.Collection<String> adMarkupType) {
        setAdMarkupType(adMarkupType);
        return this;
    }

    /**
     * <p>
     * Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     * <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     * <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * </p>
     * 
     * @param adMarkupType
     *        Determines the type of SCTE 35 tags to use in ad markup. Specify <code>DATERANGE</code> to use
     *        <code>DATERANGE</code> tags (for live or VOD content). Specify <code>SCTE35_ENHANCED</code> to use
     *        <code>EXT-X-CUE-OUT</code> and <code>EXT-X-CUE-IN</code> tags (for VOD content only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkupType
     */

    public HlsPlaylistSettings withAdMarkupType(AdMarkupType... adMarkupType) {
        java.util.ArrayList<String> adMarkupTypeCopy = new java.util.ArrayList<String>(adMarkupType.length);
        for (AdMarkupType value : adMarkupType) {
            adMarkupTypeCopy.add(value.toString());
        }
        if (getAdMarkupType() == null) {
            setAdMarkupType(adMarkupTypeCopy);
        } else {
            getAdMarkupType().addAll(adMarkupTypeCopy);
        }
        return this;
    }

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     * <code>3600</code> seconds.
     * </p>
     * 
     * @param manifestWindowSeconds
     *        The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     *        <code>3600</code> seconds.
     */

    public void setManifestWindowSeconds(Integer manifestWindowSeconds) {
        this.manifestWindowSeconds = manifestWindowSeconds;
    }

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     * <code>3600</code> seconds.
     * </p>
     * 
     * @return The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     *         <code>3600</code> seconds.
     */

    public Integer getManifestWindowSeconds() {
        return this.manifestWindowSeconds;
    }

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     * <code>3600</code> seconds.
     * </p>
     * 
     * @param manifestWindowSeconds
     *        The total duration (in seconds) of each manifest. Minimum value: <code>30</code> seconds. Maximum value:
     *        <code>3600</code> seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsPlaylistSettings withManifestWindowSeconds(Integer manifestWindowSeconds) {
        setManifestWindowSeconds(manifestWindowSeconds);
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
        if (getAdMarkupType() != null)
            sb.append("AdMarkupType: ").append(getAdMarkupType()).append(",");
        if (getManifestWindowSeconds() != null)
            sb.append("ManifestWindowSeconds: ").append(getManifestWindowSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsPlaylistSettings == false)
            return false;
        HlsPlaylistSettings other = (HlsPlaylistSettings) obj;
        if (other.getAdMarkupType() == null ^ this.getAdMarkupType() == null)
            return false;
        if (other.getAdMarkupType() != null && other.getAdMarkupType().equals(this.getAdMarkupType()) == false)
            return false;
        if (other.getManifestWindowSeconds() == null ^ this.getManifestWindowSeconds() == null)
            return false;
        if (other.getManifestWindowSeconds() != null && other.getManifestWindowSeconds().equals(this.getManifestWindowSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkupType() == null) ? 0 : getAdMarkupType().hashCode());
        hashCode = prime * hashCode + ((getManifestWindowSeconds() == null) ? 0 : getManifestWindowSeconds().hashCode());
        return hashCode;
    }

    @Override
    public HlsPlaylistSettings clone() {
        try {
            return (HlsPlaylistSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.HlsPlaylistSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
