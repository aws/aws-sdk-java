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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The compute and memory capacity of the nodes in the cluster.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The name of the parameter group associated with the cluster.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * An optional description of the cluster.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of shards the cluster will contain. The default value is 1.
     * </p>
     */
    private Integer numShards;
    /**
     * <p>
     * The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     * </p>
     */
    private Integer numReplicasPerShard;
    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     */
    private String subnetGroupName;
    /**
     * <p>
     * A list of security group names to associate with this cluster.
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
     * The port number on which each of the nodes accepts connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * A flag to enable in-transit encryption on the cluster.
     * </p>
     */
    private Boolean tLSEnabled;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The
     * snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any
     * commas.
     * </p>
     */
    private java.util.List<String> snapshotArns;
    /**
     * <p>
     * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring
     * while the new cluster is being created.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     * Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey,
     * Value=mySecondKeyValue.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.
     * </p>
     * <p>
     * Example: 05:00-09:00
     * </p>
     * <p>
     * If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * The name of the Access Control List to associate with the cluster.
     * </p>
     */
    private String aCLName;
    /**
     * <p>
     * The version number of the Redis engine to be used for the cluster.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     */
    private Boolean dataTiering;

    /**
     * <p>
     * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * </p>
     * 
     * @return The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster. This value must be unique as it also serves as the cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the cluster.
     * </p>
     * 
     * @param nodeType
     *        The compute and memory capacity of the nodes in the cluster.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the cluster.
     * </p>
     * 
     * @return The compute and memory capacity of the nodes in the cluster.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The compute and memory capacity of the nodes in the cluster.
     * </p>
     * 
     * @param nodeType
     *        The compute and memory capacity of the nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group associated with the cluster.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group associated with the cluster.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group associated with the cluster.
     * </p>
     * 
     * @return The name of the parameter group associated with the cluster.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group associated with the cluster.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * An optional description of the cluster.
     * </p>
     * 
     * @param description
     *        An optional description of the cluster.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the cluster.
     * </p>
     * 
     * @return An optional description of the cluster.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the cluster.
     * </p>
     * 
     * @param description
     *        An optional description of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of shards the cluster will contain. The default value is 1.
     * </p>
     * 
     * @param numShards
     *        The number of shards the cluster will contain. The default value is 1.
     */

    public void setNumShards(Integer numShards) {
        this.numShards = numShards;
    }

    /**
     * <p>
     * The number of shards the cluster will contain. The default value is 1.
     * </p>
     * 
     * @return The number of shards the cluster will contain. The default value is 1.
     */

    public Integer getNumShards() {
        return this.numShards;
    }

    /**
     * <p>
     * The number of shards the cluster will contain. The default value is 1.
     * </p>
     * 
     * @param numShards
     *        The number of shards the cluster will contain. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNumShards(Integer numShards) {
        setNumShards(numShards);
        return this;
    }

    /**
     * <p>
     * The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     * </p>
     * 
     * @param numReplicasPerShard
     *        The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     */

    public void setNumReplicasPerShard(Integer numReplicasPerShard) {
        this.numReplicasPerShard = numReplicasPerShard;
    }

    /**
     * <p>
     * The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     * </p>
     * 
     * @return The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     */

    public Integer getNumReplicasPerShard() {
        return this.numReplicasPerShard;
    }

    /**
     * <p>
     * The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     * </p>
     * 
     * @param numReplicasPerShard
     *        The number of replicas to apply to each shard. The default value is 1. The maximum is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNumReplicasPerShard(Integer numReplicasPerShard) {
        setNumReplicasPerShard(numReplicasPerShard);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * 
     * @param subnetGroupName
     *        The name of the subnet group to be used for the cluster.
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * 
     * @return The name of the subnet group to be used for the cluster.
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the cluster.
     * </p>
     * 
     * @param subnetGroupName
     *        The name of the subnet group to be used for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * 
     * @return A list of security group names to associate with this cluster.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group names to associate with this cluster.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group names to associate with this cluster.
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
     * A list of security group names to associate with this cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group names to associate with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of security group names to associate with this cluster.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group names to associate with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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

    public CreateClusterRequest withMaintenanceWindow(String maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The port number on which each of the nodes accepts connections.
     * </p>
     * 
     * @param port
     *        The port number on which each of the nodes accepts connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which each of the nodes accepts connections.
     * </p>
     * 
     * @return The port number on which each of the nodes accepts connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which each of the nodes accepts connections.
     * </p>
     * 
     * @param port
     *        The port number on which each of the nodes accepts connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     *        notifications are sent.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     *         notifications are sent.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications are
     * sent.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     *        notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * A flag to enable in-transit encryption on the cluster.
     * </p>
     * 
     * @param tLSEnabled
     *        A flag to enable in-transit encryption on the cluster.
     */

    public void setTLSEnabled(Boolean tLSEnabled) {
        this.tLSEnabled = tLSEnabled;
    }

    /**
     * <p>
     * A flag to enable in-transit encryption on the cluster.
     * </p>
     * 
     * @return A flag to enable in-transit encryption on the cluster.
     */

    public Boolean getTLSEnabled() {
        return this.tLSEnabled;
    }

    /**
     * <p>
     * A flag to enable in-transit encryption on the cluster.
     * </p>
     * 
     * @param tLSEnabled
     *        A flag to enable in-transit encryption on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTLSEnabled(Boolean tLSEnabled) {
        setTLSEnabled(tLSEnabled);
        return this;
    }

    /**
     * <p>
     * A flag to enable in-transit encryption on the cluster.
     * </p>
     * 
     * @return A flag to enable in-transit encryption on the cluster.
     */

    public Boolean isTLSEnabled() {
        return this.tLSEnabled;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster.
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The
     * snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any
     * commas.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3.
     *         The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot
     *         contain any commas.
     */

    public java.util.List<String> getSnapshotArns() {
        return snapshotArns;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The
     * snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any
     * commas.
     * </p>
     * 
     * @param snapshotArns
     *        A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3.
     *        The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot
     *        contain any commas.
     */

    public void setSnapshotArns(java.util.Collection<String> snapshotArns) {
        if (snapshotArns == null) {
            this.snapshotArns = null;
            return;
        }

        this.snapshotArns = new java.util.ArrayList<String>(snapshotArns);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The
     * snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any
     * commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotArns(java.util.Collection)} or {@link #withSnapshotArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotArns
     *        A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3.
     *        The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot
     *        contain any commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSnapshotArns(String... snapshotArns) {
        if (this.snapshotArns == null) {
            setSnapshotArns(new java.util.ArrayList<String>(snapshotArns.length));
        }
        for (String ele : snapshotArns) {
            this.snapshotArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3. The
     * snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot contain any
     * commas.
     * </p>
     * 
     * @param snapshotArns
     *        A list of Amazon Resource Names (ARN) that uniquely identify the RDB snapshot files stored in Amazon S3.
     *        The snapshot files are used to populate the new cluster. The Amazon S3 object name in the ARN cannot
     *        contain any commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSnapshotArns(java.util.Collection<String> snapshotArns) {
        setSnapshotArns(snapshotArns);
        return this;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring
     * while the new cluster is being created.
     * </p>
     * 
     * @param snapshotName
     *        The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to
     *        restoring while the new cluster is being created.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring
     * while the new cluster is being created.
     * </p>
     * 
     * @return The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to
     *         restoring while the new cluster is being created.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to restoring
     * while the new cluster is being created.
     * </p>
     * 
     * @param snapshotName
     *        The name of a snapshot from which to restore data into the new cluster. The snapshot status changes to
     *        restoring while the new cluster is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if
     *        you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being
     *        deleted.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @return The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if
     *         you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being
     *         deleted.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if you set
     * SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which MemoryDB retains automatic snapshots before deleting them. For example, if
     *        you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being
     *        deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     * Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey,
     * Value=mySecondKeyValue.
     * </p>
     * 
     * @return A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     *         Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue
     *         Key=mySecondKey, Value=mySecondKeyValue.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     * Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey,
     * Value=mySecondKeyValue.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     *        Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue
     *        Key=mySecondKey, Value=mySecondKeyValue.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     * Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey,
     * Value=mySecondKeyValue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     *        Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue
     *        Key=mySecondKey, Value=mySecondKeyValue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     * Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue Key=mySecondKey,
     * Value=mySecondKeyValue.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. Tags are comma-separated key,value pairs (e.g. Key=myKey,
     *        Value=myKeyValue. You can include multiple tags as shown following: Key=myKey, Value=myKeyValue
     *        Key=mySecondKey, Value=mySecondKeyValue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.
     * </p>
     * <p>
     * Example: 05:00-09:00
     * </p>
     * <p>
     * If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.</p>
     *        <p>
     *        Example: 05:00-09:00
     *        </p>
     *        <p>
     *        If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.
     * </p>
     * <p>
     * Example: 05:00-09:00
     * </p>
     * <p>
     * If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     * 
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.</p>
     *         <p>
     *         Example: 05:00-09:00
     *         </p>
     *         <p>
     *         If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.
     * </p>
     * <p>
     * Example: 05:00-09:00
     * </p>
     * <p>
     * If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * </p>
     * 
     * @param snapshotWindow
     *        The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard.</p>
     *        <p>
     *        Example: 05:00-09:00
     *        </p>
     *        <p>
     *        If you do not specify this parameter, MemoryDB automatically chooses an appropriate time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * The name of the Access Control List to associate with the cluster.
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List to associate with the cluster.
     */

    public void setACLName(String aCLName) {
        this.aCLName = aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List to associate with the cluster.
     * </p>
     * 
     * @return The name of the Access Control List to associate with the cluster.
     */

    public String getACLName() {
        return this.aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List to associate with the cluster.
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List to associate with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withACLName(String aCLName) {
        setACLName(aCLName);
        return this;
    }

    /**
     * <p>
     * The version number of the Redis engine to be used for the cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the Redis engine to be used for the cluster.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the Redis engine to be used for the cluster.
     * </p>
     * 
     * @return The version number of the Redis engine to be used for the cluster.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the Redis engine to be used for the cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the Redis engine to be used for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @return When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     * </p>
     * 
     * @return When set to true, the cluster will automatically receive minor engine version upgrades after launch.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     */

    public void setDataTiering(Boolean dataTiering) {
        this.dataTiering = dataTiering;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @return Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This
     *         parameter must be set when using r6gd nodes. For more information, see <a
     *         href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     */

    public Boolean getDataTiering() {
        return this.dataTiering;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withDataTiering(Boolean dataTiering) {
        setDataTiering(dataTiering);
        return this;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @return Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This
     *         parameter must be set when using r6gd nodes. For more information, see <a
     *         href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     */

    public Boolean isDataTiering() {
        return this.dataTiering;
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
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNumShards() != null)
            sb.append("NumShards: ").append(getNumShards()).append(",");
        if (getNumReplicasPerShard() != null)
            sb.append("NumReplicasPerShard: ").append(getNumReplicasPerShard()).append(",");
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getTLSEnabled() != null)
            sb.append("TLSEnabled: ").append(getTLSEnabled()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnapshotArns() != null)
            sb.append("SnapshotArns: ").append(getSnapshotArns()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getACLName() != null)
            sb.append("ACLName: ").append(getACLName()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getDataTiering() != null)
            sb.append("DataTiering: ").append(getDataTiering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNumShards() == null ^ this.getNumShards() == null)
            return false;
        if (other.getNumShards() != null && other.getNumShards().equals(this.getNumShards()) == false)
            return false;
        if (other.getNumReplicasPerShard() == null ^ this.getNumReplicasPerShard() == null)
            return false;
        if (other.getNumReplicasPerShard() != null && other.getNumReplicasPerShard().equals(this.getNumReplicasPerShard()) == false)
            return false;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getTLSEnabled() == null ^ this.getTLSEnabled() == null)
            return false;
        if (other.getTLSEnabled() != null && other.getTLSEnabled().equals(this.getTLSEnabled()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnapshotArns() == null ^ this.getSnapshotArns() == null)
            return false;
        if (other.getSnapshotArns() != null && other.getSnapshotArns().equals(this.getSnapshotArns()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getACLName() == null ^ this.getACLName() == null)
            return false;
        if (other.getACLName() != null && other.getACLName().equals(this.getACLName()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getDataTiering() == null ^ this.getDataTiering() == null)
            return false;
        if (other.getDataTiering() != null && other.getDataTiering().equals(this.getDataTiering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNumShards() == null) ? 0 : getNumShards().hashCode());
        hashCode = prime * hashCode + ((getNumReplicasPerShard() == null) ? 0 : getNumReplicasPerShard().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getTLSEnabled() == null) ? 0 : getTLSEnabled().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArns() == null) ? 0 : getSnapshotArns().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getACLName() == null) ? 0 : getACLName().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getDataTiering() == null) ? 0 : getDataTiering().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
