/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createReplicationGroup(CreateReplicationGroupRequest) CreateReplicationGroup operation}.
 * <p>
 * The <i>CreateReplicationGroup</i> operation creates a replication group. A replication group is a collection of cache clusters, where one of the
 * clusters is a read/write primary and the other clusters are read-only replicas. Writes to the primary are automatically propagated to the replicas.
 * </p>
 * <p>
 * When you create a replication group, you must specify an existing cache cluster that is in the primary role. When the replication group has been
 * successfully created, you can add one or more read replica replicas to it, up to a total of five read replicas.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createReplicationGroup(CreateReplicationGroupRequest)
 */
public class CreateReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     */
    private String replicationGroupId;

    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>.
     */
    private String primaryClusterId;

    /**
     * A user-specified description for the replication group.
     */
    private String replicationGroupDescription;

    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     *
     * @return The replication group identifier. This parameter is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     *
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The replication group identifier. This parameter is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must contain from 1 to 20
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>.
     *
     * @return The identifier of the cache cluster that will serve as the primary for
     *         this replication group. This cache cluster must already exist and have
     *         a status of <i>available</i>.
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }
    
    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>.
     *
     * @param primaryClusterId The identifier of the cache cluster that will serve as the primary for
     *         this replication group. This cache cluster must already exist and have
     *         a status of <i>available</i>.
     */
    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }
    
    /**
     * The identifier of the cache cluster that will serve as the primary for
     * this replication group. This cache cluster must already exist and have
     * a status of <i>available</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param primaryClusterId The identifier of the cache cluster that will serve as the primary for
     *         this replication group. This cache cluster must already exist and have
     *         a status of <i>available</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReplicationGroupRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * A user-specified description for the replication group.
     *
     * @return A user-specified description for the replication group.
     */
    public String getReplicationGroupDescription() {
        return replicationGroupDescription;
    }
    
    /**
     * A user-specified description for the replication group.
     *
     * @param replicationGroupDescription A user-specified description for the replication group.
     */
    public void setReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }
    
    /**
     * A user-specified description for the replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupDescription A user-specified description for the replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReplicationGroupRequest withReplicationGroupDescription(String replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getPrimaryClusterId() != null) sb.append("PrimaryClusterId: " + getPrimaryClusterId() + ",");
        if (getReplicationGroupDescription() != null) sb.append("ReplicationGroupDescription: " + getReplicationGroupDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getPrimaryClusterId() == null) ? 0 : getPrimaryClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupDescription() == null) ? 0 : getReplicationGroupDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateReplicationGroupRequest == false) return false;
        CreateReplicationGroupRequest other = (CreateReplicationGroupRequest)obj;
        
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        if (other.getPrimaryClusterId() == null ^ this.getPrimaryClusterId() == null) return false;
        if (other.getPrimaryClusterId() != null && other.getPrimaryClusterId().equals(this.getPrimaryClusterId()) == false) return false; 
        if (other.getReplicationGroupDescription() == null ^ this.getReplicationGroupDescription() == null) return false;
        if (other.getReplicationGroupDescription() != null && other.getReplicationGroupDescription().equals(this.getReplicationGroupDescription()) == false) return false; 
        return true;
    }
    
}
    