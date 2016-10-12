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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DeleteSnapshot</code> operation.
 * </p>
 */
public class DeleteSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the snapshot to be deleted.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * The name of the snapshot to be deleted.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to be deleted.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to be deleted.
     * </p>
     * 
     * @return The name of the snapshot to be deleted.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to be deleted.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
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
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotRequest == false)
            return false;
        DeleteSnapshotRequest other = (DeleteSnapshotRequest) obj;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSnapshotRequest clone() {
        return (DeleteSnapshotRequest) super.clone();
    }
}
