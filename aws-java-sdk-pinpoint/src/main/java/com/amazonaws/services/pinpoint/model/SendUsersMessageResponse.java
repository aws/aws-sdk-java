/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about which users and endpoints a message was sent to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessageResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendUsersMessageResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that was used to send the message.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and,
     * for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result;

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

    public SendUsersMessageResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     * 
     * @param requestId
     *        The unique identifier that was assigned to the message request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     * 
     * @return The unique identifier that was assigned to the message request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique identifier that was assigned to the message request.
     * </p>
     * 
     * @param requestId
     *        The unique identifier that was assigned to the message request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageResponse withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and,
     * for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     * </p>
     * 
     * @return An object that indicates which endpoints the message was sent to, for each user. The object lists user
     *         IDs and, for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID,
     *         it provides an EndpointMessageResult object.
     */

    public java.util.Map<String, java.util.Map<String, EndpointMessageResult>> getResult() {
        return result;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and,
     * for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     * </p>
     * 
     * @param result
     *        An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs
     *        and, for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it
     *        provides an EndpointMessageResult object.
     */

    public void setResult(java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        this.result = result;
    }

    /**
     * <p>
     * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and,
     * for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an
     * EndpointMessageResult object.
     * </p>
     * 
     * @param result
     *        An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs
     *        and, for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it
     *        provides an EndpointMessageResult object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageResponse withResult(java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        setResult(result);
        return this;
    }

    /**
     * Add a single Result entry
     *
     * @see SendUsersMessageResponse#withResult
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageResponse addResultEntry(String key, java.util.Map<String, EndpointMessageResult> value) {
        if (null == this.result) {
            this.result = new java.util.HashMap<String, java.util.Map<String, EndpointMessageResult>>();
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

    public SendUsersMessageResponse clearResultEntries() {
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

        if (obj instanceof SendUsersMessageResponse == false)
            return false;
        SendUsersMessageResponse other = (SendUsersMessageResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
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
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public SendUsersMessageResponse clone() {
        try {
            return (SendUsersMessageResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SendUsersMessageResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
