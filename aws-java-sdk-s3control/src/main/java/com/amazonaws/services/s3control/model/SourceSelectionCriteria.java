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
 * A container that describes additional filters for identifying the source objects that you want to replicate. You can
 * choose to enable or disable the replication of these objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SourceSelectionCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceSelectionCriteria implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by using Key
     * Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the replication
     * configuration, this element is required.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private SseKmsEncryptedObjects sseKmsEncryptedObjects;
    /**
     * <p>
     * A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     * modification sync can help you keep object metadata synchronized between replicas and source objects. By default,
     * S3 on Outposts replicates metadata from the source objects to the replicas only. When replica modification sync
     * is enabled, S3 on Outposts replicates metadata changes made to the replica copies back to the source object,
     * making the replication bidirectional.
     * </p>
     * <p>
     * To replicate object metadata modifications on replicas, you can specify this element and set the
     * <code>Status</code> of this element to <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * You must enable replica modification sync on the source and destination buckets to replicate replica metadata
     * changes between the source and the replicas.
     * </p>
     * </note>
     */
    private ReplicaModifications replicaModifications;

    /**
     * <p>
     * A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by using Key
     * Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the replication
     * configuration, this element is required.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param sseKmsEncryptedObjects
     *        A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by
     *        using Key Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the
     *        replication configuration, this element is required. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    /**
     * <p>
     * A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by using Key
     * Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the replication
     * configuration, this element is required.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by
     *         using Key Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the
     *         replication configuration, this element is required. </p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public SseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects;
    }

    /**
     * <p>
     * A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by using Key
     * Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the replication
     * configuration, this element is required.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param sseKmsEncryptedObjects
     *        A filter that you can use to select Amazon S3 objects that are encrypted with server-side encryption by
     *        using Key Management Service (KMS) keys. If you include <code>SourceSelectionCriteria</code> in the
     *        replication configuration, this element is required. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSelectionCriteria withSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        setSseKmsEncryptedObjects(sseKmsEncryptedObjects);
        return this;
    }

    /**
     * <p>
     * A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     * modification sync can help you keep object metadata synchronized between replicas and source objects. By default,
     * S3 on Outposts replicates metadata from the source objects to the replicas only. When replica modification sync
     * is enabled, S3 on Outposts replicates metadata changes made to the replica copies back to the source object,
     * making the replication bidirectional.
     * </p>
     * <p>
     * To replicate object metadata modifications on replicas, you can specify this element and set the
     * <code>Status</code> of this element to <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * You must enable replica modification sync on the source and destination buckets to replicate replica metadata
     * changes between the source and the replicas.
     * </p>
     * </note>
     * 
     * @param replicaModifications
     *        A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     *        modification sync can help you keep object metadata synchronized between replicas and source objects. By
     *        default, S3 on Outposts replicates metadata from the source objects to the replicas only. When replica
     *        modification sync is enabled, S3 on Outposts replicates metadata changes made to the replica copies back
     *        to the source object, making the replication bidirectional.</p>
     *        <p>
     *        To replicate object metadata modifications on replicas, you can specify this element and set the
     *        <code>Status</code> of this element to <code>Enabled</code>.
     *        </p>
     *        <note>
     *        <p>
     *        You must enable replica modification sync on the source and destination buckets to replicate replica
     *        metadata changes between the source and the replicas.
     *        </p>
     */

    public void setReplicaModifications(ReplicaModifications replicaModifications) {
        this.replicaModifications = replicaModifications;
    }

    /**
     * <p>
     * A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     * modification sync can help you keep object metadata synchronized between replicas and source objects. By default,
     * S3 on Outposts replicates metadata from the source objects to the replicas only. When replica modification sync
     * is enabled, S3 on Outposts replicates metadata changes made to the replica copies back to the source object,
     * making the replication bidirectional.
     * </p>
     * <p>
     * To replicate object metadata modifications on replicas, you can specify this element and set the
     * <code>Status</code> of this element to <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * You must enable replica modification sync on the source and destination buckets to replicate replica metadata
     * changes between the source and the replicas.
     * </p>
     * </note>
     * 
     * @return A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     *         modification sync can help you keep object metadata synchronized between replicas and source objects. By
     *         default, S3 on Outposts replicates metadata from the source objects to the replicas only. When replica
     *         modification sync is enabled, S3 on Outposts replicates metadata changes made to the replica copies back
     *         to the source object, making the replication bidirectional.</p>
     *         <p>
     *         To replicate object metadata modifications on replicas, you can specify this element and set the
     *         <code>Status</code> of this element to <code>Enabled</code>.
     *         </p>
     *         <note>
     *         <p>
     *         You must enable replica modification sync on the source and destination buckets to replicate replica
     *         metadata changes between the source and the replicas.
     *         </p>
     */

    public ReplicaModifications getReplicaModifications() {
        return this.replicaModifications;
    }

    /**
     * <p>
     * A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     * modification sync can help you keep object metadata synchronized between replicas and source objects. By default,
     * S3 on Outposts replicates metadata from the source objects to the replicas only. When replica modification sync
     * is enabled, S3 on Outposts replicates metadata changes made to the replica copies back to the source object,
     * making the replication bidirectional.
     * </p>
     * <p>
     * To replicate object metadata modifications on replicas, you can specify this element and set the
     * <code>Status</code> of this element to <code>Enabled</code>.
     * </p>
     * <note>
     * <p>
     * You must enable replica modification sync on the source and destination buckets to replicate replica metadata
     * changes between the source and the replicas.
     * </p>
     * </note>
     * 
     * @param replicaModifications
     *        A filter that you can use to specify whether replica modification sync is enabled. S3 on Outposts replica
     *        modification sync can help you keep object metadata synchronized between replicas and source objects. By
     *        default, S3 on Outposts replicates metadata from the source objects to the replicas only. When replica
     *        modification sync is enabled, S3 on Outposts replicates metadata changes made to the replica copies back
     *        to the source object, making the replication bidirectional.</p>
     *        <p>
     *        To replicate object metadata modifications on replicas, you can specify this element and set the
     *        <code>Status</code> of this element to <code>Enabled</code>.
     *        </p>
     *        <note>
     *        <p>
     *        You must enable replica modification sync on the source and destination buckets to replicate replica
     *        metadata changes between the source and the replicas.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSelectionCriteria withReplicaModifications(ReplicaModifications replicaModifications) {
        setReplicaModifications(replicaModifications);
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
        if (getSseKmsEncryptedObjects() != null)
            sb.append("SseKmsEncryptedObjects: ").append(getSseKmsEncryptedObjects()).append(",");
        if (getReplicaModifications() != null)
            sb.append("ReplicaModifications: ").append(getReplicaModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceSelectionCriteria == false)
            return false;
        SourceSelectionCriteria other = (SourceSelectionCriteria) obj;
        if (other.getSseKmsEncryptedObjects() == null ^ this.getSseKmsEncryptedObjects() == null)
            return false;
        if (other.getSseKmsEncryptedObjects() != null && other.getSseKmsEncryptedObjects().equals(this.getSseKmsEncryptedObjects()) == false)
            return false;
        if (other.getReplicaModifications() == null ^ this.getReplicaModifications() == null)
            return false;
        if (other.getReplicaModifications() != null && other.getReplicaModifications().equals(this.getReplicaModifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSseKmsEncryptedObjects() == null) ? 0 : getSseKmsEncryptedObjects().hashCode());
        hashCode = prime * hashCode + ((getReplicaModifications() == null) ? 0 : getReplicaModifications().hashCode());
        return hashCode;
    }

    @Override
    public SourceSelectionCriteria clone() {
        try {
            return (SourceSelectionCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
