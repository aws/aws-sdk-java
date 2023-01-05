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
 * High level information for an SDK release.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ReleaseSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseSummary implements Serializable, Cloneable, StructuredPojo {

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

    public ReleaseSummary withReleaseVersion(String releaseVersion) {
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

    public ReleaseSummary withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseSummary == false)
            return false;
        ReleaseSummary other = (ReleaseSummary) obj;
        if (other.getReleaseVersion() == null ^ this.getReleaseVersion() == null)
            return false;
        if (other.getReleaseVersion() != null && other.getReleaseVersion().equals(this.getReleaseVersion()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReleaseVersion() == null) ? 0 : getReleaseVersion().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseSummary clone() {
        try {
            return (ReleaseSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ReleaseSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
