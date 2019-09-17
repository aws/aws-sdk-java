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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <code>SplitShard</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/SplitShard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SplitShardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     */
    private String shardToSplit;
    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range
     * for a given shard constitutes a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     * <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are distributed
     * to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
     * </p>
     */
    private String newStartingHashKey;

    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for the shard split.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     * 
     * @return The name of the stream for the shard split.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for the shard split.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for the shard split.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplitShardRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * 
     * @param shardToSplit
     *        The shard ID of the shard to split.
     */

    public void setShardToSplit(String shardToSplit) {
        this.shardToSplit = shardToSplit;
    }

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * 
     * @return The shard ID of the shard to split.
     */

    public String getShardToSplit() {
        return this.shardToSplit;
    }

    /**
     * <p>
     * The shard ID of the shard to split.
     * </p>
     * 
     * @param shardToSplit
     *        The shard ID of the shard to split.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplitShardRequest withShardToSplit(String shardToSplit) {
        setShardToSplit(shardToSplit);
        return this;
    }

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range
     * for a given shard constitutes a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     * <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are distributed
     * to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
     * </p>
     * 
     * @param newStartingHashKey
     *        A hash key value for the starting hash key of one of the child shards created by the split. The hash key
     *        range for a given shard constitutes a set of ordered contiguous positive integers. The value for
     *        <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     *        <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are
     *        distributed to one of the child shards. All the lower hash key values in the range are distributed to the
     *        other child shard.
     */

    public void setNewStartingHashKey(String newStartingHashKey) {
        this.newStartingHashKey = newStartingHashKey;
    }

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range
     * for a given shard constitutes a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     * <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are distributed
     * to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
     * </p>
     * 
     * @return A hash key value for the starting hash key of one of the child shards created by the split. The hash key
     *         range for a given shard constitutes a set of ordered contiguous positive integers. The value for
     *         <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     *         <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are
     *         distributed to one of the child shards. All the lower hash key values in the range are distributed to the
     *         other child shard.
     */

    public String getNewStartingHashKey() {
        return this.newStartingHashKey;
    }

    /**
     * <p>
     * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range
     * for a given shard constitutes a set of ordered contiguous positive integers. The value for
     * <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     * <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are distributed
     * to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
     * </p>
     * 
     * @param newStartingHashKey
     *        A hash key value for the starting hash key of one of the child shards created by the split. The hash key
     *        range for a given shard constitutes a set of ordered contiguous positive integers. The value for
     *        <code>NewStartingHashKey</code> must be in the range of hash keys being mapped into the shard. The
     *        <code>NewStartingHashKey</code> hash key value and all higher hash key values in hash key range are
     *        distributed to one of the child shards. All the lower hash key values in the range are distributed to the
     *        other child shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplitShardRequest withNewStartingHashKey(String newStartingHashKey) {
        setNewStartingHashKey(newStartingHashKey);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getShardToSplit() != null)
            sb.append("ShardToSplit: ").append(getShardToSplit()).append(",");
        if (getNewStartingHashKey() != null)
            sb.append("NewStartingHashKey: ").append(getNewStartingHashKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplitShardRequest == false)
            return false;
        SplitShardRequest other = (SplitShardRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardToSplit() == null ^ this.getShardToSplit() == null)
            return false;
        if (other.getShardToSplit() != null && other.getShardToSplit().equals(this.getShardToSplit()) == false)
            return false;
        if (other.getNewStartingHashKey() == null ^ this.getNewStartingHashKey() == null)
            return false;
        if (other.getNewStartingHashKey() != null && other.getNewStartingHashKey().equals(this.getNewStartingHashKey()) == false)
            return false;
        return true;
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
    public SplitShardRequest clone() {
        return (SplitShardRequest) super.clone();
    }

}
