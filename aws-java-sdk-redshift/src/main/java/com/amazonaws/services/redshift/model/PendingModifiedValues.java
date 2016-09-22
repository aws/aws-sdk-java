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
 * Describes cluster attributes that are in a pending state. A change to one or more the attributes was requested and is
 * in progress or will be applied.
 * </p>
 */
public class PendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The pending or in-progress change of the master user password for the cluster.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention period.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the cluster from the public network.
     * </p>
     */
    private Boolean publiclyAccessible;
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
     * The pending or in-progress change of the master user password for the cluster.
     * </p>
     * 
     * @param masterUserPassword
     *        The pending or in-progress change of the master user password for the cluster.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The pending or in-progress change of the master user password for the cluster.
     * </p>
     * 
     * @return The pending or in-progress change of the master user password for the cluster.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The pending or in-progress change of the master user password for the cluster.
     * </p>
     * 
     * @param masterUserPassword
     *        The pending or in-progress change of the master user password for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     * 
     * @param nodeType
     *        The pending or in-progress change of the cluster's node type.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     * 
     * @return The pending or in-progress change of the cluster's node type.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     * 
     * @param nodeType
     *        The pending or in-progress change of the cluster's node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The pending or in-progress change of the number of nodes in the cluster.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     * 
     * @return The pending or in-progress change of the number of nodes in the cluster.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The pending or in-progress change of the number of nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     * 
     * @param clusterType
     *        The pending or in-progress change of the cluster type.
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     * 
     * @return The pending or in-progress change of the cluster type.
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     * 
     * @param clusterType
     *        The pending or in-progress change of the cluster type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     * 
     * @param clusterVersion
     *        The pending or in-progress change of the service version.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     * 
     * @return The pending or in-progress change of the service version.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     * 
     * @param clusterVersion
     *        The pending or in-progress change of the service version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention period.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The pending or in-progress change of the automated snapshot retention period.
     */

    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention period.
     * </p>
     * 
     * @return The pending or in-progress change of the automated snapshot retention period.
     */

    public Integer getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention period.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The pending or in-progress change of the automated snapshot retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        setAutomatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The pending or in-progress change of the new identifier for the cluster.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     * 
     * @return The pending or in-progress change of the new identifier for the cluster.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The pending or in-progress change of the new identifier for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the cluster from the public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        The pending or in-progress change of the ability to connect to the cluster from the public network.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the cluster from the public network.
     * </p>
     * 
     * @return The pending or in-progress change of the ability to connect to the cluster from the public network.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the cluster from the public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        The pending or in-progress change of the ability to connect to the cluster from the public network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the cluster from the public network.
     * </p>
     * 
     * @return The pending or in-progress change of the ability to connect to the cluster from the public network.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
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

    public PendingModifiedValues withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
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
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getClusterType() != null)
            sb.append("ClusterType: " + getClusterType() + ",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        return hashCode;
    }

    @Override
    public PendingModifiedValues clone() {
        try {
            return (PendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
