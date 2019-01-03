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
 * Represents the settings of a global secondary index for a global table that will be modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaGlobalSecondaryIndexSettingsUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaGlobalSecondaryIndexSettingsUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the global secondary index. The name must be unique among all other indexes on this table.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * <code>ThrottlingException</code>.
     * </p>
     */
    private Long provisionedReadCapacityUnits;
    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read capacity units.
     * </p>
     */
    private AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate;

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

    public ReplicaGlobalSecondaryIndexSettingsUpdate withIndexName(String indexName) {
        setIndexName(indexName);
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

    public ReplicaGlobalSecondaryIndexSettingsUpdate withProvisionedReadCapacityUnits(Long provisionedReadCapacityUnits) {
        setProvisionedReadCapacityUnits(provisionedReadCapacityUnits);
        return this;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read capacity units.
     * </p>
     * 
     * @param provisionedReadCapacityAutoScalingSettingsUpdate
     *        Autoscaling settings for managing a global secondary index replica's read capacity units.
     */

    public void setProvisionedReadCapacityAutoScalingSettingsUpdate(AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate) {
        this.provisionedReadCapacityAutoScalingSettingsUpdate = provisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read capacity units.
     * </p>
     * 
     * @return Autoscaling settings for managing a global secondary index replica's read capacity units.
     */

    public AutoScalingSettingsUpdate getProvisionedReadCapacityAutoScalingSettingsUpdate() {
        return this.provisionedReadCapacityAutoScalingSettingsUpdate;
    }

    /**
     * <p>
     * Autoscaling settings for managing a global secondary index replica's read capacity units.
     * </p>
     * 
     * @param provisionedReadCapacityAutoScalingSettingsUpdate
     *        Autoscaling settings for managing a global secondary index replica's read capacity units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndexSettingsUpdate withProvisionedReadCapacityAutoScalingSettingsUpdate(
            AutoScalingSettingsUpdate provisionedReadCapacityAutoScalingSettingsUpdate) {
        setProvisionedReadCapacityAutoScalingSettingsUpdate(provisionedReadCapacityAutoScalingSettingsUpdate);
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
        if (getProvisionedReadCapacityUnits() != null)
            sb.append("ProvisionedReadCapacityUnits: ").append(getProvisionedReadCapacityUnits()).append(",");
        if (getProvisionedReadCapacityAutoScalingSettingsUpdate() != null)
            sb.append("ProvisionedReadCapacityAutoScalingSettingsUpdate: ").append(getProvisionedReadCapacityAutoScalingSettingsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndexSettingsUpdate == false)
            return false;
        ReplicaGlobalSecondaryIndexSettingsUpdate other = (ReplicaGlobalSecondaryIndexSettingsUpdate) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getProvisionedReadCapacityUnits() == null ^ this.getProvisionedReadCapacityUnits() == null)
            return false;
        if (other.getProvisionedReadCapacityUnits() != null && other.getProvisionedReadCapacityUnits().equals(this.getProvisionedReadCapacityUnits()) == false)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettingsUpdate() == null ^ this.getProvisionedReadCapacityAutoScalingSettingsUpdate() == null)
            return false;
        if (other.getProvisionedReadCapacityAutoScalingSettingsUpdate() != null
                && other.getProvisionedReadCapacityAutoScalingSettingsUpdate().equals(this.getProvisionedReadCapacityAutoScalingSettingsUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedReadCapacityUnits() == null) ? 0 : getProvisionedReadCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedReadCapacityAutoScalingSettingsUpdate() == null) ? 0 : getProvisionedReadCapacityAutoScalingSettingsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaGlobalSecondaryIndexSettingsUpdate clone() {
        try {
            return (ReplicaGlobalSecondaryIndexSettingsUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaGlobalSecondaryIndexSettingsUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
