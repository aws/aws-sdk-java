/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returns information about a specific elastic cluster snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSnapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the elastic cluster administrator.
     * </p>
     */
    private String adminUserName;
    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     * </p>
     */
    private String clusterCreationTime;
    /**
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon DocumentDB uses the default
     * encryption key that KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The ARN identifier of the elastic cluster snapshot.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     * </p>
     */
    private String snapshotCreationTime;
    /**
     * <p>
     * The name of the elastic cluster snapshot.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     */
    private String snapshotType;
    /**
     * <p>
     * The status of the elastic cluster snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The name of the elastic cluster administrator.
     * </p>
     * 
     * @param adminUserName
     *        The name of the elastic cluster administrator.
     */

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    /**
     * <p>
     * The name of the elastic cluster administrator.
     * </p>
     * 
     * @return The name of the elastic cluster administrator.
     */

    public String getAdminUserName() {
        return this.adminUserName;
    }

    /**
     * <p>
     * The name of the elastic cluster administrator.
     * </p>
     * 
     * @param adminUserName
     *        The name of the elastic cluster administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withAdminUserName(String adminUserName) {
        setAdminUserName(adminUserName);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @param clusterArn
     *        The ARN identifier of the elastic cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @return The ARN identifier of the elastic cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @param clusterArn
     *        The ARN identifier of the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreationTime
     *        The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     */

    public void setClusterCreationTime(String clusterCreationTime) {
        this.clusterCreationTime = clusterCreationTime;
    }

    /**
     * <p>
     * The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     */

    public String getClusterCreationTime() {
        return this.clusterCreationTime;
    }

    /**
     * <p>
     * The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreationTime
     *        The time when the elastic cluster was created in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withClusterCreationTime(String clusterCreationTime) {
        setClusterCreationTime(clusterCreationTime);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon DocumentDB uses the default
     * encryption key that KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *        instead of the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon
     *        DocumentDB uses the default encryption key that KMS creates for your account. Your account has a different
     *        default encryption key for each Amazon Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon DocumentDB uses the default
     * encryption key that KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     * </p>
     * 
     * @return The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating
     *         a cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *         instead of the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon
     *         DocumentDB uses the default encryption key that KMS creates for your account. Your account has a
     *         different default encryption key for each Amazon Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon DocumentDB uses the default
     * encryption key that KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *        instead of the ARN as the KMS encryption key. If an encryption key is not specified here, Amazon
     *        DocumentDB uses the default encryption key that KMS creates for your account. Your account has a different
     *        default encryption key for each Amazon Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The ARN identifier of the elastic cluster snapshot.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster snapshot.
     * </p>
     * 
     * @return The ARN identifier of the elastic cluster snapshot.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The ARN identifier of the elastic cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
        return this;
    }

    /**
     * <p>
     * The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreationTime
     *        The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     */

    public void setSnapshotCreationTime(String snapshotCreationTime) {
        this.snapshotCreationTime = snapshotCreationTime;
    }

    /**
     * <p>
     * The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     */

    public String getSnapshotCreationTime() {
        return this.snapshotCreationTime;
    }

    /**
     * <p>
     * The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreationTime
     *        The time when the elastic cluster snapshot was created in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withSnapshotCreationTime(String snapshotCreationTime) {
        setSnapshotCreationTime(snapshotCreationTime);
        return this;
    }

    /**
     * <p>
     * The name of the elastic cluster snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the elastic cluster snapshot.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the elastic cluster snapshot.
     * </p>
     * 
     * @return The name of the elastic cluster snapshot.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the elastic cluster snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the elastic cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for
     *        your Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     * @see SnapshotType
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created
     *         for your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     * @see SnapshotType
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for
     *        your Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotType
     */

    public ClusterSnapshot withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for
     *        your Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotType
     */

    public ClusterSnapshot withSnapshotType(SnapshotType snapshotType) {
        this.snapshotType = snapshotType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the elastic cluster snapshot.
     * </p>
     * 
     * @param status
     *        The status of the elastic cluster snapshot.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the elastic cluster snapshot.
     * </p>
     * 
     * @return The status of the elastic cluster snapshot.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the elastic cluster snapshot.
     * </p>
     * 
     * @param status
     *        The status of the elastic cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ClusterSnapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the elastic cluster snapshot.
     * </p>
     * 
     * @param status
     *        The status of the elastic cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ClusterSnapshot withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * 
     * @return The Amazon EC2 subnet IDs for the elastic cluster.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the elastic cluster.
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
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withSubnetIds(String... subnetIds) {
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
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with the elastic cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the elastic cluster.
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
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshot withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterCreationTime() != null)
            sb.append("ClusterCreationTime: ").append(getClusterCreationTime()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
        if (getSnapshotCreationTime() != null)
            sb.append("SnapshotCreationTime: ").append(getSnapshotCreationTime()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
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

        if (obj instanceof ClusterSnapshot == false)
            return false;
        ClusterSnapshot other = (ClusterSnapshot) obj;
        if (other.getAdminUserName() == null ^ this.getAdminUserName() == null)
            return false;
        if (other.getAdminUserName() != null && other.getAdminUserName().equals(this.getAdminUserName()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterCreationTime() == null ^ this.getClusterCreationTime() == null)
            return false;
        if (other.getClusterCreationTime() != null && other.getClusterCreationTime().equals(this.getClusterCreationTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        if (other.getSnapshotCreationTime() == null ^ this.getSnapshotCreationTime() == null)
            return false;
        if (other.getSnapshotCreationTime() != null && other.getSnapshotCreationTime().equals(this.getSnapshotCreationTime()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
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
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterCreationTime() == null) ? 0 : getClusterCreationTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreationTime() == null) ? 0 : getSnapshotCreationTime().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public ClusterSnapshot clone() {
        try {
            return (ClusterSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.docdbelastic.model.transform.ClusterSnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
