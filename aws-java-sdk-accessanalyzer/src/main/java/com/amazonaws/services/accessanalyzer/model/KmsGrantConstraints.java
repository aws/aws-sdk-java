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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this structure to propose allowing <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
 * operations</a> in the grant only when the operation request includes the specified <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption context</a>.
 * You can specify only one type of encryption context. An empty map is treated as not specified. For more information,
 * see <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_GrantConstraints.html">GrantConstraints</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/KmsGrantConstraints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsGrantConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the operation only when the encryption context in the request is the same
     * as the encryption context specified in this constraint.
     * </p>
     */
    private java.util.Map<String, String> encryptionContextEquals;
    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the cryptographic operation only when the encryption context in the
     * request includes the key-value pairs specified in this constraint, although it can include additional key-value
     * pairs.
     * </p>
     */
    private java.util.Map<String, String> encryptionContextSubset;

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the operation only when the encryption context in the request is the same
     * as the encryption context specified in this constraint.
     * </p>
     * 
     * @return A list of key-value pairs that must match the encryption context in the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operation</a> request. The grant allows the operation only when the encryption context in
     *         the request is the same as the encryption context specified in this constraint.
     */

    public java.util.Map<String, String> getEncryptionContextEquals() {
        return encryptionContextEquals;
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the operation only when the encryption context in the request is the same
     * as the encryption context specified in this constraint.
     * </p>
     * 
     * @param encryptionContextEquals
     *        A list of key-value pairs that must match the encryption context in the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operation</a> request. The grant allows the operation only when the encryption context in
     *        the request is the same as the encryption context specified in this constraint.
     */

    public void setEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        this.encryptionContextEquals = encryptionContextEquals;
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the operation only when the encryption context in the request is the same
     * as the encryption context specified in this constraint.
     * </p>
     * 
     * @param encryptionContextEquals
     *        A list of key-value pairs that must match the encryption context in the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operation</a> request. The grant allows the operation only when the encryption context in
     *        the request is the same as the encryption context specified in this constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConstraints withEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        setEncryptionContextEquals(encryptionContextEquals);
        return this;
    }

    /**
     * Add a single EncryptionContextEquals entry
     *
     * @see KmsGrantConstraints#withEncryptionContextEquals
     * @returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConstraints addEncryptionContextEqualsEntry(String key, String value) {
        if (null == this.encryptionContextEquals) {
            this.encryptionContextEquals = new java.util.HashMap<String, String>();
        }
        if (this.encryptionContextEquals.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.encryptionContextEquals.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContextEquals.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConstraints clearEncryptionContextEqualsEntries() {
        this.encryptionContextEquals = null;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the cryptographic operation only when the encryption context in the
     * request includes the key-value pairs specified in this constraint, although it can include additional key-value
     * pairs.
     * </p>
     * 
     * @return A list of key-value pairs that must be included in the encryption context of the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operation</a> request. The grant allows the cryptographic operation only when the
     *         encryption context in the request includes the key-value pairs specified in this constraint, although it
     *         can include additional key-value pairs.
     */

    public java.util.Map<String, String> getEncryptionContextSubset() {
        return encryptionContextSubset;
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the cryptographic operation only when the encryption context in the
     * request includes the key-value pairs specified in this constraint, although it can include additional key-value
     * pairs.
     * </p>
     * 
     * @param encryptionContextSubset
     *        A list of key-value pairs that must be included in the encryption context of the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operation</a> request. The grant allows the cryptographic operation only when the
     *        encryption context in the request includes the key-value pairs specified in this constraint, although it
     *        can include additional key-value pairs.
     */

    public void setEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        this.encryptionContextSubset = encryptionContextSubset;
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operation</a> request. The grant allows the cryptographic operation only when the encryption context in the
     * request includes the key-value pairs specified in this constraint, although it can include additional key-value
     * pairs.
     * </p>
     * 
     * @param encryptionContextSubset
     *        A list of key-value pairs that must be included in the encryption context of the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operation</a> request. The grant allows the cryptographic operation only when the
     *        encryption context in the request includes the key-value pairs specified in this constraint, although it
     *        can include additional key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConstraints withEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        setEncryptionContextSubset(encryptionContextSubset);
        return this;
    }

    /**
     * Add a single EncryptionContextSubset entry
     *
     * @see KmsGrantConstraints#withEncryptionContextSubset
     * @returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConstraints addEncryptionContextSubsetEntry(String key, String value) {
        if (null == this.encryptionContextSubset) {
            this.encryptionContextSubset = new java.util.HashMap<String, String>();
        }
        if (this.encryptionContextSubset.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.encryptionContextSubset.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContextSubset.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsGrantConstraints clearEncryptionContextSubsetEntries() {
        this.encryptionContextSubset = null;
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
        if (getEncryptionContextEquals() != null)
            sb.append("EncryptionContextEquals: ").append(getEncryptionContextEquals()).append(",");
        if (getEncryptionContextSubset() != null)
            sb.append("EncryptionContextSubset: ").append(getEncryptionContextSubset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KmsGrantConstraints == false)
            return false;
        KmsGrantConstraints other = (KmsGrantConstraints) obj;
        if (other.getEncryptionContextEquals() == null ^ this.getEncryptionContextEquals() == null)
            return false;
        if (other.getEncryptionContextEquals() != null && other.getEncryptionContextEquals().equals(this.getEncryptionContextEquals()) == false)
            return false;
        if (other.getEncryptionContextSubset() == null ^ this.getEncryptionContextSubset() == null)
            return false;
        if (other.getEncryptionContextSubset() != null && other.getEncryptionContextSubset().equals(this.getEncryptionContextSubset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionContextEquals() == null) ? 0 : getEncryptionContextEquals().hashCode());
        hashCode = prime * hashCode + ((getEncryptionContextSubset() == null) ? 0 : getEncryptionContextSubset().hashCode());
        return hashCode;
    }

    @Override
    public KmsGrantConstraints clone() {
        try {
            return (KmsGrantConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.KmsGrantConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
