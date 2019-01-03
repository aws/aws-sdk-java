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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Decrypt" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecryptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the
     * operation.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it
     * is not encoded.
     * </p>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the
     * operation.
     * </p>
     * 
     * @param keyId
     *        ARN of the key used to perform the decryption. This value is returned if no errors are encountered during
     *        the operation.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the
     * operation.
     * </p>
     * 
     * @return ARN of the key used to perform the decryption. This value is returned if no errors are encountered during
     *         the operation.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the
     * operation.
     * </p>
     * 
     * @param keyId
     *        ARN of the key used to perform the decryption. This value is returned if no errors are encountered during
     *        the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it
     * is not encoded.
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
     * @param plaintext
     *        Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded.
     *        Otherwise, it is not encoded.
     */

    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it
     * is not encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded.
     *         Otherwise, it is not encoded.
     */

    public java.nio.ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    /**
     * <p>
     * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it
     * is not encoded.
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
     * @param plaintext
     *        Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded.
     *        Otherwise, it is not encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptResult withPlaintext(java.nio.ByteBuffer plaintext) {
        setPlaintext(plaintext);
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getPlaintext() != null)
            sb.append("Plaintext: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecryptResult == false)
            return false;
        DecryptResult other = (DecryptResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPlaintext() == null ^ this.getPlaintext() == null)
            return false;
        if (other.getPlaintext() != null && other.getPlaintext().equals(this.getPlaintext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode());
        return hashCode;
    }

    @Override
    public DecryptResult clone() {
        try {
            return (DecryptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
