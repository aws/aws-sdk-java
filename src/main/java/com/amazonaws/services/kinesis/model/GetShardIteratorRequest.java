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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#getShardIterator(GetShardIteratorRequest) GetShardIterator operation}.
 * <p>
 * This operation returns a shard iterator in <code>ShardIterator</code>
 * . The shard iterator specifies the position in the shard from which
 * you want to start reading data records sequentially. A shard iterator
 * specifies this position using the sequence number of a data record in
 * a shard. A sequence number is the identifier associated with every
 * record ingested in the Amazon Kinesis stream. The sequence number is
 * assigned by the Amazon Kinesis service when a record is put into the
 * stream.
 * </p>
 * <p>
 * You must specify the shard iterator type in the
 * <code>GetShardIterator</code> request. For example, you can set the
 * <code>ShardIteratorType</code> parameter to read exactly from the
 * position denoted by a specific sequence number by using the
 * AT_SEQUENCE_NUMBER shard iterator type, or right after the sequence
 * number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using
 * sequence numbers returned by earlier PutRecord, GetRecords or
 * DescribeStream requests. You can specify the shard iterator type
 * TRIM_HORIZON in the request to cause <code>ShardIterator</code> to
 * point to the last untrimmed record in the shard in the system, which
 * is the oldest data record in the shard. Or you can point to just after
 * the most recent record in the shard, by using the shard iterator type
 * LATEST, so that you always read the most recent data in the shard.
 * </p>
 * <p>
 * <b>Note:</b> Each shard iterator expires five minutes after it is
 * returned to the requester.
 * </p>
 * <p>
 * When you repeatedly read from an Amazon Kinesis stream use a
 * GetShardIterator request to get the first shard iterator to to use in
 * your first <code>GetRecords</code> request and then use the shard
 * iterator returned by the <code>GetRecords</code> request in
 * <code>NextShardIterator</code> for subsequent reads. A new shard
 * iterator is returned by every <code>GetRecords</code> request in
 * <code>NextShardIterator</code> ,
 * which you use in the <code>ShardIterator</code> parameter
 * of the next <code>GetRecords</code> request.
 * </p>
 * <p>
 * If a <code>GetShardIterator</code> request is made too often, you will
 * receive a <code>ProvisionedThroughputExceededException</code> .
 * For more information about throughput limits, see the
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
 * .
 * </p>
 * <p>
 * <code>GetShardIterator</code> can return <code>null</code> for its
 * <code>ShardIterator</code> to indicate that the shard has been closed
 * and that the requested iterator will return no more data. A shard can
 * be closed by a SplitShard or MergeShards operation.
 * </p>
 * <p>
 * <code>GetShardIterator</code> has a limit of 5 transactions per
 * second per account per open shard.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#getShardIterator(GetShardIteratorRequest)
 */
