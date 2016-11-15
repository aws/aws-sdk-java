/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing Amazon DynamoDB Streams asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon DynamoDB</fullname>
 * <p>
 * Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
 * application development with Streams, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html">Capturing Table Activity with
 * DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.
 * </p>
 * <p>
 * The following are short descriptions of each low-level DynamoDB Streams action:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>DescribeStream</i> - Returns detailed information about a particular stream.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>GetRecords</i> - Retrieves the stream records from within a shard.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>GetShardIterator</i> - Returns information on how to retrieve the streams record from a shard with a given shard
 * ID.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>ListStreams</i> - Returns a list of all the streams associated with the current AWS account and endpoint.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonDynamoDBStreamsAsyncClient extends AmazonDynamoDBStreamsClient implements AmazonDynamoDBStreamsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams. A credentials provider
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
     */
    public AmazonDynamoDBStreamsAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams. A credentials provider
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
     *        The client configuration options controlling how this client connects to Amazon DynamoDB Streams (ex:
     *        proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the provided AWS
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
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonDynamoDBStreamsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon DynamoDB Streams using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDynamoDBStreamsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(final DescribeStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeStreamResult>() {
            @Override
            public DescribeStreamResult call() throws Exception {
                DescribeStreamResult result;

                try {
                    result = describeStream(request);
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
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest request) {

        return getRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(final GetRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetRecordsResult>() {
            @Override
            public GetRecordsResult call() throws Exception {
                GetRecordsResult result;

                try {
                    result = getRecords(request);
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
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest request) {

        return getShardIteratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(final GetShardIteratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetShardIteratorResult>() {
            @Override
            public GetShardIteratorResult call() throws Exception {
                GetShardIteratorResult result;

                try {
                    result = getShardIterator(request);
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
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(final ListStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListStreamsResult>() {
            @Override
            public ListStreamsResult call() throws Exception {
                ListStreamsResult result;

                try {
                    result = listStreams(request);
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
