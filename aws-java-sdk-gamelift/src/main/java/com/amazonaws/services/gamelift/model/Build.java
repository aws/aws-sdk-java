/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Properties describing a game build.
 * </p>
 */
public class Build implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * Descriptive label associated with this build. Build names do not need to
     * be unique. It can be set using <a>CreateBuild</a> or <a>UpdateBuild</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version associated with this build. Version strings do not need to be
     * unique to a build. This value can be set using <a>CreateBuild</a> or
     * <a>UpdateBuild</a>.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Current status of the build. Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     */
    private String status;
    /**
     * <p>
     * File size of the uploaded game build, expressed in bytes. When the build
     * state is INITIALIZED, this value is 0.
     * </p>
     */
    private Long sizeOnDisk;
    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @return Unique identifier for a build.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Build withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with this build. Build names do not need to
     * be unique. It can be set using <a>CreateBuild</a> or <a>UpdateBuild</a>.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this build. Build names do not
     *        need to be unique. It can be set using <a>CreateBuild</a> or
     *        <a>UpdateBuild</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with this build. Build names do not need to
     * be unique. It can be set using <a>CreateBuild</a> or <a>UpdateBuild</a>.
     * </p>
     * 
     * @return Descriptive label associated with this build. Build names do not
     *         need to be unique. It can be set using <a>CreateBuild</a> or
     *         <a>UpdateBuild</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with this build. Build names do not need to
     * be unique. It can be set using <a>CreateBuild</a> or <a>UpdateBuild</a>.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this build. Build names do not
     *        need to be unique. It can be set using <a>CreateBuild</a> or
     *        <a>UpdateBuild</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Build withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version associated with this build. Version strings do not need to be
     * unique to a build. This value can be set using <a>CreateBuild</a> or
     * <a>UpdateBuild</a>.
     * </p>
     * 
     * @param version
     *        Version associated with this build. Version strings do not need to
     *        be unique to a build. This value can be set using
     *        <a>CreateBuild</a> or <a>UpdateBuild</a>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version associated with this build. Version strings do not need to be
     * unique to a build. This value can be set using <a>CreateBuild</a> or
     * <a>UpdateBuild</a>.
     * </p>
     * 
     * @return Version associated with this build. Version strings do not need
     *         to be unique to a build. This value can be set using
     *         <a>CreateBuild</a> or <a>UpdateBuild</a>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version associated with this build. Version strings do not need to be
     * unique to a build. This value can be set using <a>CreateBuild</a> or
     * <a>UpdateBuild</a>.
     * </p>
     * 
     * @param version
     *        Version associated with this build. Version strings do not need to
     *        be unique to a build. This value can be set using
     *        <a>CreateBuild</a> or <a>UpdateBuild</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Build withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Current status of the build. Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the build. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @see BuildStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the build. Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @return Current status of the build. Possible build states include:
     *         <ul>
     *         <li>INITIALIZED: A new build has been defined, but no files have
     *         been uploaded. You cannot create fleets for builds that are in
     *         this state. When a build is successfully created, the build state
     *         is set to this value.</li>
     *         <li>READY: The game build has been successfully uploaded. You can
     *         now create new fleets for this build.</li>
     *         <li>FAILED: The game build upload failed. You cannot create new
     *         fleets for this build.</li>
     *         </ul>
     * @see BuildStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the build. Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the build. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BuildStatus
     */

    public Build withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the build. Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the build. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BuildStatus
     */

    public void setStatus(BuildStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Current status of the build. Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Current status of the build. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BuildStatus
     */

    public Build withStatus(BuildStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * File size of the uploaded game build, expressed in bytes. When the build
     * state is INITIALIZED, this value is 0.
     * </p>
     * 
     * @param sizeOnDisk
     *        File size of the uploaded game build, expressed in bytes. When the
     *        build state is INITIALIZED, this value is 0.
     */

    public void setSizeOnDisk(Long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    /**
     * <p>
     * File size of the uploaded game build, expressed in bytes. When the build
     * state is INITIALIZED, this value is 0.
     * </p>
     * 
     * @return File size of the uploaded game build, expressed in bytes. When
     *         the build state is INITIALIZED, this value is 0.
     */

    public Long getSizeOnDisk() {
        return this.sizeOnDisk;
    }

    /**
     * <p>
     * File size of the uploaded game build, expressed in bytes. When the build
     * state is INITIALIZED, this value is 0.
     * </p>
     * 
     * @param sizeOnDisk
     *        File size of the uploaded game build, expressed in bytes. When the
     *        build state is INITIALIZED, this value is 0.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Build withSizeOnDisk(Long sizeOnDisk) {
        setSizeOnDisk(sizeOnDisk);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this object was created. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @return Time stamp indicating when this object was created. Format is an
     *         integer representing the number of seconds since the Unix epoch
     *         (Unix time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this object was created. Format is an integer
     * representing the number of seconds since the Unix epoch (Unix time).
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this object was created. Format is an
     *        integer representing the number of seconds since the Unix epoch
     *        (Unix time).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Build withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBuildId() != null)
            sb.append("BuildId: " + getBuildId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSizeOnDisk() != null)
            sb.append("SizeOnDisk: " + getSizeOnDisk() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Build == false)
            return false;
        Build other = (Build) obj;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null
                && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null
                && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSizeOnDisk() == null ^ this.getSizeOnDisk() == null)
            return false;
        if (other.getSizeOnDisk() != null
                && other.getSizeOnDisk().equals(this.getSizeOnDisk()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSizeOnDisk() == null) ? 0 : getSizeOnDisk().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Build clone() {
        try {
            return (Build) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
