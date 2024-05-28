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
 * Parameters that are required for PIN data generation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/PinGenerationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PinGenerationAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 natural PIN.
     * </p>
     */
    private Ibm3624NaturalPin ibm3624NaturalPin;
    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     * </p>
     */
    private Ibm3624PinFromOffset ibm3624PinFromOffset;
    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     * </p>
     */
    private Ibm3624PinOffset ibm3624PinOffset;
    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 random PIN.
     * </p>
     */
    private Ibm3624RandomPin ibm3624RandomPin;
    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN.
     * </p>
     */
    private VisaPin visaPin;
    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     * </p>
     */
    private VisaPinVerificationValue visaPinVerificationValue;

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 natural PIN.
     * </p>
     * 
     * @param ibm3624NaturalPin
     *        Parameters that are required to generate or verify Ibm3624 natural PIN.
     */

    public void setIbm3624NaturalPin(Ibm3624NaturalPin ibm3624NaturalPin) {
        this.ibm3624NaturalPin = ibm3624NaturalPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 natural PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Ibm3624 natural PIN.
     */

    public Ibm3624NaturalPin getIbm3624NaturalPin() {
        return this.ibm3624NaturalPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 natural PIN.
     * </p>
     * 
     * @param ibm3624NaturalPin
     *        Parameters that are required to generate or verify Ibm3624 natural PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinGenerationAttributes withIbm3624NaturalPin(Ibm3624NaturalPin ibm3624NaturalPin) {
        setIbm3624NaturalPin(ibm3624NaturalPin);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     * </p>
     * 
     * @param ibm3624PinFromOffset
     *        Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     */

    public void setIbm3624PinFromOffset(Ibm3624PinFromOffset ibm3624PinFromOffset) {
        this.ibm3624PinFromOffset = ibm3624PinFromOffset;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     */

    public Ibm3624PinFromOffset getIbm3624PinFromOffset() {
        return this.ibm3624PinFromOffset;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     * </p>
     * 
     * @param ibm3624PinFromOffset
     *        Parameters that are required to generate or verify Ibm3624 PIN from offset PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinGenerationAttributes withIbm3624PinFromOffset(Ibm3624PinFromOffset ibm3624PinFromOffset) {
        setIbm3624PinFromOffset(ibm3624PinFromOffset);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     * </p>
     * 
     * @param ibm3624PinOffset
     *        Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     */

    public void setIbm3624PinOffset(Ibm3624PinOffset ibm3624PinOffset) {
        this.ibm3624PinOffset = ibm3624PinOffset;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     */

    public Ibm3624PinOffset getIbm3624PinOffset() {
        return this.ibm3624PinOffset;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     * </p>
     * 
     * @param ibm3624PinOffset
     *        Parameters that are required to generate or verify Ibm3624 PIN offset PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinGenerationAttributes withIbm3624PinOffset(Ibm3624PinOffset ibm3624PinOffset) {
        setIbm3624PinOffset(ibm3624PinOffset);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 random PIN.
     * </p>
     * 
     * @param ibm3624RandomPin
     *        Parameters that are required to generate or verify Ibm3624 random PIN.
     */

    public void setIbm3624RandomPin(Ibm3624RandomPin ibm3624RandomPin) {
        this.ibm3624RandomPin = ibm3624RandomPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 random PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Ibm3624 random PIN.
     */

    public Ibm3624RandomPin getIbm3624RandomPin() {
        return this.ibm3624RandomPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 random PIN.
     * </p>
     * 
     * @param ibm3624RandomPin
     *        Parameters that are required to generate or verify Ibm3624 random PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinGenerationAttributes withIbm3624RandomPin(Ibm3624RandomPin ibm3624RandomPin) {
        setIbm3624RandomPin(ibm3624RandomPin);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN.
     * </p>
     * 
     * @param visaPin
     *        Parameters that are required to generate or verify Visa PIN.
     */

    public void setVisaPin(VisaPin visaPin) {
        this.visaPin = visaPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Visa PIN.
     */

    public VisaPin getVisaPin() {
        return this.visaPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN.
     * </p>
     * 
     * @param visaPin
     *        Parameters that are required to generate or verify Visa PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinGenerationAttributes withVisaPin(VisaPin visaPin) {
        setVisaPin(visaPin);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     * </p>
     * 
     * @param visaPinVerificationValue
     *        Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     */

    public void setVisaPinVerificationValue(VisaPinVerificationValue visaPinVerificationValue) {
        this.visaPinVerificationValue = visaPinVerificationValue;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     * </p>
     * 
     * @return Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     */

    public VisaPinVerificationValue getVisaPinVerificationValue() {
        return this.visaPinVerificationValue;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     * </p>
     * 
     * @param visaPinVerificationValue
     *        Parameters that are required to generate or verify Visa PIN Verification Value (PVV).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinGenerationAttributes withVisaPinVerificationValue(VisaPinVerificationValue visaPinVerificationValue) {
        setVisaPinVerificationValue(visaPinVerificationValue);
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
        if (getIbm3624NaturalPin() != null)
            sb.append("Ibm3624NaturalPin: ").append(getIbm3624NaturalPin()).append(",");
        if (getIbm3624PinFromOffset() != null)
            sb.append("Ibm3624PinFromOffset: ").append(getIbm3624PinFromOffset()).append(",");
        if (getIbm3624PinOffset() != null)
            sb.append("Ibm3624PinOffset: ").append(getIbm3624PinOffset()).append(",");
        if (getIbm3624RandomPin() != null)
            sb.append("Ibm3624RandomPin: ").append(getIbm3624RandomPin()).append(",");
        if (getVisaPin() != null)
            sb.append("VisaPin: ").append(getVisaPin()).append(",");
        if (getVisaPinVerificationValue() != null)
            sb.append("VisaPinVerificationValue: ").append(getVisaPinVerificationValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PinGenerationAttributes == false)
            return false;
        PinGenerationAttributes other = (PinGenerationAttributes) obj;
        if (other.getIbm3624NaturalPin() == null ^ this.getIbm3624NaturalPin() == null)
            return false;
        if (other.getIbm3624NaturalPin() != null && other.getIbm3624NaturalPin().equals(this.getIbm3624NaturalPin()) == false)
            return false;
        if (other.getIbm3624PinFromOffset() == null ^ this.getIbm3624PinFromOffset() == null)
            return false;
        if (other.getIbm3624PinFromOffset() != null && other.getIbm3624PinFromOffset().equals(this.getIbm3624PinFromOffset()) == false)
            return false;
        if (other.getIbm3624PinOffset() == null ^ this.getIbm3624PinOffset() == null)
            return false;
        if (other.getIbm3624PinOffset() != null && other.getIbm3624PinOffset().equals(this.getIbm3624PinOffset()) == false)
            return false;
        if (other.getIbm3624RandomPin() == null ^ this.getIbm3624RandomPin() == null)
            return false;
        if (other.getIbm3624RandomPin() != null && other.getIbm3624RandomPin().equals(this.getIbm3624RandomPin()) == false)
            return false;
        if (other.getVisaPin() == null ^ this.getVisaPin() == null)
            return false;
        if (other.getVisaPin() != null && other.getVisaPin().equals(this.getVisaPin()) == false)
            return false;
        if (other.getVisaPinVerificationValue() == null ^ this.getVisaPinVerificationValue() == null)
            return false;
        if (other.getVisaPinVerificationValue() != null && other.getVisaPinVerificationValue().equals(this.getVisaPinVerificationValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIbm3624NaturalPin() == null) ? 0 : getIbm3624NaturalPin().hashCode());
        hashCode = prime * hashCode + ((getIbm3624PinFromOffset() == null) ? 0 : getIbm3624PinFromOffset().hashCode());
        hashCode = prime * hashCode + ((getIbm3624PinOffset() == null) ? 0 : getIbm3624PinOffset().hashCode());
        hashCode = prime * hashCode + ((getIbm3624RandomPin() == null) ? 0 : getIbm3624RandomPin().hashCode());
        hashCode = prime * hashCode + ((getVisaPin() == null) ? 0 : getVisaPin().hashCode());
        hashCode = prime * hashCode + ((getVisaPinVerificationValue() == null) ? 0 : getVisaPinVerificationValue().hashCode());
        return hashCode;
    }

    @Override
    public PinGenerationAttributes clone() {
        try {
            return (PinGenerationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.PinGenerationAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
