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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateRandom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateRandomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     */
    private Integer numberOfBytes;
    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM key
     * store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     * <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
     * parameter, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under the
     * public key in the attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the private
     * key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private RecipientInfo recipient;

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * 
     * @param numberOfBytes
     *        The length of the random byte string. This parameter is required.
     */

    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * 
     * @return The length of the random byte string. This parameter is required.
     */

    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    /**
     * <p>
     * The length of the random byte string. This parameter is required.
     * </p>
     * 
     * @param numberOfBytes
     *        The length of the random byte string. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomRequest withNumberOfBytes(Integer numberOfBytes) {
        setNumberOfBytes(numberOfBytes);
        return this;
    }

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM key
     * store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     * <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     * </p>
     * 
     * @param customKeyStoreId
     *        Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM
     *        key store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *        <p>
     *        External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     *        <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM key
     * store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     * <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     * </p>
     * 
     * @return Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM
     *         key store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     *         <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM key
     * store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     * <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     * </p>
     * 
     * @param customKeyStoreId
     *        Generates the random byte string in the CloudHSM cluster that is associated with the specified CloudHSM
     *        key store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *        <p>
     *        External key store IDs are not valid for this parameter. If you specify the ID of an external key store,
     *        <code>GenerateRandom</code> throws an <code>UnsupportedOperationException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomRequest withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
        return this;
    }

    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
     * parameter, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under the
     * public key in the attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the private
     * key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param recipient
     *        A signed <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *        >attestation document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use
     *        with the enclave's public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     *        </p>
     *        <p>
     *        This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
     *        parameter, use the <a
     *        href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web
     *        Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     *        </p>
     *        <p>
     *        When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under
     *        the public key in the attestation document, and returns the resulting ciphertext in the
     *        <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     *        private key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     *        </p>
     *        <p>
     *        For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
     * parameter, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under the
     * public key in the attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the private
     * key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A signed <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *         >attestation document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use
     *         with the enclave's public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     *         </p>
     *         <p>
     *         This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include
     *         this parameter, use the <a
     *         href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web
     *         Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     *         </p>
     *         <p>
     *         When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under
     *         the public key in the attestation document, and returns the resulting ciphertext in the
     *         <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     *         private key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     *         </p>
     *         <p>
     *         For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *         Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public RecipientInfo getRecipient() {
        return this.recipient;
    }

    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
     * parameter, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     * </p>
     * <p>
     * When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under the
     * public key in the attestation document, and returns the resulting ciphertext in the
     * <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the private
     * key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param recipient
     *        A signed <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *        >attestation document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use
     *        with the enclave's public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     *        </p>
     *        <p>
     *        This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
     *        parameter, use the <a
     *        href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web
     *        Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.
     *        </p>
     *        <p>
     *        When you use this parameter, instead of returning plaintext bytes, KMS encrypts the plaintext bytes under
     *        the public key in the attestation document, and returns the resulting ciphertext in the
     *        <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     *        private key in the enclave. The <code>Plaintext</code> field in the response is null or empty.
     *        </p>
     *        <p>
     *        For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomRequest withRecipient(RecipientInfo recipient) {
        setRecipient(recipient);
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
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: ").append(getNumberOfBytes()).append(",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId()).append(",");
        if (getRecipient() != null)
            sb.append("Recipient: ").append(getRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomRequest == false)
            return false;
        GenerateRandomRequest other = (GenerateRandomRequest) obj;
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        return hashCode;
    }

    @Override
    public GenerateRandomRequest clone() {
        return (GenerateRandomRequest) super.clone();
    }

}
