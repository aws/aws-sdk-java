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
 * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data is
 * immutable after the key is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/KeyAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of the
     * TR-31 spec.
     * </p>
     */
    private String keyUsage;
    /**
     * <p>
     * The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of the
     * cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key or an
     * asymmetric key pair.
     * </p>
     */
    private String keyClass;
    /**
     * <p>
     * The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and <code>TDES</code>
     * algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports <code>RSA</code> and
     * <code>ECC_NIST</code> algorithms.
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * The list of cryptographic operations that you can perform using the key.
     * </p>
     */
    private KeyModesOfUse keyModesOfUse;

    /**
     * <p>
     * The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of the
     * TR-31 spec.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of
     *        the TR-31 spec.
     * @see KeyUsage
     */

    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of the
     * TR-31 spec.
     * </p>
     * 
     * @return The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of
     *         the TR-31 spec.
     * @see KeyUsage
     */

    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of the
     * TR-31 spec.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of
     *        the TR-31 spec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsage
     */

    public KeyAttributes withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of the
     * TR-31 spec.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic usage of an Amazon Web Services Payment Cryptography key as deﬁned in section A.5.2 of
     *        the TR-31 spec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsage
     */

    public KeyAttributes withKeyUsage(KeyUsage keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of the
     * cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key or an
     * asymmetric key pair.
     * </p>
     * 
     * @param keyClass
     *        The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of
     *        the cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key
     *        or an asymmetric key pair.
     * @see KeyClass
     */

    public void setKeyClass(String keyClass) {
        this.keyClass = keyClass;
    }

    /**
     * <p>
     * The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of the
     * cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key or an
     * asymmetric key pair.
     * </p>
     * 
     * @return The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of
     *         the cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric
     *         key or an asymmetric key pair.
     * @see KeyClass
     */

    public String getKeyClass() {
        return this.keyClass;
    }

    /**
     * <p>
     * The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of the
     * cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key or an
     * asymmetric key pair.
     * </p>
     * 
     * @param keyClass
     *        The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of
     *        the cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key
     *        or an asymmetric key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyClass
     */

    public KeyAttributes withKeyClass(String keyClass) {
        setKeyClass(keyClass);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of the
     * cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key or an
     * asymmetric key pair.
     * </p>
     * 
     * @param keyClass
     *        The type of Amazon Web Services Payment Cryptography key to create, which determines the classiﬁcation of
     *        the cryptographic method and whether Amazon Web Services Payment Cryptography key contains a symmetric key
     *        or an asymmetric key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyClass
     */

    public KeyAttributes withKeyClass(KeyClass keyClass) {
        this.keyClass = keyClass.toString();
        return this;
    }

    /**
     * <p>
     * The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and <code>TDES</code>
     * algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports <code>RSA</code> and
     * <code>ECC_NIST</code> algorithms.
     * </p>
     * 
     * @param keyAlgorithm
     *        The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.</p>
     *        <p>
     *        For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and
     *        <code>TDES</code> algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports
     *        <code>RSA</code> and <code>ECC_NIST</code> algorithms.
     * @see KeyAlgorithm
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and <code>TDES</code>
     * algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports <code>RSA</code> and
     * <code>ECC_NIST</code> algorithms.
     * </p>
     * 
     * @return The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.</p>
     *         <p>
     *         For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and
     *         <code>TDES</code> algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports
     *         <code>RSA</code> and <code>ECC_NIST</code> algorithms.
     * @see KeyAlgorithm
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and <code>TDES</code>
     * algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports <code>RSA</code> and
     * <code>ECC_NIST</code> algorithms.
     * </p>
     * 
     * @param keyAlgorithm
     *        The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.</p>
     *        <p>
     *        For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and
     *        <code>TDES</code> algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports
     *        <code>RSA</code> and <code>ECC_NIST</code> algorithms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public KeyAttributes withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and <code>TDES</code>
     * algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports <code>RSA</code> and
     * <code>ECC_NIST</code> algorithms.
     * </p>
     * 
     * @param keyAlgorithm
     *        The key algorithm to be use during creation of an Amazon Web Services Payment Cryptography key.</p>
     *        <p>
     *        For symmetric keys, Amazon Web Services Payment Cryptography supports <code>AES</code> and
     *        <code>TDES</code> algorithms. For asymmetric keys, Amazon Web Services Payment Cryptography supports
     *        <code>RSA</code> and <code>ECC_NIST</code> algorithms.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public KeyAttributes withKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The list of cryptographic operations that you can perform using the key.
     * </p>
     * 
     * @param keyModesOfUse
     *        The list of cryptographic operations that you can perform using the key.
     */

    public void setKeyModesOfUse(KeyModesOfUse keyModesOfUse) {
        this.keyModesOfUse = keyModesOfUse;
    }

    /**
     * <p>
     * The list of cryptographic operations that you can perform using the key.
     * </p>
     * 
     * @return The list of cryptographic operations that you can perform using the key.
     */

    public KeyModesOfUse getKeyModesOfUse() {
        return this.keyModesOfUse;
    }

    /**
     * <p>
     * The list of cryptographic operations that you can perform using the key.
     * </p>
     * 
     * @param keyModesOfUse
     *        The list of cryptographic operations that you can perform using the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyAttributes withKeyModesOfUse(KeyModesOfUse keyModesOfUse) {
        setKeyModesOfUse(keyModesOfUse);
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
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getKeyClass() != null)
            sb.append("KeyClass: ").append(getKeyClass()).append(",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getKeyModesOfUse() != null)
            sb.append("KeyModesOfUse: ").append(getKeyModesOfUse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyAttributes == false)
            return false;
        KeyAttributes other = (KeyAttributes) obj;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getKeyClass() == null ^ this.getKeyClass() == null)
            return false;
        if (other.getKeyClass() != null && other.getKeyClass().equals(this.getKeyClass()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getKeyModesOfUse() == null ^ this.getKeyModesOfUse() == null)
            return false;
        if (other.getKeyModesOfUse() != null && other.getKeyModesOfUse().equals(this.getKeyModesOfUse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getKeyClass() == null) ? 0 : getKeyClass().hashCode());
        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyModesOfUse() == null) ? 0 : getKeyModesOfUse().hashCode());
        return hashCode;
    }

    @Override
    public KeyAttributes clone() {
        try {
            return (KeyAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.KeyAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
