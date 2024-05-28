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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/EncryptData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The encryption key type and attributes for plaintext encryption.
     * </p>
     */
    private EncryptionDecryptionAttributes encryptionAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for plaintext
     * encryption.
     * </p>
     */
    private String keyIdentifier;
    /**
     * <p>
     * The plaintext to be encrypted.
     * </p>
     * <note>
     * <p>
     * For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength that you
     * define in <code>KeyAlgorithm</code> and padding type that you define in
     * <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt data</a> in
     * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * </note>
     */
    private String plainText;

    /**
     * <p>
     * The encryption key type and attributes for plaintext encryption.
     * </p>
     * 
     * @param encryptionAttributes
     *        The encryption key type and attributes for plaintext encryption.
     */

    public void setEncryptionAttributes(EncryptionDecryptionAttributes encryptionAttributes) {
        this.encryptionAttributes = encryptionAttributes;
    }

    /**
     * <p>
     * The encryption key type and attributes for plaintext encryption.
     * </p>
     * 
     * @return The encryption key type and attributes for plaintext encryption.
     */

    public EncryptionDecryptionAttributes getEncryptionAttributes() {
        return this.encryptionAttributes;
    }

    /**
     * <p>
     * The encryption key type and attributes for plaintext encryption.
     * </p>
     * 
     * @param encryptionAttributes
     *        The encryption key type and attributes for plaintext encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptDataRequest withEncryptionAttributes(EncryptionDecryptionAttributes encryptionAttributes) {
        setEncryptionAttributes(encryptionAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for plaintext
     * encryption.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for
     *        plaintext encryption.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for plaintext
     * encryption.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for
     *         plaintext encryption.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for plaintext
     * encryption.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses for
     *        plaintext encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptDataRequest withKeyIdentifier(String keyIdentifier) {
        setKeyIdentifier(keyIdentifier);
        return this;
    }

    /**
     * <p>
     * The plaintext to be encrypted.
     * </p>
     * <note>
     * <p>
     * For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength that you
     * define in <code>KeyAlgorithm</code> and padding type that you define in
     * <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt data</a> in
     * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * </note>
     * 
     * @param plainText
     *        The plaintext to be encrypted.</p> <note>
     *        <p>
     *        For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength that
     *        you define in <code>KeyAlgorithm</code> and padding type that you define in
     *        <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt
     *        data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     *        </p>
     */

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    /**
     * <p>
     * The plaintext to be encrypted.
     * </p>
     * <note>
     * <p>
     * For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength that you
     * define in <code>KeyAlgorithm</code> and padding type that you define in
     * <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt data</a> in
     * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The plaintext to be encrypted.</p> <note>
     *         <p>
     *         For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength
     *         that you define in <code>KeyAlgorithm</code> and padding type that you define in
     *         <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt
     *         data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     *         </p>
     */

    public String getPlainText() {
        return this.plainText;
    }

    /**
     * <p>
     * The plaintext to be encrypted.
     * </p>
     * <note>
     * <p>
     * For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength that you
     * define in <code>KeyAlgorithm</code> and padding type that you define in
     * <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt data</a> in
     * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * </note>
     * 
     * @param plainText
     *        The plaintext to be encrypted.</p> <note>
     *        <p>
     *        For encryption using asymmetric keys, plaintext data length is constrained by encryption key strength that
     *        you define in <code>KeyAlgorithm</code> and padding type that you define in
     *        <code>AsymmetricEncryptionAttributes</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt
     *        data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptDataRequest withPlainText(String plainText) {
        setPlainText(plainText);
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
        if (getEncryptionAttributes() != null)
            sb.append("EncryptionAttributes: ").append(getEncryptionAttributes()).append(",");
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getPlainText() != null)
            sb.append("PlainText: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptDataRequest == false)
            return false;
        EncryptDataRequest other = (EncryptDataRequest) obj;
        if (other.getEncryptionAttributes() == null ^ this.getEncryptionAttributes() == null)
            return false;
        if (other.getEncryptionAttributes() != null && other.getEncryptionAttributes().equals(this.getEncryptionAttributes()) == false)
            return false;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getPlainText() == null ^ this.getPlainText() == null)
            return false;
        if (other.getPlainText() != null && other.getPlainText().equals(this.getPlainText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionAttributes() == null) ? 0 : getEncryptionAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPlainText() == null) ? 0 : getPlainText().hashCode());
        return hashCode;
    }

    @Override
    public EncryptDataRequest clone() {
        return (EncryptDataRequest) super.clone();
    }

}
