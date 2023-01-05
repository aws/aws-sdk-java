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
 * Determines whether CloudFront includes the <code>X-Content-Type-Options</code> HTTP response header with its value
 * set to <code>nosniff</code>.
 * </p>
 * <p>
 * For more information about the <code>X-Content-Type-Options</code> HTTP response header, see <a
 * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options">X-Content-Type-Options</a> in
 * the MDN Web Docs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyContentTypeOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyContentTypeOptions implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     */
    private Boolean override;

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP
     *        response header received from the origin with the one specified in this response headers policy.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP
     *         response header received from the origin with the one specified in this response headers policy.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP
     *        response header received from the origin with the one specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyContentTypeOptions withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>X-Content-Type-Options</code> HTTP
     *         response header received from the origin with the one specified in this response headers policy.
     */

    public Boolean isOverride() {
        return this.override;
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
            sb.append("Override: ").append(getOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyContentTypeOptions == false)
            return false;
        ResponseHeadersPolicyContentTypeOptions other = (ResponseHeadersPolicyContentTypeOptions) obj;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyContentTypeOptions clone() {
        try {
            return (ResponseHeadersPolicyContentTypeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
