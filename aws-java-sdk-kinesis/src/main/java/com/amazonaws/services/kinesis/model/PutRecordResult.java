/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the output for <code>PutRecord</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/PutRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The shard ID of the shard where the data record was placed.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * The sequence number identifier that was assigned to the put data record. The sequence number for the record is
     * unique across all records in the stream. A sequence number is the identifier associated with every record put
     * into the stream.
     * </p>
     */
    private String sequenceNumber;

    /**
     * <p>
     * The shard ID of the shard where the data record was placed.
     * </p>
     * 
     * @param shardId
     *        The shard ID of the shard where the data record was placed.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The shard ID of the shard where the data record was placed.
     * </p>
     * 
     * @return The shard ID of the shard where the data record was placed.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The shard ID of the shard where the data record was placed.
     * </p>
     * 
     * @param shardId
     *        The shard ID of the shard where the data record was placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordResult withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * The sequence number identifier that was assigned to the put data record. The sequence number for the record is
     * unique across all records in the stream. A sequence number is the identifier associated with every record put
     * into the stream.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number identifier that was assigned to the put data record. The sequence number for the
     *        record is unique across all records in the stream. A sequence number is the identifier associated with
     *        every record put into the stream.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The sequence number identifier that was assigned to the put data record. The sequence number for the record is
     * unique across all records in the stream. A sequence number is the identifier associated with every record put
     * into the stream.
     * </p>
     * 
     * @return The sequence number identifier that was assigned to the put data record. The sequence number for the
     *         record is unique across all records in the stream. A sequence number is the identifier associated with
     *         every record put into the stream.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The sequence number identifier that was assigned to the put data record. The sequence number for the record is
     * unique across all records in the stream. A sequence number is the identifier associated with every record put
     * into the stream.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number identifier that was assigned to the put data record. The sequence number for the
     *        record is unique across all records in the stream. A sequence number is the identifier associated with
     *        every record put into the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordResult withSequenceNumber(String sequenceNumber) {
        setSequenceNumber(sequenceNumber);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordResult == false)
            return false;
        PutRecordResult other = (PutRecordResult) obj;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        return true;
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
    public PutRecordResult clone() {
        try {
            return (PutRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
