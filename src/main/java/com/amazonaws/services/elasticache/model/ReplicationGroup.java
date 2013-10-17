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
 * Contains all of the attributes of a specific replication group.
 * </p>
 */
public class ReplicationGroup implements Serializable {

    /**
     * The identifier for the replication group.
     */
    private String replicationGroupId;

    /**
     * The description of the replication group.
     */
    private String description;

    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     */
    private String status;

    /**
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     */
    private ReplicationGroupPendingModifiedValues pendingModifiedValues;

    /**
     * The names of all the cache clusters that are part of this replication
     * group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> memberClusters;

    /**
     * A single element list with information about the nodes in the
     * replication group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroup> nodeGroups;

    /**
     * The identifier for the replication group.
     *
     * @return The identifier for the replication group.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The identifier for the replication group.
     *
     * @param replicationGroupId The identifier for the replication group.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The identifier for the replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The identifier for the replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * The description of the replication group.
     *
     * @return The description of the replication group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the replication group.
     *
     * @param description The description of the replication group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     *
     * @return The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     *
     * @param status The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current state of this replication group - <i>creating</i>,
     * <i>available</i>, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current state of this replication group - <i>creating</i>,
     *         <i>available</i>, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     *
     * @return A group of settings to be applied to the replication group, either
     *         immediately or during the next maintenance window.
     */
    public ReplicationGroupPendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     *
     * @param pendingModifiedValues A group of settings to be applied to the replication group, either
     *         immediately or during the next maintenance window.
     */
    public void setPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * A group of settings to be applied to the replication group, either
     * immediately or during the next maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues A group of settings to be applied to the replication group, either
     *         immediately or during the next maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withPendingModifiedValues(ReplicationGroupPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * The names of all the cache clusters that are part of this replication
     * group.
     *
     * @return The names of all the cache clusters that are part of this replication
     *         group.
     */
    public java.util.List<String> getMemberClusters() {
        if (memberClusters == null) {
              memberClusters = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              memberClusters.setAutoConstruct(true);
        }
        return memberClusters;
    }
    
    /**
     * The names of all the cache clusters that are part of this replication
     * group.
     *
     * @param memberClusters The names of all the cache clusters that are part of this replication
     *         group.
     */
    public void setMemberClusters(java.util.Collection<String> memberClusters) {
        if (memberClusters == null) {
            this.memberClusters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> memberClustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(memberClusters.size());
        memberClustersCopy.addAll(memberClusters);
        this.memberClusters = memberClustersCopy;
    }
    
    /**
     * The names of all the cache clusters that are part of this replication
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memberClusters The names of all the cache clusters that are part of this replication
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withMemberClusters(String... memberClusters) {
        if (getMemberClusters() == null) setMemberClusters(new java.util.ArrayList<String>(memberClusters.length));
        for (String value : memberClusters) {
            getMemberClusters().add(value);
        }
        return this;
    }
    
    /**
     * The names of all the cache clusters that are part of this replication
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memberClusters The names of all the cache clusters that are part of this replication
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withMemberClusters(java.util.Collection<String> memberClusters) {
        if (memberClusters == null) {
            this.memberClusters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> memberClustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(memberClusters.size());
            memberClustersCopy.addAll(memberClusters);
            this.memberClusters = memberClustersCopy;
        }

        return this;
    }

    /**
     * A single element list with information about the nodes in the
     * replication group.
     *
     * @return A single element list with information about the nodes in the
     *         replication group.
     */
    public java.util.List<NodeGroup> getNodeGroups() {
        if (nodeGroups == null) {
              nodeGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroup>();
              nodeGroups.setAutoConstruct(true);
        }
        return nodeGroups;
    }
    
    /**
     * A single element list with information about the nodes in the
     * replication group.
     *
     * @param nodeGroups A single element list with information about the nodes in the
     *         replication group.
     */
    public void setNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        if (nodeGroups == null) {
            this.nodeGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroup> nodeGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroup>(nodeGroups.size());
        nodeGroupsCopy.addAll(nodeGroups);
        this.nodeGroups = nodeGroupsCopy;
    }
    
    /**
     * A single element list with information about the nodes in the
     * replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeGroups A single element list with information about the nodes in the
     *         replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withNodeGroups(NodeGroup... nodeGroups) {
        if (getNodeGroups() == null) setNodeGroups(new java.util.ArrayList<NodeGroup>(nodeGroups.length));
        for (NodeGroup value : nodeGroups) {
            getNodeGroups().add(value);
        }
        return this;
    }
    
    /**
     * A single element list with information about the nodes in the
     * replication group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeGroups A single element list with information about the nodes in the
     *         replication group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplicationGroup withNodeGroups(java.util.Collection<NodeGroup> nodeGroups) {
        if (nodeGroups == null) {
            this.nodeGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroup> nodeGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NodeGroup>(nodeGroups.size());
            nodeGroupsCopy.addAll(nodeGroups);
            this.nodeGroups = nodeGroupsCopy;
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
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPendingModifiedValues() != null) sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getMemberClusters() != null) sb.append("MemberClusters: " + getMemberClusters() + ",");
        if (getNodeGroups() != null) sb.append("NodeGroups: " + getNodeGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode()); 
        hashCode = prime * hashCode + ((getMemberClusters() == null) ? 0 : getMemberClusters().hashCode()); 
        hashCode = prime * hashCode + ((getNodeGroups() == null) ? 0 : getNodeGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplicationGroup == false) return false;
        ReplicationGroup other = (ReplicationGroup)obj;
        
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null) return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false) return false; 
        if (other.getMemberClusters() == null ^ this.getMemberClusters() == null) return false;
        if (other.getMemberClusters() != null && other.getMemberClusters().equals(this.getMemberClusters()) == false) return false; 
        if (other.getNodeGroups() == null ^ this.getNodeGroups() == null) return false;
        if (other.getNodeGroups() != null && other.getNodeGroups().equals(this.getNodeGroups()) == false) return false; 
        return true;
    }
    
}
    