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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Common Media Application Format (CMAF) packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CmafPackageCreateOrUpdateParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafPackageCreateOrUpdateParameters implements Serializable, Cloneable, StructuredPojo {

    private CmafEncryption encryption;
    /** A list of HLS manifest configurations */
    private java.util.List<HlsManifestCreateOrUpdateParameters> hlsManifests;
    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     */
    private Integer segmentDurationSeconds;
    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the
     * ChannelId.
     */
    private String segmentPrefix;

    private StreamSelection streamSelection;

    /**
     * @param encryption
     */

    public void setEncryption(CmafEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public CmafEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackageCreateOrUpdateParameters withEncryption(CmafEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * A list of HLS manifest configurations
     * 
     * @return A list of HLS manifest configurations
     */

    public java.util.List<HlsManifestCreateOrUpdateParameters> getHlsManifests() {
        return hlsManifests;
    }

    /**
     * A list of HLS manifest configurations
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations
     */

    public void setHlsManifests(java.util.Collection<HlsManifestCreateOrUpdateParameters> hlsManifests) {
        if (hlsManifests == null) {
            this.hlsManifests = null;
            return;
        }

        this.hlsManifests = new java.util.ArrayList<HlsManifestCreateOrUpdateParameters>(hlsManifests);
    }

    /**
     * A list of HLS manifest configurations
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHlsManifests(java.util.Collection)} or {@link #withHlsManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackageCreateOrUpdateParameters withHlsManifests(HlsManifestCreateOrUpdateParameters... hlsManifests) {
        if (this.hlsManifests == null) {
            setHlsManifests(new java.util.ArrayList<HlsManifestCreateOrUpdateParameters>(hlsManifests.length));
        }
        for (HlsManifestCreateOrUpdateParameters ele : hlsManifests) {
            this.hlsManifests.add(ele);
        }
        return this;
    }

    /**
     * A list of HLS manifest configurations
     * 
     * @param hlsManifests
     *        A list of HLS manifest configurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackageCreateOrUpdateParameters withHlsManifests(java.util.Collection<HlsManifestCreateOrUpdateParameters> hlsManifests) {
        setHlsManifests(hlsManifests);
        return this;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the
     *        source segment duration.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     * 
     * @return Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the
     *         source segment duration.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     * 
     * @param segmentDurationSeconds
     *        Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the
     *        source segment duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackageCreateOrUpdateParameters withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
        return this;
    }

    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the
     * ChannelId.
     * 
     * @param segmentPrefix
     *        An optional custom string that is prepended to the name of each segment. If not specified, it defaults to
     *        the ChannelId.
     */

    public void setSegmentPrefix(String segmentPrefix) {
        this.segmentPrefix = segmentPrefix;
    }

    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the
     * ChannelId.
     * 
     * @return An optional custom string that is prepended to the name of each segment. If not specified, it defaults to
     *         the ChannelId.
     */

    public String getSegmentPrefix() {
        return this.segmentPrefix;
    }

    /**
     * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the
     * ChannelId.
     * 
     * @param segmentPrefix
     *        An optional custom string that is prepended to the name of each segment. If not specified, it defaults to
     *        the ChannelId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafPackageCreateOrUpdateParameters withSegmentPrefix(String segmentPrefix) {
        setSegmentPrefix(segmentPrefix);
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

    public CmafPackageCreateOrUpdateParameters withStreamSelection(StreamSelection streamSelection) {
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
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getHlsManifests() != null)
            sb.append("HlsManifests: ").append(getHlsManifests()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds()).append(",");
        if (getSegmentPrefix() != null)
            sb.append("SegmentPrefix: ").append(getSegmentPrefix()).append(",");
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

        if (obj instanceof CmafPackageCreateOrUpdateParameters == false)
            return false;
        CmafPackageCreateOrUpdateParameters other = (CmafPackageCreateOrUpdateParameters) obj;
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
        if (other.getSegmentPrefix() == null ^ this.getSegmentPrefix() == null)
            return false;
        if (other.getSegmentPrefix() != null && other.getSegmentPrefix().equals(this.getSegmentPrefix()) == false)
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

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getHlsManifests() == null) ? 0 : getHlsManifests().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentPrefix() == null) ? 0 : getSegmentPrefix().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        return hashCode;
    }

    @Override
    public CmafPackageCreateOrUpdateParameters clone() {
        try {
            return (CmafPackageCreateOrUpdateParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.CmafPackageCreateOrUpdateParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
