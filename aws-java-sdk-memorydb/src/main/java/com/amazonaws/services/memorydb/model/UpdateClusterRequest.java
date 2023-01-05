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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to update
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The description of the cluster to update
     * </p>
     */
    private String description;
    /**
     * <p>
     * The SecurityGroupIds to update
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     */
    private String maintenanceWindow;
    /**
     * <p>
     * The SNS topic ARN to update
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     * </p>
     */
    private String snsTopicStatus;
    /**
     * <p>
     * The name of the parameter group to update
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For example, if
     * you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * A valid node type that you want to scale this cluster up or down to.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but you
     * cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the
     * existing cluster and create it anew with the earlier engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The number of replicas that will reside in each shard
     * </p>
     */
    private ReplicaConfigurationRequest replicaConfiguration;
    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     */
    private ShardConfigurationRequest shardConfiguration;
    /**
     * <p>
     * The Access Control List that is associated with the cluster
     * </p>
     */
    private String aCLName;

    /**
     * <p>
     * The name of the cluster to update
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to update
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to update
     * </p>
     * 
     * @return The name of the cluster to update
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to update
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The description of the cluster to update
     * </p>
     * 
     * @param description
     *        The description of the cluster to update
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cluster to update
     * </p>
     * 
     * @return The description of the cluster to update
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the cluster to update
     * </p>
     * 
     * @param description
     *        The description of the cluster to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The SecurityGroupIds to update
     * </p>
     * 
     * @return The SecurityGroupIds to update
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The SecurityGroupIds to update
     * </p>
     * 
     * @param securityGroupIds
     *        The SecurityGroupIds to update
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The SecurityGroupIds to update
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The SecurityGroupIds to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The SecurityGroupIds to update
     * </p>
     * 
     * @param securityGroupIds
     *        The SecurityGroupIds to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * 
     * @param maintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period.</p>
     *        <p>
     *        Valid values for <code>ddd</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sun</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>wed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>thu</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sat</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>sun:23:00-mon:01:30</code>
     */

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * 
     * @return Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as
     *         a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *         minute period.</p>
     *         <p>
     *         Valid values for <code>ddd</code> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sun</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tue</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>wed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>thu</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sat</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>sun:23:00-mon:01:30</code>
     */

    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range
     * in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     * </p>
     * <p>
     * Valid values for <code>ddd</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sun</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>thu</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sat</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>sun:23:00-mon:01:30</code>
     * </p>
     * 
     * @param maintenanceWindow
     *        Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a
     *        range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     *        period.</p>
     *        <p>
     *        Valid values for <code>ddd</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sun</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>wed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>thu</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fri</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sat</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>sun:23:00-mon:01:30</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withMaintenanceWindow(String maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The SNS topic ARN to update
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic ARN to update
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic ARN to update
     * </p>
     * 
     * @return The SNS topic ARN to update
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic ARN to update
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic ARN to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     * </p>
     * 
     * @param snsTopicStatus
     *        The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     */

    public void setSnsTopicStatus(String snsTopicStatus) {
        this.snsTopicStatus = snsTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     * </p>
     * 
     * @return The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     */

    public String getSnsTopicStatus() {
        return this.snsTopicStatus;
    }

    /**
     * <p>
     * The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     * </p>
     * 
     * @param snsTopicStatus
     *        The status of the Amazon SNS notification topic. Notifications are sent only if the status is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSnsTopicStatus(String snsTopicStatus) {
        setSnsTopicStatus(snsTopicStatus);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to update
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group to update
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to update
     * </p>
     * 
     * @return The name of the parameter group to update
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to update
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * </p>
     * 
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For example, if
     * you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For
     *        example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days
     *        before being deleted.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For example, if
     * you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @return The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For
     *         example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days
     *         before being deleted.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For example, if
     * you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which MemoryDB retains automatic cluster snapshots before deleting them. For
     *        example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days
     *        before being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * A valid node type that you want to scale this cluster up or down to.
     * </p>
     * 
     * @param nodeType
     *        A valid node type that you want to scale this cluster up or down to.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * A valid node type that you want to scale this cluster up or down to.
     * </p>
     * 
     * @return A valid node type that you want to scale this cluster up or down to.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * A valid node type that you want to scale this cluster up or down to.
     * </p>
     * 
     * @param nodeType
     *        A valid node type that you want to scale this cluster up or down to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but you
     * cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the
     * existing cluster and create it anew with the earlier engine version.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but
     *        you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must
     *        delete the existing cluster and create it anew with the earlier engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but you
     * cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the
     * existing cluster and create it anew with the earlier engine version.
     * </p>
     * 
     * @return The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but
     *         you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must
     *         delete the existing cluster and create it anew with the earlier engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but you
     * cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the
     * existing cluster and create it anew with the earlier engine version.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the engine to be run on the nodes. You can upgrade to a newer engine version, but
     *        you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must
     *        delete the existing cluster and create it anew with the earlier engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The number of replicas that will reside in each shard
     * </p>
     * 
     * @param replicaConfiguration
     *        The number of replicas that will reside in each shard
     */

    public void setReplicaConfiguration(ReplicaConfigurationRequest replicaConfiguration) {
        this.replicaConfiguration = replicaConfiguration;
    }

    /**
     * <p>
     * The number of replicas that will reside in each shard
     * </p>
     * 
     * @return The number of replicas that will reside in each shard
     */

    public ReplicaConfigurationRequest getReplicaConfiguration() {
        return this.replicaConfiguration;
    }

    /**
     * <p>
     * The number of replicas that will reside in each shard
     * </p>
     * 
     * @param replicaConfiguration
     *        The number of replicas that will reside in each shard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withReplicaConfiguration(ReplicaConfigurationRequest replicaConfiguration) {
        setReplicaConfiguration(replicaConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @param shardConfiguration
     *        The number of shards in the cluster
     */

    public void setShardConfiguration(ShardConfigurationRequest shardConfiguration) {
        this.shardConfiguration = shardConfiguration;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @return The number of shards in the cluster
     */

    public ShardConfigurationRequest getShardConfiguration() {
        return this.shardConfiguration;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @param shardConfiguration
     *        The number of shards in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withShardConfiguration(ShardConfigurationRequest shardConfiguration) {
        setShardConfiguration(shardConfiguration);
        return this;
    }

    /**
     * <p>
     * The Access Control List that is associated with the cluster
     * </p>
     * 
     * @param aCLName
     *        The Access Control List that is associated with the cluster
     */

    public void setACLName(String aCLName) {
        this.aCLName = aCLName;
    }

    /**
     * <p>
     * The Access Control List that is associated with the cluster
     * </p>
     * 
     * @return The Access Control List that is associated with the cluster
     */

    public String getACLName() {
        return this.aCLName;
    }

    /**
     * <p>
     * The Access Control List that is associated with the cluster
     * </p>
     * 
     * @param aCLName
     *        The Access Control List that is associated with the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withACLName(String aCLName) {
        setACLName(aCLName);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSnsTopicStatus() != null)
            sb.append("SnsTopicStatus: ").append(getSnsTopicStatus()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getReplicaConfiguration() != null)
            sb.append("ReplicaConfiguration: ").append(getReplicaConfiguration()).append(",");
        if (getShardConfiguration() != null)
            sb.append("ShardConfiguration: ").append(getShardConfiguration()).append(",");
        if (getACLName() != null)
            sb.append("ACLName: ").append(getACLName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterRequest == false)
            return false;
        UpdateClusterRequest other = (UpdateClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsTopicStatus() == null ^ this.getSnsTopicStatus() == null)
            return false;
        if (other.getSnsTopicStatus() != null && other.getSnsTopicStatus().equals(this.getSnsTopicStatus()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getReplicaConfiguration() == null ^ this.getReplicaConfiguration() == null)
            return false;
        if (other.getReplicaConfiguration() != null && other.getReplicaConfiguration().equals(this.getReplicaConfiguration()) == false)
            return false;
        if (other.getShardConfiguration() == null ^ this.getShardConfiguration() == null)
            return false;
        if (other.getShardConfiguration() != null && other.getShardConfiguration().equals(this.getShardConfiguration()) == false)
            return false;
        if (other.getACLName() == null ^ this.getACLName() == null)
            return false;
        if (other.getACLName() != null && other.getACLName().equals(this.getACLName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicStatus() == null) ? 0 : getSnsTopicStatus().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getReplicaConfiguration() == null) ? 0 : getReplicaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getShardConfiguration() == null) ? 0 : getShardConfiguration().hashCode());
        hashCode = prime * hashCode + ((getACLName() == null) ? 0 : getACLName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterRequest clone() {
        return (UpdateClusterRequest) super.clone();
    }

}
