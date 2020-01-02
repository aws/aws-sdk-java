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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTableReplicaAutoScaling"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableReplicaAutoScalingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates;
    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     */
    private String tableName;

    private AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate;
    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will be modified.
     * </p>
     */
    private java.util.List<ReplicaAutoScalingUpdate> replicaUpdates;

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * </p>
     * 
     * @return Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     */

    public java.util.List<GlobalSecondaryIndexAutoScalingUpdate> getGlobalSecondaryIndexUpdates() {
        return globalSecondaryIndexUpdates;
    }

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     */

    public void setGlobalSecondaryIndexUpdates(java.util.Collection<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates) {
        if (globalSecondaryIndexUpdates == null) {
            this.globalSecondaryIndexUpdates = null;
            return;
        }

        this.globalSecondaryIndexUpdates = new java.util.ArrayList<GlobalSecondaryIndexAutoScalingUpdate>(globalSecondaryIndexUpdates);
    }

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexUpdates(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableReplicaAutoScalingRequest withGlobalSecondaryIndexUpdates(GlobalSecondaryIndexAutoScalingUpdate... globalSecondaryIndexUpdates) {
        if (this.globalSecondaryIndexUpdates == null) {
            setGlobalSecondaryIndexUpdates(new java.util.ArrayList<GlobalSecondaryIndexAutoScalingUpdate>(globalSecondaryIndexUpdates.length));
        }
        for (GlobalSecondaryIndexAutoScalingUpdate ele : globalSecondaryIndexUpdates) {
            this.globalSecondaryIndexUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * </p>
     * 
     * @param globalSecondaryIndexUpdates
     *        Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableReplicaAutoScalingRequest withGlobalSecondaryIndexUpdates(
            java.util.Collection<GlobalSecondaryIndexAutoScalingUpdate> globalSecondaryIndexUpdates) {
        setGlobalSecondaryIndexUpdates(globalSecondaryIndexUpdates);
        return this;
    }

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * 
     * @param tableName
     *        The name of the global table to be updated.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * 
     * @return The name of the global table to be updated.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the global table to be updated.
     * </p>
     * 
     * @param tableName
     *        The name of the global table to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableReplicaAutoScalingRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @param provisionedWriteCapacityAutoScalingUpdate
     */

    public void setProvisionedWriteCapacityAutoScalingUpdate(AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate) {
        this.provisionedWriteCapacityAutoScalingUpdate = provisionedWriteCapacityAutoScalingUpdate;
    }

    /**
     * @return
     */

    public AutoScalingSettingsUpdate getProvisionedWriteCapacityAutoScalingUpdate() {
        return this.provisionedWriteCapacityAutoScalingUpdate;
    }

    /**
     * @param provisionedWriteCapacityAutoScalingUpdate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableReplicaAutoScalingRequest withProvisionedWriteCapacityAutoScalingUpdate(
            AutoScalingSettingsUpdate provisionedWriteCapacityAutoScalingUpdate) {
        setProvisionedWriteCapacityAutoScalingUpdate(provisionedWriteCapacityAutoScalingUpdate);
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will be modified.
     * </p>
     * 
     * @return Represents the auto scaling settings of replicas of the table that will be modified.
     */

    public java.util.List<ReplicaAutoScalingUpdate> getReplicaUpdates() {
        return replicaUpdates;
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will be modified.
     * </p>
     * 
     * @param replicaUpdates
     *        Represents the auto scaling settings of replicas of the table that will be modified.
     */

    public void setReplicaUpdates(java.util.Collection<ReplicaAutoScalingUpdate> replicaUpdates) {
        if (replicaUpdates == null) {
            this.replicaUpdates = null;
            return;
        }

        this.replicaUpdates = new java.util.ArrayList<ReplicaAutoScalingUpdate>(replicaUpdates);
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will be modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaUpdates(java.util.Collection)} or {@link #withReplicaUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param replicaUpdates
     *        Represents the auto scaling settings of replicas of the table that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableReplicaAutoScalingRequest withReplicaUpdates(ReplicaAutoScalingUpdate... replicaUpdates) {
        if (this.replicaUpdates == null) {
            setReplicaUpdates(new java.util.ArrayList<ReplicaAutoScalingUpdate>(replicaUpdates.length));
        }
        for (ReplicaAutoScalingUpdate ele : replicaUpdates) {
            this.replicaUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the auto scaling settings of replicas of the table that will be modified.
     * </p>
     * 
     * @param replicaUpdates
     *        Represents the auto scaling settings of replicas of the table that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableReplicaAutoScalingRequest withReplicaUpdates(java.util.Collection<ReplicaAutoScalingUpdate> replicaUpdates) {
        setReplicaUpdates(replicaUpdates);
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
        if (getGlobalSecondaryIndexUpdates() != null)
            sb.append("GlobalSecondaryIndexUpdates: ").append(getGlobalSecondaryIndexUpdates()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getProvisionedWriteCapacityAutoScalingUpdate() != null)
            sb.append("ProvisionedWriteCapacityAutoScalingUpdate: ").append(getProvisionedWriteCapacityAutoScalingUpdate()).append(",");
        if (getReplicaUpdates() != null)
            sb.append("ReplicaUpdates: ").append(getReplicaUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableReplicaAutoScalingRequest == false)
            return false;
        UpdateTableReplicaAutoScalingRequest other = (UpdateTableReplicaAutoScalingRequest) obj;
        if (other.getGlobalSecondaryIndexUpdates() == null ^ this.getGlobalSecondaryIndexUpdates() == null)
            return false;
        if (other.getGlobalSecondaryIndexUpdates() != null && other.getGlobalSecondaryIndexUpdates().equals(this.getGlobalSecondaryIndexUpdates()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingUpdate() == null ^ this.getProvisionedWriteCapacityAutoScalingUpdate() == null)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingUpdate() != null
                && other.getProvisionedWriteCapacityAutoScalingUpdate().equals(this.getProvisionedWriteCapacityAutoScalingUpdate()) == false)
            return false;
        if (other.getReplicaUpdates() == null ^ this.getReplicaUpdates() == null)
            return false;
        if (other.getReplicaUpdates() != null && other.getReplicaUpdates().equals(this.getReplicaUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalSecondaryIndexUpdates() == null) ? 0 : getGlobalSecondaryIndexUpdates().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedWriteCapacityAutoScalingUpdate() == null) ? 0 : getProvisionedWriteCapacityAutoScalingUpdate().hashCode());
        hashCode = prime * hashCode + ((getReplicaUpdates() == null) ? 0 : getReplicaUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableReplicaAutoScalingRequest clone() {
        return (UpdateTableReplicaAutoScalingRequest) super.clone();
    }

}
