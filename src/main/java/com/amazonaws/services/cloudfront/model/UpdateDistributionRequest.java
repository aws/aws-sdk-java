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
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#updateDistribution(UpdateDistributionRequest) UpdateDistribution operation}.
 * <p>
 * Update a distribution.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#updateDistribution(UpdateDistributionRequest)
 */
public class UpdateDistributionRequest extends AmazonWebServiceRequest {

    /**
     * The distribution's configuration information.
     */
    private DistributionConfig distributionConfig;

    /**
     * The distribution's id.
     */
    private String id;

    /**
     * The value of the ETag header you received when retrieving the
     * distribution's configuration. For example: E2QWRUHAPOMQZL.
     */
    private String ifMatch;

    /**
     * Default constructor for a new UpdateDistributionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateDistributionRequest() {}
    
    /**
     * Constructs a new UpdateDistributionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param distributionConfig The distribution's configuration
     * information.
     * @param id The distribution's id.
     * @param ifMatch The value of the ETag header you received when
     * retrieving the distribution's configuration. For example:
     * E2QWRUHAPOMQZL.
     */
    public UpdateDistributionRequest(DistributionConfig distributionConfig, String id, String ifMatch) {
        this.distributionConfig = distributionConfig;
        this.id = id;
        this.ifMatch = ifMatch;
    }

    
    
    /**
     * The distribution's configuration information.
     *
     * @return The distribution's configuration information.
     */
    public DistributionConfig getDistributionConfig() {
        return distributionConfig;
    }
    
    /**
     * The distribution's configuration information.
     *
     * @param distributionConfig The distribution's configuration information.
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }
    
    /**
     * The distribution's configuration information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionConfig The distribution's configuration information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateDistributionRequest withDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
        return this;
    }
    
    
    /**
     * The distribution's id.
     *
     * @return The distribution's id.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The distribution's id.
     *
     * @param id The distribution's id.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The distribution's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The distribution's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateDistributionRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * The value of the ETag header you received when retrieving the
     * distribution's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @return The value of the ETag header you received when retrieving the
     *         distribution's configuration. For example: E2QWRUHAPOMQZL.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    
    /**
     * The value of the ETag header you received when retrieving the
     * distribution's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @param ifMatch The value of the ETag header you received when retrieving the
     *         distribution's configuration. For example: E2QWRUHAPOMQZL.
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }
    
    /**
     * The value of the ETag header you received when retrieving the
     * distribution's configuration. For example: E2QWRUHAPOMQZL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ifMatch The value of the ETag header you received when retrieving the
     *         distribution's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateDistributionRequest withIfMatch(String ifMatch) {
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
        sb.append("DistributionConfig: " + distributionConfig + ", ");
        sb.append("Id: " + id + ", ");
        sb.append("IfMatch: " + ifMatch + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    