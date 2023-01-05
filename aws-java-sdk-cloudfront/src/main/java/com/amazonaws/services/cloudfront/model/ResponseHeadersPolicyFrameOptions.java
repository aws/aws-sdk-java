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
 * Determines whether CloudFront includes the <code>X-Frame-Options</code> HTTP response header and the header's value.
 * </p>
 * <p>
 * For more information about the <code>X-Frame-Options</code> HTTP response header, see <a
 * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN Web
 * Docs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyFrameOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyFrameOptions implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     */
    private Boolean override;
    /**
     * <p>
     * The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     * <code>SAMEORIGIN</code>.
     * </p>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     */
    private String frameOption;

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response
     *        header received from the origin with the one specified in this response headers policy.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response
     *         header received from the origin with the one specified in this response headers policy.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response
     *        header received from the origin with the one specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyFrameOptions withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>X-Frame-Options</code> HTTP response
     *         header received from the origin with the one specified in this response headers policy.
     */

    public Boolean isOverride() {
        return this.override;
    }

    /**
     * <p>
     * The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     * <code>SAMEORIGIN</code>.
     * </p>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param frameOption
     *        The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     *        <code>SAMEORIGIN</code>.</p>
     *        <p>
     *        For more information about these values, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *        the MDN Web Docs.
     * @see FrameOptionsList
     */

    public void setFrameOption(String frameOption) {
        this.frameOption = frameOption;
    }

    /**
     * <p>
     * The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     * <code>SAMEORIGIN</code>.
     * </p>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code>
     *         and <code>SAMEORIGIN</code>.</p>
     *         <p>
     *         For more information about these values, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *         the MDN Web Docs.
     * @see FrameOptionsList
     */

    public String getFrameOption() {
        return this.frameOption;
    }

    /**
     * <p>
     * The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     * <code>SAMEORIGIN</code>.
     * </p>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param frameOption
     *        The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     *        <code>SAMEORIGIN</code>.</p>
     *        <p>
     *        For more information about these values, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrameOptionsList
     */

    public ResponseHeadersPolicyFrameOptions withFrameOption(String frameOption) {
        setFrameOption(frameOption);
        return this;
    }

    /**
     * <p>
     * The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     * <code>SAMEORIGIN</code>.
     * </p>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param frameOption
     *        The value of the <code>X-Frame-Options</code> HTTP response header. Valid values are <code>DENY</code> and
     *        <code>SAMEORIGIN</code>.</p>
     *        <p>
     *        For more information about these values, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">X-Frame-Options</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FrameOptionsList
     */

    public ResponseHeadersPolicyFrameOptions withFrameOption(FrameOptionsList frameOption) {
        this.frameOption = frameOption.toString();
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
        if (getFrameOption() != null)
            sb.append("FrameOption: ").append(getFrameOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyFrameOptions == false)
            return false;
        ResponseHeadersPolicyFrameOptions other = (ResponseHeadersPolicyFrameOptions) obj;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        if (other.getFrameOption() == null ^ this.getFrameOption() == null)
            return false;
        if (other.getFrameOption() != null && other.getFrameOption().equals(this.getFrameOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        hashCode = prime * hashCode + ((getFrameOption() == null) ? 0 : getFrameOption().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyFrameOptions clone() {
        try {
            return (ResponseHeadersPolicyFrameOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
