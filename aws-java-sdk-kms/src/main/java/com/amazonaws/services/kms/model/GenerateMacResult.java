/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateMac" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateMacResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS key, and
     * MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     */
    private java.nio.ByteBuffer mac;
    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     */
    private String macAlgorithm;
    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS key, and
     * MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
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
     * @param mac
     *        The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS
     *        key, and MAC algorithm.</p>
     *        <p>
     *        This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *        2104</a>.
     */

    public void setMac(java.nio.ByteBuffer mac) {
        this.mac = mac;
    }

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS key, and
     * MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS
     *         key, and MAC algorithm.</p>
     *         <p>
     *         This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *         2104</a>.
     */

    public java.nio.ByteBuffer getMac() {
        return this.mac;
    }

    /**
     * <p>
     * The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS key, and
     * MAC algorithm.
     * </p>
     * <p>
     * This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
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
     * @param mac
     *        The hash-based message authentication code (HMAC) that was generated for the specified message, HMAC KMS
     *        key, and MAC algorithm.</p>
     *        <p>
     *        This is the standard, raw HMAC defined in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC
     *        2104</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacResult withMac(java.nio.ByteBuffer mac) {
        setMac(mac);
        return this;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm that was used to generate the HMAC.
     * @see MacAlgorithmSpec
     */

    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * 
     * @return The MAC algorithm that was used to generate the HMAC.
     * @see MacAlgorithmSpec
     */

    public String getMacAlgorithm() {
        return this.macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm that was used to generate the HMAC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithmSpec
     */

    public GenerateMacResult withMacAlgorithm(String macAlgorithm) {
        setMacAlgorithm(macAlgorithm);
        return this;
    }

    /**
     * <p>
     * The MAC algorithm that was used to generate the HMAC.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm that was used to generate the HMAC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithmSpec
     */

    public GenerateMacResult withMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * 
     * @param keyId
     *        The HMAC KMS key used in the operation.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * 
     * @return The HMAC KMS key used in the operation.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the operation.
     * </p>
     * 
     * @param keyId
     *        The HMAC KMS key used in the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacResult withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getMac() != null)
            sb.append("Mac: ").append(getMac()).append(",");
        if (getMacAlgorithm() != null)
            sb.append("MacAlgorithm: ").append(getMacAlgorithm()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateMacResult == false)
            return false;
        GenerateMacResult other = (GenerateMacResult) obj;
        if (other.getMac() == null ^ this.getMac() == null)
            return false;
        if (other.getMac() != null && other.getMac().equals(this.getMac()) == false)
            return false;
        if (other.getMacAlgorithm() == null ^ this.getMacAlgorithm() == null)
            return false;
        if (other.getMacAlgorithm() != null && other.getMacAlgorithm().equals(this.getMacAlgorithm()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMac() == null) ? 0 : getMac().hashCode());
        hashCode = prime * hashCode + ((getMacAlgorithm() == null) ? 0 : getMacAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public GenerateMacResult clone() {
        try {
            return (GenerateMacResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
