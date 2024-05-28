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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/GenerateCardValidationData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateCardValidationDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment Cryptography.
     * </p>
     */
    private CardGenerationAttributes generationAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to generate
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
     * The length of the CVV or CSC to be generated. The default value is 3.
     * </p>
     */
    private Integer validationDataLength;

    /**
     * <p>
     * The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param generationAttributes
     *        The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment
     *        Cryptography.
     */

    public void setGenerationAttributes(CardGenerationAttributes generationAttributes) {
        this.generationAttributes = generationAttributes;
    }

    /**
     * <p>
     * The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment
     *         Cryptography.
     */

    public CardGenerationAttributes getGenerationAttributes() {
        return this.generationAttributes;
    }

    /**
     * <p>
     * The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param generationAttributes
     *        The algorithm for generating CVV or CSC values for the card within Amazon Web Services Payment
     *        Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateCardValidationDataRequest withGenerationAttributes(CardGenerationAttributes generationAttributes) {
        setGenerationAttributes(generationAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to generate
     * card data.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to
     *        generate card data.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to generate
     * card data.
     * </p>
     * 
     * @return The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to
     *         generate card data.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to generate
     * card data.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the CVK encryption key that Amazon Web Services Payment Cryptography uses to
     *        generate card data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateCardValidationDataRequest withKeyIdentifier(String keyIdentifier) {
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

    public GenerateCardValidationDataRequest withPrimaryAccountNumber(String primaryAccountNumber) {
        setPrimaryAccountNumber(primaryAccountNumber);
        return this;
    }

    /**
     * <p>
     * The length of the CVV or CSC to be generated. The default value is 3.
     * </p>
     * 
     * @param validationDataLength
     *        The length of the CVV or CSC to be generated. The default value is 3.
     */

    public void setValidationDataLength(Integer validationDataLength) {
        this.validationDataLength = validationDataLength;
    }

    /**
     * <p>
     * The length of the CVV or CSC to be generated. The default value is 3.
     * </p>
     * 
     * @return The length of the CVV or CSC to be generated. The default value is 3.
     */

    public Integer getValidationDataLength() {
        return this.validationDataLength;
    }

    /**
     * <p>
     * The length of the CVV or CSC to be generated. The default value is 3.
     * </p>
     * 
     * @param validationDataLength
     *        The length of the CVV or CSC to be generated. The default value is 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateCardValidationDataRequest withValidationDataLength(Integer validationDataLength) {
        setValidationDataLength(validationDataLength);
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
        if (getGenerationAttributes() != null)
            sb.append("GenerationAttributes: ").append(getGenerationAttributes()).append(",");
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getPrimaryAccountNumber() != null)
            sb.append("PrimaryAccountNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getValidationDataLength() != null)
            sb.append("ValidationDataLength: ").append(getValidationDataLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateCardValidationDataRequest == false)
            return false;
        GenerateCardValidationDataRequest other = (GenerateCardValidationDataRequest) obj;
        if (other.getGenerationAttributes() == null ^ this.getGenerationAttributes() == null)
            return false;
        if (other.getGenerationAttributes() != null && other.getGenerationAttributes().equals(this.getGenerationAttributes()) == false)
            return false;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getPrimaryAccountNumber() == null ^ this.getPrimaryAccountNumber() == null)
            return false;
        if (other.getPrimaryAccountNumber() != null && other.getPrimaryAccountNumber().equals(this.getPrimaryAccountNumber()) == false)
            return false;
        if (other.getValidationDataLength() == null ^ this.getValidationDataLength() == null)
            return false;
        if (other.getValidationDataLength() != null && other.getValidationDataLength().equals(this.getValidationDataLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationAttributes() == null) ? 0 : getGenerationAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountNumber() == null) ? 0 : getPrimaryAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getValidationDataLength() == null) ? 0 : getValidationDataLength().hashCode());
        return hashCode;
    }

    @Override
    public GenerateCardValidationDataRequest clone() {
        return (GenerateCardValidationDataRequest) super.clone();
    }

}
