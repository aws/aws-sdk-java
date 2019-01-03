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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A complex object that holds the status code and message as a result of processing an endpoint.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointItemResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointItemResponse implements Serializable, Cloneable, StructuredPojo {

    /** A custom message associated with the registration of an endpoint when issuing a response. */
    private String message;
    /** The status code associated with the merging of an endpoint when issuing a response. */
    private Integer statusCode;

    /**
     * A custom message associated with the registration of an endpoint when issuing a response.
     * 
     * @param message
     *        A custom message associated with the registration of an endpoint when issuing a response.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * A custom message associated with the registration of an endpoint when issuing a response.
     * 
     * @return A custom message associated with the registration of an endpoint when issuing a response.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * A custom message associated with the registration of an endpoint when issuing a response.
     * 
     * @param message
     *        A custom message associated with the registration of an endpoint when issuing a response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointItemResponse withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * The status code associated with the merging of an endpoint when issuing a response.
     * 
     * @param statusCode
     *        The status code associated with the merging of an endpoint when issuing a response.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * The status code associated with the merging of an endpoint when issuing a response.
     * 
     * @return The status code associated with the merging of an endpoint when issuing a response.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * The status code associated with the merging of an endpoint when issuing a response.
     * 
     * @param statusCode
     *        The status code associated with the merging of an endpoint when issuing a response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointItemResponse withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointItemResponse == false)
            return false;
        EndpointItemResponse other = (EndpointItemResponse) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public EndpointItemResponse clone() {
        try {
            return (EndpointItemResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointItemResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
