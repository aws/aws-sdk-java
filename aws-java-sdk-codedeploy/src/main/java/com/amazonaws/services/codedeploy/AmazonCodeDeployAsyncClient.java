/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy;

import com.amazonaws.services.codedeploy.model.*;

/**
 * Interface for accessing CodeDeploy asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeDeploy</fullname> <b>Overview</b>
 * <p>
 * This is the AWS CodeDeploy API Reference. This guide provides descriptions of
 * the AWS CodeDeploy APIs. For additional information, see the <a
 * href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy
 * User Guide</a>.
 * </p>
 * <b>Using the APIs</b>
 * <p>
 * You can use the AWS CodeDeploy APIs to work with the following items:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Applications are unique identifiers that AWS CodeDeploy uses to ensure that
 * the correct combinations of revisions, deployment configurations, and
 * deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update
 * applications.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment configurations are sets of deployment rules and deployment success
 * and failure conditions that AWS CodeDeploy uses during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list
 * deployment configurations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment groups are groups of instances to which application revisions can
 * be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update
 * deployment groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances represent Amazon EC2 instances to which application revisions are
 * deployed. Instances are identified by their Amazon EC2 tags or Auto Scaling
 * group names. Instances belong to deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop
 * deployments.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application revisions are archive files that are stored in Amazon S3 buckets
 * or GitHub repositories. These revisions contain source content (such as
 * source code, web pages, executable files, any deployment scripts, and
 * similar) along with an Application Specification file (AppSpec file). (The
 * AppSpec file is unique to AWS CodeDeploy; it defines a series of deployment
 * actions that you want AWS CodeDeploy to execute.) An application revision is
 * uniquely identified by its Amazon S3 object key and its ETag, version, or
 * both (for application revisions that are stored in Amazon S3 buckets) or by
 * its repository name and commit ID (for applications revisions that are stored
 * in GitHub repositories). Application revisions are deployed through
 * deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register application
 * revisions.
 * </p>
 * </li>
 * </ul>
 */
