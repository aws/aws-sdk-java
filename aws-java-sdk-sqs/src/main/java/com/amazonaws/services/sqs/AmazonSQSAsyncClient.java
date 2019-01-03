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
package com.amazonaws.services.sqs;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon SQS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Simple Queue Service API Reference</i>.
 * </p>
 * <p>
 * Amazon Simple Queue Service (Amazon SQS) is a reliable, highly-scalable hosted queue for storing messages as they
 * travel between applications or microservices. Amazon SQS moves data between distributed application components and
 * helps you decouple these components.
 * </p>
 * <note>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/standard-queues.html">Standard
 * queues</a> are available in all regions. <a
 * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO queues</a> are
 * available in the US East (N. Virginia), US East (Ohio), US West (Oregon), and EU (Ireland) regions.
 * </p>
 * </note>
 * <p>
 * You can use <a href="http://aws.amazon.com/tools/#sdk">AWS SDKs</a> to access Amazon SQS using your favorite
 * programming language. The SDKs perform tasks such as the following automatically:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Cryptographically sign your service requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Retry requests
 * </p>
 * </li>
 * <li>
 * <p>
 * Handle error responses
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Additional Information</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/sqs/">Amazon SQS Product Page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Amazon Simple Queue Service Developer Guide</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html">
 * Making API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon
 * SQS Message Attributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Amazon
 * SQS Dead-Letter Queues</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/cli/latest/reference/sqs/index.html">Amazon SQS in the <i>AWS CLI Command
 * Reference</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Amazon Web Services General Reference</i>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region">Regions and Endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSQSAsyncClient extends AmazonSQSClient implements AmazonSQSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonSQSAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS. A credentials provider chain will
     * be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon SQS (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSQSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the provided AWS account
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
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonSQSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonSQSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonSQSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonSQSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonSQSAsyncClientBuilder asyncBuilder() {
        return AmazonSQSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SQS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSQSAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(final AddPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {
        final AddPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddPermissionResult>() {
            @Override
            public AddPermissionResult call() throws Exception {
                AddPermissionResult result = null;

                try {
                    result = executeAddPermission(finalRequest);
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
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String queueUrl, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actions) {

        return addPermissionAsync(new AddPermissionRequest().withQueueUrl(queueUrl).withLabel(label).withAWSAccountIds(aWSAccountIds).withActions(actions));
    }

    /**
     * Simplified method form for invoking the AddPermission operation with an AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String queueUrl, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actions, com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        return addPermissionAsync(new AddPermissionRequest().withQueueUrl(queueUrl).withLabel(label).withAWSAccountIds(aWSAccountIds).withActions(actions),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(ChangeMessageVisibilityRequest request) {

        return changeMessageVisibilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(final ChangeMessageVisibilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> asyncHandler) {
        final ChangeMessageVisibilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangeMessageVisibilityResult>() {
            @Override
            public ChangeMessageVisibilityResult call() throws Exception {
                ChangeMessageVisibilityResult result = null;

                try {
                    result = executeChangeMessageVisibility(finalRequest);
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
     * Simplified method form for invoking the ChangeMessageVisibility operation.
     *
     * @see #changeMessageVisibilityAsync(ChangeMessageVisibilityRequest)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(String queueUrl, String receiptHandle,
            Integer visibilityTimeout) {

        return changeMessageVisibilityAsync(new ChangeMessageVisibilityRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle)
                .withVisibilityTimeout(visibilityTimeout));
    }

    /**
     * Simplified method form for invoking the ChangeMessageVisibility operation with an AsyncHandler.
     *
     * @see #changeMessageVisibilityAsync(ChangeMessageVisibilityRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(String queueUrl, String receiptHandle,
            Integer visibilityTimeout, com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> asyncHandler) {

        return changeMessageVisibilityAsync(
                new ChangeMessageVisibilityRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle).withVisibilityTimeout(visibilityTimeout),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest request) {

        return changeMessageVisibilityBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(final ChangeMessageVisibilityBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler) {
        final ChangeMessageVisibilityBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChangeMessageVisibilityBatchResult>() {
            @Override
            public ChangeMessageVisibilityBatchResult call() throws Exception {
                ChangeMessageVisibilityBatchResult result = null;

                try {
                    result = executeChangeMessageVisibilityBatch(finalRequest);
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
     * Simplified method form for invoking the ChangeMessageVisibilityBatch operation.
     *
     * @see #changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {

        return changeMessageVisibilityBatchAsync(new ChangeMessageVisibilityBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * Simplified method form for invoking the ChangeMessageVisibilityBatch operation with an AsyncHandler.
     *
     * @see #changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler) {

        return changeMessageVisibilityBatchAsync(new ChangeMessageVisibilityBatchRequest().withQueueUrl(queueUrl).withEntries(entries), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request) {

        return createQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {
        final CreateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueResult>() {
            @Override
            public CreateQueueResult call() throws Exception {
                CreateQueueResult result = null;

                try {
                    result = executeCreateQueue(finalRequest);
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
     * Simplified method form for invoking the CreateQueue operation.
     *
     * @see #createQueueAsync(CreateQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(String queueName) {

        return createQueueAsync(new CreateQueueRequest().withQueueName(queueName));
    }

    /**
     * Simplified method form for invoking the CreateQueue operation with an AsyncHandler.
     *
     * @see #createQueueAsync(CreateQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(String queueName,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {

        return createQueueAsync(new CreateQueueRequest().withQueueName(queueName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest request) {

        return deleteMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(final DeleteMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler) {
        final DeleteMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMessageResult>() {
            @Override
            public DeleteMessageResult call() throws Exception {
                DeleteMessageResult result = null;

                try {
                    result = executeDeleteMessage(finalRequest);
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
     * Simplified method form for invoking the DeleteMessage operation.
     *
     * @see #deleteMessageAsync(DeleteMessageRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(String queueUrl, String receiptHandle) {

        return deleteMessageAsync(new DeleteMessageRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle));
    }

    /**
     * Simplified method form for invoking the DeleteMessage operation with an AsyncHandler.
     *
     * @see #deleteMessageAsync(DeleteMessageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(String queueUrl, String receiptHandle,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler) {

        return deleteMessageAsync(new DeleteMessageRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(DeleteMessageBatchRequest request) {

        return deleteMessageBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(final DeleteMessageBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler) {
        final DeleteMessageBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMessageBatchResult>() {
            @Override
            public DeleteMessageBatchResult call() throws Exception {
                DeleteMessageBatchResult result = null;

                try {
                    result = executeDeleteMessageBatch(finalRequest);
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
     * Simplified method form for invoking the DeleteMessageBatch operation.
     *
     * @see #deleteMessageBatchAsync(DeleteMessageBatchRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(String queueUrl, java.util.List<DeleteMessageBatchRequestEntry> entries) {

        return deleteMessageBatchAsync(new DeleteMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * Simplified method form for invoking the DeleteMessageBatch operation with an AsyncHandler.
     *
     * @see #deleteMessageBatchAsync(DeleteMessageBatchRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler) {

        return deleteMessageBatchAsync(new DeleteMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest request) {

        return deleteQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(final DeleteQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {
        final DeleteQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueueResult>() {
            @Override
            public DeleteQueueResult call() throws Exception {
                DeleteQueueResult result = null;

                try {
                    result = executeDeleteQueue(finalRequest);
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
     * Simplified method form for invoking the DeleteQueue operation.
     *
     * @see #deleteQueueAsync(DeleteQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(String queueUrl) {

        return deleteQueueAsync(new DeleteQueueRequest().withQueueUrl(queueUrl));
    }

    /**
     * Simplified method form for invoking the DeleteQueue operation with an AsyncHandler.
     *
     * @see #deleteQueueAsync(DeleteQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(String queueUrl,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {

        return deleteQueueAsync(new DeleteQueueRequest().withQueueUrl(queueUrl), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(GetQueueAttributesRequest request) {

        return getQueueAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(final GetQueueAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler) {
        final GetQueueAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueueAttributesResult>() {
            @Override
            public GetQueueAttributesResult call() throws Exception {
                GetQueueAttributesResult result = null;

                try {
                    result = executeGetQueueAttributes(finalRequest);
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
     * Simplified method form for invoking the GetQueueAttributes operation.
     *
     * @see #getQueueAttributesAsync(GetQueueAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(String queueUrl, java.util.List<String> attributeNames) {

        return getQueueAttributesAsync(new GetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributeNames(attributeNames));
    }

    /**
     * Simplified method form for invoking the GetQueueAttributes operation with an AsyncHandler.
     *
     * @see #getQueueAttributesAsync(GetQueueAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(String queueUrl, java.util.List<String> attributeNames,
            com.amazonaws.handlers.AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler) {

        return getQueueAttributesAsync(new GetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributeNames(attributeNames), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest request) {

        return getQueueUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(final GetQueueUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler) {
        final GetQueueUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueueUrlResult>() {
            @Override
            public GetQueueUrlResult call() throws Exception {
                GetQueueUrlResult result = null;

                try {
                    result = executeGetQueueUrl(finalRequest);
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
     * Simplified method form for invoking the GetQueueUrl operation.
     *
     * @see #getQueueUrlAsync(GetQueueUrlRequest)
     */
    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(String queueName) {

        return getQueueUrlAsync(new GetQueueUrlRequest().withQueueName(queueName));
    }

    /**
     * Simplified method form for invoking the GetQueueUrl operation with an AsyncHandler.
     *
     * @see #getQueueUrlAsync(GetQueueUrlRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(String queueName,
            com.amazonaws.handlers.AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler) {

        return getQueueUrlAsync(new GetQueueUrlRequest().withQueueName(queueName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(ListDeadLetterSourceQueuesRequest request) {

        return listDeadLetterSourceQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(final ListDeadLetterSourceQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeadLetterSourceQueuesRequest, ListDeadLetterSourceQueuesResult> asyncHandler) {
        final ListDeadLetterSourceQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeadLetterSourceQueuesResult>() {
            @Override
            public ListDeadLetterSourceQueuesResult call() throws Exception {
                ListDeadLetterSourceQueuesResult result = null;

                try {
                    result = executeListDeadLetterSourceQueues(finalRequest);
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
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(ListQueueTagsRequest request) {

        return listQueueTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(final ListQueueTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueueTagsRequest, ListQueueTagsResult> asyncHandler) {
        final ListQueueTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueueTagsResult>() {
            @Override
            public ListQueueTagsResult call() throws Exception {
                ListQueueTagsResult result = null;

                try {
                    result = executeListQueueTags(finalRequest);
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
     * Simplified method form for invoking the ListQueueTags operation.
     *
     * @see #listQueueTagsAsync(ListQueueTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(String queueUrl) {

        return listQueueTagsAsync(new ListQueueTagsRequest().withQueueUrl(queueUrl));
    }

    /**
     * Simplified method form for invoking the ListQueueTags operation with an AsyncHandler.
     *
     * @see #listQueueTagsAsync(ListQueueTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(String queueUrl,
            com.amazonaws.handlers.AsyncHandler<ListQueueTagsRequest, ListQueueTagsResult> asyncHandler) {

        return listQueueTagsAsync(new ListQueueTagsRequest().withQueueUrl(queueUrl), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {
        final ListQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueuesResult>() {
            @Override
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;

                try {
                    result = executeListQueues(finalRequest);
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
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueuesAsync(ListQueuesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync() {

        return listQueuesAsync(new ListQueuesRequest());
    }

    /**
     * Simplified method form for invoking the ListQueues operation with an AsyncHandler.
     *
     * @see #listQueuesAsync(ListQueuesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {

        return listQueuesAsync(new ListQueuesRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueuesAsync(ListQueuesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(String queueNamePrefix) {

        return listQueuesAsync(new ListQueuesRequest().withQueueNamePrefix(queueNamePrefix));
    }

    /**
     * Simplified method form for invoking the ListQueues operation with an AsyncHandler.
     *
     * @see #listQueuesAsync(ListQueuesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(String queueNamePrefix,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {

        return listQueuesAsync(new ListQueuesRequest().withQueueNamePrefix(queueNamePrefix), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PurgeQueueResult> purgeQueueAsync(PurgeQueueRequest request) {

        return purgeQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurgeQueueResult> purgeQueueAsync(final PurgeQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurgeQueueRequest, PurgeQueueResult> asyncHandler) {
        final PurgeQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurgeQueueResult>() {
            @Override
            public PurgeQueueResult call() throws Exception {
                PurgeQueueResult result = null;

                try {
                    result = executePurgeQueue(finalRequest);
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
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest request) {

        return receiveMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(final ReceiveMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler) {
        final ReceiveMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReceiveMessageResult>() {
            @Override
            public ReceiveMessageResult call() throws Exception {
                ReceiveMessageResult result = null;

                try {
                    result = executeReceiveMessage(finalRequest);
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
     * Simplified method form for invoking the ReceiveMessage operation.
     *
     * @see #receiveMessageAsync(ReceiveMessageRequest)
     */
    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(String queueUrl) {

        return receiveMessageAsync(new ReceiveMessageRequest().withQueueUrl(queueUrl));
    }

    /**
     * Simplified method form for invoking the ReceiveMessage operation with an AsyncHandler.
     *
     * @see #receiveMessageAsync(ReceiveMessageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(String queueUrl,
            com.amazonaws.handlers.AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler) {

        return receiveMessageAsync(new ReceiveMessageRequest().withQueueUrl(queueUrl), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(final RemovePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {
        final RemovePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemovePermissionResult>() {
            @Override
            public RemovePermissionResult call() throws Exception {
                RemovePermissionResult result = null;

                try {
                    result = executeRemovePermission(finalRequest);
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
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String queueUrl, String label) {

        return removePermissionAsync(new RemovePermissionRequest().withQueueUrl(queueUrl).withLabel(label));
    }

    /**
     * Simplified method form for invoking the RemovePermission operation with an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String queueUrl, String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        return removePermissionAsync(new RemovePermissionRequest().withQueueUrl(queueUrl).withLabel(label), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest request) {

        return sendMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(final SendMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler) {
        final SendMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendMessageResult>() {
            @Override
            public SendMessageResult call() throws Exception {
                SendMessageResult result = null;

                try {
                    result = executeSendMessage(finalRequest);
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
     * Simplified method form for invoking the SendMessage operation.
     *
     * @see #sendMessageAsync(SendMessageRequest)
     */
    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(String queueUrl, String messageBody) {

        return sendMessageAsync(new SendMessageRequest().withQueueUrl(queueUrl).withMessageBody(messageBody));
    }

    /**
     * Simplified method form for invoking the SendMessage operation with an AsyncHandler.
     *
     * @see #sendMessageAsync(SendMessageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(String queueUrl, String messageBody,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler) {

        return sendMessageAsync(new SendMessageRequest().withQueueUrl(queueUrl).withMessageBody(messageBody), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(SendMessageBatchRequest request) {

        return sendMessageBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(final SendMessageBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler) {
        final SendMessageBatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendMessageBatchResult>() {
            @Override
            public SendMessageBatchResult call() throws Exception {
                SendMessageBatchResult result = null;

                try {
                    result = executeSendMessageBatch(finalRequest);
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
     * Simplified method form for invoking the SendMessageBatch operation.
     *
     * @see #sendMessageBatchAsync(SendMessageBatchRequest)
     */
    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries) {

        return sendMessageBatchAsync(new SendMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * Simplified method form for invoking the SendMessageBatch operation with an AsyncHandler.
     *
     * @see #sendMessageBatchAsync(SendMessageBatchRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler) {

        return sendMessageBatchAsync(new SendMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(SetQueueAttributesRequest request) {

        return setQueueAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(final SetQueueAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetQueueAttributesRequest, SetQueueAttributesResult> asyncHandler) {
        final SetQueueAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetQueueAttributesResult>() {
            @Override
            public SetQueueAttributesResult call() throws Exception {
                SetQueueAttributesResult result = null;

                try {
                    result = executeSetQueueAttributes(finalRequest);
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
     * Simplified method form for invoking the SetQueueAttributes operation.
     *
     * @see #setQueueAttributesAsync(SetQueueAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(String queueUrl, java.util.Map<String, String> attributes) {

        return setQueueAttributesAsync(new SetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributes(attributes));
    }

    /**
     * Simplified method form for invoking the SetQueueAttributes operation with an AsyncHandler.
     *
     * @see #setQueueAttributesAsync(SetQueueAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(String queueUrl, java.util.Map<String, String> attributes,
            com.amazonaws.handlers.AsyncHandler<SetQueueAttributesRequest, SetQueueAttributesResult> asyncHandler) {

        return setQueueAttributesAsync(new SetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributes(attributes), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(TagQueueRequest request) {

        return tagQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(final TagQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagQueueRequest, TagQueueResult> asyncHandler) {
        final TagQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagQueueResult>() {
            @Override
            public TagQueueResult call() throws Exception {
                TagQueueResult result = null;

                try {
                    result = executeTagQueue(finalRequest);
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
     * Simplified method form for invoking the TagQueue operation.
     *
     * @see #tagQueueAsync(TagQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(String queueUrl, java.util.Map<String, String> tags) {

        return tagQueueAsync(new TagQueueRequest().withQueueUrl(queueUrl).withTags(tags));
    }

    /**
     * Simplified method form for invoking the TagQueue operation with an AsyncHandler.
     *
     * @see #tagQueueAsync(TagQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(String queueUrl, java.util.Map<String, String> tags,
            com.amazonaws.handlers.AsyncHandler<TagQueueRequest, TagQueueResult> asyncHandler) {

        return tagQueueAsync(new TagQueueRequest().withQueueUrl(queueUrl).withTags(tags), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(UntagQueueRequest request) {

        return untagQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(final UntagQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagQueueRequest, UntagQueueResult> asyncHandler) {
        final UntagQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagQueueResult>() {
            @Override
            public UntagQueueResult call() throws Exception {
                UntagQueueResult result = null;

                try {
                    result = executeUntagQueue(finalRequest);
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
     * Simplified method form for invoking the UntagQueue operation.
     *
     * @see #untagQueueAsync(UntagQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(String queueUrl, java.util.List<String> tagKeys) {

        return untagQueueAsync(new UntagQueueRequest().withQueueUrl(queueUrl).withTagKeys(tagKeys));
    }

    /**
     * Simplified method form for invoking the UntagQueue operation with an AsyncHandler.
     *
     * @see #untagQueueAsync(UntagQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(String queueUrl, java.util.List<String> tagKeys,
            com.amazonaws.handlers.AsyncHandler<UntagQueueRequest, UntagQueueResult> asyncHandler) {

        return untagQueueAsync(new UntagQueueRequest().withQueueUrl(queueUrl).withTagKeys(tagKeys), asyncHandler);
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
