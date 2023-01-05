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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteClusterSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns information about the newly deleted Elastic DocumentDB snapshot.
     * </p>
     */
    private ClusterSnapshot snapshot;

    /**
     * <p>
     * Returns information about the newly deleted Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param snapshot
     *        Returns information about the newly deleted Elastic DocumentDB snapshot.
     */

    public void setSnapshot(ClusterSnapshot snapshot) {
        this.snapshot = snapshot;
    }

    /**
     * <p>
     * Returns information about the newly deleted Elastic DocumentDB snapshot.
     * </p>
     * 
     * @return Returns information about the newly deleted Elastic DocumentDB snapshot.
     */

    public ClusterSnapshot getSnapshot() {
        return this.snapshot;
    }

    /**
     * <p>
     * Returns information about the newly deleted Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param snapshot
     *        Returns information about the newly deleted Elastic DocumentDB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterSnapshotResult withSnapshot(ClusterSnapshot snapshot) {
        setSnapshot(snapshot);
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
        if (getSnapshot() != null)
            sb.append("Snapshot: ").append(getSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterSnapshotResult == false)
            return false;
        DeleteClusterSnapshotResult other = (DeleteClusterSnapshotResult) obj;
        if (other.getSnapshot() == null ^ this.getSnapshot() == null)
            return false;
        if (other.getSnapshot() != null && other.getSnapshot().equals(this.getSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshot() == null) ? 0 : getSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterSnapshotResult clone() {
        try {
            return (DeleteClusterSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
