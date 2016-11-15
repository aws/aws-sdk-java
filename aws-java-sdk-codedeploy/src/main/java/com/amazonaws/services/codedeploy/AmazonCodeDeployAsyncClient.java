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
package com.amazonaws.services.codedeploy;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Client for accessing CodeDeploy asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CodeDeploy</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This reference guide provides descriptions of the AWS CodeDeploy APIs. For more information about AWS CodeDeploy, see
 * the <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide">AWS CodeDeploy User Guide</a>.
 * </p>
 * <p>
 * <b>Using the APIs</b>
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to work with the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Applications are unique identifiers used by AWS CodeDeploy to ensure the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update applications.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment configurations are sets of deployment rules and success and failure conditions used by AWS CodeDeploy
 * during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list deployment configurations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployment groups are groups of instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and update deployment groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * Instances represent Amazon EC2 instances to which application revisions are deployed. Instances are identified by
 * their Amazon EC2 tags or Auto Scaling group names. Instances belong to deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop deployments.
 * </p>
 * </li>
 * <li>
 * <p>
 * Application revisions are archive files stored in Amazon S3 buckets or GitHub repositories. These revisions contain
 * source content (such as source code, web pages, executable files, and deployment scripts) along with an application
 * specification (AppSpec) file. (The AppSpec file is unique to AWS CodeDeploy; it defines the deployment actions you
 * want AWS CodeDeploy to execute.) For application revisions stored in Amazon S3 buckets, an application revision is
 * uniquely identified by its Amazon S3 object key and its ETag, version, or both. For application revisions stored in
 * GitHub repositories, an application revision is uniquely identified by its repository name and commit ID. Application
 * revisions are deployed through deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register application revisions.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonCodeDeployAsyncClient extends AmazonCodeDeployClient implements AmazonCodeDeployAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy. A credentials provider chain will
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
    public AmazonCodeDeployAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to CodeDeploy (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the provided AWS account
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
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonCodeDeployAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeDeploy using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCodeDeployAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(AddTagsToOnPremisesInstancesRequest request) {

        return addTagsToOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToOnPremisesInstancesResult> addTagsToOnPremisesInstancesAsync(final AddTagsToOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToOnPremisesInstancesRequest, AddTagsToOnPremisesInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToOnPremisesInstancesResult>() {
            @Override
            public AddTagsToOnPremisesInstancesResult call() throws Exception {
                AddTagsToOnPremisesInstancesResult result;

                try {
                    result = addTagsToOnPremisesInstances(request);
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
    public java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(BatchGetApplicationRevisionsRequest request) {

        return batchGetApplicationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationRevisionsResult> batchGetApplicationRevisionsAsync(final BatchGetApplicationRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetApplicationRevisionsRequest, BatchGetApplicationRevisionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetApplicationRevisionsResult>() {
            @Override
            public BatchGetApplicationRevisionsResult call() throws Exception {
                BatchGetApplicationRevisionsResult result;

                try {
                    result = batchGetApplicationRevisions(request);
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
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(BatchGetApplicationsRequest request) {

        return batchGetApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(final BatchGetApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetApplicationsResult>() {
            @Override
            public BatchGetApplicationsResult call() throws Exception {
                BatchGetApplicationsResult result;

                try {
                    result = batchGetApplications(request);
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
     * Simplified method form for invoking the BatchGetApplications operation.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync() {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetApplications operation with an AsyncHandler.
     *
     * @see #batchGetApplicationsAsync(BatchGetApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetApplicationsResult> batchGetApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetApplicationsRequest, BatchGetApplicationsResult> asyncHandler) {

        return batchGetApplicationsAsync(new BatchGetApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(BatchGetDeploymentGroupsRequest request) {

        return batchGetDeploymentGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentGroupsResult> batchGetDeploymentGroupsAsync(final BatchGetDeploymentGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentGroupsRequest, BatchGetDeploymentGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentGroupsResult>() {
            @Override
            public BatchGetDeploymentGroupsResult call() throws Exception {
                BatchGetDeploymentGroupsResult result;

                try {
                    result = batchGetDeploymentGroups(request);
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
    public java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(BatchGetDeploymentInstancesRequest request) {

        return batchGetDeploymentInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentInstancesResult> batchGetDeploymentInstancesAsync(final BatchGetDeploymentInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentInstancesRequest, BatchGetDeploymentInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentInstancesResult>() {
            @Override
            public BatchGetDeploymentInstancesResult call() throws Exception {
                BatchGetDeploymentInstancesResult result;

                try {
                    result = batchGetDeploymentInstances(request);
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
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(BatchGetDeploymentsRequest request) {

        return batchGetDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(final BatchGetDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDeploymentsResult>() {
            @Override
            public BatchGetDeploymentsResult call() throws Exception {
                BatchGetDeploymentsResult result;

                try {
                    result = batchGetDeployments(request);
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
     * Simplified method form for invoking the BatchGetDeployments operation.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync() {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetDeployments operation with an AsyncHandler.
     *
     * @see #batchGetDeploymentsAsync(BatchGetDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetDeploymentsResult> batchGetDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetDeploymentsRequest, BatchGetDeploymentsResult> asyncHandler) {

        return batchGetDeploymentsAsync(new BatchGetDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest request) {

        return batchGetOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(final BatchGetOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchGetOnPremisesInstancesResult>() {
            @Override
            public BatchGetOnPremisesInstancesResult call() throws Exception {
                BatchGetOnPremisesInstancesResult result;

                try {
                    result = batchGetOnPremisesInstances(request);
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
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync() {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the BatchGetOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #batchGetOnPremisesInstancesAsync(BatchGetOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<BatchGetOnPremisesInstancesResult> batchGetOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<BatchGetOnPremisesInstancesRequest, BatchGetOnPremisesInstancesResult> asyncHandler) {

        return batchGetOnPremisesInstancesAsync(new BatchGetOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result;

                try {
                    result = createApplication(request);
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
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result;

                try {
                    result = createDeployment(request);
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
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(CreateDeploymentConfigRequest request) {

        return createDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentConfigResult> createDeploymentConfigAsync(final CreateDeploymentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentConfigRequest, CreateDeploymentConfigResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentConfigResult>() {
            @Override
            public CreateDeploymentConfigResult call() throws Exception {
                CreateDeploymentConfigResult result;

                try {
                    result = createDeploymentConfig(request);
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
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(CreateDeploymentGroupRequest request) {

        return createDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentGroupResult> createDeploymentGroupAsync(final CreateDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentGroupRequest, CreateDeploymentGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentGroupResult>() {
            @Override
            public CreateDeploymentGroupResult call() throws Exception {
                CreateDeploymentGroupResult result;

                try {
                    result = createDeploymentGroup(request);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result;

                try {
                    result = deleteApplication(request);
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
    public java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(DeleteDeploymentConfigRequest request) {

        return deleteDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentConfigResult> deleteDeploymentConfigAsync(final DeleteDeploymentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentConfigRequest, DeleteDeploymentConfigResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentConfigResult>() {
            @Override
            public DeleteDeploymentConfigResult call() throws Exception {
                DeleteDeploymentConfigResult result;

                try {
                    result = deleteDeploymentConfig(request);
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
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(DeleteDeploymentGroupRequest request) {

        return deleteDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentGroupResult> deleteDeploymentGroupAsync(final DeleteDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentGroupResult>() {
            @Override
            public DeleteDeploymentGroupResult call() throws Exception {
                DeleteDeploymentGroupResult result;

                try {
                    result = deleteDeploymentGroup(request);
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
    public java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(DeregisterOnPremisesInstanceRequest request) {

        return deregisterOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterOnPremisesInstanceResult> deregisterOnPremisesInstanceAsync(final DeregisterOnPremisesInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterOnPremisesInstanceRequest, DeregisterOnPremisesInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeregisterOnPremisesInstanceResult>() {
            @Override
            public DeregisterOnPremisesInstanceResult call() throws Exception {
                DeregisterOnPremisesInstanceResult result;

                try {
                    result = deregisterOnPremisesInstance(request);
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
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result;

                try {
                    result = getApplication(request);
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
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(GetApplicationRevisionRequest request) {

        return getApplicationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationRevisionResult> getApplicationRevisionAsync(final GetApplicationRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRevisionRequest, GetApplicationRevisionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationRevisionResult>() {
            @Override
            public GetApplicationRevisionResult call() throws Exception {
                GetApplicationRevisionResult result;

                try {
                    result = getApplicationRevision(request);
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
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result;

                try {
                    result = getDeployment(request);
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
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(GetDeploymentConfigRequest request) {

        return getDeploymentConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentConfigResult> getDeploymentConfigAsync(final GetDeploymentConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentConfigRequest, GetDeploymentConfigResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentConfigResult>() {
            @Override
            public GetDeploymentConfigResult call() throws Exception {
                GetDeploymentConfigResult result;

                try {
                    result = getDeploymentConfig(request);
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
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(GetDeploymentGroupRequest request) {

        return getDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentGroupResult> getDeploymentGroupAsync(final GetDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentGroupRequest, GetDeploymentGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentGroupResult>() {
            @Override
            public GetDeploymentGroupResult call() throws Exception {
                GetDeploymentGroupResult result;

                try {
                    result = getDeploymentGroup(request);
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
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(GetDeploymentInstanceRequest request) {

        return getDeploymentInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentInstanceResult> getDeploymentInstanceAsync(final GetDeploymentInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentInstanceRequest, GetDeploymentInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentInstanceResult>() {
            @Override
            public GetDeploymentInstanceResult call() throws Exception {
                GetDeploymentInstanceResult result;

                try {
                    result = getDeploymentInstance(request);
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
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(GetOnPremisesInstanceRequest request) {

        return getOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOnPremisesInstanceResult> getOnPremisesInstanceAsync(final GetOnPremisesInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOnPremisesInstanceRequest, GetOnPremisesInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetOnPremisesInstanceResult>() {
            @Override
            public GetOnPremisesInstanceResult call() throws Exception {
                GetOnPremisesInstanceResult result;

                try {
                    result = getOnPremisesInstance(request);
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
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(ListApplicationRevisionsRequest request) {

        return listApplicationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationRevisionsResult> listApplicationRevisionsAsync(final ListApplicationRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationRevisionsRequest, ListApplicationRevisionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationRevisionsResult>() {
            @Override
            public ListApplicationRevisionsResult call() throws Exception {
                ListApplicationRevisionsResult result;

                try {
                    result = listApplicationRevisions(request);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result;

                try {
                    result = listApplications(request);
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
     * Simplified method form for invoking the ListApplications operation.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync() {

        return listApplicationsAsync(new ListApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListApplications operation with an AsyncHandler.
     *
     * @see #listApplicationsAsync(ListApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {

        return listApplicationsAsync(new ListApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(ListDeploymentConfigsRequest request) {

        return listDeploymentConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(final ListDeploymentConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentConfigsResult>() {
            @Override
            public ListDeploymentConfigsResult call() throws Exception {
                ListDeploymentConfigsResult result;

                try {
                    result = listDeploymentConfigs(request);
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
     * Simplified method form for invoking the ListDeploymentConfigs operation.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync() {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeploymentConfigs operation with an AsyncHandler.
     *
     * @see #listDeploymentConfigsAsync(ListDeploymentConfigsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDeploymentConfigsResult> listDeploymentConfigsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentConfigsRequest, ListDeploymentConfigsResult> asyncHandler) {

        return listDeploymentConfigsAsync(new ListDeploymentConfigsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(ListDeploymentGroupsRequest request) {

        return listDeploymentGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentGroupsResult> listDeploymentGroupsAsync(final ListDeploymentGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentGroupsRequest, ListDeploymentGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentGroupsResult>() {
            @Override
            public ListDeploymentGroupsResult call() throws Exception {
                ListDeploymentGroupsResult result;

                try {
                    result = listDeploymentGroups(request);
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
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(ListDeploymentInstancesRequest request) {

        return listDeploymentInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentInstancesResult> listDeploymentInstancesAsync(final ListDeploymentInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentInstancesRequest, ListDeploymentInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentInstancesResult>() {
            @Override
            public ListDeploymentInstancesResult call() throws Exception {
                ListDeploymentInstancesResult result;

                try {
                    result = listDeploymentInstances(request);
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
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result;

                try {
                    result = listDeployments(request);
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
     * Simplified method form for invoking the ListDeployments operation.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync() {

        return listDeploymentsAsync(new ListDeploymentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDeployments operation with an AsyncHandler.
     *
     * @see #listDeploymentsAsync(ListDeploymentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {

        return listDeploymentsAsync(new ListDeploymentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest request) {

        return listOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(final ListOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListOnPremisesInstancesResult>() {
            @Override
            public ListOnPremisesInstancesResult call() throws Exception {
                ListOnPremisesInstancesResult result;

                try {
                    result = listOnPremisesInstances(request);
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
     * Simplified method form for invoking the ListOnPremisesInstances operation.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync() {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListOnPremisesInstances operation with an AsyncHandler.
     *
     * @see #listOnPremisesInstancesAsync(ListOnPremisesInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListOnPremisesInstancesResult> listOnPremisesInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListOnPremisesInstancesRequest, ListOnPremisesInstancesResult> asyncHandler) {

        return listOnPremisesInstancesAsync(new ListOnPremisesInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(RegisterApplicationRevisionRequest request) {

        return registerApplicationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterApplicationRevisionResult> registerApplicationRevisionAsync(final RegisterApplicationRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterApplicationRevisionRequest, RegisterApplicationRevisionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterApplicationRevisionResult>() {
            @Override
            public RegisterApplicationRevisionResult call() throws Exception {
                RegisterApplicationRevisionResult result;

                try {
                    result = registerApplicationRevision(request);
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
    public java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(RegisterOnPremisesInstanceRequest request) {

        return registerOnPremisesInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterOnPremisesInstanceResult> registerOnPremisesInstanceAsync(final RegisterOnPremisesInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterOnPremisesInstanceRequest, RegisterOnPremisesInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RegisterOnPremisesInstanceResult>() {
            @Override
            public RegisterOnPremisesInstanceResult call() throws Exception {
                RegisterOnPremisesInstanceResult result;

                try {
                    result = registerOnPremisesInstance(request);
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
    public java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            RemoveTagsFromOnPremisesInstancesRequest request) {

        return removeTagsFromOnPremisesInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromOnPremisesInstancesResult> removeTagsFromOnPremisesInstancesAsync(
            final RemoveTagsFromOnPremisesInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromOnPremisesInstancesRequest, RemoveTagsFromOnPremisesInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromOnPremisesInstancesResult>() {
            @Override
            public RemoveTagsFromOnPremisesInstancesResult call() throws Exception {
                RemoveTagsFromOnPremisesInstancesResult result;

                try {
                    result = removeTagsFromOnPremisesInstances(request);
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
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest request) {

        return stopDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(final StopDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopDeploymentResult>() {
            @Override
            public StopDeploymentResult call() throws Exception {
                StopDeploymentResult result;

                try {
                    result = stopDeployment(request);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result;

                try {
                    result = updateApplication(request);
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
     * Simplified method form for invoking the UpdateApplication operation.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync() {

        return updateApplicationAsync(new UpdateApplicationRequest());
    }

    /**
     * Simplified method form for invoking the UpdateApplication operation with an AsyncHandler.
     *
     * @see #updateApplicationAsync(UpdateApplicationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        return updateApplicationAsync(new UpdateApplicationRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(UpdateDeploymentGroupRequest request) {

        return updateDeploymentGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentGroupResult> updateDeploymentGroupAsync(final UpdateDeploymentGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeploymentGroupResult>() {
            @Override
            public UpdateDeploymentGroupResult call() throws Exception {
                UpdateDeploymentGroupResult result;

                try {
                    result = updateDeploymentGroup(request);
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
