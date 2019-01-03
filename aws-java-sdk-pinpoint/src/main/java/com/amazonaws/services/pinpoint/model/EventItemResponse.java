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
 * A complex object that holds the status code and message as a result of processing an event.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventItemResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventItemResponse implements Serializable, Cloneable, StructuredPojo {

    /** A custom message that is associated with the processing of an event. */
    private String message;
    /**
     * The status returned in the response as a result of processing the event.
     * 
     * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     */
    private Integer statusCode;

    /**
     * A custom message that is associated with the processing of an event.
     * 
     * @param message
     *        A custom message that is associated with the processing of an event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * A custom message that is associated with the processing of an event.
     * 
     * @return A custom message that is associated with the processing of an event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * A custom message that is associated with the processing of an event.
     * 
     * @param message
     *        A custom message that is associated with the processing of an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventItemResponse withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * The status returned in the response as a result of processing the event.
     * 
     * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     * 
     * @param statusCode
     *        The status returned in the response as a result of processing the event.
     * 
     *        Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * The status returned in the response as a result of processing the event.
     * 
     * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     * 
     * @return The status returned in the response as a result of processing the event.
     * 
     *         Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * The status returned in the response as a result of processing the event.
     * 
     * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     * 
     * @param statusCode
     *        The status returned in the response as a result of processing the event.
     * 
     *        Possible values: 400 (for invalid events) and 202 (for events that were accepted).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventItemResponse withStatusCode(Integer statusCode) {
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

        if (obj instanceof EventItemResponse == false)
            return false;
        EventItemResponse other = (EventItemResponse) obj;
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
    public EventItemResponse clone() {
        try {
            return (EventItemResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventItemResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
