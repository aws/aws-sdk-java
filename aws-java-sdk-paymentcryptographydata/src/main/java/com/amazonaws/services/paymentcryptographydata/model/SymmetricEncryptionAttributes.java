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
 * Parameters requried to encrypt plaintext data using symmetric keys.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/SymmetricEncryptionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SymmetricEncryptionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     */
    private String initializationVector;
    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The padding to be included with the data.
     * </p>
     */
    private String paddingType;

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     * 
     * @param initializationVector
     *        An input used to provide the intial state. If no value is provided, Amazon Web Services Payment
     *        Cryptography defaults it to zero.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     * 
     * @return An input used to provide the intial state. If no value is provided, Amazon Web Services Payment
     *         Cryptography defaults it to zero.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * <p>
     * An input used to provide the intial state. If no value is provided, Amazon Web Services Payment Cryptography
     * defaults it to zero.
     * </p>
     * 
     * @param initializationVector
     *        An input used to provide the intial state. If no value is provided, Amazon Web Services Payment
     *        Cryptography defaults it to zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SymmetricEncryptionAttributes withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
        return this;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @param mode
     *        The block cipher method to use for encryption.
     * @see EncryptionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @return The block cipher method to use for encryption.
     * @see EncryptionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @param mode
     *        The block cipher method to use for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public SymmetricEncryptionAttributes withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The block cipher method to use for encryption.
     * </p>
     * 
     * @param mode
     *        The block cipher method to use for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public SymmetricEncryptionAttributes withMode(EncryptionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The padding to be included with the data.
     * </p>
     * 
     * @param paddingType
     *        The padding to be included with the data.
     * @see PaddingType
     */

    public void setPaddingType(String paddingType) {
        this.paddingType = paddingType;
    }

    /**
     * <p>
     * The padding to be included with the data.
     * </p>
     * 
     * @return The padding to be included with the data.
     * @see PaddingType
     */

    public String getPaddingType() {
        return this.paddingType;
    }

    /**
     * <p>
     * The padding to be included with the data.
     * </p>
     * 
     * @param paddingType
     *        The padding to be included with the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaddingType
     */

    public SymmetricEncryptionAttributes withPaddingType(String paddingType) {
        setPaddingType(paddingType);
        return this;
    }

    /**
     * <p>
     * The padding to be included with the data.
     * </p>
     * 
     * @param paddingType
     *        The padding to be included with the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PaddingType
     */

    public SymmetricEncryptionAttributes withPaddingType(PaddingType paddingType) {
        this.paddingType = paddingType.toString();
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
        if (getInitializationVector() != null)
            sb.append("InitializationVector: ").append("***Sensitive Data Redacted***").append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getPaddingType() != null)
            sb.append("PaddingType: ").append(getPaddingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SymmetricEncryptionAttributes == false)
            return false;
        SymmetricEncryptionAttributes other = (SymmetricEncryptionAttributes) obj;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getPaddingType() == null ^ this.getPaddingType() == null)
            return false;
        if (other.getPaddingType() != null && other.getPaddingType().equals(this.getPaddingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getPaddingType() == null) ? 0 : getPaddingType().hashCode());
        return hashCode;
    }

    @Override
    public SymmetricEncryptionAttributes clone() {
        try {
            return (SymmetricEncryptionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.SymmetricEncryptionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
