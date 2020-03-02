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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateDataKeyPairRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the encryption context that will be used when encrypting the private key in the data key pair.
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
     * Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an asymmetric
     * CMKs.
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
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and verify (but
     * not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not effective outside of
     * AWS KMS.
     * </p>
     */
    private String keyPairSpec;
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
     * Specifies the encryption context that will be used when encrypting the private key in the data key pair.
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
     * @return Specifies the encryption context that will be used when encrypting the private key in the data key
     *         pair.</p>
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
     * Specifies the encryption context that will be used when encrypting the private key in the data key pair.
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
     *        Specifies the encryption context that will be used when encrypting the private key in the data key
     *        pair.</p>
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
     * Specifies the encryption context that will be used when encrypting the private key in the data key pair.
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
     *        Specifies the encryption context that will be used when encrypting the private key in the data key
     *        pair.</p>
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

    public GenerateDataKeyPairRequest withEncryptionContext(java.util.Map<String, String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * Add a single EncryptionContext entry
     *
     * @see GenerateDataKeyPairRequest#withEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataKeyPairRequest addEncryptionContextEntry(String key, String value) {
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

    public GenerateDataKeyPairRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    /**
     * <p>
     * Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an asymmetric
     * CMKs.
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
     *        Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an
     *        asymmetric CMKs.</p>
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
     * Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an asymmetric
     * CMKs.
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
     * @return Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an
     *         asymmetric CMKs.</p>
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
     * Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an asymmetric
     * CMKs.
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
     *        Specifies the symmetric CMK that encrypts the private key in the data key pair. You cannot specify an
     *        asymmetric CMKs.</p>
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

    public GenerateDataKeyPairRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and verify (but
     * not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not effective outside of
     * AWS KMS.
     * </p>
     * 
     * @param keyPairSpec
     *        Determines the type of data key pair that is generated. </p>
     *        <p>
     *        The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and
     *        verify (but not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not
     *        effective outside of AWS KMS.
     * @see DataKeyPairSpec
     */

    public void setKeyPairSpec(String keyPairSpec) {
        this.keyPairSpec = keyPairSpec;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and verify (but
     * not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not effective outside of
     * AWS KMS.
     * </p>
     * 
     * @return Determines the type of data key pair that is generated. </p>
     *         <p>
     *         The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and
     *         verify (but not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not
     *         effective outside of AWS KMS.
     * @see DataKeyPairSpec
     */

    public String getKeyPairSpec() {
        return this.keyPairSpec;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and verify (but
     * not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not effective outside of
     * AWS KMS.
     * </p>
     * 
     * @param keyPairSpec
     *        Determines the type of data key pair that is generated. </p>
     *        <p>
     *        The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and
     *        verify (but not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not
     *        effective outside of AWS KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataKeyPairSpec
     */

    public GenerateDataKeyPairRequest withKeyPairSpec(String keyPairSpec) {
        setKeyPairSpec(keyPairSpec);
        return this;
    }

    /**
     * <p>
     * Determines the type of data key pair that is generated.
     * </p>
     * <p>
     * The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and verify (but
     * not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not effective outside of
     * AWS KMS.
     * </p>
     * 
     * @param keyPairSpec
     *        Determines the type of data key pair that is generated. </p>
     *        <p>
     *        The AWS KMS rule that restricts the use of asymmetric RSA CMKs to encrypt and decrypt or to sign and
     *        verify (but not both), and the rule that permits you to use ECC CMKs only to sign and verify, are not
     *        effective outside of AWS KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataKeyPairSpec
     */

    public GenerateDataKeyPairRequest withKeyPairSpec(DataKeyPairSpec keyPairSpec) {
        this.keyPairSpec = keyPairSpec.toString();
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

    public GenerateDataKeyPairRequest withGrantTokens(String... grantTokens) {
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

    public GenerateDataKeyPairRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
        if (getEncryptionContext() != null)
            sb.append("EncryptionContext: ").append(getEncryptionContext()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getKeyPairSpec() != null)
            sb.append("KeyPairSpec: ").append(getKeyPairSpec()).append(",");
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

        if (obj instanceof GenerateDataKeyPairRequest == false)
            return false;
        GenerateDataKeyPairRequest other = (GenerateDataKeyPairRequest) obj;
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null)
            return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyPairSpec() == null ^ this.getKeyPairSpec() == null)
            return false;
        if (other.getKeyPairSpec() != null && other.getKeyPairSpec().equals(this.getKeyPairSpec()) == false)
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

        hashCode = prime * hashCode + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyPairSpec() == null) ? 0 : getKeyPairSpec().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataKeyPairRequest clone() {
        return (GenerateDataKeyPairRequest) super.clone();
    }

}
