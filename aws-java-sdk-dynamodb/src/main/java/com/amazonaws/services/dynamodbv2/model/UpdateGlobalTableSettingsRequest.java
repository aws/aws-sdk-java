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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTableSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalTableSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the global table
     * </p>
     */
    private String globalTableName;
    /**
     * <p>
     * The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global table
     * defaults to <code>PROVISIONED</code> capacity billing mode.
     * </p>
     */
    private String globalTableBillingMode;
    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code>
     * </p>
     */
    private Long globalTableProvisionedWriteCapacityUnits;
    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the global table.
     * </p>
     */
    private AutoScalingSettingsUpdate globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;
    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     */
    private java.util.List<GlobalTableGlobalSecondaryIndexSettingsUpdate> globalTableGlobalSecondaryIndexSettingsUpdate;
    /**
     * <p>
     * Represents the settings for a global table in a region that will be modified.
     * </p>
     */
    private java.util.List<ReplicaSettingsUpdate> replicaSettingsUpdate;

    /**
     * <p>
     * The name of the global table
     * </p>
     * 
     * @param globalTableName
     *        The name of the global table
     */

    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The name of the global table
     * </p>
     * 
     * @return The name of the global table
     */

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    /**
     * <p>
     * The name of the global table
     * </p>
     * 
     * @param globalTableName
     *        The name of the global table
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableName(String globalTableName) {
        setGlobalTableName(globalTableName);
        return this;
    }

    /**
     * <p>
     * The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global table
     * defaults to <code>PROVISIONED</code> capacity billing mode.
     * </p>
     * 
     * @param globalTableBillingMode
     *        The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global
     *        table defaults to <code>PROVISIONED</code> capacity billing mode.
     * @see BillingMode
     */

    public void setGlobalTableBillingMode(String globalTableBillingMode) {
        this.globalTableBillingMode = globalTableBillingMode;
    }

    /**
     * <p>
     * The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global table
     * defaults to <code>PROVISIONED</code> capacity billing mode.
     * </p>
     * 
     * @return The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global
     *         table defaults to <code>PROVISIONED</code> capacity billing mode.
     * @see BillingMode
     */

    public String getGlobalTableBillingMode() {
        return this.globalTableBillingMode;
    }

    /**
     * <p>
     * The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global table
     * defaults to <code>PROVISIONED</code> capacity billing mode.
     * </p>
     * 
     * @param globalTableBillingMode
     *        The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global
     *        table defaults to <code>PROVISIONED</code> capacity billing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableBillingMode(String globalTableBillingMode) {
        setGlobalTableBillingMode(globalTableBillingMode);
        return this;
    }

    /**
     * <p>
     * The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global table
     * defaults to <code>PROVISIONED</code> capacity billing mode.
     * </p>
     * 
     * @param globalTableBillingMode
     *        The billing mode of the global table. If <code>GlobalTableBillingMode</code> is not specified, the global
     *        table defaults to <code>PROVISIONED</code> capacity billing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableBillingMode(BillingMode globalTableBillingMode) {
        this.globalTableBillingMode = globalTableBillingMode.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code>
     * </p>
     * 
     * @param globalTableProvisionedWriteCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException.</code>
     */

    public void setGlobalTableProvisionedWriteCapacityUnits(Long globalTableProvisionedWriteCapacityUnits) {
        this.globalTableProvisionedWriteCapacityUnits = globalTableProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code>
     * </p>
     * 
     * @return The maximum number of writes consumed per second before DynamoDB returns a
     *         <code>ThrottlingException.</code>
     */

    public Long getGlobalTableProvisionedWriteCapacityUnits() {
        return this.globalTableProvisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code>
     * </p>
     * 
     * @param globalTableProvisionedWriteCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableProvisionedWriteCapacityUnits(Long globalTableProvisionedWriteCapacityUnits) {
        setGlobalTableProvisionedWriteCapacityUnits(globalTableProvisionedWriteCapacityUnits);
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the global table.
     * </p>
     * 
     * @param globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
     *        AutoScaling settings for managing provisioned write capacity for the global table.
     */

    public void setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate) {
        this.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate = globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the global table.
     * </p>
     * 
     * @return AutoScaling settings for managing provisioned write capacity for the global table.
     */

    public AutoScalingSettingsUpdate getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() {
        return this.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * AutoScaling settings for managing provisioned write capacity for the global table.
     * </p>
     * 
     * @param globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate
     *        AutoScaling settings for managing provisioned write capacity for the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate) {
        setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate);
        return this;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * 
     * @return Represents the settings of a global secondary index for a global table that will be modified.
     */

    public java.util.List<GlobalTableGlobalSecondaryIndexSettingsUpdate> getGlobalTableGlobalSecondaryIndexSettingsUpdate() {
        return globalTableGlobalSecondaryIndexSettingsUpdate;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * 
     * @param globalTableGlobalSecondaryIndexSettingsUpdate
     *        Represents the settings of a global secondary index for a global table that will be modified.
     */

    public void setGlobalTableGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate> globalTableGlobalSecondaryIndexSettingsUpdate) {
        if (globalTableGlobalSecondaryIndexSettingsUpdate == null) {
            this.globalTableGlobalSecondaryIndexSettingsUpdate = null;
            return;
        }

        this.globalTableGlobalSecondaryIndexSettingsUpdate = new java.util.ArrayList<GlobalTableGlobalSecondaryIndexSettingsUpdate>(
                globalTableGlobalSecondaryIndexSettingsUpdate);
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalTableGlobalSecondaryIndexSettingsUpdate(java.util.Collection)} or
     * {@link #withGlobalTableGlobalSecondaryIndexSettingsUpdate(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param globalTableGlobalSecondaryIndexSettingsUpdate
     *        Represents the settings of a global secondary index for a global table that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableGlobalSecondaryIndexSettingsUpdate(
            GlobalTableGlobalSecondaryIndexSettingsUpdate... globalTableGlobalSecondaryIndexSettingsUpdate) {
        if (this.globalTableGlobalSecondaryIndexSettingsUpdate == null) {
            setGlobalTableGlobalSecondaryIndexSettingsUpdate(new java.util.ArrayList<GlobalTableGlobalSecondaryIndexSettingsUpdate>(
                    globalTableGlobalSecondaryIndexSettingsUpdate.length));
        }
        for (GlobalTableGlobalSecondaryIndexSettingsUpdate ele : globalTableGlobalSecondaryIndexSettingsUpdate) {
            this.globalTableGlobalSecondaryIndexSettingsUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the settings of a global secondary index for a global table that will be modified.
     * </p>
     * 
     * @param globalTableGlobalSecondaryIndexSettingsUpdate
     *        Represents the settings of a global secondary index for a global table that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withGlobalTableGlobalSecondaryIndexSettingsUpdate(
            java.util.Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate> globalTableGlobalSecondaryIndexSettingsUpdate) {
        setGlobalTableGlobalSecondaryIndexSettingsUpdate(globalTableGlobalSecondaryIndexSettingsUpdate);
        return this;
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be modified.
     * </p>
     * 
     * @return Represents the settings for a global table in a region that will be modified.
     */

    public java.util.List<ReplicaSettingsUpdate> getReplicaSettingsUpdate() {
        return replicaSettingsUpdate;
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be modified.
     * </p>
     * 
     * @param replicaSettingsUpdate
     *        Represents the settings for a global table in a region that will be modified.
     */

    public void setReplicaSettingsUpdate(java.util.Collection<ReplicaSettingsUpdate> replicaSettingsUpdate) {
        if (replicaSettingsUpdate == null) {
            this.replicaSettingsUpdate = null;
            return;
        }

        this.replicaSettingsUpdate = new java.util.ArrayList<ReplicaSettingsUpdate>(replicaSettingsUpdate);
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicaSettingsUpdate(java.util.Collection)} or
     * {@link #withReplicaSettingsUpdate(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicaSettingsUpdate
     *        Represents the settings for a global table in a region that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withReplicaSettingsUpdate(ReplicaSettingsUpdate... replicaSettingsUpdate) {
        if (this.replicaSettingsUpdate == null) {
            setReplicaSettingsUpdate(new java.util.ArrayList<ReplicaSettingsUpdate>(replicaSettingsUpdate.length));
        }
        for (ReplicaSettingsUpdate ele : replicaSettingsUpdate) {
            this.replicaSettingsUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the settings for a global table in a region that will be modified.
     * </p>
     * 
     * @param replicaSettingsUpdate
     *        Represents the settings for a global table in a region that will be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableSettingsRequest withReplicaSettingsUpdate(java.util.Collection<ReplicaSettingsUpdate> replicaSettingsUpdate) {
        setReplicaSettingsUpdate(replicaSettingsUpdate);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: ").append(getGlobalTableName()).append(",");
        if (getGlobalTableBillingMode() != null)
            sb.append("GlobalTableBillingMode: ").append(getGlobalTableBillingMode()).append(",");
        if (getGlobalTableProvisionedWriteCapacityUnits() != null)
            sb.append("GlobalTableProvisionedWriteCapacityUnits: ").append(getGlobalTableProvisionedWriteCapacityUnits()).append(",");
        if (getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() != null)
            sb.append("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: ")
                    .append(getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate()).append(",");
        if (getGlobalTableGlobalSecondaryIndexSettingsUpdate() != null)
            sb.append("GlobalTableGlobalSecondaryIndexSettingsUpdate: ").append(getGlobalTableGlobalSecondaryIndexSettingsUpdate()).append(",");
        if (getReplicaSettingsUpdate() != null)
            sb.append("ReplicaSettingsUpdate: ").append(getReplicaSettingsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableSettingsRequest == false)
            return false;
        UpdateGlobalTableSettingsRequest other = (UpdateGlobalTableSettingsRequest) obj;
        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getGlobalTableBillingMode() == null ^ this.getGlobalTableBillingMode() == null)
            return false;
        if (other.getGlobalTableBillingMode() != null && other.getGlobalTableBillingMode().equals(this.getGlobalTableBillingMode()) == false)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityUnits() == null ^ this.getGlobalTableProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityUnits() != null
                && other.getGlobalTableProvisionedWriteCapacityUnits().equals(this.getGlobalTableProvisionedWriteCapacityUnits()) == false)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() == null
                ^ this.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() != null
                && other.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate().equals(
                        this.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        if (other.getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null ^ this.getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null)
            return false;
        if (other.getGlobalTableGlobalSecondaryIndexSettingsUpdate() != null
                && other.getGlobalTableGlobalSecondaryIndexSettingsUpdate().equals(this.getGlobalTableGlobalSecondaryIndexSettingsUpdate()) == false)
            return false;
        if (other.getReplicaSettingsUpdate() == null ^ this.getReplicaSettingsUpdate() == null)
            return false;
        if (other.getReplicaSettingsUpdate() != null && other.getReplicaSettingsUpdate().equals(this.getReplicaSettingsUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime * hashCode + ((getGlobalTableBillingMode() == null) ? 0 : getGlobalTableBillingMode().hashCode());
        hashCode = prime * hashCode + ((getGlobalTableProvisionedWriteCapacityUnits() == null) ? 0 : getGlobalTableProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate() == null) ? 0
                        : getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalTableGlobalSecondaryIndexSettingsUpdate() == null) ? 0 : getGlobalTableGlobalSecondaryIndexSettingsUpdate().hashCode());
        hashCode = prime * hashCode + ((getReplicaSettingsUpdate() == null) ? 0 : getReplicaSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalTableSettingsRequest clone() {
        return (UpdateGlobalTableSettingsRequest) super.clone();
    }

}
