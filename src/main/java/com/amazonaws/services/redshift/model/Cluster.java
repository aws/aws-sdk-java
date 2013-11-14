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


/**
 * <p>
 * Describes a cluster.
 * </p>
 */
public class Cluster implements Serializable {

    /**
     * The unique identifier of the cluster.
     */
    private String clusterIdentifier;

    /**
     * The node type for the nodes in the cluster.
     */
    private String nodeType;

    /**
     * The current state of this cluster. Possible values include
     * <code>available</code>, <code>creating</code>, <code>deleting</code>,
     * <code>rebooting</code>, and <code>resizing</code>.
     */
    private String clusterStatus;

    /**
     * The status of a modify operation, if any, initiated for the cluster.
     */
    private String modifyStatus;

    /**
     * The master user name for the cluster. This name is used to connect to
     * the database that is specified in <b>DBName</b>.
     */
    private String masterUsername;

    /**
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named "dev" was created
     * by default.
     */
    private String dBName;

    /**
     * The connection endpoint.
     */
    private Endpoint endpoint;

    /**
     * The date and time that the cluster was created.
     */
    private java.util.Date clusterCreateTime;

    /**
     * The number of days that automatic cluster snapshots are retained.
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     * security groups are used when the cluster is not created in a VPC.
     * Clusters that are created in a VPC use VPC security groups, which are
     * listed by the <b>VpcSecurityGroups</b> parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroupMembership> clusterSecurityGroups;

    /**
     * A list of Virtual Private Cloud (VPC) security groups that are
     * associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * The list of cluster parameter groups that are associated with this
     * cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroupStatus> clusterParameterGroups;

    /**
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     */
    private String clusterSubnetGroupName;

    /**
     * The identifier of the VPC the cluster is in, if the cluster is in a
     * VPC.
     */
    private String vpcId;

    /**
     * The name of the Availability Zone in which the cluster is located.
     */
    private String availabilityZone;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * If present, changes to the cluster are pending. Specific pending
     * changes are identified by subelements.
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     */
    private String clusterVersion;

    /**
     * If <code>true</code>, version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     */
    private Boolean allowVersionUpgrade;

    /**
     * The number of compute nodes in the cluster.
     */
    private Integer numberOfNodes;

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     */
    private Boolean publiclyAccessible;

    /**
     * If <code>true</code>, data in cluster is encrypted at rest.
     */
    private Boolean encrypted;

    /**
     * Describes the status of a cluster restore action. Returns null if the
     * cluster was not created by restoring a snapshot.
     */
    private RestoreStatus restoreStatus;

    /**
     * Reports whether the Amazon Redshift cluster has finished applying any
     * HSM settings changes specified in a modify cluster command. <p>Values:
     * active, applying
     */
    private HsmStatus hsmStatus;

    /**
     * Returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     */
    private ClusterSnapshotCopyStatus clusterSnapshotCopyStatus;

    /**
     * The public key for the cluster.
     */
    private String clusterPublicKey;

    /**
     * The nodes in a cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClusterNode> clusterNodes;

    /**
     * Describes the status of the elastic IP (EIP) address.
     */
    private ElasticIpStatus elasticIpStatus;

    /**
     * The unique identifier of the cluster.
     *
     * @return The unique identifier of the cluster.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster.
     *
     * @param clusterIdentifier The unique identifier of the cluster.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The node type for the nodes in the cluster.
     *
     * @return The node type for the nodes in the cluster.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type for the nodes in the cluster.
     *
     * @param nodeType The node type for the nodes in the cluster.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type for the nodes in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type for the nodes in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The current state of this cluster. Possible values include
     * <code>available</code>, <code>creating</code>, <code>deleting</code>,
     * <code>rebooting</code>, and <code>resizing</code>.
     *
     * @return The current state of this cluster. Possible values include
     *         <code>available</code>, <code>creating</code>, <code>deleting</code>,
     *         <code>rebooting</code>, and <code>resizing</code>.
     */
    public String getClusterStatus() {
        return clusterStatus;
    }
    
