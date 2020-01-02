/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a replica to be modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateReplicationGroupMemberAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationGroupMemberAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To specify a
     * CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this
     * parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
     * </p>
     */
    private String kMSMasterKeyId;
    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     * settings.
     * </p>
     */
    private ProvisionedThroughputOverride provisionedThroughputOverride;
    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes;

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     * 
     * @param regionName
     *        The Region where the replica exists.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     * 
     * @return The Region where the replica exists.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     * 
     * @param regionName
     *        The Region where the replica exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationGroupMemberAction withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To specify a
     * CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this
     * parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
     * </p>
     * 
     * @param kMSMasterKeyId
     *        The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To
     *        specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should
     *        only provide this parameter if the key is different from the default DynamoDB KMS master key
     *        alias/aws/dynamodb.
     */

    public void setKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To specify a
     * CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this
     * parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
     * </p>
     * 
     * @return The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To
     *         specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should
     *         only provide this parameter if the key is different from the default DynamoDB KMS master key
     *         alias/aws/dynamodb.
     */

    public String getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To specify a
     * CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this
     * parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
     * </p>
     * 
     * @param kMSMasterKeyId
     *        The AWS KMS customer master key (CMK) of the replica that should be used for AWS KMS encryption. To
     *        specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should
     *        only provide this parameter if the key is different from the default DynamoDB KMS master key
     *        alias/aws/dynamodb.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationGroupMemberAction withKMSMasterKeyId(String kMSMasterKeyId) {
        setKMSMasterKeyId(kMSMasterKeyId);
        return this;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     * settings.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     *        settings.
     */

    public void setProvisionedThroughputOverride(ProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     * settings.
     * </p>
     * 
     * @return Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     *         settings.
     */

    public ProvisionedThroughputOverride getProvisionedThroughputOverride() {
        return this.provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     * settings.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationGroupMemberAction withProvisionedThroughputOverride(ProvisionedThroughputOverride provisionedThroughputOverride) {
        setProvisionedThroughputOverride(provisionedThroughputOverride);
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     * 
     * @return Replica-specific global secondary index settings.
     */

    public java.util.List<ReplicaGlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Replica-specific global secondary index settings.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndex>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Replica-specific global secondary index settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationGroupMemberAction withGlobalSecondaryIndexes(ReplicaGlobalSecondaryIndex... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<ReplicaGlobalSecondaryIndex>(globalSecondaryIndexes.length));
        }
        for (ReplicaGlobalSecondaryIndex ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Replica-specific global secondary index settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationGroupMemberAction withGlobalSecondaryIndexes(java.util.Collection<ReplicaGlobalSecondaryIndex> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
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
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getKMSMasterKeyId() != null)
            sb.append("KMSMasterKeyId: ").append(getKMSMasterKeyId()).append(",");
        if (getProvisionedThroughputOverride() != null)
            sb.append("ProvisionedThroughputOverride: ").append(getProvisionedThroughputOverride()).append(",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReplicationGroupMemberAction == false)
            return false;
        UpdateReplicationGroupMemberAction other = (UpdateReplicationGroupMemberAction) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getKMSMasterKeyId() == null ^ this.getKMSMasterKeyId() == null)
            return false;
        if (other.getKMSMasterKeyId() != null && other.getKMSMasterKeyId().equals(this.getKMSMasterKeyId()) == false)
            return false;
        if (other.getProvisionedThroughputOverride() == null ^ this.getProvisionedThroughputOverride() == null)
            return false;
        if (other.getProvisionedThroughputOverride() != null
                && other.getProvisionedThroughputOverride().equals(this.getProvisionedThroughputOverride()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyId() == null) ? 0 : getKMSMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputOverride() == null) ? 0 : getProvisionedThroughputOverride().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationGroupMemberAction clone() {
        try {
            return (UpdateReplicationGroupMemberAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.UpdateReplicationGroupMemberActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
