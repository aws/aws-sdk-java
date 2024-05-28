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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyPinData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyPinDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The attributes and values for the DUKPT encrypted PIN block data.
     * </p>
     */
    private DukptAttributes dukptAttributes;
    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     * </p>
     */
    private String encryptedPinBlock;
    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type can be
     * PEK or BDK.
     * </p>
     */
    private String encryptionKeyIdentifier;
    /**
     * <p>
     * The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     * Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.
     * </p>
     * <p>
     * The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     * formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     * </p>
     * <p>
     * The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the fill
     * digits are random values from 10 to 15.
     * </p>
     */
    private String pinBlockFormat;
    /**
     * <p>
     * The length of PIN being verified.
     * </p>
     */
    private Integer pinDataLength;
    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates the card
     * with a specific account holder.
     * </p>
     */
    private String primaryAccountNumber;
    /**
     * <p>
     * The attributes and values for PIN data verification.
     * </p>
     */
    private PinVerificationAttributes verificationAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the PIN verification key.
     * </p>
     */
    private String verificationKeyIdentifier;

    /**
     * <p>
     * The attributes and values for the DUKPT encrypted PIN block data.
     * </p>
     * 
     * @param dukptAttributes
     *        The attributes and values for the DUKPT encrypted PIN block data.
     */

    public void setDukptAttributes(DukptAttributes dukptAttributes) {
        this.dukptAttributes = dukptAttributes;
    }

    /**
     * <p>
     * The attributes and values for the DUKPT encrypted PIN block data.
     * </p>
     * 
     * @return The attributes and values for the DUKPT encrypted PIN block data.
     */

    public DukptAttributes getDukptAttributes() {
        return this.dukptAttributes;
    }

    /**
     * <p>
     * The attributes and values for the DUKPT encrypted PIN block data.
     * </p>
     * 
     * @param dukptAttributes
     *        The attributes and values for the DUKPT encrypted PIN block data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withDukptAttributes(DukptAttributes dukptAttributes) {
        setDukptAttributes(dukptAttributes);
        return this;
    }

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     * </p>
     * 
     * @param encryptedPinBlock
     *        The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     */

    public void setEncryptedPinBlock(String encryptedPinBlock) {
        this.encryptedPinBlock = encryptedPinBlock;
    }

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     * </p>
     * 
     * @return The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     */

    public String getEncryptedPinBlock() {
        return this.encryptedPinBlock;
    }

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     * </p>
     * 
     * @param encryptedPinBlock
     *        The encrypted PIN block data that Amazon Web Services Payment Cryptography verifies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withEncryptedPinBlock(String encryptedPinBlock) {
        setEncryptedPinBlock(encryptedPinBlock);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type can be
     * PEK or BDK.
     * </p>
     * 
     * @param encryptionKeyIdentifier
     *        The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type
     *        can be PEK or BDK.
     */

    public void setEncryptionKeyIdentifier(String encryptionKeyIdentifier) {
        this.encryptionKeyIdentifier = encryptionKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type can be
     * PEK or BDK.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type
     *         can be PEK or BDK.
     */

    public String getEncryptionKeyIdentifier() {
        return this.encryptionKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type can be
     * PEK or BDK.
     * </p>
     * 
     * @param encryptionKeyIdentifier
     *        The <code>keyARN</code> of the encryption key under which the PIN block data is encrypted. This key type
     *        can be PEK or BDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withEncryptionKeyIdentifier(String encryptionKeyIdentifier) {
        setEncryptionKeyIdentifier(encryptionKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     * Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.
     * </p>
     * <p>
     * The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     * formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     * </p>
     * <p>
     * The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the fill
     * digits are random values from 10 to 15.
     * </p>
     * 
     * @param pinBlockFormat
     *        The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     *        Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.</p>
     *        <p>
     *        The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     *        formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     *        </p>
     *        <p>
     *        The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the
     *        fill digits are random values from 10 to 15.
     * @see PinBlockFormatForPinData
     */

    public void setPinBlockFormat(String pinBlockFormat) {
        this.pinBlockFormat = pinBlockFormat;
    }

    /**
     * <p>
     * The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     * Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.
     * </p>
     * <p>
     * The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     * formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     * </p>
     * <p>
     * The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the fill
     * digits are random values from 10 to 15.
     * </p>
     * 
     * @return The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     *         Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.</p>
     *         <p>
     *         The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN
     *         block formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in
     *         length.
     *         </p>
     *         <p>
     *         The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the
     *         fill digits are random values from 10 to 15.
     * @see PinBlockFormatForPinData
     */

    public String getPinBlockFormat() {
        return this.pinBlockFormat;
    }

    /**
     * <p>
     * The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     * Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.
     * </p>
     * <p>
     * The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     * formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     * </p>
     * <p>
     * The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the fill
     * digits are random values from 10 to 15.
     * </p>
     * 
     * @param pinBlockFormat
     *        The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     *        Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.</p>
     *        <p>
     *        The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     *        formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     *        </p>
     *        <p>
     *        The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the
     *        fill digits are random values from 10 to 15.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PinBlockFormatForPinData
     */

    public VerifyPinDataRequest withPinBlockFormat(String pinBlockFormat) {
        setPinBlockFormat(pinBlockFormat);
        return this;
    }

    /**
     * <p>
     * The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     * Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.
     * </p>
     * <p>
     * The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     * formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     * </p>
     * <p>
     * The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the fill
     * digits are random values from 10 to 15.
     * </p>
     * 
     * @param pinBlockFormat
     *        The PIN encoding format for pin data generation as specified in ISO 9564. Amazon Web Services Payment
     *        Cryptography supports <code>ISO_Format_0</code> and <code>ISO_Format_3</code>.</p>
     *        <p>
     *        The <code>ISO_Format_0</code> PIN block format is equivalent to the ANSI X9.8, VISA-1, and ECI-1 PIN block
     *        formats. It is similar to a VISA-4 PIN block format. It supports a PIN from 4 to 12 digits in length.
     *        </p>
     *        <p>
     *        The <code>ISO_Format_3</code> PIN block format is the same as <code>ISO_Format_0</code> except that the
     *        fill digits are random values from 10 to 15.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PinBlockFormatForPinData
     */

    public VerifyPinDataRequest withPinBlockFormat(PinBlockFormatForPinData pinBlockFormat) {
        this.pinBlockFormat = pinBlockFormat.toString();
        return this;
    }

    /**
     * <p>
     * The length of PIN being verified.
     * </p>
     * 
     * @param pinDataLength
     *        The length of PIN being verified.
     */

    public void setPinDataLength(Integer pinDataLength) {
        this.pinDataLength = pinDataLength;
    }

    /**
     * <p>
     * The length of PIN being verified.
     * </p>
     * 
     * @return The length of PIN being verified.
     */

    public Integer getPinDataLength() {
        return this.pinDataLength;
    }

    /**
     * <p>
     * The length of PIN being verified.
     * </p>
     * 
     * @param pinDataLength
     *        The length of PIN being verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withPinDataLength(Integer pinDataLength) {
        setPinDataLength(pinDataLength);
        return this;
    }

    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates the card
     * with a specific account holder.
     * </p>
     * 
     * @param primaryAccountNumber
     *        The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates
     *        the card with a specific account holder.
     */

    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }

    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates the card
     * with a specific account holder.
     * </p>
     * 
     * @return The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates
     *         the card with a specific account holder.
     */

    public String getPrimaryAccountNumber() {
        return this.primaryAccountNumber;
    }

    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates the card
     * with a specific account holder.
     * </p>
     * 
     * @param primaryAccountNumber
     *        The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates
     *        the card with a specific account holder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withPrimaryAccountNumber(String primaryAccountNumber) {
        setPrimaryAccountNumber(primaryAccountNumber);
        return this;
    }

    /**
     * <p>
     * The attributes and values for PIN data verification.
     * </p>
     * 
     * @param verificationAttributes
     *        The attributes and values for PIN data verification.
     */

    public void setVerificationAttributes(PinVerificationAttributes verificationAttributes) {
        this.verificationAttributes = verificationAttributes;
    }

    /**
     * <p>
     * The attributes and values for PIN data verification.
     * </p>
     * 
     * @return The attributes and values for PIN data verification.
     */

    public PinVerificationAttributes getVerificationAttributes() {
        return this.verificationAttributes;
    }

    /**
     * <p>
     * The attributes and values for PIN data verification.
     * </p>
     * 
     * @param verificationAttributes
     *        The attributes and values for PIN data verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withVerificationAttributes(PinVerificationAttributes verificationAttributes) {
        setVerificationAttributes(verificationAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PIN verification key.
     * </p>
     * 
     * @param verificationKeyIdentifier
     *        The <code>keyARN</code> of the PIN verification key.
     */

    public void setVerificationKeyIdentifier(String verificationKeyIdentifier) {
        this.verificationKeyIdentifier = verificationKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PIN verification key.
     * </p>
     * 
     * @return The <code>keyARN</code> of the PIN verification key.
     */

    public String getVerificationKeyIdentifier() {
        return this.verificationKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PIN verification key.
     * </p>
     * 
     * @param verificationKeyIdentifier
     *        The <code>keyARN</code> of the PIN verification key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyPinDataRequest withVerificationKeyIdentifier(String verificationKeyIdentifier) {
        setVerificationKeyIdentifier(verificationKeyIdentifier);
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
        if (getDukptAttributes() != null)
            sb.append("DukptAttributes: ").append(getDukptAttributes()).append(",");
        if (getEncryptedPinBlock() != null)
            sb.append("EncryptedPinBlock: ").append(getEncryptedPinBlock()).append(",");
        if (getEncryptionKeyIdentifier() != null)
            sb.append("EncryptionKeyIdentifier: ").append(getEncryptionKeyIdentifier()).append(",");
        if (getPinBlockFormat() != null)
            sb.append("PinBlockFormat: ").append(getPinBlockFormat()).append(",");
        if (getPinDataLength() != null)
            sb.append("PinDataLength: ").append(getPinDataLength()).append(",");
        if (getPrimaryAccountNumber() != null)
            sb.append("PrimaryAccountNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getVerificationAttributes() != null)
            sb.append("VerificationAttributes: ").append(getVerificationAttributes()).append(",");
        if (getVerificationKeyIdentifier() != null)
            sb.append("VerificationKeyIdentifier: ").append(getVerificationKeyIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyPinDataRequest == false)
            return false;
        VerifyPinDataRequest other = (VerifyPinDataRequest) obj;
        if (other.getDukptAttributes() == null ^ this.getDukptAttributes() == null)
            return false;
        if (other.getDukptAttributes() != null && other.getDukptAttributes().equals(this.getDukptAttributes()) == false)
            return false;
        if (other.getEncryptedPinBlock() == null ^ this.getEncryptedPinBlock() == null)
            return false;
        if (other.getEncryptedPinBlock() != null && other.getEncryptedPinBlock().equals(this.getEncryptedPinBlock()) == false)
            return false;
        if (other.getEncryptionKeyIdentifier() == null ^ this.getEncryptionKeyIdentifier() == null)
            return false;
        if (other.getEncryptionKeyIdentifier() != null && other.getEncryptionKeyIdentifier().equals(this.getEncryptionKeyIdentifier()) == false)
            return false;
        if (other.getPinBlockFormat() == null ^ this.getPinBlockFormat() == null)
            return false;
        if (other.getPinBlockFormat() != null && other.getPinBlockFormat().equals(this.getPinBlockFormat()) == false)
            return false;
        if (other.getPinDataLength() == null ^ this.getPinDataLength() == null)
            return false;
        if (other.getPinDataLength() != null && other.getPinDataLength().equals(this.getPinDataLength()) == false)
            return false;
        if (other.getPrimaryAccountNumber() == null ^ this.getPrimaryAccountNumber() == null)
            return false;
        if (other.getPrimaryAccountNumber() != null && other.getPrimaryAccountNumber().equals(this.getPrimaryAccountNumber()) == false)
            return false;
        if (other.getVerificationAttributes() == null ^ this.getVerificationAttributes() == null)
            return false;
        if (other.getVerificationAttributes() != null && other.getVerificationAttributes().equals(this.getVerificationAttributes()) == false)
            return false;
        if (other.getVerificationKeyIdentifier() == null ^ this.getVerificationKeyIdentifier() == null)
            return false;
        if (other.getVerificationKeyIdentifier() != null && other.getVerificationKeyIdentifier().equals(this.getVerificationKeyIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDukptAttributes() == null) ? 0 : getDukptAttributes().hashCode());
        hashCode = prime * hashCode + ((getEncryptedPinBlock() == null) ? 0 : getEncryptedPinBlock().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyIdentifier() == null) ? 0 : getEncryptionKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPinBlockFormat() == null) ? 0 : getPinBlockFormat().hashCode());
        hashCode = prime * hashCode + ((getPinDataLength() == null) ? 0 : getPinDataLength().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getVerificationAttributes() == null) ? 0 : getVerificationAttributes().hashCode());
        hashCode = prime * hashCode + ((getVerificationKeyIdentifier() == null) ? 0 : getVerificationKeyIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public VerifyPinDataRequest clone() {
        return (VerifyPinDataRequest) super.clone();
    }

}
