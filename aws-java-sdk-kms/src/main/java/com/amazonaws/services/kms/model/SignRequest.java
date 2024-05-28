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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Sign" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message. The
     * <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of
     * a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
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
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent the
     * digest from being hashed again while signing.
     * </p>
     */
    private java.nio.ByteBuffer message;
    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     * algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm, which
     * begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in the signing
     * algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message digest.
     * If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing operation can be
     * compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code> value
     * must match the length of hashed messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the digest
     * is hashed again while signing. However, this can cause verification failures when verifying with a system that
     * assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String messageType;
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
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When signing
     * with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     */
    private String signingAlgorithm;
    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message. The
     * <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of
     * a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
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
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message.
     *        The <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the
     *        <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.</p>
     *        <p>
     *        To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *        it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must
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
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias
     *        name and alias ARN, use <a>ListAliases</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message. The
     * <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of
     * a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
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
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @return Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message.
     *         The <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the
     *         <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.</p>
     *         <p>
     *         To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *         it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must
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
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias
     *         name and alias ARN, use <a>ListAliases</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message. The
     * <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of
     * a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
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
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies an asymmetric KMS key. KMS uses the private key in the asymmetric KMS key to sign the message.
     *        The <code>KeyUsage</code> type of the KMS key must be <code>SIGN_VERIFY</code>. To find the
     *        <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.</p>
     *        <p>
     *        To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *        it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must
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
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias
     *        name and alias ARN, use <a>ListAliases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent the
     * digest from being hashed again while signing.
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
     *        provide a message digest.</p>
     *        <p>
     *        If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent
     *        the digest from being hashed again while signing.
     */

    public void setMessage(java.nio.ByteBuffer message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent the
     * digest from being hashed again while signing.
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
     *         provide a message digest.</p>
     *         <p>
     *         If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent
     *         the digest from being hashed again while signing.
     */

    public java.nio.ByteBuffer getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Specifies the message or message digest to sign. Messages can be 0-4096 bytes. To sign a larger message, provide
     * a message digest.
     * </p>
     * <p>
     * If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent the
     * digest from being hashed again while signing.
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
     *        provide a message digest.</p>
     *        <p>
     *        If you provide a message digest, use the <code>DIGEST</code> value of <code>MessageType</code> to prevent
     *        the digest from being hashed again while signing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withMessage(java.nio.ByteBuffer message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     * algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm, which
     * begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in the signing
     * algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message digest.
     * If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing operation can be
     * compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code> value
     * must match the length of hashed messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the digest
     * is hashed again while signing. However, this can cause verification failures when verifying with a system that
     * assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageType
     *        Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     *        algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which
     *        are already hashed.</p>
     *        <p>
     *        When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm,
     *        which begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in
     *        the signing algorithm.
     *        </p>
     *        <important>
     *        <p>
     *        Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message
     *        digest. If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing
     *        operation can be compromised.
     *        </p>
     *        </important>
     *        <p>
     *        When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code>
     *        value must match the length of hashed messages for the specified signing algorithm.
     *        </p>
     *        <p>
     *        You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the
     *        digest is hashed again while signing. However, this can cause verification failures when verifying with a
     *        system that assumes a single hash.
     *        </p>
     *        <p>
     *        The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *        >Offline verification with SM2 key pairs</a>.
     *        </p>
     *        </li>
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     * algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm, which
     * begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in the signing
     * algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message digest.
     * If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing operation can be
     * compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code> value
     * must match the length of hashed messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the digest
     * is hashed again while signing. However, this can cause verification failures when verifying with a system that
     * assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     *         algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which
     *         are already hashed.</p>
     *         <p>
     *         When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm,
     *         which begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in
     *         the signing algorithm.
     *         </p>
     *         <important>
     *         <p>
     *         Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message
     *         digest. If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing
     *         operation can be compromised.
     *         </p>
     *         </important>
     *         <p>
     *         When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code>
     *         value must match the length of hashed messages for the specified signing algorithm.
     *         </p>
     *         <p>
     *         You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the
     *         digest is hashed again while signing. However, this can cause verification failures when verifying with a
     *         system that assumes a single hash.
     *         </p>
     *         <p>
     *         The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *         >Offline verification with SM2 key pairs</a>.
     *         </p>
     *         </li>
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     * algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm, which
     * begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in the signing
     * algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message digest.
     * If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing operation can be
     * compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code> value
     * must match the length of hashed messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the digest
     * is hashed again while signing. However, this can cause verification failures when verifying with a system that
     * assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageType
     *        Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     *        algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which
     *        are already hashed.</p>
     *        <p>
     *        When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm,
     *        which begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in
     *        the signing algorithm.
     *        </p>
     *        <important>
     *        <p>
     *        Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message
     *        digest. If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing
     *        operation can be compromised.
     *        </p>
     *        </important>
     *        <p>
     *        When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code>
     *        value must match the length of hashed messages for the specified signing algorithm.
     *        </p>
     *        <p>
     *        You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the
     *        digest is hashed again while signing. However, this can cause verification failures when verifying with a
     *        system that assumes a single hash.
     *        </p>
     *        <p>
     *        The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *        >Offline verification with SM2 key pairs</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SignRequest withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     * algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which are
     * already hashed.
     * </p>
     * <p>
     * When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm, which
     * begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in the signing
     * algorithm.
     * </p>
     * <important>
     * <p>
     * Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message digest.
     * If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing operation can be
     * compromised.
     * </p>
     * </important>
     * <p>
     * When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code> value
     * must match the length of hashed messages for the specified signing algorithm.
     * </p>
     * <p>
     * You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the digest
     * is hashed again while signing. However, this can cause verification failures when verifying with a system that
     * assumes a single hash.
     * </p>
     * <p>
     * The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param messageType
     *        Tells KMS whether the value of the <code>Message</code> parameter should be hashed as part of the signing
     *        algorithm. Use <code>RAW</code> for unhashed messages; use <code>DIGEST</code> for message digests, which
     *        are already hashed.</p>
     *        <p>
     *        When the value of <code>MessageType</code> is <code>RAW</code>, KMS uses the standard signing algorithm,
     *        which begins with a hash function. When the value is <code>DIGEST</code>, KMS skips the hashing step in
     *        the signing algorithm.
     *        </p>
     *        <important>
     *        <p>
     *        Use the <code>DIGEST</code> value only when the value of the <code>Message</code> parameter is a message
     *        digest. If you use the <code>DIGEST</code> value with an unhashed message, the security of the signing
     *        operation can be compromised.
     *        </p>
     *        </important>
     *        <p>
     *        When the value of <code>MessageType</code>is <code>DIGEST</code>, the length of the <code>Message</code>
     *        value must match the length of hashed messages for the specified signing algorithm.
     *        </p>
     *        <p>
     *        You can submit a message digest and omit the <code>MessageType</code> or specify <code>RAW</code> so the
     *        digest is hashed again while signing. However, this can cause verification failures when verifying with a
     *        system that assumes a single hash.
     *        </p>
     *        <p>
     *        The hashing algorithm in that <code>Sign</code> uses is based on the <code>SigningAlgorithm</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_256 use the SHA_256 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_384 use the SHA_384 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Signing algorithms that end in SHA_512 use the SHA_512 hashing algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SM2DSA uses the SM3 hashing algorithm. For details, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     *        >Offline verification with SM2 key pairs</a>.
     *        </p>
     *        </li>
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

    public SignRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Specifies the signing algorithm to use when signing the message.
     * </p>
     * <p>
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When signing
     * with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * 
     * @param signingAlgorithm
     *        Specifies the signing algorithm to use when signing the message. </p>
     *        <p>
     *        Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When
     *        signing with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms
     *        for compatibility with existing applications.
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
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When signing
     * with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * 
     * @return Specifies the signing algorithm to use when signing the message. </p>
     *         <p>
     *         Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When
     *         signing with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms
     *         for compatibility with existing applications.
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
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When signing
     * with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * 
     * @param signingAlgorithm
     *        Specifies the signing algorithm to use when signing the message. </p>
     *        <p>
     *        Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When
     *        signing with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms
     *        for compatibility with existing applications.
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
     * Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When signing
     * with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms for
     * compatibility with existing applications.
     * </p>
     * 
     * @param signingAlgorithm
     *        Specifies the signing algorithm to use when signing the message. </p>
     *        <p>
     *        Choose an algorithm that is compatible with the type and size of the specified asymmetric KMS key. When
     *        signing with RSA key pairs, RSASSA-PSS algorithms are preferred. We include RSASSA-PKCS1-v1_5 algorithms
     *        for compatibility with existing applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public SignRequest withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param dryRun
     *        Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *        <p>
     *        To learn more about how to use this parameter, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *        calls</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *         <p>
     *         To learn more about how to use this parameter, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *         calls</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param dryRun
     *        Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *        <p>
     *        To learn more about how to use this parameter, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *        calls</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *         <p>
     *         To learn more about how to use this parameter, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *         calls</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public SignRequest clone() {
        return (SignRequest) super.clone();
    }

}
