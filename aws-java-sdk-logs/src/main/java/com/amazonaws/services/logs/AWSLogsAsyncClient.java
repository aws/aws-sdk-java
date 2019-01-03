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
package com.amazonaws.services.logs;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon CloudWatch Logs asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from Amazon EC2 instances, AWS
 * CloudTrail, or other sources. You can then retrieve the associated log data from CloudWatch Logs using the CloudWatch
 * console, CloudWatch Logs commands in the AWS CLI, CloudWatch Logs API, or CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor logs from EC2 instances in real-time</b>: You can use CloudWatch Logs to monitor applications and systems
 * using log data. For example, CloudWatch Logs can track the number of errors that occur in your application logs and
 * send you a notification whenever the rate of errors exceeds a threshold that you specify. CloudWatch Logs uses your
 * log data for monitoring; so, no code changes are required. For example, you can monitor application logs for specific
 * literal terms (such as "NullReferenceException") or count the number of occurrences of a literal term at a particular
 * position in log data (such as "404" status codes in an Apache access log). When the term you are searching for is
 * found, CloudWatch Logs reports the data to a CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor AWS CloudTrail logged events</b>: You can create alarms in CloudWatch and receive notifications of
 * particular API activity as captured by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive log data</b>: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
 * the log retention setting so that any log events older than this setting are automatically deleted. The CloudWatch
 * Logs agent makes it easy to quickly send both rotated and non-rotated log data off of a host and into the log
 * service. You can then access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLogsAsyncClient extends AWSLogsClient implements AWSLogsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs. A credentials provider
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
     * @deprecated use {@link AWSLogsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSLogsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs. A credentials provider
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
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Logs (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLogsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLogsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the provided AWS
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
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSLogsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLogsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSLogsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSLogsAsyncClientBuilder asyncBuilder() {
        return AWSLogsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Logs using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSLogsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateKmsKeyResult> associateKmsKeyAsync(AssociateKmsKeyRequest request) {

        return associateKmsKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateKmsKeyResult> associateKmsKeyAsync(final AssociateKmsKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateKmsKeyRequest, AssociateKmsKeyResult> asyncHandler) {
        final AssociateKmsKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateKmsKeyResult>() {
            @Override
            public AssociateKmsKeyResult call() throws Exception {
                AssociateKmsKeyResult result = null;

                try {
                    result = executeAssociateKmsKey(finalRequest);
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
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(CancelExportTaskRequest request) {

        return cancelExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelExportTaskResult> cancelExportTaskAsync(final CancelExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, CancelExportTaskResult> asyncHandler) {
        final CancelExportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelExportTaskResult>() {
            @Override
            public CancelExportTaskResult call() throws Exception {
                CancelExportTaskResult result = null;

                try {
                    result = executeCancelExportTask(finalRequest);
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
    public java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(CreateExportTaskRequest request) {

        return createExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(final CreateExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExportTaskRequest, CreateExportTaskResult> asyncHandler) {
        final CreateExportTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExportTaskResult>() {
            @Override
            public CreateExportTaskResult call() throws Exception {
                CreateExportTaskResult result = null;

                try {
                    result = executeCreateExportTask(finalRequest);
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
    public java.util.concurrent.Future<CreateLogGroupResult> createLogGroupAsync(CreateLogGroupRequest request) {

        return createLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogGroupResult> createLogGroupAsync(final CreateLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLogGroupRequest, CreateLogGroupResult> asyncHandler) {
        final CreateLogGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLogGroupResult>() {
            @Override
            public CreateLogGroupResult call() throws Exception {
                CreateLogGroupResult result = null;

                try {
                    result = executeCreateLogGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateLogStreamResult> createLogStreamAsync(CreateLogStreamRequest request) {

        return createLogStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLogStreamResult> createLogStreamAsync(final CreateLogStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLogStreamRequest, CreateLogStreamResult> asyncHandler) {
        final CreateLogStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLogStreamResult>() {
            @Override
            public CreateLogStreamResult call() throws Exception {
                CreateLogStreamResult result = null;

                try {
                    result = executeCreateLogStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(DeleteDestinationRequest request) {

        return deleteDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDestinationResult> deleteDestinationAsync(final DeleteDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, DeleteDestinationResult> asyncHandler) {
        final DeleteDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDestinationResult>() {
            @Override
            public DeleteDestinationResult call() throws Exception {
                DeleteDestinationResult result = null;

                try {
                    result = executeDeleteDestination(finalRequest);
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
    public java.util.concurrent.Future<DeleteLogGroupResult> deleteLogGroupAsync(DeleteLogGroupRequest request) {

        return deleteLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogGroupResult> deleteLogGroupAsync(final DeleteLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLogGroupRequest, DeleteLogGroupResult> asyncHandler) {
        final DeleteLogGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLogGroupResult>() {
            @Override
            public DeleteLogGroupResult call() throws Exception {
                DeleteLogGroupResult result = null;

                try {
                    result = executeDeleteLogGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteLogStreamResult> deleteLogStreamAsync(DeleteLogStreamRequest request) {

        return deleteLogStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLogStreamResult> deleteLogStreamAsync(final DeleteLogStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLogStreamRequest, DeleteLogStreamResult> asyncHandler) {
        final DeleteLogStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLogStreamResult>() {
            @Override
            public DeleteLogStreamResult call() throws Exception {
                DeleteLogStreamResult result = null;

                try {
                    result = executeDeleteLogStream(finalRequest);
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
    public java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(DeleteMetricFilterRequest request) {

        return deleteMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricFilterResult> deleteMetricFilterAsync(final DeleteMetricFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMetricFilterRequest, DeleteMetricFilterResult> asyncHandler) {
        final DeleteMetricFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMetricFilterResult>() {
            @Override
            public DeleteMetricFilterResult call() throws Exception {
                DeleteMetricFilterResult result = null;

                try {
                    result = executeDeleteMetricFilter(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(DeleteRetentionPolicyRequest request) {

        return deleteRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionPolicyResult> deleteRetentionPolicyAsync(final DeleteRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, DeleteRetentionPolicyResult> asyncHandler) {
        final DeleteRetentionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRetentionPolicyResult>() {
            @Override
            public DeleteRetentionPolicyResult call() throws Exception {
                DeleteRetentionPolicyResult result = null;

                try {
                    result = executeDeleteRetentionPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteSubscriptionFilterResult> deleteSubscriptionFilterAsync(DeleteSubscriptionFilterRequest request) {

        return deleteSubscriptionFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubscriptionFilterResult> deleteSubscriptionFilterAsync(final DeleteSubscriptionFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionFilterRequest, DeleteSubscriptionFilterResult> asyncHandler) {
        final DeleteSubscriptionFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSubscriptionFilterResult>() {
            @Override
            public DeleteSubscriptionFilterResult call() throws Exception {
                DeleteSubscriptionFilterResult result = null;

                try {
                    result = executeDeleteSubscriptionFilter(finalRequest);
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
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(DescribeDestinationsRequest request) {

        return describeDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(final DescribeDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler) {
        final DescribeDestinationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDestinationsResult>() {
            @Override
            public DescribeDestinationsResult call() throws Exception {
                DescribeDestinationsResult result = null;

                try {
                    result = executeDescribeDestinations(finalRequest);
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
     * Simplified method form for invoking the DescribeDestinations operation.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync() {

        return describeDestinationsAsync(new DescribeDestinationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDestinations operation with an AsyncHandler.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler) {

        return describeDestinationsAsync(new DescribeDestinationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(final DescribeExportTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {
        final DescribeExportTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExportTasksResult>() {
            @Override
            public DescribeExportTasksResult call() throws Exception {
                DescribeExportTasksResult result = null;

                try {
                    result = executeDescribeExportTasks(finalRequest);
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
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(DescribeLogGroupsRequest request) {

        return describeLogGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(final DescribeLogGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler) {
        final DescribeLogGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLogGroupsResult>() {
            @Override
            public DescribeLogGroupsResult call() throws Exception {
                DescribeLogGroupsResult result = null;

                try {
                    result = executeDescribeLogGroups(finalRequest);
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
     * Simplified method form for invoking the DescribeLogGroups operation.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync() {

        return describeLogGroupsAsync(new DescribeLogGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLogGroups operation with an AsyncHandler.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler) {

        return describeLogGroupsAsync(new DescribeLogGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(DescribeLogStreamsRequest request) {

        return describeLogStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(final DescribeLogStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLogStreamsRequest, DescribeLogStreamsResult> asyncHandler) {
        final DescribeLogStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLogStreamsResult>() {
            @Override
            public DescribeLogStreamsResult call() throws Exception {
                DescribeLogStreamsResult result = null;

                try {
                    result = executeDescribeLogStreams(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(DescribeMetricFiltersRequest request) {

        return describeMetricFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(final DescribeMetricFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler) {
        final DescribeMetricFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetricFiltersResult>() {
            @Override
            public DescribeMetricFiltersResult call() throws Exception {
                DescribeMetricFiltersResult result = null;

                try {
                    result = executeDescribeMetricFilters(finalRequest);
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
    public java.util.concurrent.Future<DescribeQueriesResult> describeQueriesAsync(DescribeQueriesRequest request) {

        return describeQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueriesResult> describeQueriesAsync(final DescribeQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQueriesRequest, DescribeQueriesResult> asyncHandler) {
        final DescribeQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQueriesResult>() {
            @Override
            public DescribeQueriesResult call() throws Exception {
                DescribeQueriesResult result = null;

                try {
                    result = executeDescribeQueries(finalRequest);
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
    public java.util.concurrent.Future<DescribeResourcePoliciesResult> describeResourcePoliciesAsync(DescribeResourcePoliciesRequest request) {

        return describeResourcePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourcePoliciesResult> describeResourcePoliciesAsync(final DescribeResourcePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResourcePoliciesRequest, DescribeResourcePoliciesResult> asyncHandler) {
        final DescribeResourcePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResourcePoliciesResult>() {
            @Override
            public DescribeResourcePoliciesResult call() throws Exception {
                DescribeResourcePoliciesResult result = null;

                try {
                    result = executeDescribeResourcePolicies(finalRequest);
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
    public java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(DescribeSubscriptionFiltersRequest request) {

        return describeSubscriptionFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(final DescribeSubscriptionFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResult> asyncHandler) {
        final DescribeSubscriptionFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSubscriptionFiltersResult>() {
            @Override
            public DescribeSubscriptionFiltersResult call() throws Exception {
                DescribeSubscriptionFiltersResult result = null;

                try {
                    result = executeDescribeSubscriptionFilters(finalRequest);
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
    public java.util.concurrent.Future<DisassociateKmsKeyResult> disassociateKmsKeyAsync(DisassociateKmsKeyRequest request) {

        return disassociateKmsKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateKmsKeyResult> disassociateKmsKeyAsync(final DisassociateKmsKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateKmsKeyRequest, DisassociateKmsKeyResult> asyncHandler) {
        final DisassociateKmsKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateKmsKeyResult>() {
            @Override
            public DisassociateKmsKeyResult call() throws Exception {
                DisassociateKmsKeyResult result = null;

                try {
                    result = executeDisassociateKmsKey(finalRequest);
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
    public java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(FilterLogEventsRequest request) {

        return filterLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(final FilterLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<FilterLogEventsRequest, FilterLogEventsResult> asyncHandler) {
        final FilterLogEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<FilterLogEventsResult>() {
            @Override
            public FilterLogEventsResult call() throws Exception {
                FilterLogEventsResult result = null;

                try {
                    result = executeFilterLogEvents(finalRequest);
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
    public java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(GetLogEventsRequest request) {

        return getLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(final GetLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler) {
        final GetLogEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLogEventsResult>() {
            @Override
            public GetLogEventsResult call() throws Exception {
                GetLogEventsResult result = null;

                try {
                    result = executeGetLogEvents(finalRequest);
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
    public java.util.concurrent.Future<GetLogGroupFieldsResult> getLogGroupFieldsAsync(GetLogGroupFieldsRequest request) {

        return getLogGroupFieldsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogGroupFieldsResult> getLogGroupFieldsAsync(final GetLogGroupFieldsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLogGroupFieldsRequest, GetLogGroupFieldsResult> asyncHandler) {
        final GetLogGroupFieldsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLogGroupFieldsResult>() {
            @Override
            public GetLogGroupFieldsResult call() throws Exception {
                GetLogGroupFieldsResult result = null;

                try {
                    result = executeGetLogGroupFields(finalRequest);
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
    public java.util.concurrent.Future<GetLogRecordResult> getLogRecordAsync(GetLogRecordRequest request) {

        return getLogRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogRecordResult> getLogRecordAsync(final GetLogRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLogRecordRequest, GetLogRecordResult> asyncHandler) {
        final GetLogRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLogRecordResult>() {
            @Override
            public GetLogRecordResult call() throws Exception {
                GetLogRecordResult result = null;

                try {
                    result = executeGetLogRecord(finalRequest);
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
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(final GetQueryResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {
        final GetQueryResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueryResultsResult>() {
            @Override
            public GetQueryResultsResult call() throws Exception {
                GetQueryResultsResult result = null;

                try {
                    result = executeGetQueryResults(finalRequest);
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
    public java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(ListTagsLogGroupRequest request) {

        return listTagsLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsLogGroupResult> listTagsLogGroupAsync(final ListTagsLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsLogGroupRequest, ListTagsLogGroupResult> asyncHandler) {
        final ListTagsLogGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsLogGroupResult>() {
            @Override
            public ListTagsLogGroupResult call() throws Exception {
                ListTagsLogGroupResult result = null;

                try {
                    result = executeListTagsLogGroup(finalRequest);
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
    public java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(PutDestinationRequest request) {

        return putDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(final PutDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDestinationRequest, PutDestinationResult> asyncHandler) {
        final PutDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDestinationResult>() {
            @Override
            public PutDestinationResult call() throws Exception {
                PutDestinationResult result = null;

                try {
                    result = executePutDestination(finalRequest);
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
    public java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(PutDestinationPolicyRequest request) {

        return putDestinationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDestinationPolicyResult> putDestinationPolicyAsync(final PutDestinationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDestinationPolicyRequest, PutDestinationPolicyResult> asyncHandler) {
        final PutDestinationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutDestinationPolicyResult>() {
            @Override
            public PutDestinationPolicyResult call() throws Exception {
                PutDestinationPolicyResult result = null;

                try {
                    result = executePutDestinationPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(PutLogEventsRequest request) {

        return putLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(final PutLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLogEventsRequest, PutLogEventsResult> asyncHandler) {
        final PutLogEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLogEventsResult>() {
            @Override
            public PutLogEventsResult call() throws Exception {
                PutLogEventsResult result = null;

                try {
                    result = executePutLogEvents(finalRequest);
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
    public java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(PutMetricFilterRequest request) {

        return putMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetricFilterResult> putMetricFilterAsync(final PutMetricFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetricFilterRequest, PutMetricFilterResult> asyncHandler) {
        final PutMetricFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMetricFilterResult>() {
            @Override
            public PutMetricFilterResult call() throws Exception {
                PutMetricFilterResult result = null;

                try {
                    result = executePutMetricFilter(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(PutRetentionPolicyRequest request) {

        return putRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRetentionPolicyResult> putRetentionPolicyAsync(final PutRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, PutRetentionPolicyResult> asyncHandler) {
        final PutRetentionPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRetentionPolicyResult>() {
            @Override
            public PutRetentionPolicyResult call() throws Exception {
                PutRetentionPolicyResult result = null;

                try {
                    result = executePutRetentionPolicy(finalRequest);
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
    public java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(PutSubscriptionFilterRequest request) {

        return putSubscriptionFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSubscriptionFilterResult> putSubscriptionFilterAsync(final PutSubscriptionFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSubscriptionFilterRequest, PutSubscriptionFilterResult> asyncHandler) {
        final PutSubscriptionFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSubscriptionFilterResult>() {
            @Override
            public PutSubscriptionFilterResult call() throws Exception {
                PutSubscriptionFilterResult result = null;

                try {
                    result = executePutSubscriptionFilter(finalRequest);
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
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request) {

        return startQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(final StartQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler) {
        final StartQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartQueryResult>() {
            @Override
            public StartQueryResult call() throws Exception {
                StartQueryResult result = null;

                try {
                    result = executeStartQuery(finalRequest);
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
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest request) {

        return stopQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopQueryResult> stopQueryAsync(final StopQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopQueryRequest, StopQueryResult> asyncHandler) {
        final StopQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopQueryResult>() {
            @Override
            public StopQueryResult call() throws Exception {
                StopQueryResult result = null;

                try {
                    result = executeStopQuery(finalRequest);
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
    public java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(TagLogGroupRequest request) {

        return tagLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagLogGroupResult> tagLogGroupAsync(final TagLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagLogGroupRequest, TagLogGroupResult> asyncHandler) {
        final TagLogGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagLogGroupResult>() {
            @Override
            public TagLogGroupResult call() throws Exception {
                TagLogGroupResult result = null;

                try {
                    result = executeTagLogGroup(finalRequest);
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
    public java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(TestMetricFilterRequest request) {

        return testMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(final TestMetricFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler) {
        final TestMetricFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestMetricFilterResult>() {
            @Override
            public TestMetricFilterResult call() throws Exception {
                TestMetricFilterResult result = null;

                try {
                    result = executeTestMetricFilter(finalRequest);
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
    public java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(UntagLogGroupRequest request) {

        return untagLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagLogGroupResult> untagLogGroupAsync(final UntagLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagLogGroupRequest, UntagLogGroupResult> asyncHandler) {
        final UntagLogGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagLogGroupResult>() {
            @Override
            public UntagLogGroupResult call() throws Exception {
                UntagLogGroupResult result = null;

                try {
                    result = executeUntagLogGroup(finalRequest);
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
