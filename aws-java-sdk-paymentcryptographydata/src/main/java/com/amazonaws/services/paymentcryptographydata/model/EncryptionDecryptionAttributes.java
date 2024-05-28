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
 * Parameters that are required to perform encryption and decryption operations.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/EncryptionDecryptionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionDecryptionAttributes implements Serializable, Cloneable, StructuredPojo {

    private AsymmetricEncryptionAttributes asymmetric;

    private DukptEncryptionAttributes dukpt;
    /**
     * <p>
     * Parameters for plaintext encryption using EMV keys.
     * </p>
     */
    private EmvEncryptionAttributes emv;
    /**
     * <p>
     * Parameters that are required to perform encryption and decryption using symmetric keys.
     * </p>
     */
    private SymmetricEncryptionAttributes symmetric;

    /**
     * @param asymmetric
     */

    public void setAsymmetric(AsymmetricEncryptionAttributes asymmetric) {
        this.asymmetric = asymmetric;
    }

    /**
     * @return
     */

    public AsymmetricEncryptionAttributes getAsymmetric() {
        return this.asymmetric;
    }

    /**
     * @param asymmetric
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionDecryptionAttributes withAsymmetric(AsymmetricEncryptionAttributes asymmetric) {
        setAsymmetric(asymmetric);
        return this;
    }

    /**
     * @param dukpt
     */

    public void setDukpt(DukptEncryptionAttributes dukpt) {
        this.dukpt = dukpt;
    }

    /**
     * @return
     */

    public DukptEncryptionAttributes getDukpt() {
        return this.dukpt;
    }

    /**
     * @param dukpt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionDecryptionAttributes withDukpt(DukptEncryptionAttributes dukpt) {
        setDukpt(dukpt);
        return this;
    }

    /**
     * <p>
     * Parameters for plaintext encryption using EMV keys.
     * </p>
     * 
     * @param emv
     *        Parameters for plaintext encryption using EMV keys.
     */

    public void setEmv(EmvEncryptionAttributes emv) {
        this.emv = emv;
    }

    /**
     * <p>
     * Parameters for plaintext encryption using EMV keys.
     * </p>
     * 
     * @return Parameters for plaintext encryption using EMV keys.
     */

    public EmvEncryptionAttributes getEmv() {
        return this.emv;
    }

    /**
     * <p>
     * Parameters for plaintext encryption using EMV keys.
     * </p>
     * 
     * @param emv
     *        Parameters for plaintext encryption using EMV keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionDecryptionAttributes withEmv(EmvEncryptionAttributes emv) {
        setEmv(emv);
        return this;
    }

    /**
     * <p>
     * Parameters that are required to perform encryption and decryption using symmetric keys.
     * </p>
     * 
     * @param symmetric
     *        Parameters that are required to perform encryption and decryption using symmetric keys.
     */

    public void setSymmetric(SymmetricEncryptionAttributes symmetric) {
        this.symmetric = symmetric;
    }

    /**
     * <p>
     * Parameters that are required to perform encryption and decryption using symmetric keys.
     * </p>
     * 
     * @return Parameters that are required to perform encryption and decryption using symmetric keys.
     */

    public SymmetricEncryptionAttributes getSymmetric() {
        return this.symmetric;
    }

    /**
     * <p>
     * Parameters that are required to perform encryption and decryption using symmetric keys.
     * </p>
     * 
     * @param symmetric
     *        Parameters that are required to perform encryption and decryption using symmetric keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionDecryptionAttributes withSymmetric(SymmetricEncryptionAttributes symmetric) {
        setSymmetric(symmetric);
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
        if (getAsymmetric() != null)
            sb.append("Asymmetric: ").append(getAsymmetric()).append(",");
        if (getDukpt() != null)
            sb.append("Dukpt: ").append(getDukpt()).append(",");
        if (getEmv() != null)
            sb.append("Emv: ").append(getEmv()).append(",");
        if (getSymmetric() != null)
            sb.append("Symmetric: ").append(getSymmetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionDecryptionAttributes == false)
            return false;
        EncryptionDecryptionAttributes other = (EncryptionDecryptionAttributes) obj;
        if (other.getAsymmetric() == null ^ this.getAsymmetric() == null)
            return false;
        if (other.getAsymmetric() != null && other.getAsymmetric().equals(this.getAsymmetric()) == false)
            return false;
        if (other.getDukpt() == null ^ this.getDukpt() == null)
            return false;
        if (other.getDukpt() != null && other.getDukpt().equals(this.getDukpt()) == false)
            return false;
        if (other.getEmv() == null ^ this.getEmv() == null)
            return false;
        if (other.getEmv() != null && other.getEmv().equals(this.getEmv()) == false)
            return false;
        if (other.getSymmetric() == null ^ this.getSymmetric() == null)
            return false;
        if (other.getSymmetric() != null && other.getSymmetric().equals(this.getSymmetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsymmetric() == null) ? 0 : getAsymmetric().hashCode());
        hashCode = prime * hashCode + ((getDukpt() == null) ? 0 : getDukpt().hashCode());
        hashCode = prime * hashCode + ((getEmv() == null) ? 0 : getEmv().hashCode());
        hashCode = prime * hashCode + ((getSymmetric() == null) ? 0 : getSymmetric().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionDecryptionAttributes clone() {
        try {
            return (EncryptionDecryptionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.EncryptionDecryptionAttributesMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
