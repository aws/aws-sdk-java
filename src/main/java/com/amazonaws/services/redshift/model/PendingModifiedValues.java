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
 * Describes cluster attributes that are in a pending state. A change to one or more the attributes was requested and is in progress or will be applied.
 * </p>
 */
public class PendingModifiedValues implements Serializable {

    /**
     * The pending or in-progress change of the master password for the
     * cluster.
     */
    private String masterUserPassword;

    /**
     * The pending or in-progress change of the cluster's node type.
     */
    private String nodeType;

    /**
     * The pending or in-progress change of the number nodes in the cluster.
     */
    private Integer numberOfNodes;

    /**
     * The pending or in-progress change of the cluster type.
     */
    private String clusterType;

    /**
     * The pending or in-progress change of the service version.
     */
    private String clusterVersion;

    /**
     * The pending or in-progress change of the automated snapshot retention
     * period.
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * The pending or in-progress change of the master password for the
     * cluster.
     *
     * @return The pending or in-progress change of the master password for the
     *         cluster.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The pending or in-progress change of the master password for the
     * cluster.
     *
     * @param masterUserPassword The pending or in-progress change of the master password for the
     *         cluster.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The pending or in-progress change of the master password for the
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The pending or in-progress change of the master password for the
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * The pending or in-progress change of the cluster's node type.
     *
     * @return The pending or in-progress change of the cluster's node type.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The pending or in-progress change of the cluster's node type.
     *
     * @param nodeType The pending or in-progress change of the cluster's node type.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The pending or in-progress change of the cluster's node type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The pending or in-progress change of the cluster's node type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The pending or in-progress change of the number nodes in the cluster.
     *
     * @return The pending or in-progress change of the number nodes in the cluster.
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }
    
    /**
     * The pending or in-progress change of the number nodes in the cluster.
     *
     * @param numberOfNodes The pending or in-progress change of the number nodes in the cluster.
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
    
    /**
     * The pending or in-progress change of the number nodes in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfNodes The pending or in-progress change of the number nodes in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * The pending or in-progress change of the cluster type.
     *
     * @return The pending or in-progress change of the cluster type.
     */
    public String getClusterType() {
        return clusterType;
    }
    
    /**
     * The pending or in-progress change of the cluster type.
     *
     * @param clusterType The pending or in-progress change of the cluster type.
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }
    
    /**
     * The pending or in-progress change of the cluster type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterType The pending or in-progress change of the cluster type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * The pending or in-progress change of the service version.
     *
     * @return The pending or in-progress change of the service version.
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The pending or in-progress change of the service version.
     *
     * @param clusterVersion The pending or in-progress change of the service version.
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The pending or in-progress change of the service version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The pending or in-progress change of the service version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * The pending or in-progress change of the automated snapshot retention
     * period.
     *
     * @return The pending or in-progress change of the automated snapshot retention
     *         period.
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The pending or in-progress change of the automated snapshot retention
     * period.
     *
     * @param automatedSnapshotRetentionPeriod The pending or in-progress change of the automated snapshot retention
     *         period.
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The pending or in-progress change of the automated snapshot retention
     * period.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automatedSnapshotRetentionPeriod The pending or in-progress change of the automated snapshot retention
     *         period.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
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
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null) sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getClusterType() != null) sb.append("ClusterType: " + getClusterType() + ",");
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null) sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PendingModifiedValues == false) return false;
        PendingModifiedValues other = (PendingModifiedValues)obj;
        
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null) return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false) return false; 
        if (other.getClusterType() == null ^ this.getClusterType() == null) return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false) return false; 
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null) return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false) return false; 
        return true;
    }
    
}
    