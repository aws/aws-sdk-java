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
 * The policy directives and their values that CloudFront includes as values for the
 * <code>Content-Security-Policy</code> HTTP response header.
 * </p>
 * <p>
 * For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
 * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy">Content-Security-Policy</a>
 * in the MDN Web Docs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyContentSecurityPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyContentSecurityPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     */
    private Boolean override;
    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     */
    private String contentSecurityPolicy;

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP
     *        response header received from the origin with the one specified in this response headers policy.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP
     *         response header received from the origin with the one specified in this response headers policy.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP
     *        response header received from the origin with the one specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyContentSecurityPolicy withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>Content-Security-Policy</code> HTTP
     *         response header received from the origin with the one specified in this response headers policy.
     */

    public Boolean isOverride() {
        return this.override;
    }

    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * 
     * @param contentSecurityPolicy
     *        The policy directives and their values that CloudFront includes as values for the
     *        <code>Content-Security-Policy</code> HTTP response header.
     */

    public void setContentSecurityPolicy(String contentSecurityPolicy) {
        this.contentSecurityPolicy = contentSecurityPolicy;
    }

    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * 
     * @return The policy directives and their values that CloudFront includes as values for the
     *         <code>Content-Security-Policy</code> HTTP response header.
     */

    public String getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }

    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * 
     * @param contentSecurityPolicy
     *        The policy directives and their values that CloudFront includes as values for the
     *        <code>Content-Security-Policy</code> HTTP response header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyContentSecurityPolicy withContentSecurityPolicy(String contentSecurityPolicy) {
        setContentSecurityPolicy(contentSecurityPolicy);
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
        if (getOverride() != null)
            sb.append("Override: ").append(getOverride()).append(",");
        if (getContentSecurityPolicy() != null)
            sb.append("ContentSecurityPolicy: ").append(getContentSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyContentSecurityPolicy == false)
            return false;
        ResponseHeadersPolicyContentSecurityPolicy other = (ResponseHeadersPolicyContentSecurityPolicy) obj;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        if (other.getContentSecurityPolicy() == null ^ this.getContentSecurityPolicy() == null)
            return false;
        if (other.getContentSecurityPolicy() != null && other.getContentSecurityPolicy().equals(this.getContentSecurityPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        hashCode = prime * hashCode + ((getContentSecurityPolicy() == null) ? 0 : getContentSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyContentSecurityPolicy clone() {
        try {
            return (ResponseHeadersPolicyContentSecurityPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
