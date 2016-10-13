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
package com.amazonaws.services.gamelift;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon GameLift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Welcome to the <i>Amazon GameLift API Reference</i>. Amazon GameLift is a managed Amazon Web Services (AWS) service
 * for developers who need a scalable, server-based solution for multiplayer games. Amazon GameLift provides setup and
 * deployment of game servers, and handles infrastructure scaling and session management.
 * </p>
 * <p>
 * This reference describes the low-level service API for GameLift. You can call this API directly or use the <a
 * href="http://aws.amazon.com/tools/#sdk">AWS SDK</a> for your preferred language. The AWS SDK includes a set of
 * high-level GameLift actions multiplayer game sessions. Alternatively, you can use the <a
 * href="http://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool, which includes commands for GameLift.
 * For administrative actions, you can also use the Amazon GameLift console.
 * </p>
 * <p>
 * <b>More Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon GameLift Developer Guide</a>: Learn more
 * about GameLift features and how to use them
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/tutorials">Lumberyard and GameLift Tutorials</a>: Get started fast with
 * walkthroughs and sample projects
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/blogs/gamedev/">GameDev Blog</a>: Stay up to date with new features and techniques
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/spaces/123/gamelift-discussion.html">GameDev Forums</a>: Connect with the
 * GameDev community
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Manage Games and Players Through GameLift</b>
 * </p>
 * <p>
 * Call these actions from your game clients and/or services to create and manage multiplayer game sessions and player
 * sessions.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Game sessions:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGameSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionDetails</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>SearchGameSessions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Player sessions:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePlayerSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePlayerSessions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePlayerSessions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Other actions:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetGameSessionLogUrl</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Set Up and Manage Game Servers</b>
 * </p>
 * <p>
 * Use these administrative actions to configure GameLift to host your game servers. When setting up GameLift, you will
 * need to (1) configure a build for your game and upload build files, and (2) set up one or more fleets to host game
 * sessions. Once you've created and activated a fleet, you can assign aliases to it, scale capacity, track performance
 * and utilization, etc.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Game builds:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListBuilds</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RequestUploadCredentials</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Fleets:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListFleets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateFleet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Describe fleets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetAttributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetPortSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetUtilization</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEC2InstanceLimits</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetEvents</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeRuntimeConfiguration</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Update fleets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>UpdateFleetAttributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetPortSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRuntimeConfiguration</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage fleet aliases:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListAliases</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ResolveAlias</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage autoscaling:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutScalingPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScalingPolicies</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScalingPolicy</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * To view changes to the API, see the GameLift <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/doc-history.html">Document History</a> page.
 * </p>
 */
