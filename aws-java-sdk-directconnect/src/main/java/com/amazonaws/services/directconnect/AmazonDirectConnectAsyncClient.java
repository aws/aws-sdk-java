/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.directconnect;

import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AWS Direct Connect asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Direct Connect makes it easy to establish a dedicated network connection
 * from your premises to Amazon Web Services (AWS). Using AWS Direct Connect,
 * you can establish private connectivity between AWS and your data center,
 * office, or colocation environment, which in many cases can reduce your
 * network costs, increase bandwidth throughput, and provide a more consistent
 * network experience than Internet-based connections.
 * </p>
 * <p>
 * The AWS Direct Connect API Reference provides descriptions, syntax, and usage
 * examples for each of the actions and data types for AWS Direct Connect. Use
 * the following links to get started using the <i>AWS Direct Connect API
 * Reference</i>:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Operations.html"
 * >Actions</a>: An alphabetical list of all AWS Direct Connect actions.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/API_Types.html"
 * >Data Types</a>: An alphabetical list of all AWS Direct Connect data types.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonParameters.html"
 * >Common Query Parameters</a>: Parameters that all Query actions can use.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/directconnect/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>: Client and server errors that all actions can return.</li>
 * </ul>
 */
public class AmazonDirectConnectAsyncClient extends AmazonDirectConnectClient
        implements AmazonDirectConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect. A credentials provider chain will be used that searches
     * for credentials in this order:
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
    public AmazonDirectConnectAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     *        connects to AWS Direct Connect (ex: proxy settings, retry counts,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the specified AWS account credentials.
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
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the specified AWS account credentials, executor
     * service, and client configuration options.
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
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the specified AWS account credentials provider.
     * Default client settings will be used.
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
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the provided AWS account credentials provider and
     * client configuration options.
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
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonDirectConnectAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * Direct Connect using the specified AWS account credentials provider,
     * executor service, and client configuration options.
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
    public AmazonDirectConnectAsyncClient(
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

    @Override
    public java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest request) {

        return allocateConnectionOnInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            final AllocateConnectionOnInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateConnectionOnInterconnectRequest, AllocateConnectionOnInterconnectResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AllocateConnectionOnInterconnectResult>() {
                    @Override
                    public AllocateConnectionOnInterconnectResult call()
                            throws Exception {
                        AllocateConnectionOnInterconnectResult result;

                        try {
                            result = allocateConnectionOnInterconnect(request);
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
    public java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest request) {

        return allocatePrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            final AllocatePrivateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocatePrivateVirtualInterfaceRequest, AllocatePrivateVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AllocatePrivateVirtualInterfaceResult>() {
                    @Override
                    public AllocatePrivateVirtualInterfaceResult call()
                            throws Exception {
                        AllocatePrivateVirtualInterfaceResult result;

                        try {
                            result = allocatePrivateVirtualInterface(request);
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
    public java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            AllocatePublicVirtualInterfaceRequest request) {

        return allocatePublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            final AllocatePublicVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocatePublicVirtualInterfaceRequest, AllocatePublicVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AllocatePublicVirtualInterfaceResult>() {
                    @Override
                    public AllocatePublicVirtualInterfaceResult call()
                            throws Exception {
                        AllocatePublicVirtualInterfaceResult result;

                        try {
                            result = allocatePublicVirtualInterface(request);
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
    public java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(
            ConfirmConnectionRequest request) {

        return confirmConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(
            final ConfirmConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmConnectionRequest, ConfirmConnectionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ConfirmConnectionResult>() {
                    @Override
                    public ConfirmConnectionResult call() throws Exception {
                        ConfirmConnectionResult result;

                        try {
                            result = confirmConnection(request);
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
    public java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            ConfirmPrivateVirtualInterfaceRequest request) {

        return confirmPrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            final ConfirmPrivateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmPrivateVirtualInterfaceRequest, ConfirmPrivateVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ConfirmPrivateVirtualInterfaceResult>() {
                    @Override
                    public ConfirmPrivateVirtualInterfaceResult call()
                            throws Exception {
                        ConfirmPrivateVirtualInterfaceResult result;

                        try {
                            result = confirmPrivateVirtualInterface(request);
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
    public java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            ConfirmPublicVirtualInterfaceRequest request) {

        return confirmPublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            final ConfirmPublicVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmPublicVirtualInterfaceRequest, ConfirmPublicVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ConfirmPublicVirtualInterfaceResult>() {
                    @Override
                    public ConfirmPublicVirtualInterfaceResult call()
                            throws Exception {
                        ConfirmPublicVirtualInterfaceResult result;

                        try {
                            result = confirmPublicVirtualInterface(request);
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
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(
            CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(
            final CreateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateConnectionResult>() {
                    @Override
                    public CreateConnectionResult call() throws Exception {
                        CreateConnectionResult result;

                        try {
                            result = createConnection(request);
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
    public java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(
            CreateInterconnectRequest request) {

        return createInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(
            final CreateInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInterconnectRequest, CreateInterconnectResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateInterconnectResult>() {
                    @Override
                    public CreateInterconnectResult call() throws Exception {
                        CreateInterconnectResult result;

                        try {
                            result = createInterconnect(request);
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
    public java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(
            CreatePrivateVirtualInterfaceRequest request) {

        return createPrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(
            final CreatePrivateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePrivateVirtualInterfaceRequest, CreatePrivateVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreatePrivateVirtualInterfaceResult>() {
                    @Override
                    public CreatePrivateVirtualInterfaceResult call()
                            throws Exception {
                        CreatePrivateVirtualInterfaceResult result;

                        try {
                            result = createPrivateVirtualInterface(request);
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
    public java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            CreatePublicVirtualInterfaceRequest request) {

        return createPublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(
            final CreatePublicVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreatePublicVirtualInterfaceResult>() {
                    @Override
                    public CreatePublicVirtualInterfaceResult call()
                            throws Exception {
                        CreatePublicVirtualInterfaceResult result;

                        try {
                            result = createPublicVirtualInterface(request);
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
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(
            DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(
            final DeleteConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteConnectionResult>() {
                    @Override
                    public DeleteConnectionResult call() throws Exception {
                        DeleteConnectionResult result;

                        try {
                            result = deleteConnection(request);
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
    public java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(
            DeleteInterconnectRequest request) {

        return deleteInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(
            final DeleteInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInterconnectRequest, DeleteInterconnectResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteInterconnectResult>() {
                    @Override
                    public DeleteInterconnectResult call() throws Exception {
                        DeleteInterconnectResult result;

                        try {
                            result = deleteInterconnect(request);
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
    public java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(
            DeleteVirtualInterfaceRequest request) {

        return deleteVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(
            final DeleteVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteVirtualInterfaceResult>() {
                    @Override
                    public DeleteVirtualInterfaceResult call() throws Exception {
                        DeleteVirtualInterfaceResult result;

                        try {
                            result = deleteVirtualInterface(request);
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
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            DescribeConnectionsRequest request) {

        return describeConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            final DescribeConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeConnectionsResult>() {
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

    /**
     * Simplified method form for invoking the DescribeConnections operation.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync() {

        return describeConnectionsAsync(new DescribeConnectionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConnections operation
     * with an AsyncHandler.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        return describeConnectionsAsync(new DescribeConnectionsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest request) {

        return describeConnectionsOnInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            final DescribeConnectionsOnInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionsOnInterconnectRequest, DescribeConnectionsOnInterconnectResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeConnectionsOnInterconnectResult>() {
                    @Override
                    public DescribeConnectionsOnInterconnectResult call()
                            throws Exception {
                        DescribeConnectionsOnInterconnectResult result;

                        try {
                            result = describeConnectionsOnInterconnect(request);
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
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            DescribeInterconnectsRequest request) {

        return describeInterconnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            final DescribeInterconnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeInterconnectsResult>() {
                    @Override
                    public DescribeInterconnectsResult call() throws Exception {
                        DescribeInterconnectsResult result;

                        try {
                            result = describeInterconnects(request);
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
     * Simplified method form for invoking the DescribeInterconnects operation.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync() {

        return describeInterconnectsAsync(new DescribeInterconnectsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInterconnects operation
     * with an AsyncHandler.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler) {

        return describeInterconnectsAsync(new DescribeInterconnectsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(
            DescribeLocationsRequest request) {

        return describeLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(
            final DescribeLocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLocationsResult>() {
                    @Override
                    public DescribeLocationsResult call() throws Exception {
                        DescribeLocationsResult result;

                        try {
                            result = describeLocations(request);
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
     * Simplified method form for invoking the DescribeLocations operation.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync() {

        return describeLocationsAsync(new DescribeLocationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLocations operation with
     * an AsyncHandler.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler) {

        return describeLocationsAsync(new DescribeLocationsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            DescribeVirtualGatewaysRequest request) {

        return describeVirtualGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            final DescribeVirtualGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeVirtualGatewaysResult>() {
                    @Override
                    public DescribeVirtualGatewaysResult call()
                            throws Exception {
                        DescribeVirtualGatewaysResult result;

                        try {
                            result = describeVirtualGateways(request);
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
     * Simplified method form for invoking the DescribeVirtualGateways
     * operation.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync() {

        return describeVirtualGatewaysAsync(new DescribeVirtualGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation
     * with an AsyncHandler.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler) {

        return describeVirtualGatewaysAsync(
                new DescribeVirtualGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            DescribeVirtualInterfacesRequest request) {

        return describeVirtualInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            final DescribeVirtualInterfacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeVirtualInterfacesResult>() {
                    @Override
                    public DescribeVirtualInterfacesResult call()
                            throws Exception {
                        DescribeVirtualInterfacesResult result;

                        try {
                            result = describeVirtualInterfaces(request);
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
     * Simplified method form for invoking the DescribeVirtualInterfaces
     * operation.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync() {

        return describeVirtualInterfacesAsync(new DescribeVirtualInterfacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces
     * operation with an AsyncHandler.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler) {

        return describeVirtualInterfacesAsync(
                new DescribeVirtualInterfacesRequest(), asyncHandler);
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
}
