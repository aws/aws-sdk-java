/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the client response parameters for the connection when OAuth is specified as the authorization type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ConnectionOAuthClientResponseParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionOAuthClientResponseParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The client ID associated with the response to the connection request.
     * </p>
     */
    private String clientID;

    /**
     * <p>
     * The client ID associated with the response to the connection request.
     * </p>
     * 
     * @param clientID
     *        The client ID associated with the response to the connection request.
     */

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * <p>
     * The client ID associated with the response to the connection request.
     * </p>
     * 
     * @return The client ID associated with the response to the connection request.
     */

    public String getClientID() {
        return this.clientID;
    }

    /**
     * <p>
     * The client ID associated with the response to the connection request.
     * </p>
     * 
     * @param clientID
     *        The client ID associated with the response to the connection request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionOAuthClientResponseParameters withClientID(String clientID) {
        setClientID(clientID);
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
        if (getClientID() != null)
            sb.append("ClientID: ").append(getClientID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionOAuthClientResponseParameters == false)
            return false;
        ConnectionOAuthClientResponseParameters other = (ConnectionOAuthClientResponseParameters) obj;
        if (other.getClientID() == null ^ this.getClientID() == null)
            return false;
        if (other.getClientID() != null && other.getClientID().equals(this.getClientID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientID() == null) ? 0 : getClientID().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionOAuthClientResponseParameters clone() {
        try {
            return (ConnectionOAuthClientResponseParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.ConnectionOAuthClientResponseParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
