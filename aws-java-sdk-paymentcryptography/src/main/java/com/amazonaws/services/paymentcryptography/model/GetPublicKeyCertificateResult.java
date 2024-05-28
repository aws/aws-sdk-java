/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetPublicKeyCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPublicKeyCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is signed by
     * the root certificate authority (CA). The certificate expires in 90 days.
     * </p>
     */
    private String keyCertificate;
    /**
     * <p>
     * The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded) of the
     * asymmetric key pair.
     * </p>
     */
    private String keyCertificateChain;

    /**
     * <p>
     * The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is signed by
     * the root certificate authority (CA). The certificate expires in 90 days.
     * </p>
     * 
     * @param keyCertificate
     *        The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is
     *        signed by the root certificate authority (CA). The certificate expires in 90 days.
     */

    public void setKeyCertificate(String keyCertificate) {
        this.keyCertificate = keyCertificate;
    }

    /**
     * <p>
     * The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is signed by
     * the root certificate authority (CA). The certificate expires in 90 days.
     * </p>
     * 
     * @return The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is
     *         signed by the root certificate authority (CA). The certificate expires in 90 days.
     */

    public String getKeyCertificate() {
        return this.keyCertificate;
    }

    /**
     * <p>
     * The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is signed by
     * the root certificate authority (CA). The certificate expires in 90 days.
     * </p>
     * 
     * @param keyCertificate
     *        The public key component of the asymmetric key pair in a certificate PEM format (base64 encoded). It is
     *        signed by the root certificate authority (CA). The certificate expires in 90 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPublicKeyCertificateResult withKeyCertificate(String keyCertificate) {
        setKeyCertificate(keyCertificate);
        return this;
    }

    /**
     * <p>
     * The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded) of the
     * asymmetric key pair.
     * </p>
     * 
     * @param keyCertificateChain
     *        The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded)
     *        of the asymmetric key pair.
     */

    public void setKeyCertificateChain(String keyCertificateChain) {
        this.keyCertificateChain = keyCertificateChain;
    }

    /**
     * <p>
     * The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded) of the
     * asymmetric key pair.
     * </p>
     * 
     * @return The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded)
     *         of the asymmetric key pair.
     */

    public String getKeyCertificateChain() {
        return this.keyCertificateChain;
    }

    /**
     * <p>
     * The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded) of the
     * asymmetric key pair.
     * </p>
     * 
     * @param keyCertificateChain
     *        The root certificate authority (CA) that signed the public key certificate in PEM format (base64 encoded)
     *        of the asymmetric key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPublicKeyCertificateResult withKeyCertificateChain(String keyCertificateChain) {
        setKeyCertificateChain(keyCertificateChain);
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
        if (getKeyCertificate() != null)
            sb.append("KeyCertificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getKeyCertificateChain() != null)
            sb.append("KeyCertificateChain: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPublicKeyCertificateResult == false)
            return false;
        GetPublicKeyCertificateResult other = (GetPublicKeyCertificateResult) obj;
        if (other.getKeyCertificate() == null ^ this.getKeyCertificate() == null)
            return false;
        if (other.getKeyCertificate() != null && other.getKeyCertificate().equals(this.getKeyCertificate()) == false)
            return false;
        if (other.getKeyCertificateChain() == null ^ this.getKeyCertificateChain() == null)
            return false;
        if (other.getKeyCertificateChain() != null && other.getKeyCertificateChain().equals(this.getKeyCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyCertificate() == null) ? 0 : getKeyCertificate().hashCode());
        hashCode = prime * hashCode + ((getKeyCertificateChain() == null) ? 0 : getKeyCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public GetPublicKeyCertificateResult clone() {
        try {
            return (GetPublicKeyCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
