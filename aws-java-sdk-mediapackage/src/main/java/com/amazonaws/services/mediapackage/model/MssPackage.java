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
 * A Microsoft Smooth Streaming (MSS) packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/MssPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MssPackage implements Serializable, Cloneable, StructuredPojo {

    private MssEncryption encryption;
    /** The time window (in seconds) contained in each manifest. */
    private Integer manifestWindowSeconds;
    /** The duration (in seconds) of each segment. */
    private Integer segmentDurationSeconds;

    private StreamSelection streamSelection;

    /**
     * @param encryption
     */

    public void setEncryption(MssEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public MssEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MssPackage withEncryption(MssEncryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * The time window (in seconds) contained in each manifest.
     * 
     * @param manifestWindowSeconds
     *        The time window (in seconds) contained in each manifest.
     */

    public void setManifestWindowSeconds(Integer manifestWindowSeconds) {
        this.manifestWindowSeconds = manifestWindowSeconds;
    }

    /**
     * The time window (in seconds) contained in each manifest.
     * 
     * @return The time window (in seconds) contained in each manifest.
     */

    public Integer getManifestWindowSeconds() {
        return this.manifestWindowSeconds;
    }

    /**
     * The time window (in seconds) contained in each manifest.
     * 
     * @param manifestWindowSeconds
     *        The time window (in seconds) contained in each manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MssPackage withManifestWindowSeconds(Integer manifestWindowSeconds) {
        setManifestWindowSeconds(manifestWindowSeconds);
        return this;
    }

    /**
     * The duration (in seconds) of each segment.
     * 
     * @param segmentDurationSeconds
     *        The duration (in seconds) of each segment.
     */

    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * The duration (in seconds) of each segment.
     * 
     * @return The duration (in seconds) of each segment.
     */

    public Integer getSegmentDurationSeconds() {
        return this.segmentDurationSeconds;
    }

    /**
     * The duration (in seconds) of each segment.
     * 
     * @param segmentDurationSeconds
     *        The duration (in seconds) of each segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MssPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        setSegmentDurationSeconds(segmentDurationSeconds);
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

    public MssPackage withStreamSelection(StreamSelection streamSelection) {
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
        if (getManifestWindowSeconds() != null)
            sb.append("ManifestWindowSeconds: ").append(getManifestWindowSeconds()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds()).append(",");
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

        if (obj instanceof MssPackage == false)
            return false;
        MssPackage other = (MssPackage) obj;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getManifestWindowSeconds() == null ^ this.getManifestWindowSeconds() == null)
            return false;
        if (other.getManifestWindowSeconds() != null && other.getManifestWindowSeconds().equals(this.getManifestWindowSeconds()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
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
        hashCode = prime * hashCode + ((getManifestWindowSeconds() == null) ? 0 : getManifestWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        return hashCode;
    }

    @Override
    public MssPackage clone() {
        try {
            return (MssPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.MssPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
