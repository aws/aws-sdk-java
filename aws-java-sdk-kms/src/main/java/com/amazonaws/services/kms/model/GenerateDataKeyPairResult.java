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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateDataKeyPairResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer privateKeyCiphertextBlob;
    /**
     * <p>
     * The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer privateKeyPlaintext;
    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     */
    private java.nio.ByteBuffer publicKey;
    /**
     * <p>
     * The identifier of the CMK that encrypted the private key.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     */
    private String keyPairSpec;

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param privateKeyCiphertextBlob
     *        The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is
     *        Base64-encoded. Otherwise, it is not Base64-encoded.
     */

    public void setPrivateKeyCiphertextBlob(java.nio.ByteBuffer privateKeyCiphertextBlob) {
        this.privateKeyCiphertextBlob = privateKeyCiphertextBlob;
    }

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is
     *         Base64-encoded. Otherwise, it is not Base64-encoded.
     */

    public java.nio.ByteBuffer getPrivateKeyCiphertextBlob() {
        return this.privateKeyCiphertextBlob;
    }

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param privateKeyCiphertextBlob
     *        The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is
     *        Base64-encoded. Otherwise, it is not Base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyPairResult withPrivateKeyCiphertextBlob(java.nio.ByteBuffer privateKeyCiphertextBlob) {
        setPrivateKeyCiphertextBlob(privateKeyCiphertextBlob);
        return this;
    }

    /**
     * <p>
     * The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param privateKeyPlaintext
     *        The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is
     *        Base64-encoded. Otherwise, it is not Base64-encoded.
     */

    public void setPrivateKeyPlaintext(java.nio.ByteBuffer privateKeyPlaintext) {
        this.privateKeyPlaintext = privateKeyPlaintext;
    }

    /**
     * <p>
     * The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is
     *         Base64-encoded. Otherwise, it is not Base64-encoded.
     */

    public java.nio.ByteBuffer getPrivateKeyPlaintext() {
        return this.privateKeyPlaintext;
    }

    /**
     * <p>
     * The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param privateKeyPlaintext
     *        The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is
     *        Base64-encoded. Otherwise, it is not Base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyPairResult withPrivateKeyPlaintext(java.nio.ByteBuffer privateKeyPlaintext) {
        setPrivateKeyPlaintext(privateKeyPlaintext);
        return this;
    }

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param publicKey
     *        The public key (in plaintext).
     */

    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The public key (in plaintext).
     */

    public java.nio.ByteBuffer getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key (in plaintext).
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param publicKey
     *        The public key (in plaintext).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyPairResult withPublicKey(java.nio.ByteBuffer publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The identifier of the CMK that encrypted the private key.
     * </p>
     * 
     * @param keyId
     *        The identifier of the CMK that encrypted the private key.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK that encrypted the private key.
     * </p>
     * 
     * @return The identifier of the CMK that encrypted the private key.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the CMK that encrypted the private key.
     * </p>
     * 
     * @param keyId
     *        The identifier of the CMK that encrypted the private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyPairResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * 
     * @param keyPairSpec
     *        The type of data key pair that was generated.
     * @see DataKeyPairSpec
     */

    public void setKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * 
     * @return The type of data key pair that was generated.
     * @see DataKeyPairSpec
     */

    public String getKeyPairSpec() {
        return this.keyPairSpec;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * 
     * @param keyPairSpec
     *        The type of data key pair that was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataKeyPairSpec
     */

    public GenerateDataKeyPairResult withKeyPairSpec(String keyPairSpec) {
        setKeyPairSpec(keyPairSpec);
        return this;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * 
     * @param keyPairSpec
     *        The type of data key pair that was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataKeyPairSpec
     */

    public GenerateDataKeyPairResult withKeyPairSpec(DataKeyPairSpec keyPairSpec) {
        this.keyPairSpec = keyPairSpec.toString();
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
        if (getPrivateKeyCiphertextBlob() != null)
            sb.append("PrivateKeyCiphertextBlob: ").append(getPrivateKeyCiphertextBlob()).append(",");
        if (getPrivateKeyPlaintext() != null)
            sb.append("PrivateKeyPlaintext: ").append("***Sensitive Data Redacted***").append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getKeyPairSpec() != null)
            sb.append("KeyPairSpec: ").append(getKeyPairSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataKeyPairResult == false)
            return false;
        GenerateDataKeyPairResult other = (GenerateDataKeyPairResult) obj;
        if (other.getPrivateKeyCiphertextBlob() == null ^ this.getPrivateKeyCiphertextBlob() == null)
            return false;
        if (other.getPrivateKeyCiphertextBlob() != null && other.getPrivateKeyCiphertextBlob().equals(this.getPrivateKeyCiphertextBlob()) == false)
            return false;
        if (other.getPrivateKeyPlaintext() == null ^ this.getPrivateKeyPlaintext() == null)
            return false;
        if (other.getPrivateKeyPlaintext() != null && other.getPrivateKeyPlaintext().equals(this.getPrivateKeyPlaintext()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyPairSpec() == null ^ this.getKeyPairSpec() == null)
            return false;
        if (other.getKeyPairSpec() != null && other.getKeyPairSpec().equals(this.getKeyPairSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrivateKeyCiphertextBlob() == null) ? 0 : getPrivateKeyCiphertextBlob().hashCode());
        hashCode = prime * hashCode + ((getPrivateKeyPlaintext() == null) ? 0 : getPrivateKeyPlaintext().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyPairSpec() == null) ? 0 : getKeyPairSpec().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataKeyPairResult clone() {
        try {
            return (GenerateDataKeyPairResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
