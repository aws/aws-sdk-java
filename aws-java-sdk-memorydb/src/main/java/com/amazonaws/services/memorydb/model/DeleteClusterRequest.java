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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to be deleted
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     */
    private String finalSnapshotName;

    /**
     * <p>
     * The name of the cluster to be deleted
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to be deleted
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to be deleted
     * </p>
     * 
     * @return The name of the cluster to be deleted
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to be deleted
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to be deleted
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     * 
     * @param finalSnapshotName
     *        The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     *        MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     */

    public void setFinalSnapshotName(String finalSnapshotName) {
        this.finalSnapshotName = finalSnapshotName;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     * 
     * @return The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     *         MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     */

    public String getFinalSnapshotName() {
        return this.finalSnapshotName;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     * 
     * @param finalSnapshotName
     *        The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     *        MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withFinalSnapshotName(String finalSnapshotName) {
        setFinalSnapshotName(finalSnapshotName);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getFinalSnapshotName() != null)
            sb.append("FinalSnapshotName: ").append(getFinalSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterRequest == false)
            return false;
        DeleteClusterRequest other = (DeleteClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getFinalSnapshotName() == null ^ this.getFinalSnapshotName() == null)
            return false;
        if (other.getFinalSnapshotName() != null && other.getFinalSnapshotName().equals(this.getFinalSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getFinalSnapshotName() == null) ? 0 : getFinalSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterRequest clone() {
        return (DeleteClusterRequest) super.clone();
    }

}
