/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information for a release of the mobile SDK, including release notes and tags.
 * </p>
 * <p>
 * The mobile SDK is not generally available. Customers who have access to the mobile SDK can use it to establish and
 * manage WAF tokens for use in HTTP(S) requests from a mobile device to WAF. For more information, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client application
 * integration</a> in the <i>WAF Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/MobileSdkRelease" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MobileSdkRelease implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The release version.
     * </p>
     */
    private String releaseVersion;
    /**
     * <p>
     * The timestamp of the release.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * Notes describing the release.
     * </p>
     */
    private String releaseNotes;
    /**
     * <p>
     * Tags that are associated with the release.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The release version.
     * </p>
     * 
     * @param releaseVersion
     *        The release version.
     */

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    /**
     * <p>
     * The release version.
     * </p>
     * 
     * @return The release version.
     */

    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * <p>
     * The release version.
     * </p>
     * 
     * @param releaseVersion
     *        The release version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileSdkRelease withReleaseVersion(String releaseVersion) {
        setReleaseVersion(releaseVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp of the release.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the release.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the release.
     * </p>
     * 
     * @return The timestamp of the release.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the release.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileSdkRelease withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Notes describing the release.
     * </p>
     * 
     * @param releaseNotes
     *        Notes describing the release.
     */

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    /**
     * <p>
     * Notes describing the release.
     * </p>
     * 
     * @return Notes describing the release.
     */

    public String getReleaseNotes() {
        return this.releaseNotes;
    }

    /**
     * <p>
     * Notes describing the release.
     * </p>
     * 
     * @param releaseNotes
     *        Notes describing the release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileSdkRelease withReleaseNotes(String releaseNotes) {
        setReleaseNotes(releaseNotes);
        return this;
    }

    /**
     * <p>
     * Tags that are associated with the release.
     * </p>
     * 
     * @return Tags that are associated with the release.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that are associated with the release.
     * </p>
     * 
     * @param tags
     *        Tags that are associated with the release.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags that are associated with the release.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags that are associated with the release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileSdkRelease withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags that are associated with the release.
     * </p>
     * 
     * @param tags
     *        Tags that are associated with the release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MobileSdkRelease withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReleaseVersion() != null)
            sb.append("ReleaseVersion: ").append(getReleaseVersion()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getReleaseNotes() != null)
            sb.append("ReleaseNotes: ").append(getReleaseNotes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MobileSdkRelease == false)
            return false;
        MobileSdkRelease other = (MobileSdkRelease) obj;
        if (other.getReleaseVersion() == null ^ this.getReleaseVersion() == null)
            return false;
        if (other.getReleaseVersion() != null && other.getReleaseVersion().equals(this.getReleaseVersion()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getReleaseNotes() == null ^ this.getReleaseNotes() == null)
            return false;
        if (other.getReleaseNotes() != null && other.getReleaseNotes().equals(this.getReleaseNotes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReleaseVersion() == null) ? 0 : getReleaseVersion().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getReleaseNotes() == null) ? 0 : getReleaseNotes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public MobileSdkRelease clone() {
        try {
            return (MobileSdkRelease) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.MobileSdkReleaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
