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
 * The filter used to describe a set of objects for the job's manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobManifestGeneratorFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobManifestGeneratorFilter implements Serializable, Cloneable {

    /**
     * <p>
     * Include objects in the generated manifest only if they are eligible for replication according to the Replication
     * configuration on the source bucket.
     * </p>
     */
    private Boolean eligibleForReplication;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created after this time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created before this time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     */
    private java.util.List<String> objectReplicationStatuses;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose object keys match the string
     * constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     * <code>MatchAnySubstring</code>.
     * </p>
     */
    private KeyNameConstraint keyNameConstraint;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is greater than the
     * specified number of bytes.
     * </p>
     */
    private Long objectSizeGreaterThanBytes;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is less than the
     * specified number of bytes.
     * </p>
     */
    private Long objectSizeLessThanBytes;
    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that are stored with the specified
     * storage class.
     * </p>
     */
    private java.util.List<String> matchAnyStorageClass;

    /**
     * <p>
     * Include objects in the generated manifest only if they are eligible for replication according to the Replication
     * configuration on the source bucket.
     * </p>
     * 
     * @param eligibleForReplication
     *        Include objects in the generated manifest only if they are eligible for replication according to the
     *        Replication configuration on the source bucket.
     */

    public void setEligibleForReplication(Boolean eligibleForReplication) {
        this.eligibleForReplication = eligibleForReplication;
    }

    /**
     * <p>
     * Include objects in the generated manifest only if they are eligible for replication according to the Replication
     * configuration on the source bucket.
     * </p>
     * 
     * @return Include objects in the generated manifest only if they are eligible for replication according to the
     *         Replication configuration on the source bucket.
     */

    public Boolean getEligibleForReplication() {
        return this.eligibleForReplication;
    }

    /**
     * <p>
     * Include objects in the generated manifest only if they are eligible for replication according to the Replication
     * configuration on the source bucket.
     * </p>
     * 
     * @param eligibleForReplication
     *        Include objects in the generated manifest only if they are eligible for replication according to the
     *        Replication configuration on the source bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withEligibleForReplication(Boolean eligibleForReplication) {
        setEligibleForReplication(eligibleForReplication);
        return this;
    }

    /**
     * <p>
     * Include objects in the generated manifest only if they are eligible for replication according to the Replication
     * configuration on the source bucket.
     * </p>
     * 
     * @return Include objects in the generated manifest only if they are eligible for replication according to the
     *         Replication configuration on the source bucket.
     */

    public Boolean isEligibleForReplication() {
        return this.eligibleForReplication;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created after this time.
     * </p>
     * 
     * @param createdAfter
     *        If provided, the generated manifest includes only source bucket objects that were created after this time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created after this time.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects that were created after this
     *         time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created after this time.
     * </p>
     * 
     * @param createdAfter
     *        If provided, the generated manifest includes only source bucket objects that were created after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created before this time.
     * </p>
     * 
     * @param createdBefore
     *        If provided, the generated manifest includes only source bucket objects that were created before this
     *        time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created before this time.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects that were created before this
     *         time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that were created before this time.
     * </p>
     * 
     * @param createdBefore
     *        If provided, the generated manifest includes only source bucket objects that were created before this
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects that have one of the specified
     *         Replication statuses.
     * @see ReplicationStatus
     */

    public java.util.List<String> getObjectReplicationStatuses() {
        return objectReplicationStatuses;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest includes only source bucket objects that have one of the specified
     *        Replication statuses.
     * @see ReplicationStatus
     */

    public void setObjectReplicationStatuses(java.util.Collection<String> objectReplicationStatuses) {
        if (objectReplicationStatuses == null) {
            this.objectReplicationStatuses = null;
            return;
        }

        this.objectReplicationStatuses = new java.util.ArrayList<String>(objectReplicationStatuses);
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectReplicationStatuses(java.util.Collection)} or
     * {@link #withObjectReplicationStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest includes only source bucket objects that have one of the specified
     *        Replication statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public JobManifestGeneratorFilter withObjectReplicationStatuses(String... objectReplicationStatuses) {
        if (this.objectReplicationStatuses == null) {
            setObjectReplicationStatuses(new java.util.ArrayList<String>(objectReplicationStatuses.length));
        }
        for (String ele : objectReplicationStatuses) {
            this.objectReplicationStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest includes only source bucket objects that have one of the specified
     *        Replication statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public JobManifestGeneratorFilter withObjectReplicationStatuses(java.util.Collection<String> objectReplicationStatuses) {
        setObjectReplicationStatuses(objectReplicationStatuses);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest includes only source bucket objects that have one of the specified
     *        Replication statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public JobManifestGeneratorFilter withObjectReplicationStatuses(ReplicationStatus... objectReplicationStatuses) {
        java.util.ArrayList<String> objectReplicationStatusesCopy = new java.util.ArrayList<String>(objectReplicationStatuses.length);
        for (ReplicationStatus value : objectReplicationStatuses) {
            objectReplicationStatusesCopy.add(value.toString());
        }
        if (getObjectReplicationStatuses() == null) {
            setObjectReplicationStatuses(objectReplicationStatusesCopy);
        } else {
            getObjectReplicationStatuses().addAll(objectReplicationStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose object keys match the string
     * constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     * <code>MatchAnySubstring</code>.
     * </p>
     * 
     * @param keyNameConstraint
     *        If provided, the generated manifest includes only source bucket objects whose object keys match the string
     *        constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     *        <code>MatchAnySubstring</code>.
     */

    public void setKeyNameConstraint(KeyNameConstraint keyNameConstraint) {
        this.keyNameConstraint = keyNameConstraint;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose object keys match the string
     * constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     * <code>MatchAnySubstring</code>.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects whose object keys match the
     *         string constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     *         <code>MatchAnySubstring</code>.
     */

    public KeyNameConstraint getKeyNameConstraint() {
        return this.keyNameConstraint;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose object keys match the string
     * constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     * <code>MatchAnySubstring</code>.
     * </p>
     * 
     * @param keyNameConstraint
     *        If provided, the generated manifest includes only source bucket objects whose object keys match the string
     *        constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
     *        <code>MatchAnySubstring</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withKeyNameConstraint(KeyNameConstraint keyNameConstraint) {
        setKeyNameConstraint(keyNameConstraint);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is greater than the
     * specified number of bytes.
     * </p>
     * 
     * @param objectSizeGreaterThanBytes
     *        If provided, the generated manifest includes only source bucket objects whose file size is greater than
     *        the specified number of bytes.
     */

    public void setObjectSizeGreaterThanBytes(Long objectSizeGreaterThanBytes) {
        this.objectSizeGreaterThanBytes = objectSizeGreaterThanBytes;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is greater than the
     * specified number of bytes.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects whose file size is greater than
     *         the specified number of bytes.
     */

    public Long getObjectSizeGreaterThanBytes() {
        return this.objectSizeGreaterThanBytes;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is greater than the
     * specified number of bytes.
     * </p>
     * 
     * @param objectSizeGreaterThanBytes
     *        If provided, the generated manifest includes only source bucket objects whose file size is greater than
     *        the specified number of bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withObjectSizeGreaterThanBytes(Long objectSizeGreaterThanBytes) {
        setObjectSizeGreaterThanBytes(objectSizeGreaterThanBytes);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is less than the
     * specified number of bytes.
     * </p>
     * 
     * @param objectSizeLessThanBytes
     *        If provided, the generated manifest includes only source bucket objects whose file size is less than the
     *        specified number of bytes.
     */

    public void setObjectSizeLessThanBytes(Long objectSizeLessThanBytes) {
        this.objectSizeLessThanBytes = objectSizeLessThanBytes;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is less than the
     * specified number of bytes.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects whose file size is less than the
     *         specified number of bytes.
     */

    public Long getObjectSizeLessThanBytes() {
        return this.objectSizeLessThanBytes;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects whose file size is less than the
     * specified number of bytes.
     * </p>
     * 
     * @param objectSizeLessThanBytes
     *        If provided, the generated manifest includes only source bucket objects whose file size is less than the
     *        specified number of bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withObjectSizeLessThanBytes(Long objectSizeLessThanBytes) {
        setObjectSizeLessThanBytes(objectSizeLessThanBytes);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that are stored with the specified
     * storage class.
     * </p>
     * 
     * @return If provided, the generated manifest includes only source bucket objects that are stored with the
     *         specified storage class.
     * @see S3StorageClass
     */

    public java.util.List<String> getMatchAnyStorageClass() {
        return matchAnyStorageClass;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that are stored with the specified
     * storage class.
     * </p>
     * 
     * @param matchAnyStorageClass
     *        If provided, the generated manifest includes only source bucket objects that are stored with the specified
     *        storage class.
     * @see S3StorageClass
     */

    public void setMatchAnyStorageClass(java.util.Collection<String> matchAnyStorageClass) {
        if (matchAnyStorageClass == null) {
            this.matchAnyStorageClass = null;
            return;
        }

        this.matchAnyStorageClass = new java.util.ArrayList<String>(matchAnyStorageClass);
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that are stored with the specified
     * storage class.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnyStorageClass(java.util.Collection)} or {@link #withMatchAnyStorageClass(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param matchAnyStorageClass
     *        If provided, the generated manifest includes only source bucket objects that are stored with the specified
     *        storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public JobManifestGeneratorFilter withMatchAnyStorageClass(String... matchAnyStorageClass) {
        if (this.matchAnyStorageClass == null) {
            setMatchAnyStorageClass(new java.util.ArrayList<String>(matchAnyStorageClass.length));
        }
        for (String ele : matchAnyStorageClass) {
            this.matchAnyStorageClass.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that are stored with the specified
     * storage class.
     * </p>
     * 
     * @param matchAnyStorageClass
     *        If provided, the generated manifest includes only source bucket objects that are stored with the specified
     *        storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public JobManifestGeneratorFilter withMatchAnyStorageClass(java.util.Collection<String> matchAnyStorageClass) {
        setMatchAnyStorageClass(matchAnyStorageClass);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes only source bucket objects that are stored with the specified
     * storage class.
     * </p>
     * 
     * @param matchAnyStorageClass
     *        If provided, the generated manifest includes only source bucket objects that are stored with the specified
     *        storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public JobManifestGeneratorFilter withMatchAnyStorageClass(S3StorageClass... matchAnyStorageClass) {
        java.util.ArrayList<String> matchAnyStorageClassCopy = new java.util.ArrayList<String>(matchAnyStorageClass.length);
        for (S3StorageClass value : matchAnyStorageClass) {
            matchAnyStorageClassCopy.add(value.toString());
        }
        if (getMatchAnyStorageClass() == null) {
            setMatchAnyStorageClass(matchAnyStorageClassCopy);
        } else {
            getMatchAnyStorageClass().addAll(matchAnyStorageClassCopy);
        }
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
        if (getEligibleForReplication() != null)
            sb.append("EligibleForReplication: ").append(getEligibleForReplication()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getObjectReplicationStatuses() != null)
            sb.append("ObjectReplicationStatuses: ").append(getObjectReplicationStatuses()).append(",");
        if (getKeyNameConstraint() != null)
            sb.append("KeyNameConstraint: ").append(getKeyNameConstraint()).append(",");
        if (getObjectSizeGreaterThanBytes() != null)
            sb.append("ObjectSizeGreaterThanBytes: ").append(getObjectSizeGreaterThanBytes()).append(",");
        if (getObjectSizeLessThanBytes() != null)
            sb.append("ObjectSizeLessThanBytes: ").append(getObjectSizeLessThanBytes()).append(",");
        if (getMatchAnyStorageClass() != null)
            sb.append("MatchAnyStorageClass: ").append(getMatchAnyStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobManifestGeneratorFilter == false)
            return false;
        JobManifestGeneratorFilter other = (JobManifestGeneratorFilter) obj;
        if (other.getEligibleForReplication() == null ^ this.getEligibleForReplication() == null)
            return false;
        if (other.getEligibleForReplication() != null && other.getEligibleForReplication().equals(this.getEligibleForReplication()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getObjectReplicationStatuses() == null ^ this.getObjectReplicationStatuses() == null)
            return false;
        if (other.getObjectReplicationStatuses() != null && other.getObjectReplicationStatuses().equals(this.getObjectReplicationStatuses()) == false)
            return false;
        if (other.getKeyNameConstraint() == null ^ this.getKeyNameConstraint() == null)
            return false;
        if (other.getKeyNameConstraint() != null && other.getKeyNameConstraint().equals(this.getKeyNameConstraint()) == false)
            return false;
        if (other.getObjectSizeGreaterThanBytes() == null ^ this.getObjectSizeGreaterThanBytes() == null)
            return false;
        if (other.getObjectSizeGreaterThanBytes() != null && other.getObjectSizeGreaterThanBytes().equals(this.getObjectSizeGreaterThanBytes()) == false)
            return false;
        if (other.getObjectSizeLessThanBytes() == null ^ this.getObjectSizeLessThanBytes() == null)
            return false;
        if (other.getObjectSizeLessThanBytes() != null && other.getObjectSizeLessThanBytes().equals(this.getObjectSizeLessThanBytes()) == false)
            return false;
        if (other.getMatchAnyStorageClass() == null ^ this.getMatchAnyStorageClass() == null)
            return false;
        if (other.getMatchAnyStorageClass() != null && other.getMatchAnyStorageClass().equals(this.getMatchAnyStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEligibleForReplication() == null) ? 0 : getEligibleForReplication().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getObjectReplicationStatuses() == null) ? 0 : getObjectReplicationStatuses().hashCode());
        hashCode = prime * hashCode + ((getKeyNameConstraint() == null) ? 0 : getKeyNameConstraint().hashCode());
        hashCode = prime * hashCode + ((getObjectSizeGreaterThanBytes() == null) ? 0 : getObjectSizeGreaterThanBytes().hashCode());
        hashCode = prime * hashCode + ((getObjectSizeLessThanBytes() == null) ? 0 : getObjectSizeLessThanBytes().hashCode());
        hashCode = prime * hashCode + ((getMatchAnyStorageClass() == null) ? 0 : getMatchAnyStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public JobManifestGeneratorFilter clone() {
        try {
            return (JobManifestGeneratorFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
