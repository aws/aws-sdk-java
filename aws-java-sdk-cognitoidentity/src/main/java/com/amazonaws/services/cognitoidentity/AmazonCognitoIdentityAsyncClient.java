/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.cognitoidentity;

import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Interface for accessing Amazon Cognito Identity asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Cognito</fullname>
 * <p>
 * Amazon Cognito is a web service that delivers scoped temporary credentials to
 * mobile devices and other untrusted environments. Amazon Cognito uniquely
 * identifies a device and supplies the user with a consistent identity over the
 * lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito, you can enable authentication with one or more
 * third-party identity providers (Facebook, Google, or Login with Amazon), and
 * you can also choose to support unauthenticated access from your app. Cognito
 * delivers a unique identifier for each user and acts as an OpenID token
 * provider trusted by AWS Security Token Service (STS) to access temporary,
 * limited-privilege AWS credentials.
 * </p>
 * <p>
 * To provide end-user credentials, first make an unsigned call to <a>GetId</a>.
 * If the end user is authenticated with one of the supported identity
 * providers, set the <code>Logins</code> map with the identity provider token.
 * <code>GetId</code> returns a unique identifier for the user.
 * </p>
 * <p>
 * Next, make an unsigned call to <a>GetCredentialsForIdentity</a>. This call
 * expects the same <code>Logins</code> map as the <code>GetId</code> call, as
 * well as the <code>IdentityID</code> originally returned by <code>GetId</code>
 * . Assuming your identity pool has been configured via the
 * <a>SetIdentityPoolRoles</a> operation, <code>GetCredentialsForIdentity</code>
 * will return AWS credentials for your use. If your pool has not been
 * configured with <code>SetIdentityPoolRoles</code>, or if you want to follow
 * legacy flow, make an unsigned call to <a>GetOpenIdToken</a>, which returns
 * the OpenID token necessary to call STS and retrieve AWS credentials. This
 * call expects the same <code>Logins</code> map as the <code>GetId</code> call,
 * as well as the <code>IdentityID</code> originally returned by
 * <code>GetId</code>. The token returned by <code>GetOpenIdToken</code> can be
 * passed to the STS operation <a href=
 * "http://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRoleWithWebIdentity.html"
 * >AssumeRoleWithWebIdentity</a> to retrieve AWS credentials.
 * </p>
 * <p>
 * If you want to use Amazon Cognito in an Android, iOS, or Unity application,
 * you will probably want to make API calls via the AWS Mobile SDK. To learn
 * more, see the <a href="http://docs.aws.amazon.com/mobile/index.html">AWS
 * Mobile SDK Developer Guide</a>.
 * </p>
 */
