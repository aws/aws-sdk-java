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
 * Parameters that are required to generate, translate, or verify PIN data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/PinData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PinData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The PIN offset value.
     * </p>
     */
    private String pinOffset;
    /**
     * <p>
     * The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account Number
     * (PAN). If a value is not provided, it defaults to PAN.
     * </p>
     */
    private String verificationValue;

    /**
     * <p>
     * The PIN offset value.
     * </p>
     * 
     * @param pinOffset
     *        The PIN offset value.
     */

    public void setPinOffset(String pinOffset) {
        this.pinOffset = pinOffset;
    }

    /**
     * <p>
     * The PIN offset value.
     * </p>
     * 
     * @return The PIN offset value.
     */

    public String getPinOffset() {
        return this.pinOffset;
    }

    /**
     * <p>
     * The PIN offset value.
     * </p>
     * 
     * @param pinOffset
     *        The PIN offset value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinData withPinOffset(String pinOffset) {
        setPinOffset(pinOffset);
        return this;
    }

    /**
     * <p>
     * The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account Number
     * (PAN). If a value is not provided, it defaults to PAN.
     * </p>
     * 
     * @param verificationValue
     *        The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account
     *        Number (PAN). If a value is not provided, it defaults to PAN.
     */

    public void setVerificationValue(String verificationValue) {
        this.verificationValue = verificationValue;
    }

    /**
     * <p>
     * The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account Number
     * (PAN). If a value is not provided, it defaults to PAN.
     * </p>
     * 
     * @return The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account
     *         Number (PAN). If a value is not provided, it defaults to PAN.
     */

    public String getVerificationValue() {
        return this.verificationValue;
    }

    /**
     * <p>
     * The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account Number
     * (PAN). If a value is not provided, it defaults to PAN.
     * </p>
     * 
     * @param verificationValue
     *        The unique data to identify a cardholder. In most cases, this is the same as cardholder's Primary Account
     *        Number (PAN). If a value is not provided, it defaults to PAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinData withVerificationValue(String verificationValue) {
        setVerificationValue(verificationValue);
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
        if (getPinOffset() != null)
            sb.append("PinOffset: ").append(getPinOffset()).append(",");
        if (getVerificationValue() != null)
            sb.append("VerificationValue: ").append(getVerificationValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PinData == false)
            return false;
        PinData other = (PinData) obj;
        if (other.getPinOffset() == null ^ this.getPinOffset() == null)
            return false;
        if (other.getPinOffset() != null && other.getPinOffset().equals(this.getPinOffset()) == false)
            return false;
        if (other.getVerificationValue() == null ^ this.getVerificationValue() == null)
            return false;
        if (other.getVerificationValue() != null && other.getVerificationValue().equals(this.getVerificationValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPinOffset() == null) ? 0 : getPinOffset().hashCode());
        hashCode = prime * hashCode + ((getVerificationValue() == null) ? 0 : getVerificationValue().hashCode());
        return hashCode;
    }

    @Override
    public PinData clone() {
        try {
            return (PinData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.PinDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
