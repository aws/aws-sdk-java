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
 * Parameters to derive session key for an Emv2000 payment card for ARQC verification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/SessionKeyEmv2000"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeyEmv2000 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     */
    private String applicationTransactionCounter;
    /**
     * <p>
     * A number that identifies and differentiates payment cards with the same Primary Account Number (PAN).
     * </p>
     */
    private String panSequenceNumber;
    /**
     * <p>
     * The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or debit
     * card and associates the card to a specific account holder.
     * </p>
     */
    private String primaryAccountNumber;

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     * 
     * @param applicationTransactionCounter
     *        The transaction counter that is provided by the terminal during transaction processing.
     */

    public void setApplicationTransactionCounter(String applicationTransactionCounter) {
        this.applicationTransactionCounter = applicationTransactionCounter;
    }

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     * 
     * @return The transaction counter that is provided by the terminal during transaction processing.
     */

    public String getApplicationTransactionCounter() {
        return this.applicationTransactionCounter;
    }

    /**
     * <p>
     * The transaction counter that is provided by the terminal during transaction processing.
     * </p>
     * 
     * @param applicationTransactionCounter
     *        The transaction counter that is provided by the terminal during transaction processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyEmv2000 withApplicationTransactionCounter(String applicationTransactionCounter) {
        setApplicationTransactionCounter(applicationTransactionCounter);
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

    public SessionKeyEmv2000 withPanSequenceNumber(String panSequenceNumber) {
        setPanSequenceNumber(panSequenceNumber);
        return this;
    }

    /**
     * <p>
     * The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or debit
     * card and associates the card to a specific account holder.
     * </p>
     * 
     * @param primaryAccountNumber
     *        The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or
     *        debit card and associates the card to a specific account holder.
     */

    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }

    /**
     * <p>
     * The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or debit
     * card and associates the card to a specific account holder.
     * </p>
     * 
     * @return The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or
     *         debit card and associates the card to a specific account holder.
     */

    public String getPrimaryAccountNumber() {
        return this.primaryAccountNumber;
    }

    /**
     * <p>
     * The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or debit
     * card and associates the card to a specific account holder.
     * </p>
     * 
     * @param primaryAccountNumber
     *        The Primary Account Number (PAN) of the cardholder. A PAN is a unique identifier for a payment credit or
     *        debit card and associates the card to a specific account holder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyEmv2000 withPrimaryAccountNumber(String primaryAccountNumber) {
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
        if (getApplicationTransactionCounter() != null)
            sb.append("ApplicationTransactionCounter: ").append(getApplicationTransactionCounter()).append(",");
        if (getPanSequenceNumber() != null)
            sb.append("PanSequenceNumber: ").append(getPanSequenceNumber()).append(",");
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

        if (obj instanceof SessionKeyEmv2000 == false)
            return false;
        SessionKeyEmv2000 other = (SessionKeyEmv2000) obj;
        if (other.getApplicationTransactionCounter() == null ^ this.getApplicationTransactionCounter() == null)
            return false;
        if (other.getApplicationTransactionCounter() != null
                && other.getApplicationTransactionCounter().equals(this.getApplicationTransactionCounter()) == false)
            return false;
        if (other.getPanSequenceNumber() == null ^ this.getPanSequenceNumber() == null)
            return false;
        if (other.getPanSequenceNumber() != null && other.getPanSequenceNumber().equals(this.getPanSequenceNumber()) == false)
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

        hashCode = prime * hashCode + ((getApplicationTransactionCounter() == null) ? 0 : getApplicationTransactionCounter().hashCode());
        hashCode = prime * hashCode + ((getPanSequenceNumber() == null) ? 0 : getPanSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        return hashCode;
    }

    @Override
    public SessionKeyEmv2000 clone() {
        try {
            return (SessionKeyEmv2000) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.SessionKeyEmv2000Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