public class AmazonCognitoIdentityAsyncClient extends
        AmazonCognitoIdentityClient implements AmazonCognitoIdentityAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCognitoIdentityAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity. A credentials provider chain will be used that searches
     * for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Cognito Identity (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the specified AWS account credentials, executor
     * service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the specified AWS account credentials provider.
     * Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the provided AWS account credentials provider and
     * client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Cognito Identity using the specified AWS account credentials provider,
     * executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCognitoIdentityAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityPoolResult> createIdentityPoolAsync(
            CreateIdentityPoolRequest request) {

        return createIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityPoolResult> createIdentityPoolAsync(
            final CreateIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateIdentityPoolResult>() {
                    @Override
                    public CreateIdentityPoolResult call() throws Exception {
                        CreateIdentityPoolResult result;

                        try {
                            result = createIdentityPool(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitiesResult> deleteIdentitiesAsync(
            DeleteIdentitiesRequest request) {

        return deleteIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitiesResult> deleteIdentitiesAsync(
            final DeleteIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentitiesRequest, DeleteIdentitiesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteIdentitiesResult>() {
                    @Override
                    public DeleteIdentitiesResult call() throws Exception {
                        DeleteIdentitiesResult result;

                        try {
                            result = deleteIdentities(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIdentityPoolAsync(
            DeleteIdentityPoolRequest request) {

        return deleteIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteIdentityPoolAsync(
            final DeleteIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityPoolRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteIdentityPool(request);
                            result = null;
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityResult> describeIdentityAsync(
            DescribeIdentityRequest request) {

        return describeIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityResult> describeIdentityAsync(
            final DescribeIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityRequest, DescribeIdentityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeIdentityResult>() {
                    @Override
                    public DescribeIdentityResult call() throws Exception {
                        DescribeIdentityResult result;

                        try {
                            result = describeIdentity(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(
            DescribeIdentityPoolRequest request) {

        return describeIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(
            final DescribeIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityPoolRequest, DescribeIdentityPoolResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeIdentityPoolResult>() {
                    @Override
                    public DescribeIdentityPoolResult call() throws Exception {
                        DescribeIdentityPoolResult result;

                        try {
                            result = describeIdentityPool(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetCredentialsForIdentityResult> getCredentialsForIdentityAsync(
            GetCredentialsForIdentityRequest request) {

        return getCredentialsForIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialsForIdentityResult> getCredentialsForIdentityAsync(
            final GetCredentialsForIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCredentialsForIdentityRequest, GetCredentialsForIdentityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetCredentialsForIdentityResult>() {
                    @Override
                    public GetCredentialsForIdentityResult call()
                            throws Exception {
                        GetCredentialsForIdentityResult result;

                        try {
                            result = getCredentialsForIdentity(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetIdResult> getIdAsync(
            GetIdRequest request) {

        return getIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdResult> getIdAsync(
            final GetIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdRequest, GetIdResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetIdResult>() {
                    @Override
                    public GetIdResult call() throws Exception {
                        GetIdResult result;

                        try {
                            result = getId(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolRolesResult> getIdentityPoolRolesAsync(
            GetIdentityPoolRolesRequest request) {

        return getIdentityPoolRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolRolesResult> getIdentityPoolRolesAsync(
            final GetIdentityPoolRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityPoolRolesRequest, GetIdentityPoolRolesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetIdentityPoolRolesResult>() {
                    @Override
                    public GetIdentityPoolRolesResult call() throws Exception {
                        GetIdentityPoolRolesResult result;

                        try {
                            result = getIdentityPoolRoles(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetOpenIdTokenResult> getOpenIdTokenAsync(
            GetOpenIdTokenRequest request) {

        return getOpenIdTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOpenIdTokenResult> getOpenIdTokenAsync(
            final GetOpenIdTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetOpenIdTokenResult>() {
                    @Override
                    public GetOpenIdTokenResult call() throws Exception {
                        GetOpenIdTokenResult result;

                        try {
                            result = getOpenIdToken(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(
            GetOpenIdTokenForDeveloperIdentityRequest request) {

        return getOpenIdTokenForDeveloperIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOpenIdTokenForDeveloperIdentityResult> getOpenIdTokenForDeveloperIdentityAsync(
            final GetOpenIdTokenForDeveloperIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOpenIdTokenForDeveloperIdentityRequest, GetOpenIdTokenForDeveloperIdentityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetOpenIdTokenForDeveloperIdentityResult>() {
                    @Override
                    public GetOpenIdTokenForDeveloperIdentityResult call()
                            throws Exception {
                        GetOpenIdTokenForDeveloperIdentityResult result;

                        try {
                            result = getOpenIdTokenForDeveloperIdentity(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            ListIdentitiesRequest request) {

        return listIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            final ListIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListIdentitiesResult>() {
                    @Override
                    public ListIdentitiesResult call() throws Exception {
                        ListIdentitiesResult result;

                        try {
                            result = listIdentities(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolsResult> listIdentityPoolsAsync(
            ListIdentityPoolsRequest request) {

        return listIdentityPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolsResult> listIdentityPoolsAsync(
            final ListIdentityPoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityPoolsRequest, ListIdentityPoolsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListIdentityPoolsResult>() {
                    @Override
                    public ListIdentityPoolsResult call() throws Exception {
                        ListIdentityPoolsResult result;

                        try {
                            result = listIdentityPools(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(
            LookupDeveloperIdentityRequest request) {

        return lookupDeveloperIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(
            final LookupDeveloperIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<LookupDeveloperIdentityRequest, LookupDeveloperIdentityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<LookupDeveloperIdentityResult>() {
                    @Override
                    public LookupDeveloperIdentityResult call()
                            throws Exception {
                        LookupDeveloperIdentityResult result;

                        try {
                            result = lookupDeveloperIdentity(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(
            MergeDeveloperIdentitiesRequest request) {

        return mergeDeveloperIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(
            final MergeDeveloperIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeDeveloperIdentitiesRequest, MergeDeveloperIdentitiesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<MergeDeveloperIdentitiesResult>() {
                    @Override
                    public MergeDeveloperIdentitiesResult call()
                            throws Exception {
                        MergeDeveloperIdentitiesResult result;

                        try {
                            result = mergeDeveloperIdentities(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> setIdentityPoolRolesAsync(
            SetIdentityPoolRolesRequest request) {

        return setIdentityPoolRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setIdentityPoolRolesAsync(
            final SetIdentityPoolRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityPoolRolesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setIdentityPoolRoles(request);
                            result = null;
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> unlinkDeveloperIdentityAsync(
            UnlinkDeveloperIdentityRequest request) {

        return unlinkDeveloperIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unlinkDeveloperIdentityAsync(
            final UnlinkDeveloperIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnlinkDeveloperIdentityRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            unlinkDeveloperIdentity(request);
                            result = null;
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> unlinkIdentityAsync(
            UnlinkIdentityRequest request) {

        return unlinkIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unlinkIdentityAsync(
            final UnlinkIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnlinkIdentityRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            unlinkIdentity(request);
                            result = null;
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(
            UpdateIdentityPoolRequest request) {

        return updateIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(
            final UpdateIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentityPoolRequest, UpdateIdentityPoolResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateIdentityPoolResult>() {
                    @Override
                    public UpdateIdentityPoolResult call() throws Exception {
                        UpdateIdentityPoolResult result;

                        try {
                            result = updateIdentityPool(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
