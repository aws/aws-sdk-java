/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this structure to allow cryptographic operations in the grant only when the operation request includes the
 * specified <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
 * context</a>.
 * </p>
 * <p>
 * AWS KMS applies the grant constraints only when the grant allows a cryptographic operation that accepts an encryption
 * context as input, such as the following.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>Encrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Decrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ReEncrypt</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS KMS does not apply the grant constraints to other operations, such as <a>DescribeKey</a> or
 * <a>ScheduleKeyDeletion</a>.
 * </p>
 * <important>
 * <p>
 * In a cryptographic operation, the encryption context in the decryption operation must be an exact, case-sensitive
 * match for the keys and values in the encryption context of the encryption operation. Only the order of the pairs can
 * vary.
 * </p>
 * <p>
 * However, in a grant constraint, the key in each key-value pair is not case sensitive, but the value is case
 * sensitive.
 * </p>
 * <p>
 * To avoid confusion, do not use multiple encryption context pairs that differ only by case. To require a fully
 * case-sensitive encryption context, use the <code>kms:EncryptionContext:</code> and
 * <code>kms:EncryptionContextKeys</code> conditions in an IAM or key policy. For details, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-context"
 * >kms:EncryptionContext:</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GrantConstraints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request.
     * The grant allows the cryptographic operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include additional key-value pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextSubset;
    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The
     * grant allows the operation only when the encryption context in the request is the same as the encryption context
     * specified in this constraint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextEquals;

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request.
     * The grant allows the cryptographic operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include additional key-value pairs.
     * </p>
     * 
     * @return A list of key-value pairs that must be included in the encryption context of the cryptographic operation
     *         request. The grant allows the cryptographic operation only when the encryption context in the request
     *         includes the key-value pairs specified in this constraint, although it can include additional key-value
     *         pairs.
     */

    public java.util.Map<String, String> getEncryptionContextSubset() {
        if (encryptionContextSubset == null) {
            encryptionContextSubset = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContextSubset;
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request.
     * The grant allows the cryptographic operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include additional key-value pairs.
     * </p>
     * 
     * @param encryptionContextSubset
     *        A list of key-value pairs that must be included in the encryption context of the cryptographic operation
     *        request. The grant allows the cryptographic operation only when the encryption context in the request
     *        includes the key-value pairs specified in this constraint, although it can include additional key-value
     *        pairs.
     */

    public void setEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        this.encryptionContextSubset = encryptionContextSubset == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                encryptionContextSubset);
    }

    /**
     * <p>
     * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request.
     * The grant allows the cryptographic operation only when the encryption context in the request includes the
     * key-value pairs specified in this constraint, although it can include additional key-value pairs.
     * </p>
     * 
     * @param encryptionContextSubset
     *        A list of key-value pairs that must be included in the encryption context of the cryptographic operation
     *        request. The grant allows the cryptographic operation only when the encryption context in the request
     *        includes the key-value pairs specified in this constraint, although it can include additional key-value
     *        pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantConstraints withEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        setEncryptionContextSubset(encryptionContextSubset);
        return this;
    }

    /**
     * Add a single EncryptionContextSubset entry
     *
     * @see GrantConstraints#withEncryptionContextSubset
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GrantConstraints addEncryptionContextSubsetEntry(String key, String value) {
        if (null == this.encryptionContextSubset) {
            this.encryptionContextSubset = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public GrantConstraints clearEncryptionContextSubsetEntries() {
        this.encryptionContextSubset = null;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The
     * grant allows the operation only when the encryption context in the request is the same as the encryption context
     * specified in this constraint.
     * </p>
     * 
     * @return A list of key-value pairs that must match the encryption context in the cryptographic operation request.
     *         The grant allows the operation only when the encryption context in the request is the same as the
     *         encryption context specified in this constraint.
     */

    public java.util.Map<String, String> getEncryptionContextEquals() {
        if (encryptionContextEquals == null) {
            encryptionContextEquals = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContextEquals;
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The
     * grant allows the operation only when the encryption context in the request is the same as the encryption context
     * specified in this constraint.
     * </p>
     * 
     * @param encryptionContextEquals
     *        A list of key-value pairs that must match the encryption context in the cryptographic operation request.
     *        The grant allows the operation only when the encryption context in the request is the same as the
     *        encryption context specified in this constraint.
     */

    public void setEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        this.encryptionContextEquals = encryptionContextEquals == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                encryptionContextEquals);
    }

    /**
     * <p>
     * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The
     * grant allows the operation only when the encryption context in the request is the same as the encryption context
     * specified in this constraint.
     * </p>
     * 
     * @param encryptionContextEquals
     *        A list of key-value pairs that must match the encryption context in the cryptographic operation request.
     *        The grant allows the operation only when the encryption context in the request is the same as the
     *        encryption context specified in this constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantConstraints withEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        setEncryptionContextEquals(encryptionContextEquals);
        return this;
    }

    /**
     * Add a single EncryptionContextEquals entry
     *
     * @see GrantConstraints#withEncryptionContextEquals
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GrantConstraints addEncryptionContextEqualsEntry(String key, String value) {
        if (null == this.encryptionContextEquals) {
            this.encryptionContextEquals = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public GrantConstraints clearEncryptionContextEqualsEntries() {
        this.encryptionContextEquals = null;
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
        if (getEncryptionContextSubset() != null)
            sb.append("EncryptionContextSubset: ").append(getEncryptionContextSubset()).append(",");
        if (getEncryptionContextEquals() != null)
            sb.append("EncryptionContextEquals: ").append(getEncryptionContextEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantConstraints == false)
            return false;
        GrantConstraints other = (GrantConstraints) obj;
        if (other.getEncryptionContextSubset() == null ^ this.getEncryptionContextSubset() == null)
            return false;
        if (other.getEncryptionContextSubset() != null && other.getEncryptionContextSubset().equals(this.getEncryptionContextSubset()) == false)
            return false;
        if (other.getEncryptionContextEquals() == null ^ this.getEncryptionContextEquals() == null)
            return false;
        if (other.getEncryptionContextEquals() != null && other.getEncryptionContextEquals().equals(this.getEncryptionContextEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionContextSubset() == null) ? 0 : getEncryptionContextSubset().hashCode());
        hashCode = prime * hashCode + ((getEncryptionContextEquals() == null) ? 0 : getEncryptionContextEquals().hashCode());
        return hashCode;
    }

    @Override
    public GrantConstraints clone() {
        try {
            return (GrantConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.GrantConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
