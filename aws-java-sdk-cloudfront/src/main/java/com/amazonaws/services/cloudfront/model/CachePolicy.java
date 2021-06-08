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
 * <p>
 * A cache policy.
 * </p>
 * <p>
 * When it’s attached to a cache behavior, the cache policy determines the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query
 * strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
 * </p>
 * </li>
 * <li>
 * <p>
 * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront cache.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
 * that CloudFront sends to the origin. CloudFront sends a request when it can’t find a valid object in its cache that
 * matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the cache
 * key, use <code>OriginRequestPolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CachePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CachePolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the cache policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time when the cache policy was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The cache policy configuration.
     * </p>
     */
    private CachePolicyConfig cachePolicyConfig;

    /**
     * <p>
     * The unique identifier for the cache policy.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cache policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the cache policy.
     * </p>
     * 
     * @return The unique identifier for the cache policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the cache policy.
     * </p>
     * 
     * @param id
     *        The unique identifier for the cache policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time when the cache policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the cache policy was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the cache policy was last modified.
     * </p>
     * 
     * @return The date and time when the cache policy was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the cache policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the cache policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicy withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

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

    public CachePolicy withCachePolicyConfig(CachePolicyConfig cachePolicyConfig) {
        setCachePolicyConfig(cachePolicyConfig);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCachePolicyConfig() != null)
            sb.append("CachePolicyConfig: ").append(getCachePolicyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CachePolicy == false)
            return false;
        CachePolicy other = (CachePolicy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCachePolicyConfig() == null ^ this.getCachePolicyConfig() == null)
            return false;
        if (other.getCachePolicyConfig() != null && other.getCachePolicyConfig().equals(this.getCachePolicyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCachePolicyConfig() == null) ? 0 : getCachePolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public CachePolicy clone() {
        try {
            return (CachePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
