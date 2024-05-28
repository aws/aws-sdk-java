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
 * Parameters that are used for Derived Unique Key Per Transaction (DUKPT) derivation algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/DukptAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DukptAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * </p>
     */
    private String dukptDerivationType;
    /**
     * <p>
     * The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     * encryption method. The KSN is derived from the encrypting device unique identifier and an internal transaction
     * counter.
     * </p>
     */
    private String keySerialNumber;

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * </p>
     * 
     * @param dukptDerivationType
     *        The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *        be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *        derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * @see DukptDerivationType
     */

    public void setDukptDerivationType(String dukptDerivationType) {
        this.dukptDerivationType = dukptDerivationType;
    }

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * </p>
     * 
     * @return The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *         be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *         derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * @see DukptDerivationType
     */

    public String getDukptDerivationType() {
        return this.dukptDerivationType;
    }

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * </p>
     * 
     * @param dukptDerivationType
     *        The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *        be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *        derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DukptDerivationType
     */

    public DukptAttributes withDukptDerivationType(String dukptDerivationType) {
        setDukptDerivationType(dukptDerivationType);
        return this;
    }

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * </p>
     * 
     * @param dukptDerivationType
     *        The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *        be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *        derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DukptDerivationType
     */

    public DukptAttributes withDukptDerivationType(DukptDerivationType dukptDerivationType) {
        this.dukptDerivationType = dukptDerivationType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     * encryption method. The KSN is derived from the encrypting device unique identifier and an internal transaction
     * counter.
     * </p>
     * 
     * @param keySerialNumber
     *        The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     *        encryption method. The KSN is derived from the encrypting device unique identifier and an internal
     *        transaction counter.
     */

    public void setKeySerialNumber(String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }

    /**
     * <p>
     * The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     * encryption method. The KSN is derived from the encrypting device unique identifier and an internal transaction
     * counter.
     * </p>
     * 
     * @return The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     *         encryption method. The KSN is derived from the encrypting device unique identifier and an internal
     *         transaction counter.
     */

    public String getKeySerialNumber() {
        return this.keySerialNumber;
    }

    /**
     * <p>
     * The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     * encryption method. The KSN is derived from the encrypting device unique identifier and an internal transaction
     * counter.
     * </p>
     * 
     * @param keySerialNumber
     *        The unique identifier known as Key Serial Number (KSN) that comes from an encrypting device using DUKPT
     *        encryption method. The KSN is derived from the encrypting device unique identifier and an internal
     *        transaction counter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DukptAttributes withKeySerialNumber(String keySerialNumber) {
        setKeySerialNumber(keySerialNumber);
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
        if (getDukptDerivationType() != null)
            sb.append("DukptDerivationType: ").append(getDukptDerivationType()).append(",");
        if (getKeySerialNumber() != null)
            sb.append("KeySerialNumber: ").append(getKeySerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DukptAttributes == false)
            return false;
        DukptAttributes other = (DukptAttributes) obj;
        if (other.getDukptDerivationType() == null ^ this.getDukptDerivationType() == null)
            return false;
        if (other.getDukptDerivationType() != null && other.getDukptDerivationType().equals(this.getDukptDerivationType()) == false)
            return false;
        if (other.getKeySerialNumber() == null ^ this.getKeySerialNumber() == null)
            return false;
        if (other.getKeySerialNumber() != null && other.getKeySerialNumber().equals(this.getKeySerialNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDukptDerivationType() == null) ? 0 : getDukptDerivationType().hashCode());
        hashCode = prime * hashCode + ((getKeySerialNumber() == null) ? 0 : getKeySerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public DukptAttributes clone() {
        try {
            return (DukptAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.DukptAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
