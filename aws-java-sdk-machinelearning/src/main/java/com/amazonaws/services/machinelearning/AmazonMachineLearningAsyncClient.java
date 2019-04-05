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
package com.amazonaws.services.machinelearning;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Machine Learning asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMachineLearningAsyncClient extends AmazonMachineLearningClient implements AmazonMachineLearningAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning. A credentials provider
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
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning. A credentials provider
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
     *        The client configuration options controlling how this client connects to Amazon Machine Learning (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the provided AWS
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
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonMachineLearningAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonMachineLearningAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonMachineLearningAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonMachineLearningAsyncClientBuilder asyncBuilder() {
        return AmazonMachineLearningAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Machine Learning using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonMachineLearningAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(final AddTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {
        final AddTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsResult>() {
            @Override
            public AddTagsResult call() throws Exception {
                AddTagsResult result = null;

                try {
                    result = executeAddTags(finalRequest);
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
    public java.util.concurrent.Future<CreateBatchPredictionResult> createBatchPredictionAsync(CreateBatchPredictionRequest request) {

        return createBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBatchPredictionResult> createBatchPredictionAsync(final CreateBatchPredictionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBatchPredictionRequest, CreateBatchPredictionResult> asyncHandler) {
        final CreateBatchPredictionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBatchPredictionResult>() {
            @Override
            public CreateBatchPredictionResult call() throws Exception {
                CreateBatchPredictionResult result = null;

                try {
                    result = executeCreateBatchPrediction(finalRequest);
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
    public java.util.concurrent.Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(CreateDataSourceFromRDSRequest request) {

        return createDataSourceFromRDSAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(final CreateDataSourceFromRDSRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromRDSRequest, CreateDataSourceFromRDSResult> asyncHandler) {
        final CreateDataSourceFromRDSRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceFromRDSResult>() {
            @Override
            public CreateDataSourceFromRDSResult call() throws Exception {
                CreateDataSourceFromRDSResult result = null;

                try {
                    result = executeCreateDataSourceFromRDS(finalRequest);
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
    public java.util.concurrent.Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(CreateDataSourceFromRedshiftRequest request) {

        return createDataSourceFromRedshiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(final CreateDataSourceFromRedshiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromRedshiftRequest, CreateDataSourceFromRedshiftResult> asyncHandler) {
        final CreateDataSourceFromRedshiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceFromRedshiftResult>() {
            @Override
            public CreateDataSourceFromRedshiftResult call() throws Exception {
                CreateDataSourceFromRedshiftResult result = null;

                try {
                    result = executeCreateDataSourceFromRedshift(finalRequest);
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
    public java.util.concurrent.Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(CreateDataSourceFromS3Request request) {

        return createDataSourceFromS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(final CreateDataSourceFromS3Request request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromS3Request, CreateDataSourceFromS3Result> asyncHandler) {
        final CreateDataSourceFromS3Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceFromS3Result>() {
            @Override
            public CreateDataSourceFromS3Result call() throws Exception {
                CreateDataSourceFromS3Result result = null;

                try {
                    result = executeCreateDataSourceFromS3(finalRequest);
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
    public java.util.concurrent.Future<CreateEvaluationResult> createEvaluationAsync(CreateEvaluationRequest request) {

        return createEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEvaluationResult> createEvaluationAsync(final CreateEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEvaluationRequest, CreateEvaluationResult> asyncHandler) {
        final CreateEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEvaluationResult>() {
            @Override
            public CreateEvaluationResult call() throws Exception {
                CreateEvaluationResult result = null;

                try {
                    result = executeCreateEvaluation(finalRequest);
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
    public java.util.concurrent.Future<CreateMLModelResult> createMLModelAsync(CreateMLModelRequest request) {

        return createMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMLModelResult> createMLModelAsync(final CreateMLModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMLModelRequest, CreateMLModelResult> asyncHandler) {
        final CreateMLModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMLModelResult>() {
            @Override
            public CreateMLModelResult call() throws Exception {
                CreateMLModelResult result = null;

                try {
                    result = executeCreateMLModel(finalRequest);
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
    public java.util.concurrent.Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(CreateRealtimeEndpointRequest request) {

        return createRealtimeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(final CreateRealtimeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRealtimeEndpointRequest, CreateRealtimeEndpointResult> asyncHandler) {
        final CreateRealtimeEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRealtimeEndpointResult>() {
            @Override
            public CreateRealtimeEndpointResult call() throws Exception {
                CreateRealtimeEndpointResult result = null;

                try {
                    result = executeCreateRealtimeEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(DeleteBatchPredictionRequest request) {

        return deleteBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(final DeleteBatchPredictionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBatchPredictionRequest, DeleteBatchPredictionResult> asyncHandler) {
        final DeleteBatchPredictionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBatchPredictionResult>() {
            @Override
            public DeleteBatchPredictionResult call() throws Exception {
                DeleteBatchPredictionResult result = null;

                try {
                    result = executeDeleteBatchPrediction(finalRequest);
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
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(final DeleteDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {
        final DeleteDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSourceResult>() {
            @Override
            public DeleteDataSourceResult call() throws Exception {
                DeleteDataSourceResult result = null;

                try {
                    result = executeDeleteDataSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteEvaluationResult> deleteEvaluationAsync(DeleteEvaluationRequest request) {

        return deleteEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationResult> deleteEvaluationAsync(final DeleteEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEvaluationRequest, DeleteEvaluationResult> asyncHandler) {
        final DeleteEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEvaluationResult>() {
            @Override
            public DeleteEvaluationResult call() throws Exception {
                DeleteEvaluationResult result = null;

                try {
                    result = executeDeleteEvaluation(finalRequest);
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
    public java.util.concurrent.Future<DeleteMLModelResult> deleteMLModelAsync(DeleteMLModelRequest request) {

        return deleteMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMLModelResult> deleteMLModelAsync(final DeleteMLModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMLModelRequest, DeleteMLModelResult> asyncHandler) {
        final DeleteMLModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMLModelResult>() {
            @Override
            public DeleteMLModelResult call() throws Exception {
                DeleteMLModelResult result = null;

                try {
                    result = executeDeleteMLModel(finalRequest);
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
    public java.util.concurrent.Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(DeleteRealtimeEndpointRequest request) {

        return deleteRealtimeEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(final DeleteRealtimeEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRealtimeEndpointRequest, DeleteRealtimeEndpointResult> asyncHandler) {
        final DeleteRealtimeEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRealtimeEndpointResult>() {
            @Override
            public DeleteRealtimeEndpointResult call() throws Exception {
                DeleteRealtimeEndpointResult result = null;

                try {
                    result = executeDeleteRealtimeEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
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
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(DescribeBatchPredictionsRequest request) {

        return describeBatchPredictionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(final DescribeBatchPredictionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler) {
        final DescribeBatchPredictionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBatchPredictionsResult>() {
            @Override
            public DescribeBatchPredictionsResult call() throws Exception {
                DescribeBatchPredictionsResult result = null;

                try {
                    result = executeDescribeBatchPredictions(finalRequest);
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
     * Simplified method form for invoking the DescribeBatchPredictions operation.
     *
     * @see #describeBatchPredictionsAsync(DescribeBatchPredictionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync() {

        return describeBatchPredictionsAsync(new DescribeBatchPredictionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeBatchPredictions operation with an AsyncHandler.
     *
     * @see #describeBatchPredictionsAsync(DescribeBatchPredictionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler) {

        return describeBatchPredictionsAsync(new DescribeBatchPredictionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(DescribeDataSourcesRequest request) {

        return describeDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(final DescribeDataSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler) {
        final DescribeDataSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataSourcesResult>() {
            @Override
            public DescribeDataSourcesResult call() throws Exception {
                DescribeDataSourcesResult result = null;

                try {
                    result = executeDescribeDataSources(finalRequest);
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
     * Simplified method form for invoking the DescribeDataSources operation.
     *
     * @see #describeDataSourcesAsync(DescribeDataSourcesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync() {

        return describeDataSourcesAsync(new DescribeDataSourcesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDataSources operation with an AsyncHandler.
     *
     * @see #describeDataSourcesAsync(DescribeDataSourcesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler) {

        return describeDataSourcesAsync(new DescribeDataSourcesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(DescribeEvaluationsRequest request) {

        return describeEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(final DescribeEvaluationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler) {
        final DescribeEvaluationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEvaluationsResult>() {
            @Override
            public DescribeEvaluationsResult call() throws Exception {
                DescribeEvaluationsResult result = null;

                try {
                    result = executeDescribeEvaluations(finalRequest);
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
     * Simplified method form for invoking the DescribeEvaluations operation.
     *
     * @see #describeEvaluationsAsync(DescribeEvaluationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync() {

        return describeEvaluationsAsync(new DescribeEvaluationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvaluations operation with an AsyncHandler.
     *
     * @see #describeEvaluationsAsync(DescribeEvaluationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler) {

        return describeEvaluationsAsync(new DescribeEvaluationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(DescribeMLModelsRequest request) {

        return describeMLModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(final DescribeMLModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler) {
        final DescribeMLModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMLModelsResult>() {
            @Override
            public DescribeMLModelsResult call() throws Exception {
                DescribeMLModelsResult result = null;

                try {
                    result = executeDescribeMLModels(finalRequest);
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
     * Simplified method form for invoking the DescribeMLModels operation.
     *
     * @see #describeMLModelsAsync(DescribeMLModelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync() {

        return describeMLModelsAsync(new DescribeMLModelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeMLModels operation with an AsyncHandler.
     *
     * @see #describeMLModelsAsync(DescribeMLModelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler) {

        return describeMLModelsAsync(new DescribeMLModelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {
        final DescribeTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;

                try {
                    result = executeDescribeTags(finalRequest);
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
    public java.util.concurrent.Future<GetBatchPredictionResult> getBatchPredictionAsync(GetBatchPredictionRequest request) {

        return getBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBatchPredictionResult> getBatchPredictionAsync(final GetBatchPredictionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBatchPredictionRequest, GetBatchPredictionResult> asyncHandler) {
        final GetBatchPredictionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBatchPredictionResult>() {
            @Override
            public GetBatchPredictionResult call() throws Exception {
                GetBatchPredictionResult result = null;

                try {
                    result = executeGetBatchPrediction(finalRequest);
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
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest request) {

        return getDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(final GetDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler) {
        final GetDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSourceResult>() {
            @Override
            public GetDataSourceResult call() throws Exception {
                GetDataSourceResult result = null;

                try {
                    result = executeGetDataSource(finalRequest);
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
    public java.util.concurrent.Future<GetEvaluationResult> getEvaluationAsync(GetEvaluationRequest request) {

        return getEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvaluationResult> getEvaluationAsync(final GetEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvaluationRequest, GetEvaluationResult> asyncHandler) {
        final GetEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvaluationResult>() {
            @Override
            public GetEvaluationResult call() throws Exception {
                GetEvaluationResult result = null;

                try {
                    result = executeGetEvaluation(finalRequest);
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
    public java.util.concurrent.Future<GetMLModelResult> getMLModelAsync(GetMLModelRequest request) {

        return getMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMLModelResult> getMLModelAsync(final GetMLModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMLModelRequest, GetMLModelResult> asyncHandler) {
        final GetMLModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMLModelResult>() {
            @Override
            public GetMLModelResult call() throws Exception {
                GetMLModelResult result = null;

                try {
                    result = executeGetMLModel(finalRequest);
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
    public java.util.concurrent.Future<PredictResult> predictAsync(PredictRequest request) {

        return predictAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PredictResult> predictAsync(final PredictRequest request,
            final com.amazonaws.handlers.AsyncHandler<PredictRequest, PredictResult> asyncHandler) {
        final PredictRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PredictResult>() {
            @Override
            public PredictResult call() throws Exception {
                PredictResult result = null;

                try {
                    result = executePredict(finalRequest);
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
    public java.util.concurrent.Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(UpdateBatchPredictionRequest request) {

        return updateBatchPredictionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(final UpdateBatchPredictionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBatchPredictionRequest, UpdateBatchPredictionResult> asyncHandler) {
        final UpdateBatchPredictionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBatchPredictionResult>() {
            @Override
            public UpdateBatchPredictionResult call() throws Exception {
                UpdateBatchPredictionResult result = null;

                try {
                    result = executeUpdateBatchPrediction(finalRequest);
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
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(final UpdateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {
        final UpdateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSourceResult>() {
            @Override
            public UpdateDataSourceResult call() throws Exception {
                UpdateDataSourceResult result = null;

                try {
                    result = executeUpdateDataSource(finalRequest);
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
    public java.util.concurrent.Future<UpdateEvaluationResult> updateEvaluationAsync(UpdateEvaluationRequest request) {

        return updateEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEvaluationResult> updateEvaluationAsync(final UpdateEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEvaluationRequest, UpdateEvaluationResult> asyncHandler) {
        final UpdateEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEvaluationResult>() {
            @Override
            public UpdateEvaluationResult call() throws Exception {
                UpdateEvaluationResult result = null;

                try {
                    result = executeUpdateEvaluation(finalRequest);
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
    public java.util.concurrent.Future<UpdateMLModelResult> updateMLModelAsync(UpdateMLModelRequest request) {

        return updateMLModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMLModelResult> updateMLModelAsync(final UpdateMLModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMLModelRequest, UpdateMLModelResult> asyncHandler) {
        final UpdateMLModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMLModelResult>() {
            @Override
            public UpdateMLModelResult call() throws Exception {
                UpdateMLModelResult result = null;

                try {
                    result = executeUpdateMLModel(finalRequest);
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
