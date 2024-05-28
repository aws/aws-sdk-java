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
 * Card data parameters that are required to generate a Card Security Code (CSC2) for an AMEX payment card.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/AmexCardSecurityCodeVersion2"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmexCardSecurityCodeVersion2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expiry date of a payment card.
     * </p>
     */
    private String cardExpiryDate;
    /**
     * <p>
     * The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     * </p>
     */
    private String serviceCode;

    /**
     * <p>
     * The expiry date of a payment card.
     * </p>
     * 
     * @param cardExpiryDate
     *        The expiry date of a payment card.
     */

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    /**
     * <p>
     * The expiry date of a payment card.
     * </p>
     * 
     * @return The expiry date of a payment card.
     */

    public String getCardExpiryDate() {
        return this.cardExpiryDate;
    }

    /**
     * <p>
     * The expiry date of a payment card.
     * </p>
     * 
     * @param cardExpiryDate
     *        The expiry date of a payment card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmexCardSecurityCodeVersion2 withCardExpiryDate(String cardExpiryDate) {
        setCardExpiryDate(cardExpiryDate);
        return this;
    }

    /**
     * <p>
     * The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     * </p>
     * 
     * @param serviceCode
     *        The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     * </p>
     * 
     * @return The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     * </p>
     * 
     * @param serviceCode
     *        The service code of the AMEX payment card. This is different from the Card Security Code (CSC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmexCardSecurityCodeVersion2 withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
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
        if (getCardExpiryDate() != null)
            sb.append("CardExpiryDate: ").append(getCardExpiryDate()).append(",");
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmexCardSecurityCodeVersion2 == false)
            return false;
        AmexCardSecurityCodeVersion2 other = (AmexCardSecurityCodeVersion2) obj;
        if (other.getCardExpiryDate() == null ^ this.getCardExpiryDate() == null)
            return false;
        if (other.getCardExpiryDate() != null && other.getCardExpiryDate().equals(this.getCardExpiryDate()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCardExpiryDate() == null) ? 0 : getCardExpiryDate().hashCode());
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        return hashCode;
    }

    @Override
    public AmexCardSecurityCodeVersion2 clone() {
        try {
            return (AmexCardSecurityCodeVersion2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.AmexCardSecurityCodeVersion2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
