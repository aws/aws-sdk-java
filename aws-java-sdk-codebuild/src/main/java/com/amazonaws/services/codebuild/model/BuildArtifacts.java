/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about build output artifacts.
 * </p>
 */
public class BuildArtifacts implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the build artifacts' location.
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String md5sum;

    /**
     * <p>
     * Information about the build artifacts' location.
     * </p>
     * 
     * @param location
     *        Information about the build artifacts' location.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the build artifacts' location.
     * </p>
     * 
     * @return Information about the build artifacts' location.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the build artifacts' location.
     * </p>
     * 
     * @param location
     *        Information about the build artifacts' location.
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
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
     *        This value is available only if the related build project's <code>packaging</code> value is set to
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @return The SHA-256 hash of the build artifact.</p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the related build project's <code>packaging</code> value is set to
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
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
     *        This value is available only if the related build project's <code>packaging</code> value is set to
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
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
     *        This value is available only if the related build project's <code>packaging</code> value is set to
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @return The MD5 hash of the build artifact.</p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm both file integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the related build project's <code>packaging</code> value is set to
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
     * This value is available only if the related build project's <code>packaging</code> value is set to
     * <code>ZIP</code>.
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
     *        This value is available only if the related build project's <code>packaging</code> value is set to
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
            sb.append("Location: " + getLocation() + ",");
        if (getSha256sum() != null)
            sb.append("Sha256sum: " + getSha256sum() + ",");
        if (getMd5sum() != null)
            sb.append("Md5sum: " + getMd5sum());
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
}
