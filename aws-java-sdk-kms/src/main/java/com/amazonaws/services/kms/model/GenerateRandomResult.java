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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateRandom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateRandomResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field is null
     * or empty.
     * </p>
     */
    private java.nio.ByteBuffer plaintext;
    /**
     * <p>
     * The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be decrypted
     * only by using a private key in the Nitro enclave.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private java.nio.ByteBuffer ciphertextForRecipient;

    /**
     * <p>
     * The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field is null
     * or empty.
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
     *        The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is
     *        Base64-encoded. Otherwise, it is not Base64-encoded.</p>
     *        <p>
     *        If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field
     *        is null or empty.
     */

    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * <p>
     * The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field is null
     * or empty.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is
     *         Base64-encoded. Otherwise, it is not Base64-encoded.</p>
     *         <p>
     *         If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field
     *         is null or empty.
     */

    public java.nio.ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    /**
     * <p>
     * The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded.
     * Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field is null
     * or empty.
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
     *        The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is
     *        Base64-encoded. Otherwise, it is not Base64-encoded.</p>
     *        <p>
     *        If the response includes the <code>CiphertextForRecipient</code> field, the <code>Plaintext</code> field
     *        is null or empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomResult withPlaintext(java.nio.ByteBuffer plaintext) {
        setPlaintext(plaintext);
        return this;
    }

    /**
     * <p>
     * The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be decrypted
     * only by using a private key in the Nitro enclave.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
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
     * @param ciphertextForRecipient
     *        The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be
     *        decrypted only by using a private key in the Nitro enclave. </p>
     *        <p>
     *        This field is included in the response only when the <code>Recipient</code> parameter in the request
     *        includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about the
     *        interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setCiphertextForRecipient(java.nio.ByteBuffer ciphertextForRecipient) {
        this.ciphertextForRecipient = ciphertextForRecipient;
    }

    /**
     * <p>
     * The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be decrypted
     * only by using a private key in the Nitro enclave.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be
     *         decrypted only by using a private key in the Nitro enclave. </p>
     *         <p>
     *         This field is included in the response only when the <code>Recipient</code> parameter in the request
     *         includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about
     *         the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *         Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public java.nio.ByteBuffer getCiphertextForRecipient() {
        return this.ciphertextForRecipient;
    }

    /**
     * <p>
     * The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be decrypted
     * only by using a private key in the Nitro enclave.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
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
     * @param ciphertextForRecipient
     *        The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can be
     *        decrypted only by using a private key in the Nitro enclave. </p>
     *        <p>
     *        This field is included in the response only when the <code>Recipient</code> parameter in the request
     *        includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about the
     *        interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomResult withCiphertextForRecipient(java.nio.ByteBuffer ciphertextForRecipient) {
        setCiphertextForRecipient(ciphertextForRecipient);
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
        if (getPlaintext() != null)
            sb.append("Plaintext: ").append("***Sensitive Data Redacted***").append(",");
        if (getCiphertextForRecipient() != null)
            sb.append("CiphertextForRecipient: ").append(getCiphertextForRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomResult == false)
            return false;
        GenerateRandomResult other = (GenerateRandomResult) obj;
        if (other.getPlaintext() == null ^ this.getPlaintext() == null)
            return false;
        if (other.getPlaintext() != null && other.getPlaintext().equals(this.getPlaintext()) == false)
            return false;
        if (other.getCiphertextForRecipient() == null ^ this.getCiphertextForRecipient() == null)
            return false;
        if (other.getCiphertextForRecipient() != null && other.getCiphertextForRecipient().equals(this.getCiphertextForRecipient()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode());
        hashCode = prime * hashCode + ((getCiphertextForRecipient() == null) ? 0 : getCiphertextForRecipient().hashCode());
        return hashCode;
    }

    @Override
    public GenerateRandomResult clone() {
        try {
            return (GenerateRandomResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