@ThreadSafe
public class AmazonGameLiftAsyncClient extends AmazonGameLiftClient implements AmazonGameLiftAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift. A credentials provider chain
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
     */
    public AmazonGameLiftAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon GameLift (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the provided AWS account
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
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonGameLiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonGameLiftAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result;

                try {
                    result = createAlias(request);
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
    public java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest request) {

        return createBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBuildResult> createBuildAsync(final CreateBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBuildRequest, CreateBuildResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateBuildResult>() {
            @Override
            public CreateBuildResult call() throws Exception {
                CreateBuildResult result;

                try {
                    result = createBuild(request);
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
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result;

                try {
                    result = createFleet(request);
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
    public java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(CreateGameSessionRequest request) {

        return createGameSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(final CreateGameSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGameSessionRequest, CreateGameSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateGameSessionResult>() {
            @Override
            public CreateGameSessionResult call() throws Exception {
                CreateGameSessionResult result;

                try {
                    result = createGameSession(request);
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
    public java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(CreatePlayerSessionRequest request) {

        return createPlayerSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(final CreatePlayerSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionRequest, CreatePlayerSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreatePlayerSessionResult>() {
            @Override
            public CreatePlayerSessionResult call() throws Exception {
                CreatePlayerSessionResult result;

                try {
                    result = createPlayerSession(request);
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
    public java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(CreatePlayerSessionsRequest request) {

        return createPlayerSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(final CreatePlayerSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionsRequest, CreatePlayerSessionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreatePlayerSessionsResult>() {
            @Override
            public CreatePlayerSessionsResult call() throws Exception {
                CreatePlayerSessionsResult result;

                try {
                    result = createPlayerSessions(request);
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
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result;

                try {
                    result = deleteAlias(request);
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
    public java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(DeleteBuildRequest request) {

        return deleteBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(final DeleteBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBuildRequest, DeleteBuildResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteBuildResult>() {
            @Override
            public DeleteBuildResult call() throws Exception {
                DeleteBuildResult result;

                try {
                    result = deleteBuild(request);
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
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result;

                try {
                    result = deleteFleet(request);
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
    public java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest request) {

        return deleteScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(final DeleteScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteScalingPolicyResult>() {
            @Override
            public DeleteScalingPolicyResult call() throws Exception {
                DeleteScalingPolicyResult result;

                try {
                    result = deleteScalingPolicy(request);
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
    public java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(DescribeAliasRequest request) {

        return describeAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(final DescribeAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAliasRequest, DescribeAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAliasResult>() {
            @Override
            public DescribeAliasResult call() throws Exception {
                DescribeAliasResult result;

                try {
                    result = describeAlias(request);
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
    public java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(DescribeBuildRequest request) {

        return describeBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(final DescribeBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBuildRequest, DescribeBuildResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeBuildResult>() {
            @Override
            public DescribeBuildResult call() throws Exception {
                DescribeBuildResult result;

                try {
                    result = describeBuild(request);
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
    public java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(DescribeEC2InstanceLimitsRequest request) {

        return describeEC2InstanceLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(final DescribeEC2InstanceLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEC2InstanceLimitsRequest, DescribeEC2InstanceLimitsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeEC2InstanceLimitsResult>() {
            @Override
            public DescribeEC2InstanceLimitsResult call() throws Exception {
                DescribeEC2InstanceLimitsResult result;

                try {
                    result = describeEC2InstanceLimits(request);
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
    public java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest request) {

        return describeFleetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(final DescribeFleetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAttributesRequest, DescribeFleetAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAttributesResult>() {
            @Override
            public DescribeFleetAttributesResult call() throws Exception {
                DescribeFleetAttributesResult result;

                try {
                    result = describeFleetAttributes(request);
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
    public java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest request) {

        return describeFleetCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(final DescribeFleetCapacityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetCapacityRequest, DescribeFleetCapacityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetCapacityResult>() {
            @Override
            public DescribeFleetCapacityResult call() throws Exception {
                DescribeFleetCapacityResult result;

                try {
                    result = describeFleetCapacity(request);
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
    public java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(DescribeFleetEventsRequest request) {

        return describeFleetEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(final DescribeFleetEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetEventsRequest, DescribeFleetEventsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetEventsResult>() {
            @Override
            public DescribeFleetEventsResult call() throws Exception {
                DescribeFleetEventsResult result;

                try {
                    result = describeFleetEvents(request);
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
    public java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(DescribeFleetPortSettingsRequest request) {

        return describeFleetPortSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(final DescribeFleetPortSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetPortSettingsRequest, DescribeFleetPortSettingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetPortSettingsResult>() {
            @Override
            public DescribeFleetPortSettingsResult call() throws Exception {
                DescribeFleetPortSettingsResult result;

                try {
                    result = describeFleetPortSettings(request);
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
    public java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(DescribeFleetUtilizationRequest request) {

        return describeFleetUtilizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(final DescribeFleetUtilizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetUtilizationRequest, DescribeFleetUtilizationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetUtilizationResult>() {
            @Override
            public DescribeFleetUtilizationResult call() throws Exception {
                DescribeFleetUtilizationResult result;

                try {
                    result = describeFleetUtilization(request);
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
    public java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(DescribeGameSessionDetailsRequest request) {

        return describeGameSessionDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(final DescribeGameSessionDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGameSessionDetailsRequest, DescribeGameSessionDetailsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeGameSessionDetailsResult>() {
            @Override
            public DescribeGameSessionDetailsResult call() throws Exception {
                DescribeGameSessionDetailsResult result;

                try {
                    result = describeGameSessionDetails(request);
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
    public java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest request) {

        return describeGameSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(final DescribeGameSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGameSessionsRequest, DescribeGameSessionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeGameSessionsResult>() {
            @Override
            public DescribeGameSessionsResult call() throws Exception {
                DescribeGameSessionsResult result;

                try {
                    result = describeGameSessions(request);
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
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancesResult>() {
            @Override
            public DescribeInstancesResult call() throws Exception {
                DescribeInstancesResult result;

                try {
                    result = describeInstances(request);
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
    public java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(DescribePlayerSessionsRequest request) {

        return describePlayerSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(final DescribePlayerSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePlayerSessionsRequest, DescribePlayerSessionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribePlayerSessionsResult>() {
            @Override
            public DescribePlayerSessionsResult call() throws Exception {
                DescribePlayerSessionsResult result;

                try {
                    result = describePlayerSessions(request);
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
    public java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(DescribeRuntimeConfigurationRequest request) {

        return describeRuntimeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(final DescribeRuntimeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuntimeConfigurationRequest, DescribeRuntimeConfigurationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuntimeConfigurationResult>() {
            @Override
            public DescribeRuntimeConfigurationResult call() throws Exception {
                DescribeRuntimeConfigurationResult result;

                try {
                    result = describeRuntimeConfiguration(request);
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
    public java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest request) {

        return describeScalingPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(final DescribeScalingPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingPoliciesResult>() {
            @Override
            public DescribeScalingPoliciesResult call() throws Exception {
                DescribeScalingPoliciesResult result;

                try {
                    result = describeScalingPolicies(request);
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
    public java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest request) {

        return getGameSessionLogUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(final GetGameSessionLogUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGameSessionLogUrlRequest, GetGameSessionLogUrlResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetGameSessionLogUrlResult>() {
            @Override
            public GetGameSessionLogUrlResult call() throws Exception {
                GetGameSessionLogUrlResult result;

                try {
                    result = getGameSessionLogUrl(request);
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
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result;

                try {
                    result = listAliases(request);
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
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request) {

        return listBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(final ListBuildsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListBuildsResult>() {
            @Override
            public ListBuildsResult call() throws Exception {
                ListBuildsResult result;

                try {
                    result = listBuilds(request);
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
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest request) {

        return listFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(final ListFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsResult>() {
            @Override
            public ListFleetsResult call() throws Exception {
                ListFleetsResult result;

                try {
                    result = listFleets(request);
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
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest request) {

        return putScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(final PutScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutScalingPolicyResult>() {
            @Override
            public PutScalingPolicyResult call() throws Exception {
                PutScalingPolicyResult result;

                try {
                    result = putScalingPolicy(request);
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
    public java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest request) {

        return requestUploadCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(final RequestUploadCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestUploadCredentialsRequest, RequestUploadCredentialsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RequestUploadCredentialsResult>() {
            @Override
            public RequestUploadCredentialsResult call() throws Exception {
                RequestUploadCredentialsResult result;

                try {
                    result = requestUploadCredentials(request);
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
    public java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest request) {

        return resolveAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(final ResolveAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResolveAliasRequest, ResolveAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResolveAliasResult>() {
            @Override
            public ResolveAliasResult call() throws Exception {
                ResolveAliasResult result;

                try {
                    result = resolveAlias(request);
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
    public java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(SearchGameSessionsRequest request) {

        return searchGameSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(final SearchGameSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchGameSessionsRequest, SearchGameSessionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SearchGameSessionsResult>() {
            @Override
            public SearchGameSessionsResult call() throws Exception {
                SearchGameSessionsResult result;

                try {
                    result = searchGameSessions(request);
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
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateAliasResult>() {
            @Override
            public UpdateAliasResult call() throws Exception {
                UpdateAliasResult result;

                try {
                    result = updateAlias(request);
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
    public java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(UpdateBuildRequest request) {

        return updateBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(final UpdateBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBuildRequest, UpdateBuildResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateBuildResult>() {
            @Override
            public UpdateBuildResult call() throws Exception {
                UpdateBuildResult result;

                try {
                    result = updateBuild(request);
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
    public java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest request) {

        return updateFleetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(final UpdateFleetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetAttributesRequest, UpdateFleetAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetAttributesResult>() {
            @Override
            public UpdateFleetAttributesResult call() throws Exception {
                UpdateFleetAttributesResult result;

                try {
                    result = updateFleetAttributes(request);
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
    public java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest request) {

        return updateFleetCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(final UpdateFleetCapacityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetCapacityRequest, UpdateFleetCapacityResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetCapacityResult>() {
            @Override
            public UpdateFleetCapacityResult call() throws Exception {
                UpdateFleetCapacityResult result;

                try {
                    result = updateFleetCapacity(request);
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
    public java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest request) {

        return updateFleetPortSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(final UpdateFleetPortSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetPortSettingsRequest, UpdateFleetPortSettingsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetPortSettingsResult>() {
            @Override
            public UpdateFleetPortSettingsResult call() throws Exception {
                UpdateFleetPortSettingsResult result;

                try {
                    result = updateFleetPortSettings(request);
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
    public java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(UpdateGameSessionRequest request) {

        return updateGameSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(final UpdateGameSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGameSessionRequest, UpdateGameSessionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateGameSessionResult>() {
            @Override
            public UpdateGameSessionResult call() throws Exception {
                UpdateGameSessionResult result;

                try {
                    result = updateGameSession(request);
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
    public java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(UpdateRuntimeConfigurationRequest request) {

        return updateRuntimeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(final UpdateRuntimeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuntimeConfigurationRequest, UpdateRuntimeConfigurationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuntimeConfigurationResult>() {
            @Override
            public UpdateRuntimeConfigurationResult call() throws Exception {
                UpdateRuntimeConfigurationResult result;

                try {
                    result = updateRuntimeConfiguration(request);
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
