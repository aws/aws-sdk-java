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


/**
 * <p>
 * Represents the output of a <i>DescribeReplicationGroups</i> operation.
 * </p>
 */
public class DescribeReplicationGroupsResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReplicationGroup> replicationGroups;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @return Provides an identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReplicationGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     *
     * @return A list of replication groups. Each item in the list contains detailed
     *         information about one replication group.
     */
    public java.util.List<ReplicationGroup> getReplicationGroups() {
        if (replicationGroups == null) {
              replicationGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplicationGroup>();
              replicationGroups.setAutoConstruct(true);
        }
        return replicationGroups;
    }
    
    /**
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     *
     * @param replicationGroups A list of replication groups. Each item in the list contains detailed
     *         information about one replication group.
     */
    public void setReplicationGroups(java.util.Collection<ReplicationGroup> replicationGroups) {
        if (replicationGroups == null) {
            this.replicationGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReplicationGroup> replicationGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplicationGroup>(replicationGroups.size());
        replicationGroupsCopy.addAll(replicationGroups);
        this.replicationGroups = replicationGroupsCopy;
    }
    
    /**
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroups A list of replication groups. Each item in the list contains detailed
     *         information about one replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReplicationGroupsResult withReplicationGroups(ReplicationGroup... replicationGroups) {
        if (getReplicationGroups() == null) setReplicationGroups(new java.util.ArrayList<ReplicationGroup>(replicationGroups.length));
        for (ReplicationGroup value : replicationGroups) {
            getReplicationGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of replication groups. Each item in the list contains detailed
     * information about one replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroups A list of replication groups. Each item in the list contains detailed
     *         information about one replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReplicationGroupsResult withReplicationGroups(java.util.Collection<ReplicationGroup> replicationGroups) {
        if (replicationGroups == null) {
            this.replicationGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReplicationGroup> replicationGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplicationGroup>(replicationGroups.size());
            replicationGroupsCopy.addAll(replicationGroups);
            this.replicationGroups = replicationGroupsCopy;
        }

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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getReplicationGroups() != null) sb.append("ReplicationGroups: " + getReplicationGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroups() == null) ? 0 : getReplicationGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReplicationGroupsResult == false) return false;
        DescribeReplicationGroupsResult other = (DescribeReplicationGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getReplicationGroups() == null ^ this.getReplicationGroups() == null) return false;
        if (other.getReplicationGroups() != null && other.getReplicationGroups().equals(this.getReplicationGroups()) == false) return false; 
        return true;
    }
    
}
    