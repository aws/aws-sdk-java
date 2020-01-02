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
 * The status of the service update for a specific replication group
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/UpdateAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAction implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the replication group
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The date the update is first available
     * </p>
     */
    private java.util.Date serviceUpdateReleaseDate;
    /**
     * <p>
     * The severity of the service update
     * </p>
     */
    private String serviceUpdateSeverity;
    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private String serviceUpdateStatus;
    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance. For information on compliance, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     */
    private java.util.Date serviceUpdateRecommendedApplyByDate;
    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     */
    private String serviceUpdateType;
    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     */
    private java.util.Date updateActionAvailableDate;
    /**
     * <p>
     * The status of the update action
     * </p>
     */
    private String updateActionStatus;
    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     */
    private String nodesUpdated;
    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     */
    private java.util.Date updateActionStatusModifiedDate;
    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least
     * one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication
     * group was created after the recommended apply-by date.
     * </p>
     */
    private String slaMet;
    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeGroupUpdateStatus> nodeGroupUpdateStatus;
    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheNodeUpdateStatus> cacheNodeUpdateStatus;
    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     */
    private String estimatedUpdateTime;
    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * 
     * @return The ID of the replication group
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * 
     * @param cacheClusterId
     *        The ID of the cache cluster
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * 
     * @return The ID of the cache cluster
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * 
     * @param cacheClusterId
     *        The ID of the cache cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The date the update is first available
     * </p>
     * 
     * @param serviceUpdateReleaseDate
     *        The date the update is first available
     */

    public void setServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date the update is first available
     * </p>
     * 
     * @return The date the update is first available
     */

    public java.util.Date getServiceUpdateReleaseDate() {
        return this.serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date the update is first available
     * </p>
     * 
     * @param serviceUpdateReleaseDate
     *        The date the update is first available
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        setServiceUpdateReleaseDate(serviceUpdateReleaseDate);
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @param serviceUpdateSeverity
     *        The severity of the service update
     * @see ServiceUpdateSeverity
     */

    public void setServiceUpdateSeverity(String serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @return The severity of the service update
     * @see ServiceUpdateSeverity
     */

    public String getServiceUpdateSeverity() {
        return this.serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @param serviceUpdateSeverity
     *        The severity of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateSeverity
     */

    public UpdateAction withServiceUpdateSeverity(String serviceUpdateSeverity) {
        setServiceUpdateSeverity(serviceUpdateSeverity);
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @param serviceUpdateSeverity
     *        The severity of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateSeverity
     */

    public UpdateAction withServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @see ServiceUpdateStatus
     */

    public void setServiceUpdateStatus(String serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @return The status of the service update
     * @see ServiceUpdateStatus
     */

    public String getServiceUpdateStatus() {
        return this.serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public UpdateAction withServiceUpdateStatus(String serviceUpdateStatus) {
        setServiceUpdateStatus(serviceUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public UpdateAction withServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance. For information on compliance, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * 
     * @param serviceUpdateRecommendedApplyByDate
     *        The recommended date to apply the service update to ensure compliance. For information on compliance, see
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *        >Self-Service Security Updates for Compliance</a>.
     */

    public void setServiceUpdateRecommendedApplyByDate(java.util.Date serviceUpdateRecommendedApplyByDate) {
        this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance. For information on compliance, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * 
     * @return The recommended date to apply the service update to ensure compliance. For information on compliance, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *         >Self-Service Security Updates for Compliance</a>.
     */

    public java.util.Date getServiceUpdateRecommendedApplyByDate() {
        return this.serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance. For information on compliance, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * 
     * @param serviceUpdateRecommendedApplyByDate
     *        The recommended date to apply the service update to ensure compliance. For information on compliance, see
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *        >Self-Service Security Updates for Compliance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withServiceUpdateRecommendedApplyByDate(java.util.Date serviceUpdateRecommendedApplyByDate) {
        setServiceUpdateRecommendedApplyByDate(serviceUpdateRecommendedApplyByDate);
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param serviceUpdateType
     *        Reflects the nature of the service update
     * @see ServiceUpdateType
     */

    public void setServiceUpdateType(String serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @return Reflects the nature of the service update
     * @see ServiceUpdateType
     */

    public String getServiceUpdateType() {
        return this.serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param serviceUpdateType
     *        Reflects the nature of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateType
     */

    public UpdateAction withServiceUpdateType(String serviceUpdateType) {
        setServiceUpdateType(serviceUpdateType);
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param serviceUpdateType
     *        Reflects the nature of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateType
     */

    public UpdateAction withServiceUpdateType(ServiceUpdateType serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType.toString();
        return this;
    }

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     * 
     * @param updateActionAvailableDate
     *        The date that the service update is available to a replication group
     */

    public void setUpdateActionAvailableDate(java.util.Date updateActionAvailableDate) {
        this.updateActionAvailableDate = updateActionAvailableDate;
    }

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     * 
     * @return The date that the service update is available to a replication group
     */

    public java.util.Date getUpdateActionAvailableDate() {
        return this.updateActionAvailableDate;
    }

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     * 
     * @param updateActionAvailableDate
     *        The date that the service update is available to a replication group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withUpdateActionAvailableDate(java.util.Date updateActionAvailableDate) {
        setUpdateActionAvailableDate(updateActionAvailableDate);
        return this;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action
     * @see UpdateActionStatus
     */

    public void setUpdateActionStatus(String updateActionStatus) {
        this.updateActionStatus = updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * 
     * @return The status of the update action
     * @see UpdateActionStatus
     */

    public String getUpdateActionStatus() {
        return this.updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public UpdateAction withUpdateActionStatus(String updateActionStatus) {
        setUpdateActionStatus(updateActionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public UpdateAction withUpdateActionStatus(UpdateActionStatus updateActionStatus) {
        this.updateActionStatus = updateActionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     * 
     * @param nodesUpdated
     *        The progress of the service update on the replication group
     */

    public void setNodesUpdated(String nodesUpdated) {
        this.nodesUpdated = nodesUpdated;
    }

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     * 
     * @return The progress of the service update on the replication group
     */

    public String getNodesUpdated() {
        return this.nodesUpdated;
    }

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     * 
     * @param nodesUpdated
     *        The progress of the service update on the replication group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withNodesUpdated(String nodesUpdated) {
        setNodesUpdated(nodesUpdated);
        return this;
    }

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     * 
     * @param updateActionStatusModifiedDate
     *        The date when the UpdateActionStatus was last modified
     */

    public void setUpdateActionStatusModifiedDate(java.util.Date updateActionStatusModifiedDate) {
        this.updateActionStatusModifiedDate = updateActionStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     * 
     * @return The date when the UpdateActionStatus was last modified
     */

    public java.util.Date getUpdateActionStatusModifiedDate() {
        return this.updateActionStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     * 
     * @param updateActionStatusModifiedDate
     *        The date when the UpdateActionStatus was last modified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withUpdateActionStatusModifiedDate(java.util.Date updateActionStatusModifiedDate) {
        setUpdateActionStatusModifiedDate(updateActionStatusModifiedDate);
        return this;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least
     * one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication
     * group was created after the recommended apply-by date.
     * </p>
     * 
     * @param slaMet
     *        If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at
     *        least one node in the replication group have not been updated by the recommended apply-by date. If N/A,
     *        the replication group was created after the recommended apply-by date.
     * @see SlaMet
     */

    public void setSlaMet(String slaMet) {
        this.slaMet = slaMet;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least
     * one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication
     * group was created after the recommended apply-by date.
     * </p>
     * 
     * @return If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at
     *         least one node in the replication group have not been updated by the recommended apply-by date. If N/A,
     *         the replication group was created after the recommended apply-by date.
     * @see SlaMet
     */

    public String getSlaMet() {
        return this.slaMet;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least
     * one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication
     * group was created after the recommended apply-by date.
     * </p>
     * 
     * @param slaMet
     *        If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at
     *        least one node in the replication group have not been updated by the recommended apply-by date. If N/A,
     *        the replication group was created after the recommended apply-by date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlaMet
     */

    public UpdateAction withSlaMet(String slaMet) {
        setSlaMet(slaMet);
        return this;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least
     * one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication
     * group was created after the recommended apply-by date.
     * </p>
     * 
     * @param slaMet
     *        If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at
     *        least one node in the replication group have not been updated by the recommended apply-by date. If N/A,
     *        the replication group was created after the recommended apply-by date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlaMet
     */

    public UpdateAction withSlaMet(SlaMet slaMet) {
        this.slaMet = slaMet.toString();
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     * 
     * @return The status of the service update on the node group
     */

    public java.util.List<NodeGroupUpdateStatus> getNodeGroupUpdateStatus() {
        if (nodeGroupUpdateStatus == null) {
            nodeGroupUpdateStatus = new com.amazonaws.internal.SdkInternalList<NodeGroupUpdateStatus>();
        }
        return nodeGroupUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     * 
     * @param nodeGroupUpdateStatus
     *        The status of the service update on the node group
     */

    public void setNodeGroupUpdateStatus(java.util.Collection<NodeGroupUpdateStatus> nodeGroupUpdateStatus) {
        if (nodeGroupUpdateStatus == null) {
            this.nodeGroupUpdateStatus = null;
            return;
        }

        this.nodeGroupUpdateStatus = new com.amazonaws.internal.SdkInternalList<NodeGroupUpdateStatus>(nodeGroupUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroupUpdateStatus(java.util.Collection)} or
     * {@link #withNodeGroupUpdateStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param nodeGroupUpdateStatus
     *        The status of the service update on the node group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withNodeGroupUpdateStatus(NodeGroupUpdateStatus... nodeGroupUpdateStatus) {
        if (this.nodeGroupUpdateStatus == null) {
            setNodeGroupUpdateStatus(new com.amazonaws.internal.SdkInternalList<NodeGroupUpdateStatus>(nodeGroupUpdateStatus.length));
        }
        for (NodeGroupUpdateStatus ele : nodeGroupUpdateStatus) {
            this.nodeGroupUpdateStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     * 
     * @param nodeGroupUpdateStatus
     *        The status of the service update on the node group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withNodeGroupUpdateStatus(java.util.Collection<NodeGroupUpdateStatus> nodeGroupUpdateStatus) {
        setNodeGroupUpdateStatus(nodeGroupUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     * 
     * @return The status of the service update on the cache node
     */

    public java.util.List<CacheNodeUpdateStatus> getCacheNodeUpdateStatus() {
        if (cacheNodeUpdateStatus == null) {
            cacheNodeUpdateStatus = new com.amazonaws.internal.SdkInternalList<CacheNodeUpdateStatus>();
        }
        return cacheNodeUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     * 
     * @param cacheNodeUpdateStatus
     *        The status of the service update on the cache node
     */

    public void setCacheNodeUpdateStatus(java.util.Collection<CacheNodeUpdateStatus> cacheNodeUpdateStatus) {
        if (cacheNodeUpdateStatus == null) {
            this.cacheNodeUpdateStatus = null;
            return;
        }

        this.cacheNodeUpdateStatus = new com.amazonaws.internal.SdkInternalList<CacheNodeUpdateStatus>(cacheNodeUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodeUpdateStatus(java.util.Collection)} or
     * {@link #withCacheNodeUpdateStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cacheNodeUpdateStatus
     *        The status of the service update on the cache node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withCacheNodeUpdateStatus(CacheNodeUpdateStatus... cacheNodeUpdateStatus) {
        if (this.cacheNodeUpdateStatus == null) {
            setCacheNodeUpdateStatus(new com.amazonaws.internal.SdkInternalList<CacheNodeUpdateStatus>(cacheNodeUpdateStatus.length));
        }
        for (CacheNodeUpdateStatus ele : cacheNodeUpdateStatus) {
            this.cacheNodeUpdateStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     * 
     * @param cacheNodeUpdateStatus
     *        The status of the service update on the cache node
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withCacheNodeUpdateStatus(java.util.Collection<CacheNodeUpdateStatus> cacheNodeUpdateStatus) {
        setCacheNodeUpdateStatus(cacheNodeUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     * 
     * @param estimatedUpdateTime
     *        The estimated length of time for the update to complete
     */

    public void setEstimatedUpdateTime(String estimatedUpdateTime) {
        this.estimatedUpdateTime = estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     * 
     * @return The estimated length of time for the update to complete
     */

    public String getEstimatedUpdateTime() {
        return this.estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     * 
     * @param estimatedUpdateTime
     *        The estimated length of time for the update to complete
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withEstimatedUpdateTime(String estimatedUpdateTime) {
        setEstimatedUpdateTime(estimatedUpdateTime);
        return this;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @param engine
     *        The Elasticache engine to which the update applies. Either Redis or Memcached
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @return The Elasticache engine to which the update applies. Either Redis or Memcached
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @param engine
     *        The Elasticache engine to which the update applies. Either Redis or Memcached
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAction withEngine(String engine) {
        setEngine(engine);
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getServiceUpdateReleaseDate() != null)
            sb.append("ServiceUpdateReleaseDate: ").append(getServiceUpdateReleaseDate()).append(",");
        if (getServiceUpdateSeverity() != null)
            sb.append("ServiceUpdateSeverity: ").append(getServiceUpdateSeverity()).append(",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: ").append(getServiceUpdateStatus()).append(",");
        if (getServiceUpdateRecommendedApplyByDate() != null)
            sb.append("ServiceUpdateRecommendedApplyByDate: ").append(getServiceUpdateRecommendedApplyByDate()).append(",");
        if (getServiceUpdateType() != null)
            sb.append("ServiceUpdateType: ").append(getServiceUpdateType()).append(",");
        if (getUpdateActionAvailableDate() != null)
            sb.append("UpdateActionAvailableDate: ").append(getUpdateActionAvailableDate()).append(",");
        if (getUpdateActionStatus() != null)
            sb.append("UpdateActionStatus: ").append(getUpdateActionStatus()).append(",");
        if (getNodesUpdated() != null)
            sb.append("NodesUpdated: ").append(getNodesUpdated()).append(",");
        if (getUpdateActionStatusModifiedDate() != null)
            sb.append("UpdateActionStatusModifiedDate: ").append(getUpdateActionStatusModifiedDate()).append(",");
        if (getSlaMet() != null)
            sb.append("SlaMet: ").append(getSlaMet()).append(",");
        if (getNodeGroupUpdateStatus() != null)
            sb.append("NodeGroupUpdateStatus: ").append(getNodeGroupUpdateStatus()).append(",");
        if (getCacheNodeUpdateStatus() != null)
            sb.append("CacheNodeUpdateStatus: ").append(getCacheNodeUpdateStatus()).append(",");
        if (getEstimatedUpdateTime() != null)
            sb.append("EstimatedUpdateTime: ").append(getEstimatedUpdateTime()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAction == false)
            return false;
        UpdateAction other = (UpdateAction) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getServiceUpdateReleaseDate() == null ^ this.getServiceUpdateReleaseDate() == null)
            return false;
        if (other.getServiceUpdateReleaseDate() != null && other.getServiceUpdateReleaseDate().equals(this.getServiceUpdateReleaseDate()) == false)
            return false;
        if (other.getServiceUpdateSeverity() == null ^ this.getServiceUpdateSeverity() == null)
            return false;
        if (other.getServiceUpdateSeverity() != null && other.getServiceUpdateSeverity().equals(this.getServiceUpdateSeverity()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() == null ^ this.getServiceUpdateRecommendedApplyByDate() == null)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() != null
                && other.getServiceUpdateRecommendedApplyByDate().equals(this.getServiceUpdateRecommendedApplyByDate()) == false)
            return false;
        if (other.getServiceUpdateType() == null ^ this.getServiceUpdateType() == null)
            return false;
        if (other.getServiceUpdateType() != null && other.getServiceUpdateType().equals(this.getServiceUpdateType()) == false)
            return false;
        if (other.getUpdateActionAvailableDate() == null ^ this.getUpdateActionAvailableDate() == null)
            return false;
        if (other.getUpdateActionAvailableDate() != null && other.getUpdateActionAvailableDate().equals(this.getUpdateActionAvailableDate()) == false)
            return false;
        if (other.getUpdateActionStatus() == null ^ this.getUpdateActionStatus() == null)
            return false;
        if (other.getUpdateActionStatus() != null && other.getUpdateActionStatus().equals(this.getUpdateActionStatus()) == false)
            return false;
        if (other.getNodesUpdated() == null ^ this.getNodesUpdated() == null)
            return false;
        if (other.getNodesUpdated() != null && other.getNodesUpdated().equals(this.getNodesUpdated()) == false)
            return false;
        if (other.getUpdateActionStatusModifiedDate() == null ^ this.getUpdateActionStatusModifiedDate() == null)
            return false;
        if (other.getUpdateActionStatusModifiedDate() != null
                && other.getUpdateActionStatusModifiedDate().equals(this.getUpdateActionStatusModifiedDate()) == false)
            return false;
        if (other.getSlaMet() == null ^ this.getSlaMet() == null)
            return false;
        if (other.getSlaMet() != null && other.getSlaMet().equals(this.getSlaMet()) == false)
            return false;
        if (other.getNodeGroupUpdateStatus() == null ^ this.getNodeGroupUpdateStatus() == null)
            return false;
        if (other.getNodeGroupUpdateStatus() != null && other.getNodeGroupUpdateStatus().equals(this.getNodeGroupUpdateStatus()) == false)
            return false;
        if (other.getCacheNodeUpdateStatus() == null ^ this.getCacheNodeUpdateStatus() == null)
            return false;
        if (other.getCacheNodeUpdateStatus() != null && other.getCacheNodeUpdateStatus().equals(this.getCacheNodeUpdateStatus()) == false)
            return false;
        if (other.getEstimatedUpdateTime() == null ^ this.getEstimatedUpdateTime() == null)
            return false;
        if (other.getEstimatedUpdateTime() != null && other.getEstimatedUpdateTime().equals(this.getEstimatedUpdateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateReleaseDate() == null) ? 0 : getServiceUpdateReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateSeverity() == null) ? 0 : getServiceUpdateSeverity().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateRecommendedApplyByDate() == null) ? 0 : getServiceUpdateRecommendedApplyByDate().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateType() == null) ? 0 : getServiceUpdateType().hashCode());
        hashCode = prime * hashCode + ((getUpdateActionAvailableDate() == null) ? 0 : getUpdateActionAvailableDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateActionStatus() == null) ? 0 : getUpdateActionStatus().hashCode());
        hashCode = prime * hashCode + ((getNodesUpdated() == null) ? 0 : getNodesUpdated().hashCode());
        hashCode = prime * hashCode + ((getUpdateActionStatusModifiedDate() == null) ? 0 : getUpdateActionStatusModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getSlaMet() == null) ? 0 : getSlaMet().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupUpdateStatus() == null) ? 0 : getNodeGroupUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeUpdateStatus() == null) ? 0 : getCacheNodeUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getEstimatedUpdateTime() == null) ? 0 : getEstimatedUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAction clone() {
        try {
            return (UpdateAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
