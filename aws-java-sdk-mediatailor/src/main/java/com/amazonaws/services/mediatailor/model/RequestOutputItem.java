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
 * The ouput configuration for this channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/RequestOutputItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestOutputItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * DASH manifest configuration parameters.
     * </p>
     */
    private DashPlaylistSettings dashPlaylistSettings;
    /**
     * <p>
     * HLS playlist configuration parameters.
     * </p>
     */
    private HlsPlaylistSettings hlsPlaylistSettings;
    /**
     * <p>
     * The name of the manifest for the channel. The name appears in the PlaybackUrl.
     * </p>
     */
    private String manifestName;
    /**
     * <p>
     * A string used to match which HttpPackageConfiguration is used for each VodSource.
     * </p>
     */
    private String sourceGroup;

    /**
     * <p>
     * DASH manifest configuration parameters.
     * </p>
     * 
     * @param dashPlaylistSettings
     *        DASH manifest configuration parameters.
     */

    public void setDashPlaylistSettings(DashPlaylistSettings dashPlaylistSettings) {
        this.dashPlaylistSettings = dashPlaylistSettings;
    }

    /**
     * <p>
     * DASH manifest configuration parameters.
     * </p>
     * 
     * @return DASH manifest configuration parameters.
     */

    public DashPlaylistSettings getDashPlaylistSettings() {
        return this.dashPlaylistSettings;
    }

    /**
     * <p>
     * DASH manifest configuration parameters.
     * </p>
     * 
     * @param dashPlaylistSettings
     *        DASH manifest configuration parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestOutputItem withDashPlaylistSettings(DashPlaylistSettings dashPlaylistSettings) {
        setDashPlaylistSettings(dashPlaylistSettings);
        return this;
    }

    /**
     * <p>
     * HLS playlist configuration parameters.
     * </p>
     * 
     * @param hlsPlaylistSettings
     *        HLS playlist configuration parameters.
     */

    public void setHlsPlaylistSettings(HlsPlaylistSettings hlsPlaylistSettings) {
        this.hlsPlaylistSettings = hlsPlaylistSettings;
    }

    /**
     * <p>
     * HLS playlist configuration parameters.
     * </p>
     * 
     * @return HLS playlist configuration parameters.
     */

    public HlsPlaylistSettings getHlsPlaylistSettings() {
        return this.hlsPlaylistSettings;
    }

    /**
     * <p>
     * HLS playlist configuration parameters.
     * </p>
     * 
     * @param hlsPlaylistSettings
     *        HLS playlist configuration parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestOutputItem withHlsPlaylistSettings(HlsPlaylistSettings hlsPlaylistSettings) {
        setHlsPlaylistSettings(hlsPlaylistSettings);
        return this;
    }

    /**
     * <p>
     * The name of the manifest for the channel. The name appears in the PlaybackUrl.
     * </p>
     * 
     * @param manifestName
     *        The name of the manifest for the channel. The name appears in the PlaybackUrl.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * <p>
     * The name of the manifest for the channel. The name appears in the PlaybackUrl.
     * </p>
     * 
     * @return The name of the manifest for the channel. The name appears in the PlaybackUrl.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * <p>
     * The name of the manifest for the channel. The name appears in the PlaybackUrl.
     * </p>
     * 
     * @param manifestName
     *        The name of the manifest for the channel. The name appears in the PlaybackUrl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestOutputItem withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * <p>
     * A string used to match which HttpPackageConfiguration is used for each VodSource.
     * </p>
     * 
     * @param sourceGroup
     *        A string used to match which HttpPackageConfiguration is used for each VodSource.
     */

    public void setSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    /**
     * <p>
     * A string used to match which HttpPackageConfiguration is used for each VodSource.
     * </p>
     * 
     * @return A string used to match which HttpPackageConfiguration is used for each VodSource.
     */

    public String getSourceGroup() {
        return this.sourceGroup;
    }

    /**
     * <p>
     * A string used to match which HttpPackageConfiguration is used for each VodSource.
     * </p>
     * 
     * @param sourceGroup
     *        A string used to match which HttpPackageConfiguration is used for each VodSource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestOutputItem withSourceGroup(String sourceGroup) {
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

        if (obj instanceof RequestOutputItem == false)
            return false;
        RequestOutputItem other = (RequestOutputItem) obj;
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
        hashCode = prime * hashCode + ((getSourceGroup() == null) ? 0 : getSourceGroup().hashCode());
        return hashCode;
    }

    @Override
    public RequestOutputItem clone() {
        try {
            return (RequestOutputItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.RequestOutputItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
