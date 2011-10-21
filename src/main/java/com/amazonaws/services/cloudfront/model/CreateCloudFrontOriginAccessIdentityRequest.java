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
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest) CreateCloudFrontOriginAccessIdentity operation}.
 * <p>
 * Create a new origin access identity.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest)
 */
public class CreateCloudFrontOriginAccessIdentityRequest extends AmazonWebServiceRequest {

    /**
     * The origin access identity's configuration information.
     */
    private CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

    /**
     * Default constructor for a new CreateCloudFrontOriginAccessIdentityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCloudFrontOriginAccessIdentityRequest() {}
    
    /**
     * Constructs a new CreateCloudFrontOriginAccessIdentityRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cloudFrontOriginAccessIdentityConfig The origin access
     * identity's configuration information.
     */
    public CreateCloudFrontOriginAccessIdentityRequest(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The origin access identity's configuration information.
     *
     * @return The origin access identity's configuration information.
     */
    public CloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
        return cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The origin access identity's configuration information.
     *
     * @param cloudFrontOriginAccessIdentityConfig The origin access identity's configuration information.
     */
    public void setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The origin access identity's configuration information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudFrontOriginAccessIdentityConfig The origin access identity's configuration information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCloudFrontOriginAccessIdentityRequest withCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
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
        sb.append("CloudFrontOriginAccessIdentityConfig: " + cloudFrontOriginAccessIdentityConfig + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    