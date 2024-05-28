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
 * Parameters required for encryption or decryption of data using DUKPT.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/DukptDerivationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DukptDerivationAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * </p>
     */
    private String dukptKeyDerivationType;
    /**
     * <p>
     * The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * </p>
     */
    private String dukptKeyVariant;
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
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * </p>
     * 
     * @param dukptKeyDerivationType
     *        The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *        be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *        derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * @see DukptDerivationType
     */

    public void setDukptKeyDerivationType(String dukptKeyDerivationType) {
        this.dukptKeyDerivationType = dukptKeyDerivationType;
    }

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * </p>
     * 
     * @return The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *         be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *         derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * @see DukptDerivationType
     */

    public String getDukptKeyDerivationType() {
        return this.dukptKeyDerivationType;
    }

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * </p>
     * 
     * @param dukptKeyDerivationType
     *        The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *        be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *        derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DukptDerivationType
     */

    public DukptDerivationAttributes withDukptKeyDerivationType(String dukptKeyDerivationType) {
        setDukptKeyDerivationType(dukptKeyDerivationType);
        return this;
    }

    /**
     * <p>
     * The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must be less
     * than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a derivation type
     * for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * </p>
     * 
     * @param dukptKeyDerivationType
     *        The key type derived using DUKPT from a Base Derivation Key (BDK) and Key Serial Number (KSN). This must
     *        be less than or equal to the strength of the BDK. For example, you can't use <code>AES_128</code> as a
     *        derivation type for a BDK of <code>AES_128</code> or <code>TDES_2KEY</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DukptDerivationType
     */

    public DukptDerivationAttributes withDukptKeyDerivationType(DukptDerivationType dukptKeyDerivationType) {
        this.dukptKeyDerivationType = dukptKeyDerivationType.toString();
        return this;
    }

    /**
     * <p>
     * The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * </p>
     * 
     * @param dukptKeyVariant
     *        The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * @see DukptKeyVariant
     */

    public void setDukptKeyVariant(String dukptKeyVariant) {
        this.dukptKeyVariant = dukptKeyVariant;
    }

    /**
     * <p>
     * The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * </p>
     * 
     * @return The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * @see DukptKeyVariant
     */

    public String getDukptKeyVariant() {
        return this.dukptKeyVariant;
    }

    /**
     * <p>
     * The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * </p>
     * 
     * @param dukptKeyVariant
     *        The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DukptKeyVariant
     */

    public DukptDerivationAttributes withDukptKeyVariant(String dukptKeyVariant) {
        setDukptKeyVariant(dukptKeyVariant);
        return this;
    }

    /**
     * <p>
     * The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * </p>
     * 
     * @param dukptKeyVariant
     *        The type of use of DUKPT, which can be for incoming data decryption, outgoing data encryption, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DukptKeyVariant
     */

    public DukptDerivationAttributes withDukptKeyVariant(DukptKeyVariant dukptKeyVariant) {
        this.dukptKeyVariant = dukptKeyVariant.toString();
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

    public DukptDerivationAttributes withKeySerialNumber(String keySerialNumber) {
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
        if (getDukptKeyDerivationType() != null)
            sb.append("DukptKeyDerivationType: ").append(getDukptKeyDerivationType()).append(",");
        if (getDukptKeyVariant() != null)
            sb.append("DukptKeyVariant: ").append(getDukptKeyVariant()).append(",");
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

        if (obj instanceof DukptDerivationAttributes == false)
            return false;
        DukptDerivationAttributes other = (DukptDerivationAttributes) obj;
        if (other.getDukptKeyDerivationType() == null ^ this.getDukptKeyDerivationType() == null)
            return false;
        if (other.getDukptKeyDerivationType() != null && other.getDukptKeyDerivationType().equals(this.getDukptKeyDerivationType()) == false)
            return false;
        if (other.getDukptKeyVariant() == null ^ this.getDukptKeyVariant() == null)
            return false;
        if (other.getDukptKeyVariant() != null && other.getDukptKeyVariant().equals(this.getDukptKeyVariant()) == false)
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

        hashCode = prime * hashCode + ((getDukptKeyDerivationType() == null) ? 0 : getDukptKeyDerivationType().hashCode());
        hashCode = prime * hashCode + ((getDukptKeyVariant() == null) ? 0 : getDukptKeyVariant().hashCode());
        hashCode = prime * hashCode + ((getKeySerialNumber() == null) ? 0 : getKeySerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public DukptDerivationAttributes clone() {
        try {
            return (DukptDerivationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.DukptDerivationAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
