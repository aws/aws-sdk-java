/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * A uniquely identified group of data records in an Amazon Kinesis
 * stream.
 * </p>
 */
public class Shard implements Serializable {

    /**
     * The unique identifier of the shard within the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardId;

    /**
     * The shard Id of the shard's parent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String parentShardId;

    /**
     * The shard Id of the shard adjacent to the shard's parent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String adjacentParentShardId;

    /**
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     */
    private HashKeyRange hashKeyRange;

    /**
     * The range of possible sequence numbers for the shard.
     */
    private SequenceNumberRange sequenceNumberRange;

    /**
     * The unique identifier of the shard within the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The unique identifier of the shard within the Amazon Kinesis stream.
     */
    public String getShardId() {
        return shardId;
    }
    
    /**
     * The unique identifier of the shard within the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The unique identifier of the shard within the Amazon Kinesis stream.
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }
    
    /**
     * The unique identifier of the shard within the Amazon Kinesis stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The unique identifier of the shard within the Amazon Kinesis stream.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Shard withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * The shard Id of the shard's parent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard Id of the shard's parent.
     */
    public String getParentShardId() {
        return parentShardId;
    }
    
    /**
     * The shard Id of the shard's parent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param parentShardId The shard Id of the shard's parent.
     */
    public void setParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
    }
    
    /**
     * The shard Id of the shard's parent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param parentShardId The shard Id of the shard's parent.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Shard withParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
        return this;
    }

    /**
     * The shard Id of the shard adjacent to the shard's parent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard Id of the shard adjacent to the shard's parent.
     */
    public String getAdjacentParentShardId() {
        return adjacentParentShardId;
    }
    
    /**
     * The shard Id of the shard adjacent to the shard's parent.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentParentShardId The shard Id of the shard adjacent to the shard's parent.
     */
    public void setAdjacentParentShardId(String adjacentParentShardId) {
        this.adjacentParentShardId = adjacentParentShardId;
    }
    
    /**
     * The shard Id of the shard adjacent to the shard's parent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentParentShardId The shard Id of the shard adjacent to the shard's parent.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Shard withAdjacentParentShardId(String adjacentParentShardId) {
        this.adjacentParentShardId = adjacentParentShardId;
        return this;
    }

    /**
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     *
     * @return The range of possible hash key values for the shard, which is a set of
     *         ordered contiguous positive integers.
     */
    public HashKeyRange getHashKeyRange() {
        return hashKeyRange;
    }
    
    /**
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     *
     * @param hashKeyRange The range of possible hash key values for the shard, which is a set of
     *         ordered contiguous positive integers.
     */
    public void setHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
    }
    
    /**
     * The range of possible hash key values for the shard, which is a set of
     * ordered contiguous positive integers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKeyRange The range of possible hash key values for the shard, which is a set of
     *         ordered contiguous positive integers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Shard withHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
        return this;
    }

    /**
     * The range of possible sequence numbers for the shard.
     *
     * @return The range of possible sequence numbers for the shard.
     */
    public SequenceNumberRange getSequenceNumberRange() {
        return sequenceNumberRange;
    }
    
    /**
     * The range of possible sequence numbers for the shard.
     *
     * @param sequenceNumberRange The range of possible sequence numbers for the shard.
     */
    public void setSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
    }
    
    /**
     * The range of possible sequence numbers for the shard.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sequenceNumberRange The range of possible sequence numbers for the shard.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Shard withSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getShardId() != null) sb.append("ShardId: " + getShardId() + ",");
        if (getParentShardId() != null) sb.append("ParentShardId: " + getParentShardId() + ",");
        if (getAdjacentParentShardId() != null) sb.append("AdjacentParentShardId: " + getAdjacentParentShardId() + ",");
        if (getHashKeyRange() != null) sb.append("HashKeyRange: " + getHashKeyRange() + ",");
        if (getSequenceNumberRange() != null) sb.append("SequenceNumberRange: " + getSequenceNumberRange() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Shard == false) return false;
        Shard other = (Shard)obj;
        
        if (other.getShardId() == null ^ this.getShardId() == null) return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false) return false; 
        if (other.getParentShardId() == null ^ this.getParentShardId() == null) return false;
        if (other.getParentShardId() != null && other.getParentShardId().equals(this.getParentShardId()) == false) return false; 
        if (other.getAdjacentParentShardId() == null ^ this.getAdjacentParentShardId() == null) return false;
        if (other.getAdjacentParentShardId() != null && other.getAdjacentParentShardId().equals(this.getAdjacentParentShardId()) == false) return false; 
        if (other.getHashKeyRange() == null ^ this.getHashKeyRange() == null) return false;
        if (other.getHashKeyRange() != null && other.getHashKeyRange().equals(this.getHashKeyRange()) == false) return false; 
        if (other.getSequenceNumberRange() == null ^ this.getSequenceNumberRange() == null) return false;
        if (other.getSequenceNumberRange() != null && other.getSequenceNumberRange().equals(this.getSequenceNumberRange()) == false) return false; 
        return true;
    }
    
}
    