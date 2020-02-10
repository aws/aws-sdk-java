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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Sign" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     * href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code> signing
     * algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most commonly
     * used signature format and is appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer signature;
    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     */
    private String signingAlgorithm;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     * </p>
     * 
     * @param keyId
     *        The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     * </p>
     * 
     * @param keyId
     *        The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     * href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code> signing
     * algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most commonly
     * used signature format and is appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
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
     * @param signature
     *        The cryptographic signature that was generated for the message. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     *        href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code>
     *        signing algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     *        href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most
     *        commonly used signature format and is appropriate for most uses.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not
     *        Base64-encoded.
     */

    public void setSignature(java.nio.ByteBuffer signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     * href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code> signing
     * algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most commonly
     * used signature format and is appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The cryptographic signature that was generated for the message. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     *         href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code>
     *         signing algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     *         href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most
     *         commonly used signature format and is appropriate for most uses.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not
     *         Base64-encoded.
     */

    public java.nio.ByteBuffer getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * The cryptographic signature that was generated for the message.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     * href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code> signing
     * algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     * href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most commonly
     * used signature format and is appropriate for most uses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
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
     * @param signature
     *        The cryptographic signature that was generated for the message. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When used with the supported RSA signing algorithms, the encoding of this value is defined by <a
     *        href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC 8017</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or <code>ECDSA_SHA_512</code>
     *        signing algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and <a
     *        href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>. This is the most
     *        commonly used signature format and is appropriate for most uses.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not
     *        Base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignResult withSignature(java.nio.ByteBuffer signature) {
        setSignature(signature);
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * 
     * @param signingAlgorithm
     *        The signing algorithm that was used to sign the message.
     * @see SigningAlgorithmSpec
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * 
     * @return The signing algorithm that was used to sign the message.
     * @see SigningAlgorithmSpec
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * 
     * @param signingAlgorithm
     *        The signing algorithm that was used to sign the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public SignResult withSigningAlgorithm(String signingAlgorithm) {
        setSigningAlgorithm(signingAlgorithm);
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to sign the message.
     * </p>
     * 
     * @param signingAlgorithm
     *        The signing algorithm that was used to sign the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public SignResult withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
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
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignResult == false)
            return false;
        SignResult other = (SignResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public SignResult clone() {
        try {
            return (SignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
