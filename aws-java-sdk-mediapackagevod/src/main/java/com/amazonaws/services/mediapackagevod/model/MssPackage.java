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
 * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/MssPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MssPackage implements Serializable, Cloneable, StructuredPojo {

    private MssEncryption encryption;
    /** A list of MSS manifest configurations. */
    private java.util.List<MssManifest> mssManifests;
    /** The duration (in seconds) of each segment. */
    private Integer segmentDurationSeconds;

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
     * A list of MSS manifest configurations.
     * 
     * @return A list of MSS manifest configurations.
     */

    public java.util.List<MssManifest> getMssManifests() {
        return mssManifests;
    }

    /**
     * A list of MSS manifest configurations.
     * 
     * @param mssManifests
     *        A list of MSS manifest configurations.
     */

    public void setMssManifests(java.util.Collection<MssManifest> mssManifests) {
        if (mssManifests == null) {
            this.mssManifests = null;
            return;
        }

        this.mssManifests = new java.util.ArrayList<MssManifest>(mssManifests);
    }

    /**
     * A list of MSS manifest configurations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMssManifests(java.util.Collection)} or {@link #withMssManifests(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mssManifests
     *        A list of MSS manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MssPackage withMssManifests(MssManifest... mssManifests) {
        if (this.mssManifests == null) {
            setMssManifests(new java.util.ArrayList<MssManifest>(mssManifests.length));
        }
        for (MssManifest ele : mssManifests) {
            this.mssManifests.add(ele);
        }
        return this;
    }

    /**
     * A list of MSS manifest configurations.
     * 
     * @param mssManifests
     *        A list of MSS manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MssPackage withMssManifests(java.util.Collection<MssManifest> mssManifests) {
        setMssManifests(mssManifests);
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
        if (getMssManifests() != null)
            sb.append("MssManifests: ").append(getMssManifests()).append(",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: ").append(getSegmentDurationSeconds());
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
        if (other.getMssManifests() == null ^ this.getMssManifests() == null)
            return false;
        if (other.getMssManifests() != null && other.getMssManifests().equals(this.getMssManifests()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getMssManifests() == null) ? 0 : getMssManifests().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
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
        com.amazonaws.services.mediapackagevod.model.transform.MssPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
