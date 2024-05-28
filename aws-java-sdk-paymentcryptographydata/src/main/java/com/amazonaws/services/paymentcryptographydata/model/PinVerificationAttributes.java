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
 * Parameters that are required for PIN data verification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/PinVerificationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PinVerificationAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN.
     * </p>
     */
    private Ibm3624PinVerification ibm3624Pin;
    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN.
     * </p>
     */
    private VisaPinVerification visaPin;

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN.
     * </p>
     * 
     * @param ibm3624Pin
     *        Parameters that are required to generate or verify Ibm3624 PIN.
     */

    public void setIbm3624Pin(Ibm3624PinVerification ibm3624Pin) {
        this.ibm3624Pin = ibm3624Pin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Ibm3624 PIN.
     */

    public Ibm3624PinVerification getIbm3624Pin() {
        return this.ibm3624Pin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Ibm3624 PIN.
     * </p>
     * 
     * @param ibm3624Pin
     *        Parameters that are required to generate or verify Ibm3624 PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PinVerificationAttributes withIbm3624Pin(Ibm3624PinVerification ibm3624Pin) {
        setIbm3624Pin(ibm3624Pin);
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

    public void setVisaPin(VisaPinVerification visaPin) {
        this.visaPin = visaPin;
    }

    /**
     * <p>
     * Parameters that are required to generate or verify Visa PIN.
     * </p>
     * 
     * @return Parameters that are required to generate or verify Visa PIN.
     */

    public VisaPinVerification getVisaPin() {
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

    public PinVerificationAttributes withVisaPin(VisaPinVerification visaPin) {
        setVisaPin(visaPin);
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
        if (getIbm3624Pin() != null)
            sb.append("Ibm3624Pin: ").append(getIbm3624Pin()).append(",");
        if (getVisaPin() != null)
            sb.append("VisaPin: ").append(getVisaPin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PinVerificationAttributes == false)
            return false;
        PinVerificationAttributes other = (PinVerificationAttributes) obj;
        if (other.getIbm3624Pin() == null ^ this.getIbm3624Pin() == null)
            return false;
        if (other.getIbm3624Pin() != null && other.getIbm3624Pin().equals(this.getIbm3624Pin()) == false)
            return false;
        if (other.getVisaPin() == null ^ this.getVisaPin() == null)
            return false;
        if (other.getVisaPin() != null && other.getVisaPin().equals(this.getVisaPin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIbm3624Pin() == null) ? 0 : getIbm3624Pin().hashCode());
        hashCode = prime * hashCode + ((getVisaPin() == null) ? 0 : getVisaPin().hashCode());
        return hashCode;
    }

    @Override
    public PinVerificationAttributes clone() {
        try {
            return (PinVerificationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.PinVerificationAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
