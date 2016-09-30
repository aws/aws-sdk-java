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
package com.amazonaws.services.codepipeline;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing CodePipeline asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodePipeline</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the AWS CodePipeline API Reference. This guide provides descriptions of the actions and data types for AWS
 * CodePipeline. Some functionality for your pipeline is only configurable through the API. For additional information,
 * see the <a href="http://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html">AWS CodePipeline User
 * Guide</a>.
 * </p>
 * <p>
 * You can use the AWS CodePipeline API to work with pipelines, stages, actions, gates, and transitions, as described
 * below.
 * </p>
 * <p>
 * <i>Pipelines</i> are models of automated release processes. Each pipeline is uniquely named, and consists of actions,
 * gates, and stages.
 * </p>
 * <p>
 * You can work with pipelines by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePipeline</a>, which creates a uniquely-named pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePipeline</a>, which deletes the specified pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipeline</a>, which returns information about a pipeline structure.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineExecution</a>, which returns information about a specific execution of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPipelineState</a>, which returns information about the current state of the stages and actions of a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPipelines</a>, which gets a summary of all of the pipelines associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartPipelineExecution</a>, which runs the the most recent revision of an artifact through the pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdatePipeline</a>, which updates a pipeline with edits or changes to the structure of the pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Pipelines include <i>stages</i>, which are which are logical groupings of gates and actions. Each stage contains one
 * or more actions that must complete before the next stage begins. A stage will result in success or failure. If a
 * stage fails, then the pipeline stops at that stage and will remain stopped until either a new version of an artifact
 * appears in the source location, or a user takes action to re-run the most recent artifact through the pipeline. You
 * can call <a>GetPipelineState</a>, which displays the status of a pipeline, including the status of stages in the
 * pipeline, or <a>GetPipeline</a>, which returns the entire structure of the pipeline, including the stages of that
 * pipeline. For more information about the structure of stages and actions, also refer to the <a
 * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-structure.html">AWS CodePipeline Pipeline
 * Structure Reference</a>.
 * </p>
 * <p>
 * Pipeline stages include <i>actions</i>, which are categorized into categories such as source or build actions
 * performed within a stage of a pipeline. For example, you can use a source action to import artifacts into a pipeline
 * from a source such as Amazon S3. Like stages, you do not work with actions directly in most cases, but you do define
 * and interact with actions when working with pipeline operations such as <a>CreatePipeline</a> and
 * <a>GetPipelineState</a>.
 * </p>
 * <p>
 * Pipelines also include <i>transitions</i>, which allow the transition of artifacts from one stage to the next in a
 * pipeline after the actions in one stage complete.
 * </p>
 * <p>
 * You can work with transitions by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DisableStageTransition</a>, which prevents artifacts from transitioning to the next stage in a pipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>EnableStageTransition</a>, which enables transition of artifacts between stages in a pipeline.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Using the API to integrate with AWS CodePipeline</b>
 * </p>
 * <p>
 * For third-party integrators or developers who want to create their own integrations with AWS CodePipeline, the
 * expected sequence varies from the standard API user. In order to integrate with AWS CodePipeline, developers will
 * need to work with the following items:
 * </p>
 * <p>
 * <b>Jobs</b>, which are instances of an action. For example, a job for a source action might import a revision of an
 * artifact from a source.
 * </p>
 * <p>
 * You can work with jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeJob</a>, which confirms whether a job worker has received the specified job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetJobDetails</a>, which returns the details of a job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForJobs</a>, which determines whether there are any jobs to act upon,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobFailureResult</a>, which provides details of a job failure, and
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Third party jobs</b>, which are instances of an action created by a partner action and integrated into AWS
 * CodePipeline. Partner actions are created by members of the AWS Partner Network.
 * </p>
 * <p>
 * You can work with third party jobs by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AcknowledgeThirdPartyJob</a>, which confirms whether a job worker has received the specified job,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetThirdPartyJobDetails</a>, which requests the details of a job for a partner action,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PollForThirdPartyJobs</a>, which determines whether there are any jobs to act upon,
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobFailureResult</a>, which provides details of a job failure, and
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutThirdPartyJobSuccessResult</a>, which provides details of a job success.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AWSCodePipelineAsyncClient extends AWSCodePipelineClient implements AWSCodePipelineAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline. A credentials provider chain will
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
    public AWSCodePipelineAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to CodePipeline (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the provided AWS account
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
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSCodePipelineAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodePipeline using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodePipelineAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcknowledgeJobResult> acknowledgeJobAsync(AcknowledgeJobRequest request) {

        return acknowledgeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeJobResult> acknowledgeJobAsync(final AcknowledgeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcknowledgeJobRequest, AcknowledgeJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AcknowledgeJobResult>() {
            @Override
            public AcknowledgeJobResult call() throws Exception {
                AcknowledgeJobResult result;

                try {
                    result = acknowledgeJob(request);
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
    public java.util.concurrent.Future<AcknowledgeThirdPartyJobResult> acknowledgeThirdPartyJobAsync(AcknowledgeThirdPartyJobRequest request) {

        return acknowledgeThirdPartyJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeThirdPartyJobResult> acknowledgeThirdPartyJobAsync(final AcknowledgeThirdPartyJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcknowledgeThirdPartyJobRequest, AcknowledgeThirdPartyJobResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AcknowledgeThirdPartyJobResult>() {
            @Override
            public AcknowledgeThirdPartyJobResult call() throws Exception {
                AcknowledgeThirdPartyJobResult result;

                try {
                    result = acknowledgeThirdPartyJob(request);
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
    public java.util.concurrent.Future<CreateCustomActionTypeResult> createCustomActionTypeAsync(CreateCustomActionTypeRequest request) {

        return createCustomActionTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomActionTypeResult> createCustomActionTypeAsync(final CreateCustomActionTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomActionTypeRequest, CreateCustomActionTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomActionTypeResult>() {
            @Override
            public CreateCustomActionTypeResult call() throws Exception {
                CreateCustomActionTypeResult result;

                try {
                    result = createCustomActionType(request);
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
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(final CreatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreatePipelineResult>() {
            @Override
            public CreatePipelineResult call() throws Exception {
                CreatePipelineResult result;

                try {
                    result = createPipeline(request);
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
    public java.util.concurrent.Future<DeleteCustomActionTypeResult> deleteCustomActionTypeAsync(DeleteCustomActionTypeRequest request) {

        return deleteCustomActionTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomActionTypeResult> deleteCustomActionTypeAsync(final DeleteCustomActionTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomActionTypeRequest, DeleteCustomActionTypeResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomActionTypeResult>() {
            @Override
            public DeleteCustomActionTypeResult call() throws Exception {
                DeleteCustomActionTypeResult result;

                try {
                    result = deleteCustomActionType(request);
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
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(final DeletePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeletePipelineResult>() {
            @Override
            public DeletePipelineResult call() throws Exception {
                DeletePipelineResult result;

                try {
                    result = deletePipeline(request);
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
    public java.util.concurrent.Future<DisableStageTransitionResult> disableStageTransitionAsync(DisableStageTransitionRequest request) {

        return disableStageTransitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableStageTransitionResult> disableStageTransitionAsync(final DisableStageTransitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableStageTransitionRequest, DisableStageTransitionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableStageTransitionResult>() {
            @Override
            public DisableStageTransitionResult call() throws Exception {
                DisableStageTransitionResult result;

                try {
                    result = disableStageTransition(request);
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
    public java.util.concurrent.Future<EnableStageTransitionResult> enableStageTransitionAsync(EnableStageTransitionRequest request) {

        return enableStageTransitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableStageTransitionResult> enableStageTransitionAsync(final EnableStageTransitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableStageTransitionRequest, EnableStageTransitionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableStageTransitionResult>() {
            @Override
            public EnableStageTransitionResult call() throws Exception {
                EnableStageTransitionResult result;

                try {
                    result = enableStageTransition(request);
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
    public java.util.concurrent.Future<GetJobDetailsResult> getJobDetailsAsync(GetJobDetailsRequest request) {

        return getJobDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobDetailsResult> getJobDetailsAsync(final GetJobDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobDetailsRequest, GetJobDetailsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetJobDetailsResult>() {
            @Override
            public GetJobDetailsResult call() throws Exception {
                GetJobDetailsResult result;

                try {
                    result = getJobDetails(request);
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
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest request) {

        return getPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(final GetPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineRequest, GetPipelineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineResult>() {
            @Override
            public GetPipelineResult call() throws Exception {
                GetPipelineResult result;

                try {
                    result = getPipeline(request);
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
    public java.util.concurrent.Future<GetPipelineExecutionResult> getPipelineExecutionAsync(GetPipelineExecutionRequest request) {

        return getPipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineExecutionResult> getPipelineExecutionAsync(final GetPipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineExecutionRequest, GetPipelineExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineExecutionResult>() {
            @Override
            public GetPipelineExecutionResult call() throws Exception {
                GetPipelineExecutionResult result;

                try {
                    result = getPipelineExecution(request);
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
    public java.util.concurrent.Future<GetPipelineStateResult> getPipelineStateAsync(GetPipelineStateRequest request) {

        return getPipelineStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineStateResult> getPipelineStateAsync(final GetPipelineStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineStateRequest, GetPipelineStateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineStateResult>() {
            @Override
            public GetPipelineStateResult call() throws Exception {
                GetPipelineStateResult result;

                try {
                    result = getPipelineState(request);
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
    public java.util.concurrent.Future<GetThirdPartyJobDetailsResult> getThirdPartyJobDetailsAsync(GetThirdPartyJobDetailsRequest request) {

        return getThirdPartyJobDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetThirdPartyJobDetailsResult> getThirdPartyJobDetailsAsync(final GetThirdPartyJobDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetThirdPartyJobDetailsRequest, GetThirdPartyJobDetailsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetThirdPartyJobDetailsResult>() {
            @Override
            public GetThirdPartyJobDetailsResult call() throws Exception {
                GetThirdPartyJobDetailsResult result;

                try {
                    result = getThirdPartyJobDetails(request);
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
    public java.util.concurrent.Future<ListActionTypesResult> listActionTypesAsync(ListActionTypesRequest request) {

        return listActionTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActionTypesResult> listActionTypesAsync(final ListActionTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListActionTypesRequest, ListActionTypesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListActionTypesResult>() {
            @Override
            public ListActionTypesResult call() throws Exception {
                ListActionTypesResult result;

                try {
                    result = listActionTypes(request);
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
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(final ListPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListPipelinesResult>() {
            @Override
            public ListPipelinesResult call() throws Exception {
                ListPipelinesResult result;

                try {
                    result = listPipelines(request);
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
    public java.util.concurrent.Future<PollForJobsResult> pollForJobsAsync(PollForJobsRequest request) {

        return pollForJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PollForJobsResult> pollForJobsAsync(final PollForJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PollForJobsRequest, PollForJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PollForJobsResult>() {
            @Override
            public PollForJobsResult call() throws Exception {
                PollForJobsResult result;

                try {
                    result = pollForJobs(request);
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
    public java.util.concurrent.Future<PollForThirdPartyJobsResult> pollForThirdPartyJobsAsync(PollForThirdPartyJobsRequest request) {

        return pollForThirdPartyJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PollForThirdPartyJobsResult> pollForThirdPartyJobsAsync(final PollForThirdPartyJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PollForThirdPartyJobsRequest, PollForThirdPartyJobsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PollForThirdPartyJobsResult>() {
            @Override
            public PollForThirdPartyJobsResult call() throws Exception {
                PollForThirdPartyJobsResult result;

                try {
                    result = pollForThirdPartyJobs(request);
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
    public java.util.concurrent.Future<PutActionRevisionResult> putActionRevisionAsync(PutActionRevisionRequest request) {

        return putActionRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutActionRevisionResult> putActionRevisionAsync(final PutActionRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutActionRevisionRequest, PutActionRevisionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutActionRevisionResult>() {
            @Override
            public PutActionRevisionResult call() throws Exception {
                PutActionRevisionResult result;

                try {
                    result = putActionRevision(request);
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
    public java.util.concurrent.Future<PutApprovalResultResult> putApprovalResultAsync(PutApprovalResultRequest request) {

        return putApprovalResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApprovalResultResult> putApprovalResultAsync(final PutApprovalResultRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutApprovalResultRequest, PutApprovalResultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutApprovalResultResult>() {
            @Override
            public PutApprovalResultResult call() throws Exception {
                PutApprovalResultResult result;

                try {
                    result = putApprovalResult(request);
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
    public java.util.concurrent.Future<PutJobFailureResultResult> putJobFailureResultAsync(PutJobFailureResultRequest request) {

        return putJobFailureResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutJobFailureResultResult> putJobFailureResultAsync(final PutJobFailureResultRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutJobFailureResultRequest, PutJobFailureResultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutJobFailureResultResult>() {
            @Override
            public PutJobFailureResultResult call() throws Exception {
                PutJobFailureResultResult result;

                try {
                    result = putJobFailureResult(request);
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
    public java.util.concurrent.Future<PutJobSuccessResultResult> putJobSuccessResultAsync(PutJobSuccessResultRequest request) {

        return putJobSuccessResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutJobSuccessResultResult> putJobSuccessResultAsync(final PutJobSuccessResultRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutJobSuccessResultRequest, PutJobSuccessResultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutJobSuccessResultResult>() {
            @Override
            public PutJobSuccessResultResult call() throws Exception {
                PutJobSuccessResultResult result;

                try {
                    result = putJobSuccessResult(request);
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
    public java.util.concurrent.Future<PutThirdPartyJobFailureResultResult> putThirdPartyJobFailureResultAsync(PutThirdPartyJobFailureResultRequest request) {

        return putThirdPartyJobFailureResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutThirdPartyJobFailureResultResult> putThirdPartyJobFailureResultAsync(
            final PutThirdPartyJobFailureResultRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutThirdPartyJobFailureResultRequest, PutThirdPartyJobFailureResultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutThirdPartyJobFailureResultResult>() {
            @Override
            public PutThirdPartyJobFailureResultResult call() throws Exception {
                PutThirdPartyJobFailureResultResult result;

                try {
                    result = putThirdPartyJobFailureResult(request);
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
    public java.util.concurrent.Future<PutThirdPartyJobSuccessResultResult> putThirdPartyJobSuccessResultAsync(PutThirdPartyJobSuccessResultRequest request) {

        return putThirdPartyJobSuccessResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutThirdPartyJobSuccessResultResult> putThirdPartyJobSuccessResultAsync(
            final PutThirdPartyJobSuccessResultRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutThirdPartyJobSuccessResultRequest, PutThirdPartyJobSuccessResultResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutThirdPartyJobSuccessResultResult>() {
            @Override
            public PutThirdPartyJobSuccessResultResult call() throws Exception {
                PutThirdPartyJobSuccessResultResult result;

                try {
                    result = putThirdPartyJobSuccessResult(request);
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
    public java.util.concurrent.Future<RetryStageExecutionResult> retryStageExecutionAsync(RetryStageExecutionRequest request) {

        return retryStageExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetryStageExecutionResult> retryStageExecutionAsync(final RetryStageExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetryStageExecutionRequest, RetryStageExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RetryStageExecutionResult>() {
            @Override
            public RetryStageExecutionResult call() throws Exception {
                RetryStageExecutionResult result;

                try {
                    result = retryStageExecution(request);
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
    public java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(StartPipelineExecutionRequest request) {

        return startPipelineExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipelineExecutionResult> startPipelineExecutionAsync(final StartPipelineExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPipelineExecutionRequest, StartPipelineExecutionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartPipelineExecutionResult>() {
            @Override
            public StartPipelineExecutionResult call() throws Exception {
                StartPipelineExecutionResult result;

                try {
                    result = startPipelineExecution(request);
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
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(final UpdatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineResult>() {
            @Override
            public UpdatePipelineResult call() throws Exception {
                UpdatePipelineResult result;

                try {
                    result = updatePipeline(request);
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
