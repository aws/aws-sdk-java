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
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#mergeShards(MergeShardsRequest) MergeShards operation}.
 * <p>
 * This operation merges two adjacent shards in a stream and combines
 * them into a single shard to reduce the stream's capacity to ingest and
 * transport data. Two shards are considered adjacent if the union of the
 * hash key ranges for the two shards form a contiguous set with no gaps.
 * For example, if you have two shards, one with a hash key range of
 * 276...381 and the other with a hash key range of 382...454, then you
 * could merge these two shards into a single shard that would have a
 * hash key range of 276...454. After the merge, the single child shard
 * receives data for all hash key values covered by the two parent
 * shards.
 * </p>
 * <p>
 * <code>MergeShards</code> is called when there is a need to reduce the
 * overall capacity of a stream because of excess capacity that is not
 * being used. The operation requires that you specify the shard to be
 * merged and the adjacent shard for a given stream. For more information
 * about merging shards, see the
 * <a href="http://docs.aws.amazon.com/kinesis/latest/dev/"> Amazon Kinesis Developer Guide </a>
 * .
 * </p>
 * <p>
 * If the stream is in the ACTIVE state, you can call
 * <code>MergeShards</code> . If a stream is in CREATING or UPDATING or
 * DELETING states, then Amazon Kinesis returns a
 * <code>ResourceInUseException</code> .
 * If the specified stream does not exist, Amazon Kinesis
 * returns a <code>ResourceNotFoundException</code> .
 * </p>
 * <p>
 * You can use the DescribeStream operation to check the state of the
 * stream, which is returned in <code>StreamStatus</code> .
 * </p>
 * <p>
 * <code>MergeShards</code> is an asynchronous operation. Upon receiving
 * a <code>MergeShards</code> request, Amazon Kinesis immediately returns
 * a response and sets the <code>StreamStatus</code> to UPDATING. After
 * the operation is completed, Amazon Kinesis sets the
 * <code>StreamStatus</code> to ACTIVE. Read and write operations
 * continue to work while the stream is in the UPDATING state.
 * </p>
 * <p>
 * You use the DescribeStream operation to determine the shard IDs that
 * are specified in the <code>MergeShards</code> request.
 * </p>
 * <p>
 * If you try to operate on too many streams in parallel using
 * CreateStream, DeleteStream, <code>MergeShards</code> or SplitShard,
 * you will receive a <code>LimitExceededException</code> .
 * </p>
 * <p>
 * <code>MergeShards</code> has limit of 5 transactions per second per
 * account.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#mergeShards(MergeShardsRequest)
 */
public class MergeShardsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream for the merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String shardToMerge;

    /**
     * The shard ID of the adjacent shard for the merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String adjacentShardToMerge;

    /**
     * The name of the stream for the merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream for the merge.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream for the merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream for the merge.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream for the merge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream for the merge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MergeShardsRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID of the shard to combine with the adjacent shard for the
     *         merge.
     */
    public String getShardToMerge() {
        return shardToMerge;
    }
    
    /**
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToMerge The shard ID of the shard to combine with the adjacent shard for the
     *         merge.
     */
    public void setShardToMerge(String shardToMerge) {
        this.shardToMerge = shardToMerge;
    }
    
    /**
     * The shard ID of the shard to combine with the adjacent shard for the
     * merge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param shardToMerge The shard ID of the shard to combine with the adjacent shard for the
     *         merge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MergeShardsRequest withShardToMerge(String shardToMerge) {
        this.shardToMerge = shardToMerge;
        return this;
    }

    /**
     * The shard ID of the adjacent shard for the merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID of the adjacent shard for the merge.
     */
    public String getAdjacentShardToMerge() {
        return adjacentShardToMerge;
    }
    
    /**
     * The shard ID of the adjacent shard for the merge.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentShardToMerge The shard ID of the adjacent shard for the merge.
     */
    public void setAdjacentShardToMerge(String adjacentShardToMerge) {
        this.adjacentShardToMerge = adjacentShardToMerge;
    }
    
    /**
     * The shard ID of the adjacent shard for the merge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param adjacentShardToMerge The shard ID of the adjacent shard for the merge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public MergeShardsRequest withAdjacentShardToMerge(String adjacentShardToMerge) {
        this.adjacentShardToMerge = adjacentShardToMerge;
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
        if (getShardToMerge() != null) sb.append("ShardToMerge: " + getShardToMerge() + ",");
        if (getAdjacentShardToMerge() != null) sb.append("AdjacentShardToMerge: " + getAdjacentShardToMerge() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getShardToMerge() == null) ? 0 : getShardToMerge().hashCode()); 
        hashCode = prime * hashCode + ((getAdjacentShardToMerge() == null) ? 0 : getAdjacentShardToMerge().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MergeShardsRequest == false) return false;
        MergeShardsRequest other = (MergeShardsRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getShardToMerge() == null ^ this.getShardToMerge() == null) return false;
        if (other.getShardToMerge() != null && other.getShardToMerge().equals(this.getShardToMerge()) == false) return false; 
        if (other.getAdjacentShardToMerge() == null ^ this.getAdjacentShardToMerge() == null) return false;
        if (other.getAdjacentShardToMerge() != null && other.getAdjacentShardToMerge().equals(this.getAdjacentShardToMerge()) == false) return false; 
        return true;
    }
    
}
    