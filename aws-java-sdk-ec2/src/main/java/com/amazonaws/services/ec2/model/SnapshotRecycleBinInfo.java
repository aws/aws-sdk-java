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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a snapshot that is currently in the Recycle Bin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SnapshotRecycleBinInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotRecycleBinInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The date and time when the snaphsot entered the Recycle Bin.
     * </p>
     */
    private java.util.Date recycleBinEnterTime;
    /**
     * <p>
     * The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     * </p>
     */
    private java.util.Date recycleBinExitTime;
    /**
     * <p>
     * The description for the snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotRecycleBinInfo withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The date and time when the snaphsot entered the Recycle Bin.
     * </p>
     * 
     * @param recycleBinEnterTime
     *        The date and time when the snaphsot entered the Recycle Bin.
     */

    public void setRecycleBinEnterTime(java.util.Date recycleBinEnterTime) {
        this.recycleBinEnterTime = recycleBinEnterTime;
    }

    /**
     * <p>
     * The date and time when the snaphsot entered the Recycle Bin.
     * </p>
     * 
     * @return The date and time when the snaphsot entered the Recycle Bin.
     */

    public java.util.Date getRecycleBinEnterTime() {
        return this.recycleBinEnterTime;
    }

    /**
     * <p>
     * The date and time when the snaphsot entered the Recycle Bin.
     * </p>
     * 
     * @param recycleBinEnterTime
     *        The date and time when the snaphsot entered the Recycle Bin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotRecycleBinInfo withRecycleBinEnterTime(java.util.Date recycleBinEnterTime) {
        setRecycleBinEnterTime(recycleBinEnterTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     * </p>
     * 
     * @param recycleBinExitTime
     *        The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     */

    public void setRecycleBinExitTime(java.util.Date recycleBinExitTime) {
        this.recycleBinExitTime = recycleBinExitTime;
    }

    /**
     * <p>
     * The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     * </p>
     * 
     * @return The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     */

    public java.util.Date getRecycleBinExitTime() {
        return this.recycleBinExitTime;
    }

    /**
     * <p>
     * The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     * </p>
     * 
     * @param recycleBinExitTime
     *        The date and time when the snapshot is to be permanently deleted from the Recycle Bin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotRecycleBinInfo withRecycleBinExitTime(java.util.Date recycleBinExitTime) {
        setRecycleBinExitTime(recycleBinExitTime);
        return this;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * 
     * @param description
     *        The description for the snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * 
     * @return The description for the snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the snapshot.
     * </p>
     * 
     * @param description
     *        The description for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotRecycleBinInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume from which the snapshot was created.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     * 
     * @return The ID of the volume from which the snapshot was created.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume from which the snapshot was created.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume from which the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotRecycleBinInfo withVolumeId(String volumeId) {
        setVolumeId(volumeId);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getRecycleBinEnterTime() != null)
            sb.append("RecycleBinEnterTime: ").append(getRecycleBinEnterTime()).append(",");
        if (getRecycleBinExitTime() != null)
            sb.append("RecycleBinExitTime: ").append(getRecycleBinExitTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotRecycleBinInfo == false)
            return false;
        SnapshotRecycleBinInfo other = (SnapshotRecycleBinInfo) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getRecycleBinEnterTime() == null ^ this.getRecycleBinEnterTime() == null)
            return false;
        if (other.getRecycleBinEnterTime() != null && other.getRecycleBinEnterTime().equals(this.getRecycleBinEnterTime()) == false)
            return false;
        if (other.getRecycleBinExitTime() == null ^ this.getRecycleBinExitTime() == null)
            return false;
        if (other.getRecycleBinExitTime() != null && other.getRecycleBinExitTime().equals(this.getRecycleBinExitTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getRecycleBinEnterTime() == null) ? 0 : getRecycleBinEnterTime().hashCode());
        hashCode = prime * hashCode + ((getRecycleBinExitTime() == null) ? 0 : getRecycleBinExitTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotRecycleBinInfo clone() {
        try {
            return (SnapshotRecycleBinInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
