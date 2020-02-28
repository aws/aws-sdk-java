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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Decrypt" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecryptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
     * </p>
     */
    private java.nio.ByteBuffer ciphertextBlob;
    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     * cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS uses do
     * not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     * authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An encryption context is optional when encrypting
     * with a symmetric CMK, but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> encryptionContext;
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
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID of the
     * CMK that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the specified CMK
     * was used to encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS KMS
     * uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the ciphertext.
     * However, you can use this parameter to ensure that a particular CMK (of any kind) is used to decrypt the
     * ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>.
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
     * Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm that
     * was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code> operation fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     */
    private String encryptionAlgorithm;

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
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
     * @param ciphertextBlob
     *        Ciphertext to be decrypted. The blob includes metadata.
     */

    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Ciphertext to be decrypted. The blob includes metadata.
     */

    public java.nio.ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * <p>
     * Ciphertext to be decrypted. The blob includes metadata.
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
     * @param ciphertextBlob
     *        Ciphertext to be decrypted. The blob includes metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptRequest withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        setCiphertextBlob(ciphertextBlob);
        return this;
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     * cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS uses do
     * not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     * authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An encryption context is optional when encrypting
     * with a symmetric CMK, but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     *         cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     *         uses do not support an encryption context.</p>
     *         <p>
     *         An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     *         authenticated data. When you use an encryption context to encrypt data, you must specify the same (an
     *         exact case-sensitive match) encryption context to decrypt the data. An encryption context is optional
     *         when encrypting with a symmetric CMK, but it is highly recommended.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *         Context</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public java.util.Map<String, String> getEncryptionContext() {
        if (encryptionContext == null) {
            encryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return encryptionContext;
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     * cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS uses do
     * not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     * authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An encryption context is optional when encrypting
     * with a symmetric CMK, but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param encryptionContext
     *        Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     *        cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     *        uses do not support an encryption context.</p>
     *        <p>
     *        An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     *        authenticated data. When you use an encryption context to encrypt data, you must specify the same (an
     *        exact case-sensitive match) encryption context to decrypt the data. An encryption context is optional when
     *        encrypting with a symmetric CMK, but it is highly recommended.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *        Context</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setEncryptionContext(java.util.Map<String, String> encryptionContext) {
        this.encryptionContext = encryptionContext == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(encryptionContext);
    }

    /**
     * <p>
     * Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     * cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS uses do
     * not support an encryption context.
     * </p>
     * <p>
     * An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     * authenticated data. When you use an encryption context to encrypt data, you must specify the same (an exact
     * case-sensitive match) encryption context to decrypt the data. An encryption context is optional when encrypting
     * with a symmetric CMK, but it is highly recommended.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param encryptionContext
     *        Specifies the encryption context to use when decrypting the data. An encryption context is valid only for
     *        cryptographic operations with a symmetric CMK. The standard asymmetric encryption algorithms that AWS KMS
     *        uses do not support an encryption context.</p>
     *        <p>
     *        An <i>encryption context</i> is a collection of non-secret key-value pairs that represents additional
     *        authenticated data. When you use an encryption context to encrypt data, you must specify the same (an
     *        exact case-sensitive match) encryption context to decrypt the data. An encryption context is optional when
     *        encrypting with a symmetric CMK, but it is highly recommended.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *        Context</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptRequest withEncryptionContext(java.util.Map<String, String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * Add a single EncryptionContext entry
     *
     * @see DecryptRequest#withEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DecryptRequest addEncryptionContextEntry(String key, String value) {
        if (null == this.encryptionContext) {
            this.encryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.encryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.encryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
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

    public DecryptRequest withGrantTokens(String... grantTokens) {
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

    public DecryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID of the
     * CMK that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the specified CMK
     * was used to encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS KMS
     * uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the ciphertext.
     * However, you can use this parameter to ensure that a particular CMK (of any kind) is used to decrypt the
     * ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>.
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
     *        Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID of
     *        the CMK that was used to encrypt the ciphertext.</p>
     *        <p>
     *        If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the
     *        specified CMK was used to encrypt the ciphertext.
     *        </p>
     *        <p>
     *        This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS
     *        KMS uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the
     *        ciphertext. However, you can use this parameter to ensure that a particular CMK (of any kind) is used to
     *        decrypt the ciphertext.
     *        </p>
     *        <p>
     *        To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an
     *        alias name, prefix it with <code>"alias/"</code>.
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
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID of the
     * CMK that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the specified CMK
     * was used to encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS KMS
     * uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the ciphertext.
     * However, you can use this parameter to ensure that a particular CMK (of any kind) is used to decrypt the
     * ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>.
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
     * @return Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID
     *         of the CMK that was used to encrypt the ciphertext.</p>
     *         <p>
     *         If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the
     *         specified CMK was used to encrypt the ciphertext.
     *         </p>
     *         <p>
     *         This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS
     *         KMS uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the
     *         ciphertext. However, you can use this parameter to ensure that a particular CMK (of any kind) is used to
     *         decrypt the ciphertext.
     *         </p>
     *         <p>
     *         To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an
     *         alias name, prefix it with <code>"alias/"</code>.
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
     * Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID of the
     * CMK that was used to encrypt the ciphertext.
     * </p>
     * <p>
     * If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the specified CMK
     * was used to encrypt the ciphertext.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS KMS
     * uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the ciphertext.
     * However, you can use this parameter to ensure that a particular CMK (of any kind) is used to decrypt the
     * ciphertext.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name,
     * prefix it with <code>"alias/"</code>.
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
     *        Specifies the customer master key (CMK) that AWS KMS will use to decrypt the ciphertext. Enter a key ID of
     *        the CMK that was used to encrypt the ciphertext.</p>
     *        <p>
     *        If you specify a <code>KeyId</code> value, the <code>Decrypt</code> operation succeeds only if the
     *        specified CMK was used to encrypt the ciphertext.
     *        </p>
     *        <p>
     *        This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. Otherwise, AWS
     *        KMS uses the metadata that it adds to the ciphertext blob to determine which CMK was used to encrypt the
     *        ciphertext. However, you can use this parameter to ensure that a particular CMK (of any kind) is used to
     *        decrypt the ciphertext.
     *        </p>
     *        <p>
     *        To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an
     *        alias name, prefix it with <code>"alias/"</code>.
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

    public DecryptRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm that
     * was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code> operation fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm
     *        that was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code>
     *        operation fails.</p>
     *        <p>
     *        This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default
     *        value, <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric
     *        CMKs.
     * @see EncryptionAlgorithmSpec
     */

    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm that
     * was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code> operation fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * 
     * @return Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same
     *         algorithm that was used to encrypt the data. If you specify a different algorithm, the
     *         <code>Decrypt</code> operation fails.</p>
     *         <p>
     *         This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default
     *         value, <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for
     *         symmetric CMKs.
     * @see EncryptionAlgorithmSpec
     */

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm that
     * was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code> operation fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm
     *        that was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code>
     *        operation fails.</p>
     *        <p>
     *        This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default
     *        value, <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric
     *        CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithmSpec
     */

    public DecryptRequest withEncryptionAlgorithm(String encryptionAlgorithm) {
        setEncryptionAlgorithm(encryptionAlgorithm);
        return this;
    }

    /**
     * <p>
     * Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm that
     * was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code> operation fails.
     * </p>
     * <p>
     * This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default value,
     * <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric CMKs.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        Specifies the encryption algorithm that will be used to decrypt the ciphertext. Specify the same algorithm
     *        that was used to encrypt the data. If you specify a different algorithm, the <code>Decrypt</code>
     *        operation fails.</p>
     *        <p>
     *        This parameter is required only when the ciphertext was encrypted under an asymmetric CMK. The default
     *        value, <code>SYMMETRIC_DEFAULT</code>, represents the only supported algorithm that is valid for symmetric
     *        CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithmSpec
     */

    public DecryptRequest withEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
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
        if (getCiphertextBlob() != null)
            sb.append("CiphertextBlob: ").append(getCiphertextBlob()).append(",");
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: ").append(getEncryptionContext()).append(",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: ").append(getGrantTokens()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getEncryptionAlgorithm() != null)
            sb.append("EncryptionAlgorithm: ").append(getEncryptionAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecryptRequest == false)
            return false;
        DecryptRequest other = (DecryptRequest) obj;
        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null)
            return false;
        if (other.getCiphertextBlob() != null && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false)
            return false;
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getEncryptionAlgorithm() == null ^ this.getEncryptionAlgorithm() == null)
            return false;
        if (other.getEncryptionAlgorithm() != null && other.getEncryptionAlgorithm().equals(this.getEncryptionAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode());
        hashCode = prime * hashCode + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAlgorithm() == null) ? 0 : getEncryptionAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public DecryptRequest clone() {
        return (DecryptRequest) super.clone();
    }

}
