/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.securitytoken.model.*;

/**
 * Asynchronous client for accessing AWSSecurityTokenService.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Security Token Service <p>
 * The AWS Security Token Service (STS) is a web service that enables you
 * to request temporary, limited-privilege credentials for AWS Identity
 * and Access Management (IAM) users or for users that you authenticate
 * (federated users). This guide provides descriptions of the STS API.
 * For more detailed information about using this service, go to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/Welcome.html"> Using Temporary Security Credentials </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of
 * the AWS SDKs, which consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .NET, iOS, Android,
 * etc.). The SDKs provide a convenient way to create programmatic access
 * to STS. For example, the SDKs take care of cryptographically signing
 * requests, managing errors, and retrying requests automatically. For
 * information about the AWS SDKs, including how to download and install
 * them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through
 * the API, go to
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a> in the <i>AWS General Reference</i> . For general information about the Query API, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a> in <i>Using IAM</i> . For information about using security tokens with other AWS products, go to <a href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/UsingTokens.html"> Using Temporary Security Credentials to Access AWS </a>
 * in <i>Using Temporary Security Credentials</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical
 * documentation at
 * <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a>
 * .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For information about STS endpoints, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"> Regions and Endpoints </a>
 * in the <i>AWS General Reference</i> .
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls
 * for your AWS account and delivers log files to an Amazon S3 bucket. By
 * using information collected by CloudTrail, you can determine what
 * requests were successfully made to STS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to
 * turn it on and find your log files, see the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/whatisawscloudtrail.html"> AWS CloudTrail User Guide </a>
 * .
 * </p>
 */
