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
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest) UpdateCloudFrontOriginAccessIdentity operation}.
 * <p>
 * Update an origin access identity.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest)
 */
public class UpdateCloudFrontOriginAccessIdentityRequest extends AmazonWebServiceRequest {

    /**
     * The identity's configuration information.
     */
    private CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

    /**
     * The identity's id.
     */
    private String id;

    /**
     * The value of the ETag header you received when retrieving the
     * identity's configuration. For example: E2QWRUHAPOMQZL.
     */
    private String ifMatch;

    /**
     * Default constructor for a new UpdateCloudFrontOriginAccessIdentityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateCloudFrontOriginAccessIdentityRequest() {}
    
    /**
     * Constructs a new UpdateCloudFrontOriginAccessIdentityRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cloudFrontOriginAccessIdentityConfig The identity's
     * configuration information.
     * @param id The identity's id.
     * @param ifMatch The value of the ETag header you received when
     * retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
     */
    public UpdateCloudFrontOriginAccessIdentityRequest(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig, String id, String ifMatch) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
        this.id = id;
        this.ifMatch = ifMatch;
    }

    
    
    /**
     * The identity's configuration information.
     *
     * @return The identity's configuration information.
     */
    public CloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
        return cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The identity's configuration information.
     *
     * @param cloudFrontOriginAccessIdentityConfig The identity's configuration information.
     */
    public void setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The identity's configuration information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudFrontOriginAccessIdentityConfig The identity's configuration information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateCloudFrontOriginAccessIdentityRequest withCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
        return this;
    }
    
    
    /**
     * The identity's id.
     *
     * @return The identity's id.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identity's id.
     *
     * @param id The identity's id.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identity's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The identity's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateCloudFrontOriginAccessIdentityRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * The value of the ETag header you received when retrieving the
     * identity's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @return The value of the ETag header you received when retrieving the
     *         identity's configuration. For example: E2QWRUHAPOMQZL.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    
    /**
     * The value of the ETag header you received when retrieving the
     * identity's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @param ifMatch The value of the ETag header you received when retrieving the
     *         identity's configuration. For example: E2QWRUHAPOMQZL.
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }
    
    /**
     * The value of the ETag header you received when retrieving the
     * identity's configuration. For example: E2QWRUHAPOMQZL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ifMatch The value of the ETag header you received when retrieving the
     *         identity's configuration. For example: E2QWRUHAPOMQZL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateCloudFrontOriginAccessIdentityRequest withIfMatch(String ifMatch) {
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
        sb.append("CloudFrontOriginAccessIdentityConfig: " + cloudFrontOriginAccessIdentityConfig + ", ");
        sb.append("Id: " + id + ", ");
        sb.append("IfMatch: " + ifMatch + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    