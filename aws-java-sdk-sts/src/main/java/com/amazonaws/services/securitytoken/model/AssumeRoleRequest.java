/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#assumeRole(AssumeRoleRequest) AssumeRole operation}.
 * <p>
 * Returns a set of temporary security credentials (consisting of an
 * access key ID, a secret access key, and a security token) that you can
 * use to access AWS resources that you might not normally have access
 * to. Typically, you use <code>AssumeRole</code> for cross-account
 * access or federation.
 * </p>
 * <p>
 * <b>Important:</b> You cannot call <code>AssumeRole</code> by using
 * AWS account credentials; access will be denied. You must use IAM user
 * credentials or temporary security credentials to call
 * <code>AssumeRole</code> .
 * </p>
 * <p>
 * For cross-account access, imagine that you own multiple accounts and
 * need to access resources in each account. You could create long-term
 * credentials in each account to access those resources. However,
 * managing all those credentials and remembering which one can access
 * which account can be time consuming. Instead, you can create one set
 * of long-term credentials in one account and then use temporary
 * security credentials to access all the other accounts by assuming
 * roles in those accounts. For more information about roles, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Roles </a>
 * in <i>Using IAM</i> .
 * </p>
 * <p>
 * For federation, you can, for example, grant single sign-on access to
 * the AWS Management Console. If you already have an identity and
 * authentication system in your corporate network, you don't have to
 * recreate user identities in AWS in order to grant those user
 * identities access to AWS. Instead, after a user has been
 * authenticated, you call <code>AssumeRole</code> (and specify the role
 * with the appropriate permissions) to get temporary security
 * credentials for that user. With those temporary security credentials,
 * you construct a sign-in URL that users can use to access the console.
 * For more information, see
 * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/STSUseCases.html"> Scenarios for Granting Temporary Access </a>
 * in <i>Using Temporary Security Credentials</i> .
 * </p>
 * <p>
 * The temporary security credentials are valid for the duration that you
 * specified when calling <code>AssumeRole</code> , which can be from 900
 * seconds (15 minutes) to 3600 seconds (1 hour). The default is 1 hour.
 * </p>
 * <p>
 * Optionally, you can pass an IAM access policy to this operation. If
 * you choose not to pass a policy, the temporary security credentials
 * that are returned by the operation have the permissions that are
 * defined in the access policy of the role that is being assumed. If you
 * pass a policy to this operation, the temporary security credentials
 * that are returned by the operation have the permissions that are
 * allowed by both the access policy of the role that is being assumed,
 * <i> and </i> the policy that you pass. This gives you a way to further
 * restrict the permissions for the resulting temporary security
 * credentials. You cannot use the passed policy to grant permissions
 * that are in excess of those allowed by the access policy of the role
 * that is being assumed. For more information, see
 * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html"> Permissions for AssumeRole </a>
 * in <i>Using Temporary Security Credentials</i> .
 * </p>
 * <p>
 * To assume a role, your AWS account must be trusted by the role. The
 * trust relationship is defined in the role's trust policy when the role
 * is created. You must also have a policy that allows you to call
 * <code>sts:AssumeRole</code> .
 * </p>
 * <p>
 * <b>Using MFA with AssumeRole</b>
 * </p>
 * <p>
 * You can optionally include multi-factor authentication (MFA)
 * information when you call <code>AssumeRole</code> . This is useful for
 * cross-account scenarios in which you want to make sure that the user
 * who is assuming the role has been authenticated using an AWS MFA
 * device. In that scenario, the trust policy of the role being assumed
 * includes a condition that tests for MFA authentication; if the caller
 * does not include valid MFA information, the request to assume the role
 * is denied. The condition in a trust policy that tests for MFA
 * authentication might look like the following example.
 * </p>
 * <p>
 * <code>"Condition": {"Null": {"aws:MultiFactorAuthAge": false}}</code>
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html"> Configuring MFA-Protected API Access </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 * <p>
 * To use MFA with <code>AssumeRole</code> , you pass values for the
 * <code>SerialNumber</code> and <code>TokenCode</code> parameters. The
 * <code>SerialNumber</code> value identifies the user's hardware or
 * virtual MFA device. The <code>TokenCode</code> is the time-based
 * one-time password (TOTP) that the MFA devices produces.
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#assumeRole(AssumeRoleRequest)
 */
