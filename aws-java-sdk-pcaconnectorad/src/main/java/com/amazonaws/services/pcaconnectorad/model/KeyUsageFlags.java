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
 * The key usage flags represent the purpose (e.g., encipherment, signature) of the key contained in the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/KeyUsageFlags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyUsageFlags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data without
     * the use of an intermediate symmetric cipher.
     * </p>
     */
    private Boolean dataEncipherment;
    /**
     * <p>
     * The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     * </p>
     */
    private Boolean digitalSignature;
    /**
     * <p>
     * KeyAgreement is asserted when the subject public key is used for key agreement.
     * </p>
     */
    private Boolean keyAgreement;
    /**
     * <p>
     * KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys, i.e., for
     * key transport.
     * </p>
     */
    private Boolean keyEncipherment;
    /**
     * <p>
     * NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     * </p>
     */
    private Boolean nonRepudiation;

    /**
     * <p>
     * DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data without
     * the use of an intermediate symmetric cipher.
     * </p>
     * 
     * @param dataEncipherment
     *        DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data
     *        without the use of an intermediate symmetric cipher.
     */

    public void setDataEncipherment(Boolean dataEncipherment) {
        this.dataEncipherment = dataEncipherment;
    }

    /**
     * <p>
     * DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data without
     * the use of an intermediate symmetric cipher.
     * </p>
     * 
     * @return DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data
     *         without the use of an intermediate symmetric cipher.
     */

    public Boolean getDataEncipherment() {
        return this.dataEncipherment;
    }

    /**
     * <p>
     * DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data without
     * the use of an intermediate symmetric cipher.
     * </p>
     * 
     * @param dataEncipherment
     *        DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data
     *        without the use of an intermediate symmetric cipher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsageFlags withDataEncipherment(Boolean dataEncipherment) {
        setDataEncipherment(dataEncipherment);
        return this;
    }

    /**
     * <p>
     * DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data without
     * the use of an intermediate symmetric cipher.
     * </p>
     * 
     * @return DataEncipherment is asserted when the subject public key is used for directly enciphering raw user data
     *         without the use of an intermediate symmetric cipher.
     */

    public Boolean isDataEncipherment() {
        return this.dataEncipherment;
    }

    /**
     * <p>
     * The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     * </p>
     * 
     * @param digitalSignature
     *        The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     */

    public void setDigitalSignature(Boolean digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    /**
     * <p>
     * The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     * </p>
     * 
     * @return The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     */

    public Boolean getDigitalSignature() {
        return this.digitalSignature;
    }

    /**
     * <p>
     * The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     * </p>
     * 
     * @param digitalSignature
     *        The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsageFlags withDigitalSignature(Boolean digitalSignature) {
        setDigitalSignature(digitalSignature);
        return this;
    }

    /**
     * <p>
     * The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     * </p>
     * 
     * @return The digitalSignature is asserted when the subject public key is used for verifying digital signatures.
     */

    public Boolean isDigitalSignature() {
        return this.digitalSignature;
    }

    /**
     * <p>
     * KeyAgreement is asserted when the subject public key is used for key agreement.
     * </p>
     * 
     * @param keyAgreement
     *        KeyAgreement is asserted when the subject public key is used for key agreement.
     */

    public void setKeyAgreement(Boolean keyAgreement) {
        this.keyAgreement = keyAgreement;
    }

    /**
     * <p>
     * KeyAgreement is asserted when the subject public key is used for key agreement.
     * </p>
     * 
     * @return KeyAgreement is asserted when the subject public key is used for key agreement.
     */

    public Boolean getKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * <p>
     * KeyAgreement is asserted when the subject public key is used for key agreement.
     * </p>
     * 
     * @param keyAgreement
     *        KeyAgreement is asserted when the subject public key is used for key agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsageFlags withKeyAgreement(Boolean keyAgreement) {
        setKeyAgreement(keyAgreement);
        return this;
    }

    /**
     * <p>
     * KeyAgreement is asserted when the subject public key is used for key agreement.
     * </p>
     * 
     * @return KeyAgreement is asserted when the subject public key is used for key agreement.
     */

    public Boolean isKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * <p>
     * KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys, i.e., for
     * key transport.
     * </p>
     * 
     * @param keyEncipherment
     *        KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys,
     *        i.e., for key transport.
     */

    public void setKeyEncipherment(Boolean keyEncipherment) {
        this.keyEncipherment = keyEncipherment;
    }

    /**
     * <p>
     * KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys, i.e., for
     * key transport.
     * </p>
     * 
     * @return KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys,
     *         i.e., for key transport.
     */

    public Boolean getKeyEncipherment() {
        return this.keyEncipherment;
    }

    /**
     * <p>
     * KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys, i.e., for
     * key transport.
     * </p>
     * 
     * @param keyEncipherment
     *        KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys,
     *        i.e., for key transport.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsageFlags withKeyEncipherment(Boolean keyEncipherment) {
        setKeyEncipherment(keyEncipherment);
        return this;
    }

    /**
     * <p>
     * KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys, i.e., for
     * key transport.
     * </p>
     * 
     * @return KeyEncipherment is asserted when the subject public key is used for enciphering private or secret keys,
     *         i.e., for key transport.
     */

    public Boolean isKeyEncipherment() {
        return this.keyEncipherment;
    }

    /**
     * <p>
     * NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     * </p>
     * 
     * @param nonRepudiation
     *        NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     */

    public void setNonRepudiation(Boolean nonRepudiation) {
        this.nonRepudiation = nonRepudiation;
    }

    /**
     * <p>
     * NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     * </p>
     * 
     * @return NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     */

    public Boolean getNonRepudiation() {
        return this.nonRepudiation;
    }

    /**
     * <p>
     * NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     * </p>
     * 
     * @param nonRepudiation
     *        NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsageFlags withNonRepudiation(Boolean nonRepudiation) {
        setNonRepudiation(nonRepudiation);
        return this;
    }

    /**
     * <p>
     * NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     * </p>
     * 
     * @return NonRepudiation is asserted when the subject public key is used to verify digital signatures.
     */

    public Boolean isNonRepudiation() {
        return this.nonRepudiation;
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
        if (getDataEncipherment() != null)
            sb.append("DataEncipherment: ").append(getDataEncipherment()).append(",");
        if (getDigitalSignature() != null)
            sb.append("DigitalSignature: ").append(getDigitalSignature()).append(",");
        if (getKeyAgreement() != null)
            sb.append("KeyAgreement: ").append(getKeyAgreement()).append(",");
        if (getKeyEncipherment() != null)
            sb.append("KeyEncipherment: ").append(getKeyEncipherment()).append(",");
        if (getNonRepudiation() != null)
            sb.append("NonRepudiation: ").append(getNonRepudiation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyUsageFlags == false)
            return false;
        KeyUsageFlags other = (KeyUsageFlags) obj;
        if (other.getDataEncipherment() == null ^ this.getDataEncipherment() == null)
            return false;
        if (other.getDataEncipherment() != null && other.getDataEncipherment().equals(this.getDataEncipherment()) == false)
            return false;
        if (other.getDigitalSignature() == null ^ this.getDigitalSignature() == null)
            return false;
        if (other.getDigitalSignature() != null && other.getDigitalSignature().equals(this.getDigitalSignature()) == false)
            return false;
        if (other.getKeyAgreement() == null ^ this.getKeyAgreement() == null)
            return false;
        if (other.getKeyAgreement() != null && other.getKeyAgreement().equals(this.getKeyAgreement()) == false)
            return false;
        if (other.getKeyEncipherment() == null ^ this.getKeyEncipherment() == null)
            return false;
        if (other.getKeyEncipherment() != null && other.getKeyEncipherment().equals(this.getKeyEncipherment()) == false)
            return false;
        if (other.getNonRepudiation() == null ^ this.getNonRepudiation() == null)
            return false;
        if (other.getNonRepudiation() != null && other.getNonRepudiation().equals(this.getNonRepudiation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataEncipherment() == null) ? 0 : getDataEncipherment().hashCode());
        hashCode = prime * hashCode + ((getDigitalSignature() == null) ? 0 : getDigitalSignature().hashCode());
        hashCode = prime * hashCode + ((getKeyAgreement() == null) ? 0 : getKeyAgreement().hashCode());
        hashCode = prime * hashCode + ((getKeyEncipherment() == null) ? 0 : getKeyEncipherment().hashCode());
        hashCode = prime * hashCode + ((getNonRepudiation() == null) ? 0 : getNonRepudiation().hashCode());
        return hashCode;
    }

    @Override
    public KeyUsageFlags clone() {
        try {
            return (KeyUsageFlags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.KeyUsageFlagsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
