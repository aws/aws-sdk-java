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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, refer to the scenario in
     * the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM user or role),
     * you might need to enforce a delay before including the new principal in a key policy because the new principal
     * might not be immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is appropriate for a task. The default value is an
     * empty string (no description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Determines the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> for which you can use the KMS key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     * parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't
     * change the <code>KeyUsage</code> value after the KMS key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code> or
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String keyUsage;
    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the names
     * differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid breaking
     * changes, KMS supports both parameters.
     * </p>
     */
    @Deprecated
    private String customerMasterKeySpec;
    /**
     * <p>
     * Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS key
     * with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates
     * a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a KMS key
     * type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key pair. It
     * also determines the algorithms that the KMS key supports. You can't change the <code>KeySpec</code> after the KMS
     * key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its
     * key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that are
     * integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not support
     * asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String keySpec;
    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The
     * default is <code>AWS_KMS</code>, which means that KMS creates the key material.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a KMS
     * key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value is valid only for
     * symmetric KMS keys.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS key in
     * an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this value to
     * <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to identify the CloudHSM
     * key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key in an
     * external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     * parameter to identify the associated external key. The <code>KeySpec</code> value must be
     * <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     */
    private String origin;
    /**
     * <p>
     * Creates the KMS key in the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To find the
     * CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any other
     * type of KMS key in a custom key store.
     * </p>
     * <p>
     * When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key in its
     * associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an external key
     * store, you must use the <code>XksKeyId</code> parameter to specify an external key that serves as key material
     * for the KMS key.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;
    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag an
     * existing KMS key, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you
     * specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with
     * usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You cannot
     * change this value after you create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this parameter
     * or set it to <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     * <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with imported
     * key material. However, you cannot create a multi-Region key in a custom key store.
     * </p>
     */
    private Boolean multiRegion;
    /**
     * <p>
     * Identifies the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key">external
     * key</a> that serves as key material for the KMS key in an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key store</a>.
     * Specify the ID that the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy">external
     * key store proxy</a> uses to refer to the external key. For help, see the documentation for your external key
     * store proxy.
     * </p>
     * <p>
     * This parameter is required for a KMS key with an <code>Origin</code> value of <code>EXTERNAL_KEY_STORE</code>. It
     * is not valid for KMS keys with any other <code>Origin</code> value.
     * </p>
     * <p>
     * The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web Services
     * in an external key manager associated with the external key store specified by the <code>CustomKeyStoreId</code>
     * parameter. This key must be enabled and configured to perform encryption and decryption. Each KMS key in an
     * external key store must use a different external key. For details, see <a
     * href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS key in an
     * external key store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Each KMS key in an external key store is associated two backing keys. One is key material that KMS generates. The
     * other is the external key specified by this parameter. When you use the KMS key in an external key store to
     * encrypt data, the encryption operation is performed first by KMS using the KMS key material, and then by the
     * external key manager using the specified external key, a process known as <i>double encryption</i>. For details,
     * see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     * >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private String xksKeyId;

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, refer to the scenario in
     * the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM user or role),
     * you might need to enforce a delay before including the new principal in a key policy because the new principal
     * might not be immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * 
     * @param policy
     *        The key policy to attach to the KMS key.</p>
     *        <p>
     *        If you provide a key policy, it must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the
     *        principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     *        request on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more information,
     *        refer to the scenario in the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM
     *        user or role), you might need to enforce a delay before including the new principal in a key policy
     *        because the new principal might not be immediately visible to KMS. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and
     *        Access Management User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *        Key Policy</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        The key policy size quota is 32 kilobytes (32768 bytes).
     *        </p>
     *        <p>
     *        For help writing and formatting a JSON policy document, see the <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy
     *        Reference</a> in the <i> <i>Identity and Access Management User Guide</i> </i>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, refer to the scenario in
     * the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM user or role),
     * you might need to enforce a delay before including the new principal in a key policy because the new principal
     * might not be immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * 
     * @return The key policy to attach to the KMS key.</p>
     *         <p>
     *         If you provide a key policy, it must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the
     *         principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     *         request on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more
     *         information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more principals. The principals in the key policy
     *         must exist and be visible to KMS. When you create a new Amazon Web Services principal (for example, an
     *         IAM user or role), you might need to enforce a delay before including the new principal in a key policy
     *         because the new principal might not be immediately visible to KMS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and
     *         Access Management User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *         Key Policy</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         The key policy size quota is 32 kilobytes (32768 bytes).
     *         </p>
     *         <p>
     *         For help writing and formatting a JSON policy document, see the <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy
     *         Reference</a> in the <i> <i>Identity and Access Management User Guide</i> </i>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, refer to the scenario in
     * the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM user or role),
     * you might need to enforce a delay before including the new principal in a key policy because the new principal
     * might not be immediately visible to KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more information, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * <p>
     * For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * 
     * @param policy
     *        The key policy to attach to the KMS key.</p>
     *        <p>
     *        If you provide a key policy, it must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the
     *        principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     *        request on the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more information,
     *        refer to the scenario in the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section of the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to KMS. When you create a new Amazon Web Services principal (for example, an IAM
     *        user or role), you might need to enforce a delay before including the new principal in a key policy
     *        because the new principal might not be immediately visible to KMS. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and
     *        Access Management User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you do not provide a key policy, KMS attaches a default key policy to the KMS key. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *        Key Policy</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        The key policy size quota is 32 kilobytes (32768 bytes).
     *        </p>
     *        <p>
     *        For help writing and formatting a JSON policy document, see the <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy
     *        Reference</a> in the <i> <i>Identity and Access Management User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is appropriate for a task. The default value is an
     * empty string (no description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     * </p>
     * 
     * @param description
     *        A description of the KMS key.</p>
     *        <p>
     *        Use a description that helps you decide whether the KMS key is appropriate for a task. The default value
     *        is an empty string (no description).
     *        </p>
     *        <p>
     *        To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is appropriate for a task. The default value is an
     * empty string (no description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     * </p>
     * 
     * @return A description of the KMS key.</p>
     *         <p>
     *         Use a description that helps you decide whether the KMS key is appropriate for a task. The default value
     *         is an empty string (no description).
     *         </p>
     *         <p>
     *         To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the KMS key.
     * </p>
     * <p>
     * Use a description that helps you decide whether the KMS key is appropriate for a task. The default value is an
     * empty string (no description).
     * </p>
     * <p>
     * To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     * </p>
     * 
     * @param description
     *        A description of the KMS key.</p>
     *        <p>
     *        Use a description that helps you decide whether the KMS key is appropriate for a task. The default value
     *        is an empty string (no description).
     *        </p>
     *        <p>
     *        To set or change the description after the key is created, use <a>UpdateKeyDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Determines the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> for which you can use the KMS key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     * parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't
     * change the <code>KeyUsage</code> value after the KMS key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code> or
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyUsage
     *        Determines the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operations</a> for which you can use the KMS key. The default value is
     *        <code>ENCRYPT_DECRYPT</code>. This parameter is optional when you are creating a symmetric encryption KMS
     *        key; otherwise, it is required. You can't change the <code>KeyUsage</code> value after the KMS key is
     *        created.</p>
     *        <p>
     *        Select only one valid value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code>
     *        or <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     * @see KeyUsageType
     */

    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * Determines the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> for which you can use the KMS key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     * parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't
     * change the <code>KeyUsage</code> value after the KMS key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code> or
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *         >cryptographic operations</a> for which you can use the KMS key. The default value is
     *         <code>ENCRYPT_DECRYPT</code>. This parameter is optional when you are creating a symmetric encryption KMS
     *         key; otherwise, it is required. You can't change the <code>KeyUsage</code> value after the KMS key is
     *         created.</p>
     *         <p>
     *         Select only one valid value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or
     *         <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code>
     *         or <code>SIGN_VERIFY</code>.
     *         </p>
     *         </li>
     * @see KeyUsageType
     */

    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * Determines the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> for which you can use the KMS key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     * parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't
     * change the <code>KeyUsage</code> value after the KMS key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code> or
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyUsage
     *        Determines the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operations</a> for which you can use the KMS key. The default value is
     *        <code>ENCRYPT_DECRYPT</code>. This parameter is optional when you are creating a symmetric encryption KMS
     *        key; otherwise, it is required. You can't change the <code>KeyUsage</code> value after the KMS key is
     *        created.</p>
     *        <p>
     *        Select only one valid value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code>
     *        or <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public CreateKeyRequest withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * Determines the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> for which you can use the KMS key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     * parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't
     * change the <code>KeyUsage</code> value after the KMS key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code> or
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyUsage
     *        Determines the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operations</a> for which you can use the KMS key. The default value is
     *        <code>ENCRYPT_DECRYPT</code>. This parameter is optional when you are creating a symmetric encryption KMS
     *        key; otherwise, it is required. You can't change the <code>KeyUsage</code> value after the KMS key is
     *        created.</p>
     *        <p>
     *        Select only one valid value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code>
     *        or <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     * @see KeyUsageType
     */

    public void setKeyUsage(KeyUsageType keyUsage) {
        withKeyUsage(keyUsage);
    }

    /**
     * <p>
     * Determines the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> for which you can use the KMS key. The default value is <code>ENCRYPT_DECRYPT</code>. This
     * parameter is optional when you are creating a symmetric encryption KMS key; otherwise, it is required. You can't
     * change the <code>KeyUsage</code> value after the KMS key is created.
     * </p>
     * <p>
     * Select only one valid value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code> or
     * <code>SIGN_VERIFY</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyUsage
     *        Determines the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations"
     *        >cryptographic operations</a> for which you can use the KMS key. The default value is
     *        <code>ENCRYPT_DECRYPT</code>. This parameter is optional when you are creating a symmetric encryption KMS
     *        key; otherwise, it is required. You can't change the <code>KeyUsage</code> value after the KMS key is
     *        created.</p>
     *        <p>
     *        Select only one valid value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For symmetric encryption KMS keys, omit the parameter or specify <code>ENCRYPT_DECRYPT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For HMAC KMS keys (symmetric), specify <code>GENERATE_VERIFY_MAC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with RSA key material, specify <code>ENCRYPT_DECRYPT</code> or
     *        <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with ECC key material, specify <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For asymmetric KMS keys with SM2 key material (China Regions only), specify <code>ENCRYPT_DECRYPT</code>
     *        or <code>SIGN_VERIFY</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public CreateKeyRequest withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the names
     * differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid breaking
     * changes, KMS supports both parameters.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        Instead, use the <code>KeySpec</code> parameter.</p>
     *        <p>
     *        The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the
     *        names differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid
     *        breaking changes, KMS supports both parameters.
     * @see CustomerMasterKeySpec
     */
    @Deprecated
    public void setCustomerMasterKeySpec(String customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the names
     * differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid breaking
     * changes, KMS supports both parameters.
     * </p>
     * 
     * @return Instead, use the <code>KeySpec</code> parameter.</p>
     *         <p>
     *         The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the
     *         names differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid
     *         breaking changes, KMS supports both parameters.
     * @see CustomerMasterKeySpec
     */
    @Deprecated
    public String getCustomerMasterKeySpec() {
        return this.customerMasterKeySpec;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the names
     * differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid breaking
     * changes, KMS supports both parameters.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        Instead, use the <code>KeySpec</code> parameter.</p>
     *        <p>
     *        The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the
     *        names differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid
     *        breaking changes, KMS supports both parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerMasterKeySpec
     */
    @Deprecated
    public CreateKeyRequest withCustomerMasterKeySpec(String customerMasterKeySpec) {
        setCustomerMasterKeySpec(customerMasterKeySpec);
        return this;
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the names
     * differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid breaking
     * changes, KMS supports both parameters.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        Instead, use the <code>KeySpec</code> parameter.</p>
     *        <p>
     *        The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the
     *        names differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid
     *        breaking changes, KMS supports both parameters.
     * @see CustomerMasterKeySpec
     */
    @Deprecated
    public void setCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        withCustomerMasterKeySpec(customerMasterKeySpec);
    }

    /**
     * <p>
     * Instead, use the <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the names
     * differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid breaking
     * changes, KMS supports both parameters.
     * </p>
     * 
     * @param customerMasterKeySpec
     *        Instead, use the <code>KeySpec</code> parameter.</p>
     *        <p>
     *        The <code>KeySpec</code> and <code>CustomerMasterKeySpec</code> parameters work the same way. Only the
     *        names differ. We recommend that you use <code>KeySpec</code> parameter in your code. However, to avoid
     *        breaking changes, KMS supports both parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomerMasterKeySpec
     */
    @Deprecated
    public CreateKeyRequest withCustomerMasterKeySpec(CustomerMasterKeySpec customerMasterKeySpec) {
        this.customerMasterKeySpec = customerMasterKeySpec.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS key
     * with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates
     * a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a KMS key
     * type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key pair. It
     * also determines the algorithms that the KMS key supports. You can't change the <code>KeySpec</code> after the KMS
     * key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its
     * key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that are
     * integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not support
     * asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keySpec
     *        Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS
     *        key with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where
     *        it creates a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS
     *        key, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a
     *        KMS key type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.</p>
     *        <p>
     *        The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key
     *        pair. It also determines the algorithms that the KMS key supports. You can't change the
     *        <code>KeySpec</code> after the KMS key is created. To further restrict the algorithms that can be used
     *        with the KMS key, use a condition key in its key policy or IAM policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *        >kms:EncryptionAlgorithm</a>, <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *        >kms:MacAlgorithm</a> or <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *        >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        <important>
     *        <p>
     *        <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that
     *        are integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not
     *        support asymmetric KMS keys or HMAC KMS keys.
     *        </p>
     *        </important>
     *        <p>
     *        KMS supports the following key specs for KMS keys:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Symmetric encryption key (default)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYMMETRIC_DEFAULT</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        HMAC keys (symmetric)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HMAC_224</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_256</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_384</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_512</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric RSA key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RSA_2048</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_3072</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_4096</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric NIST-recommended elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P256</code> (secp256r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P384</code> (secp384r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P521</code> (secp521r1)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Other asymmetric elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        SM2 key pairs (China Regions only)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SM2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see KeySpec
     */

    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS key
     * with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates
     * a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a KMS key
     * type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key pair. It
     * also determines the algorithms that the KMS key supports. You can't change the <code>KeySpec</code> after the KMS
     * key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its
     * key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that are
     * integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not support
     * asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS
     *         key with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where
     *         it creates a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS
     *         key, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a
     *         KMS key type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.</p>
     *         <p>
     *         The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key
     *         pair. It also determines the algorithms that the KMS key supports. You can't change the
     *         <code>KeySpec</code> after the KMS key is created. To further restrict the algorithms that can be used
     *         with the KMS key, use a condition key in its key policy or IAM policy. For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *         >kms:EncryptionAlgorithm</a>, <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *         >kms:MacAlgorithm</a> or <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *         >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         <important>
     *         <p>
     *         <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that
     *         are integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not
     *         support asymmetric KMS keys or HMAC KMS keys.
     *         </p>
     *         </important>
     *         <p>
     *         KMS supports the following key specs for KMS keys:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Symmetric encryption key (default)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SYMMETRIC_DEFAULT</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         HMAC keys (symmetric)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HMAC_224</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HMAC_256</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HMAC_384</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HMAC_512</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Asymmetric RSA key pairs
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RSA_2048</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RSA_3072</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RSA_4096</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Asymmetric NIST-recommended elliptic curve key pairs
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ECC_NIST_P256</code> (secp256r1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ECC_NIST_P384</code> (secp384r1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ECC_NIST_P521</code> (secp521r1)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Other asymmetric elliptic curve key pairs
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         SM2 key pairs (China Regions only)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SM2</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see KeySpec
     */

    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS key
     * with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates
     * a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a KMS key
     * type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key pair. It
     * also determines the algorithms that the KMS key supports. You can't change the <code>KeySpec</code> after the KMS
     * key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its
     * key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that are
     * integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not support
     * asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keySpec
     *        Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS
     *        key with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where
     *        it creates a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS
     *        key, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a
     *        KMS key type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.</p>
     *        <p>
     *        The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key
     *        pair. It also determines the algorithms that the KMS key supports. You can't change the
     *        <code>KeySpec</code> after the KMS key is created. To further restrict the algorithms that can be used
     *        with the KMS key, use a condition key in its key policy or IAM policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *        >kms:EncryptionAlgorithm</a>, <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *        >kms:MacAlgorithm</a> or <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *        >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        <important>
     *        <p>
     *        <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that
     *        are integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not
     *        support asymmetric KMS keys or HMAC KMS keys.
     *        </p>
     *        </important>
     *        <p>
     *        KMS supports the following key specs for KMS keys:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Symmetric encryption key (default)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYMMETRIC_DEFAULT</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        HMAC keys (symmetric)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HMAC_224</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_256</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_384</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_512</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric RSA key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RSA_2048</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_3072</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_4096</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric NIST-recommended elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P256</code> (secp256r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P384</code> (secp384r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P521</code> (secp521r1)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Other asymmetric elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        SM2 key pairs (China Regions only)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SM2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeySpec
     */

    public CreateKeyRequest withKeySpec(String keySpec) {
        setKeySpec(keySpec);
        return this;
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS key
     * with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates
     * a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a KMS key
     * type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key pair. It
     * also determines the algorithms that the KMS key supports. You can't change the <code>KeySpec</code> after the KMS
     * key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its
     * key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that are
     * integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not support
     * asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keySpec
     *        Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS
     *        key with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where
     *        it creates a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS
     *        key, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a
     *        KMS key type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.</p>
     *        <p>
     *        The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key
     *        pair. It also determines the algorithms that the KMS key supports. You can't change the
     *        <code>KeySpec</code> after the KMS key is created. To further restrict the algorithms that can be used
     *        with the KMS key, use a condition key in its key policy or IAM policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *        >kms:EncryptionAlgorithm</a>, <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *        >kms:MacAlgorithm</a> or <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *        >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        <important>
     *        <p>
     *        <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that
     *        are integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not
     *        support asymmetric KMS keys or HMAC KMS keys.
     *        </p>
     *        </important>
     *        <p>
     *        KMS supports the following key specs for KMS keys:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Symmetric encryption key (default)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYMMETRIC_DEFAULT</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        HMAC keys (symmetric)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HMAC_224</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_256</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_384</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_512</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric RSA key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RSA_2048</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_3072</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_4096</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric NIST-recommended elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P256</code> (secp256r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P384</code> (secp384r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P521</code> (secp521r1)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Other asymmetric elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        SM2 key pairs (China Regions only)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SM2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see KeySpec
     */

    public void setKeySpec(KeySpec keySpec) {
        withKeySpec(keySpec);
    }

    /**
     * <p>
     * Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS key
     * with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where it creates
     * a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a KMS key
     * type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key pair. It
     * also determines the algorithms that the KMS key supports. You can't change the <code>KeySpec</code> after the KMS
     * key is created. To further restrict the algorithms that can be used with the KMS key, use a condition key in its
     * key policy or IAM policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     * >kms:EncryptionAlgorithm</a>, <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     * >kms:MacAlgorithm</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     * >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that are
     * integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not support
     * asymmetric KMS keys or HMAC KMS keys.
     * </p>
     * </important>
     * <p>
     * KMS supports the following key specs for KMS keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption key (default)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * HMAC keys (symmetric)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HMAC_224</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HMAC_512</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric RSA key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Asymmetric NIST-recommended elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_NIST_P256</code> (secp256r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P384</code> (secp384r1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ECC_NIST_P521</code> (secp521r1)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Other asymmetric elliptic curve key pairs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * SM2 key pairs (China Regions only)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SM2</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param keySpec
     *        Specifies the type of KMS key to create. The default value, <code>SYMMETRIC_DEFAULT</code>, creates a KMS
     *        key with a 256-bit AES-GCM key that is used for encryption and decryption, except in China Regions, where
     *        it creates a 128-bit symmetric key that uses SM4 encryption. For help choosing a key spec for your KMS
     *        key, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html#symm-asymm-choose">Choosing a
     *        KMS key type</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.</p>
     *        <p>
     *        The <code>KeySpec</code> determines whether the KMS key contains a symmetric key or an asymmetric key
     *        pair. It also determines the algorithms that the KMS key supports. You can't change the
     *        <code>KeySpec</code> after the KMS key is created. To further restrict the algorithms that can be used
     *        with the KMS key, use a condition key in its key policy or IAM policy. For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-encryption-algorithm"
     *        >kms:EncryptionAlgorithm</a>, <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-mac-algorithm"
     *        >kms:MacAlgorithm</a> or <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/policy-conditions.html#conditions-kms-signing-algorithm"
     *        >kms:Signing Algorithm</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        <important>
     *        <p>
     *        <a href="http://aws.amazon.com/kms/features/#AWS_Service_Integration">Amazon Web Services services that
     *        are integrated with KMS</a> use symmetric encryption KMS keys to protect your data. These services do not
     *        support asymmetric KMS keys or HMAC KMS keys.
     *        </p>
     *        </important>
     *        <p>
     *        KMS supports the following key specs for KMS keys:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Symmetric encryption key (default)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SYMMETRIC_DEFAULT</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        HMAC keys (symmetric)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HMAC_224</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_256</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_384</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HMAC_512</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric RSA key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RSA_2048</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_3072</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RSA_4096</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Asymmetric NIST-recommended elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P256</code> (secp256r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P384</code> (secp384r1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ECC_NIST_P521</code> (secp521r1)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Other asymmetric elliptic curve key pairs
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ECC_SECG_P256K1</code> (secp256k1), commonly used for cryptocurrencies.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        SM2 key pairs (China Regions only)
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SM2</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeySpec
     */

    public CreateKeyRequest withKeySpec(KeySpec keySpec) {
        this.keySpec = keySpec.toString();
        return this;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The
     * default is <code>AWS_KMS</code>, which means that KMS creates the key material.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a KMS
     * key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value is valid only for
     * symmetric KMS keys.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS key in
     * an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this value to
     * <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to identify the CloudHSM
     * key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key in an
     * external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     * parameter to identify the associated external key. The <code>KeySpec</code> value must be
     * <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * 
     * @param origin
     *        The source of the key material for the KMS key. You cannot change the origin after you create the KMS key.
     *        The default is <code>AWS_KMS</code>, which means that KMS creates the key material.</p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a
     *        KMS key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For
     *        more information about importing key material into KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key
     *        Material</a> in the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value
     *        is valid only for symmetric KMS keys.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS
     *        key in an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this
     *        value to <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to
     *        identify the CloudHSM key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key
     *        in an external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     *        parameter to identify the associated external key. The <code>KeySpec</code> value must be
     *        <code>SYMMETRIC_DEFAULT</code>.
     * @see OriginType
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The
     * default is <code>AWS_KMS</code>, which means that KMS creates the key material.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a KMS
     * key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value is valid only for
     * symmetric KMS keys.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS key in
     * an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this value to
     * <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to identify the CloudHSM
     * key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key in an
     * external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     * parameter to identify the associated external key. The <code>KeySpec</code> value must be
     * <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * 
     * @return The source of the key material for the KMS key. You cannot change the origin after you create the KMS
     *         key. The default is <code>AWS_KMS</code>, which means that KMS creates the key material.</p>
     *         <p>
     *         To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create
     *         a KMS key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>.
     *         For more information about importing key material into KMS, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key
     *         Material</a> in the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value
     *         is valid only for symmetric KMS keys.
     *         </p>
     *         <p>
     *         To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS
     *         key in an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this
     *         value to <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to
     *         identify the CloudHSM key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     *         </p>
     *         <p>
     *         To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key
     *         in an external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     *         <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     *         parameter to identify the associated external key. The <code>KeySpec</code> value must be
     *         <code>SYMMETRIC_DEFAULT</code>.
     * @see OriginType
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The
     * default is <code>AWS_KMS</code>, which means that KMS creates the key material.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a KMS
     * key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value is valid only for
     * symmetric KMS keys.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS key in
     * an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this value to
     * <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to identify the CloudHSM
     * key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key in an
     * external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     * parameter to identify the associated external key. The <code>KeySpec</code> value must be
     * <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * 
     * @param origin
     *        The source of the key material for the KMS key. You cannot change the origin after you create the KMS key.
     *        The default is <code>AWS_KMS</code>, which means that KMS creates the key material.</p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a
     *        KMS key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For
     *        more information about importing key material into KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key
     *        Material</a> in the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value
     *        is valid only for symmetric KMS keys.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS
     *        key in an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this
     *        value to <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to
     *        identify the CloudHSM key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key
     *        in an external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     *        parameter to identify the associated external key. The <code>KeySpec</code> value must be
     *        <code>SYMMETRIC_DEFAULT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public CreateKeyRequest withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The
     * default is <code>AWS_KMS</code>, which means that KMS creates the key material.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a KMS
     * key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value is valid only for
     * symmetric KMS keys.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS key in
     * an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this value to
     * <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to identify the CloudHSM
     * key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key in an
     * external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     * parameter to identify the associated external key. The <code>KeySpec</code> value must be
     * <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * 
     * @param origin
     *        The source of the key material for the KMS key. You cannot change the origin after you create the KMS key.
     *        The default is <code>AWS_KMS</code>, which means that KMS creates the key material.</p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a
     *        KMS key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For
     *        more information about importing key material into KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key
     *        Material</a> in the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value
     *        is valid only for symmetric KMS keys.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS
     *        key in an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this
     *        value to <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to
     *        identify the CloudHSM key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key
     *        in an external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     *        parameter to identify the associated external key. The <code>KeySpec</code> value must be
     *        <code>SYMMETRIC_DEFAULT</code>.
     * @see OriginType
     */

    public void setOrigin(OriginType origin) {
        withOrigin(origin);
    }

    /**
     * <p>
     * The source of the key material for the KMS key. You cannot change the origin after you create the KMS key. The
     * default is <code>AWS_KMS</code>, which means that KMS creates the key material.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a KMS
     * key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value is valid only for
     * symmetric KMS keys.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS key in
     * an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this value to
     * <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to identify the CloudHSM
     * key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * <p>
     * To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key in an
     * external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     * parameter to identify the associated external key. The <code>KeySpec</code> value must be
     * <code>SYMMETRIC_DEFAULT</code>.
     * </p>
     * 
     * @param origin
     *        The source of the key material for the KMS key. You cannot change the origin after you create the KMS key.
     *        The default is <code>AWS_KMS</code>, which means that KMS creates the key material.</p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-create-cmk.html">create a
     *        KMS key with no key material</a> (for imported key material), set this value to <code>EXTERNAL</code>. For
     *        more information about importing key material into KMS, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key
     *        Material</a> in the <i>Key Management Service Developer Guide</i>. The <code>EXTERNAL</code> origin value
     *        is valid only for symmetric KMS keys.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html">create a KMS
     *        key in an CloudHSM key store</a> and create its key material in the associated CloudHSM cluster, set this
     *        value to <code>AWS_CLOUDHSM</code>. You must also use the <code>CustomKeyStoreId</code> parameter to
     *        identify the CloudHSM key store. The <code>KeySpec</code> value must be <code>SYMMETRIC_DEFAULT</code>.
     *        </p>
     *        <p>
     *        To <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keys.html">create a KMS key
     *        in an external key store</a>, set this value to <code>EXTERNAL_KEY_STORE</code>. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the external key store and the <code>XksKeyId</code>
     *        parameter to identify the associated external key. The <code>KeySpec</code> value must be
     *        <code>SYMMETRIC_DEFAULT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public CreateKeyRequest withOrigin(OriginType origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * Creates the KMS key in the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To find the
     * CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any other
     * type of KMS key in a custom key store.
     * </p>
     * <p>
     * When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key in its
     * associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an external key
     * store, you must use the <code>XksKeyId</code> parameter to specify an external key that serves as key material
     * for the KMS key.
     * </p>
     * 
     * @param customKeyStoreId
     *        Creates the KMS key in the specified <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     *        store</a>. The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To
     *        find the CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.</p>
     *        <p>
     *        This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any
     *        other type of KMS key in a custom key store.
     *        </p>
     *        <p>
     *        When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key
     *        in its associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an
     *        external key store, you must use the <code>XksKeyId</code> parameter to specify an external key that
     *        serves as key material for the KMS key.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Creates the KMS key in the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To find the
     * CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any other
     * type of KMS key in a custom key store.
     * </p>
     * <p>
     * When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key in its
     * associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an external key
     * store, you must use the <code>XksKeyId</code> parameter to specify an external key that serves as key material
     * for the KMS key.
     * </p>
     * 
     * @return Creates the KMS key in the specified <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     *         store</a>. The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To
     *         find the CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any
     *         other type of KMS key in a custom key store.
     *         </p>
     *         <p>
     *         When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key
     *         in its associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an
     *         external key store, you must use the <code>XksKeyId</code> parameter to specify an external key that
     *         serves as key material for the KMS key.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Creates the KMS key in the specified <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To find the
     * CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any other
     * type of KMS key in a custom key store.
     * </p>
     * <p>
     * When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key in its
     * associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an external key
     * store, you must use the <code>XksKeyId</code> parameter to specify an external key that serves as key material
     * for the KMS key.
     * </p>
     * 
     * @param customKeyStoreId
     *        Creates the KMS key in the specified <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     *        store</a>. The <code>ConnectionState</code> of the custom key store must be <code>CONNECTED</code>. To
     *        find the CustomKeyStoreID and ConnectionState use the <a>DescribeCustomKeyStores</a> operation.</p>
     *        <p>
     *        This parameter is valid only for symmetric encryption KMS keys in a single Region. You cannot create any
     *        other type of KMS key in a custom key store.
     *        </p>
     *        <p>
     *        When you create a KMS key in an CloudHSM key store, KMS generates a non-exportable 256-bit symmetric key
     *        in its associated CloudHSM cluster and associates it with the KMS key. When you create a KMS key in an
     *        external key store, you must use the <code>XksKeyId</code> parameter to specify an external key that
     *        serves as key material for the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value
     *        to true indiscriminately.
     *        </p>
     *        <p>
     *        For more information, refer to the scenario in the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *        that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     *        </p>
     *        <p>
     *        The default value is false.
     */

    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this
     *         value to true indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *         that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     *         </p>
     *         <p>
     *         The default value is false.
     */

    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value
     *        to true indiscriminately.
     *        </p>
     *        <p>
     *        For more information, refer to the scenario in the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *        that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     *        </p>
     *        <p>
     *        The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        setBypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck);
        return this;
    }

    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this
     *         value to true indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *         that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the KMS key.
     *         </p>
     *         <p>
     *         The default value is false.
     */

    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag an
     * existing KMS key, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you
     * specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with
     * usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * 
     * @return Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag
     *         an existing KMS key, use the <a>TagResource</a> operation.</p> <note>
     *         <p>
     *         Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         To use this parameter, you must have <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *         >kms:TagResource</a> permission in an IAM policy.
     *         </p>
     *         <p>
     *         Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *         tag value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag
     *         key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value
     *         with the specified one.
     *         </p>
     *         <p>
     *         When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation
     *         report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For
     *         details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging
     *         Keys</a>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag an
     * existing KMS key, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you
     * specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with
     * usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag
     *        an existing KMS key, use the <a>TagResource</a> operation.</p> <note>
     *        <p>
     *        Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key
     *        Management Service Developer Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        To use this parameter, you must have <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *        >kms:TagResource</a> permission in an IAM policy.
     *        </p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag
     *        key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value
     *        with the specified one.
     *        </p>
     *        <p>
     *        When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation
     *        report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For
     *        details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging
     *        Keys</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag an
     * existing KMS key, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you
     * specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with
     * usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag
     *        an existing KMS key, use the <a>TagResource</a> operation.</p> <note>
     *        <p>
     *        Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key
     *        Management Service Developer Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        To use this parameter, you must have <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *        >kms:TagResource</a> permission in an IAM policy.
     *        </p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag
     *        key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value
     *        with the specified one.
     *        </p>
     *        <p>
     *        When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation
     *        report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For
     *        details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging
     *        Keys</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag an
     * existing KMS key, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag key. If you
     * specify an existing tag key with a different tag value, KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation report with
     * usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the KMS key. Use this parameter to tag the KMS key when it is created. To tag
     *        an existing KMS key, use the <a>TagResource</a> operation.</p> <note>
     *        <p>
     *        Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key
     *        Management Service Developer Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        To use this parameter, you must have <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *        >kms:TagResource</a> permission in an IAM policy.
     *        </p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You cannot have more than one tag on a KMS key with the same tag
     *        key. If you specify an existing tag key with a different tag value, KMS replaces the current tag value
     *        with the specified one.
     *        </p>
     *        <p>
     *        When you add tags to an Amazon Web Services resource, Amazon Web Services generates a cost allocation
     *        report with usage and costs aggregated by tags. Tags can also be used to control access to a KMS key. For
     *        details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging
     *        Keys</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You cannot
     * change this value after you create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this parameter
     * or set it to <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     * <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with imported
     * key material. However, you cannot create a multi-Region key in a custom key store.
     * </p>
     * 
     * @param multiRegion
     *        Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You
     *        cannot change this value after you create the KMS key. </p>
     *        <p>
     *        For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this
     *        parameter or set it to <code>False</code>. The default value is <code>False</code>.
     *        </p>
     *        <p>
     *        This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple
     *        interoperable KMS keys in different Amazon Web Services Regions. Because these KMS keys have the same key
     *        ID, key material, and other metadata, you can use them interchangeably to encrypt data in one Amazon Web
     *        Services Region and decrypt it in a different Amazon Web Services Region without re-encrypting the data or
     *        making a cross-Region call. For more information about multi-Region keys, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region
     *        keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     *        <a>ReplicateKey</a> operation.
     *        </p>
     *        <p>
     *        You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with
     *        imported key material. However, you cannot create a multi-Region key in a custom key store.
     */

    public void setMultiRegion(Boolean multiRegion) {
        this.multiRegion = multiRegion;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You cannot
     * change this value after you create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this parameter
     * or set it to <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     * <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with imported
     * key material. However, you cannot create a multi-Region key in a custom key store.
     * </p>
     * 
     * @return Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You
     *         cannot change this value after you create the KMS key. </p>
     *         <p>
     *         For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this
     *         parameter or set it to <code>False</code>. The default value is <code>False</code>.
     *         </p>
     *         <p>
     *         This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple
     *         interoperable KMS keys in different Amazon Web Services Regions. Because these KMS keys have the same key
     *         ID, key material, and other metadata, you can use them interchangeably to encrypt data in one Amazon Web
     *         Services Region and decrypt it in a different Amazon Web Services Region without re-encrypting the data
     *         or making a cross-Region call. For more information about multi-Region keys, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region
     *         keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     *         <a>ReplicateKey</a> operation.
     *         </p>
     *         <p>
     *         You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with
     *         imported key material. However, you cannot create a multi-Region key in a custom key store.
     */

    public Boolean getMultiRegion() {
        return this.multiRegion;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You cannot
     * change this value after you create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this parameter
     * or set it to <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     * <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with imported
     * key material. However, you cannot create a multi-Region key in a custom key store.
     * </p>
     * 
     * @param multiRegion
     *        Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You
     *        cannot change this value after you create the KMS key. </p>
     *        <p>
     *        For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this
     *        parameter or set it to <code>False</code>. The default value is <code>False</code>.
     *        </p>
     *        <p>
     *        This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple
     *        interoperable KMS keys in different Amazon Web Services Regions. Because these KMS keys have the same key
     *        ID, key material, and other metadata, you can use them interchangeably to encrypt data in one Amazon Web
     *        Services Region and decrypt it in a different Amazon Web Services Region without re-encrypting the data or
     *        making a cross-Region call. For more information about multi-Region keys, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region
     *        keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     *        <a>ReplicateKey</a> operation.
     *        </p>
     *        <p>
     *        You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with
     *        imported key material. However, you cannot create a multi-Region key in a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withMultiRegion(Boolean multiRegion) {
        setMultiRegion(multiRegion);
        return this;
    }

    /**
     * <p>
     * Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You cannot
     * change this value after you create the KMS key.
     * </p>
     * <p>
     * For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this parameter
     * or set it to <code>False</code>. The default value is <code>False</code>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     * <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with imported
     * key material. However, you cannot create a multi-Region key in a custom key store.
     * </p>
     * 
     * @return Creates a multi-Region primary key that you can replicate into other Amazon Web Services Regions. You
     *         cannot change this value after you create the KMS key. </p>
     *         <p>
     *         For a multi-Region key, set this parameter to <code>True</code>. For a single-Region KMS key, omit this
     *         parameter or set it to <code>False</code>. The default value is <code>False</code>.
     *         </p>
     *         <p>
     *         This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple
     *         interoperable KMS keys in different Amazon Web Services Regions. Because these KMS keys have the same key
     *         ID, key material, and other metadata, you can use them interchangeably to encrypt data in one Amazon Web
     *         Services Region and decrypt it in a different Amazon Web Services Region without re-encrypting the data
     *         or making a cross-Region call. For more information about multi-Region keys, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region
     *         keys in KMS</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         This value creates a <i>primary key</i>, not a replica. To create a <i>replica key</i>, use the
     *         <a>ReplicateKey</a> operation.
     *         </p>
     *         <p>
     *         You can create a symmetric or asymmetric multi-Region key, and you can create a multi-Region key with
     *         imported key material. However, you cannot create a multi-Region key in a custom key store.
     */

    public Boolean isMultiRegion() {
        return this.multiRegion;
    }

    /**
     * <p>
     * Identifies the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key">external
     * key</a> that serves as key material for the KMS key in an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key store</a>.
     * Specify the ID that the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy">external
     * key store proxy</a> uses to refer to the external key. For help, see the documentation for your external key
     * store proxy.
     * </p>
     * <p>
     * This parameter is required for a KMS key with an <code>Origin</code> value of <code>EXTERNAL_KEY_STORE</code>. It
     * is not valid for KMS keys with any other <code>Origin</code> value.
     * </p>
     * <p>
     * The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web Services
     * in an external key manager associated with the external key store specified by the <code>CustomKeyStoreId</code>
     * parameter. This key must be enabled and configured to perform encryption and decryption. Each KMS key in an
     * external key store must use a different external key. For details, see <a
     * href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS key in an
     * external key store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Each KMS key in an external key store is associated two backing keys. One is key material that KMS generates. The
     * other is the external key specified by this parameter. When you use the KMS key in an external key store to
     * encrypt data, the encryption operation is performed first by KMS using the KMS key material, and then by the
     * external key manager using the specified external key, a process known as <i>double encryption</i>. For details,
     * see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     * >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param xksKeyId
     *        Identifies the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key"
     *        >external key</a> that serves as key material for the KMS key in an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key
     *        store</a>. Specify the ID that the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy"
     *        >external key store proxy</a> uses to refer to the external key. For help, see the documentation for your
     *        external key store proxy.</p>
     *        <p>
     *        This parameter is required for a KMS key with an <code>Origin</code> value of
     *        <code>EXTERNAL_KEY_STORE</code>. It is not valid for KMS keys with any other <code>Origin</code> value.
     *        </p>
     *        <p>
     *        The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web
     *        Services in an external key manager associated with the external key store specified by the
     *        <code>CustomKeyStoreId</code> parameter. This key must be enabled and configured to perform encryption and
     *        decryption. Each KMS key in an external key store must use a different external key. For details, see <a
     *        href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS key in
     *        an external key store</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each KMS key in an external key store is associated two backing keys. One is key material that KMS
     *        generates. The other is the external key specified by this parameter. When you use the KMS key in an
     *        external key store to encrypt data, the encryption operation is performed first by KMS using the KMS key
     *        material, and then by the external key manager using the specified external key, a process known as
     *        <i>double encryption</i>. For details, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     *        >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setXksKeyId(String xksKeyId) {
        this.xksKeyId = xksKeyId;
    }

    /**
     * <p>
     * Identifies the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key">external
     * key</a> that serves as key material for the KMS key in an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key store</a>.
     * Specify the ID that the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy">external
     * key store proxy</a> uses to refer to the external key. For help, see the documentation for your external key
     * store proxy.
     * </p>
     * <p>
     * This parameter is required for a KMS key with an <code>Origin</code> value of <code>EXTERNAL_KEY_STORE</code>. It
     * is not valid for KMS keys with any other <code>Origin</code> value.
     * </p>
     * <p>
     * The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web Services
     * in an external key manager associated with the external key store specified by the <code>CustomKeyStoreId</code>
     * parameter. This key must be enabled and configured to perform encryption and decryption. Each KMS key in an
     * external key store must use a different external key. For details, see <a
     * href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS key in an
     * external key store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Each KMS key in an external key store is associated two backing keys. One is key material that KMS generates. The
     * other is the external key specified by this parameter. When you use the KMS key in an external key store to
     * encrypt data, the encryption operation is performed first by KMS using the KMS key material, and then by the
     * external key manager using the specified external key, a process known as <i>double encryption</i>. For details,
     * see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     * >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Identifies the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key"
     *         >external key</a> that serves as key material for the KMS key in an <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key
     *         store</a>. Specify the ID that the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy"
     *         >external key store proxy</a> uses to refer to the external key. For help, see the documentation for your
     *         external key store proxy.</p>
     *         <p>
     *         This parameter is required for a KMS key with an <code>Origin</code> value of
     *         <code>EXTERNAL_KEY_STORE</code>. It is not valid for KMS keys with any other <code>Origin</code> value.
     *         </p>
     *         <p>
     *         The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web
     *         Services in an external key manager associated with the external key store specified by the
     *         <code>CustomKeyStoreId</code> parameter. This key must be enabled and configured to perform encryption
     *         and decryption. Each KMS key in an external key store must use a different external key. For details, see
     *         <a href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS
     *         key in an external key store</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         Each KMS key in an external key store is associated two backing keys. One is key material that KMS
     *         generates. The other is the external key specified by this parameter. When you use the KMS key in an
     *         external key store to encrypt data, the encryption operation is performed first by KMS using the KMS key
     *         material, and then by the external key manager using the specified external key, a process known as
     *         <i>double encryption</i>. For details, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     *         >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public String getXksKeyId() {
        return this.xksKeyId;
    }

    /**
     * <p>
     * Identifies the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key">external
     * key</a> that serves as key material for the KMS key in an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key store</a>.
     * Specify the ID that the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy">external
     * key store proxy</a> uses to refer to the external key. For help, see the documentation for your external key
     * store proxy.
     * </p>
     * <p>
     * This parameter is required for a KMS key with an <code>Origin</code> value of <code>EXTERNAL_KEY_STORE</code>. It
     * is not valid for KMS keys with any other <code>Origin</code> value.
     * </p>
     * <p>
     * The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web Services
     * in an external key manager associated with the external key store specified by the <code>CustomKeyStoreId</code>
     * parameter. This key must be enabled and configured to perform encryption and decryption. Each KMS key in an
     * external key store must use a different external key. For details, see <a
     * href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS key in an
     * external key store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Each KMS key in an external key store is associated two backing keys. One is key material that KMS generates. The
     * other is the external key specified by this parameter. When you use the KMS key in an external key store to
     * encrypt data, the encryption operation is performed first by KMS using the KMS key material, and then by the
     * external key manager using the specified external key, a process known as <i>double encryption</i>. For details,
     * see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     * >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param xksKeyId
     *        Identifies the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-external-key"
     *        >external key</a> that serves as key material for the KMS key in an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key
     *        store</a>. Specify the ID that the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-xks-proxy"
     *        >external key store proxy</a> uses to refer to the external key. For help, see the documentation for your
     *        external key store proxy.</p>
     *        <p>
     *        This parameter is required for a KMS key with an <code>Origin</code> value of
     *        <code>EXTERNAL_KEY_STORE</code>. It is not valid for KMS keys with any other <code>Origin</code> value.
     *        </p>
     *        <p>
     *        The external key must be an existing 256-bit AES symmetric encryption key hosted outside of Amazon Web
     *        Services in an external key manager associated with the external key store specified by the
     *        <code>CustomKeyStoreId</code> parameter. This key must be enabled and configured to perform encryption and
     *        decryption. Each KMS key in an external key store must use a different external key. For details, see <a
     *        href="https://docs.aws.amazon.com/create-xks-keys.html#xks-key-requirements">Requirements for a KMS key in
     *        an external key store</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Each KMS key in an external key store is associated two backing keys. One is key material that KMS
     *        generates. The other is the external key specified by this parameter. When you use the KMS key in an
     *        external key store to encrypt data, the encryption operation is performed first by KMS using the KMS key
     *        material, and then by the external key manager using the specified external key, a process known as
     *        <i>double encryption</i>. For details, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html#concept-double-encryption"
     *        >Double encryption</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withXksKeyId(String xksKeyId) {
        setXksKeyId(xksKeyId);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getCustomerMasterKeySpec() != null)
            sb.append("CustomerMasterKeySpec: ").append(getCustomerMasterKeySpec()).append(",");
        if (getKeySpec() != null)
            sb.append("KeySpec: ").append(getKeySpec()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId()).append(",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: ").append(getBypassPolicyLockoutSafetyCheck()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getMultiRegion() != null)
            sb.append("MultiRegion: ").append(getMultiRegion()).append(",");
        if (getXksKeyId() != null)
            sb.append("XksKeyId: ").append(getXksKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getCustomerMasterKeySpec() == null ^ this.getCustomerMasterKeySpec() == null)
            return false;
        if (other.getCustomerMasterKeySpec() != null && other.getCustomerMasterKeySpec().equals(this.getCustomerMasterKeySpec()) == false)
            return false;
        if (other.getKeySpec() == null ^ this.getKeySpec() == null)
            return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getMultiRegion() == null ^ this.getMultiRegion() == null)
            return false;
        if (other.getMultiRegion() != null && other.getMultiRegion().equals(this.getMultiRegion()) == false)
            return false;
        if (other.getXksKeyId() == null ^ this.getXksKeyId() == null)
            return false;
        if (other.getXksKeyId() != null && other.getXksKeyId().equals(this.getXksKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getCustomerMasterKeySpec() == null) ? 0 : getCustomerMasterKeySpec().hashCode());
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0 : getBypassPolicyLockoutSafetyCheck().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getMultiRegion() == null) ? 0 : getMultiRegion().hashCode());
        hashCode = prime * hashCode + ((getXksKeyId() == null) ? 0 : getXksKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyRequest clone() {
        return (CreateKeyRequest) super.clone();
    }

}
