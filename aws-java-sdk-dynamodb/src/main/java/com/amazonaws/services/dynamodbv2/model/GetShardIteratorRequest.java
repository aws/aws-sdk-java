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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>GetShardIterator</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetShardIterator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetShardIteratorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The identifier of the shard. The iterator will be returned for this shard ID.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * Determines how the shard iterator is used to start reading stream records from the shard:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest record in
     * the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     * limit are subject to removal (trimming) from the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you always
     * read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     */
    private String shardIteratorType;
    /**
     * <p>
     * The sequence number of a stream record in the shard from which to start reading.
     * </p>
     */
    private String sequenceNumber;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShardIteratorRequest withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the shard. The iterator will be returned for this shard ID.
     * </p>
     * 
     * @param shardId
     *        The identifier of the shard. The iterator will be returned for this shard ID.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The identifier of the shard. The iterator will be returned for this shard ID.
     * </p>
     * 
     * @return The identifier of the shard. The iterator will be returned for this shard ID.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The identifier of the shard. The iterator will be returned for this shard ID.
     * </p>
     * 
     * @param shardId
     *        The identifier of the shard. The iterator will be returned for this shard ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShardIteratorRequest withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading stream records from the shard:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest record in
     * the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     * limit are subject to removal (trimming) from the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you always
     * read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading stream records from the shard:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest
     *        record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose
     *        age exceeds this limit are subject to removal (trimming) from the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you
     *        always read the most recent data in the shard.
     *        </p>
     *        </li>
     * @see ShardIteratorType
     */

    public void setShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading stream records from the shard:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest record in
     * the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     * limit are subject to removal (trimming) from the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you always
     * read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines how the shard iterator is used to start reading stream records from the shard:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence
     *         number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific
     *         sequence number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest
     *         record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records
     *         whose age exceeds this limit are subject to removal (trimming) from the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you
     *         always read the most recent data in the shard.
     *         </p>
     *         </li>
     * @see ShardIteratorType
     */

    public String getShardIteratorType() {
        return this.shardIteratorType;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading stream records from the shard:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest record in
     * the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     * limit are subject to removal (trimming) from the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you always
     * read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading stream records from the shard:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest
     *        record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose
     *        age exceeds this limit are subject to removal (trimming) from the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you
     *        always read the most recent data in the shard.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShardIteratorType
     */

    public GetShardIteratorRequest withShardIteratorType(String shardIteratorType) {
        setShardIteratorType(shardIteratorType);
        return this;
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading stream records from the shard:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest record in
     * the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     * limit are subject to removal (trimming) from the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you always
     * read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading stream records from the shard:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest
     *        record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose
     *        age exceeds this limit are subject to removal (trimming) from the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you
     *        always read the most recent data in the shard.
     *        </p>
     *        </li>
     * @see ShardIteratorType
     */

    public void setShardIteratorType(ShardIteratorType shardIteratorType) {
        withShardIteratorType(shardIteratorType);
    }

    /**
     * <p>
     * Determines how the shard iterator is used to start reading stream records from the shard:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     * number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest record in
     * the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this
     * limit are subject to removal (trimming) from the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you always
     * read the most recent data in the shard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shardIteratorType
     *        Determines how the shard iterator is used to start reading stream records from the shard:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AT_SEQUENCE_NUMBER</code> - Start reading exactly from the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AFTER_SEQUENCE_NUMBER</code> - Start reading right after the position denoted by a specific sequence
     *        number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last (untrimmed) stream record, which is the oldest
     *        record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose
     *        age exceeds this limit are subject to removal (trimming) from the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent stream record in the shard, so that you
     *        always read the most recent data in the shard.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShardIteratorType
     */

    public GetShardIteratorRequest withShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
        return this;
    }

    /**
     * <p>
     * The sequence number of a stream record in the shard from which to start reading.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number of a stream record in the shard from which to start reading.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The sequence number of a stream record in the shard from which to start reading.
     * </p>
     * 
     * @return The sequence number of a stream record in the shard from which to start reading.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The sequence number of a stream record in the shard from which to start reading.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number of a stream record in the shard from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShardIteratorRequest withSequenceNumber(String sequenceNumber) {
        setSequenceNumber(sequenceNumber);
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getShardId() != null)
            sb.append("ShardId: ").append(getShardId()).append(",");
        if (getShardIteratorType() != null)
            sb.append("ShardIteratorType: ").append(getShardIteratorType()).append(",");
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

        if (obj instanceof GetShardIteratorRequest == false)
            return false;
        GetShardIteratorRequest other = (GetShardIteratorRequest) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getShardIteratorType() == null ^ this.getShardIteratorType() == null)
            return false;
        if (other.getShardIteratorType() != null && other.getShardIteratorType().equals(this.getShardIteratorType()) == false)
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

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode + ((getShardIteratorType() == null) ? 0 : getShardIteratorType().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        return hashCode;
    }

    @Override
    public GetShardIteratorRequest clone() {
        return (GetShardIteratorRequest) super.clone();
    }

}
