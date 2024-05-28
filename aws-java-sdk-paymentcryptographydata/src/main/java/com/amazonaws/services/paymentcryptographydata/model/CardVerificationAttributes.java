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
 * Card data parameters that are requried to verify Card Verification Values (CVV/CVV2), Dynamic Card Verification
 * Values (dCVV/dCVV2), or Card Security Codes (CSC).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/CardVerificationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CardVerificationAttributes implements Serializable, Cloneable, StructuredPojo {

    private AmexCardSecurityCodeVersion1 amexCardSecurityCodeVersion1;
    /**
     * <p>
     * Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     * </p>
     */
    private AmexCardSecurityCodeVersion2 amexCardSecurityCodeVersion2;
    /**
     * <p>
     * Card data parameters that are required to verify a cardholder verification value for the payment card.
     * </p>
     */
    private CardHolderVerificationValue cardHolderVerificationValue;
    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     * </p>
     */
    private CardVerificationValue1 cardVerificationValue1;
    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     * </p>
     */
    private CardVerificationValue2 cardVerificationValue2;
    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     */
    private DiscoverDynamicCardVerificationCode discoverDynamicCardVerificationCode;
    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     */
    private DynamicCardVerificationCode dynamicCardVerificationCode;
    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment card.
     * </p>
     */
    private DynamicCardVerificationValue dynamicCardVerificationValue;

    /**
     * @param amexCardSecurityCodeVersion1
     */

    public void setAmexCardSecurityCodeVersion1(AmexCardSecurityCodeVersion1 amexCardSecurityCodeVersion1) {
        this.amexCardSecurityCodeVersion1 = amexCardSecurityCodeVersion1;
    }

    /**
     * @return
     */

    public AmexCardSecurityCodeVersion1 getAmexCardSecurityCodeVersion1() {
        return this.amexCardSecurityCodeVersion1;
    }

    /**
     * @param amexCardSecurityCodeVersion1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withAmexCardSecurityCodeVersion1(AmexCardSecurityCodeVersion1 amexCardSecurityCodeVersion1) {
        setAmexCardSecurityCodeVersion1(amexCardSecurityCodeVersion1);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     * </p>
     * 
     * @param amexCardSecurityCodeVersion2
     *        Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     */

    public void setAmexCardSecurityCodeVersion2(AmexCardSecurityCodeVersion2 amexCardSecurityCodeVersion2) {
        this.amexCardSecurityCodeVersion2 = amexCardSecurityCodeVersion2;
    }

    /**
     * <p>
     * Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     */

    public AmexCardSecurityCodeVersion2 getAmexCardSecurityCodeVersion2() {
        return this.amexCardSecurityCodeVersion2;
    }

    /**
     * <p>
     * Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     * </p>
     * 
     * @param amexCardSecurityCodeVersion2
     *        Card data parameters that are required to verify a Card Security Code (CSC2) for an AMEX payment card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withAmexCardSecurityCodeVersion2(AmexCardSecurityCodeVersion2 amexCardSecurityCodeVersion2) {
        setAmexCardSecurityCodeVersion2(amexCardSecurityCodeVersion2);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify a cardholder verification value for the payment card.
     * </p>
     * 
     * @param cardHolderVerificationValue
     *        Card data parameters that are required to verify a cardholder verification value for the payment card.
     */

    public void setCardHolderVerificationValue(CardHolderVerificationValue cardHolderVerificationValue) {
        this.cardHolderVerificationValue = cardHolderVerificationValue;
    }

    /**
     * <p>
     * Card data parameters that are required to verify a cardholder verification value for the payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify a cardholder verification value for the payment card.
     */

    public CardHolderVerificationValue getCardHolderVerificationValue() {
        return this.cardHolderVerificationValue;
    }

    /**
     * <p>
     * Card data parameters that are required to verify a cardholder verification value for the payment card.
     * </p>
     * 
     * @param cardHolderVerificationValue
     *        Card data parameters that are required to verify a cardholder verification value for the payment card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withCardHolderVerificationValue(CardHolderVerificationValue cardHolderVerificationValue) {
        setCardHolderVerificationValue(cardHolderVerificationValue);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     * </p>
     * 
     * @param cardVerificationValue1
     *        Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     */

    public void setCardVerificationValue1(CardVerificationValue1 cardVerificationValue1) {
        this.cardVerificationValue1 = cardVerificationValue1;
    }

    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     */

    public CardVerificationValue1 getCardVerificationValue1() {
        return this.cardVerificationValue1;
    }

    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     * </p>
     * 
     * @param cardVerificationValue1
     *        Card data parameters that are required to verify Card Verification Value (CVV) for the payment card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withCardVerificationValue1(CardVerificationValue1 cardVerificationValue1) {
        setCardVerificationValue1(cardVerificationValue1);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     * </p>
     * 
     * @param cardVerificationValue2
     *        Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     */

    public void setCardVerificationValue2(CardVerificationValue2 cardVerificationValue2) {
        this.cardVerificationValue2 = cardVerificationValue2;
    }

    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     */

    public CardVerificationValue2 getCardVerificationValue2() {
        return this.cardVerificationValue2;
    }

    /**
     * <p>
     * Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     * </p>
     * 
     * @param cardVerificationValue2
     *        Card data parameters that are required to verify Card Verification Value (CVV2) for the payment card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withCardVerificationValue2(CardVerificationValue2 cardVerificationValue2) {
        setCardVerificationValue2(cardVerificationValue2);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     * 
     * @param discoverDynamicCardVerificationCode
     *        Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment
     *        card.
     */

    public void setDiscoverDynamicCardVerificationCode(DiscoverDynamicCardVerificationCode discoverDynamicCardVerificationCode) {
        this.discoverDynamicCardVerificationCode = discoverDynamicCardVerificationCode;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment
     *         card.
     */

    public DiscoverDynamicCardVerificationCode getDiscoverDynamicCardVerificationCode() {
        return this.discoverDynamicCardVerificationCode;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     * 
     * @param discoverDynamicCardVerificationCode
     *        Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment
     *        card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withDiscoverDynamicCardVerificationCode(DiscoverDynamicCardVerificationCode discoverDynamicCardVerificationCode) {
        setDiscoverDynamicCardVerificationCode(discoverDynamicCardVerificationCode);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     * 
     * @param dynamicCardVerificationCode
     *        Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment
     *        card.
     */

    public void setDynamicCardVerificationCode(DynamicCardVerificationCode dynamicCardVerificationCode) {
        this.dynamicCardVerificationCode = dynamicCardVerificationCode;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment
     *         card.
     */

    public DynamicCardVerificationCode getDynamicCardVerificationCode() {
        return this.dynamicCardVerificationCode;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment card.
     * </p>
     * 
     * @param dynamicCardVerificationCode
     *        Card data parameters that are required to verify CDynamic Card Verification Code (dCVC) for the payment
     *        card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withDynamicCardVerificationCode(DynamicCardVerificationCode dynamicCardVerificationCode) {
        setDynamicCardVerificationCode(dynamicCardVerificationCode);
        return this;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment card.
     * </p>
     * 
     * @param dynamicCardVerificationValue
     *        Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment
     *        card.
     */

    public void setDynamicCardVerificationValue(DynamicCardVerificationValue dynamicCardVerificationValue) {
        this.dynamicCardVerificationValue = dynamicCardVerificationValue;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment card.
     * </p>
     * 
     * @return Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment
     *         card.
     */

    public DynamicCardVerificationValue getDynamicCardVerificationValue() {
        return this.dynamicCardVerificationValue;
    }

    /**
     * <p>
     * Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment card.
     * </p>
     * 
     * @param dynamicCardVerificationValue
     *        Card data parameters that are required to verify CDynamic Card Verification Value (dCVV) for the payment
     *        card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CardVerificationAttributes withDynamicCardVerificationValue(DynamicCardVerificationValue dynamicCardVerificationValue) {
        setDynamicCardVerificationValue(dynamicCardVerificationValue);
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
        if (getAmexCardSecurityCodeVersion1() != null)
            sb.append("AmexCardSecurityCodeVersion1: ").append(getAmexCardSecurityCodeVersion1()).append(",");
        if (getAmexCardSecurityCodeVersion2() != null)
            sb.append("AmexCardSecurityCodeVersion2: ").append(getAmexCardSecurityCodeVersion2()).append(",");
        if (getCardHolderVerificationValue() != null)
            sb.append("CardHolderVerificationValue: ").append(getCardHolderVerificationValue()).append(",");
        if (getCardVerificationValue1() != null)
            sb.append("CardVerificationValue1: ").append(getCardVerificationValue1()).append(",");
        if (getCardVerificationValue2() != null)
            sb.append("CardVerificationValue2: ").append(getCardVerificationValue2()).append(",");
        if (getDiscoverDynamicCardVerificationCode() != null)
            sb.append("DiscoverDynamicCardVerificationCode: ").append(getDiscoverDynamicCardVerificationCode()).append(",");
        if (getDynamicCardVerificationCode() != null)
            sb.append("DynamicCardVerificationCode: ").append(getDynamicCardVerificationCode()).append(",");
        if (getDynamicCardVerificationValue() != null)
            sb.append("DynamicCardVerificationValue: ").append(getDynamicCardVerificationValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CardVerificationAttributes == false)
            return false;
        CardVerificationAttributes other = (CardVerificationAttributes) obj;
        if (other.getAmexCardSecurityCodeVersion1() == null ^ this.getAmexCardSecurityCodeVersion1() == null)
            return false;
        if (other.getAmexCardSecurityCodeVersion1() != null && other.getAmexCardSecurityCodeVersion1().equals(this.getAmexCardSecurityCodeVersion1()) == false)
            return false;
        if (other.getAmexCardSecurityCodeVersion2() == null ^ this.getAmexCardSecurityCodeVersion2() == null)
            return false;
        if (other.getAmexCardSecurityCodeVersion2() != null && other.getAmexCardSecurityCodeVersion2().equals(this.getAmexCardSecurityCodeVersion2()) == false)
            return false;
        if (other.getCardHolderVerificationValue() == null ^ this.getCardHolderVerificationValue() == null)
            return false;
        if (other.getCardHolderVerificationValue() != null && other.getCardHolderVerificationValue().equals(this.getCardHolderVerificationValue()) == false)
            return false;
        if (other.getCardVerificationValue1() == null ^ this.getCardVerificationValue1() == null)
            return false;
        if (other.getCardVerificationValue1() != null && other.getCardVerificationValue1().equals(this.getCardVerificationValue1()) == false)
            return false;
        if (other.getCardVerificationValue2() == null ^ this.getCardVerificationValue2() == null)
            return false;
        if (other.getCardVerificationValue2() != null && other.getCardVerificationValue2().equals(this.getCardVerificationValue2()) == false)
            return false;
        if (other.getDiscoverDynamicCardVerificationCode() == null ^ this.getDiscoverDynamicCardVerificationCode() == null)
            return false;
        if (other.getDiscoverDynamicCardVerificationCode() != null
                && other.getDiscoverDynamicCardVerificationCode().equals(this.getDiscoverDynamicCardVerificationCode()) == false)
            return false;
        if (other.getDynamicCardVerificationCode() == null ^ this.getDynamicCardVerificationCode() == null)
            return false;
        if (other.getDynamicCardVerificationCode() != null && other.getDynamicCardVerificationCode().equals(this.getDynamicCardVerificationCode()) == false)
            return false;
        if (other.getDynamicCardVerificationValue() == null ^ this.getDynamicCardVerificationValue() == null)
            return false;
        if (other.getDynamicCardVerificationValue() != null && other.getDynamicCardVerificationValue().equals(this.getDynamicCardVerificationValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmexCardSecurityCodeVersion1() == null) ? 0 : getAmexCardSecurityCodeVersion1().hashCode());
        hashCode = prime * hashCode + ((getAmexCardSecurityCodeVersion2() == null) ? 0 : getAmexCardSecurityCodeVersion2().hashCode());
        hashCode = prime * hashCode + ((getCardHolderVerificationValue() == null) ? 0 : getCardHolderVerificationValue().hashCode());
        hashCode = prime * hashCode + ((getCardVerificationValue1() == null) ? 0 : getCardVerificationValue1().hashCode());
        hashCode = prime * hashCode + ((getCardVerificationValue2() == null) ? 0 : getCardVerificationValue2().hashCode());
        hashCode = prime * hashCode + ((getDiscoverDynamicCardVerificationCode() == null) ? 0 : getDiscoverDynamicCardVerificationCode().hashCode());
        hashCode = prime * hashCode + ((getDynamicCardVerificationCode() == null) ? 0 : getDynamicCardVerificationCode().hashCode());
        hashCode = prime * hashCode + ((getDynamicCardVerificationValue() == null) ? 0 : getDynamicCardVerificationValue().hashCode());
        return hashCode;
    }

    @Override
    public CardVerificationAttributes clone() {
        try {
            return (CardVerificationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.CardVerificationAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
