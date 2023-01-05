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
 * Determines whether CloudFront includes the <code>X-XSS-Protection</code> HTTP response header and the header's value.
 * </p>
 * <p>
 * For more information about the <code>X-XSS-Protection</code> HTTP response header, see <a
 * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN Web
 * Docs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyXSSProtection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyXSSProtection implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     */
    private Boolean override;
    /**
     * <p>
     * A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this setting
     * is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>. When this setting
     * is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is <code>0</code>.
     * </p>
     * <p>
     * For more information about these settings, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     */
    private Boolean protection;
    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * For more information about this directive, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     */
    private Boolean modeBlock;
    /**
     * <p>
     * A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     * </p>
     * <p>
     * For more information about using a reporting URL, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     */
    private String reportUri;

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response
     *        header received from the origin with the one specified in this response headers policy.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response
     *         header received from the origin with the one specified in this response headers policy.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response
     *        header received from the origin with the one specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyXSSProtection withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>X-XSS-Protection</code> HTTP response
     *         header received from the origin with the one specified in this response headers policy.
     */

    public Boolean isOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this setting
     * is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>. When this setting
     * is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is <code>0</code>.
     * </p>
     * <p>
     * For more information about these settings, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param protection
     *        A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this
     *        setting is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>.
     *        When this setting is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is
     *        <code>0</code>.</p>
     *        <p>
     *        For more information about these settings, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     */

    public void setProtection(Boolean protection) {
        this.protection = protection;
    }

    /**
     * <p>
     * A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this setting
     * is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>. When this setting
     * is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is <code>0</code>.
     * </p>
     * <p>
     * For more information about these settings, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this
     *         setting is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>.
     *         When this setting is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is
     *         <code>0</code>.</p>
     *         <p>
     *         For more information about these settings, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *         the MDN Web Docs.
     */

    public Boolean getProtection() {
        return this.protection;
    }

    /**
     * <p>
     * A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this setting
     * is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>. When this setting
     * is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is <code>0</code>.
     * </p>
     * <p>
     * For more information about these settings, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param protection
     *        A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this
     *        setting is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>.
     *        When this setting is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is
     *        <code>0</code>.</p>
     *        <p>
     *        For more information about these settings, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyXSSProtection withProtection(Boolean protection) {
        setProtection(protection);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this setting
     * is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>. When this setting
     * is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is <code>0</code>.
     * </p>
     * <p>
     * For more information about these settings, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return A Boolean that determines the value of the <code>X-XSS-Protection</code> HTTP response header. When this
     *         setting is <code>true</code>, the value of the <code>X-XSS-Protection</code> header is <code>1</code>.
     *         When this setting is <code>false</code>, the value of the <code>X-XSS-Protection</code> header is
     *         <code>0</code>.</p>
     *         <p>
     *         For more information about these settings, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *         the MDN Web Docs.
     */

    public Boolean isProtection() {
        return this.protection;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * For more information about this directive, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param modeBlock
     *        A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     *        <code>X-XSS-Protection</code> header.</p>
     *        <p>
     *        For more information about this directive, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     */

    public void setModeBlock(Boolean modeBlock) {
        this.modeBlock = modeBlock;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * For more information about this directive, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     *         <code>X-XSS-Protection</code> header.</p>
     *         <p>
     *         For more information about this directive, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *         the MDN Web Docs.
     */

    public Boolean getModeBlock() {
        return this.modeBlock;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * For more information about this directive, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param modeBlock
     *        A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     *        <code>X-XSS-Protection</code> header.</p>
     *        <p>
     *        For more information about this directive, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyXSSProtection withModeBlock(Boolean modeBlock) {
        setModeBlock(modeBlock);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * For more information about this directive, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront includes the <code>mode=block</code> directive in the
     *         <code>X-XSS-Protection</code> header.</p>
     *         <p>
     *         For more information about this directive, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *         the MDN Web Docs.
     */

    public Boolean isModeBlock() {
        return this.modeBlock;
    }

    /**
     * <p>
     * A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     * </p>
     * <p>
     * For more information about using a reporting URL, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param reportUri
     *        A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     *        <code>X-XSS-Protection</code> header.</p>
     *        <p>
     *        You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     *        </p>
     *        <p>
     *        For more information about using a reporting URL, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     */

    public void setReportUri(String reportUri) {
        this.reportUri = reportUri;
    }

    /**
     * <p>
     * A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     * </p>
     * <p>
     * For more information about using a reporting URL, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     *         <code>X-XSS-Protection</code> header.</p>
     *         <p>
     *         You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     *         </p>
     *         <p>
     *         For more information about using a reporting URL, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *         the MDN Web Docs.
     */

    public String getReportUri() {
        return this.reportUri;
    }

    /**
     * <p>
     * A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     * <code>X-XSS-Protection</code> header.
     * </p>
     * <p>
     * You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     * </p>
     * <p>
     * For more information about using a reporting URL, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param reportUri
     *        A reporting URI, which CloudFront uses as the value of the <code>report</code> directive in the
     *        <code>X-XSS-Protection</code> header.</p>
     *        <p>
     *        You cannot specify a <code>ReportUri</code> when <code>ModeBlock</code> is <code>true</code>.
     *        </p>
     *        <p>
     *        For more information about using a reporting URL, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">X-XSS-Protection</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyXSSProtection withReportUri(String reportUri) {
        setReportUri(reportUri);
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
        if (getProtection() != null)
            sb.append("Protection: ").append(getProtection()).append(",");
        if (getModeBlock() != null)
            sb.append("ModeBlock: ").append(getModeBlock()).append(",");
        if (getReportUri() != null)
            sb.append("ReportUri: ").append(getReportUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyXSSProtection == false)
            return false;
        ResponseHeadersPolicyXSSProtection other = (ResponseHeadersPolicyXSSProtection) obj;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        if (other.getProtection() == null ^ this.getProtection() == null)
            return false;
        if (other.getProtection() != null && other.getProtection().equals(this.getProtection()) == false)
            return false;
        if (other.getModeBlock() == null ^ this.getModeBlock() == null)
            return false;
        if (other.getModeBlock() != null && other.getModeBlock().equals(this.getModeBlock()) == false)
            return false;
        if (other.getReportUri() == null ^ this.getReportUri() == null)
            return false;
        if (other.getReportUri() != null && other.getReportUri().equals(this.getReportUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        hashCode = prime * hashCode + ((getProtection() == null) ? 0 : getProtection().hashCode());
        hashCode = prime * hashCode + ((getModeBlock() == null) ? 0 : getModeBlock().hashCode());
        hashCode = prime * hashCode + ((getReportUri() == null) ? 0 : getReportUri().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyXSSProtection clone() {
        try {
            return (ResponseHeadersPolicyXSSProtection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
