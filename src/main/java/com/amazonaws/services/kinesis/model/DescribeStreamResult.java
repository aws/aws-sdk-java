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

/**
 * <p>
 * Represents the output of a <code>DescribeStream</code> operation.
 * </p>
 */
public class DescribeStreamResult implements Serializable {

    /**
     * Contains the current status of the stream, the stream ARN, an array of
     * shard objects that comprise the stream, and states whether there are
     * more shards available.
     */
    private StreamDescription streamDescription;

    /**
     * Contains the current status of the stream, the stream ARN, an array of
     * shard objects that comprise the stream, and states whether there are
     * more shards available.
     *
     * @return Contains the current status of the stream, the stream ARN, an array of
     *         shard objects that comprise the stream, and states whether there are
     *         more shards available.
     */
    public StreamDescription getStreamDescription() {
        return streamDescription;
    }
    
    /**
     * Contains the current status of the stream, the stream ARN, an array of
     * shard objects that comprise the stream, and states whether there are
     * more shards available.
     *
     * @param streamDescription Contains the current status of the stream, the stream ARN, an array of
     *         shard objects that comprise the stream, and states whether there are
     *         more shards available.
     */
    public void setStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
    }
    
    /**
     * Contains the current status of the stream, the stream ARN, an array of
     * shard objects that comprise the stream, and states whether there are
     * more shards available.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamDescription Contains the current status of the stream, the stream ARN, an array of
     *         shard objects that comprise the stream, and states whether there are
     *         more shards available.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStreamResult withStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
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
        if (getStreamDescription() != null) sb.append("StreamDescription: " + getStreamDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamDescription() == null) ? 0 : getStreamDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStreamResult == false) return false;
        DescribeStreamResult other = (DescribeStreamResult)obj;
        
        if (other.getStreamDescription() == null ^ this.getStreamDescription() == null) return false;
        if (other.getStreamDescription() != null && other.getStreamDescription().equals(this.getStreamDescription()) == false) return false; 
        return true;
    }
    
}
    