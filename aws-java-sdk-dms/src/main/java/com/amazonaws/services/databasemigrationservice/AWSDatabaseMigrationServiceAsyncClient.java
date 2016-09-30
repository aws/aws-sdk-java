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
package com.amazonaws.services.databasemigrationservice;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing AWS Database Migration Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Database Migration Service</fullname>
 * <p>
 * AWS Database Migration Service (AWS DMS) can migrate your data to and from the most widely used commercial and
 * open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, and
 * MySQL. The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations
 * between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.
 * </p>
 */
@ThreadSafe
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
     */
    public AWSDatabaseMigrationServiceAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified AWS account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AWSDatabaseMigrationServiceAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration, java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Database Migration Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDatabaseMigrationServiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(final AddTagsToResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddTagsToResourceResult>() {
            @Override
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result;

                try {
                    result = addTagsToResource(request);
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
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(final CreateEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointResult>() {
            @Override
            public CreateEndpointResult call() throws Exception {
                CreateEndpointResult result;

                try {
                    result = createEndpoint(request);
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
    public java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(CreateReplicationInstanceRequest request) {

        return createReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(final CreateReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationInstanceRequest, CreateReplicationInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationInstanceResult>() {
            @Override
            public CreateReplicationInstanceResult call() throws Exception {
                CreateReplicationInstanceResult result;

                try {
                    result = createReplicationInstance(request);
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
    public java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(CreateReplicationSubnetGroupRequest request) {

        return createReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(final CreateReplicationSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationSubnetGroupRequest, CreateReplicationSubnetGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationSubnetGroupResult>() {
            @Override
            public CreateReplicationSubnetGroupResult call() throws Exception {
                CreateReplicationSubnetGroupResult result;

                try {
                    result = createReplicationSubnetGroup(request);
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
    public java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(CreateReplicationTaskRequest request) {

        return createReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(final CreateReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationTaskRequest, CreateReplicationTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationTaskResult>() {
            @Override
            public CreateReplicationTaskResult call() throws Exception {
                CreateReplicationTaskResult result;

                try {
                    result = createReplicationTask(request);
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
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(final DeleteCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteCertificateResult>() {
            @Override
            public DeleteCertificateResult call() throws Exception {
                DeleteCertificateResult result;

                try {
                    result = deleteCertificate(request);
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
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointResult>() {
            @Override
            public DeleteEndpointResult call() throws Exception {
                DeleteEndpointResult result;

                try {
                    result = deleteEndpoint(request);
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
    public java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(DeleteReplicationInstanceRequest request) {

        return deleteReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(final DeleteReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationInstanceRequest, DeleteReplicationInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationInstanceResult>() {
            @Override
            public DeleteReplicationInstanceResult call() throws Exception {
                DeleteReplicationInstanceResult result;

                try {
                    result = deleteReplicationInstance(request);
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
    public java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(DeleteReplicationSubnetGroupRequest request) {

        return deleteReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(final DeleteReplicationSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationSubnetGroupRequest, DeleteReplicationSubnetGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationSubnetGroupResult>() {
            @Override
            public DeleteReplicationSubnetGroupResult call() throws Exception {
                DeleteReplicationSubnetGroupResult result;

                try {
                    result = deleteReplicationSubnetGroup(request);
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
    public java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(DeleteReplicationTaskRequest request) {

        return deleteReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(final DeleteReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationTaskRequest, DeleteReplicationTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationTaskResult>() {
            @Override
            public DeleteReplicationTaskResult call() throws Exception {
                DeleteReplicationTaskResult result;

                try {
                    result = deleteReplicationTask(request);
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
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(final DescribeAccountAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountAttributesResult>() {
            @Override
            public DescribeAccountAttributesResult call() throws Exception {
                DescribeAccountAttributesResult result;

                try {
                    result = describeAccountAttributes(request);
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
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest request) {

        return describeCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(final DescribeCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeCertificatesResult>() {
            @Override
            public DescribeCertificatesResult call() throws Exception {
                DescribeCertificatesResult result;

                try {
                    result = describeCertificates(request);
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
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest request) {

        return describeConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(final DescribeConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectionsResult>() {
            @Override
            public DescribeConnectionsResult call() throws Exception {
                DescribeConnectionsResult result;

                try {
                    result = describeConnections(request);
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
    public java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(DescribeEndpointTypesRequest request) {

        return describeEndpointTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(final DescribeEndpointTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointTypesRequest, DescribeEndpointTypesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointTypesResult>() {
            @Override
            public DescribeEndpointTypesResult call() throws Exception {
                DescribeEndpointTypesResult result;

                try {
                    result = describeEndpointTypes(request);
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
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(final DescribeEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointsResult>() {
            @Override
            public DescribeEndpointsResult call() throws Exception {
                DescribeEndpointsResult result;

                try {
                    result = describeEndpoints(request);
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
    public java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest request) {

        return describeOrderableReplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            final DescribeOrderableReplicationInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableReplicationInstancesRequest, DescribeOrderableReplicationInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableReplicationInstancesResult>() {
            @Override
            public DescribeOrderableReplicationInstancesResult call() throws Exception {
                DescribeOrderableReplicationInstancesResult result;

                try {
                    result = describeOrderableReplicationInstances(request);
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
    public java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(DescribeRefreshSchemasStatusRequest request) {

        return describeRefreshSchemasStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(final DescribeRefreshSchemasStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRefreshSchemasStatusRequest, DescribeRefreshSchemasStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeRefreshSchemasStatusResult>() {
            @Override
            public DescribeRefreshSchemasStatusResult call() throws Exception {
                DescribeRefreshSchemasStatusResult result;

                try {
                    result = describeRefreshSchemasStatus(request);
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
    public java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(DescribeReplicationInstancesRequest request) {

        return describeReplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(final DescribeReplicationInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationInstancesRequest, DescribeReplicationInstancesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationInstancesResult>() {
            @Override
            public DescribeReplicationInstancesResult call() throws Exception {
                DescribeReplicationInstancesResult result;

                try {
                    result = describeReplicationInstances(request);
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
    public java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest request) {

        return describeReplicationSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            final DescribeReplicationSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationSubnetGroupsRequest, DescribeReplicationSubnetGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationSubnetGroupsResult>() {
            @Override
            public DescribeReplicationSubnetGroupsResult call() throws Exception {
                DescribeReplicationSubnetGroupsResult result;

                try {
                    result = describeReplicationSubnetGroups(request);
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
    public java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(DescribeReplicationTasksRequest request) {

        return describeReplicationTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(final DescribeReplicationTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReplicationTasksRequest, DescribeReplicationTasksResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeReplicationTasksResult>() {
            @Override
            public DescribeReplicationTasksResult call() throws Exception {
                DescribeReplicationTasksResult result;

                try {
                    result = describeReplicationTasks(request);
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
    public java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(DescribeSchemasRequest request) {

        return describeSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(final DescribeSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSchemasRequest, DescribeSchemasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSchemasResult>() {
            @Override
            public DescribeSchemasResult call() throws Exception {
                DescribeSchemasResult result;

                try {
                    result = describeSchemas(request);
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
    public java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(DescribeTableStatisticsRequest request) {

        return describeTableStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(final DescribeTableStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTableStatisticsRequest, DescribeTableStatisticsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTableStatisticsResult>() {
            @Override
            public DescribeTableStatisticsResult call() throws Exception {
                DescribeTableStatisticsResult result;

                try {
                    result = describeTableStatistics(request);
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
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest request) {

        return importCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(final ImportCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ImportCertificateResult>() {
            @Override
            public ImportCertificateResult call() throws Exception {
                ImportCertificateResult result;

                try {
                    result = importCertificate(request);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result;

                try {
                    result = listTagsForResource(request);
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
    public java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(ModifyEndpointRequest request) {

        return modifyEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(final ModifyEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyEndpointRequest, ModifyEndpointResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyEndpointResult>() {
            @Override
            public ModifyEndpointResult call() throws Exception {
                ModifyEndpointResult result;

                try {
                    result = modifyEndpoint(request);
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
    public java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(ModifyReplicationInstanceRequest request) {

        return modifyReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(final ModifyReplicationInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReplicationInstanceRequest, ModifyReplicationInstanceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyReplicationInstanceResult>() {
            @Override
            public ModifyReplicationInstanceResult call() throws Exception {
                ModifyReplicationInstanceResult result;

                try {
                    result = modifyReplicationInstance(request);
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
    public java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(ModifyReplicationSubnetGroupRequest request) {

        return modifyReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(final ModifyReplicationSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyReplicationSubnetGroupRequest, ModifyReplicationSubnetGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyReplicationSubnetGroupResult>() {
            @Override
            public ModifyReplicationSubnetGroupResult call() throws Exception {
                ModifyReplicationSubnetGroupResult result;

                try {
                    result = modifyReplicationSubnetGroup(request);
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
    public java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(RefreshSchemasRequest request) {

        return refreshSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(final RefreshSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<RefreshSchemasRequest, RefreshSchemasResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RefreshSchemasResult>() {
            @Override
            public RefreshSchemasResult call() throws Exception {
                RefreshSchemasResult result;

                try {
                    result = refreshSchemas(request);
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
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(final RemoveTagsFromResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveTagsFromResourceResult>() {
            @Override
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result;

                try {
                    result = removeTagsFromResource(request);
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
    public java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(StartReplicationTaskRequest request) {

        return startReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(final StartReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartReplicationTaskRequest, StartReplicationTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StartReplicationTaskResult>() {
            @Override
            public StartReplicationTaskResult call() throws Exception {
                StartReplicationTaskResult result;

                try {
                    result = startReplicationTask(request);
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
    public java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(StopReplicationTaskRequest request) {

        return stopReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(final StopReplicationTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopReplicationTaskRequest, StopReplicationTaskResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<StopReplicationTaskResult>() {
            @Override
            public StopReplicationTaskResult call() throws Exception {
                StopReplicationTaskResult result;

                try {
                    result = stopReplicationTask(request);
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
    public java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(TestConnectionRequest request) {

        return testConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(final TestConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestConnectionRequest, TestConnectionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TestConnectionResult>() {
            @Override
            public TestConnectionResult call() throws Exception {
                TestConnectionResult result;

                try {
                    result = testConnection(request);
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
