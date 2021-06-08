/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines one or more purposes for which the key contained in the certificate can be used. Default value for each
 * option is false.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/KeyUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Key can be used for digital signing.
     * </p>
     */
    private Boolean digitalSignature;
    /**
     * <p>
     * Key can be used for non-repudiation.
     * </p>
     */
    private Boolean nonRepudiation;
    /**
     * <p>
     * Key can be used to encipher data.
     * </p>
     */
    private Boolean keyEncipherment;
    /**
     * <p>
     * Key can be used to decipher data.
     * </p>
     */
    private Boolean dataEncipherment;
    /**
     * <p>
     * Key can be used in a key-agreement protocol.
     * </p>
     */
    private Boolean keyAgreement;
    /**
     * <p>
     * Key can be used to sign certificates.
     * </p>
     */
    private Boolean keyCertSign;
    /**
     * <p>
     * Key can be used to sign CRLs.
     * </p>
     */
    private Boolean cRLSign;
    /**
     * <p>
     * Key can be used only to encipher data.
     * </p>
     */
    private Boolean encipherOnly;
    /**
     * <p>
     * Key can be used only to decipher data.
     * </p>
     */
    private Boolean decipherOnly;

    /**
     * <p>
     * Key can be used for digital signing.
     * </p>
     * 
     * @param digitalSignature
     *        Key can be used for digital signing.
     */

    public void setDigitalSignature(Boolean digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    /**
     * <p>
     * Key can be used for digital signing.
     * </p>
     * 
     * @return Key can be used for digital signing.
     */

    public Boolean getDigitalSignature() {
        return this.digitalSignature;
    }

    /**
     * <p>
     * Key can be used for digital signing.
     * </p>
     * 
     * @param digitalSignature
     *        Key can be used for digital signing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withDigitalSignature(Boolean digitalSignature) {
        setDigitalSignature(digitalSignature);
        return this;
    }

    /**
     * <p>
     * Key can be used for digital signing.
     * </p>
     * 
     * @return Key can be used for digital signing.
     */

    public Boolean isDigitalSignature() {
        return this.digitalSignature;
    }

    /**
     * <p>
     * Key can be used for non-repudiation.
     * </p>
     * 
     * @param nonRepudiation
     *        Key can be used for non-repudiation.
     */

    public void setNonRepudiation(Boolean nonRepudiation) {
        this.nonRepudiation = nonRepudiation;
    }

    /**
     * <p>
     * Key can be used for non-repudiation.
     * </p>
     * 
     * @return Key can be used for non-repudiation.
     */

    public Boolean getNonRepudiation() {
        return this.nonRepudiation;
    }

    /**
     * <p>
     * Key can be used for non-repudiation.
     * </p>
     * 
     * @param nonRepudiation
     *        Key can be used for non-repudiation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withNonRepudiation(Boolean nonRepudiation) {
        setNonRepudiation(nonRepudiation);
        return this;
    }

    /**
     * <p>
     * Key can be used for non-repudiation.
     * </p>
     * 
     * @return Key can be used for non-repudiation.
     */

    public Boolean isNonRepudiation() {
        return this.nonRepudiation;
    }

    /**
     * <p>
     * Key can be used to encipher data.
     * </p>
     * 
     * @param keyEncipherment
     *        Key can be used to encipher data.
     */

    public void setKeyEncipherment(Boolean keyEncipherment) {
        this.keyEncipherment = keyEncipherment;
    }

    /**
     * <p>
     * Key can be used to encipher data.
     * </p>
     * 
     * @return Key can be used to encipher data.
     */

    public Boolean getKeyEncipherment() {
        return this.keyEncipherment;
    }

    /**
     * <p>
     * Key can be used to encipher data.
     * </p>
     * 
     * @param keyEncipherment
     *        Key can be used to encipher data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withKeyEncipherment(Boolean keyEncipherment) {
        setKeyEncipherment(keyEncipherment);
        return this;
    }

    /**
     * <p>
     * Key can be used to encipher data.
     * </p>
     * 
     * @return Key can be used to encipher data.
     */

    public Boolean isKeyEncipherment() {
        return this.keyEncipherment;
    }

    /**
     * <p>
     * Key can be used to decipher data.
     * </p>
     * 
     * @param dataEncipherment
     *        Key can be used to decipher data.
     */

    public void setDataEncipherment(Boolean dataEncipherment) {
        this.dataEncipherment = dataEncipherment;
    }

    /**
     * <p>
     * Key can be used to decipher data.
     * </p>
     * 
     * @return Key can be used to decipher data.
     */

    public Boolean getDataEncipherment() {
        return this.dataEncipherment;
    }

    /**
     * <p>
     * Key can be used to decipher data.
     * </p>
     * 
     * @param dataEncipherment
     *        Key can be used to decipher data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withDataEncipherment(Boolean dataEncipherment) {
        setDataEncipherment(dataEncipherment);
        return this;
    }

    /**
     * <p>
     * Key can be used to decipher data.
     * </p>
     * 
     * @return Key can be used to decipher data.
     */

    public Boolean isDataEncipherment() {
        return this.dataEncipherment;
    }

    /**
     * <p>
     * Key can be used in a key-agreement protocol.
     * </p>
     * 
     * @param keyAgreement
     *        Key can be used in a key-agreement protocol.
     */

    public void setKeyAgreement(Boolean keyAgreement) {
        this.keyAgreement = keyAgreement;
    }

    /**
     * <p>
     * Key can be used in a key-agreement protocol.
     * </p>
     * 
     * @return Key can be used in a key-agreement protocol.
     */

    public Boolean getKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * <p>
     * Key can be used in a key-agreement protocol.
     * </p>
     * 
     * @param keyAgreement
     *        Key can be used in a key-agreement protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withKeyAgreement(Boolean keyAgreement) {
        setKeyAgreement(keyAgreement);
        return this;
    }

    /**
     * <p>
     * Key can be used in a key-agreement protocol.
     * </p>
     * 
     * @return Key can be used in a key-agreement protocol.
     */

    public Boolean isKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * <p>
     * Key can be used to sign certificates.
     * </p>
     * 
     * @param keyCertSign
     *        Key can be used to sign certificates.
     */

    public void setKeyCertSign(Boolean keyCertSign) {
        this.keyCertSign = keyCertSign;
    }

    /**
     * <p>
     * Key can be used to sign certificates.
     * </p>
     * 
     * @return Key can be used to sign certificates.
     */

    public Boolean getKeyCertSign() {
        return this.keyCertSign;
    }

    /**
     * <p>
     * Key can be used to sign certificates.
     * </p>
     * 
     * @param keyCertSign
     *        Key can be used to sign certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withKeyCertSign(Boolean keyCertSign) {
        setKeyCertSign(keyCertSign);
        return this;
    }

    /**
     * <p>
     * Key can be used to sign certificates.
     * </p>
     * 
     * @return Key can be used to sign certificates.
     */

    public Boolean isKeyCertSign() {
        return this.keyCertSign;
    }

    /**
     * <p>
     * Key can be used to sign CRLs.
     * </p>
     * 
     * @param cRLSign
     *        Key can be used to sign CRLs.
     */

    public void setCRLSign(Boolean cRLSign) {
        this.cRLSign = cRLSign;
    }

    /**
     * <p>
     * Key can be used to sign CRLs.
     * </p>
     * 
     * @return Key can be used to sign CRLs.
     */

    public Boolean getCRLSign() {
        return this.cRLSign;
    }

    /**
     * <p>
     * Key can be used to sign CRLs.
     * </p>
     * 
     * @param cRLSign
     *        Key can be used to sign CRLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withCRLSign(Boolean cRLSign) {
        setCRLSign(cRLSign);
        return this;
    }

    /**
     * <p>
     * Key can be used to sign CRLs.
     * </p>
     * 
     * @return Key can be used to sign CRLs.
     */

    public Boolean isCRLSign() {
        return this.cRLSign;
    }

    /**
     * <p>
     * Key can be used only to encipher data.
     * </p>
     * 
     * @param encipherOnly
     *        Key can be used only to encipher data.
     */

    public void setEncipherOnly(Boolean encipherOnly) {
        this.encipherOnly = encipherOnly;
    }

    /**
     * <p>
     * Key can be used only to encipher data.
     * </p>
     * 
     * @return Key can be used only to encipher data.
     */

    public Boolean getEncipherOnly() {
        return this.encipherOnly;
    }

    /**
     * <p>
     * Key can be used only to encipher data.
     * </p>
     * 
     * @param encipherOnly
     *        Key can be used only to encipher data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withEncipherOnly(Boolean encipherOnly) {
        setEncipherOnly(encipherOnly);
        return this;
    }

    /**
     * <p>
     * Key can be used only to encipher data.
     * </p>
     * 
     * @return Key can be used only to encipher data.
     */

    public Boolean isEncipherOnly() {
        return this.encipherOnly;
    }

    /**
     * <p>
     * Key can be used only to decipher data.
     * </p>
     * 
     * @param decipherOnly
     *        Key can be used only to decipher data.
     */

    public void setDecipherOnly(Boolean decipherOnly) {
        this.decipherOnly = decipherOnly;
    }

    /**
     * <p>
     * Key can be used only to decipher data.
     * </p>
     * 
     * @return Key can be used only to decipher data.
     */

    public Boolean getDecipherOnly() {
        return this.decipherOnly;
    }

    /**
     * <p>
     * Key can be used only to decipher data.
     * </p>
     * 
     * @param decipherOnly
     *        Key can be used only to decipher data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyUsage withDecipherOnly(Boolean decipherOnly) {
        setDecipherOnly(decipherOnly);
        return this;
    }

    /**
     * <p>
     * Key can be used only to decipher data.
     * </p>
     * 
     * @return Key can be used only to decipher data.
     */

    public Boolean isDecipherOnly() {
        return this.decipherOnly;
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
        if (getDigitalSignature() != null)
            sb.append("DigitalSignature: ").append(getDigitalSignature()).append(",");
        if (getNonRepudiation() != null)
            sb.append("NonRepudiation: ").append(getNonRepudiation()).append(",");
        if (getKeyEncipherment() != null)
            sb.append("KeyEncipherment: ").append(getKeyEncipherment()).append(",");
        if (getDataEncipherment() != null)
            sb.append("DataEncipherment: ").append(getDataEncipherment()).append(",");
        if (getKeyAgreement() != null)
            sb.append("KeyAgreement: ").append(getKeyAgreement()).append(",");
        if (getKeyCertSign() != null)
            sb.append("KeyCertSign: ").append(getKeyCertSign()).append(",");
        if (getCRLSign() != null)
            sb.append("CRLSign: ").append(getCRLSign()).append(",");
        if (getEncipherOnly() != null)
            sb.append("EncipherOnly: ").append(getEncipherOnly()).append(",");
        if (getDecipherOnly() != null)
            sb.append("DecipherOnly: ").append(getDecipherOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyUsage == false)
            return false;
        KeyUsage other = (KeyUsage) obj;
        if (other.getDigitalSignature() == null ^ this.getDigitalSignature() == null)
            return false;
        if (other.getDigitalSignature() != null && other.getDigitalSignature().equals(this.getDigitalSignature()) == false)
            return false;
        if (other.getNonRepudiation() == null ^ this.getNonRepudiation() == null)
            return false;
        if (other.getNonRepudiation() != null && other.getNonRepudiation().equals(this.getNonRepudiation()) == false)
            return false;
        if (other.getKeyEncipherment() == null ^ this.getKeyEncipherment() == null)
            return false;
        if (other.getKeyEncipherment() != null && other.getKeyEncipherment().equals(this.getKeyEncipherment()) == false)
            return false;
        if (other.getDataEncipherment() == null ^ this.getDataEncipherment() == null)
            return false;
        if (other.getDataEncipherment() != null && other.getDataEncipherment().equals(this.getDataEncipherment()) == false)
            return false;
        if (other.getKeyAgreement() == null ^ this.getKeyAgreement() == null)
            return false;
        if (other.getKeyAgreement() != null && other.getKeyAgreement().equals(this.getKeyAgreement()) == false)
            return false;
        if (other.getKeyCertSign() == null ^ this.getKeyCertSign() == null)
            return false;
        if (other.getKeyCertSign() != null && other.getKeyCertSign().equals(this.getKeyCertSign()) == false)
            return false;
        if (other.getCRLSign() == null ^ this.getCRLSign() == null)
            return false;
        if (other.getCRLSign() != null && other.getCRLSign().equals(this.getCRLSign()) == false)
            return false;
        if (other.getEncipherOnly() == null ^ this.getEncipherOnly() == null)
            return false;
        if (other.getEncipherOnly() != null && other.getEncipherOnly().equals(this.getEncipherOnly()) == false)
            return false;
        if (other.getDecipherOnly() == null ^ this.getDecipherOnly() == null)
            return false;
        if (other.getDecipherOnly() != null && other.getDecipherOnly().equals(this.getDecipherOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDigitalSignature() == null) ? 0 : getDigitalSignature().hashCode());
        hashCode = prime * hashCode + ((getNonRepudiation() == null) ? 0 : getNonRepudiation().hashCode());
        hashCode = prime * hashCode + ((getKeyEncipherment() == null) ? 0 : getKeyEncipherment().hashCode());
        hashCode = prime * hashCode + ((getDataEncipherment() == null) ? 0 : getDataEncipherment().hashCode());
        hashCode = prime * hashCode + ((getKeyAgreement() == null) ? 0 : getKeyAgreement().hashCode());
        hashCode = prime * hashCode + ((getKeyCertSign() == null) ? 0 : getKeyCertSign().hashCode());
        hashCode = prime * hashCode + ((getCRLSign() == null) ? 0 : getCRLSign().hashCode());
        hashCode = prime * hashCode + ((getEncipherOnly() == null) ? 0 : getEncipherOnly().hashCode());
        hashCode = prime * hashCode + ((getDecipherOnly() == null) ? 0 : getDecipherOnly().hashCode());
        return hashCode;
    }

    @Override
    public KeyUsage clone() {
        try {
            return (KeyUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.KeyUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
