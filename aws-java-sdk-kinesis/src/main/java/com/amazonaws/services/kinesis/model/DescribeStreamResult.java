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

/**
 * <p>
 * Represents the output for <code>DescribeStream</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise
     * the stream, and whether there are more shards available.
     * </p>
     */
    private StreamDescription streamDescription;

    /**
     * <p>
     * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise
     * the stream, and whether there are more shards available.
     * </p>
     * 
     * @param streamDescription
     *        The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that
     *        comprise the stream, and whether there are more shards available.
     */

    public void setStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
    }

    /**
     * <p>
     * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise
     * the stream, and whether there are more shards available.
     * </p>
     * 
     * @return The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that
     *         comprise the stream, and whether there are more shards available.
     */

    public StreamDescription getStreamDescription() {
        return this.streamDescription;
    }

    /**
     * <p>
     * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise
     * the stream, and whether there are more shards available.
     * </p>
     * 
     * @param streamDescription
     *        The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that
     *        comprise the stream, and whether there are more shards available.
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
