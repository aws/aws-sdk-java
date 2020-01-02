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

/**
 * <p>
 * The status of the service update on the node group member
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/NodeGroupMemberUpdateStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupMemberUpdateStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The cache cluster ID
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     */
    private String cacheNodeId;
    /**
     * <p>
     * The update status of the node
     * </p>
     */
    private String nodeUpdateStatus;
    /**
     * <p>
     * The deletion date of the node
     * </p>
     */
    private java.util.Date nodeDeletionDate;
    /**
     * <p>
     * The start date of the update for a node
     * </p>
     */
    private java.util.Date nodeUpdateStartDate;
    /**
     * <p>
     * The end date of the update for a node
     * </p>
     */
    private java.util.Date nodeUpdateEndDate;
    /**
     * <p>
     * Reflects whether the update was initiated by the customer or automatically applied
     * </p>
     */
    private String nodeUpdateInitiatedBy;
    /**
     * <p>
     * The date when the update is triggered
     * </p>
     */
    private java.util.Date nodeUpdateInitiatedDate;
    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified
     * </p>
     */
    private java.util.Date nodeUpdateStatusModifiedDate;

    /**
     * <p>
     * The cache cluster ID
     * </p>
     * 
     * @param cacheClusterId
     *        The cache cluster ID
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The cache cluster ID
     * </p>
     * 
     * @return The cache cluster ID
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The cache cluster ID
     * </p>
     * 
     * @param cacheClusterId
     *        The cache cluster ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     * 
     * @param cacheNodeId
     *        The node ID of the cache cluster
     */

    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     * 
     * @return The node ID of the cache cluster
     */

    public String getCacheNodeId() {
        return this.cacheNodeId;
    }

    /**
     * <p>
     * The node ID of the cache cluster
     * </p>
     * 
     * @param cacheNodeId
     *        The node ID of the cache cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withCacheNodeId(String cacheNodeId) {
        setCacheNodeId(cacheNodeId);
        return this;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * 
     * @param nodeUpdateStatus
     *        The update status of the node
     * @see NodeUpdateStatus
     */

    public void setNodeUpdateStatus(String nodeUpdateStatus) {
        this.nodeUpdateStatus = nodeUpdateStatus;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * 
     * @return The update status of the node
     * @see NodeUpdateStatus
     */

    public String getNodeUpdateStatus() {
        return this.nodeUpdateStatus;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * 
     * @param nodeUpdateStatus
     *        The update status of the node
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeUpdateStatus
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateStatus(String nodeUpdateStatus) {
        setNodeUpdateStatus(nodeUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The update status of the node
     * </p>
     * 
     * @param nodeUpdateStatus
     *        The update status of the node
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeUpdateStatus
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateStatus(NodeUpdateStatus nodeUpdateStatus) {
        this.nodeUpdateStatus = nodeUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The deletion date of the node
     * </p>
     * 
     * @param nodeDeletionDate
     *        The deletion date of the node
     */

    public void setNodeDeletionDate(java.util.Date nodeDeletionDate) {
        this.nodeDeletionDate = nodeDeletionDate;
    }

    /**
     * <p>
     * The deletion date of the node
     * </p>
     * 
     * @return The deletion date of the node
     */

    public java.util.Date getNodeDeletionDate() {
        return this.nodeDeletionDate;
    }

    /**
     * <p>
     * The deletion date of the node
     * </p>
     * 
     * @param nodeDeletionDate
     *        The deletion date of the node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withNodeDeletionDate(java.util.Date nodeDeletionDate) {
        setNodeDeletionDate(nodeDeletionDate);
        return this;
    }

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     * 
     * @param nodeUpdateStartDate
     *        The start date of the update for a node
     */

    public void setNodeUpdateStartDate(java.util.Date nodeUpdateStartDate) {
        this.nodeUpdateStartDate = nodeUpdateStartDate;
    }

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     * 
     * @return The start date of the update for a node
     */

    public java.util.Date getNodeUpdateStartDate() {
        return this.nodeUpdateStartDate;
    }

    /**
     * <p>
     * The start date of the update for a node
     * </p>
     * 
     * @param nodeUpdateStartDate
     *        The start date of the update for a node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateStartDate(java.util.Date nodeUpdateStartDate) {
        setNodeUpdateStartDate(nodeUpdateStartDate);
        return this;
    }

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     * 
     * @param nodeUpdateEndDate
     *        The end date of the update for a node
     */

    public void setNodeUpdateEndDate(java.util.Date nodeUpdateEndDate) {
        this.nodeUpdateEndDate = nodeUpdateEndDate;
    }

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     * 
     * @return The end date of the update for a node
     */

    public java.util.Date getNodeUpdateEndDate() {
        return this.nodeUpdateEndDate;
    }

    /**
     * <p>
     * The end date of the update for a node
     * </p>
     * 
     * @param nodeUpdateEndDate
     *        The end date of the update for a node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateEndDate(java.util.Date nodeUpdateEndDate) {
        setNodeUpdateEndDate(nodeUpdateEndDate);
        return this;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or automatically applied
     * </p>
     * 
     * @param nodeUpdateInitiatedBy
     *        Reflects whether the update was initiated by the customer or automatically applied
     * @see NodeUpdateInitiatedBy
     */

    public void setNodeUpdateInitiatedBy(String nodeUpdateInitiatedBy) {
        this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or automatically applied
     * </p>
     * 
     * @return Reflects whether the update was initiated by the customer or automatically applied
     * @see NodeUpdateInitiatedBy
     */

    public String getNodeUpdateInitiatedBy() {
        return this.nodeUpdateInitiatedBy;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or automatically applied
     * </p>
     * 
     * @param nodeUpdateInitiatedBy
     *        Reflects whether the update was initiated by the customer or automatically applied
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeUpdateInitiatedBy
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateInitiatedBy(String nodeUpdateInitiatedBy) {
        setNodeUpdateInitiatedBy(nodeUpdateInitiatedBy);
        return this;
    }

    /**
     * <p>
     * Reflects whether the update was initiated by the customer or automatically applied
     * </p>
     * 
     * @param nodeUpdateInitiatedBy
     *        Reflects whether the update was initiated by the customer or automatically applied
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeUpdateInitiatedBy
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateInitiatedBy(NodeUpdateInitiatedBy nodeUpdateInitiatedBy) {
        this.nodeUpdateInitiatedBy = nodeUpdateInitiatedBy.toString();
        return this;
    }

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     * 
     * @param nodeUpdateInitiatedDate
     *        The date when the update is triggered
     */

    public void setNodeUpdateInitiatedDate(java.util.Date nodeUpdateInitiatedDate) {
        this.nodeUpdateInitiatedDate = nodeUpdateInitiatedDate;
    }

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     * 
     * @return The date when the update is triggered
     */

    public java.util.Date getNodeUpdateInitiatedDate() {
        return this.nodeUpdateInitiatedDate;
    }

    /**
     * <p>
     * The date when the update is triggered
     * </p>
     * 
     * @param nodeUpdateInitiatedDate
     *        The date when the update is triggered
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateInitiatedDate(java.util.Date nodeUpdateInitiatedDate) {
        setNodeUpdateInitiatedDate(nodeUpdateInitiatedDate);
        return this;
    }

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified
     * </p>
     * 
     * @param nodeUpdateStatusModifiedDate
     *        The date when the NodeUpdateStatus was last modified
     */

    public void setNodeUpdateStatusModifiedDate(java.util.Date nodeUpdateStatusModifiedDate) {
        this.nodeUpdateStatusModifiedDate = nodeUpdateStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified
     * </p>
     * 
     * @return The date when the NodeUpdateStatus was last modified
     */

    public java.util.Date getNodeUpdateStatusModifiedDate() {
        return this.nodeUpdateStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the NodeUpdateStatus was last modified
     * </p>
     * 
     * @param nodeUpdateStatusModifiedDate
     *        The date when the NodeUpdateStatus was last modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupMemberUpdateStatus withNodeUpdateStatusModifiedDate(java.util.Date nodeUpdateStatusModifiedDate) {
        setNodeUpdateStatusModifiedDate(nodeUpdateStatusModifiedDate);
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
        if (getNodeUpdateStatus() != null)
            sb.append("NodeUpdateStatus: ").append(getNodeUpdateStatus()).append(",");
        if (getNodeDeletionDate() != null)
            sb.append("NodeDeletionDate: ").append(getNodeDeletionDate()).append(",");
        if (getNodeUpdateStartDate() != null)
            sb.append("NodeUpdateStartDate: ").append(getNodeUpdateStartDate()).append(",");
        if (getNodeUpdateEndDate() != null)
            sb.append("NodeUpdateEndDate: ").append(getNodeUpdateEndDate()).append(",");
        if (getNodeUpdateInitiatedBy() != null)
            sb.append("NodeUpdateInitiatedBy: ").append(getNodeUpdateInitiatedBy()).append(",");
        if (getNodeUpdateInitiatedDate() != null)
            sb.append("NodeUpdateInitiatedDate: ").append(getNodeUpdateInitiatedDate()).append(",");
        if (getNodeUpdateStatusModifiedDate() != null)
            sb.append("NodeUpdateStatusModifiedDate: ").append(getNodeUpdateStatusModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupMemberUpdateStatus == false)
            return false;
        NodeGroupMemberUpdateStatus other = (NodeGroupMemberUpdateStatus) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getNodeUpdateStatus() == null ^ this.getNodeUpdateStatus() == null)
            return false;
        if (other.getNodeUpdateStatus() != null && other.getNodeUpdateStatus().equals(this.getNodeUpdateStatus()) == false)
            return false;
        if (other.getNodeDeletionDate() == null ^ this.getNodeDeletionDate() == null)
            return false;
        if (other.getNodeDeletionDate() != null && other.getNodeDeletionDate().equals(this.getNodeDeletionDate()) == false)
            return false;
        if (other.getNodeUpdateStartDate() == null ^ this.getNodeUpdateStartDate() == null)
            return false;
        if (other.getNodeUpdateStartDate() != null && other.getNodeUpdateStartDate().equals(this.getNodeUpdateStartDate()) == false)
            return false;
        if (other.getNodeUpdateEndDate() == null ^ this.getNodeUpdateEndDate() == null)
            return false;
        if (other.getNodeUpdateEndDate() != null && other.getNodeUpdateEndDate().equals(this.getNodeUpdateEndDate()) == false)
            return false;
        if (other.getNodeUpdateInitiatedBy() == null ^ this.getNodeUpdateInitiatedBy() == null)
            return false;
        if (other.getNodeUpdateInitiatedBy() != null && other.getNodeUpdateInitiatedBy().equals(this.getNodeUpdateInitiatedBy()) == false)
            return false;
        if (other.getNodeUpdateInitiatedDate() == null ^ this.getNodeUpdateInitiatedDate() == null)
            return false;
        if (other.getNodeUpdateInitiatedDate() != null && other.getNodeUpdateInitiatedDate().equals(this.getNodeUpdateInitiatedDate()) == false)
            return false;
        if (other.getNodeUpdateStatusModifiedDate() == null ^ this.getNodeUpdateStatusModifiedDate() == null)
            return false;
        if (other.getNodeUpdateStatusModifiedDate() != null && other.getNodeUpdateStatusModifiedDate().equals(this.getNodeUpdateStatusModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode());
        hashCode = prime * hashCode + ((getNodeUpdateStatus() == null) ? 0 : getNodeUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getNodeDeletionDate() == null) ? 0 : getNodeDeletionDate().hashCode());
        hashCode = prime * hashCode + ((getNodeUpdateStartDate() == null) ? 0 : getNodeUpdateStartDate().hashCode());
        hashCode = prime * hashCode + ((getNodeUpdateEndDate() == null) ? 0 : getNodeUpdateEndDate().hashCode());
        hashCode = prime * hashCode + ((getNodeUpdateInitiatedBy() == null) ? 0 : getNodeUpdateInitiatedBy().hashCode());
        hashCode = prime * hashCode + ((getNodeUpdateInitiatedDate() == null) ? 0 : getNodeUpdateInitiatedDate().hashCode());
        hashCode = prime * hashCode + ((getNodeUpdateStatusModifiedDate() == null) ? 0 : getNodeUpdateStatusModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public NodeGroupMemberUpdateStatus clone() {
        try {
            return (NodeGroupMemberUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
