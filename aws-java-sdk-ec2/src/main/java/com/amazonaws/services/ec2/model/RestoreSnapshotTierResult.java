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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreSnapshotTierResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The date and time when the snapshot restore process started.
     * </p>
     */
    private java.util.Date restoreStartTime;
    /**
     * <p>
     * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     * </p>
     */
    private Integer restoreDuration;
    /**
     * <p>
     * Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     * <code>false</code> indicates a temporary restore.
     * </p>
     */
    private Boolean isPermanentRestore;

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

    public RestoreSnapshotTierResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The date and time when the snapshot restore process started.
     * </p>
     * 
     * @param restoreStartTime
     *        The date and time when the snapshot restore process started.
     */

    public void setRestoreStartTime(java.util.Date restoreStartTime) {
        this.restoreStartTime = restoreStartTime;
    }

    /**
     * <p>
     * The date and time when the snapshot restore process started.
     * </p>
     * 
     * @return The date and time when the snapshot restore process started.
     */

    public java.util.Date getRestoreStartTime() {
        return this.restoreStartTime;
    }

    /**
     * <p>
     * The date and time when the snapshot restore process started.
     * </p>
     * 
     * @param restoreStartTime
     *        The date and time when the snapshot restore process started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotTierResult withRestoreStartTime(java.util.Date restoreStartTime) {
        setRestoreStartTime(restoreStartTime);
        return this;
    }

    /**
     * <p>
     * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     * </p>
     * 
     * @param restoreDuration
     *        For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     */

    public void setRestoreDuration(Integer restoreDuration) {
        this.restoreDuration = restoreDuration;
    }

    /**
     * <p>
     * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     * </p>
     * 
     * @return For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     */

    public Integer getRestoreDuration() {
        return this.restoreDuration;
    }

    /**
     * <p>
     * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     * </p>
     * 
     * @param restoreDuration
     *        For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotTierResult withRestoreDuration(Integer restoreDuration) {
        setRestoreDuration(restoreDuration);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     * <code>false</code> indicates a temporary restore.
     * </p>
     * 
     * @param isPermanentRestore
     *        Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     *        <code>false</code> indicates a temporary restore.
     */

    public void setIsPermanentRestore(Boolean isPermanentRestore) {
        this.isPermanentRestore = isPermanentRestore;
    }

    /**
     * <p>
     * Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     * <code>false</code> indicates a temporary restore.
     * </p>
     * 
     * @return Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     *         <code>false</code> indicates a temporary restore.
     */

    public Boolean getIsPermanentRestore() {
        return this.isPermanentRestore;
    }

    /**
     * <p>
     * Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     * <code>false</code> indicates a temporary restore.
     * </p>
     * 
     * @param isPermanentRestore
     *        Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     *        <code>false</code> indicates a temporary restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotTierResult withIsPermanentRestore(Boolean isPermanentRestore) {
        setIsPermanentRestore(isPermanentRestore);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     * <code>false</code> indicates a temporary restore.
     * </p>
     * 
     * @return Indicates whether the snapshot is permanently restored. <code>true</code> indicates a permanent restore.
     *         <code>false</code> indicates a temporary restore.
     */

    public Boolean isPermanentRestore() {
        return this.isPermanentRestore;
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
        if (getRestoreStartTime() != null)
            sb.append("RestoreStartTime: ").append(getRestoreStartTime()).append(",");
        if (getRestoreDuration() != null)
            sb.append("RestoreDuration: ").append(getRestoreDuration()).append(",");
        if (getIsPermanentRestore() != null)
            sb.append("IsPermanentRestore: ").append(getIsPermanentRestore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreSnapshotTierResult == false)
            return false;
        RestoreSnapshotTierResult other = (RestoreSnapshotTierResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getRestoreStartTime() == null ^ this.getRestoreStartTime() == null)
            return false;
        if (other.getRestoreStartTime() != null && other.getRestoreStartTime().equals(this.getRestoreStartTime()) == false)
            return false;
        if (other.getRestoreDuration() == null ^ this.getRestoreDuration() == null)
            return false;
        if (other.getRestoreDuration() != null && other.getRestoreDuration().equals(this.getRestoreDuration()) == false)
            return false;
        if (other.getIsPermanentRestore() == null ^ this.getIsPermanentRestore() == null)
            return false;
        if (other.getIsPermanentRestore() != null && other.getIsPermanentRestore().equals(this.getIsPermanentRestore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getRestoreStartTime() == null) ? 0 : getRestoreStartTime().hashCode());
        hashCode = prime * hashCode + ((getRestoreDuration() == null) ? 0 : getRestoreDuration().hashCode());
        hashCode = prime * hashCode + ((getIsPermanentRestore() == null) ? 0 : getIsPermanentRestore().hashCode());
        return hashCode;
    }

    @Override
    public RestoreSnapshotTierResult clone() {
        try {
            return (RestoreSnapshotTierResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
