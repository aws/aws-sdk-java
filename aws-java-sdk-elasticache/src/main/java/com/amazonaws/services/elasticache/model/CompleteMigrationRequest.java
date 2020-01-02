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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CompleteMigration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteMigrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the replication group to which data is being migrated.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to
     * abort the migration and not recommended when application wants to continue migration to ElastiCache.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the replication group to which data is being migrated.
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group to which data is being migrated.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which data is being migrated.
     * </p>
     * 
     * @return The ID of the replication group to which data is being migrated.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group to which data is being migrated.
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group to which data is being migrated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMigrationRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to
     * abort the migration and not recommended when application wants to continue migration to ElastiCache.
     * </p>
     * 
     * @param force
     *        Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option
     *        only to abort the migration and not recommended when application wants to continue migration to
     *        ElastiCache.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to
     * abort the migration and not recommended when application wants to continue migration to ElastiCache.
     * </p>
     * 
     * @return Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option
     *         only to abort the migration and not recommended when application wants to continue migration to
     *         ElastiCache.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to
     * abort the migration and not recommended when application wants to continue migration to ElastiCache.
     * </p>
     * 
     * @param force
     *        Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option
     *        only to abort the migration and not recommended when application wants to continue migration to
     *        ElastiCache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMigrationRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to
     * abort the migration and not recommended when application wants to continue migration to ElastiCache.
     * </p>
     * 
     * @return Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option
     *         only to abort the migration and not recommended when application wants to continue migration to
     *         ElastiCache.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteMigrationRequest == false)
            return false;
        CompleteMigrationRequest other = (CompleteMigrationRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public CompleteMigrationRequest clone() {
        return (CompleteMigrationRequest) super.clone();
    }

}
