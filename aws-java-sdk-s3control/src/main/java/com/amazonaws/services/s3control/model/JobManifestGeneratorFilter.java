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
     * If provided, the generated manifest should include only source bucket objects that were created after this time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that were created before this time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     */
    private java.util.List<String> objectReplicationStatuses;

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
     * If provided, the generated manifest should include only source bucket objects that were created after this time.
     * </p>
     * 
     * @param createdAfter
     *        If provided, the generated manifest should include only source bucket objects that were created after this
     *        time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that were created after this time.
     * </p>
     * 
     * @return If provided, the generated manifest should include only source bucket objects that were created after
     *         this time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that were created after this time.
     * </p>
     * 
     * @param createdAfter
     *        If provided, the generated manifest should include only source bucket objects that were created after this
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that were created before this time.
     * </p>
     * 
     * @param createdBefore
     *        If provided, the generated manifest should include only source bucket objects that were created before
     *        this time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that were created before this time.
     * </p>
     * 
     * @return If provided, the generated manifest should include only source bucket objects that were created before
     *         this time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that were created before this time.
     * </p>
     * 
     * @param createdBefore
     *        If provided, the generated manifest should include only source bucket objects that were created before
     *        this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobManifestGeneratorFilter withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @return If provided, the generated manifest should include only source bucket objects that have one of the
     *         specified Replication statuses.
     * @see ReplicationStatus
     */

    public java.util.List<String> getObjectReplicationStatuses() {
        return objectReplicationStatuses;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest should include only source bucket objects that have one of the
     *        specified Replication statuses.
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
     * If provided, the generated manifest should include only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectReplicationStatuses(java.util.Collection)} or
     * {@link #withObjectReplicationStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest should include only source bucket objects that have one of the
     *        specified Replication statuses.
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
     * If provided, the generated manifest should include only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest should include only source bucket objects that have one of the
     *        specified Replication statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public JobManifestGeneratorFilter withObjectReplicationStatuses(java.util.Collection<String> objectReplicationStatuses) {
        setObjectReplicationStatuses(objectReplicationStatuses);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest should include only source bucket objects that have one of the specified
     * Replication statuses.
     * </p>
     * 
     * @param objectReplicationStatuses
     *        If provided, the generated manifest should include only source bucket objects that have one of the
     *        specified Replication statuses.
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
            sb.append("ObjectReplicationStatuses: ").append(getObjectReplicationStatuses());
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
