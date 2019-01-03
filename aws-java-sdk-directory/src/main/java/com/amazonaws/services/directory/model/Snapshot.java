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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a directory snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/Snapshot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The directory identifier.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The snapshot identifier.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The snapshot type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The descriptive name of the snapshot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The snapshot status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the snapshot was taken.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @return The directory identifier.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The snapshot identifier.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot identifier.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot identifier.
     * </p>
     * 
     * @return The snapshot identifier.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot identifier.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The snapshot type.
     * </p>
     * 
     * @param type
     *        The snapshot type.
     * @see SnapshotType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The snapshot type.
     * </p>
     * 
     * @return The snapshot type.
     * @see SnapshotType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The snapshot type.
     * </p>
     * 
     * @param type
     *        The snapshot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotType
     */

    public Snapshot withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The snapshot type.
     * </p>
     * 
     * @param type
     *        The snapshot type.
     * @see SnapshotType
     */

    public void setType(SnapshotType type) {
        withType(type);
    }

    /**
     * <p>
     * The snapshot type.
     * </p>
     * 
     * @param type
     *        The snapshot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotType
     */

    public Snapshot withType(SnapshotType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The descriptive name of the snapshot.
     * </p>
     * 
     * @param name
     *        The descriptive name of the snapshot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name of the snapshot.
     * </p>
     * 
     * @return The descriptive name of the snapshot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name of the snapshot.
     * </p>
     * 
     * @param name
     *        The descriptive name of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The snapshot status.
     * </p>
     * 
     * @param status
     *        The snapshot status.
     * @see SnapshotStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The snapshot status.
     * </p>
     * 
     * @return The snapshot status.
     * @see SnapshotStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The snapshot status.
     * </p>
     * 
     * @param status
     *        The snapshot status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotStatus
     */

    public Snapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The snapshot status.
     * </p>
     * 
     * @param status
     *        The snapshot status.
     * @see SnapshotStatus
     */

    public void setStatus(SnapshotStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The snapshot status.
     * </p>
     * 
     * @param status
     *        The snapshot status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotStatus
     */

    public Snapshot withStatus(SnapshotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the snapshot was taken.
     * </p>
     * 
     * @param startTime
     *        The date and time that the snapshot was taken.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the snapshot was taken.
     * </p>
     * 
     * @return The date and time that the snapshot was taken.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that the snapshot was taken.
     * </p>
     * 
     * @param startTime
     *        The date and time that the snapshot was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.SnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
