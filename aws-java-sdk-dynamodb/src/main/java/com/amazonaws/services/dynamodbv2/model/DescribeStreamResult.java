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
 * Represents the output of a <code>DescribeStream</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/DescribeStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complete description of the stream, including its creation date and time, the DynamoDB table associated with
     * the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records
     * within the shards.
     * </p>
     */
    private StreamDescription streamDescription;

    /**
     * <p>
     * A complete description of the stream, including its creation date and time, the DynamoDB table associated with
     * the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records
     * within the shards.
     * </p>
     * 
     * @param streamDescription
     *        A complete description of the stream, including its creation date and time, the DynamoDB table associated
     *        with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream
     *        records within the shards.
     */

    public void setStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
    }

    /**
     * <p>
     * A complete description of the stream, including its creation date and time, the DynamoDB table associated with
     * the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records
     * within the shards.
     * </p>
     * 
     * @return A complete description of the stream, including its creation date and time, the DynamoDB table associated
     *         with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream
     *         records within the shards.
     */

    public StreamDescription getStreamDescription() {
        return this.streamDescription;
    }

    /**
     * <p>
     * A complete description of the stream, including its creation date and time, the DynamoDB table associated with
     * the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records
     * within the shards.
     * </p>
     * 
     * @param streamDescription
     *        A complete description of the stream, including its creation date and time, the DynamoDB table associated
     *        with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream
     *        records within the shards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamResult withStreamDescription(StreamDescription streamDescription) {
        setStreamDescription(streamDescription);
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
        if (getStreamDescription() != null)
            sb.append("StreamDescription: ").append(getStreamDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamResult == false)
            return false;
        DescribeStreamResult other = (DescribeStreamResult) obj;
        if (other.getStreamDescription() == null ^ this.getStreamDescription() == null)
            return false;
        if (other.getStreamDescription() != null && other.getStreamDescription().equals(this.getStreamDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamDescription() == null) ? 0 : getStreamDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamResult clone() {
        try {
            return (DescribeStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
