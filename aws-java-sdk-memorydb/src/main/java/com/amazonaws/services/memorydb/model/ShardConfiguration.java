/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Shard configuration options. Each shard configuration has the following: Slots and ReplicaCount.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ShardConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShardConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format startkey-endkey.
     * </p>
     */
    private String slots;
    /**
     * <p>
     * The number of read replica nodes in this shard.
     * </p>
     */
    private Integer replicaCount;

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format startkey-endkey.
     * </p>
     * 
     * @param slots
     *        A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The
     *        string is in the format startkey-endkey.
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format startkey-endkey.
     * </p>
     * 
     * @return A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The
     *         string is in the format startkey-endkey.
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is
     * in the format startkey-endkey.
     * </p>
     * 
     * @param slots
     *        A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The
     *        string is in the format startkey-endkey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardConfiguration withSlots(String slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * The number of read replica nodes in this shard.
     * </p>
     * 
     * @param replicaCount
     *        The number of read replica nodes in this shard.
     */

    public void setReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes in this shard.
     * </p>
     * 
     * @return The number of read replica nodes in this shard.
     */

    public Integer getReplicaCount() {
        return this.replicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes in this shard.
     * </p>
     * 
     * @param replicaCount
     *        The number of read replica nodes in this shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardConfiguration withReplicaCount(Integer replicaCount) {
        setReplicaCount(replicaCount);
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
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getReplicaCount() != null)
            sb.append("ReplicaCount: ").append(getReplicaCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShardConfiguration == false)
            return false;
        ShardConfiguration other = (ShardConfiguration) obj;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getReplicaCount() == null ^ this.getReplicaCount() == null)
            return false;
        if (other.getReplicaCount() != null && other.getReplicaCount().equals(this.getReplicaCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getReplicaCount() == null) ? 0 : getReplicaCount().hashCode());
        return hashCode;
    }

    @Override
    public ShardConfiguration clone() {
        try {
            return (ShardConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ShardConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
