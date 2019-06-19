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
package com.amazonaws.services.redshift;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon Redshift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Redshift</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is an interface reference for Amazon Redshift. It contains documentation for one of the programming or command
 * line interfaces you can use to manage Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which
 * means that some interfaces may require techniques, such as polling or asynchronous callback handlers, to determine
 * when a command has been applied. In this reference, the parameter descriptions indicate whether a change is applied
 * immediately, on the next instance reboot, or during the next maintenance window. For a summary of the Amazon Redshift
 * cluster management interfaces, go to <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html">Using the Amazon Redshift Management
 * Interfaces</a>.
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity,
 * monitoring and backing up the cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus
 * on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the <a
 * href="https://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html">Amazon Redshift Getting Started
 * Guide</a>.
 * </p>
 * <p>
 * If you are a database developer, the <a href="https://docs.aws.amazon.com/redshift/latest/dg/welcome.html">Amazon
 * Redshift Database Developer Guide</a> explains how to design, build, query, and maintain the databases that make up
 * your data warehouse.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftAsyncClient extends AmazonRedshiftClient implements AmazonRedshiftAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift. A credentials provider chain
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
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift. A credentials provider chain
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
     *        The client configuration options controlling how this client connects to Amazon Redshift (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the provided AWS account
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
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonRedshiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRedshiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonRedshiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonRedshiftAsyncClientBuilder asyncBuilder() {
        return AmazonRedshiftAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonRedshiftAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ReservedNode> acceptReservedNodeExchangeAsync(AcceptReservedNodeExchangeRequest request) {

        return acceptReservedNodeExchangeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> acceptReservedNodeExchangeAsync(final AcceptReservedNodeExchangeRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptReservedNodeExchangeRequest, ReservedNode> asyncHandler) {
        final AcceptReservedNodeExchangeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReservedNode>() {
            @Override
            public ReservedNode call() throws Exception {
                ReservedNode result = null;

                try {
                    result = executeAcceptReservedNodeExchange(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(AuthorizeClusterSecurityGroupIngressRequest request) {

        return authorizeClusterSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(
            final AuthorizeClusterSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler) {
        final AuthorizeClusterSecurityGroupIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClusterSecurityGroup>() {
            @Override
            public ClusterSecurityGroup call() throws Exception {
                ClusterSecurityGroup result = null;

                try {
                    result = executeAuthorizeClusterSecurityGroupIngress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(AuthorizeSnapshotAccessRequest request) {

        return authorizeSnapshotAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(final AuthorizeSnapshotAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeSnapshotAccessRequest, Snapshot> asyncHandler) {
        final AuthorizeSnapshotAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result = null;

                try {
                    result = executeAuthorizeSnapshotAccess(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<BatchDeleteClusterSnapshotsResult> batchDeleteClusterSnapshotsAsync(BatchDeleteClusterSnapshotsRequest request) {

        return batchDeleteClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteClusterSnapshotsResult> batchDeleteClusterSnapshotsAsync(final BatchDeleteClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteClusterSnapshotsRequest, BatchDeleteClusterSnapshotsResult> asyncHandler) {
        final BatchDeleteClusterSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteClusterSnapshotsResult>() {
            @Override
            public BatchDeleteClusterSnapshotsResult call() throws Exception {
                BatchDeleteClusterSnapshotsResult result = null;

                try {
                    result = executeBatchDeleteClusterSnapshots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<BatchModifyClusterSnapshotsResult> batchModifyClusterSnapshotsAsync(BatchModifyClusterSnapshotsRequest request) {

        return batchModifyClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchModifyClusterSnapshotsResult> batchModifyClusterSnapshotsAsync(final BatchModifyClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchModifyClusterSnapshotsRequest, BatchModifyClusterSnapshotsResult> asyncHandler) {
        final BatchModifyClusterSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchModifyClusterSnapshotsResult>() {
            @Override
            public BatchModifyClusterSnapshotsResult call() throws Exception {
                BatchModifyClusterSnapshotsResult result = null;

                try {
                    result = executeBatchModifyClusterSnapshots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CancelResizeResult> cancelResizeAsync(CancelResizeRequest request) {

        return cancelResizeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelResizeResult> cancelResizeAsync(final CancelResizeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelResizeRequest, CancelResizeResult> asyncHandler) {
        final CancelResizeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelResizeResult>() {
            @Override
            public CancelResizeResult call() throws Exception {
                CancelResizeResult result = null;

                try {
                    result = executeCancelResize(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest request) {

        return copyClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(final CopyClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyClusterSnapshotRequest, Snapshot> asyncHandler) {
        final CopyClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result = null;

                try {
                    result = executeCopyClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, Cluster> asyncHandler) {
        final CreateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

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

    @Override
    public java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest request) {

        return createClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(final CreateClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterParameterGroupRequest, ClusterParameterGroup> asyncHandler) {
        final CreateClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClusterParameterGroup>() {
            @Override
            public ClusterParameterGroup call() throws Exception {
                ClusterParameterGroup result = null;

                try {
                    result = executeCreateClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest request) {

        return createClusterSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(final CreateClusterSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSecurityGroupRequest, ClusterSecurityGroup> asyncHandler) {
        final CreateClusterSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClusterSecurityGroup>() {
            @Override
            public ClusterSecurityGroup call() throws Exception {
                ClusterSecurityGroup result = null;

                try {
                    result = executeCreateClusterSecurityGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest request) {

        return createClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(final CreateClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, Snapshot> asyncHandler) {
        final CreateClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result = null;

                try {
                    result = executeCreateClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest request) {

        return createClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(final CreateClusterSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler) {
        final CreateClusterSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClusterSubnetGroup>() {
            @Override
            public ClusterSubnetGroup call() throws Exception {
                ClusterSubnetGroup result = null;

                try {
                    result = executeCreateClusterSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request) {

        return createEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(final CreateEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler) {
        final CreateEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

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
    public java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(CreateHsmClientCertificateRequest request) {

        return createHsmClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(final CreateHsmClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHsmClientCertificateRequest, HsmClientCertificate> asyncHandler) {
        final CreateHsmClientCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<HsmClientCertificate>() {
            @Override
            public HsmClientCertificate call() throws Exception {
                HsmClientCertificate result = null;

                try {
                    result = executeCreateHsmClientCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(CreateHsmConfigurationRequest request) {

        return createHsmConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(final CreateHsmConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHsmConfigurationRequest, HsmConfiguration> asyncHandler) {
        final CreateHsmConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<HsmConfiguration>() {
            @Override
            public HsmConfiguration call() throws Exception {
                HsmConfiguration result = null;

                try {
                    result = executeCreateHsmConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(CreateSnapshotCopyGrantRequest request) {

        return createSnapshotCopyGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(final CreateSnapshotCopyGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotCopyGrantRequest, SnapshotCopyGrant> asyncHandler) {
        final CreateSnapshotCopyGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SnapshotCopyGrant>() {
            @Override
            public SnapshotCopyGrant call() throws Exception {
                SnapshotCopyGrant result = null;

                try {
                    result = executeCreateSnapshotCopyGrant(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateSnapshotScheduleResult> createSnapshotScheduleAsync(CreateSnapshotScheduleRequest request) {

        return createSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotScheduleResult> createSnapshotScheduleAsync(final CreateSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotScheduleRequest, CreateSnapshotScheduleResult> asyncHandler) {
        final CreateSnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSnapshotScheduleResult>() {
            @Override
            public CreateSnapshotScheduleResult call() throws Exception {
                CreateSnapshotScheduleResult result = null;

                try {
                    result = executeCreateSnapshotSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {
        final CreateTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result = null;

                try {
                    result = executeCreateTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, Cluster> asyncHandler) {
        final DeleteClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

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
    public java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(DeleteClusterParameterGroupRequest request) {

        return deleteClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(final DeleteClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterParameterGroupRequest, DeleteClusterParameterGroupResult> asyncHandler) {
        final DeleteClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterParameterGroupResult>() {
            @Override
            public DeleteClusterParameterGroupResult call() throws Exception {
                DeleteClusterParameterGroupResult result = null;

                try {
                    result = executeDeleteClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(DeleteClusterSecurityGroupRequest request) {

        return deleteClusterSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(final DeleteClusterSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSecurityGroupRequest, DeleteClusterSecurityGroupResult> asyncHandler) {
        final DeleteClusterSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterSecurityGroupResult>() {
            @Override
            public DeleteClusterSecurityGroupResult call() throws Exception {
                DeleteClusterSecurityGroupResult result = null;

                try {
                    result = executeDeleteClusterSecurityGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request) {

        return deleteClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(final DeleteClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, Snapshot> asyncHandler) {
        final DeleteClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result = null;

                try {
                    result = executeDeleteClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest request) {

        return deleteClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(final DeleteClusterSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSubnetGroupRequest, DeleteClusterSubnetGroupResult> asyncHandler) {
        final DeleteClusterSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterSubnetGroupResult>() {
            @Override
            public DeleteClusterSubnetGroupResult call() throws Exception {
                DeleteClusterSubnetGroupResult result = null;

                try {
                    result = executeDeleteClusterSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(DeleteHsmClientCertificateRequest request) {

        return deleteHsmClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(final DeleteHsmClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHsmClientCertificateRequest, DeleteHsmClientCertificateResult> asyncHandler) {
        final DeleteHsmClientCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHsmClientCertificateResult>() {
            @Override
            public DeleteHsmClientCertificateResult call() throws Exception {
                DeleteHsmClientCertificateResult result = null;

                try {
                    result = executeDeleteHsmClientCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(DeleteHsmConfigurationRequest request) {

        return deleteHsmConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(final DeleteHsmConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHsmConfigurationRequest, DeleteHsmConfigurationResult> asyncHandler) {
        final DeleteHsmConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHsmConfigurationResult>() {
            @Override
            public DeleteHsmConfigurationResult call() throws Exception {
                DeleteHsmConfigurationResult result = null;

                try {
                    result = executeDeleteHsmConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(DeleteSnapshotCopyGrantRequest request) {

        return deleteSnapshotCopyGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(final DeleteSnapshotCopyGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotCopyGrantRequest, DeleteSnapshotCopyGrantResult> asyncHandler) {
        final DeleteSnapshotCopyGrantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotCopyGrantResult>() {
            @Override
            public DeleteSnapshotCopyGrantResult call() throws Exception {
                DeleteSnapshotCopyGrantResult result = null;

                try {
                    result = executeDeleteSnapshotCopyGrant(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest request) {

        return deleteSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(final DeleteSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler) {
        final DeleteSnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotScheduleResult>() {
            @Override
            public DeleteSnapshotScheduleResult call() throws Exception {
                DeleteSnapshotScheduleResult result = null;

                try {
                    result = executeDeleteSnapshotSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeClusterDbRevisionsResult> describeClusterDbRevisionsAsync(DescribeClusterDbRevisionsRequest request) {

        return describeClusterDbRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterDbRevisionsResult> describeClusterDbRevisionsAsync(final DescribeClusterDbRevisionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterDbRevisionsRequest, DescribeClusterDbRevisionsResult> asyncHandler) {
        final DescribeClusterDbRevisionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterDbRevisionsResult>() {
            @Override
            public DescribeClusterDbRevisionsResult call() throws Exception {
                DescribeClusterDbRevisionsResult result = null;

                try {
                    result = executeDescribeClusterDbRevisions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest request) {

        return describeClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            final DescribeClusterParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler) {
        final DescribeClusterParameterGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterParameterGroupsResult>() {
            @Override
            public DescribeClusterParameterGroupsResult call() throws Exception {
                DescribeClusterParameterGroupsResult result = null;

                try {
                    result = executeDescribeClusterParameterGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeClusterParameterGroups operation.
     *
     * @see #describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync() {

        return describeClusterParameterGroupsAsync(new DescribeClusterParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterParameterGroups operation with an AsyncHandler.
     *
     * @see #describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler) {

        return describeClusterParameterGroupsAsync(new DescribeClusterParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParametersResult> describeClusterParametersAsync(DescribeClusterParametersRequest request) {

        return describeClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParametersResult> describeClusterParametersAsync(final DescribeClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterParametersRequest, DescribeClusterParametersResult> asyncHandler) {
        final DescribeClusterParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterParametersResult>() {
            @Override
            public DescribeClusterParametersResult call() throws Exception {
                DescribeClusterParametersResult result = null;

                try {
                    result = executeDescribeClusterParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest request) {

        return describeClusterSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            final DescribeClusterSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler) {
        final DescribeClusterSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterSecurityGroupsResult>() {
            @Override
            public DescribeClusterSecurityGroupsResult call() throws Exception {
                DescribeClusterSecurityGroupsResult result = null;

                try {
                    result = executeDescribeClusterSecurityGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation.
     *
     * @see #describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync() {

        return describeClusterSecurityGroupsAsync(new DescribeClusterSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler) {

        return describeClusterSecurityGroupsAsync(new DescribeClusterSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest request) {

        return describeClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(final DescribeClusterSnapshotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler) {
        final DescribeClusterSnapshotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterSnapshotsResult>() {
            @Override
            public DescribeClusterSnapshotsResult call() throws Exception {
                DescribeClusterSnapshotsResult result = null;

                try {
                    result = executeDescribeClusterSnapshots(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeClusterSnapshots operation.
     *
     * @see #describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync() {

        return describeClusterSnapshotsAsync(new DescribeClusterSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterSnapshots operation with an AsyncHandler.
     *
     * @see #describeClusterSnapshotsAsync(DescribeClusterSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSnapshotsResult> describeClusterSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSnapshotsRequest, DescribeClusterSnapshotsResult> asyncHandler) {

        return describeClusterSnapshotsAsync(new DescribeClusterSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest request) {

        return describeClusterSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(final DescribeClusterSubnetGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler) {
        final DescribeClusterSubnetGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterSubnetGroupsResult>() {
            @Override
            public DescribeClusterSubnetGroupsResult call() throws Exception {
                DescribeClusterSubnetGroupsResult result = null;

                try {
                    result = executeDescribeClusterSubnetGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation.
     *
     * @see #describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync() {

        return describeClusterSubnetGroupsAsync(new DescribeClusterSubnetGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeClusterSubnetGroupsAsync(DescribeClusterSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler) {

        return describeClusterSubnetGroupsAsync(new DescribeClusterSubnetGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterTracksResult> describeClusterTracksAsync(DescribeClusterTracksRequest request) {

        return describeClusterTracksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterTracksResult> describeClusterTracksAsync(final DescribeClusterTracksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterTracksRequest, DescribeClusterTracksResult> asyncHandler) {
        final DescribeClusterTracksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterTracksResult>() {
            @Override
            public DescribeClusterTracksResult call() throws Exception {
                DescribeClusterTracksResult result = null;

                try {
                    result = executeDescribeClusterTracks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest request) {

        return describeClusterVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(final DescribeClusterVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler) {
        final DescribeClusterVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterVersionsResult>() {
            @Override
            public DescribeClusterVersionsResult call() throws Exception {
                DescribeClusterVersionsResult result = null;

                try {
                    result = executeDescribeClusterVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeClusterVersions operation.
     *
     * @see #describeClusterVersionsAsync(DescribeClusterVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync() {

        return describeClusterVersionsAsync(new DescribeClusterVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeClusterVersions operation with an AsyncHandler.
     *
     * @see #describeClusterVersionsAsync(DescribeClusterVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler) {

        return describeClusterVersionsAsync(new DescribeClusterVersionsRequest(), asyncHandler);
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
    public java.util.concurrent.Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(DescribeDefaultClusterParametersRequest request) {

        return describeDefaultClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DefaultClusterParameters> describeDefaultClusterParametersAsync(final DescribeDefaultClusterParametersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDefaultClusterParametersRequest, DefaultClusterParameters> asyncHandler) {
        final DescribeDefaultClusterParametersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DefaultClusterParameters>() {
            @Override
            public DefaultClusterParameters call() throws Exception {
                DefaultClusterParameters result = null;

                try {
                    result = executeDescribeDefaultClusterParameters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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

    /**
     * Simplified method form for invoking the DescribeEventCategories operation.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync() {

        return describeEventCategoriesAsync(new DescribeEventCategoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEventCategories operation with an AsyncHandler.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {

        return describeEventCategoriesAsync(new DescribeEventCategoriesRequest(), asyncHandler);
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

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync() {

        return describeEventSubscriptionsAsync(new DescribeEventSubscriptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation with an AsyncHandler.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {

        return describeEventSubscriptionsAsync(new DescribeEventSubscriptionsRequest(), asyncHandler);
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

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync() {

        return describeEventsAsync(new DescribeEventsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        return describeEventsAsync(new DescribeEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest request) {

        return describeHsmClientCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            final DescribeHsmClientCertificatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler) {
        final DescribeHsmClientCertificatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHsmClientCertificatesResult>() {
            @Override
            public DescribeHsmClientCertificatesResult call() throws Exception {
                DescribeHsmClientCertificatesResult result = null;

                try {
                    result = executeDescribeHsmClientCertificates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeHsmClientCertificates operation.
     *
     * @see #describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync() {

        return describeHsmClientCertificatesAsync(new DescribeHsmClientCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHsmClientCertificates operation with an AsyncHandler.
     *
     * @see #describeHsmClientCertificatesAsync(DescribeHsmClientCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmClientCertificatesResult> describeHsmClientCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmClientCertificatesRequest, DescribeHsmClientCertificatesResult> asyncHandler) {

        return describeHsmClientCertificatesAsync(new DescribeHsmClientCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest request) {

        return describeHsmConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(final DescribeHsmConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler) {
        final DescribeHsmConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHsmConfigurationsResult>() {
            @Override
            public DescribeHsmConfigurationsResult call() throws Exception {
                DescribeHsmConfigurationsResult result = null;

                try {
                    result = executeDescribeHsmConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeHsmConfigurations operation.
     *
     * @see #describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync() {

        return describeHsmConfigurationsAsync(new DescribeHsmConfigurationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeHsmConfigurations operation with an AsyncHandler.
     *
     * @see #describeHsmConfigurationsAsync(DescribeHsmConfigurationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeHsmConfigurationsResult> describeHsmConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeHsmConfigurationsRequest, DescribeHsmConfigurationsResult> asyncHandler) {

        return describeHsmConfigurationsAsync(new DescribeHsmConfigurationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(DescribeLoggingStatusRequest request) {

        return describeLoggingStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingStatusResult> describeLoggingStatusAsync(final DescribeLoggingStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLoggingStatusRequest, DescribeLoggingStatusResult> asyncHandler) {
        final DescribeLoggingStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoggingStatusResult>() {
            @Override
            public DescribeLoggingStatusResult call() throws Exception {
                DescribeLoggingStatusResult result = null;

                try {
                    result = executeDescribeLoggingStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            DescribeOrderableClusterOptionsRequest request) {

        return describeOrderableClusterOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            final DescribeOrderableClusterOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler) {
        final DescribeOrderableClusterOptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableClusterOptionsResult>() {
            @Override
            public DescribeOrderableClusterOptionsResult call() throws Exception {
                DescribeOrderableClusterOptionsResult result = null;

                try {
                    result = executeDescribeOrderableClusterOptions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation.
     *
     * @see #describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync() {

        return describeOrderableClusterOptionsAsync(new DescribeOrderableClusterOptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeOrderableClusterOptions operation with an AsyncHandler.
     *
     * @see #describeOrderableClusterOptionsAsync(DescribeOrderableClusterOptionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler) {

        return describeOrderableClusterOptionsAsync(new DescribeOrderableClusterOptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest request) {

        return describeReservedNodeOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            final DescribeReservedNodeOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler) {
        final DescribeReservedNodeOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedNodeOfferingsResult>() {
            @Override
            public DescribeReservedNodeOfferingsResult call() throws Exception {
                DescribeReservedNodeOfferingsResult result = null;

                try {
                    result = executeDescribeReservedNodeOfferings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation.
     *
     * @see #describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync() {

        return describeReservedNodeOfferingsAsync(new DescribeReservedNodeOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedNodeOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedNodeOfferingsAsync(DescribeReservedNodeOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodeOfferingsResult> describeReservedNodeOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodeOfferingsRequest, DescribeReservedNodeOfferingsResult> asyncHandler) {

        return describeReservedNodeOfferingsAsync(new DescribeReservedNodeOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest request) {

        return describeReservedNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(final DescribeReservedNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler) {
        final DescribeReservedNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedNodesResult>() {
            @Override
            public DescribeReservedNodesResult call() throws Exception {
                DescribeReservedNodesResult result = null;

                try {
                    result = executeDescribeReservedNodes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeReservedNodes operation.
     *
     * @see #describeReservedNodesAsync(DescribeReservedNodesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync() {

        return describeReservedNodesAsync(new DescribeReservedNodesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedNodes operation with an AsyncHandler.
     *
     * @see #describeReservedNodesAsync(DescribeReservedNodesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler) {

        return describeReservedNodesAsync(new DescribeReservedNodesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeResizeResult> describeResizeAsync(DescribeResizeRequest request) {

        return describeResizeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResizeResult> describeResizeAsync(final DescribeResizeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeResizeRequest, DescribeResizeResult> asyncHandler) {
        final DescribeResizeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeResizeResult>() {
            @Override
            public DescribeResizeResult call() throws Exception {
                DescribeResizeResult result = null;

                try {
                    result = executeDescribeResize(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest request) {

        return describeSnapshotCopyGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(final DescribeSnapshotCopyGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler) {
        final DescribeSnapshotCopyGrantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotCopyGrantsResult>() {
            @Override
            public DescribeSnapshotCopyGrantsResult call() throws Exception {
                DescribeSnapshotCopyGrantsResult result = null;

                try {
                    result = executeDescribeSnapshotCopyGrants(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation.
     *
     * @see #describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync() {

        return describeSnapshotCopyGrantsAsync(new DescribeSnapshotCopyGrantsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshotCopyGrants operation with an AsyncHandler.
     *
     * @see #describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler) {

        return describeSnapshotCopyGrantsAsync(new DescribeSnapshotCopyGrantsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotSchedulesResult> describeSnapshotSchedulesAsync(DescribeSnapshotSchedulesRequest request) {

        return describeSnapshotSchedulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotSchedulesResult> describeSnapshotSchedulesAsync(final DescribeSnapshotSchedulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotSchedulesRequest, DescribeSnapshotSchedulesResult> asyncHandler) {
        final DescribeSnapshotSchedulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotSchedulesResult>() {
            @Override
            public DescribeSnapshotSchedulesResult call() throws Exception {
                DescribeSnapshotSchedulesResult result = null;

                try {
                    result = executeDescribeSnapshotSchedules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeStorageResult> describeStorageAsync(DescribeStorageRequest request) {

        return describeStorageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStorageResult> describeStorageAsync(final DescribeStorageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStorageRequest, DescribeStorageResult> asyncHandler) {
        final DescribeStorageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStorageResult>() {
            @Override
            public DescribeStorageResult call() throws Exception {
                DescribeStorageResult result = null;

                try {
                    result = executeDescribeStorage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest request) {

        return describeTableRestoreStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(final DescribeTableRestoreStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler) {
        final DescribeTableRestoreStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTableRestoreStatusResult>() {
            @Override
            public DescribeTableRestoreStatusResult call() throws Exception {
                DescribeTableRestoreStatusResult result = null;

                try {
                    result = executeDescribeTableRestoreStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
     * Simplified method form for invoking the DescribeTableRestoreStatus operation.
     *
     * @see #describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync() {

        return describeTableRestoreStatusAsync(new DescribeTableRestoreStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTableRestoreStatus operation with an AsyncHandler.
     *
     * @see #describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler) {

        return describeTableRestoreStatusAsync(new DescribeTableRestoreStatusRequest(), asyncHandler);
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

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync() {

        return describeTagsAsync(new DescribeTagsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return describeTagsAsync(new DescribeTagsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DisableLoggingResult> disableLoggingAsync(DisableLoggingRequest request) {

        return disableLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableLoggingResult> disableLoggingAsync(final DisableLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableLoggingRequest, DisableLoggingResult> asyncHandler) {
        final DisableLoggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableLoggingResult>() {
            @Override
            public DisableLoggingResult call() throws Exception {
                DisableLoggingResult result = null;

                try {
                    result = executeDisableLogging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(DisableSnapshotCopyRequest request) {

        return disableSnapshotCopyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(final DisableSnapshotCopyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSnapshotCopyRequest, Cluster> asyncHandler) {
        final DisableSnapshotCopyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeDisableSnapshotCopy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(EnableLoggingRequest request) {

        return enableLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(final EnableLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableLoggingRequest, EnableLoggingResult> asyncHandler) {
        final EnableLoggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableLoggingResult>() {
            @Override
            public EnableLoggingResult call() throws Exception {
                EnableLoggingResult result = null;

                try {
                    result = executeEnableLogging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(EnableSnapshotCopyRequest request) {

        return enableSnapshotCopyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(final EnableSnapshotCopyRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSnapshotCopyRequest, Cluster> asyncHandler) {
        final EnableSnapshotCopyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeEnableSnapshotCopy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetClusterCredentialsResult> getClusterCredentialsAsync(GetClusterCredentialsRequest request) {

        return getClusterCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClusterCredentialsResult> getClusterCredentialsAsync(final GetClusterCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClusterCredentialsRequest, GetClusterCredentialsResult> asyncHandler) {
        final GetClusterCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClusterCredentialsResult>() {
            @Override
            public GetClusterCredentialsResult call() throws Exception {
                GetClusterCredentialsResult result = null;

                try {
                    result = executeGetClusterCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetReservedNodeExchangeOfferingsResult> getReservedNodeExchangeOfferingsAsync(
            GetReservedNodeExchangeOfferingsRequest request) {

        return getReservedNodeExchangeOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReservedNodeExchangeOfferingsResult> getReservedNodeExchangeOfferingsAsync(
            final GetReservedNodeExchangeOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReservedNodeExchangeOfferingsRequest, GetReservedNodeExchangeOfferingsResult> asyncHandler) {
        final GetReservedNodeExchangeOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReservedNodeExchangeOfferingsResult>() {
            @Override
            public GetReservedNodeExchangeOfferingsResult call() throws Exception {
                GetReservedNodeExchangeOfferingsResult result = null;

                try {
                    result = executeGetReservedNodeExchangeOfferings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> modifyClusterAsync(ModifyClusterRequest request) {

        return modifyClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterAsync(final ModifyClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterRequest, Cluster> asyncHandler) {
        final ModifyClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeModifyCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> modifyClusterDbRevisionAsync(ModifyClusterDbRevisionRequest request) {

        return modifyClusterDbRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterDbRevisionAsync(final ModifyClusterDbRevisionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterDbRevisionRequest, Cluster> asyncHandler) {
        final ModifyClusterDbRevisionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeModifyClusterDbRevision(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(ModifyClusterIamRolesRequest request) {

        return modifyClusterIamRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(final ModifyClusterIamRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterIamRolesRequest, Cluster> asyncHandler) {
        final ModifyClusterIamRolesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeModifyClusterIamRoles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> modifyClusterMaintenanceAsync(ModifyClusterMaintenanceRequest request) {

        return modifyClusterMaintenanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterMaintenanceAsync(final ModifyClusterMaintenanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterMaintenanceRequest, Cluster> asyncHandler) {
        final ModifyClusterMaintenanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeModifyClusterMaintenance(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(ModifyClusterParameterGroupRequest request) {

        return modifyClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(final ModifyClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterParameterGroupRequest, ModifyClusterParameterGroupResult> asyncHandler) {
        final ModifyClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyClusterParameterGroupResult>() {
            @Override
            public ModifyClusterParameterGroupResult call() throws Exception {
                ModifyClusterParameterGroupResult result = null;

                try {
                    result = executeModifyClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Snapshot> modifyClusterSnapshotAsync(ModifyClusterSnapshotRequest request) {

        return modifyClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> modifyClusterSnapshotAsync(final ModifyClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterSnapshotRequest, Snapshot> asyncHandler) {
        final ModifyClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result = null;

                try {
                    result = executeModifyClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ModifyClusterSnapshotScheduleResult> modifyClusterSnapshotScheduleAsync(ModifyClusterSnapshotScheduleRequest request) {

        return modifyClusterSnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterSnapshotScheduleResult> modifyClusterSnapshotScheduleAsync(
            final ModifyClusterSnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterSnapshotScheduleRequest, ModifyClusterSnapshotScheduleResult> asyncHandler) {
        final ModifyClusterSnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifyClusterSnapshotScheduleResult>() {
            @Override
            public ModifyClusterSnapshotScheduleResult call() throws Exception {
                ModifyClusterSnapshotScheduleResult result = null;

                try {
                    result = executeModifyClusterSnapshotSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest request) {

        return modifyClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(final ModifyClusterSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler) {
        final ModifyClusterSubnetGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClusterSubnetGroup>() {
            @Override
            public ClusterSubnetGroup call() throws Exception {
                ClusterSubnetGroup result = null;

                try {
                    result = executeModifyClusterSubnetGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request) {

        return modifyEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(final ModifyEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler) {
        final ModifyEventSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result = null;

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
    public java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(ModifySnapshotCopyRetentionPeriodRequest request) {

        return modifySnapshotCopyRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(final ModifySnapshotCopyRetentionPeriodRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySnapshotCopyRetentionPeriodRequest, Cluster> asyncHandler) {
        final ModifySnapshotCopyRetentionPeriodRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeModifySnapshotCopyRetentionPeriod(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ModifySnapshotScheduleResult> modifySnapshotScheduleAsync(ModifySnapshotScheduleRequest request) {

        return modifySnapshotScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifySnapshotScheduleResult> modifySnapshotScheduleAsync(final ModifySnapshotScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySnapshotScheduleRequest, ModifySnapshotScheduleResult> asyncHandler) {
        final ModifySnapshotScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ModifySnapshotScheduleResult>() {
            @Override
            public ModifySnapshotScheduleResult call() throws Exception {
                ModifySnapshotScheduleResult result = null;

                try {
                    result = executeModifySnapshotSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest request) {

        return purchaseReservedNodeOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(final PurchaseReservedNodeOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodeOfferingRequest, ReservedNode> asyncHandler) {
        final PurchaseReservedNodeOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReservedNode>() {
            @Override
            public ReservedNode call() throws Exception {
                ReservedNode result = null;

                try {
                    result = executePurchaseReservedNodeOffering(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> rebootClusterAsync(RebootClusterRequest request) {

        return rebootClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> rebootClusterAsync(final RebootClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootClusterRequest, Cluster> asyncHandler) {
        final RebootClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeRebootCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(ResetClusterParameterGroupRequest request) {

        return resetClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(final ResetClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetClusterParameterGroupRequest, ResetClusterParameterGroupResult> asyncHandler) {
        final ResetClusterParameterGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetClusterParameterGroupResult>() {
            @Override
            public ResetClusterParameterGroupResult call() throws Exception {
                ResetClusterParameterGroupResult result = null;

                try {
                    result = executeResetClusterParameterGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> resizeClusterAsync(ResizeClusterRequest request) {

        return resizeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> resizeClusterAsync(final ResizeClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResizeClusterRequest, Cluster> asyncHandler) {
        final ResizeClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeResizeCluster(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest request) {

        return restoreFromClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(final RestoreFromClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreFromClusterSnapshotRequest, Cluster> asyncHandler) {
        final RestoreFromClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeRestoreFromClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(RestoreTableFromClusterSnapshotRequest request) {

        return restoreTableFromClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(final RestoreTableFromClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreTableFromClusterSnapshotRequest, TableRestoreStatus> asyncHandler) {
        final RestoreTableFromClusterSnapshotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TableRestoreStatus>() {
            @Override
            public TableRestoreStatus call() throws Exception {
                TableRestoreStatus result = null;

                try {
                    result = executeRestoreTableFromClusterSnapshot(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(RevokeClusterSecurityGroupIngressRequest request) {

        return revokeClusterSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(final RevokeClusterSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler) {
        final RevokeClusterSecurityGroupIngressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClusterSecurityGroup>() {
            @Override
            public ClusterSecurityGroup call() throws Exception {
                ClusterSecurityGroup result = null;

                try {
                    result = executeRevokeClusterSecurityGroupIngress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(RevokeSnapshotAccessRequest request) {

        return revokeSnapshotAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(final RevokeSnapshotAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSnapshotAccessRequest, Snapshot> asyncHandler) {
        final RevokeSnapshotAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result = null;

                try {
                    result = executeRevokeSnapshotAccess(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(RotateEncryptionKeyRequest request) {

        return rotateEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(final RotateEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<RotateEncryptionKeyRequest, Cluster> asyncHandler) {
        final RotateEncryptionKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result = null;

                try {
                    result = executeRotateEncryptionKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
