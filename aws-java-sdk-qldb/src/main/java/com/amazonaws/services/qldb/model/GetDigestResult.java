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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetDigest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDigestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
     * </p>
     */
    private java.nio.ByteBuffer digest;
    /**
     * <p>
     * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that
     * has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     */
    private ValueHolder digestTipAddress;

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
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
     * @param digest
     *        The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
     */

    public void setDigest(java.nio.ByteBuffer digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
     */

    public java.nio.ByteBuffer getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
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
     * @param digest
     *        The 256-bit hash value representing the digest returned by a <code>GetDigest</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDigestResult withDigest(java.nio.ByteBuffer digest) {
        setDigest(digest);
        return this;
    }

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that
     * has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * 
     * @param digestTipAddress
     *        The latest block location covered by the digest that you requested. An address is an Amazon Ion structure
     *        that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     */

    public void setDigestTipAddress(ValueHolder digestTipAddress) {
        this.digestTipAddress = digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that
     * has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * 
     * @return The latest block location covered by the digest that you requested. An address is an Amazon Ion structure
     *         that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     */

    public ValueHolder getDigestTipAddress() {
        return this.digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that
     * has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * 
     * @param digestTipAddress
     *        The latest block location covered by the digest that you requested. An address is an Amazon Ion structure
     *        that has two fields: <code>strandId</code> and <code>sequenceNo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDigestResult withDigestTipAddress(ValueHolder digestTipAddress) {
        setDigestTipAddress(digestTipAddress);
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
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest()).append(",");
        if (getDigestTipAddress() != null)
            sb.append("DigestTipAddress: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDigestResult == false)
            return false;
        GetDigestResult other = (GetDigestResult) obj;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getDigestTipAddress() == null ^ this.getDigestTipAddress() == null)
            return false;
        if (other.getDigestTipAddress() != null && other.getDigestTipAddress().equals(this.getDigestTipAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode + ((getDigestTipAddress() == null) ? 0 : getDigestTipAddress().hashCode());
        return hashCode;
    }

    @Override
    public GetDigestResult clone() {
        try {
            return (GetDigestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
