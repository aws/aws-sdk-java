/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a specific Elastic DocumentDB cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/Cluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster administrator.
     * </p>
     */
    private String adminUserName;
    /**
     * <p>
     * The authentication type for the Elastic DocumentDB cluster.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The URL used to connect to the Elastic DocumentDB cluster.
     * </p>
     */
    private String clusterEndpoint;
    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     * </p>
     */
    private String createTime;
    /**
     * <p>
     * The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The capacity of each shard in the Elastic DocumentDB cluster.
     * </p>
     */
    private Integer shardCapacity;
    /**
     * <p>
     * The number of shards in the Elastic DocumentDB cluster.
     * </p>
     */
    private Integer shardCount;
    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of EC2 VPC security groups associated with this cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster administrator.
     * </p>
     * 
     * @param adminUserName
     *        The name of the Elastic DocumentDB cluster administrator.
     */

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster administrator.
     * </p>
     * 
     * @return The name of the Elastic DocumentDB cluster administrator.
     */

    public String getAdminUserName() {
        return this.adminUserName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster administrator.
     * </p>
     * 
     * @param adminUserName
     *        The name of the Elastic DocumentDB cluster administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAdminUserName(String adminUserName) {
        setAdminUserName(adminUserName);
        return this;
    }

    /**
     * <p>
     * The authentication type for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param authType
     *        The authentication type for the Elastic DocumentDB cluster.
     * @see Auth
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authentication type for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The authentication type for the Elastic DocumentDB cluster.
     * @see Auth
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The authentication type for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param authType
     *        The authentication type for the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Auth
     */

    public Cluster withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The authentication type for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param authType
     *        The authentication type for the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Auth
     */

    public Cluster withAuthType(Auth authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterArn
     *        The arn of the Elastic DocumentDB cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The arn of the Elastic DocumentDB cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterArn
     *        The arn of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The URL used to connect to the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterEndpoint
     *        The URL used to connect to the Elastic DocumentDB cluster.
     */

    public void setClusterEndpoint(String clusterEndpoint) {
        this.clusterEndpoint = clusterEndpoint;
    }

    /**
     * <p>
     * The URL used to connect to the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The URL used to connect to the Elastic DocumentDB cluster.
     */

    public String getClusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * <p>
     * The URL used to connect to the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterEndpoint
     *        The URL used to connect to the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterEndpoint(String clusterEndpoint) {
        setClusterEndpoint(clusterEndpoint);
        return this;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the Elastic DocumentDB cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The name of the Elastic DocumentDB cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     */

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        The time when the Elastic DocumentDB cluster was created in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCreateTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use to encrypt the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The capacity of each shard in the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param shardCapacity
     *        The capacity of each shard in the Elastic DocumentDB cluster.
     */

    public void setShardCapacity(Integer shardCapacity) {
        this.shardCapacity = shardCapacity;
    }

    /**
     * <p>
     * The capacity of each shard in the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The capacity of each shard in the Elastic DocumentDB cluster.
     */

    public Integer getShardCapacity() {
        return this.shardCapacity;
    }

    /**
     * <p>
     * The capacity of each shard in the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param shardCapacity
     *        The capacity of each shard in the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withShardCapacity(Integer shardCapacity) {
        setShardCapacity(shardCapacity);
        return this;
    }

    /**
     * <p>
     * The number of shards in the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param shardCount
     *        The number of shards in the Elastic DocumentDB cluster.
     */

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * <p>
     * The number of shards in the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The number of shards in the Elastic DocumentDB cluster.
     */

    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * <p>
     * The number of shards in the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param shardCount
     *        The number of shards in the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withShardCount(Integer shardCount) {
        setShardCount(shardCount);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param status
     *        The status of the Elastic DocumentDB cluster.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The status of the Elastic DocumentDB cluster.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param status
     *        The status of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Cluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param status
     *        The status of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Cluster withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups associated with this cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups associated with this cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups associated with this cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups associated with this cluster.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups associated with this cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups associated with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups associated with this cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups associated with this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
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
        if (getAdminUserName() != null)
            sb.append("AdminUserName: ").append(getAdminUserName()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterEndpoint() != null)
            sb.append("ClusterEndpoint: ").append(getClusterEndpoint()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getShardCapacity() != null)
            sb.append("ShardCapacity: ").append(getShardCapacity()).append(",");
        if (getShardCount() != null)
            sb.append("ShardCount: ").append(getShardCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds());
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
        if (other.getAdminUserName() == null ^ this.getAdminUserName() == null)
            return false;
        if (other.getAdminUserName() != null && other.getAdminUserName().equals(this.getAdminUserName()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterEndpoint() == null ^ this.getClusterEndpoint() == null)
            return false;
        if (other.getClusterEndpoint() != null && other.getClusterEndpoint().equals(this.getClusterEndpoint()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getShardCapacity() == null ^ this.getShardCapacity() == null)
            return false;
        if (other.getShardCapacity() != null && other.getShardCapacity().equals(this.getShardCapacity()) == false)
            return false;
        if (other.getShardCount() == null ^ this.getShardCount() == null)
            return false;
        if (other.getShardCount() != null && other.getShardCount().equals(this.getShardCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUserName() == null) ? 0 : getAdminUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterEndpoint() == null) ? 0 : getClusterEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getShardCapacity() == null) ? 0 : getShardCapacity().hashCode());
        hashCode = prime * hashCode + ((getShardCount() == null) ? 0 : getShardCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
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
        com.amazonaws.services.docdbelastic.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
