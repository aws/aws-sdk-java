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
 * Provides information about the results of a request to send a message to an endpoint address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/MessageResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that was used to send the message.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint
     * ID is the key and the result is the value.
     * </p>
     */
    private java.util.Map<String, EndpointMessageResult> endpointResult;
    /**
     * <p>
     * The identifier for the original request that the message was delivered for.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * A map that contains a multipart response for each address (email address, phone number, or push notification
     * token) that the message was sent to. In the map, the address is the key and the result is the value.
     * </p>
     */
    private java.util.Map<String, MessageResult> result;

    /**
     * <p>
     * The unique identifier for the application that was used to send the message.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that was used to send the message.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that was used to send the message.
     * </p>
     * 
     * @return The unique identifier for the application that was used to send the message.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that was used to send the message.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that was used to send the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint
     * ID is the key and the result is the value.
     * </p>
     * 
     * @return A map that contains a multipart response for each address that the message was sent to. In the map, the
     *         endpoint ID is the key and the result is the value.
     */

    public java.util.Map<String, EndpointMessageResult> getEndpointResult() {
        return endpointResult;
    }

    /**
     * <p>
     * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint
     * ID is the key and the result is the value.
     * </p>
     * 
     * @param endpointResult
     *        A map that contains a multipart response for each address that the message was sent to. In the map, the
     *        endpoint ID is the key and the result is the value.
     */

    public void setEndpointResult(java.util.Map<String, EndpointMessageResult> endpointResult) {
        this.endpointResult = endpointResult;
    }

    /**
     * <p>
     * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint
     * ID is the key and the result is the value.
     * </p>
     * 
     * @param endpointResult
     *        A map that contains a multipart response for each address that the message was sent to. In the map, the
     *        endpoint ID is the key and the result is the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResponse withEndpointResult(java.util.Map<String, EndpointMessageResult> endpointResult) {
        setEndpointResult(endpointResult);
        return this;
    }

    public MessageResponse addEndpointResultEntry(String key, EndpointMessageResult value) {
        if (null == this.endpointResult) {
            this.endpointResult = new java.util.HashMap<String, EndpointMessageResult>();
        }
        if (this.endpointResult.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.endpointResult.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EndpointResult.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResponse clearEndpointResultEntries() {
        this.endpointResult = null;
        return this;
    }

    /**
     * <p>
     * The identifier for the original request that the message was delivered for.
     * </p>
     * 
     * @param requestId
     *        The identifier for the original request that the message was delivered for.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The identifier for the original request that the message was delivered for.
     * </p>
     * 
     * @return The identifier for the original request that the message was delivered for.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The identifier for the original request that the message was delivered for.
     * </p>
     * 
     * @param requestId
     *        The identifier for the original request that the message was delivered for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResponse withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * A map that contains a multipart response for each address (email address, phone number, or push notification
     * token) that the message was sent to. In the map, the address is the key and the result is the value.
     * </p>
     * 
     * @return A map that contains a multipart response for each address (email address, phone number, or push
     *         notification token) that the message was sent to. In the map, the address is the key and the result is
     *         the value.
     */

    public java.util.Map<String, MessageResult> getResult() {
        return result;
    }

    /**
     * <p>
     * A map that contains a multipart response for each address (email address, phone number, or push notification
     * token) that the message was sent to. In the map, the address is the key and the result is the value.
     * </p>
     * 
     * @param result
     *        A map that contains a multipart response for each address (email address, phone number, or push
     *        notification token) that the message was sent to. In the map, the address is the key and the result is the
     *        value.
     */

    public void setResult(java.util.Map<String, MessageResult> result) {
        this.result = result;
    }

    /**
     * <p>
     * A map that contains a multipart response for each address (email address, phone number, or push notification
     * token) that the message was sent to. In the map, the address is the key and the result is the value.
     * </p>
     * 
     * @param result
     *        A map that contains a multipart response for each address (email address, phone number, or push
     *        notification token) that the message was sent to. In the map, the address is the key and the result is the
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResponse withResult(java.util.Map<String, MessageResult> result) {
        setResult(result);
        return this;
    }

    public MessageResponse addResultEntry(String key, MessageResult value) {
        if (null == this.result) {
            this.result = new java.util.HashMap<String, MessageResult>();
        }
        if (this.result.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.result.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Result.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageResponse clearResultEntries() {
        this.result = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEndpointResult() != null)
            sb.append("EndpointResult: ").append(getEndpointResult()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageResponse == false)
            return false;
        MessageResponse other = (MessageResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndpointResult() == null ^ this.getEndpointResult() == null)
            return false;
        if (other.getEndpointResult() != null && other.getEndpointResult().equals(this.getEndpointResult()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndpointResult() == null) ? 0 : getEndpointResult().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public MessageResponse clone() {
        try {
            return (MessageResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MessageResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