public class AmazonCodeDeployAsyncClient extends AmazonCodeDeployClient
        implements AmazonCodeDeployAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to CodeDeploy (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the specified AWS account credentials, executor service,
     * and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the specified AWS account credentials provider. Default
     * client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the provided AWS account credentials provider and client
     * configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * CodeDeploy using the specified AWS account credentials provider, executor
     * service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonCodeDeployAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    @Override
    public java.util.concurrent.Future<Void> addTagsToOnPremisesInstancesAsync(
            final AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        addTagsToOnPremisesInstances(addTagsToOnPremisesInstancesRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> addTagsToOnPremisesInstancesAsync(
            final AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToOnPremisesInstancesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            addTagsToOnPremisesInstances(addTagsToOnPremisesInstancesRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                addTagsToOnPremisesInstancesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            final BatchGetApplicationsRequest batchGetApplicationsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetApplicationsResult>() {
                    @Override
                    public BatchGetApplicationsResult call() {
                        return batchGetApplications(batchGetApplicationsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            final BatchGetApplicationsRequest batchGetApplicationsRequest,
            final com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetApplicationsResult>() {
                    @Override
                    public BatchGetApplicationsResult call() throws Exception {
                        BatchGetApplicationsResult result;
                        try {
                            result = batchGetApplications(batchGetApplicationsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(batchGetApplicationsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync() {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetApplications operation
     * with an AsyncHandler.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            final BatchGetDeploymentsRequest batchGetDeploymentsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetDeploymentsResult>() {
                    @Override
                    public BatchGetDeploymentsResult call() {
                        return batchGetDeployments(batchGetDeploymentsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            final BatchGetDeploymentsRequest batchGetDeploymentsRequest,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetDeploymentsResult>() {
                    @Override
                    public BatchGetDeploymentsResult call() throws Exception {
                        BatchGetDeploymentsResult result;
                        try {
                            result = batchGetDeployments(batchGetDeploymentsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(batchGetDeploymentsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync() {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetDeployments operation
     * with an AsyncHandler.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            final BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetOnPremisesInstancesResult>() {
                    @Override
                    public BatchGetOnPremisesInstancesResult call() {
                        return batchGetOnPremisesInstances(batchGetOnPremisesInstancesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            final BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest,
            final com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<BatchGetOnPremisesInstancesResult>() {
                    @Override
                    public BatchGetOnPremisesInstancesResult call()
                            throws Exception {
                        BatchGetOnPremisesInstancesResult result;
                        try {
                            result = batchGetOnPremisesInstances(batchGetOnPremisesInstancesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                batchGetOnPremisesInstancesRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync() {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances
     * operation with an AsyncHandler.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        return batchGetOnPremisesInstancesAsync(
                new BatchGetOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            final CreateApplicationRequest createApplicationRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
                    @Override
                    public CreateApplicationResult call() {
                        return createApplication(createApplicationRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            final CreateApplicationRequest createApplicationRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
                    @Override
                    public CreateApplicationResult call() throws Exception {
                        CreateApplicationResult result;
                        try {
                            result = createApplication(createApplicationRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler
                                .onSuccess(createApplicationRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            final CreateDeploymentRequest createDeploymentRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
                    @Override
                    public CreateDeploymentResult call() {
                        return createDeployment(createDeploymentRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            final CreateDeploymentRequest createDeploymentRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
                    @Override
                    public CreateDeploymentResult call() throws Exception {
                        CreateDeploymentResult result;
                        try {
                            result = createDeployment(createDeploymentRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createDeploymentRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(
            final CreateDeploymentConfigRequest createDeploymentConfigRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentConfigResult>() {
                    @Override
                    public CreateDeploymentConfigResult call() {
                        return createDeploymentConfig(createDeploymentConfigRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(
            final CreateDeploymentConfigRequest createDeploymentConfigRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentConfigResult>() {
                    @Override
                    public CreateDeploymentConfigResult call() throws Exception {
                        CreateDeploymentConfigResult result;
                        try {
                            result = createDeploymentConfig(createDeploymentConfigRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createDeploymentConfigRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(
            final CreateDeploymentGroupRequest createDeploymentGroupRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentGroupResult>() {
                    @Override
                    public CreateDeploymentGroupResult call() {
                        return createDeploymentGroup(createDeploymentGroupRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(
            final CreateDeploymentGroupRequest createDeploymentGroupRequest,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeploymentGroupResult>() {
                    @Override
                    public CreateDeploymentGroupResult call() throws Exception {
                        CreateDeploymentGroupResult result;
                        try {
                            result = createDeploymentGroup(createDeploymentGroupRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(createDeploymentGroupRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApplicationAsync(
            final DeleteApplicationRequest deleteApplicationRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        deleteApplication(deleteApplicationRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApplicationAsync(
            final DeleteApplicationRequest deleteApplicationRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            deleteApplication(deleteApplicationRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler
                                .onSuccess(deleteApplicationRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeploymentConfigAsync(
            final DeleteDeploymentConfigRequest deleteDeploymentConfigRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        deleteDeploymentConfig(deleteDeploymentConfigRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeploymentConfigAsync(
            final DeleteDeploymentConfigRequest deleteDeploymentConfigRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentConfigRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            deleteDeploymentConfig(deleteDeploymentConfigRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(deleteDeploymentConfigRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(
            final DeleteDeploymentGroupRequest deleteDeploymentGroupRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteDeploymentGroupResult>() {
                    @Override
                    public DeleteDeploymentGroupResult call() {
                        return deleteDeploymentGroup(deleteDeploymentGroupRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(
            final DeleteDeploymentGroupRequest deleteDeploymentGroupRequest,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteDeploymentGroupResult>() {
                    @Override
                    public DeleteDeploymentGroupResult call() throws Exception {
                        DeleteDeploymentGroupResult result;
                        try {
                            result = deleteDeploymentGroup(deleteDeploymentGroupRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(deleteDeploymentGroupRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterOnPremisesInstanceAsync(
            final DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        deregisterOnPremisesInstance(deregisterOnPremisesInstanceRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> deregisterOnPremisesInstanceAsync(
            final DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest,
            final com.amazonaws.handlers.AsyncHandler<DeregisterOnPremisesInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            deregisterOnPremisesInstance(deregisterOnPremisesInstanceRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                deregisterOnPremisesInstanceRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(
            final GetApplicationRequest getApplicationRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetApplicationResult>() {
                    @Override
                    public GetApplicationResult call() {
                        return getApplication(getApplicationRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(
            final GetApplicationRequest getApplicationRequest,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetApplicationResult>() {
                    @Override
                    public GetApplicationResult call() throws Exception {
                        GetApplicationResult result;
                        try {
                            result = getApplication(getApplicationRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getApplicationRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(
            final GetApplicationRevisionRequest getApplicationRevisionRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetApplicationRevisionResult>() {
                    @Override
                    public GetApplicationRevisionResult call() {
                        return getApplicationRevision(getApplicationRevisionRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(
            final GetApplicationRevisionRequest getApplicationRevisionRequest,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetApplicationRevisionResult>() {
                    @Override
                    public GetApplicationRevisionResult call() throws Exception {
                        GetApplicationRevisionResult result;
                        try {
                            result = getApplicationRevision(getApplicationRevisionRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getApplicationRevisionRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            final GetDeploymentRequest getDeploymentRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
                    @Override
                    public GetDeploymentResult call() {
                        return getDeployment(getDeploymentRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            final GetDeploymentRequest getDeploymentRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
                    @Override
                    public GetDeploymentResult call() throws Exception {
                        GetDeploymentResult result;
                        try {
                            result = getDeployment(getDeploymentRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getDeploymentRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(
            final GetDeploymentConfigRequest getDeploymentConfigRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentConfigResult>() {
                    @Override
                    public GetDeploymentConfigResult call() {
                        return getDeploymentConfig(getDeploymentConfigRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(
            final GetDeploymentConfigRequest getDeploymentConfigRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentConfigResult>() {
                    @Override
                    public GetDeploymentConfigResult call() throws Exception {
                        GetDeploymentConfigResult result;
                        try {
                            result = getDeploymentConfig(getDeploymentConfigRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getDeploymentConfigRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(
            final GetDeploymentGroupRequest getDeploymentGroupRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentGroupResult>() {
                    @Override
                    public GetDeploymentGroupResult call() {
                        return getDeploymentGroup(getDeploymentGroupRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(
            final GetDeploymentGroupRequest getDeploymentGroupRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentGroupResult>() {
                    @Override
                    public GetDeploymentGroupResult call() throws Exception {
                        GetDeploymentGroupResult result;
                        try {
                            result = getDeploymentGroup(getDeploymentGroupRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getDeploymentGroupRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(
            final GetDeploymentInstanceRequest getDeploymentInstanceRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentInstanceResult>() {
                    @Override
                    public GetDeploymentInstanceResult call() {
                        return getDeploymentInstance(getDeploymentInstanceRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(
            final GetDeploymentInstanceRequest getDeploymentInstanceRequest,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDeploymentInstanceResult>() {
                    @Override
                    public GetDeploymentInstanceResult call() throws Exception {
                        GetDeploymentInstanceResult result;
                        try {
                            result = getDeploymentInstance(getDeploymentInstanceRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getDeploymentInstanceRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(
            final GetOnPremisesInstanceRequest getOnPremisesInstanceRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetOnPremisesInstanceResult>() {
                    @Override
                    public GetOnPremisesInstanceResult call() {
                        return getOnPremisesInstance(getOnPremisesInstanceRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(
            final GetOnPremisesInstanceRequest getOnPremisesInstanceRequest,
            final com.amazonaws.handlers.AsyncHandler<GetOnPremisesInstanceRequest, GetOnPremisesInstanceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetOnPremisesInstanceResult>() {
                    @Override
                    public GetOnPremisesInstanceResult call() throws Exception {
                        GetOnPremisesInstanceResult result;
                        try {
                            result = getOnPremisesInstance(getOnPremisesInstanceRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getOnPremisesInstanceRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(
            final ListApplicationRevisionsRequest listApplicationRevisionsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListApplicationRevisionsResult>() {
                    @Override
                    public ListApplicationRevisionsResult call() {
                        return listApplicationRevisions(listApplicationRevisionsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(
            final ListApplicationRevisionsRequest listApplicationRevisionsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListApplicationRevisionsResult>() {
                    @Override
                    public ListApplicationRevisionsResult call()
                            throws Exception {
                        ListApplicationRevisionsResult result;
                        try {
                            result = listApplicationRevisions(listApplicationRevisionsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listApplicationRevisionsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            final ListApplicationsRequest listApplicationsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
                    @Override
                    public ListApplicationsResult call() {
                        return listApplications(listApplicationsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            final ListApplicationsRequest listApplicationsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
                    @Override
                    public ListApplicationsResult call() throws Exception {
                        ListApplicationsResult result;
                        try {
                            result = listApplications(listApplicationsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listApplicationsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync() {

        return listApplicationsAsync(new ListApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListApplications operation with
     * an AsyncHandler.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return listApplicationsAsync(new ListApplicationsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            final ListDeploymentConfigsRequest listDeploymentConfigsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentConfigsResult>() {
                    @Override
                    public ListDeploymentConfigsResult call() {
                        return listDeploymentConfigs(listDeploymentConfigsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            final ListDeploymentConfigsRequest listDeploymentConfigsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentConfigsResult>() {
                    @Override
                    public ListDeploymentConfigsResult call() throws Exception {
                        ListDeploymentConfigsResult result;
                        try {
                            result = listDeploymentConfigs(listDeploymentConfigsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listDeploymentConfigsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync() {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation
     * with an AsyncHandler.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(
            final ListDeploymentGroupsRequest listDeploymentGroupsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentGroupsResult>() {
                    @Override
                    public ListDeploymentGroupsResult call() {
                        return listDeploymentGroups(listDeploymentGroupsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(
            final ListDeploymentGroupsRequest listDeploymentGroupsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentGroupsResult>() {
                    @Override
                    public ListDeploymentGroupsResult call() throws Exception {
                        ListDeploymentGroupsResult result;
                        try {
                            result = listDeploymentGroups(listDeploymentGroupsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listDeploymentGroupsRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(
            final ListDeploymentInstancesRequest listDeploymentInstancesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentInstancesResult>() {
                    @Override
                    public ListDeploymentInstancesResult call() {
                        return listDeploymentInstances(listDeploymentInstancesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(
            final ListDeploymentInstancesRequest listDeploymentInstancesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentInstancesResult>() {
                    @Override
                    public ListDeploymentInstancesResult call()
                            throws Exception {
                        ListDeploymentInstancesResult result;
                        try {
                            result = listDeploymentInstances(listDeploymentInstancesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listDeploymentInstancesRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            final ListDeploymentsRequest listDeploymentsRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
                    @Override
                    public ListDeploymentsResult call() {
                        return listDeployments(listDeploymentsRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            final ListDeploymentsRequest listDeploymentsRequest,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
                    @Override
                    public ListDeploymentsResult call() throws Exception {
                        ListDeploymentsResult result;
                        try {
                            result = listDeployments(listDeploymentsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listDeploymentsRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync() {

        return listDeploymentsAsync(new ListDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeployments operation with an
     * AsyncHandler.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        return listDeploymentsAsync(new ListDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            final ListOnPremisesInstancesRequest listOnPremisesInstancesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListOnPremisesInstancesResult>() {
                    @Override
                    public ListOnPremisesInstancesResult call() {
                        return listOnPremisesInstances(listOnPremisesInstancesRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            final ListOnPremisesInstancesRequest listOnPremisesInstancesRequest,
            final com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListOnPremisesInstancesResult>() {
                    @Override
                    public ListOnPremisesInstancesResult call()
                            throws Exception {
                        ListOnPremisesInstancesResult result;
                        try {
                            result = listOnPremisesInstances(listOnPremisesInstancesRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(listOnPremisesInstancesRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync() {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation
     * with an AsyncHandler.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        return listOnPremisesInstancesAsync(
                new ListOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> registerApplicationRevisionAsync(
            final RegisterApplicationRevisionRequest registerApplicationRevisionRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        registerApplicationRevision(registerApplicationRevisionRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> registerApplicationRevisionAsync(
            final RegisterApplicationRevisionRequest registerApplicationRevisionRequest,
            final com.amazonaws.handlers.AsyncHandler<RegisterApplicationRevisionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            registerApplicationRevision(registerApplicationRevisionRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                registerApplicationRevisionRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> registerOnPremisesInstanceAsync(
            final RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        registerOnPremisesInstance(registerOnPremisesInstanceRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> registerOnPremisesInstanceAsync(
            final RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest,
            final com.amazonaws.handlers.AsyncHandler<RegisterOnPremisesInstanceRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            registerOnPremisesInstance(registerOnPremisesInstanceRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                registerOnPremisesInstanceRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> removeTagsFromOnPremisesInstancesAsync(
            final RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        removeTagsFromOnPremisesInstances(removeTagsFromOnPremisesInstancesRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> removeTagsFromOnPremisesInstancesAsync(
            final RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromOnPremisesInstancesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            removeTagsFromOnPremisesInstances(removeTagsFromOnPremisesInstancesRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                removeTagsFromOnPremisesInstancesRequest,
                                result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(
            final StopDeploymentRequest stopDeploymentRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<StopDeploymentResult>() {
                    @Override
                    public StopDeploymentResult call() {
                        return stopDeployment(stopDeploymentRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(
            final StopDeploymentRequest stopDeploymentRequest,
            final com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<StopDeploymentResult>() {
                    @Override
                    public StopDeploymentResult call() throws Exception {
                        StopDeploymentResult result;
                        try {
                            result = stopDeployment(stopDeploymentRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(stopDeploymentRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateApplicationAsync(
            final UpdateApplicationRequest updateApplicationRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() {
                        updateApplication(updateApplicationRequest);
                        return null;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateApplicationAsync(
            final UpdateApplicationRequest updateApplicationRequest,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;
                        try {
                            updateApplication(updateApplicationRequest);
                            result = null;
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler
                                .onSuccess(updateApplicationRequest, result);
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<Void> updateApplicationAsync() {

        return updateApplicationAsync(new UpdateApplicationRequest());
    }

    /**
     * Simplified method form for invoking the UpdateApplication operation with
     * an AsyncHandler.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> updateApplicationAsync(
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, Void> asyncHandler) {

        return updateApplicationAsync(new UpdateApplicationRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(
            final UpdateDeploymentGroupRequest updateDeploymentGroupRequest) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateDeploymentGroupResult>() {
                    @Override
                    public UpdateDeploymentGroupResult call() {
                        return updateDeploymentGroup(updateDeploymentGroupRequest);
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(
            final UpdateDeploymentGroupRequest updateDeploymentGroupRequest,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateDeploymentGroupResult>() {
                    @Override
                    public UpdateDeploymentGroupResult call() throws Exception {
                        UpdateDeploymentGroupResult result;
                        try {
                            result = updateDeploymentGroup(updateDeploymentGroupRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(updateDeploymentGroupRequest,
                                result);
                        return result;
                    }
                });
    }
}
