/*
 * Copyright 2012-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Specifies whether Amazon S3 replicates delete markers.
 *
 * If you specify a <code>Filter</code> in your replication configuration, you must also include a
 * <code>DeleteMarkerReplication</code> element. If your <code>Filter</code> includes a <code>Tag</code> element, the
 * <code>DeleteMarkerReplication</code> <code>Status</code> must be set to Disabled, because Amazon S3 does not support
 * replicating delete markers for tag-based rules. For an example configuration, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config">Basic
 * Rule Configuration</a>.
 * <p>
 * For more information about delete marker replication, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html">Basic Rule Configuration</a>.
 * <note><p>If you are using an earlier version of the replication configuration, Amazon S3 handles replication of
 * delete markers differently. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations">Backward
 * Compatibility</a>. </note>
 */
public class DeleteMarkerReplication implements Serializable, Cloneable {

    private String status;

    /**
     * Return whether to replicate delete markers.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set whether to replicate delete markers.
     *
     * @param status New replication status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Set whether to replicate delete markers.
     *
     * @param status New replication status.
     * @return This object for method chaining.
     */
    public DeleteMarkerReplication withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Set whether to replicate delete markers.
     *
     * @param status New replication status.
     * @return This object for method chaining.
     */
    public DeleteMarkerReplication withStatus(DeleteMarkerReplicationStatus status) {
        setStatus(status == null ? null : status.toString());
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) {
            sb.append("Status: ").append(getStatus()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof DeleteMarkerReplication == false) {
            return false;
        }
        DeleteMarkerReplication other = (DeleteMarkerReplication) obj;
        if (other.getStatus() == null ^ this.getStatus() == null) {
            return false;
        }
        if (other.getStatus() != null &&
            other.getStatus().equals(this.getStatus()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMarkerReplication clone() {
        try {
            return (DeleteMarkerReplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
