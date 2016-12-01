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
package com.amazonaws.services.stepfunctions;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing AWS SFN asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <fullname>AWS Step Functions</fullname>
 * <p>
 * AWS Step Functions is a web service that enables you to coordinate the components of distributed applications and
 * microservices using visual workflows. You build applications from individual components that each perform a discrete
 * function, or <i>task</i>, allowing you to scale and change applications quickly. Step Functions provides a graphical
 * console to visualize the components of your application as a series of steps. It automatically triggers and tracks
 * each step, and retries when there are errors, so your application executes in order and as expected, every time. Step
 * Functions logs the state of each step, so when things do go wrong, you can diagnose and debug problems quickly.
 * </p>
 * <p>
 * Step Functions manages the operations and underlying infrastructure for you to ensure your application is available
 * at any scale. You can run tasks on the AWS cloud, on your own servers, or an any system that has access to AWS. Step
 * Functions can be accessed and used with the Step Functions console, the AWS SDKs (included with your Beta release
 * invitation email), or an HTTP API (the subject of this document).
 * </p>
 */
@ThreadSafe
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
     */
    public AWSStepFunctionsAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SFN using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSStepFunctionsAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateActivityResult> createActivityAsync(CreateActivityRequest request) {

        return createActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActivityResult> createActivityAsync(final CreateActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateActivityRequest, CreateActivityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateActivityResult>() {
            @Override
            public CreateActivityResult call() throws Exception {
                CreateActivityResult result;

                try {
                    result = createActivity(request);
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
    public java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(CreateStateMachineRequest request) {

        return createStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStateMachineResult> createStateMachineAsync(final CreateStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStateMachineRequest, CreateStateMachineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateStateMachineResult>() {
            @Override
            public CreateStateMachineResult call() throws Exception {
                CreateStateMachineResult result;

                try {
                    result = createStateMachine(request);
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
    public java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(DeleteActivityRequest request) {

        return deleteActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActivityResult> deleteActivityAsync(final DeleteActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteActivityRequest, DeleteActivityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteActivityResult>() {
            @Override
            public DeleteActivityResult call() throws Exception {
                DeleteActivityResult result;

                try {
                    result = deleteActivity(request);
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
    public java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(DeleteStateMachineRequest request) {

        return deleteStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStateMachineResult> deleteStateMachineAsync(final DeleteStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStateMachineRequest, DeleteStateMachineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteStateMachineResult>() {
            @Override
            public DeleteStateMachineResult call() throws Exception {
                DeleteStateMachineResult result;

                try {
                    result = deleteStateMachine(request);
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
    public java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(DescribeActivityRequest request) {

        return describeActivityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActivityResult> describeActivityAsync(final DescribeActivityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActivityRequest, DescribeActivityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeActivityResult>() {
            @Override
            public DescribeActivityResult call() throws Exception {
                DescribeActivityResult result;

                try {
                    result = describeActivity(request);
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
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(DescribeExecutionRequest request) {

        return describeExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExecutionResult> describeExecutionAsync(final DescribeExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExecutionRequest, DescribeExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeExecutionResult>() {
            @Override
            public DescribeExecutionResult call() throws Exception {
                DescribeExecutionResult result;

                try {
                    result = describeExecution(request);
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
    public java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(DescribeStateMachineRequest request) {

        return describeStateMachineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStateMachineResult> describeStateMachineAsync(final DescribeStateMachineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStateMachineRequest, DescribeStateMachineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeStateMachineResult>() {
            @Override
            public DescribeStateMachineResult call() throws Exception {
                DescribeStateMachineResult result;

                try {
                    result = describeStateMachine(request);
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
    public java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(GetActivityTaskRequest request) {

        return getActivityTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetActivityTaskResult> getActivityTaskAsync(final GetActivityTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetActivityTaskRequest, GetActivityTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetActivityTaskResult>() {
            @Override
            public GetActivityTaskResult call() throws Exception {
                GetActivityTaskResult result;

                try {
                    result = getActivityTask(request);
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
    public java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(GetExecutionHistoryRequest request) {

        return getExecutionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionHistoryResult> getExecutionHistoryAsync(final GetExecutionHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExecutionHistoryRequest, GetExecutionHistoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetExecutionHistoryResult>() {
            @Override
            public GetExecutionHistoryResult call() throws Exception {
                GetExecutionHistoryResult result;

                try {
                    result = getExecutionHistory(request);
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
    public java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(ListActivitiesRequest request) {

        return listActivitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActivitiesResult> listActivitiesAsync(final ListActivitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActivitiesRequest, ListActivitiesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListActivitiesResult>() {
            @Override
            public ListActivitiesResult call() throws Exception {
                ListActivitiesResult result;

                try {
                    result = listActivities(request);
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
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest request) {

        return listExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(final ListExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListExecutionsResult>() {
            @Override
            public ListExecutionsResult call() throws Exception {
                ListExecutionsResult result;

                try {
                    result = listExecutions(request);
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
    public java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(ListStateMachinesRequest request) {

        return listStateMachinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStateMachinesResult> listStateMachinesAsync(final ListStateMachinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStateMachinesRequest, ListStateMachinesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListStateMachinesResult>() {
            @Override
            public ListStateMachinesResult call() throws Exception {
                ListStateMachinesResult result;

                try {
                    result = listStateMachines(request);
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
    public java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(SendTaskFailureRequest request) {

        return sendTaskFailureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskFailureResult> sendTaskFailureAsync(final SendTaskFailureRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTaskFailureRequest, SendTaskFailureResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendTaskFailureResult>() {
            @Override
            public SendTaskFailureResult call() throws Exception {
                SendTaskFailureResult result;

                try {
                    result = sendTaskFailure(request);
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
    public java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(SendTaskHeartbeatRequest request) {

        return sendTaskHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskHeartbeatResult> sendTaskHeartbeatAsync(final SendTaskHeartbeatRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTaskHeartbeatRequest, SendTaskHeartbeatResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendTaskHeartbeatResult>() {
            @Override
            public SendTaskHeartbeatResult call() throws Exception {
                SendTaskHeartbeatResult result;

                try {
                    result = sendTaskHeartbeat(request);
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
    public java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(SendTaskSuccessRequest request) {

        return sendTaskSuccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTaskSuccessResult> sendTaskSuccessAsync(final SendTaskSuccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendTaskSuccessRequest, SendTaskSuccessResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SendTaskSuccessResult>() {
            @Override
            public SendTaskSuccessResult call() throws Exception {
                SendTaskSuccessResult result;

                try {
                    result = sendTaskSuccess(request);
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
    public java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(StartExecutionRequest request) {

        return startExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExecutionResult> startExecutionAsync(final StartExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExecutionRequest, StartExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartExecutionResult>() {
            @Override
            public StartExecutionResult call() throws Exception {
                StartExecutionResult result;

                try {
                    result = startExecution(request);
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
    public java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(StopExecutionRequest request) {

        return stopExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopExecutionResult> stopExecutionAsync(final StopExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopExecutionRequest, StopExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopExecutionResult>() {
            @Override
            public StopExecutionResult call() throws Exception {
                StopExecutionResult result;

                try {
                    result = stopExecution(request);
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
