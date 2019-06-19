/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the settings for a global table in a region that will be modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaSettingsUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaSettingsUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private Long replicaProvisionedReadCapacityUnits;
    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity units.
     * </p>
     */
    private AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     */
    private java.util.List<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate;

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     * 
     * @param regionName
     *        The region of the replica to be added.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     * 
     * @return The region of the replica to be added.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The region of the replica to be added.
     * </p>
     * 
     * @param regionName
     *        The region of the replica to be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsUpdate withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *        >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setReplicaProvisionedReadCapacityUnits(Long replicaProvisionedReadCapacityUnits) {
        this.replicaProvisionedReadCapacityUnits = replicaProvisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public Long getReplicaProvisionedReadCapacityUnits() {
        return this.replicaProvisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *        >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsUpdate withReplicaProvisionedReadCapacityUnits(Long replicaProvisionedReadCapacityUnits) {
        setReplicaProvisionedReadCapacityUnits(replicaProvisionedReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity units.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityAutoScalingSettingsUpdate
     *        Autoscaling settings for managing a global table replica's read capacity units.
     */

    public void setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate) {
        this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate = replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity units.
     * </p>
     * 
     * @return Autoscaling settings for managing a global table replica's read capacity units.
     */

    public AutoScalingSettingsUpdate getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() {
        return this.replicaProvisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global table replica's read capacity units.
     * </p>
     * 
     * @param replicaProvisionedReadCapacityAutoScalingSettingsUpdate
     *        Autoscaling settings for managing a global table replica's read capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsUpdate withReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate replicaProvisionedReadCapacityAutoScalingSettingsUpdate) {
        setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(replicaProvisionedReadCapacityAutoScalingSettingsUpdate);
        return this;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * 
     * @return Represents the settings of a global secondary index for a global table that will be modified.
     */

    public java.util.List<ReplicaGlobalSecondaryIndexSettingsUpdate> getReplicaGlobalSecondaryIndexSettingsUpdate() {
        return replicaGlobalSecondaryIndexSettingsUpdate;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexSettingsUpdate
     *        Represents the settings of a global secondary index for a global table that will be modified.
     */

    public void setReplicaGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate) {
        if (replicaGlobalSecondaryIndexSettingsUpdate == null) {
            this.replicaGlobalSecondaryIndexSettingsUpdate = null;
            return;
        }

        this.replicaGlobalSecondaryIndexSettingsUpdate = new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsUpdate>(
                replicaGlobalSecondaryIndexSettingsUpdate);
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaGlobalSecondaryIndexSettingsUpdate(java.util.Collection)} or
     * {@link #withReplicaGlobalSecondaryIndexSettingsUpdate(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexSettingsUpdate
     *        Represents the settings of a global secondary index for a global table that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsUpdate withReplicaGlobalSecondaryIndexSettingsUpdate(
            ReplicaGlobalSecondaryIndexSettingsUpdate... replicaGlobalSecondaryIndexSettingsUpdate) {
        if (this.replicaGlobalSecondaryIndexSettingsUpdate == null) {
            setReplicaGlobalSecondaryIndexSettingsUpdate(new java.util.ArrayList<ReplicaGlobalSecondaryIndexSettingsUpdate>(
                    replicaGlobalSecondaryIndexSettingsUpdate.length));
        }
        for (ReplicaGlobalSecondaryIndexSettingsUpdate ele : replicaGlobalSecondaryIndexSettingsUpdate) {
            this.replicaGlobalSecondaryIndexSettingsUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * 
     * @param replicaGlobalSecondaryIndexSettingsUpdate
     *        Represents the settings of a global secondary index for a global table that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSettingsUpdate withReplicaGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<ReplicaGlobalSecondaryIndexSettingsUpdate> replicaGlobalSecondaryIndexSettingsUpdate) {
        setReplicaGlobalSecondaryIndexSettingsUpdate(replicaGlobalSecondaryIndexSettingsUpdate);
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
        if (getReplicaProvisionedReadCapacityUnits() != null)
            sb.append("ReplicaProvisionedReadCapacityUnits: ").append(getReplicaProvisionedReadCapacityUnits()).append(",");
        if (getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null)
            sb.append("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: ").append(getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate())
                    .append(",");
        if (getReplicaGlobalSecondaryIndexSettingsUpdate() != null)
            sb.append("ReplicaGlobalSecondaryIndexSettingsUpdate: ").append(getReplicaGlobalSecondaryIndexSettingsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaSettingsUpdate == false)
            return false;
        ReplicaSettingsUpdate other = (ReplicaSettingsUpdate) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() == null ^ this.getReplicaProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityUnits() != null
                && other.getReplicaProvisionedReadCapacityUnits().equals(this.getReplicaProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null
                ^ this.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() != null
                && other.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate().equals(this.getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettingsUpdate() == null ^ this.getReplicaGlobalSecondaryIndexSettingsUpdate() == null)
            return false;
        if (other.getReplicaGlobalSecondaryIndexSettingsUpdate() != null
                && other.getReplicaGlobalSecondaryIndexSettingsUpdate().equals(this.getReplicaGlobalSecondaryIndexSettingsUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getReplicaProvisionedReadCapacityUnits() == null) ? 0 : getReplicaProvisionedReadCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate() == null) ? 0 : getReplicaProvisionedReadCapacityAutoScalingSettingsUpdate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getReplicaGlobalSecondaryIndexSettingsUpdate() == null) ? 0 : getReplicaGlobalSecondaryIndexSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaSettingsUpdate clone() {
        try {
            return (ReplicaSettingsUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaSettingsUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
