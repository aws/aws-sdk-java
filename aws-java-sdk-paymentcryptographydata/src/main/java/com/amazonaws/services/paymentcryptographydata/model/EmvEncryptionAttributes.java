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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters for plaintext encryption using EMV keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/EmvEncryptionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmvEncryptionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     */
    private String initializationVector;
    /**
     * <p>
     * The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * </p>
     */
    private String majorKeyDerivationMode;
    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     * </p>
     */
    private String panSequenceNumber;
    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates the card
     * to a specific account holder.
     * </p>
     */
    private String primaryAccountNumber;
    /**
     * <p>
     * The derivation value used to derive the ICC session key. It is typically the application transaction counter
     * value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     * </p>
     */
    private String sessionDerivationData;

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     * 
     * @param initializationVector
     *        An input used to provide the intial state. If no value is provided, Amazon Web Services Payment
     *        Cryptography defaults it to zero.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     * 
     * @return An input used to provide the intial state. If no value is provided, Amazon Web Services Payment
     *         Cryptography defaults it to zero.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     * 
     * @param initializationVector
     *        An input used to provide the intial state. If no value is provided, Amazon Web Services Payment
     *        Cryptography defaults it to zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmvEncryptionAttributes withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
        return this;
    }

    /**
     * <p>
     * The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * @see EmvMajorKeyDerivationMode
     */

    public void setMajorKeyDerivationMode(String majorKeyDerivationMode) {
        this.majorKeyDerivationMode = majorKeyDerivationMode;
    }

    /**
     * <p>
     * The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * </p>
     * 
     * @return The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * @see EmvMajorKeyDerivationMode
     */

    public String getMajorKeyDerivationMode() {
        return this.majorKeyDerivationMode;
    }

    /**
     * <p>
     * The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmvMajorKeyDerivationMode
     */

    public EmvEncryptionAttributes withMajorKeyDerivationMode(String majorKeyDerivationMode) {
        setMajorKeyDerivationMode(majorKeyDerivationMode);
        return this;
    }

    /**
     * <p>
     * The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The EMV derivation mode to use for ICC master key derivation as per EMV version 4.3 book 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmvMajorKeyDerivationMode
     */

    public EmvEncryptionAttributes withMajorKeyDerivationMode(EmvMajorKeyDerivationMode majorKeyDerivationMode) {
        this.majorKeyDerivationMode = majorKeyDerivationMode.toString();
        return this;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @param mode
     *        The block cipher method to use for encryption.
     * @see EmvEncryptionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @return The block cipher method to use for encryption.
     * @see EmvEncryptionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @param mode
     *        The block cipher method to use for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmvEncryptionMode
     */

    public EmvEncryptionAttributes withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @param mode
     *        The block cipher method to use for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmvEncryptionMode
     */

    public EmvEncryptionAttributes withMode(EmvEncryptionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     * </p>
     * 
     * @param panSequenceNumber
     *        A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     */

    public void setPanSequenceNumber(String panSequenceNumber) {
        this.panSequenceNumber = panSequenceNumber;
    }

    /**
     * <p>
     * A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     * </p>
     * 
     * @return A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     */

    public String getPanSequenceNumber() {
        return this.panSequenceNumber;
    }

    /**
     * <p>
     * A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     * </p>
     * 
     * @param panSequenceNumber
     *        A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmvEncryptionAttributes withPanSequenceNumber(String panSequenceNumber) {
        setPanSequenceNumber(panSequenceNumber);
        return this;
    }

    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates the card
     * to a specific account holder.
     * </p>
     * 
     * @param primaryAccountNumber
     *        The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates
     *        the card to a specific account holder.
     */

    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }

    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates the card
     * to a specific account holder.
     * </p>
     * 
     * @return The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates
     *         the card to a specific account holder.
     */

    public String getPrimaryAccountNumber() {
        return this.primaryAccountNumber;
    }

    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates the card
     * to a specific account holder.
     * </p>
     * 
     * @param primaryAccountNumber
     *        The Primary Account Number (PAN), a unique identifier for a payment credit or debit card and associates
     *        the card to a specific account holder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmvEncryptionAttributes withPrimaryAccountNumber(String primaryAccountNumber) {
        setPrimaryAccountNumber(primaryAccountNumber);
        return this;
    }

    /**
     * <p>
     * The derivation value used to derive the ICC session key. It is typically the application transaction counter
     * value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     * </p>
     * 
     * @param sessionDerivationData
     *        The derivation value used to derive the ICC session key. It is typically the application transaction
     *        counter value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     */

    public void setSessionDerivationData(String sessionDerivationData) {
        this.sessionDerivationData = sessionDerivationData;
    }

    /**
     * <p>
     * The derivation value used to derive the ICC session key. It is typically the application transaction counter
     * value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     * </p>
     * 
     * @return The derivation value used to derive the ICC session key. It is typically the application transaction
     *         counter value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     */

    public String getSessionDerivationData() {
        return this.sessionDerivationData;
    }

    /**
     * <p>
     * The derivation value used to derive the ICC session key. It is typically the application transaction counter
     * value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     * </p>
     * 
     * @param sessionDerivationData
     *        The derivation value used to derive the ICC session key. It is typically the application transaction
     *        counter value padded with zeros or previous ARQC value padded with zeros as per EMV version 4.3 book 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmvEncryptionAttributes withSessionDerivationData(String sessionDerivationData) {
        setSessionDerivationData(sessionDerivationData);
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
        if (getInitializationVector() != null)
            sb.append("InitializationVector: ").append("***Sensitive Data Redacted***").append(",");
        if (getMajorKeyDerivationMode() != null)
            sb.append("MajorKeyDerivationMode: ").append(getMajorKeyDerivationMode()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getPanSequenceNumber() != null)
            sb.append("PanSequenceNumber: ").append(getPanSequenceNumber()).append(",");
        if (getPrimaryAccountNumber() != null)
            sb.append("PrimaryAccountNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionDerivationData() != null)
            sb.append("SessionDerivationData: ").append(getSessionDerivationData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmvEncryptionAttributes == false)
            return false;
        EmvEncryptionAttributes other = (EmvEncryptionAttributes) obj;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        if (other.getMajorKeyDerivationMode() == null ^ this.getMajorKeyDerivationMode() == null)
            return false;
        if (other.getMajorKeyDerivationMode() != null && other.getMajorKeyDerivationMode().equals(this.getMajorKeyDerivationMode()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getPanSequenceNumber() == null ^ this.getPanSequenceNumber() == null)
            return false;
        if (other.getPanSequenceNumber() != null && other.getPanSequenceNumber().equals(this.getPanSequenceNumber()) == false)
            return false;
        if (other.getPrimaryAccountNumber() == null ^ this.getPrimaryAccountNumber() == null)
            return false;
        if (other.getPrimaryAccountNumber() != null && other.getPrimaryAccountNumber().equals(this.getPrimaryAccountNumber()) == false)
            return false;
        if (other.getSessionDerivationData() == null ^ this.getSessionDerivationData() == null)
            return false;
        if (other.getSessionDerivationData() != null && other.getSessionDerivationData().equals(this.getSessionDerivationData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getMajorKeyDerivationMode() == null) ? 0 : getMajorKeyDerivationMode().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getPanSequenceNumber() == null) ? 0 : getPanSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getSessionDerivationData() == null) ? 0 : getSessionDerivationData().hashCode());
        return hashCode;
    }

    @Override
    public EmvEncryptionAttributes clone() {
        try {
            return (EmvEncryptionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.EmvEncryptionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
