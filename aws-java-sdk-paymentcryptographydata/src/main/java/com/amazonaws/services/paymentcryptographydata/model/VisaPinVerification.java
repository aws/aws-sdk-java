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
 * Parameters that are required to generate or verify Visa PIN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VisaPinVerification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisaPinVerification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN Verification
     * Value).
     * </p>
     */
    private Integer pinVerificationKeyIndex;
    /**
     * <p>
     * Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     * </p>
     */
    private String verificationValue;

    /**
     * <p>
     * The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN Verification
     * Value).
     * </p>
     * 
     * @param pinVerificationKeyIndex
     *        The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN
     *        Verification Value).
     */

    public void setPinVerificationKeyIndex(Integer pinVerificationKeyIndex) {
        this.pinVerificationKeyIndex = pinVerificationKeyIndex;
    }

    /**
     * <p>
     * The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN Verification
     * Value).
     * </p>
     * 
     * @return The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN
     *         Verification Value).
     */

    public Integer getPinVerificationKeyIndex() {
        return this.pinVerificationKeyIndex;
    }

    /**
     * <p>
     * The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN Verification
     * Value).
     * </p>
     * 
     * @param pinVerificationKeyIndex
     *        The value for PIN verification index. It is used in the Visa PIN algorithm to calculate the PVV (PIN
     *        Verification Value).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisaPinVerification withPinVerificationKeyIndex(Integer pinVerificationKeyIndex) {
        setPinVerificationKeyIndex(pinVerificationKeyIndex);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     * </p>
     * 
     * @param verificationValue
     *        Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     */

    public void setVerificationValue(String verificationValue) {
        this.verificationValue = verificationValue;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     * </p>
     * 
     * @return Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     */

    public String getVerificationValue() {
        return this.verificationValue;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     * </p>
     * 
     * @param verificationValue
     *        Parameters that are required to generate or verify Visa PVV (PIN Verification Value).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisaPinVerification withVerificationValue(String verificationValue) {
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
        if (getPinVerificationKeyIndex() != null)
            sb.append("PinVerificationKeyIndex: ").append(getPinVerificationKeyIndex()).append(",");
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

        if (obj instanceof VisaPinVerification == false)
            return false;
        VisaPinVerification other = (VisaPinVerification) obj;
        if (other.getPinVerificationKeyIndex() == null ^ this.getPinVerificationKeyIndex() == null)
            return false;
        if (other.getPinVerificationKeyIndex() != null && other.getPinVerificationKeyIndex().equals(this.getPinVerificationKeyIndex()) == false)
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

        hashCode = prime * hashCode + ((getPinVerificationKeyIndex() == null) ? 0 : getPinVerificationKeyIndex().hashCode());
        hashCode = prime * hashCode + ((getVerificationValue() == null) ? 0 : getVerificationValue().hashCode());
        return hashCode;
    }

    @Override
    public VisaPinVerification clone() {
        try {
            return (VisaPinVerification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.VisaPinVerificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
