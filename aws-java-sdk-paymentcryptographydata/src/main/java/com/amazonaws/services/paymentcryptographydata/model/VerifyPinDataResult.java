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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyPinData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyPinDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin block
     * generation.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     */
    private String encryptionKeyCheckValue;
    /**
     * <p>
     * The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for PIN or
     * PIN Offset verification.
     * </p>
     */
    private String verificationKeyArn;
    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     */
    private String verificationKeyCheckValue;

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin block
     * generation.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin
     *        block generation.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin block
     * generation.
     * </p>
     * 
     * @return The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin
     *         block generation.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin block
     * generation.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for encrypted pin
     *        block generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataResult withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     * 
     * @param encryptionKeyCheckValue
     *        The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *        key have the same key or to detect that a key has changed.</p>
     *        <p>
     *        Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     */

    public void setEncryptionKeyCheckValue(String encryptionKeyCheckValue) {
        this.encryptionKeyCheckValue = encryptionKeyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     * 
     * @return The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *         key have the same key or to detect that a key has changed.</p>
     *         <p>
     *         Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     */

    public String getEncryptionKeyCheckValue() {
        return this.encryptionKeyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     * 
     * @param encryptionKeyCheckValue
     *        The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *        key have the same key or to detect that a key has changed.</p>
     *        <p>
     *        Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataResult withEncryptionKeyCheckValue(String encryptionKeyCheckValue) {
        setEncryptionKeyCheckValue(encryptionKeyCheckValue);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for PIN or
     * PIN Offset verification.
     * </p>
     * 
     * @param verificationKeyArn
     *        The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for
     *        PIN or PIN Offset verification.
     */

    public void setVerificationKeyArn(String verificationKeyArn) {
        this.verificationKeyArn = verificationKeyArn;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for PIN or
     * PIN Offset verification.
     * </p>
     * 
     * @return The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for
     *         PIN or PIN Offset verification.
     */

    public String getVerificationKeyArn() {
        return this.verificationKeyArn;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for PIN or
     * PIN Offset verification.
     * </p>
     * 
     * @param verificationKeyArn
     *        The <code>keyARN</code> of the PIN encryption key that Amazon Web Services Payment Cryptography uses for
     *        PIN or PIN Offset verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataResult withVerificationKeyArn(String verificationKeyArn) {
        setVerificationKeyArn(verificationKeyArn);
        return this;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     * 
     * @param verificationKeyCheckValue
     *        The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *        key have the same key or to detect that a key has changed.</p>
     *        <p>
     *        Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     */

    public void setVerificationKeyCheckValue(String verificationKeyCheckValue) {
        this.verificationKeyCheckValue = verificationKeyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     * 
     * @return The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *         key have the same key or to detect that a key has changed.</p>
     *         <p>
     *         Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     */

    public String getVerificationKeyCheckValue() {
        return this.verificationKeyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * </p>
     * 
     * @param verificationKeyCheckValue
     *        The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *        key have the same key or to detect that a key has changed.</p>
     *        <p>
     *        Amazon Web Services Payment Cryptography computes the KCV according to the CMAC specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataResult withVerificationKeyCheckValue(String verificationKeyCheckValue) {
        setVerificationKeyCheckValue(verificationKeyCheckValue);
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
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getEncryptionKeyCheckValue() != null)
            sb.append("EncryptionKeyCheckValue: ").append(getEncryptionKeyCheckValue()).append(",");
        if (getVerificationKeyArn() != null)
            sb.append("VerificationKeyArn: ").append(getVerificationKeyArn()).append(",");
        if (getVerificationKeyCheckValue() != null)
            sb.append("VerificationKeyCheckValue: ").append(getVerificationKeyCheckValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyPinDataResult == false)
            return false;
        VerifyPinDataResult other = (VerifyPinDataResult) obj;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getEncryptionKeyCheckValue() == null ^ this.getEncryptionKeyCheckValue() == null)
            return false;
        if (other.getEncryptionKeyCheckValue() != null && other.getEncryptionKeyCheckValue().equals(this.getEncryptionKeyCheckValue()) == false)
            return false;
        if (other.getVerificationKeyArn() == null ^ this.getVerificationKeyArn() == null)
            return false;
        if (other.getVerificationKeyArn() != null && other.getVerificationKeyArn().equals(this.getVerificationKeyArn()) == false)
            return false;
        if (other.getVerificationKeyCheckValue() == null ^ this.getVerificationKeyCheckValue() == null)
            return false;
        if (other.getVerificationKeyCheckValue() != null && other.getVerificationKeyCheckValue().equals(this.getVerificationKeyCheckValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyCheckValue() == null) ? 0 : getEncryptionKeyCheckValue().hashCode());
        hashCode = prime * hashCode + ((getVerificationKeyArn() == null) ? 0 : getVerificationKeyArn().hashCode());
        hashCode = prime * hashCode + ((getVerificationKeyCheckValue() == null) ? 0 : getVerificationKeyCheckValue().hashCode());
        return hashCode;
    }

    @Override
    public VerifyPinDataResult clone() {
        try {
            return (VerifyPinDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
