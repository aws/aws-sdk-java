/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * User send message response.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessageResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendUsersMessageResponse implements Serializable, Cloneable, StructuredPojo {

    /** Application id of the message. */
    private String applicationId;
    /** Original request Id for which this message was delivered. */
    private String requestId;
    /** A map containing of UserId to Map of EndpointId to Endpoint Message Result. */
    private java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result;

    /**
     * Application id of the message.
     * 
     * @param applicationId
     *        Application id of the message.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Application id of the message.
     * 
     * @return Application id of the message.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Application id of the message.
     * 
     * @param applicationId
     *        Application id of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * Original request Id for which this message was delivered.
     * 
     * @param requestId
     *        Original request Id for which this message was delivered.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Original request Id for which this message was delivered.
     * 
     * @return Original request Id for which this message was delivered.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Original request Id for which this message was delivered.
     * 
     * @param requestId
     *        Original request Id for which this message was delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageResponse withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * A map containing of UserId to Map of EndpointId to Endpoint Message Result.
     * 
     * @return A map containing of UserId to Map of EndpointId to Endpoint Message Result.
     */

    public java.util.Map<String, java.util.Map<String, EndpointMessageResult>> getResult() {
        return result;
    }

    /**
     * A map containing of UserId to Map of EndpointId to Endpoint Message Result.
     * 
     * @param result
     *        A map containing of UserId to Map of EndpointId to Endpoint Message Result.
     */

    public void setResult(java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        this.result = result;
    }

    /**
     * A map containing of UserId to Map of EndpointId to Endpoint Message Result.
     * 
     * @param result
     *        A map containing of UserId to Map of EndpointId to Endpoint Message Result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendUsersMessageResponse withResult(java.util.Map<String, java.util.Map<String, EndpointMessageResult>> result) {
        setResult(result);
        return this;
    }

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
     * Returns a string representation of this object; useful for testing and debugging.
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
