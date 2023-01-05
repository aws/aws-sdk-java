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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateMac" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateMacRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     * generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
     * </p>
     */
    private java.nio.ByteBuffer message;
    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key as
     * described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field in the
     * response.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that your
     * HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field in the
     * <code>DescribeKey</code> response.
     * </p>
     */
    private String macAlgorithm;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;

    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     * generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
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
     * @param message
     *        The message to be hashed. Specify a message of up to 4,096 bytes. </p>
     *        <p>
     *        <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     *        generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
     */

    public void setMessage(java.nio.ByteBuffer message) {
        this.message = message;
    }

    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     * generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The message to be hashed. Specify a message of up to 4,096 bytes. </p>
     *         <p>
     *         <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     *         generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
     */

    public java.nio.ByteBuffer getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message to be hashed. Specify a message of up to 4,096 bytes.
     * </p>
     * <p>
     * <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     * generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
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
     * @param message
     *        The message to be hashed. Specify a message of up to 4,096 bytes. </p>
     *        <p>
     *        <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling for message digests. If you
     *        generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withMessage(java.nio.ByteBuffer message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key as
     * described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field in the
     * response.
     * </p>
     * 
     * @param keyId
     *        The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key
     *        as described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.</p>
     *        <p>
     *        To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field
     *        in the response.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key as
     * described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field in the
     * response.
     * </p>
     * 
     * @return The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key
     *         as described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.</p>
     *         <p>
     *         To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field
     *         in the response.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key as
     * described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field in the
     * response.
     * </p>
     * 
     * @param keyId
     *        The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key
     *        as described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.</p>
     *        <p>
     *        To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the <code>KeySpec</code> field
     *        in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that your
     * HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field in the
     * <code>DescribeKey</code> response.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm used in the operation.</p>
     *        <p>
     *        The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that
     *        your HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code>
     *        field in the <code>DescribeKey</code> response.
     * @see MacAlgorithmSpec
     */

    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that your
     * HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field in the
     * <code>DescribeKey</code> response.
     * </p>
     * 
     * @return The MAC algorithm used in the operation.</p>
     *         <p>
     *         The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that
     *         your HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code>
     *         field in the <code>DescribeKey</code> response.
     * @see MacAlgorithmSpec
     */

    public String getMacAlgorithm() {
        return this.macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that your
     * HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field in the
     * <code>DescribeKey</code> response.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm used in the operation.</p>
     *        <p>
     *        The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that
     *        your HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code>
     *        field in the <code>DescribeKey</code> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithmSpec
     */

    public GenerateMacRequest withMacAlgorithm(String macAlgorithm) {
        setMacAlgorithm(macAlgorithm);
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the operation.
     * </p>
     * <p>
     * The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that your
     * HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code> field in the
     * <code>DescribeKey</code> response.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm used in the operation.</p>
     *        <p>
     *        The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that
     *        your HMAC KMS key supports, use the <a>DescribeKey</a> operation and see the <code>MacAlgorithms</code>
     *        field in the <code>DescribeKey</code> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithmSpec
     */

    public GenerateMacRequest withMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *         achieved <i>eventual consistency</i>. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *         <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *         a grant token</a> in the <i>Key Management Service Developer Guide</i>.
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
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *        achieved <i>eventual consistency</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *        a grant token</a> in the <i>Key Management Service Developer Guide</i>.
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
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
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
     *        Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *        achieved <i>eventual consistency</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *        a grant token</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withGrantTokens(String... grantTokens) {
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
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *        achieved <i>eventual consistency</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *        a grant token</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
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
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***").append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getMacAlgorithm() != null)
            sb.append("MacAlgorithm: ").append(getMacAlgorithm()).append(",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: ").append(getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateMacRequest == false)
            return false;
        GenerateMacRequest other = (GenerateMacRequest) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getMacAlgorithm() == null ^ this.getMacAlgorithm() == null)
            return false;
        if (other.getMacAlgorithm() != null && other.getMacAlgorithm().equals(this.getMacAlgorithm()) == false)
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

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getMacAlgorithm() == null) ? 0 : getMacAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public GenerateMacRequest clone() {
        return (GenerateMacRequest) super.clone();
    }

}
