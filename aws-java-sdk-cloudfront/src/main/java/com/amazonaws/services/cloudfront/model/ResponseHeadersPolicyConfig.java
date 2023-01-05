/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A response headers policy configuration.
 * </p>
 * <p>
 * A response headers policy configuration contains metadata about the response headers policy, and configurations for
 * sets of HTTP response headers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A comment to describe the response headers policy.
     * </p>
     * <p>
     * The comment cannot be longer than 128 characters.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A name to identify the response headers policy.
     * </p>
     * <p>
     * The name must be unique for response headers policies in this Amazon Web Services account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
     * </p>
     */
    private ResponseHeadersPolicyCorsConfig corsConfig;
    /**
     * <p>
     * A configuration for a set of security-related HTTP response headers.
     * </p>
     */
    private ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig;
    /**
     * <p>
     * A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront.
     * </p>
     */
    private ResponseHeadersPolicyServerTimingHeadersConfig serverTimingHeadersConfig;
    /**
     * <p>
     * A configuration for a set of custom HTTP response headers.
     * </p>
     */
    private ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig;
    /**
     * <p>
     * A configuration for a set of HTTP headers to remove from the HTTP response.
     * </p>
     */
    private ResponseHeadersPolicyRemoveHeadersConfig removeHeadersConfig;

    /**
     * <p>
     * A comment to describe the response headers policy.
     * </p>
     * <p>
     * The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the response headers policy.</p>
     *        <p>
     *        The comment cannot be longer than 128 characters.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the response headers policy.
     * </p>
     * <p>
     * The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @return A comment to describe the response headers policy.</p>
     *         <p>
     *         The comment cannot be longer than 128 characters.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the response headers policy.
     * </p>
     * <p>
     * The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the response headers policy.</p>
     *        <p>
     *        The comment cannot be longer than 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A name to identify the response headers policy.
     * </p>
     * <p>
     * The name must be unique for response headers policies in this Amazon Web Services account.
     * </p>
     * 
     * @param name
     *        A name to identify the response headers policy.</p>
     *        <p>
     *        The name must be unique for response headers policies in this Amazon Web Services account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name to identify the response headers policy.
     * </p>
     * <p>
     * The name must be unique for response headers policies in this Amazon Web Services account.
     * </p>
     * 
     * @return A name to identify the response headers policy.</p>
     *         <p>
     *         The name must be unique for response headers policies in this Amazon Web Services account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name to identify the response headers policy.
     * </p>
     * <p>
     * The name must be unique for response headers policies in this Amazon Web Services account.
     * </p>
     * 
     * @param name
     *        A name to identify the response headers policy.</p>
     *        <p>
     *        The name must be unique for response headers policies in this Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
     * </p>
     * 
     * @param corsConfig
     *        A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
     */

    public void setCorsConfig(ResponseHeadersPolicyCorsConfig corsConfig) {
        this.corsConfig = corsConfig;
    }

    /**
     * <p>
     * A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
     * </p>
     * 
     * @return A configuration for a set of HTTP response headers that are used for cross-origin resource sharing
     *         (CORS).
     */

    public ResponseHeadersPolicyCorsConfig getCorsConfig() {
        return this.corsConfig;
    }

    /**
     * <p>
     * A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
     * </p>
     * 
     * @param corsConfig
     *        A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withCorsConfig(ResponseHeadersPolicyCorsConfig corsConfig) {
        setCorsConfig(corsConfig);
        return this;
    }

    /**
     * <p>
     * A configuration for a set of security-related HTTP response headers.
     * </p>
     * 
     * @param securityHeadersConfig
     *        A configuration for a set of security-related HTTP response headers.
     */

    public void setSecurityHeadersConfig(ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig) {
        this.securityHeadersConfig = securityHeadersConfig;
    }

    /**
     * <p>
     * A configuration for a set of security-related HTTP response headers.
     * </p>
     * 
     * @return A configuration for a set of security-related HTTP response headers.
     */

    public ResponseHeadersPolicySecurityHeadersConfig getSecurityHeadersConfig() {
        return this.securityHeadersConfig;
    }

    /**
     * <p>
     * A configuration for a set of security-related HTTP response headers.
     * </p>
     * 
     * @param securityHeadersConfig
     *        A configuration for a set of security-related HTTP response headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withSecurityHeadersConfig(ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig) {
        setSecurityHeadersConfig(securityHeadersConfig);
        return this;
    }

    /**
     * <p>
     * A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront.
     * </p>
     * 
     * @param serverTimingHeadersConfig
     *        A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront.
     */

    public void setServerTimingHeadersConfig(ResponseHeadersPolicyServerTimingHeadersConfig serverTimingHeadersConfig) {
        this.serverTimingHeadersConfig = serverTimingHeadersConfig;
    }

    /**
     * <p>
     * A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront.
     * </p>
     * 
     * @return A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from
     *         CloudFront.
     */

    public ResponseHeadersPolicyServerTimingHeadersConfig getServerTimingHeadersConfig() {
        return this.serverTimingHeadersConfig;
    }

    /**
     * <p>
     * A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront.
     * </p>
     * 
     * @param serverTimingHeadersConfig
     *        A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withServerTimingHeadersConfig(ResponseHeadersPolicyServerTimingHeadersConfig serverTimingHeadersConfig) {
        setServerTimingHeadersConfig(serverTimingHeadersConfig);
        return this;
    }

    /**
     * <p>
     * A configuration for a set of custom HTTP response headers.
     * </p>
     * 
     * @param customHeadersConfig
     *        A configuration for a set of custom HTTP response headers.
     */

    public void setCustomHeadersConfig(ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig) {
        this.customHeadersConfig = customHeadersConfig;
    }

    /**
     * <p>
     * A configuration for a set of custom HTTP response headers.
     * </p>
     * 
     * @return A configuration for a set of custom HTTP response headers.
     */

    public ResponseHeadersPolicyCustomHeadersConfig getCustomHeadersConfig() {
        return this.customHeadersConfig;
    }

    /**
     * <p>
     * A configuration for a set of custom HTTP response headers.
     * </p>
     * 
     * @param customHeadersConfig
     *        A configuration for a set of custom HTTP response headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withCustomHeadersConfig(ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig) {
        setCustomHeadersConfig(customHeadersConfig);
        return this;
    }

    /**
     * <p>
     * A configuration for a set of HTTP headers to remove from the HTTP response.
     * </p>
     * 
     * @param removeHeadersConfig
     *        A configuration for a set of HTTP headers to remove from the HTTP response.
     */

    public void setRemoveHeadersConfig(ResponseHeadersPolicyRemoveHeadersConfig removeHeadersConfig) {
        this.removeHeadersConfig = removeHeadersConfig;
    }

    /**
     * <p>
     * A configuration for a set of HTTP headers to remove from the HTTP response.
     * </p>
     * 
     * @return A configuration for a set of HTTP headers to remove from the HTTP response.
     */

    public ResponseHeadersPolicyRemoveHeadersConfig getRemoveHeadersConfig() {
        return this.removeHeadersConfig;
    }

    /**
     * <p>
     * A configuration for a set of HTTP headers to remove from the HTTP response.
     * </p>
     * 
     * @param removeHeadersConfig
     *        A configuration for a set of HTTP headers to remove from the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyConfig withRemoveHeadersConfig(ResponseHeadersPolicyRemoveHeadersConfig removeHeadersConfig) {
        setRemoveHeadersConfig(removeHeadersConfig);
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
        if (getCorsConfig() != null)
            sb.append("CorsConfig: ").append(getCorsConfig()).append(",");
        if (getSecurityHeadersConfig() != null)
            sb.append("SecurityHeadersConfig: ").append(getSecurityHeadersConfig()).append(",");
        if (getServerTimingHeadersConfig() != null)
            sb.append("ServerTimingHeadersConfig: ").append(getServerTimingHeadersConfig()).append(",");
        if (getCustomHeadersConfig() != null)
            sb.append("CustomHeadersConfig: ").append(getCustomHeadersConfig()).append(",");
        if (getRemoveHeadersConfig() != null)
            sb.append("RemoveHeadersConfig: ").append(getRemoveHeadersConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyConfig == false)
            return false;
        ResponseHeadersPolicyConfig other = (ResponseHeadersPolicyConfig) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCorsConfig() == null ^ this.getCorsConfig() == null)
            return false;
        if (other.getCorsConfig() != null && other.getCorsConfig().equals(this.getCorsConfig()) == false)
            return false;
        if (other.getSecurityHeadersConfig() == null ^ this.getSecurityHeadersConfig() == null)
            return false;
        if (other.getSecurityHeadersConfig() != null && other.getSecurityHeadersConfig().equals(this.getSecurityHeadersConfig()) == false)
            return false;
        if (other.getServerTimingHeadersConfig() == null ^ this.getServerTimingHeadersConfig() == null)
            return false;
        if (other.getServerTimingHeadersConfig() != null && other.getServerTimingHeadersConfig().equals(this.getServerTimingHeadersConfig()) == false)
            return false;
        if (other.getCustomHeadersConfig() == null ^ this.getCustomHeadersConfig() == null)
            return false;
        if (other.getCustomHeadersConfig() != null && other.getCustomHeadersConfig().equals(this.getCustomHeadersConfig()) == false)
            return false;
        if (other.getRemoveHeadersConfig() == null ^ this.getRemoveHeadersConfig() == null)
            return false;
        if (other.getRemoveHeadersConfig() != null && other.getRemoveHeadersConfig().equals(this.getRemoveHeadersConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCorsConfig() == null) ? 0 : getCorsConfig().hashCode());
        hashCode = prime * hashCode + ((getSecurityHeadersConfig() == null) ? 0 : getSecurityHeadersConfig().hashCode());
        hashCode = prime * hashCode + ((getServerTimingHeadersConfig() == null) ? 0 : getServerTimingHeadersConfig().hashCode());
        hashCode = prime * hashCode + ((getCustomHeadersConfig() == null) ? 0 : getCustomHeadersConfig().hashCode());
        hashCode = prime * hashCode + ((getRemoveHeadersConfig() == null) ? 0 : getRemoveHeadersConfig().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyConfig clone() {
        try {
            return (ResponseHeadersPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
