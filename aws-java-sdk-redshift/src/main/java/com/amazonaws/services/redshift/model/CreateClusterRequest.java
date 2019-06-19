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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the first database to be created when the cluster is created.
     * </p>
     * <p>
     * To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL
     * commands to create a database. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in the
     * Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Default: <code>dev</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String dBName;
    /**
     * <p>
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster
     * operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console.
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
     * Example: <code>myexamplecluster</code>
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The type of the cluster. When cluster type is specified as
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * <p>
     * Default: <code>multi-node</code>
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The node type to be provisioned for the cluster. For information about node types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     * <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     * <code>dc2.8xlarge</code>
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The user name associated with the master user account for the cluster that is being created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password associated with the master user account for the cluster that is being created.
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
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
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
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The name of a cluster subnet group to be associated with this cluster.
     * </p>
     * <p>
     * If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * </p>
     */
    private String clusterSubnetGroupName;
    /**
     * <p>
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you
     * have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be
     * provisioned in the same zone in order to decrease network latency.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. For more information about the time blocks for each region, see <a
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
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group,
     * go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     * Amazon Redshift Parameter Groups</a>
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
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled.
     * Even if automated snapshots are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>.
     * </p>
     * <p>
     * Default: <code>1</code>
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
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * <p>
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires
     * the port on which the cluster will listen for incoming connections.
     * </p>
     * <p>
     * Default: <code>5439</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * </p>
     * <p>
     * The version selected runs on all the nodes in the cluster.
     * </p>
     * <p>
     * Constraints: Only version 1.0 is currently available.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * When a new major version of the Amazon Redshift engine is released, you can request that the service
     * automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean allowVersionUpgrade;
    /**
     * <p>
     * The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b> parameter is
     * specified as <code>multi-node</code>.
     * </p>
     * <p>
     * For information about determining how many nodes you need, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you
     * must specify the number of nodes that you want in the cluster.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Constraints: Value must be at least 1 and no more than 100.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * If <code>true</code>, the cluster can be accessed from a public network.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * If <code>true</code>, the data in the cluster is encrypted at rest.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean encrypted;
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
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the
     * cluster.
     * </p>
     */
    private String kmsKeyId;
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
     * A cluster can have up to 10 IAM roles associated with it at any time.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> iamRoles;
    /**
     * <p>
     * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance
     * track name, the cluster is assigned to the <code>current</code> track.
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
     * The name of the first database to be created when the cluster is created.
     * </p>
     * <p>
     * To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL
     * commands to create a database. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in the
     * Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Default: <code>dev</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The name of the first database to be created when the cluster is created.</p>
     *        <p>
     *        To create additional databases after the cluster is created, connect to the cluster with a SQL client and
     *        use SQL commands to create a database. For more information, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in
     *        the Amazon Redshift Database Developer Guide.
     *        </p>
     *        <p>
     *        Default: <code>dev</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the first database to be created when the cluster is created.
     * </p>
     * <p>
     * To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL
     * commands to create a database. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in the
     * Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Default: <code>dev</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the first database to be created when the cluster is created.</p>
     *         <p>
     *         To create additional databases after the cluster is created, connect to the cluster with a SQL client and
     *         use SQL commands to create a database. For more information, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in
     *         the Amazon Redshift Database Developer Guide.
     *         </p>
     *         <p>
     *         Default: <code>dev</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     *         href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *         Redshift Database Developer Guide.
     *         </p>
     *         </li>
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The name of the first database to be created when the cluster is created.
     * </p>
     * <p>
     * To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL
     * commands to create a database. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in the
     * Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Default: <code>dev</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The name of the first database to be created when the cluster is created.</p>
     *        <p>
     *        To create additional databases after the cluster is created, connect to the cluster with a SQL client and
     *        use SQL commands to create a database. For more information, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create a Database</a> in
     *        the Amazon Redshift Database Developer Guide.
     *        </p>
     *        <p>
     *        Default: <code>dev</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word that is reserved by the service. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster
     * operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console.
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
     * Example: <code>myexamplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent
     *        cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift
     *        console.</p>
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
     *        Example: <code>myexamplecluster</code>
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster
     * operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console.
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
     * Example: <code>myexamplecluster</code>
     * </p>
     * 
     * @return A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent
     *         cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift
     *         console.</p>
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
     *         Example: <code>myexamplecluster</code>
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster
     * operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console.
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
     * Example: <code>myexamplecluster</code>
     * </p>
     * 
     * @param clusterIdentifier
     *        A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent
     *        cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift
     *        console.</p>
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
     *        Example: <code>myexamplecluster</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the cluster. When cluster type is specified as
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * <p>
     * Default: <code>multi-node</code>
     * </p>
     * 
     * @param clusterType
     *        The type of the cluster. When cluster type is specified as</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid Values: <code>multi-node</code> | <code>single-node</code>
     *        </p>
     *        <p>
     *        Default: <code>multi-node</code>
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The type of the cluster. When cluster type is specified as
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * <p>
     * Default: <code>multi-node</code>
     * </p>
     * 
     * @return The type of the cluster. When cluster type is specified as</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid Values: <code>multi-node</code> | <code>single-node</code>
     *         </p>
     *         <p>
     *         Default: <code>multi-node</code>
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * The type of the cluster. When cluster type is specified as
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * <p>
     * Default: <code>multi-node</code>
     * </p>
     * 
     * @param clusterType
     *        The type of the cluster. When cluster type is specified as</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>single-node</code>, the <b>NumberOfNodes</b> parameter is not required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>multi-node</code>, the <b>NumberOfNodes</b> parameter is required.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid Values: <code>multi-node</code> | <code>single-node</code>
     *        </p>
     *        <p>
     *        Default: <code>multi-node</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * The node type to be provisioned for the cluster. For information about node types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     * <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     * <code>dc2.8xlarge</code>
     * </p>
     * 
     * @param nodeType
     *        The node type to be provisioned for the cluster. For information about node types, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working
     *        with Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
     *        <p>
     *        Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     *        <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     *        <code>dc2.8xlarge</code>
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type to be provisioned for the cluster. For information about node types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     * <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     * <code>dc2.8xlarge</code>
     * </p>
     * 
     * @return The node type to be provisioned for the cluster. For information about node types, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
     *         <p>
     *         Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     *         <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     *         <code>dc2.8xlarge</code>
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type to be provisioned for the cluster. For information about node types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     * <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     * <code>dc2.8xlarge</code>
     * </p>
     * 
     * @param nodeType
     *        The node type to be provisioned for the cluster. For information about node types, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working
     *        with Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>. </p>
     *        <p>
     *        Valid Values: <code>ds2.xlarge</code> | <code>ds2.8xlarge</code> | <code>ds2.xlarge</code> |
     *        <code>ds2.8xlarge</code> | <code>dc1.large</code> | <code>dc1.8xlarge</code> | <code>dc2.large</code> |
     *        <code>dc2.8xlarge</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The user name associated with the master user account for the cluster that is being created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The user name associated with the master user account for the cluster that is being created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The user name associated with the master user account for the cluster that is being created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user name associated with the master user account for the cluster that is being created.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found in <a
     *         href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *         Redshift Database Developer Guide.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The user name associated with the master user account for the cluster that is being created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     * Redshift Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The user name associated with the master user account for the cluster that is being created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 - 128 alphanumeric characters. The user name can't be <code>PUBLIC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password associated with the master user account for the cluster that is being created.
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
     *        The password associated with the master user account for the cluster that is being created.</p>
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
     * The password associated with the master user account for the cluster that is being created.
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
     * @return The password associated with the master user account for the cluster that is being created.</p>
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
     * The password associated with the master user account for the cluster that is being created.
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
     *        The password associated with the master user account for the cluster that is being created.</p>
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

    public CreateClusterRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A list of security groups to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default cluster security group for Amazon Redshift.
     * </p>
     * 
     * @return A list of security groups to be associated with this cluster.</p>
     *         <p>
     *         Default: The default cluster security group for Amazon Redshift.
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
     * 
     * @param clusterSecurityGroups
     *        A list of security groups to be associated with this cluster.</p>
     *        <p>
     *        Default: The default cluster security group for Amazon Redshift.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clusterSecurityGroups
     *        A list of security groups to be associated with this cluster.</p>
     *        <p>
     *        Default: The default cluster security group for Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
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
     * 
     * @param clusterSecurityGroups
     *        A list of security groups to be associated with this cluster.</p>
     *        <p>
     *        Default: The default cluster security group for Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
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
     * 
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *         <p>
     *         Default: The default VPC security group is associated with the cluster.
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
     * 
     * @param vpcSecurityGroupIds
     *        A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *        <p>
     *        Default: The default VPC security group is associated with the cluster.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *        <p>
     *        Default: The default VPC security group is associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * 
     * @param vpcSecurityGroupIds
     *        A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.</p>
     *        <p>
     *        Default: The default VPC security group is associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The name of a cluster subnet group to be associated with this cluster.
     * </p>
     * <p>
     * If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of a cluster subnet group to be associated with this cluster.</p>
     *        <p>
     *        If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud
     *        (VPC).
     */

    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of a cluster subnet group to be associated with this cluster.
     * </p>
     * <p>
     * If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * </p>
     * 
     * @return The name of a cluster subnet group to be associated with this cluster.</p>
     *         <p>
     *         If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud
     *         (VPC).
     */

    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }

    /**
     * <p>
     * The name of a cluster subnet group to be associated with this cluster.
     * </p>
     * <p>
     * If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * </p>
     * 
     * @param clusterSubnetGroupName
     *        The name of a cluster subnet group to be associated with this cluster.</p>
     *        <p>
     *        If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud
     *        (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        setClusterSubnetGroupName(clusterSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you
     * have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be
     * provisioned in the same zone in order to decrease network latency.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if
     *        you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to
     *        be provisioned in the same zone in order to decrease network latency.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     *        </p>
     *        <p>
     *        Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you
     * have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be
     * provisioned in the same zone in order to decrease network latency.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     * 
     * @return The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example,
     *         if you have several EC2 instances running in a specific Availability Zone, then you might want the
     *         cluster to be provisioned in the same zone in order to decrease network latency.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     *         </p>
     *         <p>
     *         Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you
     * have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be
     * provisioned in the same zone in order to decrease network latency.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if
     *        you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to
     *        be provisioned in the same zone in order to decrease network latency.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     *        </p>
     *        <p>
     *        Constraint: The specified Availability Zone must be in the same region as the current endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. For more information about the time blocks for each region, see <a
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
     *        Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a
     *        random day of the week. For more information about the time blocks for each region, see <a href=
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
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. For more information about the time blocks for each region, see <a
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
     *         Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a
     *         random day of the week. For more information about the time blocks for each region, see <a href=
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
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. For more information about the time blocks for each region, see <a
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
     *        Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a
     *        random day of the week. For more information about the time blocks for each region, see <a href=
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

    public CreateClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group to be associated with this cluster.
     * </p>
     * <p>
     * Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group,
     * go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working with
     * Amazon Redshift Parameter Groups</a>
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
     *        Amazon Redshift Parameter Groups</a>
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
     * Amazon Redshift Parameter Groups</a>
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
     *         Amazon Redshift Parameter Groups</a>
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
     * Amazon Redshift Parameter Groups</a>
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
     *        Amazon Redshift Parameter Groups</a>
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

    public CreateClusterRequest withClusterParameterGroupName(String clusterParameterGroupName) {
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
     * Default: <code>1</code>
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
     *        Default: <code>1</code>
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
     * Default: <code>1</code>
     * </p>
     * <p>
     * Constraints: Must be a value from 0 to 35.
     * </p>
     * 
     * @return The number of days that automated snapshots are retained. If the value is 0, automated snapshots are
     *         disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want
     *         with <a>CreateClusterSnapshot</a>. </p>
     *         <p>
     *         Default: <code>1</code>
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
     * Default: <code>1</code>
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
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Constraints: Must be a value from 0 to 35.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
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

    public CreateClusterRequest withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * <p>
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires
     * the port on which the cluster will listen for incoming connections.
     * </p>
     * <p>
     * Default: <code>5439</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number on which the cluster accepts incoming connections.</p>
     *        <p>
     *        The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string
     *        requires the port on which the cluster will listen for incoming connections.
     *        </p>
     *        <p>
     *        Default: <code>5439</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * <p>
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires
     * the port on which the cluster will listen for incoming connections.
     * </p>
     * <p>
     * Default: <code>5439</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @return The port number on which the cluster accepts incoming connections.</p>
     *         <p>
     *         The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string
     *         requires the port on which the cluster will listen for incoming connections.
     *         </p>
     *         <p>
     *         Default: <code>5439</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the cluster accepts incoming connections.
     * </p>
     * <p>
     * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires
     * the port on which the cluster will listen for incoming connections.
     * </p>
     * <p>
     * Default: <code>5439</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number on which the cluster accepts incoming connections.</p>
     *        <p>
     *        The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string
     *        requires the port on which the cluster will listen for incoming connections.
     *        </p>
     *        <p>
     *        Default: <code>5439</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * </p>
     * <p>
     * The version selected runs on all the nodes in the cluster.
     * </p>
     * <p>
     * Constraints: Only version 1.0 is currently available.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * 
     * @param clusterVersion
     *        The version of the Amazon Redshift engine software that you want to deploy on the cluster.</p>
     *        <p>
     *        The version selected runs on all the nodes in the cluster.
     *        </p>
     *        <p>
     *        Constraints: Only version 1.0 is currently available.
     *        </p>
     *        <p>
     *        Example: <code>1.0</code>
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * </p>
     * <p>
     * The version selected runs on all the nodes in the cluster.
     * </p>
     * <p>
     * Constraints: Only version 1.0 is currently available.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * 
     * @return The version of the Amazon Redshift engine software that you want to deploy on the cluster.</p>
     *         <p>
     *         The version selected runs on all the nodes in the cluster.
     *         </p>
     *         <p>
     *         Constraints: Only version 1.0 is currently available.
     *         </p>
     *         <p>
     *         Example: <code>1.0</code>
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * </p>
     * <p>
     * The version selected runs on all the nodes in the cluster.
     * </p>
     * <p>
     * Constraints: Only version 1.0 is currently available.
     * </p>
     * <p>
     * Example: <code>1.0</code>
     * </p>
     * 
     * @param clusterVersion
     *        The version of the Amazon Redshift engine software that you want to deploy on the cluster.</p>
     *        <p>
     *        The version selected runs on all the nodes in the cluster.
     *        </p>
     *        <p>
     *        Constraints: Only version 1.0 is currently available.
     *        </p>
     *        <p>
     *        Example: <code>1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * When a new major version of the Amazon Redshift engine is released, you can request that the service
     * automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param allowVersionUpgrade
     *        If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *        Redshift engine that is running on the cluster.</p>
     *        <p>
     *        When a new major version of the Amazon Redshift engine is released, you can request that the service
     *        automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running
     *        on your cluster.
     *        </p>
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
     * When a new major version of the Amazon Redshift engine is released, you can request that the service
     * automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *         Redshift engine that is running on the cluster.</p>
     *         <p>
     *         When a new major version of the Amazon Redshift engine is released, you can request that the service
     *         automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running
     *         on your cluster.
     *         </p>
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
     * When a new major version of the Amazon Redshift engine is released, you can request that the service
     * automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param allowVersionUpgrade
     *        If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *        Redshift engine that is running on the cluster.</p>
     *        <p>
     *        When a new major version of the Amazon Redshift engine is released, you can request that the service
     *        automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running
     *        on your cluster.
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        setAllowVersionUpgrade(allowVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon Redshift
     * engine that is running on the cluster.
     * </p>
     * <p>
     * When a new major version of the Amazon Redshift engine is released, you can request that the service
     * automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your
     * cluster.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return If <code>true</code>, major version upgrades can be applied during the maintenance window to the Amazon
     *         Redshift engine that is running on the cluster.</p>
     *         <p>
     *         When a new major version of the Amazon Redshift engine is released, you can request that the service
     *         automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running
     *         on your cluster.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b> parameter is
     * specified as <code>multi-node</code>.
     * </p>
     * <p>
     * For information about determining how many nodes you need, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you
     * must specify the number of nodes that you want in the cluster.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Constraints: Value must be at least 1 and no more than 100.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b>
     *        parameter is specified as <code>multi-node</code>. </p>
     *        <p>
     *        For information about determining how many nodes you need, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working
     *        with Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     *        </p>
     *        <p>
     *        If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster,
     *        you must specify the number of nodes that you want in the cluster.
     *        </p>
     *        <p>
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Constraints: Value must be at least 1 and no more than 100.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b> parameter is
     * specified as <code>multi-node</code>.
     * </p>
     * <p>
     * For information about determining how many nodes you need, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you
     * must specify the number of nodes that you want in the cluster.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Constraints: Value must be at least 1 and no more than 100.
     * </p>
     * 
     * @return The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b>
     *         parameter is specified as <code>multi-node</code>. </p>
     *         <p>
     *         For information about determining how many nodes you need, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     *         </p>
     *         <p>
     *         If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster,
     *         you must specify the number of nodes that you want in the cluster.
     *         </p>
     *         <p>
     *         Default: <code>1</code>
     *         </p>
     *         <p>
     *         Constraints: Value must be at least 1 and no more than 100.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b> parameter is
     * specified as <code>multi-node</code>.
     * </p>
     * <p>
     * For information about determining how many nodes you need, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working with
     * Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you
     * must specify the number of nodes that you want in the cluster.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Constraints: Value must be at least 1 and no more than 100.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of compute nodes in the cluster. This parameter is required when the <b>ClusterType</b>
     *        parameter is specified as <code>multi-node</code>. </p>
     *        <p>
     *        For information about determining how many nodes you need, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes"> Working
     *        with Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     *        </p>
     *        <p>
     *        If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster,
     *        you must specify the number of nodes that you want in the cluster.
     *        </p>
     *        <p>
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Constraints: Value must be at least 1 and no more than 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
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

    public CreateClusterRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
     * If <code>true</code>, the data in the cluster is encrypted at rest.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param encrypted
     *        If <code>true</code>, the data in the cluster is encrypted at rest. </p>
     *        <p>
     *        Default: false
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the cluster is encrypted at rest.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return If <code>true</code>, the data in the cluster is encrypted at rest. </p>
     *         <p>
     *         Default: false
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the cluster is encrypted at rest.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param encrypted
     *        If <code>true</code>, the data in the cluster is encrypted at rest. </p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the data in the cluster is encrypted at rest.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return If <code>true</code>, the data in the cluster is encrypted at rest. </p>
     *         <p>
     *         Default: false
     */

    public Boolean isEncrypted() {
        return this.encrypted;
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

    public CreateClusterRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
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

    public CreateClusterRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
        return this;
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

    public CreateClusterRequest withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
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
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(Tag... tags) {
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
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
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

    public CreateClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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

    public CreateClusterRequest withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
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

    public CreateClusterRequest withAdditionalInfo(String additionalInfo) {
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
     * A cluster can have up to 10 IAM roles associated with it at any time.
     * </p>
     * 
     * @return A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *         AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *         to 10 IAM roles in a single request.</p>
     *         <p>
     *         A cluster can have up to 10 IAM roles associated with it at any time.
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
     * A cluster can have up to 10 IAM roles associated with it at any time.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *        to 10 IAM roles in a single request.</p>
     *        <p>
     *        A cluster can have up to 10 IAM roles associated with it at any time.
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
     * A cluster can have up to 10 IAM roles associated with it at any time.
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
     *        A cluster can have up to 10 IAM roles associated with it at any time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withIamRoles(String... iamRoles) {
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
     * A cluster can have up to 10 IAM roles associated with it at any time.
     * </p>
     * 
     * @param iamRoles
     *        A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other
     *        AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up
     *        to 10 IAM roles in a single request.</p>
     *        <p>
     *        A cluster can have up to 10 IAM roles associated with it at any time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withIamRoles(java.util.Collection<String> iamRoles) {
        setIamRoles(iamRoles);
        return this;
    }

    /**
     * <p>
     * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance
     * track name, the cluster is assigned to the <code>current</code> track.
     * </p>
     * 
     * @param maintenanceTrackName
     *        An optional parameter for the name of the maintenance track for the cluster. If you don't provide a
     *        maintenance track name, the cluster is assigned to the <code>current</code> track.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance
     * track name, the cluster is assigned to the <code>current</code> track.
     * </p>
     * 
     * @return An optional parameter for the name of the maintenance track for the cluster. If you don't provide a
     *         maintenance track name, the cluster is assigned to the <code>current</code> track.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance
     * track name, the cluster is assigned to the <code>current</code> track.
     * </p>
     * 
     * @param maintenanceTrackName
     *        An optional parameter for the name of the maintenance track for the cluster. If you don't provide a
     *        maintenance track name, the cluster is assigned to the <code>current</code> track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withMaintenanceTrackName(String maintenanceTrackName) {
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

    public CreateClusterRequest withSnapshotScheduleIdentifier(String snapshotScheduleIdentifier) {
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
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getClusterSecurityGroups() != null)
            sb.append("ClusterSecurityGroups: ").append(getClusterSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getClusterSubnetGroupName() != null)
            sb.append("ClusterSubnetGroupName: ").append(getClusterSubnetGroupName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getClusterParameterGroupName() != null)
            sb.append("ClusterParameterGroupName: ").append(getClusterParameterGroupName()).append(",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: ").append(getAutomatedSnapshotRetentionPeriod()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getAllowVersionUpgrade() != null)
            sb.append("AllowVersionUpgrade: ").append(getAllowVersionUpgrade()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: ").append(getHsmClientCertificateIdentifier()).append(",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: ").append(getHsmConfigurationIdentifier()).append(",");
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
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

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
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
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null)
            return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null)
            return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
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
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
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

        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getClusterParameterGroupName() == null) ? 0 : getClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowVersionUpgrade() == null) ? 0 : getAllowVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotScheduleIdentifier() == null) ? 0 : getSnapshotScheduleIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
