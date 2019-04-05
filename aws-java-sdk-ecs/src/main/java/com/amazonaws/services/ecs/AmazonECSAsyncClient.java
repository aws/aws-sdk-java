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
package com.amazonaws.services.ecs;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon ECS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic Container Service</fullname>
 * <p>
 * Amazon Elastic Container Service (Amazon ECS) is a highly scalable, fast, container management service that makes it
 * easy to run, stop, and manage Docker containers on a cluster. You can host your cluster on a serverless
 * infrastructure that is managed by Amazon ECS by launching your services or tasks using the Fargate launch type. For
 * more control, you can host your tasks on a cluster of Amazon Elastic Compute Cloud (Amazon EC2) instances that you
 * manage by using the EC2 launch type. For more information about launch types, see <a
 * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>.
 * </p>
 * <p>
 * Amazon ECS lets you launch and stop container-based applications with simple API calls, allows you to get the state
 * of your cluster from a centralized service, and gives you access to many familiar Amazon EC2 features.
 * </p>
 * <p>
 * You can use Amazon ECS to schedule the placement of containers across your cluster based on your resource needs,
 * isolation policies, and availability requirements. Amazon ECS eliminates the need for you to operate your own cluster
 * management and configuration management systems or worry about scaling your management infrastructure.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonECSAsyncClient extends AmazonECSClient implements AmazonECSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS. A credentials provider chain will
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
     * @deprecated use {@link AmazonECSAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonECSAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS. A credentials provider chain will
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
     *        The client configuration options controlling how this client connects to Amazon ECS (ex: proxy settings,
     *        retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonECSAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonECSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the provided AWS account
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
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonECSAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonECSAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonECSAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonECSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonECSAsyncClientBuilder asyncBuilder() {
        return AmazonECSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonECSAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {
        final CreateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClusterResult>() {
            @Override
            public CreateClusterResult call() throws Exception {
                CreateClusterResult result = null;

                try {
                    result = executeCreateCluster(finalRequest);
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
     * Simplified method form for invoking the CreateCluster operation.
     *
     * @see #createClusterAsync(CreateClusterRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync() {

        return createClusterAsync(new CreateClusterRequest());
    }

    /**
     * Simplified method form for invoking the CreateCluster operation with an AsyncHandler.
     *
     * @see #createClusterAsync(CreateClusterRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {

        return createClusterAsync(new CreateClusterRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest request) {

        return createServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(final CreateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler) {
        final CreateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceResult>() {
            @Override
            public CreateServiceResult call() throws Exception {
                CreateServiceResult result = null;

                try {
                    result = executeCreateService(finalRequest);
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
    public java.util.concurrent.Future<CreateTaskSetResult> createTaskSetAsync(CreateTaskSetRequest request) {

        return createTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskSetResult> createTaskSetAsync(final CreateTaskSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTaskSetRequest, CreateTaskSetResult> asyncHandler) {
        final CreateTaskSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTaskSetResult>() {
            @Override
            public CreateTaskSetResult call() throws Exception {
                CreateTaskSetResult result = null;

                try {
                    result = executeCreateTaskSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteAccountSettingResult> deleteAccountSettingAsync(DeleteAccountSettingRequest request) {

        return deleteAccountSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountSettingResult> deleteAccountSettingAsync(final DeleteAccountSettingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountSettingRequest, DeleteAccountSettingResult> asyncHandler) {
        final DeleteAccountSettingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountSettingResult>() {
            @Override
            public DeleteAccountSettingResult call() throws Exception {
                DeleteAccountSettingResult result = null;

                try {
                    result = executeDeleteAccountSetting(finalRequest);
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
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest request) {

        return deleteAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(final DeleteAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttributesRequest, DeleteAttributesResult> asyncHandler) {
        final DeleteAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttributesResult>() {
            @Override
            public DeleteAttributesResult call() throws Exception {
                DeleteAttributesResult result = null;

                try {
                    result = executeDeleteAttributes(finalRequest);
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
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {
        final DeleteClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterResult>() {
            @Override
            public DeleteClusterResult call() throws Exception {
                DeleteClusterResult result = null;

                try {
                    result = executeDeleteCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest request) {

        return deleteServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(final DeleteServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler) {
        final DeleteServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceResult>() {
            @Override
            public DeleteServiceResult call() throws Exception {
                DeleteServiceResult result = null;

                try {
                    result = executeDeleteService(finalRequest);
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
    public java.util.concurrent.Future<DeleteTaskSetResult> deleteTaskSetAsync(DeleteTaskSetRequest request) {

        return deleteTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskSetResult> deleteTaskSetAsync(final DeleteTaskSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTaskSetRequest, DeleteTaskSetResult> asyncHandler) {
        final DeleteTaskSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTaskSetResult>() {
            @Override
            public DeleteTaskSetResult call() throws Exception {
                DeleteTaskSetResult result = null;

                try {
                    result = executeDeleteTaskSet(finalRequest);
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
    public java.util.concurrent.Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(DeregisterContainerInstanceRequest request) {

        return deregisterContainerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterContainerInstanceResult> deregisterContainerInstanceAsync(final DeregisterContainerInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterContainerInstanceRequest, DeregisterContainerInstanceResult> asyncHandler) {
        final DeregisterContainerInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterContainerInstanceResult>() {
            @Override
            public DeregisterContainerInstanceResult call() throws Exception {
                DeregisterContainerInstanceResult result = null;

                try {
                    result = executeDeregisterContainerInstance(finalRequest);
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
    public java.util.concurrent.Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(DeregisterTaskDefinitionRequest request) {

        return deregisterTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTaskDefinitionResult> deregisterTaskDefinitionAsync(final DeregisterTaskDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTaskDefinitionRequest, DeregisterTaskDefinitionResult> asyncHandler) {
        final DeregisterTaskDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTaskDefinitionResult>() {
            @Override
            public DeregisterTaskDefinitionResult call() throws Exception {
                DeregisterTaskDefinitionResult result = null;

                try {
                    result = executeDeregisterTaskDefinition(finalRequest);
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
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest request) {

        return describeClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(final DescribeClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler) {
        final DescribeClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClustersResult>() {
            @Override
            public DescribeClustersResult call() throws Exception {
                DescribeClustersResult result = null;

                try {
                    result = executeDescribeClusters(finalRequest);
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
     * Simplified method form for invoking the DescribeClusters operation.
     *
     * @see #describeClustersAsync(DescribeClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync() {

        return describeClustersAsync(new DescribeClustersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusters operation with an AsyncHandler.
     *
     * @see #describeClustersAsync(DescribeClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler) {

        return describeClustersAsync(new DescribeClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(DescribeContainerInstancesRequest request) {

        return describeContainerInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContainerInstancesResult> describeContainerInstancesAsync(final DescribeContainerInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContainerInstancesRequest, DescribeContainerInstancesResult> asyncHandler) {
        final DescribeContainerInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContainerInstancesResult>() {
            @Override
            public DescribeContainerInstancesResult call() throws Exception {
                DescribeContainerInstancesResult result = null;

                try {
                    result = executeDescribeContainerInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request) {

        return describeServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(final DescribeServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {
        final DescribeServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServicesResult>() {
            @Override
            public DescribeServicesResult call() throws Exception {
                DescribeServicesResult result = null;

                try {
                    result = executeDescribeServices(finalRequest);
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
    public java.util.concurrent.Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(DescribeTaskDefinitionRequest request) {

        return describeTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskDefinitionResult> describeTaskDefinitionAsync(final DescribeTaskDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTaskDefinitionRequest, DescribeTaskDefinitionResult> asyncHandler) {
        final DescribeTaskDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTaskDefinitionResult>() {
            @Override
            public DescribeTaskDefinitionResult call() throws Exception {
                DescribeTaskDefinitionResult result = null;

                try {
                    result = executeDescribeTaskDefinition(finalRequest);
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
    public java.util.concurrent.Future<DescribeTaskSetsResult> describeTaskSetsAsync(DescribeTaskSetsRequest request) {

        return describeTaskSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTaskSetsResult> describeTaskSetsAsync(final DescribeTaskSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTaskSetsRequest, DescribeTaskSetsResult> asyncHandler) {
        final DescribeTaskSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTaskSetsResult>() {
            @Override
            public DescribeTaskSetsResult call() throws Exception {
                DescribeTaskSetsResult result = null;

                try {
                    result = executeDescribeTaskSets(finalRequest);
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
    public java.util.concurrent.Future<DescribeTasksResult> describeTasksAsync(DescribeTasksRequest request) {

        return describeTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTasksResult> describeTasksAsync(final DescribeTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTasksRequest, DescribeTasksResult> asyncHandler) {
        final DescribeTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTasksResult>() {
            @Override
            public DescribeTasksResult call() throws Exception {
                DescribeTasksResult result = null;

                try {
                    result = executeDescribeTasks(finalRequest);
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
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(DiscoverPollEndpointRequest request) {

        return discoverPollEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(final DiscoverPollEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler) {
        final DiscoverPollEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DiscoverPollEndpointResult>() {
            @Override
            public DiscoverPollEndpointResult call() throws Exception {
                DiscoverPollEndpointResult result = null;

                try {
                    result = executeDiscoverPollEndpoint(finalRequest);
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
     * Simplified method form for invoking the DiscoverPollEndpoint operation.
     *
     * @see #discoverPollEndpointAsync(DiscoverPollEndpointRequest)
     */
    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync() {

        return discoverPollEndpointAsync(new DiscoverPollEndpointRequest());
    }

    /**
     * Simplified method form for invoking the DiscoverPollEndpoint operation with an AsyncHandler.
     *
     * @see #discoverPollEndpointAsync(DiscoverPollEndpointRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DiscoverPollEndpointResult> discoverPollEndpointAsync(
            com.amazonaws.handlers.AsyncHandler<DiscoverPollEndpointRequest, DiscoverPollEndpointResult> asyncHandler) {

        return discoverPollEndpointAsync(new DiscoverPollEndpointRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListAccountSettingsResult> listAccountSettingsAsync(ListAccountSettingsRequest request) {

        return listAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountSettingsResult> listAccountSettingsAsync(final ListAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountSettingsRequest, ListAccountSettingsResult> asyncHandler) {
        final ListAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountSettingsResult>() {
            @Override
            public ListAccountSettingsResult call() throws Exception {
                ListAccountSettingsResult result = null;

                try {
                    result = executeListAccountSettings(finalRequest);
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
    public java.util.concurrent.Future<ListAttributesResult> listAttributesAsync(ListAttributesRequest request) {

        return listAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttributesResult> listAttributesAsync(final ListAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttributesRequest, ListAttributesResult> asyncHandler) {
        final ListAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttributesResult>() {
            @Override
            public ListAttributesResult call() throws Exception {
                ListAttributesResult result = null;

                try {
                    result = executeListAttributes(finalRequest);
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
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(final ListClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {
        final ListClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClustersResult>() {
            @Override
            public ListClustersResult call() throws Exception {
                ListClustersResult result = null;

                try {
                    result = executeListClusters(finalRequest);
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
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync() {

        return listClustersAsync(new ListClustersRequest());
    }

    /**
     * Simplified method form for invoking the ListClusters operation with an AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        return listClustersAsync(new ListClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(ListContainerInstancesRequest request) {

        return listContainerInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(final ListContainerInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler) {
        final ListContainerInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContainerInstancesResult>() {
            @Override
            public ListContainerInstancesResult call() throws Exception {
                ListContainerInstancesResult result = null;

                try {
                    result = executeListContainerInstances(finalRequest);
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
     * Simplified method form for invoking the ListContainerInstances operation.
     *
     * @see #listContainerInstancesAsync(ListContainerInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync() {

        return listContainerInstancesAsync(new ListContainerInstancesRequest());
    }

    /**
     * Simplified method form for invoking the ListContainerInstances operation with an AsyncHandler.
     *
     * @see #listContainerInstancesAsync(ListContainerInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListContainerInstancesResult> listContainerInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListContainerInstancesRequest, ListContainerInstancesResult> asyncHandler) {

        return listContainerInstancesAsync(new ListContainerInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(final ListServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {
        final ListServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicesResult>() {
            @Override
            public ListServicesResult call() throws Exception {
                ListServicesResult result = null;

                try {
                    result = executeListServices(finalRequest);
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
     * Simplified method form for invoking the ListServices operation.
     *
     * @see #listServicesAsync(ListServicesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync() {

        return listServicesAsync(new ListServicesRequest());
    }

    /**
     * Simplified method form for invoking the ListServices operation with an AsyncHandler.
     *
     * @see #listServicesAsync(ListServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {

        return listServicesAsync(new ListServicesRequest(), asyncHandler);
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
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest request) {

        return listTaskDefinitionFamiliesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(final ListTaskDefinitionFamiliesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler) {
        final ListTaskDefinitionFamiliesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTaskDefinitionFamiliesResult>() {
            @Override
            public ListTaskDefinitionFamiliesResult call() throws Exception {
                ListTaskDefinitionFamiliesResult result = null;

                try {
                    result = executeListTaskDefinitionFamilies(finalRequest);
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
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation.
     *
     * @see #listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync() {

        return listTaskDefinitionFamiliesAsync(new ListTaskDefinitionFamiliesRequest());
    }

    /**
     * Simplified method form for invoking the ListTaskDefinitionFamilies operation with an AsyncHandler.
     *
     * @see #listTaskDefinitionFamiliesAsync(ListTaskDefinitionFamiliesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionFamiliesResult> listTaskDefinitionFamiliesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionFamiliesRequest, ListTaskDefinitionFamiliesResult> asyncHandler) {

        return listTaskDefinitionFamiliesAsync(new ListTaskDefinitionFamiliesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(ListTaskDefinitionsRequest request) {

        return listTaskDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(final ListTaskDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler) {
        final ListTaskDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTaskDefinitionsResult>() {
            @Override
            public ListTaskDefinitionsResult call() throws Exception {
                ListTaskDefinitionsResult result = null;

                try {
                    result = executeListTaskDefinitions(finalRequest);
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
     * Simplified method form for invoking the ListTaskDefinitions operation.
     *
     * @see #listTaskDefinitionsAsync(ListTaskDefinitionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync() {

        return listTaskDefinitionsAsync(new ListTaskDefinitionsRequest());
    }

    /**
     * Simplified method form for invoking the ListTaskDefinitions operation with an AsyncHandler.
     *
     * @see #listTaskDefinitionsAsync(ListTaskDefinitionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTaskDefinitionsResult> listTaskDefinitionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListTaskDefinitionsRequest, ListTaskDefinitionsResult> asyncHandler) {

        return listTaskDefinitionsAsync(new ListTaskDefinitionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request) {

        return listTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(final ListTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {
        final ListTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTasksResult>() {
            @Override
            public ListTasksResult call() throws Exception {
                ListTasksResult result = null;

                try {
                    result = executeListTasks(finalRequest);
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
     * Simplified method form for invoking the ListTasks operation.
     *
     * @see #listTasksAsync(ListTasksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync() {

        return listTasksAsync(new ListTasksRequest());
    }

    /**
     * Simplified method form for invoking the ListTasks operation with an AsyncHandler.
     *
     * @see #listTasksAsync(ListTasksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {

        return listTasksAsync(new ListTasksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingResult> putAccountSettingAsync(PutAccountSettingRequest request) {

        return putAccountSettingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingResult> putAccountSettingAsync(final PutAccountSettingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountSettingRequest, PutAccountSettingResult> asyncHandler) {
        final PutAccountSettingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountSettingResult>() {
            @Override
            public PutAccountSettingResult call() throws Exception {
                PutAccountSettingResult result = null;

                try {
                    result = executePutAccountSetting(finalRequest);
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
    public java.util.concurrent.Future<PutAccountSettingDefaultResult> putAccountSettingDefaultAsync(PutAccountSettingDefaultRequest request) {

        return putAccountSettingDefaultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountSettingDefaultResult> putAccountSettingDefaultAsync(final PutAccountSettingDefaultRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccountSettingDefaultRequest, PutAccountSettingDefaultResult> asyncHandler) {
        final PutAccountSettingDefaultRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccountSettingDefaultResult>() {
            @Override
            public PutAccountSettingDefaultResult call() throws Exception {
                PutAccountSettingDefaultResult result = null;

                try {
                    result = executePutAccountSettingDefault(finalRequest);
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
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest request) {

        return putAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(final PutAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAttributesRequest, PutAttributesResult> asyncHandler) {
        final PutAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAttributesResult>() {
            @Override
            public PutAttributesResult call() throws Exception {
                PutAttributesResult result = null;

                try {
                    result = executePutAttributes(finalRequest);
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
    public java.util.concurrent.Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(RegisterContainerInstanceRequest request) {

        return registerContainerInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterContainerInstanceResult> registerContainerInstanceAsync(final RegisterContainerInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterContainerInstanceRequest, RegisterContainerInstanceResult> asyncHandler) {
        final RegisterContainerInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterContainerInstanceResult>() {
            @Override
            public RegisterContainerInstanceResult call() throws Exception {
                RegisterContainerInstanceResult result = null;

                try {
                    result = executeRegisterContainerInstance(finalRequest);
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
    public java.util.concurrent.Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(RegisterTaskDefinitionRequest request) {

        return registerTaskDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTaskDefinitionResult> registerTaskDefinitionAsync(final RegisterTaskDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTaskDefinitionRequest, RegisterTaskDefinitionResult> asyncHandler) {
        final RegisterTaskDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTaskDefinitionResult>() {
            @Override
            public RegisterTaskDefinitionResult call() throws Exception {
                RegisterTaskDefinitionResult result = null;

                try {
                    result = executeRegisterTaskDefinition(finalRequest);
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
    public java.util.concurrent.Future<RunTaskResult> runTaskAsync(RunTaskRequest request) {

        return runTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunTaskResult> runTaskAsync(final RunTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunTaskRequest, RunTaskResult> asyncHandler) {
        final RunTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RunTaskResult>() {
            @Override
            public RunTaskResult call() throws Exception {
                RunTaskResult result = null;

                try {
                    result = executeRunTask(finalRequest);
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
    public java.util.concurrent.Future<StartTaskResult> startTaskAsync(StartTaskRequest request) {

        return startTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTaskResult> startTaskAsync(final StartTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTaskRequest, StartTaskResult> asyncHandler) {
        final StartTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTaskResult>() {
            @Override
            public StartTaskResult call() throws Exception {
                StartTaskResult result = null;

                try {
                    result = executeStartTask(finalRequest);
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
    public java.util.concurrent.Future<StopTaskResult> stopTaskAsync(StopTaskRequest request) {

        return stopTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopTaskResult> stopTaskAsync(final StopTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopTaskRequest, StopTaskResult> asyncHandler) {
        final StopTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopTaskResult>() {
            @Override
            public StopTaskResult call() throws Exception {
                StopTaskResult result = null;

                try {
                    result = executeStopTask(finalRequest);
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
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(SubmitContainerStateChangeRequest request) {

        return submitContainerStateChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(final SubmitContainerStateChangeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler) {
        final SubmitContainerStateChangeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubmitContainerStateChangeResult>() {
            @Override
            public SubmitContainerStateChangeResult call() throws Exception {
                SubmitContainerStateChangeResult result = null;

                try {
                    result = executeSubmitContainerStateChange(finalRequest);
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
     * Simplified method form for invoking the SubmitContainerStateChange operation.
     *
     * @see #submitContainerStateChangeAsync(SubmitContainerStateChangeRequest)
     */
    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync() {

        return submitContainerStateChangeAsync(new SubmitContainerStateChangeRequest());
    }

    /**
     * Simplified method form for invoking the SubmitContainerStateChange operation with an AsyncHandler.
     *
     * @see #submitContainerStateChangeAsync(SubmitContainerStateChangeRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SubmitContainerStateChangeResult> submitContainerStateChangeAsync(
            com.amazonaws.handlers.AsyncHandler<SubmitContainerStateChangeRequest, SubmitContainerStateChangeResult> asyncHandler) {

        return submitContainerStateChangeAsync(new SubmitContainerStateChangeRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(SubmitTaskStateChangeRequest request) {

        return submitTaskStateChangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitTaskStateChangeResult> submitTaskStateChangeAsync(final SubmitTaskStateChangeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubmitTaskStateChangeRequest, SubmitTaskStateChangeResult> asyncHandler) {
        final SubmitTaskStateChangeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubmitTaskStateChangeResult>() {
            @Override
            public SubmitTaskStateChangeResult call() throws Exception {
                SubmitTaskStateChangeResult result = null;

                try {
                    result = executeSubmitTaskStateChange(finalRequest);
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
    public java.util.concurrent.Future<UpdateContainerAgentResult> updateContainerAgentAsync(UpdateContainerAgentRequest request) {

        return updateContainerAgentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerAgentResult> updateContainerAgentAsync(final UpdateContainerAgentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContainerAgentRequest, UpdateContainerAgentResult> asyncHandler) {
        final UpdateContainerAgentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContainerAgentResult>() {
            @Override
            public UpdateContainerAgentResult call() throws Exception {
                UpdateContainerAgentResult result = null;

                try {
                    result = executeUpdateContainerAgent(finalRequest);
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
    public java.util.concurrent.Future<UpdateContainerInstancesStateResult> updateContainerInstancesStateAsync(UpdateContainerInstancesStateRequest request) {

        return updateContainerInstancesStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContainerInstancesStateResult> updateContainerInstancesStateAsync(
            final UpdateContainerInstancesStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContainerInstancesStateRequest, UpdateContainerInstancesStateResult> asyncHandler) {
        final UpdateContainerInstancesStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContainerInstancesStateResult>() {
            @Override
            public UpdateContainerInstancesStateResult call() throws Exception {
                UpdateContainerInstancesStateResult result = null;

                try {
                    result = executeUpdateContainerInstancesState(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest request) {

        return updateServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(final UpdateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler) {
        final UpdateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceResult>() {
            @Override
            public UpdateServiceResult call() throws Exception {
                UpdateServiceResult result = null;

                try {
                    result = executeUpdateService(finalRequest);
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
    public java.util.concurrent.Future<UpdateServicePrimaryTaskSetResult> updateServicePrimaryTaskSetAsync(UpdateServicePrimaryTaskSetRequest request) {

        return updateServicePrimaryTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServicePrimaryTaskSetResult> updateServicePrimaryTaskSetAsync(final UpdateServicePrimaryTaskSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServicePrimaryTaskSetRequest, UpdateServicePrimaryTaskSetResult> asyncHandler) {
        final UpdateServicePrimaryTaskSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServicePrimaryTaskSetResult>() {
            @Override
            public UpdateServicePrimaryTaskSetResult call() throws Exception {
                UpdateServicePrimaryTaskSetResult result = null;

                try {
                    result = executeUpdateServicePrimaryTaskSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateTaskSetResult> updateTaskSetAsync(UpdateTaskSetRequest request) {

        return updateTaskSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskSetResult> updateTaskSetAsync(final UpdateTaskSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTaskSetRequest, UpdateTaskSetResult> asyncHandler) {
        final UpdateTaskSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTaskSetResult>() {
            @Override
            public UpdateTaskSetResult call() throws Exception {
                UpdateTaskSetResult result = null;

                try {
                    result = executeUpdateTaskSet(finalRequest);
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
