/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents a single node within a node group (shard).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/NodeGroupMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupMember implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     * </p>
     */
    private String cacheNodeId;
    /**
     * <p>
     * The information required for client programs to connect to a node for read operations. The read endpoint is only
     * applicable on Redis (cluster mode disabled) clusters.
     * </p>
     */
    private Endpoint readEndpoint;
    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     */
    private String preferredAvailabilityZone;
    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This member is
     * only applicable for Redis (cluster mode disabled) replication groups.
     * </p>
     */
    private String currentRole;

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     * 
     * @param cacheClusterId
     *        The ID of the cluster to which the node belongs.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     * 
     * @return The ID of the cluster to which the node belongs.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cluster to which the node belongs.
     * </p>
     * 
     * @param cacheClusterId
     *        The ID of the cluster to which the node belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMember withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeId
     *        The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     */

    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @return The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     */

    public String getCacheNodeId() {
        return this.cacheNodeId;
    }

    /**
     * <p>
     * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeId
     *        The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMember withCacheNodeId(String cacheNodeId) {
        setCacheNodeId(cacheNodeId);
        return this;
    }

    /**
     * <p>
     * The information required for client programs to connect to a node for read operations. The read endpoint is only
     * applicable on Redis (cluster mode disabled) clusters.
     * </p>
     * 
     * @param readEndpoint
     *        The information required for client programs to connect to a node for read operations. The read endpoint
     *        is only applicable on Redis (cluster mode disabled) clusters.
     */

    public void setReadEndpoint(Endpoint readEndpoint) {
        this.readEndpoint = readEndpoint;
    }

    /**
     * <p>
     * The information required for client programs to connect to a node for read operations. The read endpoint is only
     * applicable on Redis (cluster mode disabled) clusters.
     * </p>
     * 
     * @return The information required for client programs to connect to a node for read operations. The read endpoint
     *         is only applicable on Redis (cluster mode disabled) clusters.
     */

    public Endpoint getReadEndpoint() {
        return this.readEndpoint;
    }

    /**
     * <p>
     * The information required for client programs to connect to a node for read operations. The read endpoint is only
     * applicable on Redis (cluster mode disabled) clusters.
     * </p>
     * 
     * @param readEndpoint
     *        The information required for client programs to connect to a node for read operations. The read endpoint
     *        is only applicable on Redis (cluster mode disabled) clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMember withReadEndpoint(Endpoint readEndpoint) {
        setReadEndpoint(readEndpoint);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the node is located.
     */

    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     * 
     * @return The name of the Availability Zone in which the node is located.
     */

    public String getPreferredAvailabilityZone() {
        return this.preferredAvailabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the node is located.
     * </p>
     * 
     * @param preferredAvailabilityZone
     *        The name of the Availability Zone in which the node is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMember withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        setPreferredAvailabilityZone(preferredAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This member is
     * only applicable for Redis (cluster mode disabled) replication groups.
     * </p>
     * 
     * @param currentRole
     *        The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This
     *        member is only applicable for Redis (cluster mode disabled) replication groups.
     */

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This member is
     * only applicable for Redis (cluster mode disabled) replication groups.
     * </p>
     * 
     * @return The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This
     *         member is only applicable for Redis (cluster mode disabled) replication groups.
     */

    public String getCurrentRole() {
        return this.currentRole;
    }

    /**
     * <p>
     * The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This member is
     * only applicable for Redis (cluster mode disabled) replication groups.
     * </p>
     * 
     * @param currentRole
     *        The role that is currently assigned to the node - <code>primary</code> or <code>replica</code>. This
     *        member is only applicable for Redis (cluster mode disabled) replication groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMember withCurrentRole(String currentRole) {
        setCurrentRole(currentRole);
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getCacheNodeId() != null)
            sb.append("CacheNodeId: ").append(getCacheNodeId()).append(",");
        if (getReadEndpoint() != null)
            sb.append("ReadEndpoint: ").append(getReadEndpoint()).append(",");
        if (getPreferredAvailabilityZone() != null)
            sb.append("PreferredAvailabilityZone: ").append(getPreferredAvailabilityZone()).append(",");
        if (getCurrentRole() != null)
            sb.append("CurrentRole: ").append(getCurrentRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupMember == false)
            return false;
        NodeGroupMember other = (NodeGroupMember) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getReadEndpoint() == null ^ this.getReadEndpoint() == null)
            return false;
        if (other.getReadEndpoint() != null && other.getReadEndpoint().equals(this.getReadEndpoint()) == false)
            return false;
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null)
            return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false)
            return false;
        if (other.getCurrentRole() == null ^ this.getCurrentRole() == null)
            return false;
        if (other.getCurrentRole() != null && other.getCurrentRole().equals(this.getCurrentRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode());
        hashCode = prime * hashCode + ((getReadEndpoint() == null) ? 0 : getReadEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCurrentRole() == null) ? 0 : getCurrentRole().hashCode());
        return hashCode;
    }

    @Override
    public NodeGroupMember clone() {
        try {
            return (NodeGroupMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
