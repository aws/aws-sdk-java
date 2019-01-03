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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
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
     * A description of the cluster.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any
     * read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.
     * </p>
     * <note>
     * <p>
     * AWS recommends that you have at least two read replicas per cluster.
     * </p>
     * </note>
     */
    private Integer replicationFactor;
    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The name of the subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet group
     * must exist in the same VPC.
     * </p>
     * </important>
     */
    private String subnetGroupName;
    /**
     * <p>
     * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is
     * system-generated.)
     * </p>
     * <p>
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a
     * range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     * period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * <note>
     * <p>
     * If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns a
     * 60-minute maintenance window on a randomly selected day of the week.
     * </p>
     * </note>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     * </p>
     * </note>
     */
    private String notificationTopicArn;
    /**
     * <p>
     * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the
     * role's permissions to access DynamoDB on your behalf.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The parameter group to be associated with the DAX cluster.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * A set of tags to associate with the DAX cluster.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Represents the settings used to enable server-side encryption on the cluster.
     * </p>
     */
    private SSESpecification sSESpecification;

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterName
     *        The cluster identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <b>Constraints:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 20 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cluster identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         <b>Constraints:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A name must contain from 1 to 20 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A name cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * <b>Constraints:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name must contain from 1 to 20 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A name cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterName
     *        The cluster identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        <b>Constraints:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A name must contain from 1 to 20 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A name cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
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
     * A description of the cluster.
     * </p>
     * 
     * @param description
     *        A description of the cluster.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the cluster.
     * </p>
     * 
     * @return A description of the cluster.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the cluster.
     * </p>
     * 
     * @param description
     *        A description of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any
     * read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.
     * </p>
     * <note>
     * <p>
     * AWS recommends that you have at least two read replicas per cluster.
     * </p>
     * </note>
     * 
     * @param replicationFactor
     *        The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster,
     *        without any read replicas. For additional fault tolerance, you can create a multiple node cluster with one
     *        or more read replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.</p> <note>
     *        <p>
     *        AWS recommends that you have at least two read replicas per cluster.
     *        </p>
     */

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    /**
     * <p>
     * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any
     * read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.
     * </p>
     * <note>
     * <p>
     * AWS recommends that you have at least two read replicas per cluster.
     * </p>
     * </note>
     * 
     * @return The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster,
     *         without any read replicas. For additional fault tolerance, you can create a multiple node cluster with
     *         one or more read replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.</p> <note>
     *         <p>
     *         AWS recommends that you have at least two read replicas per cluster.
     *         </p>
     */

    public Integer getReplicationFactor() {
        return this.replicationFactor;
    }

    /**
     * <p>
     * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any
     * read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read
     * replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.
     * </p>
     * <note>
     * <p>
     * AWS recommends that you have at least two read replicas per cluster.
     * </p>
     * </note>
     * 
     * @param replicationFactor
     *        The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster,
     *        without any read replicas. For additional fault tolerance, you can create a multiple node cluster with one
     *        or more read replicas. To do this, set <i>ReplicationFactor</i> to 2 or more.</p> <note>
     *        <p>
     *        AWS recommends that you have at least two read replicas per cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withReplicationFactor(Integer replicationFactor) {
        setReplicationFactor(replicationFactor);
        return this;
    }

    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * 
     * @return The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *         cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *         across multiple AZs.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *        cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *        across multiple AZs.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *        cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *        across multiple AZs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are
     * placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the
     *        cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes
     *        across multiple AZs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet group
     * must exist in the same VPC.
     * </p>
     * </important>
     * 
     * @param subnetGroupName
     *        The name of the subnet group to be used for the replication group.</p> <important>
     *        <p>
     *        DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet
     *        group must exist in the same VPC.
     *        </p>
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet group
     * must exist in the same VPC.
     * </p>
     * </important>
     * 
     * @return The name of the subnet group to be used for the replication group.</p> <important>
     *         <p>
     *         DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet
     *         group must exist in the same VPC.
     *         </p>
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group to be used for the replication group.
     * </p>
     * <important>
     * <p>
     * DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet group
     * must exist in the same VPC.
     * </p>
     * </important>
     * 
     * @param subnetGroupName
     *        The name of the subnet group to be used for the replication group.</p> <important>
     *        <p>
     *        DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet
     *        group must exist in the same VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is
     * system-generated.)
     * </p>
     * <p>
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * 
     * @return A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group
     *         ID is system-generated.)</p>
     *         <p>
     *         If this parameter is not specified, DAX assigns the default VPC security group to each node.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is
     * system-generated.)
     * </p>
     * <p>
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group
     *        ID is system-generated.)</p>
     *        <p>
     *        If this parameter is not specified, DAX assigns the default VPC security group to each node.
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
     * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is
     * system-generated.)
     * </p>
     * <p>
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group
     *        ID is system-generated.)</p>
     *        <p>
     *        If this parameter is not specified, DAX assigns the default VPC security group to each node.
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
     * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is
     * system-generated.)
     * </p>
     * <p>
     * If this parameter is not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group
     *        ID is system-generated.)</p>
     *        <p>
     *        If this parameter is not specified, DAX assigns the default VPC security group to each node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a
     * range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     * period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * <note>
     * <p>
     * If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns a
     * 60-minute maintenance window on a randomly selected day of the week.
     * </p>
     * </note>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified
     *        as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *        minute period. Valid values for <code>ddd</code> are:</p>
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
     *        Example: <code>sun:05:00-sun:09:00</code>
     *        </p>
     *        <note>
     *        <p>
     *        If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns
     *        a 60-minute maintenance window on a randomly selected day of the week.
     *        </p>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a
     * range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     * period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * <note>
     * <p>
     * If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns a
     * 60-minute maintenance window on a randomly selected day of the week.
     * </p>
     * </note>
     * 
     * @return Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified
     *         as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *         minute period. Valid values for <code>ddd</code> are:</p>
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
     *         Example: <code>sun:05:00-sun:09:00</code>
     *         </p>
     *         <note>
     *         <p>
     *         If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX
     *         assigns a 60-minute maintenance window on a randomly selected day of the week.
     *         </p>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a
     * range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute
     * period. Valid values for <code>ddd</code> are:
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
     * Example: <code>sun:05:00-sun:09:00</code>
     * </p>
     * <note>
     * <p>
     * If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns a
     * 60-minute maintenance window on a randomly selected day of the week.
     * </p>
     * </note>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified
     *        as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60
     *        minute period. Valid values for <code>ddd</code> are:</p>
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
     *        Example: <code>sun:05:00-sun:09:00</code>
     *        </p>
     *        <note>
     *        <p>
     *        If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns
     *        a 60-minute maintenance window on a randomly selected day of the week.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be same as the DAX cluster owner.
     *        </p>
     */

    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.</p> <note>
     *         <p>
     *         The Amazon SNS topic owner must be same as the DAX cluster owner.
     *         </p>
     */

    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.
     * </p>
     * <note>
     * <p>
     * The Amazon SNS topic owner must be same as the DAX cluster owner.
     * </p>
     * </note>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.</p> <note>
     *        <p>
     *        The Amazon SNS topic owner must be same as the DAX cluster owner.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        setNotificationTopicArn(notificationTopicArn);
        return this;
    }

    /**
     * <p>
     * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the
     * role's permissions to access DynamoDB on your behalf.
     * </p>
     * 
     * @param iamRoleArn
     *        A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and
     *        use the role's permissions to access DynamoDB on your behalf.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the
     * role's permissions to access DynamoDB on your behalf.
     * </p>
     * 
     * @return A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and
     *         use the role's permissions to access DynamoDB on your behalf.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the
     * role's permissions to access DynamoDB on your behalf.
     * </p>
     * 
     * @param iamRoleArn
     *        A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and
     *        use the role's permissions to access DynamoDB on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The parameter group to be associated with the DAX cluster.
     * </p>
     * 
     * @param parameterGroupName
     *        The parameter group to be associated with the DAX cluster.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The parameter group to be associated with the DAX cluster.
     * </p>
     * 
     * @return The parameter group to be associated with the DAX cluster.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The parameter group to be associated with the DAX cluster.
     * </p>
     * 
     * @param parameterGroupName
     *        The parameter group to be associated with the DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * A set of tags to associate with the DAX cluster.
     * </p>
     * 
     * @return A set of tags to associate with the DAX cluster.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags to associate with the DAX cluster.
     * </p>
     * 
     * @param tags
     *        A set of tags to associate with the DAX cluster.
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
     * A set of tags to associate with the DAX cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A set of tags to associate with the DAX cluster.
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
     * A set of tags to associate with the DAX cluster.
     * </p>
     * 
     * @param tags
     *        A set of tags to associate with the DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Represents the settings used to enable server-side encryption on the cluster.
     * </p>
     * 
     * @param sSESpecification
     *        Represents the settings used to enable server-side encryption on the cluster.
     */

    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable server-side encryption on the cluster.
     * </p>
     * 
     * @return Represents the settings used to enable server-side encryption on the cluster.
     */

    public SSESpecification getSSESpecification() {
        return this.sSESpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable server-side encryption on the cluster.
     * </p>
     * 
     * @param sSESpecification
     *        Represents the settings used to enable server-side encryption on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSSESpecification(SSESpecification sSESpecification) {
        setSSESpecification(sSESpecification);
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
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getReplicationFactor() != null)
            sb.append("ReplicationFactor: ").append(getReplicationFactor()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: ").append(getNotificationTopicArn()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSSESpecification() != null)
            sb.append("SSESpecification: ").append(getSSESpecification());
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReplicationFactor() == null ^ this.getReplicationFactor() == null)
            return false;
        if (other.getReplicationFactor() != null && other.getReplicationFactor().equals(this.getReplicationFactor()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSSESpecification() == null ^ this.getSSESpecification() == null)
            return false;
        if (other.getSSESpecification() != null && other.getSSESpecification().equals(this.getSSESpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReplicationFactor() == null) ? 0 : getReplicationFactor().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSSESpecification() == null) ? 0 : getSSESpecification().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
