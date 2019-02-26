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
package com.amazonaws.services.kinesisfirehose;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Firehose asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Kinesis Data Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such
 * as Amazon Simple Storage Service (Amazon S3), Amazon Elasticsearch Service (Amazon ES), Amazon Redshift, and Splunk.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisFirehoseAsyncClient extends AmazonKinesisFirehoseClient implements AmazonKinesisFirehoseAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose. A credentials provider chain will be
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
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to Firehose (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the provided AWS account
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
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonKinesisFirehoseAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisFirehoseAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonKinesisFirehoseAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonKinesisFirehoseAsyncClientBuilder asyncBuilder() {
        return AmazonKinesisFirehoseAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Firehose using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonKinesisFirehoseAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateDeliveryStreamResult> createDeliveryStreamAsync(CreateDeliveryStreamRequest request) {

        return createDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeliveryStreamResult> createDeliveryStreamAsync(final CreateDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeliveryStreamRequest, CreateDeliveryStreamResult> asyncHandler) {
        final CreateDeliveryStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeliveryStreamResult>() {
            @Override
            public CreateDeliveryStreamResult call() throws Exception {
                CreateDeliveryStreamResult result = null;

                try {
                    result = executeCreateDeliveryStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteDeliveryStreamResult> deleteDeliveryStreamAsync(DeleteDeliveryStreamRequest request) {

        return deleteDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryStreamResult> deleteDeliveryStreamAsync(final DeleteDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeliveryStreamRequest, DeleteDeliveryStreamResult> asyncHandler) {
        final DeleteDeliveryStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeliveryStreamResult>() {
            @Override
            public DeleteDeliveryStreamResult call() throws Exception {
                DeleteDeliveryStreamResult result = null;

                try {
                    result = executeDeleteDeliveryStream(finalRequest);
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
    public java.util.concurrent.Future<DescribeDeliveryStreamResult> describeDeliveryStreamAsync(DescribeDeliveryStreamRequest request) {

        return describeDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryStreamResult> describeDeliveryStreamAsync(final DescribeDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeliveryStreamRequest, DescribeDeliveryStreamResult> asyncHandler) {
        final DescribeDeliveryStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDeliveryStreamResult>() {
            @Override
            public DescribeDeliveryStreamResult call() throws Exception {
                DescribeDeliveryStreamResult result = null;

                try {
                    result = executeDescribeDeliveryStream(finalRequest);
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
    public java.util.concurrent.Future<ListDeliveryStreamsResult> listDeliveryStreamsAsync(ListDeliveryStreamsRequest request) {

        return listDeliveryStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeliveryStreamsResult> listDeliveryStreamsAsync(final ListDeliveryStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeliveryStreamsRequest, ListDeliveryStreamsResult> asyncHandler) {
        final ListDeliveryStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeliveryStreamsResult>() {
            @Override
            public ListDeliveryStreamsResult call() throws Exception {
                ListDeliveryStreamsResult result = null;

                try {
                    result = executeListDeliveryStreams(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForDeliveryStreamResult> listTagsForDeliveryStreamAsync(ListTagsForDeliveryStreamRequest request) {

        return listTagsForDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForDeliveryStreamResult> listTagsForDeliveryStreamAsync(final ListTagsForDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForDeliveryStreamRequest, ListTagsForDeliveryStreamResult> asyncHandler) {
        final ListTagsForDeliveryStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForDeliveryStreamResult>() {
            @Override
            public ListTagsForDeliveryStreamResult call() throws Exception {
                ListTagsForDeliveryStreamResult result = null;

                try {
                    result = executeListTagsForDeliveryStream(finalRequest);
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

    @Override
    public java.util.concurrent.Future<PutRecordBatchResult> putRecordBatchAsync(PutRecordBatchRequest request) {

        return putRecordBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordBatchResult> putRecordBatchAsync(final PutRecordBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordBatchRequest, PutRecordBatchResult> asyncHandler) {
        final PutRecordBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRecordBatchResult>() {
            @Override
            public PutRecordBatchResult call() throws Exception {
                PutRecordBatchResult result = null;

                try {
                    result = executePutRecordBatch(finalRequest);
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
    public java.util.concurrent.Future<StartDeliveryStreamEncryptionResult> startDeliveryStreamEncryptionAsync(StartDeliveryStreamEncryptionRequest request) {

        return startDeliveryStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeliveryStreamEncryptionResult> startDeliveryStreamEncryptionAsync(
            final StartDeliveryStreamEncryptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDeliveryStreamEncryptionRequest, StartDeliveryStreamEncryptionResult> asyncHandler) {
        final StartDeliveryStreamEncryptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDeliveryStreamEncryptionResult>() {
            @Override
            public StartDeliveryStreamEncryptionResult call() throws Exception {
                StartDeliveryStreamEncryptionResult result = null;

                try {
                    result = executeStartDeliveryStreamEncryption(finalRequest);
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
    public java.util.concurrent.Future<StopDeliveryStreamEncryptionResult> stopDeliveryStreamEncryptionAsync(StopDeliveryStreamEncryptionRequest request) {

        return stopDeliveryStreamEncryptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDeliveryStreamEncryptionResult> stopDeliveryStreamEncryptionAsync(final StopDeliveryStreamEncryptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDeliveryStreamEncryptionRequest, StopDeliveryStreamEncryptionResult> asyncHandler) {
        final StopDeliveryStreamEncryptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDeliveryStreamEncryptionResult>() {
            @Override
            public StopDeliveryStreamEncryptionResult call() throws Exception {
                StopDeliveryStreamEncryptionResult result = null;

                try {
                    result = executeStopDeliveryStreamEncryption(finalRequest);
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
    public java.util.concurrent.Future<TagDeliveryStreamResult> tagDeliveryStreamAsync(TagDeliveryStreamRequest request) {

        return tagDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagDeliveryStreamResult> tagDeliveryStreamAsync(final TagDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagDeliveryStreamRequest, TagDeliveryStreamResult> asyncHandler) {
        final TagDeliveryStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagDeliveryStreamResult>() {
            @Override
            public TagDeliveryStreamResult call() throws Exception {
                TagDeliveryStreamResult result = null;

                try {
                    result = executeTagDeliveryStream(finalRequest);
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
    public java.util.concurrent.Future<UntagDeliveryStreamResult> untagDeliveryStreamAsync(UntagDeliveryStreamRequest request) {

        return untagDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagDeliveryStreamResult> untagDeliveryStreamAsync(final UntagDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagDeliveryStreamRequest, UntagDeliveryStreamResult> asyncHandler) {
        final UntagDeliveryStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagDeliveryStreamResult>() {
            @Override
            public UntagDeliveryStreamResult call() throws Exception {
                UntagDeliveryStreamResult result = null;

                try {
                    result = executeUntagDeliveryStream(finalRequest);
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
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(UpdateDestinationRequest request) {

        return updateDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(final UpdateDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler) {
        final UpdateDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDestinationResult>() {
            @Override
            public UpdateDestinationResult call() throws Exception {
                UpdateDestinationResult result = null;

                try {
                    result = executeUpdateDestination(finalRequest);
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
