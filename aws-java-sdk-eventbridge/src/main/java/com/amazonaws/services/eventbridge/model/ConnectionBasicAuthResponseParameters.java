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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the authorization parameters for the connection if Basic is specified as the authorization type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ConnectionBasicAuthResponseParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionBasicAuthResponseParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     * 
     * @param username
     *        The user name to use for Basic authorization.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     * 
     * @return The user name to use for Basic authorization.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to use for Basic authorization.
     * </p>
     * 
     * @param username
     *        The user name to use for Basic authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionBasicAuthResponseParameters withUsername(String username) {
        setUsername(username);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionBasicAuthResponseParameters == false)
            return false;
        ConnectionBasicAuthResponseParameters other = (ConnectionBasicAuthResponseParameters) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionBasicAuthResponseParameters clone() {
        try {
            return (ConnectionBasicAuthResponseParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.ConnectionBasicAuthResponseParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
