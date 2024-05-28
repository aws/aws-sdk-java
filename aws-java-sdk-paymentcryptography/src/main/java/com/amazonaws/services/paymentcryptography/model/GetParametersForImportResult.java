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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForImport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34 key
     * block. The certificate expires in 7 days.
     * </p>
     */
    private String wrappingKeyCertificate;
    /**
     * <p>
     * The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     * certificate in PEM format (base64 encoded).
     * </p>
     */
    private String wrappingKeyCertificateChain;
    /**
     * <p>
     * The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * </p>
     */
    private String wrappingKeyAlgorithm;
    /**
     * <p>
     * The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token expires
     * after 7 days. You can use the same import token to import multiple keys to the same service account.
     * </p>
     */
    private String importToken;
    /**
     * <p>
     * The validity period of the import token.
     * </p>
     */
    private java.util.Date parametersValidUntilTimestamp;

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34 key
     * block. The certificate expires in 7 days.
     * </p>
     * 
     * @param wrappingKeyCertificate
     *        The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34
     *        key block. The certificate expires in 7 days.
     */

    public void setWrappingKeyCertificate(String wrappingKeyCertificate) {
        this.wrappingKeyCertificate = wrappingKeyCertificate;
    }

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34 key
     * block. The certificate expires in 7 days.
     * </p>
     * 
     * @return The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34
     *         key block. The certificate expires in 7 days.
     */

    public String getWrappingKeyCertificate() {
        return this.wrappingKeyCertificate;
    }

    /**
     * <p>
     * The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34 key
     * block. The certificate expires in 7 days.
     * </p>
     * 
     * @param wrappingKeyCertificate
     *        The wrapping key certificate in PEM format (base64 encoded) of the wrapping key for use within the TR-34
     *        key block. The certificate expires in 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withWrappingKeyCertificate(String wrappingKeyCertificate) {
        setWrappingKeyCertificate(wrappingKeyCertificate);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     * certificate in PEM format (base64 encoded).
     * </p>
     * 
     * @param wrappingKeyCertificateChain
     *        The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     *        certificate in PEM format (base64 encoded).
     */

    public void setWrappingKeyCertificateChain(String wrappingKeyCertificateChain) {
        this.wrappingKeyCertificateChain = wrappingKeyCertificateChain;
    }

    /**
     * <p>
     * The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     * certificate in PEM format (base64 encoded).
     * </p>
     * 
     * @return The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     *         certificate in PEM format (base64 encoded).
     */

    public String getWrappingKeyCertificateChain() {
        return this.wrappingKeyCertificateChain;
    }

    /**
     * <p>
     * The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     * certificate in PEM format (base64 encoded).
     * </p>
     * 
     * @param wrappingKeyCertificateChain
     *        The Amazon Web Services Payment Cryptography root certificate authority (CA) that signed the wrapping key
     *        certificate in PEM format (base64 encoded).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withWrappingKeyCertificateChain(String wrappingKeyCertificateChain) {
        setWrappingKeyCertificateChain(wrappingKeyCertificateChain);
        return this;
    }

    /**
     * <p>
     * The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * </p>
     * 
     * @param wrappingKeyAlgorithm
     *        The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * @see KeyAlgorithm
     */

    public void setWrappingKeyAlgorithm(String wrappingKeyAlgorithm) {
        this.wrappingKeyAlgorithm = wrappingKeyAlgorithm;
    }

    /**
     * <p>
     * The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * </p>
     * 
     * @return The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * @see KeyAlgorithm
     */

    public String getWrappingKeyAlgorithm() {
        return this.wrappingKeyAlgorithm;
    }

    /**
     * <p>
     * The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * </p>
     * 
     * @param wrappingKeyAlgorithm
     *        The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForImportResult withWrappingKeyAlgorithm(String wrappingKeyAlgorithm) {
        setWrappingKeyAlgorithm(wrappingKeyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * </p>
     * 
     * @param wrappingKeyAlgorithm
     *        The algorithm of the wrapping key for use within TR-34 WrappedKeyBlock or RSA WrappedKeyCryptogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForImportResult withWrappingKeyAlgorithm(KeyAlgorithm wrappingKeyAlgorithm) {
        this.wrappingKeyAlgorithm = wrappingKeyAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token expires
     * after 7 days. You can use the same import token to import multiple keys to the same service account.
     * </p>
     * 
     * @param importToken
     *        The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token
     *        expires after 7 days. You can use the same import token to import multiple keys to the same service
     *        account.
     */

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token expires
     * after 7 days. You can use the same import token to import multiple keys to the same service account.
     * </p>
     * 
     * @return The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token
     *         expires after 7 days. You can use the same import token to import multiple keys to the same service
     *         account.
     */

    public String getImportToken() {
        return this.importToken;
    }

    /**
     * <p>
     * The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token expires
     * after 7 days. You can use the same import token to import multiple keys to the same service account.
     * </p>
     * 
     * @param importToken
     *        The import token to initiate key import into Amazon Web Services Payment Cryptography. The import token
     *        expires after 7 days. You can use the same import token to import multiple keys to the same service
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withImportToken(String importToken) {
        setImportToken(importToken);
        return this;
    }

    /**
     * <p>
     * The validity period of the import token.
     * </p>
     * 
     * @param parametersValidUntilTimestamp
     *        The validity period of the import token.
     */

    public void setParametersValidUntilTimestamp(java.util.Date parametersValidUntilTimestamp) {
        this.parametersValidUntilTimestamp = parametersValidUntilTimestamp;
    }

    /**
     * <p>
     * The validity period of the import token.
     * </p>
     * 
     * @return The validity period of the import token.
     */

    public java.util.Date getParametersValidUntilTimestamp() {
        return this.parametersValidUntilTimestamp;
    }

    /**
     * <p>
     * The validity period of the import token.
     * </p>
     * 
     * @param parametersValidUntilTimestamp
     *        The validity period of the import token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withParametersValidUntilTimestamp(java.util.Date parametersValidUntilTimestamp) {
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
        if (getWrappingKeyCertificate() != null)
            sb.append("WrappingKeyCertificate: ").append("***Sensitive Data Redacted***").append(",");
        if (getWrappingKeyCertificateChain() != null)
            sb.append("WrappingKeyCertificateChain: ").append("***Sensitive Data Redacted***").append(",");
        if (getWrappingKeyAlgorithm() != null)
            sb.append("WrappingKeyAlgorithm: ").append(getWrappingKeyAlgorithm()).append(",");
        if (getImportToken() != null)
            sb.append("ImportToken: ").append(getImportToken()).append(",");
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

        if (obj instanceof GetParametersForImportResult == false)
            return false;
        GetParametersForImportResult other = (GetParametersForImportResult) obj;
        if (other.getWrappingKeyCertificate() == null ^ this.getWrappingKeyCertificate() == null)
            return false;
        if (other.getWrappingKeyCertificate() != null && other.getWrappingKeyCertificate().equals(this.getWrappingKeyCertificate()) == false)
            return false;
        if (other.getWrappingKeyCertificateChain() == null ^ this.getWrappingKeyCertificateChain() == null)
            return false;
        if (other.getWrappingKeyCertificateChain() != null && other.getWrappingKeyCertificateChain().equals(this.getWrappingKeyCertificateChain()) == false)
            return false;
        if (other.getWrappingKeyAlgorithm() == null ^ this.getWrappingKeyAlgorithm() == null)
            return false;
        if (other.getWrappingKeyAlgorithm() != null && other.getWrappingKeyAlgorithm().equals(this.getWrappingKeyAlgorithm()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null && other.getImportToken().equals(this.getImportToken()) == false)
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

        hashCode = prime * hashCode + ((getWrappingKeyCertificate() == null) ? 0 : getWrappingKeyCertificate().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeyCertificateChain() == null) ? 0 : getWrappingKeyCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeyAlgorithm() == null) ? 0 : getWrappingKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode + ((getParametersValidUntilTimestamp() == null) ? 0 : getParametersValidUntilTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForImportResult clone() {
        try {
            return (GetParametersForImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
