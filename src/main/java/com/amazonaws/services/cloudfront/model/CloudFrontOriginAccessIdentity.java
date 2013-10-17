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
 * CloudFront origin access identity.
 * </p>
 */
public class CloudFrontOriginAccessIdentity implements Serializable {

    /**
     * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     */
    private String id;

    /**
     * The Amazon S3 canonical user ID for the origin access identity, which
     * you use when giving the origin access identity read permission to an
     * object in Amazon S3.
     */
    private String s3CanonicalUserId;

    /**
     * The current configuration information for the identity.
     */
    private CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

    /**
     * Default constructor for a new CloudFrontOriginAccessIdentity object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CloudFrontOriginAccessIdentity() {}
    
    /**
     * Constructs a new CloudFrontOriginAccessIdentity object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id The ID for the origin access identity. For example:
     * E74FTE3AJFJ256A.
     * @param s3CanonicalUserId The Amazon S3 canonical user ID for the
     * origin access identity, which you use when giving the origin access
     * identity read permission to an object in Amazon S3.
     */
    public CloudFrontOriginAccessIdentity(String id, String s3CanonicalUserId) {
        setId(id);
        setS3CanonicalUserId(s3CanonicalUserId);
    }

    /**
     * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     *
     * @return The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     *
     * @param id The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID for the origin access identity. For example: E74FTE3AJFJ256A.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CloudFrontOriginAccessIdentity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The Amazon S3 canonical user ID for the origin access identity, which
     * you use when giving the origin access identity read permission to an
     * object in Amazon S3.
     *
     * @return The Amazon S3 canonical user ID for the origin access identity, which
     *         you use when giving the origin access identity read permission to an
     *         object in Amazon S3.
     */
    public String getS3CanonicalUserId() {
        return s3CanonicalUserId;
    }
    
    /**
     * The Amazon S3 canonical user ID for the origin access identity, which
     * you use when giving the origin access identity read permission to an
     * object in Amazon S3.
     *
     * @param s3CanonicalUserId The Amazon S3 canonical user ID for the origin access identity, which
     *         you use when giving the origin access identity read permission to an
     *         object in Amazon S3.
     */
    public void setS3CanonicalUserId(String s3CanonicalUserId) {
        this.s3CanonicalUserId = s3CanonicalUserId;
    }
    
    /**
     * The Amazon S3 canonical user ID for the origin access identity, which
     * you use when giving the origin access identity read permission to an
     * object in Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3CanonicalUserId The Amazon S3 canonical user ID for the origin access identity, which
     *         you use when giving the origin access identity read permission to an
     *         object in Amazon S3.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CloudFrontOriginAccessIdentity withS3CanonicalUserId(String s3CanonicalUserId) {
        this.s3CanonicalUserId = s3CanonicalUserId;
        return this;
    }

    /**
     * The current configuration information for the identity.
     *
     * @return The current configuration information for the identity.
     */
    public CloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
        return cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The current configuration information for the identity.
     *
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the identity.
     */
    public void setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }
    
    /**
     * The current configuration information for the identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the identity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CloudFrontOriginAccessIdentity withCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getS3CanonicalUserId() != null) sb.append("S3CanonicalUserId: " + getS3CanonicalUserId() + ",");
        if (getCloudFrontOriginAccessIdentityConfig() != null) sb.append("CloudFrontOriginAccessIdentityConfig: " + getCloudFrontOriginAccessIdentityConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getS3CanonicalUserId() == null) ? 0 : getS3CanonicalUserId().hashCode()); 
        hashCode = prime * hashCode + ((getCloudFrontOriginAccessIdentityConfig() == null) ? 0 : getCloudFrontOriginAccessIdentityConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CloudFrontOriginAccessIdentity == false) return false;
        CloudFrontOriginAccessIdentity other = (CloudFrontOriginAccessIdentity)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getS3CanonicalUserId() == null ^ this.getS3CanonicalUserId() == null) return false;
        if (other.getS3CanonicalUserId() != null && other.getS3CanonicalUserId().equals(this.getS3CanonicalUserId()) == false) return false; 
        if (other.getCloudFrontOriginAccessIdentityConfig() == null ^ this.getCloudFrontOriginAccessIdentityConfig() == null) return false;
        if (other.getCloudFrontOriginAccessIdentityConfig() != null && other.getCloudFrontOriginAccessIdentityConfig().equals(this.getCloudFrontOriginAccessIdentityConfig()) == false) return false; 
        return true;
    }
    
}
    