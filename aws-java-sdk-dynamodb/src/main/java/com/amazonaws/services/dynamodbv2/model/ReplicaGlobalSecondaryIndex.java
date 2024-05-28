/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the properties of a replica global secondary index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaGlobalSecondaryIndex"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaGlobalSecondaryIndex implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the global secondary index.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity
     * settings.
     * </p>
     */
    private ProvisionedThroughputOverride provisionedThroughputOverride;
    /**
     * <p>
     * Overrides the maximum on-demand throughput settings for the specified global secondary index in the specified
     * replica table.
     * </p>
     */
    private OnDemandThroughputOverride onDemandThroughputOverride;

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

    public ReplicaGlobalSecondaryIndex withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity
     * settings.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read
     *        capacity settings.
     */

    public void setProvisionedThroughputOverride(ProvisionedThroughputOverride provisionedThroughputOverride) {
        this.provisionedThroughputOverride = provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity
     * settings.
     * </p>
     * 
     * @return Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read
     *         capacity settings.
     */

    public ProvisionedThroughputOverride getProvisionedThroughputOverride() {
        return this.provisionedThroughputOverride;
    }

    /**
     * <p>
     * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity
     * settings.
     * </p>
     * 
     * @param provisionedThroughputOverride
     *        Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read
     *        capacity settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndex withProvisionedThroughputOverride(ProvisionedThroughputOverride provisionedThroughputOverride) {
        setProvisionedThroughputOverride(provisionedThroughputOverride);
        return this;
    }

    /**
     * <p>
     * Overrides the maximum on-demand throughput settings for the specified global secondary index in the specified
     * replica table.
     * </p>
     * 
     * @param onDemandThroughputOverride
     *        Overrides the maximum on-demand throughput settings for the specified global secondary index in the
     *        specified replica table.
     */

    public void setOnDemandThroughputOverride(OnDemandThroughputOverride onDemandThroughputOverride) {
        this.onDemandThroughputOverride = onDemandThroughputOverride;
    }

    /**
     * <p>
     * Overrides the maximum on-demand throughput settings for the specified global secondary index in the specified
     * replica table.
     * </p>
     * 
     * @return Overrides the maximum on-demand throughput settings for the specified global secondary index in the
     *         specified replica table.
     */

    public OnDemandThroughputOverride getOnDemandThroughputOverride() {
        return this.onDemandThroughputOverride;
    }

    /**
     * <p>
     * Overrides the maximum on-demand throughput settings for the specified global secondary index in the specified
     * replica table.
     * </p>
     * 
     * @param onDemandThroughputOverride
     *        Overrides the maximum on-demand throughput settings for the specified global secondary index in the
     *        specified replica table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaGlobalSecondaryIndex withOnDemandThroughputOverride(OnDemandThroughputOverride onDemandThroughputOverride) {
        setOnDemandThroughputOverride(onDemandThroughputOverride);
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
        if (getProvisionedThroughputOverride() != null)
            sb.append("ProvisionedThroughputOverride: ").append(getProvisionedThroughputOverride()).append(",");
        if (getOnDemandThroughputOverride() != null)
            sb.append("OnDemandThroughputOverride: ").append(getOnDemandThroughputOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaGlobalSecondaryIndex == false)
            return false;
        ReplicaGlobalSecondaryIndex other = (ReplicaGlobalSecondaryIndex) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getProvisionedThroughputOverride() == null ^ this.getProvisionedThroughputOverride() == null)
            return false;
        if (other.getProvisionedThroughputOverride() != null
                && other.getProvisionedThroughputOverride().equals(this.getProvisionedThroughputOverride()) == false)
            return false;
        if (other.getOnDemandThroughputOverride() == null ^ this.getOnDemandThroughputOverride() == null)
            return false;
        if (other.getOnDemandThroughputOverride() != null && other.getOnDemandThroughputOverride().equals(this.getOnDemandThroughputOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputOverride() == null) ? 0 : getProvisionedThroughputOverride().hashCode());
        hashCode = prime * hashCode + ((getOnDemandThroughputOverride() == null) ? 0 : getOnDemandThroughputOverride().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaGlobalSecondaryIndex clone() {
        try {
            return (ReplicaGlobalSecondaryIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaGlobalSecondaryIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
