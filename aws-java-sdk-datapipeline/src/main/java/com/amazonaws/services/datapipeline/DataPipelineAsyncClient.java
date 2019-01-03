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
package com.amazonaws.services.datapipeline;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Data Pipeline asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Data Pipeline configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the
 * details of scheduling and ensuring that data dependencies are met so that your application can focus on processing
 * the data.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data
 * Pipeline Task Runner provides logic for common data management scenarios, such as performing database queries and
 * running data analysis using Amazon Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task Runner as your
 * task runner, or you can write your own task runner to provide custom data management.
 * </p>
 * <p>
 * AWS Data Pipeline implements two main sets of functionality. Use the first set to create a pipeline and define data
 * sources, schedules, dependencies, and the transforms to be performed on the data. Use the second set in your task
 * runner application to receive the next task ready for processing. The logic for performing the task, such as querying
 * the data, running data analysis, or converting the data from one format to another, is contained within the task
 * runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as
 * it does so. When the task is done, the task runner reports the final success or failure of the task to the web
 * service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPipelineAsyncClient extends DataPipelineClient implements DataPipelineAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     * @deprecated use {@link DataPipelineAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public DataPipelineAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline. A credentials provider chain
     * will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Data Pipeline (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public DataPipelineAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link DataPipelineAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the provided AWS
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
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link DataPipelineAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link DataPipelineAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link DataPipelineAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public DataPipelineAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static DataPipelineAsyncClientBuilder asyncBuilder() {
        return DataPipelineAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Data Pipeline using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    DataPipelineAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ActivatePipelineResult> activatePipelineAsync(ActivatePipelineRequest request) {

        return activatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivatePipelineResult> activatePipelineAsync(final ActivatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivatePipelineRequest, ActivatePipelineResult> asyncHandler) {
        final ActivatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivatePipelineResult>() {
            @Override
            public ActivatePipelineResult call() throws Exception {
                ActivatePipelineResult result = null;

                try {
                    result = executeActivatePipeline(finalRequest);
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
    public java.util.concurrent.Future<DeactivatePipelineResult> deactivatePipelineAsync(DeactivatePipelineRequest request) {

        return deactivatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivatePipelineResult> deactivatePipelineAsync(final DeactivatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivatePipelineRequest, DeactivatePipelineResult> asyncHandler) {
        final DeactivatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivatePipelineResult>() {
            @Override
            public DeactivatePipelineResult call() throws Exception {
                DeactivatePipelineResult result = null;

                try {
                    result = executeDeactivatePipeline(finalRequest);
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
    public java.util.concurrent.Future<DescribeObjectsResult> describeObjectsAsync(DescribeObjectsRequest request) {

        return describeObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectsResult> describeObjectsAsync(final DescribeObjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeObjectsRequest, DescribeObjectsResult> asyncHandler) {
        final DescribeObjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeObjectsResult>() {
            @Override
            public DescribeObjectsResult call() throws Exception {
                DescribeObjectsResult result = null;

                try {
                    result = executeDescribeObjects(finalRequest);
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
    public java.util.concurrent.Future<DescribePipelinesResult> describePipelinesAsync(DescribePipelinesRequest request) {

        return describePipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePipelinesResult> describePipelinesAsync(final DescribePipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePipelinesRequest, DescribePipelinesResult> asyncHandler) {
        final DescribePipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePipelinesResult>() {
            @Override
            public DescribePipelinesResult call() throws Exception {
                DescribePipelinesResult result = null;

                try {
                    result = executeDescribePipelines(finalRequest);
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
    public java.util.concurrent.Future<EvaluateExpressionResult> evaluateExpressionAsync(EvaluateExpressionRequest request) {

        return evaluateExpressionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EvaluateExpressionResult> evaluateExpressionAsync(final EvaluateExpressionRequest request,
            final com.amazonaws.handlers.AsyncHandler<EvaluateExpressionRequest, EvaluateExpressionResult> asyncHandler) {
        final EvaluateExpressionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EvaluateExpressionResult>() {
            @Override
            public EvaluateExpressionResult call() throws Exception {
                EvaluateExpressionResult result = null;

                try {
                    result = executeEvaluateExpression(finalRequest);
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
    public java.util.concurrent.Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(GetPipelineDefinitionRequest request) {

        return getPipelineDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineDefinitionResult> getPipelineDefinitionAsync(final GetPipelineDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineDefinitionRequest, GetPipelineDefinitionResult> asyncHandler) {
        final GetPipelineDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineDefinitionResult>() {
            @Override
            public GetPipelineDefinitionResult call() throws Exception {
                GetPipelineDefinitionResult result = null;

                try {
                    result = executeGetPipelineDefinition(finalRequest);
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
    public java.util.concurrent.Future<PollForTaskResult> pollForTaskAsync(PollForTaskRequest request) {

        return pollForTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PollForTaskResult> pollForTaskAsync(final PollForTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<PollForTaskRequest, PollForTaskResult> asyncHandler) {
        final PollForTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PollForTaskResult>() {
            @Override
            public PollForTaskResult call() throws Exception {
                PollForTaskResult result = null;

                try {
                    result = executePollForTask(finalRequest);
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
    public java.util.concurrent.Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(PutPipelineDefinitionRequest request) {

        return putPipelineDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPipelineDefinitionResult> putPipelineDefinitionAsync(final PutPipelineDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPipelineDefinitionRequest, PutPipelineDefinitionResult> asyncHandler) {
        final PutPipelineDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPipelineDefinitionResult>() {
            @Override
            public PutPipelineDefinitionResult call() throws Exception {
                PutPipelineDefinitionResult result = null;

                try {
                    result = executePutPipelineDefinition(finalRequest);
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
    public java.util.concurrent.Future<QueryObjectsResult> queryObjectsAsync(QueryObjectsRequest request) {

        return queryObjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryObjectsResult> queryObjectsAsync(final QueryObjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<QueryObjectsRequest, QueryObjectsResult> asyncHandler) {
        final QueryObjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<QueryObjectsResult>() {
            @Override
            public QueryObjectsResult call() throws Exception {
                QueryObjectsResult result = null;

                try {
                    result = executeQueryObjects(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(final RemoveTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {
        final RemoveTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsResult>() {
            @Override
            public RemoveTagsResult call() throws Exception {
                RemoveTagsResult result = null;

                try {
                    result = executeRemoveTags(finalRequest);
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
    public java.util.concurrent.Future<ReportTaskProgressResult> reportTaskProgressAsync(ReportTaskProgressRequest request) {

        return reportTaskProgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportTaskProgressResult> reportTaskProgressAsync(final ReportTaskProgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReportTaskProgressRequest, ReportTaskProgressResult> asyncHandler) {
        final ReportTaskProgressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReportTaskProgressResult>() {
            @Override
            public ReportTaskProgressResult call() throws Exception {
                ReportTaskProgressResult result = null;

                try {
                    result = executeReportTaskProgress(finalRequest);
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
    public java.util.concurrent.Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(ReportTaskRunnerHeartbeatRequest request) {

        return reportTaskRunnerHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReportTaskRunnerHeartbeatResult> reportTaskRunnerHeartbeatAsync(final ReportTaskRunnerHeartbeatRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReportTaskRunnerHeartbeatRequest, ReportTaskRunnerHeartbeatResult> asyncHandler) {
        final ReportTaskRunnerHeartbeatRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReportTaskRunnerHeartbeatResult>() {
            @Override
            public ReportTaskRunnerHeartbeatResult call() throws Exception {
                ReportTaskRunnerHeartbeatResult result = null;

                try {
                    result = executeReportTaskRunnerHeartbeat(finalRequest);
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
    public java.util.concurrent.Future<SetStatusResult> setStatusAsync(SetStatusRequest request) {

        return setStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetStatusResult> setStatusAsync(final SetStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetStatusRequest, SetStatusResult> asyncHandler) {
        final SetStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetStatusResult>() {
            @Override
            public SetStatusResult call() throws Exception {
                SetStatusResult result = null;

                try {
                    result = executeSetStatus(finalRequest);
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
    public java.util.concurrent.Future<SetTaskStatusResult> setTaskStatusAsync(SetTaskStatusRequest request) {

        return setTaskStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetTaskStatusResult> setTaskStatusAsync(final SetTaskStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTaskStatusRequest, SetTaskStatusResult> asyncHandler) {
        final SetTaskStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetTaskStatusResult>() {
            @Override
            public SetTaskStatusResult call() throws Exception {
                SetTaskStatusResult result = null;

                try {
                    result = executeSetTaskStatus(finalRequest);
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
    public java.util.concurrent.Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(ValidatePipelineDefinitionRequest request) {

        return validatePipelineDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidatePipelineDefinitionResult> validatePipelineDefinitionAsync(final ValidatePipelineDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidatePipelineDefinitionRequest, ValidatePipelineDefinitionResult> asyncHandler) {
        final ValidatePipelineDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidatePipelineDefinitionResult>() {
            @Override
            public ValidatePipelineDefinitionResult call() throws Exception {
                ValidatePipelineDefinitionResult result = null;

                try {
                    result = executeValidatePipelineDefinition(finalRequest);
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
