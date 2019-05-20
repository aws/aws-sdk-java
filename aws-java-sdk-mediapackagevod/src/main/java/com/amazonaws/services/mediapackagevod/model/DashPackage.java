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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/DashPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashPackage implements Serializable, Cloneable, StructuredPojo {

    /** A list of DASH manifest configurations. */
    private java.util.List<DashManifest> dashManifests;

    private DashEncryption encryption;
    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source
     * segment duration.
     */
    private Integer segmentDurationSeconds;

    /**
     * A list of DASH manifest configurations.
     * 
     * @return A list of DASH manifest configurations.
     */

    public java.util.List<DashManifest> getDashManifests() {
        return dashManifests;
    }

    /**
     * A list of DASH manifest configurations.
     * 
     * @param dashManifests
     *        A list of DASH manifest configurations.
     */

    public void setDashManifests(java.util.Collection<DashManifest> dashManifests) {
        if (dashManifests == null) {
            this.dashManifests = null;
            return;
        }

        this.dashManifests = new java.util.ArrayList<DashManifest>(dashManifests);
    }

    /**
     * A list of DASH manifest configurations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashManifests(java.util.Collection)} or {@link #withDashManifests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dashManifests
     *        A list of DASH manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withDashManifests(DashManifest... dashManifests) {
        if (this.dashManifests == null) {
            setDashManifests(new java.util.ArrayList<DashManifest>(dashManifests.length));
        }
        for (DashManifest ele : dashManifests) {
            this.dashManifests.add(ele);
        }
        return this;
    }

    /**
     * A list of DASH manifest configurations.
     * 
     * @param dashManifests
     *        A list of DASH manifest configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withDashManifests(java.util.Collection<DashManifest> dashManifests) {
        setDashManifests(dashManifests);
        return this;
    }

    /**
     * @param encryption
     */

    public void setEncryption(DashEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * @return
     */

    public DashEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @param encryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPackage withEncryption(DashEncryption encryption) {
        setEncryption(encryption);
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

    public DashPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
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
        if (getDashManifests() != null)
            sb.append("DashManifests: ").append(getDashManifests()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
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

        if (obj instanceof DashPackage == false)
            return false;
        DashPackage other = (DashPackage) obj;
        if (other.getDashManifests() == null ^ this.getDashManifests() == null)
            return false;
        if (other.getDashManifests() != null && other.getDashManifests().equals(this.getDashManifests()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
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

        hashCode = prime * hashCode + ((getDashManifests() == null) ? 0 : getDashManifests().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public DashPackage clone() {
        try {
            return (DashPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.DashPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
