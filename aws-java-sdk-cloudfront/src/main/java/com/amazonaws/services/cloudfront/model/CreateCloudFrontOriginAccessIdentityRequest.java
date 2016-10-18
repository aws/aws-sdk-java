/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request to create a new origin access identity.
 * </p>
 */
public class CreateCloudFrontOriginAccessIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     */
    private CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

    /**
     * Default constructor for CreateCloudFrontOriginAccessIdentityRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating it.
     */
    public CreateCloudFrontOriginAccessIdentityRequest() {
    }

    /**
     * Constructs a new CreateCloudFrontOriginAccessIdentityRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param cloudFrontOriginAccessIdentityConfig
     *        The current configuration information for the identity.
     */
    public CreateCloudFrontOriginAccessIdentityRequest(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        setCloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig);
    }

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     * 
     * @param cloudFrontOriginAccessIdentityConfig
     *        The current configuration information for the identity.
     */

    public void setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     * 
     * @return The current configuration information for the identity.
     */

    public CloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
        return this.cloudFrontOriginAccessIdentityConfig;
    }

    /**
     * <p>
     * The current configuration information for the identity.
     * </p>
     * 
     * @param cloudFrontOriginAccessIdentityConfig
     *        The current configuration information for the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFrontOriginAccessIdentityRequest withCloudFrontOriginAccessIdentityConfig(
            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        setCloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCloudFrontOriginAccessIdentityConfig() != null)
            sb.append("CloudFrontOriginAccessIdentityConfig: " + getCloudFrontOriginAccessIdentityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFrontOriginAccessIdentityRequest == false)
            return false;
        CreateCloudFrontOriginAccessIdentityRequest other = (CreateCloudFrontOriginAccessIdentityRequest) obj;
        if (other.getCloudFrontOriginAccessIdentityConfig() == null ^ this.getCloudFrontOriginAccessIdentityConfig() == null)
            return false;
        if (other.getCloudFrontOriginAccessIdentityConfig() != null
                && other.getCloudFrontOriginAccessIdentityConfig().equals(this.getCloudFrontOriginAccessIdentityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFrontOriginAccessIdentityConfig() == null) ? 0 : getCloudFrontOriginAccessIdentityConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFrontOriginAccessIdentityRequest clone() {
        return (CreateCloudFrontOriginAccessIdentityRequest) super.clone();
    }
}
