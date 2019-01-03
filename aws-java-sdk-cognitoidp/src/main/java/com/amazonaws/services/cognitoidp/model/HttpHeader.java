/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The HTTP header.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/HttpHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpHeader implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The header name
     * </p>
     */
    private String headerName;
    /**
     * <p>
     * The header value.
     * </p>
     */
    private String headerValue;

    /**
     * <p>
     * The header name
     * </p>
     * 
     * @param headerName
     *        The header name
     */

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * <p>
     * The header name
     * </p>
     * 
     * @return The header name
     */

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * <p>
     * The header name
     * </p>
     * 
     * @param headerName
     *        The header name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpHeader withHeaderName(String headerName) {
        setHeaderName(headerName);
        return this;
    }

    /**
     * <p>
     * The header value.
     * </p>
     * 
     * @param headerValue
     *        The header value.
     */

    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * <p>
     * The header value.
     * </p>
     * 
     * @return The header value.
     */

    public String getHeaderValue() {
        return this.headerValue;
    }

    /**
     * <p>
     * The header value.
     * </p>
     * 
     * @param headerValue
     *        The header value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpHeader withHeaderValue(String headerValue) {
        setHeaderValue(headerValue);
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
        if (getHeaderName() != null)
            sb.append("HeaderName: ").append(getHeaderName()).append(",");
        if (getHeaderValue() != null)
            sb.append("HeaderValue: ").append(getHeaderValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpHeader == false)
            return false;
        HttpHeader other = (HttpHeader) obj;
        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getHeaderValue() == null ^ this.getHeaderValue() == null)
            return false;
        if (other.getHeaderValue() != null && other.getHeaderValue().equals(this.getHeaderValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode());
        hashCode = prime * hashCode + ((getHeaderValue() == null) ? 0 : getHeaderValue().hashCode());
        return hashCode;
    }

    @Override
    public HttpHeader clone() {
        try {
            return (HttpHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.HttpHeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
