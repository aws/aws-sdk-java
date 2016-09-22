/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <code>MergeShards</code>.
 * </p>
 */
public class MergeShardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the merge.
     * </p>
     */
    private String shardToMerge;
    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     */
    private String adjacentShardToMerge;

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for the merge.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * 
     * @return The name of the stream for the merge.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for the merge.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeShardsRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the merge.
     * </p>
     * 
     * @param shardToMerge
     *        The shard ID of the shard to combine with the adjacent shard for the merge.
     */

    public void setShardToMerge(String shardToMerge) {
        this.shardToMerge = shardToMerge;
    }

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the merge.
     * </p>
     * 
     * @return The shard ID of the shard to combine with the adjacent shard for the merge.
     */

    public String getShardToMerge() {
        return this.shardToMerge;
    }

    /**
     * <p>
     * The shard ID of the shard to combine with the adjacent shard for the merge.
     * </p>
     * 
     * @param shardToMerge
     *        The shard ID of the shard to combine with the adjacent shard for the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeShardsRequest withShardToMerge(String shardToMerge) {
        setShardToMerge(shardToMerge);
        return this;
    }

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * 
     * @param adjacentShardToMerge
     *        The shard ID of the adjacent shard for the merge.
     */

    public void setAdjacentShardToMerge(String adjacentShardToMerge) {
        this.adjacentShardToMerge = adjacentShardToMerge;
    }

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * 
     * @return The shard ID of the adjacent shard for the merge.
     */

    public String getAdjacentShardToMerge() {
        return this.adjacentShardToMerge;
    }

    /**
     * <p>
     * The shard ID of the adjacent shard for the merge.
     * </p>
     * 
     * @param adjacentShardToMerge
     *        The shard ID of the adjacent shard for the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeShardsRequest withAdjacentShardToMerge(String adjacentShardToMerge) {
        setAdjacentShardToMerge(adjacentShardToMerge);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getShardToMerge() != null)
            sb.append("ShardToMerge: " + getShardToMerge() + ",");
        if (getAdjacentShardToMerge() != null)
            sb.append("AdjacentShardToMerge: " + getAdjacentShardToMerge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeShardsRequest == false)
            return false;
        MergeShardsRequest other = (MergeShardsRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardToMerge() == null ^ this.getShardToMerge() == null)
            return false;
        if (other.getShardToMerge() != null && other.getShardToMerge().equals(this.getShardToMerge()) == false)
            return false;
        if (other.getAdjacentShardToMerge() == null ^ this.getAdjacentShardToMerge() == null)
            return false;
        if (other.getAdjacentShardToMerge() != null && other.getAdjacentShardToMerge().equals(this.getAdjacentShardToMerge()) == false)
            return false;
        return true;
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
    public MergeShardsRequest clone() {
        return (MergeShardsRequest) super.clone();
    }
}
