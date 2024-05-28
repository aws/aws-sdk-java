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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameter information for key material export using asymmetric RSA wrap and unwrap key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportKeyCryptogram"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportKeyCryptogram implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap and
     * unwrap key export.
     * </p>
     */
    private String certificateAuthorityPublicKeyIdentifier;
    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     */
    private String wrappingKeyCertificate;
    /**
     * <p>
     * The wrapping spec for the key under export.
     * </p>
     */
    private String wrappingSpec;

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap and
     * unwrap key export.
     * </p>
     * 
     * @param certificateAuthorityPublicKeyIdentifier
     *        The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap
     *        and unwrap key export.
     */

    public void setCertificateAuthorityPublicKeyIdentifier(String certificateAuthorityPublicKeyIdentifier) {
        this.certificateAuthorityPublicKeyIdentifier = certificateAuthorityPublicKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap and
     * unwrap key export.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap
     *         and unwrap key export.
     */

    public String getCertificateAuthorityPublicKeyIdentifier() {
        return this.certificateAuthorityPublicKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap and
     * unwrap key export.
     * </p>
     * 
     * @param certificateAuthorityPublicKeyIdentifier
     *        The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during RSA wrap
     *        and unwrap key export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportKeyCryptogram withCertificateAuthorityPublicKeyIdentifier(String certificateAuthorityPublicKeyIdentifier) {
        setCertificateAuthorityPublicKeyIdentifier(certificateAuthorityPublicKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     * 
     * @param wrappingKeyCertificate
     *        The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography uses
     *        this certificate to wrap the key under export.
     */

    public void setWrappingKeyCertificate(String wrappingKeyCertificate) {
        this.wrappingKeyCertificate = wrappingKeyCertificate;
    }

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     * 
     * @return The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography
     *         uses this certificate to wrap the key under export.
     */

    public String getWrappingKeyCertificate() {
        return this.wrappingKeyCertificate;
    }

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     * 
     * @param wrappingKeyCertificate
     *        The wrapping key certificate in PEM format (base64 encoded). Amazon Web Services Payment Cryptography uses
     *        this certificate to wrap the key under export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportKeyCryptogram withWrappingKeyCertificate(String wrappingKeyCertificate) {
        setWrappingKeyCertificate(wrappingKeyCertificate);
        return this;
    }

    /**
     * <p>
     * The wrapping spec for the key under export.
     * </p>
     * 
     * @param wrappingSpec
     *        The wrapping spec for the key under export.
     * @see WrappingKeySpec
     */

    public void setWrappingSpec(String wrappingSpec) {
        this.wrappingSpec = wrappingSpec;
    }

    /**
     * <p>
     * The wrapping spec for the key under export.
     * </p>
     * 
     * @return The wrapping spec for the key under export.
     * @see WrappingKeySpec
     */

    public String getWrappingSpec() {
        return this.wrappingSpec;
    }

    /**
     * <p>
     * The wrapping spec for the key under export.
     * </p>
     * 
     * @param wrappingSpec
     *        The wrapping spec for the key under export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public ExportKeyCryptogram withWrappingSpec(String wrappingSpec) {
        setWrappingSpec(wrappingSpec);
        return this;
    }

    /**
     * <p>
     * The wrapping spec for the key under export.
     * </p>
     * 
     * @param wrappingSpec
     *        The wrapping spec for the key under export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public ExportKeyCryptogram withWrappingSpec(WrappingKeySpec wrappingSpec) {
        this.wrappingSpec = wrappingSpec.toString();
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
        if (getCertificateAuthorityPublicKeyIdentifier() != null)
            sb.append("CertificateAuthorityPublicKeyIdentifier: ").append(getCertificateAuthorityPublicKeyIdentifier()).append(",");
        if (getWrappingKeyCertificate() != null)
            sb.append("WrappingKeyCertificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getWrappingSpec() != null)
            sb.append("WrappingSpec: ").append(getWrappingSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportKeyCryptogram == false)
            return false;
        ExportKeyCryptogram other = (ExportKeyCryptogram) obj;
        if (other.getCertificateAuthorityPublicKeyIdentifier() == null ^ this.getCertificateAuthorityPublicKeyIdentifier() == null)
            return false;
        if (other.getCertificateAuthorityPublicKeyIdentifier() != null
                && other.getCertificateAuthorityPublicKeyIdentifier().equals(this.getCertificateAuthorityPublicKeyIdentifier()) == false)
            return false;
        if (other.getWrappingKeyCertificate() == null ^ this.getWrappingKeyCertificate() == null)
            return false;
        if (other.getWrappingKeyCertificate() != null && other.getWrappingKeyCertificate().equals(this.getWrappingKeyCertificate()) == false)
            return false;
        if (other.getWrappingSpec() == null ^ this.getWrappingSpec() == null)
            return false;
        if (other.getWrappingSpec() != null && other.getWrappingSpec().equals(this.getWrappingSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityPublicKeyIdentifier() == null) ? 0 : getCertificateAuthorityPublicKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeyCertificate() == null) ? 0 : getWrappingKeyCertificate().hashCode());
        hashCode = prime * hashCode + ((getWrappingSpec() == null) ? 0 : getWrappingSpec().hashCode());
        return hashCode;
    }

    @Override
    public ExportKeyCryptogram clone() {
        try {
            return (ExportKeyCryptogram) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ExportKeyCryptogramMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
