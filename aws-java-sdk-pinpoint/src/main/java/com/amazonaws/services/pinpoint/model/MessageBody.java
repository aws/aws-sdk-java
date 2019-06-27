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
 * <p>
 * Provides information about an API request or response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/MessageBody" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageBody implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message that's returned from the API.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     */
    private String requestID;

    /**
     * <p>
     * The message that's returned from the API.
     * </p>
     * 
     * @param message
     *        The message that's returned from the API.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that's returned from the API.
     * </p>
     * 
     * @return The message that's returned from the API.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message that's returned from the API.
     * </p>
     * 
     * @param message
     *        The message that's returned from the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageBody withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request or response.
     */

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     * 
     * @return The unique identifier for the request or response.
     */

    public String getRequestID() {
        return this.requestID;
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request or response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageBody withRequestID(String requestID) {
        setRequestID(requestID);
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
        if (getRequestID() != null)
            sb.append("RequestID: ").append(getRequestID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageBody == false)
            return false;
        MessageBody other = (MessageBody) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRequestID() == null ^ this.getRequestID() == null)
            return false;
        if (other.getRequestID() != null && other.getRequestID().equals(this.getRequestID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRequestID() == null) ? 0 : getRequestID().hashCode());
        return hashCode;
    }

    @Override
    public MessageBody clone() {
        try {
            return (MessageBody) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MessageBodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
