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
 * HTTP response information. The <code>inspectionLevel</code> request parameter specifies which details are returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/InspectionDataResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InspectionDataResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The protocol used to return the HTTP response.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The HTTP response status code for the HTTP response.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The message associated with the HTTP status code.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The response headers associated with the HTTP response.
     * </p>
     */
    private String headers;
    /**
     * <p>
     * The HTTP response returned.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The protocol used to return the HTTP response.
     * </p>
     * 
     * @param protocol
     *        The protocol used to return the HTTP response.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used to return the HTTP response.
     * </p>
     * 
     * @return The protocol used to return the HTTP response.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used to return the HTTP response.
     * </p>
     * 
     * @param protocol
     *        The protocol used to return the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataResponse withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The HTTP response status code for the HTTP response.
     * </p>
     * 
     * @param statusCode
     *        The HTTP response status code for the HTTP response.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP response status code for the HTTP response.
     * </p>
     * 
     * @return The HTTP response status code for the HTTP response.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP response status code for the HTTP response.
     * </p>
     * 
     * @param statusCode
     *        The HTTP response status code for the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataResponse withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The message associated with the HTTP status code.
     * </p>
     * 
     * @param statusMessage
     *        The message associated with the HTTP status code.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The message associated with the HTTP status code.
     * </p>
     * 
     * @return The message associated with the HTTP status code.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The message associated with the HTTP status code.
     * </p>
     * 
     * @param statusMessage
     *        The message associated with the HTTP status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataResponse withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The response headers associated with the HTTP response.
     * </p>
     * 
     * @param headers
     *        The response headers associated with the HTTP response.
     */

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * The response headers associated with the HTTP response.
     * </p>
     * 
     * @return The response headers associated with the HTTP response.
     */

    public String getHeaders() {
        return this.headers;
    }

    /**
     * <p>
     * The response headers associated with the HTTP response.
     * </p>
     * 
     * @param headers
     *        The response headers associated with the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataResponse withHeaders(String headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The HTTP response returned.
     * </p>
     * 
     * @param body
     *        The HTTP response returned.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The HTTP response returned.
     * </p>
     * 
     * @return The HTTP response returned.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The HTTP response returned.
     * </p>
     * 
     * @param body
     *        The HTTP response returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectionDataResponse withBody(String body) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
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

        if (obj instanceof InspectionDataResponse == false)
            return false;
        InspectionDataResponse other = (InspectionDataResponse) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
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
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public InspectionDataResponse clone() {
        try {
            return (InspectionDataResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.InspectionDataResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
