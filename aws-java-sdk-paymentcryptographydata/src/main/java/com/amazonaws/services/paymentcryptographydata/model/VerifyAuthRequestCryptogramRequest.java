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
package com.amazonaws.services.paymentcryptographydata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyAuthRequestCryptogram"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyAuthRequestCryptogramRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification using a
     * major encryption key and transaction data.
     * </p>
     */
    private String authRequestCryptogram;
    /**
     * <p>
     * The attributes and values for auth request cryptogram verification. These parameters are required in case using
     * ARPC Method 1 or Method 2 for ARQC verification.
     * </p>
     */
    private CryptogramAuthResponse authResponseAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses for ARQC
     * verification.
     * </p>
     */
    private String keyIdentifier;
    /**
     * <p>
     * The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services Payment
     * Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     */
    private String majorKeyDerivationMode;
    /**
     * <p>
     * The attributes and values to use for deriving a session key for ARQC verification within Amazon Web Services
     * Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     */
    private SessionKeyDerivation sessionKeyDerivationAttributes;
    /**
     * <p>
     * The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     * transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     */
    private String transactionData;

    /**
     * <p>
     * The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification using a
     * major encryption key and transaction data.
     * </p>
     * 
     * @param authRequestCryptogram
     *        The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification
     *        using a major encryption key and transaction data.
     */

    public void setAuthRequestCryptogram(String authRequestCryptogram) {
        this.authRequestCryptogram = authRequestCryptogram;
    }

    /**
     * <p>
     * The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification using a
     * major encryption key and transaction data.
     * </p>
     * 
     * @return The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification
     *         using a major encryption key and transaction data.
     */

    public String getAuthRequestCryptogram() {
        return this.authRequestCryptogram;
    }

    /**
     * <p>
     * The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification using a
     * major encryption key and transaction data.
     * </p>
     * 
     * @param authRequestCryptogram
     *        The auth request cryptogram imported into Amazon Web Services Payment Cryptography for ARQC verification
     *        using a major encryption key and transaction data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyAuthRequestCryptogramRequest withAuthRequestCryptogram(String authRequestCryptogram) {
        setAuthRequestCryptogram(authRequestCryptogram);
        return this;
    }

    /**
     * <p>
     * The attributes and values for auth request cryptogram verification. These parameters are required in case using
     * ARPC Method 1 or Method 2 for ARQC verification.
     * </p>
     * 
     * @param authResponseAttributes
     *        The attributes and values for auth request cryptogram verification. These parameters are required in case
     *        using ARPC Method 1 or Method 2 for ARQC verification.
     */

    public void setAuthResponseAttributes(CryptogramAuthResponse authResponseAttributes) {
        this.authResponseAttributes = authResponseAttributes;
    }

    /**
     * <p>
     * The attributes and values for auth request cryptogram verification. These parameters are required in case using
     * ARPC Method 1 or Method 2 for ARQC verification.
     * </p>
     * 
     * @return The attributes and values for auth request cryptogram verification. These parameters are required in case
     *         using ARPC Method 1 or Method 2 for ARQC verification.
     */

    public CryptogramAuthResponse getAuthResponseAttributes() {
        return this.authResponseAttributes;
    }

    /**
     * <p>
     * The attributes and values for auth request cryptogram verification. These parameters are required in case using
     * ARPC Method 1 or Method 2 for ARQC verification.
     * </p>
     * 
     * @param authResponseAttributes
     *        The attributes and values for auth request cryptogram verification. These parameters are required in case
     *        using ARPC Method 1 or Method 2 for ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyAuthRequestCryptogramRequest withAuthResponseAttributes(CryptogramAuthResponse authResponseAttributes) {
        setAuthResponseAttributes(authResponseAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses for ARQC
     * verification.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses for
     *        ARQC verification.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses for ARQC
     * verification.
     * </p>
     * 
     * @return The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses
     *         for ARQC verification.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses for ARQC
     * verification.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the major encryption key that Amazon Web Services Payment Cryptography uses for
     *        ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyAuthRequestCryptogramRequest withKeyIdentifier(String keyIdentifier) {
        setKeyIdentifier(keyIdentifier);
        return this;
    }

    /**
     * <p>
     * The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services Payment
     * Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services
     *        Payment Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web
     *        Services Payment Cryptography.
     * @see MajorKeyDerivationMode
     */

    public void setMajorKeyDerivationMode(String majorKeyDerivationMode) {
        this.majorKeyDerivationMode = majorKeyDerivationMode;
    }

    /**
     * <p>
     * The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services Payment
     * Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @return The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services
     *         Payment Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web
     *         Services Payment Cryptography.
     * @see MajorKeyDerivationMode
     */

    public String getMajorKeyDerivationMode() {
        return this.majorKeyDerivationMode;
    }

    /**
     * <p>
     * The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services Payment
     * Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services
     *        Payment Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web
     *        Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MajorKeyDerivationMode
     */

    public VerifyAuthRequestCryptogramRequest withMajorKeyDerivationMode(String majorKeyDerivationMode) {
        setMajorKeyDerivationMode(majorKeyDerivationMode);
        return this;
    }

    /**
     * <p>
     * The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services Payment
     * Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The method to use when deriving the major encryption key for ARQC verification within Amazon Web Services
     *        Payment Cryptography. The same key derivation mode was used for ARQC generation outside of Amazon Web
     *        Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MajorKeyDerivationMode
     */

    public VerifyAuthRequestCryptogramRequest withMajorKeyDerivationMode(MajorKeyDerivationMode majorKeyDerivationMode) {
        this.majorKeyDerivationMode = majorKeyDerivationMode.toString();
        return this;
    }

    /**
     * <p>
     * The attributes and values to use for deriving a session key for ARQC verification within Amazon Web Services
     * Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param sessionKeyDerivationAttributes
     *        The attributes and values to use for deriving a session key for ARQC verification within Amazon Web
     *        Services Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web
     *        Services Payment Cryptography.
     */

    public void setSessionKeyDerivationAttributes(SessionKeyDerivation sessionKeyDerivationAttributes) {
        this.sessionKeyDerivationAttributes = sessionKeyDerivationAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for deriving a session key for ARQC verification within Amazon Web Services
     * Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @return The attributes and values to use for deriving a session key for ARQC verification within Amazon Web
     *         Services Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web
     *         Services Payment Cryptography.
     */

    public SessionKeyDerivation getSessionKeyDerivationAttributes() {
        return this.sessionKeyDerivationAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for deriving a session key for ARQC verification within Amazon Web Services
     * Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param sessionKeyDerivationAttributes
     *        The attributes and values to use for deriving a session key for ARQC verification within Amazon Web
     *        Services Payment Cryptography. The same attributes were used for ARQC generation outside of Amazon Web
     *        Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyAuthRequestCryptogramRequest withSessionKeyDerivationAttributes(SessionKeyDerivation sessionKeyDerivationAttributes) {
        setSessionKeyDerivationAttributes(sessionKeyDerivationAttributes);
        return this;
    }

    /**
     * <p>
     * The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     * transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param transactionData
     *        The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     *        transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     */

    public void setTransactionData(String transactionData) {
        this.transactionData = transactionData;
    }

    /**
     * <p>
     * The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     * transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     *         transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     */

    public String getTransactionData() {
        return this.transactionData;
    }

    /**
     * <p>
     * The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     * transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param transactionData
     *        The transaction data that Amazon Web Services Payment Cryptography uses for ARQC verification. The same
     *        transaction is used for ARQC generation outside of Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyAuthRequestCryptogramRequest withTransactionData(String transactionData) {
        setTransactionData(transactionData);
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
        if (getAuthRequestCryptogram() != null)
            sb.append("AuthRequestCryptogram: ").append(getAuthRequestCryptogram()).append(",");
        if (getAuthResponseAttributes() != null)
            sb.append("AuthResponseAttributes: ").append(getAuthResponseAttributes()).append(",");
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getMajorKeyDerivationMode() != null)
            sb.append("MajorKeyDerivationMode: ").append(getMajorKeyDerivationMode()).append(",");
        if (getSessionKeyDerivationAttributes() != null)
            sb.append("SessionKeyDerivationAttributes: ").append(getSessionKeyDerivationAttributes()).append(",");
        if (getTransactionData() != null)
            sb.append("TransactionData: ").append(getTransactionData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyAuthRequestCryptogramRequest == false)
            return false;
        VerifyAuthRequestCryptogramRequest other = (VerifyAuthRequestCryptogramRequest) obj;
        if (other.getAuthRequestCryptogram() == null ^ this.getAuthRequestCryptogram() == null)
            return false;
        if (other.getAuthRequestCryptogram() != null && other.getAuthRequestCryptogram().equals(this.getAuthRequestCryptogram()) == false)
            return false;
        if (other.getAuthResponseAttributes() == null ^ this.getAuthResponseAttributes() == null)
            return false;
        if (other.getAuthResponseAttributes() != null && other.getAuthResponseAttributes().equals(this.getAuthResponseAttributes()) == false)
            return false;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getMajorKeyDerivationMode() == null ^ this.getMajorKeyDerivationMode() == null)
            return false;
        if (other.getMajorKeyDerivationMode() != null && other.getMajorKeyDerivationMode().equals(this.getMajorKeyDerivationMode()) == false)
            return false;
        if (other.getSessionKeyDerivationAttributes() == null ^ this.getSessionKeyDerivationAttributes() == null)
            return false;
        if (other.getSessionKeyDerivationAttributes() != null
                && other.getSessionKeyDerivationAttributes().equals(this.getSessionKeyDerivationAttributes()) == false)
            return false;
        if (other.getTransactionData() == null ^ this.getTransactionData() == null)
            return false;
        if (other.getTransactionData() != null && other.getTransactionData().equals(this.getTransactionData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthRequestCryptogram() == null) ? 0 : getAuthRequestCryptogram().hashCode());
        hashCode = prime * hashCode + ((getAuthResponseAttributes() == null) ? 0 : getAuthResponseAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMajorKeyDerivationMode() == null) ? 0 : getMajorKeyDerivationMode().hashCode());
        hashCode = prime * hashCode + ((getSessionKeyDerivationAttributes() == null) ? 0 : getSessionKeyDerivationAttributes().hashCode());
        hashCode = prime * hashCode + ((getTransactionData() == null) ? 0 : getTransactionData().hashCode());
        return hashCode;
    }

    @Override
    public VerifyAuthRequestCryptogramRequest clone() {
        return (VerifyAuthRequestCryptogramRequest) super.clone();
    }

}
