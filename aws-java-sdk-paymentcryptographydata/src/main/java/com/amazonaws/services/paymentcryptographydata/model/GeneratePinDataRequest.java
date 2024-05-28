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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/GeneratePinData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratePinDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN Block.
     * </p>
     */
    private String encryptionKeyIdentifier;
    /**
     * <p>
     * The attributes and values to use for PIN, PVV, or PIN Offset generation.
     * </p>
     */
    private PinGenerationAttributes generationAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data generation.
     * </p>
     */
    private String generationKeyIdentifier;
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
     * The length of PIN under generation.
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
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN Block.
     * </p>
     * 
     * @param encryptionKeyIdentifier
     *        The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN
     *        Block.
     */

    public void setEncryptionKeyIdentifier(String encryptionKeyIdentifier) {
        this.encryptionKeyIdentifier = encryptionKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN Block.
     * </p>
     * 
     * @return The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN
     *         Block.
     */

    public String getEncryptionKeyIdentifier() {
        return this.encryptionKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN Block.
     * </p>
     * 
     * @param encryptionKeyIdentifier
     *        The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses to encrypt the PIN
     *        Block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratePinDataRequest withEncryptionKeyIdentifier(String encryptionKeyIdentifier) {
        setEncryptionKeyIdentifier(encryptionKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The attributes and values to use for PIN, PVV, or PIN Offset generation.
     * </p>
     * 
     * @param generationAttributes
     *        The attributes and values to use for PIN, PVV, or PIN Offset generation.
     */

    public void setGenerationAttributes(PinGenerationAttributes generationAttributes) {
        this.generationAttributes = generationAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for PIN, PVV, or PIN Offset generation.
     * </p>
     * 
     * @return The attributes and values to use for PIN, PVV, or PIN Offset generation.
     */

    public PinGenerationAttributes getGenerationAttributes() {
        return this.generationAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for PIN, PVV, or PIN Offset generation.
     * </p>
     * 
     * @param generationAttributes
     *        The attributes and values to use for PIN, PVV, or PIN Offset generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratePinDataRequest withGenerationAttributes(PinGenerationAttributes generationAttributes) {
        setGenerationAttributes(generationAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data generation.
     * </p>
     * 
     * @param generationKeyIdentifier
     *        The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data
     *        generation.
     */

    public void setGenerationKeyIdentifier(String generationKeyIdentifier) {
        this.generationKeyIdentifier = generationKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data generation.
     * </p>
     * 
     * @return The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data
     *         generation.
     */

    public String getGenerationKeyIdentifier() {
        return this.generationKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data generation.
     * </p>
     * 
     * @param generationKeyIdentifier
     *        The <code>keyARN</code> of the PEK that Amazon Web Services Payment Cryptography uses for pin data
     *        generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratePinDataRequest withGenerationKeyIdentifier(String generationKeyIdentifier) {
        setGenerationKeyIdentifier(generationKeyIdentifier);
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

    public GeneratePinDataRequest withPinBlockFormat(String pinBlockFormat) {
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

    public GeneratePinDataRequest withPinBlockFormat(PinBlockFormatForPinData pinBlockFormat) {
        this.pinBlockFormat = pinBlockFormat.toString();
        return this;
    }

    /**
     * <p>
     * The length of PIN under generation.
     * </p>
     * 
     * @param pinDataLength
     *        The length of PIN under generation.
     */

    public void setPinDataLength(Integer pinDataLength) {
        this.pinDataLength = pinDataLength;
    }

    /**
     * <p>
     * The length of PIN under generation.
     * </p>
     * 
     * @return The length of PIN under generation.
     */

    public Integer getPinDataLength() {
        return this.pinDataLength;
    }

    /**
     * <p>
     * The length of PIN under generation.
     * </p>
     * 
     * @param pinDataLength
     *        The length of PIN under generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratePinDataRequest withPinDataLength(Integer pinDataLength) {
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

    public GeneratePinDataRequest withPrimaryAccountNumber(String primaryAccountNumber) {
        setPrimaryAccountNumber(primaryAccountNumber);
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
        if (getEncryptionKeyIdentifier() != null)
            sb.append("EncryptionKeyIdentifier: ").append(getEncryptionKeyIdentifier()).append(",");
        if (getGenerationAttributes() != null)
            sb.append("GenerationAttributes: ").append(getGenerationAttributes()).append(",");
        if (getGenerationKeyIdentifier() != null)
            sb.append("GenerationKeyIdentifier: ").append(getGenerationKeyIdentifier()).append(",");
        if (getPinBlockFormat() != null)
            sb.append("PinBlockFormat: ").append(getPinBlockFormat()).append(",");
        if (getPinDataLength() != null)
            sb.append("PinDataLength: ").append(getPinDataLength()).append(",");
        if (getPrimaryAccountNumber() != null)
            sb.append("PrimaryAccountNumber: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneratePinDataRequest == false)
            return false;
        GeneratePinDataRequest other = (GeneratePinDataRequest) obj;
        if (other.getEncryptionKeyIdentifier() == null ^ this.getEncryptionKeyIdentifier() == null)
            return false;
        if (other.getEncryptionKeyIdentifier() != null && other.getEncryptionKeyIdentifier().equals(this.getEncryptionKeyIdentifier()) == false)
            return false;
        if (other.getGenerationAttributes() == null ^ this.getGenerationAttributes() == null)
            return false;
        if (other.getGenerationAttributes() != null && other.getGenerationAttributes().equals(this.getGenerationAttributes()) == false)
            return false;
        if (other.getGenerationKeyIdentifier() == null ^ this.getGenerationKeyIdentifier() == null)
            return false;
        if (other.getGenerationKeyIdentifier() != null && other.getGenerationKeyIdentifier().equals(this.getGenerationKeyIdentifier()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionKeyIdentifier() == null) ? 0 : getEncryptionKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGenerationAttributes() == null) ? 0 : getGenerationAttributes().hashCode());
        hashCode = prime * hashCode + ((getGenerationKeyIdentifier() == null) ? 0 : getGenerationKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPinBlockFormat() == null) ? 0 : getPinBlockFormat().hashCode());
        hashCode = prime * hashCode + ((getPinDataLength() == null) ? 0 : getPinDataLength().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        return hashCode;
    }

    @Override
    public GeneratePinDataRequest clone() {
        return (GeneratePinDataRequest) super.clone();
    }

}
