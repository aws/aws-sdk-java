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
 * An HTTP response header name and its value. CloudFront includes this header in HTTP responses that it sends for
 * requests that match a cache behavior that's associated with this response headers policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyCustomHeader"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyCustomHeader implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP response header name.
     * </p>
     */
    private String header;
    /**
     * <p>
     * The value for the HTTP response header.
     * </p>
     */
    private String value;
    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides a response header with the same name received from the
     * origin with the header specified here.
     * </p>
     */
    private Boolean override;

    /**
     * <p>
     * The HTTP response header name.
     * </p>
     * 
     * @param header
     *        The HTTP response header name.
     */

    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * <p>
     * The HTTP response header name.
     * </p>
     * 
     * @return The HTTP response header name.
     */

    public String getHeader() {
        return this.header;
    }

    /**
     * <p>
     * The HTTP response header name.
     * </p>
     * 
     * @param header
     *        The HTTP response header name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCustomHeader withHeader(String header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * The value for the HTTP response header.
     * </p>
     * 
     * @param value
     *        The value for the HTTP response header.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the HTTP response header.
     * </p>
     * 
     * @return The value for the HTTP response header.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the HTTP response header.
     * </p>
     * 
     * @param value
     *        The value for the HTTP response header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCustomHeader withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides a response header with the same name received from the
     * origin with the header specified here.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides a response header with the same name received from
     *        the origin with the header specified here.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides a response header with the same name received from the
     * origin with the header specified here.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides a response header with the same name received from
     *         the origin with the header specified here.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides a response header with the same name received from the
     * origin with the header specified here.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides a response header with the same name received from
     *        the origin with the header specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyCustomHeader withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides a response header with the same name received from the
     * origin with the header specified here.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides a response header with the same name received from
     *         the origin with the header specified here.
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
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof ResponseHeadersPolicyCustomHeader == false)
            return false;
        ResponseHeadersPolicyCustomHeader other = (ResponseHeadersPolicyCustomHeader) obj;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyCustomHeader clone() {
        try {
            return (ResponseHeadersPolicyCustomHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
