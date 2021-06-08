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
 * An origin request policy.
 * </p>
 * <p>
 * When it’s attached to a cache behavior, the origin request policy determines the values that CloudFront includes in
 * requests that it sends to the origin. Each request that CloudFront sends to the origin includes the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The request body and the URL path (without the domain name) from the viewer request.
 * </p>
 * </li>
 * <li>
 * <p>
 * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>,
 * <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request policy.
 * These can include items from the viewer request and, in the case of headers, additional ones that are added by
 * CloudFront.
 * </p>
 * </li>
 * </ul>
 * <p>
 * CloudFront sends a request when it can’t find an object in its cache that matches the request. If you want to send
 * values to the origin and also include them in the cache key, use <code>CachePolicy</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginRequestPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the origin request policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time when the origin request policy was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     */
    private OriginRequestPolicyConfig originRequestPolicyConfig;

    /**
     * <p>
     * The unique identifier for the origin request policy.
     * </p>
     * 
     * @param id
     *        The unique identifier for the origin request policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the origin request policy.
     * </p>
     * 
     * @return The unique identifier for the origin request policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the origin request policy.
     * </p>
     * 
     * @param id
     *        The unique identifier for the origin request policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicy withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time when the origin request policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the origin request policy was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the origin request policy was last modified.
     * </p>
     * 
     * @return The date and time when the origin request policy was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the origin request policy was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the origin request policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicy withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     * 
     * @param originRequestPolicyConfig
     *        The origin request policy configuration.
     */

    public void setOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        this.originRequestPolicyConfig = originRequestPolicyConfig;
    }

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     * 
     * @return The origin request policy configuration.
     */

    public OriginRequestPolicyConfig getOriginRequestPolicyConfig() {
        return this.originRequestPolicyConfig;
    }

    /**
     * <p>
     * The origin request policy configuration.
     * </p>
     * 
     * @param originRequestPolicyConfig
     *        The origin request policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicy withOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        setOriginRequestPolicyConfig(originRequestPolicyConfig);
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
        if (getOriginRequestPolicyConfig() != null)
            sb.append("OriginRequestPolicyConfig: ").append(getOriginRequestPolicyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginRequestPolicy == false)
            return false;
        OriginRequestPolicy other = (OriginRequestPolicy) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getOriginRequestPolicyConfig() == null ^ this.getOriginRequestPolicyConfig() == null)
            return false;
        if (other.getOriginRequestPolicyConfig() != null && other.getOriginRequestPolicyConfig().equals(this.getOriginRequestPolicyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getOriginRequestPolicyConfig() == null) ? 0 : getOriginRequestPolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public OriginRequestPolicy clone() {
        try {
            return (OriginRequestPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
