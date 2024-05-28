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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyCardValidationData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyCardValidationDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to verify
     * card data.
     * </p>
     */
    private String keyIdentifier;
    /**
     * <p>
     * The Primary Account Number (PAN), a unique identifier for a payment credit or debit card that associates the card
     * with a specific account holder.
     * </p>
     */
    private String primaryAccountNumber;
    /**
     * <p>
     * The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     * </p>
     */
    private String validationData;
    /**
     * <p>
     * The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     * </p>
     */
    private CardVerificationAttributes verificationAttributes;

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to verify
     * card data.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to
     *        verify card data.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to verify
     * card data.
     * </p>
     * 
     * @return The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to
     *         verify card data.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to verify
     * card data.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to
     *        verify card data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyCardValidationDataRequest withKeyIdentifier(String keyIdentifier) {
        setKeyIdentifier(keyIdentifier);
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

    public VerifyCardValidationDataRequest withPrimaryAccountNumber(String primaryAccountNumber) {
        setPrimaryAccountNumber(primaryAccountNumber);
        return this;
    }

    /**
     * <p>
     * The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param validationData
     *        The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     */

    public void setValidationData(String validationData) {
        this.validationData = validationData;
    }

    /**
     * <p>
     * The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     */

    public String getValidationData() {
        return this.validationData;
    }

    /**
     * <p>
     * The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param validationData
     *        The CVV or CSC value for use for card data verification within Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyCardValidationDataRequest withValidationData(String validationData) {
        setValidationData(validationData);
        return this;
    }

    /**
     * <p>
     * The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param verificationAttributes
     *        The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     */

    public void setVerificationAttributes(CardVerificationAttributes verificationAttributes) {
        this.verificationAttributes = verificationAttributes;
    }

    /**
     * <p>
     * The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     */

    public CardVerificationAttributes getVerificationAttributes() {
        return this.verificationAttributes;
    }

    /**
     * <p>
     * The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param verificationAttributes
     *        The algorithm to use for verification of card data within Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyCardValidationDataRequest withVerificationAttributes(CardVerificationAttributes verificationAttributes) {
        setVerificationAttributes(verificationAttributes);
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
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getPrimaryAccountNumber() != null)
            sb.append("PrimaryAccountNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getValidationData() != null)
            sb.append("ValidationData: ").append(getValidationData()).append(",");
        if (getVerificationAttributes() != null)
            sb.append("VerificationAttributes: ").append(getVerificationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyCardValidationDataRequest == false)
            return false;
        VerifyCardValidationDataRequest other = (VerifyCardValidationDataRequest) obj;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getPrimaryAccountNumber() == null ^ this.getPrimaryAccountNumber() == null)
            return false;
        if (other.getPrimaryAccountNumber() != null && other.getPrimaryAccountNumber().equals(this.getPrimaryAccountNumber()) == false)
            return false;
        if (other.getValidationData() == null ^ this.getValidationData() == null)
            return false;
        if (other.getValidationData() != null && other.getValidationData().equals(this.getValidationData()) == false)
            return false;
        if (other.getVerificationAttributes() == null ^ this.getVerificationAttributes() == null)
            return false;
        if (other.getVerificationAttributes() != null && other.getVerificationAttributes().equals(this.getVerificationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getValidationData() == null) ? 0 : getValidationData().hashCode());
        hashCode = prime * hashCode + ((getVerificationAttributes() == null) ? 0 : getVerificationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public VerifyCardValidationDataRequest clone() {
        return (VerifyCardValidationDataRequest) super.clone();
    }

}
