/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains additional details about the state's execution, including its input and output data processing flow, and
 * HTTP request information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/InspectionDataRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InspectionDataRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The protocol used to make the HTTP request.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The HTTP method used for the HTTP request.
     * </p>
     */
    private String method;
    /**
     * <p>
     * The API endpoint used for the HTTP request.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The request headers associated with the HTTP request.
     * </p>
     */
    private String headers;
    /**
     * <p>
     * The request body for the HTTP request.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The protocol used to make the HTTP request.
     * </p>
     * 
     * @param protocol
     *        The protocol used to make the HTTP request.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used to make the HTTP request.
     * </p>
     * 
     * @return The protocol used to make the HTTP request.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used to make the HTTP request.
     * </p>
     * 
     * @param protocol
     *        The protocol used to make the HTTP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The HTTP method used for the HTTP request.
     * </p>
     * 
     * @param method
     *        The HTTP method used for the HTTP request.
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The HTTP method used for the HTTP request.
     * </p>
     * 
     * @return The HTTP method used for the HTTP request.
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The HTTP method used for the HTTP request.
     * </p>
     * 
     * @param method
     *        The HTTP method used for the HTTP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataRequest withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The API endpoint used for the HTTP request.
     * </p>
     * 
     * @param url
     *        The API endpoint used for the HTTP request.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The API endpoint used for the HTTP request.
     * </p>
     * 
     * @return The API endpoint used for the HTTP request.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The API endpoint used for the HTTP request.
     * </p>
     * 
     * @param url
     *        The API endpoint used for the HTTP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataRequest withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The request headers associated with the HTTP request.
     * </p>
     * 
     * @param headers
     *        The request headers associated with the HTTP request.
     */

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * The request headers associated with the HTTP request.
     * </p>
     * 
     * @return The request headers associated with the HTTP request.
     */

    public String getHeaders() {
        return this.headers;
    }

    /**
     * <p>
     * The request headers associated with the HTTP request.
     * </p>
     * 
     * @param headers
     *        The request headers associated with the HTTP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataRequest withHeaders(String headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The request body for the HTTP request.
     * </p>
     * 
     * @param body
     *        The request body for the HTTP request.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The request body for the HTTP request.
     * </p>
     * 
     * @return The request body for the HTTP request.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The request body for the HTTP request.
     * </p>
     * 
     * @param body
     *        The request body for the HTTP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataRequest withBody(String body) {
        setBody(body);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InspectionDataRequest == false)
            return false;
        InspectionDataRequest other = (InspectionDataRequest) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public InspectionDataRequest clone() {
        try {
            return (InspectionDataRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.InspectionDataRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
