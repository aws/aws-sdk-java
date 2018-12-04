/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about build output artifacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildArtifacts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String sha256sum;
    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String md5sum;

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * 
     * @param location
     *        Information about the location of the build artifacts.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * 
     * @return Information about the location of the build artifacts.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * 
     * @param location
     *        Information about the location of the build artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param sha256sum
     *        The SHA-256 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     */

    public void setSha256sum(String sha256sum) {
        this.sha256sum = sha256sum;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @return The SHA-256 hash of the build artifact.</p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the build project's <code>packaging</code> value is set to
     *         <code>ZIP</code>.
     *         </p>
     */

    public String getSha256sum() {
        return this.sha256sum;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param sha256sum
     *        The SHA-256 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withSha256sum(String sha256sum) {
        setSha256sum(sha256sum);
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param md5sum
     *        The MD5 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     */

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @return The MD5 hash of the build artifact.</p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the build project's <code>packaging</code> value is set to
     *         <code>ZIP</code>.
     *         </p>
     */

    public String getMd5sum() {
        return this.md5sum;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param md5sum
     *        The MD5 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withMd5sum(String md5sum) {
        setMd5sum(md5sum);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getSha256sum() != null)
            sb.append("Sha256sum: ").append(getSha256sum()).append(",");
        if (getMd5sum() != null)
            sb.append("Md5sum: ").append(getMd5sum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildArtifacts == false)
            return false;
        BuildArtifacts other = (BuildArtifacts) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getSha256sum() == null ^ this.getSha256sum() == null)
            return false;
        if (other.getSha256sum() != null && other.getSha256sum().equals(this.getSha256sum()) == false)
            return false;
        if (other.getMd5sum() == null ^ this.getMd5sum() == null)
            return false;
        if (other.getMd5sum() != null && other.getMd5sum().equals(this.getMd5sum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getSha256sum() == null) ? 0 : getSha256sum().hashCode());
        hashCode = prime * hashCode + ((getMd5sum() == null) ? 0 : getMd5sum().hashCode());
        return hashCode;
    }

    @Override
    public BuildArtifacts clone() {
        try {
            return (BuildArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildArtifactsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
