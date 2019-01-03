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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * String that contains the ACM certificate represented by the ARN specified at input.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The certificate chain that contains the root certificate issued by the certificate authority (CA).
     * </p>
     */
    private String certificateChain;

    /**
     * <p>
     * String that contains the ACM certificate represented by the ARN specified at input.
     * </p>
     * 
     * @param certificate
     *        String that contains the ACM certificate represented by the ARN specified at input.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * String that contains the ACM certificate represented by the ARN specified at input.
     * </p>
     * 
     * @return String that contains the ACM certificate represented by the ARN specified at input.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * String that contains the ACM certificate represented by the ARN specified at input.
     * </p>
     * 
     * @param certificate
     *        String that contains the ACM certificate represented by the ARN specified at input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateResult withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The certificate chain that contains the root certificate issued by the certificate authority (CA).
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain that contains the root certificate issued by the certificate authority (CA).
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate chain that contains the root certificate issued by the certificate authority (CA).
     * </p>
     * 
     * @return The certificate chain that contains the root certificate issued by the certificate authority (CA).
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The certificate chain that contains the root certificate issued by the certificate authority (CA).
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain that contains the root certificate issued by the certificate authority (CA).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCertificateResult withCertificateChain(String certificateChain) {
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

        if (obj instanceof GetCertificateResult == false)
            return false;
        GetCertificateResult other = (GetCertificateResult) obj;
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
    public GetCertificateResult clone() {
        try {
            return (GetCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
