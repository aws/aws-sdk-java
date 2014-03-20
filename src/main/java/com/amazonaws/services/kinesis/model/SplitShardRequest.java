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
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#splitShard(SplitShardRequest) SplitShard operation}.
 * <p>
 * This operation splits a shard into two new shards in the stream, to
 * increase the stream's capacity to ingest and transport data.
 * <code>SplitShard</code> is called when there is a need to increase the
 * overall capacity of stream because of an expected increase in the
 * volume of data records being ingested.
 * </p>
 * <p>
 * <code>SplitShard</code> can also be used when a given shard appears
 * to be approaching its maximum utilization, for example, when the set
 * of producers sending data into the specific shard are suddenly sending
 * more than previously anticipated. You can also call the
 * <code>SplitShard</code> operation to increase stream capacity, so that
 * more Amazon Kinesis applications can simultaneously read data from the
 * stream for real-time processing.
 * </p>
 * <p>
 * The <code>SplitShard</code> operation requires that you specify the
 * shard to be split and the new hash key, which is the position in the
 * shard where the shard gets split in two. In many cases, the new hash
 * key might simply be the average of the beginning and ending hash key,
 * but it can be any hash key value in the range being mapped into the
 * shard. For more information about splitting shards, see the
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
 * .
 * </p>
 * <p>
 * You can use the DescribeStream operation to determine the shard ID and
 * hash key values for the <code>ShardToSplit</code> and
 * <code>NewStartingHashKey</code> parameters that are specified in the
 * <code>SplitShard</code> request.
 * </p>
 * <p>
 * <code>SplitShard</code> is an asynchronous operation. Upon receiving
 * a <code>SplitShard</code> request, Amazon Kinesis immediately returns
 * a response and sets the stream status to UPDATING. After the operation
 * is completed, Amazon Kinesis sets the stream status to ACTIVE. Read
 * and write operations continue to work while the stream is in the
 * UPDATING state.
 * </p>
 * <p>
 * You can use <code>DescribeStream</code> to check the status of the
 * stream, which is returned in <code>StreamStatus</code> .
 * If the stream is in the ACTIVE state, you can call
 * <code>SplitShard</code> .
 * If a stream is in CREATING or UPDATING or DELETING
 * states, then Amazon Kinesis returns a
 * <code>ResourceInUseException</code> .
 * </p>
 * <p>
 * If the specified stream does not exist, Amazon Kinesis returns a
 * <code>ResourceNotFoundException</code> .
 * If you try to create more shards than are authorized
 * for your account, you receive a <code>LimitExceededException</code> .
 * </p>
 * <p>
 * <b>Note:</b> The default limit for an AWS account is 10 shards per
 * stream. If you need to create a stream with more than 10 shards,
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> contact AWS Support </a>
 * to increase the limit on your account.
 * </p>
 * <p>
 * If you try to operate on too many streams in parallel using
 * CreateStream, DeleteStream, MergeShards or SplitShard, you will
 * receive a <code>LimitExceededException</code> .
 * </p>
 * <p>
 * <code>SplitShard</code> has limit of 5 transactions per second per
 * account.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#splitShard(SplitShardRequest)
 */
