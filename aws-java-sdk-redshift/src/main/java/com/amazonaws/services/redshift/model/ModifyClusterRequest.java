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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements, there will be outage for a period while the
     * old cluster is deleted and your connection is switched to the new cluster. You can use <a>DescribeResize</a> to
     * track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you must also specify the number of nodes
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     * <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the node type
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the list of groups to apply, will be revoked
     * from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> clusterSecurityGroups;
    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     * asynchronously applied as soon as possible.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The new password for the cluster master user. This change is asynchronously applied as soon as possible. Between
     * the time of the request and the completion of the request, the <code>MasterUserPassword</code> element exists in
     * the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to regain access to the master user
     * account for a cluster if the password is lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @,
     * or space.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This change is applied only after the cluster
     * is rebooted. To reboot a cluster use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter group family that matches the cluster
     * version.
     * </p>
     */
    private String clusterParameterGroupName;
    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * If you decrease the automated snapshot retention period from its current value, existing automated snapshots that
     * fall outside of the new retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is retained. If the value is -1, the manual
     * snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of existing
     * manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system maintenance is
     * necessary during the window, it may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new maintenance window indicates the current time,
     * there must be at least 120 minutes between the current time and end of the window in order to ensure that pending
     * changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster parameter
     * group in the cluster parameter group family for the new version must be specified. The new cluster parameter
     * group can be the default for that cluster parameter group family. For more information about parameters and
     * parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied automatically to the cluster during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean allowVersionUpgrade;
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
     * The new identifier for the cluster.
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
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String newClusterIdentifier;
    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set to be
     * publicly available.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For
     * more information about provisioning clusters in EC2-VPC, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     */
    private String elasticIp;
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
     * The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The
     * new track name stays in the <code>PendingModifiedValues</code> for the cluster until the next maintenance window.
     * When the maintenance track changes, the cluster is switched to the latest cluster release available for the
     * maintenance track. At this point, the maintenance track name is applied.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     * <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we will use
     * legacy encryption if you specify that the cluster is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster to be modified.</p>
     *        <p>
     *        Example: <code>examplecluster</code>
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @return The unique identifier of the cluster to be modified.</p>
     *         <p>
     *         Example: <code>examplecluster</code>
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster to be modified.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster to be modified.</p>
     *        <p>
     *        Example: <code>examplecluster</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements, there will be outage for a period while the
     * old cluster is deleted and your connection is switched to the new cluster. You can use <a>DescribeResize</a> to
     * track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     * 
     * @param clusterType
     *        The new cluster type.</p>
     *        <p>
     *        When you submit your cluster resize request, your existing cluster goes into a read-only mode. After
     *        Amazon Redshift provisions a new cluster based on your resize requirements, there will be outage for a
     *        period while the old cluster is deleted and your connection is switched to the new cluster. You can use
     *        <a>DescribeResize</a> to track the progress of the resize request.
     *        </p>
     *        <p>
     *        Valid Values: <code> multi-node | single-node </code>
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements, there will be outage for a period while the
     * old cluster is deleted and your connection is switched to the new cluster. You can use <a>DescribeResize</a> to
     * track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     * 
     * @return The new cluster type.</p>
     *         <p>
     *         When you submit your cluster resize request, your existing cluster goes into a read-only mode. After
     *         Amazon Redshift provisions a new cluster based on your resize requirements, there will be outage for a
     *         period while the old cluster is deleted and your connection is switched to the new cluster. You can use
     *         <a>DescribeResize</a> to track the progress of the resize request.
     *         </p>
     *         <p>
     *         Valid Values: <code> multi-node | single-node </code>
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * The new cluster type.
     * </p>
     * <p>
     * When you submit your cluster resize request, your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements, there will be outage for a period while the
     * old cluster is deleted and your connection is switched to the new cluster. You can use <a>DescribeResize</a> to
     * track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code> multi-node | single-node </code>
     * </p>
     * 
     * @param clusterType
     *        The new cluster type.</p>
     *        <p>
     *        When you submit your cluster resize request, your existing cluster goes into a read-only mode. After
     *        Amazon Redshift provisions a new cluster based on your resize requirements, there will be outage for a
     *        period while the old cluster is deleted and your connection is switched to the new cluster. You can use
     *        <a>DescribeResize</a> to track the progress of the resize request.
     *        </p>
     *        <p>
     *        Valid Values: <code> multi-node | single-node </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you must also specify the number of nodes
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     * <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     * </p>
     * 
     * @param nodeType
     *        The new node type of the cluster. If you specify a new node type, you must also specify the number of
     *        nodes parameter.</p>
     *        <p>
     *        When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster
     *        to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there
     *        will be a temporary outage while the old cluster is deleted and your connection is switched to the new
     *        cluster. When the new connection is complete, the original access permissions for the cluster are
     *        restored. You can use <a>DescribeResize</a> to track the progress of the resize request.
     *        </p>
     *        <p>
     *        Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     *        <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you must also specify the number of nodes
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     * <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     * </p>
     * 
     * @return The new node type of the cluster. If you specify a new node type, you must also specify the number of
     *         nodes parameter.</p>
     *         <p>
     *         When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster
     *         to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your connection is switched to the new
     *         cluster. When the new connection is complete, the original access permissions for the cluster are
     *         restored. You can use <a>DescribeResize</a> to track the progress of the resize request.
     *         </p>
     *         <p>
     *         Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     *         <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The new node type of the cluster. If you specify a new node type, you must also specify the number of nodes
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     * <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     * </p>
     * 
     * @param nodeType
     *        The new node type of the cluster. If you specify a new node type, you must also specify the number of
     *        nodes parameter.</p>
     *        <p>
     *        When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster
     *        to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there
     *        will be a temporary outage while the old cluster is deleted and your connection is switched to the new
     *        cluster. When the new connection is complete, the original access permissions for the cluster are
     *        restored. You can use <a>DescribeResize</a> to track the progress of the resize request.
     *        </p>
     *        <p>
     *        Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>dc1.large</code> |
     *        <code>dc1.8xlarge</code> | <code>dc2.large</code> | <code>dc2.8xlarge</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the node type
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     * 
     * @param numberOfNodes
     *        The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the
     *        node type parameter.</p>
     *        <p>
     *        When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster
     *        to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there
     *        will be a temporary outage while the old cluster is deleted and your connection is switched to the new
     *        cluster. When the new connection is complete, the original access permissions for the cluster are
     *        restored. You can use <a>DescribeResize</a> to track the progress of the resize request.
     *        </p>
     *        <p>
     *        Valid Values: Integer greater than <code>0</code>.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the node type
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     * 
     * @return The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the
     *         node type parameter.</p>
     *         <p>
     *         When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster
     *         to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your connection is switched to the new
     *         cluster. When the new connection is complete, the original access permissions for the cluster are
     *         restored. You can use <a>DescribeResize</a> to track the progress of the resize request.
     *         </p>
     *         <p>
     *         Valid Values: Integer greater than <code>0</code>.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the node type
     * parameter.
     * </p>
     * <p>
     * When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to
     * read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a
     * temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the
     * new connection is complete, the original access permissions for the cluster are restored. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * </p>
     * <p>
     * Valid Values: Integer greater than <code>0</code>.
     * </p>
     * 
     * @param numberOfNodes
     *        The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the
     *        node type parameter.</p>
     *        <p>
     *        When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster
     *        to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there
     *        will be a temporary outage while the old cluster is deleted and your connection is switched to the new
     *        cluster. When the new connection is complete, the original access permissions for the cluster are
     *        restored. You can use <a>DescribeResize</a> to track the progress of the resize request.
     *        </p>
     *        <p>
     *        Valid Values: Integer greater than <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the list of groups to apply, will be revoked
     * from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied
     *         as soon as possible.</p>
     *         <p>
     *         Security groups currently associated with the cluster, and not in the list of groups to apply, will be
     *         revoked from the cluster.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public java.util.List<String> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
            clusterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clusterSecurityGroups;
    }

    /**
     * <p>
     * A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the list of groups to apply, will be revoked
     * from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Security groups currently associated with the cluster, and not in the list of groups to apply, will be
     *        revoked from the cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
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
     * A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the list of groups to apply, will be revoked
     * from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Security groups currently associated with the cluster, and not in the list of groups to apply, will be
     *        revoked from the cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
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
     * A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Security groups currently associated with the cluster, and not in the list of groups to apply, will be revoked
     * from the cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterSecurityGroups
     *        A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Security groups currently associated with the cluster, and not in the list of groups to apply, will be
     *        revoked from the cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        setClusterSecurityGroups(clusterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * 
     * @return A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     *         asynchronously applied as soon as possible.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     *        asynchronously applied as soon as possible.
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
     * A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     *        asynchronously applied as soon as possible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     * asynchronously applied as soon as possible.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is
     *        asynchronously applied as soon as possible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The new password for the cluster master user. This change is asynchronously applied as soon as possible. Between
     * the time of the request and the completion of the request, the <code>MasterUserPassword</code> element exists in
     * the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to regain access to the master user
     * account for a cluster if the password is lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @,
     * or space.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The new password for the cluster master user. This change is asynchronously applied as soon as possible.
     *        Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     *        element exists in the <code>PendingModifiedValues</code> element of the operation response. </p> <note>
     *        <p>
     *        Operations never return the password, so this operation provides a way to regain access to the master user
     *        account for a cluster if the password is lost.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be between 8 and 64 characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain at least one uppercase letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain at least one lowercase letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain one number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \,
     *        /, @, or space.
     *        </p>
     *        </li>
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the cluster master user. This change is asynchronously applied as soon as possible. Between
     * the time of the request and the completion of the request, the <code>MasterUserPassword</code> element exists in
     * the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to regain access to the master user
     * account for a cluster if the password is lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @,
     * or space.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new password for the cluster master user. This change is asynchronously applied as soon as possible.
     *         Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     *         element exists in the <code>PendingModifiedValues</code> element of the operation response. </p> <note>
     *         <p>
     *         Operations never return the password, so this operation provides a way to regain access to the master
     *         user account for a cluster if the password is lost.
     *         </p>
     *         </note>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be between 8 and 64 characters in length.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain at least one uppercase letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain at least one lowercase letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain one number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \,
     *         /, @, or space.
     *         </p>
     *         </li>
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the cluster master user. This change is asynchronously applied as soon as possible. Between
     * the time of the request and the completion of the request, the <code>MasterUserPassword</code> element exists in
     * the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Operations never return the password, so this operation provides a way to regain access to the master user
     * account for a cluster if the password is lost.
     * </p>
     * </note>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be between 8 and 64 characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one uppercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain at least one lowercase letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain one number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @,
     * or space.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The new password for the cluster master user. This change is asynchronously applied as soon as possible.
     *        Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     *        element exists in the <code>PendingModifiedValues</code> element of the operation response. </p> <note>
     *        <p>
     *        Operations never return the password, so this operation provides a way to regain access to the master user
     *        account for a cluster if the password is lost.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be between 8 and 64 characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain at least one uppercase letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain at least one lowercase letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain one number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \,
     *        /, @, or space.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This change is applied only after the cluster
     * is rebooted. To reboot a cluster use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter group family that matches the cluster
     * version.
     * </p>
     * 
     * @param clusterParameterGroupName
     *        The name of the cluster parameter group to apply to this cluster. This change is applied only after the
     *        cluster is rebooted. To reboot a cluster use <a>RebootCluster</a>. </p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Constraints: The cluster parameter group must be in the same parameter group family that matches the
     *        cluster version.
     */

    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This change is applied only after the cluster
     * is rebooted. To reboot a cluster use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter group family that matches the cluster
     * version.
     * </p>
     * 
     * @return The name of the cluster parameter group to apply to this cluster. This change is applied only after the
     *         cluster is rebooted. To reboot a cluster use <a>RebootCluster</a>. </p>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Constraints: The cluster parameter group must be in the same parameter group family that matches the
     *         cluster version.
     */

    public String getClusterParameterGroupName() {
        return this.clusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group to apply to this cluster. This change is applied only after the cluster
     * is rebooted. To reboot a cluster use <a>RebootCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: The cluster parameter group must be in the same parameter group family that matches the cluster
     * version.
     * </p>
     * 
     * @param clusterParameterGroupName
     *        The name of the cluster parameter group to apply to this cluster. This change is applied only after the
     *        cluster is rebooted. To reboot a cluster use <a>RebootCluster</a>. </p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Constraints: The cluster parameter group must be in the same parameter group family that matches the
     *        cluster version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterParameterGroupName(String clusterParameterGroupName) {
        setClusterParameterGroupName(clusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * If you decrease the automated snapshot retention period from its current value, existing automated snapshots that
     * fall outside of the new retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
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
     *        If you decrease the automated snapshot retention period from its current value, existing automated
     *        snapshots that fall outside of the new retention period will be immediately deleted.
     *        </p>
     *        <p>
     *        Default: Uses existing setting.
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
     * If you decrease the automated snapshot retention period from its current value, existing automated snapshots that
     * fall outside of the new retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     * 
     * @return The number of days that automated snapshots are retained. If the value is 0, automated snapshots are
     *         disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want
     *         with <a>CreateClusterSnapshot</a>. </p>
     *         <p>
     *         If you decrease the automated snapshot retention period from its current value, existing automated
     *         snapshots that fall outside of the new retention period will be immediately deleted.
     *         </p>
     *         <p>
     *         Default: Uses existing setting.
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
     * If you decrease the automated snapshot retention period from its current value, existing automated snapshots that
     * fall outside of the new retention period will be immediately deleted.
     * </p>
     * <p>
     * Default: Uses existing setting.
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
     *        If you decrease the automated snapshot retention period from its current value, existing automated
     *        snapshots that fall outside of the new retention period will be immediately deleted.
     *        </p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Constraints: Must be a value from 0 to 35.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        setAutomatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is retained. If the value is -1, the manual
     * snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of existing
     * manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The default for number of days that a newly created manual snapshot is retained. If the value is -1, the
     *        manual snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of
     *        existing manual snapshots.</p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        The default value is -1.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is retained. If the value is -1, the manual
     * snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of existing
     * manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @return The default for number of days that a newly created manual snapshot is retained. If the value is -1, the
     *         manual snapshot is retained indefinitely. This value doesn't retroactively change the retention periods
     *         of existing manual snapshots.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         The default value is -1.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The default for number of days that a newly created manual snapshot is retained. If the value is -1, the manual
     * snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of existing
     * manual snapshots.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The default for number of days that a newly created manual snapshot is retained. If the value is -1, the
     *        manual snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of
     *        existing manual snapshots.</p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        The default value is -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system maintenance is
     * necessary during the window, it may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new maintenance window indicates the current time,
     * there must be at least 120 minutes between the current time and end of the window in order to ensure that pending
     * changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system
     *        maintenance is necessary during the window, it may result in an outage.</p>
     *        <p>
     *        This maintenance window change is made immediately. If the new maintenance window indicates the current
     *        time, there must be at least 120 minutes between the current time and end of the window in order to ensure
     *        that pending changes are applied.
     *        </p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system maintenance is
     * necessary during the window, it may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new maintenance window indicates the current time,
     * there must be at least 120 minutes between the current time and end of the window in order to ensure that pending
     * changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * 
     * @return The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system
     *         maintenance is necessary during the window, it may result in an outage.</p>
     *         <p>
     *         This maintenance window change is made immediately. If the new maintenance window indicates the current
     *         time, there must be at least 120 minutes between the current time and end of the window in order to
     *         ensure that pending changes are applied.
     *         </p>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system maintenance is
     * necessary during the window, it may result in an outage.
     * </p>
     * <p>
     * This maintenance window change is made immediately. If the new maintenance window indicates the current time,
     * there must be at least 120 minutes between the current time and end of the window in order to ensure that pending
     * changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system
     *        maintenance is necessary during the window, it may result in an outage.</p>
     *        <p>
     *        This maintenance window change is made immediately. If the new maintenance window indicates the current
     *        time, there must be at least 120 minutes between the current time and end of the window in order to ensure
     *        that pending changes are applied.
     *        </p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster parameter
     * group in the cluster parameter group family for the new version must be specified. The new cluster parameter
     * group can be the default for that cluster parameter group family. For more information about parameters and
     * parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * 
     * @param clusterVersion
     *        The new version number of the Amazon Redshift engine to upgrade to.</p>
     *        <p>
     *        For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster
     *        parameter group in the cluster parameter group family for the new version must be specified. The new
     *        cluster parameter group can be the default for that cluster parameter group family. For more information
     *        about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     *        </p>
     *        <p>
     *        Example: <code>1.0</code>
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster parameter
     * group in the cluster parameter group family for the new version must be specified. The new cluster parameter
     * group can be the default for that cluster parameter group family. For more information about parameters and
     * parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * 
     * @return The new version number of the Amazon Redshift engine to upgrade to.</p>
     *         <p>
     *         For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster
     *         parameter group in the cluster parameter group family for the new version must be specified. The new
     *         cluster parameter group can be the default for that cluster parameter group family. For more information
     *         about parameters and parameter groups, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     *         Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     *         </p>
     *         <p>
     *         Example: <code>1.0</code>
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The new version number of the Amazon Redshift engine to upgrade to.
     * </p>
     * <p>
     * For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster parameter
     * group in the cluster parameter group family for the new version must be specified. The new cluster parameter
     * group can be the default for that cluster parameter group family. For more information about parameters and
     * parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * 
     * @param clusterVersion
     *        The new version number of the Amazon Redshift engine to upgrade to.</p>
     *        <p>
     *        For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster
     *        parameter group in the cluster parameter group family for the new version must be specified. The new
     *        cluster parameter group can be the default for that cluster parameter group family. For more information
     *        about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     *        </p>
     *        <p>
     *        Example: <code>1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied automatically to the cluster during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param allowVersionUpgrade
     *        If <code>true</code>, major version upgrades will be applied automatically to the cluster during the
     *        maintenance window. </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied automatically to the cluster during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If <code>true</code>, major version upgrades will be applied automatically to the cluster during the
     *         maintenance window. </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied automatically to the cluster during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param allowVersionUpgrade
     *        If <code>true</code>, major version upgrades will be applied automatically to the cluster during the
     *        maintenance window. </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        setAllowVersionUpgrade(allowVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades will be applied automatically to the cluster during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If <code>true</code>, major version upgrades will be applied automatically to the cluster during the
     *         maintenance window. </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
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

    public ModifyClusterRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
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

    public ModifyClusterRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
        return this;
    }

    /**
     * <p>
     * The new identifier for the cluster.
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
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param newClusterIdentifier
     *        The new identifier for the cluster.</p>
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
     *        </ul>
     *        <p>
     *        Example: <code>examplecluster</code>
     */

    public void setNewClusterIdentifier(String newClusterIdentifier) {
        this.newClusterIdentifier = newClusterIdentifier;
    }

    /**
     * <p>
     * The new identifier for the cluster.
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
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @return The new identifier for the cluster.</p>
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
     *         </ul>
     *         <p>
     *         Example: <code>examplecluster</code>
     */

    public String getNewClusterIdentifier() {
        return this.newClusterIdentifier;
    }

    /**
     * <p>
     * The new identifier for the cluster.
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
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * 
     * @param newClusterIdentifier
     *        The new identifier for the cluster.</p>
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
     *        </ul>
     *        <p>
     *        Example: <code>examplecluster</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withNewClusterIdentifier(String newClusterIdentifier) {
        setNewClusterIdentifier(newClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set to be
     * publicly available.
     * </p>
     * 
     * @param publiclyAccessible
     *        If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set
     *        to be publicly available.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set to be
     * publicly available.
     * </p>
     * 
     * @return If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set
     *         to be publicly available.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set to be
     * publicly available.
     * </p>
     * 
     * @param publiclyAccessible
     *        If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set
     *        to be publicly available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set to be
     * publicly available.
     * </p>
     * 
     * @return If <code>true</code>, the cluster can be accessed from a public network. Only clusters in VPCs can be set
     *         to be publicly available.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For
     * more information about provisioning clusters in EC2-VPC, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param elasticIp
     *        The Elastic IP (EIP) address for the cluster.</p>
     *        <p>
     *        Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet
     *        gateway. For more information about provisioning clusters in EC2-VPC, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     *        >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For
     * more information about provisioning clusters in EC2-VPC, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @return The Elastic IP (EIP) address for the cluster.</p>
     *         <p>
     *         Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet
     *         gateway. For more information about provisioning clusters in EC2-VPC, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     *         >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The Elastic IP (EIP) address for the cluster.
     * </p>
     * <p>
     * Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For
     * more information about provisioning clusters in EC2-VPC, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param elasticIp
     *        The Elastic IP (EIP) address for the cluster.</p>
     *        <p>
     *        Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet
     *        gateway. For more information about provisioning clusters in EC2-VPC, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms"
     *        >Supported Platforms to Launch Your Cluster</a> in the Amazon Redshift Cluster Management Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
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

    public ModifyClusterRequest withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
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
     * The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The
     * new track name stays in the <code>PendingModifiedValues</code> for the cluster until the next maintenance window.
     * When the maintenance track changes, the cluster is switched to the latest cluster release available for the
     * maintenance track. At this point, the maintenance track name is applied.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name for the maintenance track that you want to assign for the cluster. This name change is
     *        asynchronous. The new track name stays in the <code>PendingModifiedValues</code> for the cluster until the
     *        next maintenance window. When the maintenance track changes, the cluster is switched to the latest cluster
     *        release available for the maintenance track. At this point, the maintenance track name is applied.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The
     * new track name stays in the <code>PendingModifiedValues</code> for the cluster until the next maintenance window.
     * When the maintenance track changes, the cluster is switched to the latest cluster release available for the
     * maintenance track. At this point, the maintenance track name is applied.
     * </p>
     * 
     * @return The name for the maintenance track that you want to assign for the cluster. This name change is
     *         asynchronous. The new track name stays in the <code>PendingModifiedValues</code> for the cluster until
     *         the next maintenance window. When the maintenance track changes, the cluster is switched to the latest
     *         cluster release available for the maintenance track. At this point, the maintenance track name is
     *         applied.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The
     * new track name stays in the <code>PendingModifiedValues</code> for the cluster until the next maintenance window.
     * When the maintenance track changes, the cluster is switched to the latest cluster release available for the
     * maintenance track. At this point, the maintenance track name is applied.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name for the maintenance track that you want to assign for the cluster. This name change is
     *        asynchronous. The new track name stays in the <code>PendingModifiedValues</code> for the cluster until the
     *        next maintenance window. When the maintenance track changes, the cluster is switched to the latest cluster
     *        release available for the maintenance track. At this point, the maintenance track name is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     * <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we will use
     * legacy encryption if you specify that the cluster is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     *        <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If
     *        you don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we
     *        will use legacy encryption if you specify that the cluster is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     * <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we will use
     * legacy encryption if you specify that the cluster is encrypted.
     * </p>
     * 
     * @return Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     *         <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If
     *         you don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we
     *         will use legacy encryption if you specify that the cluster is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     * <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we will use
     * legacy encryption if you specify that the cluster is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     *        <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If
     *        you don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we
     *        will use legacy encryption if you specify that the cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     * <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If you
     * don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we will use
     * legacy encryption if you specify that the cluster is encrypted.
     * </p>
     * 
     * @return Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the
     *         <code>KmsKeyId</code> parameter, we will encrypt the cluster with the provided <code>KmsKeyId</code>. If
     *         you don't provide a <code>KmsKeyId</code>, we will encrypt with the default key. In the China region we
     *         will use legacy encryption if you specify that the cluster is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in
     *        the cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster.
     * </p>
     * 
     * @return The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in
     *         the cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in
     *        the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: ").append(getClusterSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getClusterParameterGroupName() != null)
            sb.append("ClusterParameterGroupName: ").append(getClusterParameterGroupName()).append(",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: ").append(getAutomatedSnapshotRetentionPeriod()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: ").append(getAllowVersionUpgrade()).append(",");
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: ").append(getHsmClientCertificateIdentifier()).append(",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: ").append(getHsmConfigurationIdentifier()).append(",");
        if (getNewClusterIdentifier() != null)
            sb.append("NewClusterIdentifier: ").append(getNewClusterIdentifier()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: ").append(getEnhancedVpcRouting()).append(",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: ").append(getMaintenanceTrackName()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterRequest == false)
            return false;
        ModifyClusterRequest other = (ModifyClusterRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getClusterParameterGroupName() == null ^ this.getClusterParameterGroupName() == null)
            return false;
        if (other.getClusterParameterGroupName() != null && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false)
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
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getAllowVersionUpgrade() == null ^ this.getAllowVersionUpgrade() == null)
            return false;
        if (other.getAllowVersionUpgrade() != null && other.getAllowVersionUpgrade().equals(this.getAllowVersionUpgrade()) == false)
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
        if (other.getNewClusterIdentifier() == null ^ this.getNewClusterIdentifier() == null)
            return false;
        if (other.getNewClusterIdentifier() != null && other.getNewClusterIdentifier().equals(this.getNewClusterIdentifier()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterGroupName() == null) ? 0 : getClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNewClusterIdentifier() == null) ? 0 : getNewClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterRequest clone() {
        return (ModifyClusterRequest) super.clone();
    }

}
