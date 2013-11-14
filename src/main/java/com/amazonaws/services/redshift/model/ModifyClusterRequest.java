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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#modifyCluster(ModifyClusterRequest) ModifyCluster operation}.
 * <p>
 * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change
 * the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However,
 * modifying parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
 * Guide</i>
 * </p>
 * <p>
 * You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of
 * nodes and the node type even if one of the parameters does not change. If you specify the same number of nodes and node type that are already
 * configured for the cluster, an error is returned.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#modifyCluster(ModifyClusterRequest)
 */
public class ModifyClusterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of the cluster to be modified. <p>Example:
     * <code>examplecluster</code>
     */
    private String clusterIdentifier;

    /**
     * The new cluster type. <p> When you submit your cluster resize request,
     * your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements,
     * there will be outage for a period while the old cluster is deleted and
     * your connection is switched to the new cluster. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * <p>Valid Values: <code> multi-node | single-node </code>
     */
    private String clusterType;

    /**
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter also. <p> When you
     * submit your request to resize a cluster, Amazon Redshift sets access
     * permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use the <a>DescribeResize</a> to track the progress
     * of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>
     */
    private String nodeType;

    /**
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter also. <p> When
     * you submit your request to resize a cluster, Amazon Redshift sets
     * access permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use <a>DescribeResize</a> to track the progress of
     * the resize request. <p>Valid Values: Integer greater than
     * <code>0</code>.
     */
    private Integer numberOfNodes;

    /**
     * A list of cluster security groups to be authorized on this cluster.
     * This change is asynchronously applied as soon as possible. <p>Security
     * groups currently associated with the cluster and not in the list of
     * groups to apply, will be revoked from the cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroups;

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <note> Operations never return the password, so this operation
     * provides a way to regain access to the master user account for a
     * cluster if the password is lost. </note> <p>Default: Uses existing
     * setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     * in length.</li> <li>Must contain at least one uppercase letter.</li>
     * <li>Must contain at least one lowercase letter.</li> <li>Must contain
     * one number.</li> <li>Can be any printable ASCII character (ASCII code
     * 33 to 126) except ' (single quote), " (double quote), \, /, @, or
     * space.</li> </ul>
     */
    private String masterUserPassword;

    /**
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a
     * cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     * <p>Constraints: The cluster parameter group must be in the same
     * parameter group family that matches the cluster version.
     */
    private String clusterParameterGroupName;

    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     * snapshot retention period from its current value, existing automated
     * snapshots which fall outside of the new retention period will be
     * immediately deleted. <p>Default: Uses existing setting.
     * <p>Constraints: Must be a value from 0 to 35.
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, if necessary. If system maintenance is necessary during the
     * window, it may result in an outage. <p> This maintenance window change
     * is made immediately. If the new maintenance window indicates the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window in order to ensure that pending changes are
     * applied. <p>Default: Uses existing setting. <p>Format:
     * ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes.
     */
    private String preferredMaintenanceWindow;

    /**
     * The new version number of the Amazon Redshift engine to upgrade to.
     * <p> For major version upgrades, if a non-default cluster parameter
     * group is currently in use, a new cluster parameter group in the
     * cluster parameter group family for the new version must be specified.
     * The new cluster parameter group can be the default for that cluster
     * parameter group family. For more information about managing parameter
     * groups, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     * Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>Example: <code>1.0</code>
     */
    private String clusterVersion;

    /**
     * If <code>true</code>, upgrades will be applied automatically to the
     * cluster during the maintenance window. <p>Default: <code>false</code>
     */
    private Boolean allowVersionUpgrade;

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
     * The unique identifier of the cluster to be modified. <p>Example:
     * <code>examplecluster</code>
     *
     * @return The unique identifier of the cluster to be modified. <p>Example:
     *         <code>examplecluster</code>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster to be modified. <p>Example:
     * <code>examplecluster</code>
     *
     * @param clusterIdentifier The unique identifier of the cluster to be modified. <p>Example:
     *         <code>examplecluster</code>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster to be modified. <p>Example:
     * <code>examplecluster</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of the cluster to be modified. <p>Example:
     *         <code>examplecluster</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The new cluster type. <p> When you submit your cluster resize request,
     * your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements,
     * there will be outage for a period while the old cluster is deleted and
     * your connection is switched to the new cluster. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * <p>Valid Values: <code> multi-node | single-node </code>
     *
     * @return The new cluster type. <p> When you submit your cluster resize request,
     *         your existing cluster goes into a read-only mode. After Amazon
     *         Redshift provisions a new cluster based on your resize requirements,
     *         there will be outage for a period while the old cluster is deleted and
     *         your connection is switched to the new cluster. You can use
     *         <a>DescribeResize</a> to track the progress of the resize request.
     *         <p>Valid Values: <code> multi-node | single-node </code>
     */
    public String getClusterType() {
        return clusterType;
    }
    
    /**
     * The new cluster type. <p> When you submit your cluster resize request,
     * your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements,
     * there will be outage for a period while the old cluster is deleted and
     * your connection is switched to the new cluster. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * <p>Valid Values: <code> multi-node | single-node </code>
     *
     * @param clusterType The new cluster type. <p> When you submit your cluster resize request,
     *         your existing cluster goes into a read-only mode. After Amazon
     *         Redshift provisions a new cluster based on your resize requirements,
     *         there will be outage for a period while the old cluster is deleted and
     *         your connection is switched to the new cluster. You can use
     *         <a>DescribeResize</a> to track the progress of the resize request.
     *         <p>Valid Values: <code> multi-node | single-node </code>
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }
    
    /**
     * The new cluster type. <p> When you submit your cluster resize request,
     * your existing cluster goes into a read-only mode. After Amazon
     * Redshift provisions a new cluster based on your resize requirements,
     * there will be outage for a period while the old cluster is deleted and
     * your connection is switched to the new cluster. You can use
     * <a>DescribeResize</a> to track the progress of the resize request.
     * <p>Valid Values: <code> multi-node | single-node </code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterType The new cluster type. <p> When you submit your cluster resize request,
     *         your existing cluster goes into a read-only mode. After Amazon
     *         Redshift provisions a new cluster based on your resize requirements,
     *         there will be outage for a period while the old cluster is deleted and
     *         your connection is switched to the new cluster. You can use
     *         <a>DescribeResize</a> to track the progress of the resize request.
     *         <p>Valid Values: <code> multi-node | single-node </code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter also. <p> When you
     * submit your request to resize a cluster, Amazon Redshift sets access
     * permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use the <a>DescribeResize</a> to track the progress
     * of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>
     *
     * @return The new node type of the cluster. If you specify a new node type, you
     *         must also specify the number of nodes parameter also. <p> When you
     *         submit your request to resize a cluster, Amazon Redshift sets access
     *         permissions for the cluster to read-only. After Amazon Redshift
     *         provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your
     *         connection is switched to the new cluster. When the new connection is
     *         complete, the original access permissions for the cluster are
     *         restored. You can use the <a>DescribeResize</a> to track the progress
     *         of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     *         <code>dw.hs1.8xlarge</code>
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter also. <p> When you
     * submit your request to resize a cluster, Amazon Redshift sets access
     * permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use the <a>DescribeResize</a> to track the progress
     * of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>
     *
     * @param nodeType The new node type of the cluster. If you specify a new node type, you
     *         must also specify the number of nodes parameter also. <p> When you
     *         submit your request to resize a cluster, Amazon Redshift sets access
     *         permissions for the cluster to read-only. After Amazon Redshift
     *         provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your
     *         connection is switched to the new cluster. When the new connection is
     *         complete, the original access permissions for the cluster are
     *         restored. You can use the <a>DescribeResize</a> to track the progress
     *         of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     *         <code>dw.hs1.8xlarge</code>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The new node type of the cluster. If you specify a new node type, you
     * must also specify the number of nodes parameter also. <p> When you
     * submit your request to resize a cluster, Amazon Redshift sets access
     * permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use the <a>DescribeResize</a> to track the progress
     * of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     * <code>dw.hs1.8xlarge</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The new node type of the cluster. If you specify a new node type, you
     *         must also specify the number of nodes parameter also. <p> When you
     *         submit your request to resize a cluster, Amazon Redshift sets access
     *         permissions for the cluster to read-only. After Amazon Redshift
     *         provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your
     *         connection is switched to the new cluster. When the new connection is
     *         complete, the original access permissions for the cluster are
     *         restored. You can use the <a>DescribeResize</a> to track the progress
     *         of the resize request. <p>Valid Values: <code> dw.hs1.xlarge</code> |
     *         <code>dw.hs1.8xlarge</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter also. <p> When
     * you submit your request to resize a cluster, Amazon Redshift sets
     * access permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use <a>DescribeResize</a> to track the progress of
     * the resize request. <p>Valid Values: Integer greater than
     * <code>0</code>.
     *
     * @return The new number of nodes of the cluster. If you specify a new number of
     *         nodes, you must also specify the node type parameter also. <p> When
     *         you submit your request to resize a cluster, Amazon Redshift sets
     *         access permissions for the cluster to read-only. After Amazon Redshift
     *         provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your
     *         connection is switched to the new cluster. When the new connection is
     *         complete, the original access permissions for the cluster are
     *         restored. You can use <a>DescribeResize</a> to track the progress of
     *         the resize request. <p>Valid Values: Integer greater than
     *         <code>0</code>.
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }
    
    /**
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter also. <p> When
     * you submit your request to resize a cluster, Amazon Redshift sets
     * access permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use <a>DescribeResize</a> to track the progress of
     * the resize request. <p>Valid Values: Integer greater than
     * <code>0</code>.
     *
     * @param numberOfNodes The new number of nodes of the cluster. If you specify a new number of
     *         nodes, you must also specify the node type parameter also. <p> When
     *         you submit your request to resize a cluster, Amazon Redshift sets
     *         access permissions for the cluster to read-only. After Amazon Redshift
     *         provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your
     *         connection is switched to the new cluster. When the new connection is
     *         complete, the original access permissions for the cluster are
     *         restored. You can use <a>DescribeResize</a> to track the progress of
     *         the resize request. <p>Valid Values: Integer greater than
     *         <code>0</code>.
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
    
    /**
     * The new number of nodes of the cluster. If you specify a new number of
     * nodes, you must also specify the node type parameter also. <p> When
     * you submit your request to resize a cluster, Amazon Redshift sets
     * access permissions for the cluster to read-only. After Amazon Redshift
     * provisions a new cluster according to your resize requirements, there
     * will be a temporary outage while the old cluster is deleted and your
     * connection is switched to the new cluster. When the new connection is
     * complete, the original access permissions for the cluster are
     * restored. You can use <a>DescribeResize</a> to track the progress of
     * the resize request. <p>Valid Values: Integer greater than
     * <code>0</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfNodes The new number of nodes of the cluster. If you specify a new number of
     *         nodes, you must also specify the node type parameter also. <p> When
     *         you submit your request to resize a cluster, Amazon Redshift sets
     *         access permissions for the cluster to read-only. After Amazon Redshift
     *         provisions a new cluster according to your resize requirements, there
     *         will be a temporary outage while the old cluster is deleted and your
     *         connection is switched to the new cluster. When the new connection is
     *         complete, the original access permissions for the cluster are
     *         restored. You can use <a>DescribeResize</a> to track the progress of
     *         the resize request. <p>Valid Values: Integer greater than
     *         <code>0</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * A list of cluster security groups to be authorized on this cluster.
     * This change is asynchronously applied as soon as possible. <p>Security
     * groups currently associated with the cluster and not in the list of
     * groups to apply, will be revoked from the cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @return A list of cluster security groups to be authorized on this cluster.
     *         This change is asynchronously applied as soon as possible. <p>Security
     *         groups currently associated with the cluster and not in the list of
     *         groups to apply, will be revoked from the cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public java.util.List<String> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
              clusterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clusterSecurityGroups.setAutoConstruct(true);
        }
        return clusterSecurityGroups;
    }
    
    /**
     * A list of cluster security groups to be authorized on this cluster.
     * This change is asynchronously applied as soon as possible. <p>Security
     * groups currently associated with the cluster and not in the list of
     * groups to apply, will be revoked from the cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @param clusterSecurityGroups A list of cluster security groups to be authorized on this cluster.
     *         This change is asynchronously applied as soon as possible. <p>Security
     *         groups currently associated with the cluster and not in the list of
     *         groups to apply, will be revoked from the cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
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
     * A list of cluster security groups to be authorized on this cluster.
     * This change is asynchronously applied as soon as possible. <p>Security
     * groups currently associated with the cluster and not in the list of
     * groups to apply, will be revoked from the cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of cluster security groups to be authorized on this cluster.
     *         This change is asynchronously applied as soon as possible. <p>Security
     *         groups currently associated with the cluster and not in the list of
     *         groups to apply, will be revoked from the cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) setClusterSecurityGroups(new java.util.ArrayList<String>(clusterSecurityGroups.length));
        for (String value : clusterSecurityGroups) {
            getClusterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of cluster security groups to be authorized on this cluster.
     * This change is asynchronously applied as soon as possible. <p>Security
     * groups currently associated with the cluster and not in the list of
     * groups to apply, will be revoked from the cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of cluster security groups to be authorized on this cluster.
     *         This change is asynchronously applied as soon as possible. <p>Security
     *         groups currently associated with the cluster and not in the list of
     *         groups to apply, will be revoked from the cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
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
     * with the cluster.
     *
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster.
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
     * with the cluster.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster.
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
     * with the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <note> Operations never return the password, so this operation
     * provides a way to regain access to the master user account for a
     * cluster if the password is lost. </note> <p>Default: Uses existing
     * setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     * in length.</li> <li>Must contain at least one uppercase letter.</li>
     * <li>Must contain at least one lowercase letter.</li> <li>Must contain
     * one number.</li> <li>Can be any printable ASCII character (ASCII code
     * 33 to 126) except ' (single quote), " (double quote), \, /, @, or
     * space.</li> </ul>
     *
     * @return The new password for the cluster master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation response.
     *         <note> Operations never return the password, so this operation
     *         provides a way to regain access to the master user account for a
     *         cluster if the password is lost. </note> <p>Default: Uses existing
     *         setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     *         in length.</li> <li>Must contain at least one uppercase letter.</li>
     *         <li>Must contain at least one lowercase letter.</li> <li>Must contain
     *         one number.</li> <li>Can be any printable ASCII character (ASCII code
     *         33 to 126) except ' (single quote), " (double quote), \, /, @, or
     *         space.</li> </ul>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <note> Operations never return the password, so this operation
     * provides a way to regain access to the master user account for a
     * cluster if the password is lost. </note> <p>Default: Uses existing
     * setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     * in length.</li> <li>Must contain at least one uppercase letter.</li>
     * <li>Must contain at least one lowercase letter.</li> <li>Must contain
     * one number.</li> <li>Can be any printable ASCII character (ASCII code
     * 33 to 126) except ' (single quote), " (double quote), \, /, @, or
     * space.</li> </ul>
     *
     * @param masterUserPassword The new password for the cluster master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation response.
     *         <note> Operations never return the password, so this operation
     *         provides a way to regain access to the master user account for a
     *         cluster if the password is lost. </note> <p>Default: Uses existing
     *         setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     *         in length.</li> <li>Must contain at least one uppercase letter.</li>
     *         <li>Must contain at least one lowercase letter.</li> <li>Must contain
     *         one number.</li> <li>Can be any printable ASCII character (ASCII code
     *         33 to 126) except ' (single quote), " (double quote), \, /, @, or
     *         space.</li> </ul>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The new password for the cluster master user. This change is
     * asynchronously applied as soon as possible. Between the time of the
     * request and the completion of the request, the
     * <code>MasterUserPassword</code> element exists in the
     * <code>PendingModifiedValues</code> element of the operation response.
     * <note> Operations never return the password, so this operation
     * provides a way to regain access to the master user account for a
     * cluster if the password is lost. </note> <p>Default: Uses existing
     * setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     * in length.</li> <li>Must contain at least one uppercase letter.</li>
     * <li>Must contain at least one lowercase letter.</li> <li>Must contain
     * one number.</li> <li>Can be any printable ASCII character (ASCII code
     * 33 to 126) except ' (single quote), " (double quote), \, /, @, or
     * space.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The new password for the cluster master user. This change is
     *         asynchronously applied as soon as possible. Between the time of the
     *         request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the
     *         <code>PendingModifiedValues</code> element of the operation response.
     *         <note> Operations never return the password, so this operation
     *         provides a way to regain access to the master user account for a
     *         cluster if the password is lost. </note> <p>Default: Uses existing
     *         setting. <p> Constraints: <ul> <li>Must be between 8 and 64 characters
     *         in length.</li> <li>Must contain at least one uppercase letter.</li>
     *         <li>Must contain at least one lowercase letter.</li> <li>Must contain
     *         one number.</li> <li>Can be any printable ASCII character (ASCII code
     *         33 to 126) except ' (single quote), " (double quote), \, /, @, or
     *         space.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a
     * cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     * <p>Constraints: The cluster parameter group must be in the same
     * parameter group family that matches the cluster version.
     *
     * @return The name of the cluster parameter group to apply to this cluster. This
     *         change is applied only after the cluster is rebooted. To reboot a
     *         cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     *         <p>Constraints: The cluster parameter group must be in the same
     *         parameter group family that matches the cluster version.
     */
    public String getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a
     * cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     * <p>Constraints: The cluster parameter group must be in the same
     * parameter group family that matches the cluster version.
     *
     * @param clusterParameterGroupName The name of the cluster parameter group to apply to this cluster. This
     *         change is applied only after the cluster is rebooted. To reboot a
     *         cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     *         <p>Constraints: The cluster parameter group must be in the same
     *         parameter group family that matches the cluster version.
     */
    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group to apply to this cluster. This
     * change is applied only after the cluster is rebooted. To reboot a
     * cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     * <p>Constraints: The cluster parameter group must be in the same
     * parameter group family that matches the cluster version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterParameterGroupName The name of the cluster parameter group to apply to this cluster. This
     *         change is applied only after the cluster is rebooted. To reboot a
     *         cluster use <a>RebootCluster</a>. <p>Default: Uses existing setting.
     *         <p>Constraints: The cluster parameter group must be in the same
     *         parameter group family that matches the cluster version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
        return this;
    }

    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     * snapshot retention period from its current value, existing automated
     * snapshots which fall outside of the new retention period will be
     * immediately deleted. <p>Default: Uses existing setting.
     * <p>Constraints: Must be a value from 0 to 35.
     *
     * @return The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     *         snapshot retention period from its current value, existing automated
     *         snapshots which fall outside of the new retention period will be
     *         immediately deleted. <p>Default: Uses existing setting.
     *         <p>Constraints: Must be a value from 0 to 35.
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     * snapshot retention period from its current value, existing automated
     * snapshots which fall outside of the new retention period will be
     * immediately deleted. <p>Default: Uses existing setting.
     * <p>Constraints: Must be a value from 0 to 35.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     *         snapshot retention period from its current value, existing automated
     *         snapshots which fall outside of the new retention period will be
     *         immediately deleted. <p>Default: Uses existing setting.
     *         <p>Constraints: Must be a value from 0 to 35.
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     * snapshot retention period from its current value, existing automated
     * snapshots which fall outside of the new retention period will be
     * immediately deleted. <p>Default: Uses existing setting.
     * <p>Constraints: Must be a value from 0 to 35.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p>If you decrease the automated
     *         snapshot retention period from its current value, existing automated
     *         snapshots which fall outside of the new retention period will be
     *         immediately deleted. <p>Default: Uses existing setting.
     *         <p>Constraints: Must be a value from 0 to 35.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, if necessary. If system maintenance is necessary during the
     * window, it may result in an outage. <p> This maintenance window change
     * is made immediately. If the new maintenance window indicates the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window in order to ensure that pending changes are
     * applied. <p>Default: Uses existing setting. <p>Format:
     * ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes.
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur, if necessary. If system maintenance is necessary during the
     *         window, it may result in an outage. <p> This maintenance window change
     *         is made immediately. If the new maintenance window indicates the
     *         current time, there must be at least 120 minutes between the current
     *         time and end of the window in order to ensure that pending changes are
     *         applied. <p>Default: Uses existing setting. <p>Format:
     *         ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     *         <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     *         Must be at least 30 minutes.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, if necessary. If system maintenance is necessary during the
     * window, it may result in an outage. <p> This maintenance window change
     * is made immediately. If the new maintenance window indicates the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window in order to ensure that pending changes are
     * applied. <p>Default: Uses existing setting. <p>Format:
     * ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, if necessary. If system maintenance is necessary during the
     *         window, it may result in an outage. <p> This maintenance window change
     *         is made immediately. If the new maintenance window indicates the
     *         current time, there must be at least 120 minutes between the current
     *         time and end of the window in order to ensure that pending changes are
     *         applied. <p>Default: Uses existing setting. <p>Format:
     *         ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     *         <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     *         Must be at least 30 minutes.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, if necessary. If system maintenance is necessary during the
     * window, it may result in an outage. <p> This maintenance window change
     * is made immediately. If the new maintenance window indicates the
     * current time, there must be at least 120 minutes between the current
     * time and end of the window in order to ensure that pending changes are
     * applied. <p>Default: Uses existing setting. <p>Format:
     * ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, if necessary. If system maintenance is necessary during the
     *         window, it may result in an outage. <p> This maintenance window change
     *         is made immediately. If the new maintenance window indicates the
     *         current time, there must be at least 120 minutes between the current
     *         time and end of the window in order to ensure that pending changes are
     *         applied. <p>Default: Uses existing setting. <p>Format:
     *         ddd:hh24:mi-ddd:hh24:mi, for example <code>wed:07:30-wed:08:00</code>.
     *         <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     *         Must be at least 30 minutes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The new version number of the Amazon Redshift engine to upgrade to.
     * <p> For major version upgrades, if a non-default cluster parameter
     * group is currently in use, a new cluster parameter group in the
     * cluster parameter group family for the new version must be specified.
     * The new cluster parameter group can be the default for that cluster
     * parameter group family. For more information about managing parameter
     * groups, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     * Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>Example: <code>1.0</code>
     *
     * @return The new version number of the Amazon Redshift engine to upgrade to.
     *         <p> For major version upgrades, if a non-default cluster parameter
     *         group is currently in use, a new cluster parameter group in the
     *         cluster parameter group family for the new version must be specified.
     *         The new cluster parameter group can be the default for that cluster
     *         parameter group family. For more information about managing parameter
     *         groups, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     *         Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p>Example: <code>1.0</code>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The new version number of the Amazon Redshift engine to upgrade to.
     * <p> For major version upgrades, if a non-default cluster parameter
     * group is currently in use, a new cluster parameter group in the
     * cluster parameter group family for the new version must be specified.
     * The new cluster parameter group can be the default for that cluster
     * parameter group family. For more information about managing parameter
     * groups, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     * Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>Example: <code>1.0</code>
     *
     * @param clusterVersion The new version number of the Amazon Redshift engine to upgrade to.
     *         <p> For major version upgrades, if a non-default cluster parameter
     *         group is currently in use, a new cluster parameter group in the
     *         cluster parameter group family for the new version must be specified.
     *         The new cluster parameter group can be the default for that cluster
     *         parameter group family. For more information about managing parameter
     *         groups, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     *         Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p>Example: <code>1.0</code>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The new version number of the Amazon Redshift engine to upgrade to.
     * <p> For major version upgrades, if a non-default cluster parameter
     * group is currently in use, a new cluster parameter group in the
     * cluster parameter group family for the new version must be specified.
     * The new cluster parameter group can be the default for that cluster
     * parameter group family. For more information about managing parameter
     * groups, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     * Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     * Guide</i>. <p>Example: <code>1.0</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The new version number of the Amazon Redshift engine to upgrade to.
     *         <p> For major version upgrades, if a non-default cluster parameter
     *         group is currently in use, a new cluster parameter group in the
     *         cluster parameter group family for the new version must be specified.
     *         The new cluster parameter group can be the default for that cluster
     *         parameter group family. For more information about managing parameter
     *         groups, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     *         Redshift Parameter Groups</a> in the <i>Amazon Redshift Management
     *         Guide</i>. <p>Example: <code>1.0</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * If <code>true</code>, upgrades will be applied automatically to the
     * cluster during the maintenance window. <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, upgrades will be applied automatically to the
     *         cluster during the maintenance window. <p>Default: <code>false</code>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, upgrades will be applied automatically to the
     * cluster during the maintenance window. <p>Default: <code>false</code>
     *
     * @param allowVersionUpgrade If <code>true</code>, upgrades will be applied automatically to the
     *         cluster during the maintenance window. <p>Default: <code>false</code>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, upgrades will be applied automatically to the
     * cluster during the maintenance window. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowVersionUpgrade If <code>true</code>, upgrades will be applied automatically to the
     *         cluster during the maintenance window. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyClusterRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * If <code>true</code>, upgrades will be applied automatically to the
     * cluster during the maintenance window. <p>Default: <code>false</code>
     *
     * @return If <code>true</code>, upgrades will be applied automatically to the
     *         cluster during the maintenance window. <p>Default: <code>false</code>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
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
    public ModifyClusterRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
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
    public ModifyClusterRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
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
        if (getClusterType() != null) sb.append("ClusterType: " + getClusterType() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null) sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getClusterSecurityGroups() != null) sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getClusterParameterGroupName() != null) sb.append("ClusterParameterGroupName: " + getClusterParameterGroupName() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null) sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (isAllowVersionUpgrade() != null) sb.append("AllowVersionUpgrade: " + isAllowVersionUpgrade() + ",");
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() + ",");
        if (getHsmConfigurationIdentifier() != null) sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAllowVersionUpgrade() == null) ? 0 : isAllowVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyClusterRequest == false) return false;
        ModifyClusterRequest other = (ModifyClusterRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getClusterType() == null ^ this.getClusterType() == null) return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null) return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false) return false; 
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null) return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getClusterParameterGroupName() == null ^ this.getClusterParameterGroupName() == null) return false;
        if (other.getClusterParameterGroupName() != null && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false) return false; 
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null) return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.isAllowVersionUpgrade() == null ^ this.isAllowVersionUpgrade() == null) return false;
        if (other.isAllowVersionUpgrade() != null && other.isAllowVersionUpgrade().equals(this.isAllowVersionUpgrade()) == false) return false; 
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null) return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false) return false; 
        return true;
    }
    
}
    