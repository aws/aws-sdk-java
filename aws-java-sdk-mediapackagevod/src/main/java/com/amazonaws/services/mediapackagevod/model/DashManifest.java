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
 * A DASH manifest configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DashManifest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashManifest implements Serializable, Cloneable, StructuredPojo {

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     */
    private String manifestLayout;
    /** An optional string to include in the name of the manifest. */
    private String manifestName;
    /** Minimum duration (in seconds) that a player will buffer media before starting the presentation. */
    private Integer minBufferTimeSeconds;
    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     */
    private String profile;

    private StreamSelection streamSelection;

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @param manifestLayout
     *        Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *        elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *        COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @see ManifestLayout
     */

    public void setManifestLayout(String manifestLayout) {
        this.manifestLayout = manifestLayout;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @return Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *         elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *         COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @see ManifestLayout
     */

    public String getManifestLayout() {
        return this.manifestLayout;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @param manifestLayout
     *        Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *        elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *        COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestLayout
     */

    public DashManifest withManifestLayout(String manifestLayout) {
        setManifestLayout(manifestLayout);
        return this;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL, elements like
     * SegmentTemplate and ContentProtection are included in each Representation. When set to COMPACT, duplicate
     * elements are combined and presented at the AdaptationSet level.
     * 
     * @param manifestLayout
     *        Determines the position of some tags in the Media Presentation Description (MPD). When set to FULL,
     *        elements like SegmentTemplate and ContentProtection are included in each Representation. When set to
     *        COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestLayout
     */

    public DashManifest withManifestLayout(ManifestLayout manifestLayout) {
        this.manifestLayout = manifestLayout.toString();
        return this;
    }

    /**
     * An optional string to include in the name of the manifest.
     * 
     * @param manifestName
     *        An optional string to include in the name of the manifest.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * An optional string to include in the name of the manifest.
     * 
     * @return An optional string to include in the name of the manifest.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * An optional string to include in the name of the manifest.
     * 
     * @param manifestName
     *        An optional string to include in the name of the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashManifest withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     * @param minBufferTimeSeconds
     *        Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */

    public void setMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        this.minBufferTimeSeconds = minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     * @return Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */

    public Integer getMinBufferTimeSeconds() {
        return this.minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     * @param minBufferTimeSeconds
     *        Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashManifest withMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        setMinBufferTimeSeconds(minBufferTimeSeconds);
        return this;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @param profile
     *        The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant
     *        output is enabled.
     * @see Profile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @return The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5
     *         compliant output is enabled.
     * @see Profile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @param profile
     *        The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant
     *        output is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Profile
     */

    public DashManifest withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant output
     * is enabled.
     * 
     * @param profile
     *        The Dynamic Adaptive Streaming over HTTP (DASH) profile type. When set to "HBBTV_1_5", HbbTV 1.5 compliant
     *        output is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Profile
     */

    public DashManifest withProfile(Profile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * @param streamSelection
     */

    public void setStreamSelection(StreamSelection streamSelection) {
        this.streamSelection = streamSelection;
    }

    /**
     * @return
     */

    public StreamSelection getStreamSelection() {
        return this.streamSelection;
    }

    /**
     * @param streamSelection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashManifest withStreamSelection(StreamSelection streamSelection) {
        setStreamSelection(streamSelection);
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
        if (getManifestLayout() != null)
            sb.append("ManifestLayout: ").append(getManifestLayout()).append(",");
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getMinBufferTimeSeconds() != null)
            sb.append("MinBufferTimeSeconds: ").append(getMinBufferTimeSeconds()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile()).append(",");
        if (getStreamSelection() != null)
            sb.append("StreamSelection: ").append(getStreamSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashManifest == false)
            return false;
        DashManifest other = (DashManifest) obj;
        if (other.getManifestLayout() == null ^ this.getManifestLayout() == null)
            return false;
        if (other.getManifestLayout() != null && other.getManifestLayout().equals(this.getManifestLayout()) == false)
            return false;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getMinBufferTimeSeconds() == null ^ this.getMinBufferTimeSeconds() == null)
            return false;
        if (other.getMinBufferTimeSeconds() != null && other.getMinBufferTimeSeconds().equals(this.getMinBufferTimeSeconds()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getStreamSelection() == null ^ this.getStreamSelection() == null)
            return false;
        if (other.getStreamSelection() != null && other.getStreamSelection().equals(this.getStreamSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestLayout() == null) ? 0 : getManifestLayout().hashCode());
        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTimeSeconds() == null) ? 0 : getMinBufferTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        return hashCode;
    }

    @Override
    public DashManifest clone() {
        try {
            return (DashManifest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.DashManifestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
