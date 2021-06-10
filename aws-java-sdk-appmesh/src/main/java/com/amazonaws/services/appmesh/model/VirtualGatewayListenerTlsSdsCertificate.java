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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the virtual gateway's listener's Secret Discovery Service certificate.The proxy must be
 * configured with a local SDS provider via a Unix Domain Socket. See App Mesh<a
 * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html">TLS documentation</a> for more info.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayListenerTlsSdsCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayListenerTlsSdsCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents the name of the secret secret requested from the Secret Discovery
     * Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate chain.
     * </p>
     */
    private String secretName;

    /**
     * <p>
     * A reference to an object that represents the name of the secret secret requested from the Secret Discovery
     * Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate chain.
     * </p>
     * 
     * @param secretName
     *        A reference to an object that represents the name of the secret secret requested from the Secret Discovery
     *        Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate
     *        chain.
     */

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    /**
     * <p>
     * A reference to an object that represents the name of the secret secret requested from the Secret Discovery
     * Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate chain.
     * </p>
     * 
     * @return A reference to an object that represents the name of the secret secret requested from the Secret
     *         Discovery Service provider representing Transport Layer Security (TLS) materials like a certificate or
     *         certificate chain.
     */

    public String getSecretName() {
        return this.secretName;
    }

    /**
     * <p>
     * A reference to an object that represents the name of the secret secret requested from the Secret Discovery
     * Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate chain.
     * </p>
     * 
     * @param secretName
     *        A reference to an object that represents the name of the secret secret requested from the Secret Discovery
     *        Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate
     *        chain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayListenerTlsSdsCertificate withSecretName(String secretName) {
        setSecretName(secretName);
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
        if (getSecretName() != null)
            sb.append("SecretName: ").append(getSecretName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayListenerTlsSdsCertificate == false)
            return false;
        VirtualGatewayListenerTlsSdsCertificate other = (VirtualGatewayListenerTlsSdsCertificate) obj;
        if (other.getSecretName() == null ^ this.getSecretName() == null)
            return false;
        if (other.getSecretName() != null && other.getSecretName().equals(this.getSecretName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretName() == null) ? 0 : getSecretName().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayListenerTlsSdsCertificate clone() {
        try {
            return (VirtualGatewayListenerTlsSdsCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayListenerTlsSdsCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
