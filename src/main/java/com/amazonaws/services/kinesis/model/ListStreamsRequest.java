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
 * Container for the parameters to the {@link com.amazonaws.services.kinesis.AmazonKinesis#listStreams(ListStreamsRequest) ListStreams operation}.
 * <p>
 * This operation returns an array of the names of all the streams that
 * are associated with the AWS account making the
 * <code>ListStreams</code> request. A given AWS account can have many
 * streams active at one time.
 * </p>
 * <p>
 * The number of streams may be too large to return from a single call
 * to <code>ListStreams</code> .
 * You can limit the number of returned streams using the
 * <code>Limit</code> parameter. If you do not specify a value for the
 * <code>Limit</code> parameter, Amazon Kinesis uses the default limit,
 * which is currently 10.
 * </p>
 * <p>
 * You can detect if there are more streams available to list by using
 * the <code>HasMoreStreams</code> flag from the returned output. If
 * there are more streams available, you can request more streams by
 * using the name of the last stream returned by the
 * <code>ListStreams</code> request in the
 * <code>ExclusiveStartStreamName</code> parameter in a subsequent
 * request to <code>ListStreams</code> .
 * The group of stream names returned by the subsequent
 * request is then added to the list. You can continue this process until
 * all the stream names have been collected in the list.
 * </p>
 * <p>
 * <code>ListStreams</code> has a limit of 5 transactions per second per
 * account.
 * </p>
 *
 * @see com.amazonaws.services.kinesis.AmazonKinesis#listStreams(ListStreamsRequest)
 */
public class ListStreamsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The maximum number of streams to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * The name of the stream to start the list with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String exclusiveStartStreamName;

    /**
     * The maximum number of streams to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of streams to list.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of streams to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of streams to list.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of streams to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of streams to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStreamsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * The name of the stream to start the list with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the stream to start the list with.
     */
    public String getExclusiveStartStreamName() {
        return exclusiveStartStreamName;
    }
    
    /**
     * The name of the stream to start the list with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartStreamName The name of the stream to start the list with.
     */
    public void setExclusiveStartStreamName(String exclusiveStartStreamName) {
        this.exclusiveStartStreamName = exclusiveStartStreamName;
    }
    
    /**
     * The name of the stream to start the list with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartStreamName The name of the stream to start the list with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStreamsRequest withExclusiveStartStreamName(String exclusiveStartStreamName) {
        this.exclusiveStartStreamName = exclusiveStartStreamName;
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
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartStreamName() != null) sb.append("ExclusiveStartStreamName: " + getExclusiveStartStreamName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartStreamName() == null) ? 0 : getExclusiveStartStreamName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStreamsRequest == false) return false;
        ListStreamsRequest other = (ListStreamsRequest)obj;
        
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getExclusiveStartStreamName() == null ^ this.getExclusiveStartStreamName() == null) return false;
        if (other.getExclusiveStartStreamName() != null && other.getExclusiveStartStreamName().equals(this.getExclusiveStartStreamName()) == false) return false; 
        return true;
    }
    
}
    