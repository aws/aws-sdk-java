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
 * Represents the auto scaling settings of a replica that will be modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaAutoScalingUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaAutoScalingUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region where the replica exists.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that will be modified.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates;

    private AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate;

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

    public ReplicaAutoScalingUpdate withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that will be modified.
     * </p>
     * 
     * @return Represents the auto scaling settings of global secondary indexes that will be modified.
     */

    public java.util.List<ReplicaGlobalSecondaryIndexAutoScalingUpdate> getReplicaGlobalSecondaryIndexUpdates() {
        return replicaGlobalSecondaryIndexUpdates;
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that will be modified.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexUpdates
     *        Represents the auto scaling settings of global secondary indexes that will be modified.
     */

    public void setReplicaGlobalSecondaryIndexUpdates(java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates) {
        if (replicaGlobalSecondaryIndexUpdates == null) {
            this.replicaGlobalSecondaryIndexUpdates = null;
            return;
        }

        this.replicaGlobalSecondaryIndexUpdates = new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingUpdate>(replicaGlobalSecondaryIndexUpdates);
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that will be modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaGlobalSecondaryIndexUpdates(java.util.Collection)} or
     * {@link #withReplicaGlobalSecondaryIndexUpdates(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexUpdates
     *        Represents the auto scaling settings of global secondary indexes that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingUpdate withReplicaGlobalSecondaryIndexUpdates(ReplicaGlobalSecondaryIndexAutoScalingUpdate... replicaGlobalSecondaryIndexUpdates) {
        if (this.replicaGlobalSecondaryIndexUpdates == null) {
            setReplicaGlobalSecondaryIndexUpdates(new java.util.ArrayList<ReplicaGlobalSecondaryIndexAutoScalingUpdate>(
                    replicaGlobalSecondaryIndexUpdates.length));
        }
        for (ReplicaGlobalSecondaryIndexAutoScalingUpdate ele : replicaGlobalSecondaryIndexUpdates) {
            this.replicaGlobalSecondaryIndexUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of global secondary indexes that will be modified.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexUpdates
     *        Represents the auto scaling settings of global secondary indexes that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingUpdate withReplicaGlobalSecondaryIndexUpdates(
            java.util.Collection<ReplicaGlobalSecondaryIndexAutoScalingUpdate> replicaGlobalSecondaryIndexUpdates) {
        setReplicaGlobalSecondaryIndexUpdates(replicaGlobalSecondaryIndexUpdates);
        return this;
    }

    /**
     * @param replicaProvisionedReadCapacityAutoScalingUpdate
     */

    public void setReplicaProvisionedReadCapacityAutoScalingUpdate(AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingUpdate = replicaProvisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * @return
     */

    public AutoScalingSettingsUpdate getReplicaProvisionedReadCapacityAutoScalingUpdate() {
        return this.replicaProvisionedReadCapacityAutoScalingUpdate;
    }

    /**
     * @param replicaProvisionedReadCapacityAutoScalingUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingUpdate withReplicaProvisionedReadCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingUpdate) {
        setReplicaProvisionedReadCapacityAutoScalingUpdate(replicaProvisionedReadCapacityAutoScalingUpdate);
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
        if (getReplicaGlobalSecondaryIndexUpdates() != null)
            sb.append("ReplicaGlobalSecondaryIndexUpdates: ").append(getReplicaGlobalSecondaryIndexUpdates()).append(",");
        if (getReplicaProvisionedReadCapacityAutoScalingUpdate() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingUpdate: ").append(getReplicaProvisionedReadCapacityAutoScalingUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaAutoScalingUpdate == false)
            return false;
        ReplicaAutoScalingUpdate other = (ReplicaAutoScalingUpdate) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaGlobalSecondaryIndexUpdates() == null ^ this.getReplicaGlobalSecondaryIndexUpdates() == null)
            return false;
        if (other.getReplicaGlobalSecondaryIndexUpdates() != null
                && other.getReplicaGlobalSecondaryIndexUpdates().equals(this.getReplicaGlobalSecondaryIndexUpdates()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingUpdate() == null ^ this.getReplicaProvisionedReadCapacityAutoScalingUpdate() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingUpdate() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingUpdate().equals(this.getReplicaProvisionedReadCapacityAutoScalingUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getReplicaGlobalSecondaryIndexUpdates() == null) ? 0 : getReplicaGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingUpdate() == null) ? 0 : getReplicaProvisionedReadCapacityAutoScalingUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaAutoScalingUpdate clone() {
        try {
            return (ReplicaAutoScalingUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaAutoScalingUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
