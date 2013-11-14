/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.securitytoken.model.*;

/**
 * Interface for accessing AWSSecurityTokenService.
 * AWS Security Token Service <p>
 * The AWS Security Token Service (AWS STS) is a web service that enables you to request temporary, limited-privilege credentials for AWS Identity and
 * Access Management (AWS IAM) users or for users that you authenticate (federated users). This guide provides descriptions of the AWS STS API. For more
 * detailed information about using this service, go to <a href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/Welcome.html"> Using Temporary Security
 * Credentials </a> .
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various programming
 * languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS STS. For
 * example, the SDKs take care of cryptographically signing requests, managing errors, and retrying requests automatically. For information about the AWS
 * SDKs, including how to download and install them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through the API, go to <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a> in the <i>AWS General Reference</i>
 * . For general information about the Query API, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query
 * Requests </a> in <i>Using IAM</i> . For information about using security tokens with other AWS products, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/UsingTokens.html"> Using Temporary Security Credentials to Access AWS </a> in <i>Using Temporary
 * Security Credentials</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For information about AWS STS endpoints, see <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"> Regions and Endpoints </a>
 * in the <i>AWS General Reference</i> .
 * </p>
 */
public interface AWSSecurityTokenService {

    /**
     * Overrides the default endpoint for this client ("https://sts.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sts.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://sts.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "sts.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://sts.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSSecurityTokenService#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM
     * user. The credentials consist of an access key ID, a secret access
     * key, and a security token. Typically, you use
     * <code>GetSessionToken</code> if you want use MFA to protect
     * programmatic calls to specific AWS APIs like Amazon EC2
     * <code>StopInstances</code> . MFA-enabled IAM users would need to call
     * <code>GetSessionToken</code> and submit an MFA code that is associated
     * with their MFA device. Using the temporary security credentials that
     * are returned from the call, IAM users can then make programmatic calls
     * to APIs that require MFA authentication.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the duration
     * that you specify, between 900 seconds (15 minutes) and 129600 seconds
     * (36 hours); credentials that are created by using account credentials
     * have a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * Optionally, you can pass an AWS IAM access policy to this operation.
     * The temporary security credentials that are returned by the operation
     * have the permissions that are associated with the entity that is
     * making the <code>GetSessionToken</code> call, except for any
     * permissions explicitly denied by the policy you pass. This gives you a
     * way to further restrict the permissions for the federated user. These
     * policies and any applicable resource-based policies are evaluated when
     * calls to AWS are made using the temporary security credentials.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to <a
     * /docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a>
     * in <i>Using IAM</i> .
     * 
     * </p>
     *
     * @param getSessionTokenRequest Container for the necessary parameters
     *           to execute the GetSessionToken service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the GetSessionToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSessionTokenResult getSessionToken(GetSessionTokenRequest getSessionTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Decodes additional information about the authorization status of a
     * request from an encoded message returned in response to an AWS
     * request.
     * </p>
     * <p>
     * For example, if a user is not authorized to perform an action that he
     * or she has requested, the request returns a
     * <code>Client.UnauthorizedOperation</code> response (an HTTP 403
     * response). Some AWS actions additionally return an encoded message
     * that can provide details about this authorization failure.
     * </p>
     * <p>
     * <b>NOTE:</b> Only certain AWS actions return an encoded authorization
     * message. The documentation for an individual action indicates whether
     * that action returns an encoded message in addition to returning an
     * HTTP code.
     * </p>
     * <p>
     * The message is encoded because the details of the authorization status
     * can constitute privileged information that the user who requested the
     * action should not see. To decode an authorization status message, a
     * user must be granted permissions via an AWS IAM policy to request the
     * <code>DecodeAuthorizationMessage</code> (
     * <code>sts:DecodeAuthorizationMessage</code> )
     * action.
     * </p>
     * <p>
     * The decoded message includes the following type of information:
     * </p>
     * 
     * <ul>
     * <li>Whether the request was denied due to an explicit deny or due to
     * the absence of an explicit allow. For more information, see <a
     * uide/AccessPolicyLanguage_EvaluationLogic.html#policy-eval-denyallow">
     * Determining Whether a Request is Allowed or Denied </a> in <i>Using
     * AWS IAM</i> . </li>
     * <li>The principal who made the request.</li>
     * <li>The requested action.</li>
     * <li>The requested resource.</li>
     * <li>The values of condition keys in the context of the user's
     * request.</li>
     * 
     * </ul>
     *
     * @param decodeAuthorizationMessageRequest Container for the necessary
     *           parameters to execute the DecodeAuthorizationMessage service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the DecodeAuthorizationMessage service
     *         method, as returned by AWSSecurityTokenService.
     * 
     * @throws InvalidAuthorizationMessageException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DecodeAuthorizationMessageResult decodeAuthorizationMessage(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have
     * been authenticated via a SAML authentication response. This operation
     * provides a mechanism for tying an enterprise identity store or
     * directory to role-based AWS access without user-specific credentials
     * or configuration.
     * </p>
     * <p>
     * The temporary security credentials returned by this operation consist
     * of an access key ID, a secret access key, and a security token.
     * Applications can use these temporary security credentials to sign
     * calls to AWS services. The credentials are valid for the duration that
     * you specified when calling <code>AssumeRoleWithSAML</code> , which can
     * be up to 3600 seconds (1 hour) or until the time specified in the SAML
     * authentication response's <code>NotOnOrAfter</code> value, whichever
     * is shorter.
     * </p>
     * <p>
     * <b>NOTE:</b>The maximum duration for a session is 1 hour, and the
     * minimum duration is 15 minutes, even if values outside this range are
     * specified.
     * </p>
     * <p>
     * Optionally, you can pass an AWS IAM access policy to this operation.
     * The temporary security credentials that are returned by the operation
     * have the permissions that are associated with the access policy of the
     * role being assumed, except for any permissions explicitly denied by
     * the policy you pass. This gives you a way to further restrict the
     * permissions for the federated user. These policies and any applicable
     * resource-based policies are evaluated when calls to AWS are made using
     * the temporary security credentials.
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithSAML</code> ,
     * you must configure your SAML identity provider (IdP) to issue the
     * claims required by AWS. Additionally, you must use AWS Identity and
     * Access Management (AWS IAM) to create a SAML provider entity in your
     * AWS account that represents your identity provider, and create an AWS
     * IAM role that specifies this SAML provider in its trust policy.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithSAML</code> does not require the use of
     * AWS security credentials. The identity of the caller is validated by
     * using keys in the metadata document that is uploaded for the SAML
     * provider entity for your identity provider.
     * </p>
     * <p>
     * For more information, see the following resources:
     * </p>
     * 
     * <ul>
     * <li> <a
     * ef="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingSAML.html">
     * Creating Temporary Security Credentials for SAML Federation </a> in
     * the <i>Using Temporary Security Credentials</i> guide. </li>
     * <li> <a
     * .amazon.com/IAM/latest/UserGuide/idp-managing-identityproviders.html">
     * SAML Providers </a> in the <i>Using IAM</i> guide. </li>
     * <li> <a
     * .aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">
     * Configuring a Relying Party and Claims in the Using IAM guide. </a>
     * </li>
     * <li> <a
     * ttp://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml.html">
     * Creating a Role for SAML-Based Federation </a> in the <i>Using IAM</i>
     * guide. </li>
     * 
     * </ul>
     * <p>
     * </p>
     * <p>
     * </p>
     * <p>
     * </p>
     * <p>
     * </p>
     *
     * @param assumeRoleWithSAMLRequest Container for the necessary
     *           parameters to execute the AssumeRoleWithSAML service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the AssumeRoleWithSAML service method, as
     *         returned by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws IDPRejectedClaimException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidIdentityTokenException
     * @throws ExpiredTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssumeRoleWithSAMLResult assumeRoleWithSAML(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have
     * been authenticated in a mobile or web application with a web identity
     * provider, such as Login with Amazon, Facebook, or Google.
     * <code>AssumeRoleWithWebIdentity</code> is an API call that does not
     * require the use of AWS security credentials. Therefore, you can
     * distribute an application (for example, on mobile devices) that
     * requests temporary security credentials without including long-term
     * AWS credentials in the application or by deploying server-based proxy
     * services that use long-term AWS credentials.
     * </p>
     * <p>
     * The temporary security credentials consist of an access key ID, a
     * secret access key, and a security token. Applications can use these
     * temporary security credentials to sign calls to AWS service APIs. The
     * credentials are valid for the duration that you specified when calling
     * <code>AssumeRoleWithWebIdentity</code> , which can be from 900 seconds
     * (15 minutes) to 3600 seconds (1 hour). By default, the temporary
     * security credentials are valid for 1 hour.
     * </p>
     * <p>
     * Optionally, you can pass an AWS IAM access policy to this operation.
     * The temporary security credentials that are returned by the operation
     * have the permissions that are associated with the access policy of the
     * role being assumed, except for any permissions explicitly denied by
     * the policy you pass. This gives you a way to further restrict the
     * permissions for the federated user. These policies and any applicable
     * resource-based policies are evaluated when calls to AWS are made using
     * the temporary security credentials.
     * </p>
     * <p>
     * Before your application can call
     * <code>AssumeRoleWithWebIdentity</code> , you must have an identity
     * token from a supported identity provider and create a role that the
     * application can assume. The role that your application assumes must
     * trust the identity provider that is associated with the identity
     * token. In other words, the identity provider must be specified in the
     * role's trust policy.
     * </p>
     * <p>
     * For more information about how to use web identity federation and the
     * <code>AssumeRoleWithWebIdentity</code> , see the following resources:
     * </p>
     * 
     * <ul>
     * <li> <a
     * STS/latest/UsingSTS/STSUseCases.html#MobileApplication-KnownProvider">
     * Creating a Mobile Application with Third-Party Sign-In </a> and <a
     * ref="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingWIF.html">
     * Creating Temporary Security Credentials for Mobile Apps Using
     * Third-Party Identity Providers </a> in <i>Using Temporary Security
     * Credentials</i> . </li>
     * <li> <a
     * tps://web-identity-federation-playground.s3.amazonaws.com/index.html">
     * Web Identity Federation Playground </a> . This interactive website
     * lets you walk through the process of authenticating via Login with
     * Amazon, Facebook, or Google, getting temporary security credentials,
     * and then using those credentials to make a request to AWS. </li>
     * <li> <a href="http://aws.amazon.com/sdkforios/"> AWS SDK for iOS </a>
     * and <a href="http://aws.amazon.com/sdkforandroid/"> AWS SDK for
     * Android </a> . These toolkits contain sample apps that show how to
     * invoke the identity providers, and then how to use the information
     * from these providers to get and use temporary security credentials.
     * </li>
     * <li> <a href="http://aws.amazon.com/articles/4617974389850313"> Web
     * Identity Federation with Mobile Applications </a> . This article
     * discusses web identity federation and shows an example of how to use
     * web identity federation to get access to content in Amazon S3. </li>
     * 
     * </ul>
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
     * <p>
     * </p>
     *
     * @param assumeRoleWithWebIdentityRequest Container for the necessary
     *           parameters to execute the AssumeRoleWithWebIdentity service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the AssumeRoleWithWebIdentity service
     *         method, as returned by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws IDPRejectedClaimException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidIdentityTokenException
     * @throws ExpiredTokenException
     * @throws IDPCommunicationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an
     * access key ID, a secret access key, and a security token) for a
     * federated user. A typical use is in a proxy application that is
     * getting temporary security credentials on behalf of distributed
     * applications inside a corporate network. Because you must call the
     * <code>GetFederationToken</code> action using the long-term security
     * credentials of an IAM user, this call is appropriate in contexts where
     * those credentials can be safely stored, usually in a server-based
     * application.
     * </p>
     * <p>
     * <b>Note:</b> Do not use this call in mobile applications or
     * client-based web applications that directly get temporary security
     * credentials. For those types of applications, use
     * <code>AssumeRoleWithWebIdentity</code> .
     * </p>
     * <p>
     * The <code>GetFederationToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the specified
     * duration, between 900 seconds (15 minutes) and 129600 seconds (36
     * hours); credentials that are created by using account credentials have
     * a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * Optionally, you can pass an AWS IAM access policy to this operation.
     * The temporary security credentials that are returned by the operation
     * have the permissions that are associated with the entity that is
     * making the <code>GetFederationToken</code> call, except for any
     * permissions explicitly denied by the policy you pass. This gives you a
     * way to further restrict the permissions for the federated user. These
     * policies and any applicable resource-based policies are evaluated when
     * calls to AWS are made using the temporary security credentials.
     * </p>
     * <p>
     * For more information about how permissions work, see <a
     * ttp://docs.aws.amazon.com/IAM/latest/UserGuide/TokenPermissions.html">
     * Controlling Permissions in Temporary Credentials </a> in <i>Using
     * Temporary Security Credentials</i> . For information about using
     * <code>GetFederationToken</code> to create temporary security
     * credentials, see <a
     * tp://docs.aws.amazon.com/IAM/latest/UserGuide/CreatingFedTokens.html">
     * Creating Temporary Credentials to Enable Access for Federated Users
     * </a> in <i>Using Temporary Security Credentials</i> .
     * </p>
     *
     * @param getFederationTokenRequest Container for the necessary
     *           parameters to execute the GetFederationToken service method on
     *           AWSSecurityTokenService.
     * 
     * @return The response from the GetFederationToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws MalformedPolicyDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an
     * access key ID, a secret access key, and a security token) that you can
     * use to access AWS resources that you might not normally have access
     * to. Typically, you use <code>AssumeRole</code> for cross-account
     * access or federation.
     * </p>
     * <p>
     * For cross-account access, imagine that you own multiple accounts and
     * need to access resources in each account. You could create long-term
     * credentials in each account to access those resources. However,
     * managing all those credentials and remembering which one can access
     * which account can be time consuming. Instead, you can create one set
     * of long-term credentials in one account and then use temporary
     * security credentials to access all the other accounts by assuming
     * roles in those accounts. For more information about roles, see <a
     * ttp://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">
     * Roles </a> in <i>Using IAM</i> .
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
     * For more information, see <a
     * ref="http://docs.aws.amazon.com/STS/latest/UsingSTS/STSUseCases.html">
     * Scenarios for Granting Temporary Access </a> in <i>AWS Security Token
     * Service</i> .
     * </p>
     * <p>
     * The temporary security credentials are valid for the duration that
     * you specified when calling <code>AssumeRole</code> , which can be from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). The default is 1
     * hour.
     * </p>
     * <p>
     * Optionally, you can pass an AWS IAM access policy to this operation.
     * The temporary security credentials that are returned by the operation
     * have the permissions that are associated with the access policy of the
     * role that is being assumed, except for any permissions explicitly
     * denied by the policy you pass. This gives you a way to further
     * restrict the permissions for the federated user. These policies and
     * any applicable resource-based policies are evaluated when calls to AWS
     * are made using the temporary security credentials.
     * </p>
     * <p>
     * To assume a role, your AWS account must be trusted by the role. The
     * trust relationship is defined in the role's trust policy when the IAM
     * role is created. You must also have a policy that allows you to call
     * <code>sts:AssumeRole</code> .
     * </p>
     * <p>
     * <b>Important:</b> You cannot call <code>AssumeRole</code> by using
     * AWS account credentials; access will be denied. You must use IAM user
     * credentials or temporary security credentials to call
     * <code>AssumeRole</code> .
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
     * @param assumeRoleRequest Container for the necessary parameters to
     *           execute the AssumeRole service method on AWSSecurityTokenService.
     * 
     * @return The response from the AssumeRole service method, as returned
     *         by AWSSecurityTokenService.
     * 
     * @throws PackedPolicyTooLargeException
     * @throws MalformedPolicyDocumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM
     * user. The credentials consist of an access key ID, a secret access
     * key, and a security token. Typically, you use
     * <code>GetSessionToken</code> if you want use MFA to protect
     * programmatic calls to specific AWS APIs like Amazon EC2
     * <code>StopInstances</code> . MFA-enabled IAM users would need to call
     * <code>GetSessionToken</code> and submit an MFA code that is associated
     * with their MFA device. Using the temporary security credentials that
     * are returned from the call, IAM users can then make programmatic calls
     * to APIs that require MFA authentication.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the duration
     * that you specify, between 900 seconds (15 minutes) and 129600 seconds
     * (36 hours); credentials that are created by using account credentials
     * have a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * Optionally, you can pass an AWS IAM access policy to this operation.
     * The temporary security credentials that are returned by the operation
     * have the permissions that are associated with the entity that is
     * making the <code>GetSessionToken</code> call, except for any
     * permissions explicitly denied by the policy you pass. This gives you a
     * way to further restrict the permissions for the federated user. These
     * policies and any applicable resource-based policies are evaluated when
     * calls to AWS are made using the temporary security credentials.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to <a
     * /docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a>
     * in <i>Using IAM</i> .
     * 
     * </p>
     * 
     * @return The response from the GetSessionToken service method, as
     *         returned by AWSSecurityTokenService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSecurityTokenService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSessionTokenResult getSessionToken() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        