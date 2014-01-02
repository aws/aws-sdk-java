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
 * Represents the output of a <code>PutRecord</code> operation.
 * </p>
 */
public class PutRecordResult implements Serializable {

    /**
     * The shard ID of the shard where the data record was placed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardId;

    /**
     * The sequence number identifier that was assigned to the put data
     * record. The sequence number for the record is unique across all
     * records in the stream. A sequence number is the identifier associated
     * with every record put into the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumber;

    /**
     * The shard ID of the shard where the data record was placed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID of the shard where the data record was placed.
     */
    public String getShardId() {
        return shardId;
    }
    
    /**
     * The shard ID of the shard where the data record was placed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The shard ID of the shard where the data record was placed.
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }
    
    /**
     * The shard ID of the shard where the data record was placed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The shard ID of the shard where the data record was placed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutRecordResult withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * The sequence number identifier that was assigned to the put data
     * record. The sequence number for the record is unique across all
     * records in the stream. A sequence number is the identifier associated
     * with every record put into the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The sequence number identifier that was assigned to the put data
     *         record. The sequence number for the record is unique across all
     *         records in the stream. A sequence number is the identifier associated
     *         with every record put into the stream.
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }
    
    /**
     * The sequence number identifier that was assigned to the put data
     * record. The sequence number for the record is unique across all
     * records in the stream. A sequence number is the identifier associated
     * with every record put into the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The sequence number identifier that was assigned to the put data
     *         record. The sequence number for the record is unique across all
     *         records in the stream. A sequence number is the identifier associated
     *         with every record put into the stream.
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
    /**
     * The sequence number identifier that was assigned to the put data
     * record. The sequence number for the record is unique across all
     * records in the stream. A sequence number is the identifier associated
     * with every record put into the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The sequence number identifier that was assigned to the put data
     *         record. The sequence number for the record is unique across all
     *         records in the stream. A sequence number is the identifier associated
     *         with every record put into the stream.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutRecordResult withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
        if (getSequenceNumber() != null) sb.append("SequenceNumber: " + getSequenceNumber() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode()); 
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRecordResult == false) return false;
        PutRecordResult other = (PutRecordResult)obj;
        
        if (other.getShardId() == null ^ this.getShardId() == null) return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false) return false; 
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null) return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false) return false; 
        return true;
    }
    
}
    