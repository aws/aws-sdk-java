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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a replica of a DynamoDB table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableReplica"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableReplica implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of global secondary indexes for the replica.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableReplicaGlobalSecondaryIndex> globalSecondaryIndexes;
    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the replica.
     * </p>
     */
    private String kmsMasterKeyId;
    /**
     * <p>
     * Replica-specific configuration for the provisioned throughput.
     * </p>
     */
    private AwsDynamoDbTableProvisionedThroughputOverride provisionedThroughputOverride;
    /**
     * <p>
     * The name of the Region where the replica is located.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The current status of the replica.
     * </p>
     */
    private String replicaStatus;
    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     */
    private String replicaStatusDescription;

    /**
     * <p>
     * List of global secondary indexes for the replica.
     * </p>
     * 
     * @return List of global secondary indexes for the replica.
     */

    public java.util.List<AwsDynamoDbTableReplicaGlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * List of global secondary indexes for the replica.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        List of global secondary indexes for the replica.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<AwsDynamoDbTableReplicaGlobalSecondaryIndex> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<AwsDynamoDbTableReplicaGlobalSecondaryIndex>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * List of global secondary indexes for the replica.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        List of global secondary indexes for the replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withGlobalSecondaryIndexes(AwsDynamoDbTableReplicaGlobalSecondaryIndex... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<AwsDynamoDbTableReplicaGlobalSecondaryIndex>(globalSecondaryIndexes.length));
        }
        for (AwsDynamoDbTableReplicaGlobalSecondaryIndex ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of global secondary indexes for the replica.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        List of global secondary indexes for the replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withGlobalSecondaryIndexes(java.util.Collection<AwsDynamoDbTableReplicaGlobalSecondaryIndex> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the replica.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the
     *        replica.
     */

    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the replica.
     * </p>
     * 
     * @return The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the
     *         replica.
     */

    public String getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the replica.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the
     *        replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withKmsMasterKeyId(String kmsMasterKeyId) {
        setKmsMasterKeyId(kmsMasterKeyId);
        return this;
    }

    /**
     * <p>
     * Replica-specific configuration for the provisioned throughput.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica-specific configuration for the provisioned throughput.
     */

    public void setProvisionedThroughputOverride(AwsDynamoDbTableProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific configuration for the provisioned throughput.
     * </p>
     * 
     * @return Replica-specific configuration for the provisioned throughput.
     */

    public AwsDynamoDbTableProvisionedThroughputOverride getProvisionedThroughputOverride() {
        return this.provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific configuration for the provisioned throughput.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica-specific configuration for the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withProvisionedThroughputOverride(AwsDynamoDbTableProvisionedThroughputOverride provisionedThroughputOverride) {
        setProvisionedThroughputOverride(provisionedThroughputOverride);
        return this;
    }

    /**
     * <p>
     * The name of the Region where the replica is located.
     * </p>
     * 
     * @param regionName
     *        The name of the Region where the replica is located.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region where the replica is located.
     * </p>
     * 
     * @return The name of the Region where the replica is located.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the Region where the replica is located.
     * </p>
     * 
     * @param regionName
     *        The name of the Region where the replica is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The current status of the replica.
     * </p>
     * 
     * @param replicaStatus
     *        The current status of the replica.
     */

    public void setReplicaStatus(String replicaStatus) {
        this.replicaStatus = replicaStatus;
    }

    /**
     * <p>
     * The current status of the replica.
     * </p>
     * 
     * @return The current status of the replica.
     */

    public String getReplicaStatus() {
        return this.replicaStatus;
    }

    /**
     * <p>
     * The current status of the replica.
     * </p>
     * 
     * @param replicaStatus
     *        The current status of the replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withReplicaStatus(String replicaStatus) {
        setReplicaStatus(replicaStatus);
        return this;
    }

    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     * 
     * @param replicaStatusDescription
     *        Detailed information about the replica status.
     */

    public void setReplicaStatusDescription(String replicaStatusDescription) {
        this.replicaStatusDescription = replicaStatusDescription;
    }

    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     * 
     * @return Detailed information about the replica status.
     */

    public String getReplicaStatusDescription() {
        return this.replicaStatusDescription;
    }

    /**
     * <p>
     * Detailed information about the replica status.
     * </p>
     * 
     * @param replicaStatusDescription
     *        Detailed information about the replica status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableReplica withReplicaStatusDescription(String replicaStatusDescription) {
        setReplicaStatusDescription(replicaStatusDescription);
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
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes()).append(",");
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: ").append(getKmsMasterKeyId()).append(",");
        if (getProvisionedThroughputOverride() != null)
            sb.append("ProvisionedThroughputOverride: ").append(getProvisionedThroughputOverride()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getReplicaStatus() != null)
            sb.append("ReplicaStatus: ").append(getReplicaStatus()).append(",");
        if (getReplicaStatusDescription() != null)
            sb.append("ReplicaStatusDescription: ").append(getReplicaStatusDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableReplica == false)
            return false;
        AwsDynamoDbTableReplica other = (AwsDynamoDbTableReplica) obj;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        if (other.getProvisionedThroughputOverride() == null ^ this.getProvisionedThroughputOverride() == null)
            return false;
        if (other.getProvisionedThroughputOverride() != null
                && other.getProvisionedThroughputOverride().equals(this.getProvisionedThroughputOverride()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaStatus() == null ^ this.getReplicaStatus() == null)
            return false;
        if (other.getReplicaStatus() != null && other.getReplicaStatus().equals(this.getReplicaStatus()) == false)
            return false;
        if (other.getReplicaStatusDescription() == null ^ this.getReplicaStatusDescription() == null)
            return false;
        if (other.getReplicaStatusDescription() != null && other.getReplicaStatusDescription().equals(this.getReplicaStatusDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputOverride() == null) ? 0 : getProvisionedThroughputOverride().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getReplicaStatus() == null) ? 0 : getReplicaStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicaStatusDescription() == null) ? 0 : getReplicaStatusDescription().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableReplica clone() {
        try {
            return (AwsDynamoDbTableReplica) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableReplicaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
