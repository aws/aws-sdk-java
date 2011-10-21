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

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class CreateCloudFrontOriginAccessIdentityResult {

    /**
     * The origin access identity's information.
     */
    private CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity;

    /**
     * The fully qualified URI of the new origin access identity just
     * created. For example:
     * naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     */
    private String location;

    /**
     * The current version of the origin access identity created.
     */
    private String eTag;

    /**
     * The origin access identity's information.
     *
     * @return The origin access identity's information.
     */
    public CloudFrontOriginAccessIdentity getCloudFrontOriginAccessIdentity() {
        return cloudFrontOriginAccessIdentity;
    }
    
    /**
     * The origin access identity's information.
     *
     * @param cloudFrontOriginAccessIdentity The origin access identity's information.
     */
    public void setCloudFrontOriginAccessIdentity(CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
    }
    
    /**
     * The origin access identity's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudFrontOriginAccessIdentity The origin access identity's information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCloudFrontOriginAccessIdentityResult withCloudFrontOriginAccessIdentity(CloudFrontOriginAccessIdentity cloudFrontOriginAccessIdentity) {
        this.cloudFrontOriginAccessIdentity = cloudFrontOriginAccessIdentity;
        return this;
    }
    
    
    /**
     * The fully qualified URI of the new origin access identity just
     * created. For example:
     * naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     *
     * @return The fully qualified URI of the new origin access identity just
     *         created. For example:
     *         naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The fully qualified URI of the new origin access identity just
     * created. For example:
     * naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     *
     * @param location The fully qualified URI of the new origin access identity just
     *         created. For example:
     *         naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The fully qualified URI of the new origin access identity just
     * created. For example:
     * naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The fully qualified URI of the new origin access identity just
     *         created. For example:
     *         naws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCloudFrontOriginAccessIdentityResult withLocation(String location) {
        this.location = location;
        return this;
    }
    
    
    /**
     * The current version of the origin access identity created.
     *
     * @return The current version of the origin access identity created.
     */
    public String getETag() {
        return eTag;
    }
    
    /**
     * The current version of the origin access identity created.
     *
     * @param eTag The current version of the origin access identity created.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }
    
    /**
     * The current version of the origin access identity created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eTag The current version of the origin access identity created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCloudFrontOriginAccessIdentityResult withETag(String eTag) {
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
        sb.append("CloudFrontOriginAccessIdentity: " + cloudFrontOriginAccessIdentity + ", ");
        sb.append("Location: " + location + ", ");
        sb.append("ETag: " + eTag + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    