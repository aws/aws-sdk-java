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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deleted snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this status is
     * <code>DELETING</code>.
     * </p>
     */
    private String lifecycle;

    /**
     * <p>
     * The ID of the deleted snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the deleted snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the deleted snapshot.
     * </p>
     * 
     * @return The ID of the deleted snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the deleted snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the deleted snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSnapshotResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this status is
     * <code>DELETING</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this
     *        status is <code>DELETING</code>.
     * @see SnapshotLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this status is
     * <code>DELETING</code>.
     * </p>
     * 
     * @return The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this
     *         status is <code>DELETING</code>.
     * @see SnapshotLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this status is
     * <code>DELETING</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this
     *        status is <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotLifecycle
     */

    public DeleteSnapshotResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this status is
     * <code>DELETING</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the snapshot. If the <code>DeleteSnapshot</code> operation is successful, this
     *        status is <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotLifecycle
     */

    public DeleteSnapshotResult withLifecycle(SnapshotLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotResult == false)
            return false;
        DeleteSnapshotResult other = (DeleteSnapshotResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSnapshotResult clone() {
        try {
            return (DeleteSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
