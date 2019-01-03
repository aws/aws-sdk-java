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
 * A uniquely identified group of stream records within a stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/Shard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Shard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated identifier for this shard.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     */
    private SequenceNumberRange sequenceNumberRange;
    /**
     * <p>
     * The shard ID of the current shard's parent.
     * </p>
     */
    private String parentShardId;

    /**
     * <p>
     * The system-generated identifier for this shard.
     * </p>
     * 
     * @param shardId
     *        The system-generated identifier for this shard.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The system-generated identifier for this shard.
     * </p>
     * 
     * @return The system-generated identifier for this shard.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The system-generated identifier for this shard.
     * </p>
     * 
     * @param shardId
     *        The system-generated identifier for this shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     * 
     * @param sequenceNumberRange
     *        The range of possible sequence numbers for the shard.
     */

    public void setSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
    }

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     * 
     * @return The range of possible sequence numbers for the shard.
     */

    public SequenceNumberRange getSequenceNumberRange() {
        return this.sequenceNumberRange;
    }

    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     * 
     * @param sequenceNumberRange
     *        The range of possible sequence numbers for the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        setSequenceNumberRange(sequenceNumberRange);
        return this;
    }

    /**
     * <p>
     * The shard ID of the current shard's parent.
     * </p>
     * 
     * @param parentShardId
     *        The shard ID of the current shard's parent.
     */

    public void setParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
    }

    /**
     * <p>
     * The shard ID of the current shard's parent.
     * </p>
     * 
     * @return The shard ID of the current shard's parent.
     */

    public String getParentShardId() {
        return this.parentShardId;
    }

    /**
     * <p>
     * The shard ID of the current shard's parent.
     * </p>
     * 
     * @param parentShardId
     *        The shard ID of the current shard's parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withParentShardId(String parentShardId) {
        setParentShardId(parentShardId);
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
        if (getShardId() != null)
            sb.append("ShardId: ").append(getShardId()).append(",");
        if (getSequenceNumberRange() != null)
            sb.append("SequenceNumberRange: ").append(getSequenceNumberRange()).append(",");
        if (getParentShardId() != null)
            sb.append("ParentShardId: ").append(getParentShardId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Shard == false)
            return false;
        Shard other = (Shard) obj;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getSequenceNumberRange() == null ^ this.getSequenceNumberRange() == null)
            return false;
        if (other.getSequenceNumberRange() != null && other.getSequenceNumberRange().equals(this.getSequenceNumberRange()) == false)
            return false;
        if (other.getParentShardId() == null ^ this.getParentShardId() == null)
            return false;
        if (other.getParentShardId() != null && other.getParentShardId().equals(this.getParentShardId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumberRange() == null) ? 0 : getSequenceNumberRange().hashCode());
        hashCode = prime * hashCode + ((getParentShardId() == null) ? 0 : getParentShardId().hashCode());
        return hashCode;
    }

    @Override
    public Shard clone() {
        try {
            return (Shard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ShardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
