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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExportCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The base64 PEM-encoded certificate.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     * </p>
     */
    private String certificateChain;
    /**
     * <p>
     * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format
     * and is base64 PEM-encoded.
     * </p>
     */
    private String privateKey;

    /**
     * <p>
     * The base64 PEM-encoded certificate.
     * </p>
     * 
     * @param certificate
     *        The base64 PEM-encoded certificate.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate.
     * </p>
     * 
     * @return The base64 PEM-encoded certificate.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate.
     * </p>
     * 
     * @param certificate
     *        The base64 PEM-encoded certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportCertificateResult withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     * </p>
     * 
     * @param certificateChain
     *        The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     * </p>
     * 
     * @return The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     * </p>
     * 
     * @param certificateChain
     *        The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportCertificateResult withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * <p>
     * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format
     * and is base64 PEM-encoded.
     * </p>
     * 
     * @param privateKey
     *        The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8
     *        format and is base64 PEM-encoded.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format
     * and is base64 PEM-encoded.
     * </p>
     * 
     * @return The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8
     *         format and is base64 PEM-encoded.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format
     * and is base64 PEM-encoded.
     * </p>
     * 
     * @param privateKey
     *        The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8
     *        format and is base64 PEM-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportCertificateResult withPrivateKey(String privateKey) {
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportCertificateResult == false)
            return false;
        ExportCertificateResult other = (ExportCertificateResult) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        return hashCode;
    }

    @Override
    public ExportCertificateResult clone() {
        try {
            return (ExportCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
