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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetPublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPublicKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was downloaded.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as defined
     * in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p/>
     */
    private java.nio.ByteBuffer publicKey;
    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     */
    private String customerMasterKeySpec;
    /**
     * <p>
     * The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data outside of
     * AWS KMS, the ciphertext cannot be decrypted.
     * </p>
     */
    private String keyUsage;
    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption
     * algorithm, the ciphertext cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> encryptionAlgorithms;
    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> signingAlgorithms;

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was downloaded.
     * </p>
     * 
     * @param keyId
     *        The identifier of the asymmetric CMK from which the public key was downloaded.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was downloaded.
     * </p>
     * 
     * @return The identifier of the asymmetric CMK from which the public key was downloaded.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the asymmetric CMK from which the public key was downloaded.
     * </p>
     * 
     * @param keyId
     *        The identifier of the asymmetric CMK from which the public key was downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPublicKeyResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as defined
     * in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p/>
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
     * @param publicKey
     *        The exported public key. </p>
     *        <p>
     *        The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     *        defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the
     *        AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
     *        </p>
     */

    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as defined
     * in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p/>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The exported public key. </p>
     *         <p>
     *         The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     *         defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the
     *         AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
     *         </p>
     */

    public java.nio.ByteBuffer getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The exported public key.
     * </p>
     * <p>
     * The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as defined
     * in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the AWS CLI, the
     * value is Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * <p/>
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
     * @param publicKey
     *        The exported public key. </p>
     *        <p>
     *        The value is a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     *        defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>. When you use the HTTP API or the
     *        AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPublicKeyResult withPublicKey(java.nio.ByteBuffer publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        The type of the of the public key that was downloaded.
     * @see CustomerMasterKeySpec
     */

    public void setCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * 
     * @return The type of the of the public key that was downloaded.
     * @see CustomerMasterKeySpec
     */

    public String getCustomerMasterKeySpec() {
        return this.customerMasterKeySpec;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        The type of the of the public key that was downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerMasterKeySpec
     */

    public GetPublicKeyResult withCustomerMasterKeySpec(String customerMasterKeySpec) {
        setCustomerMasterKeySpec(customerMasterKeySpec);
        return this;
    }

    /**
     * <p>
     * The type of the of the public key that was downloaded.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        The type of the of the public key that was downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerMasterKeySpec
     */

    public GetPublicKeyResult withCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
        return this;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data outside of
     * AWS KMS, the ciphertext cannot be decrypted.
     * </p>
     * 
     * @param keyUsage
     *        The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>. </p>
     *        <p>
     *        This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data
     *        outside of AWS KMS, the ciphertext cannot be decrypted.
     * @see KeyUsageType
     */

    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data outside of
     * AWS KMS, the ciphertext cannot be decrypted.
     * </p>
     * 
     * @return The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or
     *         <code>SIGN_VERIFY</code>. </p>
     *         <p>
     *         This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data
     *         outside of AWS KMS, the ciphertext cannot be decrypted.
     * @see KeyUsageType
     */

    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data outside of
     * AWS KMS, the ciphertext cannot be decrypted.
     * </p>
     * 
     * @param keyUsage
     *        The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>. </p>
     *        <p>
     *        This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data
     *        outside of AWS KMS, the ciphertext cannot be decrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public GetPublicKeyResult withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data outside of
     * AWS KMS, the ciphertext cannot be decrypted.
     * </p>
     * 
     * @param keyUsage
     *        The permitted use of the public key. Valid values are <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>. </p>
     *        <p>
     *        This information is critical. If a public key with <code>SIGN_VERIFY</code> key usage encrypts data
     *        outside of AWS KMS, the ciphertext cannot be decrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public GetPublicKeyResult withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption
     * algorithm, the ciphertext cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * 
     * @return The encryption algorithms that AWS KMS supports for this key. </p>
     *         <p>
     *         This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported
     *         encryption algorithm, the ciphertext cannot be decrypted.
     *         </p>
     *         <p>
     *         This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *         <code>ENCRYPT_DECRYPT</code>.
     * @see EncryptionAlgorithmSpec
     */

    public java.util.List<String> getEncryptionAlgorithms() {
        if (encryptionAlgorithms == null) {
            encryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return encryptionAlgorithms;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption
     * algorithm, the ciphertext cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * 
     * @param encryptionAlgorithms
     *        The encryption algorithms that AWS KMS supports for this key. </p>
     *        <p>
     *        This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported
     *        encryption algorithm, the ciphertext cannot be decrypted.
     *        </p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>ENCRYPT_DECRYPT</code>.
     * @see EncryptionAlgorithmSpec
     */

    public void setEncryptionAlgorithms(java.util.Collection<String> encryptionAlgorithms) {
        if (encryptionAlgorithms == null) {
            this.encryptionAlgorithms = null;
            return;
        }

        this.encryptionAlgorithms = new com.amazonaws.internal.SdkInternalList<String>(encryptionAlgorithms);
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption
     * algorithm, the ciphertext cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEncryptionAlgorithms(java.util.Collection)} or {@link #withEncryptionAlgorithms(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param encryptionAlgorithms
     *        The encryption algorithms that AWS KMS supports for this key. </p>
     *        <p>
     *        This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported
     *        encryption algorithm, the ciphertext cannot be decrypted.
     *        </p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>ENCRYPT_DECRYPT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithmSpec
     */

    public GetPublicKeyResult withEncryptionAlgorithms(String... encryptionAlgorithms) {
        if (this.encryptionAlgorithms == null) {
            setEncryptionAlgorithms(new com.amazonaws.internal.SdkInternalList<String>(encryptionAlgorithms.length));
        }
        for (String ele : encryptionAlgorithms) {
            this.encryptionAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption
     * algorithm, the ciphertext cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * 
     * @param encryptionAlgorithms
     *        The encryption algorithms that AWS KMS supports for this key. </p>
     *        <p>
     *        This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported
     *        encryption algorithm, the ciphertext cannot be decrypted.
     *        </p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>ENCRYPT_DECRYPT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithmSpec
     */

    public GetPublicKeyResult withEncryptionAlgorithms(java.util.Collection<String> encryptionAlgorithms) {
        setEncryptionAlgorithms(encryptionAlgorithms);
        return this;
    }

    /**
     * <p>
     * The encryption algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption
     * algorithm, the ciphertext cannot be decrypted.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * 
     * @param encryptionAlgorithms
     *        The encryption algorithms that AWS KMS supports for this key. </p>
     *        <p>
     *        This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported
     *        encryption algorithm, the ciphertext cannot be decrypted.
     *        </p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>ENCRYPT_DECRYPT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithmSpec
     */

    public GetPublicKeyResult withEncryptionAlgorithms(EncryptionAlgorithmSpec... encryptionAlgorithms) {
        com.amazonaws.internal.SdkInternalList<String> encryptionAlgorithmsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                encryptionAlgorithms.length);
        for (EncryptionAlgorithmSpec value : encryptionAlgorithms) {
            encryptionAlgorithmsCopy.add(value.toString());
        }
        if (getEncryptionAlgorithms() == null) {
            setEncryptionAlgorithms(encryptionAlgorithmsCopy);
        } else {
            getEncryptionAlgorithms().addAll(encryptionAlgorithmsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * 
     * @return The signing algorithms that AWS KMS supports for this key.</p>
     *         <p>
     *         This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *         <code>SIGN_VERIFY</code>.
     * @see SigningAlgorithmSpec
     */

    public java.util.List<String> getSigningAlgorithms() {
        if (signingAlgorithms == null) {
            signingAlgorithms = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return signingAlgorithms;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * 
     * @param signingAlgorithms
     *        The signing algorithms that AWS KMS supports for this key.</p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>SIGN_VERIFY</code>.
     * @see SigningAlgorithmSpec
     */

    public void setSigningAlgorithms(java.util.Collection<String> signingAlgorithms) {
        if (signingAlgorithms == null) {
            this.signingAlgorithms = null;
            return;
        }

        this.signingAlgorithms = new com.amazonaws.internal.SdkInternalList<String>(signingAlgorithms);
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSigningAlgorithms(java.util.Collection)} or {@link #withSigningAlgorithms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param signingAlgorithms
     *        The signing algorithms that AWS KMS supports for this key.</p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>SIGN_VERIFY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public GetPublicKeyResult withSigningAlgorithms(String... signingAlgorithms) {
        if (this.signingAlgorithms == null) {
            setSigningAlgorithms(new com.amazonaws.internal.SdkInternalList<String>(signingAlgorithms.length));
        }
        for (String ele : signingAlgorithms) {
            this.signingAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * 
     * @param signingAlgorithms
     *        The signing algorithms that AWS KMS supports for this key.</p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>SIGN_VERIFY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public GetPublicKeyResult withSigningAlgorithms(java.util.Collection<String> signingAlgorithms) {
        setSigningAlgorithms(signingAlgorithms);
        return this;
    }

    /**
     * <p>
     * The signing algorithms that AWS KMS supports for this key.
     * </p>
     * <p>
     * This field appears in the response only when the <code>KeyUsage</code> of the public key is
     * <code>SIGN_VERIFY</code>.
     * </p>
     * 
     * @param signingAlgorithms
     *        The signing algorithms that AWS KMS supports for this key.</p>
     *        <p>
     *        This field appears in the response only when the <code>KeyUsage</code> of the public key is
     *        <code>SIGN_VERIFY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public GetPublicKeyResult withSigningAlgorithms(SigningAlgorithmSpec... signingAlgorithms) {
        com.amazonaws.internal.SdkInternalList<String> signingAlgorithmsCopy = new com.amazonaws.internal.SdkInternalList<String>(signingAlgorithms.length);
        for (SigningAlgorithmSpec value : signingAlgorithms) {
            signingAlgorithmsCopy.add(value.toString());
        }
        if (getSigningAlgorithms() == null) {
            setSigningAlgorithms(signingAlgorithmsCopy);
        } else {
            getSigningAlgorithms().addAll(signingAlgorithmsCopy);
        }
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
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getCustomerMasterKeySpec() != null)
            sb.append("CustomerMasterKeySpec: ").append(getCustomerMasterKeySpec()).append(",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getEncryptionAlgorithms() != null)
            sb.append("EncryptionAlgorithms: ").append(getEncryptionAlgorithms()).append(",");
        if (getSigningAlgorithms() != null)
            sb.append("SigningAlgorithms: ").append(getSigningAlgorithms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPublicKeyResult == false)
            return false;
        GetPublicKeyResult other = (GetPublicKeyResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getCustomerMasterKeySpec() == null ^ this.getCustomerMasterKeySpec() == null)
            return false;
        if (other.getCustomerMasterKeySpec() != null && other.getCustomerMasterKeySpec().equals(this.getCustomerMasterKeySpec()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getEncryptionAlgorithms() == null ^ this.getEncryptionAlgorithms() == null)
            return false;
        if (other.getEncryptionAlgorithms() != null && other.getEncryptionAlgorithms().equals(this.getEncryptionAlgorithms()) == false)
            return false;
        if (other.getSigningAlgorithms() == null ^ this.getSigningAlgorithms() == null)
            return false;
        if (other.getSigningAlgorithms() != null && other.getSigningAlgorithms().equals(this.getSigningAlgorithms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getCustomerMasterKeySpec() == null) ? 0 : getCustomerMasterKeySpec().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAlgorithms() == null) ? 0 : getEncryptionAlgorithms().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithms() == null) ? 0 : getSigningAlgorithms().hashCode());
        return hashCode;
    }

    @Override
    public GetPublicKeyResult clone() {
        try {
            return (GetPublicKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
