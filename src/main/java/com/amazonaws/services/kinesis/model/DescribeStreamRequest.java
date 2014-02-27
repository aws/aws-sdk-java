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
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#describeStream(DescribeStreamRequest) DescribeStream operation}.
 * <p>
 * This operation returns the following information about the stream: the
 * current status of the stream, the stream Amazon Resource Name (ARN),
 * and an array of shard objects that comprise the stream. For each shard
 * object there is information about the hash key and sequence number
 * ranges that the shard spans, and the IDs of any earlier shards that
 * played in a role in a MergeShards or SplitShard operation that created
 * the shard. A sequence number is the identifier associated with every
 * record ingested in the Amazon Kinesis stream. The sequence number is
 * assigned by the Amazon Kinesis service when a record is put into the
 * stream.
 * </p>
 * <p>
 * You can limit the number of returned shards using the
 * <code>Limit</code> parameter. The number of shards in a stream may be
 * too large to return from a single call to <code>DescribeStream</code>
 * .
 * You can detect this by using the
 * <code>HasMoreShards</code> flag in the returned output.
 * <code>HasMoreShards</code> is set to <code>true</code> when there is
 * more data available.
 * </p>
 * <p>
 * If there are more shards available, you can request more shards by
 * using the shard ID of the last shard returned by the
 * <code>DescribeStream</code> request, in the
 * <code>ExclusiveStartShardId</code> parameter in a subsequent request
 * to <code>DescribeStream</code> .
 * 
 * <code>DescribeStream</code> is a paginated
 * operation.
 * </p>
 * <p>
 * <code>DescribeStream</code> has a limit of 10 transactions per second
 * per account.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#describeStream(DescribeStreamRequest)
 */
public class DescribeStreamRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The maximum number of shards to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * The shard ID of the shard to start with for the stream description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String exclusiveStartShardId;

    /**
     * The name of the stream to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream to describe.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to describe.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The maximum number of shards to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of shards to return.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of shards to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of shards to return.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of shards to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of shards to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStreamRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * The shard ID of the shard to start with for the stream description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The shard ID of the shard to start with for the stream description.
     */
    public String getExclusiveStartShardId() {
        return exclusiveStartShardId;
    }
    
    /**
     * The shard ID of the shard to start with for the stream description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartShardId The shard ID of the shard to start with for the stream description.
     */
    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }
    
    /**
     * The shard ID of the shard to start with for the stream description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartShardId The shard ID of the shard to start with for the stream description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStreamRequest withExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
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
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartShardId() != null) sb.append("ExclusiveStartShardId: " + getExclusiveStartShardId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartShardId() == null) ? 0 : getExclusiveStartShardId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStreamRequest == false) return false;
        DescribeStreamRequest other = (DescribeStreamRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getExclusiveStartShardId() == null ^ this.getExclusiveStartShardId() == null) return false;
        if (other.getExclusiveStartShardId() != null && other.getExclusiveStartShardId().equals(this.getExclusiveStartShardId()) == false) return false; 
        return true;
    }
    
}
    