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
public class ModifySnapshotTierResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The date and time when the archive process was started.
     * </p>
     */
    private java.util.Date tieringStartTime;

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

    public ModifySnapshotTierResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The date and time when the archive process was started.
     * </p>
     * 
     * @param tieringStartTime
     *        The date and time when the archive process was started.
     */

    public void setTieringStartTime(java.util.Date tieringStartTime) {
        this.tieringStartTime = tieringStartTime;
    }

    /**
     * <p>
     * The date and time when the archive process was started.
     * </p>
     * 
     * @return The date and time when the archive process was started.
     */

    public java.util.Date getTieringStartTime() {
        return this.tieringStartTime;
    }

    /**
     * <p>
     * The date and time when the archive process was started.
     * </p>
     * 
     * @param tieringStartTime
     *        The date and time when the archive process was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotTierResult withTieringStartTime(java.util.Date tieringStartTime) {
        setTieringStartTime(tieringStartTime);
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
        if (getTieringStartTime() != null)
            sb.append("TieringStartTime: ").append(getTieringStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotTierResult == false)
            return false;
        ModifySnapshotTierResult other = (ModifySnapshotTierResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getTieringStartTime() == null ^ this.getTieringStartTime() == null)
            return false;
        if (other.getTieringStartTime() != null && other.getTieringStartTime().equals(this.getTieringStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getTieringStartTime() == null) ? 0 : getTieringStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotTierResult clone() {
        try {
            return (ModifySnapshotTierResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
