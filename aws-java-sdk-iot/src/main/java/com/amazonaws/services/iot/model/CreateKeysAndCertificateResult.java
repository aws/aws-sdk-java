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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output of the CreateKeysAndCertificate operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeysAndCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT
     * Certificate).
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     */
    private String certificatePem;
    /**
     * <p>
     * The generated key pair.
     * </p>
     */
    private KeyPair keyPair;

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     * 
     * @return The ARN of the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeysAndCertificateResult withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT
     * Certificate).
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT
     *        Certificate).
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT
     * Certificate).
     * </p>
     * 
     * @return The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS
     *         IoT Certificate).
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT
     * Certificate).
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT
     *        Certificate).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeysAndCertificateResult withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The certificate data, in PEM format.
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @return The certificate data, in PEM format.
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The certificate data, in PEM format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeysAndCertificateResult withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * <p>
     * The generated key pair.
     * </p>
     * 
     * @param keyPair
     *        The generated key pair.
     */

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The generated key pair.
     * </p>
     * 
     * @return The generated key pair.
     */

    public KeyPair getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The generated key pair.
     * </p>
     * 
     * @param keyPair
     *        The generated key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeysAndCertificateResult withKeyPair(KeyPair keyPair) {
        setKeyPair(keyPair);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: ").append(getCertificatePem()).append(",");
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeysAndCertificateResult == false)
            return false;
        CreateKeysAndCertificateResult other = (CreateKeysAndCertificateResult) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeysAndCertificateResult clone() {
        try {
            return (CreateKeysAndCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
