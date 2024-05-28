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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The signing key certificate in PEM format (base64 encoded) of the public key for signature within the TR-34 key
     * block. The certificate expires after 7 days.
     * </p>
     */
    private String signingKeyCertificate;
    /**
     * <p>
     * The root certificate authority (CA) that signed the signing key certificate in PEM format (base64 encoded).
     * </p>
     */
    private String signingKeyCertificateChain;
    /**
     * <p>
     * The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code> is the
     * only signing key algorithm allowed.
     * </p>
     */
    private String signingKeyAlgorithm;
    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token expires
     * after 7 days. You can use the same export token to export multiple keys from the same service account.
     * </p>
     */
    private String exportToken;
    /**
     * <p>
     * The validity period of the export token.
     * </p>
     */
    private java.util.Date parametersValidUntilTimestamp;

    /**
     * <p>
     * The signing key certificate in PEM format (base64 encoded) of the public key for signature within the TR-34 key
     * block. The certificate expires after 7 days.
     * </p>
     * 
     * @param signingKeyCertificate
     *        The signing key certificate in PEM format (base64 encoded) of the public key for signature within the
     *        TR-34 key block. The certificate expires after 7 days.
     */

    public void setSigningKeyCertificate(String signingKeyCertificate) {
        this.signingKeyCertificate = signingKeyCertificate;
    }

    /**
     * <p>
     * The signing key certificate in PEM format (base64 encoded) of the public key for signature within the TR-34 key
     * block. The certificate expires after 7 days.
     * </p>
     * 
     * @return The signing key certificate in PEM format (base64 encoded) of the public key for signature within the
     *         TR-34 key block. The certificate expires after 7 days.
     */

    public String getSigningKeyCertificate() {
        return this.signingKeyCertificate;
    }

    /**
     * <p>
     * The signing key certificate in PEM format (base64 encoded) of the public key for signature within the TR-34 key
     * block. The certificate expires after 7 days.
     * </p>
     * 
     * @param signingKeyCertificate
     *        The signing key certificate in PEM format (base64 encoded) of the public key for signature within the
     *        TR-34 key block. The certificate expires after 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForExportResult withSigningKeyCertificate(String signingKeyCertificate) {
        setSigningKeyCertificate(signingKeyCertificate);
        return this;
    }

    /**
     * <p>
     * The root certificate authority (CA) that signed the signing key certificate in PEM format (base64 encoded).
     * </p>
     * 
     * @param signingKeyCertificateChain
     *        The root certificate authority (CA) that signed the signing key certificate in PEM format (base64
     *        encoded).
     */

    public void setSigningKeyCertificateChain(String signingKeyCertificateChain) {
        this.signingKeyCertificateChain = signingKeyCertificateChain;
    }

    /**
     * <p>
     * The root certificate authority (CA) that signed the signing key certificate in PEM format (base64 encoded).
     * </p>
     * 
     * @return The root certificate authority (CA) that signed the signing key certificate in PEM format (base64
     *         encoded).
     */

    public String getSigningKeyCertificateChain() {
        return this.signingKeyCertificateChain;
    }

    /**
     * <p>
     * The root certificate authority (CA) that signed the signing key certificate in PEM format (base64 encoded).
     * </p>
     * 
     * @param signingKeyCertificateChain
     *        The root certificate authority (CA) that signed the signing key certificate in PEM format (base64
     *        encoded).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForExportResult withSigningKeyCertificateChain(String signingKeyCertificateChain) {
        setSigningKeyCertificateChain(signingKeyCertificateChain);
        return this;
    }

    /**
     * <p>
     * The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code> is the
     * only signing key algorithm allowed.
     * </p>
     * 
     * @param signingKeyAlgorithm
     *        The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code>
     *        is the only signing key algorithm allowed.
     * @see KeyAlgorithm
     */

    public void setSigningKeyAlgorithm(String signingKeyAlgorithm) {
        this.signingKeyAlgorithm = signingKeyAlgorithm;
    }

    /**
     * <p>
     * The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code> is the
     * only signing key algorithm allowed.
     * </p>
     * 
     * @return The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code>
     *         is the only signing key algorithm allowed.
     * @see KeyAlgorithm
     */

    public String getSigningKeyAlgorithm() {
        return this.signingKeyAlgorithm;
    }

    /**
     * <p>
     * The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code> is the
     * only signing key algorithm allowed.
     * </p>
     * 
     * @param signingKeyAlgorithm
     *        The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code>
     *        is the only signing key algorithm allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForExportResult withSigningKeyAlgorithm(String signingKeyAlgorithm) {
        setSigningKeyAlgorithm(signingKeyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code> is the
     * only signing key algorithm allowed.
     * </p>
     * 
     * @param signingKeyAlgorithm
     *        The algorithm of the signing key certificate for use in TR-34 key block generation. <code>RSA_2048</code>
     *        is the only signing key algorithm allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForExportResult withSigningKeyAlgorithm(KeyAlgorithm signingKeyAlgorithm) {
        this.signingKeyAlgorithm = signingKeyAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token expires
     * after 7 days. You can use the same export token to export multiple keys from the same service account.
     * </p>
     * 
     * @param exportToken
     *        The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token
     *        expires after 7 days. You can use the same export token to export multiple keys from the same service
     *        account.
     */

    public void setExportToken(String exportToken) {
        this.exportToken = exportToken;
    }

    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token expires
     * after 7 days. You can use the same export token to export multiple keys from the same service account.
     * </p>
     * 
     * @return The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token
     *         expires after 7 days. You can use the same export token to export multiple keys from the same service
     *         account.
     */

    public String getExportToken() {
        return this.exportToken;
    }

    /**
     * <p>
     * The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token expires
     * after 7 days. You can use the same export token to export multiple keys from the same service account.
     * </p>
     * 
     * @param exportToken
     *        The export token to initiate key export from Amazon Web Services Payment Cryptography. The export token
     *        expires after 7 days. You can use the same export token to export multiple keys from the same service
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForExportResult withExportToken(String exportToken) {
        setExportToken(exportToken);
        return this;
    }

    /**
     * <p>
     * The validity period of the export token.
     * </p>
     * 
     * @param parametersValidUntilTimestamp
     *        The validity period of the export token.
     */

    public void setParametersValidUntilTimestamp(java.util.Date parametersValidUntilTimestamp) {
        this.parametersValidUntilTimestamp = parametersValidUntilTimestamp;
    }

    /**
     * <p>
     * The validity period of the export token.
     * </p>
     * 
     * @return The validity period of the export token.
     */

    public java.util.Date getParametersValidUntilTimestamp() {
        return this.parametersValidUntilTimestamp;
    }

    /**
     * <p>
     * The validity period of the export token.
     * </p>
     * 
     * @param parametersValidUntilTimestamp
     *        The validity period of the export token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForExportResult withParametersValidUntilTimestamp(java.util.Date parametersValidUntilTimestamp) {
        setParametersValidUntilTimestamp(parametersValidUntilTimestamp);
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
        if (getSigningKeyCertificate() != null)
            sb.append("SigningKeyCertificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getSigningKeyCertificateChain() != null)
            sb.append("SigningKeyCertificateChain: ").append("***Sensitive Data Redacted***").append(",");
        if (getSigningKeyAlgorithm() != null)
            sb.append("SigningKeyAlgorithm: ").append(getSigningKeyAlgorithm()).append(",");
        if (getExportToken() != null)
            sb.append("ExportToken: ").append(getExportToken()).append(",");
        if (getParametersValidUntilTimestamp() != null)
            sb.append("ParametersValidUntilTimestamp: ").append(getParametersValidUntilTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForExportResult == false)
            return false;
        GetParametersForExportResult other = (GetParametersForExportResult) obj;
        if (other.getSigningKeyCertificate() == null ^ this.getSigningKeyCertificate() == null)
            return false;
        if (other.getSigningKeyCertificate() != null && other.getSigningKeyCertificate().equals(this.getSigningKeyCertificate()) == false)
            return false;
        if (other.getSigningKeyCertificateChain() == null ^ this.getSigningKeyCertificateChain() == null)
            return false;
        if (other.getSigningKeyCertificateChain() != null && other.getSigningKeyCertificateChain().equals(this.getSigningKeyCertificateChain()) == false)
            return false;
        if (other.getSigningKeyAlgorithm() == null ^ this.getSigningKeyAlgorithm() == null)
            return false;
        if (other.getSigningKeyAlgorithm() != null && other.getSigningKeyAlgorithm().equals(this.getSigningKeyAlgorithm()) == false)
            return false;
        if (other.getExportToken() == null ^ this.getExportToken() == null)
            return false;
        if (other.getExportToken() != null && other.getExportToken().equals(this.getExportToken()) == false)
            return false;
        if (other.getParametersValidUntilTimestamp() == null ^ this.getParametersValidUntilTimestamp() == null)
            return false;
        if (other.getParametersValidUntilTimestamp() != null
                && other.getParametersValidUntilTimestamp().equals(this.getParametersValidUntilTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningKeyCertificate() == null) ? 0 : getSigningKeyCertificate().hashCode());
        hashCode = prime * hashCode + ((getSigningKeyCertificateChain() == null) ? 0 : getSigningKeyCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getSigningKeyAlgorithm() == null) ? 0 : getSigningKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getExportToken() == null) ? 0 : getExportToken().hashCode());
        hashCode = prime * hashCode + ((getParametersValidUntilTimestamp() == null) ? 0 : getParametersValidUntilTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForExportResult clone() {
        try {
            return (GetParametersForExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