    /**
     * The current state of this cluster. Possible values include
     * <code>available</code>, <code>creating</code>, <code>deleting</code>,
     * <code>rebooting</code>, and <code>resizing</code>.
     *
     * @param clusterStatus The current state of this cluster. Possible values include
     *         <code>available</code>, <code>creating</code>, <code>deleting</code>,
     *         <code>rebooting</code>, and <code>resizing</code>.
     */
    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }
    
    /**
     * The current state of this cluster. Possible values include
     * <code>available</code>, <code>creating</code>, <code>deleting</code>,
     * <code>rebooting</code>, and <code>resizing</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterStatus The current state of this cluster. Possible values include
     *         <code>available</code>, <code>creating</code>, <code>deleting</code>,
     *         <code>rebooting</code>, and <code>resizing</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * The status of a modify operation, if any, initiated for the cluster.
     *
     * @return The status of a modify operation, if any, initiated for the cluster.
     */
    public String getModifyStatus() {
        return modifyStatus;
    }
    
    /**
     * The status of a modify operation, if any, initiated for the cluster.
     *
     * @param modifyStatus The status of a modify operation, if any, initiated for the cluster.
     */
    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }
    
    /**
     * The status of a modify operation, if any, initiated for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param modifyStatus The status of a modify operation, if any, initiated for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
        return this;
    }

    /**
     * The master user name for the cluster. This name is used to connect to
     * the database that is specified in <b>DBName</b>.
     *
     * @return The master user name for the cluster. This name is used to connect to
     *         the database that is specified in <b>DBName</b>.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The master user name for the cluster. This name is used to connect to
     * the database that is specified in <b>DBName</b>.
     *
     * @param masterUsername The master user name for the cluster. This name is used to connect to
     *         the database that is specified in <b>DBName</b>.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The master user name for the cluster. This name is used to connect to
     * the database that is specified in <b>DBName</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The master user name for the cluster. This name is used to connect to
     *         the database that is specified in <b>DBName</b>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named "dev" was created
     * by default.
     *
     * @return The name of the initial database that was created when the cluster was
     *         created. This same name is returned for the life of the cluster. If an
     *         initial database was not specified, a database named "dev" was created
     *         by default.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named "dev" was created
     * by default.
     *
     * @param dBName The name of the initial database that was created when the cluster was
     *         created. This same name is returned for the life of the cluster. If an
     *         initial database was not specified, a database named "dev" was created
     *         by default.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The name of the initial database that was created when the cluster was
     * created. This same name is returned for the life of the cluster. If an
     * initial database was not specified, a database named "dev" was created
     * by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The name of the initial database that was created when the cluster was
     *         created. This same name is returned for the life of the cluster. If an
     *         initial database was not specified, a database named "dev" was created
     *         by default.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * The connection endpoint.
     *
     * @return The connection endpoint.
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }
    
    /**
     * The connection endpoint.
     *
     * @param endpoint The connection endpoint.
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * The connection endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint The connection endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The date and time that the cluster was created.
     *
     * @return The date and time that the cluster was created.
     */
    public java.util.Date getClusterCreateTime() {
        return clusterCreateTime;
    }
    
    /**
     * The date and time that the cluster was created.
     *
     * @param clusterCreateTime The date and time that the cluster was created.
     */
    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }
    
    /**
     * The date and time that the cluster was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterCreateTime The date and time that the cluster was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * The number of days that automatic cluster snapshots are retained.
     *
     * @return The number of days that automatic cluster snapshots are retained.
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automatic cluster snapshots are retained.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automatic cluster snapshots are retained.
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automatic cluster snapshots are retained.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automatic cluster snapshots are retained.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     * security groups are used when the cluster is not created in a VPC.
     * Clusters that are created in a VPC use VPC security groups, which are
     * listed by the <b>VpcSecurityGroups</b> parameter.
     *
     * @return A list of cluster security group that are associated with the cluster.
     *         Each security group is represented by an element that contains
     *         <code>ClusterSecurityGroup.Name</code> and
     *         <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     *         security groups are used when the cluster is not created in a VPC.
     *         Clusters that are created in a VPC use VPC security groups, which are
     *         listed by the <b>VpcSecurityGroups</b> parameter.
     */
    public java.util.List<ClusterSecurityGroupMembership> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
              clusterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroupMembership>();
              clusterSecurityGroups.setAutoConstruct(true);
        }
        return clusterSecurityGroups;
    }
    
    /**
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     * security groups are used when the cluster is not created in a VPC.
     * Clusters that are created in a VPC use VPC security groups, which are
     * listed by the <b>VpcSecurityGroups</b> parameter.
     *
     * @param clusterSecurityGroups A list of cluster security group that are associated with the cluster.
     *         Each security group is represented by an element that contains
     *         <code>ClusterSecurityGroup.Name</code> and
     *         <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     *         security groups are used when the cluster is not created in a VPC.
     *         Clusters that are created in a VPC use VPC security groups, which are
     *         listed by the <b>VpcSecurityGroups</b> parameter.
     */
    public void setClusterSecurityGroups(java.util.Collection<ClusterSecurityGroupMembership> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroupMembership> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroupMembership>(clusterSecurityGroups.size());
        clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
        this.clusterSecurityGroups = clusterSecurityGroupsCopy;
    }
    
    /**
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     * security groups are used when the cluster is not created in a VPC.
     * Clusters that are created in a VPC use VPC security groups, which are
     * listed by the <b>VpcSecurityGroups</b> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of cluster security group that are associated with the cluster.
     *         Each security group is represented by an element that contains
     *         <code>ClusterSecurityGroup.Name</code> and
     *         <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     *         security groups are used when the cluster is not created in a VPC.
     *         Clusters that are created in a VPC use VPC security groups, which are
     *         listed by the <b>VpcSecurityGroups</b> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterSecurityGroups(ClusterSecurityGroupMembership... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) setClusterSecurityGroups(new java.util.ArrayList<ClusterSecurityGroupMembership>(clusterSecurityGroups.length));
        for (ClusterSecurityGroupMembership value : clusterSecurityGroups) {
            getClusterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of cluster security group that are associated with the cluster.
     * Each security group is represented by an element that contains
     * <code>ClusterSecurityGroup.Name</code> and
     * <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     * security groups are used when the cluster is not created in a VPC.
     * Clusters that are created in a VPC use VPC security groups, which are
     * listed by the <b>VpcSecurityGroups</b> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of cluster security group that are associated with the cluster.
     *         Each security group is represented by an element that contains
     *         <code>ClusterSecurityGroup.Name</code> and
     *         <code>ClusterSecurityGroup.Status</code> subelements. <p>Cluster
     *         security groups are used when the cluster is not created in a VPC.
     *         Clusters that are created in a VPC use VPC security groups, which are
     *         listed by the <b>VpcSecurityGroups</b> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterSecurityGroups(java.util.Collection<ClusterSecurityGroupMembership> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroupMembership> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterSecurityGroupMembership>(clusterSecurityGroups.size());
            clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
            this.clusterSecurityGroups = clusterSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of Virtual Private Cloud (VPC) security groups that are
     * associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     *
     * @return A list of Virtual Private Cloud (VPC) security groups that are
     *         associated with the cluster. This parameter is returned only if the
     *         cluster is in a VPC.
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
              vpcSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>();
              vpcSecurityGroups.setAutoConstruct(true);
        }
        return vpcSecurityGroups;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups that are
     * associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     *
     * @param vpcSecurityGroups A list of Virtual Private Cloud (VPC) security groups that are
     *         associated with the cluster. This parameter is returned only if the
     *         cluster is in a VPC.
     */
    public void setVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>(vpcSecurityGroups.size());
        vpcSecurityGroupsCopy.addAll(vpcSecurityGroups);
        this.vpcSecurityGroups = vpcSecurityGroupsCopy;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups that are
     * associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroups A list of Virtual Private Cloud (VPC) security groups that are
     *         associated with the cluster. This parameter is returned only if the
     *         cluster is in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) setVpcSecurityGroups(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        for (VpcSecurityGroupMembership value : vpcSecurityGroups) {
            getVpcSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups that are
     * associated with the cluster. This parameter is returned only if the
     * cluster is in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroups A list of Virtual Private Cloud (VPC) security groups that are
     *         associated with the cluster. This parameter is returned only if the
     *         cluster is in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>(vpcSecurityGroups.size());
            vpcSecurityGroupsCopy.addAll(vpcSecurityGroups);
            this.vpcSecurityGroups = vpcSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * The list of cluster parameter groups that are associated with this
     * cluster.
     *
     * @return The list of cluster parameter groups that are associated with this
     *         cluster.
     */
    public java.util.List<ClusterParameterGroupStatus> getClusterParameterGroups() {
        if (clusterParameterGroups == null) {
              clusterParameterGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroupStatus>();
              clusterParameterGroups.setAutoConstruct(true);
        }
        return clusterParameterGroups;
    }
    
    /**
     * The list of cluster parameter groups that are associated with this
     * cluster.
     *
     * @param clusterParameterGroups The list of cluster parameter groups that are associated with this
     *         cluster.
     */
    public void setClusterParameterGroups(java.util.Collection<ClusterParameterGroupStatus> clusterParameterGroups) {
        if (clusterParameterGroups == null) {
            this.clusterParameterGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroupStatus> clusterParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroupStatus>(clusterParameterGroups.size());
        clusterParameterGroupsCopy.addAll(clusterParameterGroups);
        this.clusterParameterGroups = clusterParameterGroupsCopy;
    }
    
    /**
     * The list of cluster parameter groups that are associated with this
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterParameterGroups The list of cluster parameter groups that are associated with this
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterParameterGroups(ClusterParameterGroupStatus... clusterParameterGroups) {
        if (getClusterParameterGroups() == null) setClusterParameterGroups(new java.util.ArrayList<ClusterParameterGroupStatus>(clusterParameterGroups.length));
        for (ClusterParameterGroupStatus value : clusterParameterGroups) {
            getClusterParameterGroups().add(value);
        }
        return this;
    }
    
    /**
     * The list of cluster parameter groups that are associated with this
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterParameterGroups The list of cluster parameter groups that are associated with this
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterParameterGroups(java.util.Collection<ClusterParameterGroupStatus> clusterParameterGroups) {
        if (clusterParameterGroups == null) {
            this.clusterParameterGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroupStatus> clusterParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterParameterGroupStatus>(clusterParameterGroups.size());
            clusterParameterGroupsCopy.addAll(clusterParameterGroups);
            this.clusterParameterGroups = clusterParameterGroupsCopy;
        }

        return this;
    }

    /**
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     *
     * @return The name of the subnet group that is associated with the cluster. This
     *         parameter is valid only when the cluster is in a VPC.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     *
     * @param clusterSubnetGroupName The name of the subnet group that is associated with the cluster. This
     *         parameter is valid only when the cluster is in a VPC.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group that is associated with the cluster. This
     * parameter is valid only when the cluster is in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the subnet group that is associated with the cluster. This
     *         parameter is valid only when the cluster is in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * The identifier of the VPC the cluster is in, if the cluster is in a
     * VPC.
     *
     * @return The identifier of the VPC the cluster is in, if the cluster is in a
     *         VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The identifier of the VPC the cluster is in, if the cluster is in a
     * VPC.
     *
     * @param vpcId The identifier of the VPC the cluster is in, if the cluster is in a
     *         VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The identifier of the VPC the cluster is in, if the cluster is in a
     * VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The identifier of the VPC the cluster is in, if the cluster is in a
     *         VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The name of the Availability Zone in which the cluster is located.
     *
     * @return The name of the Availability Zone in which the cluster is located.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the cluster is located.
     *
     * @param availabilityZone The name of the Availability Zone in which the cluster is located.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The name of the Availability Zone in which the cluster is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The name of the Availability Zone in which the cluster is located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * If present, changes to the cluster are pending. Specific pending
     * changes are identified by subelements.
     *
     * @return If present, changes to the cluster are pending. Specific pending
     *         changes are identified by subelements.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * If present, changes to the cluster are pending. Specific pending
     * changes are identified by subelements.
     *
     * @param pendingModifiedValues If present, changes to the cluster are pending. Specific pending
     *         changes are identified by subelements.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * If present, changes to the cluster are pending. Specific pending
     * changes are identified by subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues If present, changes to the cluster are pending. Specific pending
     *         changes are identified by subelements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     *
     * @return The version ID of the Amazon Redshift engine that is running on the
     *         cluster.
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     *
     * @param clusterVersion The version ID of the Amazon Redshift engine that is running on the
     *         cluster.
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The version ID of the Amazon Redshift engine that is running on the
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * If <code>true</code>, version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     *
     * @return If <code>true</code>, version upgrades will be applied automatically
     *         to the cluster during the maintenance window.
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     *
     * @param allowVersionUpgrade If <code>true</code>, version upgrades will be applied automatically
     *         to the cluster during the maintenance window.
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowVersionUpgrade If <code>true</code>, version upgrades will be applied automatically
     *         to the cluster during the maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * If <code>true</code>, version upgrades will be applied automatically
     * to the cluster during the maintenance window.
     *
     * @return If <code>true</code>, version upgrades will be applied automatically
     *         to the cluster during the maintenance window.
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * The number of compute nodes in the cluster.
     *
     * @return The number of compute nodes in the cluster.
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }
    
    /**
     * The number of compute nodes in the cluster.
     *
     * @param numberOfNodes The number of compute nodes in the cluster.
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
    
    /**
     * The number of compute nodes in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfNodes The number of compute nodes in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withNumberOfNodes(Integer numberOfNodes) {
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
    public Cluster withPubliclyAccessible(Boolean publiclyAccessible) {
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
     * If <code>true</code>, data in cluster is encrypted at rest.
     *
     * @return If <code>true</code>, data in cluster is encrypted at rest.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * If <code>true</code>, data in cluster is encrypted at rest.
     *
     * @param encrypted If <code>true</code>, data in cluster is encrypted at rest.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * If <code>true</code>, data in cluster is encrypted at rest.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted If <code>true</code>, data in cluster is encrypted at rest.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * If <code>true</code>, data in cluster is encrypted at rest.
     *
     * @return If <code>true</code>, data in cluster is encrypted at rest.
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * Describes the status of a cluster restore action. Returns null if the
     * cluster was not created by restoring a snapshot.
     *
     * @return Describes the status of a cluster restore action. Returns null if the
     *         cluster was not created by restoring a snapshot.
     */
    public RestoreStatus getRestoreStatus() {
        return restoreStatus;
    }
    
    /**
     * Describes the status of a cluster restore action. Returns null if the
     * cluster was not created by restoring a snapshot.
     *
     * @param restoreStatus Describes the status of a cluster restore action. Returns null if the
     *         cluster was not created by restoring a snapshot.
     */
    public void setRestoreStatus(RestoreStatus restoreStatus) {
        this.restoreStatus = restoreStatus;
    }
    
    /**
     * Describes the status of a cluster restore action. Returns null if the
     * cluster was not created by restoring a snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restoreStatus Describes the status of a cluster restore action. Returns null if the
     *         cluster was not created by restoring a snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withRestoreStatus(RestoreStatus restoreStatus) {
        this.restoreStatus = restoreStatus;
        return this;
    }

    /**
     * Reports whether the Amazon Redshift cluster has finished applying any
     * HSM settings changes specified in a modify cluster command. <p>Values:
     * active, applying
     *
     * @return Reports whether the Amazon Redshift cluster has finished applying any
     *         HSM settings changes specified in a modify cluster command. <p>Values:
     *         active, applying
     */
    public HsmStatus getHsmStatus() {
        return hsmStatus;
    }
    
    /**
     * Reports whether the Amazon Redshift cluster has finished applying any
     * HSM settings changes specified in a modify cluster command. <p>Values:
     * active, applying
     *
     * @param hsmStatus Reports whether the Amazon Redshift cluster has finished applying any
     *         HSM settings changes specified in a modify cluster command. <p>Values:
     *         active, applying
     */
    public void setHsmStatus(HsmStatus hsmStatus) {
        this.hsmStatus = hsmStatus;
    }
    
    /**
     * Reports whether the Amazon Redshift cluster has finished applying any
     * HSM settings changes specified in a modify cluster command. <p>Values:
     * active, applying
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmStatus Reports whether the Amazon Redshift cluster has finished applying any
     *         HSM settings changes specified in a modify cluster command. <p>Values:
     *         active, applying
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withHsmStatus(HsmStatus hsmStatus) {
        this.hsmStatus = hsmStatus;
        return this;
    }

    /**
     * Returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     *
     * @return Returns the destination region and retention period that are
     *         configured for cross-region snapshot copy.
     */
    public ClusterSnapshotCopyStatus getClusterSnapshotCopyStatus() {
        return clusterSnapshotCopyStatus;
    }
    
    /**
     * Returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     *
     * @param clusterSnapshotCopyStatus Returns the destination region and retention period that are
     *         configured for cross-region snapshot copy.
     */
    public void setClusterSnapshotCopyStatus(ClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        this.clusterSnapshotCopyStatus = clusterSnapshotCopyStatus;
    }
    
    /**
     * Returns the destination region and retention period that are
     * configured for cross-region snapshot copy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSnapshotCopyStatus Returns the destination region and retention period that are
     *         configured for cross-region snapshot copy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterSnapshotCopyStatus(ClusterSnapshotCopyStatus clusterSnapshotCopyStatus) {
        this.clusterSnapshotCopyStatus = clusterSnapshotCopyStatus;
        return this;
    }

    /**
     * The public key for the cluster.
     *
     * @return The public key for the cluster.
     */
    public String getClusterPublicKey() {
        return clusterPublicKey;
    }
    
    /**
     * The public key for the cluster.
     *
     * @param clusterPublicKey The public key for the cluster.
     */
    public void setClusterPublicKey(String clusterPublicKey) {
        this.clusterPublicKey = clusterPublicKey;
    }
    
    /**
     * The public key for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterPublicKey The public key for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterPublicKey(String clusterPublicKey) {
        this.clusterPublicKey = clusterPublicKey;
        return this;
    }

    /**
     * The nodes in a cluster.
     *
     * @return The nodes in a cluster.
     */
    public java.util.List<ClusterNode> getClusterNodes() {
        if (clusterNodes == null) {
              clusterNodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterNode>();
              clusterNodes.setAutoConstruct(true);
        }
        return clusterNodes;
    }
    
    /**
     * The nodes in a cluster.
     *
     * @param clusterNodes The nodes in a cluster.
     */
    public void setClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        if (clusterNodes == null) {
            this.clusterNodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClusterNode> clusterNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterNode>(clusterNodes.size());
        clusterNodesCopy.addAll(clusterNodes);
        this.clusterNodes = clusterNodesCopy;
    }
    
    /**
     * The nodes in a cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterNodes The nodes in a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterNodes(ClusterNode... clusterNodes) {
        if (getClusterNodes() == null) setClusterNodes(new java.util.ArrayList<ClusterNode>(clusterNodes.length));
        for (ClusterNode value : clusterNodes) {
            getClusterNodes().add(value);
        }
        return this;
    }
    
    /**
     * The nodes in a cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterNodes The nodes in a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withClusterNodes(java.util.Collection<ClusterNode> clusterNodes) {
        if (clusterNodes == null) {
            this.clusterNodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClusterNode> clusterNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClusterNode>(clusterNodes.size());
            clusterNodesCopy.addAll(clusterNodes);
            this.clusterNodes = clusterNodesCopy;
        }

        return this;
    }

    /**
     * Describes the status of the elastic IP (EIP) address.
     *
     * @return Describes the status of the elastic IP (EIP) address.
     */
    public ElasticIpStatus getElasticIpStatus() {
        return elasticIpStatus;
    }
    
    /**
     * Describes the status of the elastic IP (EIP) address.
     *
     * @param elasticIpStatus Describes the status of the elastic IP (EIP) address.
     */
    public void setElasticIpStatus(ElasticIpStatus elasticIpStatus) {
        this.elasticIpStatus = elasticIpStatus;
    }
    
    /**
     * Describes the status of the elastic IP (EIP) address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIpStatus Describes the status of the elastic IP (EIP) address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withElasticIpStatus(ElasticIpStatus elasticIpStatus) {
        this.elasticIpStatus = elasticIpStatus;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getClusterStatus() != null) sb.append("ClusterStatus: " + getClusterStatus() + ",");
        if (getModifyStatus() != null) sb.append("ModifyStatus: " + getModifyStatus() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() + ",");
        if (getClusterCreateTime() != null) sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null) sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() + ",");
        if (getClusterSecurityGroups() != null) sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroups() != null) sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getClusterParameterGroups() != null) sb.append("ClusterParameterGroups: " + getClusterParameterGroups() + ",");
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null) sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (isAllowVersionUpgrade() != null) sb.append("AllowVersionUpgrade: " + isAllowVersionUpgrade() + ",");
        if (getNumberOfNodes() != null) sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() + ",");
        if (getRestoreStatus() != null) sb.append("RestoreStatus: " + getRestoreStatus() + ",");
        if (getHsmStatus() != null) sb.append("HsmStatus: " + getHsmStatus() + ",");
        if (getClusterSnapshotCopyStatus() != null) sb.append("ClusterSnapshotCopyStatus: " + getClusterSnapshotCopyStatus() + ",");
        if (getClusterPublicKey() != null) sb.append("ClusterPublicKey: " + getClusterPublicKey() + ",");
        if (getClusterNodes() != null) sb.append("ClusterNodes: " + getClusterNodes() + ",");
        if (getElasticIpStatus() != null) sb.append("ElasticIpStatus: " + getElasticIpStatus() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isAllowVersionUpgrade() == null) ? 0 : isAllowVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getRestoreStatus() == null) ? 0 : getRestoreStatus().hashCode()); 
        hashCode = prime * hashCode + ((getHsmStatus() == null) ? 0 : getHsmStatus().hashCode()); 
        hashCode = prime * hashCode + ((getClusterSnapshotCopyStatus() == null) ? 0 : getClusterSnapshotCopyStatus().hashCode()); 
        hashCode = prime * hashCode + ((getClusterPublicKey() == null) ? 0 : getClusterPublicKey().hashCode()); 
        hashCode = prime * hashCode + ((getClusterNodes() == null) ? 0 : getClusterNodes().hashCode()); 
        hashCode = prime * hashCode + ((getElasticIpStatus() == null) ? 0 : getElasticIpStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Cluster == false) return false;
        Cluster other = (Cluster)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null) return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false) return false; 
        if (other.getModifyStatus() == null ^ this.getModifyStatus() == null) return false;
        if (other.getModifyStatus() != null && other.getModifyStatus().equals(this.getModifyStatus()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null) return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false) return false; 
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null) return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false) return false; 
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null) return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null) return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false) return false; 
        if (other.getClusterParameterGroups() == null ^ this.getClusterParameterGroups() == null) return false;
        if (other.getClusterParameterGroups() != null && other.getClusterParameterGroups().equals(this.getClusterParameterGroups()) == false) return false; 
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null) return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false) return false; 
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
        if (other.getRestoreStatus() == null ^ this.getRestoreStatus() == null) return false;
        if (other.getRestoreStatus() != null && other.getRestoreStatus().equals(this.getRestoreStatus()) == false) return false; 
        if (other.getHsmStatus() == null ^ this.getHsmStatus() == null) return false;
        if (other.getHsmStatus() != null && other.getHsmStatus().equals(this.getHsmStatus()) == false) return false; 
        if (other.getClusterSnapshotCopyStatus() == null ^ this.getClusterSnapshotCopyStatus() == null) return false;
        if (other.getClusterSnapshotCopyStatus() != null && other.getClusterSnapshotCopyStatus().equals(this.getClusterSnapshotCopyStatus()) == false) return false; 
        if (other.getClusterPublicKey() == null ^ this.getClusterPublicKey() == null) return false;
        if (other.getClusterPublicKey() != null && other.getClusterPublicKey().equals(this.getClusterPublicKey()) == false) return false; 
        if (other.getClusterNodes() == null ^ this.getClusterNodes() == null) return false;
        if (other.getClusterNodes() != null && other.getClusterNodes().equals(this.getClusterNodes()) == false) return false; 
        if (other.getElasticIpStatus() == null ^ this.getElasticIpStatus() == null) return false;
        if (other.getElasticIpStatus() != null && other.getElasticIpStatus().equals(this.getElasticIpStatus()) == false) return false; 
        return true;
    }
    
}
    