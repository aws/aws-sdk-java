/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#createStreamingDistribution(CreateStreamingDistributionRequest) CreateStreamingDistribution operation}.
 * <p>
 * Create a new streaming distribution.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#createStreamingDistribution(CreateStreamingDistributionRequest)
 */
public class CreateStreamingDistributionRequest extends AmazonWebServiceRequest {

    /**
     * The streaming distribution's configuration information.
     */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * Default constructor for a new CreateStreamingDistributionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateStreamingDistributionRequest() {}
    
    /**
     * Constructs a new CreateStreamingDistributionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param streamingDistributionConfig The streaming distribution's
     * configuration information.
     */
    public CreateStreamingDistributionRequest(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
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
    public CreateStreamingDistributionRequest withStreamingDistributionConfig(StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
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
        sb.append("StreamingDistributionConfig: " + streamingDistributionConfig + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    