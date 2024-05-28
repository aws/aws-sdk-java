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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/PutKeyPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutKeyPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Sets the key policy on the specified KMS key.
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
     * The name of the key policy. If no policy name is specified, the default value is <code>default</code>. The only
     * valid value is <code>default</code>.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal, you might need to enforce a delay
     * before including the new principal in a key policy because the new principal might not be immediately visible to
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII character
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>) special
     * characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in the
     * <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a>
     * request on the KMS key.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * Sets the key policy on the specified KMS key.
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
     *        Sets the key policy on the specified KMS key.</p>
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
     * Sets the key policy on the specified KMS key.
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
     * @return Sets the key policy on the specified KMS key.</p>
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
     * Sets the key policy on the specified KMS key.
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
     *        Sets the key policy on the specified KMS key.</p>
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

    public PutKeyPolicyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The name of the key policy. If no policy name is specified, the default value is <code>default</code>. The only
     * valid value is <code>default</code>.
     * </p>
     * 
     * @param policyName
     *        The name of the key policy. If no policy name is specified, the default value is <code>default</code>. The
     *        only valid value is <code>default</code>.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the key policy. If no policy name is specified, the default value is <code>default</code>. The only
     * valid value is <code>default</code>.
     * </p>
     * 
     * @return The name of the key policy. If no policy name is specified, the default value is <code>default</code>.
     *         The only valid value is <code>default</code>.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the key policy. If no policy name is specified, the default value is <code>default</code>. The only
     * valid value is <code>default</code>.
     * </p>
     * 
     * @param policyName
     *        The name of the key policy. If no policy name is specified, the default value is <code>default</code>. The
     *        only valid value is <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeyPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal, you might need to enforce a delay
     * before including the new principal in a key policy because the new principal might not be immediately visible to
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII character
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>) special
     * characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in the
     * <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * 
     * @param policy
     *        The key policy to attach to the KMS key.</p>
     *        <p>
     *        The key policy must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on
     *        the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *        >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition, set
     *        <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to KMS. When you create a new Amazon Web Services principal, you might need to
     *        enforce a delay before including the new principal in a key policy because the new principal might not be
     *        immediately visible to KMS. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and
     *        Access Management User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A key policy document can include only the following characters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII
     *        character range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *        special characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about key policies, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in
     *        the <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document,
     *        see the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy
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
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal, you might need to enforce a delay
     * before including the new principal in a key policy because the new principal might not be immediately visible to
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII character
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>) special
     * characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in the
     * <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * 
     * @return The key policy to attach to the KMS key.</p>
     *         <p>
     *         The key policy must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on
     *         the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *         >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition,
     *         set <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more principals. The principals in the key policy
     *         must exist and be visible to KMS. When you create a new Amazon Web Services principal, you might need to
     *         enforce a delay before including the new principal in a key policy because the new principal might not be
     *         immediately visible to KMS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and
     *         Access Management User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A key policy document can include only the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII
     *         character range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>
     *         ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         special characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about key policies, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in
     *         the <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document,
     *         see the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON
     *         Policy Reference</a> in the <i> <i>Identity and Access Management User Guide</i> </i>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on the KMS
     * key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to KMS. When you create a new Amazon Web Services principal, you might need to enforce a delay
     * before including the new principal in a key policy because the new principal might not be immediately visible to
     * KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and Access
     * Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII character
     * range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>) special
     * characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in the
     * <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>.
     * </p>
     * 
     * @param policy
     *        The key policy to attach to the KMS key.</p>
     *        <p>
     *        The key policy must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key policy must allow the calling principal to make a subsequent <code>PutKeyPolicy</code> request on
     *        the KMS key. This reduces the risk that the KMS key becomes unmanageable. For more information, see <a
     *        href
     *        ="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *        >Default key policy</a> in the <i>Key Management Service Developer Guide</i>. (To omit this condition, set
     *        <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to KMS. When you create a new Amazon Web Services principal, you might need to
     *        enforce a delay before including the new principal in a key policy because the new principal might not be
     *        immediately visible to KMS. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>Amazon Web Services Identity and
     *        Access Management User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        A key policy document can include only the following characters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Printable ASCII characters from the space character (<code>\u0020</code>) through the end of the ASCII
     *        character range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\u00FF</code>
     *        ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *        special characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about key policies, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key policies in KMS</a> in
     *        the <i>Key Management Service Developer Guide</i>.For help writing and formatting a JSON policy document,
     *        see the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy
     *        Reference</a> in the <i> <i>Identity and Access Management User Guide</i> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeyPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a>
     * request on the KMS key.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        Skips ("bypasses") the key policy lockout safety check. The default value is false.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value
     *        to true indiscriminately.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *        >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you intend to prevent the principal that is making the request from making a
     *        subsequent <a
     *        href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a> request
     *        on the KMS key.
     */

    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a>
     * request on the KMS key.
     * </p>
     * 
     * @return Skips ("bypasses") the key policy lockout safety check. The default value is false.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this
     *         value to true indiscriminately.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *         >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal that is making the request from making a
     *         subsequent <a
     *         href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a> request
     *         on the KMS key.
     */

    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a>
     * request on the KMS key.
     * </p>
     * 
     * @param bypassPolicyLockoutSafetyCheck
     *        Skips ("bypasses") the key policy lockout safety check. The default value is false.</p> <important>
     *        <p>
     *        Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value
     *        to true indiscriminately.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *        >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you intend to prevent the principal that is making the request from making a
     *        subsequent <a
     *        href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a> request
     *        on the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeyPolicyRequest withBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        setBypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck);
        return this;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to
     * true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a>
     * request on the KMS key.
     * </p>
     * 
     * @return Skips ("bypasses") the key policy lockout safety check. The default value is false.</p> <important>
     *         <p>
     *         Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this
     *         value to true indiscriminately.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *         >Default key policy</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal that is making the request from making a
     *         subsequent <a
     *         href="https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html">PutKeyPolicy</a> request
     *         on the KMS key.
     */

    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: ").append(getBypassPolicyLockoutSafetyCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutKeyPolicyRequest == false)
            return false;
        PutKeyPolicyRequest other = (PutKeyPolicyRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0 : getBypassPolicyLockoutSafetyCheck().hashCode());
        return hashCode;
    }

    @Override
    public PutKeyPolicyRequest clone() {
        return (PutKeyPolicyRequest) super.clone();
    }

}
