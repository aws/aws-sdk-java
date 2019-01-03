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
 * Represents the input of a <code>DescribeStream</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/DescribeStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The maximum number of shard objects to return. The upper limit is 100.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedShardId</code> in the previous operation.
     * </p>
     */
    private String exclusiveStartShardId;

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

    public DescribeStreamRequest withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of shard objects to return. The upper limit is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of shard objects to return. The upper limit is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of shard objects to return. The upper limit is 100.
     * </p>
     * 
     * @return The maximum number of shard objects to return. The upper limit is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of shard objects to return. The upper limit is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of shard objects to return. The upper limit is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedShardId</code> in the previous operation.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedShardId</code> in the previous operation.
     */

    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }

    /**
     * <p>
     * The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedShardId</code> in the previous operation.
     * </p>
     * 
     * @return The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     *         <code>LastEvaluatedShardId</code> in the previous operation.
     */

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    /**
     * <p>
     * The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     * <code>LastEvaluatedShardId</code> in the previous operation.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        The shard ID of the first item that this operation will evaluate. Use the value that was returned for
     *        <code>LastEvaluatedShardId</code> in the previous operation.
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
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
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
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

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartShardId() == null) ? 0 : getExclusiveStartShardId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamRequest clone() {
        return (DescribeStreamRequest) super.clone();
    }

}
