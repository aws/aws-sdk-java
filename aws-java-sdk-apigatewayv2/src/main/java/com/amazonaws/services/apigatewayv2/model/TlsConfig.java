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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic uses
 * the HTTPS protocol. Supported only for HTTP APIs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The
     * server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     */
    private String serverNameToVerify;

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The
     * server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     * 
     * @param serverNameToVerify
     *        If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate.
     *        The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual
     *        hosting.
     */

    public void setServerNameToVerify(String serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
    }

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The
     * server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     * 
     * @return If you specify a server name, API Gateway uses it to verify the hostname on the integration's
     *         certificate. The server name is also included in the TLS handshake to support Server Name Indication
     *         (SNI) or virtual hosting.
     */

    public String getServerNameToVerify() {
        return this.serverNameToVerify;
    }

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The
     * server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     * 
     * @param serverNameToVerify
     *        If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate.
     *        The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual
     *        hosting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsConfig withServerNameToVerify(String serverNameToVerify) {
        setServerNameToVerify(serverNameToVerify);
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
        if (getServerNameToVerify() != null)
            sb.append("ServerNameToVerify: ").append(getServerNameToVerify());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsConfig == false)
            return false;
        TlsConfig other = (TlsConfig) obj;
        if (other.getServerNameToVerify() == null ^ this.getServerNameToVerify() == null)
            return false;
        if (other.getServerNameToVerify() != null && other.getServerNameToVerify().equals(this.getServerNameToVerify()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerNameToVerify() == null) ? 0 : getServerNameToVerify().hashCode());
        return hashCode;
    }

    @Override
    public TlsConfig clone() {
        try {
            return (TlsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.TlsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
