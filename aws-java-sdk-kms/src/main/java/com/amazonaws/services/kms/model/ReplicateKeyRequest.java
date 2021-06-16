/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ReplicateKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicateKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a multi-Region
     * primary key, use the <a>DescribeKey</a> operation to check the value of the <code>MultiRegionKeyType</code>
     * property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The Region ID of the AWS Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS Regions in
     * which AWS KMS is supported, see <a href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS
     * KMS service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different AWS Region than its primary key and other replicas of that primary key, but in
     * the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not enabled by default,
     * the AWS account must be enabled in the Region.
     * </p>
     * <p>
     * For information about AWS partitions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) in
     * the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and disabling Regions, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     * Region</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     * Region</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String replicaRegion;
    /**
     * <p>
     * The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS KMS
     * attaches the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default key
     * policy</a> to the CMK.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a different
     * key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     * <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     */
    private String policy;
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
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <code>PutKeyPolicy</code> request on the CMK.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;
    /**
     * <p>
     * A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a task. The
     * default value is an empty string (no description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can specify the same description or a
     * different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
     * property.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for each key
     * in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key. If you
     * specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs aggregated
     * by tags. Tags can also be used to control access to a CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a multi-Region
     * primary key, use the <a>DescribeKey</a> operation to check the value of the <code>MultiRegionKeyType</code>
     * property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a
     *        multi-Region primary key, use the <a>DescribeKey</a> operation to check the value of the
     *        <code>MultiRegionKeyType</code> property.</p>
     *        <p>
     *        Specify the key ID or key ARN of a multi-Region primary key.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a multi-Region
     * primary key, use the <a>DescribeKey</a> operation to check the value of the <code>MultiRegionKeyType</code>
     * property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a
     *         multi-Region primary key, use the <a>DescribeKey</a> operation to check the value of the
     *         <code>MultiRegionKeyType</code> property.</p>
     *         <p>
     *         Specify the key ID or key ARN of a multi-Region primary key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a multi-Region
     * primary key, use the <a>DescribeKey</a> operation to check the value of the <code>MultiRegionKeyType</code>
     * property.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies the multi-Region primary key that is being replicated. To determine whether a CMK is a
     *        multi-Region primary key, use the <a>DescribeKey</a> operation to check the value of the
     *        <code>MultiRegionKeyType</code> property.</p>
     *        <p>
     *        Specify the key ID or key ARN of a multi-Region primary key.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The Region ID of the AWS Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS Regions in
     * which AWS KMS is supported, see <a href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS
     * KMS service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different AWS Region than its primary key and other replicas of that primary key, but in
     * the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not enabled by default,
     * the AWS account must be enabled in the Region.
     * </p>
     * <p>
     * For information about AWS partitions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) in
     * the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and disabling Regions, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     * Region</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     * Region</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param replicaRegion
     *        The Region ID of the AWS Region for this replica key. </p>
     *        <p>
     *        Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS
     *        Regions in which AWS KMS is supported, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS KMS service endpoints</a> in
     *        the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        <p>
     *        The replica must be in a different AWS Region than its primary key and other replicas of that primary key,
     *        but in the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not
     *        enabled by default, the AWS account must be enabled in the Region.
     *        </p>
     *        <p>
     *        For information about AWS partitions, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) in the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and
     *        disabling Regions, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     *        Region</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     *        Region</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setReplicaRegion(String replicaRegion) {
        this.replicaRegion = replicaRegion;
    }

    /**
     * <p>
     * The Region ID of the AWS Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS Regions in
     * which AWS KMS is supported, see <a href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS
     * KMS service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different AWS Region than its primary key and other replicas of that primary key, but in
     * the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not enabled by default,
     * the AWS account must be enabled in the Region.
     * </p>
     * <p>
     * For information about AWS partitions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) in
     * the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and disabling Regions, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     * Region</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     * Region</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Region ID of the AWS Region for this replica key. </p>
     *         <p>
     *         Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS
     *         Regions in which AWS KMS is supported, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS KMS service endpoints</a> in
     *         the <i>Amazon Web Services General Reference</i>.
     *         </p>
     *         <p>
     *         The replica must be in a different AWS Region than its primary key and other replicas of that primary
     *         key, but in the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not
     *         enabled by default, the AWS account must be enabled in the Region.
     *         </p>
     *         <p>
     *         For information about AWS partitions, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) in the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and
     *         disabling Regions, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     *         Region</a> and <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     *         Region</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getReplicaRegion() {
        return this.replicaRegion;
    }

    /**
     * <p>
     * The Region ID of the AWS Region for this replica key.
     * </p>
     * <p>
     * Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS Regions in
     * which AWS KMS is supported, see <a href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS
     * KMS service endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The replica must be in a different AWS Region than its primary key and other replicas of that primary key, but in
     * the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not enabled by default,
     * the AWS account must be enabled in the Region.
     * </p>
     * <p>
     * For information about AWS partitions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) in
     * the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and disabling Regions, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     * Region</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     * Region</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param replicaRegion
     *        The Region ID of the AWS Region for this replica key. </p>
     *        <p>
     *        Enter the Region ID, such as <code>us-east-1</code> or <code>ap-southeast-2</code>. For a list of AWS
     *        Regions in which AWS KMS is supported, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">AWS KMS service endpoints</a> in
     *        the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        <p>
     *        The replica must be in a different AWS Region than its primary key and other replicas of that primary key,
     *        but in the same AWS partition. AWS KMS must be available in the replica Region. If the Region is not
     *        enabled by default, the AWS account must be enabled in the Region.
     *        </p>
     *        <p>
     *        For information about AWS partitions, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) in the <i>Amazon Web Services General Reference</i>.</a> For information about enabling and
     *        disabling Regions, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a
     *        Region</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-disable">Disabling a
     *        Region</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withReplicaRegion(String replicaRegion) {
        setReplicaRegion(replicaRegion);
        return this;
    }

    /**
     * <p>
     * The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS KMS
     * attaches the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default key
     * policy</a> to the CMK.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a different
     * key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     * <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     * 
     * @param policy
     *        The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS
     *        KMS attaches the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default
     *        key policy</a> to the CMK.</p>
     *        <p>
     *        The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a
     *        different key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
     *        property.
     *        </p>
     *        <p>
     *        If you provide a key policy, it must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     *        <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     *        unmanageable. For more information, refer to the scenario in the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or
     *        role), you might need to enforce a delay before including the new principal in a key policy because the
     *        new principal might not be immediately visible to AWS KMS. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management
     *        User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key policy size quota is 32 kilobytes (32768 bytes).
     *        </p>
     *        </li>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS KMS
     * attaches the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default key
     * policy</a> to the CMK.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a different
     * key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     * <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS
     *         KMS attaches the <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default
     *         key policy</a> to the CMK.</p>
     *         <p>
     *         The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a
     *         different key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     *         this property.
     *         </p>
     *         <p>
     *         If you provide a key policy, it must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     *         <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     *         unmanageable. For more information, refer to the scenario in the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more principals. The principals in the key policy
     *         must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or
     *         role), you might need to enforce a delay before including the new principal in a key policy because the
     *         new principal might not be immediately visible to AWS KMS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management
     *         User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The key policy size quota is 32 kilobytes (32768 bytes).
     *         </p>
     *         </li>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS KMS
     * attaches the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default key
     * policy</a> to the CMK.
     * </p>
     * <p>
     * The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a different
     * key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * If you provide a key policy, it must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     * <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     * unmanageable. For more information, refer to the scenario in the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The principals in the key policy must exist
     * and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need
     * to enforce a delay before including the new principal in a key policy because the new principal might not be
     * immediately visible to AWS KMS. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management User
     * Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key policy size quota is 32 kilobytes (32768 bytes).
     * </p>
     * </li>
     * </ul>
     * 
     * @param policy
     *        The key policy to attach to the CMK. This parameter is optional. If you do not provide a key policy, AWS
     *        KMS attaches the <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default">default
     *        key policy</a> to the CMK.</p>
     *        <p>
     *        The key policy is not a shared property of multi-Region keys. You can specify the same key policy or a
     *        different key policy for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
     *        property.
     *        </p>
     *        <p>
     *        If you provide a key policy, it must meet the following criteria:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you don't set <code>BypassPolicyLockoutSafetyCheck</code> to true, the key policy must give the caller
     *        <code>kms:PutKeyPolicy</code> permission on the replica CMK. This reduces the risk that the CMK becomes
     *        unmanageable. For more information, refer to the scenario in the <a href=
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section of the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each statement in the key policy must contain one or more principals. The principals in the key policy
     *        must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or
     *        role), you might need to enforce a delay before including the new principal in a key policy because the
     *        new principal might not be immediately visible to AWS KMS. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *        >Changes that I make are not always immediately visible</a> in the <i>AWS Identity and Access Management
     *        User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key policy size quota is 32 kilobytes (32768 bytes).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withPolicy(String policy) {
        setPolicy(policy);
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
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <code>PutKeyPolicy</code> request on the CMK.
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
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you intend to prevent the principal that is making the request from making a
     *        subsequent <code>PutKeyPolicy</code> request on the CMK.
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
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <code>PutKeyPolicy</code> request on the CMK.
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
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal that is making the request from making a
     *         subsequent <code>PutKeyPolicy</code> request on the CMK.
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
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <code>PutKeyPolicy</code> request on the CMK.
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
     *        "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *        >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        Use this parameter only when you intend to prevent the principal that is making the request from making a
     *        subsequent <code>PutKeyPolicy</code> request on the CMK.
     *        </p>
     *        <p>
     *        The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
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
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     * >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is making the request from making a
     * subsequent <code>PutKeyPolicy</code> request on the CMK.
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
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam"
     *         >Default Key Policy</a> section in the <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal that is making the request from making a
     *         subsequent <code>PutKeyPolicy</code> request on the CMK.
     *         </p>
     *         <p>
     *         The default value is false.
     */

    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a task. The
     * default value is an empty string (no description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can specify the same description or a
     * different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
     * property.
     * </p>
     * 
     * @param description
     *        A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a
     *        task. The default value is an empty string (no description).</p>
     *        <p>
     *        The description is not a shared property of multi-Region keys. You can specify the same description or a
     *        different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     *        this property.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a task. The
     * default value is an empty string (no description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can specify the same description or a
     * different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
     * property.
     * </p>
     * 
     * @return A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a
     *         task. The default value is an empty string (no description).</p>
     *         <p>
     *         The description is not a shared property of multi-Region keys. You can specify the same description or a
     *         different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     *         this property.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a task. The
     * default value is an empty string (no description).
     * </p>
     * <p>
     * The description is not a shared property of multi-Region keys. You can specify the same description or a
     * different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize this
     * property.
     * </p>
     * 
     * @param description
     *        A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a
     *        task. The default value is an empty string (no description).</p>
     *        <p>
     *        The description is not a shared property of multi-Region keys. You can specify the same description or a
     *        different description for each key in a set of related multi-Region keys. AWS KMS does not synchronize
     *        this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for each key
     * in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key. If you
     * specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs aggregated
     * by tags. Tags can also be used to control access to a CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * 
     * @return Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag
     *         an existing CMK, use the <a>TagResource</a> operation.</p> <note>
     *         <p>
     *         Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the
     *         <i>AWS Key Management Service Developer Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         To use this parameter, you must have <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *         >kms:TagResource</a> permission in an IAM policy.
     *         </p>
     *         <p>
     *         Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for
     *         each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     *         </p>
     *         <p>
     *         Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *         tag value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag
     *         key. If you specify an existing tag key with a different tag value, AWS KMS replaces the current tag
     *         value with the specified one.
     *         </p>
     *         <p>
     *         When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs
     *         aggregated by tags. Tags can also be used to control access to a CMK. For details, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for each key
     * in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key. If you
     * specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs aggregated
     * by tags. Tags can also be used to control access to a CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag
     *        an existing CMK, use the <a>TagResource</a> operation.</p> <note>
     *        <p>
     *        Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        To use this parameter, you must have <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *        >kms:TagResource</a> permission in an IAM policy.
     *        </p>
     *        <p>
     *        Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for
     *        each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     *        </p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key.
     *        If you specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with
     *        the specified one.
     *        </p>
     *        <p>
     *        When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs
     *        aggregated by tags. Tags can also be used to control access to a CMK. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
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
     * Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for each key
     * in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key. If you
     * specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs aggregated
     * by tags. Tags can also be used to control access to a CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag
     *        an existing CMK, use the <a>TagResource</a> operation.</p> <note>
     *        <p>
     *        Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        To use this parameter, you must have <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *        >kms:TagResource</a> permission in an IAM policy.
     *        </p>
     *        <p>
     *        Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for
     *        each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     *        </p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key.
     *        If you specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with
     *        the specified one.
     *        </p>
     *        <p>
     *        When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs
     *        aggregated by tags. Tags can also be used to control access to a CMK. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withTags(Tag... tags) {
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
     * Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag an
     * existing CMK, use the <a>TagResource</a> operation.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * To use this parameter, you must have <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> permission in an IAM policy.
     * </p>
     * <p>
     * Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for each key
     * in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the tag
     * value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key. If you
     * specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with the specified
     * one.
     * </p>
     * <p>
     * When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs aggregated
     * by tags. Tags can also be used to control access to a CMK. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags to the replica key. Use this parameter to tag the CMK when it is created. To tag
     *        an existing CMK, use the <a>TagResource</a> operation.</p> <note>
     *        <p>
     *        Tagging or untagging a CMK can allow or deny permission to the CMK. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">Using ABAC in AWS KMS</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        To use this parameter, you must have <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     *        >kms:TagResource</a> permission in an IAM policy.
     *        </p>
     *        <p>
     *        Tags are not a shared property of multi-Region keys. You can specify the same tags or different tags for
     *        each key in a set of related multi-Region keys. AWS KMS does not synchronize this property.
     *        </p>
     *        <p>
     *        Each tag consists of a tag key and a tag value. Both the tag key and the tag value are required, but the
     *        tag value can be an empty (null) string. You cannot have more than one tag on a CMK with the same tag key.
     *        If you specify an existing tag key with a different tag value, AWS KMS replaces the current tag value with
     *        the specified one.
     *        </p>
     *        <p>
     *        When you assign tags to an AWS resource, AWS generates a cost allocation report with usage and costs
     *        aggregated by tags. Tags can also be used to control access to a CMK. For details, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging Keys</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicateKeyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getReplicaRegion() != null)
            sb.append("ReplicaRegion: ").append(getReplicaRegion()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: ").append(getBypassPolicyLockoutSafetyCheck()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof ReplicateKeyRequest == false)
            return false;
        ReplicateKeyRequest other = (ReplicateKeyRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getReplicaRegion() == null ^ this.getReplicaRegion() == null)
            return false;
        if (other.getReplicaRegion() != null && other.getReplicaRegion().equals(this.getReplicaRegion()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getReplicaRegion() == null) ? 0 : getReplicaRegion().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0 : getBypassPolicyLockoutSafetyCheck().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ReplicateKeyRequest clone() {
        return (ReplicateKeyRequest) super.clone();
    }

}