public class SplitShardRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream for the shard split.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The shard ID of the shard to split.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardToSplit;

    /**
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes
     * a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys
     * being mapped into the shard. The <code>NewStartingHashKey</code> hash
     * key value and all higher hash key values in hash key range are
     * distributed to one of the child shards. All the lower hash key values
     * in the range are distributed to the other child shard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     */
    private String newStartingHashKey;

    /**
     * The name of the stream for the shard split.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream for the shard split.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream for the shard split.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream for the shard split.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream for the shard split.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream for the shard split.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SplitShardRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The shard ID of the shard to split.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID of the shard to split.
     */
    public String getShardToSplit() {
        return shardToSplit;
    }
    
    /**
     * The shard ID of the shard to split.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToSplit The shard ID of the shard to split.
     */
    public void setShardToSplit(String shardToSplit) {
        this.shardToSplit = shardToSplit;
    }
    
    /**
     * The shard ID of the shard to split.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToSplit The shard ID of the shard to split.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SplitShardRequest withShardToSplit(String shardToSplit) {
        this.shardToSplit = shardToSplit;
        return this;
    }

    /**
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes
     * a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys
     * being mapped into the shard. The <code>NewStartingHashKey</code> hash
     * key value and all higher hash key values in hash key range are
     * distributed to one of the child shards. All the lower hash key values
     * in the range are distributed to the other child shard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @return A hash key value for the starting hash key of one of the child shards
     *         created by the split. The hash key range for a given shard constitutes
     *         a set of ordered contiguous positive integers. The value for
     *         <code>NewStartingHashKey</code> must be in the range of hash keys
     *         being mapped into the shard. The <code>NewStartingHashKey</code> hash
     *         key value and all higher hash key values in hash key range are
     *         distributed to one of the child shards. All the lower hash key values
     *         in the range are distributed to the other child shard.
     */
    public String getNewStartingHashKey() {
        return newStartingHashKey;
    }
    
    /**
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes
     * a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys
     * being mapped into the shard. The <code>NewStartingHashKey</code> hash
     * key value and all higher hash key values in hash key range are
     * distributed to one of the child shards. All the lower hash key values
     * in the range are distributed to the other child shard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param newStartingHashKey A hash key value for the starting hash key of one of the child shards
     *         created by the split. The hash key range for a given shard constitutes
     *         a set of ordered contiguous positive integers. The value for
     *         <code>NewStartingHashKey</code> must be in the range of hash keys
     *         being mapped into the shard. The <code>NewStartingHashKey</code> hash
     *         key value and all higher hash key values in hash key range are
     *         distributed to one of the child shards. All the lower hash key values
     *         in the range are distributed to the other child shard.
     */
    public void setNewStartingHashKey(String newStartingHashKey) {
        this.newStartingHashKey = newStartingHashKey;
    }
    
    /**
     * A hash key value for the starting hash key of one of the child shards
     * created by the split. The hash key range for a given shard constitutes
     * a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys
     * being mapped into the shard. The <code>NewStartingHashKey</code> hash
     * key value and all higher hash key values in hash key range are
     * distributed to one of the child shards. All the lower hash key values
     * in the range are distributed to the other child shard.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,38})<br/>
     *
     * @param newStartingHashKey A hash key value for the starting hash key of one of the child shards
     *         created by the split. The hash key range for a given shard constitutes
     *         a set of ordered contiguous positive integers. The value for
     *         <code>NewStartingHashKey</code> must be in the range of hash keys
     *         being mapped into the shard. The <code>NewStartingHashKey</code> hash
     *         key value and all higher hash key values in hash key range are
     *         distributed to one of the child shards. All the lower hash key values
     *         in the range are distributed to the other child shard.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SplitShardRequest withNewStartingHashKey(String newStartingHashKey) {
        this.newStartingHashKey = newStartingHashKey;
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
        if (getShardToSplit() != null) sb.append("ShardToSplit: " + getShardToSplit() + ",");
        if (getNewStartingHashKey() != null) sb.append("NewStartingHashKey: " + getNewStartingHashKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getShardToSplit() == null) ? 0 : getShardToSplit().hashCode()); 
        hashCode = prime * hashCode + ((getNewStartingHashKey() == null) ? 0 : getNewStartingHashKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SplitShardRequest == false) return false;
        SplitShardRequest other = (SplitShardRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getShardToSplit() == null ^ this.getShardToSplit() == null) return false;
        if (other.getShardToSplit() != null && other.getShardToSplit().equals(this.getShardToSplit()) == false) return false; 
        if (other.getNewStartingHashKey() == null ^ this.getNewStartingHashKey() == null) return false;
        if (other.getNewStartingHashKey() != null && other.getNewStartingHashKey().equals(this.getNewStartingHashKey()) == false) return false; 
        return true;
    }
    
}
    