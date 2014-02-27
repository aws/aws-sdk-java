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
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#deleteStream(DeleteStreamRequest) DeleteStream operation}.
 * <p>
 * This operation deletes a stream and all of its shards and data. You
 * must shut down any applications that are operating on the stream
 * before you delete the stream. If an application attempts to operate on
 * a deleted stream, it will receive the exception
 * <code>ResourceNotFoundException</code> .
 * </p>
 * <p>
 * If the stream is in the ACTIVE state, you can delete it. After a
 * <code>DeleteStream</code> request, the specified stream is in the
 * DELETING state until Amazon Kinesis completes the deletion.
 * </p>
 * <p>
 * <b>Note:</b> Amazon Kinesis might continue to accept data read and
 * write operations, such as PutRecord and GetRecords, on a stream in the
 * DELETING state until the stream deletion is complete.
 * </p>
 * <p>
 * When you delete a stream, any shards in that stream are also deleted.
 * </p>
 * <p>
 * You can use the DescribeStream operation to check the state of the
 * stream, which is returned in <code>StreamStatus</code> .
 * </p>
 * <p>
 * <code>DeleteStream</code> has a limit of 5 transactions per second
 * per account.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#deleteStream(DeleteStreamRequest)
 */
public class DeleteStreamRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the stream to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * The name of the stream to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream to delete.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the stream to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to delete.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the stream to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName The name of the stream to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
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
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteStreamRequest == false) return false;
        DeleteStreamRequest other = (DeleteStreamRequest)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        return true;
    }
    
}
    