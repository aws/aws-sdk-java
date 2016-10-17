/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ReEncryptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Ciphertext of the data to re-encrypt.
     * </p>
     */
    private java.nio.ByteBuffer ciphertextBlob;
    /**
     * <p>
     * Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code> parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> sourceEncryptionContext;
    /**
     * <p>
     * A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     */
    private String destinationKeyId;
    /**
     * <p>
     * Encryption context to be used when the data is re-encrypted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> destinationEncryptionContext;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;

    /**
     * <p>
     * Ciphertext of the data to re-encrypt.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param ciphertextBlob
     *        Ciphertext of the data to re-encrypt.
     */

    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext of the data to re-encrypt.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Ciphertext of the data to re-encrypt.
     */

    public java.nio.ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext of the data to re-encrypt.
     * </p>
     * 
     * @param ciphertextBlob
     *        Ciphertext of the data to re-encrypt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        setCiphertextBlob(ciphertextBlob);
        return this;
    }

    /**
     * <p>
     * Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code> parameter.
     * </p>
     * 
     * @return Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code>
     *         parameter.
     */

    public java.util.Map<String, String> getSourceEncryptionContext() {
        if (sourceEncryptionContext == null) {
            sourceEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return sourceEncryptionContext;
    }

    /**
     * <p>
     * Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code> parameter.
     * </p>
     * 
     * @param sourceEncryptionContext
     *        Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code>
     *        parameter.
     */

    public void setSourceEncryptionContext(java.util.Map<String, String> sourceEncryptionContext) {
        this.sourceEncryptionContext = sourceEncryptionContext == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                sourceEncryptionContext);
    }

    /**
     * <p>
     * Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code> parameter.
     * </p>
     * 
     * @param sourceEncryptionContext
     *        Encryption context used to encrypt and decrypt the data specified in the <code>CiphertextBlob</code>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest withSourceEncryptionContext(java.util.Map<String, String> sourceEncryptionContext) {
        setSourceEncryptionContext(sourceEncryptionContext);
        return this;
    }

    public ReEncryptRequest addSourceEncryptionContextEntry(String key, String value) {
        if (null == this.sourceEncryptionContext) {
            this.sourceEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.sourceEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sourceEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SourceEncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest clearSourceEncryptionContextEntries() {
        this.sourceEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationKeyId
     *        A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally
     *        unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by
     *        "alias/".</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias Name Example - alias/MyAliasName
     *        </p>
     *        </li>
     */

    public void setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * 
     * @return A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally
     *         unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by
     *         "alias/".</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias Name Example - alias/MyAliasName
     *         </p>
     *         </li>
     */

    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally unique
     * identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias Name Example - alias/MyAliasName
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationKeyId
     *        A unique identifier for the customer master key used to re-encrypt the data. This value can be a globally
     *        unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by
     *        "alias/".</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ARN Example - arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN Example - arn:aws:kms:us-east-1:123456789012:alias/MyAliasName
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias Name Example - alias/MyAliasName
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest withDestinationKeyId(String destinationKeyId) {
        setDestinationKeyId(destinationKeyId);
        return this;
    }

    /**
     * <p>
     * Encryption context to be used when the data is re-encrypted.
     * </p>
     * 
     * @return Encryption context to be used when the data is re-encrypted.
     */

    public java.util.Map<String, String> getDestinationEncryptionContext() {
        if (destinationEncryptionContext == null) {
            destinationEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return destinationEncryptionContext;
    }

    /**
     * <p>
     * Encryption context to be used when the data is re-encrypted.
     * </p>
     * 
     * @param destinationEncryptionContext
     *        Encryption context to be used when the data is re-encrypted.
     */

    public void setDestinationEncryptionContext(java.util.Map<String, String> destinationEncryptionContext) {
        this.destinationEncryptionContext = destinationEncryptionContext == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                destinationEncryptionContext);
    }

    /**
     * <p>
     * Encryption context to be used when the data is re-encrypted.
     * </p>
     * 
     * @param destinationEncryptionContext
     *        Encryption context to be used when the data is re-encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest withDestinationEncryptionContext(java.util.Map<String, String> destinationEncryptionContext) {
        setDestinationEncryptionContext(destinationEncryptionContext);
        return this;
    }

    public ReEncryptRequest addDestinationEncryptionContextEntry(String key, String value) {
        if (null == this.destinationEncryptionContext) {
            this.destinationEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.destinationEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.destinationEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DestinationEncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest clearDestinationEncryptionContextEntries() {
        this.destinationEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     */

    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
            grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new com.amazonaws.internal.SdkInternalList<String>(grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantTokens(java.util.Collection)} or {@link #withGrantTokens(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest withGrantTokens(String... grantTokens) {
        if (this.grantTokens == null) {
            setGrantTokens(new com.amazonaws.internal.SdkInternalList<String>(grantTokens.length));
        }
        for (String ele : grantTokens) {
            this.grantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCiphertextBlob() != null)
            sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        if (getSourceEncryptionContext() != null)
            sb.append("SourceEncryptionContext: " + getSourceEncryptionContext() + ",");
        if (getDestinationKeyId() != null)
            sb.append("DestinationKeyId: " + getDestinationKeyId() + ",");
        if (getDestinationEncryptionContext() != null)
            sb.append("DestinationEncryptionContext: " + getDestinationEncryptionContext() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReEncryptRequest == false)
            return false;
        ReEncryptRequest other = (ReEncryptRequest) obj;
        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null)
            return false;
        if (other.getCiphertextBlob() != null && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false)
            return false;
        if (other.getSourceEncryptionContext() == null ^ this.getSourceEncryptionContext() == null)
            return false;
        if (other.getSourceEncryptionContext() != null && other.getSourceEncryptionContext().equals(this.getSourceEncryptionContext()) == false)
            return false;
        if (other.getDestinationKeyId() == null ^ this.getDestinationKeyId() == null)
            return false;
        if (other.getDestinationKeyId() != null && other.getDestinationKeyId().equals(this.getDestinationKeyId()) == false)
            return false;
        if (other.getDestinationEncryptionContext() == null ^ this.getDestinationEncryptionContext() == null)
            return false;
        if (other.getDestinationEncryptionContext() != null && other.getDestinationEncryptionContext().equals(this.getDestinationEncryptionContext()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode());
        hashCode = prime * hashCode + ((getSourceEncryptionContext() == null) ? 0 : getSourceEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getDestinationKeyId() == null) ? 0 : getDestinationKeyId().hashCode());
        hashCode = prime * hashCode + ((getDestinationEncryptionContext() == null) ? 0 : getDestinationEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public ReEncryptRequest clone() {
        return (ReEncryptRequest) super.clone();
    }
}
