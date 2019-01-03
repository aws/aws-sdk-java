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
 * Represents the input for <code>DescribeStream</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater
     * than 100, at most 100 shards are returned.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     */
    private String exclusiveStartShardId;

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to describe.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     * 
     * @return The name of the stream to describe.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater
     * than 100, at most 100 shards are returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of shards to return in a single call. The default value is 100. If you specify a value
     *        greater than 100, at most 100 shards are returned.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater
     * than 100, at most 100 shards are returned.
     * </p>
     * 
     * @return The maximum number of shards to return in a single call. The default value is 100. If you specify a value
     *         greater than 100, at most 100 shards are returned.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater
     * than 100, at most 100 shards are returned.
     * </p>
     * 
     * @param limit
     *        The maximum number of shards to return in a single call. The default value is 100. If you specify a value
     *        greater than 100, at most 100 shards are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        The shard ID of the shard to start with.
     */

    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }

    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     * 
     * @return The shard ID of the shard to start with.
     */

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        The shard ID of the shard to start with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamRequest withExclusiveStartShardId(String exclusiveStartShardId) {
        setExclusiveStartShardId(exclusiveStartShardId);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getExclusiveStartShardId() != null)
            sb.append("ExclusiveStartShardId: ").append(getExclusiveStartShardId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamRequest == false)
            return false;
        DescribeStreamRequest other = (DescribeStreamRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartShardId() == null ^ this.getExclusiveStartShardId() == null)
            return false;
        if (other.getExclusiveStartShardId() != null && other.getExclusiveStartShardId().equals(this.getExclusiveStartShardId()) == false)
            return false;
        return true;
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
    public DescribeStreamRequest clone() {
        return (DescribeStreamRequest) super.clone();
    }

}
