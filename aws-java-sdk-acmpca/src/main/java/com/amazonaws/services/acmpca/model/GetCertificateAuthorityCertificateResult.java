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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/GetCertificateAuthorityCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCertificateAuthorityCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Base64-encoded certificate authority (CA) certificate.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises
     * certificate that you used to sign your private CA certificate. The chain does not include your private CA
     * certificate.
     * </p>
     */
    private String certificateChain;

    /**
     * <p>
     * Base64-encoded certificate authority (CA) certificate.
     * </p>
     * 
     * @param certificate
     *        Base64-encoded certificate authority (CA) certificate.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * Base64-encoded certificate authority (CA) certificate.
     * </p>
     * 
     * @return Base64-encoded certificate authority (CA) certificate.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * Base64-encoded certificate authority (CA) certificate.
     * </p>
     * 
     * @param certificate
     *        Base64-encoded certificate authority (CA) certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateAuthorityCertificateResult withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises
     * certificate that you used to sign your private CA certificate. The chain does not include your private CA
     * certificate.
     * </p>
     * 
     * @param certificateChain
     *        Base64-encoded certificate chain that includes any intermediate certificates and chains up to root
     *        on-premises certificate that you used to sign your private CA certificate. The chain does not include your
     *        private CA certificate.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises
     * certificate that you used to sign your private CA certificate. The chain does not include your private CA
     * certificate.
     * </p>
     * 
     * @return Base64-encoded certificate chain that includes any intermediate certificates and chains up to root
     *         on-premises certificate that you used to sign your private CA certificate. The chain does not include
     *         your private CA certificate.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises
     * certificate that you used to sign your private CA certificate. The chain does not include your private CA
     * certificate.
     * </p>
     * 
     * @param certificateChain
     *        Base64-encoded certificate chain that includes any intermediate certificates and chains up to root
     *        on-premises certificate that you used to sign your private CA certificate. The chain does not include your
     *        private CA certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateAuthorityCertificateResult withCertificateChain(String certificateChain) {
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
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

        if (obj instanceof GetCertificateAuthorityCertificateResult == false)
            return false;
        GetCertificateAuthorityCertificateResult other = (GetCertificateAuthorityCertificateResult) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public GetCertificateAuthorityCertificateResult clone() {
        try {
            return (GetCertificateAuthorityCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