public class GetShardIteratorRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The shard ID of the shard to get the iterator for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardId;

    /**
     * Determines how the shard iterator is used to start reading data
     * records from the shard. <p>The following are the valid shard iterator
     * types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     * position denoted by a specific sequence number.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     * reading at the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard.</li> <li>LATEST - Start
     * reading just after the most recent record in the shard, so that you
     * always read the most recent data in the shard.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST
     */
    private String shardIteratorType;

    /**
     * The sequence number of the data record in the shard from which to
     * start reading from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String startingSequenceNumber;

    /**
     * The name of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetShardIteratorRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The shard ID of the shard to get the iterator for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID of the shard to get the iterator for.
     */
    public String getShardId() {
        return shardId;
    }
    
    /**
     * The shard ID of the shard to get the iterator for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The shard ID of the shard to get the iterator for.
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }
    
    /**
     * The shard ID of the shard to get the iterator for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardId The shard ID of the shard to get the iterator for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetShardIteratorRequest withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * Determines how the shard iterator is used to start reading data
     * records from the shard. <p>The following are the valid shard iterator
     * types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     * position denoted by a specific sequence number.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     * reading at the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard.</li> <li>LATEST - Start
     * reading just after the most recent record in the shard, so that you
     * always read the most recent data in the shard.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST
     *
     * @return Determines how the shard iterator is used to start reading data
     *         records from the shard. <p>The following are the valid shard iterator
     *         types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     *         position denoted by a specific sequence number.</li>
     *         <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *         denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     *         reading at the last untrimmed record in the shard in the system, which
     *         is the oldest data record in the shard.</li> <li>LATEST - Start
     *         reading just after the most recent record in the shard, so that you
     *         always read the most recent data in the shard.</li> </ul>
     *
     * @see ShardIteratorType
     */
    public String getShardIteratorType() {
        return shardIteratorType;
    }
    
    /**
     * Determines how the shard iterator is used to start reading data
     * records from the shard. <p>The following are the valid shard iterator
     * types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     * position denoted by a specific sequence number.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     * reading at the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard.</li> <li>LATEST - Start
     * reading just after the most recent record in the shard, so that you
     * always read the most recent data in the shard.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST
     *
     * @param shardIteratorType Determines how the shard iterator is used to start reading data
     *         records from the shard. <p>The following are the valid shard iterator
     *         types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     *         position denoted by a specific sequence number.</li>
     *         <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *         denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     *         reading at the last untrimmed record in the shard in the system, which
     *         is the oldest data record in the shard.</li> <li>LATEST - Start
     *         reading just after the most recent record in the shard, so that you
     *         always read the most recent data in the shard.</li> </ul>
     *
     * @see ShardIteratorType
     */
    public void setShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
    }
    
    /**
     * Determines how the shard iterator is used to start reading data
     * records from the shard. <p>The following are the valid shard iterator
     * types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     * position denoted by a specific sequence number.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     * reading at the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard.</li> <li>LATEST - Start
     * reading just after the most recent record in the shard, so that you
     * always read the most recent data in the shard.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST
     *
     * @param shardIteratorType Determines how the shard iterator is used to start reading data
     *         records from the shard. <p>The following are the valid shard iterator
     *         types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     *         position denoted by a specific sequence number.</li>
     *         <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *         denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     *         reading at the last untrimmed record in the shard in the system, which
     *         is the oldest data record in the shard.</li> <li>LATEST - Start
     *         reading just after the most recent record in the shard, so that you
     *         always read the most recent data in the shard.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ShardIteratorType
     */
    public GetShardIteratorRequest withShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
        return this;
    }

    /**
     * Determines how the shard iterator is used to start reading data
     * records from the shard. <p>The following are the valid shard iterator
     * types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     * position denoted by a specific sequence number.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     * reading at the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard.</li> <li>LATEST - Start
     * reading just after the most recent record in the shard, so that you
     * always read the most recent data in the shard.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST
     *
     * @param shardIteratorType Determines how the shard iterator is used to start reading data
     *         records from the shard. <p>The following are the valid shard iterator
     *         types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     *         position denoted by a specific sequence number.</li>
     *         <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *         denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     *         reading at the last untrimmed record in the shard in the system, which
     *         is the oldest data record in the shard.</li> <li>LATEST - Start
     *         reading just after the most recent record in the shard, so that you
     *         always read the most recent data in the shard.</li> </ul>
     *
     * @see ShardIteratorType
     */
    public void setShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
    }
    
    /**
     * Determines how the shard iterator is used to start reading data
     * records from the shard. <p>The following are the valid shard iterator
     * types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     * position denoted by a specific sequence number.</li>
     * <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     * denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     * reading at the last untrimmed record in the shard in the system, which
     * is the oldest data record in the shard.</li> <li>LATEST - Start
     * reading just after the most recent record in the shard, so that you
     * always read the most recent data in the shard.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER, TRIM_HORIZON, LATEST
     *
     * @param shardIteratorType Determines how the shard iterator is used to start reading data
     *         records from the shard. <p>The following are the valid shard iterator
     *         types: <ul> <li>AT_SEQUENCE_NUMBER - Start reading exactly from the
     *         position denoted by a specific sequence number.</li>
     *         <li>AFTER_SEQUENCE_NUMBER - Start reading right after the position
     *         denoted by a specific sequence number.</li> <li>TRIM_HORIZON - Start
     *         reading at the last untrimmed record in the shard in the system, which
     *         is the oldest data record in the shard.</li> <li>LATEST - Start
     *         reading just after the most recent record in the shard, so that you
     *         always read the most recent data in the shard.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ShardIteratorType
     */
    public GetShardIteratorRequest withShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
        return this;
    }

    /**
     * The sequence number of the data record in the shard from which to
     * start reading from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The sequence number of the data record in the shard from which to
     *         start reading from.
     */
    public String getStartingSequenceNumber() {
        return startingSequenceNumber;
    }
    
    /**
     * The sequence number of the data record in the shard from which to
     * start reading from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param startingSequenceNumber The sequence number of the data record in the shard from which to
     *         start reading from.
     */
    public void setStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
    }
    
    /**
     * The sequence number of the data record in the shard from which to
     * start reading from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param startingSequenceNumber The sequence number of the data record in the shard from which to
     *         start reading from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetShardIteratorRequest withStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
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
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() + ",");
        if (getShardId() != null) sb.append("ShardId: " + getShardId() + ",");
        if (getShardIteratorType() != null) sb.append("ShardIteratorType: " + getShardIteratorType() + ",");
        if (getStartingSequenceNumber() != null) sb.append("StartingSequenceNumber: " + getStartingSequenceNumber() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode()); 
        hashCode = prime * hashCode + ((getShardIteratorType() == null) ? 0 : getShardIteratorType().hashCode()); 
        hashCode = prime * hashCode + ((getStartingSequenceNumber() == null) ? 0 : getStartingSequenceNumber().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetShardIteratorRequest == false) return false;
        GetShardIteratorRequest other = (GetShardIteratorRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getShardId() == null ^ this.getShardId() == null) return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false) return false; 
        if (other.getShardIteratorType() == null ^ this.getShardIteratorType() == null) return false;
        if (other.getShardIteratorType() != null && other.getShardIteratorType().equals(this.getShardIteratorType()) == false) return false; 
        if (other.getStartingSequenceNumber() == null ^ this.getStartingSequenceNumber() == null) return false;
        if (other.getStartingSequenceNumber() != null && other.getStartingSequenceNumber().equals(this.getStartingSequenceNumber()) == false) return false; 
        return true;
    }
    
}
    