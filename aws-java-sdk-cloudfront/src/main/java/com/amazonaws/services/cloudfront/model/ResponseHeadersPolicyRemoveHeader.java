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
 * The name of an HTTP header that CloudFront removes from HTTP responses to requests that match the cache behavior that
 * this response headers policy is attached to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyRemoveHeader"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyRemoveHeader implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP header name.
     * </p>
     */
    private String header;

    /**
     * <p>
     * The HTTP header name.
     * </p>
     * 
     * @param header
     *        The HTTP header name.
     */

    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * <p>
     * The HTTP header name.
     * </p>
     * 
     * @return The HTTP header name.
     */

    public String getHeader() {
        return this.header;
    }

    /**
     * <p>
     * The HTTP header name.
     * </p>
     * 
     * @param header
     *        The HTTP header name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyRemoveHeader withHeader(String header) {
        setHeader(header);
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
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyRemoveHeader == false)
            return false;
        ResponseHeadersPolicyRemoveHeader other = (ResponseHeadersPolicyRemoveHeader) obj;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyRemoveHeader clone() {
        try {
            return (ResponseHeadersPolicyRemoveHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
