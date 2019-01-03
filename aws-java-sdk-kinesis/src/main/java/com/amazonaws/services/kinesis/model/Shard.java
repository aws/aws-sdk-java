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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A uniquely identified group of data records in a Kinesis data stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/Shard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Shard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     */
    private String parentShardId;
    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     */
    private String adjacentParentShardId;
    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
     * </p>
     */
    private HashKeyRange hashKeyRange;
    /**
     * <p>
     * The range of possible sequence numbers for the shard.
     * </p>
     */
    private SequenceNumberRange sequenceNumberRange;

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * 
     * @param shardId
     *        The unique identifier of the shard within the stream.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * 
     * @return The unique identifier of the shard within the stream.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The unique identifier of the shard within the stream.
     * </p>
     * 
     * @param shardId
     *        The unique identifier of the shard within the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * 
     * @param parentShardId
     *        The shard ID of the shard's parent.
     */

    public void setParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * 
     * @return The shard ID of the shard's parent.
     */

    public String getParentShardId() {
        return this.parentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard's parent.
     * </p>
     * 
     * @param parentShardId
     *        The shard ID of the shard's parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withParentShardId(String parentShardId) {
        setParentShardId(parentShardId);
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * 
     * @param adjacentParentShardId
     *        The shard ID of the shard adjacent to the shard's parent.
     */

    public void setAdjacentParentShardId(String adjacentParentShardId) {
        this.adjacentParentShardId = adjacentParentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * 
     * @return The shard ID of the shard adjacent to the shard's parent.
     */

    public String getAdjacentParentShardId() {
        return this.adjacentParentShardId;
    }

    /**
     * <p>
     * The shard ID of the shard adjacent to the shard's parent.
     * </p>
     * 
     * @param adjacentParentShardId
     *        The shard ID of the shard adjacent to the shard's parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withAdjacentParentShardId(String adjacentParentShardId) {
        setAdjacentParentShardId(adjacentParentShardId);
        return this;
    }

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
     * </p>
     * 
     * @param hashKeyRange
     *        The range of possible hash key values for the shard, which is a set of ordered contiguous positive
     *        integers.
     */

    public void setHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
    }

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
     * </p>
     * 
     * @return The range of possible hash key values for the shard, which is a set of ordered contiguous positive
     *         integers.
     */

    public HashKeyRange getHashKeyRange() {
        return this.hashKeyRange;
    }

    /**
     * <p>
     * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
     * </p>
     * 
     * @param hashKeyRange
     *        The range of possible hash key values for the shard, which is a set of ordered contiguous positive
     *        integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shard withHashKeyRange(HashKeyRange hashKeyRange) {
        setHashKeyRange(hashKeyRange);
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
        if (getParentShardId() != null)
            sb.append("ParentShardId: ").append(getParentShardId()).append(",");
        if (getAdjacentParentShardId() != null)
            sb.append("AdjacentParentShardId: ").append(getAdjacentParentShardId()).append(",");
        if (getHashKeyRange() != null)
            sb.append("HashKeyRange: ").append(getHashKeyRange()).append(",");
        if (getSequenceNumberRange() != null)
            sb.append("SequenceNumberRange: ").append(getSequenceNumberRange());
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
        if (other.getParentShardId() == null ^ this.getParentShardId() == null)
            return false;
        if (other.getParentShardId() != null && other.getParentShardId().equals(this.getParentShardId()) == false)
            return false;
        if (other.getAdjacentParentShardId() == null ^ this.getAdjacentParentShardId() == null)
            return false;
        if (other.getAdjacentParentShardId() != null && other.getAdjacentParentShardId().equals(this.getAdjacentParentShardId()) == false)
            return false;
        if (other.getHashKeyRange() == null ^ this.getHashKeyRange() == null)
            return false;
        if (other.getHashKeyRange() != null && other.getHashKeyRange().equals(this.getHashKeyRange()) == false)
            return false;
        if (other.getSequenceNumberRange() == null ^ this.getSequenceNumberRange() == null)
            return false;
        if (other.getSequenceNumberRange() != null && other.getSequenceNumberRange().equals(this.getSequenceNumberRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode + ((getParentShardId() == null) ? 0 : getParentShardId().hashCode());
        hashCode = prime * hashCode + ((getAdjacentParentShardId() == null) ? 0 : getAdjacentParentShardId().hashCode());
        hashCode = prime * hashCode + ((getHashKeyRange() == null) ? 0 : getHashKeyRange().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumberRange() == null) ? 0 : getSequenceNumberRange().hashCode());
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
        com.amazonaws.services.kinesis.model.transform.ShardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
