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
package com.amazonaws.services.pinpoint;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Pinpoint asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * Amazon Pinpoint
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointAsyncClient extends AmazonPinpointClient implements AmazonPinpointAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint. A credentials provider chain
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
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonPinpointAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon Pinpoint (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the provided AWS account
     * credentials provider and client configuration options.
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
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonPinpointAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonPinpointAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonPinpointAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonPinpointAsyncClientBuilder asyncBuilder() {
        return AmazonPinpointAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Pinpoint using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonPinpointAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest request) {

        return createAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppResult> createAppAsync(final CreateAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler) {
        final CreateAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAppResult>() {
            @Override
            public CreateAppResult call() throws Exception {
                CreateAppResult result = null;

                try {
                    result = executeCreateApp(finalRequest);
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
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest request) {

        return createCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(final CreateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler) {
        final CreateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCampaignResult>() {
            @Override
            public CreateCampaignResult call() throws Exception {
                CreateCampaignResult result = null;

                try {
                    result = executeCreateCampaign(finalRequest);
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
    public java.util.concurrent.Future<CreateExportJobResult> createExportJobAsync(CreateExportJobRequest request) {

        return createExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportJobResult> createExportJobAsync(final CreateExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExportJobRequest, CreateExportJobResult> asyncHandler) {
        final CreateExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExportJobResult>() {
            @Override
            public CreateExportJobResult call() throws Exception {
                CreateExportJobResult result = null;

                try {
                    result = executeCreateExportJob(finalRequest);
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
    public java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest request) {

        return createImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(final CreateImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateImportJobRequest, CreateImportJobResult> asyncHandler) {
        final CreateImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateImportJobResult>() {
            @Override
            public CreateImportJobResult call() throws Exception {
                CreateImportJobResult result = null;

                try {
                    result = executeCreateImportJob(finalRequest);
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
    public java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest request) {

        return createSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(final CreateSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler) {
        final CreateSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSegmentResult>() {
            @Override
            public CreateSegmentResult call() throws Exception {
                CreateSegmentResult result = null;

                try {
                    result = executeCreateSegment(finalRequest);
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
    public java.util.concurrent.Future<DeleteAdmChannelResult> deleteAdmChannelAsync(DeleteAdmChannelRequest request) {

        return deleteAdmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAdmChannelResult> deleteAdmChannelAsync(final DeleteAdmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAdmChannelRequest, DeleteAdmChannelResult> asyncHandler) {
        final DeleteAdmChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAdmChannelResult>() {
            @Override
            public DeleteAdmChannelResult call() throws Exception {
                DeleteAdmChannelResult result = null;

                try {
                    result = executeDeleteAdmChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest request) {

        return deleteApnsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(final DeleteApnsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApnsChannelRequest, DeleteApnsChannelResult> asyncHandler) {
        final DeleteApnsChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApnsChannelResult>() {
            @Override
            public DeleteApnsChannelResult call() throws Exception {
                DeleteApnsChannelResult result = null;

                try {
                    result = executeDeleteApnsChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteApnsSandboxChannelResult> deleteApnsSandboxChannelAsync(DeleteApnsSandboxChannelRequest request) {

        return deleteApnsSandboxChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApnsSandboxChannelResult> deleteApnsSandboxChannelAsync(final DeleteApnsSandboxChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApnsSandboxChannelRequest, DeleteApnsSandboxChannelResult> asyncHandler) {
        final DeleteApnsSandboxChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApnsSandboxChannelResult>() {
            @Override
            public DeleteApnsSandboxChannelResult call() throws Exception {
                DeleteApnsSandboxChannelResult result = null;

                try {
                    result = executeDeleteApnsSandboxChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteApnsVoipChannelResult> deleteApnsVoipChannelAsync(DeleteApnsVoipChannelRequest request) {

        return deleteApnsVoipChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApnsVoipChannelResult> deleteApnsVoipChannelAsync(final DeleteApnsVoipChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApnsVoipChannelRequest, DeleteApnsVoipChannelResult> asyncHandler) {
        final DeleteApnsVoipChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApnsVoipChannelResult>() {
            @Override
            public DeleteApnsVoipChannelResult call() throws Exception {
                DeleteApnsVoipChannelResult result = null;

                try {
                    result = executeDeleteApnsVoipChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteApnsVoipSandboxChannelResult> deleteApnsVoipSandboxChannelAsync(DeleteApnsVoipSandboxChannelRequest request) {

        return deleteApnsVoipSandboxChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApnsVoipSandboxChannelResult> deleteApnsVoipSandboxChannelAsync(final DeleteApnsVoipSandboxChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApnsVoipSandboxChannelRequest, DeleteApnsVoipSandboxChannelResult> asyncHandler) {
        final DeleteApnsVoipSandboxChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApnsVoipSandboxChannelResult>() {
            @Override
            public DeleteApnsVoipSandboxChannelResult call() throws Exception {
                DeleteApnsVoipSandboxChannelResult result = null;

                try {
                    result = executeDeleteApnsVoipSandboxChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest request) {

        return deleteAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(final DeleteAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler) {
        final DeleteAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAppResult>() {
            @Override
            public DeleteAppResult call() throws Exception {
                DeleteAppResult result = null;

                try {
                    result = executeDeleteApp(finalRequest);
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
    public java.util.concurrent.Future<DeleteBaiduChannelResult> deleteBaiduChannelAsync(DeleteBaiduChannelRequest request) {

        return deleteBaiduChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBaiduChannelResult> deleteBaiduChannelAsync(final DeleteBaiduChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBaiduChannelRequest, DeleteBaiduChannelResult> asyncHandler) {
        final DeleteBaiduChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBaiduChannelResult>() {
            @Override
            public DeleteBaiduChannelResult call() throws Exception {
                DeleteBaiduChannelResult result = null;

                try {
                    result = executeDeleteBaiduChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest request) {

        return deleteCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(final DeleteCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler) {
        final DeleteCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCampaignResult>() {
            @Override
            public DeleteCampaignResult call() throws Exception {
                DeleteCampaignResult result = null;

                try {
                    result = executeDeleteCampaign(finalRequest);
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
    public java.util.concurrent.Future<DeleteEmailChannelResult> deleteEmailChannelAsync(DeleteEmailChannelRequest request) {

        return deleteEmailChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEmailChannelResult> deleteEmailChannelAsync(final DeleteEmailChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEmailChannelRequest, DeleteEmailChannelResult> asyncHandler) {
        final DeleteEmailChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEmailChannelResult>() {
            @Override
            public DeleteEmailChannelResult call() throws Exception {
                DeleteEmailChannelResult result = null;

                try {
                    result = executeDeleteEmailChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {
        final DeleteEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result = null;

                try {
                    result = executeDeleteEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(DeleteEventStreamRequest request) {

        return deleteEventStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(final DeleteEventStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventStreamRequest, DeleteEventStreamResult> asyncHandler) {
        final DeleteEventStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventStreamResult>() {
            @Override
            public DeleteEventStreamResult call() throws Exception {
                DeleteEventStreamResult result = null;

                try {
                    result = executeDeleteEventStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest request) {

        return deleteGcmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(final DeleteGcmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGcmChannelRequest, DeleteGcmChannelResult> asyncHandler) {
        final DeleteGcmChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGcmChannelResult>() {
            @Override
            public DeleteGcmChannelResult call() throws Exception {
                DeleteGcmChannelResult result = null;

                try {
                    result = executeDeleteGcmChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest request) {

        return deleteSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(final DeleteSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler) {
        final DeleteSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSegmentResult>() {
            @Override
            public DeleteSegmentResult call() throws Exception {
                DeleteSegmentResult result = null;

                try {
                    result = executeDeleteSegment(finalRequest);
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
    public java.util.concurrent.Future<DeleteSmsChannelResult> deleteSmsChannelAsync(DeleteSmsChannelRequest request) {

        return deleteSmsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSmsChannelResult> deleteSmsChannelAsync(final DeleteSmsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSmsChannelRequest, DeleteSmsChannelResult> asyncHandler) {
        final DeleteSmsChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSmsChannelResult>() {
            @Override
            public DeleteSmsChannelResult call() throws Exception {
                DeleteSmsChannelResult result = null;

                try {
                    result = executeDeleteSmsChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserEndpointsResult> deleteUserEndpointsAsync(DeleteUserEndpointsRequest request) {

        return deleteUserEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserEndpointsResult> deleteUserEndpointsAsync(final DeleteUserEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserEndpointsRequest, DeleteUserEndpointsResult> asyncHandler) {
        final DeleteUserEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserEndpointsResult>() {
            @Override
            public DeleteUserEndpointsResult call() throws Exception {
                DeleteUserEndpointsResult result = null;

                try {
                    result = executeDeleteUserEndpoints(finalRequest);
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
    public java.util.concurrent.Future<DeleteVoiceChannelResult> deleteVoiceChannelAsync(DeleteVoiceChannelRequest request) {

        return deleteVoiceChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceChannelResult> deleteVoiceChannelAsync(final DeleteVoiceChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceChannelRequest, DeleteVoiceChannelResult> asyncHandler) {
        final DeleteVoiceChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceChannelResult>() {
            @Override
            public DeleteVoiceChannelResult call() throws Exception {
                DeleteVoiceChannelResult result = null;

                try {
                    result = executeDeleteVoiceChannel(finalRequest);
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
    public java.util.concurrent.Future<GetAdmChannelResult> getAdmChannelAsync(GetAdmChannelRequest request) {

        return getAdmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdmChannelResult> getAdmChannelAsync(final GetAdmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAdmChannelRequest, GetAdmChannelResult> asyncHandler) {
        final GetAdmChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAdmChannelResult>() {
            @Override
            public GetAdmChannelResult call() throws Exception {
                GetAdmChannelResult result = null;

                try {
                    result = executeGetAdmChannel(finalRequest);
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
    public java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest request) {

        return getApnsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(final GetApnsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApnsChannelRequest, GetApnsChannelResult> asyncHandler) {
        final GetApnsChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApnsChannelResult>() {
            @Override
            public GetApnsChannelResult call() throws Exception {
                GetApnsChannelResult result = null;

                try {
                    result = executeGetApnsChannel(finalRequest);
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
    public java.util.concurrent.Future<GetApnsSandboxChannelResult> getApnsSandboxChannelAsync(GetApnsSandboxChannelRequest request) {

        return getApnsSandboxChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApnsSandboxChannelResult> getApnsSandboxChannelAsync(final GetApnsSandboxChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApnsSandboxChannelRequest, GetApnsSandboxChannelResult> asyncHandler) {
        final GetApnsSandboxChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApnsSandboxChannelResult>() {
            @Override
            public GetApnsSandboxChannelResult call() throws Exception {
                GetApnsSandboxChannelResult result = null;

                try {
                    result = executeGetApnsSandboxChannel(finalRequest);
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
    public java.util.concurrent.Future<GetApnsVoipChannelResult> getApnsVoipChannelAsync(GetApnsVoipChannelRequest request) {

        return getApnsVoipChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApnsVoipChannelResult> getApnsVoipChannelAsync(final GetApnsVoipChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApnsVoipChannelRequest, GetApnsVoipChannelResult> asyncHandler) {
        final GetApnsVoipChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApnsVoipChannelResult>() {
            @Override
            public GetApnsVoipChannelResult call() throws Exception {
                GetApnsVoipChannelResult result = null;

                try {
                    result = executeGetApnsVoipChannel(finalRequest);
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
    public java.util.concurrent.Future<GetApnsVoipSandboxChannelResult> getApnsVoipSandboxChannelAsync(GetApnsVoipSandboxChannelRequest request) {

        return getApnsVoipSandboxChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApnsVoipSandboxChannelResult> getApnsVoipSandboxChannelAsync(final GetApnsVoipSandboxChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApnsVoipSandboxChannelRequest, GetApnsVoipSandboxChannelResult> asyncHandler) {
        final GetApnsVoipSandboxChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApnsVoipSandboxChannelResult>() {
            @Override
            public GetApnsVoipSandboxChannelResult call() throws Exception {
                GetApnsVoipSandboxChannelResult result = null;

                try {
                    result = executeGetApnsVoipSandboxChannel(finalRequest);
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
    public java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest request) {

        return getAppAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppResult> getAppAsync(final GetAppRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler) {
        final GetAppRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppResult>() {
            @Override
            public GetAppResult call() throws Exception {
                GetAppResult result = null;

                try {
                    result = executeGetApp(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest request) {

        return getApplicationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(final GetApplicationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationSettingsRequest, GetApplicationSettingsResult> asyncHandler) {
        final GetApplicationSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationSettingsResult>() {
            @Override
            public GetApplicationSettingsResult call() throws Exception {
                GetApplicationSettingsResult result = null;

                try {
                    result = executeGetApplicationSettings(finalRequest);
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
    public java.util.concurrent.Future<GetAppsResult> getAppsAsync(GetAppsRequest request) {

        return getAppsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppsResult> getAppsAsync(final GetAppsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppsRequest, GetAppsResult> asyncHandler) {
        final GetAppsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppsResult>() {
            @Override
            public GetAppsResult call() throws Exception {
                GetAppsResult result = null;

                try {
                    result = executeGetApps(finalRequest);
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
    public java.util.concurrent.Future<GetBaiduChannelResult> getBaiduChannelAsync(GetBaiduChannelRequest request) {

        return getBaiduChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBaiduChannelResult> getBaiduChannelAsync(final GetBaiduChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBaiduChannelRequest, GetBaiduChannelResult> asyncHandler) {
        final GetBaiduChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBaiduChannelResult>() {
            @Override
            public GetBaiduChannelResult call() throws Exception {
                GetBaiduChannelResult result = null;

                try {
                    result = executeGetBaiduChannel(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest request) {

        return getCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(final GetCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler) {
        final GetCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignResult>() {
            @Override
            public GetCampaignResult call() throws Exception {
                GetCampaignResult result = null;

                try {
                    result = executeGetCampaign(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest request) {

        return getCampaignActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(final GetCampaignActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignActivitiesRequest, GetCampaignActivitiesResult> asyncHandler) {
        final GetCampaignActivitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignActivitiesResult>() {
            @Override
            public GetCampaignActivitiesResult call() throws Exception {
                GetCampaignActivitiesResult result = null;

                try {
                    result = executeGetCampaignActivities(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest request) {

        return getCampaignVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(final GetCampaignVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignVersionRequest, GetCampaignVersionResult> asyncHandler) {
        final GetCampaignVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignVersionResult>() {
            @Override
            public GetCampaignVersionResult call() throws Exception {
                GetCampaignVersionResult result = null;

                try {
                    result = executeGetCampaignVersion(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest request) {

        return getCampaignVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(final GetCampaignVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignVersionsRequest, GetCampaignVersionsResult> asyncHandler) {
        final GetCampaignVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignVersionsResult>() {
            @Override
            public GetCampaignVersionsResult call() throws Exception {
                GetCampaignVersionsResult result = null;

                try {
                    result = executeGetCampaignVersions(finalRequest);
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
    public java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest request) {

        return getCampaignsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(final GetCampaignsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCampaignsRequest, GetCampaignsResult> asyncHandler) {
        final GetCampaignsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCampaignsResult>() {
            @Override
            public GetCampaignsResult call() throws Exception {
                GetCampaignsResult result = null;

                try {
                    result = executeGetCampaigns(finalRequest);
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
    public java.util.concurrent.Future<GetChannelsResult> getChannelsAsync(GetChannelsRequest request) {

        return getChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelsResult> getChannelsAsync(final GetChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelsRequest, GetChannelsResult> asyncHandler) {
        final GetChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelsResult>() {
            @Override
            public GetChannelsResult call() throws Exception {
                GetChannelsResult result = null;

                try {
                    result = executeGetChannels(finalRequest);
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
    public java.util.concurrent.Future<GetEmailChannelResult> getEmailChannelAsync(GetEmailChannelRequest request) {

        return getEmailChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEmailChannelResult> getEmailChannelAsync(final GetEmailChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEmailChannelRequest, GetEmailChannelResult> asyncHandler) {
        final GetEmailChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEmailChannelResult>() {
            @Override
            public GetEmailChannelResult call() throws Exception {
                GetEmailChannelResult result = null;

                try {
                    result = executeGetEmailChannel(finalRequest);
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
    public java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest request) {

        return getEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(final GetEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEndpointRequest, GetEndpointResult> asyncHandler) {
        final GetEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEndpointResult>() {
            @Override
            public GetEndpointResult call() throws Exception {
                GetEndpointResult result = null;

                try {
                    result = executeGetEndpoint(finalRequest);
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
    public java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest request) {

        return getEventStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(final GetEventStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventStreamRequest, GetEventStreamResult> asyncHandler) {
        final GetEventStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventStreamResult>() {
            @Override
            public GetEventStreamResult call() throws Exception {
                GetEventStreamResult result = null;

                try {
                    result = executeGetEventStream(finalRequest);
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
    public java.util.concurrent.Future<GetExportJobResult> getExportJobAsync(GetExportJobRequest request) {

        return getExportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportJobResult> getExportJobAsync(final GetExportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExportJobRequest, GetExportJobResult> asyncHandler) {
        final GetExportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExportJobResult>() {
            @Override
            public GetExportJobResult call() throws Exception {
                GetExportJobResult result = null;

                try {
                    result = executeGetExportJob(finalRequest);
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
    public java.util.concurrent.Future<GetExportJobsResult> getExportJobsAsync(GetExportJobsRequest request) {

        return getExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExportJobsResult> getExportJobsAsync(final GetExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExportJobsRequest, GetExportJobsResult> asyncHandler) {
        final GetExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExportJobsResult>() {
            @Override
            public GetExportJobsResult call() throws Exception {
                GetExportJobsResult result = null;

                try {
                    result = executeGetExportJobs(finalRequest);
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
    public java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest request) {

        return getGcmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(final GetGcmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGcmChannelRequest, GetGcmChannelResult> asyncHandler) {
        final GetGcmChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGcmChannelResult>() {
            @Override
            public GetGcmChannelResult call() throws Exception {
                GetGcmChannelResult result = null;

                try {
                    result = executeGetGcmChannel(finalRequest);
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
    public java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest request) {

        return getImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(final GetImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler) {
        final GetImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImportJobResult>() {
            @Override
            public GetImportJobResult call() throws Exception {
                GetImportJobResult result = null;

                try {
                    result = executeGetImportJob(finalRequest);
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
    public java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest request) {

        return getImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(final GetImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImportJobsRequest, GetImportJobsResult> asyncHandler) {
        final GetImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImportJobsResult>() {
            @Override
            public GetImportJobsResult call() throws Exception {
                GetImportJobsResult result = null;

                try {
                    result = executeGetImportJobs(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest request) {

        return getSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(final GetSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler) {
        final GetSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentResult>() {
            @Override
            public GetSegmentResult call() throws Exception {
                GetSegmentResult result = null;

                try {
                    result = executeGetSegment(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentExportJobsResult> getSegmentExportJobsAsync(GetSegmentExportJobsRequest request) {

        return getSegmentExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentExportJobsResult> getSegmentExportJobsAsync(final GetSegmentExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentExportJobsRequest, GetSegmentExportJobsResult> asyncHandler) {
        final GetSegmentExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentExportJobsResult>() {
            @Override
            public GetSegmentExportJobsResult call() throws Exception {
                GetSegmentExportJobsResult result = null;

                try {
                    result = executeGetSegmentExportJobs(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest request) {

        return getSegmentImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(final GetSegmentImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentImportJobsRequest, GetSegmentImportJobsResult> asyncHandler) {
        final GetSegmentImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentImportJobsResult>() {
            @Override
            public GetSegmentImportJobsResult call() throws Exception {
                GetSegmentImportJobsResult result = null;

                try {
                    result = executeGetSegmentImportJobs(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest request) {

        return getSegmentVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(final GetSegmentVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentVersionRequest, GetSegmentVersionResult> asyncHandler) {
        final GetSegmentVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentVersionResult>() {
            @Override
            public GetSegmentVersionResult call() throws Exception {
                GetSegmentVersionResult result = null;

                try {
                    result = executeGetSegmentVersion(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest request) {

        return getSegmentVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(final GetSegmentVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentVersionsRequest, GetSegmentVersionsResult> asyncHandler) {
        final GetSegmentVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentVersionsResult>() {
            @Override
            public GetSegmentVersionsResult call() throws Exception {
                GetSegmentVersionsResult result = null;

                try {
                    result = executeGetSegmentVersions(finalRequest);
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
    public java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest request) {

        return getSegmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(final GetSegmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSegmentsRequest, GetSegmentsResult> asyncHandler) {
        final GetSegmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSegmentsResult>() {
            @Override
            public GetSegmentsResult call() throws Exception {
                GetSegmentsResult result = null;

                try {
                    result = executeGetSegments(finalRequest);
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
    public java.util.concurrent.Future<GetSmsChannelResult> getSmsChannelAsync(GetSmsChannelRequest request) {

        return getSmsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSmsChannelResult> getSmsChannelAsync(final GetSmsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSmsChannelRequest, GetSmsChannelResult> asyncHandler) {
        final GetSmsChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSmsChannelResult>() {
            @Override
            public GetSmsChannelResult call() throws Exception {
                GetSmsChannelResult result = null;

                try {
                    result = executeGetSmsChannel(finalRequest);
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
    public java.util.concurrent.Future<GetUserEndpointsResult> getUserEndpointsAsync(GetUserEndpointsRequest request) {

        return getUserEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserEndpointsResult> getUserEndpointsAsync(final GetUserEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUserEndpointsRequest, GetUserEndpointsResult> asyncHandler) {
        final GetUserEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUserEndpointsResult>() {
            @Override
            public GetUserEndpointsResult call() throws Exception {
                GetUserEndpointsResult result = null;

                try {
                    result = executeGetUserEndpoints(finalRequest);
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
    public java.util.concurrent.Future<GetVoiceChannelResult> getVoiceChannelAsync(GetVoiceChannelRequest request) {

        return getVoiceChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceChannelResult> getVoiceChannelAsync(final GetVoiceChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceChannelRequest, GetVoiceChannelResult> asyncHandler) {
        final GetVoiceChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceChannelResult>() {
            @Override
            public GetVoiceChannelResult call() throws Exception {
                GetVoiceChannelResult result = null;

                try {
                    result = executeGetVoiceChannel(finalRequest);
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
    public java.util.concurrent.Future<PhoneNumberValidateResult> phoneNumberValidateAsync(PhoneNumberValidateRequest request) {

        return phoneNumberValidateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PhoneNumberValidateResult> phoneNumberValidateAsync(final PhoneNumberValidateRequest request,
            final com.amazonaws.handlers.AsyncHandler<PhoneNumberValidateRequest, PhoneNumberValidateResult> asyncHandler) {
        final PhoneNumberValidateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PhoneNumberValidateResult>() {
            @Override
            public PhoneNumberValidateResult call() throws Exception {
                PhoneNumberValidateResult result = null;

                try {
                    result = executePhoneNumberValidate(finalRequest);
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
    public java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest request) {

        return putEventStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(final PutEventStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventStreamRequest, PutEventStreamResult> asyncHandler) {
        final PutEventStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventStreamResult>() {
            @Override
            public PutEventStreamResult call() throws Exception {
                PutEventStreamResult result = null;

                try {
                    result = executePutEventStream(finalRequest);
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
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(final PutEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {
        final PutEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventsResult>() {
            @Override
            public PutEventsResult call() throws Exception {
                PutEventsResult result = null;

                try {
                    result = executePutEvents(finalRequest);
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
    public java.util.concurrent.Future<RemoveAttributesResult> removeAttributesAsync(RemoveAttributesRequest request) {

        return removeAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesResult> removeAttributesAsync(final RemoveAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAttributesRequest, RemoveAttributesResult> asyncHandler) {
        final RemoveAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveAttributesResult>() {
            @Override
            public RemoveAttributesResult call() throws Exception {
                RemoveAttributesResult result = null;

                try {
                    result = executeRemoveAttributes(finalRequest);
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
    public java.util.concurrent.Future<SendMessagesResult> sendMessagesAsync(SendMessagesRequest request) {

        return sendMessagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessagesResult> sendMessagesAsync(final SendMessagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendMessagesRequest, SendMessagesResult> asyncHandler) {
        final SendMessagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendMessagesResult>() {
            @Override
            public SendMessagesResult call() throws Exception {
                SendMessagesResult result = null;

                try {
                    result = executeSendMessages(finalRequest);
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
    public java.util.concurrent.Future<SendUsersMessagesResult> sendUsersMessagesAsync(SendUsersMessagesRequest request) {

        return sendUsersMessagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendUsersMessagesResult> sendUsersMessagesAsync(final SendUsersMessagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendUsersMessagesRequest, SendUsersMessagesResult> asyncHandler) {
        final SendUsersMessagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendUsersMessagesResult>() {
            @Override
            public SendUsersMessagesResult call() throws Exception {
                SendUsersMessagesResult result = null;

                try {
                    result = executeSendUsersMessages(finalRequest);
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
    public java.util.concurrent.Future<UpdateAdmChannelResult> updateAdmChannelAsync(UpdateAdmChannelRequest request) {

        return updateAdmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAdmChannelResult> updateAdmChannelAsync(final UpdateAdmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAdmChannelRequest, UpdateAdmChannelResult> asyncHandler) {
        final UpdateAdmChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAdmChannelResult>() {
            @Override
            public UpdateAdmChannelResult call() throws Exception {
                UpdateAdmChannelResult result = null;

                try {
                    result = executeUpdateAdmChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest request) {

        return updateApnsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(final UpdateApnsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApnsChannelRequest, UpdateApnsChannelResult> asyncHandler) {
        final UpdateApnsChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApnsChannelResult>() {
            @Override
            public UpdateApnsChannelResult call() throws Exception {
                UpdateApnsChannelResult result = null;

                try {
                    result = executeUpdateApnsChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateApnsSandboxChannelResult> updateApnsSandboxChannelAsync(UpdateApnsSandboxChannelRequest request) {

        return updateApnsSandboxChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApnsSandboxChannelResult> updateApnsSandboxChannelAsync(final UpdateApnsSandboxChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApnsSandboxChannelRequest, UpdateApnsSandboxChannelResult> asyncHandler) {
        final UpdateApnsSandboxChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApnsSandboxChannelResult>() {
            @Override
            public UpdateApnsSandboxChannelResult call() throws Exception {
                UpdateApnsSandboxChannelResult result = null;

                try {
                    result = executeUpdateApnsSandboxChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateApnsVoipChannelResult> updateApnsVoipChannelAsync(UpdateApnsVoipChannelRequest request) {

        return updateApnsVoipChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApnsVoipChannelResult> updateApnsVoipChannelAsync(final UpdateApnsVoipChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApnsVoipChannelRequest, UpdateApnsVoipChannelResult> asyncHandler) {
        final UpdateApnsVoipChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApnsVoipChannelResult>() {
            @Override
            public UpdateApnsVoipChannelResult call() throws Exception {
                UpdateApnsVoipChannelResult result = null;

                try {
                    result = executeUpdateApnsVoipChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateApnsVoipSandboxChannelResult> updateApnsVoipSandboxChannelAsync(UpdateApnsVoipSandboxChannelRequest request) {

        return updateApnsVoipSandboxChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApnsVoipSandboxChannelResult> updateApnsVoipSandboxChannelAsync(final UpdateApnsVoipSandboxChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApnsVoipSandboxChannelRequest, UpdateApnsVoipSandboxChannelResult> asyncHandler) {
        final UpdateApnsVoipSandboxChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApnsVoipSandboxChannelResult>() {
            @Override
            public UpdateApnsVoipSandboxChannelResult call() throws Exception {
                UpdateApnsVoipSandboxChannelResult result = null;

                try {
                    result = executeUpdateApnsVoipSandboxChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(UpdateApplicationSettingsRequest request) {

        return updateApplicationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(final UpdateApplicationSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler) {
        final UpdateApplicationSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationSettingsResult>() {
            @Override
            public UpdateApplicationSettingsResult call() throws Exception {
                UpdateApplicationSettingsResult result = null;

                try {
                    result = executeUpdateApplicationSettings(finalRequest);
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
    public java.util.concurrent.Future<UpdateBaiduChannelResult> updateBaiduChannelAsync(UpdateBaiduChannelRequest request) {

        return updateBaiduChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBaiduChannelResult> updateBaiduChannelAsync(final UpdateBaiduChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBaiduChannelRequest, UpdateBaiduChannelResult> asyncHandler) {
        final UpdateBaiduChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBaiduChannelResult>() {
            @Override
            public UpdateBaiduChannelResult call() throws Exception {
                UpdateBaiduChannelResult result = null;

                try {
                    result = executeUpdateBaiduChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest request) {

        return updateCampaignAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(final UpdateCampaignRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler) {
        final UpdateCampaignRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCampaignResult>() {
            @Override
            public UpdateCampaignResult call() throws Exception {
                UpdateCampaignResult result = null;

                try {
                    result = executeUpdateCampaign(finalRequest);
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
    public java.util.concurrent.Future<UpdateEmailChannelResult> updateEmailChannelAsync(UpdateEmailChannelRequest request) {

        return updateEmailChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEmailChannelResult> updateEmailChannelAsync(final UpdateEmailChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEmailChannelRequest, UpdateEmailChannelResult> asyncHandler) {
        final UpdateEmailChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEmailChannelResult>() {
            @Override
            public UpdateEmailChannelResult call() throws Exception {
                UpdateEmailChannelResult result = null;

                try {
                    result = executeUpdateEmailChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest request) {

        return updateEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(final UpdateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler) {
        final UpdateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointResult>() {
            @Override
            public UpdateEndpointResult call() throws Exception {
                UpdateEndpointResult result = null;

                try {
                    result = executeUpdateEndpoint(finalRequest);
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
    public java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest request) {

        return updateEndpointsBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(final UpdateEndpointsBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointsBatchRequest, UpdateEndpointsBatchResult> asyncHandler) {
        final UpdateEndpointsBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointsBatchResult>() {
            @Override
            public UpdateEndpointsBatchResult call() throws Exception {
                UpdateEndpointsBatchResult result = null;

                try {
                    result = executeUpdateEndpointsBatch(finalRequest);
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
    public java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest request) {

        return updateGcmChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(final UpdateGcmChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGcmChannelRequest, UpdateGcmChannelResult> asyncHandler) {
        final UpdateGcmChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGcmChannelResult>() {
            @Override
            public UpdateGcmChannelResult call() throws Exception {
                UpdateGcmChannelResult result = null;

                try {
                    result = executeUpdateGcmChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest request) {

        return updateSegmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(final UpdateSegmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSegmentRequest, UpdateSegmentResult> asyncHandler) {
        final UpdateSegmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSegmentResult>() {
            @Override
            public UpdateSegmentResult call() throws Exception {
                UpdateSegmentResult result = null;

                try {
                    result = executeUpdateSegment(finalRequest);
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
    public java.util.concurrent.Future<UpdateSmsChannelResult> updateSmsChannelAsync(UpdateSmsChannelRequest request) {

        return updateSmsChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSmsChannelResult> updateSmsChannelAsync(final UpdateSmsChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSmsChannelRequest, UpdateSmsChannelResult> asyncHandler) {
        final UpdateSmsChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSmsChannelResult>() {
            @Override
            public UpdateSmsChannelResult call() throws Exception {
                UpdateSmsChannelResult result = null;

                try {
                    result = executeUpdateSmsChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateVoiceChannelResult> updateVoiceChannelAsync(UpdateVoiceChannelRequest request) {

        return updateVoiceChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceChannelResult> updateVoiceChannelAsync(final UpdateVoiceChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVoiceChannelRequest, UpdateVoiceChannelResult> asyncHandler) {
        final UpdateVoiceChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVoiceChannelResult>() {
            @Override
            public UpdateVoiceChannelResult call() throws Exception {
                UpdateVoiceChannelResult result = null;

                try {
                    result = executeUpdateVoiceChannel(finalRequest);
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
