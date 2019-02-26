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
package com.amazonaws.services.stepfunctions;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS SFN asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS Step Functions</fullname>
 * <p>
 * AWS Step Functions is a service that lets you coordinate the components of distributed applications and microservices
 * using visual workflows.
 * </p>
 * <p>
 * You can use Step Functions to build applications from individual components, each of which performs a discrete
 * function, or <i>task</i>, allowing you to scale and change applications quickly. Step Functions provides a console
 * that helps visualize the components of your application as a series of steps. Step Functions automatically triggers
 * and tracks each step, and retries steps when there are errors, so your application executes predictably and in the
 * right order every time. Step Functions logs the state of each step, so you can quickly diagnose and debug any issues.
 * </p>
 * <p>
 * Step Functions manages operations and underlying infrastructure to ensure your application is available at any scale.
 * You can run tasks on AWS, your own servers, or any system that has access to AWS. You can access and use Step
 * Functions using the console, the AWS SDKs, or an HTTP API. For more information about Step Functions, see the <i> <a
 * href="https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html">AWS Step Functions Developer Guide</a> </i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSStepFunctionsAsyncClient extends AWSStepFunctionsClient implements AWSStepFunctionsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN. A credentials provider chain will be
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
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN. A credentials provider chain will be
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
     *        The client configuration options controlling how this client connects to AWS SFN (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the provided AWS account
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
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSStepFunctionsAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSStepFunctionsAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSStepFunctionsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSStepFunctionsAsyncClientBuilder asyncBuilder() {
        return AWSStepFunctionsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSStepFunctionsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateActivityResult> createActivityAsync(CreateActivityRequest request) {

        return createActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActivityResult> createActivityAsync(final CreateActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateActivityRequest, CreateActivityResult> asyncHandler) {
        final CreateActivityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateActivityResult>() {
            @Override
            public CreateActivityResult call() throws Exception {
                CreateActivityResult result = null;

                try {
                    result = executeCreateActivity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(CreateStateMachineRequest request) {

        return createStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(final CreateStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStateMachineRequest, CreateStateMachineResult> asyncHandler) {
        final CreateStateMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStateMachineResult>() {
            @Override
            public CreateStateMachineResult call() throws Exception {
                CreateStateMachineResult result = null;

                try {
                    result = executeCreateStateMachine(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(DeleteActivityRequest request) {

        return deleteActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(final DeleteActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteActivityRequest, DeleteActivityResult> asyncHandler) {
        final DeleteActivityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteActivityResult>() {
            @Override
            public DeleteActivityResult call() throws Exception {
                DeleteActivityResult result = null;

                try {
                    result = executeDeleteActivity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(DeleteStateMachineRequest request) {

        return deleteStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(final DeleteStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStateMachineRequest, DeleteStateMachineResult> asyncHandler) {
        final DeleteStateMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStateMachineResult>() {
            @Override
            public DeleteStateMachineResult call() throws Exception {
                DeleteStateMachineResult result = null;

                try {
                    result = executeDeleteStateMachine(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(DescribeActivityRequest request) {

        return describeActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(final DescribeActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActivityRequest, DescribeActivityResult> asyncHandler) {
        final DescribeActivityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeActivityResult>() {
            @Override
            public DescribeActivityResult call() throws Exception {
                DescribeActivityResult result = null;

                try {
                    result = executeDescribeActivity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request) {

        return describeExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(final DescribeExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler) {
        final DescribeExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExecutionResult>() {
            @Override
            public DescribeExecutionResult call() throws Exception {
                DescribeExecutionResult result = null;

                try {
                    result = executeDescribeExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(DescribeStateMachineRequest request) {

        return describeStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(final DescribeStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStateMachineRequest, DescribeStateMachineResult> asyncHandler) {
        final DescribeStateMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStateMachineResult>() {
            @Override
            public DescribeStateMachineResult call() throws Exception {
                DescribeStateMachineResult result = null;

                try {
                    result = executeDescribeStateMachine(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeStateMachineForExecutionResult> describeStateMachineForExecutionAsync(
            DescribeStateMachineForExecutionRequest request) {

        return describeStateMachineForExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineForExecutionResult> describeStateMachineForExecutionAsync(
            final DescribeStateMachineForExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStateMachineForExecutionRequest, DescribeStateMachineForExecutionResult> asyncHandler) {
        final DescribeStateMachineForExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStateMachineForExecutionResult>() {
            @Override
            public DescribeStateMachineForExecutionResult call() throws Exception {
                DescribeStateMachineForExecutionResult result = null;

                try {
                    result = executeDescribeStateMachineForExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(GetActivityTaskRequest request) {

        return getActivityTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(final GetActivityTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetActivityTaskRequest, GetActivityTaskResult> asyncHandler) {
        final GetActivityTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetActivityTaskResult>() {
            @Override
            public GetActivityTaskResult call() throws Exception {
                GetActivityTaskResult result = null;

                try {
                    result = executeGetActivityTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(GetExecutionHistoryRequest request) {

        return getExecutionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(final GetExecutionHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExecutionHistoryRequest, GetExecutionHistoryResult> asyncHandler) {
        final GetExecutionHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExecutionHistoryResult>() {
            @Override
            public GetExecutionHistoryResult call() throws Exception {
                GetExecutionHistoryResult result = null;

                try {
                    result = executeGetExecutionHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(ListActivitiesRequest request) {

        return listActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(final ListActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActivitiesRequest, ListActivitiesResult> asyncHandler) {
        final ListActivitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListActivitiesResult>() {
            @Override
            public ListActivitiesResult call() throws Exception {
                ListActivitiesResult result = null;

                try {
                    result = executeListActivities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(final ListExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {
        final ListExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExecutionsResult>() {
            @Override
            public ListExecutionsResult call() throws Exception {
                ListExecutionsResult result = null;

                try {
                    result = executeListExecutions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(ListStateMachinesRequest request) {

        return listStateMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(final ListStateMachinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStateMachinesRequest, ListStateMachinesResult> asyncHandler) {
        final ListStateMachinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStateMachinesResult>() {
            @Override
            public ListStateMachinesResult call() throws Exception {
                ListStateMachinesResult result = null;

                try {
                    result = executeListStateMachines(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(SendTaskFailureRequest request) {

        return sendTaskFailureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(final SendTaskFailureRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTaskFailureRequest, SendTaskFailureResult> asyncHandler) {
        final SendTaskFailureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTaskFailureResult>() {
            @Override
            public SendTaskFailureResult call() throws Exception {
                SendTaskFailureResult result = null;

                try {
                    result = executeSendTaskFailure(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(SendTaskHeartbeatRequest request) {

        return sendTaskHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(final SendTaskHeartbeatRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTaskHeartbeatRequest, SendTaskHeartbeatResult> asyncHandler) {
        final SendTaskHeartbeatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTaskHeartbeatResult>() {
            @Override
            public SendTaskHeartbeatResult call() throws Exception {
                SendTaskHeartbeatResult result = null;

                try {
                    result = executeSendTaskHeartbeat(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(SendTaskSuccessRequest request) {

        return sendTaskSuccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(final SendTaskSuccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTaskSuccessRequest, SendTaskSuccessResult> asyncHandler) {
        final SendTaskSuccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendTaskSuccessResult>() {
            @Override
            public SendTaskSuccessResult call() throws Exception {
                SendTaskSuccessResult result = null;

                try {
                    result = executeSendTaskSuccess(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(StartExecutionRequest request) {

        return startExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(final StartExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExecutionRequest, StartExecutionResult> asyncHandler) {
        final StartExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartExecutionResult>() {
            @Override
            public StartExecutionResult call() throws Exception {
                StartExecutionResult result = null;

                try {
                    result = executeStartExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(StopExecutionRequest request) {

        return stopExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(final StopExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopExecutionRequest, StopExecutionResult> asyncHandler) {
        final StopExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopExecutionResult>() {
            @Override
            public StopExecutionResult call() throws Exception {
                StopExecutionResult result = null;

                try {
                    result = executeStopExecution(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<UpdateStateMachineResult> updateStateMachineAsync(UpdateStateMachineRequest request) {

        return updateStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStateMachineResult> updateStateMachineAsync(final UpdateStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStateMachineRequest, UpdateStateMachineResult> asyncHandler) {
        final UpdateStateMachineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStateMachineResult>() {
            @Override
            public UpdateStateMachineResult call() throws Exception {
                UpdateStateMachineResult result = null;

                try {
                    result = executeUpdateStateMachine(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
