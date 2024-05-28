/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
 * modification sync can help you keep object metadata synchronized between replicas and source objects. By default, S3
 * on Outposts replicates metadata from the source objects to the replicas only. When replica modification sync is
 * enabled, S3 on Outposts replicates metadata changes made to the replica copies back to the source object, making the
 * replication bidirectional.
 * </p>
 * <p>
 * To replicate object metadata modifications on replicas, you can specify this element and set the <code>Status</code>
 * of this element to <code>Enabled</code>.
 * </p>
 * <note>
 * <p>
 * You must enable replica modification sync on the source and destination buckets to replicate replica metadata changes
 * between the source and the replicas.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ReplicaModifications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaModifications implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * </p>
     * 
     * @param status
     *        Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * @see ReplicaModificationsStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * </p>
     * 
     * @return Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * @see ReplicaModificationsStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * </p>
     * 
     * @param status
     *        Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaModificationsStatus
     */

    public ReplicaModifications withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * </p>
     * 
     * @param status
     *        Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaModificationsStatus
     */

    public ReplicaModifications withStatus(ReplicaModificationsStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaModifications == false)
            return false;
        ReplicaModifications other = (ReplicaModifications) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
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
    public ReplicaModifications clone() {
        try {
            return (ReplicaModifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
