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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a custom method used to code sign a file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomCodeSigning implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The signature for the file.
     * </p>
     */
    private CodeSigningSignature signature;
    /**
     * <p>
     * The certificate chain.
     * </p>
     */
    private CodeSigningCertificateChain certificateChain;
    /**
     * <p>
     * The hash algorithm used to code sign the file.
     * </p>
     */
    private String hashAlgorithm;
    /**
     * <p>
     * The signature algorithm used to code sign the file.
     * </p>
     */
    private String signatureAlgorithm;

    /**
     * <p>
     * The signature for the file.
     * </p>
     * 
     * @param signature
     *        The signature for the file.
     */

    public void setSignature(CodeSigningSignature signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The signature for the file.
     * </p>
     * 
     * @return The signature for the file.
     */

    public CodeSigningSignature getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The signature for the file.
     * </p>
     * 
     * @param signature
     *        The signature for the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomCodeSigning withSignature(CodeSigningSignature signature) {
        setSignature(signature);
        return this;
    }

    /**
     * <p>
     * The certificate chain.
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain.
     */

    public void setCertificateChain(CodeSigningCertificateChain certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The certificate chain.
     * </p>
     * 
     * @return The certificate chain.
     */

    public CodeSigningCertificateChain getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The certificate chain.
     * </p>
     * 
     * @param certificateChain
     *        The certificate chain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomCodeSigning withCertificateChain(CodeSigningCertificateChain certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * <p>
     * The hash algorithm used to code sign the file.
     * </p>
     * 
     * @param hashAlgorithm
     *        The hash algorithm used to code sign the file.
     */

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    /**
     * <p>
     * The hash algorithm used to code sign the file.
     * </p>
     * 
     * @return The hash algorithm used to code sign the file.
     */

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    /**
     * <p>
     * The hash algorithm used to code sign the file.
     * </p>
     * 
     * @param hashAlgorithm
     *        The hash algorithm used to code sign the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomCodeSigning withHashAlgorithm(String hashAlgorithm) {
        setHashAlgorithm(hashAlgorithm);
        return this;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the file.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The signature algorithm used to code sign the file.
     */

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the file.
     * </p>
     * 
     * @return The signature algorithm used to code sign the file.
     */

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the file.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The signature algorithm used to code sign the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomCodeSigning withSignatureAlgorithm(String signatureAlgorithm) {
        setSignatureAlgorithm(signatureAlgorithm);
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
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain()).append(",");
        if (getHashAlgorithm() != null)
            sb.append("HashAlgorithm: ").append(getHashAlgorithm()).append(",");
        if (getSignatureAlgorithm() != null)
            sb.append("SignatureAlgorithm: ").append(getSignatureAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomCodeSigning == false)
            return false;
        CustomCodeSigning other = (CustomCodeSigning) obj;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getHashAlgorithm() == null ^ this.getHashAlgorithm() == null)
            return false;
        if (other.getHashAlgorithm() != null && other.getHashAlgorithm().equals(this.getHashAlgorithm()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getHashAlgorithm() == null) ? 0 : getHashAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public CustomCodeSigning clone() {
        try {
            return (CustomCodeSigning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CustomCodeSigningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
