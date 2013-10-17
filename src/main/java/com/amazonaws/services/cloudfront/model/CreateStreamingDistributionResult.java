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
public class CreateStreamingDistributionResult implements Serializable {

    /**
     * The streaming distribution's information.
     */
    private StreamingDistribution streamingDistribution;

    /**
     * The fully qualified URI of the new streaming distribution resource
     * just created. For example:
     * https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     */
    private String location;

    /**
     * The current version of the streaming distribution created.
     */
    private String eTag;

    /**
     * The streaming distribution's information.
     *
     * @return The streaming distribution's information.
     */
    public StreamingDistribution getStreamingDistribution() {
        return streamingDistribution;
    }
    
    /**
     * The streaming distribution's information.
     *
     * @param streamingDistribution The streaming distribution's information.
     */
    public void setStreamingDistribution(StreamingDistribution streamingDistribution) {
        this.streamingDistribution = streamingDistribution;
    }
    
    /**
     * The streaming distribution's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamingDistribution The streaming distribution's information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStreamingDistributionResult withStreamingDistribution(StreamingDistribution streamingDistribution) {
        this.streamingDistribution = streamingDistribution;
        return this;
    }

    /**
     * The fully qualified URI of the new streaming distribution resource
     * just created. For example:
     * https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     *
     * @return The fully qualified URI of the new streaming distribution resource
     *         just created. For example:
     *         https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The fully qualified URI of the new streaming distribution resource
     * just created. For example:
     * https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     *
     * @param location The fully qualified URI of the new streaming distribution resource
     *         just created. For example:
     *         https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The fully qualified URI of the new streaming distribution resource
     * just created. For example:
     * https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The fully qualified URI of the new streaming distribution resource
     *         just created. For example:
     *         https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStreamingDistributionResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * The current version of the streaming distribution created.
     *
     * @return The current version of the streaming distribution created.
     */
    public String getETag() {
        return eTag;
    }
    
    /**
     * The current version of the streaming distribution created.
     *
     * @param eTag The current version of the streaming distribution created.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }
    
    /**
     * The current version of the streaming distribution created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eTag The current version of the streaming distribution created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStreamingDistributionResult withETag(String eTag) {
        this.eTag = eTag;
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
        if (getStreamingDistribution() != null) sb.append("StreamingDistribution: " + getStreamingDistribution() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getETag() != null) sb.append("ETag: " + getETag() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamingDistribution() == null) ? 0 : getStreamingDistribution().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateStreamingDistributionResult == false) return false;
        CreateStreamingDistributionResult other = (CreateStreamingDistributionResult)obj;
        
        if (other.getStreamingDistribution() == null ^ this.getStreamingDistribution() == null) return false;
        if (other.getStreamingDistribution() != null && other.getStreamingDistribution().equals(this.getStreamingDistribution()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getETag() == null ^ this.getETag() == null) return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false) return false; 
        return true;
    }
    
}
    