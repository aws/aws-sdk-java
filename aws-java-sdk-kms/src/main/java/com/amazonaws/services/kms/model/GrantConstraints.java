/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that you can use to allow certain operations in the grant only when the desired encryption context is
 * present. For more information about encryption context, see <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
 * <i>AWS Key Management Service Developer Guide</i>.
 * </p>
 * <p>
 * Grant constraints apply only to operations that accept encryption context as input. For example, the
 * <code> <a>DescribeKey</a> </code> operation does not accept encryption context as input. A grant that allows the
 * <code>DescribeKey</code> operation does so regardless of the grant constraints. In constrast, the
 * <code> <a>Encrypt</a> </code> operation accepts encryption context as input. A grant that allows the
 * <code>Encrypt</code> operation does so only when the encryption context of the <code>Encrypt</code> operation
 * satisfies the grant constraints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GrantConstraints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     * operations that the grant allows. When certain subsequent operations allowed by the grant include encryption
     * context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the
     * grant does not allow the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextSubset;
    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches
     * this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextEquals;

    /**
     * <p>
     * A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     * operations that the grant allows. When certain subsequent operations allowed by the grant include encryption
     * context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the
     * grant does not allow the operation.
     * </p>
     * 
     * @return A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     *         operations that the grant allows. When certain subsequent operations allowed by the grant include
     *         encryption context that matches this list or is a superset of this list, the grant allows the operation.
     *         Otherwise, the grant does not allow the operation.
     */

    public java.util.Map<String, String> getEncryptionContextSubset() {
        if (encryptionContextSubset == null) {
            encryptionContextSubset = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContextSubset;
    }

    /**
     * <p>
     * A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     * operations that the grant allows. When certain subsequent operations allowed by the grant include encryption
     * context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the
     * grant does not allow the operation.
     * </p>
     * 
     * @param encryptionContextSubset
     *        A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     *        operations that the grant allows. When certain subsequent operations allowed by the grant include
     *        encryption context that matches this list or is a superset of this list, the grant allows the operation.
     *        Otherwise, the grant does not allow the operation.
     */

    public void setEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        this.encryptionContextSubset = encryptionContextSubset == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                encryptionContextSubset);
    }

    /**
     * <p>
     * A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     * operations that the grant allows. When certain subsequent operations allowed by the grant include encryption
     * context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the
     * grant does not allow the operation.
     * </p>
     * 
     * @param encryptionContextSubset
     *        A list of key-value pairs, all of which must be present in the encryption context of certain subsequent
     *        operations that the grant allows. When certain subsequent operations allowed by the grant include
     *        encryption context that matches this list or is a superset of this list, the grant allows the operation.
     *        Otherwise, the grant does not allow the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantConstraints withEncryptionContextSubset(java.util.Map<String, String> encryptionContextSubset) {
        setEncryptionContextSubset(encryptionContextSubset);
        return this;
    }

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
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches
     * this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
     * </p>
     * 
     * @return A list of key-value pairs that must be present in the encryption context of certain subsequent operations
     *         that the grant allows. When certain subsequent operations allowed by the grant include encryption context
     *         that matches this list, the grant allows the operation. Otherwise, the grant does not allow the
     *         operation.
     */

    public java.util.Map<String, String> getEncryptionContextEquals() {
        if (encryptionContextEquals == null) {
            encryptionContextEquals = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContextEquals;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches
     * this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
     * </p>
     * 
     * @param encryptionContextEquals
     *        A list of key-value pairs that must be present in the encryption context of certain subsequent operations
     *        that the grant allows. When certain subsequent operations allowed by the grant include encryption context
     *        that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
     */

    public void setEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        this.encryptionContextEquals = encryptionContextEquals == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                encryptionContextEquals);
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that
     * the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches
     * this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
     * </p>
     * 
     * @param encryptionContextEquals
     *        A list of key-value pairs that must be present in the encryption context of certain subsequent operations
     *        that the grant allows. When certain subsequent operations allowed by the grant include encryption context
     *        that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantConstraints withEncryptionContextEquals(java.util.Map<String, String> encryptionContextEquals) {
        setEncryptionContextEquals(encryptionContextEquals);
        return this;
    }

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
