/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class ListStreamingDistributionsResult implements Serializable {

    /**
     * The StreamingDistributionList type.
     */
    private StreamingDistributionList streamingDistributionList;

    /**
     * The StreamingDistributionList type.
     *
     * @return The StreamingDistributionList type.
     */
    public StreamingDistributionList getStreamingDistributionList() {
        return streamingDistributionList;
    }
    
    /**
     * The StreamingDistributionList type.
     *
     * @param streamingDistributionList The StreamingDistributionList type.
     */
    public void setStreamingDistributionList(StreamingDistributionList streamingDistributionList) {
        this.streamingDistributionList = streamingDistributionList;
    }
    
    /**
     * The StreamingDistributionList type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamingDistributionList The StreamingDistributionList type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStreamingDistributionsResult withStreamingDistributionList(StreamingDistributionList streamingDistributionList) {
        this.streamingDistributionList = streamingDistributionList;
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
        if (getStreamingDistributionList() != null) sb.append("StreamingDistributionList: " + getStreamingDistributionList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamingDistributionList() == null) ? 0 : getStreamingDistributionList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStreamingDistributionsResult == false) return false;
        ListStreamingDistributionsResult other = (ListStreamingDistributionsResult)obj;
        
        if (other.getStreamingDistributionList() == null ^ this.getStreamingDistributionList() == null) return false;
        if (other.getStreamingDistributionList() != null && other.getStreamingDistributionList().equals(this.getStreamingDistributionList()) == false) return false; 
        return true;
    }
    
}
    