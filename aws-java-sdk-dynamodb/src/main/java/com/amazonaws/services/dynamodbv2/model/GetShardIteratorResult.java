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

/**
 * <p>
 * Represents the output of a <code>GetShardIterator</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/GetShardIterator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetShardIteratorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies
     * this position using the sequence number of a stream record in a shard.
     * </p>
     */
    private String shardIterator;

    /**
     * <p>
     * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies
     * this position using the sequence number of a stream record in a shard.
     * </p>
     * 
     * @param shardIterator
     *        The position in the shard from which to start reading stream records sequentially. A shard iterator
     *        specifies this position using the sequence number of a stream record in a shard.
     */

    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }

    /**
     * <p>
     * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies
     * this position using the sequence number of a stream record in a shard.
     * </p>
     * 
     * @return The position in the shard from which to start reading stream records sequentially. A shard iterator
     *         specifies this position using the sequence number of a stream record in a shard.
     */

    public String getShardIterator() {
        return this.shardIterator;
    }

    /**
     * <p>
     * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies
     * this position using the sequence number of a stream record in a shard.
     * </p>
     * 
     * @param shardIterator
     *        The position in the shard from which to start reading stream records sequentially. A shard iterator
     *        specifies this position using the sequence number of a stream record in a shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShardIteratorResult withShardIterator(String shardIterator) {
        setShardIterator(shardIterator);
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
        if (getShardIterator() != null)
            sb.append("ShardIterator: ").append(getShardIterator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShardIteratorResult == false)
            return false;
        GetShardIteratorResult other = (GetShardIteratorResult) obj;
        if (other.getShardIterator() == null ^ this.getShardIterator() == null)
            return false;
        if (other.getShardIterator() != null && other.getShardIterator().equals(this.getShardIterator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardIterator() == null) ? 0 : getShardIterator().hashCode());
        return hashCode;
    }

    @Override
    public GetShardIteratorResult clone() {
        try {
            return (GetShardIteratorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
