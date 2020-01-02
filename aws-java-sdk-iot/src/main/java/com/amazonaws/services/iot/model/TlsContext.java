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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the TLS context to use for the test authorizer request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization request.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization request.
     * </p>
     * 
     * @param serverName
     *        The value of the <code>serverName</code> key in a TLS authorization request.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization request.
     * </p>
     * 
     * @return The value of the <code>serverName</code> key in a TLS authorization request.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization request.
     * </p>
     * 
     * @param serverName
     *        The value of the <code>serverName</code> key in a TLS authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsContext withServerName(String serverName) {
        setServerName(serverName);
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
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsContext == false)
            return false;
        TlsContext other = (TlsContext) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public TlsContext clone() {
        try {
            return (TlsContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TlsContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
