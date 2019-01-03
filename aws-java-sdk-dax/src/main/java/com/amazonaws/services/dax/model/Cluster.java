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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all of the attributes of a specific DAX cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/Cluster" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DAX cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The description of the cluster.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The total number of nodes in the cluster.
     * </p>
     */
    private Integer totalNodes;
    /**
     * <p>
     * The number of nodes in the cluster that are active (i.e., capable of serving requests).
     * </p>
     */
    private Integer activeNodes;
    /**
     * <p>
     * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The current status of the cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications
     * can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to
     * intelligently route requests and responses to nodes in the DAX cluster.
     * </p>
     */
    private Endpoint clusterDiscoveryEndpoint;
    /**
     * <p>
     * A list of nodes to be removed from the cluster.
     * </p>
     */
    private java.util.List<String> nodeIdsToRemove;
    /**
     * <p>
     * A list of nodes that are currently in the cluster.
     * </p>
     */
    private java.util.List<Node> nodes;
    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;
    /**
     * <p>
     * The subnet group where the DAX cluster is running.
     * </p>
     */
    private String subnetGroup;
    /**
     * <p>
     * A list of security groups, and the status of each, for the nodes in the cluster.
     * </p>
     */
    private java.util.List<SecurityGroupMembership> securityGroups;
    /**
     * <p>
     * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the
     * role's permissions to access DynamoDB on your behalf.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The parameter group being used by nodes in the cluster.
     * </p>
     */
    private ParameterGroupStatus parameterGroup;
    /**
     * <p>
     * The description of the server-side encryption status on the specified DAX cluster.
     * </p>
     */
    private SSEDescription sSEDescription;

    /**
     * <p>
     * The name of the DAX cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster.
     * </p>
     * 
     * @return The name of the DAX cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The description of the cluster.
     * </p>
     * 
     * @param description
     *        The description of the cluster.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cluster.
     * </p>
     * 
     * @return The description of the cluster.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the cluster.
     * </p>
     * 
     * @param description
     *        The description of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The total number of nodes in the cluster.
     * </p>
     * 
     * @param totalNodes
     *        The total number of nodes in the cluster.
     */

    public void setTotalNodes(Integer totalNodes) {
        this.totalNodes = totalNodes;
    }

    /**
     * <p>
     * The total number of nodes in the cluster.
     * </p>
     * 
     * @return The total number of nodes in the cluster.
     */

    public Integer getTotalNodes() {
        return this.totalNodes;
    }

    /**
     * <p>
     * The total number of nodes in the cluster.
     * </p>
     * 
     * @param totalNodes
     *        The total number of nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withTotalNodes(Integer totalNodes) {
        setTotalNodes(totalNodes);
        return this;
    }

    /**
     * <p>
     * The number of nodes in the cluster that are active (i.e., capable of serving requests).
     * </p>
     * 
     * @param activeNodes
     *        The number of nodes in the cluster that are active (i.e., capable of serving requests).
     */

    public void setActiveNodes(Integer activeNodes) {
        this.activeNodes = activeNodes;
    }

    /**
     * <p>
     * The number of nodes in the cluster that are active (i.e., capable of serving requests).
     * </p>
     * 
     * @return The number of nodes in the cluster that are active (i.e., capable of serving requests).
     */

    public Integer getActiveNodes() {
        return this.activeNodes;
    }

    /**
     * <p>
     * The number of nodes in the cluster that are active (i.e., capable of serving requests).
     * </p>
     * 
     * @param activeNodes
     *        The number of nodes in the cluster that are active (i.e., capable of serving requests).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withActiveNodes(Integer activeNodes) {
        setActiveNodes(activeNodes);
        return this;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     * </p>
     * 
     * @param nodeType
     *        The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     * </p>
     * 
     * @return The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     * </p>
     * 
     * @param nodeType
     *        The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param status
     *        The current status of the cluster.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @return The current status of the cluster.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the cluster.
     * </p>
     * 
     * @param status
     *        The current status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications
     * can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to
     * intelligently route requests and responses to nodes in the DAX cluster.
     * </p>
     * 
     * @param clusterDiscoveryEndpoint
     *        The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client
     *        applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client
     *        software to intelligently route requests and responses to nodes in the DAX cluster.
     */

    public void setClusterDiscoveryEndpoint(Endpoint clusterDiscoveryEndpoint) {
        this.clusterDiscoveryEndpoint = clusterDiscoveryEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications
     * can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to
     * intelligently route requests and responses to nodes in the DAX cluster.
     * </p>
     * 
     * @return The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client
     *         applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client
     *         software to intelligently route requests and responses to nodes in the DAX cluster.
     */

    public Endpoint getClusterDiscoveryEndpoint() {
        return this.clusterDiscoveryEndpoint;
    }

    /**
     * <p>
     * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications
     * can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to
     * intelligently route requests and responses to nodes in the DAX cluster.
     * </p>
     * 
     * @param clusterDiscoveryEndpoint
     *        The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client
     *        applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client
     *        software to intelligently route requests and responses to nodes in the DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterDiscoveryEndpoint(Endpoint clusterDiscoveryEndpoint) {
        setClusterDiscoveryEndpoint(clusterDiscoveryEndpoint);
        return this;
    }

    /**
     * <p>
     * A list of nodes to be removed from the cluster.
     * </p>
     * 
     * @return A list of nodes to be removed from the cluster.
     */

    public java.util.List<String> getNodeIdsToRemove() {
        return nodeIdsToRemove;
    }

    /**
     * <p>
     * A list of nodes to be removed from the cluster.
     * </p>
     * 
     * @param nodeIdsToRemove
     *        A list of nodes to be removed from the cluster.
     */

    public void setNodeIdsToRemove(java.util.Collection<String> nodeIdsToRemove) {
        if (nodeIdsToRemove == null) {
            this.nodeIdsToRemove = null;
            return;
        }

        this.nodeIdsToRemove = new java.util.ArrayList<String>(nodeIdsToRemove);
    }

    /**
     * <p>
     * A list of nodes to be removed from the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeIdsToRemove(java.util.Collection)} or {@link #withNodeIdsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nodeIdsToRemove
     *        A list of nodes to be removed from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNodeIdsToRemove(String... nodeIdsToRemove) {
        if (this.nodeIdsToRemove == null) {
            setNodeIdsToRemove(new java.util.ArrayList<String>(nodeIdsToRemove.length));
        }
        for (String ele : nodeIdsToRemove) {
            this.nodeIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of nodes to be removed from the cluster.
     * </p>
     * 
     * @param nodeIdsToRemove
     *        A list of nodes to be removed from the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNodeIdsToRemove(java.util.Collection<String> nodeIdsToRemove) {
        setNodeIdsToRemove(nodeIdsToRemove);
        return this;
    }

    /**
     * <p>
     * A list of nodes that are currently in the cluster.
     * </p>
     * 
     * @return A list of nodes that are currently in the cluster.
     */

    public java.util.List<Node> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * A list of nodes that are currently in the cluster.
     * </p>
     * 
     * @param nodes
     *        A list of nodes that are currently in the cluster.
     */

    public void setNodes(java.util.Collection<Node> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<Node>(nodes);
    }

    /**
     * <p>
     * A list of nodes that are currently in the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        A list of nodes that are currently in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNodes(Node... nodes) {
        if (this.nodes == null) {
            setNodes(new java.util.ArrayList<Node>(nodes.length));
        }
        for (Node ele : nodes) {
            this.nodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of nodes that are currently in the cluster.
     * </p>
     * 
     * @param nodes
     *        A list of nodes that are currently in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNodes(java.util.Collection<Node> nodes) {
        setNodes(nodes);
        return this;
    }

    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        A range of time when maintenance of DAX cluster software will be performed. For example:
     *        <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is
     *        performed automatically within the maintenance window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     * 
     * @return A range of time when maintenance of DAX cluster software will be performed. For example:
     *         <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is
     *         performed automatically within the maintenance window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        A range of time when maintenance of DAX cluster software will be performed. For example:
     *        <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is
     *        performed automatically within the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     * 
     * @param notificationConfiguration
     *        Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     *        subscribers using Amazon Simple Notification Service (SNS).
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     * 
     * @return Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     *         subscribers using Amazon Simple Notification Service (SNS).
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     * subscribers using Amazon Simple Notification Service (SNS).
     * </p>
     * 
     * @param notificationConfiguration
     *        Describes a notification topic and its status. Notification topics are used for publishing DAX events to
     *        subscribers using Amazon Simple Notification Service (SNS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
        return this;
    }

    /**
     * <p>
     * The subnet group where the DAX cluster is running.
     * </p>
     * 
     * @param subnetGroup
     *        The subnet group where the DAX cluster is running.
     */

    public void setSubnetGroup(String subnetGroup) {
        this.subnetGroup = subnetGroup;
    }

    /**
     * <p>
     * The subnet group where the DAX cluster is running.
     * </p>
     * 
     * @return The subnet group where the DAX cluster is running.
     */

    public String getSubnetGroup() {
        return this.subnetGroup;
    }

    /**
     * <p>
     * The subnet group where the DAX cluster is running.
     * </p>
     * 
     * @param subnetGroup
     *        The subnet group where the DAX cluster is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSubnetGroup(String subnetGroup) {
        setSubnetGroup(subnetGroup);
        return this;
    }

    /**
     * <p>
     * A list of security groups, and the status of each, for the nodes in the cluster.
     * </p>
     * 
     * @return A list of security groups, and the status of each, for the nodes in the cluster.
     */

    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of security groups, and the status of each, for the nodes in the cluster.
     * </p>
     * 
     * @param securityGroups
     *        A list of security groups, and the status of each, for the nodes in the cluster.
     */

    public void setSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroupMembership>(securityGroups);
    }

    /**
     * <p>
     * A list of security groups, and the status of each, for the nodes in the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of security groups, and the status of each, for the nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSecurityGroups(SecurityGroupMembership... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<SecurityGroupMembership>(securityGroups.length));
        }
        for (SecurityGroupMembership ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security groups, and the status of each, for the nodes in the cluster.
     * </p>
     * 
     * @param securityGroups
     *        A list of security groups, and the status of each, for the nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        setSecurityGroups(securityGroups);
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

    public Cluster withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The parameter group being used by nodes in the cluster.
     * </p>
     * 
     * @param parameterGroup
     *        The parameter group being used by nodes in the cluster.
     */

    public void setParameterGroup(ParameterGroupStatus parameterGroup) {
        this.parameterGroup = parameterGroup;
    }

    /**
     * <p>
     * The parameter group being used by nodes in the cluster.
     * </p>
     * 
     * @return The parameter group being used by nodes in the cluster.
     */

    public ParameterGroupStatus getParameterGroup() {
        return this.parameterGroup;
    }

    /**
     * <p>
     * The parameter group being used by nodes in the cluster.
     * </p>
     * 
     * @param parameterGroup
     *        The parameter group being used by nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withParameterGroup(ParameterGroupStatus parameterGroup) {
        setParameterGroup(parameterGroup);
        return this;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified DAX cluster.
     * </p>
     * 
     * @param sSEDescription
     *        The description of the server-side encryption status on the specified DAX cluster.
     */

    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified DAX cluster.
     * </p>
     * 
     * @return The description of the server-side encryption status on the specified DAX cluster.
     */

    public SSEDescription getSSEDescription() {
        return this.sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified DAX cluster.
     * </p>
     * 
     * @param sSEDescription
     *        The description of the server-side encryption status on the specified DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSSEDescription(SSEDescription sSEDescription) {
        setSSEDescription(sSEDescription);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getTotalNodes() != null)
            sb.append("TotalNodes: ").append(getTotalNodes()).append(",");
        if (getActiveNodes() != null)
            sb.append("ActiveNodes: ").append(getActiveNodes()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getClusterDiscoveryEndpoint() != null)
            sb.append("ClusterDiscoveryEndpoint: ").append(getClusterDiscoveryEndpoint()).append(",");
        if (getNodeIdsToRemove() != null)
            sb.append("NodeIdsToRemove: ").append(getNodeIdsToRemove()).append(",");
        if (getNodes() != null)
            sb.append("Nodes: ").append(getNodes()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration()).append(",");
        if (getSubnetGroup() != null)
            sb.append("SubnetGroup: ").append(getSubnetGroup()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getParameterGroup() != null)
            sb.append("ParameterGroup: ").append(getParameterGroup()).append(",");
        if (getSSEDescription() != null)
            sb.append("SSEDescription: ").append(getSSEDescription());
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
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getTotalNodes() == null ^ this.getTotalNodes() == null)
            return false;
        if (other.getTotalNodes() != null && other.getTotalNodes().equals(this.getTotalNodes()) == false)
            return false;
        if (other.getActiveNodes() == null ^ this.getActiveNodes() == null)
            return false;
        if (other.getActiveNodes() != null && other.getActiveNodes().equals(this.getActiveNodes()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getClusterDiscoveryEndpoint() == null ^ this.getClusterDiscoveryEndpoint() == null)
            return false;
        if (other.getClusterDiscoveryEndpoint() != null && other.getClusterDiscoveryEndpoint().equals(this.getClusterDiscoveryEndpoint()) == false)
            return false;
        if (other.getNodeIdsToRemove() == null ^ this.getNodeIdsToRemove() == null)
            return false;
        if (other.getNodeIdsToRemove() != null && other.getNodeIdsToRemove().equals(this.getNodeIdsToRemove()) == false)
            return false;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        if (other.getSubnetGroup() == null ^ this.getSubnetGroup() == null)
            return false;
        if (other.getSubnetGroup() != null && other.getSubnetGroup().equals(this.getSubnetGroup()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getParameterGroup() == null ^ this.getParameterGroup() == null)
            return false;
        if (other.getParameterGroup() != null && other.getParameterGroup().equals(this.getParameterGroup()) == false)
            return false;
        if (other.getSSEDescription() == null ^ this.getSSEDescription() == null)
            return false;
        if (other.getSSEDescription() != null && other.getSSEDescription().equals(this.getSSEDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getTotalNodes() == null) ? 0 : getTotalNodes().hashCode());
        hashCode = prime * hashCode + ((getActiveNodes() == null) ? 0 : getActiveNodes().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getClusterDiscoveryEndpoint() == null) ? 0 : getClusterDiscoveryEndpoint().hashCode());
        hashCode = prime * hashCode + ((getNodeIdsToRemove() == null) ? 0 : getNodeIdsToRemove().hashCode());
        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroup() == null) ? 0 : getSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getParameterGroup() == null) ? 0 : getParameterGroup().hashCode());
        hashCode = prime * hashCode + ((getSSEDescription() == null) ? 0 : getSSEDescription().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
