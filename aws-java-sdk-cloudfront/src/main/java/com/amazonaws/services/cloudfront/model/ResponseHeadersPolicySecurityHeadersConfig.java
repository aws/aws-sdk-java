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
 * A configuration for a set of security-related HTTP response headers. CloudFront adds these headers to HTTP responses
 * that it sends for requests that match a cache behavior associated with this response headers policy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicySecurityHeadersConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicySecurityHeadersConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyXSSProtection xSSProtection;
    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyFrameOptions frameOptions;
    /**
     * <p>
     * Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyReferrerPolicy referrerPolicy;
    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     * >Content-Security-Policy</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy;
    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with its
     * value set to <code>nosniff</code>.
     * </p>
     * <p>
     * For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     * >X-Content-Type-Options</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyContentTypeOptions contentTypeOptions;
    /**
     * <p>
     * Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and the
     * header's value.
     * </p>
     * <p>
     * For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     * >Strict-Transport-Security</a> in the MDN Web Docs.
     * </p>
     */
    private ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity;

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param xSSProtection
     *        Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the
     *        header's value.</p>
     *        <p>
     *        For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     */

    public void setXSSProtection(ResponseHeadersPolicyXSSProtection xSSProtection) {
        this.xSSProtection = xSSProtection;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the
     *         header's value.</p>
     *         <p>
     *         For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *         the MDN Web Docs.
     */

    public ResponseHeadersPolicyXSSProtection getXSSProtection() {
        return this.xSSProtection;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param xSSProtection
     *        Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the
     *        header's value.</p>
     *        <p>
     *        For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySecurityHeadersConfig withXSSProtection(ResponseHeadersPolicyXSSProtection xSSProtection) {
        setXSSProtection(xSSProtection);
        return this;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param frameOptions
     *        Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the
     *        header's value.</p>
     *        <p>
     *        For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *        the MDN Web Docs.
     */

    public void setFrameOptions(ResponseHeadersPolicyFrameOptions frameOptions) {
        this.frameOptions = frameOptions;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the
     *         header's value.</p>
     *         <p>
     *         For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *         the MDN Web Docs.
     */

    public ResponseHeadersPolicyFrameOptions getFrameOptions() {
        return this.frameOptions;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param frameOptions
     *        Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the
     *        header's value.</p>
     *        <p>
     *        For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySecurityHeadersConfig withFrameOptions(ResponseHeadersPolicyFrameOptions frameOptions) {
        setFrameOptions(frameOptions);
        return this;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param referrerPolicy
     *        Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the
     *        header's value.</p>
     *        <p>
     *        For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *        the MDN Web Docs.
     */

    public void setReferrerPolicy(ResponseHeadersPolicyReferrerPolicy referrerPolicy) {
        this.referrerPolicy = referrerPolicy;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the
     *         header's value.</p>
     *         <p>
     *         For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *         the MDN Web Docs.
     */

    public ResponseHeadersPolicyReferrerPolicy getReferrerPolicy() {
        return this.referrerPolicy;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the header's
     * value.
     * </p>
     * <p>
     * For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param referrerPolicy
     *        Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the
     *        header's value.</p>
     *        <p>
     *        For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySecurityHeadersConfig withReferrerPolicy(ResponseHeadersPolicyReferrerPolicy referrerPolicy) {
        setReferrerPolicy(referrerPolicy);
        return this;
    }

    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     * >Content-Security-Policy</a> in the MDN Web Docs.
     * </p>
     * 
     * @param contentSecurityPolicy
     *        The policy directives and their values that CloudFront includes as values for the
     *        <code>Content-Security-Policy</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     *        >Content-Security-Policy</a> in the MDN Web Docs.
     */

    public void setContentSecurityPolicy(ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy) {
        this.contentSecurityPolicy = contentSecurityPolicy;
    }

    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     * >Content-Security-Policy</a> in the MDN Web Docs.
     * </p>
     * 
     * @return The policy directives and their values that CloudFront includes as values for the
     *         <code>Content-Security-Policy</code> HTTP response header.</p>
     *         <p>
     *         For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     *         >Content-Security-Policy</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyContentSecurityPolicy getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }

    /**
     * <p>
     * The policy directives and their values that CloudFront includes as values for the
     * <code>Content-Security-Policy</code> HTTP response header.
     * </p>
     * <p>
     * For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     * >Content-Security-Policy</a> in the MDN Web Docs.
     * </p>
     * 
     * @param contentSecurityPolicy
     *        The policy directives and their values that CloudFront includes as values for the
     *        <code>Content-Security-Policy</code> HTTP response header.</p>
     *        <p>
     *        For more information about the <code>Content-Security-Policy</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy"
     *        >Content-Security-Policy</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySecurityHeadersConfig withContentSecurityPolicy(ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy) {
        setContentSecurityPolicy(contentSecurityPolicy);
        return this;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with its
     * value set to <code>nosniff</code>.
     * </p>
     * <p>
     * For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     * >X-Content-Type-Options</a> in the MDN Web Docs.
     * </p>
     * 
     * @param contentTypeOptions
     *        Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with
     *        its value set to <code>nosniff</code>.</p>
     *        <p>
     *        For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     *        >X-Content-Type-Options</a> in the MDN Web Docs.
     */

    public void setContentTypeOptions(ResponseHeadersPolicyContentTypeOptions contentTypeOptions) {
        this.contentTypeOptions = contentTypeOptions;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with its
     * value set to <code>nosniff</code>.
     * </p>
     * <p>
     * For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     * >X-Content-Type-Options</a> in the MDN Web Docs.
     * </p>
     * 
     * @return Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with
     *         its value set to <code>nosniff</code>.</p>
     *         <p>
     *         For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     *         >X-Content-Type-Options</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyContentTypeOptions getContentTypeOptions() {
        return this.contentTypeOptions;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with its
     * value set to <code>nosniff</code>.
     * </p>
     * <p>
     * For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     * >X-Content-Type-Options</a> in the MDN Web Docs.
     * </p>
     * 
     * @param contentTypeOptions
     *        Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with
     *        its value set to <code>nosniff</code>.</p>
     *        <p>
     *        For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options"
     *        >X-Content-Type-Options</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySecurityHeadersConfig withContentTypeOptions(ResponseHeadersPolicyContentTypeOptions contentTypeOptions) {
        setContentTypeOptions(contentTypeOptions);
        return this;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and the
     * header's value.
     * </p>
     * <p>
     * For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     * >Strict-Transport-Security</a> in the MDN Web Docs.
     * </p>
     * 
     * @param strictTransportSecurity
     *        Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and
     *        the header's value.</p>
     *        <p>
     *        For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     *        >Strict-Transport-Security</a> in the MDN Web Docs.
     */

    public void setStrictTransportSecurity(ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity) {
        this.strictTransportSecurity = strictTransportSecurity;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and the
     * header's value.
     * </p>
     * <p>
     * For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     * >Strict-Transport-Security</a> in the MDN Web Docs.
     * </p>
     * 
     * @return Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header
     *         and the header's value.</p>
     *         <p>
     *         For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     *         >Strict-Transport-Security</a> in the MDN Web Docs.
     */

    public ResponseHeadersPolicyStrictTransportSecurity getStrictTransportSecurity() {
        return this.strictTransportSecurity;
    }

    /**
     * <p>
     * Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and the
     * header's value.
     * </p>
     * <p>
     * For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     * >Strict-Transport-Security</a> in the MDN Web Docs.
     * </p>
     * 
     * @param strictTransportSecurity
     *        Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and
     *        the header's value.</p>
     *        <p>
     *        For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
     *        >Strict-Transport-Security</a> in the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicySecurityHeadersConfig withStrictTransportSecurity(ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity) {
        setStrictTransportSecurity(strictTransportSecurity);
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
        if (getXSSProtection() != null)
            sb.append("XSSProtection: ").append(getXSSProtection()).append(",");
        if (getFrameOptions() != null)
            sb.append("FrameOptions: ").append(getFrameOptions()).append(",");
        if (getReferrerPolicy() != null)
            sb.append("ReferrerPolicy: ").append(getReferrerPolicy()).append(",");
        if (getContentSecurityPolicy() != null)
            sb.append("ContentSecurityPolicy: ").append(getContentSecurityPolicy()).append(",");
        if (getContentTypeOptions() != null)
            sb.append("ContentTypeOptions: ").append(getContentTypeOptions()).append(",");
        if (getStrictTransportSecurity() != null)
            sb.append("StrictTransportSecurity: ").append(getStrictTransportSecurity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicySecurityHeadersConfig == false)
            return false;
        ResponseHeadersPolicySecurityHeadersConfig other = (ResponseHeadersPolicySecurityHeadersConfig) obj;
        if (other.getXSSProtection() == null ^ this.getXSSProtection() == null)
            return false;
        if (other.getXSSProtection() != null && other.getXSSProtection().equals(this.getXSSProtection()) == false)
            return false;
        if (other.getFrameOptions() == null ^ this.getFrameOptions() == null)
            return false;
        if (other.getFrameOptions() != null && other.getFrameOptions().equals(this.getFrameOptions()) == false)
            return false;
        if (other.getReferrerPolicy() == null ^ this.getReferrerPolicy() == null)
            return false;
        if (other.getReferrerPolicy() != null && other.getReferrerPolicy().equals(this.getReferrerPolicy()) == false)
            return false;
        if (other.getContentSecurityPolicy() == null ^ this.getContentSecurityPolicy() == null)
            return false;
        if (other.getContentSecurityPolicy() != null && other.getContentSecurityPolicy().equals(this.getContentSecurityPolicy()) == false)
            return false;
        if (other.getContentTypeOptions() == null ^ this.getContentTypeOptions() == null)
            return false;
        if (other.getContentTypeOptions() != null && other.getContentTypeOptions().equals(this.getContentTypeOptions()) == false)
            return false;
        if (other.getStrictTransportSecurity() == null ^ this.getStrictTransportSecurity() == null)
            return false;
        if (other.getStrictTransportSecurity() != null && other.getStrictTransportSecurity().equals(this.getStrictTransportSecurity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXSSProtection() == null) ? 0 : getXSSProtection().hashCode());
        hashCode = prime * hashCode + ((getFrameOptions() == null) ? 0 : getFrameOptions().hashCode());
        hashCode = prime * hashCode + ((getReferrerPolicy() == null) ? 0 : getReferrerPolicy().hashCode());
        hashCode = prime * hashCode + ((getContentSecurityPolicy() == null) ? 0 : getContentSecurityPolicy().hashCode());
        hashCode = prime * hashCode + ((getContentTypeOptions() == null) ? 0 : getContentTypeOptions().hashCode());
        hashCode = prime * hashCode + ((getStrictTransportSecurity() == null) ? 0 : getStrictTransportSecurity().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicySecurityHeadersConfig clone() {
        try {
            return (ResponseHeadersPolicySecurityHeadersConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
