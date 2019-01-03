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
package com.amazonaws.services.elastictranscoder;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Elastic Transcoder asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Elastic Transcoder Service</fullname>
 * <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonElasticTranscoderAsyncClient extends AmazonElasticTranscoderClient implements AmazonElasticTranscoderAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Elastic Transcoder (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the provided
     * AWS account credentials provider and client configuration options.
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
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonElasticTranscoderAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonElasticTranscoderAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonElasticTranscoderAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonElasticTranscoderAsyncClientBuilder asyncBuilder() {
        return AmazonElasticTranscoderAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Elastic Transcoder using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonElasticTranscoderAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(final CancelJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {
        final CancelJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelJobResult>() {
            @Override
            public CancelJobResult call() throws Exception {
                CancelJobResult result = null;

                try {
                    result = executeCancelJob(finalRequest);
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
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(final CreateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {
        final CreateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobResult>() {
            @Override
            public CreateJobResult call() throws Exception {
                CreateJobResult result = null;

                try {
                    result = executeCreateJob(finalRequest);
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
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(final CreatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {
        final CreatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePipelineResult>() {
            @Override
            public CreatePipelineResult call() throws Exception {
                CreatePipelineResult result = null;

                try {
                    result = executeCreatePipeline(finalRequest);
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
    public java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest request) {

        return createPresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePresetResult> createPresetAsync(final CreatePresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler) {
        final CreatePresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePresetResult>() {
            @Override
            public CreatePresetResult call() throws Exception {
                CreatePresetResult result = null;

                try {
                    result = executeCreatePreset(finalRequest);
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
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(final DeletePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {
        final DeletePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePipelineResult>() {
            @Override
            public DeletePipelineResult call() throws Exception {
                DeletePipelineResult result = null;

                try {
                    result = executeDeletePipeline(finalRequest);
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
    public java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest request) {

        return deletePresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(final DeletePresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler) {
        final DeletePresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePresetResult>() {
            @Override
            public DeletePresetResult call() throws Exception {
                DeletePresetResult result = null;

                try {
                    result = executeDeletePreset(finalRequest);
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
    public java.util.concurrent.Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest request) {

        return listJobsByPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsByPipelineResult> listJobsByPipelineAsync(final ListJobsByPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsByPipelineRequest, ListJobsByPipelineResult> asyncHandler) {
        final ListJobsByPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsByPipelineResult>() {
            @Override
            public ListJobsByPipelineResult call() throws Exception {
                ListJobsByPipelineResult result = null;

                try {
                    result = executeListJobsByPipeline(finalRequest);
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
    public java.util.concurrent.Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest request) {

        return listJobsByStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsByStatusResult> listJobsByStatusAsync(final ListJobsByStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsByStatusRequest, ListJobsByStatusResult> asyncHandler) {
        final ListJobsByStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsByStatusResult>() {
            @Override
            public ListJobsByStatusResult call() throws Exception {
                ListJobsByStatusResult result = null;

                try {
                    result = executeListJobsByStatus(finalRequest);
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
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(final ListPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {
        final ListPipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelinesResult>() {
            @Override
            public ListPipelinesResult call() throws Exception {
                ListPipelinesResult result = null;

                try {
                    result = executeListPipelines(finalRequest);
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
     * Simplified method form for invoking the ListPipelines operation.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync() {

        return listPipelinesAsync(new ListPipelinesRequest());
    }

    /**
     * Simplified method form for invoking the ListPipelines operation with an AsyncHandler.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {

        return listPipelinesAsync(new ListPipelinesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest request) {

        return listPresetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(final ListPresetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler) {
        final ListPresetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPresetsResult>() {
            @Override
            public ListPresetsResult call() throws Exception {
                ListPresetsResult result = null;

                try {
                    result = executeListPresets(finalRequest);
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
     * Simplified method form for invoking the ListPresets operation.
     *
     * @see #listPresetsAsync(ListPresetsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync() {

        return listPresetsAsync(new ListPresetsRequest());
    }

    /**
     * Simplified method form for invoking the ListPresets operation with an AsyncHandler.
     *
     * @see #listPresetsAsync(ListPresetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(
            com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler) {

        return listPresetsAsync(new ListPresetsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ReadJobResult> readJobAsync(ReadJobRequest request) {

        return readJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReadJobResult> readJobAsync(final ReadJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReadJobRequest, ReadJobResult> asyncHandler) {
        final ReadJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReadJobResult>() {
            @Override
            public ReadJobResult call() throws Exception {
                ReadJobResult result = null;

                try {
                    result = executeReadJob(finalRequest);
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
    public java.util.concurrent.Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest request) {

        return readPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReadPipelineResult> readPipelineAsync(final ReadPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReadPipelineRequest, ReadPipelineResult> asyncHandler) {
        final ReadPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReadPipelineResult>() {
            @Override
            public ReadPipelineResult call() throws Exception {
                ReadPipelineResult result = null;

                try {
                    result = executeReadPipeline(finalRequest);
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
    public java.util.concurrent.Future<ReadPresetResult> readPresetAsync(ReadPresetRequest request) {

        return readPresetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReadPresetResult> readPresetAsync(final ReadPresetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReadPresetRequest, ReadPresetResult> asyncHandler) {
        final ReadPresetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReadPresetResult>() {
            @Override
            public ReadPresetResult call() throws Exception {
                ReadPresetResult result = null;

                try {
                    result = executeReadPreset(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<TestRoleResult> testRoleAsync(TestRoleRequest request) {

        return testRoleAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<TestRoleResult> testRoleAsync(final TestRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestRoleRequest, TestRoleResult> asyncHandler) {
        final TestRoleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestRoleResult>() {
            @Override
            public TestRoleResult call() throws Exception {
                TestRoleResult result = null;

                try {
                    result = executeTestRole(finalRequest);
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
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(final UpdatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {
        final UpdatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineResult>() {
            @Override
            public UpdatePipelineResult call() throws Exception {
                UpdatePipelineResult result = null;

                try {
                    result = executeUpdatePipeline(finalRequest);
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
    public java.util.concurrent.Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(UpdatePipelineNotificationsRequest request) {

        return updatePipelineNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(final UpdatePipelineNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineNotificationsRequest, UpdatePipelineNotificationsResult> asyncHandler) {
        final UpdatePipelineNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineNotificationsResult>() {
            @Override
            public UpdatePipelineNotificationsResult call() throws Exception {
                UpdatePipelineNotificationsResult result = null;

                try {
                    result = executeUpdatePipelineNotifications(finalRequest);
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
    public java.util.concurrent.Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest request) {

        return updatePipelineStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(final UpdatePipelineStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineStatusRequest, UpdatePipelineStatusResult> asyncHandler) {
        final UpdatePipelineStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineStatusResult>() {
            @Override
            public UpdatePipelineStatusResult call() throws Exception {
                UpdatePipelineStatusResult result = null;

                try {
                    result = executeUpdatePipelineStatus(finalRequest);
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