public class AWSSecurityTokenServiceAsyncClient extends AWSSecurityTokenServiceClient
        implements AWSSecurityTokenServiceAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSecurityTokenServiceAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
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
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSecurityTokenServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSecurityTokenService using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSecurityTokenServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM user.
     * The credentials consist of an access key ID, a secret access key, and
     * a security token. Typically, you use <code>GetSessionToken</code> if
     * you want to use MFA to protect programmatic calls to specific AWS APIs
     * like Amazon EC2 <code>StopInstances</code> . MFA-enabled IAM users
     * would need to call <code>GetSessionToken</code> and submit an MFA code
     * that is associated with their MFA device. Using the temporary security
     * credentials that are returned from the call, IAM users can then make
     * programmatic calls to APIs that require MFA authentication.
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
     * <b>NOTE:</b> We recommend that you do not call GetSessionToken with
     * root account credentials. Instead, follow our best practices by
     * creating one or more IAM users, giving them the necessary permissions,
     * and using IAM users for everyday interaction with AWS.
     * </p>
     * <p>
     * The permissions associated with the temporary security credentials
     * returned by <code>GetSessionToken</code> are based on the permissions
     * associated with account or IAM user whose credentials are used to call
     * the action. If <code>GetSessionToken</code> is called using root
     * account credentials, the temporary credentials have root account
     * permissions. Similarly, if <code>GetSessionToken</code> is called
     * using the credentials of an IAM user, the temporary credentials have
     * the same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html"> Creating Temporary Credentials to Enable Access for IAM Users </a>
     * in <i>Using Temporary Security Credentials</i> .
     * </p>
     *
     * @param getSessionTokenRequest Container for the necessary parameters
     *           to execute the GetSessionToken operation on AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSessionToken service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<GetSessionTokenResult> getSessionTokenAsync(final GetSessionTokenRequest getSessionTokenRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSessionTokenResult>() {
            public GetSessionTokenResult call() throws Exception {
                return getSessionToken(getSessionTokenRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM user.
     * The credentials consist of an access key ID, a secret access key, and
     * a security token. Typically, you use <code>GetSessionToken</code> if
     * you want to use MFA to protect programmatic calls to specific AWS APIs
     * like Amazon EC2 <code>StopInstances</code> . MFA-enabled IAM users
     * would need to call <code>GetSessionToken</code> and submit an MFA code
     * that is associated with their MFA device. Using the temporary security
     * credentials that are returned from the call, IAM users can then make
     * programmatic calls to APIs that require MFA authentication.
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
     * <b>NOTE:</b> We recommend that you do not call GetSessionToken with
     * root account credentials. Instead, follow our best practices by
     * creating one or more IAM users, giving them the necessary permissions,
     * and using IAM users for everyday interaction with AWS.
     * </p>
     * <p>
     * The permissions associated with the temporary security credentials
     * returned by <code>GetSessionToken</code> are based on the permissions
     * associated with account or IAM user whose credentials are used to call
     * the action. If <code>GetSessionToken</code> is called using root
     * account credentials, the temporary credentials have root account
     * permissions. Similarly, if <code>GetSessionToken</code> is called
     * using the credentials of an IAM user, the temporary credentials have
     * the same permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to
     * create temporary credentials, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/CreatingSessionTokens.html"> Creating Temporary Credentials to Enable Access for IAM Users </a>
     * in <i>Using Temporary Security Credentials</i> .
     * </p>
     *
     * @param getSessionTokenRequest Container for the necessary parameters
     *           to execute the GetSessionToken operation on AWSSecurityTokenService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSessionToken service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<GetSessionTokenResult> getSessionTokenAsync(
            final GetSessionTokenRequest getSessionTokenRequest,
            final AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSessionTokenResult>() {
            public GetSessionTokenResult call() throws Exception {
              GetSessionTokenResult result;
                try {
                result = getSessionToken(getSessionTokenRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getSessionTokenRequest, result);
                 return result;
        }
    });
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
     * the absence of an explicit allow. For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_EvaluationLogic.html#policy-eval-denyallow"> Determining Whether a Request is Allowed or Denied </a>
     * in <i>Using IAM</i> . </li>
     * <li>The principal who made the request.</li>
     * <li>The requested action.</li>
     * <li>The requested resource.</li>
     * <li>The values of condition keys in the context of the user's
     * request.</li>
     * 
     * </ul>
     *
     * @param decodeAuthorizationMessageRequest Container for the necessary
     *           parameters to execute the DecodeAuthorizationMessage operation on
     *           AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         DecodeAuthorizationMessage service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(final DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DecodeAuthorizationMessageResult>() {
            public DecodeAuthorizationMessageResult call() throws Exception {
                return decodeAuthorizationMessage(decodeAuthorizationMessageRequest);
        }
    });
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
     * the absence of an explicit allow. For more information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_EvaluationLogic.html#policy-eval-denyallow"> Determining Whether a Request is Allowed or Denied </a>
     * in <i>Using IAM</i> . </li>
     * <li>The principal who made the request.</li>
     * <li>The requested action.</li>
     * <li>The requested resource.</li>
     * <li>The values of condition keys in the context of the user's
     * request.</li>
     * 
     * </ul>
     *
     * @param decodeAuthorizationMessageRequest Container for the necessary
     *           parameters to execute the DecodeAuthorizationMessage operation on
     *           AWSSecurityTokenService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DecodeAuthorizationMessage service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(
            final DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest,
            final AsyncHandler<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DecodeAuthorizationMessageResult>() {
            public DecodeAuthorizationMessageResult call() throws Exception {
              DecodeAuthorizationMessageResult result;
                try {
                result = decodeAuthorizationMessage(decodeAuthorizationMessageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(decodeAuthorizationMessageRequest, result);
                 return result;
        }
    });
    }
    
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
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html"> Permissions for AssumeRoleWithSAML </a>
     * in <i>Using Temporary Security Credentials</i> .
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithSAML</code> , you
     * must configure your SAML identity provider (IdP) to issue the claims
     * required by AWS. Additionally, you must use AWS Identity and Access
     * Management (IAM) to create a SAML provider entity in your AWS account
     * that represents your identity provider, and create an IAM role that
     * specifies this SAML provider in its trust policy.
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
     * <li>
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingSAML.html"> Creating Temporary Security Credentials for SAML Federation </a>
     * in <i>Using Temporary Security Credentials</i> . </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/idp-managing-identityproviders.html"> SAML Providers </a>
     * in <i>Using IAM</i> . </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"> Configuring a Relying Party and Claims </a>
     * in <i>Using IAM</i> . </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml.html"> Creating a Role for SAML-Based Federation </a>
     * in <i>Using IAM</i> . </li>
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
     *           parameters to execute the AssumeRoleWithSAML operation on
     *           AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         AssumeRoleWithSAML service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(final AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssumeRoleWithSAMLResult>() {
            public AssumeRoleWithSAMLResult call() throws Exception {
                return assumeRoleWithSAML(assumeRoleWithSAMLRequest);
        }
    });
    }

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
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html"> Permissions for AssumeRoleWithSAML </a>
     * in <i>Using Temporary Security Credentials</i> .
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithSAML</code> , you
     * must configure your SAML identity provider (IdP) to issue the claims
     * required by AWS. Additionally, you must use AWS Identity and Access
     * Management (IAM) to create a SAML provider entity in your AWS account
     * that represents your identity provider, and create an IAM role that
     * specifies this SAML provider in its trust policy.
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
     * <li>
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingSAML.html"> Creating Temporary Security Credentials for SAML Federation </a>
     * in <i>Using Temporary Security Credentials</i> . </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/idp-managing-identityproviders.html"> SAML Providers </a>
     * in <i>Using IAM</i> . </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"> Configuring a Relying Party and Claims </a>
     * in <i>Using IAM</i> . </li>
     * <li>
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml.html"> Creating a Role for SAML-Based Federation </a>
     * in <i>Using IAM</i> . </li>
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
     *           parameters to execute the AssumeRoleWithSAML operation on
     *           AWSSecurityTokenService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssumeRoleWithSAML service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(
            final AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest,
            final AsyncHandler<AssumeRoleWithSAMLRequest, AssumeRoleWithSAMLResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssumeRoleWithSAMLResult>() {
            public AssumeRoleWithSAMLResult call() throws Exception {
              AssumeRoleWithSAMLResult result;
                try {
                result = assumeRoleWithSAML(assumeRoleWithSAMLRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(assumeRoleWithSAMLRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a set of temporary security credentials for users who have
     * been authenticated in a mobile or web application with a web identity
     * provider, such as Login with Amazon, Facebook, or Google.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the
     * use of AWS security credentials. Therefore, you can distribute an
     * application (for example, on mobile devices) that requests temporary
     * security credentials without including long-term AWS credentials in
     * the application, and without deploying server-based proxy services
     * that use long-term AWS credentials. Instead, the identity of the
     * caller is validated by using a token from the web identity provider.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an
     * access key ID, a secret access key, and a security token. Applications
     * can use these temporary security credentials to sign calls to AWS
     * service APIs. The credentials are valid for the duration that you
     * specified when calling <code>AssumeRoleWithWebIdentity</code> , which
     * can be from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     * default, the temporary security credentials are valid for 1 hour.
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
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html"> Permissions for AssumeRoleWithWebIdentity </a>
     * in <i>Using Temporary Security Credentials</i> .
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
     * <li>
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/STSUseCases.html#MobileApplication-KnownProvider"> Creating a Mobile Application with Third-Party Sign-In </a> and <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingWIF.html"> Creating Temporary Security Credentials for Mobile Apps Using Third-Party Identity Providers </a>
     * in <i>Using Temporary Security Credentials</i> . </li>
     * <li>
     * <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation Playground </a>
     * . This interactive website lets you walk through the process of
     * authenticating via Login with Amazon, Facebook, or Google, getting
     * temporary security credentials, and then using those credentials to
     * make a request to AWS. </li>
     * <li>
     * <a href="http://aws.amazon.com/sdkforios/"> AWS SDK for iOS </a> and <a href="http://aws.amazon.com/sdkforandroid/"> AWS SDK for Android </a>
     * . These toolkits contain sample apps that show how to invoke the
     * identity providers, and then how to use the information from these
     * providers to get and use temporary security credentials. </li>
     * <li>
     * <a href="http://aws.amazon.com/articles/4617974389850313"> Web Identity Federation with Mobile Applications </a>
     * . This article discusses web identity federation and shows an example
     * of how to use web identity federation to get access to content in
     * Amazon S3. </li>
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
     *           parameters to execute the AssumeRoleWithWebIdentity operation on
     *           AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         AssumeRoleWithWebIdentity service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(final AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssumeRoleWithWebIdentityResult>() {
            public AssumeRoleWithWebIdentityResult call() throws Exception {
                return assumeRoleWithWebIdentity(assumeRoleWithWebIdentityRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have
     * been authenticated in a mobile or web application with a web identity
     * provider, such as Login with Amazon, Facebook, or Google.
     * </p>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the
     * use of AWS security credentials. Therefore, you can distribute an
     * application (for example, on mobile devices) that requests temporary
     * security credentials without including long-term AWS credentials in
     * the application, and without deploying server-based proxy services
     * that use long-term AWS credentials. Instead, the identity of the
     * caller is validated by using a token from the web identity provider.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an
     * access key ID, a secret access key, and a security token. Applications
     * can use these temporary security credentials to sign calls to AWS
     * service APIs. The credentials are valid for the duration that you
     * specified when calling <code>AssumeRoleWithWebIdentity</code> , which
     * can be from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     * default, the temporary security credentials are valid for 1 hour.
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
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-assume-role.html"> Permissions for AssumeRoleWithWebIdentity </a>
     * in <i>Using Temporary Security Credentials</i> .
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
     * <li>
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/STSUseCases.html#MobileApplication-KnownProvider"> Creating a Mobile Application with Third-Party Sign-In </a> and <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingWIF.html"> Creating Temporary Security Credentials for Mobile Apps Using Third-Party Identity Providers </a>
     * in <i>Using Temporary Security Credentials</i> . </li>
     * <li>
     * <a href="https://web-identity-federation-playground.s3.amazonaws.com/index.html"> Web Identity Federation Playground </a>
     * . This interactive website lets you walk through the process of
     * authenticating via Login with Amazon, Facebook, or Google, getting
     * temporary security credentials, and then using those credentials to
     * make a request to AWS. </li>
     * <li>
     * <a href="http://aws.amazon.com/sdkforios/"> AWS SDK for iOS </a> and <a href="http://aws.amazon.com/sdkforandroid/"> AWS SDK for Android </a>
     * . These toolkits contain sample apps that show how to invoke the
     * identity providers, and then how to use the information from these
     * providers to get and use temporary security credentials. </li>
     * <li>
     * <a href="http://aws.amazon.com/articles/4617974389850313"> Web Identity Federation with Mobile Applications </a>
     * . This article discusses web identity federation and shows an example
     * of how to use web identity federation to get access to content in
     * Amazon S3. </li>
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
     *           parameters to execute the AssumeRoleWithWebIdentity operation on
     *           AWSSecurityTokenService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssumeRoleWithWebIdentity service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(
            final AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest,
            final AsyncHandler<AssumeRoleWithWebIdentityRequest, AssumeRoleWithWebIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssumeRoleWithWebIdentityResult>() {
            public AssumeRoleWithWebIdentityResult call() throws Exception {
              AssumeRoleWithWebIdentityResult result;
                try {
                result = assumeRoleWithWebIdentity(assumeRoleWithWebIdentityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(assumeRoleWithWebIdentityRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an
     * access key ID, a secret access key, and a security token) for a
     * federated user. A typical use is in a proxy application that gets
     * temporary security credentials on behalf of distributed applications
     * inside a corporate network. Because you must call the
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
     * long-term AWS security credentials of an IAM user. You can also call
     * <code>GetFederationToken</code> using the security credentials of an
     * AWS account (root), but this is not recommended. Instead, we recommend
     * that you create an IAM user for the purpose of the proxy application
     * and then attach a policy to the IAM user that limits federated users
     * to only the actions and resources they need access to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html"> IAM Best Practices </a>
     * in <i>Using IAM</i> .
     * </p>
     * <p>
     * The temporary security credentials that are obtained by using the
     * long-term credentials of an IAM user are valid for the specified
     * duration, between 900 seconds (15 minutes) and 129600 seconds (36
     * hours). Temporary credentials that are obtained by using AWS account
     * (root) credentials have a maximum duration of 3600 seconds (1 hour)
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions for the temporary security credentials returned by
     * <code>GetFederationToken</code> are determined by a combination of the
     * following:
     * </p>
     * 
     * <ul>
     * <li>The policy or policies that are attached to the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> .</li>
     * <li>The policy that is passed as a parameter in the call.</li>
     * 
     * </ul>
     * <p>
     * The passed policy is attached to the temporary security credentials
     * that result from the <code>GetFederationToken</code> API call--that
     * is, to the <i>federated user</i> . When the federated user makes an
     * AWS request, AWS evaluates the policy attached to the federated user
     * in combination with the policy or policies attached to the IAM user
     * whose credentials were used to call <code>GetFederationToken</code> .
     * AWS allows the federated user's request only when both the federated
     * user <i> and </i> the IAM user are explicitly allowed to perform the
     * requested action. The passed policy cannot grant more permissions than
     * those that are defined in the IAM user policy.
     * </p>
     * <p>
     * A typical use case is that the permissions of the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> are
     * designed to allow access to all the actions and resources that any
     * federated user will need. Then, for individual users, you pass a
     * policy to the operation that scopes down the permissions to a level
     * that's appropriate to that individual user, using a policy that allows
     * only a subset of permissions that are granted to the IAM user.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security
     * credentials have no effective permissions. The only exception is when
     * the temporary security credentials are used to access a resource that
     * has a resource-based policy that specifically allows the federated
     * user to access the resource.
     * </p>
     * <p>
     * For more information about how permissions work, see
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-get-federation-token.html"> Permissions for GetFederationToken </a> in <i>Using Temporary Security Credentials</i> . For information about using <code>GetFederationToken</code> to create temporary security credentials, see <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingFedTokens.html"> Creating Temporary Credentials to Enable Access for Federated Users </a>
     * in <i>Using Temporary Security Credentials</i> .
     * </p>
     *
     * @param getFederationTokenRequest Container for the necessary
     *           parameters to execute the GetFederationToken operation on
     *           AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<GetFederationTokenResult> getFederationTokenAsync(final GetFederationTokenRequest getFederationTokenRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFederationTokenResult>() {
            public GetFederationTokenResult call() throws Exception {
                return getFederationToken(getFederationTokenRequest);
        }
    });
    }

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an
     * access key ID, a secret access key, and a security token) for a
     * federated user. A typical use is in a proxy application that gets
     * temporary security credentials on behalf of distributed applications
     * inside a corporate network. Because you must call the
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
     * long-term AWS security credentials of an IAM user. You can also call
     * <code>GetFederationToken</code> using the security credentials of an
     * AWS account (root), but this is not recommended. Instead, we recommend
     * that you create an IAM user for the purpose of the proxy application
     * and then attach a policy to the IAM user that limits federated users
     * to only the actions and resources they need access to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html"> IAM Best Practices </a>
     * in <i>Using IAM</i> .
     * </p>
     * <p>
     * The temporary security credentials that are obtained by using the
     * long-term credentials of an IAM user are valid for the specified
     * duration, between 900 seconds (15 minutes) and 129600 seconds (36
     * hours). Temporary credentials that are obtained by using AWS account
     * (root) credentials have a maximum duration of 3600 seconds (1 hour)
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions for the temporary security credentials returned by
     * <code>GetFederationToken</code> are determined by a combination of the
     * following:
     * </p>
     * 
     * <ul>
     * <li>The policy or policies that are attached to the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> .</li>
     * <li>The policy that is passed as a parameter in the call.</li>
     * 
     * </ul>
     * <p>
     * The passed policy is attached to the temporary security credentials
     * that result from the <code>GetFederationToken</code> API call--that
     * is, to the <i>federated user</i> . When the federated user makes an
     * AWS request, AWS evaluates the policy attached to the federated user
     * in combination with the policy or policies attached to the IAM user
     * whose credentials were used to call <code>GetFederationToken</code> .
     * AWS allows the federated user's request only when both the federated
     * user <i> and </i> the IAM user are explicitly allowed to perform the
     * requested action. The passed policy cannot grant more permissions than
     * those that are defined in the IAM user policy.
     * </p>
     * <p>
     * A typical use case is that the permissions of the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> are
     * designed to allow access to all the actions and resources that any
     * federated user will need. Then, for individual users, you pass a
     * policy to the operation that scopes down the permissions to a level
     * that's appropriate to that individual user, using a policy that allows
     * only a subset of permissions that are granted to the IAM user.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security
     * credentials have no effective permissions. The only exception is when
     * the temporary security credentials are used to access a resource that
     * has a resource-based policy that specifically allows the federated
     * user to access the resource.
     * </p>
     * <p>
     * For more information about how permissions work, see
     * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/permissions-get-federation-token.html"> Permissions for GetFederationToken </a> in <i>Using Temporary Security Credentials</i> . For information about using <code>GetFederationToken</code> to create temporary security credentials, see <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/CreatingFedTokens.html"> Creating Temporary Credentials to Enable Access for Federated Users </a>
     * in <i>Using Temporary Security Credentials</i> .
     * </p>
     *
     * @param getFederationTokenRequest Container for the necessary
     *           parameters to execute the GetFederationToken operation on
     *           AWSSecurityTokenService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by
     *         AWSSecurityTokenService.
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
    public Future<GetFederationTokenResult> getFederationTokenAsync(
            final GetFederationTokenRequest getFederationTokenRequest,
            final AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetFederationTokenResult>() {
            public GetFederationTokenResult call() throws Exception {
              GetFederationTokenResult result;
                try {
                result = getFederationToken(getFederationTokenRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getFederationTokenRequest, result);
                 return result;
        }
    });
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
     * @param assumeRoleRequest Container for the necessary parameters to
     *           execute the AssumeRole operation on AWSSecurityTokenService.
     * 
     * @return A Java Future object containing the response from the
     *         AssumeRole service method, as returned by AWSSecurityTokenService.
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
    public Future<AssumeRoleResult> assumeRoleAsync(final AssumeRoleRequest assumeRoleRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssumeRoleResult>() {
            public AssumeRoleResult call() throws Exception {
                return assumeRole(assumeRoleRequest);
        }
    });
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
     * @param assumeRoleRequest Container for the necessary parameters to
     *           execute the AssumeRole operation on AWSSecurityTokenService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssumeRole service method, as returned by AWSSecurityTokenService.
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
    public Future<AssumeRoleResult> assumeRoleAsync(
            final AssumeRoleRequest assumeRoleRequest,
            final AsyncHandler<AssumeRoleRequest, AssumeRoleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssumeRoleResult>() {
            public AssumeRoleResult call() throws Exception {
              AssumeRoleResult result;
                try {
                result = assumeRole(assumeRoleRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(assumeRoleRequest, result);
                 return result;
        }
    });
    }
    
}
        