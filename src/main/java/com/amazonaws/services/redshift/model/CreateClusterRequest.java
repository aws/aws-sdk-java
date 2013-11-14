/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createCluster(CreateClusterRequest) CreateCluster operation}.
 * <p>
 * Creates a new cluster. To create the cluster in virtual private cloud (VPC), you must provide cluster subnet group name. If you don't provide a
 * cluster subnet group name or the cluster security group parameter, Amazon Redshift creates a non-VPC cluster, it associates the default cluster
 * security group with the cluster. For more information about managing clusters, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
 * Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createCluster(CreateClusterRequest)
 */
public class CreateClusterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the first database to be created when the cluster is
     * created. <p>To create additional databases after the cluster is
     * created, connect to the cluster with a SQL client and use SQL commands
     * to create a database. For more information, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     * a Database</a> in the Amazon Redshift Database Developer Guide.
     * <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     * letters.</li> <li>Cannot be a word that is reserved by the service. A
     * list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     */
    private String dBName;

    /**
     * A unique identifier for the cluster. You use this identifier to refer
     * to the cluster for any subsequent cluster operations such as deleting
     * or modifying. The identifier also appears in the Amazon Redshift
     * console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     * <p>Example: <code>myexamplecluster</code>
     */
    private String clusterIdentifier;

    /**
     * The type of the cluster. When cluster type is specified as <ul>
     * <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     * not required.</li> <li><code>multi-node</code>, the
     * <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     * Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     * <code>multi-node</code>
     */
    private String clusterType;

    /**
     * The node type to be provisioned for the cluster. For information about
     * node types, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>.
     */
    private String nodeType;

    /**
     * The user name associated with the master user account for the cluster
     * that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word. A list of reserved words
     * can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     */
    private String masterUsername;

    /**
     * The password associated with the master user account for the cluster
     * that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     * 64 characters in length.</li> <li>Must contain at least one uppercase
     * letter.</li> <li>Must contain at least one lowercase letter.</li>
     * <li>Must contain one number.</li> <li>Can be any printable ASCII
     * character (ASCII code 33 to 126) except ' (single quote), " (double
     * quote), \, /, @, or space.</li> </ul>
     */
    private String masterUserPassword;

    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroups;

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p>Default: The default VPC security group is
     * associated with the cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The name of a cluster subnet group to be associated with this cluster.
     * <p> If this parameter is not provided the resulting cluster will be
     * deployed outside virtual private cloud (VPC).
     */
    private String clusterSubnetGroupName;

    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster. For example, if you have several EC2 instances
     * running in a specific Availability Zone, then you might want the
     * cluster to be provisioned in the same zone in order to decrease
     * network latency. <p> Default: A random, system-chosen Availability
     * Zone in the region that is specified by the endpoint. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The specified Availability
     * Zone must be in the same region as the current endpoint.
     */
    private String availabilityZone;

    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. The following list shows the time blocks
     * for each region from which the default maintenance windows are
     * assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     * 03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     * UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * <p>Constraints: Minimum 30-minute window.
     */
    private String preferredMaintenanceWindow;

    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     */
    private String clusterParameterGroupName;

    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     * <p>Constraints: Must be a value from 0 to 35.
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * The port number on which the cluster accepts incoming connections.
     * <p>The cluster is accessible only via the JDBC and ODBC connection
     * strings. Part of the connection string requires the port on which the
     * cluster will listen for incoming connections. <p> Default:
     * <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     */
    private Integer port;

    /**
     * The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster. <p> The version selected runs on all the nodes
     * in the cluster. <p>Constraints: Only version 1.0 is currently
     * available. <p>Example: <code>1.0</code>
     */
    private String clusterVersion;

    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p> When a new version of the Amazon Redshift engine is released, you
     * can request that the service automatically apply upgrades during the
     * maintenance window to the Amazon Redshift engine that is running on
     * your cluster. <p>Default: <code>true</code>
     */
    private Boolean allowVersionUpgrade;

    /**
     * The number of compute nodes in the cluster. This parameter is required
     * when the <b>ClusterType</b> parameter is specified as
     * <code>multi-node</code>. <p>For information about determining how many
     * nodes you need, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>If you don't specify this parameter, you get a
     * single-node cluster. When requesting a multi-node cluster, you must
     * specify the number of nodes that you want in the cluster. <p>Default:
     * <code>1</code> <p>Constraints: Value must be at least 1 and no more
     * than 100.
     */
    private Integer numberOfNodes;

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     */
    private Boolean publiclyAccessible;

    /**
     * If <code>true</code>, the data in cluster is encrypted at rest.
     * <p>Default: false
     */
    private Boolean encrypted;

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     */
    private String hsmConfigurationIdentifier;

    /**
     * The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     * cluster must be provisioned in EC2-VPC and publicly-accessible through
     * an Internet gateway. For more information about provisioning clusters
     * in EC2-VPC, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     * Guide.
     */
    private String elasticIp;

    /**
     * The name of the first database to be created when the cluster is
     * created. <p>To create additional databases after the cluster is
     * created, connect to the cluster with a SQL client and use SQL commands
     * to create a database. For more information, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     * a Database</a> in the Amazon Redshift Database Developer Guide.
     * <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     * letters.</li> <li>Cannot be a word that is reserved by the service. A
     * list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     *
     * @return The name of the first database to be created when the cluster is
     *         created. <p>To create additional databases after the cluster is
     *         created, connect to the cluster with a SQL client and use SQL commands
     *         to create a database. For more information, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     *         a Database</a> in the Amazon Redshift Database Developer Guide.
     *         <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     *         to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     *         letters.</li> <li>Cannot be a word that is reserved by the service. A
     *         list of reserved words can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     *         Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The name of the first database to be created when the cluster is
     * created. <p>To create additional databases after the cluster is
     * created, connect to the cluster with a SQL client and use SQL commands
     * to create a database. For more information, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     * a Database</a> in the Amazon Redshift Database Developer Guide.
     * <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     * letters.</li> <li>Cannot be a word that is reserved by the service. A
     * list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     *
     * @param dBName The name of the first database to be created when the cluster is
     *         created. <p>To create additional databases after the cluster is
     *         created, connect to the cluster with a SQL client and use SQL commands
     *         to create a database. For more information, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     *         a Database</a> in the Amazon Redshift Database Developer Guide.
     *         <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     *         to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     *         letters.</li> <li>Cannot be a word that is reserved by the service. A
     *         list of reserved words can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     *         Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The name of the first database to be created when the cluster is
     * created. <p>To create additional databases after the cluster is
     * created, connect to the cluster with a SQL client and use SQL commands
     * to create a database. For more information, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     * a Database</a> in the Amazon Redshift Database Developer Guide.
     * <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     * letters.</li> <li>Cannot be a word that is reserved by the service. A
     * list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The name of the first database to be created when the cluster is
     *         created. <p>To create additional databases after the cluster is
     *         created, connect to the cluster with a SQL client and use SQL commands
     *         to create a database. For more information, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/t_creating_database.html">Create
     *         a Database</a> in the Amazon Redshift Database Developer Guide.
     *         <p>Default: <code>dev</code> <p>Constraints: <ul> <li>Must contain 1
     *         to 64 alphanumeric characters.</li> <li>Must contain only lowercase
     *         letters.</li> <li>Cannot be a word that is reserved by the service. A
     *         list of reserved words can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     *         Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * A unique identifier for the cluster. You use this identifier to refer
     * to the cluster for any subsequent cluster operations such as deleting
     * or modifying. The identifier also appears in the Amazon Redshift
     * console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     * <p>Example: <code>myexamplecluster</code>
     *
     * @return A unique identifier for the cluster. You use this identifier to refer
     *         to the cluster for any subsequent cluster operations such as deleting
     *         or modifying. The identifier also appears in the Amazon Redshift
     *         console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *         <p>Example: <code>myexamplecluster</code>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * A unique identifier for the cluster. You use this identifier to refer
     * to the cluster for any subsequent cluster operations such as deleting
     * or modifying. The identifier also appears in the Amazon Redshift
     * console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     * <p>Example: <code>myexamplecluster</code>
     *
     * @param clusterIdentifier A unique identifier for the cluster. You use this identifier to refer
     *         to the cluster for any subsequent cluster operations such as deleting
     *         or modifying. The identifier also appears in the Amazon Redshift
     *         console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *         <p>Example: <code>myexamplecluster</code>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * A unique identifier for the cluster. You use this identifier to refer
     * to the cluster for any subsequent cluster operations such as deleting
     * or modifying. The identifier also appears in the Amazon Redshift
     * console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     * <p>Example: <code>myexamplecluster</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier A unique identifier for the cluster. You use this identifier to refer
     *         to the cluster for any subsequent cluster operations such as deleting
     *         or modifying. The identifier also appears in the Amazon Redshift
     *         console. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *         <p>Example: <code>myexamplecluster</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The type of the cluster. When cluster type is specified as <ul>
     * <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     * not required.</li> <li><code>multi-node</code>, the
     * <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     * Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     * <code>multi-node</code>
     *
     * @return The type of the cluster. When cluster type is specified as <ul>
     *         <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     *         not required.</li> <li><code>multi-node</code>, the
     *         <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     *         Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     *         <code>multi-node</code>
     */
    public String getClusterType() {
        return clusterType;
    }
    
    /**
     * The type of the cluster. When cluster type is specified as <ul>
     * <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     * not required.</li> <li><code>multi-node</code>, the
     * <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     * Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     * <code>multi-node</code>
     *
     * @param clusterType The type of the cluster. When cluster type is specified as <ul>
     *         <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     *         not required.</li> <li><code>multi-node</code>, the
     *         <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     *         Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     *         <code>multi-node</code>
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }
    
    /**
     * The type of the cluster. When cluster type is specified as <ul>
     * <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     * not required.</li> <li><code>multi-node</code>, the
     * <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     * Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     * <code>multi-node</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterType The type of the cluster. When cluster type is specified as <ul>
     *         <li><code>single-node</code>, the <b>NumberOfNodes</b> parameter is
     *         not required.</li> <li><code>multi-node</code>, the
     *         <b>NumberOfNodes</b> parameter is required.</li> </ul> <p> Valid
     *         Values: <code>multi-node</code> | <code>single-node</code> <p>Default:
     *         <code>multi-node</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * The node type to be provisioned for the cluster. For information about
     * node types, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>.
     *
     * @return The node type to be provisioned for the cluster. For information about
     *         node types, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     *         <code>dw.hs1.8xlarge</code>.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type to be provisioned for the cluster. For information about
     * node types, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>.
     *
     * @param nodeType The node type to be provisioned for the cluster. For information about
     *         node types, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     *         <code>dw.hs1.8xlarge</code>.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type to be provisioned for the cluster. For information about
     * node types, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type to be provisioned for the cluster. For information about
     *         node types, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p> Valid Values: <code>dw.hs1.xlarge</code> |
     *         <code>dw.hs1.8xlarge</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The user name associated with the master user account for the cluster
     * that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word. A list of reserved words
     * can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     *
     * @return The user name associated with the master user account for the cluster
     *         that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     *         alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word. A list of reserved words
     *         can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     *         Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The user name associated with the master user account for the cluster
     * that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word. A list of reserved words
     * can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     *
     * @param masterUsername The user name associated with the master user account for the cluster
     *         that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     *         alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word. A list of reserved words
     *         can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     *         Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The user name associated with the master user account for the cluster
     * that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word. A list of reserved words
     * can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     * Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The user name associated with the master user account for the cluster
     *         that is being created. <p>Constraints: <ul> <li>Must be 1 - 128
     *         alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word. A list of reserved words
     *         can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved
     *         Words</a> in the Amazon Redshift Database Developer Guide. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The password associated with the master user account for the cluster
     * that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     * 64 characters in length.</li> <li>Must contain at least one uppercase
     * letter.</li> <li>Must contain at least one lowercase letter.</li>
     * <li>Must contain one number.</li> <li>Can be any printable ASCII
     * character (ASCII code 33 to 126) except ' (single quote), " (double
     * quote), \, /, @, or space.</li> </ul>
     *
     * @return The password associated with the master user account for the cluster
     *         that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     *         64 characters in length.</li> <li>Must contain at least one uppercase
     *         letter.</li> <li>Must contain at least one lowercase letter.</li>
     *         <li>Must contain one number.</li> <li>Can be any printable ASCII
     *         character (ASCII code 33 to 126) except ' (single quote), " (double
     *         quote), \, /, @, or space.</li> </ul>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The password associated with the master user account for the cluster
     * that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     * 64 characters in length.</li> <li>Must contain at least one uppercase
     * letter.</li> <li>Must contain at least one lowercase letter.</li>
     * <li>Must contain one number.</li> <li>Can be any printable ASCII
     * character (ASCII code 33 to 126) except ' (single quote), " (double
     * quote), \, /, @, or space.</li> </ul>
     *
     * @param masterUserPassword The password associated with the master user account for the cluster
     *         that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     *         64 characters in length.</li> <li>Must contain at least one uppercase
     *         letter.</li> <li>Must contain at least one lowercase letter.</li>
     *         <li>Must contain one number.</li> <li>Can be any printable ASCII
     *         character (ASCII code 33 to 126) except ' (single quote), " (double
     *         quote), \, /, @, or space.</li> </ul>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The password associated with the master user account for the cluster
     * that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     * 64 characters in length.</li> <li>Must contain at least one uppercase
     * letter.</li> <li>Must contain at least one lowercase letter.</li>
     * <li>Must contain one number.</li> <li>Can be any printable ASCII
     * character (ASCII code 33 to 126) except ' (single quote), " (double
     * quote), \, /, @, or space.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The password associated with the master user account for the cluster
     *         that is being created. <p> Constraints: <ul> <li>Must be between 8 and
     *         64 characters in length.</li> <li>Must contain at least one uppercase
     *         letter.</li> <li>Must contain at least one lowercase letter.</li>
     *         <li>Must contain one number.</li> <li>Can be any printable ASCII
     *         character (ASCII code 33 to 126) except ' (single quote), " (double
     *         quote), \, /, @, or space.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     *
     * @return A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     */
    public java.util.List<String> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
              clusterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clusterSecurityGroups.setAutoConstruct(true);
        }
        return clusterSecurityGroups;
    }
    
    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     *
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     */
    public void setClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusterSecurityGroups.size());
        clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
        this.clusterSecurityGroups = clusterSecurityGroupsCopy;
    }
    
    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) setClusterSecurityGroups(new java.util.ArrayList<String>(clusterSecurityGroups.length));
        for (String value : clusterSecurityGroups) {
            getClusterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusterSecurityGroups.size());
            clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
            this.clusterSecurityGroups = clusterSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p>Default: The default VPC security group is
     * associated with the cluster.
     *
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p>Default: The default VPC security group is
     *         associated with the cluster.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p>Default: The default VPC security group is
     * associated with the cluster.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p>Default: The default VPC security group is
     *         associated with the cluster.
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
        vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
        this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p>Default: The default VPC security group is
     * associated with the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p>Default: The default VPC security group is
     *         associated with the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p>Default: The default VPC security group is
     * associated with the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p>Default: The default VPC security group is
     *         associated with the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
            vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
            this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * The name of a cluster subnet group to be associated with this cluster.
     * <p> If this parameter is not provided the resulting cluster will be
     * deployed outside virtual private cloud (VPC).
     *
     * @return The name of a cluster subnet group to be associated with this cluster.
     *         <p> If this parameter is not provided the resulting cluster will be
     *         deployed outside virtual private cloud (VPC).
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of a cluster subnet group to be associated with this cluster.
     * <p> If this parameter is not provided the resulting cluster will be
     * deployed outside virtual private cloud (VPC).
     *
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this cluster.
     *         <p> If this parameter is not provided the resulting cluster will be
     *         deployed outside virtual private cloud (VPC).
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of a cluster subnet group to be associated with this cluster.
     * <p> If this parameter is not provided the resulting cluster will be
     * deployed outside virtual private cloud (VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of a cluster subnet group to be associated with this cluster.
     *         <p> If this parameter is not provided the resulting cluster will be
     *         deployed outside virtual private cloud (VPC).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster. For example, if you have several EC2 instances
     * running in a specific Availability Zone, then you might want the
     * cluster to be provisioned in the same zone in order to decrease
     * network latency. <p> Default: A random, system-chosen Availability
     * Zone in the region that is specified by the endpoint. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The specified Availability
     * Zone must be in the same region as the current endpoint.
     *
     * @return The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     *         provision the cluster. For example, if you have several EC2 instances
     *         running in a specific Availability Zone, then you might want the
     *         cluster to be provisioned in the same zone in order to decrease
     *         network latency. <p> Default: A random, system-chosen Availability
     *         Zone in the region that is specified by the endpoint. <p> Example:
     *         <code>us-east-1d</code> <p> Constraint: The specified Availability
     *         Zone must be in the same region as the current endpoint.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster. For example, if you have several EC2 instances
     * running in a specific Availability Zone, then you might want the
     * cluster to be provisioned in the same zone in order to decrease
     * network latency. <p> Default: A random, system-chosen Availability
     * Zone in the region that is specified by the endpoint. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The specified Availability
     * Zone must be in the same region as the current endpoint.
     *
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     *         provision the cluster. For example, if you have several EC2 instances
     *         running in a specific Availability Zone, then you might want the
     *         cluster to be provisioned in the same zone in order to decrease
     *         network latency. <p> Default: A random, system-chosen Availability
     *         Zone in the region that is specified by the endpoint. <p> Example:
     *         <code>us-east-1d</code> <p> Constraint: The specified Availability
     *         Zone must be in the same region as the current endpoint.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     * provision the cluster. For example, if you have several EC2 instances
     * running in a specific Availability Zone, then you might want the
     * cluster to be provisioned in the same zone in order to decrease
     * network latency. <p> Default: A random, system-chosen Availability
     * Zone in the region that is specified by the endpoint. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The specified Availability
     * Zone must be in the same region as the current endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone (AZ) in which you want Amazon Redshift to
     *         provision the cluster. For example, if you have several EC2 instances
     *         running in a specific Availability Zone, then you might want the
     *         cluster to be provisioned in the same zone in order to decrease
     *         network latency. <p> Default: A random, system-chosen Availability
     *         Zone in the region that is specified by the endpoint. <p> Example:
     *         <code>us-east-1d</code> <p> Constraint: The specified Availability
     *         Zone must be in the same region as the current endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. The following list shows the time blocks
     * for each region from which the default maintenance windows are
     * assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     * 03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     * UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @return The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. The following list shows the time blocks
     *         for each region from which the default maintenance windows are
     *         assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     *         03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     *         UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. The following list shows the time blocks
     * for each region from which the default maintenance windows are
     * assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     * 03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     * UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. The following list shows the time blocks
     *         for each region from which the default maintenance windows are
     *         assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     *         03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     *         UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. The following list shows the time blocks
     * for each region from which the default maintenance windows are
     * assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     * 03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     * UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * <p>Constraints: Minimum 30-minute window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. The following list shows the time blocks
     *         for each region from which the default maintenance windows are
     *         assigned. <ul> <li><b>US-East (Northern Virginia) Region:</b>
     *         03:00-11:00 UTC</li> <li><b>US-West (Oregon) Region</b> 06:00-14:00
     *         UTC</li> </ul> <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         <p>Constraints: Minimum 30-minute window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @return The name of the parameter group to be associated with this cluster.
     *         <p>Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     *         with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul>
     */
    public String getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }
    
    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @param clusterParameterGroupName The name of the parameter group to be associated with this cluster.
     *         <p>Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     *         with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul>
     */
    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }
    
    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterParameterGroupName The name of the parameter group to be associated with this cluster.
     *         <p>Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     *         with Amazon Redshift Parameter Groups</a> <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
        return this;
    }

    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     * <p>Constraints: Must be a value from 0 to 35.
     *
     * @return The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     *         <p>Constraints: Must be a value from 0 to 35.
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     * <p>Constraints: Must be a value from 0 to 35.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     *         <p>Constraints: Must be a value from 0 to 35.
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     * <p>Constraints: Must be a value from 0 to 35.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p> Default: <code>1</code>
     *         <p>Constraints: Must be a value from 0 to 35.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * The port number on which the cluster accepts incoming connections.
     * <p>The cluster is accessible only via the JDBC and ODBC connection
     * strings. Part of the connection string requires the port on which the
     * cluster will listen for incoming connections. <p> Default:
     * <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     *
     * @return The port number on which the cluster accepts incoming connections.
     *         <p>The cluster is accessible only via the JDBC and ODBC connection
     *         strings. Part of the connection string requires the port on which the
     *         cluster will listen for incoming connections. <p> Default:
     *         <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the cluster accepts incoming connections.
     * <p>The cluster is accessible only via the JDBC and ODBC connection
     * strings. Part of the connection string requires the port on which the
     * cluster will listen for incoming connections. <p> Default:
     * <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     *
     * @param port The port number on which the cluster accepts incoming connections.
     *         <p>The cluster is accessible only via the JDBC and ODBC connection
     *         strings. Part of the connection string requires the port on which the
     *         cluster will listen for incoming connections. <p> Default:
     *         <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the cluster accepts incoming connections.
     * <p>The cluster is accessible only via the JDBC and ODBC connection
     * strings. Part of the connection string requires the port on which the
     * cluster will listen for incoming connections. <p> Default:
     * <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the cluster accepts incoming connections.
     *         <p>The cluster is accessible only via the JDBC and ODBC connection
     *         strings. Part of the connection string requires the port on which the
     *         cluster will listen for incoming connections. <p> Default:
     *         <code>5439</code> <p> Valid Values: <code>1150-65535</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster. <p> The version selected runs on all the nodes
     * in the cluster. <p>Constraints: Only version 1.0 is currently
     * available. <p>Example: <code>1.0</code>
     *
     * @return The version of the Amazon Redshift engine software that you want to
     *         deploy on the cluster. <p> The version selected runs on all the nodes
     *         in the cluster. <p>Constraints: Only version 1.0 is currently
     *         available. <p>Example: <code>1.0</code>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster. <p> The version selected runs on all the nodes
     * in the cluster. <p>Constraints: Only version 1.0 is currently
     * available. <p>Example: <code>1.0</code>
     *
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     *         deploy on the cluster. <p> The version selected runs on all the nodes
     *         in the cluster. <p>Constraints: Only version 1.0 is currently
     *         available. <p>Example: <code>1.0</code>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The version of the Amazon Redshift engine software that you want to
     * deploy on the cluster. <p> The version selected runs on all the nodes
     * in the cluster. <p>Constraints: Only version 1.0 is currently
     * available. <p>Example: <code>1.0</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The version of the Amazon Redshift engine software that you want to
     *         deploy on the cluster. <p> The version selected runs on all the nodes
     *         in the cluster. <p>Constraints: Only version 1.0 is currently
     *         available. <p>Example: <code>1.0</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p> When a new version of the Amazon Redshift engine is released, you
     * can request that the service automatically apply upgrades during the
     * maintenance window to the Amazon Redshift engine that is running on
     * your cluster. <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p> When a new version of the Amazon Redshift engine is released, you
     *         can request that the service automatically apply upgrades during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         your cluster. <p>Default: <code>true</code>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p> When a new version of the Amazon Redshift engine is released, you
     * can request that the service automatically apply upgrades during the
     * maintenance window to the Amazon Redshift engine that is running on
     * your cluster. <p>Default: <code>true</code>
     *
     * @param allowVersionUpgrade If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p> When a new version of the Amazon Redshift engine is released, you
     *         can request that the service automatically apply upgrades during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         your cluster. <p>Default: <code>true</code>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p> When a new version of the Amazon Redshift engine is released, you
     * can request that the service automatically apply upgrades during the
     * maintenance window to the Amazon Redshift engine that is running on
     * your cluster. <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowVersionUpgrade If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p> When a new version of the Amazon Redshift engine is released, you
     *         can request that the service automatically apply upgrades during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         your cluster. <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p> When a new version of the Amazon Redshift engine is released, you
     * can request that the service automatically apply upgrades during the
     * maintenance window to the Amazon Redshift engine that is running on
     * your cluster. <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p> When a new version of the Amazon Redshift engine is released, you
     *         can request that the service automatically apply upgrades during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         your cluster. <p>Default: <code>true</code>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * The number of compute nodes in the cluster. This parameter is required
     * when the <b>ClusterType</b> parameter is specified as
     * <code>multi-node</code>. <p>For information about determining how many
     * nodes you need, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>If you don't specify this parameter, you get a
     * single-node cluster. When requesting a multi-node cluster, you must
     * specify the number of nodes that you want in the cluster. <p>Default:
     * <code>1</code> <p>Constraints: Value must be at least 1 and no more
     * than 100.
     *
     * @return The number of compute nodes in the cluster. This parameter is required
     *         when the <b>ClusterType</b> parameter is specified as
     *         <code>multi-node</code>. <p>For information about determining how many
     *         nodes you need, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p>If you don't specify this parameter, you get a
     *         single-node cluster. When requesting a multi-node cluster, you must
     *         specify the number of nodes that you want in the cluster. <p>Default:
     *         <code>1</code> <p>Constraints: Value must be at least 1 and no more
     *         than 100.
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }
    
    /**
     * The number of compute nodes in the cluster. This parameter is required
     * when the <b>ClusterType</b> parameter is specified as
     * <code>multi-node</code>. <p>For information about determining how many
     * nodes you need, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>If you don't specify this parameter, you get a
     * single-node cluster. When requesting a multi-node cluster, you must
     * specify the number of nodes that you want in the cluster. <p>Default:
     * <code>1</code> <p>Constraints: Value must be at least 1 and no more
     * than 100.
     *
     * @param numberOfNodes The number of compute nodes in the cluster. This parameter is required
     *         when the <b>ClusterType</b> parameter is specified as
     *         <code>multi-node</code>. <p>For information about determining how many
     *         nodes you need, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p>If you don't specify this parameter, you get a
     *         single-node cluster. When requesting a multi-node cluster, you must
     *         specify the number of nodes that you want in the cluster. <p>Default:
     *         <code>1</code> <p>Constraints: Value must be at least 1 and no more
     *         than 100.
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
    
    /**
     * The number of compute nodes in the cluster. This parameter is required
     * when the <b>ClusterType</b> parameter is specified as
     * <code>multi-node</code>. <p>For information about determining how many
     * nodes you need, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     * Working with Clusters</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>If you don't specify this parameter, you get a
     * single-node cluster. When requesting a multi-node cluster, you must
     * specify the number of nodes that you want in the cluster. <p>Default:
     * <code>1</code> <p>Constraints: Value must be at least 1 and no more
     * than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfNodes The number of compute nodes in the cluster. This parameter is required
     *         when the <b>ClusterType</b> parameter is specified as
     *         <code>multi-node</code>. <p>For information about determining how many
     *         nodes you need, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#how-many-nodes">
     *         Working with Clusters</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p>If you don't specify this parameter, you get a
     *         single-node cluster. When requesting a multi-node cluster, you must
     *         specify the number of nodes that you want in the cluster. <p>Default:
     *         <code>1</code> <p>Constraints: Value must be at least 1 and no more
     *         than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @return If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @param publiclyAccessible If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible If <code>true</code>, the cluster can be accessed from a public
     *         network.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @return If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * If <code>true</code>, the data in cluster is encrypted at rest.
     * <p>Default: false
     *
     * @return If <code>true</code>, the data in cluster is encrypted at rest.
     *         <p>Default: false
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * If <code>true</code>, the data in cluster is encrypted at rest.
     * <p>Default: false
     *
     * @param encrypted If <code>true</code>, the data in cluster is encrypted at rest.
     *         <p>Default: false
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * If <code>true</code>, the data in cluster is encrypted at rest.
     * <p>Default: false
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted If <code>true</code>, the data in cluster is encrypted at rest.
     *         <p>Default: false
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * If <code>true</code>, the data in cluster is encrypted at rest.
     * <p>Default: false
     *
     * @return If <code>true</code>, the data in cluster is encrypted at rest.
     *         <p>Default: false
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     *
     * @return Specifies the name of the HSM client certificate the Amazon Redshift
     *         cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     *
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the Amazon Redshift
     *         cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the Amazon Redshift
     *         cluster uses to retrieve the data encryption keys stored in an HSM.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     *
     * @return Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and store
     *         keys in an HSM.
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }
    
    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     *
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and store
     *         keys in an HSM.
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }
    
    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and store
     *         keys in an HSM.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     * cluster must be provisioned in EC2-VPC and publicly-accessible through
     * an Internet gateway. For more information about provisioning clusters
     * in EC2-VPC, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     * Guide.
     *
     * @return The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     *         cluster must be provisioned in EC2-VPC and publicly-accessible through
     *         an Internet gateway. For more information about provisioning clusters
     *         in EC2-VPC, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     *         Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     *         Guide.
     */
    public String getElasticIp() {
        return elasticIp;
    }
    
    /**
     * The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     * cluster must be provisioned in EC2-VPC and publicly-accessible through
     * an Internet gateway. For more information about provisioning clusters
     * in EC2-VPC, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     * Guide.
     *
     * @param elasticIp The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     *         cluster must be provisioned in EC2-VPC and publicly-accessible through
     *         an Internet gateway. For more information about provisioning clusters
     *         in EC2-VPC, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     *         Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     *         Guide.
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }
    
    /**
     * The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     * cluster must be provisioned in EC2-VPC and publicly-accessible through
     * an Internet gateway. For more information about provisioning clusters
     * in EC2-VPC, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     * Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     * Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIp The Elastic IP (EIP) address for the cluster. <p>Constraints: The
     *         cluster must be provisioned in EC2-VPC and publicly-accessible through
     *         an Internet gateway. For more information about provisioning clusters
     *         in EC2-VPC, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#cluster-platforms">Supported
     *         Platforms to Launch Your Cluster</a> in the Amazon Redshift Management
     *         Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterRequest withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getClusterType() != null) sb.append("ClusterType: " + getClusterType() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getClusterSecurityGroups() != null) sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getClusterParameterGroupName() != null) sb.append("ClusterParameterGroupName: " + getClusterParameterGroupName() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null) sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (isAllowVersionUpgrade() != null) sb.append("AllowVersionUpgrade: " + isAllowVersionUpgrade() + ",");
        if (getNumberOfNodes() != null) sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() + ",");
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() + ",");
        if (getHsmConfigurationIdentifier() != null) sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getElasticIp() != null) sb.append("ElasticIp: " + getElasticIp() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAllowVersionUpgrade() == null) ? 0 : isAllowVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateClusterRequest == false) return false;
        CreateClusterRequest other = (CreateClusterRequest)obj;
        
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getClusterType() == null ^ this.getClusterType() == null) return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null) return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getClusterParameterGroupName() == null ^ this.getClusterParameterGroupName() == null) return false;
        if (other.getClusterParameterGroupName() != null && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false) return false; 
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null) return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.isAllowVersionUpgrade() == null ^ this.isAllowVersionUpgrade() == null) return false;
        if (other.isAllowVersionUpgrade() != null && other.isAllowVersionUpgrade().equals(this.isAllowVersionUpgrade()) == false) return false; 
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null) return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null) return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false) return false; 
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        return true;
    }
    
}
    