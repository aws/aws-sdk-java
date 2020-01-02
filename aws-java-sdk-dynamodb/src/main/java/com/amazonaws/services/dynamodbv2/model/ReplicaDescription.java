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
 * Contains the details of the replica.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Region.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
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
     * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     * </p>
     */
    private String replicaStatusPercentProgress;
    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     * </p>
     */
    private String kMSMasterKeyId;
    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     * settings.
     * </p>
     */
    private ProvisionedThroughputOverride provisionedThroughputOverride;
    /**
     * <p>
     * Replica-specific global secondary index settings.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes;

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param regionName
     *        The name of the Region.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @return The name of the Region.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the Region.
     * </p>
     * 
     * @param regionName
     *        The name of the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaDescription withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicaStatus
     *        The current state of the replica:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The replica is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The replica is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The replica is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The replica is ready for use.
     *        </p>
     *        </li>
     * @see ReplicaStatus
     */

    public void setReplicaStatus(String replicaStatus) {
        this.replicaStatus = replicaStatus;
    }

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the replica:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The replica is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The replica is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The replica is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The replica is ready for use.
     *         </p>
     *         </li>
     * @see ReplicaStatus
     */

    public String getReplicaStatus() {
        return this.replicaStatus;
    }

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicaStatus
     *        The current state of the replica:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The replica is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The replica is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The replica is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The replica is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaStatus
     */

    public ReplicaDescription withReplicaStatus(String replicaStatus) {
        setReplicaStatus(replicaStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the replica:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The replica is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The replica is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The replica is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The replica is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicaStatus
     *        The current state of the replica:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The replica is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The replica is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The replica is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The replica is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaStatus
     */

    public ReplicaDescription withReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
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

    public ReplicaDescription withReplicaStatusDescription(String replicaStatusDescription) {
        setReplicaStatusDescription(replicaStatusDescription);
        return this;
    }

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     * </p>
     * 
     * @param replicaStatusPercentProgress
     *        Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     */

    public void setReplicaStatusPercentProgress(String replicaStatusPercentProgress) {
        this.replicaStatusPercentProgress = replicaStatusPercentProgress;
    }

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     * </p>
     * 
     * @return Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     */

    public String getReplicaStatusPercentProgress() {
        return this.replicaStatusPercentProgress;
    }

    /**
     * <p>
     * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     * </p>
     * 
     * @param replicaStatusPercentProgress
     *        Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaDescription withReplicaStatusPercentProgress(String replicaStatusPercentProgress) {
        setReplicaStatusPercentProgress(replicaStatusPercentProgress);
        return this;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     * </p>
     * 
     * @param kMSMasterKeyId
     *        The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     */

    public void setKMSMasterKeyId(String kMSMasterKeyId) {
        this.kMSMasterKeyId = kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     * </p>
     * 
     * @return The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     */

    public String getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    /**
     * <p>
     * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     * </p>
     * 
     * @param kMSMasterKeyId
     *        The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaDescription withKMSMasterKeyId(String kMSMasterKeyId) {
        setKMSMasterKeyId(kMSMasterKeyId);
        return this;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     * settings.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     *        settings.
     */

    public void setProvisionedThroughputOverride(ProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     * settings.
     * </p>
     * 
     * @return Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     *         settings.
     */

    public ProvisionedThroughputOverride getProvisionedThroughputOverride() {
        return this.provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     * settings.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaDescription withProvisionedThroughputOverride(ProvisionedThroughputOverride provisionedThroughputOverride) {
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

    public java.util.List<ReplicaGlobalSecondaryIndexDescription> getGlobalSecondaryIndexes() {
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

    public void setGlobalSecondaryIndexes(java.util.Collection<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndexDescription>(globalSecondaryIndexes);
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

    public ReplicaDescription withGlobalSecondaryIndexes(ReplicaGlobalSecondaryIndexDescription... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<ReplicaGlobalSecondaryIndexDescription>(globalSecondaryIndexes.length));
        }
        for (ReplicaGlobalSecondaryIndexDescription ele : globalSecondaryIndexes) {
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

    public ReplicaDescription withGlobalSecondaryIndexes(java.util.Collection<ReplicaGlobalSecondaryIndexDescription> globalSecondaryIndexes) {
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
        if (getReplicaStatus() != null)
            sb.append("ReplicaStatus: ").append(getReplicaStatus()).append(",");
        if (getReplicaStatusDescription() != null)
            sb.append("ReplicaStatusDescription: ").append(getReplicaStatusDescription()).append(",");
        if (getReplicaStatusPercentProgress() != null)
            sb.append("ReplicaStatusPercentProgress: ").append(getReplicaStatusPercentProgress()).append(",");
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

        if (obj instanceof ReplicaDescription == false)
            return false;
        ReplicaDescription other = (ReplicaDescription) obj;
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
        if (other.getReplicaStatusPercentProgress() == null ^ this.getReplicaStatusPercentProgress() == null)
            return false;
        if (other.getReplicaStatusPercentProgress() != null && other.getReplicaStatusPercentProgress().equals(this.getReplicaStatusPercentProgress()) == false)
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
        hashCode = prime * hashCode + ((getReplicaStatus() == null) ? 0 : getReplicaStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicaStatusDescription() == null) ? 0 : getReplicaStatusDescription().hashCode());
        hashCode = prime * hashCode + ((getReplicaStatusPercentProgress() == null) ? 0 : getReplicaStatusPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyId() == null) ? 0 : getKMSMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputOverride() == null) ? 0 : getProvisionedThroughputOverride().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaDescription clone() {
        try {
            return (ReplicaDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
