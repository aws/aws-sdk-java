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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same role is assumed by different principals or
     * for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the
     * account that owns the role. The role session name is also used in the ARN of the assumed role principal. This
     * means that subsequent cross-account API requests using the temporary security credentials will expose the role
     * session name to the external account in their CloudTrail logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     */
    private String roleSessionName;
    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security credentials that are returned by the
     * operation have the permissions that are allowed by both (the intersection of) the access policy of the role that
     * is being assumed, <i>and</i> the policy that you pass. This gives you a way to further restrict the permissions
     * for the resulting temporary security credentials. You cannot use the passed policy to grant permissions that are
     * in excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">
     * Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     */
    private String policy;
    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in their customers' accounts. For each role
     * that the third party can assume, they should instruct their customers to ensure the role's trust policy checks
     * for the external ID that the third party generated. Each time the third party assumes the role, they should pass
     * the customer's external ID. The external ID is useful in order to help third parties bind a role to the customer
     * who created it. For more information about the external ID, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to Use an
     * External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The identification number of the MFA device that is associated with the user who is making the
     * <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is, if the
     * policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an "access denied"
     * error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     */
    private String tokenCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to assume.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to assume.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to assume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same role is assumed by different principals or
     * for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the
     * account that owns the role. The role session name is also used in the ARN of the assumed role principal. This
     * means that subsequent cross-account API requests using the temporary security credentials will expose the role
     * session name to the external account in their CloudTrail logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session.</p>
     *        <p>
     *        Use the role session name to uniquely identify a session when the same role is assumed by different
     *        principals or for different reasons. In cross-account scenarios, the role session name is visible to, and
     *        can be logged by the account that owns the role. The role session name is also used in the ARN of the
     *        assumed role principal. This means that subsequent cross-account API requests using the temporary security
     *        credentials will expose the role session name to the external account in their CloudTrail logs.
     *        </p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same role is assumed by different principals or
     * for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the
     * account that owns the role. The role session name is also used in the ARN of the assumed role principal. This
     * means that subsequent cross-account API requests using the temporary security credentials will expose the role
     * session name to the external account in their CloudTrail logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @return An identifier for the assumed role session.</p>
     *         <p>
     *         Use the role session name to uniquely identify a session when the same role is assumed by different
     *         principals or for different reasons. In cross-account scenarios, the role session name is visible to, and
     *         can be logged by the account that owns the role. The role session name is also used in the ARN of the
     *         assumed role principal. This means that subsequent cross-account API requests using the temporary
     *         security credentials will expose the role session name to the external account in their CloudTrail logs.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@-
     */

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same role is assumed by different principals or
     * for different reasons. In cross-account scenarios, the role session name is visible to, and can be logged by the
     * account that owns the role. The role session name is also used in the ARN of the assumed role principal. This
     * means that subsequent cross-account API requests using the temporary security credentials will expose the role
     * session name to the external account in their CloudTrail logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session.</p>
     *        <p>
     *        Use the role session name to uniquely identify a session when the same role is assumed by different
     *        principals or for different reasons. In cross-account scenarios, the role session name is visible to, and
     *        can be logged by the account that owns the role. The role session name is also used in the ARN of the
     *        assumed role principal. This means that subsequent cross-account API requests using the temporary security
     *        credentials will expose the role session name to the external account in their CloudTrail logs.
     *        </p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withRoleSessionName(String roleSessionName) {
        setRoleSessionName(roleSessionName);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security credentials that are returned by the
     * operation have the permissions that are allowed by both (the intersection of) the access policy of the role that
     * is being assumed, <i>and</i> the policy that you pass. This gives you a way to further restrict the permissions
     * for the resulting temporary security credentials. You cannot use the passed policy to grant permissions that are
     * in excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">
     * Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        This parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     *        the operation have the permissions that are allowed by both (the intersection of) the access policy of the
     *        role that is being assumed, <i>and</i> the policy that you pass. This gives you a way to further restrict
     *        the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     *        grant permissions that are in excess of those allowed by the access policy of the role that is being
     *        assumed. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a string of characters up to 2048
     *        characters in length. The characters can be any ASCII character from the space character to the end of the
     *        valid character list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a
     *        packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage
     *        how close to the upper size limit the policy is, with 100% equaling the maximum allowed size.
     *        </p>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security credentials that are returned by the
     * operation have the permissions that are allowed by both (the intersection of) the access policy of the role that
     * is being assumed, <i>and</i> the policy that you pass. This gives you a way to further restrict the permissions
     * for the resulting temporary security credentials. You cannot use the passed policy to grant permissions that are
     * in excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">
     * Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     * 
     * @return An IAM policy in JSON format.</p>
     *         <p>
     *         This parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     *         the operation have the permissions that are allowed by both (the intersection of) the access policy of
     *         the role that is being assumed, <i>and</i> the policy that you pass. This gives you a way to further
     *         restrict the permissions for the resulting temporary security credentials. You cannot use the passed
     *         policy to grant permissions that are in excess of those allowed by the access policy of the role that is
     *         being assumed. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *         >Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern, is a string of characters up to 2048
     *         characters in length. The characters can be any ASCII character from the space character to the end of
     *         the valid character list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return (
     *         ) characters.
     *         </p>
     *         <note>
     *         <p>
     *         The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a
     *         packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage
     *         how close to the upper size limit the policy is, with 100% equaling the maximum allowed size.
     *         </p>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security credentials that are returned by the
     * operation have the permissions that are allowed by both (the intersection of) the access policy of the role that
     * is being assumed, <i>and</i> the policy that you pass. This gives you a way to further restrict the permissions
     * for the resulting temporary security credentials. You cannot use the passed policy to grant permissions that are
     * in excess of those allowed by the access policy of the role that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html">
     * Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a string of characters up to 2048 characters
     * in length. The characters can be any ASCII character from the space character to the end of the valid character
     * list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a packed
     * binary format with a separate limit. The PackedPolicySize response element indicates by percentage how close to
     * the upper size limit the policy is, with 100% equaling the maximum allowed size.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        This parameter is optional. If you pass a policy, the temporary security credentials that are returned by
     *        the operation have the permissions that are allowed by both (the intersection of) the access policy of the
     *        role that is being assumed, <i>and</i> the policy that you pass. This gives you a way to further restrict
     *        the permissions for the resulting temporary security credentials. You cannot use the passed policy to
     *        grant permissions that are in excess of those allowed by the access policy of the role that is being
     *        assumed. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRole, AssumeRoleWithSAML, and AssumeRoleWithWebIdentity</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a string of characters up to 2048
     *        characters in length. The characters can be any ASCII character from the space character to the end of the
     *        valid character list ( -\u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        The policy plain text must be 2048 bytes or shorter. However, an internal conversion compresses it into a
     *        packed binary format with a separate limit. The PackedPolicySize response element indicates by percentage
     *        how close to the upper size limit the policy is, with 100% equaling the maximum allowed size.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     *        maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If
     *        you specify a value higher than this setting, the operation fails. For example, if you specify a session
     *        duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation
     *        fails. To learn how to view the maximum value for your role, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to 3600 seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *        >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to
     *         the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours.
     *         If you specify a value higher than this setting, the operation fails. For example, if you specify a
     *         session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your
     *         operation fails. To learn how to view the maximum value for your role, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         By default, the value is set to 3600 seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *         might request using the returned credentials. The request to the federation endpoint for a console
     *         sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the
     *         console session. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *         >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *         Guide</i>.
     *         </p>
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     * maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For example, if you specify a session duration of
     * 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to 3600 seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating
     * a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     *        maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If
     *        you specify a value higher than this setting, the operation fails. For example, if you specify a session
     *        duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation
     *        fails. To learn how to view the maximum value for your role, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to 3600 seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *        >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in their customers' accounts. For each role
     * that the third party can assume, they should instruct their customers to ensure the role's trust policy checks
     * for the external ID that the third party generated. Each time the third party assumes the role, they should pass
     * the customer's external ID. The external ID is useful in order to help third parties bind a role to the customer
     * who created it. For more information about the external ID, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to Use an
     * External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is used by third parties when assuming roles in their customers' accounts. For
     *        each role that the third party can assume, they should instruct their customers to ensure the role's trust
     *        policy checks for the external ID that the third party generated. Each time the third party assumes the
     *        role, they should pass the customer's external ID. The external ID is useful in order to help third
     *        parties bind a role to the customer who created it. For more information about the external ID, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to Use
     *        an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User
     *        Guide</i>.</p>
     *        <p>
     *        The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in their customers' accounts. For each role
     * that the third party can assume, they should instruct their customers to ensure the role's trust policy checks
     * for the external ID that the third party generated. Each time the third party assumes the role, they should pass
     * the customer's external ID. The external ID is useful in order to help third parties bind a role to the customer
     * who created it. For more information about the external ID, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to Use an
     * External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @return A unique identifier that is used by third parties when assuming roles in their customers' accounts. For
     *         each role that the third party can assume, they should instruct their customers to ensure the role's
     *         trust policy checks for the external ID that the third party generated. Each time the third party assumes
     *         the role, they should pass the customer's external ID. The external ID is useful in order to help third
     *         parties bind a role to the customer who created it. For more information about the external ID, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *         Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User
     *         Guide</i>.</p>
     *         <p>
     *         The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@:/-
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in their customers' accounts. For each role
     * that the third party can assume, they should instruct their customers to ensure the role's trust policy checks
     * for the external ID that the third party generated. Each time the third party assumes the role, they should pass
     * the customer's external ID. The external ID is useful in order to help third parties bind a role to the customer
     * who created it. For more information about the external ID, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to Use an
     * External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is used by third parties when assuming roles in their customers' accounts. For
     *        each role that the third party can assume, they should instruct their customers to ensure the role's trust
     *        policy checks for the external ID that the third party generated. Each time the third party assumes the
     *        role, they should pass the customer's external ID. The external ID is useful in order to help third
     *        parties bind a role to the customer who created it. For more information about the external ID, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to Use
     *        an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User
     *        Guide</i>.</p>
     *        <p>
     *        The regex used to validated this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the user who is making the
     * <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param serialNumber
     *        The identification number of the MFA device that is associated with the user who is making the
     *        <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     *        condition that requires MFA authentication. The value is either the serial number for a hardware device
     *        (such as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     *        <code>arn:aws:iam::123456789012:mfa/user</code>).</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the user who is making the
     * <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @return The identification number of the MFA device that is associated with the user who is making the
     *         <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     *         condition that requires MFA authentication. The value is either the serial number for a hardware device
     *         (such as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>).</p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@-
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the user who is making the
     * <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     * 
     * @param serialNumber
     *        The identification number of the MFA device that is associated with the user who is making the
     *        <code>AssumeRole</code> call. Specify this value if the trust policy of the role being assumed includes a
     *        condition that requires MFA authentication. The value is either the serial number for a hardware device
     *        (such as <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a virtual device (such as
     *        <code>arn:aws:iam::123456789012:mfa/user</code>).</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is, if the
     * policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an "access denied"
     * error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     * 
     * @param tokenCode
     *        The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is,
     *        if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the
     *        <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an
     *        "access denied" error.</p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     */

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is, if the
     * policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an "access denied"
     * error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     * 
     * @return The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that
     *         is, if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if
     *         the <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an
     *         "access denied" error.</p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     */

    public String getTokenCode() {
        return this.tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is, if the
     * policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an "access denied"
     * error.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * </p>
     * 
     * @param tokenCode
     *        The value provided by the MFA device, if the trust policy of the role being assumed requires MFA (that is,
     *        if the policy includes a condition that tests for MFA). If the role being assumed requires MFA and if the
     *        <code>TokenCode</code> value is missing or expired, the <code>AssumeRole</code> call returns an
     *        "access denied" error.</p>
     *        <p>
     *        The format for this parameter, as described by its regex pattern, is a sequence of six numeric digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withTokenCode(String tokenCode) {
        setTokenCode(tokenCode);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: ").append(getRoleSessionName()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getTokenCode() != null)
            sb.append("TokenCode: ").append(getTokenCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleRequest == false)
            return false;
        AssumeRoleRequest other = (AssumeRoleRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null && other.getRoleSessionName().equals(this.getRoleSessionName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getTokenCode() == null ^ this.getTokenCode() == null)
            return false;
        if (other.getTokenCode() != null && other.getTokenCode().equals(this.getTokenCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRoleSessionName() == null) ? 0 : getRoleSessionName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getTokenCode() == null) ? 0 : getTokenCode().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleRequest clone() {
        return (AssumeRoleRequest) super.clone();
    }

}
