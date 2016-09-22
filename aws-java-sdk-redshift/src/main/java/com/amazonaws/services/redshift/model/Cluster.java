/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a cluster.
 * </p>
 */
public class Cluster implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The node type for the nodes in the cluster.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     */
    private String clusterStatus;
    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     */
    private String modifyStatus;
    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in the
     * <b>DBName</b> parameter.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The name of the initial database that was created when the cluster was created. This same name is returned for
     * the life of the cluster. If an initial database was not specified, a database named <code>dev</code>dev was
     * created by default.
     * </p>
     */
    private String dBName;
    /**
     * <p>
     * The connection endpoint.
     * </p>
     */
    private Endpoint endpoint;
    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     */
    private java.util.Date clusterCreateTime;
    /**
     * <p>
     * The number of days that automatic cluster snapshots are retained.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * <p>
     * A list of cluster security group that are associated with the cluster. Each security group is represented by an
     * element that contains <code>ClusterSecurityGroup.Name</code> and <code>ClusterSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     * Clusters that are created in a VPC use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSecurityGroupMembership> clusterSecurityGroups;
    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This
     * parameter is returned only if the cluster is in a VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership> vpcSecurityGroups;
    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is
     * returned with its status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterParameterGroupStatus> clusterParameterGroups;
    /**
     * <p>
     * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster
     * is in a VPC.
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the Availability Zone in which the cluster is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     * identified by subelements.
     * </p>
     */
    private PendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * The version ID of the Amazon Redshift engine that is running on the cluster.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     * </p>
     */
    private Boolean allowVersionUpgrade;
    /**
     * <p>
     * The number of compute nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public network.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not
     * created by restoring a snapshot.
     * </p>
     */
    private RestoreStatus restoreStatus;
    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM)
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     */
    private HsmStatus hsmStatus;
    /**
     * <p>
     * A value that returns the destination region and retention period that are configured for cross-region snapshot
     * copy.
     * </p>
     */
    private ClusterSnapshotCopyStatus clusterSnapshotCopyStatus;
    /**
     * <p>
     * The public key for the cluster.
     * </p>
     */
    private String clusterPublicKey;
    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterNode> clusterNodes;
    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     */
    private ElasticIpStatus elasticIpStatus;
    /**
     * <p>
     * The specific revision number of the database in the cluster.
     * </p>
     */
    private String clusterRevisionNumber;
    /**
     * <p>
     * The list of tags for the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
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
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterIamRole> iamRoles;

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

    public Cluster withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
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

    public Cluster withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The current state of the cluster. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>final-snapshot</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hardware-failure</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-hsm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-network</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-parameters</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-restore</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modifying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rebooting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>renaming</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resizing</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rotating-keys</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>storage-full</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>updating-hsm</code>
     *        </p>
     *        </li>
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the cluster. Possible values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>available</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>final-snapshot</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hardware-failure</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-hsm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-network</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-parameters</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>incompatible-restore</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modifying</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rebooting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>renaming</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resizing</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rotating-keys</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>storage-full</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>updating-hsm</code>
     *         </p>
     *         </li>
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The current state of the cluster. Possible values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>final-snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hardware-failure</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-hsm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-parameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>incompatible-restore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modifying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>renaming</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resizing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating-keys</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>storage-full</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>updating-hsm</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The current state of the cluster. Possible values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>final-snapshot</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hardware-failure</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-hsm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-network</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-parameters</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>incompatible-restore</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modifying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rebooting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>renaming</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resizing</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rotating-keys</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>storage-full</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>updating-hsm</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     * 
     * @param modifyStatus
     *        The status of a modify operation, if any, initiated for the cluster.
     */

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     * 
     * @return The status of a modify operation, if any, initiated for the cluster.
     */

    public String getModifyStatus() {
        return this.modifyStatus;
    }

    /**
     * <p>
     * The status of a modify operation, if any, initiated for the cluster.
     * </p>
     * 
     * @param modifyStatus
     *        The status of a modify operation, if any, initiated for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withModifyStatus(String modifyStatus) {
        setModifyStatus(modifyStatus);
        return this;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in the
     * <b>DBName</b> parameter.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the cluster. This name is used to connect to the database that is specified in
     *        the <b>DBName</b> parameter.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in the
     * <b>DBName</b> parameter.
     * </p>
     * 
     * @return The master user name for the cluster. This name is used to connect to the database that is specified in
     *         the <b>DBName</b> parameter.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name for the cluster. This name is used to connect to the database that is specified in the
     * <b>DBName</b> parameter.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the cluster. This name is used to connect to the database that is specified in
     *        the <b>DBName</b> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was created. This same name is returned for
     * the life of the cluster. If an initial database was not specified, a database named <code>dev</code>dev was
     * created by default.
     * </p>
     * 
     * @param dBName
     *        The name of the initial database that was created when the cluster was created. This same name is returned
     *        for the life of the cluster. If an initial database was not specified, a database named <code>dev</code>
     *        dev was created by default.
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was created. This same name is returned for
     * the life of the cluster. If an initial database was not specified, a database named <code>dev</code>dev was
     * created by default.
     * </p>
     * 
     * @return The name of the initial database that was created when the cluster was created. This same name is
     *         returned for the life of the cluster. If an initial database was not specified, a database named
     *         <code>dev</code>dev was created by default.
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The name of the initial database that was created when the cluster was created. This same name is returned for
     * the life of the cluster. If an initial database was not specified, a database named <code>dev</code>dev was
     * created by default.
     * </p>
     * 
     * @param dBName
     *        The name of the initial database that was created when the cluster was created. This same name is returned
     *        for the life of the cluster. If an initial database was not specified, a database named <code>dev</code>
     *        dev was created by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        The connection endpoint.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The connection endpoint.
     * </p>
     * 
     * @return The connection endpoint.
     */

    public Endpoint getEndpoint() {
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

    public Cluster withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     * 
     * @param clusterCreateTime
     *        The date and time that the cluster was created.
     */

    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     * 
     * @return The date and time that the cluster was created.
     */

    public java.util.Date getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * The date and time that the cluster was created.
     * </p>
     * 
     * @param clusterCreateTime
     *        The date and time that the cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterCreateTime(java.util.Date clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
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

    public Cluster withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        setAutomatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster. Each security group is represented by an
     * element that contains <code>ClusterSecurityGroup.Name</code> and <code>ClusterSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     * Clusters that are created in a VPC use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     * 
     * @return A list of cluster security group that are associated with the cluster. Each security group is represented
     *         by an element that contains <code>ClusterSecurityGroup.Name</code> and
     *         <code>ClusterSecurityGroup.Status</code> subelements. </p>
     *         <p>
     *         Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud
     *         (VPC). Clusters that are created in a VPC use VPC security groups, which are listed by the
     *         <b>VpcSecurityGroups</b> parameter.
     */

    public java.util.List<ClusterSecurityGroupMembership> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
            clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<ClusterSecurityGroupMembership>();
        }
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster. Each security group is represented by an
     * element that contains <code>ClusterSecurityGroup.Name</code> and <code>ClusterSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     * Clusters that are created in a VPC use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security group that are associated with the cluster. Each security group is represented
     *        by an element that contains <code>ClusterSecurityGroup.Name</code> and
     *        <code>ClusterSecurityGroup.Status</code> subelements. </p>
     *        <p>
     *        Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     *        Clusters that are created in a VPC use VPC security groups, which are listed by the
     *        <b>VpcSecurityGroups</b> parameter.
     */

    public void setClusterSecurityGroups(java.util.Collection<ClusterSecurityGroupMembership> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }

        this.clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<ClusterSecurityGroupMembership>(clusterSecurityGroups);
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster. Each security group is represented by an
     * element that contains <code>ClusterSecurityGroup.Name</code> and <code>ClusterSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     * Clusters that are created in a VPC use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security group that are associated with the cluster. Each security group is represented
     *        by an element that contains <code>ClusterSecurityGroup.Name</code> and
     *        <code>ClusterSecurityGroup.Status</code> subelements. </p>
     *        <p>
     *        Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     *        Clusters that are created in a VPC use VPC security groups, which are listed by the
     *        <b>VpcSecurityGroups</b> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterSecurityGroups(ClusterSecurityGroupMembership... clusterSecurityGroups) {
        if (this.clusterSecurityGroups == null) {
            setClusterSecurityGroups(new com.amazonaws.internal.SdkInternalList<ClusterSecurityGroupMembership>(clusterSecurityGroups.length));
        }
        for (ClusterSecurityGroupMembership ele : clusterSecurityGroups) {
            this.clusterSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cluster security group that are associated with the cluster. Each security group is represented by an
     * element that contains <code>ClusterSecurityGroup.Name</code> and <code>ClusterSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     * Clusters that are created in a VPC use VPC security groups, which are listed by the <b>VpcSecurityGroups</b>
     * parameter.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security group that are associated with the cluster. Each security group is represented
     *        by an element that contains <code>ClusterSecurityGroup.Name</code> and
     *        <code>ClusterSecurityGroup.Status</code> subelements. </p>
     *        <p>
     *        Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC).
     *        Clusters that are created in a VPC use VPC security groups, which are listed by the
     *        <b>VpcSecurityGroups</b> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterSecurityGroups(java.util.Collection<ClusterSecurityGroupMembership> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This
     * parameter is returned only if the cluster is in a VPC.
     * </p>
     * 
     * @return A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster.
     *         This parameter is returned only if the cluster is in a VPC.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
            vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This
     * parameter is returned only if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster.
     *        This parameter is returned only if the cluster is in a VPC.
     */

    public void setVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroups);
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This
     * parameter is returned only if the cluster is in a VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster.
     *        This parameter is returned only if the cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        }
        for (VpcSecurityGroupMembership ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This
     * parameter is returned only if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster.
     *        This parameter is returned only if the cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is
     * returned with its status.
     * </p>
     * 
     * @return The list of cluster parameter groups that are associated with this cluster. Each parameter group in the
     *         list is returned with its status.
     */

    public java.util.List<ClusterParameterGroupStatus> getClusterParameterGroups() {
        if (clusterParameterGroups == null) {
            clusterParameterGroups = new com.amazonaws.internal.SdkInternalList<ClusterParameterGroupStatus>();
        }
        return clusterParameterGroups;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is
     * returned with its status.
     * </p>
     * 
     * @param clusterParameterGroups
     *        The list of cluster parameter groups that are associated with this cluster. Each parameter group in the
     *        list is returned with its status.
     */

    public void setClusterParameterGroups(java.util.Collection<ClusterParameterGroupStatus> clusterParameterGroups) {
        if (clusterParameterGroups == null) {
            this.clusterParameterGroups = null;
            return;
        }

        this.clusterParameterGroups = new com.amazonaws.internal.SdkInternalList<ClusterParameterGroupStatus>(clusterParameterGroups);
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is
     * returned with its status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterParameterGroups(java.util.Collection)} or
     * {@link #withClusterParameterGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterParameterGroups
     *        The list of cluster parameter groups that are associated with this cluster. Each parameter group in the
     *        list is returned with its status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterParameterGroups(ClusterParameterGroupStatus... clusterParameterGroups) {
        if (this.clusterParameterGroups == null) {
            setClusterParameterGroups(new com.amazonaws.internal.SdkInternalList<ClusterParameterGroupStatus>(clusterParameterGroups.length));
        }
        for (ClusterParameterGroupStatus ele : clusterParameterGroups) {
            this.clusterParameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is
     * returned with its status.
     * </p>
     * 
     * @param clusterParameterGroups
     *        The list of cluster parameter groups that are associated with this cluster. Each parameter group in the
     *        list is returned with its status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterParameterGroups(java.util.Collection<ClusterParameterGroupStatus> clusterParameterGroups) {
        setClusterParameterGroups(clusterParameterGroups);
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

    public Cluster withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     * 
     * @return The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC the cluster is in, if the cluster is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVpcId(String vpcId) {
        setVpcId(vpcId);
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

    public Cluster withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * 
     * @return The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     * identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     *        identified by subelements.
     */

    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     * identified by subelements.
     * </p>
     * 
     * @return A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     *         identified by subelements.
     */

    public PendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     * identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are
     *        identified by subelements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
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

    public Cluster withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     * </p>
     * 
     * @param allowVersionUpgrade
     *        A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied
     *        automatically to the cluster during the maintenance window.
     */

    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     * </p>
     * 
     * @return A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied
     *         automatically to the cluster during the maintenance window.
     */

    public Boolean getAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     * </p>
     * 
     * @param allowVersionUpgrade
     *        A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied
     *        automatically to the cluster during the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        setAllowVersionUpgrade(allowVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     * </p>
     * 
     * @return A Boolean value that, if <code>true</code>, indicates that major version upgrades will be applied
     *         automatically to the cluster during the maintenance window.
     */

    public Boolean isAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
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

    public Cluster withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public
     *        network.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public network.
     * </p>
     * 
     * @return A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public
     *         network.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public
     *        network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public network.
     * </p>
     * 
     * @return A Boolean value that, if <code>true</code>, indicates that the cluster can be accessed from a public
     *         network.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     * </p>
     * 
     * @param encrypted
     *        A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     * </p>
     * 
     * @return A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     * </p>
     * 
     * @param encrypted
     *        A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     * </p>
     * 
     * @return A Boolean value that, if <code>true</code>, indicates that data in the cluster is encrypted at rest.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not
     * created by restoring a snapshot.
     * </p>
     * 
     * @param restoreStatus
     *        A value that describes the status of a cluster restore action. This parameter returns null if the cluster
     *        was not created by restoring a snapshot.
     */

    public void setRestoreStatus(RestoreStatus restoreStatus) {
        this.restoreStatus = restoreStatus;
    }

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not
     * created by restoring a snapshot.
     * </p>
     * 
     * @return A value that describes the status of a cluster restore action. This parameter returns null if the cluster
     *         was not created by restoring a snapshot.
     */

    public RestoreStatus getRestoreStatus() {
        return this.restoreStatus;
    }

    /**
     * <p>
     * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not
     * created by restoring a snapshot.
     * </p>
     * 
     * @param restoreStatus
     *        A value that describes the status of a cluster restore action. This parameter returns null if the cluster
     *        was not created by restoring a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withRestoreStatus(RestoreStatus restoreStatus) {
        setRestoreStatus(restoreStatus);
        return this;
    }

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM)
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     * 
     * @param hsmStatus
     *        A value that reports whether the Amazon Redshift cluster has finished applying any hardware security
     *        module (HSM) settings changes specified in a modify cluster command.</p>
     *        <p>
     *        Values: active, applying
     */

    public void setHsmStatus(HsmStatus hsmStatus) {
        this.hsmStatus = hsmStatus;
    }

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM)
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     * 
     * @return A value that reports whether the Amazon Redshift cluster has finished applying any hardware security
     *         module (HSM) settings changes specified in a modify cluster command.</p>
     *         <p>
     *         Values: active, applying
     */

    public HsmStatus getHsmStatus() {
        return this.hsmStatus;
    }

    /**
     * <p>
     * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM)
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     * 
     * @param hsmStatus
     *        A value that reports whether the Amazon Redshift cluster has finished applying any hardware security
     *        module (HSM) settings changes specified in a modify cluster command.</p>
     *        <p>
     *        Values: active, applying
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withHsmStatus(HsmStatus hsmStatus) {
        setHsmStatus(hsmStatus);
        return this;
    }

    /**
     * <p>
     * A value that returns the destination region and retention period that are configured for cross-region snapshot
     * copy.
     * </p>
     * 
     * @param clusterSnapshotCopyStatus
     *        A value that returns the destination region and retention period that are configured for cross-region
     *        snapshot copy.
     */

    public void setClusterSnapshotCopyStatus(ClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        this.clusterSnapshotCopyStatus = clusterSnapshotCopyStatus;
    }

    /**
     * <p>
     * A value that returns the destination region and retention period that are configured for cross-region snapshot
     * copy.
     * </p>
     * 
     * @return A value that returns the destination region and retention period that are configured for cross-region
     *         snapshot copy.
     */

    public ClusterSnapshotCopyStatus getClusterSnapshotCopyStatus() {
        return this.clusterSnapshotCopyStatus;
    }

    /**
     * <p>
     * A value that returns the destination region and retention period that are configured for cross-region snapshot
     * copy.
     * </p>
     * 
     * @param clusterSnapshotCopyStatus
     *        A value that returns the destination region and retention period that are configured for cross-region
     *        snapshot copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterSnapshotCopyStatus(ClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        setClusterSnapshotCopyStatus(clusterSnapshotCopyStatus);
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

    public Cluster withClusterPublicKey(String clusterPublicKey) {
        setClusterPublicKey(clusterPublicKey);
        return this;
    }

    /**
     * <p>
     * The nodes in the cluster.
     * </p>
     * 
     * @return The nodes in the cluster.
     */

    public java.util.List<ClusterNode> getClusterNodes() {
        if (clusterNodes == null) {
            clusterNodes = new com.amazonaws.internal.SdkInternalList<ClusterNode>();
        }
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

    public void setClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        if (clusterNodes == null) {
            this.clusterNodes = null;
            return;
        }

        this.clusterNodes = new com.amazonaws.internal.SdkInternalList<ClusterNode>(clusterNodes);
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

    public Cluster withClusterNodes(ClusterNode... clusterNodes) {
        if (this.clusterNodes == null) {
            setClusterNodes(new com.amazonaws.internal.SdkInternalList<ClusterNode>(clusterNodes.length));
        }
        for (ClusterNode ele : clusterNodes) {
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

    public Cluster withClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        setClusterNodes(clusterNodes);
        return this;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * 
     * @param elasticIpStatus
     *        The status of the elastic IP (EIP) address.
     */

    public void setElasticIpStatus(ElasticIpStatus elasticIpStatus) {
        this.elasticIpStatus = elasticIpStatus;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * 
     * @return The status of the elastic IP (EIP) address.
     */

    public ElasticIpStatus getElasticIpStatus() {
        return this.elasticIpStatus;
    }

    /**
     * <p>
     * The status of the elastic IP (EIP) address.
     * </p>
     * 
     * @param elasticIpStatus
     *        The status of the elastic IP (EIP) address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withElasticIpStatus(ElasticIpStatus elasticIpStatus) {
        setElasticIpStatus(elasticIpStatus);
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

    public Cluster withClusterRevisionNumber(String clusterRevisionNumber) {
        setClusterRevisionNumber(clusterRevisionNumber);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster.
     * </p>
     * 
     * @return The list of tags for the cluster.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster.
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
     * The list of tags for the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTags(Tag... tags) {
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
     * The list of tags for the cluster.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the
     *         cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
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
     *        href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a>
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
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
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
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a>
     *         in the Amazon Redshift Cluster Management Guide.</p>
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
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
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
     *        href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a>
     *        in the Amazon Redshift Cluster Management Guide.</p>
     *        <p>
     *        If this option is <code>true</code>, enhanced VPC routing is enabled.
     *        </p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        setEnhancedVpcRouting(enhancedVpcRouting);
        return this;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster
     * that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a> in the
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
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html">Enhanced VPC Routing</a>
     *         in the Amazon Redshift Cluster Management Guide.</p>
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
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services.
     * </p>
     * 
     * @return A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *         AWS services.
     */

    public java.util.List<ClusterIamRole> getIamRoles() {
        if (iamRoles == null) {
            iamRoles = new com.amazonaws.internal.SdkInternalList<ClusterIamRole>();
        }
        return iamRoles;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services.
     */

    public void setIamRoles(java.util.Collection<ClusterIamRole> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }

        this.iamRoles = new com.amazonaws.internal.SdkInternalList<ClusterIamRole>(iamRoles);
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIamRoles(java.util.Collection)} or {@link #withIamRoles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withIamRoles(ClusterIamRole... iamRoles) {
        if (this.iamRoles == null) {
            setIamRoles(new com.amazonaws.internal.SdkInternalList<ClusterIamRole>(iamRoles.length));
        }
        for (ClusterIamRole ele : iamRoles) {
            this.iamRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withIamRoles(java.util.Collection<ClusterIamRole> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: " + getClusterStatus() + ",");
        if (getModifyStatus() != null)
            sb.append("ModifyStatus: " + getModifyStatus() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() + ",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getClusterParameterGroups() != null)
            sb.append("ClusterParameterGroups: " + getClusterParameterGroups() + ",");
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: " + getAllowVersionUpgrade() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getRestoreStatus() != null)
            sb.append("RestoreStatus: " + getRestoreStatus() + ",");
        if (getHsmStatus() != null)
            sb.append("HsmStatus: " + getHsmStatus() + ",");
        if (getClusterSnapshotCopyStatus() != null)
            sb.append("ClusterSnapshotCopyStatus: " + getClusterSnapshotCopyStatus() + ",");
        if (getClusterPublicKey() != null)
            sb.append("ClusterPublicKey: " + getClusterPublicKey() + ",");
        if (getClusterNodes() != null)
            sb.append("ClusterNodes: " + getClusterNodes() + ",");
        if (getElasticIpStatus() != null)
            sb.append("ElasticIpStatus: " + getElasticIpStatus() + ",");
        if (getClusterRevisionNumber() != null)
            sb.append("ClusterRevisionNumber: " + getClusterRevisionNumber() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting() + ",");
        if (getIamRoles() != null)
            sb.append("IamRoles: " + getIamRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getModifyStatus() == null ^ this.getModifyStatus() == null)
            return false;
        if (other.getModifyStatus() != null && other.getModifyStatus().equals(this.getModifyStatus()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getClusterParameterGroups() == null ^ this.getClusterParameterGroups() == null)
            return false;
        if (other.getClusterParameterGroups() != null && other.getClusterParameterGroups().equals(this.getClusterParameterGroups()) == false)
            return false;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getAllowVersionUpgrade() == null ^ this.getAllowVersionUpgrade() == null)
            return false;
        if (other.getAllowVersionUpgrade() != null && other.getAllowVersionUpgrade().equals(this.getAllowVersionUpgrade()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getRestoreStatus() == null ^ this.getRestoreStatus() == null)
            return false;
        if (other.getRestoreStatus() != null && other.getRestoreStatus().equals(this.getRestoreStatus()) == false)
            return false;
        if (other.getHsmStatus() == null ^ this.getHsmStatus() == null)
            return false;
        if (other.getHsmStatus() != null && other.getHsmStatus().equals(this.getHsmStatus()) == false)
            return false;
        if (other.getClusterSnapshotCopyStatus() == null ^ this.getClusterSnapshotCopyStatus() == null)
            return false;
        if (other.getClusterSnapshotCopyStatus() != null && other.getClusterSnapshotCopyStatus().equals(this.getClusterSnapshotCopyStatus()) == false)
            return false;
        if (other.getClusterPublicKey() == null ^ this.getClusterPublicKey() == null)
            return false;
        if (other.getClusterPublicKey() != null && other.getClusterPublicKey().equals(this.getClusterPublicKey()) == false)
            return false;
        if (other.getClusterNodes() == null ^ this.getClusterNodes() == null)
            return false;
        if (other.getClusterNodes() != null && other.getClusterNodes().equals(this.getClusterNodes()) == false)
            return false;
        if (other.getElasticIpStatus() == null ^ this.getElasticIpStatus() == null)
            return false;
        if (other.getElasticIpStatus() != null && other.getElasticIpStatus().equals(this.getElasticIpStatus()) == false)
            return false;
        if (other.getClusterRevisionNumber() == null ^ this.getClusterRevisionNumber() == null)
            return false;
        if (other.getClusterRevisionNumber() != null && other.getClusterRevisionNumber().equals(this.getClusterRevisionNumber()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getIamRoles() == null ^ this.getIamRoles() == null)
            return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getModifyStatus() == null) ? 0 : getModifyStatus().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterGroups() == null) ? 0 : getClusterParameterGroups().hashCode());
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getRestoreStatus() == null) ? 0 : getRestoreStatus().hashCode());
        hashCode = prime * hashCode + ((getHsmStatus() == null) ? 0 : getHsmStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterSnapshotCopyStatus() == null) ? 0 : getClusterSnapshotCopyStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterPublicKey() == null) ? 0 : getClusterPublicKey().hashCode());
        hashCode = prime * hashCode + ((getClusterNodes() == null) ? 0 : getClusterNodes().hashCode());
        hashCode = prime * hashCode + ((getElasticIpStatus() == null) ? 0 : getElasticIpStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterRevisionNumber() == null) ? 0 : getClusterRevisionNumber().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
