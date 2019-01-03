/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the <a
     * href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size limit is 32 kilobytes (32768 bytes).
     * </p>
     */
    private String policy;
    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate for a task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     */
    private String keyUsage;
    /**
     * <p>
     * The source of the CMK's key material. You cannot change the origin after you create the CMK.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you can
     * import key material from your existing key management infrastructure. For more information about importing key
     * material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and
     * creates its key material in the associated AWS CloudHSM cluster. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * </p>
     */
    private String origin;
    /**
     * <p>
     * Creates the CMK in the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and the
     * key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster that is
     * associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in
     * the Region.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;
    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but
     * tag values can be empty (null) strings.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag
     * the CMK after it is created using <a>TagResource</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the <a
     * href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size limit is 32 kilobytes (32768 bytes).
     * </p>
     * 
     * @param policy
     *        The key policy to attach to the CMK.</p>
     *        <p>
     *        If you provide a key policy, it must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the
     *        principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     *        request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer
     *        to the scenario in the <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or
     *        role), you might need to enforce a delay before including the new principal in a key policy because the
     *        new principal might not be immediately visible to AWS KMS. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management
     *        User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *        Key Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        The key policy size limit is 32 kilobytes (32768 bytes).
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the <a
     * href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size limit is 32 kilobytes (32768 bytes).
     * </p>
     * 
     * @return The key policy to attach to the CMK.</p>
     *         <p>
     *         If you provide a key policy, it must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the
     *         principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     *         request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer
     *         to the scenario in the <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more principals. The principals in the key policy
     *         must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or
     *         role), you might need to enforce a delay before including the new principal in a key policy because the
     *         new principal might not be immediately visible to AWS KMS. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management
     *         User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *         Key Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         The key policy size limit is 32 kilobytes (32768 bytes).
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the principal
     * that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the <a
     * href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default Key
     * Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The key policy size limit is 32 kilobytes (32768 bytes).
     * </p>
     * 
     * @param policy
     *        The key policy to attach to the CMK.</p>
     *        <p>
     *        If you provide a key policy, it must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must allow the
     *        principal that is making the <code>CreateKey</code> request to make a subsequent <a>PutKeyPolicy</a>
     *        request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer
     *        to the scenario in the <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section of the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or
     *        role), you might need to enforce a delay before including the new principal in a key policy because the
     *        new principal might not be immediately visible to AWS KMS. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management
     *        User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">Default
     *        Key Policy</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        The key policy size limit is 32 kilobytes (32768 bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate for a task.
     * </p>
     * 
     * @param description
     *        A description of the CMK.</p>
     *        <p>
     *        Use a description that helps you decide whether the CMK is appropriate for a task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate for a task.
     * </p>
     * 
     * @return A description of the CMK.</p>
     *         <p>
     *         Use a description that helps you decide whether the CMK is appropriate for a task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the CMK.
     * </p>
     * <p>
     * Use a description that helps you decide whether the CMK is appropriate for a task.
     * </p>
     * 
     * @param description
     *        A description of the CMK.</p>
     *        <p>
     *        Use a description that helps you decide whether the CMK is appropriate for a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * 
     * @param keyUsage
     *        The intended use of the CMK.</p>
     *        <p>
     *        You can use CMKs only for symmetric encryption and decryption.
     * @see KeyUsageType
     */

    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * 
     * @return The intended use of the CMK.</p>
     *         <p>
     *         You can use CMKs only for symmetric encryption and decryption.
     * @see KeyUsageType
     */

    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * 
     * @param keyUsage
     *        The intended use of the CMK.</p>
     *        <p>
     *        You can use CMKs only for symmetric encryption and decryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public CreateKeyRequest withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * 
     * @param keyUsage
     *        The intended use of the CMK.</p>
     *        <p>
     *        You can use CMKs only for symmetric encryption and decryption.
     * @see KeyUsageType
     */

    public void setKeyUsage(KeyUsageType keyUsage) {
        withKeyUsage(keyUsage);
    }

    /**
     * <p>
     * The intended use of the CMK.
     * </p>
     * <p>
     * You can use CMKs only for symmetric encryption and decryption.
     * </p>
     * 
     * @param keyUsage
     *        The intended use of the CMK.</p>
     *        <p>
     *        You can use CMKs only for symmetric encryption and decryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public CreateKeyRequest withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material. You cannot change the origin after you create the CMK.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you can
     * import key material from your existing key management infrastructure. For more information about importing key
     * material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and
     * creates its key material in the associated AWS CloudHSM cluster. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. You cannot change the origin after you create the CMK.</p>
     *        <p>
     *        The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     *        </p>
     *        <p>
     *        When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you
     *        can import key material from your existing key management infrastructure. For more information about
     *        importing key material into AWS KMS, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a>
     *        in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        and creates its key material in the associated AWS CloudHSM cluster. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * @see OriginType
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the CMK's key material. You cannot change the origin after you create the CMK.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you can
     * import key material from your existing key management infrastructure. For more information about importing key
     * material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and
     * creates its key material in the associated AWS CloudHSM cluster. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * </p>
     * 
     * @return The source of the CMK's key material. You cannot change the origin after you create the CMK.</p>
     *         <p>
     *         The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     *         </p>
     *         <p>
     *         When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you
     *         can import key material from your existing key management infrastructure. For more information about
     *         importing key material into AWS KMS, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key
     *         Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *         and creates its key material in the associated AWS CloudHSM cluster. You must also use the
     *         <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * @see OriginType
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * The source of the CMK's key material. You cannot change the origin after you create the CMK.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you can
     * import key material from your existing key management infrastructure. For more information about importing key
     * material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and
     * creates its key material in the associated AWS CloudHSM cluster. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. You cannot change the origin after you create the CMK.</p>
     *        <p>
     *        The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     *        </p>
     *        <p>
     *        When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you
     *        can import key material from your existing key management infrastructure. For more information about
     *        importing key material into AWS KMS, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a>
     *        in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        and creates its key material in the associated AWS CloudHSM cluster. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public CreateKeyRequest withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material. You cannot change the origin after you create the CMK.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you can
     * import key material from your existing key management infrastructure. For more information about importing key
     * material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and
     * creates its key material in the associated AWS CloudHSM cluster. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. You cannot change the origin after you create the CMK.</p>
     *        <p>
     *        The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     *        </p>
     *        <p>
     *        When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you
     *        can import key material from your existing key management infrastructure. For more information about
     *        importing key material into AWS KMS, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a>
     *        in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        and creates its key material in the associated AWS CloudHSM cluster. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * @see OriginType
     */

    public void setOrigin(OriginType origin) {
        withOrigin(origin);
    }

    /**
     * <p>
     * The source of the CMK's key material. You cannot change the origin after you create the CMK.
     * </p>
     * <p>
     * The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     * </p>
     * <p>
     * When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you can
     * import key material from your existing key management infrastructure. For more information about importing key
     * material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and
     * creates its key material in the associated AWS CloudHSM cluster. You must also use the
     * <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. You cannot change the origin after you create the CMK.</p>
     *        <p>
     *        The default is <code>AWS_KMS</code>, which means AWS KMS creates the key material in its own key store.
     *        </p>
     *        <p>
     *        When the parameter value is <code>EXTERNAL</code>, AWS KMS creates a CMK without key material so that you
     *        can import key material from your existing key management infrastructure. For more information about
     *        importing key material into AWS KMS, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a>
     *        in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        When the parameter value is <code>AWS_CLOUDHSM</code>, AWS KMS creates the CMK in a AWS KMS <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        and creates its key material in the associated AWS CloudHSM cluster. You must also use the
     *        <code>CustomKeyStoreId</code> parameter to identify the custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public CreateKeyRequest withOrigin(OriginType origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * Creates the CMK in the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and the
     * key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster that is
     * associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in
     * the Region.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * 
     * @param customKeyStoreId
     *        Creates the CMK in the specified <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        and the key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you
     *        must also specify the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS
     *        CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in
     *        a different Availability Zone in the Region.</p>
     *        <p>
     *        To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     *        </p>
     *        <p>
     *        The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     *        </p>
     *        <p>
     *        This operation is part of the <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key
     *        Store feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS
     *        with the isolation and control of a single-tenant key store.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Creates the CMK in the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and the
     * key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster that is
     * associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in
     * the Region.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * 
     * @return Creates the CMK in the specified <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *         and the key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you
     *         must also specify the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS
     *         CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in
     *         a different Availability Zone in the Region.</p>
     *         <p>
     *         To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     *         <p>
     *         The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     *         </p>
     *         <p>
     *         This operation is part of the <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key
     *         Store feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS
     *         with the isolation and control of a single-tenant key store.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Creates the CMK in the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> and the
     * key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you must also specify
     * the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster that is
     * associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in
     * the Region.
     * </p>
     * <p>
     * To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * 
     * @param customKeyStoreId
     *        Creates the CMK in the specified <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        and the key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you
     *        must also specify the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS
     *        CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in
     *        a different Availability Zone in the Region.</p>
     *        <p>
     *        To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     *        </p>
     *        <p>
     *        The response includes the custom key store ID and the ID of the AWS CloudHSM cluster.
     *        </p>
     *        <p>
     *        This operation is part of the <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key
     *        Store feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS
     *        with the isolation and control of a single-tenant key store.
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
     * Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to
     *        true indiscriminately.
     *        </p>
     *        <p>
     *        For more information, refer to the scenario in the <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *        that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
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
     * Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to
     *         true indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *         that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
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
     * Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to
     *        true indiscriminately.
     *        </p>
     *        <p>
     *        For more information, refer to the scenario in the <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *        that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
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
     * Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true
     * indiscriminately.
     * </p>
     * <p>
     * For more information, refer to the scenario in the <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you include a policy in the request and you intend to prevent the principal that is
     * making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return A flag to indicate whether to bypass the key policy lockout safety check.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to
     *         true indiscriminately.
     *         </p>
     *         <p>
     *         For more information, refer to the scenario in the <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you include a policy in the request and you intend to prevent the principal
     *         that is making the request from making a subsequent <a>PutKeyPolicy</a> request on the CMK.
     *         </p>
     *         <p>
     *         The default value is false.
     */

    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but
     * tag values can be empty (null) strings.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag
     * the CMK after it is created using <a>TagResource</a>.
     * </p>
     * 
     * @return One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both
     *         required, but tag values can be empty (null) strings.</p>
     *         <p>
     *         Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and
     *         instead tag the CMK after it is created using <a>TagResource</a>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but
     * tag values can be empty (null) strings.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag
     * the CMK after it is created using <a>TagResource</a>.
     * </p>
     * 
     * @param tags
     *        One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both
     *        required, but tag values can be empty (null) strings.</p>
     *        <p>
     *        Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead
     *        tag the CMK after it is created using <a>TagResource</a>.
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
     * One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but
     * tag values can be empty (null) strings.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag
     * the CMK after it is created using <a>TagResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both
     *        required, but tag values can be empty (null) strings.</p>
     *        <p>
     *        Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead
     *        tag the CMK after it is created using <a>TagResource</a>.
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
     * One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but
     * tag values can be empty (null) strings.
     * </p>
     * <p>
     * Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag
     * the CMK after it is created using <a>TagResource</a>.
     * </p>
     * 
     * @param tags
     *        One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both
     *        required, but tag values can be empty (null) strings.</p>
     *        <p>
     *        Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead
     *        tag the CMK after it is created using <a>TagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId()).append(",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: ").append(getBypassPolicyLockoutSafetyCheck()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0 : getBypassPolicyLockoutSafetyCheck().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeyRequest clone() {
        return (CreateKeyRequest) super.clone();
    }

}
