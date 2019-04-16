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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreFromClusterSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreFromClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     */
    private String snapshotClusterIdentifier;
    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean allowVersionUpgrade;
    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name where you
     * want the cluster restored.
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption
     * keys stored in an HSM.
     * </p>
     */
    private String hsmClientCertificateIdentifier;
    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     */
    private String hsmConfigurationIdentifier;
    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     */
    private String elasticIp;
    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group,
     * go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     * Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterParameterGroupName;
    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clusterSecurityGroups;
    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken. For more information about the
     * time blocks for each region, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * <p>
     * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     * indefinitely. This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster that you restore from a shared snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any
     * DS node type. In that case, you can choose to restore into another DS node type of the same size. For example,
     * you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you
     * must restore into that same instance type and size. In other words, you can only restore a dc1.large instance
     * type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to
     * dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a dc2.8large cluster. For more information
     * about node types, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     */
    private String nodeType;
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
     * Reserved.
     * </p>
     */
    private String additionalInfo;
    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM
     * roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> iamRoles;
    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the
     * <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different track than the cluster
     * that was the source for the snapshot. For example, suppose that you take a snapshot of a cluster that is on the
     * current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source
     * cluster are on different tracks.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     */
    private String snapshotScheduleIdentifier;

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster that will be created from restoring the snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alphabetic characters must be lowercase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unique for all clusters within an AWS account.
     *        </p>
     *        </li>
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the cluster that will be created from restoring the snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alphabetic characters must be lowercase.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be unique for all clusters within an AWS account.
     *         </p>
     *         </li>
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster that will be created from restoring the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alphabetic characters must be lowercase.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be unique for all clusters within an AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster that will be created from restoring the snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alphabetic characters must be lowercase.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be unique for all clusters within an AWS account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @param snapshotIdentifier
     *        The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.</p>
     *        <p>
     *        Example: <code>my-snapshot-id</code>
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @return The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.</p>
     *         <p>
     *         Example: <code>my-snapshot-id</code>
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.
     * </p>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @param snapshotIdentifier
     *        The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive.</p>
     *        <p>
     *        Example: <code>my-snapshot-id</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        The name of the cluster the source snapshot was created from. This parameter is required if your IAM user
     *        has a policy containing a snapshot resource element that specifies anything other than * for the cluster
     *        name.
     */

    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * 
     * @return The name of the cluster the source snapshot was created from. This parameter is required if your IAM user
     *         has a policy containing a snapshot resource element that specifies anything other than * for the cluster
     *         name.
     */

    public String getSnapshotClusterIdentifier() {
        return this.snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a
     * policy containing a snapshot resource element that specifies anything other than * for the cluster name.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        The name of the cluster the source snapshot was created from. This parameter is required if your IAM user
     *        has a policy containing a snapshot resource element that specifies anything other than * for the cluster
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        setSnapshotClusterIdentifier(snapshotClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     * 
     * @param port
     *        The port number on which the cluster accepts connections.</p>
     *        <p>
     *        Default: The same port as the original cluster.
     *        </p>
     *        <p>
     *        Constraints: Must be between <code>1115</code> and <code>65535</code>.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     * 
     * @return The port number on which the cluster accepts connections.</p>
     *         <p>
     *         Default: The same port as the original cluster.
     *         </p>
     *         <p>
     *         Constraints: Must be between <code>1115</code> and <code>65535</code>.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original cluster.
     * </p>
     * <p>
     * Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * </p>
     * 
     * @param port
     *        The port number on which the cluster accepts connections.</p>
     *        <p>
     *        Default: The same port as the original cluster.
     *        </p>
     *        <p>
     *        Constraints: Must be between <code>1115</code> and <code>65535</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone in which to restore the cluster.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1a</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @return The Amazon EC2 Availability Zone in which to restore the cluster.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1a</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone in which to restore the cluster.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1a</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param allowVersionUpgrade
     *        If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *        Redshift engine that is running on the cluster. </p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *         Redshift engine that is running on the cluster. </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param allowVersionUpgrade
     *        If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *        Redshift engine that is running on the cluster. </p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        setAllowVersionUpgrade(allowVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *         Redshift engine that is running on the cluster. </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name where you
     * want the cluster restored.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the subnet group where you want to cluster restored.</p>
     *        <p>
     *        A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name
     *        where you want the cluster restored.
     */

    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name where you
     * want the cluster restored.
     * </p>
     * 
     * @return The name of the subnet group where you want to cluster restored.</p>
     *         <p>
     *         A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name
     *         where you want the cluster restored.
     */

    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group where you want to cluster restored.
     * </p>
     * <p>
     * A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name where you
     * want the cluster restored.
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of the subnet group where you want to cluster restored.</p>
     *        <p>
     *        A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name
     *        where you want the cluster restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        If <code>true</code>, the cluster can be accessed from a public network.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     * 
     * @return If <code>true</code>, the cluster can be accessed from a public network.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        If <code>true</code>, the cluster can be accessed from a public network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     * 
     * @return If <code>true</code>, the cluster can be accessed from a public network.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you
     *        do not own, optional if you own the snapshot.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     * 
     * @return The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot
     *         you do not own, optional if you own the snapshot.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not
     * own, optional if you own the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you
     *        do not own, optional if you own the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption
     * keys stored in an HSM.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data
     *        encryption keys stored in an HSM.
     */

    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption
     * keys stored in an HSM.
     * </p>
     * 
     * @return Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data
     *         encryption keys stored in an HSM.
     */

    public String getHsmClientCertificateIdentifier() {
        return this.hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption
     * keys stored in an HSM.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data
     *        encryption keys stored in an HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        setHsmClientCertificateIdentifier(hsmClientCertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can
     *        use to retrieve and store keys in an HSM.
     */

    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     * 
     * @return Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can
     *         use to retrieve and store keys in an HSM.
     */

    public String getHsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to
     * retrieve and store keys in an HSM.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can
     *        use to retrieve and store keys in an HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
        return this;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * 
     * @param elasticIp
     *        The elastic IP (EIP) address for the cluster.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * 
     * @return The elastic IP (EIP) address for the cluster.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The elastic IP (EIP) address for the cluster.
     * </p>
     * 
     * @param elasticIp
     *        The elastic IP (EIP) address for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group,
     * go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     * Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterParameterGroupName
     *        The name of the parameter group to be associated with this cluster.</p>
     *        <p>
     *        Default: The default Amazon Redshift cluster parameter group. For information about the default parameter
     *        group, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     *        Amazon Redshift Parameter Groups</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group,
     * go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     * Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the parameter group to be associated with this cluster.</p>
     *         <p>
     *         Default: The default Amazon Redshift cluster parameter group. For information about the default parameter
     *         group, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     *         Amazon Redshift Parameter Groups</a>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getClusterParameterGroupName() {
        return this.clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group,
     * go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     * Amazon Redshift Parameter Groups</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterParameterGroupName
     *        The name of the parameter group to be associated with this cluster.</p>
     *        <p>
     *        Default: The default Amazon Redshift cluster parameter group. For information about the default parameter
     *        group, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     *        Amazon Redshift Parameter Groups</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withClusterParameterGroupName(String clusterParameterGroupName) {
        setClusterParameterGroupName(clusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     * 
     * @return A list of security groups to be associated with this cluster.</p>
     *         <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *         </p>
     *         <p>
     *         Cluster security groups only apply to clusters outside of VPCs.
     */

    public java.util.List<String> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
            clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of security groups to be associated with this cluster.</p>
     *        <p>
     *        Default: The default cluster security group for Amazon Redshift.
     *        </p>
     *        <p>
     *        Cluster security groups only apply to clusters outside of VPCs.
     */

    public void setClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }

        this.clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(clusterSecurityGroups);
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of security groups to be associated with this cluster.</p>
     *        <p>
     *        Default: The default cluster security group for Amazon Redshift.
     *        </p>
     *        <p>
     *        Cluster security groups only apply to clusters outside of VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
        if (this.clusterSecurityGroups == null) {
            setClusterSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(clusterSecurityGroups.length));
        }
        for (String ele : clusterSecurityGroups) {
            this.clusterSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * <p>
     * Cluster security groups only apply to clusters outside of VPCs.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of security groups to be associated with this cluster.</p>
     *        <p>
     *        Default: The default cluster security group for Amazon Redshift.
     *        </p>
     *        <p>
     *        Cluster security groups only apply to clusters outside of VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     * 
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *         <p>
     *         Default: The default VPC security group is associated with the cluster.
     *         </p>
     *         <p>
     *         VPC security groups only apply to clusters in VPCs.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *        <p>
     *        Default: The default VPC security group is associated with the cluster.
     *        </p>
     *        <p>
     *        VPC security groups only apply to clusters in VPCs.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *        <p>
     *        Default: The default VPC security group is associated with the cluster.
     *        </p>
     *        <p>
     *        VPC security groups only apply to clusters in VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * </p>
     * <p>
     * Default: The default VPC security group is associated with the cluster.
     * </p>
     * <p>
     * VPC security groups only apply to clusters in VPCs.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *        <p>
     *        Default: The default VPC security group is associated with the cluster.
     *        </p>
     *        <p>
     *        VPC security groups only apply to clusters in VPCs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken. For more information about the
     * time blocks for each region, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which automated cluster maintenance can occur.</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: The value selected for the cluster from which the snapshot was taken. For more information about
     *        the time blocks for each region, see <a href=
     *        "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     *        >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken. For more information about the
     * time blocks for each region, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range (in UTC) during which automated cluster maintenance can occur.</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Default: The value selected for the cluster from which the snapshot was taken. For more information about
     *         the time blocks for each region, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     *         >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken. For more information about the
     * time blocks for each region, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     * >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which automated cluster maintenance can occur.</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: The value selected for the cluster from which the snapshot was taken. For more information about
     *        the time blocks for each region, see <a href=
     *        "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows"
     *        >Maintenance Windows</a> in Amazon Redshift Cluster Management Guide.
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The number of days that automated snapshots are retained. If the value is 0, automated snapshots are
     *        disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want
     *        with <a>CreateClusterSnapshot</a>. </p>
     *        <p>
     *        Default: The value selected for the cluster from which the snapshot was taken.
     *        </p>
     *        <p>
     *        Constraints: Must be a value from 0 to 35.
     */

    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     * 
     * @return The number of days that automated snapshots are retained. If the value is 0, automated snapshots are
     *         disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want
     *         with <a>CreateClusterSnapshot</a>. </p>
     *         <p>
     *         Default: The value selected for the cluster from which the snapshot was taken.
     *         </p>
     *         <p>
     *         Constraints: Must be a value from 0 to 35.
     */

    public Integer getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: The value selected for the cluster from which the snapshot was taken.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The number of days that automated snapshots are retained. If the value is 0, automated snapshots are
     *        disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want
     *        with <a>CreateClusterSnapshot</a>. </p>
     *        <p>
     *        Default: The value selected for the cluster from which the snapshot was taken.
     *        </p>
     *        <p>
     *        Constraints: Must be a value from 0 to 35.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        setAutomatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     * indefinitely. This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     *        indefinitely. This setting doesn't change the retention period of existing snapshots.</p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     * indefinitely. This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @return The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     *         indefinitely. This setting doesn't change the retention period of existing snapshots.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     * indefinitely. This setting doesn't change the retention period of existing snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained
     *        indefinitely. This setting doesn't change the retention period of existing snapshots.</p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster that you restore from a shared snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in
     *        the cluster that you restore from a shared snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster that you restore from a shared snapshot.
     * </p>
     * 
     * @return The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in
     *         the cluster that you restore from a shared snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster that you restore from a shared snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in
     *        the cluster that you restore from a shared snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any
     * DS node type. In that case, you can choose to restore into another DS node type of the same size. For example,
     * you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you
     * must restore into that same instance type and size. In other words, you can only restore a dc1.large instance
     * type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to
     * dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a dc2.8large cluster. For more information
     * about node types, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param nodeType
     *        The node type that the restored cluster will be provisioned with.</p>
     *        <p>
     *        Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are
     *        using any DS node type. In that case, you can choose to restore into another DS node type of the same
     *        size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you
     *        have a DC instance type, you must restore into that same instance type and size. In other words, you can
     *        only restore a dc1.large instance type into another dc1.large instance type or dc2.large instance type.
     *        You can't restore dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a
     *        dc2.8large cluster. For more information about node types, see <a href=
     *        "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     *        About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any
     * DS node type. In that case, you can choose to restore into another DS node type of the same size. For example,
     * you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you
     * must restore into that same instance type and size. In other words, you can only restore a dc1.large instance
     * type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to
     * dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a dc2.8large cluster. For more information
     * about node types, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @return The node type that the restored cluster will be provisioned with.</p>
     *         <p>
     *         Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are
     *         using any DS node type. In that case, you can choose to restore into another DS node type of the same
     *         size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you
     *         have a DC instance type, you must restore into that same instance type and size. In other words, you can
     *         only restore a dc1.large instance type into another dc1.large instance type or dc2.large instance type.
     *         You can't restore dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a
     *         dc2.8large cluster. For more information about node types, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes"
     *         > About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type that the restored cluster will be provisioned with.
     * </p>
     * <p>
     * Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any
     * DS node type. In that case, you can choose to restore into another DS node type of the same size. For example,
     * you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you
     * must restore into that same instance type and size. In other words, you can only restore a dc1.large instance
     * type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to
     * dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a dc2.8large cluster. For more information
     * about node types, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param nodeType
     *        The node type that the restored cluster will be provisioned with.</p>
     *        <p>
     *        Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are
     *        using any DS node type. In that case, you can choose to restore into another DS node type of the same
     *        size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you
     *        have a DC instance type, you must restore into that same instance type and size. In other words, you can
     *        only restore a dc1.large instance type into another dc1.large instance type or dc2.large instance type.
     *        You can't restore dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a
     *        dc2.8large cluster. For more information about node types, see <a href=
     *        "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     *        About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
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

    public RestoreFromClusterSnapshotRequest withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
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
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM
     * roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @return A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *         AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *         to 10 IAM roles in a single request.</p>
     *         <p>
     *         A cluster can have up to 10 IAM roles associated at any time.
     */

    public java.util.List<String> getIamRoles() {
        if (iamRoles == null) {
            iamRoles = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return iamRoles;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM
     * roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *        to 10 IAM roles in a single request.</p>
     *        <p>
     *        A cluster can have up to 10 IAM roles associated at any time.
     */

    public void setIamRoles(java.util.Collection<String> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }

        this.iamRoles = new com.amazonaws.internal.SdkInternalList<String>(iamRoles);
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM
     * roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIamRoles(java.util.Collection)} or {@link #withIamRoles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *        to 10 IAM roles in a single request.</p>
     *        <p>
     *        A cluster can have up to 10 IAM roles associated at any time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withIamRoles(String... iamRoles) {
        if (this.iamRoles == null) {
            setIamRoles(new com.amazonaws.internal.SdkInternalList<String>(iamRoles.length));
        }
        for (String ele : iamRoles) {
            this.iamRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS
     * services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM
     * roles in a single request.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *        to 10 IAM roles in a single request.</p>
     *        <p>
     *        A cluster can have up to 10 IAM roles associated at any time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withIamRoles(java.util.Collection<String> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the
     * <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different track than the cluster
     * that was the source for the snapshot. For example, suppose that you take a snapshot of a cluster that is on the
     * current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source
     * cluster are on different tracks.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot
     *        inherits the <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different
     *        track than the cluster that was the source for the snapshot. For example, suppose that you take a snapshot
     *        of a cluster that is on the current track and then change the cluster to be on the trailing track. In this
     *        case, the snapshot and the source cluster are on different tracks.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the
     * <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different track than the cluster
     * that was the source for the snapshot. For example, suppose that you take a snapshot of a cluster that is on the
     * current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source
     * cluster are on different tracks.
     * </p>
     * 
     * @return The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot
     *         inherits the <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different
     *         track than the cluster that was the source for the snapshot. For example, suppose that you take a
     *         snapshot of a cluster that is on the current track and then change the cluster to be on the trailing
     *         track. In this case, the snapshot and the source cluster are on different tracks.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the
     * <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different track than the cluster
     * that was the source for the snapshot. For example, suppose that you take a snapshot of a cluster that is on the
     * current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source
     * cluster are on different tracks.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot
     *        inherits the <code>MaintenanceTrack</code> value from the cluster. The snapshot might be on a different
     *        track than the cluster that was the source for the snapshot. For example, suppose that you take a snapshot
     *        of a cluster that is on the current track and then change the cluster to be on the trailing track. In this
     *        case, the snapshot and the source cluster are on different tracks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     * 
     * @param snapshotScheduleIdentifier
     *        A unique identifier for the snapshot schedule.
     */

    public void setSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        this.snapshotScheduleIdentifier = snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     * 
     * @return A unique identifier for the snapshot schedule.
     */

    public String getSnapshotScheduleIdentifier() {
        return this.snapshotScheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot schedule.
     * </p>
     * 
     * @param snapshotScheduleIdentifier
     *        A unique identifier for the snapshot schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromClusterSnapshotRequest withSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
        setSnapshotScheduleIdentifier(snapshotScheduleIdentifier);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: ").append(getSnapshotClusterIdentifier()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: ").append(getAllowVersionUpgrade()).append(",");
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: ").append(getClusterSubnetGroupName()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: ").append(getHsmClientCertificateIdentifier()).append(",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: ").append(getHsmConfigurationIdentifier()).append(",");
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getClusterParameterGroupName() != null)
            sb.append("ClusterParameterGroupName: ").append(getClusterParameterGroupName()).append(",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: ").append(getClusterSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: ").append(getAutomatedSnapshotRetentionPeriod()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: ").append(getEnhancedVpcRouting()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getIamRoles() != null)
            sb.append("IamRoles: ").append(getIamRoles()).append(",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: ").append(getMaintenanceTrackName()).append(",");
        if (getSnapshotScheduleIdentifier() != null)
            sb.append("SnapshotScheduleIdentifier: ").append(getSnapshotScheduleIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreFromClusterSnapshotRequest == false)
            return false;
        RestoreFromClusterSnapshotRequest other = (RestoreFromClusterSnapshotRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAllowVersionUpgrade() == null ^ this.getAllowVersionUpgrade() == null)
            return false;
        if (other.getAllowVersionUpgrade() != null && other.getAllowVersionUpgrade().equals(this.getAllowVersionUpgrade()) == false)
            return false;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null)
            return false;
        if (other.getHsmClientCertificateIdentifier() != null
                && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false)
            return false;
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false)
            return false;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getClusterParameterGroupName() == null ^ this.getClusterParameterGroupName() == null)
            return false;
        if (other.getClusterParameterGroupName() != null && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getIamRoles() == null ^ this.getIamRoles() == null)
            return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getSnapshotScheduleIdentifier() == null ^ this.getSnapshotScheduleIdentifier() == null)
            return false;
        if (other.getSnapshotScheduleIdentifier() != null && other.getSnapshotScheduleIdentifier().equals(this.getSnapshotScheduleIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterGroupName() == null) ? 0 : getClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotScheduleIdentifier() == null) ? 0 : getSnapshotScheduleIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public RestoreFromClusterSnapshotRequest clone() {
        return (RestoreFromClusterSnapshotRequest) super.clone();
    }

}
