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
package com.amazonaws.services.kinesis;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Kinesis asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Kinesis Data Streams Service API Reference</fullname>
 * <p>
 * Amazon Kinesis Data Streams is a managed service that scales elastically for real-time processing of streaming big
 * data.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisAsyncClient extends AmazonKinesisClient implements AmazonKinesisAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonKinesisAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Kinesis (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the provided AWS account
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
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonKinesisAsyncClientBuilder asyncBuilder() {
        return AmazonKinesisAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsToStreamResult> addTagsToStreamAsync(AddTagsToStreamRequest request) {

        return addTagsToStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToStreamResult> addTagsToStreamAsync(final AddTagsToStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToStreamRequest, AddTagsToStreamResult> asyncHandler) {
        final AddTagsToStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToStreamResult>() {
            @Override
            public AddTagsToStreamResult call() throws Exception {
                AddTagsToStreamResult result = null;

                try {
                    result = executeAddTagsToStream(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(final CreateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {
        final CreateStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamResult>() {
            @Override
            public CreateStreamResult call() throws Exception {
                CreateStreamResult result = null;

                try {
                    result = executeCreateStream(finalRequest);
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
     * Simplified method form for invoking the CreateStream operation.
     *
     * @see #createStreamAsync(CreateStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(String streamName, Integer shardCount) {

        return createStreamAsync(new CreateStreamRequest().withStreamName(streamName).withShardCount(shardCount));
    }

    /**
     * Simplified method form for invoking the CreateStream operation with an AsyncHandler.
     *
     * @see #createStreamAsync(CreateStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateStreamResult> createStreamAsync(String streamName, Integer shardCount,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler) {

        return createStreamAsync(new CreateStreamRequest().withStreamName(streamName).withShardCount(shardCount), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DecreaseStreamRetentionPeriodResult> decreaseStreamRetentionPeriodAsync(DecreaseStreamRetentionPeriodRequest request) {

        return decreaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecreaseStreamRetentionPeriodResult> decreaseStreamRetentionPeriodAsync(
            final DecreaseStreamRetentionPeriodRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecreaseStreamRetentionPeriodRequest, DecreaseStreamRetentionPeriodResult> asyncHandler) {
        final DecreaseStreamRetentionPeriodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DecreaseStreamRetentionPeriodResult>() {
            @Override
            public DecreaseStreamRetentionPeriodResult call() throws Exception {
                DecreaseStreamRetentionPeriodResult result = null;

                try {
                    result = executeDecreaseStreamRetentionPeriod(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(final DeleteStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {
        final DeleteStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamResult>() {
            @Override
            public DeleteStreamResult call() throws Exception {
                DeleteStreamResult result = null;

                try {
                    result = executeDeleteStream(finalRequest);
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
     * Simplified method form for invoking the DeleteStream operation.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(String streamName) {

        return deleteStreamAsync(new DeleteStreamRequest().withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DeleteStream operation with an AsyncHandler.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(String streamName,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler) {

        return deleteStreamAsync(new DeleteStreamRequest().withStreamName(streamName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeregisterStreamConsumerResult> deregisterStreamConsumerAsync(DeregisterStreamConsumerRequest request) {

        return deregisterStreamConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterStreamConsumerResult> deregisterStreamConsumerAsync(final DeregisterStreamConsumerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterStreamConsumerRequest, DeregisterStreamConsumerResult> asyncHandler) {
        final DeregisterStreamConsumerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterStreamConsumerResult>() {
            @Override
            public DeregisterStreamConsumerResult call() throws Exception {
                DeregisterStreamConsumerResult result = null;

                try {
                    result = executeDeregisterStreamConsumer(finalRequest);
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
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest request) {

        return describeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(final DescribeLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler) {
        final DescribeLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLimitsResult>() {
            @Override
            public DescribeLimitsResult call() throws Exception {
                DescribeLimitsResult result = null;

                try {
                    result = executeDescribeLimits(finalRequest);
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
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(final DescribeStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {
        final DescribeStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamResult>() {
            @Override
            public DescribeStreamResult call() throws Exception {
                DescribeStreamResult result = null;

                try {
                    result = executeDescribeStream(finalRequest);
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
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName), asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withExclusiveStartShardId(exclusiveStartShardId), asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, Integer limit, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withLimit(limit).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(String streamName, Integer limit, String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(streamName).withLimit(limit).withExclusiveStartShardId(exclusiveStartShardId),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamConsumerResult> describeStreamConsumerAsync(DescribeStreamConsumerRequest request) {

        return describeStreamConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamConsumerResult> describeStreamConsumerAsync(final DescribeStreamConsumerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamConsumerRequest, DescribeStreamConsumerResult> asyncHandler) {
        final DescribeStreamConsumerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamConsumerResult>() {
            @Override
            public DescribeStreamConsumerResult call() throws Exception {
                DescribeStreamConsumerResult result = null;

                try {
                    result = executeDescribeStreamConsumer(finalRequest);
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
    public java.util.concurrent.Future<DescribeStreamSummaryResult> describeStreamSummaryAsync(DescribeStreamSummaryRequest request) {

        return describeStreamSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamSummaryResult> describeStreamSummaryAsync(final DescribeStreamSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamSummaryRequest, DescribeStreamSummaryResult> asyncHandler) {
        final DescribeStreamSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamSummaryResult>() {
            @Override
            public DescribeStreamSummaryResult call() throws Exception {
                DescribeStreamSummaryResult result = null;

                try {
                    result = executeDescribeStreamSummary(finalRequest);
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
    public java.util.concurrent.Future<DisableEnhancedMonitoringResult> disableEnhancedMonitoringAsync(DisableEnhancedMonitoringRequest request) {

        return disableEnhancedMonitoringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableEnhancedMonitoringResult> disableEnhancedMonitoringAsync(final DisableEnhancedMonitoringRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableEnhancedMonitoringRequest, DisableEnhancedMonitoringResult> asyncHandler) {
        final DisableEnhancedMonitoringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableEnhancedMonitoringResult>() {
            @Override
            public DisableEnhancedMonitoringResult call() throws Exception {
                DisableEnhancedMonitoringResult result = null;

                try {
                    result = executeDisableEnhancedMonitoring(finalRequest);
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
    public java.util.concurrent.Future<EnableEnhancedMonitoringResult> enableEnhancedMonitoringAsync(EnableEnhancedMonitoringRequest request) {

        return enableEnhancedMonitoringAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableEnhancedMonitoringResult> enableEnhancedMonitoringAsync(final EnableEnhancedMonitoringRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableEnhancedMonitoringRequest, EnableEnhancedMonitoringResult> asyncHandler) {
        final EnableEnhancedMonitoringRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableEnhancedMonitoringResult>() {
            @Override
            public EnableEnhancedMonitoringResult call() throws Exception {
                EnableEnhancedMonitoringResult result = null;

                try {
                    result = executeEnableEnhancedMonitoring(finalRequest);
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
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest request) {

        return getRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(final GetRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {
        final GetRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecordsResult>() {
            @Override
            public GetRecordsResult call() throws Exception {
                GetRecordsResult result = null;

                try {
                    result = executeGetRecords(finalRequest);
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
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest request) {

        return getShardIteratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(final GetShardIteratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {
        final GetShardIteratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetShardIteratorResult>() {
            @Override
            public GetShardIteratorResult call() throws Exception {
                GetShardIteratorResult result = null;

                try {
                    result = executeGetShardIterator(finalRequest);
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
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType,
            String startingSequenceNumber) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(String streamName, String shardId, String shardIteratorType,
            String startingSequenceNumber, com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<IncreaseStreamRetentionPeriodResult> increaseStreamRetentionPeriodAsync(IncreaseStreamRetentionPeriodRequest request) {

        return increaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IncreaseStreamRetentionPeriodResult> increaseStreamRetentionPeriodAsync(
            final IncreaseStreamRetentionPeriodRequest request,
            final com.amazonaws.handlers.AsyncHandler<IncreaseStreamRetentionPeriodRequest, IncreaseStreamRetentionPeriodResult> asyncHandler) {
        final IncreaseStreamRetentionPeriodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<IncreaseStreamRetentionPeriodResult>() {
            @Override
            public IncreaseStreamRetentionPeriodResult call() throws Exception {
                IncreaseStreamRetentionPeriodResult result = null;

                try {
                    result = executeIncreaseStreamRetentionPeriod(finalRequest);
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
    public java.util.concurrent.Future<ListShardsResult> listShardsAsync(ListShardsRequest request) {

        return listShardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListShardsResult> listShardsAsync(final ListShardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListShardsRequest, ListShardsResult> asyncHandler) {
        final ListShardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListShardsResult>() {
            @Override
            public ListShardsResult call() throws Exception {
                ListShardsResult result = null;

                try {
                    result = executeListShards(finalRequest);
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
    public java.util.concurrent.Future<ListStreamConsumersResult> listStreamConsumersAsync(ListStreamConsumersRequest request) {

        return listStreamConsumersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamConsumersResult> listStreamConsumersAsync(final ListStreamConsumersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamConsumersRequest, ListStreamConsumersResult> asyncHandler) {
        final ListStreamConsumersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamConsumersResult>() {
            @Override
            public ListStreamConsumersResult call() throws Exception {
                ListStreamConsumersResult result = null;

                try {
                    result = executeListStreamConsumers(finalRequest);
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
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(final ListStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {
        final ListStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamsResult>() {
            @Override
            public ListStreamsResult call() throws Exception {
                ListStreamsResult result = null;

                try {
                    result = executeListStreams(finalRequest);
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
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync() {

        return listStreamsAsync(new ListStreamsRequest());
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest().withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest().withExclusiveStartStreamName(exclusiveStartStreamName), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(Integer limit, String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit).withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(Integer limit, String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit).withExclusiveStartStreamName(exclusiveStartStreamName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest request) {

        return listTagsForStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(final ListTagsForStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {
        final ListTagsForStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForStreamResult>() {
            @Override
            public ListTagsForStreamResult call() throws Exception {
                ListTagsForStreamResult result = null;

                try {
                    result = executeListTagsForStream(finalRequest);
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
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(MergeShardsRequest request) {

        return mergeShardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(final MergeShardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, MergeShardsResult> asyncHandler) {
        final MergeShardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MergeShardsResult>() {
            @Override
            public MergeShardsResult call() throws Exception {
                MergeShardsResult result = null;

                try {
                    result = executeMergeShards(finalRequest);
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
     * Simplified method form for invoking the MergeShards operation.
     *
     * @see #mergeShardsAsync(MergeShardsRequest)
     */
    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(String streamName, String shardToMerge, String adjacentShardToMerge) {

        return mergeShardsAsync(new MergeShardsRequest().withStreamName(streamName).withShardToMerge(shardToMerge)
                .withAdjacentShardToMerge(adjacentShardToMerge));
    }

    /**
     * Simplified method form for invoking the MergeShards operation with an AsyncHandler.
     *
     * @see #mergeShardsAsync(MergeShardsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<MergeShardsResult> mergeShardsAsync(String streamName, String shardToMerge, String adjacentShardToMerge,
            com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, MergeShardsResult> asyncHandler) {

        return mergeShardsAsync(
                new MergeShardsRequest().withStreamName(streamName).withShardToMerge(shardToMerge).withAdjacentShardToMerge(adjacentShardToMerge), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest request) {

        return putRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(final PutRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {
        final PutRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRecordResult>() {
            @Override
            public PutRecordResult call() throws Exception {
                PutRecordResult result = null;

                try {
                    result = executePutRecord(finalRequest);
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
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey), asyncHandler);
    }

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(String streamName, java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering, com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(
                new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey)
                        .withSequenceNumberForOrdering(sequenceNumberForOrdering), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(PutRecordsRequest request) {

        return putRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(final PutRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordsRequest, PutRecordsResult> asyncHandler) {
        final PutRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRecordsResult>() {
            @Override
            public PutRecordsResult call() throws Exception {
                PutRecordsResult result = null;

                try {
                    result = executePutRecords(finalRequest);
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
    public java.util.concurrent.Future<RegisterStreamConsumerResult> registerStreamConsumerAsync(RegisterStreamConsumerRequest request) {

        return registerStreamConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterStreamConsumerResult> registerStreamConsumerAsync(final RegisterStreamConsumerRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterStreamConsumerRequest, RegisterStreamConsumerResult> asyncHandler) {
        final RegisterStreamConsumerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterStreamConsumerResult>() {
            @Override
            public RegisterStreamConsumerResult call() throws Exception {
                RegisterStreamConsumerResult result = null;

                try {
                    result = executeRegisterStreamConsumer(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsFromStreamResult> removeTagsFromStreamAsync(RemoveTagsFromStreamRequest request) {

        return removeTagsFromStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromStreamResult> removeTagsFromStreamAsync(final RemoveTagsFromStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromStreamRequest, RemoveTagsFromStreamResult> asyncHandler) {
        final RemoveTagsFromStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromStreamResult>() {
            @Override
            public RemoveTagsFromStreamResult call() throws Exception {
                RemoveTagsFromStreamResult result = null;

                try {
                    result = executeRemoveTagsFromStream(finalRequest);
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
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(SplitShardRequest request) {

        return splitShardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(final SplitShardRequest request,
            final com.amazonaws.handlers.AsyncHandler<SplitShardRequest, SplitShardResult> asyncHandler) {
        final SplitShardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SplitShardResult>() {
            @Override
            public SplitShardResult call() throws Exception {
                SplitShardResult result = null;

                try {
                    result = executeSplitShard(finalRequest);
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
     * Simplified method form for invoking the SplitShard operation.
     *
     * @see #splitShardAsync(SplitShardRequest)
     */
    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(String streamName, String shardToSplit, String newStartingHashKey) {

        return splitShardAsync(new SplitShardRequest().withStreamName(streamName).withShardToSplit(shardToSplit).withNewStartingHashKey(newStartingHashKey));
    }

    /**
     * Simplified method form for invoking the SplitShard operation with an AsyncHandler.
     *
     * @see #splitShardAsync(SplitShardRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SplitShardResult> splitShardAsync(String streamName, String shardToSplit, String newStartingHashKey,
            com.amazonaws.handlers.AsyncHandler<SplitShardRequest, SplitShardResult> asyncHandler) {

        return splitShardAsync(new SplitShardRequest().withStreamName(streamName).withShardToSplit(shardToSplit).withNewStartingHashKey(newStartingHashKey),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<StartStreamEncryptionResult> startStreamEncryptionAsync(StartStreamEncryptionRequest request) {

        return startStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStreamEncryptionResult> startStreamEncryptionAsync(final StartStreamEncryptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartStreamEncryptionRequest, StartStreamEncryptionResult> asyncHandler) {
        final StartStreamEncryptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartStreamEncryptionResult>() {
            @Override
            public StartStreamEncryptionResult call() throws Exception {
                StartStreamEncryptionResult result = null;

                try {
                    result = executeStartStreamEncryption(finalRequest);
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
    public java.util.concurrent.Future<StopStreamEncryptionResult> stopStreamEncryptionAsync(StopStreamEncryptionRequest request) {

        return stopStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStreamEncryptionResult> stopStreamEncryptionAsync(final StopStreamEncryptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopStreamEncryptionRequest, StopStreamEncryptionResult> asyncHandler) {
        final StopStreamEncryptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopStreamEncryptionResult>() {
            @Override
            public StopStreamEncryptionResult call() throws Exception {
                StopStreamEncryptionResult result = null;

                try {
                    result = executeStopStreamEncryption(finalRequest);
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
    public java.util.concurrent.Future<UpdateShardCountResult> updateShardCountAsync(UpdateShardCountRequest request) {

        return updateShardCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateShardCountResult> updateShardCountAsync(final UpdateShardCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateShardCountRequest, UpdateShardCountResult> asyncHandler) {
        final UpdateShardCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateShardCountResult>() {
            @Override
            public UpdateShardCountResult call() throws Exception {
                UpdateShardCountResult result = null;

                try {
                    result = executeUpdateShardCount(finalRequest);
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
