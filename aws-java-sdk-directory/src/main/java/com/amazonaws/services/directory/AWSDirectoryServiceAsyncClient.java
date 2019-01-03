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
package com.amazonaws.services.directory;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Directory Service asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * AWS Directory Service is a web service that makes it easy for you to setup and run directories in the AWS cloud, or
 * connect your AWS resources with an existing on-premises Microsoft Active Directory. This guide provides detailed
 * information about AWS Directory Service operations, data types, parameters, and errors. For information about AWS
 * Directory Services features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the
 * <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html">AWS Directory Service
 * Administration Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS Directory
 * Service and other AWS services. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDirectoryServiceAsyncClient extends AWSDirectoryServiceClient implements AWSDirectoryServiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Directory Service (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the provided AWS
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
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDirectoryServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSDirectoryServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSDirectoryServiceAsyncClientBuilder asyncBuilder() {
        return AWSDirectoryServiceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Directory Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDirectoryServiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptSharedDirectoryResult> acceptSharedDirectoryAsync(AcceptSharedDirectoryRequest request) {

        return acceptSharedDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptSharedDirectoryResult> acceptSharedDirectoryAsync(final AcceptSharedDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptSharedDirectoryRequest, AcceptSharedDirectoryResult> asyncHandler) {
        final AcceptSharedDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptSharedDirectoryResult>() {
            @Override
            public AcceptSharedDirectoryResult call() throws Exception {
                AcceptSharedDirectoryResult result = null;

                try {
                    result = executeAcceptSharedDirectory(finalRequest);
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
    public java.util.concurrent.Future<AddIpRoutesResult> addIpRoutesAsync(AddIpRoutesRequest request) {

        return addIpRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddIpRoutesResult> addIpRoutesAsync(final AddIpRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddIpRoutesRequest, AddIpRoutesResult> asyncHandler) {
        final AddIpRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddIpRoutesResult>() {
            @Override
            public AddIpRoutesResult call() throws Exception {
                AddIpRoutesResult result = null;

                try {
                    result = executeAddIpRoutes(finalRequest);
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {
        final AddTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;

                try {
                    result = executeAddTagsToResource(finalRequest);
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
    public java.util.concurrent.Future<CancelSchemaExtensionResult> cancelSchemaExtensionAsync(CancelSchemaExtensionRequest request) {

        return cancelSchemaExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSchemaExtensionResult> cancelSchemaExtensionAsync(final CancelSchemaExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSchemaExtensionRequest, CancelSchemaExtensionResult> asyncHandler) {
        final CancelSchemaExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSchemaExtensionResult>() {
            @Override
            public CancelSchemaExtensionResult call() throws Exception {
                CancelSchemaExtensionResult result = null;

                try {
                    result = executeCancelSchemaExtension(finalRequest);
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
    public java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(ConnectDirectoryRequest request) {

        return connectDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(final ConnectDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler) {
        final ConnectDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConnectDirectoryResult>() {
            @Override
            public ConnectDirectoryResult call() throws Exception {
                ConnectDirectoryResult result = null;

                try {
                    result = executeConnectDirectory(finalRequest);
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
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
        final CreateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result = null;

                try {
                    result = executeCreateAlias(finalRequest);
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
    public java.util.concurrent.Future<CreateComputerResult> createComputerAsync(CreateComputerRequest request) {

        return createComputerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComputerResult> createComputerAsync(final CreateComputerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler) {
        final CreateComputerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateComputerResult>() {
            @Override
            public CreateComputerResult call() throws Exception {
                CreateComputerResult result = null;

                try {
                    result = executeCreateComputer(finalRequest);
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
    public java.util.concurrent.Future<CreateConditionalForwarderResult> createConditionalForwarderAsync(CreateConditionalForwarderRequest request) {

        return createConditionalForwarderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConditionalForwarderResult> createConditionalForwarderAsync(final CreateConditionalForwarderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConditionalForwarderRequest, CreateConditionalForwarderResult> asyncHandler) {
        final CreateConditionalForwarderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConditionalForwarderResult>() {
            @Override
            public CreateConditionalForwarderResult call() throws Exception {
                CreateConditionalForwarderResult result = null;

                try {
                    result = executeCreateConditionalForwarder(finalRequest);
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
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest request) {

        return createDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(final CreateDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler) {
        final CreateDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectoryResult>() {
            @Override
            public CreateDirectoryResult call() throws Exception {
                CreateDirectoryResult result = null;

                try {
                    result = executeCreateDirectory(finalRequest);
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
    public java.util.concurrent.Future<CreateLogSubscriptionResult> createLogSubscriptionAsync(CreateLogSubscriptionRequest request) {

        return createLogSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogSubscriptionResult> createLogSubscriptionAsync(final CreateLogSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLogSubscriptionRequest, CreateLogSubscriptionResult> asyncHandler) {
        final CreateLogSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLogSubscriptionResult>() {
            @Override
            public CreateLogSubscriptionResult call() throws Exception {
                CreateLogSubscriptionResult result = null;

                try {
                    result = executeCreateLogSubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(CreateMicrosoftADRequest request) {

        return createMicrosoftADAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(final CreateMicrosoftADRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMicrosoftADRequest, CreateMicrosoftADResult> asyncHandler) {
        final CreateMicrosoftADRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMicrosoftADResult>() {
            @Override
            public CreateMicrosoftADResult call() throws Exception {
                CreateMicrosoftADResult result = null;

                try {
                    result = executeCreateMicrosoftAD(finalRequest);
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
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {
        final CreateSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotResult>() {
            @Override
            public CreateSnapshotResult call() throws Exception {
                CreateSnapshotResult result = null;

                try {
                    result = executeCreateSnapshot(finalRequest);
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
    public java.util.concurrent.Future<CreateTrustResult> createTrustAsync(CreateTrustRequest request) {

        return createTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrustResult> createTrustAsync(final CreateTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrustRequest, CreateTrustResult> asyncHandler) {
        final CreateTrustRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrustResult>() {
            @Override
            public CreateTrustResult call() throws Exception {
                CreateTrustResult result = null;

                try {
                    result = executeCreateTrust(finalRequest);
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
    public java.util.concurrent.Future<DeleteConditionalForwarderResult> deleteConditionalForwarderAsync(DeleteConditionalForwarderRequest request) {

        return deleteConditionalForwarderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConditionalForwarderResult> deleteConditionalForwarderAsync(final DeleteConditionalForwarderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConditionalForwarderRequest, DeleteConditionalForwarderResult> asyncHandler) {
        final DeleteConditionalForwarderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConditionalForwarderResult>() {
            @Override
            public DeleteConditionalForwarderResult call() throws Exception {
                DeleteConditionalForwarderResult result = null;

                try {
                    result = executeDeleteConditionalForwarder(finalRequest);
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
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest request) {

        return deleteDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(final DeleteDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler) {
        final DeleteDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectoryResult>() {
            @Override
            public DeleteDirectoryResult call() throws Exception {
                DeleteDirectoryResult result = null;

                try {
                    result = executeDeleteDirectory(finalRequest);
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
    public java.util.concurrent.Future<DeleteLogSubscriptionResult> deleteLogSubscriptionAsync(DeleteLogSubscriptionRequest request) {

        return deleteLogSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogSubscriptionResult> deleteLogSubscriptionAsync(final DeleteLogSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLogSubscriptionRequest, DeleteLogSubscriptionResult> asyncHandler) {
        final DeleteLogSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLogSubscriptionResult>() {
            @Override
            public DeleteLogSubscriptionResult call() throws Exception {
                DeleteLogSubscriptionResult result = null;

                try {
                    result = executeDeleteLogSubscription(finalRequest);
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
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {
        final DeleteSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotResult>() {
            @Override
            public DeleteSnapshotResult call() throws Exception {
                DeleteSnapshotResult result = null;

                try {
                    result = executeDeleteSnapshot(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(DeleteTrustRequest request) {

        return deleteTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(final DeleteTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrustRequest, DeleteTrustResult> asyncHandler) {
        final DeleteTrustRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrustResult>() {
            @Override
            public DeleteTrustResult call() throws Exception {
                DeleteTrustResult result = null;

                try {
                    result = executeDeleteTrust(finalRequest);
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
    public java.util.concurrent.Future<DeregisterEventTopicResult> deregisterEventTopicAsync(DeregisterEventTopicRequest request) {

        return deregisterEventTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterEventTopicResult> deregisterEventTopicAsync(final DeregisterEventTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterEventTopicRequest, DeregisterEventTopicResult> asyncHandler) {
        final DeregisterEventTopicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterEventTopicResult>() {
            @Override
            public DeregisterEventTopicResult call() throws Exception {
                DeregisterEventTopicResult result = null;

                try {
                    result = executeDeregisterEventTopic(finalRequest);
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
    public java.util.concurrent.Future<DescribeConditionalForwardersResult> describeConditionalForwardersAsync(DescribeConditionalForwardersRequest request) {

        return describeConditionalForwardersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConditionalForwardersResult> describeConditionalForwardersAsync(
            final DescribeConditionalForwardersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConditionalForwardersRequest, DescribeConditionalForwardersResult> asyncHandler) {
        final DescribeConditionalForwardersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConditionalForwardersResult>() {
            @Override
            public DescribeConditionalForwardersResult call() throws Exception {
                DescribeConditionalForwardersResult result = null;

                try {
                    result = executeDescribeConditionalForwarders(finalRequest);
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
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(DescribeDirectoriesRequest request) {

        return describeDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(final DescribeDirectoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler) {
        final DescribeDirectoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDirectoriesResult>() {
            @Override
            public DescribeDirectoriesResult call() throws Exception {
                DescribeDirectoriesResult result = null;

                try {
                    result = executeDescribeDirectories(finalRequest);
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
     * Simplified method form for invoking the DescribeDirectories operation.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync() {

        return describeDirectoriesAsync(new DescribeDirectoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDirectories operation with an AsyncHandler.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler) {

        return describeDirectoriesAsync(new DescribeDirectoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainControllersResult> describeDomainControllersAsync(DescribeDomainControllersRequest request) {

        return describeDomainControllersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDomainControllersResult> describeDomainControllersAsync(final DescribeDomainControllersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainControllersRequest, DescribeDomainControllersResult> asyncHandler) {
        final DescribeDomainControllersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDomainControllersResult>() {
            @Override
            public DescribeDomainControllersResult call() throws Exception {
                DescribeDomainControllersResult result = null;

                try {
                    result = executeDescribeDomainControllers(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventTopicsResult> describeEventTopicsAsync(DescribeEventTopicsRequest request) {

        return describeEventTopicsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTopicsResult> describeEventTopicsAsync(final DescribeEventTopicsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventTopicsRequest, DescribeEventTopicsResult> asyncHandler) {
        final DescribeEventTopicsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventTopicsResult>() {
            @Override
            public DescribeEventTopicsResult call() throws Exception {
                DescribeEventTopicsResult result = null;

                try {
                    result = executeDescribeEventTopics(finalRequest);
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
    public java.util.concurrent.Future<DescribeSharedDirectoriesResult> describeSharedDirectoriesAsync(DescribeSharedDirectoriesRequest request) {

        return describeSharedDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSharedDirectoriesResult> describeSharedDirectoriesAsync(final DescribeSharedDirectoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSharedDirectoriesRequest, DescribeSharedDirectoriesResult> asyncHandler) {
        final DescribeSharedDirectoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSharedDirectoriesResult>() {
            @Override
            public DescribeSharedDirectoriesResult call() throws Exception {
                DescribeSharedDirectoriesResult result = null;

                try {
                    result = executeDescribeSharedDirectories(finalRequest);
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
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {
        final DescribeSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotsResult>() {
            @Override
            public DescribeSnapshotsResult call() throws Exception {
                DescribeSnapshotsResult result = null;

                try {
                    result = executeDescribeSnapshots(finalRequest);
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
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync() {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(DescribeTrustsRequest request) {

        return describeTrustsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(final DescribeTrustsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrustsRequest, DescribeTrustsResult> asyncHandler) {
        final DescribeTrustsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrustsResult>() {
            @Override
            public DescribeTrustsResult call() throws Exception {
                DescribeTrustsResult result = null;

                try {
                    result = executeDescribeTrusts(finalRequest);
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
    public java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(DisableRadiusRequest request) {

        return disableRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(final DisableRadiusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler) {
        final DisableRadiusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableRadiusResult>() {
            @Override
            public DisableRadiusResult call() throws Exception {
                DisableRadiusResult result = null;

                try {
                    result = executeDisableRadius(finalRequest);
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
    public java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(DisableSsoRequest request) {

        return disableSsoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(final DisableSsoRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler) {
        final DisableSsoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableSsoResult>() {
            @Override
            public DisableSsoResult call() throws Exception {
                DisableSsoResult result = null;

                try {
                    result = executeDisableSso(finalRequest);
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
    public java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(EnableRadiusRequest request) {

        return enableRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(final EnableRadiusRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler) {
        final EnableRadiusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableRadiusResult>() {
            @Override
            public EnableRadiusResult call() throws Exception {
                EnableRadiusResult result = null;

                try {
                    result = executeEnableRadius(finalRequest);
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
    public java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(EnableSsoRequest request) {

        return enableSsoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(final EnableSsoRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler) {
        final EnableSsoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableSsoResult>() {
            @Override
            public EnableSsoResult call() throws Exception {
                EnableSsoResult result = null;

                try {
                    result = executeEnableSso(finalRequest);
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
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(GetDirectoryLimitsRequest request) {

        return getDirectoryLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(final GetDirectoryLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler) {
        final GetDirectoryLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDirectoryLimitsResult>() {
            @Override
            public GetDirectoryLimitsResult call() throws Exception {
                GetDirectoryLimitsResult result = null;

                try {
                    result = executeGetDirectoryLimits(finalRequest);
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
     * Simplified method form for invoking the GetDirectoryLimits operation.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync() {

        return getDirectoryLimitsAsync(new GetDirectoryLimitsRequest());
    }

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation with an AsyncHandler.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler) {

        return getDirectoryLimitsAsync(new GetDirectoryLimitsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(GetSnapshotLimitsRequest request) {

        return getSnapshotLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(final GetSnapshotLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler) {
        final GetSnapshotLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSnapshotLimitsResult>() {
            @Override
            public GetSnapshotLimitsResult call() throws Exception {
                GetSnapshotLimitsResult result = null;

                try {
                    result = executeGetSnapshotLimits(finalRequest);
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
    public java.util.concurrent.Future<ListIpRoutesResult> listIpRoutesAsync(ListIpRoutesRequest request) {

        return listIpRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIpRoutesResult> listIpRoutesAsync(final ListIpRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIpRoutesRequest, ListIpRoutesResult> asyncHandler) {
        final ListIpRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIpRoutesResult>() {
            @Override
            public ListIpRoutesResult call() throws Exception {
                ListIpRoutesResult result = null;

                try {
                    result = executeListIpRoutes(finalRequest);
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
    public java.util.concurrent.Future<ListLogSubscriptionsResult> listLogSubscriptionsAsync(ListLogSubscriptionsRequest request) {

        return listLogSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLogSubscriptionsResult> listLogSubscriptionsAsync(final ListLogSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLogSubscriptionsRequest, ListLogSubscriptionsResult> asyncHandler) {
        final ListLogSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLogSubscriptionsResult>() {
            @Override
            public ListLogSubscriptionsResult call() throws Exception {
                ListLogSubscriptionsResult result = null;

                try {
                    result = executeListLogSubscriptions(finalRequest);
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
    public java.util.concurrent.Future<ListSchemaExtensionsResult> listSchemaExtensionsAsync(ListSchemaExtensionsRequest request) {

        return listSchemaExtensionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemaExtensionsResult> listSchemaExtensionsAsync(final ListSchemaExtensionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemaExtensionsRequest, ListSchemaExtensionsResult> asyncHandler) {
        final ListSchemaExtensionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemaExtensionsResult>() {
            @Override
            public ListSchemaExtensionsResult call() throws Exception {
                ListSchemaExtensionsResult result = null;

                try {
                    result = executeListSchemaExtensions(finalRequest);
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
    public java.util.concurrent.Future<RegisterEventTopicResult> registerEventTopicAsync(RegisterEventTopicRequest request) {

        return registerEventTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterEventTopicResult> registerEventTopicAsync(final RegisterEventTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterEventTopicRequest, RegisterEventTopicResult> asyncHandler) {
        final RegisterEventTopicRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterEventTopicResult>() {
            @Override
            public RegisterEventTopicResult call() throws Exception {
                RegisterEventTopicResult result = null;

                try {
                    result = executeRegisterEventTopic(finalRequest);
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
    public java.util.concurrent.Future<RejectSharedDirectoryResult> rejectSharedDirectoryAsync(RejectSharedDirectoryRequest request) {

        return rejectSharedDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectSharedDirectoryResult> rejectSharedDirectoryAsync(final RejectSharedDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectSharedDirectoryRequest, RejectSharedDirectoryResult> asyncHandler) {
        final RejectSharedDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectSharedDirectoryResult>() {
            @Override
            public RejectSharedDirectoryResult call() throws Exception {
                RejectSharedDirectoryResult result = null;

                try {
                    result = executeRejectSharedDirectory(finalRequest);
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
    public java.util.concurrent.Future<RemoveIpRoutesResult> removeIpRoutesAsync(RemoveIpRoutesRequest request) {

        return removeIpRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveIpRoutesResult> removeIpRoutesAsync(final RemoveIpRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveIpRoutesRequest, RemoveIpRoutesResult> asyncHandler) {
        final RemoveIpRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveIpRoutesResult>() {
            @Override
            public RemoveIpRoutesResult call() throws Exception {
                RemoveIpRoutesResult result = null;

                try {
                    result = executeRemoveIpRoutes(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {
        final RemoveTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;

                try {
                    result = executeRemoveTagsFromResource(finalRequest);
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
    public java.util.concurrent.Future<ResetUserPasswordResult> resetUserPasswordAsync(ResetUserPasswordRequest request) {

        return resetUserPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetUserPasswordResult> resetUserPasswordAsync(final ResetUserPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetUserPasswordRequest, ResetUserPasswordResult> asyncHandler) {
        final ResetUserPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetUserPasswordResult>() {
            @Override
            public ResetUserPasswordResult call() throws Exception {
                ResetUserPasswordResult result = null;

                try {
                    result = executeResetUserPassword(finalRequest);
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
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest request) {

        return restoreFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(final RestoreFromSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler) {
        final RestoreFromSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreFromSnapshotResult>() {
            @Override
            public RestoreFromSnapshotResult call() throws Exception {
                RestoreFromSnapshotResult result = null;

                try {
                    result = executeRestoreFromSnapshot(finalRequest);
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
    public java.util.concurrent.Future<ShareDirectoryResult> shareDirectoryAsync(ShareDirectoryRequest request) {

        return shareDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ShareDirectoryResult> shareDirectoryAsync(final ShareDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<ShareDirectoryRequest, ShareDirectoryResult> asyncHandler) {
        final ShareDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ShareDirectoryResult>() {
            @Override
            public ShareDirectoryResult call() throws Exception {
                ShareDirectoryResult result = null;

                try {
                    result = executeShareDirectory(finalRequest);
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
    public java.util.concurrent.Future<StartSchemaExtensionResult> startSchemaExtensionAsync(StartSchemaExtensionRequest request) {

        return startSchemaExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSchemaExtensionResult> startSchemaExtensionAsync(final StartSchemaExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSchemaExtensionRequest, StartSchemaExtensionResult> asyncHandler) {
        final StartSchemaExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSchemaExtensionResult>() {
            @Override
            public StartSchemaExtensionResult call() throws Exception {
                StartSchemaExtensionResult result = null;

                try {
                    result = executeStartSchemaExtension(finalRequest);
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
    public java.util.concurrent.Future<UnshareDirectoryResult> unshareDirectoryAsync(UnshareDirectoryRequest request) {

        return unshareDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnshareDirectoryResult> unshareDirectoryAsync(final UnshareDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnshareDirectoryRequest, UnshareDirectoryResult> asyncHandler) {
        final UnshareDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnshareDirectoryResult>() {
            @Override
            public UnshareDirectoryResult call() throws Exception {
                UnshareDirectoryResult result = null;

                try {
                    result = executeUnshareDirectory(finalRequest);
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
    public java.util.concurrent.Future<UpdateConditionalForwarderResult> updateConditionalForwarderAsync(UpdateConditionalForwarderRequest request) {

        return updateConditionalForwarderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConditionalForwarderResult> updateConditionalForwarderAsync(final UpdateConditionalForwarderRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConditionalForwarderRequest, UpdateConditionalForwarderResult> asyncHandler) {
        final UpdateConditionalForwarderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConditionalForwarderResult>() {
            @Override
            public UpdateConditionalForwarderResult call() throws Exception {
                UpdateConditionalForwarderResult result = null;

                try {
                    result = executeUpdateConditionalForwarder(finalRequest);
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
    public java.util.concurrent.Future<UpdateNumberOfDomainControllersResult> updateNumberOfDomainControllersAsync(
            UpdateNumberOfDomainControllersRequest request) {

        return updateNumberOfDomainControllersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNumberOfDomainControllersResult> updateNumberOfDomainControllersAsync(
            final UpdateNumberOfDomainControllersRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNumberOfDomainControllersRequest, UpdateNumberOfDomainControllersResult> asyncHandler) {
        final UpdateNumberOfDomainControllersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNumberOfDomainControllersResult>() {
            @Override
            public UpdateNumberOfDomainControllersResult call() throws Exception {
                UpdateNumberOfDomainControllersResult result = null;

                try {
                    result = executeUpdateNumberOfDomainControllers(finalRequest);
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
    public java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(UpdateRadiusRequest request) {

        return updateRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(final UpdateRadiusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler) {
        final UpdateRadiusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRadiusResult>() {
            @Override
            public UpdateRadiusResult call() throws Exception {
                UpdateRadiusResult result = null;

                try {
                    result = executeUpdateRadius(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrustResult> updateTrustAsync(UpdateTrustRequest request) {

        return updateTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrustResult> updateTrustAsync(final UpdateTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrustRequest, UpdateTrustResult> asyncHandler) {
        final UpdateTrustRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrustResult>() {
            @Override
            public UpdateTrustResult call() throws Exception {
                UpdateTrustResult result = null;

                try {
                    result = executeUpdateTrust(finalRequest);
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
    public java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(VerifyTrustRequest request) {

        return verifyTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(final VerifyTrustRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyTrustRequest, VerifyTrustResult> asyncHandler) {
        final VerifyTrustRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyTrustResult>() {
            @Override
            public VerifyTrustResult call() throws Exception {
                VerifyTrustResult result = null;

                try {
                    result = executeVerifyTrust(finalRequest);
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
