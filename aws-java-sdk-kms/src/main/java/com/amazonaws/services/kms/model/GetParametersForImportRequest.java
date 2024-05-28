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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetParametersForImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported key material. The <code>Origin</code> of
     * the KMS key must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However, you cannot import key material into a KMS
     * key in a custom key store.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to protect
     * your key material during import. For more information, see <a
     * href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm">Select a
     * wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then encrypt
     * your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key material
     * directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key material directly
     * with the SM2 public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key material that you are importing. To import an
     * RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you must use the
     * SM2PKE wrapping algorithm to import an RSA private key.
     * </p>
     * <p>
     * The SM2PKE wrapping algorithm is available only in China Regions. The <code>RSA_AES_KEY_WRAP_SHA_256</code> and
     * <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not supported in China Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     * ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap ECC_NIST_P521
     * key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5 wrapping
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     * </p>
     * </li>
     * </ul>
     */
    private String wrappingAlgorithm;
    /**
     * <p>
     * The type of public key to return in the response. You will use this wrapping key with the specified wrapping
     * algorithm to protect your key material during import.
     * </p>
     * <p>
     * Use the longest wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an RSA_AES
     * wrapping algorithm or choose a longer RSA public key.
     * </p>
     * <p>
     * The SM2 wrapping key spec is available only in China Regions.
     * </p>
     */
    private String wrappingKeySpec;

    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported key material. The <code>Origin</code> of
     * the KMS key must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However, you cannot import key material into a KMS
     * key in a custom key store.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        The identifier of the KMS key that will be associated with the imported key material. The
     *        <code>Origin</code> of the KMS key must be <code>EXTERNAL</code>.</p>
     *        <p>
     *        All KMS key types are supported, including multi-Region keys. However, you cannot import key material into
     *        a KMS key in a custom key store.
     *        </p>
     *        <p>
     *        Specify the key ID or key ARN of the KMS key.
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
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported key material. The <code>Origin</code> of
     * the KMS key must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However, you cannot import key material into a KMS
     * key in a custom key store.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return The identifier of the KMS key that will be associated with the imported key material. The
     *         <code>Origin</code> of the KMS key must be <code>EXTERNAL</code>.</p>
     *         <p>
     *         All KMS key types are supported, including multi-Region keys. However, you cannot import key material
     *         into a KMS key in a custom key store.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
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
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the KMS key that will be associated with the imported key material. The <code>Origin</code> of
     * the KMS key must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * All KMS key types are supported, including multi-Region keys. However, you cannot import key material into a KMS
     * key in a custom key store.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
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
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        The identifier of the KMS key that will be associated with the imported key material. The
     *        <code>Origin</code> of the KMS key must be <code>EXTERNAL</code>.</p>
     *        <p>
     *        All KMS key types are supported, including multi-Region keys. However, you cannot import key material into
     *        a KMS key in a custom key store.
     *        </p>
     *        <p>
     *        Specify the key ID or key ARN of the KMS key.
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
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersForImportRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to protect
     * your key material during import. For more information, see <a
     * href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm">Select a
     * wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then encrypt
     * your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key material
     * directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key material directly
     * with the SM2 public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key material that you are importing. To import an
     * RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you must use the
     * SM2PKE wrapping algorithm to import an RSA private key.
     * </p>
     * <p>
     * The SM2PKE wrapping algorithm is available only in China Regions. The <code>RSA_AES_KEY_WRAP_SHA_256</code> and
     * <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not supported in China Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     * ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap ECC_NIST_P521
     * key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5 wrapping
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     * </p>
     * </li>
     * </ul>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to
     *        protect your key material during import. For more information, see <a
     *        href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *        >Select a wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.</p>
     *        <p>
     *        For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then
     *        encrypt your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key
     *        material directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key
     *        material directly with the SM2 public key from KMS.
     *        </p>
     *        <p>
     *        The wrapping algorithms that you can use depend on the type of key material that you are importing. To
     *        import an RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you
     *        must use the SM2PKE wrapping algorithm to import an RSA private key.
     *        </p>
     *        <p>
     *        The SM2PKE wrapping algorithm is available only in China Regions. The
     *        <code>RSA_AES_KEY_WRAP_SHA_256</code> and <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not
     *        supported in China Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private
     *        key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5
     *        wrapping algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     *        </p>
     *        </li>
     * @see AlgorithmSpec
     */

    public void setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to protect
     * your key material during import. For more information, see <a
     * href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm">Select a
     * wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then encrypt
     * your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key material
     * directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key material directly
     * with the SM2 public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key material that you are importing. To import an
     * RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you must use the
     * SM2PKE wrapping algorithm to import an RSA private key.
     * </p>
     * <p>
     * The SM2PKE wrapping algorithm is available only in China Regions. The <code>RSA_AES_KEY_WRAP_SHA_256</code> and
     * <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not supported in China Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     * ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap ECC_NIST_P521
     * key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5 wrapping
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to
     *         protect your key material during import. For more information, see <a
     *         href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *         >Select a wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.</p>
     *         <p>
     *         For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then
     *         encrypt your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your
     *         key material directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your
     *         key material directly with the SM2 public key from KMS.
     *         </p>
     *         <p>
     *         The wrapping algorithms that you can use depend on the type of key material that you are importing. To
     *         import an RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you
     *         must use the SM2PKE wrapping algorithm to import an RSA private key.
     *         </p>
     *         <p>
     *         The SM2PKE wrapping algorithm is available only in China Regions. The
     *         <code>RSA_AES_KEY_WRAP_SHA_256</code> and <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not
     *         supported in China Regions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private
     *         key).
     *         </p>
     *         <p>
     *         You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *         ECC_NIST_P521 key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     *         </p>
     *         <p>
     *         You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *         ECC_NIST_P521 key material.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5
     *         wrapping algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     *         </p>
     *         </li>
     * @see AlgorithmSpec
     */

    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    /**
     * <p>
     * The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to protect
     * your key material during import. For more information, see <a
     * href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm">Select a
     * wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then encrypt
     * your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key material
     * directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key material directly
     * with the SM2 public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key material that you are importing. To import an
     * RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you must use the
     * SM2PKE wrapping algorithm to import an RSA private key.
     * </p>
     * <p>
     * The SM2PKE wrapping algorithm is available only in China Regions. The <code>RSA_AES_KEY_WRAP_SHA_256</code> and
     * <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not supported in China Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     * ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap ECC_NIST_P521
     * key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5 wrapping
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     * </p>
     * </li>
     * </ul>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to
     *        protect your key material during import. For more information, see <a
     *        href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *        >Select a wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.</p>
     *        <p>
     *        For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then
     *        encrypt your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key
     *        material directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key
     *        material directly with the SM2 public key from KMS.
     *        </p>
     *        <p>
     *        The wrapping algorithms that you can use depend on the type of key material that you are importing. To
     *        import an RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you
     *        must use the SM2PKE wrapping algorithm to import an RSA private key.
     *        </p>
     *        <p>
     *        The SM2PKE wrapping algorithm is available only in China Regions. The
     *        <code>RSA_AES_KEY_WRAP_SHA_256</code> and <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not
     *        supported in China Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private
     *        key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5
     *        wrapping algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmSpec
     */

    public GetParametersForImportRequest withWrappingAlgorithm(String wrappingAlgorithm) {
        setWrappingAlgorithm(wrappingAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to protect
     * your key material during import. For more information, see <a
     * href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm">Select a
     * wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then encrypt
     * your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key material
     * directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key material directly
     * with the SM2 public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key material that you are importing. To import an
     * RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you must use the
     * SM2PKE wrapping algorithm to import an RSA private key.
     * </p>
     * <p>
     * The SM2PKE wrapping algorithm is available only in China Regions. The <code>RSA_AES_KEY_WRAP_SHA_256</code> and
     * <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not supported in China Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     * ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap ECC_NIST_P521
     * key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5 wrapping
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     * </p>
     * </li>
     * </ul>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to
     *        protect your key material during import. For more information, see <a
     *        href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *        >Select a wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.</p>
     *        <p>
     *        For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then
     *        encrypt your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key
     *        material directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key
     *        material directly with the SM2 public key from KMS.
     *        </p>
     *        <p>
     *        The wrapping algorithms that you can use depend on the type of key material that you are importing. To
     *        import an RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you
     *        must use the SM2PKE wrapping algorithm to import an RSA private key.
     *        </p>
     *        <p>
     *        The SM2PKE wrapping algorithm is available only in China Regions. The
     *        <code>RSA_AES_KEY_WRAP_SHA_256</code> and <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not
     *        supported in China Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private
     *        key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5
     *        wrapping algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     *        </p>
     *        </li>
     * @see AlgorithmSpec
     */

    public void setWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        withWrappingAlgorithm(wrappingAlgorithm);
    }

    /**
     * <p>
     * The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to protect
     * your key material during import. For more information, see <a
     * href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm">Select a
     * wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then encrypt
     * your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key material
     * directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key material directly
     * with the SM2 public key from KMS.
     * </p>
     * <p>
     * The wrapping algorithms that you can use depend on the type of key material that you are importing. To import an
     * RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you must use the
     * SM2PKE wrapping algorithm to import an RSA private key.
     * </p>
     * <p>
     * The SM2PKE wrapping algorithm is available only in China Regions. The <code>RSA_AES_KEY_WRAP_SHA_256</code> and
     * <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not supported in China Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     * ECC_NIST_P521 key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     * </p>
     * <p>
     * You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap ECC_NIST_P521
     * key material.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5 wrapping
     * algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     * </p>
     * </li>
     * </ul>
     * 
     * @param wrappingAlgorithm
     *        The algorithm you will use with the asymmetric public key (<code>PublicKey</code>) in the response to
     *        protect your key material during import. For more information, see <a
     *        href="kms/latest/developerguide/importing-keys-get-public-key-and-token.html#select-wrapping-algorithm"
     *        >Select a wrapping algorithm</a> in the <i>Key Management Service Developer Guide</i>.</p>
     *        <p>
     *        For RSA_AES wrapping algorithms, you encrypt your key material with an AES key that you generate, then
     *        encrypt your AES key with the RSA public key from KMS. For RSAES wrapping algorithms, you encrypt your key
     *        material directly with the RSA public key from KMS. For SM2PKE wrapping algorithms, you encrypt your key
     *        material directly with the SM2 public key from KMS.
     *        </p>
     *        <p>
     *        The wrapping algorithms that you can use depend on the type of key material that you are importing. To
     *        import an RSA private key, you must use an RSA_AES wrapping algorithm, except in China Regions, where you
     *        must use the SM2PKE wrapping algorithm to import an RSA private key.
     *        </p>
     *        <p>
     *        The SM2PKE wrapping algorithm is available only in China Regions. The
     *        <code>RSA_AES_KEY_WRAP_SHA_256</code> and <code>RSA_AES_KEY_WRAP_SHA_1</code> wrapping algorithms are not
     *        supported in China Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_256</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSA_AES_KEY_WRAP_SHA_1</b> — Supported for wrapping RSA and ECC key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_256</b> — Supported for all types of key material, except RSA key material (private
     *        key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_256 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_OAEP_SHA_1</b> — Supported for all types of key material, except RSA key material (private key).
     *        </p>
     *        <p>
     *        You cannot use the RSAES_OAEP_SHA_1 wrapping algorithm with the RSA_2048 wrapping key spec to wrap
     *        ECC_NIST_P521 key material.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>RSAES_PKCS1_V1_5</b> (Deprecated) — As of October 10, 2023, KMS does not support the RSAES_PKCS1_V1_5
     *        wrapping algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SM2PKE</b> (China Regions only) — supported for wrapping RSA, ECC, and SM2 key material.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmSpec
     */

    public GetParametersForImportRequest withWrappingAlgorithm(AlgorithmSpec wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The type of public key to return in the response. You will use this wrapping key with the specified wrapping
     * algorithm to protect your key material during import.
     * </p>
     * <p>
     * Use the longest wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an RSA_AES
     * wrapping algorithm or choose a longer RSA public key.
     * </p>
     * <p>
     * The SM2 wrapping key spec is available only in China Regions.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of public key to return in the response. You will use this wrapping key with the specified
     *        wrapping algorithm to protect your key material during import. </p>
     *        <p>
     *        Use the longest wrapping key that is practical.
     *        </p>
     *        <p>
     *        You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an
     *        RSA_AES wrapping algorithm or choose a longer RSA public key.
     *        </p>
     *        <p>
     *        The SM2 wrapping key spec is available only in China Regions.
     * @see WrappingKeySpec
     */

    public void setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
    }

    /**
     * <p>
     * The type of public key to return in the response. You will use this wrapping key with the specified wrapping
     * algorithm to protect your key material during import.
     * </p>
     * <p>
     * Use the longest wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an RSA_AES
     * wrapping algorithm or choose a longer RSA public key.
     * </p>
     * <p>
     * The SM2 wrapping key spec is available only in China Regions.
     * </p>
     * 
     * @return The type of public key to return in the response. You will use this wrapping key with the specified
     *         wrapping algorithm to protect your key material during import. </p>
     *         <p>
     *         Use the longest wrapping key that is practical.
     *         </p>
     *         <p>
     *         You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an
     *         RSA_AES wrapping algorithm or choose a longer RSA public key.
     *         </p>
     *         <p>
     *         The SM2 wrapping key spec is available only in China Regions.
     * @see WrappingKeySpec
     */

    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    /**
     * <p>
     * The type of public key to return in the response. You will use this wrapping key with the specified wrapping
     * algorithm to protect your key material during import.
     * </p>
     * <p>
     * Use the longest wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an RSA_AES
     * wrapping algorithm or choose a longer RSA public key.
     * </p>
     * <p>
     * The SM2 wrapping key spec is available only in China Regions.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of public key to return in the response. You will use this wrapping key with the specified
     *        wrapping algorithm to protect your key material during import. </p>
     *        <p>
     *        Use the longest wrapping key that is practical.
     *        </p>
     *        <p>
     *        You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an
     *        RSA_AES wrapping algorithm or choose a longer RSA public key.
     *        </p>
     *        <p>
     *        The SM2 wrapping key spec is available only in China Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public GetParametersForImportRequest withWrappingKeySpec(String wrappingKeySpec) {
        setWrappingKeySpec(wrappingKeySpec);
        return this;
    }

    /**
     * <p>
     * The type of public key to return in the response. You will use this wrapping key with the specified wrapping
     * algorithm to protect your key material during import.
     * </p>
     * <p>
     * Use the longest wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an RSA_AES
     * wrapping algorithm or choose a longer RSA public key.
     * </p>
     * <p>
     * The SM2 wrapping key spec is available only in China Regions.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of public key to return in the response. You will use this wrapping key with the specified
     *        wrapping algorithm to protect your key material during import. </p>
     *        <p>
     *        Use the longest wrapping key that is practical.
     *        </p>
     *        <p>
     *        You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an
     *        RSA_AES wrapping algorithm or choose a longer RSA public key.
     *        </p>
     *        <p>
     *        The SM2 wrapping key spec is available only in China Regions.
     * @see WrappingKeySpec
     */

    public void setWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        withWrappingKeySpec(wrappingKeySpec);
    }

    /**
     * <p>
     * The type of public key to return in the response. You will use this wrapping key with the specified wrapping
     * algorithm to protect your key material during import.
     * </p>
     * <p>
     * Use the longest wrapping key that is practical.
     * </p>
     * <p>
     * You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an RSA_AES
     * wrapping algorithm or choose a longer RSA public key.
     * </p>
     * <p>
     * The SM2 wrapping key spec is available only in China Regions.
     * </p>
     * 
     * @param wrappingKeySpec
     *        The type of public key to return in the response. You will use this wrapping key with the specified
     *        wrapping algorithm to protect your key material during import. </p>
     *        <p>
     *        Use the longest wrapping key that is practical.
     *        </p>
     *        <p>
     *        You cannot use an RSA_2048 public key to directly wrap an ECC_NIST_P521 private key. Instead, use an
     *        RSA_AES wrapping algorithm or choose a longer RSA public key.
     *        </p>
     *        <p>
     *        The SM2 wrapping key spec is available only in China Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public GetParametersForImportRequest withWrappingKeySpec(WrappingKeySpec wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec.toString();
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
        if (getWrappingAlgorithm() != null)
            sb.append("WrappingAlgorithm: ").append(getWrappingAlgorithm()).append(",");
        if (getWrappingKeySpec() != null)
            sb.append("WrappingKeySpec: ").append(getWrappingKeySpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportRequest == false)
            return false;
        GetParametersForImportRequest other = (GetParametersForImportRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getWrappingAlgorithm() == null ^ this.getWrappingAlgorithm() == null)
            return false;
        if (other.getWrappingAlgorithm() != null && other.getWrappingAlgorithm().equals(this.getWrappingAlgorithm()) == false)
            return false;
        if (other.getWrappingKeySpec() == null ^ this.getWrappingKeySpec() == null)
            return false;
        if (other.getWrappingKeySpec() != null && other.getWrappingKeySpec().equals(this.getWrappingKeySpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getWrappingAlgorithm() == null) ? 0 : getWrappingAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeySpec() == null) ? 0 : getWrappingKeySpec().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForImportRequest clone() {
        return (GetParametersForImportRequest) super.clone();
    }

}
