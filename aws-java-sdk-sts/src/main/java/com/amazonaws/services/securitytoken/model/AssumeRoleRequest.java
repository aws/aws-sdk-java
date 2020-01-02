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
     * means that subsequent cross-account API requests that use the temporary security credentials will expose the role
     * session name to the external account in their AWS CloudTrail logs.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
     * </p>
     */
    private String roleSessionName;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<PolicyDescriptorType> policyArns;
    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * A list of session tags that you want to pass. Each session tag consists of a key name and an associated value.
     * For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128
     * characters, and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session
     * tags override a role tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     * transitive session tags from the calling session. If you pass a session tag with the same key as an inherited
     * tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing Session
     * Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the
     * corresponding key and value passes to subsequent sessions in a role chain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the session policy and session tags packed
     * binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent
     * sessions.
     * </p>
     */
    private java.util.List<String> transitiveTagKeys;
    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. If the administrator of the
     * account to which the role belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account. For more information about the external ID,
     * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     * Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
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
     * means that subsequent cross-account API requests that use the temporary security credentials will expose the role
     * session name to the external account in their AWS CloudTrail logs.
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
     *        assumed role principal. This means that subsequent cross-account API requests that use the temporary
     *        security credentials will expose the role session name to the external account in their AWS CloudTrail
     *        logs.
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
     * means that subsequent cross-account API requests that use the temporary security credentials will expose the role
     * session name to the external account in their AWS CloudTrail logs.
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
     *         assumed role principal. This means that subsequent cross-account API requests that use the temporary
     *         security credentials will expose the role session name to the external account in their AWS CloudTrail
     *         logs.
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
     * means that subsequent cross-account API requests that use the temporary security credentials will expose the role
     * session name to the external account in their AWS CloudTrail logs.
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
     *        assumed role principal. This means that subsequent cross-account API requests that use the temporary
     *        security credentials will expose the role session name to the external account in their AWS CloudTrail
     *        logs.
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
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *         policies. The policies must exist in the same account as the role.</p>
     *         <p>
     *         This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that
     *         you use for both inline and managed session policies can't exceed 2,048 characters. For more information
     *         about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *         </p>
     *         <note>
     *         <p>
     *         An AWS conversion compresses the passed session policies and session tags into a packed binary format
     *         that has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *         requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *         policies and tags for your request are to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *         are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *         temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *         You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *         of the role that is being assumed. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *         Policies</a> in the <i>IAM User Guide</i>.
     */

    public java.util.List<PolicyDescriptorType> getPolicyArns() {
        return policyArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *        policies. The policies must exist in the same account as the role.</p>
     *        <p>
     *        This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you
     *        use for both inline and managed session policies can't exceed 2,048 characters. For more information about
     *        ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *        are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *        temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *        You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *        of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     */

    public void setPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        if (policyArns == null) {
            this.policyArns = null;
            return;
        }

        this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyArns(java.util.Collection)} or {@link #withPolicyArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *        policies. The policies must exist in the same account as the role.</p>
     *        <p>
     *        This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you
     *        use for both inline and managed session policies can't exceed 2,048 characters. For more information about
     *        ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *        are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *        temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *        You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *        of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withPolicyArns(PolicyDescriptorType... policyArns) {
        if (this.policyArns == null) {
            setPolicyArns(new java.util.ArrayList<PolicyDescriptorType>(policyArns.length));
        }
        for (PolicyDescriptorType ele : policyArns) {
            this.policyArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies.
     * The policies must exist in the same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use
     * for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the AWS General Reference.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session policies. You can use the role's temporary
     * credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the identity-based policy of the role that is
     * being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param policyArns
     *        The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session
     *        policies. The policies must exist in the same account as the role.</p>
     *        <p>
     *        This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you
     *        use for both inline and managed session policies can't exceed 2,048 characters. For more information about
     *        ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs) and AWS Service Namespaces</a> in the AWS General Reference.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        Passing policies to this operation returns new temporary credentials. The resulting session's permissions
     *        are the intersection of the role's identity-based policy and the session policies. You can use the role's
     *        temporary credentials in subsequent AWS API calls to access resources in the account that owns the role.
     *        You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     *        of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        setPolicyArns(policyArns);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format that you want to use as an inline session policy.</p>
     *        <p>
     *        This parameter is optional. Passing policies to this operation returns new temporary credentials. The
     *        resulting session's permissions are the intersection of the role's identity-based policy and the session
     *        policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in
     *        the account that owns the role. You cannot use session policies to grant more permissions than those
     *        allowed by the identity-based policy of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The plain text that you use for both inline and managed session policies can't exceed 2,048 characters.
     *        The JSON policy characters can be any ASCII character from the space character to the end of the valid
     *        character list ( through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @return An IAM policy in JSON format that you want to use as an inline session policy.</p>
     *         <p>
     *         This parameter is optional. Passing policies to this operation returns new temporary credentials. The
     *         resulting session's permissions are the intersection of the role's identity-based policy and the session
     *         policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in
     *         the account that owns the role. You cannot use session policies to grant more permissions than those
     *         allowed by the identity-based policy of the role that is being assumed. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *         Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The plain text that you use for both inline and managed session policies can't exceed 2,048 characters.
     *         The JSON policy characters can be any ASCII character from the space character to the end of the valid
     *         character list ( through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         An AWS conversion compresses the passed session policies and session tags into a packed binary format
     *         that has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *         requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *         policies and tags for your request are to the upper size limit.
     *         </p>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting
     * session's permissions are the intersection of the role's identity-based policy and the session policies. You can
     * use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the
     * role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy
     * of the role that is being assumed. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON
     * policy characters can be any ASCII character from the space character to the end of the valid character list (
     * through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * 
     * @param policy
     *        An IAM policy in JSON format that you want to use as an inline session policy.</p>
     *        <p>
     *        This parameter is optional. Passing policies to this operation returns new temporary credentials. The
     *        resulting session's permissions are the intersection of the role's identity-based policy and the session
     *        policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in
     *        the account that owns the role. You cannot use session policies to grant more permissions than those
     *        allowed by the identity-based policy of the role that is being assumed. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     *        Policies</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        The plain text that you use for both inline and managed session policies can't exceed 2,048 characters.
     *        The JSON policy characters can be any ASCII character from the space character to the end of the valid
     *        character list ( through \u00FF). It can also include the tab ( ), linefeed ( ), and carriage return ( )
     *        characters.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     *        maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If
     *        you specify a value higher than this setting, the operation fails. For example, if you specify a session
     *        duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation
     *        fails. To learn how to view the maximum value for your role, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to <code>3600</code> seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @return The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to
     *         the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours.
     *         If you specify a value higher than this setting, the operation fails. For example, if you specify a
     *         session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your
     *         operation fails. To learn how to view the maximum value for your role, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         By default, the value is set to <code>3600</code> seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *         might request using the returned credentials. The request to the federation endpoint for a console
     *         sign-in token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the
     *         console session. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you might
     * request using the returned credentials. The request to the federation endpoint for a console sign-in token takes
     * a <code>SessionDuration</code> parameter that specifies the maximum length of the console session. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the AWS Management Console</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the
     *        maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If
     *        you specify a value higher than this setting, the operation fails. For example, if you specify a session
     *        duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation
     *        fails. To learn how to view the maximum value for your role, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *        >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        By default, the value is set to <code>3600</code> seconds.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>DurationSeconds</code> parameter is separate from the duration of a console session that you
     *        might request using the returned credentials. The request to the federation endpoint for a console sign-in
     *        token takes a <code>SessionDuration</code> parameter that specifies the maximum length of the console
     *        session. For more information, see <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
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
     * A list of session tags that you want to pass. Each session tag consists of a key name and an associated value.
     * For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128
     * characters, and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session
     * tags override a role tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     * transitive session tags from the calling session. If you pass a session tag with the same key as an inherited
     * tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing Session
     * Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return A list of session tags that you want to pass. Each session tag consists of a key name and an associated
     *         value. For more information about session tags, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a>
     *         in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t
     *         exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see
     *         <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *         >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         An AWS conversion compresses the passed session policies and session tags into a packed binary format
     *         that has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *         requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *         policies and tags for your request are to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         You can pass a session tag with the same key as a tag that is already attached to the role. When you do,
     *         session tags override a role tag with the same key.
     *         </p>
     *         <p>
     *         Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *         separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *         <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *         <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved
     *         as separate tags, and the session tag passed in the request takes precedence over the role tag.
     *         </p>
     *         <p>
     *         Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     *         transitive session tags from the calling session. If you pass a session tag with the same key as an
     *         inherited tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail
     *         logs. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing
     *         Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of session tags that you want to pass. Each session tag consists of a key name and an associated value.
     * For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128
     * characters, and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session
     * tags override a role tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     * transitive session tags from the calling session. If you pass a session tag with the same key as an inherited
     * tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing Session
     * Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of session tags that you want to pass. Each session tag consists of a key name and an associated
     *        value. For more information about session tags, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a>
     *        in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t
     *        exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see <a
     *        href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *        >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        You can pass a session tag with the same key as a tag that is already attached to the role. When you do,
     *        session tags override a role tag with the same key.
     *        </p>
     *        <p>
     *        Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *        separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *        <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *        <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     *        separate tags, and the session tag passed in the request takes precedence over the role tag.
     *        </p>
     *        <p>
     *        Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     *        transitive session tags from the calling session. If you pass a session tag with the same key as an
     *        inherited tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing
     *        Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of session tags that you want to pass. Each session tag consists of a key name and an associated value.
     * For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128
     * characters, and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session
     * tags override a role tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     * transitive session tags from the calling session. If you pass a session tag with the same key as an inherited
     * tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing Session
     * Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of session tags that you want to pass. Each session tag consists of a key name and an associated
     *        value. For more information about session tags, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a>
     *        in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t
     *        exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see <a
     *        href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *        >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        You can pass a session tag with the same key as a tag that is already attached to the role. When you do,
     *        session tags override a role tag with the same key.
     *        </p>
     *        <p>
     *        Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *        separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *        <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *        <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     *        separate tags, and the session tag passed in the request takes precedence over the role tag.
     *        </p>
     *        <p>
     *        Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     *        transitive session tags from the calling session. If you pass a session tag with the same key as an
     *        inherited tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing
     *        Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of session tags that you want to pass. Each session tag consists of a key name and an associated value.
     * For more information about session tags, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128
     * characters, and the values can’t exceed 256 characters. For these and additional limits, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a
     * separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The
     * <code>PackedPolicySize</code> response element indicates by percentage how close the policies and tags for your
     * request are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already attached to the role. When you do, session
     * tags override a role tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate
     * <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     * <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence over the role tag.
     * </p>
     * <p>
     * Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     * transitive session tags from the calling session. If you pass a session tag with the same key as an inherited
     * tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing Session
     * Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of session tags that you want to pass. Each session tag consists of a key name and an associated
     *        value. For more information about session tags, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Tagging AWS STS Sessions</a>
     *        in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t
     *        exceed 128 characters, and the values can’t exceed 256 characters. For these and additional limits, see <a
     *        href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *        >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        An AWS conversion compresses the passed session policies and session tags into a packed binary format that
     *        has a separate limit. Your request can fail for this limit even if your plain text meets the other
     *        requirements. The <code>PackedPolicySize</code> response element indicates by percentage how close the
     *        policies and tags for your request are to the upper size limit.
     *        </p>
     *        </note>
     *        <p>
     *        You can pass a session tag with the same key as a tag that is already attached to the role. When you do,
     *        session tags override a role tag with the same key.
     *        </p>
     *        <p>
     *        Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have
     *        separate <code>Department</code> and <code>department</code> tag keys. Assume that the role has the
     *        <code>Department</code>=<code>Marketing</code> tag and you pass the <code>department</code>=
     *        <code>engineering</code> session tag. <code>Department</code> and <code>department</code> are not saved as
     *        separate tags, and the session tag passed in the request takes precedence over the role tag.
     *        </p>
     *        <p>
     *        Additionally, if you used temporary credentials to perform this operation, the new session inherits any
     *        transitive session tags from the calling session. If you pass a session tag with the same key as an
     *        inherited tag, the operation fails. To view the inherited tags for a session, see the AWS CloudTrail logs.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/session-tags.html#id_session-tags_ctlogs">Viewing
     *        Session Tags in CloudTrail</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the
     * corresponding key and value passes to subsequent sessions in a role chain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the session policy and session tags packed
     * binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent
     * sessions.
     * </p>
     * 
     * @return A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive,
     *         the corresponding key and value passes to subsequent sessions in a role chain. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *         >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. When you set session tags as transitive, the session policy and session tags
     *         packed binary limit is not affected.
     *         </p>
     *         <p>
     *         If you choose not to specify a transitive tag key, then no tags are passed from this session to any
     *         subsequent sessions.
     */

    public java.util.List<String> getTransitiveTagKeys() {
        return transitiveTagKeys;
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the
     * corresponding key and value passes to subsequent sessions in a role chain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the session policy and session tags packed
     * binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent
     * sessions.
     * </p>
     * 
     * @param transitiveTagKeys
     *        A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive,
     *        the corresponding key and value passes to subsequent sessions in a role chain. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *        >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. When you set session tags as transitive, the session policy and session tags
     *        packed binary limit is not affected.
     *        </p>
     *        <p>
     *        If you choose not to specify a transitive tag key, then no tags are passed from this session to any
     *        subsequent sessions.
     */

    public void setTransitiveTagKeys(java.util.Collection<String> transitiveTagKeys) {
        if (transitiveTagKeys == null) {
            this.transitiveTagKeys = null;
            return;
        }

        this.transitiveTagKeys = new java.util.ArrayList<String>(transitiveTagKeys);
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the
     * corresponding key and value passes to subsequent sessions in a role chain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the session policy and session tags packed
     * binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent
     * sessions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitiveTagKeys(java.util.Collection)} or {@link #withTransitiveTagKeys(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param transitiveTagKeys
     *        A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive,
     *        the corresponding key and value passes to subsequent sessions in a role chain. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *        >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. When you set session tags as transitive, the session policy and session tags
     *        packed binary limit is not affected.
     *        </p>
     *        <p>
     *        If you choose not to specify a transitive tag key, then no tags are passed from this session to any
     *        subsequent sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withTransitiveTagKeys(String... transitiveTagKeys) {
        if (this.transitiveTagKeys == null) {
            setTransitiveTagKeys(new java.util.ArrayList<String>(transitiveTagKeys.length));
        }
        for (String ele : transitiveTagKeys) {
            this.transitiveTagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the
     * corresponding key and value passes to subsequent sessions in a role chain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. When you set session tags as transitive, the session policy and session tags packed
     * binary limit is not affected.
     * </p>
     * <p>
     * If you choose not to specify a transitive tag key, then no tags are passed from this session to any subsequent
     * sessions.
     * </p>
     * 
     * @param transitiveTagKeys
     *        A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive,
     *        the corresponding key and value passes to subsequent sessions in a role chain. For more information, see
     *        <a href=
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
     *        >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. When you set session tags as transitive, the session policy and session tags
     *        packed binary limit is not affected.
     *        </p>
     *        <p>
     *        If you choose not to specify a transitive tag key, then no tags are passed from this session to any
     *        subsequent sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleRequest withTransitiveTagKeys(java.util.Collection<String> transitiveTagKeys) {
        setTransitiveTagKeys(transitiveTagKeys);
        return this;
    }

    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. If the administrator of the
     * account to which the role belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account. For more information about the external ID,
     * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     * Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that might be required when you assume a role in another account. If the administrator
     *        of the account to which the role belongs provided you with an external ID, then provide that value in the
     *        <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A
     *        cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     *        trusting account might send an external ID to the administrator of the trusted account. That way, only
     *        someone with the ID can assume the role, rather than everyone in the account. For more information about
     *        the external ID, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *        Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User
     *        Guide</i>.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *        alphanumeric characters with no spaces. You can also include underscores or any of the following
     *        characters: =,.@:/-
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. If the administrator of the
     * account to which the role belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account. For more information about the external ID,
     * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     * Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @return A unique identifier that might be required when you assume a role in another account. If the
     *         administrator of the account to which the role belongs provided you with an external ID, then provide
     *         that value in the <code>ExternalId</code> parameter. This value can be any string, such as a passphrase
     *         or account number. A cross-account role is usually set up to trust everyone in an account. Therefore, the
     *         administrator of the trusting account might send an external ID to the administrator of the trusted
     *         account. That way, only someone with the ID can assume the role, rather than everyone in the account. For
     *         more information about the external ID, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *         Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User
     *         Guide</i>.</p>
     *         <p>
     *         The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     *         alphanumeric characters with no spaces. You can also include underscores or any of the following
     *         characters: =,.@:/-
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A unique identifier that might be required when you assume a role in another account. If the administrator of the
     * account to which the role belongs provided you with an external ID, then provide that value in the
     * <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A
     * cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     * trusting account might send an external ID to the administrator of the trusted account. That way, only someone
     * with the ID can assume the role, rather than everyone in the account. For more information about the external ID,
     * see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     * Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
     * alphanumeric characters with no spaces. You can also include underscores or any of the following characters:
     * =,.@:/-
     * </p>
     * 
     * @param externalId
     *        A unique identifier that might be required when you assume a role in another account. If the administrator
     *        of the account to which the role belongs provided you with an external ID, then provide that value in the
     *        <code>ExternalId</code> parameter. This value can be any string, such as a passphrase or account number. A
     *        cross-account role is usually set up to trust everyone in an account. Therefore, the administrator of the
     *        trusting account might send an external ID to the administrator of the trusted account. That way, only
     *        someone with the ID can assume the role, rather than everyone in the account. For more information about
     *        the external ID, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html">How to
     *        Use an External ID When Granting Access to Your AWS Resources to a Third Party</a> in the <i>IAM User
     *        Guide</i>.</p>
     *        <p>
     *        The regex used to validate this parameter is a string of characters consisting of upper- and lower-case
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
        if (getPolicyArns() != null)
            sb.append("PolicyArns: ").append(getPolicyArns()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTransitiveTagKeys() != null)
            sb.append("TransitiveTagKeys: ").append(getTransitiveTagKeys()).append(",");
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
        if (other.getPolicyArns() == null ^ this.getPolicyArns() == null)
            return false;
        if (other.getPolicyArns() != null && other.getPolicyArns().equals(this.getPolicyArns()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTransitiveTagKeys() == null ^ this.getTransitiveTagKeys() == null)
            return false;
        if (other.getTransitiveTagKeys() != null && other.getTransitiveTagKeys().equals(this.getTransitiveTagKeys()) == false)
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
        hashCode = prime * hashCode + ((getPolicyArns() == null) ? 0 : getPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTransitiveTagKeys() == null) ? 0 : getTransitiveTagKeys().hashCode());
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
