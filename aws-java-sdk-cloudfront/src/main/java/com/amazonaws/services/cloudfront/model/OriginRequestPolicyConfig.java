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
 * An origin request policy configuration.
 * </p>
 * <p>
 * This configuration determines the values that CloudFront includes in requests that it sends to the origin. Each
 * request that CloudFront sends to the origin includes the following:
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginRequestPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A unique name to identify the origin request policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The HTTP headers to include in origin requests. These can include headers from viewer requests and additional
     * headers added by CloudFront.
     * </p>
     */
    private OriginRequestPolicyHeadersConfig headersConfig;
    /**
     * <p>
     * The cookies from viewer requests to include in origin requests.
     * </p>
     */
    private OriginRequestPolicyCookiesConfig cookiesConfig;
    /**
     * <p>
     * The URL query strings from viewer requests to include in origin requests.
     * </p>
     */
    private OriginRequestPolicyQueryStringsConfig queryStringsConfig;

    /**
     * <p>
     * A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @return A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the origin request policy. The comment cannot be longer than 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A unique name to identify the origin request policy.
     * </p>
     * 
     * @param name
     *        A unique name to identify the origin request policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name to identify the origin request policy.
     * </p>
     * 
     * @return A unique name to identify the origin request policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name to identify the origin request policy.
     * </p>
     * 
     * @param name
     *        A unique name to identify the origin request policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The HTTP headers to include in origin requests. These can include headers from viewer requests and additional
     * headers added by CloudFront.
     * </p>
     * 
     * @param headersConfig
     *        The HTTP headers to include in origin requests. These can include headers from viewer requests and
     *        additional headers added by CloudFront.
     */

    public void setHeadersConfig(OriginRequestPolicyHeadersConfig headersConfig) {
        this.headersConfig = headersConfig;
    }

    /**
     * <p>
     * The HTTP headers to include in origin requests. These can include headers from viewer requests and additional
     * headers added by CloudFront.
     * </p>
     * 
     * @return The HTTP headers to include in origin requests. These can include headers from viewer requests and
     *         additional headers added by CloudFront.
     */

    public OriginRequestPolicyHeadersConfig getHeadersConfig() {
        return this.headersConfig;
    }

    /**
     * <p>
     * The HTTP headers to include in origin requests. These can include headers from viewer requests and additional
     * headers added by CloudFront.
     * </p>
     * 
     * @param headersConfig
     *        The HTTP headers to include in origin requests. These can include headers from viewer requests and
     *        additional headers added by CloudFront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyConfig withHeadersConfig(OriginRequestPolicyHeadersConfig headersConfig) {
        setHeadersConfig(headersConfig);
        return this;
    }

    /**
     * <p>
     * The cookies from viewer requests to include in origin requests.
     * </p>
     * 
     * @param cookiesConfig
     *        The cookies from viewer requests to include in origin requests.
     */

    public void setCookiesConfig(OriginRequestPolicyCookiesConfig cookiesConfig) {
        this.cookiesConfig = cookiesConfig;
    }

    /**
     * <p>
     * The cookies from viewer requests to include in origin requests.
     * </p>
     * 
     * @return The cookies from viewer requests to include in origin requests.
     */

    public OriginRequestPolicyCookiesConfig getCookiesConfig() {
        return this.cookiesConfig;
    }

    /**
     * <p>
     * The cookies from viewer requests to include in origin requests.
     * </p>
     * 
     * @param cookiesConfig
     *        The cookies from viewer requests to include in origin requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyConfig withCookiesConfig(OriginRequestPolicyCookiesConfig cookiesConfig) {
        setCookiesConfig(cookiesConfig);
        return this;
    }

    /**
     * <p>
     * The URL query strings from viewer requests to include in origin requests.
     * </p>
     * 
     * @param queryStringsConfig
     *        The URL query strings from viewer requests to include in origin requests.
     */

    public void setQueryStringsConfig(OriginRequestPolicyQueryStringsConfig queryStringsConfig) {
        this.queryStringsConfig = queryStringsConfig;
    }

    /**
     * <p>
     * The URL query strings from viewer requests to include in origin requests.
     * </p>
     * 
     * @return The URL query strings from viewer requests to include in origin requests.
     */

    public OriginRequestPolicyQueryStringsConfig getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    /**
     * <p>
     * The URL query strings from viewer requests to include in origin requests.
     * </p>
     * 
     * @param queryStringsConfig
     *        The URL query strings from viewer requests to include in origin requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyConfig withQueryStringsConfig(OriginRequestPolicyQueryStringsConfig queryStringsConfig) {
        setQueryStringsConfig(queryStringsConfig);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getHeadersConfig() != null)
            sb.append("HeadersConfig: ").append(getHeadersConfig()).append(",");
        if (getCookiesConfig() != null)
            sb.append("CookiesConfig: ").append(getCookiesConfig()).append(",");
        if (getQueryStringsConfig() != null)
            sb.append("QueryStringsConfig: ").append(getQueryStringsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginRequestPolicyConfig == false)
            return false;
        OriginRequestPolicyConfig other = (OriginRequestPolicyConfig) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHeadersConfig() == null ^ this.getHeadersConfig() == null)
            return false;
        if (other.getHeadersConfig() != null && other.getHeadersConfig().equals(this.getHeadersConfig()) == false)
            return false;
        if (other.getCookiesConfig() == null ^ this.getCookiesConfig() == null)
            return false;
        if (other.getCookiesConfig() != null && other.getCookiesConfig().equals(this.getCookiesConfig()) == false)
            return false;
        if (other.getQueryStringsConfig() == null ^ this.getQueryStringsConfig() == null)
            return false;
        if (other.getQueryStringsConfig() != null && other.getQueryStringsConfig().equals(this.getQueryStringsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHeadersConfig() == null) ? 0 : getHeadersConfig().hashCode());
        hashCode = prime * hashCode + ((getCookiesConfig() == null) ? 0 : getCookiesConfig().hashCode());
        hashCode = prime * hashCode + ((getQueryStringsConfig() == null) ? 0 : getQueryStringsConfig().hashCode());
        return hashCode;
    }

    @Override
    public OriginRequestPolicyConfig clone() {
        try {
            return (OriginRequestPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
