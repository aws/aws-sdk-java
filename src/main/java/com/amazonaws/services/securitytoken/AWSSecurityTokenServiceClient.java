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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.services.securitytoken.model.transform.*;


/**
 * Client for accessing AWSSecurityTokenService.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Security Token Service <p>
 * The AWS Security Token Service is a web service that enables you to request temporary, limited-privilege credentials for AWS Identity and Access
 * Management (IAM) users or for users that you authenticate (federated users). This guide provides descriptions of the AWS Security Token Service API.
 * </p>
 * <p>
 * For more detailed information about using this service, go to <a href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/Welcome.html"> Using Temporary
 * Security Credentials </a> .
 * </p>
 * <p>
 * For information about setting up signatures and authorization through the API, go to <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a> in the <i>AWS General Reference</i> .
 * For general information about the Query API, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query
 * Requests </a> in <i>Using IAM</i> . For information about using security tokens with other AWS products, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/UsingTokens.html"> Using Temporary Security Credentials to Access AWS </a> in <i>Using Temporary
 * Security Credentials</i> .
 * 
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a specific AWS product, you can find the product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * We will refer to Amazon Identity and Access Management using the abbreviated form IAM. All copyrights and legal protections still apply.
 * </p>
 */
public class AWSSecurityTokenServiceClient extends AmazonWebServiceClient implements AWSSecurityTokenService {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWSSecurityTokenService exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AWSSecurityTokenService.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AWSSecurityTokenServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecurityTokenService.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecurityTokenService
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AWSSecurityTokenServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSSecurityTokenServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecurityTokenService
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSecurityTokenServiceClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSecurityTokenService
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ExpiredTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IDPCommunicationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PackedPolicyTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IDPRejectedClaimExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIdentityTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidAuthorizationMessageExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("sts.amazonaws.com");

        signer = new AWS4Signer();
        
        signer.setServiceName("sts");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
    requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/securitytoken/request.handlers"));
    }

    
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
     * The permissions that are granted to the federated user are the
     * intersection of the policy that is passed with the
     * <code>GetSessionToken</code> request and policies that are associated
     * with of the entity making the <code>GetSessionToken</code> call.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to <a
     * /docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a> in
     * <i>Using IAM</i> .
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetSessionTokenRequest> request = new GetSessionTokenRequestMarshaller().marshall(getSessionTokenRequest);
        return invoke(request, new GetSessionTokenResultStaxUnmarshaller());
    }
    
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
     * user must be granted permissions via an IAM policy to request the
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
     * IAM</i> .
     * </li>
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
            throws AmazonServiceException, AmazonClientException {
        Request<DecodeAuthorizationMessageRequest> request = new DecodeAuthorizationMessageRequestMarshaller().marshall(decodeAuthorizationMessageRequest);
        return invoke(request, new DecodeAuthorizationMessageResultStaxUnmarshaller());
    }
    
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
     * services that use long-term AWS credentials. For more information, see
     * <a
     * STS/latest/UsingSTS/STSUseCases.html#MobileApplication-KnownProvider">
     * Creating a Mobile Application with Third-Party Sign-In </a> in <i>AWS
     * Security Token Service</i> .
     * 
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
     * The temporary security credentials that are returned from the
     * <code>AssumeRoleWithWebIdentity</code> response have the permissions
     * that are associated with the access policy of the role being assumed.
     * You can further restrict the permissions of the temporary security
     * credentials by passing a policy in the request. The resulting
     * permissions are an intersection of the role's access policy and the
     * policy that you passed. These policies and any applicable
     * resource-based policies are evaluated when calls to AWS service APIs
     * are made using the temporary security credentials.
     * </p>
     * <p>
     * Before your application can call
     * <code>AssumeRoleWithWebIdentity</code> , you must have an identity
     * token from a supported identity provider and create a role that the
     * application can assume. The role that your application assumes must
     * trust the identity provider that is associated with the identity
     * token. In other words, the identity provider must be specified in the
     * role's trust policy. For more information, see <a
     * ref="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingWIF.html">
     * Creating Temporary Security Credentials for Mobile Apps Using
     * Third-Party Identity Providers </a> .
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
            throws AmazonServiceException, AmazonClientException {
        Request<AssumeRoleWithWebIdentityRequest> request = new AssumeRoleWithWebIdentityRequestMarshaller().marshall(assumeRoleWithWebIdentityRequest);
        return invoke(request, new AssumeRoleWithWebIdentityResultStaxUnmarshaller());
    }
    
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
     * 
     * </p>
     * <p>
     * The <code>GetFederationToken</code> action must be called by using
     * the long-term AWS security credentials of the AWS account or an IAM
     * user. Credentials that are created by IAM users are valid for the
     * specified duration, between 900 seconds (15 minutes) and 129600
     * seconds (36 hours); credentials that are created by using account
     * credentials have a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * The permissions that are granted to the federated user are the
     * intersection of the policy that is passed with the
     * <code>GetFederationToken</code> request and policies that are
     * associated with of the entity making the
     * <code>GetFederationToken</code> call.
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
     * 
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
            throws AmazonServiceException, AmazonClientException {
        Request<GetFederationTokenRequest> request = new GetFederationTokenRequestMarshaller().marshall(getFederationTokenRequest);
        return invoke(request, new GetFederationTokenResultStaxUnmarshaller());
    }
    
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
     * 
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
     * 
     * </p>
     * <p>
     * The temporary security credentials are valid for the duration that
     * you specified when calling <code>AssumeRole</code> , which can be from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). The default is 1
     * hour.
     * </p>
     * <p>
     * The temporary security credentials that are returned from the
     * <code>AssumeRoleWithWebIdentity</code> response have the permissions
     * that are associated with the access policy of the role being assumed
     * and any policies that are associated with the AWS resource being
     * accessed. You can further restrict the permissions of the temporary
     * security credentials by passing a policy in the request. The resulting
     * permissions are an intersection of the role's access policy and the
     * policy that you passed. These policies and any applicable
     * resource-based policies are evaluated when calls to AWS service APIs
     * are made using the temporary security credentials.
     * </p>
     * <p>
     * To assume a role, your AWS account must be trusted by the role. The
     * trust relationship is defined in the role's trust policy when the IAM
     * role is created. You must also have a policy that allows you to call
     * <code>sts:AssumeRole</code> .
     * 
     * </p>
     * <p>
     * <b>Important:</b> You cannot call <code>Assumerole</code> by using
     * AWS account credentials; access will be denied. You must use IAM user
     * credentials or temporary security credentials to call
     * <code>AssumeRole</code> .
     * 
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
            throws AmazonServiceException, AmazonClientException {
        Request<AssumeRoleRequest> request = new AssumeRoleRequestMarshaller().marshall(assumeRoleRequest);
        return invoke(request, new AssumeRoleResultStaxUnmarshaller());
    }
    
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
     * The permissions that are granted to the federated user are the
     * intersection of the policy that is passed with the
     * <code>GetSessionToken</code> request and policies that are associated
     * with of the entity making the <code>GetSessionToken</code> call.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to <a
     * /docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html">
     * Creating Temporary Credentials to Enable Access for IAM Users </a> in
     * <i>Using IAM</i> .
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
    public GetSessionTokenResult getSessionToken() throws AmazonServiceException, AmazonClientException {
        return getSessionToken(new GetSessionTokenRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("https://sts.amazonaws.com") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
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
     *
     * @param endpoint
     *            The endpoint (ex: "sts.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://sts.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "sts";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
          credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext(originalRequest);
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        