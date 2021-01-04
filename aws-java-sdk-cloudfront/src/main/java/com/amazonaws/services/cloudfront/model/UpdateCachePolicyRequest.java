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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCachePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCachePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A cache policy configuration.
     * </p>
     */
    private CachePolicyConfig cachePolicyConfig;
    /**
     * <p>
     * The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version of the cache policy that you are updating. The version is returned in the cache policy’s
     * <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * A cache policy configuration.
     * </p>
     * 
     * @param cachePolicyConfig
     *        A cache policy configuration.
     */

    public void setCachePolicyConfig(CachePolicyConfig cachePolicyConfig) {
        this.cachePolicyConfig = cachePolicyConfig;
    }

    /**
     * <p>
     * A cache policy configuration.
     * </p>
     * 
     * @return A cache policy configuration.
     */

    public CachePolicyConfig getCachePolicyConfig() {
        return this.cachePolicyConfig;
    }

    /**
     * <p>
     * A cache policy configuration.
     * </p>
     * 
     * @param cachePolicyConfig
     *        A cache policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCachePolicyRequest withCachePolicyConfig(CachePolicyConfig cachePolicyConfig) {
        setCachePolicyConfig(cachePolicyConfig);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     *        behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @return The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     *         behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cache policy that you are updating. The identifier is returned in a cache
     *        behavior’s <code>CachePolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCachePolicyRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version of the cache policy that you are updating. The version is returned in the cache policy’s
     * <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version of the cache policy that you are updating. The version is returned in the cache policy’s
     *        <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The version of the cache policy that you are updating. The version is returned in the cache policy’s
     * <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     * </p>
     * 
     * @return The version of the cache policy that you are updating. The version is returned in the cache policy’s
     *         <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The version of the cache policy that you are updating. The version is returned in the cache policy’s
     * <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version of the cache policy that you are updating. The version is returned in the cache policy’s
     *        <code>ETag</code> field in the response to <code>GetCachePolicyConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCachePolicyRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCachePolicyRequest == false)
            return false;
        UpdateCachePolicyRequest other = (UpdateCachePolicyRequest) obj;
        if (other.getCachePolicyConfig() == null ^ this.getCachePolicyConfig() == null)
            return false;
        if (other.getCachePolicyConfig() != null && other.getCachePolicyConfig().equals(this.getCachePolicyConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCachePolicyConfig() == null) ? 0 : getCachePolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCachePolicyRequest clone() {
        return (UpdateCachePolicyRequest) super.clone();
    }

}
