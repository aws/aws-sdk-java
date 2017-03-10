/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon CloudDirectory asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Cloud Directory</fullname>
 * <p>
 * Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
 * cloud-scale web, mobile and IoT applications. This guide describes the Cloud Directory operations that you can call
 * programatically and includes detailed information on data types and errors. For information about AWS Directory
 * Services features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the <a
 * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html">AWS Directory Service
 * Administration Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudDirectoryAsyncClient extends AmazonCloudDirectoryClient implements AmazonCloudDirectoryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudDirectory (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the provided AWS
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
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonCloudDirectoryAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudDirectoryAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonCloudDirectoryAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonCloudDirectoryAsyncClientBuilder asyncBuilder() {
        return AmazonCloudDirectoryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudDirectory using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudDirectoryAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AddFacetToObjectResult> addFacetToObjectAsync(AddFacetToObjectRequest request) {

        return addFacetToObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFacetToObjectResult> addFacetToObjectAsync(final AddFacetToObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddFacetToObjectRequest, AddFacetToObjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AddFacetToObjectResult>() {
            @Override
            public AddFacetToObjectResult call() throws Exception {
                AddFacetToObjectResult result;

                try {
                    result = addFacetToObject(request);
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
    public java.util.concurrent.Future<ApplySchemaResult> applySchemaAsync(ApplySchemaRequest request) {

        return applySchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplySchemaResult> applySchemaAsync(final ApplySchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplySchemaRequest, ApplySchemaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ApplySchemaResult>() {
            @Override
            public ApplySchemaResult call() throws Exception {
                ApplySchemaResult result;

                try {
                    result = applySchema(request);
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
    public java.util.concurrent.Future<AttachObjectResult> attachObjectAsync(AttachObjectRequest request) {

        return attachObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachObjectResult> attachObjectAsync(final AttachObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachObjectRequest, AttachObjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachObjectResult>() {
            @Override
            public AttachObjectResult call() throws Exception {
                AttachObjectResult result;

                try {
                    result = attachObject(request);
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
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest request) {

        return attachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(final AttachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachPolicyResult>() {
            @Override
            public AttachPolicyResult call() throws Exception {
                AttachPolicyResult result;

                try {
                    result = attachPolicy(request);
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
    public java.util.concurrent.Future<AttachToIndexResult> attachToIndexAsync(AttachToIndexRequest request) {

        return attachToIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachToIndexResult> attachToIndexAsync(final AttachToIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachToIndexRequest, AttachToIndexResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<AttachToIndexResult>() {
            @Override
            public AttachToIndexResult call() throws Exception {
                AttachToIndexResult result;

                try {
                    result = attachToIndex(request);
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
    public java.util.concurrent.Future<BatchReadResult> batchReadAsync(BatchReadRequest request) {

        return batchReadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchReadResult> batchReadAsync(final BatchReadRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchReadRequest, BatchReadResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchReadResult>() {
            @Override
            public BatchReadResult call() throws Exception {
                BatchReadResult result;

                try {
                    result = batchRead(request);
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
    public java.util.concurrent.Future<BatchWriteResult> batchWriteAsync(BatchWriteRequest request) {

        return batchWriteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchWriteResult> batchWriteAsync(final BatchWriteRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchWriteRequest, BatchWriteResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<BatchWriteResult>() {
            @Override
            public BatchWriteResult call() throws Exception {
                BatchWriteResult result;

                try {
                    result = batchWrite(request);
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
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest request) {

        return createDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(final CreateDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectoryResult>() {
            @Override
            public CreateDirectoryResult call() throws Exception {
                CreateDirectoryResult result;

                try {
                    result = createDirectory(request);
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
    public java.util.concurrent.Future<CreateFacetResult> createFacetAsync(CreateFacetRequest request) {

        return createFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFacetResult> createFacetAsync(final CreateFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFacetRequest, CreateFacetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateFacetResult>() {
            @Override
            public CreateFacetResult call() throws Exception {
                CreateFacetResult result;

                try {
                    result = createFacet(request);
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
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest request) {

        return createIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(final CreateIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateIndexResult>() {
            @Override
            public CreateIndexResult call() throws Exception {
                CreateIndexResult result;

                try {
                    result = createIndex(request);
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
    public java.util.concurrent.Future<CreateObjectResult> createObjectAsync(CreateObjectRequest request) {

        return createObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateObjectResult> createObjectAsync(final CreateObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateObjectRequest, CreateObjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateObjectResult>() {
            @Override
            public CreateObjectResult call() throws Exception {
                CreateObjectResult result;

                try {
                    result = createObject(request);
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
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request) {

        return createSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(final CreateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateSchemaResult>() {
            @Override
            public CreateSchemaResult call() throws Exception {
                CreateSchemaResult result;

                try {
                    result = createSchema(request);
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
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest request) {

        return deleteDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(final DeleteDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectoryResult>() {
            @Override
            public DeleteDirectoryResult call() throws Exception {
                DeleteDirectoryResult result;

                try {
                    result = deleteDirectory(request);
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
    public java.util.concurrent.Future<DeleteFacetResult> deleteFacetAsync(DeleteFacetRequest request) {

        return deleteFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFacetResult> deleteFacetAsync(final DeleteFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFacetRequest, DeleteFacetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteFacetResult>() {
            @Override
            public DeleteFacetResult call() throws Exception {
                DeleteFacetResult result;

                try {
                    result = deleteFacet(request);
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
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request) {

        return deleteObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(final DeleteObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteObjectResult>() {
            @Override
            public DeleteObjectResult call() throws Exception {
                DeleteObjectResult result;

                try {
                    result = deleteObject(request);
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
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request) {

        return deleteSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(final DeleteSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaResult>() {
            @Override
            public DeleteSchemaResult call() throws Exception {
                DeleteSchemaResult result;

                try {
                    result = deleteSchema(request);
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
    public java.util.concurrent.Future<DetachFromIndexResult> detachFromIndexAsync(DetachFromIndexRequest request) {

        return detachFromIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachFromIndexResult> detachFromIndexAsync(final DetachFromIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachFromIndexRequest, DetachFromIndexResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachFromIndexResult>() {
            @Override
            public DetachFromIndexResult call() throws Exception {
                DetachFromIndexResult result;

                try {
                    result = detachFromIndex(request);
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
    public java.util.concurrent.Future<DetachObjectResult> detachObjectAsync(DetachObjectRequest request) {

        return detachObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachObjectResult> detachObjectAsync(final DetachObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachObjectRequest, DetachObjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachObjectResult>() {
            @Override
            public DetachObjectResult call() throws Exception {
                DetachObjectResult result;

                try {
                    result = detachObject(request);
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
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest request) {

        return detachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(final DetachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DetachPolicyResult>() {
            @Override
            public DetachPolicyResult call() throws Exception {
                DetachPolicyResult result;

                try {
                    result = detachPolicy(request);
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
    public java.util.concurrent.Future<DisableDirectoryResult> disableDirectoryAsync(DisableDirectoryRequest request) {

        return disableDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDirectoryResult> disableDirectoryAsync(final DisableDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableDirectoryRequest, DisableDirectoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DisableDirectoryResult>() {
            @Override
            public DisableDirectoryResult call() throws Exception {
                DisableDirectoryResult result;

                try {
                    result = disableDirectory(request);
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
    public java.util.concurrent.Future<EnableDirectoryResult> enableDirectoryAsync(EnableDirectoryRequest request) {

        return enableDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDirectoryResult> enableDirectoryAsync(final EnableDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableDirectoryRequest, EnableDirectoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableDirectoryResult>() {
            @Override
            public EnableDirectoryResult call() throws Exception {
                EnableDirectoryResult result;

                try {
                    result = enableDirectory(request);
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
    public java.util.concurrent.Future<GetDirectoryResult> getDirectoryAsync(GetDirectoryRequest request) {

        return getDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryResult> getDirectoryAsync(final GetDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDirectoryRequest, GetDirectoryResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetDirectoryResult>() {
            @Override
            public GetDirectoryResult call() throws Exception {
                GetDirectoryResult result;

                try {
                    result = getDirectory(request);
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
    public java.util.concurrent.Future<GetFacetResult> getFacetAsync(GetFacetRequest request) {

        return getFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFacetResult> getFacetAsync(final GetFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFacetRequest, GetFacetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetFacetResult>() {
            @Override
            public GetFacetResult call() throws Exception {
                GetFacetResult result;

                try {
                    result = getFacet(request);
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
    public java.util.concurrent.Future<GetObjectInformationResult> getObjectInformationAsync(GetObjectInformationRequest request) {

        return getObjectInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectInformationResult> getObjectInformationAsync(final GetObjectInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetObjectInformationRequest, GetObjectInformationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetObjectInformationResult>() {
            @Override
            public GetObjectInformationResult call() throws Exception {
                GetObjectInformationResult result;

                try {
                    result = getObjectInformation(request);
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
    public java.util.concurrent.Future<GetSchemaAsJsonResult> getSchemaAsJsonAsync(GetSchemaAsJsonRequest request) {

        return getSchemaAsJsonAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaAsJsonResult> getSchemaAsJsonAsync(final GetSchemaAsJsonRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaAsJsonRequest, GetSchemaAsJsonResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaAsJsonResult>() {
            @Override
            public GetSchemaAsJsonResult call() throws Exception {
                GetSchemaAsJsonResult result;

                try {
                    result = getSchemaAsJson(request);
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
    public java.util.concurrent.Future<ListAppliedSchemaArnsResult> listAppliedSchemaArnsAsync(ListAppliedSchemaArnsRequest request) {

        return listAppliedSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppliedSchemaArnsResult> listAppliedSchemaArnsAsync(final ListAppliedSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppliedSchemaArnsRequest, ListAppliedSchemaArnsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAppliedSchemaArnsResult>() {
            @Override
            public ListAppliedSchemaArnsResult call() throws Exception {
                ListAppliedSchemaArnsResult result;

                try {
                    result = listAppliedSchemaArns(request);
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
    public java.util.concurrent.Future<ListAttachedIndicesResult> listAttachedIndicesAsync(ListAttachedIndicesRequest request) {

        return listAttachedIndicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedIndicesResult> listAttachedIndicesAsync(final ListAttachedIndicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedIndicesRequest, ListAttachedIndicesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedIndicesResult>() {
            @Override
            public ListAttachedIndicesResult call() throws Exception {
                ListAttachedIndicesResult result;

                try {
                    result = listAttachedIndices(request);
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
    public java.util.concurrent.Future<ListDevelopmentSchemaArnsResult> listDevelopmentSchemaArnsAsync(ListDevelopmentSchemaArnsRequest request) {

        return listDevelopmentSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevelopmentSchemaArnsResult> listDevelopmentSchemaArnsAsync(final ListDevelopmentSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevelopmentSchemaArnsRequest, ListDevelopmentSchemaArnsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDevelopmentSchemaArnsResult>() {
            @Override
            public ListDevelopmentSchemaArnsResult call() throws Exception {
                ListDevelopmentSchemaArnsResult result;

                try {
                    result = listDevelopmentSchemaArns(request);
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
    public java.util.concurrent.Future<ListDirectoriesResult> listDirectoriesAsync(ListDirectoriesRequest request) {

        return listDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDirectoriesResult> listDirectoriesAsync(final ListDirectoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDirectoriesRequest, ListDirectoriesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListDirectoriesResult>() {
            @Override
            public ListDirectoriesResult call() throws Exception {
                ListDirectoriesResult result;

                try {
                    result = listDirectories(request);
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
    public java.util.concurrent.Future<ListFacetAttributesResult> listFacetAttributesAsync(ListFacetAttributesRequest request) {

        return listFacetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFacetAttributesResult> listFacetAttributesAsync(final ListFacetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFacetAttributesRequest, ListFacetAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListFacetAttributesResult>() {
            @Override
            public ListFacetAttributesResult call() throws Exception {
                ListFacetAttributesResult result;

                try {
                    result = listFacetAttributes(request);
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
    public java.util.concurrent.Future<ListFacetNamesResult> listFacetNamesAsync(ListFacetNamesRequest request) {

        return listFacetNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFacetNamesResult> listFacetNamesAsync(final ListFacetNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFacetNamesRequest, ListFacetNamesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListFacetNamesResult>() {
            @Override
            public ListFacetNamesResult call() throws Exception {
                ListFacetNamesResult result;

                try {
                    result = listFacetNames(request);
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
    public java.util.concurrent.Future<ListIndexResult> listIndexAsync(ListIndexRequest request) {

        return listIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndexResult> listIndexAsync(final ListIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIndexRequest, ListIndexResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListIndexResult>() {
            @Override
            public ListIndexResult call() throws Exception {
                ListIndexResult result;

                try {
                    result = listIndex(request);
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
    public java.util.concurrent.Future<ListObjectAttributesResult> listObjectAttributesAsync(ListObjectAttributesRequest request) {

        return listObjectAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectAttributesResult> listObjectAttributesAsync(final ListObjectAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectAttributesRequest, ListObjectAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListObjectAttributesResult>() {
            @Override
            public ListObjectAttributesResult call() throws Exception {
                ListObjectAttributesResult result;

                try {
                    result = listObjectAttributes(request);
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
    public java.util.concurrent.Future<ListObjectChildrenResult> listObjectChildrenAsync(ListObjectChildrenRequest request) {

        return listObjectChildrenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectChildrenResult> listObjectChildrenAsync(final ListObjectChildrenRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectChildrenRequest, ListObjectChildrenResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListObjectChildrenResult>() {
            @Override
            public ListObjectChildrenResult call() throws Exception {
                ListObjectChildrenResult result;

                try {
                    result = listObjectChildren(request);
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
    public java.util.concurrent.Future<ListObjectParentPathsResult> listObjectParentPathsAsync(ListObjectParentPathsRequest request) {

        return listObjectParentPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectParentPathsResult> listObjectParentPathsAsync(final ListObjectParentPathsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectParentPathsRequest, ListObjectParentPathsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListObjectParentPathsResult>() {
            @Override
            public ListObjectParentPathsResult call() throws Exception {
                ListObjectParentPathsResult result;

                try {
                    result = listObjectParentPaths(request);
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
    public java.util.concurrent.Future<ListObjectParentsResult> listObjectParentsAsync(ListObjectParentsRequest request) {

        return listObjectParentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectParentsResult> listObjectParentsAsync(final ListObjectParentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectParentsRequest, ListObjectParentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListObjectParentsResult>() {
            @Override
            public ListObjectParentsResult call() throws Exception {
                ListObjectParentsResult result;

                try {
                    result = listObjectParents(request);
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
    public java.util.concurrent.Future<ListObjectPoliciesResult> listObjectPoliciesAsync(ListObjectPoliciesRequest request) {

        return listObjectPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectPoliciesResult> listObjectPoliciesAsync(final ListObjectPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectPoliciesRequest, ListObjectPoliciesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListObjectPoliciesResult>() {
            @Override
            public ListObjectPoliciesResult call() throws Exception {
                ListObjectPoliciesResult result;

                try {
                    result = listObjectPolicies(request);
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
    public java.util.concurrent.Future<ListPolicyAttachmentsResult> listPolicyAttachmentsAsync(ListPolicyAttachmentsRequest request) {

        return listPolicyAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyAttachmentsResult> listPolicyAttachmentsAsync(final ListPolicyAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyAttachmentsRequest, ListPolicyAttachmentsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyAttachmentsResult>() {
            @Override
            public ListPolicyAttachmentsResult call() throws Exception {
                ListPolicyAttachmentsResult result;

                try {
                    result = listPolicyAttachments(request);
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
    public java.util.concurrent.Future<ListPublishedSchemaArnsResult> listPublishedSchemaArnsAsync(ListPublishedSchemaArnsRequest request) {

        return listPublishedSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPublishedSchemaArnsResult> listPublishedSchemaArnsAsync(final ListPublishedSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPublishedSchemaArnsRequest, ListPublishedSchemaArnsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ListPublishedSchemaArnsResult>() {
            @Override
            public ListPublishedSchemaArnsResult call() throws Exception {
                ListPublishedSchemaArnsResult result;

                try {
                    result = listPublishedSchemaArns(request);
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
    public java.util.concurrent.Future<LookupPolicyResult> lookupPolicyAsync(LookupPolicyRequest request) {

        return lookupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LookupPolicyResult> lookupPolicyAsync(final LookupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<LookupPolicyRequest, LookupPolicyResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<LookupPolicyResult>() {
            @Override
            public LookupPolicyResult call() throws Exception {
                LookupPolicyResult result;

                try {
                    result = lookupPolicy(request);
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
    public java.util.concurrent.Future<PublishSchemaResult> publishSchemaAsync(PublishSchemaRequest request) {

        return publishSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishSchemaResult> publishSchemaAsync(final PublishSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishSchemaRequest, PublishSchemaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PublishSchemaResult>() {
            @Override
            public PublishSchemaResult call() throws Exception {
                PublishSchemaResult result;

                try {
                    result = publishSchema(request);
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
    public java.util.concurrent.Future<PutSchemaFromJsonResult> putSchemaFromJsonAsync(PutSchemaFromJsonRequest request) {

        return putSchemaFromJsonAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSchemaFromJsonResult> putSchemaFromJsonAsync(final PutSchemaFromJsonRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSchemaFromJsonRequest, PutSchemaFromJsonResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<PutSchemaFromJsonResult>() {
            @Override
            public PutSchemaFromJsonResult call() throws Exception {
                PutSchemaFromJsonResult result;

                try {
                    result = putSchemaFromJson(request);
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
    public java.util.concurrent.Future<RemoveFacetFromObjectResult> removeFacetFromObjectAsync(RemoveFacetFromObjectRequest request) {

        return removeFacetFromObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFacetFromObjectResult> removeFacetFromObjectAsync(final RemoveFacetFromObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFacetFromObjectRequest, RemoveFacetFromObjectResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<RemoveFacetFromObjectResult>() {
            @Override
            public RemoveFacetFromObjectResult call() throws Exception {
                RemoveFacetFromObjectResult result;

                try {
                    result = removeFacetFromObject(request);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result;

                try {
                    result = tagResource(request);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result;

                try {
                    result = untagResource(request);
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
    public java.util.concurrent.Future<UpdateFacetResult> updateFacetAsync(UpdateFacetRequest request) {

        return updateFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFacetResult> updateFacetAsync(final UpdateFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFacetRequest, UpdateFacetResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateFacetResult>() {
            @Override
            public UpdateFacetResult call() throws Exception {
                UpdateFacetResult result;

                try {
                    result = updateFacet(request);
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
    public java.util.concurrent.Future<UpdateObjectAttributesResult> updateObjectAttributesAsync(UpdateObjectAttributesRequest request) {

        return updateObjectAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateObjectAttributesResult> updateObjectAttributesAsync(final UpdateObjectAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateObjectAttributesRequest, UpdateObjectAttributesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateObjectAttributesResult>() {
            @Override
            public UpdateObjectAttributesResult call() throws Exception {
                UpdateObjectAttributesResult result;

                try {
                    result = updateObjectAttributes(request);
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
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest request) {

        return updateSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(final UpdateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<UpdateSchemaResult>() {
            @Override
            public UpdateSchemaResult call() throws Exception {
                UpdateSchemaResult result;

                try {
                    result = updateSchema(request);
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
