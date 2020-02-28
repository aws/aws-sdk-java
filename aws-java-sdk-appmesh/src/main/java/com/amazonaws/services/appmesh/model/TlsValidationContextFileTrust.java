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
 * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TlsValidationContextFileTrust"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsValidationContextFileTrust implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy is
     * running on.
     * </p>
     */
    private String certificateChain;

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy is
     * running on.
     * </p>
     * 
     * @param certificateChain
     *        The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy
     *        is running on.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy is
     * running on.
     * </p>
     * 
     * @return The certificate trust chain for a certificate stored on the file system of the virtual node that the
     *         proxy is running on.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy is
     * running on.
     * </p>
     * 
     * @param certificateChain
     *        The certificate trust chain for a certificate stored on the file system of the virtual node that the proxy
     *        is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsValidationContextFileTrust withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
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
            sb.append("CertificateChain: ").append(getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsValidationContextFileTrust == false)
            return false;
        TlsValidationContextFileTrust other = (TlsValidationContextFileTrust) obj;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public TlsValidationContextFileTrust clone() {
        try {
            return (TlsValidationContextFileTrust) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.TlsValidationContextFileTrustMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
