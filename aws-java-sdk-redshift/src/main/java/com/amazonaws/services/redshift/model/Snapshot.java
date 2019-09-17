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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/Snapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data
     * as of this exact time.
     * </p>
     */
    private java.util.Date snapshotCreateTime;
    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     */
    private java.util.Date clusterCreateTime;
    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the cluster.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are of
     * type "manual".
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     */
    private String dBName;
    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the
     * output.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster
     * from which the snapshot was taken.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     * <code>true</code> indicates that the data is encrypted using HSM keys.
     * </p>
     */
    private Boolean encryptedWithHSM;
    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no accounts
     * are authorized. Visible only to the snapshot owner.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountWithRestoreAccess> accountsWithRestoreAccess;
    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the
     * owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore the cluster.
     * </p>
     */
    private Double totalBackupSizeInMegaBytes;
    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     */
    private Double actualIncrementalBackupSizeInMegaBytes;
    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot backup.
     * </p>
     */
    private Double backupProgressInMegaBytes;
    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     * completed backup.
     * </p>
     */
    private Double currentBackupRateInMegaBytesPerSecond;
    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     * completed backup.
     * </p>
     */
    private Long estimatedSecondsToCompletion;
    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed
     * backup to finish.
     * </p>
     */
    private Long elapsedTimeInSeconds;
    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore into.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> restorableNodeTypes;
    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean enhancedVpcRouting;
    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention period.
     * </p>
     */
    private Integer manualSnapshotRemainingDays;
    /**
     * <p>
     * A timestamp representing the start of the retention period for the snapshot.
     * </p>
     */
    private java.util.Date snapshotRetentionStartTime;

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The snapshot identifier that is provided in the request.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     * 
     * @return The snapshot identifier that is provided in the request.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The snapshot identifier that is provided in the request.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The snapshot identifier that is provided in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster for which the snapshot was taken.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     * 
     * @return The identifier of the cluster for which the snapshot was taken.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster for which the snapshot was taken.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster for which the snapshot was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data
     * as of this exact time.
     * </p>
     * 
     * @param snapshotCreateTime
     *        The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the
     *        cluster data as of this exact time.
     */

    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data
     * as of this exact time.
     * </p>
     * 
     * @return The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the
     *         cluster data as of this exact time.
     */

    public java.util.Date getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data
     * as of this exact time.
     * </p>
     * 
     * @param snapshotCreateTime
     *        The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the
     *        cluster data as of this exact time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The snapshot status. The value of the status depends on the API operation used: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DeleteClusterSnapshot</a> returns status as "deleted".
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     * 
     * @return The snapshot status. The value of the status depends on the API operation used: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>DeleteClusterSnapshot</a> returns status as "deleted".
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The snapshot status. The value of the status depends on the API operation used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteClusterSnapshot</a> returns status as "deleted".
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The snapshot status. The value of the status depends on the API operation used: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> returns status as "creating".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DescribeClusterSnapshots</a> returns status as "creating", "available", "final snapshot", or "failed".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>DeleteClusterSnapshot</a> returns status as "deleted".
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     * 
     * @param port
     *        The port that the cluster is listening on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     * 
     * @return The port that the cluster is listening on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the cluster is listening on.
     * </p>
     * 
     * @param port
     *        The port that the cluster is listening on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the cluster was created.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     * 
     * @return The Availability Zone in which the cluster was created.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster was created.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     * 
     * @param clusterCreateTime
     *        The time (UTC) when the cluster was originally created.
     */

    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     * 
     * @return The time (UTC) when the cluster was originally created.
     */

    public java.util.Date getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * The time (UTC) when the cluster was originally created.
     * </p>
     * 
     * @param clusterCreateTime
     *        The time (UTC) when the cluster was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the cluster.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     * 
     * @return The master user name for the cluster.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version ID of the Amazon Redshift engine that is running on the cluster.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the cluster.
     * </p>
     * 
     * @return The version ID of the Amazon Redshift engine that is running on the cluster.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version ID of the Amazon Redshift engine that is running on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are of
     * type "manual".
     * </p>
     * 
     * @param snapshotType
     *        The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are
     *        of type "manual".
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are of
     * type "manual".
     * </p>
     * 
     * @return The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a>
     *         are of type "manual".
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are of
     * type "manual".
     * </p>
     * 
     * @param snapshotType
     *        The snapshot type. Snapshots created using <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> are
     *        of type "manual".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     * 
     * @param nodeType
     *        The node type of the nodes in the cluster.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     * 
     * @return The node type of the nodes in the cluster.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type of the nodes in the cluster.
     * </p>
     * 
     * @param nodeType
     *        The node type of the nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes in the cluster.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     * 
     * @return The number of nodes in the cluster.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     * 
     * @param dBName
     *        The name of the database that was created when the cluster was created.
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     * 
     * @return The name of the database that was created when the cluster was created.
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The name of the database that was created when the cluster was created.
     * </p>
     * 
     * @param dBName
     *        The name of the database that was created when the cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the
     * output.
     * </p>
     * 
     * @param vpcId
     *        The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not
     *        in the output.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the
     * output.
     * </p>
     * 
     * @return The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is
     *         not in the output.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the
     * output.
     * </p>
     * 
     * @param vpcId
     *        The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not
     *        in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     * 
     * @param encrypted
     *        If <code>true</code>, the data in the snapshot is encrypted at rest.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     * 
     * @return If <code>true</code>, the data in the snapshot is encrypted at rest.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     * 
     * @param encrypted
     *        If <code>true</code>, the data in the snapshot is encrypted at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * </p>
     * 
     * @return If <code>true</code>, the data in the snapshot is encrypted at rest.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster
     * from which the snapshot was taken.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the
     *        cluster from which the snapshot was taken.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster
     * from which the snapshot was taken.
     * </p>
     * 
     * @return The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the
     *         cluster from which the snapshot was taken.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster
     * from which the snapshot was taken.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the
     *        cluster from which the snapshot was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     * <code>true</code> indicates that the data is encrypted using HSM keys.
     * </p>
     * 
     * @param encryptedWithHSM
     *        A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     *        <code>true</code> indicates that the data is encrypted using HSM keys.
     */

    public void setEncryptedWithHSM(Boolean encryptedWithHSM) {
        this.encryptedWithHSM = encryptedWithHSM;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     * <code>true</code> indicates that the data is encrypted using HSM keys.
     * </p>
     * 
     * @return A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     *         <code>true</code> indicates that the data is encrypted using HSM keys.
     */

    public Boolean getEncryptedWithHSM() {
        return this.encryptedWithHSM;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     * <code>true</code> indicates that the data is encrypted using HSM keys.
     * </p>
     * 
     * @param encryptedWithHSM
     *        A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     *        <code>true</code> indicates that the data is encrypted using HSM keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEncryptedWithHSM(Boolean encryptedWithHSM) {
        setEncryptedWithHSM(encryptedWithHSM);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     * <code>true</code> indicates that the data is encrypted using HSM keys.
     * </p>
     * 
     * @return A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster.
     *         <code>true</code> indicates that the data is encrypted using HSM keys.
     */

    public Boolean isEncryptedWithHSM() {
        return this.encryptedWithHSM;
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no accounts
     * are authorized. Visible only to the snapshot owner.
     * </p>
     * 
     * @return A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no
     *         accounts are authorized. Visible only to the snapshot owner.
     */

    public java.util.List<AccountWithRestoreAccess> getAccountsWithRestoreAccess() {
        if (accountsWithRestoreAccess == null) {
            accountsWithRestoreAccess = new com.amazonaws.internal.SdkInternalList<AccountWithRestoreAccess>();
        }
        return accountsWithRestoreAccess;
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no accounts
     * are authorized. Visible only to the snapshot owner.
     * </p>
     * 
     * @param accountsWithRestoreAccess
     *        A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no
     *        accounts are authorized. Visible only to the snapshot owner.
     */

    public void setAccountsWithRestoreAccess(java.util.Collection<AccountWithRestoreAccess> accountsWithRestoreAccess) {
        if (accountsWithRestoreAccess == null) {
            this.accountsWithRestoreAccess = null;
            return;
        }

        this.accountsWithRestoreAccess = new com.amazonaws.internal.SdkInternalList<AccountWithRestoreAccess>(accountsWithRestoreAccess);
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no accounts
     * are authorized. Visible only to the snapshot owner.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountsWithRestoreAccess(java.util.Collection)} or
     * {@link #withAccountsWithRestoreAccess(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accountsWithRestoreAccess
     *        A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no
     *        accounts are authorized. Visible only to the snapshot owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAccountsWithRestoreAccess(AccountWithRestoreAccess... accountsWithRestoreAccess) {
        if (this.accountsWithRestoreAccess == null) {
            setAccountsWithRestoreAccess(new com.amazonaws.internal.SdkInternalList<AccountWithRestoreAccess>(accountsWithRestoreAccess.length));
        }
        for (AccountWithRestoreAccess ele : accountsWithRestoreAccess) {
            this.accountsWithRestoreAccess.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no accounts
     * are authorized. Visible only to the snapshot owner.
     * </p>
     * 
     * @param accountsWithRestoreAccess
     *        A list of the AWS customer accounts authorized to restore the snapshot. Returns <code>null</code> if no
     *        accounts are authorized. Visible only to the snapshot owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAccountsWithRestoreAccess(java.util.Collection<AccountWithRestoreAccess> accountsWithRestoreAccess) {
        setAccountsWithRestoreAccess(accountsWithRestoreAccess);
        return this;
    }

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the
     * owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic
     *        snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual
     *        snapshot.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the
     * owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     * 
     * @return For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic
     *         snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual
     *         snapshot.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the
     * owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic
     *        snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual
     *        snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore the cluster.
     * </p>
     * 
     * @param totalBackupSizeInMegaBytes
     *        The size of the complete set of backup data that would be used to restore the cluster.
     */

    public void setTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore the cluster.
     * </p>
     * 
     * @return The size of the complete set of backup data that would be used to restore the cluster.
     */

    public Double getTotalBackupSizeInMegaBytes() {
        return this.totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the complete set of backup data that would be used to restore the cluster.
     * </p>
     * 
     * @param totalBackupSizeInMegaBytes
     *        The size of the complete set of backup data that would be used to restore the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        setTotalBackupSizeInMegaBytes(totalBackupSizeInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     * 
     * @param actualIncrementalBackupSizeInMegaBytes
     *        The size of the incremental backup.
     */

    public void setActualIncrementalBackupSizeInMegaBytes(Double actualIncrementalBackupSizeInMegaBytes) {
        this.actualIncrementalBackupSizeInMegaBytes = actualIncrementalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     * 
     * @return The size of the incremental backup.
     */

    public Double getActualIncrementalBackupSizeInMegaBytes() {
        return this.actualIncrementalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the incremental backup.
     * </p>
     * 
     * @param actualIncrementalBackupSizeInMegaBytes
     *        The size of the incremental backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withActualIncrementalBackupSizeInMegaBytes(Double actualIncrementalBackupSizeInMegaBytes) {
        setActualIncrementalBackupSizeInMegaBytes(actualIncrementalBackupSizeInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot backup.
     * </p>
     * 
     * @param backupProgressInMegaBytes
     *        The number of megabytes that have been transferred to the snapshot backup.
     */

    public void setBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        this.backupProgressInMegaBytes = backupProgressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot backup.
     * </p>
     * 
     * @return The number of megabytes that have been transferred to the snapshot backup.
     */

    public Double getBackupProgressInMegaBytes() {
        return this.backupProgressInMegaBytes;
    }

    /**
     * <p>
     * The number of megabytes that have been transferred to the snapshot backup.
     * </p>
     * 
     * @param backupProgressInMegaBytes
     *        The number of megabytes that have been transferred to the snapshot backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        setBackupProgressInMegaBytes(backupProgressInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     * completed backup.
     * </p>
     * 
     * @param currentBackupRateInMegaBytesPerSecond
     *        The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     *        completed backup.
     */

    public void setCurrentBackupRateInMegaBytesPerSecond(Double currentBackupRateInMegaBytesPerSecond) {
        this.currentBackupRateInMegaBytesPerSecond = currentBackupRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     * completed backup.
     * </p>
     * 
     * @return The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     *         completed backup.
     */

    public Double getCurrentBackupRateInMegaBytesPerSecond() {
        return this.currentBackupRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     * completed backup.
     * </p>
     * 
     * @param currentBackupRateInMegaBytesPerSecond
     *        The number of megabytes per second being transferred to the snapshot backup. Returns <code>0</code> for a
     *        completed backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCurrentBackupRateInMegaBytesPerSecond(Double currentBackupRateInMegaBytesPerSecond) {
        setCurrentBackupRateInMegaBytesPerSecond(currentBackupRateInMegaBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     * completed backup.
     * </p>
     * 
     * @param estimatedSecondsToCompletion
     *        The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     *        completed backup.
     */

    public void setEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        this.estimatedSecondsToCompletion = estimatedSecondsToCompletion;
    }

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     * completed backup.
     * </p>
     * 
     * @return The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     *         completed backup.
     */

    public Long getEstimatedSecondsToCompletion() {
        return this.estimatedSecondsToCompletion;
    }

    /**
     * <p>
     * The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     * completed backup.
     * </p>
     * 
     * @param estimatedSecondsToCompletion
     *        The estimate of the time remaining before the snapshot backup will complete. Returns <code>0</code> for a
     *        completed backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        setEstimatedSecondsToCompletion(estimatedSecondsToCompletion);
        return this;
    }

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed
     * backup to finish.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of time an in-progress snapshot backup has been running, or the amount of time it took a
     *        completed backup to finish.
     */

    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed
     * backup to finish.
     * </p>
     * 
     * @return The amount of time an in-progress snapshot backup has been running, or the amount of time it took a
     *         completed backup to finish.
     */

    public Long getElapsedTimeInSeconds() {
        return this.elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed
     * backup to finish.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of time an in-progress snapshot backup has been running, or the amount of time it took a
     *        completed backup to finish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        setElapsedTimeInSeconds(elapsedTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     * 
     * @param sourceRegion
     *        The source region from which the snapshot was copied.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     * 
     * @return The source region from which the snapshot was copied.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source region from which the snapshot was copied.
     * </p>
     * 
     * @param sourceRegion
     *        The source region from which the snapshot was copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     * 
     * @return The list of tags for the cluster snapshot.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster snapshot.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster snapshot.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore into.
     * </p>
     * 
     * @return The list of node types that this cluster snapshot is able to restore into.
     */

    public java.util.List<String> getRestorableNodeTypes() {
        if (restorableNodeTypes == null) {
            restorableNodeTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return restorableNodeTypes;
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore into.
     * </p>
     * 
     * @param restorableNodeTypes
     *        The list of node types that this cluster snapshot is able to restore into.
     */

    public void setRestorableNodeTypes(java.util.Collection<String> restorableNodeTypes) {
        if (restorableNodeTypes == null) {
            this.restorableNodeTypes = null;
            return;
        }

        this.restorableNodeTypes = new com.amazonaws.internal.SdkInternalList<String>(restorableNodeTypes);
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore into.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRestorableNodeTypes(java.util.Collection)} or {@link #withRestorableNodeTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param restorableNodeTypes
     *        The list of node types that this cluster snapshot is able to restore into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withRestorableNodeTypes(String... restorableNodeTypes) {
        if (this.restorableNodeTypes == null) {
            setRestorableNodeTypes(new com.amazonaws.internal.SdkInternalList<String>(restorableNodeTypes.length));
        }
        for (String ele : restorableNodeTypes) {
            this.restorableNodeTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of node types that this cluster snapshot is able to restore into.
     * </p>
     * 
     * @param restorableNodeTypes
     *        The list of node types that this cluster snapshot is able to restore into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withRestorableNodeTypes(java.util.Collection<String> restorableNodeTypes) {
        setRestorableNodeTypes(restorableNodeTypes);
        return this;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param enhancedVpcRouting
     *        An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a
     *        cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a>
     *        in the Amazon Redshift Cluster Management Guide.</p>
     *        <p>
     *        If this option is <code>true</code>, enhanced VPC routing is enabled.
     *        </p>
     *        <p>
     *        Default: false
     */

    public void setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a
     *         cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC
     *         Routing</a> in the Amazon Redshift Cluster Management Guide.</p>
     *         <p>
     *         If this option is <code>true</code>, enhanced VPC routing is enabled.
     *         </p>
     *         <p>
     *         Default: false
     */

    public Boolean getEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param enhancedVpcRouting
     *        An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a
     *        cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a>
     *        in the Amazon Redshift Cluster Management Guide.</p>
     *        <p>
     *        If this option is <code>true</code>, enhanced VPC routing is enabled.
     *        </p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        setEnhancedVpcRouting(enhancedVpcRouting);
        return this;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a
     *         cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC
     *         Routing</a> in the Amazon Redshift Cluster Management Guide.</p>
     *         <p>
     *         If this option is <code>true</code>, enhanced VPC routing is enabled.
     *         </p>
     *         <p>
     *         Default: false
     */

    public Boolean isEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track for the snapshot.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     * 
     * @return The name of the maintenance track for the snapshot.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the snapshot.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely. </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @return The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is
     *         retained indefinitely. </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely. </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention period.
     * </p>
     * 
     * @param manualSnapshotRemainingDays
     *        The number of days until a manual snapshot will pass its retention period.
     */

    public void setManualSnapshotRemainingDays(Integer manualSnapshotRemainingDays) {
        this.manualSnapshotRemainingDays = manualSnapshotRemainingDays;
    }

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention period.
     * </p>
     * 
     * @return The number of days until a manual snapshot will pass its retention period.
     */

    public Integer getManualSnapshotRemainingDays() {
        return this.manualSnapshotRemainingDays;
    }

    /**
     * <p>
     * The number of days until a manual snapshot will pass its retention period.
     * </p>
     * 
     * @param manualSnapshotRemainingDays
     *        The number of days until a manual snapshot will pass its retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withManualSnapshotRemainingDays(Integer manualSnapshotRemainingDays) {
        setManualSnapshotRemainingDays(manualSnapshotRemainingDays);
        return this;
    }

    /**
     * <p>
     * A timestamp representing the start of the retention period for the snapshot.
     * </p>
     * 
     * @param snapshotRetentionStartTime
     *        A timestamp representing the start of the retention period for the snapshot.
     */

    public void setSnapshotRetentionStartTime(java.util.Date snapshotRetentionStartTime) {
        this.snapshotRetentionStartTime = snapshotRetentionStartTime;
    }

    /**
     * <p>
     * A timestamp representing the start of the retention period for the snapshot.
     * </p>
     * 
     * @return A timestamp representing the start of the retention period for the snapshot.
     */

    public java.util.Date getSnapshotRetentionStartTime() {
        return this.snapshotRetentionStartTime;
    }

    /**
     * <p>
     * A timestamp representing the start of the retention period for the snapshot.
     * </p>
     * 
     * @param snapshotRetentionStartTime
     *        A timestamp representing the start of the retention period for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotRetentionStartTime(java.util.Date snapshotRetentionStartTime) {
        setSnapshotRetentionStartTime(snapshotRetentionStartTime);
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEncryptedWithHSM() != null)
            sb.append("EncryptedWithHSM: ").append(getEncryptedWithHSM()).append(",");
        if (getAccountsWithRestoreAccess() != null)
            sb.append("AccountsWithRestoreAccess: ").append(getAccountsWithRestoreAccess()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getTotalBackupSizeInMegaBytes() != null)
            sb.append("TotalBackupSizeInMegaBytes: ").append(getTotalBackupSizeInMegaBytes()).append(",");
        if (getActualIncrementalBackupSizeInMegaBytes() != null)
            sb.append("ActualIncrementalBackupSizeInMegaBytes: ").append(getActualIncrementalBackupSizeInMegaBytes()).append(",");
        if (getBackupProgressInMegaBytes() != null)
            sb.append("BackupProgressInMegaBytes: ").append(getBackupProgressInMegaBytes()).append(",");
        if (getCurrentBackupRateInMegaBytesPerSecond() != null)
            sb.append("CurrentBackupRateInMegaBytesPerSecond: ").append(getCurrentBackupRateInMegaBytesPerSecond()).append(",");
        if (getEstimatedSecondsToCompletion() != null)
            sb.append("EstimatedSecondsToCompletion: ").append(getEstimatedSecondsToCompletion()).append(",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: ").append(getElapsedTimeInSeconds()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRestorableNodeTypes() != null)
            sb.append("RestorableNodeTypes: ").append(getRestorableNodeTypes()).append(",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: ").append(getEnhancedVpcRouting()).append(",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: ").append(getMaintenanceTrackName()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getManualSnapshotRemainingDays() != null)
            sb.append("ManualSnapshotRemainingDays: ").append(getManualSnapshotRemainingDays()).append(",");
        if (getSnapshotRetentionStartTime() != null)
            sb.append("SnapshotRetentionStartTime: ").append(getSnapshotRetentionStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncryptedWithHSM() == null ^ this.getEncryptedWithHSM() == null)
            return false;
        if (other.getEncryptedWithHSM() != null && other.getEncryptedWithHSM().equals(this.getEncryptedWithHSM()) == false)
            return false;
        if (other.getAccountsWithRestoreAccess() == null ^ this.getAccountsWithRestoreAccess() == null)
            return false;
        if (other.getAccountsWithRestoreAccess() != null && other.getAccountsWithRestoreAccess().equals(this.getAccountsWithRestoreAccess()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() == null ^ this.getTotalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() != null && other.getTotalBackupSizeInMegaBytes().equals(this.getTotalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() == null ^ this.getActualIncrementalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() != null
                && other.getActualIncrementalBackupSizeInMegaBytes().equals(this.getActualIncrementalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getBackupProgressInMegaBytes() == null ^ this.getBackupProgressInMegaBytes() == null)
            return false;
        if (other.getBackupProgressInMegaBytes() != null && other.getBackupProgressInMegaBytes().equals(this.getBackupProgressInMegaBytes()) == false)
            return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() == null ^ this.getCurrentBackupRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() != null
                && other.getCurrentBackupRateInMegaBytesPerSecond().equals(this.getCurrentBackupRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getEstimatedSecondsToCompletion() == null ^ this.getEstimatedSecondsToCompletion() == null)
            return false;
        if (other.getEstimatedSecondsToCompletion() != null && other.getEstimatedSecondsToCompletion().equals(this.getEstimatedSecondsToCompletion()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRestorableNodeTypes() == null ^ this.getRestorableNodeTypes() == null)
            return false;
        if (other.getRestorableNodeTypes() != null && other.getRestorableNodeTypes().equals(this.getRestorableNodeTypes()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getManualSnapshotRemainingDays() == null ^ this.getManualSnapshotRemainingDays() == null)
            return false;
        if (other.getManualSnapshotRemainingDays() != null && other.getManualSnapshotRemainingDays().equals(this.getManualSnapshotRemainingDays()) == false)
            return false;
        if (other.getSnapshotRetentionStartTime() == null ^ this.getSnapshotRetentionStartTime() == null)
            return false;
        if (other.getSnapshotRetentionStartTime() != null && other.getSnapshotRetentionStartTime().equals(this.getSnapshotRetentionStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncryptedWithHSM() == null) ? 0 : getEncryptedWithHSM().hashCode());
        hashCode = prime * hashCode + ((getAccountsWithRestoreAccess() == null) ? 0 : getAccountsWithRestoreAccess().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getTotalBackupSizeInMegaBytes() == null) ? 0 : getTotalBackupSizeInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getActualIncrementalBackupSizeInMegaBytes() == null) ? 0 : getActualIncrementalBackupSizeInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getBackupProgressInMegaBytes() == null) ? 0 : getBackupProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getCurrentBackupRateInMegaBytesPerSecond() == null) ? 0 : getCurrentBackupRateInMegaBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSecondsToCompletion() == null) ? 0 : getEstimatedSecondsToCompletion().hashCode());
        hashCode = prime * hashCode + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRestorableNodeTypes() == null) ? 0 : getRestorableNodeTypes().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRemainingDays() == null) ? 0 : getManualSnapshotRemainingDays().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionStartTime() == null) ? 0 : getSnapshotRetentionStartTime().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
