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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of cryptographic operations that you can perform using the key. The modes of use are deﬁned in section A.5.3
 * of the TR-31 spec.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/KeyModesOfUse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyModesOfUse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     * </p>
     */
    private Boolean encrypt;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     * </p>
     */
    private Boolean decrypt;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     * </p>
     */
    private Boolean wrap;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     * </p>
     */
    private Boolean unwrap;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other card
     * and PIN verification keys.
     * </p>
     */
    private Boolean generate;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     * </p>
     */
    private Boolean sign;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     * </p>
     */
    private Boolean verify;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     * </p>
     */
    private Boolean deriveKey;
    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than the
     * restrictions implied by <code>KeyUsage</code>.
     * </p>
     */
    private Boolean noRestrictions;

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     * </p>
     * 
     * @param encrypt
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     */

    public void setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     */

    public Boolean getEncrypt() {
        return this.encrypt;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     * </p>
     * 
     * @param encrypt
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withEncrypt(Boolean encrypt) {
        setEncrypt(encrypt);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to encrypt data.
     */

    public Boolean isEncrypt() {
        return this.encrypt;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     * </p>
     * 
     * @param decrypt
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     */

    public void setDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     */

    public Boolean getDecrypt() {
        return this.decrypt;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     * </p>
     * 
     * @param decrypt
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withDecrypt(Boolean decrypt) {
        setDecrypt(decrypt);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to decrypt data.
     */

    public Boolean isDecrypt() {
        return this.decrypt;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     * </p>
     * 
     * @param wrap
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     */

    public void setWrap(Boolean wrap) {
        this.wrap = wrap;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     */

    public Boolean getWrap() {
        return this.wrap;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     * </p>
     * 
     * @param wrap
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withWrap(Boolean wrap) {
        setWrap(wrap);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to wrap other keys.
     */

    public Boolean isWrap() {
        return this.wrap;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     * </p>
     * 
     * @param unwrap
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     */

    public void setUnwrap(Boolean unwrap) {
        this.unwrap = unwrap;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     */

    public Boolean getUnwrap() {
        return this.unwrap;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     * </p>
     * 
     * @param unwrap
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withUnwrap(Boolean unwrap) {
        setUnwrap(unwrap);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to unwrap other keys.
     */

    public Boolean isUnwrap() {
        return this.unwrap;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other card
     * and PIN verification keys.
     * </p>
     * 
     * @param generate
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other
     *        card and PIN verification keys.
     */

    public void setGenerate(Boolean generate) {
        this.generate = generate;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other card
     * and PIN verification keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other
     *         card and PIN verification keys.
     */

    public Boolean getGenerate() {
        return this.generate;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other card
     * and PIN verification keys.
     * </p>
     * 
     * @param generate
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other
     *        card and PIN verification keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withGenerate(Boolean generate) {
        setGenerate(generate);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other card
     * and PIN verification keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to generate and verify other
     *         card and PIN verification keys.
     */

    public Boolean isGenerate() {
        return this.generate;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     * </p>
     * 
     * @param sign
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     */

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     */

    public Boolean getSign() {
        return this.sign;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     * </p>
     * 
     * @param sign
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withSign(Boolean sign) {
        setSign(sign);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used for signing.
     */

    public Boolean isSign() {
        return this.sign;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     * </p>
     * 
     * @param verify
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     */

    public void setVerify(Boolean verify) {
        this.verify = verify;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     */

    public Boolean getVerify() {
        return this.verify;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     * </p>
     * 
     * @param verify
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withVerify(Boolean verify) {
        setVerify(verify);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to verify signatures.
     */

    public Boolean isVerify() {
        return this.verify;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     * </p>
     * 
     * @param deriveKey
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     */

    public void setDeriveKey(Boolean deriveKey) {
        this.deriveKey = deriveKey;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     */

    public Boolean getDeriveKey() {
        return this.deriveKey;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     * </p>
     * 
     * @param deriveKey
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withDeriveKey(Boolean deriveKey) {
        setDeriveKey(deriveKey);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key can be used to derive new keys.
     */

    public Boolean isDeriveKey() {
        return this.deriveKey;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than the
     * restrictions implied by <code>KeyUsage</code>.
     * </p>
     * 
     * @param noRestrictions
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than
     *        the restrictions implied by <code>KeyUsage</code>.
     */

    public void setNoRestrictions(Boolean noRestrictions) {
        this.noRestrictions = noRestrictions;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than the
     * restrictions implied by <code>KeyUsage</code>.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than
     *         the restrictions implied by <code>KeyUsage</code>.
     */

    public Boolean getNoRestrictions() {
        return this.noRestrictions;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than the
     * restrictions implied by <code>KeyUsage</code>.
     * </p>
     * 
     * @param noRestrictions
     *        Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than
     *        the restrictions implied by <code>KeyUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyModesOfUse withNoRestrictions(Boolean noRestrictions) {
        setNoRestrictions(noRestrictions);
        return this;
    }

    /**
     * <p>
     * Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than the
     * restrictions implied by <code>KeyUsage</code>.
     * </p>
     * 
     * @return Speciﬁes whether an Amazon Web Services Payment Cryptography key has no special restrictions other than
     *         the restrictions implied by <code>KeyUsage</code>.
     */

    public Boolean isNoRestrictions() {
        return this.noRestrictions;
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
        if (getEncrypt() != null)
            sb.append("Encrypt: ").append(getEncrypt()).append(",");
        if (getDecrypt() != null)
            sb.append("Decrypt: ").append(getDecrypt()).append(",");
        if (getWrap() != null)
            sb.append("Wrap: ").append(getWrap()).append(",");
        if (getUnwrap() != null)
            sb.append("Unwrap: ").append(getUnwrap()).append(",");
        if (getGenerate() != null)
            sb.append("Generate: ").append(getGenerate()).append(",");
        if (getSign() != null)
            sb.append("Sign: ").append(getSign()).append(",");
        if (getVerify() != null)
            sb.append("Verify: ").append(getVerify()).append(",");
        if (getDeriveKey() != null)
            sb.append("DeriveKey: ").append(getDeriveKey()).append(",");
        if (getNoRestrictions() != null)
            sb.append("NoRestrictions: ").append(getNoRestrictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyModesOfUse == false)
            return false;
        KeyModesOfUse other = (KeyModesOfUse) obj;
        if (other.getEncrypt() == null ^ this.getEncrypt() == null)
            return false;
        if (other.getEncrypt() != null && other.getEncrypt().equals(this.getEncrypt()) == false)
            return false;
        if (other.getDecrypt() == null ^ this.getDecrypt() == null)
            return false;
        if (other.getDecrypt() != null && other.getDecrypt().equals(this.getDecrypt()) == false)
            return false;
        if (other.getWrap() == null ^ this.getWrap() == null)
            return false;
        if (other.getWrap() != null && other.getWrap().equals(this.getWrap()) == false)
            return false;
        if (other.getUnwrap() == null ^ this.getUnwrap() == null)
            return false;
        if (other.getUnwrap() != null && other.getUnwrap().equals(this.getUnwrap()) == false)
            return false;
        if (other.getGenerate() == null ^ this.getGenerate() == null)
            return false;
        if (other.getGenerate() != null && other.getGenerate().equals(this.getGenerate()) == false)
            return false;
        if (other.getSign() == null ^ this.getSign() == null)
            return false;
        if (other.getSign() != null && other.getSign().equals(this.getSign()) == false)
            return false;
        if (other.getVerify() == null ^ this.getVerify() == null)
            return false;
        if (other.getVerify() != null && other.getVerify().equals(this.getVerify()) == false)
            return false;
        if (other.getDeriveKey() == null ^ this.getDeriveKey() == null)
            return false;
        if (other.getDeriveKey() != null && other.getDeriveKey().equals(this.getDeriveKey()) == false)
            return false;
        if (other.getNoRestrictions() == null ^ this.getNoRestrictions() == null)
            return false;
        if (other.getNoRestrictions() != null && other.getNoRestrictions().equals(this.getNoRestrictions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncrypt() == null) ? 0 : getEncrypt().hashCode());
        hashCode = prime * hashCode + ((getDecrypt() == null) ? 0 : getDecrypt().hashCode());
        hashCode = prime * hashCode + ((getWrap() == null) ? 0 : getWrap().hashCode());
        hashCode = prime * hashCode + ((getUnwrap() == null) ? 0 : getUnwrap().hashCode());
        hashCode = prime * hashCode + ((getGenerate() == null) ? 0 : getGenerate().hashCode());
        hashCode = prime * hashCode + ((getSign() == null) ? 0 : getSign().hashCode());
        hashCode = prime * hashCode + ((getVerify() == null) ? 0 : getVerify().hashCode());
        hashCode = prime * hashCode + ((getDeriveKey() == null) ? 0 : getDeriveKey().hashCode());
        hashCode = prime * hashCode + ((getNoRestrictions() == null) ? 0 : getNoRestrictions().hashCode());
        return hashCode;
    }

    @Override
    public KeyModesOfUse clone() {
        try {
            return (KeyModesOfUse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.KeyModesOfUseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
