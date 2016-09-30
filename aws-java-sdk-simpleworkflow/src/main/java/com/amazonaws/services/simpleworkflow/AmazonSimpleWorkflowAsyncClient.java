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
package com.amazonaws.services.simpleworkflow;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon SWF asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Simple Workflow Service</fullname>
 * <p>
 * The Amazon Simple Workflow Service (Amazon SWF) makes it easy to build applications that use Amazon's cloud to
 * coordinate work across distributed components. In Amazon SWF, a <i>task</i> represents a logical unit of work that is
 * performed by a component of your workflow. Coordinating tasks in a workflow involves managing intertask dependencies,
 * scheduling, and concurrency in accordance with the logical flow of the application.
 * </p>
 * <p>
 * Amazon SWF gives you full control over implementing tasks and coordinating them without worrying about underlying
 * complexities such as tracking their progress and maintaining their state.
 * </p>
 * <p>
 * This documentation serves as reference only. For a broader overview of the Amazon SWF programming model, see the <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/">Amazon SWF Developer Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonSimpleWorkflowAsyncClient extends AmazonSimpleWorkflowClient implements AmazonSimpleWorkflowAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF. A credentials provider chain will
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
     */
    public AmazonSimpleWorkflowAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon SWF (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the provided AWS account
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
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonSimpleWorkflowAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SWF using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSimpleWorkflowAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(CountClosedWorkflowExecutionsRequest request) {

        return countClosedWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(final CountClosedWorkflowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CountClosedWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowExecutionCount>() {
            @Override
            public WorkflowExecutionCount call() throws Exception {
                WorkflowExecutionCount result;

                try {
                    result = countClosedWorkflowExecutions(request);
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
    public java.util.concurrent.Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(CountOpenWorkflowExecutionsRequest request) {

        return countOpenWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(final CountOpenWorkflowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CountOpenWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowExecutionCount>() {
            @Override
            public WorkflowExecutionCount call() throws Exception {
                WorkflowExecutionCount result;

                try {
                    result = countOpenWorkflowExecutions(request);
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
    public java.util.concurrent.Future<PendingTaskCount> countPendingActivityTasksAsync(CountPendingActivityTasksRequest request) {

        return countPendingActivityTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PendingTaskCount> countPendingActivityTasksAsync(final CountPendingActivityTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<CountPendingActivityTasksRequest, PendingTaskCount> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PendingTaskCount>() {
            @Override
            public PendingTaskCount call() throws Exception {
                PendingTaskCount result;

                try {
                    result = countPendingActivityTasks(request);
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
    public java.util.concurrent.Future<PendingTaskCount> countPendingDecisionTasksAsync(CountPendingDecisionTasksRequest request) {

        return countPendingDecisionTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PendingTaskCount> countPendingDecisionTasksAsync(final CountPendingDecisionTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<CountPendingDecisionTasksRequest, PendingTaskCount> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PendingTaskCount>() {
            @Override
            public PendingTaskCount call() throws Exception {
                PendingTaskCount result;

                try {
                    result = countPendingDecisionTasks(request);
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
    public java.util.concurrent.Future<Void> deprecateActivityTypeAsync(DeprecateActivityTypeRequest request) {

        return deprecateActivityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateActivityTypeAsync(final DeprecateActivityTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprecateActivityTypeRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    deprecateActivityType(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> deprecateDomainAsync(DeprecateDomainRequest request) {

        return deprecateDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateDomainAsync(final DeprecateDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprecateDomainRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    deprecateDomain(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> deprecateWorkflowTypeAsync(DeprecateWorkflowTypeRequest request) {

        return deprecateWorkflowTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deprecateWorkflowTypeAsync(final DeprecateWorkflowTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprecateWorkflowTypeRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    deprecateWorkflowType(request);
                    result = null;
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
    public java.util.concurrent.Future<ActivityTypeDetail> describeActivityTypeAsync(DescribeActivityTypeRequest request) {

        return describeActivityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTypeDetail> describeActivityTypeAsync(final DescribeActivityTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActivityTypeRequest, ActivityTypeDetail> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ActivityTypeDetail>() {
            @Override
            public ActivityTypeDetail call() throws Exception {
                ActivityTypeDetail result;

                try {
                    result = describeActivityType(request);
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
    public java.util.concurrent.Future<DomainDetail> describeDomainAsync(DescribeDomainRequest request) {

        return describeDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DomainDetail> describeDomainAsync(final DescribeDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DomainDetail> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DomainDetail>() {
            @Override
            public DomainDetail call() throws Exception {
                DomainDetail result;

                try {
                    result = describeDomain(request);
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
    public java.util.concurrent.Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(DescribeWorkflowExecutionRequest request) {

        return describeWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(final DescribeWorkflowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkflowExecutionRequest, WorkflowExecutionDetail> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowExecutionDetail>() {
            @Override
            public WorkflowExecutionDetail call() throws Exception {
                WorkflowExecutionDetail result;

                try {
                    result = describeWorkflowExecution(request);
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
    public java.util.concurrent.Future<WorkflowTypeDetail> describeWorkflowTypeAsync(DescribeWorkflowTypeRequest request) {

        return describeWorkflowTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowTypeDetail> describeWorkflowTypeAsync(final DescribeWorkflowTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeWorkflowTypeRequest, WorkflowTypeDetail> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowTypeDetail>() {
            @Override
            public WorkflowTypeDetail call() throws Exception {
                WorkflowTypeDetail result;

                try {
                    result = describeWorkflowType(request);
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
    public java.util.concurrent.Future<History> getWorkflowExecutionHistoryAsync(GetWorkflowExecutionHistoryRequest request) {

        return getWorkflowExecutionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<History> getWorkflowExecutionHistoryAsync(final GetWorkflowExecutionHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkflowExecutionHistoryRequest, History> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<History>() {
            @Override
            public History call() throws Exception {
                History result;

                try {
                    result = getWorkflowExecutionHistory(request);
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
    public java.util.concurrent.Future<ActivityTypeInfos> listActivityTypesAsync(ListActivityTypesRequest request) {

        return listActivityTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTypeInfos> listActivityTypesAsync(final ListActivityTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActivityTypesRequest, ActivityTypeInfos> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ActivityTypeInfos>() {
            @Override
            public ActivityTypeInfos call() throws Exception {
                ActivityTypeInfos result;

                try {
                    result = listActivityTypes(request);
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
    public java.util.concurrent.Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(ListClosedWorkflowExecutionsRequest request) {

        return listClosedWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(final ListClosedWorkflowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClosedWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowExecutionInfos>() {
            @Override
            public WorkflowExecutionInfos call() throws Exception {
                WorkflowExecutionInfos result;

                try {
                    result = listClosedWorkflowExecutions(request);
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
    public java.util.concurrent.Future<DomainInfos> listDomainsAsync(ListDomainsRequest request) {

        return listDomainsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DomainInfos> listDomainsAsync(final ListDomainsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, DomainInfos> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DomainInfos>() {
            @Override
            public DomainInfos call() throws Exception {
                DomainInfos result;

                try {
                    result = listDomains(request);
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
    public java.util.concurrent.Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(ListOpenWorkflowExecutionsRequest request) {

        return listOpenWorkflowExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(final ListOpenWorkflowExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOpenWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowExecutionInfos>() {
            @Override
            public WorkflowExecutionInfos call() throws Exception {
                WorkflowExecutionInfos result;

                try {
                    result = listOpenWorkflowExecutions(request);
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
    public java.util.concurrent.Future<WorkflowTypeInfos> listWorkflowTypesAsync(ListWorkflowTypesRequest request) {

        return listWorkflowTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WorkflowTypeInfos> listWorkflowTypesAsync(final ListWorkflowTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkflowTypesRequest, WorkflowTypeInfos> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<WorkflowTypeInfos>() {
            @Override
            public WorkflowTypeInfos call() throws Exception {
                WorkflowTypeInfos result;

                try {
                    result = listWorkflowTypes(request);
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
    public java.util.concurrent.Future<ActivityTask> pollForActivityTaskAsync(PollForActivityTaskRequest request) {

        return pollForActivityTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTask> pollForActivityTaskAsync(final PollForActivityTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<PollForActivityTaskRequest, ActivityTask> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ActivityTask>() {
            @Override
            public ActivityTask call() throws Exception {
                ActivityTask result;

                try {
                    result = pollForActivityTask(request);
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
    public java.util.concurrent.Future<DecisionTask> pollForDecisionTaskAsync(PollForDecisionTaskRequest request) {

        return pollForDecisionTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecisionTask> pollForDecisionTaskAsync(final PollForDecisionTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<PollForDecisionTaskRequest, DecisionTask> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DecisionTask>() {
            @Override
            public DecisionTask call() throws Exception {
                DecisionTask result;

                try {
                    result = pollForDecisionTask(request);
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
    public java.util.concurrent.Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(RecordActivityTaskHeartbeatRequest request) {

        return recordActivityTaskHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(final RecordActivityTaskHeartbeatRequest request,
            final com.amazonaws.handlers.AsyncHandler<RecordActivityTaskHeartbeatRequest, ActivityTaskStatus> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ActivityTaskStatus>() {
            @Override
            public ActivityTaskStatus call() throws Exception {
                ActivityTaskStatus result;

                try {
                    result = recordActivityTaskHeartbeat(request);
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
    public java.util.concurrent.Future<Void> registerActivityTypeAsync(RegisterActivityTypeRequest request) {

        return registerActivityTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerActivityTypeAsync(final RegisterActivityTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterActivityTypeRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    registerActivityType(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> registerDomainAsync(RegisterDomainRequest request) {

        return registerDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerDomainAsync(final RegisterDomainRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterDomainRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    registerDomain(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> registerWorkflowTypeAsync(RegisterWorkflowTypeRequest request) {

        return registerWorkflowTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerWorkflowTypeAsync(final RegisterWorkflowTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterWorkflowTypeRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    registerWorkflowType(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> requestCancelWorkflowExecutionAsync(RequestCancelWorkflowExecutionRequest request) {

        return requestCancelWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> requestCancelWorkflowExecutionAsync(final RequestCancelWorkflowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestCancelWorkflowExecutionRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    requestCancelWorkflowExecution(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> respondActivityTaskCanceledAsync(RespondActivityTaskCanceledRequest request) {

        return respondActivityTaskCanceledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskCanceledAsync(final RespondActivityTaskCanceledRequest request,
            final com.amazonaws.handlers.AsyncHandler<RespondActivityTaskCanceledRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    respondActivityTaskCanceled(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> respondActivityTaskCompletedAsync(RespondActivityTaskCompletedRequest request) {

        return respondActivityTaskCompletedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskCompletedAsync(final RespondActivityTaskCompletedRequest request,
            final com.amazonaws.handlers.AsyncHandler<RespondActivityTaskCompletedRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    respondActivityTaskCompleted(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> respondActivityTaskFailedAsync(RespondActivityTaskFailedRequest request) {

        return respondActivityTaskFailedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondActivityTaskFailedAsync(final RespondActivityTaskFailedRequest request,
            final com.amazonaws.handlers.AsyncHandler<RespondActivityTaskFailedRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    respondActivityTaskFailed(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> respondDecisionTaskCompletedAsync(RespondDecisionTaskCompletedRequest request) {

        return respondDecisionTaskCompletedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> respondDecisionTaskCompletedAsync(final RespondDecisionTaskCompletedRequest request,
            final com.amazonaws.handlers.AsyncHandler<RespondDecisionTaskCompletedRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    respondDecisionTaskCompleted(request);
                    result = null;
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
    public java.util.concurrent.Future<Void> signalWorkflowExecutionAsync(SignalWorkflowExecutionRequest request) {

        return signalWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> signalWorkflowExecutionAsync(final SignalWorkflowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SignalWorkflowExecutionRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    signalWorkflowExecution(request);
                    result = null;
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
    public java.util.concurrent.Future<Run> startWorkflowExecutionAsync(StartWorkflowExecutionRequest request) {

        return startWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Run> startWorkflowExecutionAsync(final StartWorkflowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartWorkflowExecutionRequest, Run> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Run>() {
            @Override
            public Run call() throws Exception {
                Run result;

                try {
                    result = startWorkflowExecution(request);
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
    public java.util.concurrent.Future<Void> terminateWorkflowExecutionAsync(TerminateWorkflowExecutionRequest request) {

        return terminateWorkflowExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> terminateWorkflowExecutionAsync(final TerminateWorkflowExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<TerminateWorkflowExecutionRequest, Void> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Void result;

                try {
                    terminateWorkflowExecution(request);
                    result = null;
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
