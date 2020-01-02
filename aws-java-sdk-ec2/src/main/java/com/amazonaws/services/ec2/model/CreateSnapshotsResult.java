/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class CreateSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of snapshots.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SnapshotInfo> snapshots;

    /**
     * <p>
     * List of snapshots.
     * </p>
     * 
     * @return List of snapshots.
     */

    public java.util.List<SnapshotInfo> getSnapshots() {
        if (snapshots == null) {
            snapshots = new com.amazonaws.internal.SdkInternalList<SnapshotInfo>();
        }
        return snapshots;
    }

    /**
     * <p>
     * List of snapshots.
     * </p>
     * 
     * @param snapshots
     *        List of snapshots.
     */

    public void setSnapshots(java.util.Collection<SnapshotInfo> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new com.amazonaws.internal.SdkInternalList<SnapshotInfo>(snapshots);
    }

    /**
     * <p>
     * List of snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshots(java.util.Collection)} or {@link #withSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshots
     *        List of snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsResult withSnapshots(SnapshotInfo... snapshots) {
        if (this.snapshots == null) {
            setSnapshots(new com.amazonaws.internal.SdkInternalList<SnapshotInfo>(snapshots.length));
        }
        for (SnapshotInfo ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of snapshots.
     * </p>
     * 
     * @param snapshots
     *        List of snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotsResult withSnapshots(java.util.Collection<SnapshotInfo> snapshots) {
        setSnapshots(snapshots);
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
        if (getSnapshots() != null)
            sb.append("Snapshots: ").append(getSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotsResult == false)
            return false;
        CreateSnapshotsResult other = (CreateSnapshotsResult) obj;
        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotsResult clone() {
        try {
            return (CreateSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
