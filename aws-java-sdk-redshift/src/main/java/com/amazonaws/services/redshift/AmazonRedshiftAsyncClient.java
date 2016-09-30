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
package com.amazonaws.services.redshift;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon Redshift asynchronously. Each asynchronous method will return a Java Future object
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
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html">Using the Amazon Redshift Management
 * Interfaces</a>.
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity,
 * monitoring and backing up the cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus
 * on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the <a
 * href="http://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html">Amazon Redshift Getting Started Guide</a>.
 * </p>
 * <p>
 * If you are a database developer, the <a href="http://docs.aws.amazon.com/redshift/latest/dg/welcome.html">Amazon
 * Redshift Database Developer Guide</a> explains how to design, build, query, and maintain the databases that make up
 * your data warehouse.
 * </p>
 */
@ThreadSafe
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
     */
    public AmazonRedshiftAsyncClient() {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance());
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
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(com.amazonaws.auth.DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, java.util.concurrent.Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
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
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
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
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration, java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Redshift using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, java.util.concurrent.ExecutorService executorService) {

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
     */
    public AmazonRedshiftAsyncClient(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider, com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
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
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(AuthorizeClusterSecurityGroupIngressRequest request) {

        return authorizeClusterSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> authorizeClusterSecurityGroupIngressAsync(
            final AuthorizeClusterSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ClusterSecurityGroup>() {
            @Override
            public ClusterSecurityGroup call() throws Exception {
                ClusterSecurityGroup result;

                try {
                    result = authorizeClusterSecurityGroupIngress(request);
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
    public java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(AuthorizeSnapshotAccessRequest request) {

        return authorizeSnapshotAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> authorizeSnapshotAccessAsync(final AuthorizeSnapshotAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<AuthorizeSnapshotAccessRequest, Snapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result;

                try {
                    result = authorizeSnapshotAccess(request);
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
    public java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(CopyClusterSnapshotRequest request) {

        return copyClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> copyClusterSnapshotAsync(final CopyClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyClusterSnapshotRequest, Snapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result;

                try {
                    result = copyClusterSnapshot(request);
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
    public java.util.concurrent.Future<Cluster> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = createCluster(request);
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
    public java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(CreateClusterParameterGroupRequest request) {

        return createClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterParameterGroup> createClusterParameterGroupAsync(final CreateClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterParameterGroupRequest, ClusterParameterGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ClusterParameterGroup>() {
            @Override
            public ClusterParameterGroup call() throws Exception {
                ClusterParameterGroup result;

                try {
                    result = createClusterParameterGroup(request);
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
    public java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(CreateClusterSecurityGroupRequest request) {

        return createClusterSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> createClusterSecurityGroupAsync(final CreateClusterSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSecurityGroupRequest, ClusterSecurityGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ClusterSecurityGroup>() {
            @Override
            public ClusterSecurityGroup call() throws Exception {
                ClusterSecurityGroup result;

                try {
                    result = createClusterSecurityGroup(request);
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
    public java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(CreateClusterSnapshotRequest request) {

        return createClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> createClusterSnapshotAsync(final CreateClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, Snapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result;

                try {
                    result = createClusterSnapshot(request);
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
    public java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(CreateClusterSubnetGroupRequest request) {

        return createClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> createClusterSubnetGroupAsync(final CreateClusterSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ClusterSubnetGroup>() {
            @Override
            public ClusterSubnetGroup call() throws Exception {
                ClusterSubnetGroup result;

                try {
                    result = createClusterSubnetGroup(request);
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
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request) {

        return createEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(final CreateEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result;

                try {
                    result = createEventSubscription(request);
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
    public java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(CreateHsmClientCertificateRequest request) {

        return createHsmClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<HsmClientCertificate> createHsmClientCertificateAsync(final CreateHsmClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHsmClientCertificateRequest, HsmClientCertificate> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<HsmClientCertificate>() {
            @Override
            public HsmClientCertificate call() throws Exception {
                HsmClientCertificate result;

                try {
                    result = createHsmClientCertificate(request);
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
    public java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(CreateHsmConfigurationRequest request) {

        return createHsmConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<HsmConfiguration> createHsmConfigurationAsync(final CreateHsmConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHsmConfigurationRequest, HsmConfiguration> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<HsmConfiguration>() {
            @Override
            public HsmConfiguration call() throws Exception {
                HsmConfiguration result;

                try {
                    result = createHsmConfiguration(request);
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
    public java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(CreateSnapshotCopyGrantRequest request) {

        return createSnapshotCopyGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SnapshotCopyGrant> createSnapshotCopyGrantAsync(final CreateSnapshotCopyGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSnapshotCopyGrantRequest, SnapshotCopyGrant> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<SnapshotCopyGrant>() {
            @Override
            public SnapshotCopyGrant call() throws Exception {
                SnapshotCopyGrant result;

                try {
                    result = createSnapshotCopyGrant(request);
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result;

                try {
                    result = createTags(request);
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
    public java.util.concurrent.Future<Cluster> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = deleteCluster(request);
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
    public java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(DeleteClusterParameterGroupRequest request) {

        return deleteClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterParameterGroupResult> deleteClusterParameterGroupAsync(final DeleteClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterParameterGroupRequest, DeleteClusterParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterParameterGroupResult>() {
            @Override
            public DeleteClusterParameterGroupResult call() throws Exception {
                DeleteClusterParameterGroupResult result;

                try {
                    result = deleteClusterParameterGroup(request);
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
    public java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(DeleteClusterSecurityGroupRequest request) {

        return deleteClusterSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSecurityGroupResult> deleteClusterSecurityGroupAsync(final DeleteClusterSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSecurityGroupRequest, DeleteClusterSecurityGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterSecurityGroupResult>() {
            @Override
            public DeleteClusterSecurityGroupResult call() throws Exception {
                DeleteClusterSecurityGroupResult result;

                try {
                    result = deleteClusterSecurityGroup(request);
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
    public java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request) {

        return deleteClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> deleteClusterSnapshotAsync(final DeleteClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, Snapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result;

                try {
                    result = deleteClusterSnapshot(request);
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
    public java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(DeleteClusterSubnetGroupRequest request) {

        return deleteClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSubnetGroupResult> deleteClusterSubnetGroupAsync(final DeleteClusterSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterSubnetGroupRequest, DeleteClusterSubnetGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterSubnetGroupResult>() {
            @Override
            public DeleteClusterSubnetGroupResult call() throws Exception {
                DeleteClusterSubnetGroupResult result;

                try {
                    result = deleteClusterSubnetGroup(request);
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
    public java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request) {

        return deleteEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(final DeleteEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, DeleteEventSubscriptionResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventSubscriptionResult>() {
            @Override
            public DeleteEventSubscriptionResult call() throws Exception {
                DeleteEventSubscriptionResult result;

                try {
                    result = deleteEventSubscription(request);
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
    public java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(DeleteHsmClientCertificateRequest request) {

        return deleteHsmClientCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmClientCertificateResult> deleteHsmClientCertificateAsync(final DeleteHsmClientCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHsmClientCertificateRequest, DeleteHsmClientCertificateResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHsmClientCertificateResult>() {
            @Override
            public DeleteHsmClientCertificateResult call() throws Exception {
                DeleteHsmClientCertificateResult result;

                try {
                    result = deleteHsmClientCertificate(request);
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
    public java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(DeleteHsmConfigurationRequest request) {

        return deleteHsmConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmConfigurationResult> deleteHsmConfigurationAsync(final DeleteHsmConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHsmConfigurationRequest, DeleteHsmConfigurationResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteHsmConfigurationResult>() {
            @Override
            public DeleteHsmConfigurationResult call() throws Exception {
                DeleteHsmConfigurationResult result;

                try {
                    result = deleteHsmConfiguration(request);
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
    public java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(DeleteSnapshotCopyGrantRequest request) {

        return deleteSnapshotCopyGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotCopyGrantResult> deleteSnapshotCopyGrantAsync(final DeleteSnapshotCopyGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSnapshotCopyGrantRequest, DeleteSnapshotCopyGrantResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteSnapshotCopyGrantResult>() {
            @Override
            public DeleteSnapshotCopyGrantResult call() throws Exception {
                DeleteSnapshotCopyGrantResult result;

                try {
                    result = deleteSnapshotCopyGrant(request);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result;

                try {
                    result = deleteTags(request);
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
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(DescribeClusterParameterGroupsRequest request) {

        return describeClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterParameterGroupsResult> describeClusterParameterGroupsAsync(
            final DescribeClusterParameterGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterParameterGroupsRequest, DescribeClusterParameterGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterParameterGroupsResult>() {
            @Override
            public DescribeClusterParameterGroupsResult call() throws Exception {
                DescribeClusterParameterGroupsResult result;

                try {
                    result = describeClusterParameterGroups(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterParametersResult>() {
            @Override
            public DescribeClusterParametersResult call() throws Exception {
                DescribeClusterParametersResult result;

                try {
                    result = describeClusterParameters(request);
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
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(DescribeClusterSecurityGroupsRequest request) {

        return describeClusterSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterSecurityGroupsResult> describeClusterSecurityGroupsAsync(
            final DescribeClusterSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterSecurityGroupsRequest, DescribeClusterSecurityGroupsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterSecurityGroupsResult>() {
            @Override
            public DescribeClusterSecurityGroupsResult call() throws Exception {
                DescribeClusterSecurityGroupsResult result;

                try {
                    result = describeClusterSecurityGroups(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterSnapshotsResult>() {
            @Override
            public DescribeClusterSnapshotsResult call() throws Exception {
                DescribeClusterSnapshotsResult result;

                try {
                    result = describeClusterSnapshots(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterSubnetGroupsResult>() {
            @Override
            public DescribeClusterSubnetGroupsResult call() throws Exception {
                DescribeClusterSubnetGroupsResult result;

                try {
                    result = describeClusterSubnetGroups(request);
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
    public java.util.concurrent.Future<DescribeClusterSubnetGroupsResult> describeClusterSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeClusterSubnetGroupsRequest, DescribeClusterSubnetGroupsResult> asyncHandler) {

        return describeClusterSubnetGroupsAsync(new DescribeClusterSubnetGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(DescribeClusterVersionsRequest request) {

        return describeClusterVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterVersionsResult> describeClusterVersionsAsync(final DescribeClusterVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterVersionsRequest, DescribeClusterVersionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterVersionsResult>() {
            @Override
            public DescribeClusterVersionsResult call() throws Exception {
                DescribeClusterVersionsResult result;

                try {
                    result = describeClusterVersions(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeClustersResult>() {
            @Override
            public DescribeClustersResult call() throws Exception {
                DescribeClustersResult result;

                try {
                    result = describeClusters(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DefaultClusterParameters>() {
            @Override
            public DefaultClusterParameters call() throws Exception {
                DefaultClusterParameters result;

                try {
                    result = describeDefaultClusterParameters(request);
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
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request) {

        return describeEventCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(final DescribeEventCategoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventCategoriesResult>() {
            @Override
            public DescribeEventCategoriesResult call() throws Exception {
                DescribeEventCategoriesResult result;

                try {
                    result = describeEventCategories(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventSubscriptionsResult>() {
            @Override
            public DescribeEventSubscriptionsResult call() throws Exception {
                DescribeEventSubscriptionsResult result;

                try {
                    result = describeEventSubscriptions(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventsResult>() {
            @Override
            public DescribeEventsResult call() throws Exception {
                DescribeEventsResult result;

                try {
                    result = describeEvents(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeHsmClientCertificatesResult>() {
            @Override
            public DescribeHsmClientCertificatesResult call() throws Exception {
                DescribeHsmClientCertificatesResult result;

                try {
                    result = describeHsmClientCertificates(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeHsmConfigurationsResult>() {
            @Override
            public DescribeHsmConfigurationsResult call() throws Exception {
                DescribeHsmConfigurationsResult result;

                try {
                    result = describeHsmConfigurations(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeLoggingStatusResult>() {
            @Override
            public DescribeLoggingStatusResult call() throws Exception {
                DescribeLoggingStatusResult result;

                try {
                    result = describeLoggingStatus(request);
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
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            DescribeOrderableClusterOptionsRequest request) {

        return describeOrderableClusterOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableClusterOptionsResult> describeOrderableClusterOptionsAsync(
            final DescribeOrderableClusterOptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrderableClusterOptionsRequest, DescribeOrderableClusterOptionsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrderableClusterOptionsResult>() {
            @Override
            public DescribeOrderableClusterOptionsResult call() throws Exception {
                DescribeOrderableClusterOptionsResult result;

                try {
                    result = describeOrderableClusterOptions(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedNodeOfferingsResult>() {
            @Override
            public DescribeReservedNodeOfferingsResult call() throws Exception {
                DescribeReservedNodeOfferingsResult result;

                try {
                    result = describeReservedNodeOfferings(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservedNodesResult>() {
            @Override
            public DescribeReservedNodesResult call() throws Exception {
                DescribeReservedNodesResult result;

                try {
                    result = describeReservedNodes(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeResizeResult>() {
            @Override
            public DescribeResizeResult call() throws Exception {
                DescribeResizeResult result;

                try {
                    result = describeResize(request);
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
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(DescribeSnapshotCopyGrantsRequest request) {

        return describeSnapshotCopyGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(final DescribeSnapshotCopyGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeSnapshotCopyGrantsResult>() {
            @Override
            public DescribeSnapshotCopyGrantsResult call() throws Exception {
                DescribeSnapshotCopyGrantsResult result;

                try {
                    result = describeSnapshotCopyGrants(request);
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
    public java.util.concurrent.Future<DescribeSnapshotCopyGrantsResult> describeSnapshotCopyGrantsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotCopyGrantsRequest, DescribeSnapshotCopyGrantsResult> asyncHandler) {

        return describeSnapshotCopyGrantsAsync(new DescribeSnapshotCopyGrantsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(DescribeTableRestoreStatusRequest request) {

        return describeTableRestoreStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableRestoreStatusResult> describeTableRestoreStatusAsync(final DescribeTableRestoreStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTableRestoreStatusRequest, DescribeTableRestoreStatusResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<DescribeTableRestoreStatusResult>() {
            @Override
            public DescribeTableRestoreStatusResult call() throws Exception {
                DescribeTableRestoreStatusResult result;

                try {
                    result = describeTableRestoreStatus(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
            @Override
            public DescribeTagsResult call() throws Exception {
                DescribeTagsResult result;

                try {
                    result = describeTags(request);
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

        return executorService.submit(new java.util.concurrent.Callable<DisableLoggingResult>() {
            @Override
            public DisableLoggingResult call() throws Exception {
                DisableLoggingResult result;

                try {
                    result = disableLogging(request);
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
    public java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(DisableSnapshotCopyRequest request) {

        return disableSnapshotCopyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> disableSnapshotCopyAsync(final DisableSnapshotCopyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSnapshotCopyRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = disableSnapshotCopy(request);
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
    public java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(EnableLoggingRequest request) {

        return enableLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableLoggingResult> enableLoggingAsync(final EnableLoggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableLoggingRequest, EnableLoggingResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EnableLoggingResult>() {
            @Override
            public EnableLoggingResult call() throws Exception {
                EnableLoggingResult result;

                try {
                    result = enableLogging(request);
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
    public java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(EnableSnapshotCopyRequest request) {

        return enableSnapshotCopyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> enableSnapshotCopyAsync(final EnableSnapshotCopyRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSnapshotCopyRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = enableSnapshotCopy(request);
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
    public java.util.concurrent.Future<Cluster> modifyClusterAsync(ModifyClusterRequest request) {

        return modifyClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterAsync(final ModifyClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = modifyCluster(request);
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
    public java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(ModifyClusterIamRolesRequest request) {

        return modifyClusterIamRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifyClusterIamRolesAsync(final ModifyClusterIamRolesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterIamRolesRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = modifyClusterIamRoles(request);
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
    public java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(ModifyClusterParameterGroupRequest request) {

        return modifyClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyClusterParameterGroupResult> modifyClusterParameterGroupAsync(final ModifyClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterParameterGroupRequest, ModifyClusterParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ModifyClusterParameterGroupResult>() {
            @Override
            public ModifyClusterParameterGroupResult call() throws Exception {
                ModifyClusterParameterGroupResult result;

                try {
                    result = modifyClusterParameterGroup(request);
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
    public java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(ModifyClusterSubnetGroupRequest request) {

        return modifyClusterSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSubnetGroup> modifyClusterSubnetGroupAsync(final ModifyClusterSubnetGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyClusterSubnetGroupRequest, ClusterSubnetGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ClusterSubnetGroup>() {
            @Override
            public ClusterSubnetGroup call() throws Exception {
                ClusterSubnetGroup result;

                try {
                    result = modifyClusterSubnetGroup(request);
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
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request) {

        return modifyEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(final ModifyEventSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<EventSubscription>() {
            @Override
            public EventSubscription call() throws Exception {
                EventSubscription result;

                try {
                    result = modifyEventSubscription(request);
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
    public java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(ModifySnapshotCopyRetentionPeriodRequest request) {

        return modifySnapshotCopyRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> modifySnapshotCopyRetentionPeriodAsync(final ModifySnapshotCopyRetentionPeriodRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifySnapshotCopyRetentionPeriodRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = modifySnapshotCopyRetentionPeriod(request);
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
    public java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(PurchaseReservedNodeOfferingRequest request) {

        return purchaseReservedNodeOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedNode> purchaseReservedNodeOfferingAsync(final PurchaseReservedNodeOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodeOfferingRequest, ReservedNode> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ReservedNode>() {
            @Override
            public ReservedNode call() throws Exception {
                ReservedNode result;

                try {
                    result = purchaseReservedNodeOffering(request);
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
    public java.util.concurrent.Future<Cluster> rebootClusterAsync(RebootClusterRequest request) {

        return rebootClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> rebootClusterAsync(final RebootClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootClusterRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = rebootCluster(request);
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
    public java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(ResetClusterParameterGroupRequest request) {

        return resetClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetClusterParameterGroupResult> resetClusterParameterGroupAsync(final ResetClusterParameterGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetClusterParameterGroupRequest, ResetClusterParameterGroupResult> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ResetClusterParameterGroupResult>() {
            @Override
            public ResetClusterParameterGroupResult call() throws Exception {
                ResetClusterParameterGroupResult result;

                try {
                    result = resetClusterParameterGroup(request);
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
    public java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(RestoreFromClusterSnapshotRequest request) {

        return restoreFromClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> restoreFromClusterSnapshotAsync(final RestoreFromClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreFromClusterSnapshotRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = restoreFromClusterSnapshot(request);
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
    public java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(RestoreTableFromClusterSnapshotRequest request) {

        return restoreTableFromClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TableRestoreStatus> restoreTableFromClusterSnapshotAsync(final RestoreTableFromClusterSnapshotRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreTableFromClusterSnapshotRequest, TableRestoreStatus> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<TableRestoreStatus>() {
            @Override
            public TableRestoreStatus call() throws Exception {
                TableRestoreStatus result;

                try {
                    result = restoreTableFromClusterSnapshot(request);
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
    public java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(RevokeClusterSecurityGroupIngressRequest request) {

        return revokeClusterSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClusterSecurityGroup> revokeClusterSecurityGroupIngressAsync(final RevokeClusterSecurityGroupIngressRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeClusterSecurityGroupIngressRequest, ClusterSecurityGroup> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<ClusterSecurityGroup>() {
            @Override
            public ClusterSecurityGroup call() throws Exception {
                ClusterSecurityGroup result;

                try {
                    result = revokeClusterSecurityGroupIngress(request);
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
    public java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(RevokeSnapshotAccessRequest request) {

        return revokeSnapshotAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> revokeSnapshotAccessAsync(final RevokeSnapshotAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeSnapshotAccessRequest, Snapshot> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Snapshot>() {
            @Override
            public Snapshot call() throws Exception {
                Snapshot result;

                try {
                    result = revokeSnapshotAccess(request);
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
    public java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(RotateEncryptionKeyRequest request) {

        return rotateEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Cluster> rotateEncryptionKeyAsync(final RotateEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<RotateEncryptionKeyRequest, Cluster> asyncHandler) {

        return executorService.submit(new java.util.concurrent.Callable<Cluster>() {
            @Override
            public Cluster call() throws Exception {
                Cluster result;

                try {
                    result = rotateEncryptionKey(request);
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
