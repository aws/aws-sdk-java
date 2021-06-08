/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether major version upgrades are applied automatically to the cluster during the maintenance window.
     * </p>
     */
    private Boolean allowVersionUpgrade;
    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code> - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code> - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify the
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterAvailabilityStatus;
    /**
     * <p>
     * Indicates when the cluster was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String clusterCreateTime;
    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterClusterNode> clusterNodes;
    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterClusterParameterGroup> clusterParameterGroups;
    /**
     * <p>
     * The public key for the cluster.
     * </p>
     */
    private String clusterPublicKey;
    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     */
    private String clusterRevisionNumber;
    /**
     * <p>
     * A list of cluster security groups that are associated with the cluster.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterClusterSecurityGroup> clusterSecurityGroups;
    /**
     * <p>
     * Information about the destination Region and retention period for the cross-Region snapshot copy.
     * </p>
     */
    private AwsRedshiftClusterClusterSnapshotCopyStatus clusterSnapshotCopyStatus;
    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     * <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     * <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     * <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code> |
     * <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> | <code>rebooting</code> |
     * <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> | <code>storage-full</code> |
     * <code>updating-hsm</code>
     * </p>
     */
    private String clusterStatus;
    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster
     * is in a VPC.
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * The version ID of the Amazon Redshift engine that runs on the cluster.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The name of the initial database that was created when the cluster was created.
     * </p>
     * <p>
     * The same name is returned for the life of the cluster.
     * </p>
     * <p>
     * If an initial database is not specified, a database named <code>devdev</code> is created by default.
     * </p>
     */
    private String dBName;
    /**
     * <p>
     * List of time windows during which maintenance was deferred.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterDeferredMaintenanceWindow> deferredMaintenanceWindows;
    /**
     * <p>
     * Information about the status of the Elastic IP (EIP) address.
     * </p>
     */
    private AwsRedshiftClusterElasticIpStatus elasticIpStatus;
    /**
     * <p>
     * The number of nodes that you can use the elastic resize method to resize the cluster to.
     * </p>
     */
    private String elasticResizeNumberOfNodeOptions;
    /**
     * <p>
     * Indicates whether the data in the cluster is encrypted at rest.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The connection endpoint.
     * </p>
     */
    private AwsRedshiftClusterEndpoint endpoint;
    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     */
    private Boolean enhancedVpcRouting;
    /**
     * <p>
     * Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule and
     * have backups enabled.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String expectedNextSnapshotScheduleTime;
    /**
     * <p>
     * The status of the next expected snapshot.
     * </p>
     * <p>
     * Valid values: <code>OnTrack</code> | <code>Pending</code>
     * </p>
     */
    private String expectedNextSnapshotScheduleTimeStatus;
    /**
     * <p>
     * Information about whether the Amazon Redshift cluster finished applying any changes to hardware security module
     * (HSM) settings that were specified in a modify cluster command.
     * </p>
     */
    private AwsRedshiftClusterHsmStatus hsmStatus;
    /**
     * <p>
     * A list of IAM roles that the cluster can use to access other AWS services.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterIamRole> iamRoles;
    /**
     * <p>
     * The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * The default number of days to retain a manual snapshot.
     * </p>
     * <p>
     * If the value is -1, the snapshot is retained indefinitely.
     * </p>
     * <p>
     * This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * Valid values: Either -1 or an integer between 1 and 3,653
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in as the
     * value of <code>DBName</code>.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * Indicates the start of the next maintenance window.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String nextMaintenanceWindowStartTime;
    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * A list of cluster operations that are waiting to start.
     * </p>
     */
    private java.util.List<String> pendingActions;
    /**
     * <p>
     * A list of changes to the cluster that are currently pending.
     * </p>
     */
    private AwsRedshiftClusterPendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * <p>
     * Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     * </p>
     * <p>
     * For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     * <code>fri</code> | <code>sat</code> | <code>sun</code>
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Whether the cluster can be accessed from a public network.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * Information about the resize operation for the cluster.
     * </p>
     */
    private AwsRedshiftClusterResizeInfo resizeInfo;
    /**
     * <p>
     * Information about the status of a cluster restore action. Only applies to a cluster that was created by restoring
     * a snapshot.
     * </p>
     */
    private AwsRedshiftClusterRestoreStatus restoreStatus;
    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     */
    private String snapshotScheduleIdentifier;
    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     * </p>
     */
    private String snapshotScheduleState;
    /**
     * <p>
     * The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * </p>
     */
    private java.util.List<AwsRedshiftClusterVpcSecurityGroup> vpcSecurityGroups;

    /**
     * <p>
     * Indicates whether major version upgrades are applied automatically to the cluster during the maintenance window.
     * </p>
     * 
     * @param allowVersionUpgrade
     *        Indicates whether major version upgrades are applied automatically to the cluster during the maintenance
     *        window.
     */

    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * Indicates whether major version upgrades are applied automatically to the cluster during the maintenance window.
     * </p>
     * 
     * @return Indicates whether major version upgrades are applied automatically to the cluster during the maintenance
     *         window.
     */

    public Boolean getAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * Indicates whether major version upgrades are applied automatically to the cluster during the maintenance window.
     * </p>
     * 
     * @param allowVersionUpgrade
     *        Indicates whether major version upgrades are applied automatically to the cluster during the maintenance
     *        window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        setAllowVersionUpgrade(allowVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates whether major version upgrades are applied automatically to the cluster during the maintenance window.
     * </p>
     * 
     * @return Indicates whether major version upgrades are applied automatically to the cluster during the maintenance
     *         window.
     */

    public Boolean isAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The number of days that automatic cluster snapshots are retained.
     */

    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     * 
     * @return The number of days that automatic cluster snapshots are retained.
     */

    public Integer getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The number of days that automatic cluster snapshots are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        setAutomatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     * 
     * @param availabilityZone
     *        The name of the Availability Zone in which the cluster is located.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     * 
     * @return The name of the Availability Zone in which the cluster is located.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     * 
     * @param availabilityZone
     *        The name of the Availability Zone in which the cluster is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code> - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code> - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify the
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterAvailabilityStatus
     *        The availability status of the cluster for queries. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Available</code> - The cluster is available for queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unavailable</code> - The cluster is not available for queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance
     *        activities.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify the
     *        cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The cluster failed and is not available for queries.
     *        </p>
     *        </li>
     */

    public void setClusterAvailabilityStatus(String clusterAvailabilityStatus) {
        this.clusterAvailabilityStatus = clusterAvailabilityStatus;
    }

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code> - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code> - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify the
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The availability status of the cluster for queries. Possible values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Available</code> - The cluster is available for queries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unavailable</code> - The cluster is not available for queries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance
     *         activities.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify
     *         the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The cluster failed and is not available for queries.
     *         </p>
     *         </li>
     */

    public String getClusterAvailabilityStatus() {
        return this.clusterAvailabilityStatus;
    }

    /**
     * <p>
     * The availability status of the cluster for queries. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Available</code> - The cluster is available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unavailable</code> - The cluster is not available for queries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify the
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The cluster failed and is not available for queries.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterAvailabilityStatus
     *        The availability status of the cluster for queries. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Available</code> - The cluster is available for queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unavailable</code> - The cluster is not available for queries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maintenance</code> - The cluster is intermittently available for queries due to maintenance
     *        activities.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Modifying</code> -The cluster is intermittently available for queries due to changes that modify the
     *        cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The cluster failed and is not available for queries.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterAvailabilityStatus(String clusterAvailabilityStatus) {
        setClusterAvailabilityStatus(clusterAvailabilityStatus);
        return this;
    }

    /**
     * <p>
     * Indicates when the cluster was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param clusterCreateTime
     *        Indicates when the cluster was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setClusterCreateTime(String clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * Indicates when the cluster was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the cluster was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * Indicates when the cluster was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param clusterCreateTime
     *        Indicates when the cluster was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterCreateTime(String clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @return The unique identifier of the cluster.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * 
     * @return The nodes in the cluster.
     */

    public java.util.List<AwsRedshiftClusterClusterNode> getClusterNodes() {
        return clusterNodes;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * 
     * @param clusterNodes
     *        The nodes in the cluster.
     */

    public void setClusterNodes(java.util.Collection<AwsRedshiftClusterClusterNode> clusterNodes) {
        if (clusterNodes == null) {
            this.clusterNodes = null;
            return;
        }

        this.clusterNodes = new java.util.ArrayList<AwsRedshiftClusterClusterNode>(clusterNodes);
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterNodes(java.util.Collection)} or {@link #withClusterNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clusterNodes
     *        The nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterNodes(AwsRedshiftClusterClusterNode... clusterNodes) {
        if (this.clusterNodes == null) {
            setClusterNodes(new java.util.ArrayList<AwsRedshiftClusterClusterNode>(clusterNodes.length));
        }
        for (AwsRedshiftClusterClusterNode ele : clusterNodes) {
            this.clusterNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * 
     * @param clusterNodes
     *        The nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterNodes(java.util.Collection<AwsRedshiftClusterClusterNode> clusterNodes) {
        setClusterNodes(clusterNodes);
        return this;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster.
     * </p>
     * 
     * @return The list of cluster parameter groups that are associated with this cluster.
     */

    public java.util.List<AwsRedshiftClusterClusterParameterGroup> getClusterParameterGroups() {
        return clusterParameterGroups;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster.
     * </p>
     * 
     * @param clusterParameterGroups
     *        The list of cluster parameter groups that are associated with this cluster.
     */

    public void setClusterParameterGroups(java.util.Collection<AwsRedshiftClusterClusterParameterGroup> clusterParameterGroups) {
        if (clusterParameterGroups == null) {
            this.clusterParameterGroups = null;
            return;
        }

        this.clusterParameterGroups = new java.util.ArrayList<AwsRedshiftClusterClusterParameterGroup>(clusterParameterGroups);
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterParameterGroups(java.util.Collection)} or
     * {@link #withClusterParameterGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterParameterGroups
     *        The list of cluster parameter groups that are associated with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterParameterGroups(AwsRedshiftClusterClusterParameterGroup... clusterParameterGroups) {
        if (this.clusterParameterGroups == null) {
            setClusterParameterGroups(new java.util.ArrayList<AwsRedshiftClusterClusterParameterGroup>(clusterParameterGroups.length));
        }
        for (AwsRedshiftClusterClusterParameterGroup ele : clusterParameterGroups) {
            this.clusterParameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster.
     * </p>
     * 
     * @param clusterParameterGroups
     *        The list of cluster parameter groups that are associated with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterParameterGroups(java.util.Collection<AwsRedshiftClusterClusterParameterGroup> clusterParameterGroups) {
        setClusterParameterGroups(clusterParameterGroups);
        return this;
    }

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     * 
     * @param clusterPublicKey
     *        The public key for the cluster.
     */

    public void setClusterPublicKey(String clusterPublicKey) {
        this.clusterPublicKey = clusterPublicKey;
    }

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     * 
     * @return The public key for the cluster.
     */

    public String getClusterPublicKey() {
        return this.clusterPublicKey;
    }

    /**
     * <p>
     * The public key for the cluster.
     * </p>
     * 
     * @param clusterPublicKey
     *        The public key for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterPublicKey(String clusterPublicKey) {
        setClusterPublicKey(clusterPublicKey);
        return this;
    }

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     * 
     * @param clusterRevisionNumber
     *        The specific revision number of the database in the cluster.
     */

    public void setClusterRevisionNumber(String clusterRevisionNumber) {
        this.clusterRevisionNumber = clusterRevisionNumber;
    }

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     * 
     * @return The specific revision number of the database in the cluster.
     */

    public String getClusterRevisionNumber() {
        return this.clusterRevisionNumber;
    }

    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     * 
     * @param clusterRevisionNumber
     *        The specific revision number of the database in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterRevisionNumber(String clusterRevisionNumber) {
        setClusterRevisionNumber(clusterRevisionNumber);
        return this;
    }

    /**
     * <p>
     * A list of cluster security groups that are associated with the cluster.
     * </p>
     * 
     * @return A list of cluster security groups that are associated with the cluster.
     */

    public java.util.List<AwsRedshiftClusterClusterSecurityGroup> getClusterSecurityGroups() {
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of cluster security groups that are associated with the cluster.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security groups that are associated with the cluster.
     */

    public void setClusterSecurityGroups(java.util.Collection<AwsRedshiftClusterClusterSecurityGroup> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }

        this.clusterSecurityGroups = new java.util.ArrayList<AwsRedshiftClusterClusterSecurityGroup>(clusterSecurityGroups);
    }

    /**
     * <p>
     * A list of cluster security groups that are associated with the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security groups that are associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterSecurityGroups(AwsRedshiftClusterClusterSecurityGroup... clusterSecurityGroups) {
        if (this.clusterSecurityGroups == null) {
            setClusterSecurityGroups(new java.util.ArrayList<AwsRedshiftClusterClusterSecurityGroup>(clusterSecurityGroups.length));
        }
        for (AwsRedshiftClusterClusterSecurityGroup ele : clusterSecurityGroups) {
            this.clusterSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cluster security groups that are associated with the cluster.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security groups that are associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterSecurityGroups(java.util.Collection<AwsRedshiftClusterClusterSecurityGroup> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Information about the destination Region and retention period for the cross-Region snapshot copy.
     * </p>
     * 
     * @param clusterSnapshotCopyStatus
     *        Information about the destination Region and retention period for the cross-Region snapshot copy.
     */

    public void setClusterSnapshotCopyStatus(AwsRedshiftClusterClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        this.clusterSnapshotCopyStatus = clusterSnapshotCopyStatus;
    }

    /**
     * <p>
     * Information about the destination Region and retention period for the cross-Region snapshot copy.
     * </p>
     * 
     * @return Information about the destination Region and retention period for the cross-Region snapshot copy.
     */

    public AwsRedshiftClusterClusterSnapshotCopyStatus getClusterSnapshotCopyStatus() {
        return this.clusterSnapshotCopyStatus;
    }

    /**
     * <p>
     * Information about the destination Region and retention period for the cross-Region snapshot copy.
     * </p>
     * 
     * @param clusterSnapshotCopyStatus
     *        Information about the destination Region and retention period for the cross-Region snapshot copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterSnapshotCopyStatus(AwsRedshiftClusterClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        setClusterSnapshotCopyStatus(clusterSnapshotCopyStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     * <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     * <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     * <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code> |
     * <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> | <code>rebooting</code> |
     * <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> | <code>storage-full</code> |
     * <code>updating-hsm</code>
     * </p>
     * 
     * @param clusterStatus
     *        The current status of the cluster.</p>
     *        <p>
     *        Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     *        <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     *        <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     *        <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code> |
     *        <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> | <code>rebooting</code>
     *        | <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> | <code>storage-full</code> |
     *        <code>updating-hsm</code>
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     * <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     * <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     * <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code> |
     * <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> | <code>rebooting</code> |
     * <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> | <code>storage-full</code> |
     * <code>updating-hsm</code>
     * </p>
     * 
     * @return The current status of the cluster.</p>
     *         <p>
     *         Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     *         <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     *         <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     *         <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code>
     *         | <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> |
     *         <code>rebooting</code> | <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> |
     *         <code>storage-full</code> | <code>updating-hsm</code>
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * <p>
     * Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     * <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     * <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     * <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code> |
     * <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> | <code>rebooting</code> |
     * <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> | <code>storage-full</code> |
     * <code>updating-hsm</code>
     * </p>
     * 
     * @param clusterStatus
     *        The current status of the cluster.</p>
     *        <p>
     *        Valid values: <code>available</code> | <code>available, prep-for-resize</code> |
     *        <code>available, resize-cleanup</code> |<code> cancelling-resize</code> | <code>creating</code> |
     *        <code>deleting</code> | <code>final-snapshot</code> | <code>hardware-failure</code> |
     *        <code>incompatible-hsm</code> |<code> incompatible-network</code> | <code>incompatible-parameters</code> |
     *        <code>incompatible-restore</code> | <code>modifying</code> | <code>paused</code> | <code>rebooting</code>
     *        | <code>renaming</code> | <code>resizing</code> | <code>rotating-keys</code> | <code>storage-full</code> |
     *        <code>updating-hsm</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster
     * is in a VPC.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the subnet group that is associated with the cluster. This parameter is valid only when the
     *        cluster is in a VPC.
     */

    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster
     * is in a VPC.
     * </p>
     * 
     * @return The name of the subnet group that is associated with the cluster. This parameter is valid only when the
     *         cluster is in a VPC.
     */

    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster
     * is in a VPC.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the subnet group that is associated with the cluster. This parameter is valid only when the
     *        cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that runs on the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version ID of the Amazon Redshift engine that runs on the cluster.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that runs on the cluster.
     * </p>
     * 
     * @return The version ID of the Amazon Redshift engine that runs on the cluster.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The version ID of the Amazon Redshift engine that runs on the cluster.
     * </p>
     * 
     * @param clusterVersion
     *        The version ID of the Amazon Redshift engine that runs on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was created.
     * </p>
     * <p>
     * The same name is returned for the life of the cluster.
     * </p>
     * <p>
     * If an initial database is not specified, a database named <code>devdev</code> is created by default.
     * </p>
     * 
     * @param dBName
     *        The name of the initial database that was created when the cluster was created.</p>
     *        <p>
     *        The same name is returned for the life of the cluster.
     *        </p>
     *        <p>
     *        If an initial database is not specified, a database named <code>devdev</code> is created by default.
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was created.
     * </p>
     * <p>
     * The same name is returned for the life of the cluster.
     * </p>
     * <p>
     * If an initial database is not specified, a database named <code>devdev</code> is created by default.
     * </p>
     * 
     * @return The name of the initial database that was created when the cluster was created.</p>
     *         <p>
     *         The same name is returned for the life of the cluster.
     *         </p>
     *         <p>
     *         If an initial database is not specified, a database named <code>devdev</code> is created by default.
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was created.
     * </p>
     * <p>
     * The same name is returned for the life of the cluster.
     * </p>
     * <p>
     * If an initial database is not specified, a database named <code>devdev</code> is created by default.
     * </p>
     * 
     * @param dBName
     *        The name of the initial database that was created when the cluster was created.</p>
     *        <p>
     *        The same name is returned for the life of the cluster.
     *        </p>
     *        <p>
     *        If an initial database is not specified, a database named <code>devdev</code> is created by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * List of time windows during which maintenance was deferred.
     * </p>
     * 
     * @return List of time windows during which maintenance was deferred.
     */

    public java.util.List<AwsRedshiftClusterDeferredMaintenanceWindow> getDeferredMaintenanceWindows() {
        return deferredMaintenanceWindows;
    }

    /**
     * <p>
     * List of time windows during which maintenance was deferred.
     * </p>
     * 
     * @param deferredMaintenanceWindows
     *        List of time windows during which maintenance was deferred.
     */

    public void setDeferredMaintenanceWindows(java.util.Collection<AwsRedshiftClusterDeferredMaintenanceWindow> deferredMaintenanceWindows) {
        if (deferredMaintenanceWindows == null) {
            this.deferredMaintenanceWindows = null;
            return;
        }

        this.deferredMaintenanceWindows = new java.util.ArrayList<AwsRedshiftClusterDeferredMaintenanceWindow>(deferredMaintenanceWindows);
    }

    /**
     * <p>
     * List of time windows during which maintenance was deferred.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeferredMaintenanceWindows(java.util.Collection)} or
     * {@link #withDeferredMaintenanceWindows(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deferredMaintenanceWindows
     *        List of time windows during which maintenance was deferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withDeferredMaintenanceWindows(AwsRedshiftClusterDeferredMaintenanceWindow... deferredMaintenanceWindows) {
        if (this.deferredMaintenanceWindows == null) {
            setDeferredMaintenanceWindows(new java.util.ArrayList<AwsRedshiftClusterDeferredMaintenanceWindow>(deferredMaintenanceWindows.length));
        }
        for (AwsRedshiftClusterDeferredMaintenanceWindow ele : deferredMaintenanceWindows) {
            this.deferredMaintenanceWindows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of time windows during which maintenance was deferred.
     * </p>
     * 
     * @param deferredMaintenanceWindows
     *        List of time windows during which maintenance was deferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withDeferredMaintenanceWindows(java.util.Collection<AwsRedshiftClusterDeferredMaintenanceWindow> deferredMaintenanceWindows) {
        setDeferredMaintenanceWindows(deferredMaintenanceWindows);
        return this;
    }

    /**
     * <p>
     * Information about the status of the Elastic IP (EIP) address.
     * </p>
     * 
     * @param elasticIpStatus
     *        Information about the status of the Elastic IP (EIP) address.
     */

    public void setElasticIpStatus(AwsRedshiftClusterElasticIpStatus elasticIpStatus) {
        this.elasticIpStatus = elasticIpStatus;
    }

    /**
     * <p>
     * Information about the status of the Elastic IP (EIP) address.
     * </p>
     * 
     * @return Information about the status of the Elastic IP (EIP) address.
     */

    public AwsRedshiftClusterElasticIpStatus getElasticIpStatus() {
        return this.elasticIpStatus;
    }

    /**
     * <p>
     * Information about the status of the Elastic IP (EIP) address.
     * </p>
     * 
     * @param elasticIpStatus
     *        Information about the status of the Elastic IP (EIP) address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withElasticIpStatus(AwsRedshiftClusterElasticIpStatus elasticIpStatus) {
        setElasticIpStatus(elasticIpStatus);
        return this;
    }

    /**
     * <p>
     * The number of nodes that you can use the elastic resize method to resize the cluster to.
     * </p>
     * 
     * @param elasticResizeNumberOfNodeOptions
     *        The number of nodes that you can use the elastic resize method to resize the cluster to.
     */

    public void setElasticResizeNumberOfNodeOptions(String elasticResizeNumberOfNodeOptions) {
        this.elasticResizeNumberOfNodeOptions = elasticResizeNumberOfNodeOptions;
    }

    /**
     * <p>
     * The number of nodes that you can use the elastic resize method to resize the cluster to.
     * </p>
     * 
     * @return The number of nodes that you can use the elastic resize method to resize the cluster to.
     */

    public String getElasticResizeNumberOfNodeOptions() {
        return this.elasticResizeNumberOfNodeOptions;
    }

    /**
     * <p>
     * The number of nodes that you can use the elastic resize method to resize the cluster to.
     * </p>
     * 
     * @param elasticResizeNumberOfNodeOptions
     *        The number of nodes that you can use the elastic resize method to resize the cluster to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withElasticResizeNumberOfNodeOptions(String elasticResizeNumberOfNodeOptions) {
        setElasticResizeNumberOfNodeOptions(elasticResizeNumberOfNodeOptions);
        return this;
    }

    /**
     * <p>
     * Indicates whether the data in the cluster is encrypted at rest.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the data in the cluster is encrypted at rest.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the data in the cluster is encrypted at rest.
     * </p>
     * 
     * @return Indicates whether the data in the cluster is encrypted at rest.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the data in the cluster is encrypted at rest.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the data in the cluster is encrypted at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the data in the cluster is encrypted at rest.
     * </p>
     * 
     * @return Indicates whether the data in the cluster is encrypted at rest.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint.
     */

    public void setEndpoint(AwsRedshiftClusterEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     * 
     * @return The connection endpoint.
     */

    public AwsRedshiftClusterEndpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withEndpoint(AwsRedshiftClusterEndpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @param enhancedVpcRouting
     *        Indicates whether to create the cluster with enhanced VPC routing enabled.
     */

    public void setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @return Indicates whether to create the cluster with enhanced VPC routing enabled.
     */

    public Boolean getEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @param enhancedVpcRouting
     *        Indicates whether to create the cluster with enhanced VPC routing enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        setEnhancedVpcRouting(enhancedVpcRouting);
        return this;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @return Indicates whether to create the cluster with enhanced VPC routing enabled.
     */

    public Boolean isEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule and
     * have backups enabled.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param expectedNextSnapshotScheduleTime
     *        Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule
     *        and have backups enabled.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setExpectedNextSnapshotScheduleTime(String expectedNextSnapshotScheduleTime) {
        this.expectedNextSnapshotScheduleTime = expectedNextSnapshotScheduleTime;
    }

    /**
     * <p>
     * Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule and
     * have backups enabled.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule
     *         and have backups enabled.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getExpectedNextSnapshotScheduleTime() {
        return this.expectedNextSnapshotScheduleTime;
    }

    /**
     * <p>
     * Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule and
     * have backups enabled.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param expectedNextSnapshotScheduleTime
     *        Indicates when the next snapshot is expected to be taken. The cluster must have a valid snapshot schedule
     *        and have backups enabled.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withExpectedNextSnapshotScheduleTime(String expectedNextSnapshotScheduleTime) {
        setExpectedNextSnapshotScheduleTime(expectedNextSnapshotScheduleTime);
        return this;
    }

    /**
     * <p>
     * The status of the next expected snapshot.
     * </p>
     * <p>
     * Valid values: <code>OnTrack</code> | <code>Pending</code>
     * </p>
     * 
     * @param expectedNextSnapshotScheduleTimeStatus
     *        The status of the next expected snapshot.</p>
     *        <p>
     *        Valid values: <code>OnTrack</code> | <code>Pending</code>
     */

    public void setExpectedNextSnapshotScheduleTimeStatus(String expectedNextSnapshotScheduleTimeStatus) {
        this.expectedNextSnapshotScheduleTimeStatus = expectedNextSnapshotScheduleTimeStatus;
    }

    /**
     * <p>
     * The status of the next expected snapshot.
     * </p>
     * <p>
     * Valid values: <code>OnTrack</code> | <code>Pending</code>
     * </p>
     * 
     * @return The status of the next expected snapshot.</p>
     *         <p>
     *         Valid values: <code>OnTrack</code> | <code>Pending</code>
     */

    public String getExpectedNextSnapshotScheduleTimeStatus() {
        return this.expectedNextSnapshotScheduleTimeStatus;
    }

    /**
     * <p>
     * The status of the next expected snapshot.
     * </p>
     * <p>
     * Valid values: <code>OnTrack</code> | <code>Pending</code>
     * </p>
     * 
     * @param expectedNextSnapshotScheduleTimeStatus
     *        The status of the next expected snapshot.</p>
     *        <p>
     *        Valid values: <code>OnTrack</code> | <code>Pending</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withExpectedNextSnapshotScheduleTimeStatus(String expectedNextSnapshotScheduleTimeStatus) {
        setExpectedNextSnapshotScheduleTimeStatus(expectedNextSnapshotScheduleTimeStatus);
        return this;
    }

    /**
     * <p>
     * Information about whether the Amazon Redshift cluster finished applying any changes to hardware security module
     * (HSM) settings that were specified in a modify cluster command.
     * </p>
     * 
     * @param hsmStatus
     *        Information about whether the Amazon Redshift cluster finished applying any changes to hardware security
     *        module (HSM) settings that were specified in a modify cluster command.
     */

    public void setHsmStatus(AwsRedshiftClusterHsmStatus hsmStatus) {
        this.hsmStatus = hsmStatus;
    }

    /**
     * <p>
     * Information about whether the Amazon Redshift cluster finished applying any changes to hardware security module
     * (HSM) settings that were specified in a modify cluster command.
     * </p>
     * 
     * @return Information about whether the Amazon Redshift cluster finished applying any changes to hardware security
     *         module (HSM) settings that were specified in a modify cluster command.
     */

    public AwsRedshiftClusterHsmStatus getHsmStatus() {
        return this.hsmStatus;
    }

    /**
     * <p>
     * Information about whether the Amazon Redshift cluster finished applying any changes to hardware security module
     * (HSM) settings that were specified in a modify cluster command.
     * </p>
     * 
     * @param hsmStatus
     *        Information about whether the Amazon Redshift cluster finished applying any changes to hardware security
     *        module (HSM) settings that were specified in a modify cluster command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withHsmStatus(AwsRedshiftClusterHsmStatus hsmStatus) {
        setHsmStatus(hsmStatus);
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that the cluster can use to access other AWS services.
     * </p>
     * 
     * @return A list of IAM roles that the cluster can use to access other AWS services.
     */

    public java.util.List<AwsRedshiftClusterIamRole> getIamRoles() {
        return iamRoles;
    }

    /**
     * <p>
     * A list of IAM roles that the cluster can use to access other AWS services.
     * </p>
     * 
     * @param iamRoles
     *        A list of IAM roles that the cluster can use to access other AWS services.
     */

    public void setIamRoles(java.util.Collection<AwsRedshiftClusterIamRole> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }

        this.iamRoles = new java.util.ArrayList<AwsRedshiftClusterIamRole>(iamRoles);
    }

    /**
     * <p>
     * A list of IAM roles that the cluster can use to access other AWS services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIamRoles(java.util.Collection)} or {@link #withIamRoles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iamRoles
     *        A list of IAM roles that the cluster can use to access other AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withIamRoles(AwsRedshiftClusterIamRole... iamRoles) {
        if (this.iamRoles == null) {
            setIamRoles(new java.util.ArrayList<AwsRedshiftClusterIamRole>(iamRoles.length));
        }
        for (AwsRedshiftClusterIamRole ele : iamRoles) {
            this.iamRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IAM roles that the cluster can use to access other AWS services.
     * </p>
     * 
     * @param iamRoles
     *        A list of IAM roles that the cluster can use to access other AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withIamRoles(java.util.Collection<AwsRedshiftClusterIamRole> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     * </p>
     * 
     * @return The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the AWS KMS encryption key that is used to encrypt data in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track for the cluster.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     * 
     * @return The name of the maintenance track for the cluster.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the cluster.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot.
     * </p>
     * <p>
     * If the value is -1, the snapshot is retained indefinitely.
     * </p>
     * <p>
     * This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * Valid values: Either -1 or an integer between 1 and 3,653
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The default number of days to retain a manual snapshot.</p>
     *        <p>
     *        If the value is -1, the snapshot is retained indefinitely.
     *        </p>
     *        <p>
     *        This setting doesn't change the retention period of existing snapshots.
     *        </p>
     *        <p>
     *        Valid values: Either -1 or an integer between 1 and 3,653
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot.
     * </p>
     * <p>
     * If the value is -1, the snapshot is retained indefinitely.
     * </p>
     * <p>
     * This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * Valid values: Either -1 or an integer between 1 and 3,653
     * </p>
     * 
     * @return The default number of days to retain a manual snapshot.</p>
     *         <p>
     *         If the value is -1, the snapshot is retained indefinitely.
     *         </p>
     *         <p>
     *         This setting doesn't change the retention period of existing snapshots.
     *         </p>
     *         <p>
     *         Valid values: Either -1 or an integer between 1 and 3,653
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot.
     * </p>
     * <p>
     * If the value is -1, the snapshot is retained indefinitely.
     * </p>
     * <p>
     * This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * Valid values: Either -1 or an integer between 1 and 3,653
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The default number of days to retain a manual snapshot.</p>
     *        <p>
     *        If the value is -1, the snapshot is retained indefinitely.
     *        </p>
     *        <p>
     *        This setting doesn't change the retention period of existing snapshots.
     *        </p>
     *        <p>
     *        Valid values: Either -1 or an integer between 1 and 3,653
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in as the
     * value of <code>DBName</code>.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the cluster. This name is used to connect to the database that is specified in as
     *        the value of <code>DBName</code>.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in as the
     * value of <code>DBName</code>.
     * </p>
     * 
     * @return The master user name for the cluster. This name is used to connect to the database that is specified in
     *         as the value of <code>DBName</code>.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in as the
     * value of <code>DBName</code>.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the cluster. This name is used to connect to the database that is specified in as
     *        the value of <code>DBName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * Indicates the start of the next maintenance window.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param nextMaintenanceWindowStartTime
     *        Indicates the start of the next maintenance window.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setNextMaintenanceWindowStartTime(String nextMaintenanceWindowStartTime) {
        this.nextMaintenanceWindowStartTime = nextMaintenanceWindowStartTime;
    }

    /**
     * <p>
     * Indicates the start of the next maintenance window.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates the start of the next maintenance window.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getNextMaintenanceWindowStartTime() {
        return this.nextMaintenanceWindowStartTime;
    }

    /**
     * <p>
     * Indicates the start of the next maintenance window.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param nextMaintenanceWindowStartTime
     *        Indicates the start of the next maintenance window.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withNextMaintenanceWindowStartTime(String nextMaintenanceWindowStartTime) {
        setNextMaintenanceWindowStartTime(nextMaintenanceWindowStartTime);
        return this;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     * 
     * @param nodeType
     *        The node type for the nodes in the cluster.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     * 
     * @return The node type for the nodes in the cluster.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     * 
     * @param nodeType
     *        The node type for the nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of compute nodes in the cluster.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     * 
     * @return The number of compute nodes in the cluster.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of compute nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * A list of cluster operations that are waiting to start.
     * </p>
     * 
     * @return A list of cluster operations that are waiting to start.
     */

    public java.util.List<String> getPendingActions() {
        return pendingActions;
    }

    /**
     * <p>
     * A list of cluster operations that are waiting to start.
     * </p>
     * 
     * @param pendingActions
     *        A list of cluster operations that are waiting to start.
     */

    public void setPendingActions(java.util.Collection<String> pendingActions) {
        if (pendingActions == null) {
            this.pendingActions = null;
            return;
        }

        this.pendingActions = new java.util.ArrayList<String>(pendingActions);
    }

    /**
     * <p>
     * A list of cluster operations that are waiting to start.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingActions(java.util.Collection)} or {@link #withPendingActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param pendingActions
     *        A list of cluster operations that are waiting to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withPendingActions(String... pendingActions) {
        if (this.pendingActions == null) {
            setPendingActions(new java.util.ArrayList<String>(pendingActions.length));
        }
        for (String ele : pendingActions) {
            this.pendingActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cluster operations that are waiting to start.
     * </p>
     * 
     * @param pendingActions
     *        A list of cluster operations that are waiting to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withPendingActions(java.util.Collection<String> pendingActions) {
        setPendingActions(pendingActions);
        return this;
    }

    /**
     * <p>
     * A list of changes to the cluster that are currently pending.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A list of changes to the cluster that are currently pending.
     */

    public void setPendingModifiedValues(AwsRedshiftClusterPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A list of changes to the cluster that are currently pending.
     * </p>
     * 
     * @return A list of changes to the cluster that are currently pending.
     */

    public AwsRedshiftClusterPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A list of changes to the cluster that are currently pending.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A list of changes to the cluster that are currently pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withPendingModifiedValues(AwsRedshiftClusterPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * <p>
     * Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     * </p>
     * <p>
     * For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     * <code>fri</code> | <code>sat</code> | <code>sun</code>
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.</p>
     *        <p>
     *        Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     *        </p>
     *        <p>
     *        For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     *        <code>fri</code> | <code>sat</code> | <code>sun</code>
     *        </p>
     *        <p>
     *        For example, <code>sun:09:32-sun:10:02</code>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * <p>
     * Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     * </p>
     * <p>
     * For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     * <code>fri</code> | <code>sat</code> | <code>sun</code>
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>
     * </p>
     * 
     * @return The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can
     *         occur.</p>
     *         <p>
     *         Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     *         </p>
     *         <p>
     *         For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     *         <code>fri</code> | <code>sat</code> | <code>sun</code>
     *         </p>
     *         <p>
     *         For example, <code>sun:09:32-sun:10:02</code>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * <p>
     * Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     * </p>
     * <p>
     * For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     * <code>fri</code> | <code>sat</code> | <code>sun</code>
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.</p>
     *        <p>
     *        Format: <code> <i>&lt;day&gt;</i>:HH:MM-<i>&lt;day&gt;</i>:HH:MM</code>
     *        </p>
     *        <p>
     *        For the day values, use <code>mon</code> | <code>tue</code> | <code>wed</code> | <code>thu</code> |
     *        <code>fri</code> | <code>sat</code> | <code>sun</code>
     *        </p>
     *        <p>
     *        For example, <code>sun:09:32-sun:10:02</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Whether the cluster can be accessed from a public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        Whether the cluster can be accessed from a public network.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Whether the cluster can be accessed from a public network.
     * </p>
     * 
     * @return Whether the cluster can be accessed from a public network.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Whether the cluster can be accessed from a public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        Whether the cluster can be accessed from a public network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Whether the cluster can be accessed from a public network.
     * </p>
     * 
     * @return Whether the cluster can be accessed from a public network.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Information about the resize operation for the cluster.
     * </p>
     * 
     * @param resizeInfo
     *        Information about the resize operation for the cluster.
     */

    public void setResizeInfo(AwsRedshiftClusterResizeInfo resizeInfo) {
        this.resizeInfo = resizeInfo;
    }

    /**
     * <p>
     * Information about the resize operation for the cluster.
     * </p>
     * 
     * @return Information about the resize operation for the cluster.
     */

    public AwsRedshiftClusterResizeInfo getResizeInfo() {
        return this.resizeInfo;
    }

    /**
     * <p>
     * Information about the resize operation for the cluster.
     * </p>
     * 
     * @param resizeInfo
     *        Information about the resize operation for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withResizeInfo(AwsRedshiftClusterResizeInfo resizeInfo) {
        setResizeInfo(resizeInfo);
        return this;
    }

    /**
     * <p>
     * Information about the status of a cluster restore action. Only applies to a cluster that was created by restoring
     * a snapshot.
     * </p>
     * 
     * @param restoreStatus
     *        Information about the status of a cluster restore action. Only applies to a cluster that was created by
     *        restoring a snapshot.
     */

    public void setRestoreStatus(AwsRedshiftClusterRestoreStatus restoreStatus) {
        this.restoreStatus = restoreStatus;
    }

    /**
     * <p>
     * Information about the status of a cluster restore action. Only applies to a cluster that was created by restoring
     * a snapshot.
     * </p>
     * 
     * @return Information about the status of a cluster restore action. Only applies to a cluster that was created by
     *         restoring a snapshot.
     */

    public AwsRedshiftClusterRestoreStatus getRestoreStatus() {
        return this.restoreStatus;
    }

    /**
     * <p>
     * Information about the status of a cluster restore action. Only applies to a cluster that was created by restoring
     * a snapshot.
     * </p>
     * 
     * @param restoreStatus
     *        Information about the status of a cluster restore action. Only applies to a cluster that was created by
     *        restoring a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withRestoreStatus(AwsRedshiftClusterRestoreStatus restoreStatus) {
        setRestoreStatus(restoreStatus);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     * 
     * @param snapshotScheduleIdentifier
     *        A unique identifier for the cluster snapshot schedule.
     */

    public void setSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        this.snapshotScheduleIdentifier = snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     * 
     * @return A unique identifier for the cluster snapshot schedule.
     */

    public String getSnapshotScheduleIdentifier() {
        return this.snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster snapshot schedule.
     * </p>
     * 
     * @param snapshotScheduleIdentifier
     *        A unique identifier for the cluster snapshot schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        setSnapshotScheduleIdentifier(snapshotScheduleIdentifier);
        return this;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     * </p>
     * 
     * @param snapshotScheduleState
     *        The current state of the cluster snapshot schedule.</p>
     *        <p>
     *        Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     */

    public void setSnapshotScheduleState(String snapshotScheduleState) {
        this.snapshotScheduleState = snapshotScheduleState;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     * </p>
     * 
     * @return The current state of the cluster snapshot schedule.</p>
     *         <p>
     *         Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     */

    public String getSnapshotScheduleState() {
        return this.snapshotScheduleState;
    }

    /**
     * <p>
     * The current state of the cluster snapshot schedule.
     * </p>
     * <p>
     * Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     * </p>
     * 
     * @param snapshotScheduleState
     *        The current state of the cluster snapshot schedule.</p>
     *        <p>
     *        Valid values: <code>MODIFYING</code> | <code>ACTIVE</code> | <code>FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withSnapshotScheduleState(String snapshotScheduleState) {
        setSnapshotScheduleState(snapshotScheduleState);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     * </p>
     * 
     * @return The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the cluster is in, if the cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * </p>
     * 
     * @return The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     */

    public java.util.List<AwsRedshiftClusterVpcSecurityGroup> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     */

    public void setVpcSecurityGroups(java.util.Collection<AwsRedshiftClusterVpcSecurityGroup> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<AwsRedshiftClusterVpcSecurityGroup>(vpcSecurityGroups);
    }

    /**
     * <p>
     * The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withVpcSecurityGroups(AwsRedshiftClusterVpcSecurityGroup... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<AwsRedshiftClusterVpcSecurityGroup>(vpcSecurityGroups.length));
        }
        for (AwsRedshiftClusterVpcSecurityGroup ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The list of VPC security groups that the cluster belongs to, if the cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDetails withVpcSecurityGroups(java.util.Collection<AwsRedshiftClusterVpcSecurityGroup> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
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
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: ").append(getAllowVersionUpgrade()).append(",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: ").append(getAutomatedSnapshotRetentionPeriod()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getClusterAvailabilityStatus() != null)
            sb.append("ClusterAvailabilityStatus: ").append(getClusterAvailabilityStatus()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getClusterNodes() != null)
            sb.append("ClusterNodes: ").append(getClusterNodes()).append(",");
        if (getClusterParameterGroups() != null)
            sb.append("ClusterParameterGroups: ").append(getClusterParameterGroups()).append(",");
        if (getClusterPublicKey() != null)
            sb.append("ClusterPublicKey: ").append(getClusterPublicKey()).append(",");
        if (getClusterRevisionNumber() != null)
            sb.append("ClusterRevisionNumber: ").append(getClusterRevisionNumber()).append(",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: ").append(getClusterSecurityGroups()).append(",");
        if (getClusterSnapshotCopyStatus() != null)
            sb.append("ClusterSnapshotCopyStatus: ").append(getClusterSnapshotCopyStatus()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus()).append(",");
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: ").append(getClusterSubnetGroupName()).append(",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getDeferredMaintenanceWindows() != null)
            sb.append("DeferredMaintenanceWindows: ").append(getDeferredMaintenanceWindows()).append(",");
        if (getElasticIpStatus() != null)
            sb.append("ElasticIpStatus: ").append(getElasticIpStatus()).append(",");
        if (getElasticResizeNumberOfNodeOptions() != null)
            sb.append("ElasticResizeNumberOfNodeOptions: ").append(getElasticResizeNumberOfNodeOptions()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: ").append(getEnhancedVpcRouting()).append(",");
        if (getExpectedNextSnapshotScheduleTime() != null)
            sb.append("ExpectedNextSnapshotScheduleTime: ").append(getExpectedNextSnapshotScheduleTime()).append(",");
        if (getExpectedNextSnapshotScheduleTimeStatus() != null)
            sb.append("ExpectedNextSnapshotScheduleTimeStatus: ").append(getExpectedNextSnapshotScheduleTimeStatus()).append(",");
        if (getHsmStatus() != null)
            sb.append("HsmStatus: ").append(getHsmStatus()).append(",");
        if (getIamRoles() != null)
            sb.append("IamRoles: ").append(getIamRoles()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: ").append(getMaintenanceTrackName()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getNextMaintenanceWindowStartTime() != null)
            sb.append("NextMaintenanceWindowStartTime: ").append(getNextMaintenanceWindowStartTime()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getPendingActions() != null)
            sb.append("PendingActions: ").append(getPendingActions()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getResizeInfo() != null)
            sb.append("ResizeInfo: ").append(getResizeInfo()).append(",");
        if (getRestoreStatus() != null)
            sb.append("RestoreStatus: ").append(getRestoreStatus()).append(",");
        if (getSnapshotScheduleIdentifier() != null)
            sb.append("SnapshotScheduleIdentifier: ").append(getSnapshotScheduleIdentifier()).append(",");
        if (getSnapshotScheduleState() != null)
            sb.append("SnapshotScheduleState: ").append(getSnapshotScheduleState()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterDetails == false)
            return false;
        AwsRedshiftClusterDetails other = (AwsRedshiftClusterDetails) obj;
        if (other.getAllowVersionUpgrade() == null ^ this.getAllowVersionUpgrade() == null)
            return false;
        if (other.getAllowVersionUpgrade() != null && other.getAllowVersionUpgrade().equals(this.getAllowVersionUpgrade()) == false)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClusterAvailabilityStatus() == null ^ this.getClusterAvailabilityStatus() == null)
            return false;
        if (other.getClusterAvailabilityStatus() != null && other.getClusterAvailabilityStatus().equals(this.getClusterAvailabilityStatus()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getClusterNodes() == null ^ this.getClusterNodes() == null)
            return false;
        if (other.getClusterNodes() != null && other.getClusterNodes().equals(this.getClusterNodes()) == false)
            return false;
        if (other.getClusterParameterGroups() == null ^ this.getClusterParameterGroups() == null)
            return false;
        if (other.getClusterParameterGroups() != null && other.getClusterParameterGroups().equals(this.getClusterParameterGroups()) == false)
            return false;
        if (other.getClusterPublicKey() == null ^ this.getClusterPublicKey() == null)
            return false;
        if (other.getClusterPublicKey() != null && other.getClusterPublicKey().equals(this.getClusterPublicKey()) == false)
            return false;
        if (other.getClusterRevisionNumber() == null ^ this.getClusterRevisionNumber() == null)
            return false;
        if (other.getClusterRevisionNumber() != null && other.getClusterRevisionNumber().equals(this.getClusterRevisionNumber()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getClusterSnapshotCopyStatus() == null ^ this.getClusterSnapshotCopyStatus() == null)
            return false;
        if (other.getClusterSnapshotCopyStatus() != null && other.getClusterSnapshotCopyStatus().equals(this.getClusterSnapshotCopyStatus()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDeferredMaintenanceWindows() == null ^ this.getDeferredMaintenanceWindows() == null)
            return false;
        if (other.getDeferredMaintenanceWindows() != null && other.getDeferredMaintenanceWindows().equals(this.getDeferredMaintenanceWindows()) == false)
            return false;
        if (other.getElasticIpStatus() == null ^ this.getElasticIpStatus() == null)
            return false;
        if (other.getElasticIpStatus() != null && other.getElasticIpStatus().equals(this.getElasticIpStatus()) == false)
            return false;
        if (other.getElasticResizeNumberOfNodeOptions() == null ^ this.getElasticResizeNumberOfNodeOptions() == null)
            return false;
        if (other.getElasticResizeNumberOfNodeOptions() != null
                && other.getElasticResizeNumberOfNodeOptions().equals(this.getElasticResizeNumberOfNodeOptions()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getExpectedNextSnapshotScheduleTime() == null ^ this.getExpectedNextSnapshotScheduleTime() == null)
            return false;
        if (other.getExpectedNextSnapshotScheduleTime() != null
                && other.getExpectedNextSnapshotScheduleTime().equals(this.getExpectedNextSnapshotScheduleTime()) == false)
            return false;
        if (other.getExpectedNextSnapshotScheduleTimeStatus() == null ^ this.getExpectedNextSnapshotScheduleTimeStatus() == null)
            return false;
        if (other.getExpectedNextSnapshotScheduleTimeStatus() != null
                && other.getExpectedNextSnapshotScheduleTimeStatus().equals(this.getExpectedNextSnapshotScheduleTimeStatus()) == false)
            return false;
        if (other.getHsmStatus() == null ^ this.getHsmStatus() == null)
            return false;
        if (other.getHsmStatus() != null && other.getHsmStatus().equals(this.getHsmStatus()) == false)
            return false;
        if (other.getIamRoles() == null ^ this.getIamRoles() == null)
            return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getNextMaintenanceWindowStartTime() == null ^ this.getNextMaintenanceWindowStartTime() == null)
            return false;
        if (other.getNextMaintenanceWindowStartTime() != null
                && other.getNextMaintenanceWindowStartTime().equals(this.getNextMaintenanceWindowStartTime()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getPendingActions() == null ^ this.getPendingActions() == null)
            return false;
        if (other.getPendingActions() != null && other.getPendingActions().equals(this.getPendingActions()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getResizeInfo() == null ^ this.getResizeInfo() == null)
            return false;
        if (other.getResizeInfo() != null && other.getResizeInfo().equals(this.getResizeInfo()) == false)
            return false;
        if (other.getRestoreStatus() == null ^ this.getRestoreStatus() == null)
            return false;
        if (other.getRestoreStatus() != null && other.getRestoreStatus().equals(this.getRestoreStatus()) == false)
            return false;
        if (other.getSnapshotScheduleIdentifier() == null ^ this.getSnapshotScheduleIdentifier() == null)
            return false;
        if (other.getSnapshotScheduleIdentifier() != null && other.getSnapshotScheduleIdentifier().equals(this.getSnapshotScheduleIdentifier()) == false)
            return false;
        if (other.getSnapshotScheduleState() == null ^ this.getSnapshotScheduleState() == null)
            return false;
        if (other.getSnapshotScheduleState() != null && other.getSnapshotScheduleState().equals(this.getSnapshotScheduleState()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getClusterAvailabilityStatus() == null) ? 0 : getClusterAvailabilityStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClusterNodes() == null) ? 0 : getClusterNodes().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterGroups() == null) ? 0 : getClusterParameterGroups().hashCode());
        hashCode = prime * hashCode + ((getClusterPublicKey() == null) ? 0 : getClusterPublicKey().hashCode());
        hashCode = prime * hashCode + ((getClusterRevisionNumber() == null) ? 0 : getClusterRevisionNumber().hashCode());
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getClusterSnapshotCopyStatus() == null) ? 0 : getClusterSnapshotCopyStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getDeferredMaintenanceWindows() == null) ? 0 : getDeferredMaintenanceWindows().hashCode());
        hashCode = prime * hashCode + ((getElasticIpStatus() == null) ? 0 : getElasticIpStatus().hashCode());
        hashCode = prime * hashCode + ((getElasticResizeNumberOfNodeOptions() == null) ? 0 : getElasticResizeNumberOfNodeOptions().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getExpectedNextSnapshotScheduleTime() == null) ? 0 : getExpectedNextSnapshotScheduleTime().hashCode());
        hashCode = prime * hashCode + ((getExpectedNextSnapshotScheduleTimeStatus() == null) ? 0 : getExpectedNextSnapshotScheduleTimeStatus().hashCode());
        hashCode = prime * hashCode + ((getHsmStatus() == null) ? 0 : getHsmStatus().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getNextMaintenanceWindowStartTime() == null) ? 0 : getNextMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getPendingActions() == null) ? 0 : getPendingActions().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getResizeInfo() == null) ? 0 : getResizeInfo().hashCode());
        hashCode = prime * hashCode + ((getRestoreStatus() == null) ? 0 : getRestoreStatus().hashCode());
        hashCode = prime * hashCode + ((getSnapshotScheduleIdentifier() == null) ? 0 : getSnapshotScheduleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotScheduleState() == null) ? 0 : getSnapshotScheduleState().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterDetails clone() {
        try {
            return (AwsRedshiftClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
