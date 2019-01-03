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
 * cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
 * programmatically and includes detailed information on data types and errors. For information about Cloud Directory
 * features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the <a
 * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/what_is_cloud_directory.html">Amazon Cloud
 * Directory Developer Guide</a>.
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
        final AddFacetToObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddFacetToObjectResult>() {
            @Override
            public AddFacetToObjectResult call() throws Exception {
                AddFacetToObjectResult result = null;

                try {
                    result = executeAddFacetToObject(finalRequest);
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
    public java.util.concurrent.Future<ApplySchemaResult> applySchemaAsync(ApplySchemaRequest request) {

        return applySchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApplySchemaResult> applySchemaAsync(final ApplySchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<ApplySchemaRequest, ApplySchemaResult> asyncHandler) {
        final ApplySchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ApplySchemaResult>() {
            @Override
            public ApplySchemaResult call() throws Exception {
                ApplySchemaResult result = null;

                try {
                    result = executeApplySchema(finalRequest);
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
    public java.util.concurrent.Future<AttachObjectResult> attachObjectAsync(AttachObjectRequest request) {

        return attachObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachObjectResult> attachObjectAsync(final AttachObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachObjectRequest, AttachObjectResult> asyncHandler) {
        final AttachObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachObjectResult>() {
            @Override
            public AttachObjectResult call() throws Exception {
                AttachObjectResult result = null;

                try {
                    result = executeAttachObject(finalRequest);
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
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest request) {

        return attachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(final AttachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler) {
        final AttachPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachPolicyResult>() {
            @Override
            public AttachPolicyResult call() throws Exception {
                AttachPolicyResult result = null;

                try {
                    result = executeAttachPolicy(finalRequest);
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
    public java.util.concurrent.Future<AttachToIndexResult> attachToIndexAsync(AttachToIndexRequest request) {

        return attachToIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachToIndexResult> attachToIndexAsync(final AttachToIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachToIndexRequest, AttachToIndexResult> asyncHandler) {
        final AttachToIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachToIndexResult>() {
            @Override
            public AttachToIndexResult call() throws Exception {
                AttachToIndexResult result = null;

                try {
                    result = executeAttachToIndex(finalRequest);
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
    public java.util.concurrent.Future<AttachTypedLinkResult> attachTypedLinkAsync(AttachTypedLinkRequest request) {

        return attachTypedLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AttachTypedLinkResult> attachTypedLinkAsync(final AttachTypedLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<AttachTypedLinkRequest, AttachTypedLinkResult> asyncHandler) {
        final AttachTypedLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AttachTypedLinkResult>() {
            @Override
            public AttachTypedLinkResult call() throws Exception {
                AttachTypedLinkResult result = null;

                try {
                    result = executeAttachTypedLink(finalRequest);
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
    public java.util.concurrent.Future<BatchReadResult> batchReadAsync(BatchReadRequest request) {

        return batchReadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchReadResult> batchReadAsync(final BatchReadRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchReadRequest, BatchReadResult> asyncHandler) {
        final BatchReadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchReadResult>() {
            @Override
            public BatchReadResult call() throws Exception {
                BatchReadResult result = null;

                try {
                    result = executeBatchRead(finalRequest);
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
    public java.util.concurrent.Future<BatchWriteResult> batchWriteAsync(BatchWriteRequest request) {

        return batchWriteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchWriteResult> batchWriteAsync(final BatchWriteRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchWriteRequest, BatchWriteResult> asyncHandler) {
        final BatchWriteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchWriteResult>() {
            @Override
            public BatchWriteResult call() throws Exception {
                BatchWriteResult result = null;

                try {
                    result = executeBatchWrite(finalRequest);
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
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest request) {

        return createDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(final CreateDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler) {
        final CreateDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectoryResult>() {
            @Override
            public CreateDirectoryResult call() throws Exception {
                CreateDirectoryResult result = null;

                try {
                    result = executeCreateDirectory(finalRequest);
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
    public java.util.concurrent.Future<CreateFacetResult> createFacetAsync(CreateFacetRequest request) {

        return createFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFacetResult> createFacetAsync(final CreateFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFacetRequest, CreateFacetResult> asyncHandler) {
        final CreateFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFacetResult>() {
            @Override
            public CreateFacetResult call() throws Exception {
                CreateFacetResult result = null;

                try {
                    result = executeCreateFacet(finalRequest);
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
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest request) {

        return createIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIndexResult> createIndexAsync(final CreateIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler) {
        final CreateIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIndexResult>() {
            @Override
            public CreateIndexResult call() throws Exception {
                CreateIndexResult result = null;

                try {
                    result = executeCreateIndex(finalRequest);
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
    public java.util.concurrent.Future<CreateObjectResult> createObjectAsync(CreateObjectRequest request) {

        return createObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateObjectResult> createObjectAsync(final CreateObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateObjectRequest, CreateObjectResult> asyncHandler) {
        final CreateObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateObjectResult>() {
            @Override
            public CreateObjectResult call() throws Exception {
                CreateObjectResult result = null;

                try {
                    result = executeCreateObject(finalRequest);
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
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest request) {

        return createSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(final CreateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler) {
        final CreateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSchemaResult>() {
            @Override
            public CreateSchemaResult call() throws Exception {
                CreateSchemaResult result = null;

                try {
                    result = executeCreateSchema(finalRequest);
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
    public java.util.concurrent.Future<CreateTypedLinkFacetResult> createTypedLinkFacetAsync(CreateTypedLinkFacetRequest request) {

        return createTypedLinkFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTypedLinkFacetResult> createTypedLinkFacetAsync(final CreateTypedLinkFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTypedLinkFacetRequest, CreateTypedLinkFacetResult> asyncHandler) {
        final CreateTypedLinkFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTypedLinkFacetResult>() {
            @Override
            public CreateTypedLinkFacetResult call() throws Exception {
                CreateTypedLinkFacetResult result = null;

                try {
                    result = executeCreateTypedLinkFacet(finalRequest);
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
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest request) {

        return deleteDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(final DeleteDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler) {
        final DeleteDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectoryResult>() {
            @Override
            public DeleteDirectoryResult call() throws Exception {
                DeleteDirectoryResult result = null;

                try {
                    result = executeDeleteDirectory(finalRequest);
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
    public java.util.concurrent.Future<DeleteFacetResult> deleteFacetAsync(DeleteFacetRequest request) {

        return deleteFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFacetResult> deleteFacetAsync(final DeleteFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFacetRequest, DeleteFacetResult> asyncHandler) {
        final DeleteFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFacetResult>() {
            @Override
            public DeleteFacetResult call() throws Exception {
                DeleteFacetResult result = null;

                try {
                    result = executeDeleteFacet(finalRequest);
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
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request) {

        return deleteObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(final DeleteObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler) {
        final DeleteObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteObjectResult>() {
            @Override
            public DeleteObjectResult call() throws Exception {
                DeleteObjectResult result = null;

                try {
                    result = executeDeleteObject(finalRequest);
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
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest request) {

        return deleteSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(final DeleteSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler) {
        final DeleteSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSchemaResult>() {
            @Override
            public DeleteSchemaResult call() throws Exception {
                DeleteSchemaResult result = null;

                try {
                    result = executeDeleteSchema(finalRequest);
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
    public java.util.concurrent.Future<DeleteTypedLinkFacetResult> deleteTypedLinkFacetAsync(DeleteTypedLinkFacetRequest request) {

        return deleteTypedLinkFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTypedLinkFacetResult> deleteTypedLinkFacetAsync(final DeleteTypedLinkFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTypedLinkFacetRequest, DeleteTypedLinkFacetResult> asyncHandler) {
        final DeleteTypedLinkFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTypedLinkFacetResult>() {
            @Override
            public DeleteTypedLinkFacetResult call() throws Exception {
                DeleteTypedLinkFacetResult result = null;

                try {
                    result = executeDeleteTypedLinkFacet(finalRequest);
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
    public java.util.concurrent.Future<DetachFromIndexResult> detachFromIndexAsync(DetachFromIndexRequest request) {

        return detachFromIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachFromIndexResult> detachFromIndexAsync(final DetachFromIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachFromIndexRequest, DetachFromIndexResult> asyncHandler) {
        final DetachFromIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachFromIndexResult>() {
            @Override
            public DetachFromIndexResult call() throws Exception {
                DetachFromIndexResult result = null;

                try {
                    result = executeDetachFromIndex(finalRequest);
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
    public java.util.concurrent.Future<DetachObjectResult> detachObjectAsync(DetachObjectRequest request) {

        return detachObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachObjectResult> detachObjectAsync(final DetachObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachObjectRequest, DetachObjectResult> asyncHandler) {
        final DetachObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachObjectResult>() {
            @Override
            public DetachObjectResult call() throws Exception {
                DetachObjectResult result = null;

                try {
                    result = executeDetachObject(finalRequest);
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
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest request) {

        return detachPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(final DetachPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler) {
        final DetachPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachPolicyResult>() {
            @Override
            public DetachPolicyResult call() throws Exception {
                DetachPolicyResult result = null;

                try {
                    result = executeDetachPolicy(finalRequest);
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
    public java.util.concurrent.Future<DetachTypedLinkResult> detachTypedLinkAsync(DetachTypedLinkRequest request) {

        return detachTypedLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetachTypedLinkResult> detachTypedLinkAsync(final DetachTypedLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetachTypedLinkRequest, DetachTypedLinkResult> asyncHandler) {
        final DetachTypedLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetachTypedLinkResult>() {
            @Override
            public DetachTypedLinkResult call() throws Exception {
                DetachTypedLinkResult result = null;

                try {
                    result = executeDetachTypedLink(finalRequest);
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
    public java.util.concurrent.Future<DisableDirectoryResult> disableDirectoryAsync(DisableDirectoryRequest request) {

        return disableDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDirectoryResult> disableDirectoryAsync(final DisableDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableDirectoryRequest, DisableDirectoryResult> asyncHandler) {
        final DisableDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableDirectoryResult>() {
            @Override
            public DisableDirectoryResult call() throws Exception {
                DisableDirectoryResult result = null;

                try {
                    result = executeDisableDirectory(finalRequest);
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
    public java.util.concurrent.Future<EnableDirectoryResult> enableDirectoryAsync(EnableDirectoryRequest request) {

        return enableDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDirectoryResult> enableDirectoryAsync(final EnableDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableDirectoryRequest, EnableDirectoryResult> asyncHandler) {
        final EnableDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableDirectoryResult>() {
            @Override
            public EnableDirectoryResult call() throws Exception {
                EnableDirectoryResult result = null;

                try {
                    result = executeEnableDirectory(finalRequest);
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
    public java.util.concurrent.Future<GetAppliedSchemaVersionResult> getAppliedSchemaVersionAsync(GetAppliedSchemaVersionRequest request) {

        return getAppliedSchemaVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppliedSchemaVersionResult> getAppliedSchemaVersionAsync(final GetAppliedSchemaVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAppliedSchemaVersionRequest, GetAppliedSchemaVersionResult> asyncHandler) {
        final GetAppliedSchemaVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAppliedSchemaVersionResult>() {
            @Override
            public GetAppliedSchemaVersionResult call() throws Exception {
                GetAppliedSchemaVersionResult result = null;

                try {
                    result = executeGetAppliedSchemaVersion(finalRequest);
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
    public java.util.concurrent.Future<GetDirectoryResult> getDirectoryAsync(GetDirectoryRequest request) {

        return getDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryResult> getDirectoryAsync(final GetDirectoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDirectoryRequest, GetDirectoryResult> asyncHandler) {
        final GetDirectoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDirectoryResult>() {
            @Override
            public GetDirectoryResult call() throws Exception {
                GetDirectoryResult result = null;

                try {
                    result = executeGetDirectory(finalRequest);
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
    public java.util.concurrent.Future<GetFacetResult> getFacetAsync(GetFacetRequest request) {

        return getFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFacetResult> getFacetAsync(final GetFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFacetRequest, GetFacetResult> asyncHandler) {
        final GetFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFacetResult>() {
            @Override
            public GetFacetResult call() throws Exception {
                GetFacetResult result = null;

                try {
                    result = executeGetFacet(finalRequest);
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
    public java.util.concurrent.Future<GetLinkAttributesResult> getLinkAttributesAsync(GetLinkAttributesRequest request) {

        return getLinkAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinkAttributesResult> getLinkAttributesAsync(final GetLinkAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLinkAttributesRequest, GetLinkAttributesResult> asyncHandler) {
        final GetLinkAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLinkAttributesResult>() {
            @Override
            public GetLinkAttributesResult call() throws Exception {
                GetLinkAttributesResult result = null;

                try {
                    result = executeGetLinkAttributes(finalRequest);
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
    public java.util.concurrent.Future<GetObjectAttributesResult> getObjectAttributesAsync(GetObjectAttributesRequest request) {

        return getObjectAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectAttributesResult> getObjectAttributesAsync(final GetObjectAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetObjectAttributesRequest, GetObjectAttributesResult> asyncHandler) {
        final GetObjectAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetObjectAttributesResult>() {
            @Override
            public GetObjectAttributesResult call() throws Exception {
                GetObjectAttributesResult result = null;

                try {
                    result = executeGetObjectAttributes(finalRequest);
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
    public java.util.concurrent.Future<GetObjectInformationResult> getObjectInformationAsync(GetObjectInformationRequest request) {

        return getObjectInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectInformationResult> getObjectInformationAsync(final GetObjectInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetObjectInformationRequest, GetObjectInformationResult> asyncHandler) {
        final GetObjectInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetObjectInformationResult>() {
            @Override
            public GetObjectInformationResult call() throws Exception {
                GetObjectInformationResult result = null;

                try {
                    result = executeGetObjectInformation(finalRequest);
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
    public java.util.concurrent.Future<GetSchemaAsJsonResult> getSchemaAsJsonAsync(GetSchemaAsJsonRequest request) {

        return getSchemaAsJsonAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaAsJsonResult> getSchemaAsJsonAsync(final GetSchemaAsJsonRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaAsJsonRequest, GetSchemaAsJsonResult> asyncHandler) {
        final GetSchemaAsJsonRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaAsJsonResult>() {
            @Override
            public GetSchemaAsJsonResult call() throws Exception {
                GetSchemaAsJsonResult result = null;

                try {
                    result = executeGetSchemaAsJson(finalRequest);
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
    public java.util.concurrent.Future<GetTypedLinkFacetInformationResult> getTypedLinkFacetInformationAsync(GetTypedLinkFacetInformationRequest request) {

        return getTypedLinkFacetInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTypedLinkFacetInformationResult> getTypedLinkFacetInformationAsync(final GetTypedLinkFacetInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTypedLinkFacetInformationRequest, GetTypedLinkFacetInformationResult> asyncHandler) {
        final GetTypedLinkFacetInformationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTypedLinkFacetInformationResult>() {
            @Override
            public GetTypedLinkFacetInformationResult call() throws Exception {
                GetTypedLinkFacetInformationResult result = null;

                try {
                    result = executeGetTypedLinkFacetInformation(finalRequest);
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
    public java.util.concurrent.Future<ListAppliedSchemaArnsResult> listAppliedSchemaArnsAsync(ListAppliedSchemaArnsRequest request) {

        return listAppliedSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppliedSchemaArnsResult> listAppliedSchemaArnsAsync(final ListAppliedSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAppliedSchemaArnsRequest, ListAppliedSchemaArnsResult> asyncHandler) {
        final ListAppliedSchemaArnsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAppliedSchemaArnsResult>() {
            @Override
            public ListAppliedSchemaArnsResult call() throws Exception {
                ListAppliedSchemaArnsResult result = null;

                try {
                    result = executeListAppliedSchemaArns(finalRequest);
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
    public java.util.concurrent.Future<ListAttachedIndicesResult> listAttachedIndicesAsync(ListAttachedIndicesRequest request) {

        return listAttachedIndicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedIndicesResult> listAttachedIndicesAsync(final ListAttachedIndicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttachedIndicesRequest, ListAttachedIndicesResult> asyncHandler) {
        final ListAttachedIndicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttachedIndicesResult>() {
            @Override
            public ListAttachedIndicesResult call() throws Exception {
                ListAttachedIndicesResult result = null;

                try {
                    result = executeListAttachedIndices(finalRequest);
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
    public java.util.concurrent.Future<ListDevelopmentSchemaArnsResult> listDevelopmentSchemaArnsAsync(ListDevelopmentSchemaArnsRequest request) {

        return listDevelopmentSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDevelopmentSchemaArnsResult> listDevelopmentSchemaArnsAsync(final ListDevelopmentSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDevelopmentSchemaArnsRequest, ListDevelopmentSchemaArnsResult> asyncHandler) {
        final ListDevelopmentSchemaArnsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDevelopmentSchemaArnsResult>() {
            @Override
            public ListDevelopmentSchemaArnsResult call() throws Exception {
                ListDevelopmentSchemaArnsResult result = null;

                try {
                    result = executeListDevelopmentSchemaArns(finalRequest);
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
    public java.util.concurrent.Future<ListDirectoriesResult> listDirectoriesAsync(ListDirectoriesRequest request) {

        return listDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDirectoriesResult> listDirectoriesAsync(final ListDirectoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDirectoriesRequest, ListDirectoriesResult> asyncHandler) {
        final ListDirectoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDirectoriesResult>() {
            @Override
            public ListDirectoriesResult call() throws Exception {
                ListDirectoriesResult result = null;

                try {
                    result = executeListDirectories(finalRequest);
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
    public java.util.concurrent.Future<ListFacetAttributesResult> listFacetAttributesAsync(ListFacetAttributesRequest request) {

        return listFacetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFacetAttributesResult> listFacetAttributesAsync(final ListFacetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFacetAttributesRequest, ListFacetAttributesResult> asyncHandler) {
        final ListFacetAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFacetAttributesResult>() {
            @Override
            public ListFacetAttributesResult call() throws Exception {
                ListFacetAttributesResult result = null;

                try {
                    result = executeListFacetAttributes(finalRequest);
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
    public java.util.concurrent.Future<ListFacetNamesResult> listFacetNamesAsync(ListFacetNamesRequest request) {

        return listFacetNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFacetNamesResult> listFacetNamesAsync(final ListFacetNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFacetNamesRequest, ListFacetNamesResult> asyncHandler) {
        final ListFacetNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFacetNamesResult>() {
            @Override
            public ListFacetNamesResult call() throws Exception {
                ListFacetNamesResult result = null;

                try {
                    result = executeListFacetNames(finalRequest);
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
    public java.util.concurrent.Future<ListIncomingTypedLinksResult> listIncomingTypedLinksAsync(ListIncomingTypedLinksRequest request) {

        return listIncomingTypedLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIncomingTypedLinksResult> listIncomingTypedLinksAsync(final ListIncomingTypedLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIncomingTypedLinksRequest, ListIncomingTypedLinksResult> asyncHandler) {
        final ListIncomingTypedLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIncomingTypedLinksResult>() {
            @Override
            public ListIncomingTypedLinksResult call() throws Exception {
                ListIncomingTypedLinksResult result = null;

                try {
                    result = executeListIncomingTypedLinks(finalRequest);
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
    public java.util.concurrent.Future<ListIndexResult> listIndexAsync(ListIndexRequest request) {

        return listIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIndexResult> listIndexAsync(final ListIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIndexRequest, ListIndexResult> asyncHandler) {
        final ListIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIndexResult>() {
            @Override
            public ListIndexResult call() throws Exception {
                ListIndexResult result = null;

                try {
                    result = executeListIndex(finalRequest);
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
    public java.util.concurrent.Future<ListManagedSchemaArnsResult> listManagedSchemaArnsAsync(ListManagedSchemaArnsRequest request) {

        return listManagedSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedSchemaArnsResult> listManagedSchemaArnsAsync(final ListManagedSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListManagedSchemaArnsRequest, ListManagedSchemaArnsResult> asyncHandler) {
        final ListManagedSchemaArnsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListManagedSchemaArnsResult>() {
            @Override
            public ListManagedSchemaArnsResult call() throws Exception {
                ListManagedSchemaArnsResult result = null;

                try {
                    result = executeListManagedSchemaArns(finalRequest);
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
    public java.util.concurrent.Future<ListObjectAttributesResult> listObjectAttributesAsync(ListObjectAttributesRequest request) {

        return listObjectAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectAttributesResult> listObjectAttributesAsync(final ListObjectAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectAttributesRequest, ListObjectAttributesResult> asyncHandler) {
        final ListObjectAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListObjectAttributesResult>() {
            @Override
            public ListObjectAttributesResult call() throws Exception {
                ListObjectAttributesResult result = null;

                try {
                    result = executeListObjectAttributes(finalRequest);
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
    public java.util.concurrent.Future<ListObjectChildrenResult> listObjectChildrenAsync(ListObjectChildrenRequest request) {

        return listObjectChildrenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectChildrenResult> listObjectChildrenAsync(final ListObjectChildrenRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectChildrenRequest, ListObjectChildrenResult> asyncHandler) {
        final ListObjectChildrenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListObjectChildrenResult>() {
            @Override
            public ListObjectChildrenResult call() throws Exception {
                ListObjectChildrenResult result = null;

                try {
                    result = executeListObjectChildren(finalRequest);
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
    public java.util.concurrent.Future<ListObjectParentPathsResult> listObjectParentPathsAsync(ListObjectParentPathsRequest request) {

        return listObjectParentPathsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectParentPathsResult> listObjectParentPathsAsync(final ListObjectParentPathsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectParentPathsRequest, ListObjectParentPathsResult> asyncHandler) {
        final ListObjectParentPathsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListObjectParentPathsResult>() {
            @Override
            public ListObjectParentPathsResult call() throws Exception {
                ListObjectParentPathsResult result = null;

                try {
                    result = executeListObjectParentPaths(finalRequest);
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
    public java.util.concurrent.Future<ListObjectParentsResult> listObjectParentsAsync(ListObjectParentsRequest request) {

        return listObjectParentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectParentsResult> listObjectParentsAsync(final ListObjectParentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectParentsRequest, ListObjectParentsResult> asyncHandler) {
        final ListObjectParentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListObjectParentsResult>() {
            @Override
            public ListObjectParentsResult call() throws Exception {
                ListObjectParentsResult result = null;

                try {
                    result = executeListObjectParents(finalRequest);
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
    public java.util.concurrent.Future<ListObjectPoliciesResult> listObjectPoliciesAsync(ListObjectPoliciesRequest request) {

        return listObjectPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListObjectPoliciesResult> listObjectPoliciesAsync(final ListObjectPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListObjectPoliciesRequest, ListObjectPoliciesResult> asyncHandler) {
        final ListObjectPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListObjectPoliciesResult>() {
            @Override
            public ListObjectPoliciesResult call() throws Exception {
                ListObjectPoliciesResult result = null;

                try {
                    result = executeListObjectPolicies(finalRequest);
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
    public java.util.concurrent.Future<ListOutgoingTypedLinksResult> listOutgoingTypedLinksAsync(ListOutgoingTypedLinksRequest request) {

        return listOutgoingTypedLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOutgoingTypedLinksResult> listOutgoingTypedLinksAsync(final ListOutgoingTypedLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOutgoingTypedLinksRequest, ListOutgoingTypedLinksResult> asyncHandler) {
        final ListOutgoingTypedLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOutgoingTypedLinksResult>() {
            @Override
            public ListOutgoingTypedLinksResult call() throws Exception {
                ListOutgoingTypedLinksResult result = null;

                try {
                    result = executeListOutgoingTypedLinks(finalRequest);
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
    public java.util.concurrent.Future<ListPolicyAttachmentsResult> listPolicyAttachmentsAsync(ListPolicyAttachmentsRequest request) {

        return listPolicyAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyAttachmentsResult> listPolicyAttachmentsAsync(final ListPolicyAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPolicyAttachmentsRequest, ListPolicyAttachmentsResult> asyncHandler) {
        final ListPolicyAttachmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPolicyAttachmentsResult>() {
            @Override
            public ListPolicyAttachmentsResult call() throws Exception {
                ListPolicyAttachmentsResult result = null;

                try {
                    result = executeListPolicyAttachments(finalRequest);
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
    public java.util.concurrent.Future<ListPublishedSchemaArnsResult> listPublishedSchemaArnsAsync(ListPublishedSchemaArnsRequest request) {

        return listPublishedSchemaArnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPublishedSchemaArnsResult> listPublishedSchemaArnsAsync(final ListPublishedSchemaArnsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPublishedSchemaArnsRequest, ListPublishedSchemaArnsResult> asyncHandler) {
        final ListPublishedSchemaArnsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPublishedSchemaArnsResult>() {
            @Override
            public ListPublishedSchemaArnsResult call() throws Exception {
                ListPublishedSchemaArnsResult result = null;

                try {
                    result = executeListPublishedSchemaArns(finalRequest);
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
    public java.util.concurrent.Future<ListTypedLinkFacetAttributesResult> listTypedLinkFacetAttributesAsync(ListTypedLinkFacetAttributesRequest request) {

        return listTypedLinkFacetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTypedLinkFacetAttributesResult> listTypedLinkFacetAttributesAsync(final ListTypedLinkFacetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTypedLinkFacetAttributesRequest, ListTypedLinkFacetAttributesResult> asyncHandler) {
        final ListTypedLinkFacetAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTypedLinkFacetAttributesResult>() {
            @Override
            public ListTypedLinkFacetAttributesResult call() throws Exception {
                ListTypedLinkFacetAttributesResult result = null;

                try {
                    result = executeListTypedLinkFacetAttributes(finalRequest);
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
    public java.util.concurrent.Future<ListTypedLinkFacetNamesResult> listTypedLinkFacetNamesAsync(ListTypedLinkFacetNamesRequest request) {

        return listTypedLinkFacetNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTypedLinkFacetNamesResult> listTypedLinkFacetNamesAsync(final ListTypedLinkFacetNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTypedLinkFacetNamesRequest, ListTypedLinkFacetNamesResult> asyncHandler) {
        final ListTypedLinkFacetNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTypedLinkFacetNamesResult>() {
            @Override
            public ListTypedLinkFacetNamesResult call() throws Exception {
                ListTypedLinkFacetNamesResult result = null;

                try {
                    result = executeListTypedLinkFacetNames(finalRequest);
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
    public java.util.concurrent.Future<LookupPolicyResult> lookupPolicyAsync(LookupPolicyRequest request) {

        return lookupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LookupPolicyResult> lookupPolicyAsync(final LookupPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<LookupPolicyRequest, LookupPolicyResult> asyncHandler) {
        final LookupPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<LookupPolicyResult>() {
            @Override
            public LookupPolicyResult call() throws Exception {
                LookupPolicyResult result = null;

                try {
                    result = executeLookupPolicy(finalRequest);
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
    public java.util.concurrent.Future<PublishSchemaResult> publishSchemaAsync(PublishSchemaRequest request) {

        return publishSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishSchemaResult> publishSchemaAsync(final PublishSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishSchemaRequest, PublishSchemaResult> asyncHandler) {
        final PublishSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PublishSchemaResult>() {
            @Override
            public PublishSchemaResult call() throws Exception {
                PublishSchemaResult result = null;

                try {
                    result = executePublishSchema(finalRequest);
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
    public java.util.concurrent.Future<PutSchemaFromJsonResult> putSchemaFromJsonAsync(PutSchemaFromJsonRequest request) {

        return putSchemaFromJsonAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSchemaFromJsonResult> putSchemaFromJsonAsync(final PutSchemaFromJsonRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSchemaFromJsonRequest, PutSchemaFromJsonResult> asyncHandler) {
        final PutSchemaFromJsonRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSchemaFromJsonResult>() {
            @Override
            public PutSchemaFromJsonResult call() throws Exception {
                PutSchemaFromJsonResult result = null;

                try {
                    result = executePutSchemaFromJson(finalRequest);
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
    public java.util.concurrent.Future<RemoveFacetFromObjectResult> removeFacetFromObjectAsync(RemoveFacetFromObjectRequest request) {

        return removeFacetFromObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFacetFromObjectResult> removeFacetFromObjectAsync(final RemoveFacetFromObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFacetFromObjectRequest, RemoveFacetFromObjectResult> asyncHandler) {
        final RemoveFacetFromObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveFacetFromObjectResult>() {
            @Override
            public RemoveFacetFromObjectResult call() throws Exception {
                RemoveFacetFromObjectResult result = null;

                try {
                    result = executeRemoveFacetFromObject(finalRequest);
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
    public java.util.concurrent.Future<UpdateFacetResult> updateFacetAsync(UpdateFacetRequest request) {

        return updateFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFacetResult> updateFacetAsync(final UpdateFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFacetRequest, UpdateFacetResult> asyncHandler) {
        final UpdateFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFacetResult>() {
            @Override
            public UpdateFacetResult call() throws Exception {
                UpdateFacetResult result = null;

                try {
                    result = executeUpdateFacet(finalRequest);
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
    public java.util.concurrent.Future<UpdateLinkAttributesResult> updateLinkAttributesAsync(UpdateLinkAttributesRequest request) {

        return updateLinkAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLinkAttributesResult> updateLinkAttributesAsync(final UpdateLinkAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLinkAttributesRequest, UpdateLinkAttributesResult> asyncHandler) {
        final UpdateLinkAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLinkAttributesResult>() {
            @Override
            public UpdateLinkAttributesResult call() throws Exception {
                UpdateLinkAttributesResult result = null;

                try {
                    result = executeUpdateLinkAttributes(finalRequest);
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
    public java.util.concurrent.Future<UpdateObjectAttributesResult> updateObjectAttributesAsync(UpdateObjectAttributesRequest request) {

        return updateObjectAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateObjectAttributesResult> updateObjectAttributesAsync(final UpdateObjectAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateObjectAttributesRequest, UpdateObjectAttributesResult> asyncHandler) {
        final UpdateObjectAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateObjectAttributesResult>() {
            @Override
            public UpdateObjectAttributesResult call() throws Exception {
                UpdateObjectAttributesResult result = null;

                try {
                    result = executeUpdateObjectAttributes(finalRequest);
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
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest request) {

        return updateSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(final UpdateSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResult> asyncHandler) {
        final UpdateSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSchemaResult>() {
            @Override
            public UpdateSchemaResult call() throws Exception {
                UpdateSchemaResult result = null;

                try {
                    result = executeUpdateSchema(finalRequest);
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
    public java.util.concurrent.Future<UpdateTypedLinkFacetResult> updateTypedLinkFacetAsync(UpdateTypedLinkFacetRequest request) {

        return updateTypedLinkFacetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTypedLinkFacetResult> updateTypedLinkFacetAsync(final UpdateTypedLinkFacetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTypedLinkFacetRequest, UpdateTypedLinkFacetResult> asyncHandler) {
        final UpdateTypedLinkFacetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTypedLinkFacetResult>() {
            @Override
            public UpdateTypedLinkFacetResult call() throws Exception {
                UpdateTypedLinkFacetResult result = null;

                try {
                    result = executeUpdateTypedLinkFacet(finalRequest);
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
    public java.util.concurrent.Future<UpgradeAppliedSchemaResult> upgradeAppliedSchemaAsync(UpgradeAppliedSchemaRequest request) {

        return upgradeAppliedSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeAppliedSchemaResult> upgradeAppliedSchemaAsync(final UpgradeAppliedSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeAppliedSchemaRequest, UpgradeAppliedSchemaResult> asyncHandler) {
        final UpgradeAppliedSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeAppliedSchemaResult>() {
            @Override
            public UpgradeAppliedSchemaResult call() throws Exception {
                UpgradeAppliedSchemaResult result = null;

                try {
                    result = executeUpgradeAppliedSchema(finalRequest);
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
    public java.util.concurrent.Future<UpgradePublishedSchemaResult> upgradePublishedSchemaAsync(UpgradePublishedSchemaRequest request) {

        return upgradePublishedSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradePublishedSchemaResult> upgradePublishedSchemaAsync(final UpgradePublishedSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradePublishedSchemaRequest, UpgradePublishedSchemaResult> asyncHandler) {
        final UpgradePublishedSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradePublishedSchemaResult>() {
            @Override
            public UpgradePublishedSchemaResult call() throws Exception {
                UpgradePublishedSchemaResult result = null;

                try {
                    result = executeUpgradePublishedSchema(finalRequest);
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