public class AssumeRoleRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * An identifier for the assumed role session. The session name is
     * included as part of the <code>AssumedRoleUser</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleSessionName;

    /**
     * An IAM policy in JSON format. <p>The policy parameter is optional. If
     * you pass a policy, the temporary security credentials that are
     * returned by the operation have the permissions that are allowed by
     * both the access policy of the role that is being assumed,
     * <i><b>and</b></i> the policy that you pass. This gives you a way to
     * further restrict the permissions for the resulting temporary security
     * credentials. You cannot use the passed policy to grant permissions
     * that are in excess of those allowed by the access policy of the role
     * that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     * for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String policy;

    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     */
    private Integer durationSeconds;

    /**
     * A unique identifier that is used by third parties to assume a role in
     * their customers' accounts. For each role that the third party can
     * assume, they should instruct their customers to create a role with the
     * external ID that the third party generated. Each time the third party
     * assumes the role, they must pass the customer's external ID. The
     * external ID is useful in order to help third parties bind a role to
     * the customer who created it. For more information about the external
     * ID, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     * target="_blank">About the External ID</a> in <i>Using Temporary
     * Security Credentials</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@:-]*<br/>
     */
    private String externalId;

    /**
     * The identification number of the MFA device that is associated with
     * the user who is making the <code>AssumeRole</code> call. Specify this
     * value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the
     * serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     * virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA
     * and if the <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String tokenCode;

    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the role that the caller is
     * assuming.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * An identifier for the assumed role session. The session name is
     * included as part of the <code>AssumedRoleUser</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return An identifier for the assumed role session. The session name is
     *         included as part of the <code>AssumedRoleUser</code>.
     */
    public String getRoleSessionName() {
        return roleSessionName;
    }
    
    /**
     * An identifier for the assumed role session. The session name is
     * included as part of the <code>AssumedRoleUser</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleSessionName An identifier for the assumed role session. The session name is
     *         included as part of the <code>AssumedRoleUser</code>.
     */
    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }
    
    /**
     * An identifier for the assumed role session. The session name is
     * included as part of the <code>AssumedRoleUser</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleSessionName An identifier for the assumed role session. The session name is
     *         included as part of the <code>AssumedRoleUser</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }

    /**
     * An IAM policy in JSON format. <p>The policy parameter is optional. If
     * you pass a policy, the temporary security credentials that are
     * returned by the operation have the permissions that are allowed by
     * both the access policy of the role that is being assumed,
     * <i><b>and</b></i> the policy that you pass. This gives you a way to
     * further restrict the permissions for the resulting temporary security
     * credentials. You cannot use the passed policy to grant permissions
     * that are in excess of those allowed by the access policy of the role
     * that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     * for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return An IAM policy in JSON format. <p>The policy parameter is optional. If
     *         you pass a policy, the temporary security credentials that are
     *         returned by the operation have the permissions that are allowed by
     *         both the access policy of the role that is being assumed,
     *         <i><b>and</b></i> the policy that you pass. This gives you a way to
     *         further restrict the permissions for the resulting temporary security
     *         credentials. You cannot use the passed policy to grant permissions
     *         that are in excess of those allowed by the access policy of the role
     *         that is being assumed. For more information, see <a
     *         href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     *         for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * An IAM policy in JSON format. <p>The policy parameter is optional. If
     * you pass a policy, the temporary security credentials that are
     * returned by the operation have the permissions that are allowed by
     * both the access policy of the role that is being assumed,
     * <i><b>and</b></i> the policy that you pass. This gives you a way to
     * further restrict the permissions for the resulting temporary security
     * credentials. You cannot use the passed policy to grant permissions
     * that are in excess of those allowed by the access policy of the role
     * that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     * for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policy An IAM policy in JSON format. <p>The policy parameter is optional. If
     *         you pass a policy, the temporary security credentials that are
     *         returned by the operation have the permissions that are allowed by
     *         both the access policy of the role that is being assumed,
     *         <i><b>and</b></i> the policy that you pass. This gives you a way to
     *         further restrict the permissions for the resulting temporary security
     *         credentials. You cannot use the passed policy to grant permissions
     *         that are in excess of those allowed by the access policy of the role
     *         that is being assumed. For more information, see <a
     *         href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     *         for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * An IAM policy in JSON format. <p>The policy parameter is optional. If
     * you pass a policy, the temporary security credentials that are
     * returned by the operation have the permissions that are allowed by
     * both the access policy of the role that is being assumed,
     * <i><b>and</b></i> the policy that you pass. This gives you a way to
     * further restrict the permissions for the resulting temporary security
     * credentials. You cannot use the passed policy to grant permissions
     * that are in excess of those allowed by the access policy of the role
     * that is being assumed. For more information, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     * for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policy An IAM policy in JSON format. <p>The policy parameter is optional. If
     *         you pass a policy, the temporary security credentials that are
     *         returned by the operation have the permissions that are allowed by
     *         both the access policy of the role that is being assumed,
     *         <i><b>and</b></i> the policy that you pass. This gives you a way to
     *         further restrict the permissions for the resulting temporary security
     *         credentials. You cannot use the passed policy to grant permissions
     *         that are in excess of those allowed by the access policy of the role
     *         that is being assumed. For more information, see <a
     *         href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html">Permissions
     *         for AssumeRole</a> in <i>Using Temporary Security Credentials</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @return The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds.
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @param durationSeconds The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds.
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, of the role session. The value can range
     * from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     * the value is set to 3600 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 3600<br/>
     *
     * @param durationSeconds The duration, in seconds, of the role session. The value can range
     *         from 900 seconds (15 minutes) to 3600 seconds (1 hour). By default,
     *         the value is set to 3600 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * A unique identifier that is used by third parties to assume a role in
     * their customers' accounts. For each role that the third party can
     * assume, they should instruct their customers to create a role with the
     * external ID that the third party generated. Each time the third party
     * assumes the role, they must pass the customer's external ID. The
     * external ID is useful in order to help third parties bind a role to
     * the customer who created it. For more information about the external
     * ID, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     * target="_blank">About the External ID</a> in <i>Using Temporary
     * Security Credentials</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@:-]*<br/>
     *
     * @return A unique identifier that is used by third parties to assume a role in
     *         their customers' accounts. For each role that the third party can
     *         assume, they should instruct their customers to create a role with the
     *         external ID that the third party generated. Each time the third party
     *         assumes the role, they must pass the customer's external ID. The
     *         external ID is useful in order to help third parties bind a role to
     *         the customer who created it. For more information about the external
     *         ID, see <a
     *         href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     *         target="_blank">About the External ID</a> in <i>Using Temporary
     *         Security Credentials</i>.
     */
    public String getExternalId() {
        return externalId;
    }
    
    /**
     * A unique identifier that is used by third parties to assume a role in
     * their customers' accounts. For each role that the third party can
     * assume, they should instruct their customers to create a role with the
     * external ID that the third party generated. Each time the third party
     * assumes the role, they must pass the customer's external ID. The
     * external ID is useful in order to help third parties bind a role to
     * the customer who created it. For more information about the external
     * ID, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     * target="_blank">About the External ID</a> in <i>Using Temporary
     * Security Credentials</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@:-]*<br/>
     *
     * @param externalId A unique identifier that is used by third parties to assume a role in
     *         their customers' accounts. For each role that the third party can
     *         assume, they should instruct their customers to create a role with the
     *         external ID that the third party generated. Each time the third party
     *         assumes the role, they must pass the customer's external ID. The
     *         external ID is useful in order to help third parties bind a role to
     *         the customer who created it. For more information about the external
     *         ID, see <a
     *         href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     *         target="_blank">About the External ID</a> in <i>Using Temporary
     *         Security Credentials</i>.
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    
    /**
     * A unique identifier that is used by third parties to assume a role in
     * their customers' accounts. For each role that the third party can
     * assume, they should instruct their customers to create a role with the
     * external ID that the third party generated. Each time the third party
     * assumes the role, they must pass the customer's external ID. The
     * external ID is useful in order to help third parties bind a role to
     * the customer who created it. For more information about the external
     * ID, see <a
     * href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     * target="_blank">About the External ID</a> in <i>Using Temporary
     * Security Credentials</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 96<br/>
     * <b>Pattern: </b>[\w+=,.@:-]*<br/>
     *
     * @param externalId A unique identifier that is used by third parties to assume a role in
     *         their customers' accounts. For each role that the third party can
     *         assume, they should instruct their customers to create a role with the
     *         external ID that the third party generated. Each time the third party
     *         assumes the role, they must pass the customer's external ID. The
     *         external ID is useful in order to help third parties bind a role to
     *         the customer who created it. For more information about the external
     *         ID, see <a
     *         href="http://docs.aws.amazon.com/STS/latest/UsingSTS/sts-delegating-externalid.html"
     *         target="_blank">About the External ID</a> in <i>Using Temporary
     *         Security Credentials</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The identification number of the MFA device that is associated with
     * the user who is making the <code>AssumeRole</code> call. Specify this
     * value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the
     * serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     * virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return The identification number of the MFA device that is associated with
     *         the user who is making the <code>AssumeRole</code> call. Specify this
     *         value if the trust policy of the role being assumed includes a
     *         condition that requires MFA authentication. The value is either the
     *         serial number for a hardware device (such as
     *         <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *         virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>).
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The identification number of the MFA device that is associated with
     * the user who is making the <code>AssumeRole</code> call. Specify this
     * value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the
     * serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     * virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The identification number of the MFA device that is associated with
     *         the user who is making the <code>AssumeRole</code> call. Specify this
     *         value if the trust policy of the role being assumed includes a
     *         condition that requires MFA authentication. The value is either the
     *         serial number for a hardware device (such as
     *         <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *         virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>).
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The identification number of the MFA device that is associated with
     * the user who is making the <code>AssumeRole</code> call. Specify this
     * value if the trust policy of the role being assumed includes a
     * condition that requires MFA authentication. The value is either the
     * serial number for a hardware device (such as
     * <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     * virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The identification number of the MFA device that is associated with
     *         the user who is making the <code>AssumeRole</code> call. Specify this
     *         value if the trust policy of the role being assumed includes a
     *         condition that requires MFA authentication. The value is either the
     *         serial number for a hardware device (such as
     *         <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *         virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA
     * and if the <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return The value provided by the MFA device, if the trust policy of the role
     *         being assumed requires MFA (that is, if the policy includes a
     *         condition that tests for MFA). If the role being assumed requires MFA
     *         and if the <code>TokenCode</code> value is missing or expired, the
     *         <code>AssumeRole</code> call returns an "access denied" error.
     */
    public String getTokenCode() {
        return tokenCode;
    }
    
    /**
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA
     * and if the <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode The value provided by the MFA device, if the trust policy of the role
     *         being assumed requires MFA (that is, if the policy includes a
     *         condition that tests for MFA). If the role being assumed requires MFA
     *         and if the <code>TokenCode</code> value is missing or expired, the
     *         <code>AssumeRole</code> call returns an "access denied" error.
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }
    
    /**
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a
     * condition that tests for MFA). If the role being assumed requires MFA
     * and if the <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param tokenCode The value provided by the MFA device, if the trust policy of the role
     *         being assumed requires MFA (that is, if the policy includes a
     *         condition that tests for MFA). If the role being assumed requires MFA
     *         and if the <code>TokenCode</code> value is missing or expired, the
     *         <code>AssumeRole</code> call returns an "access denied" error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssumeRoleRequest withTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getRoleSessionName() != null) sb.append("RoleSessionName: " + getRoleSessionName() + ",");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null) sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getExternalId() != null) sb.append("ExternalId: " + getExternalId() + ",");
        if (getSerialNumber() != null) sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getTokenCode() != null) sb.append("TokenCode: " + getTokenCode() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssumeRoleRequest == false) return false;
        AssumeRoleRequest other = (AssumeRoleRequest)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null) return false;
        if (other.getRoleSessionName() != null && other.getRoleSessionName().equals(this.getRoleSessionName()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false; 
        if (other.getExternalId() == null ^ this.getExternalId() == null) return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false) return false; 
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null) return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false) return false; 
        if (other.getTokenCode() == null ^ this.getTokenCode() == null) return false;
        if (other.getTokenCode() != null && other.getTokenCode().equals(this.getTokenCode()) == false) return false; 
        return true;
    }
    
}
    