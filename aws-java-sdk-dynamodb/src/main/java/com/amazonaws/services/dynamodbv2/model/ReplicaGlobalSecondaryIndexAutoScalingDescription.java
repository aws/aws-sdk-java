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
 * Represents the auto scaling configuration for a replica global secondary index.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaGlobalSecondaryIndexAutoScalingDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaGlobalSecondaryIndexAutoScalingDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The current state of the replica global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String indexStatus;

    private AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings;

    private AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings;

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @return The name of the global secondary index.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexAutoScalingDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The current state of the replica global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the replica global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The index is ready for use.
     *        </p>
     *        </li>
     * @see IndexStatus
     */

    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The current state of the replica global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the replica global secondary index:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The index is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The index is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The index is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The index is ready for use.
     *         </p>
     *         </li>
     * @see IndexStatus
     */

    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * <p>
     * The current state of the replica global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the replica global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public ReplicaGlobalSecondaryIndexAutoScalingDescription withIndexStatus(String indexStatus) {
        setIndexStatus(indexStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the replica global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current state of the replica global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public ReplicaGlobalSecondaryIndexAutoScalingDescription withIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
        return this;
    }

    /**
     * @param provisionedReadCapacityAutoScalingSettings
     */

    public void setProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings) {
        this.provisionedReadCapacityAutoScalingSettings = provisionedReadCapacityAutoScalingSettings;
    }

    /**
     * @return
     */

    public AutoScalingSettingsDescription getProvisionedReadCapacityAutoScalingSettings() {
        return this.provisionedReadCapacityAutoScalingSettings;
    }

    /**
     * @param provisionedReadCapacityAutoScalingSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexAutoScalingDescription withProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings) {
        setProvisionedReadCapacityAutoScalingSettings(provisionedReadCapacityAutoScalingSettings);
        return this;
    }

    /**
     * @param provisionedWriteCapacityAutoScalingSettings
     */

    public void setProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings) {
        this.provisionedWriteCapacityAutoScalingSettings = provisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * @return
     */

    public AutoScalingSettingsDescription getProvisionedWriteCapacityAutoScalingSettings() {
        return this.provisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * @param provisionedWriteCapacityAutoScalingSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexAutoScalingDescription withProvisionedWriteCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings) {
        setProvisionedWriteCapacityAutoScalingSettings(provisionedWriteCapacityAutoScalingSettings);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getIndexStatus() != null)
            sb.append("IndexStatus: ").append(getIndexStatus()).append(",");
        if (getProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ProvisionedReadCapacityAutoScalingSettings: ").append(getProvisionedReadCapacityAutoScalingSettings()).append(",");
        if (getProvisionedWriteCapacityAutoScalingSettings() != null)
            sb.append("ProvisionedWriteCapacityAutoScalingSettings: ").append(getProvisionedWriteCapacityAutoScalingSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndexAutoScalingDescription == false)
            return false;
        ReplicaGlobalSecondaryIndexAutoScalingDescription other = (ReplicaGlobalSecondaryIndexAutoScalingDescription) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettings() == null ^ this.getProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettings() != null
                && other.getProvisionedReadCapacityAutoScalingSettings().equals(this.getProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingSettings() == null ^ this.getProvisionedWriteCapacityAutoScalingSettings() == null)
            return false;
        if (other.getProvisionedWriteCapacityAutoScalingSettings() != null
                && other.getProvisionedWriteCapacityAutoScalingSettings().equals(this.getProvisionedWriteCapacityAutoScalingSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedReadCapacityAutoScalingSettings() == null) ? 0 : getProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedWriteCapacityAutoScalingSettings() == null) ? 0 : getProvisionedWriteCapacityAutoScalingSettings().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaGlobalSecondaryIndexAutoScalingDescription clone() {
        try {
            return (ReplicaGlobalSecondaryIndexAutoScalingDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaGlobalSecondaryIndexAutoScalingDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
