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
package com.amazonaws.services.directconnect;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing AWS Direct Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
 * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. With this
 * connection in place, you can create virtual interfaces directly to the AWS cloud (for example, to Amazon EC2 and
 * Amazon S3) and to Amazon VPC, bypassing Internet service providers in your network path. A connection provides access
 * to all AWS Regions except the China (Beijing) and (China) Ningxia Regions. AWS resources in the China Regions can
 * only be accessed through locations associated with those Regions.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDirectConnectAsyncClient extends AmazonDirectConnectClient implements AmazonDirectConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect. A credentials provider
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
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect. A credentials provider
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
     *        The client configuration options controlling how this client connects to AWS Direct Connect (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified AWS
     * account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified AWS
     * account credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified AWS
     * account credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified AWS
     * account credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the provided AWS
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
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified AWS
     * account credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified AWS
     * account credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonDirectConnectAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonDirectConnectAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonDirectConnectAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonDirectConnectAsyncClientBuilder asyncBuilder() {
        return AmazonDirectConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Direct Connect using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonDirectConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AcceptDirectConnectGatewayAssociationProposalResult> acceptDirectConnectGatewayAssociationProposalAsync(
            AcceptDirectConnectGatewayAssociationProposalRequest request) {

        return acceptDirectConnectGatewayAssociationProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptDirectConnectGatewayAssociationProposalResult> acceptDirectConnectGatewayAssociationProposalAsync(
            final AcceptDirectConnectGatewayAssociationProposalRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptDirectConnectGatewayAssociationProposalRequest, AcceptDirectConnectGatewayAssociationProposalResult> asyncHandler) {
        final AcceptDirectConnectGatewayAssociationProposalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptDirectConnectGatewayAssociationProposalResult>() {
            @Override
            public AcceptDirectConnectGatewayAssociationProposalResult call() throws Exception {
                AcceptDirectConnectGatewayAssociationProposalResult result = null;

                try {
                    result = executeAcceptDirectConnectGatewayAssociationProposal(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            AllocateConnectionOnInterconnectRequest request) {

        return allocateConnectionOnInterconnectAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<AllocateConnectionOnInterconnectResult> allocateConnectionOnInterconnectAsync(
            final AllocateConnectionOnInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateConnectionOnInterconnectRequest, AllocateConnectionOnInterconnectResult> asyncHandler) {
        final AllocateConnectionOnInterconnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocateConnectionOnInterconnectResult>() {
            @Override
            public AllocateConnectionOnInterconnectResult call() throws Exception {
                AllocateConnectionOnInterconnectResult result = null;

                try {
                    result = executeAllocateConnectionOnInterconnect(finalRequest);
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
    public java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(AllocateHostedConnectionRequest request) {

        return allocateHostedConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocateHostedConnectionResult> allocateHostedConnectionAsync(final AllocateHostedConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocateHostedConnectionRequest, AllocateHostedConnectionResult> asyncHandler) {
        final AllocateHostedConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocateHostedConnectionResult>() {
            @Override
            public AllocateHostedConnectionResult call() throws Exception {
                AllocateHostedConnectionResult result = null;

                try {
                    result = executeAllocateHostedConnection(finalRequest);
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
    public java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            AllocatePrivateVirtualInterfaceRequest request) {

        return allocatePrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocatePrivateVirtualInterfaceResult> allocatePrivateVirtualInterfaceAsync(
            final AllocatePrivateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocatePrivateVirtualInterfaceRequest, AllocatePrivateVirtualInterfaceResult> asyncHandler) {
        final AllocatePrivateVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocatePrivateVirtualInterfaceResult>() {
            @Override
            public AllocatePrivateVirtualInterfaceResult call() throws Exception {
                AllocatePrivateVirtualInterfaceResult result = null;

                try {
                    result = executeAllocatePrivateVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(AllocatePublicVirtualInterfaceRequest request) {

        return allocatePublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllocatePublicVirtualInterfaceResult> allocatePublicVirtualInterfaceAsync(
            final AllocatePublicVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllocatePublicVirtualInterfaceRequest, AllocatePublicVirtualInterfaceResult> asyncHandler) {
        final AllocatePublicVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllocatePublicVirtualInterfaceResult>() {
            @Override
            public AllocatePublicVirtualInterfaceResult call() throws Exception {
                AllocatePublicVirtualInterfaceResult result = null;

                try {
                    result = executeAllocatePublicVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<AssociateConnectionWithLagResult> associateConnectionWithLagAsync(AssociateConnectionWithLagRequest request) {

        return associateConnectionWithLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateConnectionWithLagResult> associateConnectionWithLagAsync(final AssociateConnectionWithLagRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateConnectionWithLagRequest, AssociateConnectionWithLagResult> asyncHandler) {
        final AssociateConnectionWithLagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateConnectionWithLagResult>() {
            @Override
            public AssociateConnectionWithLagResult call() throws Exception {
                AssociateConnectionWithLagResult result = null;

                try {
                    result = executeAssociateConnectionWithLag(finalRequest);
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
    public java.util.concurrent.Future<AssociateHostedConnectionResult> associateHostedConnectionAsync(AssociateHostedConnectionRequest request) {

        return associateHostedConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateHostedConnectionResult> associateHostedConnectionAsync(final AssociateHostedConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateHostedConnectionRequest, AssociateHostedConnectionResult> asyncHandler) {
        final AssociateHostedConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateHostedConnectionResult>() {
            @Override
            public AssociateHostedConnectionResult call() throws Exception {
                AssociateHostedConnectionResult result = null;

                try {
                    result = executeAssociateHostedConnection(finalRequest);
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
    public java.util.concurrent.Future<AssociateVirtualInterfaceResult> associateVirtualInterfaceAsync(AssociateVirtualInterfaceRequest request) {

        return associateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateVirtualInterfaceResult> associateVirtualInterfaceAsync(final AssociateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateVirtualInterfaceRequest, AssociateVirtualInterfaceResult> asyncHandler) {
        final AssociateVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateVirtualInterfaceResult>() {
            @Override
            public AssociateVirtualInterfaceResult call() throws Exception {
                AssociateVirtualInterfaceResult result = null;

                try {
                    result = executeAssociateVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(ConfirmConnectionRequest request) {

        return confirmConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmConnectionResult> confirmConnectionAsync(final ConfirmConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmConnectionRequest, ConfirmConnectionResult> asyncHandler) {
        final ConfirmConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmConnectionResult>() {
            @Override
            public ConfirmConnectionResult call() throws Exception {
                ConfirmConnectionResult result = null;

                try {
                    result = executeConfirmConnection(finalRequest);
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
    public java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(ConfirmPrivateVirtualInterfaceRequest request) {

        return confirmPrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmPrivateVirtualInterfaceResult> confirmPrivateVirtualInterfaceAsync(
            final ConfirmPrivateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmPrivateVirtualInterfaceRequest, ConfirmPrivateVirtualInterfaceResult> asyncHandler) {
        final ConfirmPrivateVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmPrivateVirtualInterfaceResult>() {
            @Override
            public ConfirmPrivateVirtualInterfaceResult call() throws Exception {
                ConfirmPrivateVirtualInterfaceResult result = null;

                try {
                    result = executeConfirmPrivateVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(ConfirmPublicVirtualInterfaceRequest request) {

        return confirmPublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmPublicVirtualInterfaceResult> confirmPublicVirtualInterfaceAsync(
            final ConfirmPublicVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmPublicVirtualInterfaceRequest, ConfirmPublicVirtualInterfaceResult> asyncHandler) {
        final ConfirmPublicVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfirmPublicVirtualInterfaceResult>() {
            @Override
            public ConfirmPublicVirtualInterfaceResult call() throws Exception {
                ConfirmPublicVirtualInterfaceResult result = null;

                try {
                    result = executeConfirmPublicVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(CreateBGPPeerRequest request) {

        return createBGPPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBGPPeerResult> createBGPPeerAsync(final CreateBGPPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBGPPeerRequest, CreateBGPPeerResult> asyncHandler) {
        final CreateBGPPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBGPPeerResult>() {
            @Override
            public CreateBGPPeerResult call() throws Exception {
                CreateBGPPeerResult result = null;

                try {
                    result = executeCreateBGPPeer(finalRequest);
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
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(final CreateConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {
        final CreateConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConnectionResult>() {
            @Override
            public CreateConnectionResult call() throws Exception {
                CreateConnectionResult result = null;

                try {
                    result = executeCreateConnection(finalRequest);
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
    public java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(CreateDirectConnectGatewayRequest request) {

        return createDirectConnectGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayResult> createDirectConnectGatewayAsync(final CreateDirectConnectGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayRequest, CreateDirectConnectGatewayResult> asyncHandler) {
        final CreateDirectConnectGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectConnectGatewayResult>() {
            @Override
            public CreateDirectConnectGatewayResult call() throws Exception {
                CreateDirectConnectGatewayResult result = null;

                try {
                    result = executeCreateDirectConnectGateway(finalRequest);
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
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationResult> createDirectConnectGatewayAssociationAsync(
            CreateDirectConnectGatewayAssociationRequest request) {

        return createDirectConnectGatewayAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationResult> createDirectConnectGatewayAssociationAsync(
            final CreateDirectConnectGatewayAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayAssociationRequest, CreateDirectConnectGatewayAssociationResult> asyncHandler) {
        final CreateDirectConnectGatewayAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectConnectGatewayAssociationResult>() {
            @Override
            public CreateDirectConnectGatewayAssociationResult call() throws Exception {
                CreateDirectConnectGatewayAssociationResult result = null;

                try {
                    result = executeCreateDirectConnectGatewayAssociation(finalRequest);
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
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationProposalResult> createDirectConnectGatewayAssociationProposalAsync(
            CreateDirectConnectGatewayAssociationProposalRequest request) {

        return createDirectConnectGatewayAssociationProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectConnectGatewayAssociationProposalResult> createDirectConnectGatewayAssociationProposalAsync(
            final CreateDirectConnectGatewayAssociationProposalRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDirectConnectGatewayAssociationProposalRequest, CreateDirectConnectGatewayAssociationProposalResult> asyncHandler) {
        final CreateDirectConnectGatewayAssociationProposalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDirectConnectGatewayAssociationProposalResult>() {
            @Override
            public CreateDirectConnectGatewayAssociationProposalResult call() throws Exception {
                CreateDirectConnectGatewayAssociationProposalResult result = null;

                try {
                    result = executeCreateDirectConnectGatewayAssociationProposal(finalRequest);
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
    public java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(CreateInterconnectRequest request) {

        return createInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInterconnectResult> createInterconnectAsync(final CreateInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInterconnectRequest, CreateInterconnectResult> asyncHandler) {
        final CreateInterconnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInterconnectResult>() {
            @Override
            public CreateInterconnectResult call() throws Exception {
                CreateInterconnectResult result = null;

                try {
                    result = executeCreateInterconnect(finalRequest);
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
    public java.util.concurrent.Future<CreateLagResult> createLagAsync(CreateLagRequest request) {

        return createLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLagResult> createLagAsync(final CreateLagRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLagRequest, CreateLagResult> asyncHandler) {
        final CreateLagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLagResult>() {
            @Override
            public CreateLagResult call() throws Exception {
                CreateLagResult result = null;

                try {
                    result = executeCreateLag(finalRequest);
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
    public java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(CreatePrivateVirtualInterfaceRequest request) {

        return createPrivateVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateVirtualInterfaceResult> createPrivateVirtualInterfaceAsync(
            final CreatePrivateVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePrivateVirtualInterfaceRequest, CreatePrivateVirtualInterfaceResult> asyncHandler) {
        final CreatePrivateVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePrivateVirtualInterfaceResult>() {
            @Override
            public CreatePrivateVirtualInterfaceResult call() throws Exception {
                CreatePrivateVirtualInterfaceResult result = null;

                try {
                    result = executeCreatePrivateVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(CreatePublicVirtualInterfaceRequest request) {

        return createPublicVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicVirtualInterfaceResult> createPublicVirtualInterfaceAsync(final CreatePublicVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePublicVirtualInterfaceRequest, CreatePublicVirtualInterfaceResult> asyncHandler) {
        final CreatePublicVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePublicVirtualInterfaceResult>() {
            @Override
            public CreatePublicVirtualInterfaceResult call() throws Exception {
                CreatePublicVirtualInterfaceResult result = null;

                try {
                    result = executeCreatePublicVirtualInterface(finalRequest);
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
    public java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(DeleteBGPPeerRequest request) {

        return deleteBGPPeerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBGPPeerResult> deleteBGPPeerAsync(final DeleteBGPPeerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBGPPeerRequest, DeleteBGPPeerResult> asyncHandler) {
        final DeleteBGPPeerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBGPPeerResult>() {
            @Override
            public DeleteBGPPeerResult call() throws Exception {
                DeleteBGPPeerResult result = null;

                try {
                    result = executeDeleteBGPPeer(finalRequest);
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
    public java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(DeleteDirectConnectGatewayRequest request) {

        return deleteDirectConnectGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayResult> deleteDirectConnectGatewayAsync(final DeleteDirectConnectGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayRequest, DeleteDirectConnectGatewayResult> asyncHandler) {
        final DeleteDirectConnectGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectConnectGatewayResult>() {
            @Override
            public DeleteDirectConnectGatewayResult call() throws Exception {
                DeleteDirectConnectGatewayResult result = null;

                try {
                    result = executeDeleteDirectConnectGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationResult> deleteDirectConnectGatewayAssociationAsync(
            DeleteDirectConnectGatewayAssociationRequest request) {

        return deleteDirectConnectGatewayAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationResult> deleteDirectConnectGatewayAssociationAsync(
            final DeleteDirectConnectGatewayAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayAssociationRequest, DeleteDirectConnectGatewayAssociationResult> asyncHandler) {
        final DeleteDirectConnectGatewayAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectConnectGatewayAssociationResult>() {
            @Override
            public DeleteDirectConnectGatewayAssociationResult call() throws Exception {
                DeleteDirectConnectGatewayAssociationResult result = null;

                try {
                    result = executeDeleteDirectConnectGatewayAssociation(finalRequest);
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
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationProposalResult> deleteDirectConnectGatewayAssociationProposalAsync(
            DeleteDirectConnectGatewayAssociationProposalRequest request) {

        return deleteDirectConnectGatewayAssociationProposalAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectConnectGatewayAssociationProposalResult> deleteDirectConnectGatewayAssociationProposalAsync(
            final DeleteDirectConnectGatewayAssociationProposalRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDirectConnectGatewayAssociationProposalRequest, DeleteDirectConnectGatewayAssociationProposalResult> asyncHandler) {
        final DeleteDirectConnectGatewayAssociationProposalRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDirectConnectGatewayAssociationProposalResult>() {
            @Override
            public DeleteDirectConnectGatewayAssociationProposalResult call() throws Exception {
                DeleteDirectConnectGatewayAssociationProposalResult result = null;

                try {
                    result = executeDeleteDirectConnectGatewayAssociationProposal(finalRequest);
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
    public java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(DeleteInterconnectRequest request) {

        return deleteInterconnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInterconnectResult> deleteInterconnectAsync(final DeleteInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInterconnectRequest, DeleteInterconnectResult> asyncHandler) {
        final DeleteInterconnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInterconnectResult>() {
            @Override
            public DeleteInterconnectResult call() throws Exception {
                DeleteInterconnectResult result = null;

                try {
                    result = executeDeleteInterconnect(finalRequest);
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
    public java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(DeleteLagRequest request) {

        return deleteLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLagResult> deleteLagAsync(final DeleteLagRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLagRequest, DeleteLagResult> asyncHandler) {
        final DeleteLagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLagResult>() {
            @Override
            public DeleteLagResult call() throws Exception {
                DeleteLagResult result = null;

                try {
                    result = executeDeleteLag(finalRequest);
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
    public java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(DeleteVirtualInterfaceRequest request) {

        return deleteVirtualInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualInterfaceResult> deleteVirtualInterfaceAsync(final DeleteVirtualInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualInterfaceRequest, DeleteVirtualInterfaceResult> asyncHandler) {
        final DeleteVirtualInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVirtualInterfaceResult>() {
            @Override
            public DeleteVirtualInterfaceResult call() throws Exception {
                DeleteVirtualInterfaceResult result = null;

                try {
                    result = executeDeleteVirtualInterface(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(DescribeConnectionLoaRequest request) {

        return describeConnectionLoaAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionLoaResult> describeConnectionLoaAsync(final DescribeConnectionLoaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionLoaRequest, DescribeConnectionLoaResult> asyncHandler) {
        final DescribeConnectionLoaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectionLoaResult>() {
            @Override
            public DescribeConnectionLoaResult call() throws Exception {
                DescribeConnectionLoaResult result = null;

                try {
                    result = executeDescribeConnectionLoa(finalRequest);
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
     * Simplified method form for invoking the DescribeConnections operation with an AsyncHandler.
     *
     * @see #describeConnectionsAsync(DescribeConnectionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        return describeConnectionsAsync(new DescribeConnectionsRequest(), asyncHandler);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            DescribeConnectionsOnInterconnectRequest request) {

        return describeConnectionsOnInterconnectAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeConnectionsOnInterconnectResult> describeConnectionsOnInterconnectAsync(
            final DescribeConnectionsOnInterconnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeConnectionsOnInterconnectRequest, DescribeConnectionsOnInterconnectResult> asyncHandler) {
        final DescribeConnectionsOnInterconnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeConnectionsOnInterconnectResult>() {
            @Override
            public DescribeConnectionsOnInterconnectResult call() throws Exception {
                DescribeConnectionsOnInterconnectResult result = null;

                try {
                    result = executeDescribeConnectionsOnInterconnect(finalRequest);
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
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationProposalsResult> describeDirectConnectGatewayAssociationProposalsAsync(
            DescribeDirectConnectGatewayAssociationProposalsRequest request) {

        return describeDirectConnectGatewayAssociationProposalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationProposalsResult> describeDirectConnectGatewayAssociationProposalsAsync(
            final DescribeDirectConnectGatewayAssociationProposalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAssociationProposalsRequest, DescribeDirectConnectGatewayAssociationProposalsResult> asyncHandler) {
        final DescribeDirectConnectGatewayAssociationProposalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDirectConnectGatewayAssociationProposalsResult>() {
            @Override
            public DescribeDirectConnectGatewayAssociationProposalsResult call() throws Exception {
                DescribeDirectConnectGatewayAssociationProposalsResult result = null;

                try {
                    result = executeDescribeDirectConnectGatewayAssociationProposals(finalRequest);
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
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationsResult> describeDirectConnectGatewayAssociationsAsync(
            DescribeDirectConnectGatewayAssociationsRequest request) {

        return describeDirectConnectGatewayAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAssociationsResult> describeDirectConnectGatewayAssociationsAsync(
            final DescribeDirectConnectGatewayAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAssociationsRequest, DescribeDirectConnectGatewayAssociationsResult> asyncHandler) {
        final DescribeDirectConnectGatewayAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDirectConnectGatewayAssociationsResult>() {
            @Override
            public DescribeDirectConnectGatewayAssociationsResult call() throws Exception {
                DescribeDirectConnectGatewayAssociationsResult result = null;

                try {
                    result = executeDescribeDirectConnectGatewayAssociations(finalRequest);
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
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAttachmentsResult> describeDirectConnectGatewayAttachmentsAsync(
            DescribeDirectConnectGatewayAttachmentsRequest request) {

        return describeDirectConnectGatewayAttachmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewayAttachmentsResult> describeDirectConnectGatewayAttachmentsAsync(
            final DescribeDirectConnectGatewayAttachmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewayAttachmentsRequest, DescribeDirectConnectGatewayAttachmentsResult> asyncHandler) {
        final DescribeDirectConnectGatewayAttachmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDirectConnectGatewayAttachmentsResult>() {
            @Override
            public DescribeDirectConnectGatewayAttachmentsResult call() throws Exception {
                DescribeDirectConnectGatewayAttachmentsResult result = null;

                try {
                    result = executeDescribeDirectConnectGatewayAttachments(finalRequest);
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
    public java.util.concurrent.Future<DescribeDirectConnectGatewaysResult> describeDirectConnectGatewaysAsync(DescribeDirectConnectGatewaysRequest request) {

        return describeDirectConnectGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectConnectGatewaysResult> describeDirectConnectGatewaysAsync(
            final DescribeDirectConnectGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDirectConnectGatewaysRequest, DescribeDirectConnectGatewaysResult> asyncHandler) {
        final DescribeDirectConnectGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDirectConnectGatewaysResult>() {
            @Override
            public DescribeDirectConnectGatewaysResult call() throws Exception {
                DescribeDirectConnectGatewaysResult result = null;

                try {
                    result = executeDescribeDirectConnectGateways(finalRequest);
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
    public java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(DescribeHostedConnectionsRequest request) {

        return describeHostedConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHostedConnectionsResult> describeHostedConnectionsAsync(final DescribeHostedConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHostedConnectionsRequest, DescribeHostedConnectionsResult> asyncHandler) {
        final DescribeHostedConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHostedConnectionsResult>() {
            @Override
            public DescribeHostedConnectionsResult call() throws Exception {
                DescribeHostedConnectionsResult result = null;

                try {
                    result = executeDescribeHostedConnections(finalRequest);
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
    @Deprecated
    public java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(DescribeInterconnectLoaRequest request) {

        return describeInterconnectLoaAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeInterconnectLoaResult> describeInterconnectLoaAsync(final DescribeInterconnectLoaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInterconnectLoaRequest, DescribeInterconnectLoaResult> asyncHandler) {
        final DescribeInterconnectLoaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInterconnectLoaResult>() {
            @Override
            public DescribeInterconnectLoaResult call() throws Exception {
                DescribeInterconnectLoaResult result = null;

                try {
                    result = executeDescribeInterconnectLoa(finalRequest);
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
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(DescribeInterconnectsRequest request) {

        return describeInterconnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(final DescribeInterconnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler) {
        final DescribeInterconnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInterconnectsResult>() {
            @Override
            public DescribeInterconnectsResult call() throws Exception {
                DescribeInterconnectsResult result = null;

                try {
                    result = executeDescribeInterconnects(finalRequest);
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
     * Simplified method form for invoking the DescribeInterconnects operation.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync() {

        return describeInterconnectsAsync(new DescribeInterconnectsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeInterconnects operation with an AsyncHandler.
     *
     * @see #describeInterconnectsAsync(DescribeInterconnectsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeInterconnectsResult> describeInterconnectsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeInterconnectsRequest, DescribeInterconnectsResult> asyncHandler) {

        return describeInterconnectsAsync(new DescribeInterconnectsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(DescribeLagsRequest request) {

        return describeLagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLagsResult> describeLagsAsync(final DescribeLagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLagsRequest, DescribeLagsResult> asyncHandler) {
        final DescribeLagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLagsResult>() {
            @Override
            public DescribeLagsResult call() throws Exception {
                DescribeLagsResult result = null;

                try {
                    result = executeDescribeLags(finalRequest);
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
    public java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(DescribeLoaRequest request) {

        return describeLoaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoaResult> describeLoaAsync(final DescribeLoaRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoaRequest, DescribeLoaResult> asyncHandler) {
        final DescribeLoaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoaResult>() {
            @Override
            public DescribeLoaResult call() throws Exception {
                DescribeLoaResult result = null;

                try {
                    result = executeDescribeLoa(finalRequest);
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
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(DescribeLocationsRequest request) {

        return describeLocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(final DescribeLocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler) {
        final DescribeLocationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLocationsResult>() {
            @Override
            public DescribeLocationsResult call() throws Exception {
                DescribeLocationsResult result = null;

                try {
                    result = executeDescribeLocations(finalRequest);
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
     * Simplified method form for invoking the DescribeLocations operation.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync() {

        return describeLocationsAsync(new DescribeLocationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLocations operation with an AsyncHandler.
     *
     * @see #describeLocationsAsync(DescribeLocationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeLocationsResult> describeLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLocationsRequest, DescribeLocationsResult> asyncHandler) {

        return describeLocationsAsync(new DescribeLocationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {
        final DescribeTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result = null;

                try {
                    result = executeDescribeTags(finalRequest);
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
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest request) {

        return describeVirtualGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(final DescribeVirtualGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler) {
        final DescribeVirtualGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVirtualGatewaysResult>() {
            @Override
            public DescribeVirtualGatewaysResult call() throws Exception {
                DescribeVirtualGatewaysResult result = null;

                try {
                    result = executeDescribeVirtualGateways(finalRequest);
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
     * Simplified method form for invoking the DescribeVirtualGateways operation.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync() {

        return describeVirtualGatewaysAsync(new DescribeVirtualGatewaysRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation with an AsyncHandler.
     *
     * @see #describeVirtualGatewaysAsync(DescribeVirtualGatewaysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualGatewaysResult> describeVirtualGatewaysAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualGatewaysRequest, DescribeVirtualGatewaysResult> asyncHandler) {

        return describeVirtualGatewaysAsync(new DescribeVirtualGatewaysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest request) {

        return describeVirtualInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(final DescribeVirtualInterfacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler) {
        final DescribeVirtualInterfacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVirtualInterfacesResult>() {
            @Override
            public DescribeVirtualInterfacesResult call() throws Exception {
                DescribeVirtualInterfacesResult result = null;

                try {
                    result = executeDescribeVirtualInterfaces(finalRequest);
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
     * Simplified method form for invoking the DescribeVirtualInterfaces operation.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync() {

        return describeVirtualInterfacesAsync(new DescribeVirtualInterfacesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation with an AsyncHandler.
     *
     * @see #describeVirtualInterfacesAsync(DescribeVirtualInterfacesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeVirtualInterfacesResult> describeVirtualInterfacesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualInterfacesRequest, DescribeVirtualInterfacesResult> asyncHandler) {

        return describeVirtualInterfacesAsync(new DescribeVirtualInterfacesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectionFromLagResult> disassociateConnectionFromLagAsync(DisassociateConnectionFromLagRequest request) {

        return disassociateConnectionFromLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateConnectionFromLagResult> disassociateConnectionFromLagAsync(
            final DisassociateConnectionFromLagRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateConnectionFromLagRequest, DisassociateConnectionFromLagResult> asyncHandler) {
        final DisassociateConnectionFromLagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateConnectionFromLagResult>() {
            @Override
            public DisassociateConnectionFromLagResult call() throws Exception {
                DisassociateConnectionFromLagResult result = null;

                try {
                    result = executeDisassociateConnectionFromLag(finalRequest);
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
    public java.util.concurrent.Future<UpdateDirectConnectGatewayAssociationResult> updateDirectConnectGatewayAssociationAsync(
            UpdateDirectConnectGatewayAssociationRequest request) {

        return updateDirectConnectGatewayAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDirectConnectGatewayAssociationResult> updateDirectConnectGatewayAssociationAsync(
            final UpdateDirectConnectGatewayAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDirectConnectGatewayAssociationRequest, UpdateDirectConnectGatewayAssociationResult> asyncHandler) {
        final UpdateDirectConnectGatewayAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDirectConnectGatewayAssociationResult>() {
            @Override
            public UpdateDirectConnectGatewayAssociationResult call() throws Exception {
                UpdateDirectConnectGatewayAssociationResult result = null;

                try {
                    result = executeUpdateDirectConnectGatewayAssociation(finalRequest);
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
    public java.util.concurrent.Future<UpdateLagResult> updateLagAsync(UpdateLagRequest request) {

        return updateLagAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLagResult> updateLagAsync(final UpdateLagRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLagRequest, UpdateLagResult> asyncHandler) {
        final UpdateLagRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLagResult>() {
            @Override
            public UpdateLagResult call() throws Exception {
                UpdateLagResult result = null;

                try {
                    result = executeUpdateLag(finalRequest);
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
    public java.util.concurrent.Future<UpdateVirtualInterfaceAttributesResult> updateVirtualInterfaceAttributesAsync(
            UpdateVirtualInterfaceAttributesRequest request) {

        return updateVirtualInterfaceAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualInterfaceAttributesResult> updateVirtualInterfaceAttributesAsync(
            final UpdateVirtualInterfaceAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVirtualInterfaceAttributesRequest, UpdateVirtualInterfaceAttributesResult> asyncHandler) {
        final UpdateVirtualInterfaceAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVirtualInterfaceAttributesResult>() {
            @Override
            public UpdateVirtualInterfaceAttributesResult call() throws Exception {
                UpdateVirtualInterfaceAttributesResult result = null;

                try {
                    result = executeUpdateVirtualInterfaceAttributes(finalRequest);
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
