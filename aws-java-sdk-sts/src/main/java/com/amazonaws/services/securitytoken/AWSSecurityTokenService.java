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
package com.amazonaws.services.securitytoken;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.securitytoken.model.*;

/**
 * Interface for accessing AWS STS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securitytoken.AbstractAWSSecurityTokenService} instead.
 * </p>
 * <p>
 * <fullname>AWS Security Token Service</fullname>
 * <p>
 * The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege
 * credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users).
 * This guide provides descriptions of the STS API. For more detailed information about using this service, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through the API, go to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a> in
 * the <i>AWS General Reference</i>. For general information about the Query API, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in <i>Using
 * IAM</i>. For information about using security tokens with other AWS products, go to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html">AWS Services
 * That Work with IAM</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/">http://aws.amazon.com/documentation/</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * By default, AWS Security Token Service (STS) is available as a global service, and all AWS STS requests go to a
 * single endpoint at <code>https://sts.amazonaws.com</code>. Global requests map to the US East (N. Virginia) region.
 * AWS recommends using Regional AWS STS endpoints instead of the global endpoint to reduce latency, build in
 * redundancy, and increase session token validity. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Managing AWS STS in
 * an AWS Region</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * Most AWS Regions are enabled for operations in all AWS services by default. Those Regions are automatically activated
 * for use with AWS STS. Some Regions, such as Asia Pacific (Hong Kong), must be manually enabled. To learn more about
 * enabling and disabling AWS Regions, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing AWS Regions</a> in the <i>AWS General
 * Reference</i>. When you enable these AWS Regions, they are automatically activated for use with AWS STS. You cannot
 * activate the STS endpoint for a Region that is disabled. Tokens that are valid in all AWS Regions are longer than
 * tokens that are valid in Regions that are enabled by default. Changing this setting might affect existing systems
 * where you temporarily store tokens. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html#sts-regions-manage-tokens"
 * >Managing Global Endpoint Session Tokens</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * After you activate a Region for use with AWS STS, you can direct AWS STS API calls to that Region. AWS STS recommends
 * that you provide both the Region and endpoint when you make calls to a Regional endpoint. You can provide the Region
 * alone for manually enabled Regions, such as Asia Pacific (Hong Kong). In this case, the calls are directed to the STS
 * Regional endpoint. However, if you provide the Region alone for Regions enabled by default, the calls are directed to
 * the global endpoint of <code>https://sts.amazonaws.com</code>.
 * </p>
 * <p>
 * To view the list of AWS STS endpoints and whether they are active by default, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html#id_credentials_temp_enable-regions_writing_code"
 * >Writing Code to Use AWS STS Regions</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls for your AWS account and delivers log files to
 * an Amazon S3 bucket. By using information collected by CloudTrail, you can determine what requests were successfully
 * made to STS, who made the request, when it was made, and so on.
 * </p>
 * <p>
 * If you activate AWS STS endpoints in Regions other than the default global endpoint, then you must also turn on
 * CloudTrail logging in those Regions. This is necessary to record any AWS STS API calls that are made in those
 * Regions. For more information, see <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/aggregating_logs_regions_turn_on_ct.html">Turning On
 * CloudTrail in Additional Regions</a> in the <i>AWS CloudTrail User Guide</i>.
 * </p>
 * <p>
 * AWS Security Token Service (STS) is a global service with a single endpoint at <code>https://sts.amazonaws.com</code>
 * . Calls to this endpoint are logged as calls to a global service. However, because this endpoint is physically
 * located in the US East (N. Virginia) Region, your logs list <code>us-east-1</code> as the event Region. CloudTrail
 * does not write these logs to the US East (Ohio) Region unless you choose to include global service logs in that
 * Region. CloudTrail writes calls to all Regional endpoints to their respective Regions. For example, calls to
 * sts.us-east-2.amazonaws.com are published to the US East (Ohio) Region and calls to sts.eu-central-1.amazonaws.com
 * are published to the EU (Frankfurt) Region.
 * </p>
 * <p>
 * To learn more about CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecurityTokenService {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sts";

    /**
     * Overrides the default endpoint for this client ("sts.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sts.amazonaws.com") or a full URL, including the protocol (ex:
     * "sts.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "sts.amazonaws.com") or a full URL, including the protocol (ex: "sts.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSSecurityTokenService#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Returns a set of temporary security credentials that you can use to access AWS resources that you might not
     * normally have access to. These temporary credentials consist of an access key ID, a secret access key, and a
     * security token. Typically, you use <code>AssumeRole</code> within your account or for cross-account access. For a
     * comparison of <code>AssumeRole</code> with other API operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You cannot use AWS account root user credentials to call <code>AssumeRole</code>. You must use credentials for an
     * IAM user or an IAM role to call <code>AssumeRole</code>.
     * </p>
     * </important>
     * <p>
     * For cross-account access, imagine that you own multiple accounts and need to access resources in each account.
     * You could create long-term credentials in each account to access those resources. However, managing all those
     * credentials and remembering which one can access which account can be time consuming. Instead, you can create one
     * set of long-term credentials in one account. Then use temporary security credentials to access all the other
     * accounts by assuming roles in those accounts. For more information about roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRole</code> last for one hour. However, you
     * can use the optional <code>DurationSeconds</code> parameter to specify the duration of your session. You can
     * provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * commands. However the limit does not apply when you use those operations to create a console URL. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRole</code> can be used to make API calls to any AWS
     * service with the following exception: You cannot call the AWS STS <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> API operations.
     * </p>
     * <p>
     * (Optional) You can pass inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     * policies</a> to this operation. You can pass a single JSON policy document to use as an inline session policy.
     * You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use
     * for both inline and managed session policies shouldn't exceed 2048 characters. Passing policies to this operation
     * returns new temporary credentials. The resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You cannot use session policies to grant more
     * permissions than those allowed by the identity-based policy of the role that is being assumed. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * To assume a role from a different account, your AWS account must be trusted by the role. The trust relationship
     * is defined in the role's trust policy when the role is created. That trust policy states which accounts are
     * allowed to delegate that access to users in the account.
     * </p>
     * <p>
     * A user who wants to access a role in a different account must also have permissions that are delegated from the
     * user account administrator. The administrator must attach a policy that allows the user to call
     * <code>AssumeRole</code> for the ARN of the role in the other account. If the user is in the same account as the
     * role, then you can do either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Attach a policy to the user (identical to the previous user in a different account).
     * </p>
     * </li>
     * <li>
     * <p>
     * Add the user as a principal directly in the role's trust policy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In this case, the trust policy acts as an IAM resource-based policy. Users in the same account as the role do not
     * need explicit permission to assume the role. For more information about trust policies and resource-based
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM Policies</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Using MFA with AssumeRole</b>
     * </p>
     * <p>
     * (Optional) You can include multi-factor authentication (MFA) information when you call <code>AssumeRole</code>.
     * This is useful for cross-account scenarios to ensure that the user that assumes the role has been authenticated
     * with an AWS MFA device. In that scenario, the trust policy of the role being assumed includes a condition that
     * tests for MFA authentication. If the caller does not include valid MFA information, the request to assume the
     * role is denied. The condition in a trust policy that tests for MFA authentication might look like the following
     * example.
     * </p>
     * <p>
     * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent": true}}</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html">Configuring MFA-Protected API
     * Access</a> in the <i>IAM User Guide</i> guide.
     * </p>
     * <p>
     * To use MFA with <code>AssumeRole</code>, you pass values for the <code>SerialNumber</code> and
     * <code>TokenCode</code> parameters. The <code>SerialNumber</code> value identifies the user's hardware or virtual
     * MFA device. The <code>TokenCode</code> is the time-based one-time password (TOTP) that the MFA device produces.
     * </p>
     * 
     * @param assumeRoleRequest
     * @return Result of the AssumeRole operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.AssumeRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRole" target="_top">AWS API
     *      Documentation</a>
     */
    AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest);

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have been authenticated via a SAML authentication
     * response. This operation provides a mechanism for tying an enterprise identity store or directory to role-based
     * AWS access without user-specific credentials or configuration. For a comparison of
     * <code>AssumeRoleWithSAML</code> with the other API operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this operation consist of an access key ID, a secret access key,
     * and a security token. Applications can use these temporary security credentials to sign calls to AWS services.
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRoleWithSAML</code> last for one hour.
     * However, you can use the optional <code>DurationSeconds</code> parameter to specify the duration of your session.
     * Your role session lasts for the duration that you specify, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide a
     * <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * commands. However the limit does not apply when you use those operations to create a console URL. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRoleWithSAML</code> can be used to make API calls to
     * any AWS service with the following exception: you cannot call the STS <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> API operations.
     * </p>
     * <p>
     * (Optional) You can pass inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     * policies</a> to this operation. You can pass a single JSON policy document to use as an inline session policy.
     * You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use
     * for both inline and managed session policies shouldn't exceed 2048 characters. Passing policies to this operation
     * returns new temporary credentials. The resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You cannot use session policies to grant more
     * permissions than those allowed by the identity-based policy of the role that is being assumed. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithSAML</code>, you must configure your SAML identity provider
     * (IdP) to issue the claims required by AWS. Additionally, you must use AWS Identity and Access Management (IAM) to
     * create a SAML provider entity in your AWS account that represents your identity provider. You must also create an
     * IAM role that specifies this SAML provider in its trust policy.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> does not require the use of AWS security credentials. The identity of the
     * caller is validated by using keys in the metadata document that is uploaded for the SAML provider entity for your
     * identity provider.
     * </p>
     * <important>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> can result in an entry in your AWS CloudTrail logs. The entry includes
     * the value in the <code>NameID</code> element of the SAML assertion. We recommend that you use a
     * <code>NameIDType</code> that is not associated with any personally identifiable information (PII). For example,
     * you could instead use the Persistent Identifier (
     * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent</code>).
     * </p>
     * </important>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html">Creating SAML
     * Identity Providers</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html">
     * Configuring a Relying Party and Claims</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html">Creating a Role for
     * SAML 2.0 Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRoleWithSAMLRequest
     * @return Result of the AssumeRoleWithSAML operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws IDPRejectedClaimException
     *         The identity provider (IdP) reported that authentication failed. This might be because the claim is
     *         invalid.</p>
     *         <p>
     *         If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that
     *         the claim has expired or has been explicitly revoked.
     * @throws InvalidIdentityTokenException
     *         The web identity token that was passed could not be validated by AWS. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws ExpiredTokenException
     *         The web identity token that was passed is expired or is not valid. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.AssumeRoleWithSAML
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithSAML" target="_top">AWS API
     *      Documentation</a>
     */
    AssumeRoleWithSAMLResult assumeRoleWithSAML(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest);

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have been authenticated in a mobile or web
     * application with a web identity provider. Example providers include Amazon Cognito, Login with Amazon, Facebook,
     * Google, or any OpenID Connect-compatible identity provider.
     * </p>
     * <note>
     * <p>
     * For mobile applications, we recommend that you use Amazon Cognito. You can use Amazon Cognito with the <a
     * href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS Developer Guide</a> and the <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android Developer Guide</a> to uniquely identify a user.
     * You can also supply the user with a consistent identity throughout the lifetime of an application.
     * </p>
     * <p>
     * To learn more about Amazon Cognito, see <a
     * href="https://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840">Amazon Cognito
     * Overview</a> in <i>AWS SDK for Android Developer Guide</i> and <a
     * href="https://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664">Amazon Cognito
     * Overview</a> in the <i>AWS SDK for iOS Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the use of AWS security credentials. Therefore,
     * you can distribute an application (for example, on mobile devices) that requests temporary security credentials
     * without including long-term AWS credentials in the application. You also don't need to deploy server-based proxy
     * services that use long-term AWS credentials. Instead, the identity of the caller is validated by using a token
     * from the web identity provider. For a comparison of <code>AssumeRoleWithWebIdentity</code> with the other API
     * operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an access key ID, a secret access key, and a
     * security token. Applications can use these temporary security credentials to sign calls to AWS service API
     * operations.
     * </p>
     * <p>
     * By default, the temporary security credentials created by <code>AssumeRoleWithWebIdentity</code> last for one
     * hour. However, you can use the optional <code>DurationSeconds</code> parameter to specify the duration of your
     * session. You can provide a value from 900 seconds (15 minutes) up to the maximum session duration setting for the
     * role. This setting can have a value from 1 hour to 12 hours. To learn how to view the maximum value for your
     * role, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View
     * the Maximum Session Duration Setting for a Role</a> in the <i>IAM User Guide</i>. The maximum session duration
     * limit applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     * commands. However the limit does not apply when you use those operations to create a console URL. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRoleWithWebIdentity</code> can be used to make API
     * calls to any AWS service with the following exception: you cannot call the STS <code>GetFederationToken</code> or
     * <code>GetSessionToken</code> API operations.
     * </p>
     * <p>
     * (Optional) You can pass inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session
     * policies</a> to this operation. You can pass a single JSON policy document to use as an inline session policy.
     * You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use
     * for both inline and managed session policies shouldn't exceed 2048 characters. Passing policies to this operation
     * returns new temporary credentials. The resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS
     * API calls to access resources in the account that owns the role. You cannot use session policies to grant more
     * permissions than those allowed by the identity-based policy of the role that is being assumed. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithWebIdentity</code>, you must have an identity token from a
     * supported identity provider and create a role that the application can assume. The role that your application
     * assumes must trust the identity provider that is associated with the identity token. In other words, the identity
     * provider must be specified in the role's trust policy.
     * </p>
     * <important>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> can result in an entry in your AWS CloudTrail logs. The entry
     * includes the <a href="http://openid.net/specs/openid-connect-core-1_0.html#Claims">Subject</a> of the provided
     * Web Identity Token. We recommend that you avoid using any personally identifiable information (PII) in this
     * field. For example, you could instead use a GUID or a pairwise identifier, as <a
     * href="http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes">suggested in the OIDC
     * specification</a>.
     * </p>
     * </important>
     * <p>
     * For more information about how to use web identity federation and the <code>AssumeRoleWithWebIdentity</code> API,
     * see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html">Using Web Identity
     * Federation API Operations for Mobile Apps</a> and <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation
     * Playground</a>. Walk through the process of authenticating through Login with Amazon, Facebook, or Google,
     * getting temporary security credentials, and then using those credentials to make a request to AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS Developer Guide</a> and <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android Developer Guide</a>. These toolkits contain
     * sample apps that show how to invoke the identity providers, and then how to use the information from these
     * providers to get and use temporary security credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications">Web Identity Federation
     * with Mobile Applications</a>. This article discusses web identity federation and shows an example of how to use
     * web identity federation to get access to content in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRoleWithWebIdentityRequest
     * @return Result of the AssumeRoleWithWebIdentity operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws IDPRejectedClaimException
     *         The identity provider (IdP) reported that authentication failed. This might be because the claim is
     *         invalid.</p>
     *         <p>
     *         If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that
     *         the claim has expired or has been explicitly revoked.
     * @throws IDPCommunicationErrorException
     *         The request could not be fulfilled because the non-AWS identity provider (IDP) that was asked to verify
     *         the incoming identity token could not be reached. This is often a transient error caused by network
     *         conditions. Retry the request a limited number of times so that you don't exceed the request rate. If the
     *         error persists, the non-AWS identity provider might be down or not responding.
     * @throws InvalidIdentityTokenException
     *         The web identity token that was passed could not be validated by AWS. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws ExpiredTokenException
     *         The web identity token that was passed is expired or is not valid. Get a new identity token from the
     *         identity provider and then retry the request.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.AssumeRoleWithWebIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithWebIdentity" target="_top">AWS
     *      API Documentation</a>
     */
    AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest);

    /**
     * <p>
     * Decodes additional information about the authorization status of a request from an encoded message returned in
     * response to an AWS request.
     * </p>
     * <p>
     * For example, if a user is not authorized to perform an operation that he or she has requested, the request
     * returns a <code>Client.UnauthorizedOperation</code> response (an HTTP 403 response). Some AWS operations
     * additionally return an encoded message that can provide details about this authorization failure.
     * </p>
     * <note>
     * <p>
     * Only certain AWS operations return an encoded authorization message. The documentation for an individual
     * operation indicates whether that operation returns an encoded message in addition to returning an HTTP code.
     * </p>
     * </note>
     * <p>
     * The message is encoded because the details of the authorization status can constitute privileged information that
     * the user who requested the operation should not see. To decode an authorization status message, a user must be
     * granted permissions via an IAM policy to request the <code>DecodeAuthorizationMessage</code> (
     * <code>sts:DecodeAuthorizationMessage</code>) action.
     * </p>
     * <p>
     * The decoded message includes the following type of information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether the request was denied due to an explicit deny or due to the absence of an explicit allow. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow"
     * >Determining Whether a Request is Allowed or Denied</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal who made the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The requested action.
     * </p>
     * </li>
     * <li>
     * <p>
     * The requested resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values of condition keys in the context of the user's request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param decodeAuthorizationMessageRequest
     * @return Result of the DecodeAuthorizationMessage operation returned by the service.
     * @throws InvalidAuthorizationMessageException
     *         The error returned if the message passed to <code>DecodeAuthorizationMessage</code> was invalid. This can
     *         happen if the token contains invalid characters, such as linebreaks.
     * @sample AWSSecurityTokenService.DecodeAuthorizationMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/DecodeAuthorizationMessage" target="_top">AWS
     *      API Documentation</a>
     */
    DecodeAuthorizationMessageResult decodeAuthorizationMessage(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest);

    /**
     * <p>
     * Returns the account identifier for the specified access key ID.
     * </p>
     * <p>
     * Access keys consist of two parts: an access key ID (for example, <code>AKIAIOSFODNN7EXAMPLE</code>) and a secret
     * access key (for example, <code>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</code>). For more information about
     * access keys, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_access-keys.html">Managing Access Keys for
     * IAM Users</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * When you pass an access key ID to this operation, it returns the ID of the AWS account to which the keys belong.
     * Access key IDs beginning with <code>AKIA</code> are long-term credentials for an IAM user or the AWS account root
     * user. Access key IDs beginning with <code>ASIA</code> are temporary credentials that are created using STS
     * operations. If the account in the response belongs to you, you can sign in as the root user and review your root
     * user access keys. Then, you can pull a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_getting-report.html">credentials report</a>
     * to learn which IAM user owns the keys. To learn who requested the temporary credentials for an <code>ASIA</code>
     * access key, view the STS events in your <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html">CloudTrail logs</a>.
     * </p>
     * <p>
     * This operation does not indicate the state of the access key. The key might be active, inactive, or deleted.
     * Active keys might not have permissions to perform an operation. Providing a deleted access key might return an
     * error that the key doesn't exist.
     * </p>
     * 
     * @param getAccessKeyInfoRequest
     * @return Result of the GetAccessKeyInfo operation returned by the service.
     * @sample AWSSecurityTokenService.GetAccessKeyInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetAccessKeyInfo" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccessKeyInfoResult getAccessKeyInfo(GetAccessKeyInfoRequest getAccessKeyInfoRequest);

    /**
     * <p>
     * Returns details about the IAM user or role whose credentials are used to call the operation.
     * </p>
     * <note>
     * <p>
     * No permissions are required to perform this operation. If an administrator adds a policy to your IAM user or role
     * that explicitly denies access to the <code>sts:GetCallerIdentity</code> action, you can still perform this
     * operation. Permissions are not required because the same information is returned when an IAM user or role is
     * denied access. To view an example response, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_access-denied-delete-mfa"
     * >I Am Not Authorized to Perform: iam:DeleteVirtualMFADevice</a>.
     * </p>
     * </note>
     * 
     * @param getCallerIdentityRequest
     * @return Result of the GetCallerIdentity operation returned by the service.
     * @sample AWSSecurityTokenService.GetCallerIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetCallerIdentity" target="_top">AWS API
     *      Documentation</a>
     */
    GetCallerIdentityResult getCallerIdentity(GetCallerIdentityRequest getCallerIdentityRequest);

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an access key ID, a secret access key, and a
     * security token) for a federated user. A typical use is in a proxy application that gets temporary security
     * credentials on behalf of distributed applications inside a corporate network. You must call the
     * <code>GetFederationToken</code> operation using the long-term security credentials of an IAM user. As a result,
     * this call is appropriate in contexts where those credentials can be safely stored, usually in a server-based
     * application. For a comparison of <code>GetFederationToken</code> with the other API operations that produce
     * temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can create a mobile-based or browser-based app that can authenticate users using a web identity provider like
     * Login with Amazon, Facebook, Google, or an OpenID Connect-compatible identity provider. In this case, we
     * recommend that you use <a href="http://aws.amazon.com/cognito/">Amazon Cognito</a> or
     * <code>AssumeRoleWithWebIdentity</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </note>
     * <p>
     * You can also call <code>GetFederationToken</code> using the security credentials of an AWS account root user, but
     * we do not recommend it. Instead, we recommend that you create an IAM user for the purpose of the proxy
     * application. Then attach a policy to the IAM user that limits federated users to only the actions and resources
     * that they need to access. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html">IAM Best Practices</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The temporary credentials are valid for the specified duration, from 900 seconds (15 minutes) up to a maximum of
     * 129,600 seconds (36 hours). The default is 43,200 seconds (12 hours). Temporary credentials that are obtained by
     * using AWS account root user credentials have a maximum duration of 3,600 seconds (1 hour).
     * </p>
     * <p>
     * The temporary security credentials created by <code>GetFederationToken</code> can be used to make API calls to
     * any AWS service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot use these credentials to call any IAM API operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS API operations except <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * You must pass an inline or managed <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a>
     * to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also
     * specify up to 10 managed policies to use as managed session policies. The plain text that you use for both inline
     * and managed session policies shouldn't exceed 2048 characters.
     * </p>
     * <p>
     * Though the session policy parameters are optional, if you do not pass a policy, then the resulting federated user
     * session has no permissions. The only exception is when the credentials are used to access a resource that has a
     * resource-based policy that specifically references the federated user session in the <code>Principal</code>
     * element of the policy. When you pass session policies, the session permissions are the intersection of the IAM
     * user policies and the session policies that you pass. This gives you a way to further restrict the permissions
     * for a federated user. You cannot use session policies to grant more permissions than those that are defined in
     * the permissions policy of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
     * Policies</a> in the <i>IAM User Guide</i>. For information about using <code>GetFederationToken</code> to create
     * temporary security credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
     * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws PackedPolicyTooLargeException
     *         The request was rejected because the policy document was too large. The error message describes how big
     *         the policy document is, in packed form, as a percentage of what the API allows.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest);

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM user. The credentials consist of an access key
     * ID, a secret access key, and a security token. Typically, you use <code>GetSessionToken</code> if you want to use
     * MFA to protect programmatic calls to specific AWS API operations like Amazon EC2 <code>StopInstances</code>.
     * MFA-enabled IAM users would need to call <code>GetSessionToken</code> and submit an MFA code that is associated
     * with their MFA device. Using the temporary security credentials that are returned from the call, IAM users can
     * then make programmatic calls to API operations that require MFA authentication. If you do not supply a correct
     * MFA code, then the API returns an access denied error. For a comparison of <code>GetSessionToken</code> with the
     * other API operations that produce temporary credentials, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html">Requesting Temporary
     * Security Credentials</a> and <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS API operations</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> operation must be called by using the long-term AWS security credentials of the
     * AWS account root user or an IAM user. Credentials that are created by IAM users are valid for the duration that
     * you specify. This duration can range from 900 seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours),
     * with a default of 43,200 seconds (12 hours). Credentials based on account credentials can range from 900 seconds
     * (15 minutes) up to 3,600 seconds (1 hour), with a default of 1 hour.
     * </p>
     * <p>
     * The temporary security credentials created by <code>GetSessionToken</code> can be used to make API calls to any
     * AWS service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot call any IAM API operations unless MFA authentication information is included in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS API <i>except</i> <code>AssumeRole</code> or <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We recommend that you do not call <code>GetSessionToken</code> with AWS account root user credentials. Instead,
     * follow our <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users">best
     * practices</a> by creating one or more IAM users, giving them the necessary permissions, and using IAM users for
     * everyday interaction with AWS.
     * </p>
     * </note>
     * <p>
     * The credentials that are returned by <code>GetSessionToken</code> are based on permissions associated with the
     * user whose credentials were used to call the operation. If <code>GetSessionToken</code> is called using AWS
     * account root user credentials, the temporary credentials have root user permissions. Similarly, if
     * <code>GetSessionToken</code> is called using the credentials of an IAM user, the temporary credentials have the
     * same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to create temporary credentials, go to <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"
     * >Temporary Credentials for Users in Untrusted Environments</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getSessionTokenRequest
     * @return Result of the GetSessionToken operation returned by the service.
     * @throws RegionDisabledException
     *         STS is not activated in the requested region for the account that is being asked to generate credentials.
     *         The account administrator must use the IAM console to activate STS in that region. For more information,
     *         see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">
     *         Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @sample AWSSecurityTokenService.GetSessionToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/GetSessionToken" target="_top">AWS API
     *      Documentation</a>
     */
    GetSessionTokenResult getSessionToken(GetSessionTokenRequest getSessionTokenRequest);

    /**
     * Simplified method form for invoking the GetSessionToken operation.
     *
     * @see #getSessionToken(GetSessionTokenRequest)
     */
    GetSessionTokenResult getSessionToken();

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
