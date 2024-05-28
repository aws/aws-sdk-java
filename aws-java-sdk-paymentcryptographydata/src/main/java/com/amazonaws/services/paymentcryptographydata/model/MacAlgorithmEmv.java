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
 * Parameters that are required for EMV MAC generation and verification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/MacAlgorithmEmv"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MacAlgorithmEmv implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method to use when deriving the master key for EMV MAC generation or verification.
     * </p>
     */
    private String majorKeyDerivationMode;
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
     * The method of deriving a session key for EMV MAC generation or verification.
     * </p>
     */
    private String sessionKeyDerivationMode;
    /**
     * <p>
     * Parameters that are required to generate session key for EMV generation and verification.
     * </p>
     */
    private SessionKeyDerivationValue sessionKeyDerivationValue;

    /**
     * <p>
     * The method to use when deriving the master key for EMV MAC generation or verification.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The method to use when deriving the master key for EMV MAC generation or verification.
     * @see MajorKeyDerivationMode
     */

    public void setMajorKeyDerivationMode(String majorKeyDerivationMode) {
        this.majorKeyDerivationMode = majorKeyDerivationMode;
    }

    /**
     * <p>
     * The method to use when deriving the master key for EMV MAC generation or verification.
     * </p>
     * 
     * @return The method to use when deriving the master key for EMV MAC generation or verification.
     * @see MajorKeyDerivationMode
     */

    public String getMajorKeyDerivationMode() {
        return this.majorKeyDerivationMode;
    }

    /**
     * <p>
     * The method to use when deriving the master key for EMV MAC generation or verification.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The method to use when deriving the master key for EMV MAC generation or verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MajorKeyDerivationMode
     */

    public MacAlgorithmEmv withMajorKeyDerivationMode(String majorKeyDerivationMode) {
        setMajorKeyDerivationMode(majorKeyDerivationMode);
        return this;
    }

    /**
     * <p>
     * The method to use when deriving the master key for EMV MAC generation or verification.
     * </p>
     * 
     * @param majorKeyDerivationMode
     *        The method to use when deriving the master key for EMV MAC generation or verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MajorKeyDerivationMode
     */

    public MacAlgorithmEmv withMajorKeyDerivationMode(MajorKeyDerivationMode majorKeyDerivationMode) {
        this.majorKeyDerivationMode = majorKeyDerivationMode.toString();
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

    public MacAlgorithmEmv withPanSequenceNumber(String panSequenceNumber) {
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

    public MacAlgorithmEmv withPrimaryAccountNumber(String primaryAccountNumber) {
        setPrimaryAccountNumber(primaryAccountNumber);
        return this;
    }

    /**
     * <p>
     * The method of deriving a session key for EMV MAC generation or verification.
     * </p>
     * 
     * @param sessionKeyDerivationMode
     *        The method of deriving a session key for EMV MAC generation or verification.
     * @see SessionKeyDerivationMode
     */

    public void setSessionKeyDerivationMode(String sessionKeyDerivationMode) {
        this.sessionKeyDerivationMode = sessionKeyDerivationMode;
    }

    /**
     * <p>
     * The method of deriving a session key for EMV MAC generation or verification.
     * </p>
     * 
     * @return The method of deriving a session key for EMV MAC generation or verification.
     * @see SessionKeyDerivationMode
     */

    public String getSessionKeyDerivationMode() {
        return this.sessionKeyDerivationMode;
    }

    /**
     * <p>
     * The method of deriving a session key for EMV MAC generation or verification.
     * </p>
     * 
     * @param sessionKeyDerivationMode
     *        The method of deriving a session key for EMV MAC generation or verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionKeyDerivationMode
     */

    public MacAlgorithmEmv withSessionKeyDerivationMode(String sessionKeyDerivationMode) {
        setSessionKeyDerivationMode(sessionKeyDerivationMode);
        return this;
    }

    /**
     * <p>
     * The method of deriving a session key for EMV MAC generation or verification.
     * </p>
     * 
     * @param sessionKeyDerivationMode
     *        The method of deriving a session key for EMV MAC generation or verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionKeyDerivationMode
     */

    public MacAlgorithmEmv withSessionKeyDerivationMode(SessionKeyDerivationMode sessionKeyDerivationMode) {
        this.sessionKeyDerivationMode = sessionKeyDerivationMode.toString();
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate session key for EMV generation and verification.
     * </p>
     * 
     * @param sessionKeyDerivationValue
     *        Parameters that are required to generate session key for EMV generation and verification.
     */

    public void setSessionKeyDerivationValue(SessionKeyDerivationValue sessionKeyDerivationValue) {
        this.sessionKeyDerivationValue = sessionKeyDerivationValue;
    }

    /**
     * <p>
     * Parameters that are required to generate session key for EMV generation and verification.
     * </p>
     * 
     * @return Parameters that are required to generate session key for EMV generation and verification.
     */

    public SessionKeyDerivationValue getSessionKeyDerivationValue() {
        return this.sessionKeyDerivationValue;
    }

    /**
     * <p>
     * Parameters that are required to generate session key for EMV generation and verification.
     * </p>
     * 
     * @param sessionKeyDerivationValue
     *        Parameters that are required to generate session key for EMV generation and verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacAlgorithmEmv withSessionKeyDerivationValue(SessionKeyDerivationValue sessionKeyDerivationValue) {
        setSessionKeyDerivationValue(sessionKeyDerivationValue);
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
        if (getMajorKeyDerivationMode() != null)
            sb.append("MajorKeyDerivationMode: ").append(getMajorKeyDerivationMode()).append(",");
        if (getPanSequenceNumber() != null)
            sb.append("PanSequenceNumber: ").append(getPanSequenceNumber()).append(",");
        if (getPrimaryAccountNumber() != null)
            sb.append("PrimaryAccountNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionKeyDerivationMode() != null)
            sb.append("SessionKeyDerivationMode: ").append(getSessionKeyDerivationMode()).append(",");
        if (getSessionKeyDerivationValue() != null)
            sb.append("SessionKeyDerivationValue: ").append(getSessionKeyDerivationValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MacAlgorithmEmv == false)
            return false;
        MacAlgorithmEmv other = (MacAlgorithmEmv) obj;
        if (other.getMajorKeyDerivationMode() == null ^ this.getMajorKeyDerivationMode() == null)
            return false;
        if (other.getMajorKeyDerivationMode() != null && other.getMajorKeyDerivationMode().equals(this.getMajorKeyDerivationMode()) == false)
            return false;
        if (other.getPanSequenceNumber() == null ^ this.getPanSequenceNumber() == null)
            return false;
        if (other.getPanSequenceNumber() != null && other.getPanSequenceNumber().equals(this.getPanSequenceNumber()) == false)
            return false;
        if (other.getPrimaryAccountNumber() == null ^ this.getPrimaryAccountNumber() == null)
            return false;
        if (other.getPrimaryAccountNumber() != null && other.getPrimaryAccountNumber().equals(this.getPrimaryAccountNumber()) == false)
            return false;
        if (other.getSessionKeyDerivationMode() == null ^ this.getSessionKeyDerivationMode() == null)
            return false;
        if (other.getSessionKeyDerivationMode() != null && other.getSessionKeyDerivationMode().equals(this.getSessionKeyDerivationMode()) == false)
            return false;
        if (other.getSessionKeyDerivationValue() == null ^ this.getSessionKeyDerivationValue() == null)
            return false;
        if (other.getSessionKeyDerivationValue() != null && other.getSessionKeyDerivationValue().equals(this.getSessionKeyDerivationValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMajorKeyDerivationMode() == null) ? 0 : getMajorKeyDerivationMode().hashCode());
        hashCode = prime * hashCode + ((getPanSequenceNumber() == null) ? 0 : getPanSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getSessionKeyDerivationMode() == null) ? 0 : getSessionKeyDerivationMode().hashCode());
        hashCode = prime * hashCode + ((getSessionKeyDerivationValue() == null) ? 0 : getSessionKeyDerivationValue().hashCode());
        return hashCode;
    }

    @Override
    public MacAlgorithmEmv clone() {
        try {
            return (MacAlgorithmEmv) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.MacAlgorithmEmvMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
