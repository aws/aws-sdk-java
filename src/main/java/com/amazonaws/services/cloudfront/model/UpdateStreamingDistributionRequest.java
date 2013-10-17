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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#updateStreamingDistribution(UpdateStreamingDistributionRequest) UpdateStreamingDistribution operation}.
 * <p>
 * Update a streaming distribution.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#updateStreamingDistribution(UpdateStreamingDistributionRequest)
 */
public class UpdateStreamingDistributionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The streaming distribution's configuration information.
     */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * The streaming distribution's id.
     */
    private String id;

    /**
     * The value of the ETag header you received when retrieving the
     * streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     */
    private String ifMatch;

    /**
     * Default constructor for a new UpdateStreamingDistributionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateStreamingDistributionRequest() {}
    
    /**
     * Constructs a new UpdateStreamingDistributionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param streamingDistributionConfig The streaming distribution's
     * configuration information.
     * @param id The streaming distribution's id.
     * @param ifMatch The value of the ETag header you received when
     * retrieving the streaming distribution's configuration. For example:
     * E2QWRUHAPOMQZL.
     */
    public UpdateStreamingDistributionRequest(StreamingDistributionConfig streamingDistributionConfig, String id, String ifMatch) {
        setStreamingDistributionConfig(streamingDistributionConfig);
        setId(id);
        setIfMatch(ifMatch);
    }

    /**
     * The streaming distribution's configuration information.
     *
     * @return The streaming distribution's configuration information.
     */
    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return streamingDistributionConfig;
    }
    
    /**
     * The streaming distribution's configuration information.
     *
     * @param streamingDistributionConfig The streaming distribution's configuration information.
     */
    public void setStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }
    
    /**
     * The streaming distribution's configuration information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamingDistributionConfig The streaming distribution's configuration information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateStreamingDistributionRequest withStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
        return this;
    }

    /**
     * The streaming distribution's id.
     *
     * @return The streaming distribution's id.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The streaming distribution's id.
     *
     * @param id The streaming distribution's id.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The streaming distribution's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The streaming distribution's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateStreamingDistributionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The value of the ETag header you received when retrieving the
     * streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @return The value of the ETag header you received when retrieving the
     *         streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    
    /**
     * The value of the ETag header you received when retrieving the
     * streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @param ifMatch The value of the ETag header you received when retrieving the
     *         streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }
    
    /**
     * The value of the ETag header you received when retrieving the
     * streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ifMatch The value of the ETag header you received when retrieving the
     *         streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateStreamingDistributionRequest withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
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
        if (getStreamingDistributionConfig() != null) sb.append("StreamingDistributionConfig: " + getStreamingDistributionConfig() + ",");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null) sb.append("IfMatch: " + getIfMatch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamingDistributionConfig() == null) ? 0 : getStreamingDistributionConfig().hashCode()); 
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateStreamingDistributionRequest == false) return false;
        UpdateStreamingDistributionRequest other = (UpdateStreamingDistributionRequest)obj;
        
        if (other.getStreamingDistributionConfig() == null ^ this.getStreamingDistributionConfig() == null) return false;
        if (other.getStreamingDistributionConfig() != null && other.getStreamingDistributionConfig().equals(this.getStreamingDistributionConfig()) == false) return false; 
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getIfMatch() == null ^ this.getIfMatch() == null) return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false) return false; 
        return true;
    }
    
}
    