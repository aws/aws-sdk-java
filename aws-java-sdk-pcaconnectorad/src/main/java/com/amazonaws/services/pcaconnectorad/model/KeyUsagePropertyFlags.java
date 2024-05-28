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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies key usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/KeyUsagePropertyFlags"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyUsagePropertyFlags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows key for encryption and decryption.
     * </p>
     */
    private Boolean decrypt;
    /**
     * <p>
     * Allows key exchange without encryption.
     * </p>
     */
    private Boolean keyAgreement;
    /**
     * <p>
     * Allow key use for digital signature.
     * </p>
     */
    private Boolean sign;

    /**
     * <p>
     * Allows key for encryption and decryption.
     * </p>
     * 
     * @param decrypt
     *        Allows key for encryption and decryption.
     */

    public void setDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
    }

    /**
     * <p>
     * Allows key for encryption and decryption.
     * </p>
     * 
     * @return Allows key for encryption and decryption.
     */

    public Boolean getDecrypt() {
        return this.decrypt;
    }

    /**
     * <p>
     * Allows key for encryption and decryption.
     * </p>
     * 
     * @param decrypt
     *        Allows key for encryption and decryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsagePropertyFlags withDecrypt(Boolean decrypt) {
        setDecrypt(decrypt);
        return this;
    }

    /**
     * <p>
     * Allows key for encryption and decryption.
     * </p>
     * 
     * @return Allows key for encryption and decryption.
     */

    public Boolean isDecrypt() {
        return this.decrypt;
    }

    /**
     * <p>
     * Allows key exchange without encryption.
     * </p>
     * 
     * @param keyAgreement
     *        Allows key exchange without encryption.
     */

    public void setKeyAgreement(Boolean keyAgreement) {
        this.keyAgreement = keyAgreement;
    }

    /**
     * <p>
     * Allows key exchange without encryption.
     * </p>
     * 
     * @return Allows key exchange without encryption.
     */

    public Boolean getKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * <p>
     * Allows key exchange without encryption.
     * </p>
     * 
     * @param keyAgreement
     *        Allows key exchange without encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsagePropertyFlags withKeyAgreement(Boolean keyAgreement) {
        setKeyAgreement(keyAgreement);
        return this;
    }

    /**
     * <p>
     * Allows key exchange without encryption.
     * </p>
     * 
     * @return Allows key exchange without encryption.
     */

    public Boolean isKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * <p>
     * Allow key use for digital signature.
     * </p>
     * 
     * @param sign
     *        Allow key use for digital signature.
     */

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    /**
     * <p>
     * Allow key use for digital signature.
     * </p>
     * 
     * @return Allow key use for digital signature.
     */

    public Boolean getSign() {
        return this.sign;
    }

    /**
     * <p>
     * Allow key use for digital signature.
     * </p>
     * 
     * @param sign
     *        Allow key use for digital signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsagePropertyFlags withSign(Boolean sign) {
        setSign(sign);
        return this;
    }

    /**
     * <p>
     * Allow key use for digital signature.
     * </p>
     * 
     * @return Allow key use for digital signature.
     */

    public Boolean isSign() {
        return this.sign;
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
        if (getDecrypt() != null)
            sb.append("Decrypt: ").append(getDecrypt()).append(",");
        if (getKeyAgreement() != null)
            sb.append("KeyAgreement: ").append(getKeyAgreement()).append(",");
        if (getSign() != null)
            sb.append("Sign: ").append(getSign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyUsagePropertyFlags == false)
            return false;
        KeyUsagePropertyFlags other = (KeyUsagePropertyFlags) obj;
        if (other.getDecrypt() == null ^ this.getDecrypt() == null)
            return false;
        if (other.getDecrypt() != null && other.getDecrypt().equals(this.getDecrypt()) == false)
            return false;
        if (other.getKeyAgreement() == null ^ this.getKeyAgreement() == null)
            return false;
        if (other.getKeyAgreement() != null && other.getKeyAgreement().equals(this.getKeyAgreement()) == false)
            return false;
        if (other.getSign() == null ^ this.getSign() == null)
            return false;
        if (other.getSign() != null && other.getSign().equals(this.getSign()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecrypt() == null) ? 0 : getDecrypt().hashCode());
        hashCode = prime * hashCode + ((getKeyAgreement() == null) ? 0 : getKeyAgreement().hashCode());
        hashCode = prime * hashCode + ((getSign() == null) ? 0 : getSign().hashCode());
        return hashCode;
    }

    @Override
    public KeyUsagePropertyFlags clone() {
        try {
            return (KeyUsagePropertyFlags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.KeyUsagePropertyFlagsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
