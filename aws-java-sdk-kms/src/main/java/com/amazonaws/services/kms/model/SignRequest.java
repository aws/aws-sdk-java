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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Sign" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     * <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a
     * CMK, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * the message digest.
     * </p>
     * <p>
     * If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
     * </p>
     */
    private java.nio.ByteBuffer message;
    /**
     * <p>
     * Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The default
     * value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;
    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * </p>
     */
    private String signingAlgorithm;

    /**
     * <p>
     * Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     * <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a
     * CMK, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     *        <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code>
     *        of a CMK, use the <a>DescribeKey</a> operation.</p>
     *        <p>
     *        To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an
     *        alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must
     *        use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *        and alias ARN, use <a>ListAliases</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     * <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a
     * CMK, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @return Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     *         <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code>
     *         of a CMK, use the <a>DescribeKey</a> operation.</p>
     *         <p>
     *         To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an
     *         alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must
     *         use the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *         and alias ARN, use <a>ListAliases</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     * <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a
     * CMK, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or
     * alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies an asymmetric CMK. AWS KMS uses the private key in the asymmetric CMK to sign the message. The
     *        <code>KeyUsage</code> type of the CMK must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code>
     *        of a CMK, use the <a>DescribeKey</a> operation.</p>
     *        <p>
     *        To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an
     *        alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must
     *        use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name
     *        and alias ARN, use <a>ListAliases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * the message digest.
     * </p>
     * <p>
     * If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
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
     *        Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message,
     *        provide the message digest.</p>
     *        <p>
     *        If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
     */

    public void setMessage(java.nio.ByteBuffer message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * the message digest.
     * </p>
     * <p>
     * If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message,
     *         provide the message digest.</p>
     *         <p>
     *         If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
     */

    public java.nio.ByteBuffer getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * the message digest.
     * </p>
     * <p>
     * If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
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
     *        Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message,
     *        provide the message digest.</p>
     *        <p>
     *        If you provide a message, AWS KMS generates a hash digest of the message and then signs it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withMessage(java.nio.ByteBuffer message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The default
     * value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * 
     * @param messageType
     *        Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The
     *        default value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The default
     * value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * 
     * @return Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The
     *         default value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The default
     * value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * 
     * @param messageType
     *        Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The
     *        default value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SignRequest withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The default
     * value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * </p>
     * 
     * @param messageType
     *        Tells AWS KMS whether the value of the <code>Message</code> parameter is a message or message digest. The
     *        default value, RAW, indicates a message. To indicate a message digest, enter <code>DIGEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SignRequest withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a>
     *         in the <i>AWS Key Management Service Developer Guide</i>.
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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
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
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withGrantTokens(String... grantTokens) {
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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in
     *        the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * </p>
     * 
     * @param signingAlgorithm
     *        Specifies the signing algorithm to use when signing the message. </p>
     *        <p>
     *        Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * @see SigningAlgorithmSpec
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * </p>
     * 
     * @return Specifies the signing algorithm to use when signing the message. </p>
     *         <p>
     *         Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * @see SigningAlgorithmSpec
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * </p>
     * 
     * @param signingAlgorithm
     *        Specifies the signing algorithm to use when signing the message. </p>
     *        <p>
     *        Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public SignRequest withSigningAlgorithm(String signingAlgorithm) {
        setSigningAlgorithm(signingAlgorithm);
        return this;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * </p>
     * 
     * @param signingAlgorithm
     *        Specifies the signing algorithm to use when signing the message. </p>
     *        <p>
     *        Choose an algorithm that is compatible with the type and size of the specified asymmetric CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public SignRequest withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
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
        if (getMessage() != null)
            sb.append("Message: ").append("***Sensitive Data Redacted***").append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: ").append(getGrantTokens()).append(",");
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

        if (obj instanceof SignRequest == false)
            return false;
        SignRequest other = (SignRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false)
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
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public SignRequest clone() {
        return (SignRequest) super.clone();
    }

}
