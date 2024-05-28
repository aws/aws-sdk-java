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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Information regarding UpdateBrokerCount.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BrokerCountUpdateInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerCountUpdateInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Kafka Broker IDs of brokers being created.
     * </p>
     */
    private java.util.List<Double> createdBrokerIds;
    /**
     * <p>
     * Kafka Broker IDs of brokers being deleted.
     * </p>
     */
    private java.util.List<Double> deletedBrokerIds;

    /**
     * <p>
     * Kafka Broker IDs of brokers being created.
     * </p>
     * 
     * @return <p>
     *         Kafka Broker IDs of brokers being created.
     *         </p>
     */

    public java.util.List<Double> getCreatedBrokerIds() {
        return createdBrokerIds;
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being created.
     * </p>
     * 
     * @param createdBrokerIds
     *        <p>
     *        Kafka Broker IDs of brokers being created.
     *        </p>
     */

    public void setCreatedBrokerIds(java.util.Collection<Double> createdBrokerIds) {
        if (createdBrokerIds == null) {
            this.createdBrokerIds = null;
            return;
        }

        this.createdBrokerIds = new java.util.ArrayList<Double>(createdBrokerIds);
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being created.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreatedBrokerIds(java.util.Collection)} or {@link #withCreatedBrokerIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param createdBrokerIds
     *        <p>
     *        Kafka Broker IDs of brokers being created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerCountUpdateInfo withCreatedBrokerIds(Double... createdBrokerIds) {
        if (this.createdBrokerIds == null) {
            setCreatedBrokerIds(new java.util.ArrayList<Double>(createdBrokerIds.length));
        }
        for (Double ele : createdBrokerIds) {
            this.createdBrokerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being created.
     * </p>
     * 
     * @param createdBrokerIds
     *        <p>
     *        Kafka Broker IDs of brokers being created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerCountUpdateInfo withCreatedBrokerIds(java.util.Collection<Double> createdBrokerIds) {
        setCreatedBrokerIds(createdBrokerIds);
        return this;
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being deleted.
     * </p>
     * 
     * @return <p>
     *         Kafka Broker IDs of brokers being deleted.
     *         </p>
     */

    public java.util.List<Double> getDeletedBrokerIds() {
        return deletedBrokerIds;
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being deleted.
     * </p>
     * 
     * @param deletedBrokerIds
     *        <p>
     *        Kafka Broker IDs of brokers being deleted.
     *        </p>
     */

    public void setDeletedBrokerIds(java.util.Collection<Double> deletedBrokerIds) {
        if (deletedBrokerIds == null) {
            this.deletedBrokerIds = null;
            return;
        }

        this.deletedBrokerIds = new java.util.ArrayList<Double>(deletedBrokerIds);
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being deleted.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletedBrokerIds(java.util.Collection)} or {@link #withDeletedBrokerIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deletedBrokerIds
     *        <p>
     *        Kafka Broker IDs of brokers being deleted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerCountUpdateInfo withDeletedBrokerIds(Double... deletedBrokerIds) {
        if (this.deletedBrokerIds == null) {
            setDeletedBrokerIds(new java.util.ArrayList<Double>(deletedBrokerIds.length));
        }
        for (Double ele : deletedBrokerIds) {
            this.deletedBrokerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Kafka Broker IDs of brokers being deleted.
     * </p>
     * 
     * @param deletedBrokerIds
     *        <p>
     *        Kafka Broker IDs of brokers being deleted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerCountUpdateInfo withDeletedBrokerIds(java.util.Collection<Double> deletedBrokerIds) {
        setDeletedBrokerIds(deletedBrokerIds);
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
        if (getCreatedBrokerIds() != null)
            sb.append("CreatedBrokerIds: ").append(getCreatedBrokerIds()).append(",");
        if (getDeletedBrokerIds() != null)
            sb.append("DeletedBrokerIds: ").append(getDeletedBrokerIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerCountUpdateInfo == false)
            return false;
        BrokerCountUpdateInfo other = (BrokerCountUpdateInfo) obj;
        if (other.getCreatedBrokerIds() == null ^ this.getCreatedBrokerIds() == null)
            return false;
        if (other.getCreatedBrokerIds() != null && other.getCreatedBrokerIds().equals(this.getCreatedBrokerIds()) == false)
            return false;
        if (other.getDeletedBrokerIds() == null ^ this.getDeletedBrokerIds() == null)
            return false;
        if (other.getDeletedBrokerIds() != null && other.getDeletedBrokerIds().equals(this.getDeletedBrokerIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBrokerIds() == null) ? 0 : getCreatedBrokerIds().hashCode());
        hashCode = prime * hashCode + ((getDeletedBrokerIds() == null) ? 0 : getDeletedBrokerIds().hashCode());
        return hashCode;
    }

    @Override
    public BrokerCountUpdateInfo clone() {
        try {
            return (BrokerCountUpdateInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.BrokerCountUpdateInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
