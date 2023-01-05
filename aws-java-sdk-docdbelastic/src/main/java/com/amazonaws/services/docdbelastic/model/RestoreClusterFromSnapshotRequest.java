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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/RestoreClusterFromSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreClusterFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS creates
     * for your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * The Amazon EC2 subnet IDs for the Elastic DocumentDB cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value pairs in
     * which the key is the tag name and the value is the key value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

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

    public RestoreClusterFromSnapshotRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS creates
     * for your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *        instead of the ARN as the KMS encryption key.
     *        </p>
     *        <p>
     *        If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS
     *        creates for your account. Your account has a different default encryption key for each Amazon Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS creates
     * for your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     * 
     * @return The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating
     *         a cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *         instead of the ARN as the KMS encryption key.
     *         </p>
     *         <p>
     *         If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS
     *         creates for your account. Your account has a different default encryption key for each Amazon Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     * cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias instead of
     * the ARN as the KMS encryption key.
     * </p>
     * <p>
     * If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS creates
     * for your account. Your account has a different default encryption key for each Amazon Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use to encrypt the new Elastic DocumentDB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        cluster using the same Amazon account that owns this KMS encryption key, you can use the KMS key alias
     *        instead of the ARN as the KMS encryption key.
     *        </p>
     *        <p>
     *        If an encryption key is not specified here, Elastic DocumentDB uses the default encryption key that KMS
     *        creates for your account. Your account has a different default encryption key for each Amazon Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The arn of the Elastic DocumentDB snapshot.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot.
     * </p>
     * 
     * @return The arn of the Elastic DocumentDB snapshot.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The arn of the Elastic DocumentDB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
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

    public RestoreClusterFromSnapshotRequest withSubnetIds(String... subnetIds) {
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

    public RestoreClusterFromSnapshotRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value pairs in
     * which the key is the tag name and the value is the key value.
     * </p>
     * 
     * @return A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value
     *         pairs in which the key is the tag name and the value is the key value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value pairs in
     * which the key is the tag name and the value is the key value.
     * </p>
     * 
     * @param tags
     *        A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value
     *        pairs in which the key is the tag name and the value is the key value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value pairs in
     * which the key is the tag name and the value is the key value.
     * </p>
     * 
     * @param tags
     *        A list of the tag names to be assigned to the restored DB cluster, in the form of an array of key-value
     *        pairs in which the key is the tag name and the value is the key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RestoreClusterFromSnapshotRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
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
     * A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreClusterFromSnapshotRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof RestoreClusterFromSnapshotRequest == false)
            return false;
        RestoreClusterFromSnapshotRequest other = (RestoreClusterFromSnapshotRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public RestoreClusterFromSnapshotRequest clone() {
        return (RestoreClusterFromSnapshotRequest) super.clone();
    }

}
