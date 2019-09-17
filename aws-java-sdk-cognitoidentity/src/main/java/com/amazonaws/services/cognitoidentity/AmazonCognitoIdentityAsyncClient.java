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
package com.amazonaws.services.cognitoidentity;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Cognito Identity asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Cognito Federated Identities</fullname>
 * <p>
 * Amazon Cognito Federated Identities is a web service that delivers scoped temporary credentials to mobile devices and
 * other untrusted environments. It uniquely identifies a device and supplies the user with a consistent identity over
 * the lifetime of an application.
 * </p>
 * <p>
 * Using Amazon Cognito Federated Identities, you can enable authentication with one or more third-party identity
 * providers (Facebook, Google, or Login with Amazon) or an Amazon Cognito user pool, and you can also choose to support
 * unauthenticated access from your app. Cognito delivers a unique identifier for each user and acts as an OpenID token
 * provider trusted by AWS Security Token Service (STS) to access temporary, limited-privilege AWS credentials.
 * </p>
 * <p>
 * For a description of the authentication flow from the Amazon Cognito Developer Guide see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html">Authentication Flow</a>.
 * </p>
 * <p>
 * For more information see <a
 * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html">Amazon Cognito Federated
 * Identities</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCognitoIdentityAsyncClient extends AmazonCognitoIdentityClient implements AmazonCognitoIdentityAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity. A credentials provider
     * chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity. A credentials provider
     * chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Cognito Identity (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the provided AWS
     * account credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCognitoIdentityAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCognitoIdentityAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCognitoIdentityAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCognitoIdentityAsyncClientBuilder asyncBuilder() {
        return AmazonCognitoIdentityAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Cognito Identity using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCognitoIdentityAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest request) {

        return createIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityPoolResult> createIdentityPoolAsync(final CreateIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler) {
        final CreateIdentityPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIdentityPoolResult>() {
            @Override
            public CreateIdentityPoolResult call() throws Exception {
                CreateIdentityPoolResult result = null;

                try {
                    result = executeCreateIdentityPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitiesResult> deleteIdentitiesAsync(DeleteIdentitiesRequest request) {

        return deleteIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentitiesResult> deleteIdentitiesAsync(final DeleteIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentitiesRequest, DeleteIdentitiesResult> asyncHandler) {
        final DeleteIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentitiesResult>() {
            @Override
            public DeleteIdentitiesResult call() throws Exception {
                DeleteIdentitiesResult result = null;

                try {
                    result = executeDeleteIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPoolResult> deleteIdentityPoolAsync(DeleteIdentityPoolRequest request) {

        return deleteIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPoolResult> deleteIdentityPoolAsync(final DeleteIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIdentityPoolRequest, DeleteIdentityPoolResult> asyncHandler) {
        final DeleteIdentityPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIdentityPoolResult>() {
            @Override
            public DeleteIdentityPoolResult call() throws Exception {
                DeleteIdentityPoolResult result = null;

                try {
                    result = executeDeleteIdentityPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityResult> describeIdentityAsync(DescribeIdentityRequest request) {

        return describeIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityResult> describeIdentityAsync(final DescribeIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityRequest, DescribeIdentityResult> asyncHandler) {
        final DescribeIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityResult>() {
            @Override
            public DescribeIdentityResult call() throws Exception {
                DescribeIdentityResult result = null;

                try {
                    result = executeDescribeIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest request) {

        return describeIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(final DescribeIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIdentityPoolRequest, DescribeIdentityPoolResult> asyncHandler) {
        final DescribeIdentityPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIdentityPoolResult>() {
            @Override
            public DescribeIdentityPoolResult call() throws Exception {
                DescribeIdentityPoolResult result = null;

                try {
                    result = executeDescribeIdentityPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCredentialsForIdentityResult> getCredentialsForIdentityAsync(GetCredentialsForIdentityRequest request) {

        return getCredentialsForIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialsForIdentityResult> getCredentialsForIdentityAsync(final GetCredentialsForIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCredentialsForIdentityRequest, GetCredentialsForIdentityResult> asyncHandler) {
        final GetCredentialsForIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCredentialsForIdentityResult>() {
            @Override
            public GetCredentialsForIdentityResult call() throws Exception {
                GetCredentialsForIdentityResult result = null;

                try {
                    result = executeGetCredentialsForIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdResult> getIdAsync(GetIdRequest request) {

        return getIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdResult> getIdAsync(final GetIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdRequest, GetIdResult> asyncHandler) {
        final GetIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdResult>() {
            @Override
            public GetIdResult call() throws Exception {
                GetIdResult result = null;

                try {
                    result = executeGetId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolRolesResult> getIdentityPoolRolesAsync(GetIdentityPoolRolesRequest request) {

        return getIdentityPoolRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoolRolesResult> getIdentityPoolRolesAsync(final GetIdentityPoolRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIdentityPoolRolesRequest, GetIdentityPoolRolesResult> asyncHandler) {
        final GetIdentityPoolRolesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIdentityPoolRolesResult>() {
            @Override
            public GetIdentityPoolRolesResult call() throws Exception {
                GetIdentityPoolRolesResult result = null;

                try {
                    result = executeGetIdentityPoolRoles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest request) {

        return getOpenIdTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOpenIdTokenResult> getOpenIdTokenAsync(final GetOpenIdTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler) {
        final GetOpenIdTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOpenIdTokenResult>() {
            @Override
            public GetOpenIdTokenResult call() throws Exception {
                GetOpenIdTokenResult result = null;

                try {
                    result = executeGetOpenIdToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
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
        final GetOpenIdTokenForDeveloperIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOpenIdTokenForDeveloperIdentityResult>() {
            @Override
            public GetOpenIdTokenForDeveloperIdentityResult call() throws Exception {
                GetOpenIdTokenForDeveloperIdentityResult result = null;

                try {
                    result = executeGetOpenIdTokenForDeveloperIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest request) {

        return listIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(final ListIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {
        final ListIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentitiesResult>() {
            @Override
            public ListIdentitiesResult call() throws Exception {
                ListIdentitiesResult result = null;

                try {
                    result = executeListIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest request) {

        return listIdentityPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoolsResult> listIdentityPoolsAsync(final ListIdentityPoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIdentityPoolsRequest, ListIdentityPoolsResult> asyncHandler) {
        final ListIdentityPoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIdentityPoolsResult>() {
            @Override
            public ListIdentityPoolsResult call() throws Exception {
                ListIdentityPoolsResult result = null;

                try {
                    result = executeListIdentityPools(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(LookupDeveloperIdentityRequest request) {

        return lookupDeveloperIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LookupDeveloperIdentityResult> lookupDeveloperIdentityAsync(final LookupDeveloperIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<LookupDeveloperIdentityRequest, LookupDeveloperIdentityResult> asyncHandler) {
        final LookupDeveloperIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LookupDeveloperIdentityResult>() {
            @Override
            public LookupDeveloperIdentityResult call() throws Exception {
                LookupDeveloperIdentityResult result = null;

                try {
                    result = executeLookupDeveloperIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(MergeDeveloperIdentitiesRequest request) {

        return mergeDeveloperIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeDeveloperIdentitiesResult> mergeDeveloperIdentitiesAsync(final MergeDeveloperIdentitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeDeveloperIdentitiesRequest, MergeDeveloperIdentitiesResult> asyncHandler) {
        final MergeDeveloperIdentitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergeDeveloperIdentitiesResult>() {
            @Override
            public MergeDeveloperIdentitiesResult call() throws Exception {
                MergeDeveloperIdentitiesResult result = null;

                try {
                    result = executeMergeDeveloperIdentities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetIdentityPoolRolesResult> setIdentityPoolRolesAsync(SetIdentityPoolRolesRequest request) {

        return setIdentityPoolRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityPoolRolesResult> setIdentityPoolRolesAsync(final SetIdentityPoolRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetIdentityPoolRolesRequest, SetIdentityPoolRolesResult> asyncHandler) {
        final SetIdentityPoolRolesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetIdentityPoolRolesResult>() {
            @Override
            public SetIdentityPoolRolesResult call() throws Exception {
                SetIdentityPoolRolesResult result = null;

                try {
                    result = executeSetIdentityPoolRoles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UnlinkDeveloperIdentityResult> unlinkDeveloperIdentityAsync(UnlinkDeveloperIdentityRequest request) {

        return unlinkDeveloperIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnlinkDeveloperIdentityResult> unlinkDeveloperIdentityAsync(final UnlinkDeveloperIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnlinkDeveloperIdentityRequest, UnlinkDeveloperIdentityResult> asyncHandler) {
        final UnlinkDeveloperIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnlinkDeveloperIdentityResult>() {
            @Override
            public UnlinkDeveloperIdentityResult call() throws Exception {
                UnlinkDeveloperIdentityResult result = null;

                try {
                    result = executeUnlinkDeveloperIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UnlinkIdentityResult> unlinkIdentityAsync(UnlinkIdentityRequest request) {

        return unlinkIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnlinkIdentityResult> unlinkIdentityAsync(final UnlinkIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnlinkIdentityRequest, UnlinkIdentityResult> asyncHandler) {
        final UnlinkIdentityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnlinkIdentityResult>() {
            @Override
            public UnlinkIdentityResult call() throws Exception {
                UnlinkIdentityResult result = null;

                try {
                    result = executeUnlinkIdentity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest request) {

        return updateIdentityPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(final UpdateIdentityPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIdentityPoolRequest, UpdateIdentityPoolResult> asyncHandler) {
        final UpdateIdentityPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIdentityPoolResult>() {
            @Override
            public UpdateIdentityPoolResult call() throws Exception {
                UpdateIdentityPoolResult result = null;

                try {
                    result = executeUpdateIdentityPool(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
