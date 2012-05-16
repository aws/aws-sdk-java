/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront_2012_03_152012_03_15AmazonCloudFront#createDistribution(CreateDistributionRequest) CreateDistribution operation}.
 * <p>
 * Create a new distribution.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront_2012_03_152012_03_15AmazonCloudFront#createDistribution(CreateDistributionRequest)
 */
public class CreateDistributionRequest extends AmazonWebServiceRequest {

    /**
     * The distribution's configuration information.
     */
    private DistributionConfig distributionConfig;

    /**
     * Default constructor for a new CreateDistributionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDistributionRequest() {}
    
    /**
     * Constructs a new CreateDistributionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param distributionConfig The distribution's configuration
     * information.
     */
    public CreateDistributionRequest(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
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
    public CreateDistributionRequest withDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
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
        if (distributionConfig != null) sb.append("DistributionConfig: " + distributionConfig + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateDistributionRequest == false) return false;
        CreateDistributionRequest other = (CreateDistributionRequest)obj;
        
        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null) return false;
        if (other.getDistributionConfig() != null && other.getDistributionConfig().equals(this.getDistributionConfig()) == false) return false; 
        return true;
    }
    
}
    
