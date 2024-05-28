/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Database Migration Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Database Migration Service</fullname>
 * <p>
 * Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source
 * databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP
 * Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as
 * heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about DMS, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What Is
 * Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDatabaseMigrationServiceAsyncClient extends AWSDatabaseMigrationServiceClient implements AWSDatabaseMigrationServiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service. A credentials
     * provider chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Database Migration Service
     *        (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     *             and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * provided AWS account credentials provider and client configuration options.
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
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     *             and
     *             {@link AWSDatabaseMigrationServiceAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AWSDatabaseMigrationServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AWSDatabaseMigrationServiceAsyncClientBuilder asyncBuilder() {
        return AWSDatabaseMigrationServiceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDatabaseMigrationServiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSDatabaseMigrationServiceAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {
        final AddTagsToResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;

                try {
                    result = executeAddTagsToResource(finalRequest);
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
    public java.util.concurrent.Future<ApplyPendingMaintenanceActionResult> applyPendingMaintenanceActionAsync(ApplyPendingMaintenanceActionRequest request) {

        return applyPendingMaintenanceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplyPendingMaintenanceActionResult> applyPendingMaintenanceActionAsync(
            final ApplyPendingMaintenanceActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ApplyPendingMaintenanceActionResult> asyncHandler) {
        final ApplyPendingMaintenanceActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ApplyPendingMaintenanceActionResult>() {
            @Override
            public ApplyPendingMaintenanceActionResult call() throws Exception {
                ApplyPendingMaintenanceActionResult result = null;

                try {
                    result = executeApplyPendingMaintenanceAction(finalRequest);
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
    public java.util.concurrent.Future<BatchStartRecommendationsResult> batchStartRecommendationsAsync(BatchStartRecommendationsRequest request) {

        return batchStartRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchStartRecommendationsResult> batchStartRecommendationsAsync(final BatchStartRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchStartRecommendationsRequest, BatchStartRecommendationsResult> asyncHandler) {
        final BatchStartRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchStartRecommendationsResult>() {
            @Override
            public BatchStartRecommendationsResult call() throws Exception {
                BatchStartRecommendationsResult result = null;

                try {
                    result = executeBatchStartRecommendations(finalRequest);
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
    public java.util.concurrent.Future<CancelReplicationTaskAssessmentRunResult> cancelReplicationTaskAssessmentRunAsync(
            CancelReplicationTaskAssessmentRunRequest request) {

        return cancelReplicationTaskAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelReplicationTaskAssessmentRunResult> cancelReplicationTaskAssessmentRunAsync(
            final CancelReplicationTaskAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelReplicationTaskAssessmentRunRequest, CancelReplicationTaskAssessmentRunResult> asyncHandler) {
        final CancelReplicationTaskAssessmentRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelReplicationTaskAssessmentRunResult>() {
            @Override
            public CancelReplicationTaskAssessmentRunResult call() throws Exception {
                CancelReplicationTaskAssessmentRunResult result = null;

                try {
                    result = executeCancelReplicationTaskAssessmentRun(finalRequest);
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
    public java.util.concurrent.Future<CreateDataProviderResult> createDataProviderAsync(CreateDataProviderRequest request) {

        return createDataProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataProviderResult> createDataProviderAsync(final CreateDataProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataProviderRequest, CreateDataProviderResult> asyncHandler) {
        final CreateDataProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataProviderResult>() {
            @Override
            public CreateDataProviderResult call() throws Exception {
                CreateDataProviderResult result = null;

                try {
                    result = executeCreateDataProvider(finalRequest);
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
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(final CreateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {
        final CreateEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointResult>() {
            @Override
            public CreateEndpointResult call() throws Exception {
                CreateEndpointResult result = null;

                try {
                    result = executeCreateEndpoint(finalRequest);
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
    public java.util.concurrent.Future<CreateEventSubscriptionResult> createEventSubscriptionAsync(CreateEventSubscriptionRequest request) {

        return createEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventSubscriptionResult> createEventSubscriptionAsync(final CreateEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, CreateEventSubscriptionResult> asyncHandler) {
        final CreateEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventSubscriptionResult>() {
            @Override
            public CreateEventSubscriptionResult call() throws Exception {
                CreateEventSubscriptionResult result = null;

                try {
                    result = executeCreateEventSubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateFleetAdvisorCollectorResult> createFleetAdvisorCollectorAsync(CreateFleetAdvisorCollectorRequest request) {

        return createFleetAdvisorCollectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetAdvisorCollectorResult> createFleetAdvisorCollectorAsync(final CreateFleetAdvisorCollectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetAdvisorCollectorRequest, CreateFleetAdvisorCollectorResult> asyncHandler) {
        final CreateFleetAdvisorCollectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetAdvisorCollectorResult>() {
            @Override
            public CreateFleetAdvisorCollectorResult call() throws Exception {
                CreateFleetAdvisorCollectorResult result = null;

                try {
                    result = executeCreateFleetAdvisorCollector(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(CreateInstanceProfileRequest request) {

        return createInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(final CreateInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceProfileRequest, CreateInstanceProfileResult> asyncHandler) {
        final CreateInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceProfileResult>() {
            @Override
            public CreateInstanceProfileResult call() throws Exception {
                CreateInstanceProfileResult result = null;

                try {
                    result = executeCreateInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateMigrationProjectResult> createMigrationProjectAsync(CreateMigrationProjectRequest request) {

        return createMigrationProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMigrationProjectResult> createMigrationProjectAsync(final CreateMigrationProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMigrationProjectRequest, CreateMigrationProjectResult> asyncHandler) {
        final CreateMigrationProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMigrationProjectResult>() {
            @Override
            public CreateMigrationProjectResult call() throws Exception {
                CreateMigrationProjectResult result = null;

                try {
                    result = executeCreateMigrationProject(finalRequest);
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
    public java.util.concurrent.Future<CreateReplicationConfigResult> createReplicationConfigAsync(CreateReplicationConfigRequest request) {

        return createReplicationConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationConfigResult> createReplicationConfigAsync(final CreateReplicationConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigRequest, CreateReplicationConfigResult> asyncHandler) {
        final CreateReplicationConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationConfigResult>() {
            @Override
            public CreateReplicationConfigResult call() throws Exception {
                CreateReplicationConfigResult result = null;

                try {
                    result = executeCreateReplicationConfig(finalRequest);
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
    public java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(CreateReplicationInstanceRequest request) {

        return createReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(final CreateReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationInstanceRequest, CreateReplicationInstanceResult> asyncHandler) {
        final CreateReplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationInstanceResult>() {
            @Override
            public CreateReplicationInstanceResult call() throws Exception {
                CreateReplicationInstanceResult result = null;

                try {
                    result = executeCreateReplicationInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(CreateReplicationSubnetGroupRequest request) {

        return createReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(final CreateReplicationSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationSubnetGroupRequest, CreateReplicationSubnetGroupResult> asyncHandler) {
        final CreateReplicationSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationSubnetGroupResult>() {
            @Override
            public CreateReplicationSubnetGroupResult call() throws Exception {
                CreateReplicationSubnetGroupResult result = null;

                try {
                    result = executeCreateReplicationSubnetGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(CreateReplicationTaskRequest request) {

        return createReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(final CreateReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationTaskRequest, CreateReplicationTaskResult> asyncHandler) {
        final CreateReplicationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationTaskResult>() {
            @Override
            public CreateReplicationTaskResult call() throws Exception {
                CreateReplicationTaskResult result = null;

                try {
                    result = executeCreateReplicationTask(finalRequest);
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
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(final DeleteCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler) {
        final DeleteCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCertificateResult>() {
            @Override
            public DeleteCertificateResult call() throws Exception {
                DeleteCertificateResult result = null;

                try {
                    result = executeDeleteCertificate(finalRequest);
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
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(final DeleteConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {
        final DeleteConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConnectionResult>() {
            @Override
            public DeleteConnectionResult call() throws Exception {
                DeleteConnectionResult result = null;

                try {
                    result = executeDeleteConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteDataProviderResult> deleteDataProviderAsync(DeleteDataProviderRequest request) {

        return deleteDataProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataProviderResult> deleteDataProviderAsync(final DeleteDataProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataProviderRequest, DeleteDataProviderResult> asyncHandler) {
        final DeleteDataProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataProviderResult>() {
            @Override
            public DeleteDataProviderResult call() throws Exception {
                DeleteDataProviderResult result = null;

                try {
                    result = executeDeleteDataProvider(finalRequest);
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
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {
        final DeleteEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result = null;

                try {
                    result = executeDeleteEndpoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request) {

        return deleteEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(final DeleteEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, DeleteEventSubscriptionResult> asyncHandler) {
        final DeleteEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventSubscriptionResult>() {
            @Override
            public DeleteEventSubscriptionResult call() throws Exception {
                DeleteEventSubscriptionResult result = null;

                try {
                    result = executeDeleteEventSubscription(finalRequest);
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
    public java.util.concurrent.Future<DeleteFleetAdvisorCollectorResult> deleteFleetAdvisorCollectorAsync(DeleteFleetAdvisorCollectorRequest request) {

        return deleteFleetAdvisorCollectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetAdvisorCollectorResult> deleteFleetAdvisorCollectorAsync(final DeleteFleetAdvisorCollectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetAdvisorCollectorRequest, DeleteFleetAdvisorCollectorResult> asyncHandler) {
        final DeleteFleetAdvisorCollectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetAdvisorCollectorResult>() {
            @Override
            public DeleteFleetAdvisorCollectorResult call() throws Exception {
                DeleteFleetAdvisorCollectorResult result = null;

                try {
                    result = executeDeleteFleetAdvisorCollector(finalRequest);
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
    public java.util.concurrent.Future<DeleteFleetAdvisorDatabasesResult> deleteFleetAdvisorDatabasesAsync(DeleteFleetAdvisorDatabasesRequest request) {

        return deleteFleetAdvisorDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetAdvisorDatabasesResult> deleteFleetAdvisorDatabasesAsync(final DeleteFleetAdvisorDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetAdvisorDatabasesRequest, DeleteFleetAdvisorDatabasesResult> asyncHandler) {
        final DeleteFleetAdvisorDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetAdvisorDatabasesResult>() {
            @Override
            public DeleteFleetAdvisorDatabasesResult call() throws Exception {
                DeleteFleetAdvisorDatabasesResult result = null;

                try {
                    result = executeDeleteFleetAdvisorDatabases(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(DeleteInstanceProfileRequest request) {

        return deleteInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceProfileResult> deleteInstanceProfileAsync(final DeleteInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceProfileRequest, DeleteInstanceProfileResult> asyncHandler) {
        final DeleteInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceProfileResult>() {
            @Override
            public DeleteInstanceProfileResult call() throws Exception {
                DeleteInstanceProfileResult result = null;

                try {
                    result = executeDeleteInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteMigrationProjectResult> deleteMigrationProjectAsync(DeleteMigrationProjectRequest request) {

        return deleteMigrationProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMigrationProjectResult> deleteMigrationProjectAsync(final DeleteMigrationProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMigrationProjectRequest, DeleteMigrationProjectResult> asyncHandler) {
        final DeleteMigrationProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMigrationProjectResult>() {
            @Override
            public DeleteMigrationProjectResult call() throws Exception {
                DeleteMigrationProjectResult result = null;

                try {
                    result = executeDeleteMigrationProject(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationConfigResult> deleteReplicationConfigAsync(DeleteReplicationConfigRequest request) {

        return deleteReplicationConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationConfigResult> deleteReplicationConfigAsync(final DeleteReplicationConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigRequest, DeleteReplicationConfigResult> asyncHandler) {
        final DeleteReplicationConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationConfigResult>() {
            @Override
            public DeleteReplicationConfigResult call() throws Exception {
                DeleteReplicationConfigResult result = null;

                try {
                    result = executeDeleteReplicationConfig(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(DeleteReplicationInstanceRequest request) {

        return deleteReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(final DeleteReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationInstanceRequest, DeleteReplicationInstanceResult> asyncHandler) {
        final DeleteReplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationInstanceResult>() {
            @Override
            public DeleteReplicationInstanceResult call() throws Exception {
                DeleteReplicationInstanceResult result = null;

                try {
                    result = executeDeleteReplicationInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(DeleteReplicationSubnetGroupRequest request) {

        return deleteReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(final DeleteReplicationSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationSubnetGroupRequest, DeleteReplicationSubnetGroupResult> asyncHandler) {
        final DeleteReplicationSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationSubnetGroupResult>() {
            @Override
            public DeleteReplicationSubnetGroupResult call() throws Exception {
                DeleteReplicationSubnetGroupResult result = null;

                try {
                    result = executeDeleteReplicationSubnetGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(DeleteReplicationTaskRequest request) {

        return deleteReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(final DeleteReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationTaskRequest, DeleteReplicationTaskResult> asyncHandler) {
        final DeleteReplicationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationTaskResult>() {
            @Override
            public DeleteReplicationTaskResult call() throws Exception {
                DeleteReplicationTaskResult result = null;

                try {
                    result = executeDeleteReplicationTask(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationTaskAssessmentRunResult> deleteReplicationTaskAssessmentRunAsync(
            DeleteReplicationTaskAssessmentRunRequest request) {

        return deleteReplicationTaskAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTaskAssessmentRunResult> deleteReplicationTaskAssessmentRunAsync(
            final DeleteReplicationTaskAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationTaskAssessmentRunRequest, DeleteReplicationTaskAssessmentRunResult> asyncHandler) {
        final DeleteReplicationTaskAssessmentRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationTaskAssessmentRunResult>() {
            @Override
            public DeleteReplicationTaskAssessmentRunResult call() throws Exception {
                DeleteReplicationTaskAssessmentRunResult result = null;

                try {
                    result = executeDeleteReplicationTaskAssessmentRun(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {
        final DescribeAccountAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result = null;

                try {
                    result = executeDescribeAccountAttributes(finalRequest);
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
    public java.util.concurrent.Future<DescribeApplicableIndividualAssessmentsResult> describeApplicableIndividualAssessmentsAsync(
            DescribeApplicableIndividualAssessmentsRequest request) {

        return describeApplicableIndividualAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicableIndividualAssessmentsResult> describeApplicableIndividualAssessmentsAsync(
            final DescribeApplicableIndividualAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeApplicableIndividualAssessmentsRequest, DescribeApplicableIndividualAssessmentsResult> asyncHandler) {
        final DescribeApplicableIndividualAssessmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeApplicableIndividualAssessmentsResult>() {
            @Override
            public DescribeApplicableIndividualAssessmentsResult call() throws Exception {
                DescribeApplicableIndividualAssessmentsResult result = null;

                try {
                    result = executeDescribeApplicableIndividualAssessments(finalRequest);
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
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest request) {

        return describeCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(final DescribeCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler) {
        final DescribeCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificatesResult>() {
            @Override
            public DescribeCertificatesResult call() throws Exception {
                DescribeCertificatesResult result = null;

                try {
                    result = executeDescribeCertificates(finalRequest);
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
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest request) {

        return describeConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(final DescribeConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {
        final DescribeConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectionsResult>() {
            @Override
            public DescribeConnectionsResult call() throws Exception {
                DescribeConnectionsResult result = null;

                try {
                    result = executeDescribeConnections(finalRequest);
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
    public java.util.concurrent.Future<DescribeConversionConfigurationResult> describeConversionConfigurationAsync(
            DescribeConversionConfigurationRequest request) {

        return describeConversionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConversionConfigurationResult> describeConversionConfigurationAsync(
            final DescribeConversionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConversionConfigurationRequest, DescribeConversionConfigurationResult> asyncHandler) {
        final DescribeConversionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConversionConfigurationResult>() {
            @Override
            public DescribeConversionConfigurationResult call() throws Exception {
                DescribeConversionConfigurationResult result = null;

                try {
                    result = executeDescribeConversionConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeDataProvidersResult> describeDataProvidersAsync(DescribeDataProvidersRequest request) {

        return describeDataProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataProvidersResult> describeDataProvidersAsync(final DescribeDataProvidersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataProvidersRequest, DescribeDataProvidersResult> asyncHandler) {
        final DescribeDataProvidersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataProvidersResult>() {
            @Override
            public DescribeDataProvidersResult call() throws Exception {
                DescribeDataProvidersResult result = null;

                try {
                    result = executeDescribeDataProviders(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointSettingsResult> describeEndpointSettingsAsync(DescribeEndpointSettingsRequest request) {

        return describeEndpointSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointSettingsResult> describeEndpointSettingsAsync(final DescribeEndpointSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointSettingsRequest, DescribeEndpointSettingsResult> asyncHandler) {
        final DescribeEndpointSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointSettingsResult>() {
            @Override
            public DescribeEndpointSettingsResult call() throws Exception {
                DescribeEndpointSettingsResult result = null;

                try {
                    result = executeDescribeEndpointSettings(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(DescribeEndpointTypesRequest request) {

        return describeEndpointTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(final DescribeEndpointTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointTypesRequest, DescribeEndpointTypesResult> asyncHandler) {
        final DescribeEndpointTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointTypesResult>() {
            @Override
            public DescribeEndpointTypesResult call() throws Exception {
                DescribeEndpointTypesResult result = null;

                try {
                    result = executeDescribeEndpointTypes(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(final DescribeEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {
        final DescribeEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointsResult>() {
            @Override
            public DescribeEndpointsResult call() throws Exception {
                DescribeEndpointsResult result = null;

                try {
                    result = executeDescribeEndpoints(finalRequest);
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
    public java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(DescribeEngineVersionsRequest request) {

        return describeEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(final DescribeEngineVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEngineVersionsRequest, DescribeEngineVersionsResult> asyncHandler) {
        final DescribeEngineVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEngineVersionsResult>() {
            @Override
            public DescribeEngineVersionsResult call() throws Exception {
                DescribeEngineVersionsResult result = null;

                try {
                    result = executeDescribeEngineVersions(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request) {

        return describeEventCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(final DescribeEventCategoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {
        final DescribeEventCategoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventCategoriesResult>() {
            @Override
            public DescribeEventCategoriesResult call() throws Exception {
                DescribeEventCategoriesResult result = null;

                try {
                    result = executeDescribeEventCategories(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request) {

        return describeEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(final DescribeEventSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {
        final DescribeEventSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventSubscriptionsResult>() {
            @Override
            public DescribeEventSubscriptionsResult call() throws Exception {
                DescribeEventSubscriptionsResult result = null;

                try {
                    result = executeDescribeEventSubscriptions(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(final DescribeEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {
        final DescribeEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsResult>() {
            @Override
            public DescribeEventsResult call() throws Exception {
                DescribeEventsResult result = null;

                try {
                    result = executeDescribeEvents(finalRequest);
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
    public java.util.concurrent.Future<DescribeExtensionPackAssociationsResult> describeExtensionPackAssociationsAsync(
            DescribeExtensionPackAssociationsRequest request) {

        return describeExtensionPackAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExtensionPackAssociationsResult> describeExtensionPackAssociationsAsync(
            final DescribeExtensionPackAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExtensionPackAssociationsRequest, DescribeExtensionPackAssociationsResult> asyncHandler) {
        final DescribeExtensionPackAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeExtensionPackAssociationsResult>() {
            @Override
            public DescribeExtensionPackAssociationsResult call() throws Exception {
                DescribeExtensionPackAssociationsResult result = null;

                try {
                    result = executeDescribeExtensionPackAssociations(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetAdvisorCollectorsResult> describeFleetAdvisorCollectorsAsync(DescribeFleetAdvisorCollectorsRequest request) {

        return describeFleetAdvisorCollectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAdvisorCollectorsResult> describeFleetAdvisorCollectorsAsync(
            final DescribeFleetAdvisorCollectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAdvisorCollectorsRequest, DescribeFleetAdvisorCollectorsResult> asyncHandler) {
        final DescribeFleetAdvisorCollectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAdvisorCollectorsResult>() {
            @Override
            public DescribeFleetAdvisorCollectorsResult call() throws Exception {
                DescribeFleetAdvisorCollectorsResult result = null;

                try {
                    result = executeDescribeFleetAdvisorCollectors(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetAdvisorDatabasesResult> describeFleetAdvisorDatabasesAsync(DescribeFleetAdvisorDatabasesRequest request) {

        return describeFleetAdvisorDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAdvisorDatabasesResult> describeFleetAdvisorDatabasesAsync(
            final DescribeFleetAdvisorDatabasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAdvisorDatabasesRequest, DescribeFleetAdvisorDatabasesResult> asyncHandler) {
        final DescribeFleetAdvisorDatabasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAdvisorDatabasesResult>() {
            @Override
            public DescribeFleetAdvisorDatabasesResult call() throws Exception {
                DescribeFleetAdvisorDatabasesResult result = null;

                try {
                    result = executeDescribeFleetAdvisorDatabases(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetAdvisorLsaAnalysisResult> describeFleetAdvisorLsaAnalysisAsync(
            DescribeFleetAdvisorLsaAnalysisRequest request) {

        return describeFleetAdvisorLsaAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAdvisorLsaAnalysisResult> describeFleetAdvisorLsaAnalysisAsync(
            final DescribeFleetAdvisorLsaAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAdvisorLsaAnalysisRequest, DescribeFleetAdvisorLsaAnalysisResult> asyncHandler) {
        final DescribeFleetAdvisorLsaAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAdvisorLsaAnalysisResult>() {
            @Override
            public DescribeFleetAdvisorLsaAnalysisResult call() throws Exception {
                DescribeFleetAdvisorLsaAnalysisResult result = null;

                try {
                    result = executeDescribeFleetAdvisorLsaAnalysis(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetAdvisorSchemaObjectSummaryResult> describeFleetAdvisorSchemaObjectSummaryAsync(
            DescribeFleetAdvisorSchemaObjectSummaryRequest request) {

        return describeFleetAdvisorSchemaObjectSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAdvisorSchemaObjectSummaryResult> describeFleetAdvisorSchemaObjectSummaryAsync(
            final DescribeFleetAdvisorSchemaObjectSummaryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAdvisorSchemaObjectSummaryRequest, DescribeFleetAdvisorSchemaObjectSummaryResult> asyncHandler) {
        final DescribeFleetAdvisorSchemaObjectSummaryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAdvisorSchemaObjectSummaryResult>() {
            @Override
            public DescribeFleetAdvisorSchemaObjectSummaryResult call() throws Exception {
                DescribeFleetAdvisorSchemaObjectSummaryResult result = null;

                try {
                    result = executeDescribeFleetAdvisorSchemaObjectSummary(finalRequest);
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
    public java.util.concurrent.Future<DescribeFleetAdvisorSchemasResult> describeFleetAdvisorSchemasAsync(DescribeFleetAdvisorSchemasRequest request) {

        return describeFleetAdvisorSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAdvisorSchemasResult> describeFleetAdvisorSchemasAsync(final DescribeFleetAdvisorSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAdvisorSchemasRequest, DescribeFleetAdvisorSchemasResult> asyncHandler) {
        final DescribeFleetAdvisorSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAdvisorSchemasResult>() {
            @Override
            public DescribeFleetAdvisorSchemasResult call() throws Exception {
                DescribeFleetAdvisorSchemasResult result = null;

                try {
                    result = executeDescribeFleetAdvisorSchemas(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceProfilesResult> describeInstanceProfilesAsync(DescribeInstanceProfilesRequest request) {

        return describeInstanceProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceProfilesResult> describeInstanceProfilesAsync(final DescribeInstanceProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceProfilesRequest, DescribeInstanceProfilesResult> asyncHandler) {
        final DescribeInstanceProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceProfilesResult>() {
            @Override
            public DescribeInstanceProfilesResult call() throws Exception {
                DescribeInstanceProfilesResult result = null;

                try {
                    result = executeDescribeInstanceProfiles(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetadataModelAssessmentsResult> describeMetadataModelAssessmentsAsync(
            DescribeMetadataModelAssessmentsRequest request) {

        return describeMetadataModelAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetadataModelAssessmentsResult> describeMetadataModelAssessmentsAsync(
            final DescribeMetadataModelAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetadataModelAssessmentsRequest, DescribeMetadataModelAssessmentsResult> asyncHandler) {
        final DescribeMetadataModelAssessmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetadataModelAssessmentsResult>() {
            @Override
            public DescribeMetadataModelAssessmentsResult call() throws Exception {
                DescribeMetadataModelAssessmentsResult result = null;

                try {
                    result = executeDescribeMetadataModelAssessments(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetadataModelConversionsResult> describeMetadataModelConversionsAsync(
            DescribeMetadataModelConversionsRequest request) {

        return describeMetadataModelConversionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetadataModelConversionsResult> describeMetadataModelConversionsAsync(
            final DescribeMetadataModelConversionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetadataModelConversionsRequest, DescribeMetadataModelConversionsResult> asyncHandler) {
        final DescribeMetadataModelConversionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetadataModelConversionsResult>() {
            @Override
            public DescribeMetadataModelConversionsResult call() throws Exception {
                DescribeMetadataModelConversionsResult result = null;

                try {
                    result = executeDescribeMetadataModelConversions(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetadataModelExportsAsScriptResult> describeMetadataModelExportsAsScriptAsync(
            DescribeMetadataModelExportsAsScriptRequest request) {

        return describeMetadataModelExportsAsScriptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetadataModelExportsAsScriptResult> describeMetadataModelExportsAsScriptAsync(
            final DescribeMetadataModelExportsAsScriptRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetadataModelExportsAsScriptRequest, DescribeMetadataModelExportsAsScriptResult> asyncHandler) {
        final DescribeMetadataModelExportsAsScriptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetadataModelExportsAsScriptResult>() {
            @Override
            public DescribeMetadataModelExportsAsScriptResult call() throws Exception {
                DescribeMetadataModelExportsAsScriptResult result = null;

                try {
                    result = executeDescribeMetadataModelExportsAsScript(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetadataModelExportsToTargetResult> describeMetadataModelExportsToTargetAsync(
            DescribeMetadataModelExportsToTargetRequest request) {

        return describeMetadataModelExportsToTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetadataModelExportsToTargetResult> describeMetadataModelExportsToTargetAsync(
            final DescribeMetadataModelExportsToTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetadataModelExportsToTargetRequest, DescribeMetadataModelExportsToTargetResult> asyncHandler) {
        final DescribeMetadataModelExportsToTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetadataModelExportsToTargetResult>() {
            @Override
            public DescribeMetadataModelExportsToTargetResult call() throws Exception {
                DescribeMetadataModelExportsToTargetResult result = null;

                try {
                    result = executeDescribeMetadataModelExportsToTarget(finalRequest);
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
    public java.util.concurrent.Future<DescribeMetadataModelImportsResult> describeMetadataModelImportsAsync(DescribeMetadataModelImportsRequest request) {

        return describeMetadataModelImportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetadataModelImportsResult> describeMetadataModelImportsAsync(final DescribeMetadataModelImportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetadataModelImportsRequest, DescribeMetadataModelImportsResult> asyncHandler) {
        final DescribeMetadataModelImportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMetadataModelImportsResult>() {
            @Override
            public DescribeMetadataModelImportsResult call() throws Exception {
                DescribeMetadataModelImportsResult result = null;

                try {
                    result = executeDescribeMetadataModelImports(finalRequest);
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
    public java.util.concurrent.Future<DescribeMigrationProjectsResult> describeMigrationProjectsAsync(DescribeMigrationProjectsRequest request) {

        return describeMigrationProjectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMigrationProjectsResult> describeMigrationProjectsAsync(final DescribeMigrationProjectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMigrationProjectsRequest, DescribeMigrationProjectsResult> asyncHandler) {
        final DescribeMigrationProjectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMigrationProjectsResult>() {
            @Override
            public DescribeMigrationProjectsResult call() throws Exception {
                DescribeMigrationProjectsResult result = null;

                try {
                    result = executeDescribeMigrationProjects(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest request) {

        return describeOrderableReplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            final DescribeOrderableReplicationInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableReplicationInstancesRequest, DescribeOrderableReplicationInstancesResult> asyncHandler) {
        final DescribeOrderableReplicationInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableReplicationInstancesResult>() {
            @Override
            public DescribeOrderableReplicationInstancesResult call() throws Exception {
                DescribeOrderableReplicationInstancesResult result = null;

                try {
                    result = executeDescribeOrderableReplicationInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest request) {

        return describePendingMaintenanceActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            final DescribePendingMaintenanceActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {
        final DescribePendingMaintenanceActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePendingMaintenanceActionsResult>() {
            @Override
            public DescribePendingMaintenanceActionsResult call() throws Exception {
                DescribePendingMaintenanceActionsResult result = null;

                try {
                    result = executeDescribePendingMaintenanceActions(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecommendationLimitationsResult> describeRecommendationLimitationsAsync(
            DescribeRecommendationLimitationsRequest request) {

        return describeRecommendationLimitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationLimitationsResult> describeRecommendationLimitationsAsync(
            final DescribeRecommendationLimitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecommendationLimitationsRequest, DescribeRecommendationLimitationsResult> asyncHandler) {
        final DescribeRecommendationLimitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecommendationLimitationsResult>() {
            @Override
            public DescribeRecommendationLimitationsResult call() throws Exception {
                DescribeRecommendationLimitationsResult result = null;

                try {
                    result = executeDescribeRecommendationLimitations(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecommendationsResult> describeRecommendationsAsync(DescribeRecommendationsRequest request) {

        return describeRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationsResult> describeRecommendationsAsync(final DescribeRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecommendationsRequest, DescribeRecommendationsResult> asyncHandler) {
        final DescribeRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecommendationsResult>() {
            @Override
            public DescribeRecommendationsResult call() throws Exception {
                DescribeRecommendationsResult result = null;

                try {
                    result = executeDescribeRecommendations(finalRequest);
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
    public java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(DescribeRefreshSchemasStatusRequest request) {

        return describeRefreshSchemasStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(final DescribeRefreshSchemasStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRefreshSchemasStatusRequest, DescribeRefreshSchemasStatusResult> asyncHandler) {
        final DescribeRefreshSchemasStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRefreshSchemasStatusResult>() {
            @Override
            public DescribeRefreshSchemasStatusResult call() throws Exception {
                DescribeRefreshSchemasStatusResult result = null;

                try {
                    result = executeDescribeRefreshSchemasStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationConfigsResult> describeReplicationConfigsAsync(DescribeReplicationConfigsRequest request) {

        return describeReplicationConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationConfigsResult> describeReplicationConfigsAsync(final DescribeReplicationConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigsRequest, DescribeReplicationConfigsResult> asyncHandler) {
        final DescribeReplicationConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationConfigsResult>() {
            @Override
            public DescribeReplicationConfigsResult call() throws Exception {
                DescribeReplicationConfigsResult result = null;

                try {
                    result = executeDescribeReplicationConfigs(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationInstanceTaskLogsResult> describeReplicationInstanceTaskLogsAsync(
            DescribeReplicationInstanceTaskLogsRequest request) {

        return describeReplicationInstanceTaskLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationInstanceTaskLogsResult> describeReplicationInstanceTaskLogsAsync(
            final DescribeReplicationInstanceTaskLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationInstanceTaskLogsRequest, DescribeReplicationInstanceTaskLogsResult> asyncHandler) {
        final DescribeReplicationInstanceTaskLogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationInstanceTaskLogsResult>() {
            @Override
            public DescribeReplicationInstanceTaskLogsResult call() throws Exception {
                DescribeReplicationInstanceTaskLogsResult result = null;

                try {
                    result = executeDescribeReplicationInstanceTaskLogs(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(DescribeReplicationInstancesRequest request) {

        return describeReplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(final DescribeReplicationInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationInstancesRequest, DescribeReplicationInstancesResult> asyncHandler) {
        final DescribeReplicationInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationInstancesResult>() {
            @Override
            public DescribeReplicationInstancesResult call() throws Exception {
                DescribeReplicationInstancesResult result = null;

                try {
                    result = executeDescribeReplicationInstances(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest request) {

        return describeReplicationSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            final DescribeReplicationSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationSubnetGroupsRequest, DescribeReplicationSubnetGroupsResult> asyncHandler) {
        final DescribeReplicationSubnetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationSubnetGroupsResult>() {
            @Override
            public DescribeReplicationSubnetGroupsResult call() throws Exception {
                DescribeReplicationSubnetGroupsResult result = null;

                try {
                    result = executeDescribeReplicationSubnetGroups(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationTableStatisticsResult> describeReplicationTableStatisticsAsync(
            DescribeReplicationTableStatisticsRequest request) {

        return describeReplicationTableStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTableStatisticsResult> describeReplicationTableStatisticsAsync(
            final DescribeReplicationTableStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationTableStatisticsRequest, DescribeReplicationTableStatisticsResult> asyncHandler) {
        final DescribeReplicationTableStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationTableStatisticsResult>() {
            @Override
            public DescribeReplicationTableStatisticsResult call() throws Exception {
                DescribeReplicationTableStatisticsResult result = null;

                try {
                    result = executeDescribeReplicationTableStatistics(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationTaskAssessmentResultsResult> describeReplicationTaskAssessmentResultsAsync(
            DescribeReplicationTaskAssessmentResultsRequest request) {

        return describeReplicationTaskAssessmentResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTaskAssessmentResultsResult> describeReplicationTaskAssessmentResultsAsync(
            final DescribeReplicationTaskAssessmentResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationTaskAssessmentResultsRequest, DescribeReplicationTaskAssessmentResultsResult> asyncHandler) {
        final DescribeReplicationTaskAssessmentResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationTaskAssessmentResultsResult>() {
            @Override
            public DescribeReplicationTaskAssessmentResultsResult call() throws Exception {
                DescribeReplicationTaskAssessmentResultsResult result = null;

                try {
                    result = executeDescribeReplicationTaskAssessmentResults(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationTaskAssessmentRunsResult> describeReplicationTaskAssessmentRunsAsync(
            DescribeReplicationTaskAssessmentRunsRequest request) {

        return describeReplicationTaskAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTaskAssessmentRunsResult> describeReplicationTaskAssessmentRunsAsync(
            final DescribeReplicationTaskAssessmentRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationTaskAssessmentRunsRequest, DescribeReplicationTaskAssessmentRunsResult> asyncHandler) {
        final DescribeReplicationTaskAssessmentRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationTaskAssessmentRunsResult>() {
            @Override
            public DescribeReplicationTaskAssessmentRunsResult call() throws Exception {
                DescribeReplicationTaskAssessmentRunsResult result = null;

                try {
                    result = executeDescribeReplicationTaskAssessmentRuns(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationTaskIndividualAssessmentsResult> describeReplicationTaskIndividualAssessmentsAsync(
            DescribeReplicationTaskIndividualAssessmentsRequest request) {

        return describeReplicationTaskIndividualAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTaskIndividualAssessmentsResult> describeReplicationTaskIndividualAssessmentsAsync(
            final DescribeReplicationTaskIndividualAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationTaskIndividualAssessmentsRequest, DescribeReplicationTaskIndividualAssessmentsResult> asyncHandler) {
        final DescribeReplicationTaskIndividualAssessmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationTaskIndividualAssessmentsResult>() {
            @Override
            public DescribeReplicationTaskIndividualAssessmentsResult call() throws Exception {
                DescribeReplicationTaskIndividualAssessmentsResult result = null;

                try {
                    result = executeDescribeReplicationTaskIndividualAssessments(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(DescribeReplicationTasksRequest request) {

        return describeReplicationTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(final DescribeReplicationTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationTasksRequest, DescribeReplicationTasksResult> asyncHandler) {
        final DescribeReplicationTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationTasksResult>() {
            @Override
            public DescribeReplicationTasksResult call() throws Exception {
                DescribeReplicationTasksResult result = null;

                try {
                    result = executeDescribeReplicationTasks(finalRequest);
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
    public java.util.concurrent.Future<DescribeReplicationsResult> describeReplicationsAsync(DescribeReplicationsRequest request) {

        return describeReplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationsResult> describeReplicationsAsync(final DescribeReplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationsRequest, DescribeReplicationsResult> asyncHandler) {
        final DescribeReplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationsResult>() {
            @Override
            public DescribeReplicationsResult call() throws Exception {
                DescribeReplicationsResult result = null;

                try {
                    result = executeDescribeReplications(finalRequest);
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
    public java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(DescribeSchemasRequest request) {

        return describeSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(final DescribeSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSchemasRequest, DescribeSchemasResult> asyncHandler) {
        final DescribeSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSchemasResult>() {
            @Override
            public DescribeSchemasResult call() throws Exception {
                DescribeSchemasResult result = null;

                try {
                    result = executeDescribeSchemas(finalRequest);
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
    public java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(DescribeTableStatisticsRequest request) {

        return describeTableStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(final DescribeTableStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTableStatisticsRequest, DescribeTableStatisticsResult> asyncHandler) {
        final DescribeTableStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTableStatisticsResult>() {
            @Override
            public DescribeTableStatisticsResult call() throws Exception {
                DescribeTableStatisticsResult result = null;

                try {
                    result = executeDescribeTableStatistics(finalRequest);
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
    public java.util.concurrent.Future<ExportMetadataModelAssessmentResult> exportMetadataModelAssessmentAsync(ExportMetadataModelAssessmentRequest request) {

        return exportMetadataModelAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportMetadataModelAssessmentResult> exportMetadataModelAssessmentAsync(
            final ExportMetadataModelAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportMetadataModelAssessmentRequest, ExportMetadataModelAssessmentResult> asyncHandler) {
        final ExportMetadataModelAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportMetadataModelAssessmentResult>() {
            @Override
            public ExportMetadataModelAssessmentResult call() throws Exception {
                ExportMetadataModelAssessmentResult result = null;

                try {
                    result = executeExportMetadataModelAssessment(finalRequest);
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
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest request) {

        return importCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(final ImportCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler) {
        final ImportCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportCertificateResult>() {
            @Override
            public ImportCertificateResult call() throws Exception {
                ImportCertificateResult result = null;

                try {
                    result = executeImportCertificate(finalRequest);
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
    public java.util.concurrent.Future<ModifyConversionConfigurationResult> modifyConversionConfigurationAsync(ModifyConversionConfigurationRequest request) {

        return modifyConversionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyConversionConfigurationResult> modifyConversionConfigurationAsync(
            final ModifyConversionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyConversionConfigurationRequest, ModifyConversionConfigurationResult> asyncHandler) {
        final ModifyConversionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyConversionConfigurationResult>() {
            @Override
            public ModifyConversionConfigurationResult call() throws Exception {
                ModifyConversionConfigurationResult result = null;

                try {
                    result = executeModifyConversionConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ModifyDataProviderResult> modifyDataProviderAsync(ModifyDataProviderRequest request) {

        return modifyDataProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDataProviderResult> modifyDataProviderAsync(final ModifyDataProviderRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyDataProviderRequest, ModifyDataProviderResult> asyncHandler) {
        final ModifyDataProviderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyDataProviderResult>() {
            @Override
            public ModifyDataProviderResult call() throws Exception {
                ModifyDataProviderResult result = null;

                try {
                    result = executeModifyDataProvider(finalRequest);
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
    public java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(ModifyEndpointRequest request) {

        return modifyEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(final ModifyEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyEndpointRequest, ModifyEndpointResult> asyncHandler) {
        final ModifyEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyEndpointResult>() {
            @Override
            public ModifyEndpointResult call() throws Exception {
                ModifyEndpointResult result = null;

                try {
                    result = executeModifyEndpoint(finalRequest);
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
    public java.util.concurrent.Future<ModifyEventSubscriptionResult> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request) {

        return modifyEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyEventSubscriptionResult> modifyEventSubscriptionAsync(final ModifyEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, ModifyEventSubscriptionResult> asyncHandler) {
        final ModifyEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyEventSubscriptionResult>() {
            @Override
            public ModifyEventSubscriptionResult call() throws Exception {
                ModifyEventSubscriptionResult result = null;

                try {
                    result = executeModifyEventSubscription(finalRequest);
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
    public java.util.concurrent.Future<ModifyInstanceProfileResult> modifyInstanceProfileAsync(ModifyInstanceProfileRequest request) {

        return modifyInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyInstanceProfileResult> modifyInstanceProfileAsync(final ModifyInstanceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyInstanceProfileRequest, ModifyInstanceProfileResult> asyncHandler) {
        final ModifyInstanceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyInstanceProfileResult>() {
            @Override
            public ModifyInstanceProfileResult call() throws Exception {
                ModifyInstanceProfileResult result = null;

                try {
                    result = executeModifyInstanceProfile(finalRequest);
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
    public java.util.concurrent.Future<ModifyMigrationProjectResult> modifyMigrationProjectAsync(ModifyMigrationProjectRequest request) {

        return modifyMigrationProjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyMigrationProjectResult> modifyMigrationProjectAsync(final ModifyMigrationProjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyMigrationProjectRequest, ModifyMigrationProjectResult> asyncHandler) {
        final ModifyMigrationProjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyMigrationProjectResult>() {
            @Override
            public ModifyMigrationProjectResult call() throws Exception {
                ModifyMigrationProjectResult result = null;

                try {
                    result = executeModifyMigrationProject(finalRequest);
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
    public java.util.concurrent.Future<ModifyReplicationConfigResult> modifyReplicationConfigAsync(ModifyReplicationConfigRequest request) {

        return modifyReplicationConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationConfigResult> modifyReplicationConfigAsync(final ModifyReplicationConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReplicationConfigRequest, ModifyReplicationConfigResult> asyncHandler) {
        final ModifyReplicationConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyReplicationConfigResult>() {
            @Override
            public ModifyReplicationConfigResult call() throws Exception {
                ModifyReplicationConfigResult result = null;

                try {
                    result = executeModifyReplicationConfig(finalRequest);
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
    public java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(ModifyReplicationInstanceRequest request) {

        return modifyReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(final ModifyReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReplicationInstanceRequest, ModifyReplicationInstanceResult> asyncHandler) {
        final ModifyReplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyReplicationInstanceResult>() {
            @Override
            public ModifyReplicationInstanceResult call() throws Exception {
                ModifyReplicationInstanceResult result = null;

                try {
                    result = executeModifyReplicationInstance(finalRequest);
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
    public java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(ModifyReplicationSubnetGroupRequest request) {

        return modifyReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(final ModifyReplicationSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReplicationSubnetGroupRequest, ModifyReplicationSubnetGroupResult> asyncHandler) {
        final ModifyReplicationSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyReplicationSubnetGroupResult>() {
            @Override
            public ModifyReplicationSubnetGroupResult call() throws Exception {
                ModifyReplicationSubnetGroupResult result = null;

                try {
                    result = executeModifyReplicationSubnetGroup(finalRequest);
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
    public java.util.concurrent.Future<ModifyReplicationTaskResult> modifyReplicationTaskAsync(ModifyReplicationTaskRequest request) {

        return modifyReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationTaskResult> modifyReplicationTaskAsync(final ModifyReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReplicationTaskRequest, ModifyReplicationTaskResult> asyncHandler) {
        final ModifyReplicationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyReplicationTaskResult>() {
            @Override
            public ModifyReplicationTaskResult call() throws Exception {
                ModifyReplicationTaskResult result = null;

                try {
                    result = executeModifyReplicationTask(finalRequest);
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
    public java.util.concurrent.Future<MoveReplicationTaskResult> moveReplicationTaskAsync(MoveReplicationTaskRequest request) {

        return moveReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MoveReplicationTaskResult> moveReplicationTaskAsync(final MoveReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<MoveReplicationTaskRequest, MoveReplicationTaskResult> asyncHandler) {
        final MoveReplicationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MoveReplicationTaskResult>() {
            @Override
            public MoveReplicationTaskResult call() throws Exception {
                MoveReplicationTaskResult result = null;

                try {
                    result = executeMoveReplicationTask(finalRequest);
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
    public java.util.concurrent.Future<RebootReplicationInstanceResult> rebootReplicationInstanceAsync(RebootReplicationInstanceRequest request) {

        return rebootReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootReplicationInstanceResult> rebootReplicationInstanceAsync(final RebootReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootReplicationInstanceRequest, RebootReplicationInstanceResult> asyncHandler) {
        final RebootReplicationInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootReplicationInstanceResult>() {
            @Override
            public RebootReplicationInstanceResult call() throws Exception {
                RebootReplicationInstanceResult result = null;

                try {
                    result = executeRebootReplicationInstance(finalRequest);
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
    public java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(RefreshSchemasRequest request) {

        return refreshSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(final RefreshSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<RefreshSchemasRequest, RefreshSchemasResult> asyncHandler) {
        final RefreshSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RefreshSchemasResult>() {
            @Override
            public RefreshSchemasResult call() throws Exception {
                RefreshSchemasResult result = null;

                try {
                    result = executeRefreshSchemas(finalRequest);
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
    public java.util.concurrent.Future<ReloadReplicationTablesResult> reloadReplicationTablesAsync(ReloadReplicationTablesRequest request) {

        return reloadReplicationTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReloadReplicationTablesResult> reloadReplicationTablesAsync(final ReloadReplicationTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReloadReplicationTablesRequest, ReloadReplicationTablesResult> asyncHandler) {
        final ReloadReplicationTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReloadReplicationTablesResult>() {
            @Override
            public ReloadReplicationTablesResult call() throws Exception {
                ReloadReplicationTablesResult result = null;

                try {
                    result = executeReloadReplicationTables(finalRequest);
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
    public java.util.concurrent.Future<ReloadTablesResult> reloadTablesAsync(ReloadTablesRequest request) {

        return reloadTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReloadTablesResult> reloadTablesAsync(final ReloadTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReloadTablesRequest, ReloadTablesResult> asyncHandler) {
        final ReloadTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReloadTablesResult>() {
            @Override
            public ReloadTablesResult call() throws Exception {
                ReloadTablesResult result = null;

                try {
                    result = executeReloadTables(finalRequest);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {
        final RemoveTagsFromResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;

                try {
                    result = executeRemoveTagsFromResource(finalRequest);
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
    public java.util.concurrent.Future<RunFleetAdvisorLsaAnalysisResult> runFleetAdvisorLsaAnalysisAsync(RunFleetAdvisorLsaAnalysisRequest request) {

        return runFleetAdvisorLsaAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunFleetAdvisorLsaAnalysisResult> runFleetAdvisorLsaAnalysisAsync(final RunFleetAdvisorLsaAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<RunFleetAdvisorLsaAnalysisRequest, RunFleetAdvisorLsaAnalysisResult> asyncHandler) {
        final RunFleetAdvisorLsaAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RunFleetAdvisorLsaAnalysisResult>() {
            @Override
            public RunFleetAdvisorLsaAnalysisResult call() throws Exception {
                RunFleetAdvisorLsaAnalysisResult result = null;

                try {
                    result = executeRunFleetAdvisorLsaAnalysis(finalRequest);
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
    public java.util.concurrent.Future<StartExtensionPackAssociationResult> startExtensionPackAssociationAsync(StartExtensionPackAssociationRequest request) {

        return startExtensionPackAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartExtensionPackAssociationResult> startExtensionPackAssociationAsync(
            final StartExtensionPackAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartExtensionPackAssociationRequest, StartExtensionPackAssociationResult> asyncHandler) {
        final StartExtensionPackAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartExtensionPackAssociationResult>() {
            @Override
            public StartExtensionPackAssociationResult call() throws Exception {
                StartExtensionPackAssociationResult result = null;

                try {
                    result = executeStartExtensionPackAssociation(finalRequest);
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
    public java.util.concurrent.Future<StartMetadataModelAssessmentResult> startMetadataModelAssessmentAsync(StartMetadataModelAssessmentRequest request) {

        return startMetadataModelAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMetadataModelAssessmentResult> startMetadataModelAssessmentAsync(final StartMetadataModelAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMetadataModelAssessmentRequest, StartMetadataModelAssessmentResult> asyncHandler) {
        final StartMetadataModelAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMetadataModelAssessmentResult>() {
            @Override
            public StartMetadataModelAssessmentResult call() throws Exception {
                StartMetadataModelAssessmentResult result = null;

                try {
                    result = executeStartMetadataModelAssessment(finalRequest);
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
    public java.util.concurrent.Future<StartMetadataModelConversionResult> startMetadataModelConversionAsync(StartMetadataModelConversionRequest request) {

        return startMetadataModelConversionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMetadataModelConversionResult> startMetadataModelConversionAsync(final StartMetadataModelConversionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMetadataModelConversionRequest, StartMetadataModelConversionResult> asyncHandler) {
        final StartMetadataModelConversionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMetadataModelConversionResult>() {
            @Override
            public StartMetadataModelConversionResult call() throws Exception {
                StartMetadataModelConversionResult result = null;

                try {
                    result = executeStartMetadataModelConversion(finalRequest);
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
    public java.util.concurrent.Future<StartMetadataModelExportAsScriptResult> startMetadataModelExportAsScriptAsync(
            StartMetadataModelExportAsScriptRequest request) {

        return startMetadataModelExportAsScriptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMetadataModelExportAsScriptResult> startMetadataModelExportAsScriptAsync(
            final StartMetadataModelExportAsScriptRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMetadataModelExportAsScriptRequest, StartMetadataModelExportAsScriptResult> asyncHandler) {
        final StartMetadataModelExportAsScriptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMetadataModelExportAsScriptResult>() {
            @Override
            public StartMetadataModelExportAsScriptResult call() throws Exception {
                StartMetadataModelExportAsScriptResult result = null;

                try {
                    result = executeStartMetadataModelExportAsScript(finalRequest);
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
    public java.util.concurrent.Future<StartMetadataModelExportToTargetResult> startMetadataModelExportToTargetAsync(
            StartMetadataModelExportToTargetRequest request) {

        return startMetadataModelExportToTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMetadataModelExportToTargetResult> startMetadataModelExportToTargetAsync(
            final StartMetadataModelExportToTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMetadataModelExportToTargetRequest, StartMetadataModelExportToTargetResult> asyncHandler) {
        final StartMetadataModelExportToTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMetadataModelExportToTargetResult>() {
            @Override
            public StartMetadataModelExportToTargetResult call() throws Exception {
                StartMetadataModelExportToTargetResult result = null;

                try {
                    result = executeStartMetadataModelExportToTarget(finalRequest);
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
    public java.util.concurrent.Future<StartMetadataModelImportResult> startMetadataModelImportAsync(StartMetadataModelImportRequest request) {

        return startMetadataModelImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMetadataModelImportResult> startMetadataModelImportAsync(final StartMetadataModelImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMetadataModelImportRequest, StartMetadataModelImportResult> asyncHandler) {
        final StartMetadataModelImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMetadataModelImportResult>() {
            @Override
            public StartMetadataModelImportResult call() throws Exception {
                StartMetadataModelImportResult result = null;

                try {
                    result = executeStartMetadataModelImport(finalRequest);
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
    public java.util.concurrent.Future<StartRecommendationsResult> startRecommendationsAsync(StartRecommendationsRequest request) {

        return startRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartRecommendationsResult> startRecommendationsAsync(final StartRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartRecommendationsRequest, StartRecommendationsResult> asyncHandler) {
        final StartRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartRecommendationsResult>() {
            @Override
            public StartRecommendationsResult call() throws Exception {
                StartRecommendationsResult result = null;

                try {
                    result = executeStartRecommendations(finalRequest);
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
    public java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest request) {

        return startReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(final StartReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplicationRequest, StartReplicationResult> asyncHandler) {
        final StartReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReplicationResult>() {
            @Override
            public StartReplicationResult call() throws Exception {
                StartReplicationResult result = null;

                try {
                    result = executeStartReplication(finalRequest);
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
    public java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(StartReplicationTaskRequest request) {

        return startReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(final StartReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplicationTaskRequest, StartReplicationTaskResult> asyncHandler) {
        final StartReplicationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReplicationTaskResult>() {
            @Override
            public StartReplicationTaskResult call() throws Exception {
                StartReplicationTaskResult result = null;

                try {
                    result = executeStartReplicationTask(finalRequest);
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
    public java.util.concurrent.Future<StartReplicationTaskAssessmentResult> startReplicationTaskAssessmentAsync(StartReplicationTaskAssessmentRequest request) {

        return startReplicationTaskAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationTaskAssessmentResult> startReplicationTaskAssessmentAsync(
            final StartReplicationTaskAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplicationTaskAssessmentRequest, StartReplicationTaskAssessmentResult> asyncHandler) {
        final StartReplicationTaskAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReplicationTaskAssessmentResult>() {
            @Override
            public StartReplicationTaskAssessmentResult call() throws Exception {
                StartReplicationTaskAssessmentResult result = null;

                try {
                    result = executeStartReplicationTaskAssessment(finalRequest);
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
    public java.util.concurrent.Future<StartReplicationTaskAssessmentRunResult> startReplicationTaskAssessmentRunAsync(
            StartReplicationTaskAssessmentRunRequest request) {

        return startReplicationTaskAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationTaskAssessmentRunResult> startReplicationTaskAssessmentRunAsync(
            final StartReplicationTaskAssessmentRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplicationTaskAssessmentRunRequest, StartReplicationTaskAssessmentRunResult> asyncHandler) {
        final StartReplicationTaskAssessmentRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartReplicationTaskAssessmentRunResult>() {
            @Override
            public StartReplicationTaskAssessmentRunResult call() throws Exception {
                StartReplicationTaskAssessmentRunResult result = null;

                try {
                    result = executeStartReplicationTaskAssessmentRun(finalRequest);
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
    public java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(StopReplicationRequest request) {

        return stopReplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(final StopReplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopReplicationRequest, StopReplicationResult> asyncHandler) {
        final StopReplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopReplicationResult>() {
            @Override
            public StopReplicationResult call() throws Exception {
                StopReplicationResult result = null;

                try {
                    result = executeStopReplication(finalRequest);
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
    public java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(StopReplicationTaskRequest request) {

        return stopReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(final StopReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopReplicationTaskRequest, StopReplicationTaskResult> asyncHandler) {
        final StopReplicationTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopReplicationTaskResult>() {
            @Override
            public StopReplicationTaskResult call() throws Exception {
                StopReplicationTaskResult result = null;

                try {
                    result = executeStopReplicationTask(finalRequest);
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
    public java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(TestConnectionRequest request) {

        return testConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(final TestConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestConnectionRequest, TestConnectionResult> asyncHandler) {
        final TestConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestConnectionResult>() {
            @Override
            public TestConnectionResult call() throws Exception {
                TestConnectionResult result = null;

                try {
                    result = executeTestConnection(finalRequest);
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
    public java.util.concurrent.Future<UpdateSubscriptionsToEventBridgeResult> updateSubscriptionsToEventBridgeAsync(
            UpdateSubscriptionsToEventBridgeRequest request) {

        return updateSubscriptionsToEventBridgeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubscriptionsToEventBridgeResult> updateSubscriptionsToEventBridgeAsync(
            final UpdateSubscriptionsToEventBridgeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionsToEventBridgeRequest, UpdateSubscriptionsToEventBridgeResult> asyncHandler) {
        final UpdateSubscriptionsToEventBridgeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSubscriptionsToEventBridgeResult>() {
            @Override
            public UpdateSubscriptionsToEventBridgeResult call() throws Exception {
                UpdateSubscriptionsToEventBridgeResult result = null;

                try {
                    result = executeUpdateSubscriptionsToEventBridge(finalRequest);
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
