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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This response includes only the "property" : "type" property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ResponseOutputItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseOutputItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * DASH manifest configuration settings.
     * </p>
     */
    private DashPlaylistSettings dashPlaylistSettings;
    /**
     * <p>
     * HLS manifest configuration settings.
     * </p>
     */
    private HlsPlaylistSettings hlsPlaylistSettings;
    /**
     * <p>
     * The name of the manifest for the channel that will appear in the channel output's playback URL.
     * </p>
     */
    private String manifestName;
    /**
     * <p>
     * The URL used for playback by content players.
     * </p>
     */
    private String playbackUrl;
    /**
     * <p>
     * A string used to associate a package configuration source group with a channel output.
     * </p>
     */
    private String sourceGroup;

    /**
     * <p>
     * DASH manifest configuration settings.
     * </p>
     * 
     * @param dashPlaylistSettings
     *        DASH manifest configuration settings.
     */

    public void setDashPlaylistSettings(DashPlaylistSettings dashPlaylistSettings) {
        this.dashPlaylistSettings = dashPlaylistSettings;
    }

    /**
     * <p>
     * DASH manifest configuration settings.
     * </p>
     * 
     * @return DASH manifest configuration settings.
     */

    public DashPlaylistSettings getDashPlaylistSettings() {
        return this.dashPlaylistSettings;
    }

    /**
     * <p>
     * DASH manifest configuration settings.
     * </p>
     * 
     * @param dashPlaylistSettings
     *        DASH manifest configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseOutputItem withDashPlaylistSettings(DashPlaylistSettings dashPlaylistSettings) {
        setDashPlaylistSettings(dashPlaylistSettings);
        return this;
    }

    /**
     * <p>
     * HLS manifest configuration settings.
     * </p>
     * 
     * @param hlsPlaylistSettings
     *        HLS manifest configuration settings.
     */

    public void setHlsPlaylistSettings(HlsPlaylistSettings hlsPlaylistSettings) {
        this.hlsPlaylistSettings = hlsPlaylistSettings;
    }

    /**
     * <p>
     * HLS manifest configuration settings.
     * </p>
     * 
     * @return HLS manifest configuration settings.
     */

    public HlsPlaylistSettings getHlsPlaylistSettings() {
        return this.hlsPlaylistSettings;
    }

    /**
     * <p>
     * HLS manifest configuration settings.
     * </p>
     * 
     * @param hlsPlaylistSettings
     *        HLS manifest configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseOutputItem withHlsPlaylistSettings(HlsPlaylistSettings hlsPlaylistSettings) {
        setHlsPlaylistSettings(hlsPlaylistSettings);
        return this;
    }

    /**
     * <p>
     * The name of the manifest for the channel that will appear in the channel output's playback URL.
     * </p>
     * 
     * @param manifestName
     *        The name of the manifest for the channel that will appear in the channel output's playback URL.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * <p>
     * The name of the manifest for the channel that will appear in the channel output's playback URL.
     * </p>
     * 
     * @return The name of the manifest for the channel that will appear in the channel output's playback URL.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * <p>
     * The name of the manifest for the channel that will appear in the channel output's playback URL.
     * </p>
     * 
     * @param manifestName
     *        The name of the manifest for the channel that will appear in the channel output's playback URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseOutputItem withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * <p>
     * The URL used for playback by content players.
     * </p>
     * 
     * @param playbackUrl
     *        The URL used for playback by content players.
     */

    public void setPlaybackUrl(String playbackUrl) {
        this.playbackUrl = playbackUrl;
    }

    /**
     * <p>
     * The URL used for playback by content players.
     * </p>
     * 
     * @return The URL used for playback by content players.
     */

    public String getPlaybackUrl() {
        return this.playbackUrl;
    }

    /**
     * <p>
     * The URL used for playback by content players.
     * </p>
     * 
     * @param playbackUrl
     *        The URL used for playback by content players.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseOutputItem withPlaybackUrl(String playbackUrl) {
        setPlaybackUrl(playbackUrl);
        return this;
    }

    /**
     * <p>
     * A string used to associate a package configuration source group with a channel output.
     * </p>
     * 
     * @param sourceGroup
     *        A string used to associate a package configuration source group with a channel output.
     */

    public void setSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    /**
     * <p>
     * A string used to associate a package configuration source group with a channel output.
     * </p>
     * 
     * @return A string used to associate a package configuration source group with a channel output.
     */

    public String getSourceGroup() {
        return this.sourceGroup;
    }

    /**
     * <p>
     * A string used to associate a package configuration source group with a channel output.
     * </p>
     * 
     * @param sourceGroup
     *        A string used to associate a package configuration source group with a channel output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseOutputItem withSourceGroup(String sourceGroup) {
        setSourceGroup(sourceGroup);
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
        if (getDashPlaylistSettings() != null)
            sb.append("DashPlaylistSettings: ").append(getDashPlaylistSettings()).append(",");
        if (getHlsPlaylistSettings() != null)
            sb.append("HlsPlaylistSettings: ").append(getHlsPlaylistSettings()).append(",");
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getPlaybackUrl() != null)
            sb.append("PlaybackUrl: ").append(getPlaybackUrl()).append(",");
        if (getSourceGroup() != null)
            sb.append("SourceGroup: ").append(getSourceGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseOutputItem == false)
            return false;
        ResponseOutputItem other = (ResponseOutputItem) obj;
        if (other.getDashPlaylistSettings() == null ^ this.getDashPlaylistSettings() == null)
            return false;
        if (other.getDashPlaylistSettings() != null && other.getDashPlaylistSettings().equals(this.getDashPlaylistSettings()) == false)
            return false;
        if (other.getHlsPlaylistSettings() == null ^ this.getHlsPlaylistSettings() == null)
            return false;
        if (other.getHlsPlaylistSettings() != null && other.getHlsPlaylistSettings().equals(this.getHlsPlaylistSettings()) == false)
            return false;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getPlaybackUrl() == null ^ this.getPlaybackUrl() == null)
            return false;
        if (other.getPlaybackUrl() != null && other.getPlaybackUrl().equals(this.getPlaybackUrl()) == false)
            return false;
        if (other.getSourceGroup() == null ^ this.getSourceGroup() == null)
            return false;
        if (other.getSourceGroup() != null && other.getSourceGroup().equals(this.getSourceGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashPlaylistSettings() == null) ? 0 : getDashPlaylistSettings().hashCode());
        hashCode = prime * hashCode + ((getHlsPlaylistSettings() == null) ? 0 : getHlsPlaylistSettings().hashCode());
        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackUrl() == null) ? 0 : getPlaybackUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceGroup() == null) ? 0 : getSourceGroup().hashCode());
        return hashCode;
    }

    @Override
    public ResponseOutputItem clone() {
        try {
            return (ResponseOutputItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.ResponseOutputItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
