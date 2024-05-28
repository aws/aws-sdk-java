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
 * Parameter information for key material export using the asymmetric TR-34 key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportTr34KeyBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTr34KeyBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key export.
     * </p>
     */
    private String certificateAuthorityPublicKeyIdentifier;
    /**
     * <p>
     * The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     */
    private String wrappingKeyCertificate;
    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains the
     * signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     * >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same export
     * token to export multiple keys from the same service account.
     * </p>
     */
    private String exportToken;
    /**
     * <p>
     * The format of key block that Amazon Web Services Payment Cryptography will use during key export.
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
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     */
    private KeyBlockHeaders keyBlockHeaders;

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key export.
     * </p>
     * 
     * @param certificateAuthorityPublicKeyIdentifier
     *        The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key
     *        export.
     */

    public void setCertificateAuthorityPublicKeyIdentifier(String certificateAuthorityPublicKeyIdentifier) {
        this.certificateAuthorityPublicKeyIdentifier = certificateAuthorityPublicKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key export.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key
     *         export.
     */

    public String getCertificateAuthorityPublicKeyIdentifier() {
        return this.certificateAuthorityPublicKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key export.
     * </p>
     * 
     * @param certificateAuthorityPublicKeyIdentifier
     *        The <code>KeyARN</code> of the certificate chain that signs the wrapping key certificate during TR-34 key
     *        export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTr34KeyBlock withCertificateAuthorityPublicKeyIdentifier(String certificateAuthorityPublicKeyIdentifier) {
        setCertificateAuthorityPublicKeyIdentifier(certificateAuthorityPublicKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     * 
     * @param wrappingKeyCertificate
     *        The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses
     *        this certificate to wrap the key under export.
     */

    public void setWrappingKeyCertificate(String wrappingKeyCertificate) {
        this.wrappingKeyCertificate = wrappingKeyCertificate;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses
     *         this certificate to wrap the key under export.
     */

    public String getWrappingKeyCertificate() {
        return this.wrappingKeyCertificate;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses this
     * certificate to wrap the key under export.
     * </p>
     * 
     * @param wrappingKeyCertificate
     *        The <code>KeyARN</code> of the wrapping key certificate. Amazon Web Services Payment Cryptography uses
     *        this certificate to wrap the key under export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTr34KeyBlock withWrappingKeyCertificate(String wrappingKeyCertificate) {
        setWrappingKeyCertificate(wrappingKeyCertificate);
        return this;
    }

    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains the
     * signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     * >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same export
     * token to export multiple keys from the same service account.
     * </p>
     * 
     * @param exportToken
     *        The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains
     *        the signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     *        href=
     *        "https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     *        >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same
     *        export token to export multiple keys from the same service account.
     */

    public void setExportToken(String exportToken) {
        this.exportToken = exportToken;
    }

    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains the
     * signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     * >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same export
     * token to export multiple keys from the same service account.
     * </p>
     * 
     * @return The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains
     *         the signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     *         href
     *         ="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     *         >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same
     *         export token to export multiple keys from the same service account.
     */

    public String getExportToken() {
        return this.exportToken;
    }

    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains the
     * signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     * >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same export
     * token to export multiple keys from the same service account.
     * </p>
     * 
     * @param exportToken
     *        The export token to initiate key export from Amazon Web Services Payment Cryptography. It also contains
     *        the signing key certificate that will sign the wrapped key during TR-34 key block generation. Call <a
     *        href=
     *        "https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetParametersForExport.html"
     *        >GetParametersForExport</a> to receive an export token. It expires after 7 days. You can use the same
     *        export token to export multiple keys from the same service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTr34KeyBlock withExportToken(String exportToken) {
        setExportToken(exportToken);
        return this;
    }

    /**
     * <p>
     * The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * </p>
     * 
     * @param keyBlockFormat
     *        The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * @see Tr34KeyBlockFormat
     */

    public void setKeyBlockFormat(String keyBlockFormat) {
        this.keyBlockFormat = keyBlockFormat;
    }

    /**
     * <p>
     * The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * </p>
     * 
     * @return The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * @see Tr34KeyBlockFormat
     */

    public String getKeyBlockFormat() {
        return this.keyBlockFormat;
    }

    /**
     * <p>
     * The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * </p>
     * 
     * @param keyBlockFormat
     *        The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tr34KeyBlockFormat
     */

    public ExportTr34KeyBlock withKeyBlockFormat(String keyBlockFormat) {
        setKeyBlockFormat(keyBlockFormat);
        return this;
    }

    /**
     * <p>
     * The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * </p>
     * 
     * @param keyBlockFormat
     *        The format of key block that Amazon Web Services Payment Cryptography will use during key export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tr34KeyBlockFormat
     */

    public ExportTr34KeyBlock withKeyBlockFormat(Tr34KeyBlockFormat keyBlockFormat) {
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

    public ExportTr34KeyBlock withRandomNonce(String randomNonce) {
        setRandomNonce(randomNonce);
        return this;
    }

    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     * 
     * @param keyBlockHeaders
     *        Optional metadata for export associated with the key material. This data is signed but transmitted in
     *        clear text.
     */

    public void setKeyBlockHeaders(KeyBlockHeaders keyBlockHeaders) {
        this.keyBlockHeaders = keyBlockHeaders;
    }

    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     * 
     * @return Optional metadata for export associated with the key material. This data is signed but transmitted in
     *         clear text.
     */

    public KeyBlockHeaders getKeyBlockHeaders() {
        return this.keyBlockHeaders;
    }

    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     * 
     * @param keyBlockHeaders
     *        Optional metadata for export associated with the key material. This data is signed but transmitted in
     *        clear text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTr34KeyBlock withKeyBlockHeaders(KeyBlockHeaders keyBlockHeaders) {
        setKeyBlockHeaders(keyBlockHeaders);
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
        if (getExportToken() != null)
            sb.append("ExportToken: ").append(getExportToken()).append(",");
        if (getKeyBlockFormat() != null)
            sb.append("KeyBlockFormat: ").append(getKeyBlockFormat()).append(",");
        if (getRandomNonce() != null)
            sb.append("RandomNonce: ").append(getRandomNonce()).append(",");
        if (getKeyBlockHeaders() != null)
            sb.append("KeyBlockHeaders: ").append(getKeyBlockHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTr34KeyBlock == false)
            return false;
        ExportTr34KeyBlock other = (ExportTr34KeyBlock) obj;
        if (other.getCertificateAuthorityPublicKeyIdentifier() == null ^ this.getCertificateAuthorityPublicKeyIdentifier() == null)
            return false;
        if (other.getCertificateAuthorityPublicKeyIdentifier() != null
                && other.getCertificateAuthorityPublicKeyIdentifier().equals(this.getCertificateAuthorityPublicKeyIdentifier()) == false)
            return false;
        if (other.getWrappingKeyCertificate() == null ^ this.getWrappingKeyCertificate() == null)
            return false;
        if (other.getWrappingKeyCertificate() != null && other.getWrappingKeyCertificate().equals(this.getWrappingKeyCertificate()) == false)
            return false;
        if (other.getExportToken() == null ^ this.getExportToken() == null)
            return false;
        if (other.getExportToken() != null && other.getExportToken().equals(this.getExportToken()) == false)
            return false;
        if (other.getKeyBlockFormat() == null ^ this.getKeyBlockFormat() == null)
            return false;
        if (other.getKeyBlockFormat() != null && other.getKeyBlockFormat().equals(this.getKeyBlockFormat()) == false)
            return false;
        if (other.getRandomNonce() == null ^ this.getRandomNonce() == null)
            return false;
        if (other.getRandomNonce() != null && other.getRandomNonce().equals(this.getRandomNonce()) == false)
            return false;
        if (other.getKeyBlockHeaders() == null ^ this.getKeyBlockHeaders() == null)
            return false;
        if (other.getKeyBlockHeaders() != null && other.getKeyBlockHeaders().equals(this.getKeyBlockHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityPublicKeyIdentifier() == null) ? 0 : getCertificateAuthorityPublicKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeyCertificate() == null) ? 0 : getWrappingKeyCertificate().hashCode());
        hashCode = prime * hashCode + ((getExportToken() == null) ? 0 : getExportToken().hashCode());
        hashCode = prime * hashCode + ((getKeyBlockFormat() == null) ? 0 : getKeyBlockFormat().hashCode());
        hashCode = prime * hashCode + ((getRandomNonce() == null) ? 0 : getRandomNonce().hashCode());
        hashCode = prime * hashCode + ((getKeyBlockHeaders() == null) ? 0 : getKeyBlockHeaders().hashCode());
        return hashCode;
    }

    @Override
    public ExportTr34KeyBlock clone() {
        try {
            return (ExportTr34KeyBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ExportTr34KeyBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
