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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetParametersForImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForImportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified
     * in the <code>GetParametersForImport</code> request.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     * </p>
     */
    private java.nio.ByteBuffer importToken;
    /**
     * <p>
     * The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     * </p>
     */
    private java.nio.ByteBuffer publicKey;
    /**
     * <p>
     * The time at which the import token and public key are no longer valid. After this time, you cannot use them to
     * make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to
     * get new ones.
     * </p>
     */
    private java.util.Date parametersValidTo;

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified
     * in the <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @param keyId
     *        The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK
     *        specified in the <code>GetParametersForImport</code> request.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified
     * in the <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @return The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK
     *         specified in the <code>GetParametersForImport</code> request.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified
     * in the <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @param keyId
     *        The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK
     *        specified in the <code>GetParametersForImport</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
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
     * @param importToken
     *        The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     */

    public void setImportToken(java.nio.ByteBuffer importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     */

    public java.nio.ByteBuffer getImportToken() {
        return this.importToken;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
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
     * @param importToken
     *        The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withImportToken(java.nio.ByteBuffer importToken) {
        setImportToken(importToken);
        return this;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
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
     *        The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     */

    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     */

    public java.nio.ByteBuffer getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
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
     *        The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withPublicKey(java.nio.ByteBuffer publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid. After this time, you cannot use them to
     * make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to
     * get new ones.
     * </p>
     * 
     * @param parametersValidTo
     *        The time at which the import token and public key are no longer valid. After this time, you cannot use
     *        them to make an <a>ImportKeyMaterial</a> request and you must send another
     *        <code>GetParametersForImport</code> request to get new ones.
     */

    public void setParametersValidTo(java.util.Date parametersValidTo) {
        this.parametersValidTo = parametersValidTo;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid. After this time, you cannot use them to
     * make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to
     * get new ones.
     * </p>
     * 
     * @return The time at which the import token and public key are no longer valid. After this time, you cannot use
     *         them to make an <a>ImportKeyMaterial</a> request and you must send another
     *         <code>GetParametersForImport</code> request to get new ones.
     */

    public java.util.Date getParametersValidTo() {
        return this.parametersValidTo;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid. After this time, you cannot use them to
     * make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to
     * get new ones.
     * </p>
     * 
     * @param parametersValidTo
     *        The time at which the import token and public key are no longer valid. After this time, you cannot use
     *        them to make an <a>ImportKeyMaterial</a> request and you must send another
     *        <code>GetParametersForImport</code> request to get new ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportResult withParametersValidTo(java.util.Date parametersValidTo) {
        setParametersValidTo(parametersValidTo);
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
        if (getImportToken() != null)
            sb.append("ImportToken: ").append(getImportToken()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getParametersValidTo() != null)
            sb.append("ParametersValidTo: ").append(getParametersValidTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportResult == false)
            return false;
        GetParametersForImportResult other = (GetParametersForImportResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null && other.getImportToken().equals(this.getImportToken()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getParametersValidTo() == null ^ this.getParametersValidTo() == null)
            return false;
        if (other.getParametersValidTo() != null && other.getParametersValidTo().equals(this.getParametersValidTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getParametersValidTo() == null) ? 0 : getParametersValidTo().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForImportResult clone() {
        try {
            return (GetParametersForImportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
