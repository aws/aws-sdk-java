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
 * Parameter information for key material import using the asymmetric TR-34 key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportTr34KeyBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTr34KeyBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key import.
     * </p>
     */
    private String certificateAuthorityPublicKeyIdentifier;
    /**
     * <p>
     * The public key component in PEM certificate format of the private key that signs the KDH TR-34 WrappedKeyBlock.
     * </p>
     */
    private String signingKeyCertificate;
    /**
     * <p>
     * The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     * Services Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys
     * to the same service account.
     * </p>
     */
    private String importToken;
    /**
     * <p>
     * The TR-34 wrapped key block to import.
     * </p>
     */
    private String wrappedKeyBlock;
    /**
     * <p>
     * The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * </p>
     */
    private String keyBlockFormat;
    /**
     * <p>
     * A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will fail, if a
     * random nonce value is not provided for a TR-34 key block generated using 2 pass.
     * </p>
     */
    private String randomNonce;

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key import.
     * </p>
     * 
     * @param certificateAuthorityPublicKeyIdentifier
     *        The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key
     *        import.
     */

    public void setCertificateAuthorityPublicKeyIdentifier(String certificateAuthorityPublicKeyIdentifier) {
        this.certificateAuthorityPublicKeyIdentifier = certificateAuthorityPublicKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key import.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key
     *         import.
     */

    public String getCertificateAuthorityPublicKeyIdentifier() {
        return this.certificateAuthorityPublicKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key import.
     * </p>
     * 
     * @param certificateAuthorityPublicKeyIdentifier
     *        The <code>KeyARN</code> of the certificate chain that signs the signing key certificate during TR-34 key
     *        import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr34KeyBlock withCertificateAuthorityPublicKeyIdentifier(String certificateAuthorityPublicKeyIdentifier) {
        setCertificateAuthorityPublicKeyIdentifier(certificateAuthorityPublicKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The public key component in PEM certificate format of the private key that signs the KDH TR-34 WrappedKeyBlock.
     * </p>
     * 
     * @param signingKeyCertificate
     *        The public key component in PEM certificate format of the private key that signs the KDH TR-34
     *        WrappedKeyBlock.
     */

    public void setSigningKeyCertificate(String signingKeyCertificate) {
        this.signingKeyCertificate = signingKeyCertificate;
    }

    /**
     * <p>
     * The public key component in PEM certificate format of the private key that signs the KDH TR-34 WrappedKeyBlock.
     * </p>
     * 
     * @return The public key component in PEM certificate format of the private key that signs the KDH TR-34
     *         WrappedKeyBlock.
     */

    public String getSigningKeyCertificate() {
        return this.signingKeyCertificate;
    }

    /**
     * <p>
     * The public key component in PEM certificate format of the private key that signs the KDH TR-34 WrappedKeyBlock.
     * </p>
     * 
     * @param signingKeyCertificate
     *        The public key component in PEM certificate format of the private key that signs the KDH TR-34
     *        WrappedKeyBlock.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr34KeyBlock withSigningKeyCertificate(String signingKeyCertificate) {
        setSigningKeyCertificate(signingKeyCertificate);
        return this;
    }

    /**
     * <p>
     * The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     * Services Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys
     * to the same service account.
     * </p>
     * 
     * @param importToken
     *        The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     *        Services Payment Cryptography. It expires after 7 days. You can use the same import token to import
     *        multiple keys to the same service account.
     */

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     * Services Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys
     * to the same service account.
     * </p>
     * 
     * @return The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     *         Services Payment Cryptography. It expires after 7 days. You can use the same import token to import
     *         multiple keys to the same service account.
     */

    public String getImportToken() {
        return this.importToken;
    }

    /**
     * <p>
     * The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     * Services Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys
     * to the same service account.
     * </p>
     * 
     * @param importToken
     *        The import token that initiates key import using the asymmetric TR-34 key exchange method into Amazon Web
     *        Services Payment Cryptography. It expires after 7 days. You can use the same import token to import
     *        multiple keys to the same service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr34KeyBlock withImportToken(String importToken) {
        setImportToken(importToken);
        return this;
    }

    /**
     * <p>
     * The TR-34 wrapped key block to import.
     * </p>
     * 
     * @param wrappedKeyBlock
     *        The TR-34 wrapped key block to import.
     */

    public void setWrappedKeyBlock(String wrappedKeyBlock) {
        this.wrappedKeyBlock = wrappedKeyBlock;
    }

    /**
     * <p>
     * The TR-34 wrapped key block to import.
     * </p>
     * 
     * @return The TR-34 wrapped key block to import.
     */

    public String getWrappedKeyBlock() {
        return this.wrappedKeyBlock;
    }

    /**
     * <p>
     * The TR-34 wrapped key block to import.
     * </p>
     * 
     * @param wrappedKeyBlock
     *        The TR-34 wrapped key block to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr34KeyBlock withWrappedKeyBlock(String wrappedKeyBlock) {
        setWrappedKeyBlock(wrappedKeyBlock);
        return this;
    }

    /**
     * <p>
     * The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * </p>
     * 
     * @param keyBlockFormat
     *        The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * @see Tr34KeyBlockFormat
     */

    public void setKeyBlockFormat(String keyBlockFormat) {
        this.keyBlockFormat = keyBlockFormat;
    }

    /**
     * <p>
     * The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * </p>
     * 
     * @return The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * @see Tr34KeyBlockFormat
     */

    public String getKeyBlockFormat() {
        return this.keyBlockFormat;
    }

    /**
     * <p>
     * The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * </p>
     * 
     * @param keyBlockFormat
     *        The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tr34KeyBlockFormat
     */

    public ImportTr34KeyBlock withKeyBlockFormat(String keyBlockFormat) {
        setKeyBlockFormat(keyBlockFormat);
        return this;
    }

    /**
     * <p>
     * The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * </p>
     * 
     * @param keyBlockFormat
     *        The key block format to use during key import. The only value allowed is <code>X9_TR34_2012</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tr34KeyBlockFormat
     */

    public ImportTr34KeyBlock withKeyBlockFormat(Tr34KeyBlockFormat keyBlockFormat) {
        this.keyBlockFormat = keyBlockFormat.toString();
        return this;
    }

    /**
     * <p>
     * A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will fail, if a
     * random nonce value is not provided for a TR-34 key block generated using 2 pass.
     * </p>
     * 
     * @param randomNonce
     *        A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will
     *        fail, if a random nonce value is not provided for a TR-34 key block generated using 2 pass.
     */

    public void setRandomNonce(String randomNonce) {
        this.randomNonce = randomNonce;
    }

    /**
     * <p>
     * A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will fail, if a
     * random nonce value is not provided for a TR-34 key block generated using 2 pass.
     * </p>
     * 
     * @return A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will
     *         fail, if a random nonce value is not provided for a TR-34 key block generated using 2 pass.
     */

    public String getRandomNonce() {
        return this.randomNonce;
    }

    /**
     * <p>
     * A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will fail, if a
     * random nonce value is not provided for a TR-34 key block generated using 2 pass.
     * </p>
     * 
     * @param randomNonce
     *        A random number value that is unique to the TR-34 key block generated using 2 pass. The operation will
     *        fail, if a random nonce value is not provided for a TR-34 key block generated using 2 pass.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr34KeyBlock withRandomNonce(String randomNonce) {
        setRandomNonce(randomNonce);
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
        if (getSigningKeyCertificate() != null)
            sb.append("SigningKeyCertificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getImportToken() != null)
            sb.append("ImportToken: ").append(getImportToken()).append(",");
        if (getWrappedKeyBlock() != null)
            sb.append("WrappedKeyBlock: ").append(getWrappedKeyBlock()).append(",");
        if (getKeyBlockFormat() != null)
            sb.append("KeyBlockFormat: ").append(getKeyBlockFormat()).append(",");
        if (getRandomNonce() != null)
            sb.append("RandomNonce: ").append(getRandomNonce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTr34KeyBlock == false)
            return false;
        ImportTr34KeyBlock other = (ImportTr34KeyBlock) obj;
        if (other.getCertificateAuthorityPublicKeyIdentifier() == null ^ this.getCertificateAuthorityPublicKeyIdentifier() == null)
            return false;
        if (other.getCertificateAuthorityPublicKeyIdentifier() != null
                && other.getCertificateAuthorityPublicKeyIdentifier().equals(this.getCertificateAuthorityPublicKeyIdentifier()) == false)
            return false;
        if (other.getSigningKeyCertificate() == null ^ this.getSigningKeyCertificate() == null)
            return false;
        if (other.getSigningKeyCertificate() != null && other.getSigningKeyCertificate().equals(this.getSigningKeyCertificate()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null && other.getImportToken().equals(this.getImportToken()) == false)
            return false;
        if (other.getWrappedKeyBlock() == null ^ this.getWrappedKeyBlock() == null)
            return false;
        if (other.getWrappedKeyBlock() != null && other.getWrappedKeyBlock().equals(this.getWrappedKeyBlock()) == false)
            return false;
        if (other.getKeyBlockFormat() == null ^ this.getKeyBlockFormat() == null)
            return false;
        if (other.getKeyBlockFormat() != null && other.getKeyBlockFormat().equals(this.getKeyBlockFormat()) == false)
            return false;
        if (other.getRandomNonce() == null ^ this.getRandomNonce() == null)
            return false;
        if (other.getRandomNonce() != null && other.getRandomNonce().equals(this.getRandomNonce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityPublicKeyIdentifier() == null) ? 0 : getCertificateAuthorityPublicKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSigningKeyCertificate() == null) ? 0 : getSigningKeyCertificate().hashCode());
        hashCode = prime * hashCode + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode + ((getWrappedKeyBlock() == null) ? 0 : getWrappedKeyBlock().hashCode());
        hashCode = prime * hashCode + ((getKeyBlockFormat() == null) ? 0 : getKeyBlockFormat().hashCode());
        hashCode = prime * hashCode + ((getRandomNonce() == null) ? 0 : getRandomNonce().hashCode());
        return hashCode;
    }

    @Override
    public ImportTr34KeyBlock clone() {
        try {
            return (ImportTr34KeyBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ImportTr34KeyBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
