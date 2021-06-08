/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Changes to the Amazon Redshift cluster that are currently pending.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterPendingModifiedValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterPendingModifiedValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pending or in-progress change to the automated snapshot retention period.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * <p>
     * The pending or in-progress change to the identifier for the cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The pending or in-progress change to the cluster type.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The pending or in-progress change to the service version.
     * </p>
     */
    private String clusterVersion;
    /**
     * <p>
     * The encryption type for a cluster.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     */
    private Boolean enhancedVpcRouting;
    /**
     * <p>
     * The name of the maintenance track that the cluster changes to during the next maintenance window.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * The pending or in-progress change to the master user password for the cluster.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The pending or in-progress change to the cluster's node type.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The pending or in-progress change to the number of nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The pending or in-progress change to whether the cluster can be connected to from the public network.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The pending or in-progress change to the automated snapshot retention period.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The pending or in-progress change to the automated snapshot retention period.
     */

    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The pending or in-progress change to the automated snapshot retention period.
     * </p>
     * 
     * @return The pending or in-progress change to the automated snapshot retention period.
     */

    public Integer getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The pending or in-progress change to the automated snapshot retention period.
     * </p>
     * 
     * @param automatedSnapshotRetentionPeriod
     *        The pending or in-progress change to the automated snapshot retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        setAutomatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to the identifier for the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The pending or in-progress change to the identifier for the cluster.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The pending or in-progress change to the identifier for the cluster.
     * </p>
     * 
     * @return The pending or in-progress change to the identifier for the cluster.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The pending or in-progress change to the identifier for the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The pending or in-progress change to the identifier for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to the cluster type.
     * </p>
     * 
     * @param clusterType
     *        The pending or in-progress change to the cluster type.
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The pending or in-progress change to the cluster type.
     * </p>
     * 
     * @return The pending or in-progress change to the cluster type.
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * The pending or in-progress change to the cluster type.
     * </p>
     * 
     * @param clusterType
     *        The pending or in-progress change to the cluster type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to the service version.
     * </p>
     * 
     * @param clusterVersion
     *        The pending or in-progress change to the service version.
     */

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The pending or in-progress change to the service version.
     * </p>
     * 
     * @return The pending or in-progress change to the service version.
     */

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * <p>
     * The pending or in-progress change to the service version.
     * </p>
     * 
     * @param clusterVersion
     *        The pending or in-progress change to the service version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withClusterVersion(String clusterVersion) {
        setClusterVersion(clusterVersion);
        return this;
    }

    /**
     * <p>
     * The encryption type for a cluster.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type for a cluster.
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type for a cluster.
     * </p>
     * 
     * @return The encryption type for a cluster.
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type for a cluster.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type for a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @param enhancedVpcRouting
     *        Indicates whether to create the cluster with enhanced VPC routing enabled.
     */

    public void setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @return Indicates whether to create the cluster with enhanced VPC routing enabled.
     */

    public Boolean getEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @param enhancedVpcRouting
     *        Indicates whether to create the cluster with enhanced VPC routing enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        setEnhancedVpcRouting(enhancedVpcRouting);
        return this;
    }

    /**
     * <p>
     * Indicates whether to create the cluster with enhanced VPC routing enabled.
     * </p>
     * 
     * @return Indicates whether to create the cluster with enhanced VPC routing enabled.
     */

    public Boolean isEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * The name of the maintenance track that the cluster changes to during the next maintenance window.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track that the cluster changes to during the next maintenance window.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track that the cluster changes to during the next maintenance window.
     * </p>
     * 
     * @return The name of the maintenance track that the cluster changes to during the next maintenance window.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track that the cluster changes to during the next maintenance window.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track that the cluster changes to during the next maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to the master user password for the cluster.
     * </p>
     * 
     * @param masterUserPassword
     *        The pending or in-progress change to the master user password for the cluster.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The pending or in-progress change to the master user password for the cluster.
     * </p>
     * 
     * @return The pending or in-progress change to the master user password for the cluster.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The pending or in-progress change to the master user password for the cluster.
     * </p>
     * 
     * @param masterUserPassword
     *        The pending or in-progress change to the master user password for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to the cluster's node type.
     * </p>
     * 
     * @param nodeType
     *        The pending or in-progress change to the cluster's node type.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The pending or in-progress change to the cluster's node type.
     * </p>
     * 
     * @return The pending or in-progress change to the cluster's node type.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The pending or in-progress change to the cluster's node type.
     * </p>
     * 
     * @param nodeType
     *        The pending or in-progress change to the cluster's node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to the number of nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The pending or in-progress change to the number of nodes in the cluster.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The pending or in-progress change to the number of nodes in the cluster.
     * </p>
     * 
     * @return The pending or in-progress change to the number of nodes in the cluster.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The pending or in-progress change to the number of nodes in the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The pending or in-progress change to the number of nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to whether the cluster can be connected to from the public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        The pending or in-progress change to whether the cluster can be connected to from the public network.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change to whether the cluster can be connected to from the public network.
     * </p>
     * 
     * @return The pending or in-progress change to whether the cluster can be connected to from the public network.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change to whether the cluster can be connected to from the public network.
     * </p>
     * 
     * @param publiclyAccessible
     *        The pending or in-progress change to whether the cluster can be connected to from the public network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterPendingModifiedValues withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change to whether the cluster can be connected to from the public network.
     * </p>
     * 
     * @return The pending or in-progress change to whether the cluster can be connected to from the public network.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
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
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: ").append(getAutomatedSnapshotRetentionPeriod()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: ").append(getClusterVersion()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: ").append(getEnhancedVpcRouting()).append(",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: ").append(getMaintenanceTrackName()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterPendingModifiedValues == false)
            return false;
        AwsRedshiftClusterPendingModifiedValues other = (AwsRedshiftClusterPendingModifiedValues) obj;
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
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
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterPendingModifiedValues clone() {
        try {
            return (AwsRedshiftClusterPendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterPendingModifiedValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
