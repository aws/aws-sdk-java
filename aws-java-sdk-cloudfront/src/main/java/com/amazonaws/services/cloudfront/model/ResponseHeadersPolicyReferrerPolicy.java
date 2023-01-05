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
 * Determines whether CloudFront includes the <code>Referrer-Policy</code> HTTP response header and the header's value.
 * </p>
 * <p>
 * For more information about the <code>Referrer-Policy</code> HTTP response header, see <a
 * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN Web
 * Docs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyReferrerPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyReferrerPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     */
    private Boolean override;
    /**
     * <p>
     * The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>no-referrer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-referrer-when-downgrade</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>same-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unsafe-url</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     */
    private String referrerPolicy;

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response
     *        header received from the origin with the one specified in this response headers policy.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response
     *         header received from the origin with the one specified in this response headers policy.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response
     *        header received from the origin with the one specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyReferrerPolicy withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response header
     * received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>Referrer-Policy</code> HTTP response
     *         header received from the origin with the one specified in this response headers policy.
     */

    public Boolean isOverride() {
        return this.override;
    }

    /**
     * <p>
     * The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>no-referrer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-referrer-when-downgrade</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>same-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unsafe-url</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param referrerPolicy
     *        The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>no-referrer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>no-referrer-when-downgrade</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-when-cross-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>same-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strict-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strict-origin-when-cross-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unsafe-url</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about these values, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *        the MDN Web Docs.
     * @see ReferrerPolicyList
     */

    public void setReferrerPolicy(String referrerPolicy) {
        this.referrerPolicy = referrerPolicy;
    }

    /**
     * <p>
     * The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>no-referrer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-referrer-when-downgrade</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>same-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unsafe-url</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @return The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>no-referrer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>no-referrer-when-downgrade</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-when-cross-origin</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>same-origin</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>strict-origin</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>strict-origin-when-cross-origin</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unsafe-url</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about these values, see <a
     *         href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *         the MDN Web Docs.
     * @see ReferrerPolicyList
     */

    public String getReferrerPolicy() {
        return this.referrerPolicy;
    }

    /**
     * <p>
     * The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>no-referrer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-referrer-when-downgrade</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>same-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unsafe-url</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param referrerPolicy
     *        The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>no-referrer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>no-referrer-when-downgrade</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-when-cross-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>same-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strict-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strict-origin-when-cross-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unsafe-url</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about these values, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferrerPolicyList
     */

    public ResponseHeadersPolicyReferrerPolicy withReferrerPolicy(String referrerPolicy) {
        setReferrerPolicy(referrerPolicy);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>no-referrer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>no-referrer-when-downgrade</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>same-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strict-origin-when-cross-origin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unsafe-url</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about these values, see <a
     * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in the MDN
     * Web Docs.
     * </p>
     * 
     * @param referrerPolicy
     *        The value of the <code>Referrer-Policy</code> HTTP response header. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>no-referrer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>no-referrer-when-downgrade</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-when-cross-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>same-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strict-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>strict-origin-when-cross-origin</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unsafe-url</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about these values, see <a
     *        href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy">Referrer-Policy</a> in
     *        the MDN Web Docs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferrerPolicyList
     */

    public ResponseHeadersPolicyReferrerPolicy withReferrerPolicy(ReferrerPolicyList referrerPolicy) {
        this.referrerPolicy = referrerPolicy.toString();
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
        if (getReferrerPolicy() != null)
            sb.append("ReferrerPolicy: ").append(getReferrerPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyReferrerPolicy == false)
            return false;
        ResponseHeadersPolicyReferrerPolicy other = (ResponseHeadersPolicyReferrerPolicy) obj;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        if (other.getReferrerPolicy() == null ^ this.getReferrerPolicy() == null)
            return false;
        if (other.getReferrerPolicy() != null && other.getReferrerPolicy().equals(this.getReferrerPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        hashCode = prime * hashCode + ((getReferrerPolicy() == null) ? 0 : getReferrerPolicy().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyReferrerPolicy clone() {
        try {
            return (ResponseHeadersPolicyReferrerPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
