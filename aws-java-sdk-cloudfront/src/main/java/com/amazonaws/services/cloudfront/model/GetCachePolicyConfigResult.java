/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicyConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCachePolicyConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The cache policy configuration.
     * </p>
     */
    private CachePolicyConfig cachePolicyConfig;
    /**
     * <p>
     * The current version of the cache policy.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The cache policy configuration.
     * </p>
     * 
     * @param cachePolicyConfig
     *        The cache policy configuration.
     */

    public void setCachePolicyConfig(CachePolicyConfig cachePolicyConfig) {
        this.cachePolicyConfig = cachePolicyConfig;
    }

    /**
     * <p>
     * The cache policy configuration.
     * </p>
     * 
     * @return The cache policy configuration.
     */

    public CachePolicyConfig getCachePolicyConfig() {
        return this.cachePolicyConfig;
    }

    /**
     * <p>
     * The cache policy configuration.
     * </p>
     * 
     * @param cachePolicyConfig
     *        The cache policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCachePolicyConfigResult withCachePolicyConfig(CachePolicyConfig cachePolicyConfig) {
        setCachePolicyConfig(cachePolicyConfig);
        return this;
    }

    /**
     * <p>
     * The current version of the cache policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the cache policy.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the cache policy.
     * </p>
     * 
     * @return The current version of the cache policy.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the cache policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the cache policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCachePolicyConfigResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCachePolicyConfig() != null)
            sb.append("CachePolicyConfig: ").append(getCachePolicyConfig()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCachePolicyConfigResult == false)
            return false;
        GetCachePolicyConfigResult other = (GetCachePolicyConfigResult) obj;
        if (other.getCachePolicyConfig() == null ^ this.getCachePolicyConfig() == null)
            return false;
        if (other.getCachePolicyConfig() != null && other.getCachePolicyConfig().equals(this.getCachePolicyConfig()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCachePolicyConfig() == null) ? 0 : getCachePolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetCachePolicyConfigResult clone() {
        try {
            return (GetCachePolicyConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
