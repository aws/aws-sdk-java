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
 * Parameters that are required for ARPC response generation using method2 after ARQC verification is successful.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/CryptogramVerificationArpcMethod2"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CryptogramVerificationArpcMethod2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     * </p>
     */
    private String cardStatusUpdate;
    /**
     * <p>
     * The proprietary authentication data used by issuer for communication during online transaction using an EMV chip
     * card.
     * </p>
     */
    private String proprietaryAuthenticationData;

    /**
     * <p>
     * The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     * </p>
     * 
     * @param cardStatusUpdate
     *        The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     */

    public void setCardStatusUpdate(String cardStatusUpdate) {
        this.cardStatusUpdate = cardStatusUpdate;
    }

    /**
     * <p>
     * The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     * </p>
     * 
     * @return The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     */

    public String getCardStatusUpdate() {
        return this.cardStatusUpdate;
    }

    /**
     * <p>
     * The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     * </p>
     * 
     * @param cardStatusUpdate
     *        The data indicating whether the issuer approves or declines an online transaction using an EMV chip card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CryptogramVerificationArpcMethod2 withCardStatusUpdate(String cardStatusUpdate) {
        setCardStatusUpdate(cardStatusUpdate);
        return this;
    }

    /**
     * <p>
     * The proprietary authentication data used by issuer for communication during online transaction using an EMV chip
     * card.
     * </p>
     * 
     * @param proprietaryAuthenticationData
     *        The proprietary authentication data used by issuer for communication during online transaction using an
     *        EMV chip card.
     */

    public void setProprietaryAuthenticationData(String proprietaryAuthenticationData) {
        this.proprietaryAuthenticationData = proprietaryAuthenticationData;
    }

    /**
     * <p>
     * The proprietary authentication data used by issuer for communication during online transaction using an EMV chip
     * card.
     * </p>
     * 
     * @return The proprietary authentication data used by issuer for communication during online transaction using an
     *         EMV chip card.
     */

    public String getProprietaryAuthenticationData() {
        return this.proprietaryAuthenticationData;
    }

    /**
     * <p>
     * The proprietary authentication data used by issuer for communication during online transaction using an EMV chip
     * card.
     * </p>
     * 
     * @param proprietaryAuthenticationData
     *        The proprietary authentication data used by issuer for communication during online transaction using an
     *        EMV chip card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CryptogramVerificationArpcMethod2 withProprietaryAuthenticationData(String proprietaryAuthenticationData) {
        setProprietaryAuthenticationData(proprietaryAuthenticationData);
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
        if (getCardStatusUpdate() != null)
            sb.append("CardStatusUpdate: ").append(getCardStatusUpdate()).append(",");
        if (getProprietaryAuthenticationData() != null)
            sb.append("ProprietaryAuthenticationData: ").append(getProprietaryAuthenticationData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CryptogramVerificationArpcMethod2 == false)
            return false;
        CryptogramVerificationArpcMethod2 other = (CryptogramVerificationArpcMethod2) obj;
        if (other.getCardStatusUpdate() == null ^ this.getCardStatusUpdate() == null)
            return false;
        if (other.getCardStatusUpdate() != null && other.getCardStatusUpdate().equals(this.getCardStatusUpdate()) == false)
            return false;
        if (other.getProprietaryAuthenticationData() == null ^ this.getProprietaryAuthenticationData() == null)
            return false;
        if (other.getProprietaryAuthenticationData() != null
                && other.getProprietaryAuthenticationData().equals(this.getProprietaryAuthenticationData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCardStatusUpdate() == null) ? 0 : getCardStatusUpdate().hashCode());
        hashCode = prime * hashCode + ((getProprietaryAuthenticationData() == null) ? 0 : getProprietaryAuthenticationData().hashCode());
        return hashCode;
    }

    @Override
    public CryptogramVerificationArpcMethod2 clone() {
        try {
            return (CryptogramVerificationArpcMethod2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.CryptogramVerificationArpcMethod2Marshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
