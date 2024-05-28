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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the party that receives the response from the API operation.
 * </p>
 * <p>
 * This data type is designed to support Amazon Web Services Nitro Enclaves, which lets you create an isolated compute
 * environment in Amazon EC2. For information about the interaction between KMS and Amazon Web Services Nitro Enclaves,
 * see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
 * Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RecipientInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipientInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to
     * encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     */
    private String keyEncryptionAlgorithm;
    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's public
     * key.
     * </p>
     */
    private java.nio.ByteBuffer attestationDocument;

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to
     * encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * 
     * @param keyEncryptionAlgorithm
     *        The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave
     *        to encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * @see KeyEncryptionMechanism
     */

    public void setKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to
     * encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * 
     * @return The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave
     *         to encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * @see KeyEncryptionMechanism
     */

    public String getKeyEncryptionAlgorithm() {
        return this.keyEncryptionAlgorithm;
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to
     * encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * 
     * @param keyEncryptionAlgorithm
     *        The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave
     *        to encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyEncryptionMechanism
     */

    public RecipientInfo withKeyEncryptionAlgorithm(String keyEncryptionAlgorithm) {
        setKeyEncryptionAlgorithm(keyEncryptionAlgorithm);
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to
     * encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * 
     * @param keyEncryptionAlgorithm
     *        The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave
     *        to encrypt plaintext values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyEncryptionMechanism
     */

    public RecipientInfo withKeyEncryptionAlgorithm(KeyEncryptionMechanism keyEncryptionAlgorithm) {
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's public
     * key.
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
     * @param attestationDocument
     *        The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's
     *        public key.
     */

    public void setAttestationDocument(java.nio.ByteBuffer attestationDocument) {
        this.attestationDocument = attestationDocument;
    }

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's public
     * key.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's
     *         public key.
     */

    public java.nio.ByteBuffer getAttestationDocument() {
        return this.attestationDocument;
    }

    /**
     * <p>
     * The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's public
     * key.
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
     * @param attestationDocument
     *        The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's
     *        public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipientInfo withAttestationDocument(java.nio.ByteBuffer attestationDocument) {
        setAttestationDocument(attestationDocument);
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
        if (getKeyEncryptionAlgorithm() != null)
            sb.append("KeyEncryptionAlgorithm: ").append(getKeyEncryptionAlgorithm()).append(",");
        if (getAttestationDocument() != null)
            sb.append("AttestationDocument: ").append(getAttestationDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipientInfo == false)
            return false;
        RecipientInfo other = (RecipientInfo) obj;
        if (other.getKeyEncryptionAlgorithm() == null ^ this.getKeyEncryptionAlgorithm() == null)
            return false;
        if (other.getKeyEncryptionAlgorithm() != null && other.getKeyEncryptionAlgorithm().equals(this.getKeyEncryptionAlgorithm()) == false)
            return false;
        if (other.getAttestationDocument() == null ^ this.getAttestationDocument() == null)
            return false;
        if (other.getAttestationDocument() != null && other.getAttestationDocument().equals(this.getAttestationDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyEncryptionAlgorithm() == null) ? 0 : getKeyEncryptionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getAttestationDocument() == null) ? 0 : getAttestationDocument().hashCode());
        return hashCode;
    }

    @Override
    public RecipientInfo clone() {
        try {
            return (RecipientInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.RecipientInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
