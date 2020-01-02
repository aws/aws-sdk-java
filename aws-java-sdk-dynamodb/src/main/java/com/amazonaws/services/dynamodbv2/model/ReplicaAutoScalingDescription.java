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
 * Represents the auto scaling settings of the replica.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaAutoScalingDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaAutoScalingDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes;

    private AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings;

    private AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings;
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

    public ReplicaAutoScalingDescription withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     * 
     * @return Replica-specific global secondary index auto scaling settings.
     */

    public java.util.List<ReplicaGlobalSecondaryIndexAutoScalingDescription> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Replica-specific global secondary index auto scaling settings.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingDescription>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Replica-specific global secondary index auto scaling settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingDescription withGlobalSecondaryIndexes(ReplicaGlobalSecondaryIndexAutoScalingDescription... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingDescription>(globalSecondaryIndexes.length));
        }
        for (ReplicaGlobalSecondaryIndexAutoScalingDescription ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Replica-specific global secondary index auto scaling settings.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        Replica-specific global secondary index auto scaling settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingDescription withGlobalSecondaryIndexes(
            java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingDescription> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * @param replicaProvisionedReadCapacityAutoScalingSettings
     */

    public void setReplicaProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        this.replicaProvisionedReadCapacityAutoScalingSettings = replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * @return
     */

    public AutoScalingSettingsDescription getReplicaProvisionedReadCapacityAutoScalingSettings() {
        return this.replicaProvisionedReadCapacityAutoScalingSettings;
    }

    /**
     * @param replicaProvisionedReadCapacityAutoScalingSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingDescription withReplicaProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedReadCapacityAutoScalingSettings) {
        setReplicaProvisionedReadCapacityAutoScalingSettings(replicaProvisionedReadCapacityAutoScalingSettings);
        return this;
    }

    /**
     * @param replicaProvisionedWriteCapacityAutoScalingSettings
     */

    public void setReplicaProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        this.replicaProvisionedWriteCapacityAutoScalingSettings = replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * @return
     */

    public AutoScalingSettingsDescription getReplicaProvisionedWriteCapacityAutoScalingSettings() {
        return this.replicaProvisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * @param replicaProvisionedWriteCapacityAutoScalingSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingDescription withReplicaProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription replicaProvisionedWriteCapacityAutoScalingSettings) {
        setReplicaProvisionedWriteCapacityAutoScalingSettings(replicaProvisionedWriteCapacityAutoScalingSettings);
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

    public ReplicaAutoScalingDescription withReplicaStatus(String replicaStatus) {
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

    public ReplicaAutoScalingDescription withReplicaStatus(ReplicaStatus replicaStatus) {
        this.replicaStatus = replicaStatus.toString();
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
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes()).append(",");
        if (getReplicaProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingSettings: ").append(getReplicaProvisionedReadCapacityAutoScalingSettings()).append(",");
        if (getReplicaProvisionedWriteCapacityAutoScalingSettings() != null)
            sb.append("ReplicaProvisionedWriteCapacityAutoScalingSettings: ").append(getReplicaProvisionedWriteCapacityAutoScalingSettings()).append(",");
        if (getReplicaStatus() != null)
            sb.append("ReplicaStatus: ").append(getReplicaStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaAutoScalingDescription == false)
            return false;
        ReplicaAutoScalingDescription other = (ReplicaAutoScalingDescription) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() == null ^ this.getReplicaProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingSettings().equals(this.getReplicaProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null ^ this.getReplicaProvisionedWriteCapacityAutoScalingSettings() == null)
            return false;
        if (other.getReplicaProvisionedWriteCapacityAutoScalingSettings() != null
                && other.getReplicaProvisionedWriteCapacityAutoScalingSettings().equals(this.getReplicaProvisionedWriteCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getReplicaStatus() == null ^ this.getReplicaStatus() == null)
            return false;
        if (other.getReplicaStatus() != null && other.getReplicaStatus().equals(this.getReplicaStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingSettings() == null) ? 0 : getReplicaProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaProvisionedWriteCapacityAutoScalingSettings() == null) ? 0 : getReplicaProvisionedWriteCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode + ((getReplicaStatus() == null) ? 0 : getReplicaStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaAutoScalingDescription clone() {
        try {
            return (ReplicaAutoScalingDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaAutoScalingDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
