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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Snapshot> rebuildSnapshots;
    /**
     * <p>
     * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root
     * volume and the user volume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Snapshot> restoreSnapshots;

    /**
     * <p>
     * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
     * </p>
     * 
     * @return Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user
     *         volume.
     */

    public java.util.List<Snapshot> getRebuildSnapshots() {
        if (rebuildSnapshots == null) {
            rebuildSnapshots = new com.amazonaws.internal.SdkInternalList<Snapshot>();
        }
        return rebuildSnapshots;
    }

    /**
     * <p>
     * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
     * </p>
     * 
     * @param rebuildSnapshots
     *        Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user
     *        volume.
     */

    public void setRebuildSnapshots(java.util.Collection<Snapshot> rebuildSnapshots) {
        if (rebuildSnapshots == null) {
            this.rebuildSnapshots = null;
            return;
        }

        this.rebuildSnapshots = new com.amazonaws.internal.SdkInternalList<Snapshot>(rebuildSnapshots);
    }

    /**
     * <p>
     * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRebuildSnapshots(java.util.Collection)} or {@link #withRebuildSnapshots(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rebuildSnapshots
     *        Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user
     *        volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceSnapshotsResult withRebuildSnapshots(Snapshot... rebuildSnapshots) {
        if (this.rebuildSnapshots == null) {
            setRebuildSnapshots(new com.amazonaws.internal.SdkInternalList<Snapshot>(rebuildSnapshots.length));
        }
        for (Snapshot ele : rebuildSnapshots) {
            this.rebuildSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
     * </p>
     * 
     * @param rebuildSnapshots
     *        Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user
     *        volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceSnapshotsResult withRebuildSnapshots(java.util.Collection<Snapshot> rebuildSnapshots) {
        setRebuildSnapshots(rebuildSnapshots);
        return this;
    }

    /**
     * <p>
     * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root
     * volume and the user volume.
     * </p>
     * 
     * @return Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the
     *         root volume and the user volume.
     */

    public java.util.List<Snapshot> getRestoreSnapshots() {
        if (restoreSnapshots == null) {
            restoreSnapshots = new com.amazonaws.internal.SdkInternalList<Snapshot>();
        }
        return restoreSnapshots;
    }

    /**
     * <p>
     * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root
     * volume and the user volume.
     * </p>
     * 
     * @param restoreSnapshots
     *        Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the
     *        root volume and the user volume.
     */

    public void setRestoreSnapshots(java.util.Collection<Snapshot> restoreSnapshots) {
        if (restoreSnapshots == null) {
            this.restoreSnapshots = null;
            return;
        }

        this.restoreSnapshots = new com.amazonaws.internal.SdkInternalList<Snapshot>(restoreSnapshots);
    }

    /**
     * <p>
     * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root
     * volume and the user volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRestoreSnapshots(java.util.Collection)} or {@link #withRestoreSnapshots(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param restoreSnapshots
     *        Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the
     *        root volume and the user volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceSnapshotsResult withRestoreSnapshots(Snapshot... restoreSnapshots) {
        if (this.restoreSnapshots == null) {
            setRestoreSnapshots(new com.amazonaws.internal.SdkInternalList<Snapshot>(restoreSnapshots.length));
        }
        for (Snapshot ele : restoreSnapshots) {
            this.restoreSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root
     * volume and the user volume.
     * </p>
     * 
     * @param restoreSnapshots
     *        Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the
     *        root volume and the user volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceSnapshotsResult withRestoreSnapshots(java.util.Collection<Snapshot> restoreSnapshots) {
        setRestoreSnapshots(restoreSnapshots);
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
        if (getRebuildSnapshots() != null)
            sb.append("RebuildSnapshots: ").append(getRebuildSnapshots()).append(",");
        if (getRestoreSnapshots() != null)
            sb.append("RestoreSnapshots: ").append(getRestoreSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceSnapshotsResult == false)
            return false;
        DescribeWorkspaceSnapshotsResult other = (DescribeWorkspaceSnapshotsResult) obj;
        if (other.getRebuildSnapshots() == null ^ this.getRebuildSnapshots() == null)
            return false;
        if (other.getRebuildSnapshots() != null && other.getRebuildSnapshots().equals(this.getRebuildSnapshots()) == false)
            return false;
        if (other.getRestoreSnapshots() == null ^ this.getRestoreSnapshots() == null)
            return false;
        if (other.getRestoreSnapshots() != null && other.getRestoreSnapshots().equals(this.getRestoreSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRebuildSnapshots() == null) ? 0 : getRebuildSnapshots().hashCode());
        hashCode = prime * hashCode + ((getRestoreSnapshots() == null) ? 0 : getRestoreSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceSnapshotsResult clone() {
        try {
            return (DescribeWorkspaceSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
