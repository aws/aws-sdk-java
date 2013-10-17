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
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest) UpdateCloudFrontOriginAccessIdentity operation}.
 * <p>
 * Update an origin access identity.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest)
 */
public class UpdateCloudFrontOriginAccessIdentityRequest extends AmazonWebServiceRequest implements Serializable {

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
        setCloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig);
        setId(id);
        setIfMatch(ifMatch);
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
        if (getCloudFrontOriginAccessIdentityConfig() != null) sb.append("CloudFrontOriginAccessIdentityConfig: " + getCloudFrontOriginAccessIdentityConfig() + ",");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null) sb.append("IfMatch: " + getIfMatch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCloudFrontOriginAccessIdentityConfig() == null) ? 0 : getCloudFrontOriginAccessIdentityConfig().hashCode()); 
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateCloudFrontOriginAccessIdentityRequest == false) return false;
        UpdateCloudFrontOriginAccessIdentityRequest other = (UpdateCloudFrontOriginAccessIdentityRequest)obj;
        
        if (other.getCloudFrontOriginAccessIdentityConfig() == null ^ this.getCloudFrontOriginAccessIdentityConfig() == null) return false;
        if (other.getCloudFrontOriginAccessIdentityConfig() != null && other.getCloudFrontOriginAccessIdentityConfig().equals(this.getCloudFrontOriginAccessIdentityConfig()) == false) return false; 
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getIfMatch() == null ^ this.getIfMatch() == null) return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false) return false; 
        return true;
    }
    
}
    