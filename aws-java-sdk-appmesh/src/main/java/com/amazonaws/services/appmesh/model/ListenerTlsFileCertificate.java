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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a local file certificate. The certificate must meet specific requirements and you must have
 * proxy authorization enabled. For more information, see <a
 * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
 * >Transport Layer Security (TLS)</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListenerTlsFileCertificate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListenerTlsFileCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     */
    private String certificateChain;
    /**
     * <p>
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on.
     * </p>
     */
    private String privateKey;

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain for the certificate.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * 
     * @return The certificate chain for the certificate.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The certificate chain for the certificate.
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTlsFileCertificate withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * <p>
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on.
     * </p>
     * 
     * @param privateKey
     *        The private key for a certificate stored on the file system of the virtual node that the proxy is running
     *        on.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on.
     * </p>
     * 
     * @return The private key for a certificate stored on the file system of the virtual node that the proxy is running
     *         on.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on.
     * </p>
     * 
     * @param privateKey
     *        The private key for a certificate stored on the file system of the virtual node that the proxy is running
     *        on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTlsFileCertificate withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
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
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTlsFileCertificate == false)
            return false;
        ListenerTlsFileCertificate other = (ListenerTlsFileCertificate) obj;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        return hashCode;
    }

    @Override
    public ListenerTlsFileCertificate clone() {
        try {
            return (ListenerTlsFileCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ListenerTlsFileCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
