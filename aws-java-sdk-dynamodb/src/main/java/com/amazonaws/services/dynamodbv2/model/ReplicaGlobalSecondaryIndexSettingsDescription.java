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
 * Represents the properties of a global secondary index.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaGlobalSecondaryIndexSettingsDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaGlobalSecondaryIndexSettingsDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all other indexes on this table.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String indexStatus;
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     */
    private Long provisionedReadCapacityUnits;
    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings;
    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     */
    private Long provisionedWriteCapacityUnits;
    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write capacity units.
     * </p>
     */
    private AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings;

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all other indexes on this table.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index. The name must be unique among all other indexes on this table.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all other indexes on this table.
     * </p>
     * 
     * @return The name of the global secondary index. The name must be unique among all other indexes on this table.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all other indexes on this table.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index. The name must be unique among all other indexes on this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current status of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The global secondary index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The global secondary index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The global secondary index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The global secondary index is ready for use.
     *        </p>
     *        </li>
     * @see IndexStatus
     */

    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the global secondary index:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The global secondary index is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The global secondary index is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The global secondary index is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The global secondary index is ready for use.
     *         </p>
     *         </li>
     * @see IndexStatus
     */

    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current status of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The global secondary index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The global secondary index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The global secondary index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The global secondary index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexStatus(String indexStatus) {
        setIndexStatus(indexStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global secondary index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global secondary index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global secondary index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global secondary index is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexStatus
     *        The current status of the global secondary index:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The global secondary index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The global secondary index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The global secondary index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The global secondary index is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     * 
     * @param provisionedReadCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     */

    public void setProvisionedReadCapacityUnits(Long provisionedReadCapacityUnits) {
        this.provisionedReadCapacityUnits = provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     * 
     * @return The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>.
     */

    public Long getProvisionedReadCapacityUnits() {
        return this.provisionedReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     * 
     * @param provisionedReadCapacityUnits
     *        The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedReadCapacityUnits(Long provisionedReadCapacityUnits) {
        setProvisionedReadCapacityUnits(provisionedReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity units.
     * </p>
     * 
     * @param provisionedReadCapacityAutoScalingSettings
     *        Autoscaling settings for a global secondary index replica's read capacity units.
     */

    public void setProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings) {
        this.provisionedReadCapacityAutoScalingSettings = provisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity units.
     * </p>
     * 
     * @return Autoscaling settings for a global secondary index replica's read capacity units.
     */

    public AutoScalingSettingsDescription getProvisionedReadCapacityAutoScalingSettings() {
        return this.provisionedReadCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * Autoscaling settings for a global secondary index replica's read capacity units.
     * </p>
     * 
     * @param provisionedReadCapacityAutoScalingSettings
     *        Autoscaling settings for a global secondary index replica's read capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedReadCapacityAutoScalingSettings(
            AutoScalingSettingsDescription provisionedReadCapacityAutoScalingSettings) {
        setProvisionedReadCapacityAutoScalingSettings(provisionedReadCapacityAutoScalingSettings);
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * 
     * @param provisionedWriteCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     */

    public void setProvisionedWriteCapacityUnits(Long provisionedWriteCapacityUnits) {
        this.provisionedWriteCapacityUnits = provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * 
     * @return The maximum number of writes consumed per second before DynamoDB returns a
     *         <code>ThrottlingException</code>.
     */

    public Long getProvisionedWriteCapacityUnits() {
        return this.provisionedWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.
     * </p>
     * 
     * @param provisionedWriteCapacityUnits
     *        The maximum number of writes consumed per second before DynamoDB returns a
     *        <code>ThrottlingException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedWriteCapacityUnits(Long provisionedWriteCapacityUnits) {
        setProvisionedWriteCapacityUnits(provisionedWriteCapacityUnits);
        return this;
    }

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write capacity units.
     * </p>
     * 
     * @param provisionedWriteCapacityAutoScalingSettings
     *        AutoScaling settings for a global secondary index replica's write capacity units.
     */

    public void setProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescription provisionedWriteCapacityAutoScalingSettings) {
        this.provisionedWriteCapacityAutoScalingSettings = provisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write capacity units.
     * </p>
     * 
     * @return AutoScaling settings for a global secondary index replica's write capacity units.
     */

    public AutoScalingSettingsDescription getProvisionedWriteCapacityAutoScalingSettings() {
        return this.provisionedWriteCapacityAutoScalingSettings;
    }

    /**
     * <p>
     * AutoScaling settings for a global secondary index replica's write capacity units.
     * </p>
     * 
     * @param provisionedWriteCapacityAutoScalingSettings
     *        AutoScaling settings for a global secondary index replica's write capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexSettingsDescription withProvisionedWriteCapacityAutoScalingSettings(
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
        if (getProvisionedReadCapacityUnits() != null)
            sb.append("ProvisionedReadCapacityUnits: ").append(getProvisionedReadCapacityUnits()).append(",");
        if (getProvisionedReadCapacityAutoScalingSettings() != null)
            sb.append("ProvisionedReadCapacityAutoScalingSettings: ").append(getProvisionedReadCapacityAutoScalingSettings()).append(",");
        if (getProvisionedWriteCapacityUnits() != null)
            sb.append("ProvisionedWriteCapacityUnits: ").append(getProvisionedWriteCapacityUnits()).append(",");
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

        if (obj instanceof ReplicaGlobalSecondaryIndexSettingsDescription == false)
            return false;
        ReplicaGlobalSecondaryIndexSettingsDescription other = (ReplicaGlobalSecondaryIndexSettingsDescription) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getProvisionedReadCapacityUnits() == null ^ this.getProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getProvisionedReadCapacityUnits() != null && other.getProvisionedReadCapacityUnits().equals(this.getProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettings() == null ^ this.getProvisionedReadCapacityAutoScalingSettings() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettings() != null
                && other.getProvisionedReadCapacityAutoScalingSettings().equals(this.getProvisionedReadCapacityAutoScalingSettings()) == false)
            return false;
        if (other.getProvisionedWriteCapacityUnits() == null ^ this.getProvisionedWriteCapacityUnits() == null)
            return false;
        if (other.getProvisionedWriteCapacityUnits() != null
                && other.getProvisionedWriteCapacityUnits().equals(this.getProvisionedWriteCapacityUnits()) == false)
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
        hashCode = prime * hashCode + ((getProvisionedReadCapacityUnits() == null) ? 0 : getProvisionedReadCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedReadCapacityAutoScalingSettings() == null) ? 0 : getProvisionedReadCapacityAutoScalingSettings().hashCode());
        hashCode = prime * hashCode + ((getProvisionedWriteCapacityUnits() == null) ? 0 : getProvisionedWriteCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedWriteCapacityAutoScalingSettings() == null) ? 0 : getProvisionedWriteCapacityAutoScalingSettings().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaGlobalSecondaryIndexSettingsDescription clone() {
        try {
            return (ReplicaGlobalSecondaryIndexSettingsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaGlobalSecondaryIndexSettingsDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
